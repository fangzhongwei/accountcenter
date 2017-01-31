package com.jxjxgo.accountcenter.server

import java.util

import com.google.inject.name.Names
import com.google.inject.{AbstractModule, Guice}
import com.jxjxgo.scrooge.thrift.template.{ScroogeThriftServerTemplate, ScroogeThriftServerTemplateImpl}
import com.lawsofnatrue.common.ice.ConfigHelper
import com.jxjxgo.account.repo.{AccountRepository, AccountRepositoryImpl}
import com.jxjxgo.accountcenter.service.{AccountEndpointImpl, AccountService, AccountServiceImpl}
import com.twitter.scrooge.ThriftService
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

      bind(classOf[ThriftService]).to(classOf[AccountEndpointImpl]).asEagerSingleton()
      bind(classOf[ScroogeThriftServerTemplate]).to(classOf[ScroogeThriftServerTemplateImpl]).asEagerSingleton()
    }
  })

  injector.getInstance(classOf[ScroogeThriftServerTemplate]).init
}
