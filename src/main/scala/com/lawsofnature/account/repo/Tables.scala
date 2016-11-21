package com.lawsofnature.account.repo

import com.lawsofnature.connection.MySQLDBImpl

/** Entity class storing rows of table TmDiamondAccount
  *
  * @param accountId Database column account_id SqlType(INT), AutoInc, PrimaryKey
  * @param memberId  Database column member_id SqlType(BIGINT)
  * @param amount    Database column amount SqlType(INT)
  * @param gmtCreate Database column gmt_create SqlType(TIMESTAMP)
  * @param gmtUpdate Database column gmt_update SqlType(TIMESTAMP), Default(None) */
case class TmDiamondAccountRow(accountId: Int, memberId: Long, amount: Int, gmtCreate: java.sql.Timestamp, gmtUpdate: Option[java.sql.Timestamp] = None)

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables extends MySQLDBImpl {

  import profile.api._

  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = TmDiamondAccount.schema

  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** GetResult implicit for fetching TmDiamondAccountRow objects using plain SQL queries */
  implicit def GetResultTmDiamondAccountRow(implicit e0: GR[Int], e1: GR[Long], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]]): GR[TmDiamondAccountRow] = GR {
    prs => import prs._
      TmDiamondAccountRow.tupled((<<[Int], <<[Long], <<[Int], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }

  /** Table description of table tm_diamond_account. Objects of this class serve as prototypes for rows in queries. */
  class TmDiamondAccount(_tableTag: Tag) extends profile.api.Table[TmDiamondAccountRow](_tableTag, "tm_diamond_account") {
    def * = (accountId, memberId, amount, gmtCreate, gmtUpdate) <> (TmDiamondAccountRow.tupled, TmDiamondAccountRow.unapply)

    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(accountId), Rep.Some(memberId), Rep.Some(amount), Rep.Some(gmtCreate), gmtUpdate).shaped.<>({ r => import r._; _1.map(_ => TmDiamondAccountRow.tupled((_1.get, _2.get, _3.get, _4.get, _5))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column account_id SqlType(INT), AutoInc, PrimaryKey */
    val accountId: Rep[Int] = column[Int]("account_id", O.AutoInc, O.PrimaryKey)
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
}
