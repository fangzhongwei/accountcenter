package com.lawsofnature.accountcenter.server

import java.util

import com.google.inject.name.Names
import com.google.inject.{AbstractModule, Guice}
import com.lawsofnatrue.common.ice.ConfigHelper
import com.lawsofnature.account.repo.{AccountRepository, AccountRepositoryImpl}
import com.lawsofnature.accountcenter.service.{AccountService, AccountServiceImpl}
import com.typesafe.config.ConfigFactory
import org.slf4j.LoggerFactory

/**
  * Created by fangzhongwei on 2016/11/21.
  */
object ApplicationServer extends App {
  private[this] val logger = LoggerFactory.getLogger(this.getClass)

  private[this] val injector = Guice.createInjector(new AbstractModule() {
    override def configure() {
      val map: util.HashMap[String, String] = ConfigHelper.configMap
      Names.bindProperties(binder(), map)
      bind(classOf[AccountRepository]).to(classOf[AccountRepositoryImpl]).asEagerSingleton()
      bind(classOf[AccountService]).to(classOf[AccountServiceImpl]).asEagerSingleton()
//      bind(classOf[RabbitmqConsumerTemplate]).to(classOf[RabbitmqConsumerTemplateImpl]).asEagerSingleton()
    }
  })

//  private[this] val consumerTemplate: RabbitmqConsumerTemplate = injector.getInstance(classOf[RabbitmqConsumerTemplate])
//  consumerTemplate.connect
//  consumerTemplate.startConsume(ConfigFactory.load().getString("account.mq.queue"), injector.getInstance(classOf[AccountService]))
}
