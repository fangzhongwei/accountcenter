package com.lawsofnature.account.client

import javax.inject.{Inject, Named}

import RpcAccount._
import com.lawsofnatrue.common.ice.IcePrxFactory
import org.slf4j.LoggerFactory

/**
  * Created by fangzhongwei on 2017/1/16.
  */
trait AccountService {
  def initClient

  def createAccount(traceId: String, memberId: Long): AccountBaseResponse

  def getAccount(traceId: String, memberId: Long): DiamondAccountResponse

  def getPriceList(traceId: String): PriceListResponse

  def getChannelList(traceId: String): ChannelListResponse

  def deposit(traceId: String, request: DepositRequest): DepositRequestResponse

  def queryDepositOrder(traceId: String, paymentVoucherNo: String): DepositResponse

  def settle(traceId: String, request: SettleRequest): AccountBaseResponse
}

class AccountServiceImpl @Inject()(@Named("account.ice.client.init.config") iceInitConfig: String,
                                   @Named("account.ice.client.init.size") iceInitSizeConfig: String,
                                   @Named("account.ice.client.init.size-max") iceInitSizeMaxConfig: String,
                                   @Named("account.ice.client.init.size-warn") iceInitSizeWarnConfig: String,
                                   @Named("account.ice.client.proxy.config") proxyConfig: String,
                                   icePrxFactory: IcePrxFactory) extends AccountService {
  val logger = LoggerFactory.getLogger(this.getClass)

  var accountEndpoint: AccountEndpointPrx = _

  override def initClient = accountEndpoint = icePrxFactory.make[AccountEndpointPrx](Array[String](iceInitConfig, iceInitSizeConfig, iceInitSizeMaxConfig, iceInitSizeWarnConfig), proxyConfig, AccountEndpointPrxHelper.checkedCast)

  override def createAccount(traceId: String, memberId: Long): AccountBaseResponse = accountEndpoint.createAccount(traceId, memberId)

  override def getAccount(traceId: String, memberId: Long): DiamondAccountResponse = accountEndpoint.getAccount(traceId, memberId)

  override def getPriceList(traceId: String): PriceListResponse = accountEndpoint.getPriceList(traceId)

  override def getChannelList(traceId: String): ChannelListResponse = accountEndpoint.getChannelList(traceId)

  override def deposit(traceId: String, request: DepositRequest): DepositRequestResponse = accountEndpoint.deposit(traceId, request)

  override def queryDepositOrder(traceId: String, paymentVoucherNo: String): Unit = accountEndpoint.queryDepositOrder(traceId, paymentVoucherNo)

  override def settle(traceId: String, request: SettleRequest): AccountBaseResponse = accountEndpoint.settle(traceId, request)
}