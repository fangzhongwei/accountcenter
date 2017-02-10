package com.jxjxgo.account.repo

import com.jxjxgo.mysql.connection.DBImpl

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables extends DBImpl {

  import profile.api._

  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** Entity class storing rows of table TAccountOrder
    *
    * @param accountOrderNo   Database column account_order_no SqlType(varchar), PrimaryKey, Length(64,true)
    * @param paymentVoucherNo Database column payment_voucher_no SqlType(varchar), Length(64,true)
    * @param accountId        Database column account_id SqlType(int8)
    * @param deviceType       Database column device_type SqlType(int4)
    * @param memberId         Database column member_id SqlType(int8)
    * @param tradeType        Database column trade_type SqlType(int4)
    * @param tradeStatus      Database column trade_status SqlType(int4)
    * @param diamondAmount    Database column diamond_amount SqlType(int4)
    * @param amount           Database column amount SqlType(numeric)
    * @param gameId           Database column game_id SqlType(int8)
    * @param gmtCreate        Database column gmt_create SqlType(timestamp)
    * @param gmtUpdate        Database column gmt_update SqlType(timestamp) */
  case class TAccountOrderRow(accountOrderNo: String, paymentVoucherNo: String, accountId: Long, deviceType: Int, memberId: Long, tradeType: Int, tradeStatus: Int, diamondAmount: Int, amount: scala.math.BigDecimal, gameId: Long, gmtCreate: java.sql.Timestamp, gmtUpdate: java.sql.Timestamp)

  /** GetResult implicit for fetching TAccountOrderRow objects using plain SQL queries */
  implicit def GetResultTAccountOrderRow(implicit e0: GR[String], e1: GR[Long], e2: GR[Int], e3: GR[scala.math.BigDecimal], e4: GR[java.sql.Timestamp]): GR[TAccountOrderRow] = GR {
    prs => import prs._
      TAccountOrderRow.tupled((<<[String], <<[String], <<[Long], <<[Int], <<[Long], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }

  /** Table description of table t_account_order. Objects of this class serve as prototypes for rows in queries. */
  class TAccountOrder(_tableTag: Tag) extends profile.api.Table[TAccountOrderRow](_tableTag, "t_account_order") {
    def * = (accountOrderNo, paymentVoucherNo, accountId, deviceType, memberId, tradeType, tradeStatus, diamondAmount, amount, gameId, gmtCreate, gmtUpdate) <> (TAccountOrderRow.tupled, TAccountOrderRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(accountOrderNo), Rep.Some(paymentVoucherNo), Rep.Some(accountId), Rep.Some(deviceType), Rep.Some(memberId), Rep.Some(tradeType), Rep.Some(tradeStatus), Rep.Some(diamondAmount), Rep.Some(amount), Rep.Some(gameId), Rep.Some(gmtCreate), Rep.Some(gmtUpdate)).shaped.<>({ r => import r._; _1.map(_ => TAccountOrderRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column account_order_no SqlType(varchar), PrimaryKey, Length(64,true) */
    val accountOrderNo: Rep[String] = column[String]("account_order_no", O.PrimaryKey, O.Length(64, varying = true))
    /** Database column payment_voucher_no SqlType(varchar), Length(64,true) */
    val paymentVoucherNo: Rep[String] = column[String]("payment_voucher_no", O.Length(64, varying = true))
    /** Database column account_id SqlType(int8) */
    val accountId: Rep[Long] = column[Long]("account_id")
    /** Database column device_type SqlType(int4) */
    val deviceType: Rep[Int] = column[Int]("device_type")
    /** Database column member_id SqlType(int8) */
    val memberId: Rep[Long] = column[Long]("member_id")
    /** Database column trade_type SqlType(int4) */
    val tradeType: Rep[Int] = column[Int]("trade_type")
    /** Database column trade_status SqlType(int4) */
    val tradeStatus: Rep[Int] = column[Int]("trade_status")
    /** Database column diamond_amount SqlType(int4) */
    val diamondAmount: Rep[Int] = column[Int]("diamond_amount")
    /** Database column amount SqlType(numeric) */
    val amount: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("amount")
    /** Database column game_id SqlType(int8) */
    val gameId: Rep[Long] = column[Long]("game_id")
    /** Database column gmt_create SqlType(timestamp) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(timestamp) */
    val gmtUpdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_update")
  }

  /** Collection-like TableQuery object for table TAccountOrder */
  lazy val TAccountOrder = new TableQuery(tag => new TAccountOrder(tag))

  /** Entity class storing rows of table TmChannel
    *
    * @param id         Database column id SqlType(int4), PrimaryKey
    * @param code       Database column code SqlType(varchar), Length(32,true)
    * @param deviceType Database column device_type SqlType(int4)
    * @param priority   Database column priority SqlType(int2)
    * @param status     Database column status SqlType(bit)
    * @param name       Database column name SqlType(varchar), Length(32,true)
    * @param gmtCreate  Database column gmt_create SqlType(timestamp)
    * @param gmtUpdate  Database column gmt_update SqlType(timestamp) */
  case class TmChannelRow(id: Int, code: String, deviceType: Int, priority: Short, status: Boolean, name: String, gmtCreate: java.sql.Timestamp, gmtUpdate: java.sql.Timestamp)

  /** GetResult implicit for fetching TmChannelRow objects using plain SQL queries */
  implicit def GetResultTmChannelRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Short], e3: GR[Boolean], e4: GR[java.sql.Timestamp]): GR[TmChannelRow] = GR {
    prs => import prs._
      TmChannelRow.tupled((<<[Int], <<[String], <<[Int], <<[Short], <<[Boolean], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }

  /** Table description of table tm_channel. Objects of this class serve as prototypes for rows in queries. */
  class TmChannel(_tableTag: Tag) extends profile.api.Table[TmChannelRow](_tableTag, "tm_channel") {
    def * = (id, code, deviceType, priority, status, name, gmtCreate, gmtUpdate) <> (TmChannelRow.tupled, TmChannelRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(code), Rep.Some(deviceType), Rep.Some(priority), Rep.Some(status), Rep.Some(name), Rep.Some(gmtCreate), Rep.Some(gmtUpdate)).shaped.<>({ r => import r._; _1.map(_ => TmChannelRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(int4), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column code SqlType(varchar), Length(32,true) */
    val code: Rep[String] = column[String]("code", O.Length(32, varying = true))
    /** Database column device_type SqlType(int4) */
    val deviceType: Rep[Int] = column[Int]("device_type")
    /** Database column priority SqlType(int2) */
    val priority: Rep[Short] = column[Short]("priority")
    /** Database column status SqlType(bit) */
    val status: Rep[Boolean] = column[Boolean]("status")
    /** Database column name SqlType(varchar), Length(32,true) */
    val name: Rep[String] = column[String]("name", O.Length(32, varying = true))
    /** Database column gmt_create SqlType(timestamp) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(timestamp) */
    val gmtUpdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_update")
  }

  /** Collection-like TableQuery object for table TmChannel */
  lazy val TmChannel = new TableQuery(tag => new TmChannel(tag))

  /** Entity class storing rows of table TmDiamodPrice
    *
    * @param id         Database column id SqlType(int4), PrimaryKey
    * @param code       Database column code SqlType(varchar), Length(32,true)
    * @param deviceType Database column device_type SqlType(int4)
    * @param status     Database column status SqlType(bit)
    * @param amount     Database column amount SqlType(int4)
    * @param price      Database column price SqlType(numeric)
    * @param gmtCreate  Database column gmt_create SqlType(timestamp)
    * @param gmtUpdate  Database column gmt_update SqlType(timestamp) */
  case class TmDiamodPriceRow(id: Int, code: String, deviceType: Int, status: Boolean, amount: Int, price: scala.math.BigDecimal, gmtCreate: java.sql.Timestamp, gmtUpdate: java.sql.Timestamp)

  /** GetResult implicit for fetching TmDiamodPriceRow objects using plain SQL queries */
  implicit def GetResultTmDiamodPriceRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean], e3: GR[scala.math.BigDecimal], e4: GR[java.sql.Timestamp]): GR[TmDiamodPriceRow] = GR {
    prs => import prs._
      TmDiamodPriceRow.tupled((<<[Int], <<[String], <<[Int], <<[Boolean], <<[Int], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }

  /** Table description of table tm_diamod_price. Objects of this class serve as prototypes for rows in queries. */
  class TmDiamodPrice(_tableTag: Tag) extends profile.api.Table[TmDiamodPriceRow](_tableTag, "tm_diamod_price") {
    def * = (id, code, deviceType, status, amount, price, gmtCreate, gmtUpdate) <> (TmDiamodPriceRow.tupled, TmDiamodPriceRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(code), Rep.Some(deviceType), Rep.Some(status), Rep.Some(amount), Rep.Some(price), Rep.Some(gmtCreate), Rep.Some(gmtUpdate)).shaped.<>({ r => import r._; _1.map(_ => TmDiamodPriceRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(int4), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column code SqlType(varchar), Length(32,true) */
    val code: Rep[String] = column[String]("code", O.Length(32, varying = true))
    /** Database column device_type SqlType(int4) */
    val deviceType: Rep[Int] = column[Int]("device_type")
    /** Database column status SqlType(bit) */
    val status: Rep[Boolean] = column[Boolean]("status")
    /** Database column amount SqlType(int4) */
    val amount: Rep[Int] = column[Int]("amount")
    /** Database column price SqlType(numeric) */
    val price: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("price")
    /** Database column gmt_create SqlType(timestamp) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(timestamp) */
    val gmtUpdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_update")
  }

  /** Collection-like TableQuery object for table TmDiamodPrice */
  lazy val TmDiamodPrice = new TableQuery(tag => new TmDiamodPrice(tag))

  /** Entity class storing rows of table TmDiamondAccount
    *  @param accountId Database column account_id SqlType(int8), PrimaryKey
    *  @param memberId Database column member_id SqlType(int8)
    *  @param deviceType Database column device_type SqlType(int4)
    *  @param amount Database column amount SqlType(int4)
    *  @param gmtCreate Database column gmt_create SqlType(timestamp)
    *  @param gmtUpdate Database column gmt_update SqlType(timestamp) */
  case class TmDiamondAccountRow(accountId: Long, memberId: Long, deviceType: Int, amount: Int, gmtCreate: java.sql.Timestamp, gmtUpdate: java.sql.Timestamp)
  /** GetResult implicit for fetching TmDiamondAccountRow objects using plain SQL queries */
  implicit def GetResultTmDiamondAccountRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[java.sql.Timestamp]): GR[TmDiamondAccountRow] = GR{
    prs => import prs._
      TmDiamondAccountRow.tupled((<<[Long], <<[Long], <<[Int], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }
  /** Table description of table tm_diamond_account. Objects of this class serve as prototypes for rows in queries. */
  class TmDiamondAccount(_tableTag: Tag) extends profile.api.Table[TmDiamondAccountRow](_tableTag, "tm_diamond_account") {
    def * = (accountId, memberId, deviceType, amount, gmtCreate, gmtUpdate) <> (TmDiamondAccountRow.tupled, TmDiamondAccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(accountId), Rep.Some(memberId), Rep.Some(deviceType), Rep.Some(amount), Rep.Some(gmtCreate), Rep.Some(gmtUpdate)).shaped.<>({r=>import r._; _1.map(_=> TmDiamondAccountRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column account_id SqlType(int8), PrimaryKey */
    val accountId: Rep[Long] = column[Long]("account_id", O.PrimaryKey)
    /** Database column member_id SqlType(int8) */
    val memberId: Rep[Long] = column[Long]("member_id")
    /** Database column device_type SqlType(int4) */
    val deviceType: Rep[Int] = column[Int]("device_type")
    /** Database column amount SqlType(int4) */
    val amount: Rep[Int] = column[Int]("amount")
    /** Database column gmt_create SqlType(timestamp) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(timestamp) */
    val gmtUpdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_update")
  }
  /** Collection-like TableQuery object for table TmDiamondAccount */
  lazy val TmDiamondAccount = new TableQuery(tag => new TmDiamondAccount(tag))

  /** Entity class storing rows of table TPaymentOrder
    *
    * @param paymentVoucherNo Database column payment_voucher_no SqlType(varchar), PrimaryKey, Length(64,true)
    * @param accountOrderNo   Database column account_order_no SqlType(varchar), Length(64,true)
    * @param deviceType       Database column device_type SqlType(int4)
    * @param memberId         Database column member_id SqlType(int8)
    * @param accountId        Database column account_id SqlType(int8)
    * @param channelCode      Database column channel_code SqlType(varchar), Length(11,true)
    * @param amount           Database column amount SqlType(numeric)
    * @param payStatus        Database column pay_status SqlType(int4)
    * @param gmtCreate        Database column gmt_create SqlType(timestamp)
    * @param gmtUpdate        Database column gmt_update SqlType(timestamp) */
  case class TPaymentOrderRow(paymentVoucherNo: String, accountOrderNo: String, deviceType: Int, memberId: Long, accountId: Long, channelCode: String, amount: scala.math.BigDecimal, payStatus: Int, gmtCreate: java.sql.Timestamp, gmtUpdate: java.sql.Timestamp)

  /** GetResult implicit for fetching TPaymentOrderRow objects using plain SQL queries */
  implicit def GetResultTPaymentOrderRow(implicit e0: GR[String], e1: GR[Int], e2: GR[Long], e3: GR[scala.math.BigDecimal], e4: GR[java.sql.Timestamp]): GR[TPaymentOrderRow] = GR {
    prs => import prs._
      TPaymentOrderRow.tupled((<<[String], <<[String], <<[Int], <<[Long], <<[Long], <<[String], <<[scala.math.BigDecimal], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }

  /** Table description of table t_payment_order. Objects of this class serve as prototypes for rows in queries. */
  class TPaymentOrder(_tableTag: Tag) extends profile.api.Table[TPaymentOrderRow](_tableTag, "t_payment_order") {
    def * = (paymentVoucherNo, accountOrderNo, deviceType, memberId, accountId, channelCode, amount, payStatus, gmtCreate, gmtUpdate) <> (TPaymentOrderRow.tupled, TPaymentOrderRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(paymentVoucherNo), Rep.Some(accountOrderNo), Rep.Some(deviceType), Rep.Some(memberId), Rep.Some(accountId), Rep.Some(channelCode), Rep.Some(amount), Rep.Some(payStatus), Rep.Some(gmtCreate), Rep.Some(gmtUpdate)).shaped.<>({ r => import r._; _1.map(_ => TPaymentOrderRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column payment_voucher_no SqlType(varchar), PrimaryKey, Length(64,true) */
    val paymentVoucherNo: Rep[String] = column[String]("payment_voucher_no", O.PrimaryKey, O.Length(64, varying = true))
    /** Database column account_order_no SqlType(varchar), Length(64,true) */
    val accountOrderNo: Rep[String] = column[String]("account_order_no", O.Length(64, varying = true))
    /** Database column device_type SqlType(int4) */
    val deviceType: Rep[Int] = column[Int]("device_type")
    /** Database column member_id SqlType(int8) */
    val memberId: Rep[Long] = column[Long]("member_id")
    /** Database column account_id SqlType(int8) */
    val accountId: Rep[Long] = column[Long]("account_id")
    /** Database column channel_code SqlType(varchar), Length(11,true) */
    val channelCode: Rep[String] = column[String]("channel_code", O.Length(11, varying = true))
    /** Database column amount SqlType(numeric) */
    val amount: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("amount")
    /** Database column pay_status SqlType(int4) */
    val payStatus: Rep[Int] = column[Int]("pay_status")
    /** Database column gmt_create SqlType(timestamp) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(timestamp) */
    val gmtUpdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_update")
  }

  /** Collection-like TableQuery object for table TPaymentOrder */
  lazy val TPaymentOrder = new TableQuery(tag => new TPaymentOrder(tag))
}
