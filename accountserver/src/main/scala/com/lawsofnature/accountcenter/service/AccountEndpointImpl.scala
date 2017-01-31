package com.lawsofnature.accountcenter.service

import javax.inject.Inject

import com.twitter.util.Future
import com.jxjxgo.account.rpc.domain._

/**
  * Created by fangzhongwei on 2017/1/16.
  */
class AccountEndpointImpl @Inject()(accountService: AccountService) extends AccountEndpoint[Future] {
  override def createAccount(traceId: String, memberId: Long): Future[AccountBaseResponse] = {
    Future.value(accountService.createAccount(traceId, memberId))
  }

  override def settle(traceId: String, settleRequest: SettleRequest): Future[AccountBaseResponse] = {
    Future.value(accountService.settle(traceId, settleRequest))
  }

  override def getPriceList(traceId: String): Future[PriceListResponse] = {
    Future.value(accountService.getPriceList(traceId))
  }

  override def queryDepositOrder(traceId: String, paymentVoucherNo: String): Future[DepositResponse] = {
    Future.value(accountService.queryDepositOrder(traceId, paymentVoucherNo))
  }

  override def deposit(traceId: String, depositRequest: DepositRequest): Future[DepositRequestResponse] = {
    Future.value(accountService.deposit(traceId, depositRequest))
  }

  override def getChannelList(traceId: String): Future[ChannelListResponse] = {
    Future.value(accountService.getChannelList(traceId))
  }

  override def getAccount(traceId: String, memberId: Long): Future[DiamondAccountResponse] = {
    Future.value(accountService.getAccount(traceId, memberId))
  }
}
