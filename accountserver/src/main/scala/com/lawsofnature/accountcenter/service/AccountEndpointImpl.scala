package com.lawsofnature.accountcenter.service

import javax.inject.Inject

import Ice.Current
import RpcAccount._

/**
  * Created by fangzhongwei on 2017/1/16.
  */
class AccountEndpointImpl @Inject()(accountService: AccountService) extends _AccountEndpointDisp {
  override def createAccount(traceId: String, memberId: Long, current: Current): AccountBaseResponse = {
    accountService.createAccount(traceId, memberId)
  }

  override def settle(traceId: String, settleRequest: SettleRequest, current: Current): AccountBaseResponse = {
    accountService.settle(traceId, settleRequest)
  }

  override def getPriceList(traceId: String, current: Current): PriceListResponse = {
    accountService.getPriceList(traceId)
  }

  override def queryDepositOrder(traceId: String, paymentVoucherNo: String, current: Current): DepositResponse = {
    accountService.queryDepositOrder(traceId, paymentVoucherNo)
  }

  override def deposit(traceId: String, depositRequest: DepositRequest, current: Current): DepositRequestResponse = {
    accountService.deposit(traceId, depositRequest)
  }

  override def getChannelList(traceId: String, current: Current): ChannelListResponse = {
    accountService.getChannelList(traceId)
  }

  override def getAccount(traceId: String, memberId: Long, current: Current): DiamondAccountResponse = {
    accountService.getAccount(traceId, memberId)
  }
}
