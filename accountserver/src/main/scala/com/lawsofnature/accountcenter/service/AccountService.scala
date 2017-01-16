package com.lawsofnature.accountcenter.service

import java.nio.charset.StandardCharsets
import java.sql.Timestamp
import javax.inject.Inject

import com.lawsofnature.account.repo.{AccountRepository}

import scala.concurrent.{Future, Promise}

/**
  * Created by fangzhongwei on 2016/11/21.
  */
trait AccountService {
  def consumeCreateAccountMessage(memberId: Long): Unit
}

class AccountServiceImpl @Inject()(accountRepository: AccountRepository) extends AccountService {
  override def consumeCreateAccountMessage(memberId: Long): Unit = accountRepository.create(accountRepository.TmDiamondAccountRow(0, memberId, 0, new Timestamp(System.currentTimeMillis())))
}
