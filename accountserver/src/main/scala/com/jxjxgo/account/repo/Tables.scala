package com.jxjxgo.account.repo

import com.lawsofnature.connection.MySQLDBImpl

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables extends MySQLDBImpl {
  val profile: slick.jdbc.JdbcProfile

  import profile.api._

  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(TAccountOrder.schema, TmChannel.schema, TmDiamodPrice.schema, TmDiamondAccount.schema, TPaymentOrder.schema, TSequence.schema).reduceLeft(_ ++ _)

  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table TAccountOrder
    *
    * @param accountOrderNo   Database column account_order_no SqlType(VARCHAR), PrimaryKey, Length(64,true)
    * @param paymentVoucherNo Database column payment_voucher_no SqlType(VARCHAR), Length(64,true)
    * @param accountId        Database column account_id SqlType(BIGINT)
    * @param memberId         Database column member_id SqlType(BIGINT)
    * @param tradeType        Database column trade_type SqlType(INT)
    * @param tradeStatus      Database column trade_status SqlType(INT)
    * @param diamondAmount    Database column diamond_amount SqlType(INT)
    * @param amount           Database column amount SqlType(DECIMAL)
    * @param gameId           Database column game_id SqlType(BIGINT)
    * @param gmtCreate        Database column gmt_create SqlType(TIMESTAMP)
    * @param gmtUpdate        Database column gmt_update SqlType(TIMESTAMP) */
  case class TAccountOrderRow(accountOrderNo: String, paymentVoucherNo: String, accountId: Long, memberId: Long, tradeType: Int, tradeStatus: Int, diamondAmount: Int, amount: scala.math.BigDecimal, gameId: Long, gmtCreate: java.sql.Timestamp, gmtUpdate: java.sql.Timestamp)

  /** GetResult implicit for fetching TAccountOrderRow objects using plain SQL queries */
  implicit def GetResultTAccountOrderRow(implicit e0: GR[String], e1: GR[Long], e2: GR[Int], e3: GR[scala.math.BigDecimal], e4: GR[java.sql.Timestamp]): GR[TAccountOrderRow] = GR {
    prs => import prs._
      TAccountOrderRow.tupled((<<[String], <<[String], <<[Long], <<[Long], <<[Int], <<[Int], <<[Int], <<[scala.math.BigDecimal], <<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }

  /** Table description of table t_account_order. Objects of this class serve as prototypes for rows in queries. */
  class TAccountOrder(_tableTag: Tag) extends profile.api.Table[TAccountOrderRow](_tableTag, Some("account"), "t_account_order") {
    def * = (accountOrderNo, paymentVoucherNo, accountId, memberId, tradeType, tradeStatus, diamondAmount, amount, gameId, gmtCreate, gmtUpdate) <> (TAccountOrderRow.tupled, TAccountOrderRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(accountOrderNo), Rep.Some(paymentVoucherNo), Rep.Some(accountId), Rep.Some(memberId), Rep.Some(tradeType), Rep.Some(tradeStatus), Rep.Some(diamondAmount), Rep.Some(amount), Rep.Some(gameId), Rep.Some(gmtCreate), Rep.Some(gmtUpdate)).shaped.<>({ r => import r._; _1.map(_ => TAccountOrderRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column account_order_no SqlType(VARCHAR), PrimaryKey, Length(64,true) */
    val accountOrderNo: Rep[String] = column[String]("account_order_no", O.PrimaryKey, O.Length(64, varying = true))
    /** Database column payment_voucher_no SqlType(VARCHAR), Length(64,true) */
    val paymentVoucherNo: Rep[String] = column[String]("payment_voucher_no", O.Length(64, varying = true))
    /** Database column account_id SqlType(BIGINT) */
    val accountId: Rep[Long] = column[Long]("account_id")
    /** Database column member_id SqlType(BIGINT) */
    val memberId: Rep[Long] = column[Long]("member_id")
    /** Database column trade_type SqlType(INT) */
    val tradeType: Rep[Int] = column[Int]("trade_type")
    /** Database column trade_status SqlType(INT) */
    val tradeStatus: Rep[Int] = column[Int]("trade_status")
    /** Database column diamond_amount SqlType(INT) */
    val diamondAmount: Rep[Int] = column[Int]("diamond_amount")
    /** Database column amount SqlType(DECIMAL) */
    val amount: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("amount")
    /** Database column game_id SqlType(BIGINT) */
    val gameId: Rep[Long] = column[Long]("game_id")
    /** Database column gmt_create SqlType(TIMESTAMP) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(TIMESTAMP) */
    val gmtUpdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_update")

    /** Index over (paymentVoucherNo) (database name idx_pn) */
    val index1 = index("idx_pn", paymentVoucherNo)
  }

  /** Collection-like TableQuery object for table TAccountOrder */
  lazy val TAccountOrder = new TableQuery(tag => new TAccountOrder(tag))

  /** Entity class storing rows of table TmChannel
    *
    * @param id        Database column id SqlType(INT), AutoInc, PrimaryKey
    * @param code      Database column code SqlType(VARCHAR), Length(32,true)
    * @param priority  Database column priority SqlType(TINYINT), Default(0)
    * @param status    Database column status SqlType(BIT)
    * @param name      Database column name SqlType(VARCHAR), Length(32,true)
    * @param gmtCreate Database column gmt_create SqlType(TIMESTAMP)
    * @param gmtUpdate Database column gmt_update SqlType(TIMESTAMP) */
  case class TmChannelRow(id: Int, code: String, priority: Byte = 0, status: Boolean, name: String, gmtCreate: java.sql.Timestamp, gmtUpdate: java.sql.Timestamp)

  /** GetResult implicit for fetching TmChannelRow objects using plain SQL queries */
  implicit def GetResultTmChannelRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Byte], e3: GR[Boolean], e4: GR[java.sql.Timestamp]): GR[TmChannelRow] = GR {
    prs => import prs._
      TmChannelRow.tupled((<<[Int], <<[String], <<[Byte], <<[Boolean], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }

  /** Table description of table tm_channel. Objects of this class serve as prototypes for rows in queries. */
  class TmChannel(_tableTag: Tag) extends profile.api.Table[TmChannelRow](_tableTag, Some("account"), "tm_channel") {
    def * = (id, code, priority, status, name, gmtCreate, gmtUpdate) <> (TmChannelRow.tupled, TmChannelRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(code), Rep.Some(priority), Rep.Some(status), Rep.Some(name), Rep.Some(gmtCreate), Rep.Some(gmtUpdate)).shaped.<>({ r => import r._; _1.map(_ => TmChannelRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column code SqlType(VARCHAR), Length(32,true) */
    val code: Rep[String] = column[String]("code", O.Length(32, varying = true))
    /** Database column priority SqlType(TINYINT), Default(0) */
    val priority: Rep[Byte] = column[Byte]("priority", O.Default(0))
    /** Database column status SqlType(BIT) */
    val status: Rep[Boolean] = column[Boolean]("status")
    /** Database column name SqlType(VARCHAR), Length(32,true) */
    val name: Rep[String] = column[String]("name", O.Length(32, varying = true))
    /** Database column gmt_create SqlType(TIMESTAMP) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(TIMESTAMP) */
    val gmtUpdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_update")
  }

  /** Collection-like TableQuery object for table TmChannel */
  lazy val TmChannel = new TableQuery(tag => new TmChannel(tag))

  /** Entity class storing rows of table TmDiamodPrice
    *
    * @param id        Database column id SqlType(INT), AutoInc, PrimaryKey
    * @param code      Database column code SqlType(VARCHAR), Length(32,true)
    * @param status    Database column status SqlType(BIT)
    * @param amount    Database column amount SqlType(INT)
    * @param price     Database column price SqlType(DECIMAL)
    * @param gmtCreate Database column gmt_create SqlType(TIMESTAMP)
    * @param gmtUpdate Database column gmt_update SqlType(TIMESTAMP) */
  case class TmDiamodPriceRow(id: Int, code: String, status: Boolean, amount: Int, price: scala.math.BigDecimal, gmtCreate: java.sql.Timestamp, gmtUpdate: java.sql.Timestamp)

  /** GetResult implicit for fetching TmDiamodPriceRow objects using plain SQL queries */
  implicit def GetResultTmDiamodPriceRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean], e3: GR[scala.math.BigDecimal], e4: GR[java.sql.Timestamp]): GR[TmDiamodPriceRow] = GR {
    prs => import prs._
      TmDiamodPriceRow.tupled((<<[Int], <<[String], <<[Boolean], <<[Int], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }

  /** Table description of table tm_diamod_price. Objects of this class serve as prototypes for rows in queries. */
  class TmDiamodPrice(_tableTag: Tag) extends profile.api.Table[TmDiamodPriceRow](_tableTag, Some("account"), "tm_diamod_price") {
    def * = (id, code, status, amount, price, gmtCreate, gmtUpdate) <> (TmDiamodPriceRow.tupled, TmDiamodPriceRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(code), Rep.Some(status), Rep.Some(amount), Rep.Some(price), Rep.Some(gmtCreate), Rep.Some(gmtUpdate)).shaped.<>({ r => import r._; _1.map(_ => TmDiamodPriceRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column code SqlType(VARCHAR), Length(32,true) */
    val code: Rep[String] = column[String]("code", O.Length(32, varying = true))
    /** Database column status SqlType(BIT) */
    val status: Rep[Boolean] = column[Boolean]("status")
    /** Database column amount SqlType(INT) */
    val amount: Rep[Int] = column[Int]("amount")
    /** Database column price SqlType(DECIMAL) */
    val price: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("price")
    /** Database column gmt_create SqlType(TIMESTAMP) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(TIMESTAMP) */
    val gmtUpdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_update")

    /** Uniqueness Index over (code) (database name uq_code) */
    val index1 = index("uq_code", code, unique = true)
  }

  /** Collection-like TableQuery object for table TmDiamodPrice */
  lazy val TmDiamodPrice = new TableQuery(tag => new TmDiamodPrice(tag))

  /** Entity class storing rows of table TmDiamondAccount
    *
    * @param accountId Database column account_id SqlType(BIGINT), AutoInc, PrimaryKey
    * @param memberId  Database column member_id SqlType(BIGINT)
    * @param amount    Database column amount SqlType(INT)
    * @param gmtCreate Database column gmt_create SqlType(TIMESTAMP)
    * @param gmtUpdate Database column gmt_update SqlType(TIMESTAMP), Default(None) */
  case class TmDiamondAccountRow(accountId: Long, memberId: Long, amount: Int, gmtCreate: java.sql.Timestamp, gmtUpdate: Option[java.sql.Timestamp] = None)

  /** GetResult implicit for fetching TmDiamondAccountRow objects using plain SQL queries */
  implicit def GetResultTmDiamondAccountRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]]): GR[TmDiamondAccountRow] = GR {
    prs => import prs._
      TmDiamondAccountRow.tupled((<<[Long], <<[Long], <<[Int], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }

  /** Table description of table tm_diamond_account. Objects of this class serve as prototypes for rows in queries. */
  class TmDiamondAccount(_tableTag: Tag) extends profile.api.Table[TmDiamondAccountRow](_tableTag, Some("account"), "tm_diamond_account") {
    def * = (accountId, memberId, amount, gmtCreate, gmtUpdate) <> (TmDiamondAccountRow.tupled, TmDiamondAccountRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(accountId), Rep.Some(memberId), Rep.Some(amount), Rep.Some(gmtCreate), gmtUpdate).shaped.<>({ r => import r._; _1.map(_ => TmDiamondAccountRow.tupled((_1.get, _2.get, _3.get, _4.get, _5))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column account_id SqlType(BIGINT), AutoInc, PrimaryKey */
    val accountId: Rep[Long] = column[Long]("account_id", O.AutoInc, O.PrimaryKey)
    /** Database column member_id SqlType(BIGINT) */
    val memberId: Rep[Long] = column[Long]("member_id")
    /** Database column amount SqlType(INT) */
    val amount: Rep[Int] = column[Int]("amount")
    /** Database column gmt_create SqlType(TIMESTAMP) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(TIMESTAMP), Default(None) */
    val gmtUpdate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("gmt_update", O.Default(None))
  }

  /** Collection-like TableQuery object for table TmDiamondAccount */
  lazy val TmDiamondAccount = new TableQuery(tag => new TmDiamondAccount(tag))

  /** Entity class storing rows of table TPaymentOrder
    *
    * @param paymentVoucherNo Database column payment_voucher_no SqlType(VARCHAR), PrimaryKey, Length(64,true)
    * @param accountOrderNo   Database column account_order_no SqlType(VARCHAR), Length(64,true)
    * @param memberId         Database column member_id SqlType(BIGINT)
    * @param channelCode      Database column channel_code SqlType(VARCHAR), Length(11,true)
    * @param amount           Database column amount SqlType(DECIMAL)
    * @param payStatus        Database column pay_status SqlType(INT)
    * @param gmtCreate        Database column gmt_create SqlType(TIMESTAMP)
    * @param gmtUpdate        Database column gmt_update SqlType(TIMESTAMP) */
  case class TPaymentOrderRow(paymentVoucherNo: String, accountOrderNo: String, memberId: Long, channelCode: String, amount: scala.math.BigDecimal, payStatus: Int, gmtCreate: java.sql.Timestamp, gmtUpdate: java.sql.Timestamp)

  /** GetResult implicit for fetching TPaymentOrderRow objects using plain SQL queries */
  implicit def GetResultTPaymentOrderRow(implicit e0: GR[String], e1: GR[Long], e2: GR[scala.math.BigDecimal], e3: GR[Int], e4: GR[java.sql.Timestamp]): GR[TPaymentOrderRow] = GR {
    prs => import prs._
      TPaymentOrderRow.tupled((<<[String], <<[String], <<[Long], <<[String], <<[scala.math.BigDecimal], <<[Int], <<[java.sql.Timestamp], <<[java.sql.Timestamp]))
  }

  /** Table description of table t_payment_order. Objects of this class serve as prototypes for rows in queries. */
  class TPaymentOrder(_tableTag: Tag) extends profile.api.Table[TPaymentOrderRow](_tableTag, Some("account"), "t_payment_order") {
    def * = (paymentVoucherNo, accountOrderNo, memberId, channelCode, amount, payStatus, gmtCreate, gmtUpdate) <> (TPaymentOrderRow.tupled, TPaymentOrderRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(paymentVoucherNo), Rep.Some(accountOrderNo), Rep.Some(memberId), Rep.Some(channelCode), Rep.Some(amount), Rep.Some(payStatus), Rep.Some(gmtCreate), Rep.Some(gmtUpdate)).shaped.<>({ r => import r._; _1.map(_ => TPaymentOrderRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column payment_voucher_no SqlType(VARCHAR), PrimaryKey, Length(64,true) */
    val paymentVoucherNo: Rep[String] = column[String]("payment_voucher_no", O.PrimaryKey, O.Length(64, varying = true))
    /** Database column account_order_no SqlType(VARCHAR), Length(64,true) */
    val accountOrderNo: Rep[String] = column[String]("account_order_no", O.Length(64, varying = true))
    /** Database column member_id SqlType(BIGINT) */
    val memberId: Rep[Long] = column[Long]("member_id")
    /** Database column channel_code SqlType(VARCHAR), Length(11,true) */
    val channelCode: Rep[String] = column[String]("channel_code", O.Length(11, varying = true))
    /** Database column amount SqlType(DECIMAL) */
    val amount: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("amount")
    /** Database column pay_status SqlType(INT) */
    val payStatus: Rep[Int] = column[Int]("pay_status")
    /** Database column gmt_create SqlType(TIMESTAMP) */
    val gmtCreate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_create")
    /** Database column gmt_update SqlType(TIMESTAMP) */
    val gmtUpdate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("gmt_update")
  }

  /** Collection-like TableQuery object for table TPaymentOrder */
  lazy val TPaymentOrder = new TableQuery(tag => new TPaymentOrder(tag))

  /** Entity class storing rows of table TSequence
    *
    * @param name         Database column name SqlType(VARCHAR), Length(64,true)
    * @param currentValue Database column current_value SqlType(BIGINT)
    * @param increment    Database column increment SqlType(INT), Default(1) */
  case class TSequenceRow(name: String, currentValue: Long, increment: Int = 1)

  /** GetResult implicit for fetching TSequenceRow objects using plain SQL queries */
  implicit def GetResultTSequenceRow(implicit e0: GR[String], e1: GR[Long], e2: GR[Int]): GR[TSequenceRow] = GR {
    prs => import prs._
      TSequenceRow.tupled((<<[String], <<[Long], <<[Int]))
  }

  /** Table description of table t_sequence. Objects of this class serve as prototypes for rows in queries. */
  class TSequence(_tableTag: Tag) extends profile.api.Table[TSequenceRow](_tableTag, Some("account"), "t_sequence") {
    def * = (name, currentValue, increment) <> (TSequenceRow.tupled, TSequenceRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(name), Rep.Some(currentValue), Rep.Some(increment)).shaped.<>({ r => import r._; _1.map(_ => TSequenceRow.tupled((_1.get, _2.get, _3.get))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(VARCHAR), Length(64,true) */
    val name: Rep[String] = column[String]("name", O.Length(64, varying = true))
    /** Database column current_value SqlType(BIGINT) */
    val currentValue: Rep[Long] = column[Long]("current_value")
    /** Database column increment SqlType(INT), Default(1) */
    val increment: Rep[Int] = column[Int]("increment", O.Default(1))

    /** Uniqueness Index over (name) (database name uq_ts_n) */
    val index1 = index("uq_ts_n", name, unique = true)
  }

  /** Collection-like TableQuery object for table TSequence */
  lazy val TSequence = new TableQuery(tag => new TSequence(tag))
}
