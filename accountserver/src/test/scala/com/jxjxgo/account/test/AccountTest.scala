package com.jxjxgo.account.test

import com.jxjxgo.account.rpc.domain.AccountEndpoint
import com.twitter.finagle.Thrift
import com.twitter.util.{Await, Future}

/**
  * Created by fangzhongwei on 2017/1/31.
  */
object AccountTest {

  def main(args: Array[String]): Unit = {
    val endpoint: AccountEndpoint[Future] = Thrift.client.newIface[AccountEndpoint[Future]]("127.0.0.1:8802")
//    println(Await.result(endpoint.getAccount("qqq", 1)))
//    println(Await.result(endpoint.createAccount("qqq", 1)))
//    println(Await.result(endpoint.queryDepositOrder("qqq", "aaa")))
//
    println(Await.result(endpoint.getChannelList("qqq")))
    println(Await.result(endpoint.getPriceList("qqq")))
  }

}
