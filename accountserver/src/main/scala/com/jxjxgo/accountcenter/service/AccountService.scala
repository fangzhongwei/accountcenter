package com.jxjxgo.accountcenter.service

import java.sql.Timestamp
import javax.inject.Inject

import com.jxjxgo.account.repo.AccountRepository
import com.jxjxgo.account.rpc.domain._
import com.jxjxgo.common.exception.{ErrorCode, ServiceException}
import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by fangzhongwei on 2016/11/21.
  */
trait AccountService {
  def createAccount(traceId: String, memberId: Long, deviceType: Int): AccountBaseResponse

  def settle(traceId: String, settleRequest: SettleRequest): AccountBaseResponse

  def getPriceList(traceId: String, deviceType: Int): PriceListResponse

  def queryDepositOrder(traceId: String, paymentVoucherNo: String): DepositResponse

  def deposit(traceId: String, depositRequest: DepositRequest): DepositRequestResponse

  def getChannelList(traceId: String, deviceType: Int): ChannelListResponse

  def getAccount(traceId: String, memberId: Long, deviceType: Int): DiamondAccountResponse
}

class AccountServiceImpl @Inject()(accountRepository: AccountRepository) extends AccountService {
  private val logger: Logger = LoggerFactory.getLogger(getClass)

  override def createAccount(traceId: String, memberId: Long, deviceType: Int) = {
    val gmtCreate: Timestamp = new Timestamp(System.currentTimeMillis())
    accountRepository.create(accountRepository.TmDiamondAccountRow(accountRepository.nextAccountId(), memberId, deviceType, 0, gmtCreate, gmtCreate))
    AccountBaseResponse("0")
  }

  override def settle(traceId: String, settleRequest: SettleRequest): AccountBaseResponse = {
    logger.info(s"settle request : $settleRequest")
    settleRequest.amount1 + settleRequest.amount2 + settleRequest.amount3 == 0 match {
      case true =>
        accountRepository.settle(settleRequest)
        AccountBaseResponse("0")
      case false => AccountBaseResponse(ErrorCode.EC_GAME_INVALID_RESULT.getCode)
    }
  }

  override def getPriceList(traceId: String, deviceType: Int): PriceListResponse = {
    val seq: Seq[accountRepository.TmDiamodPriceRow] = accountRepository.getPriceList(deviceType)
    val priceArray: Array[DiamondPrice] = new Array[DiamondPrice](seq.size)
    for (i <- 0 to priceArray.size - 1) {
      val p: accountRepository.TmDiamodPriceRow = seq(i)
      priceArray(i) = DiamondPrice(p.code, p.amount, p.price.toString())
    }
    PriceListResponse("0", priceArray)
  }

  override def queryDepositOrder(traceId: String, paymentVoucherNo: String): DepositResponse = {
    accountRepository.queryAccountOrderByPaymentVoucherNo(paymentVoucherNo) match {
      case Some(r) =>
        DepositResponse("0", r.paymentVoucherNo, r.accountId, r.memberId, r.tradeType, r.tradeStatus, r.diamondAmount, r.amount.toString(), r.gmtCreate.getTime, r.gmtUpdate.getTime)
      case None =>
        DepositResponse(code = ErrorCode.EC_ORDER_PAYMENT_ORDER_NOT_FOUND.getCode)
    }
  }

  override def deposit(traceId: String, r: DepositRequest): DepositRequestResponse = {
    val accountOrderNo: String = generateDepositOrderNo()
    val paymentOrderNo: String = generatePaymentOrderNo()

    val deviceType: Int = r.deviceType
    accountRepository.getAccount(r.memberId, deviceType) match {
      case Some(accountRow) =>
        val timestamp: Timestamp = new Timestamp(System.currentTimeMillis())
        val amount: BigDecimal = BigDecimal(r.price)
        val accountOrderRow: accountRepository.TAccountOrderRow = accountRepository.TAccountOrderRow(accountOrderNo, paymentOrderNo, accountRow.accountId, deviceType, r.memberId, 1, 1, r.diamondAmount, amount, 0, timestamp, timestamp)

        val paymentOrderRow: accountRepository.TPaymentOrderRow = accountRepository.TPaymentOrderRow(paymentOrderNo, accountOrderNo, deviceType, r.memberId, accountRow.accountId, r.channelCode, amount, 1, timestamp, timestamp)
        accountRepository.createDepositOrder(accountOrderRow, paymentOrderRow)
        r.channelCode match {
          case "Gift" =>
            depositSuccess(paymentOrderNo, amount)
            DepositRequestResponse(code = "0", paymentVoucherNo = paymentOrderNo, tradeStatus = 99)
          case _ =>
            //todo
            DepositRequestResponse(code = "0", paymentVoucherNo = paymentOrderNo, tradeStatus = 1)
        }
      case None =>
        DepositRequestResponse(ErrorCode.EC_ACCOUNT_NOT_EXIST.getCode)
    }
  }

  def depositSuccess(paymentOrderNo: String, amount: BigDecimal): Unit = {
    accountRepository.getPaymentOrder(paymentOrderNo) match {
      case Some(order) =>
        accountRepository.queryAccountOrderByPaymentVoucherNo(paymentOrderNo) match {
          case Some(accountOrderRow) =>
            if (order.payStatus != 1) throw ServiceException.make(ErrorCode.EC_ORDER_ORDER_FINISHED)
            if (amount.compare(order.amount) != 0) throw ServiceException.make(ErrorCode.EC_ORDER_AMOUNT_NOT_MATCHED)
            accountRepository.depositSuccess(order.accountId, accountOrderRow.accountOrderNo, paymentOrderNo, accountOrderRow.diamondAmount)
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

  override def getChannelList(traceId: String, deviceType: Int): ChannelListResponse = {
    val seq: Seq[accountRepository.TmChannelRow] = accountRepository.getChannelList(deviceType)
    val channelArray: Array[Channel] = new Array[Channel](seq.size)
    for (i <- 0 to seq.size - 1) {
      channelArray(i) = Channel(seq(i).code, seq(i).name)
    }
    ChannelListResponse("0", channelArray)
  }

  override def getAccount(traceId: String, memberId: Long, deviceType: Int): DiamondAccountResponse = {
    accountRepository.getAccount(memberId, deviceType) match {
      case Some(r) =>
        DiamondAccountResponse("0", r.accountId, deviceType, r.memberId, r.amount, r.gmtCreate.getTime, r.gmtUpdate.getTime)
      case None =>
        DiamondAccountResponse(ErrorCode.EC_ACCOUNT_NOT_EXIST.getCode)
    }
  }
}
