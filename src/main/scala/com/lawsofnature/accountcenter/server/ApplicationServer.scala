package com.lawsofnature.accountcenter.server

import java.util

import Ice.ObjectImpl
import com.google.inject.{AbstractModule, Guice}
import com.google.inject.name.Names
import com.lawsofnatrue.common.ice.{ConfigHelper, IceServerTemplate, IceServerTemplateImpl}
import com.lawsofnature.accountcenter.service.{AccountService, AccountServiceImpl}
import com.lawsofnature.common.rabbitmq.{RabbitmqConsumerTemplate, RabbitmqConsumerTemplateImpl, RabbitmqProducerTemplate, RabbitmqProducerTemplateImpl}
import com.lawsofnature.common.service.ConsumeService
import com.typesafe.config.ConfigFactory
import org.slf4j.LoggerFactory

/**
  * Created by fangzhongwei on 2016/11/21.
  */
object ApplicationServer extends App{


  var logger = LoggerFactory.getLogger(this.getClass)

  private val injector = Guice.createInjector(new AbstractModule() {
    override def configure() {
      val map: util.HashMap[String, String] = ConfigHelper.configMap
      Names.bindProperties(binder(), map)
      bind(classOf[AccountService]).to(classOf[AccountServiceImpl]).asEagerSingleton()
      bind(classOf[RabbitmqConsumerTemplate]).to(classOf[RabbitmqConsumerTemplateImpl]).asEagerSingleton()
    }
  })

  private val consumerTemplate: RabbitmqConsumerTemplate = injector.getInstance(classOf[RabbitmqConsumerTemplate])
  consumerTemplate.connect
  consumerTemplate.startConsume(ConfigFactory.load().getString("account.mq.queue"), injector.getInstance(classOf[AccountService]))
}
