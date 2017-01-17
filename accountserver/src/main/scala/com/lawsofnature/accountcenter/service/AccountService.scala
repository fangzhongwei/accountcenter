package com.lawsofnature.accountcenter.service

import java.sql.Timestamp
import javax.inject.Inject

import RpcAccount._
import com.lawsofnature.account.repo.AccountRepository
import com.lawsofnature.common.exception.{ErrorCode, ServiceException}
import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by fangzhongwei on 2016/11/21.
  */
trait AccountService {
  def createAccount(traceId: String, memberId: Long): AccountBaseResponse

  def settle(traceId: String, settleRequest: SettleRequest): AccountBaseResponse

  def getPriceList(traceId: String): PriceListResponse

  def queryDepositOrder(traceId: String, paymentVoucherNo: String): DepositResponse

  def deposit(traceId: String, depositRequest: DepositRequest): DepositRequestResponse

  def getChannelList(traceId: String): ChannelListResponse

  def getAccount(traceId: String, memberId: Long): DiamondAccountResponse
}

class AccountServiceImpl @Inject()(accountRepository: AccountRepository) extends AccountService {
  private val logger: Logger = LoggerFactory.getLogger(getClass)

  override def createAccount(traceId: String, memberId: Long) = {
    accountRepository.create(accountRepository.TmDiamondAccountRow(0, memberId, 0, new Timestamp(System.currentTimeMillis())))
    new AccountBaseResponse("0")
  }

  override def settle(traceId: String, settleRequest: SettleRequest): AccountBaseResponse = {
    logger.info(s"settle request : $settleRequest")
    settleRequest.amount1 + settleRequest.amount2 + settleRequest.amount3 == 0 match {
      case true =>
        accountRepository.settle(settleRequest)
        new AccountBaseResponse("0")
      case false => new AccountBaseResponse(ErrorCode.EC_GAME_INVALID_RESULT.getCode)
    }
  }

  override def getPriceList(traceId: String): PriceListResponse = {
    val seq: Seq[accountRepository.TmDiamodPriceRow] = accountRepository.getPriceList()
    val priceArray: Array[DiamondPrice] = new Array[DiamondPrice](seq.size)
    for (i <- 0 to priceArray.size) {
      val p: accountRepository.TmDiamodPriceRow = seq(i)
      priceArray(i) = new DiamondPrice(p.code, p.amount, p.price.toString())
    }
    new PriceListResponse("0", priceArray)
  }

  override def queryDepositOrder(traceId: String, paymentVoucherNo: String): DepositResponse = {
    accountRepository.queryAccountOrderByPaymentVoucherNo(paymentVoucherNo) match {
      case Some(r) =>
        new DepositResponse("0", r.paymentVoucherNo, r.accountId, r.memberId, r.tradeType, r.tradeStatus, r.diamondAmount, r.amount.toString(), r.gmtCreate.getTime, r.gmtUpdate.getTime)
      case None =>
        val response: DepositResponse = new DepositResponse()
        response.code = ErrorCode.EC_ORDER_PAYMENT_ORDER_NOT_FOUND.getCode
        response
    }
  }

  override def deposit(traceId: String, r: DepositRequest): DepositRequestResponse = {
    val accountOrderNo: String = generateDepositOrderNo()
    val paymentOrderNo: String = generatePaymentOrderNo()

    accountRepository.getAccount(r.memberId) match {
      case Some(accountRow) =>
        val timestamp: Timestamp = new Timestamp(System.currentTimeMillis())
        val amount: BigDecimal = BigDecimal(r.price)
        val accountOrderRow: accountRepository.TAccountOrderRow = accountRepository.TAccountOrderRow(accountOrderNo, paymentOrderNo, accountRow.accountId, r.memberId, 1, 1, r.diamondAmount, amount, 0, timestamp, timestamp)
        val paymentOrderRow: accountRepository.TPaymentOrderRow = accountRepository.TPaymentOrderRow(paymentOrderNo, accountOrderNo, r.memberId, r.channelCode, amount, 1, timestamp, timestamp)
        accountRepository.createDepositOrder(accountOrderRow, paymentOrderRow)
        r.channelCode match {
          case "Gift" =>
            depositSuccess(paymentOrderNo, amount)
        }
        new DepositRequestResponse()
      case None =>
        val response: DepositRequestResponse = new DepositRequestResponse()
        response.code = ErrorCode.EC_ACCOUNT_NOT_EXIST.getCode
        response
    }
  }

  def depositSuccess(paymentOrderNo: String, amount: BigDecimal): Unit = {
    accountRepository.getPaymentOrder(paymentOrderNo) match {
      case Some(order) =>
        accountRepository.queryAccountOrderByPaymentVoucherNo(paymentOrderNo) match {
          case Some(accountOrderRow) =>
            if (order.payStatus != 1) throw ServiceException.make(ErrorCode.EC_ORDER_ORDER_FINISHED)
            if (amount.compare(order.amount) != 0) throw ServiceException.make(ErrorCode.EC_ORDER_AMOUNT_NOT_MATCHED)
            accountRepository.depositSuccess(order.memberId, accountOrderRow.accountOrderNo, paymentOrderNo, accountOrderRow.diamondAmount)
          case None =>
            throw ServiceException.make(ErrorCode.EC_ORDER_PAYMENT_ORDER_NOT_FOUND)
        }
      case None => throw ServiceException.make(ErrorCode.EC_ORDER_PAYMENT_ORDER_NOT_FOUND)
    }
  }

  def generateDepositOrderNo(): String = {
    val id: Long = accountRepository.nextOrderId()
    val builder: StringBuilder = new StringBuilder
    builder.append("101").append(System.currentTimeMillis()).append(id)
    builder.toString()
  }

  def generatePaymentOrderNo(): String = {
    val id: Long = accountRepository.nextOrderId()
    val builder: StringBuilder = new StringBuilder
    builder.append("201").append(System.currentTimeMillis()).append(id)
    builder.toString()
  }

  override def getChannelList(traceId: String): ChannelListResponse = {
    val seq: Seq[accountRepository.TmChannelRow] = accountRepository.getChannelList()
    val channelArray: Array[Channel] = new Array[Channel](seq.size)
    for (i <- 0 to seq.size) {
      channelArray(i) = new Channel(seq(i).code, seq(i).name)
    }
    new ChannelListResponse("0", channelArray)
  }

  override def getAccount(traceId: String, memberId: Long): DiamondAccountResponse = {
    accountRepository.getAccount(memberId) match {
      case Some(r) =>
        new DiamondAccountResponse("0", r.accountId, r.memberId, r.amount, r.gmtCreate.getTime, r.gmtUpdate.get.getTime)
      case None =>
        val response: DiamondAccountResponse = new DiamondAccountResponse()
        response.code = ErrorCode.EC_ACCOUNT_NOT_EXIST.getCode
        response
    }
  }
}
