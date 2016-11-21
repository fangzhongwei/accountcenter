package com.lawsofnature.accountcenter.service

import java.sql.Timestamp
import javax.inject.Inject

import com.lawsofnature.account.repo.{AccountRepository, TmDiamondAccountRow}
import com.lawsofnature.common.service.ConsumeService

/**
  * Created by fangzhongwei on 2016/11/21.
  */
trait AccountService extends ConsumeService {
  def consumeCreateAccountMessage(memberId: Long): Unit
}

class AccountServiceImpl @Inject()(accountRepository: AccountRepository) extends AccountService {
  override def consumeCreateAccountMessage(memberId: Long): Unit = accountRepository.create(TmDiamondAccountRow(0, memberId, 0, new Timestamp(System.currentTimeMillis())))

  override def consume(message: String): Unit = consumeCreateAccountMessage(message.toLong)
}
