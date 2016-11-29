package com.lawsofnature.account.repo

import com.lawsofnature.connection.DBComponent

import scala.concurrent.Future

/**
  * Created by fangzhongwei on 2016/11/21.
  */
trait AccountRepository extends Tables {
  this: DBComponent =>

  import profile.api._

  protected def TmDiamondAccountAutoInc = TmDiamondAccount returning TmDiamondAccount.map(_.accountId)

  def create(tmDiamondAccountRow: TmDiamondAccountRow): Future[Int] = db.run {
    TmDiamondAccountAutoInc += tmDiamondAccountRow
  }
}

class AccountRepositoryImpl extends AccountRepository with DBComponent
