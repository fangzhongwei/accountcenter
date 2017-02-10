package com.jxjxgo.accountcenter.service

import javax.inject.Inject

import com.jxjxgo.account.rpc.domain._
import com.twitter.util.Future

/**
  * Created by fangzhongwei on 2017/1/16.
  */
class AccountEndpointImpl @Inject()(accountService: AccountService) extends AccountEndpoint[Future] {
  override def createAccount(traceId: String, memberId: Long, deviceType: Int): Future[AccountBaseResponse] = {
    Future.value(accountService.createAccount(traceId, memberId, deviceType))
  }

  override def settle(traceId: String, settleRequest: SettleRequest): Future[AccountBaseResponse] = {
    Future.value(accountService.settle(traceId, settleRequest))
  }

  override def getPriceList(traceId: String, deviceType: Int): Future[PriceListResponse] = {
    Future.value(accountService.getPriceList(traceId, deviceType))
  }

  override def queryDepositOrder(traceId: String, paymentVoucherNo: String): Future[DepositResponse] = {
    Future.value(accountService.queryDepositOrder(traceId, paymentVoucherNo))
  }

  override def deposit(traceId: String, depositRequest: DepositRequest): Future[DepositRequestResponse] = {
    Future.value(accountService.deposit(traceId, depositRequest))
  }

  override def getChannelList(traceId: String, deviceType: Int): Future[ChannelListResponse] = {
    Future.value(accountService.getChannelList(traceId, deviceType))
  }

  override def getAccount(traceId: String, memberId: Long, deviceType: Int): Future[DiamondAccountResponse] = {
    Future.value(accountService.getAccount(traceId, memberId, deviceType))
  }
}
