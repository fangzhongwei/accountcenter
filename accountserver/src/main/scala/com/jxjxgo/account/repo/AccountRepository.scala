package com.jxjxgo.account.repo

import com.jxjxgo.account.rpc.domain.SettleRequest
import com.jxjxgo.mysql.connection.DBComponent

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

/**
  * Created by fangzhongwei on 2016/11/21.
  */
trait AccountRepository extends Tables {
  this: DBComponent =>

  import profile.api._

  protected def TmDiamondAccountAutoInc = TmDiamondAccount returning TmDiamondAccount.map(_.accountId)

  def create(tmDiamondAccountRow: TmDiamondAccountRow): Future[Long] = db.run {
    TmDiamondAccountAutoInc += tmDiamondAccountRow
  }

  def getPriceList(deviceType: Int): Seq[TmDiamodPriceRow] = {
    Await.result(db.run {
      TmDiamodPrice.sortBy(_.price).filter(_.status === true).result
    }, Duration.Inf)
  }

  def settle(settleRequest: SettleRequest) = {
    val memberId1: Long = settleRequest.memberId1
    val memberId2: Long = settleRequest.memberId2
    val memberId3: Long = settleRequest.memberId3

    val amount1: Int = settleRequest.amount1
    val amount2: Int = settleRequest.amount2
    val amount3: Int = settleRequest.amount3

    val tran = (for {
      _ <- sql"""UPDATE tm_diamond_account SET AMOUNT = AMOUNT + $amount1 WHERE member_id = $memberId1""".as[Int]
      _ <- sql"""UPDATE tm_diamond_account SET AMOUNT = AMOUNT + $amount2 WHERE member_id = $memberId2""".as[Int]
      _ <- sql"""UPDATE tm_diamond_account SET AMOUNT = AMOUNT + $amount3 WHERE member_id = $memberId3""".as[Int]
    } yield ()).transactionally
    db.run(tran)
  }

  def queryAccountOrderByPaymentVoucherNo(paymentVoucherNo: String): Option[TAccountOrderRow] = {
    Await.result(db.run {
      TAccountOrder.filter(_.paymentVoucherNo === paymentVoucherNo).result.headOption
    }, Duration.Inf)
  }

  def getAccount(memberId: Long, deviceType: Int): Option[TmDiamondAccountRow] = {
    Await.result(db.run {
      TmDiamondAccount.filter(r => r.memberId === memberId && r.deviceType === deviceType).result.headOption
    }, Duration.Inf)
  }

  def getChannelList(deviceType: Int): Seq[TmChannelRow] = {
    Await.result(db.run {
      TmChannel.sortBy(_.priority desc).filter(_.status === true).result
    }, Duration.Inf)
  }

  def createDepositOrder(accountOrderRow: TAccountOrderRow, paymentOrderRow: TPaymentOrderRow) = {
    val tran = (for {
      _ <- TAccountOrder += accountOrderRow
      _ <- TPaymentOrder += paymentOrderRow
    } yield ()).transactionally
    Await.result(db.run(tran), Duration.Inf)
  }

  def nextOrderId(): Long = {
    Await.result(db.run(sql"""select nextval('seq_order_id')""".as[(Long)]), Duration.Inf).head
  }

  def nextAccountId(): Long = {
    Await.result(db.run(sql"""select nextval('seq_account_id')""".as[(Long)]), Duration.Inf).head
  }

  def getPaymentOrder(paymentOrderNo: String): Option[TPaymentOrderRow] = {
    Await.result(db.run {
      TPaymentOrder.filter(_.paymentVoucherNo === paymentOrderNo).result.headOption
    }, Duration.Inf)
  }

  def depositSuccess(accountId: Long, accountOrderNo: String, paymentOrderNo: String, diamondAmount: Int) = {
    val tran = (for {
      _ <- TAccountOrder.filter(_.paymentVoucherNo === paymentOrderNo).map(_.tradeStatus).update(99)
      _ <- TPaymentOrder.filter(_.accountOrderNo === accountOrderNo).map(_.payStatus).update(99)
      _ <- sql"""UPDATE tm_diamond_account SET diamond_amount = diamond_amount + $diamondAmount WHERE account_id = $accountId""".as[Int]
    } yield ()).transactionally
    Await.result(db.run(tran), Duration.Inf)
  }
}

class AccountRepositoryImpl extends AccountRepository with DBComponent
