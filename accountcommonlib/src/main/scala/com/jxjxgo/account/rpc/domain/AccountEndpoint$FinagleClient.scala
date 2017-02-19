/**
 * Generated by Scrooge
 *   version: 4.5.0
 *   rev: 014664de600267b36809bbc85225e26aec286216
 *   built at: 20160203-205352
 */
package com.jxjxgo.account.rpc.domain

import com.twitter.finagle.SourcedException
import com.twitter.finagle.{service => ctfs}
import com.twitter.finagle.stats.{NullStatsReceiver, StatsReceiver}
import com.twitter.finagle.thrift.{Protocols, ThriftClientRequest}
import com.twitter.scrooge.{ThriftStruct, ThriftStructCodec}
import com.twitter.util.{Future, Return, Throw, Throwables}
import java.nio.ByteBuffer
import java.util.Arrays
import org.apache.thrift.protocol._
import org.apache.thrift.TApplicationException
import org.apache.thrift.transport.{TMemoryBuffer, TMemoryInputTransport}
import scala.collection.{Map, Set}
import scala.language.higherKinds


@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
class AccountEndpoint$FinagleClient(
    val service: com.twitter.finagle.Service[ThriftClientRequest, Array[Byte]],
    val protocolFactory: TProtocolFactory,
    val serviceName: String,
    stats: StatsReceiver,
    responseClassifier: ctfs.ResponseClassifier)
  extends AccountEndpoint[Future] {

  def this(
    service: com.twitter.finagle.Service[ThriftClientRequest, Array[Byte]],
    protocolFactory: TProtocolFactory = Protocols.binaryFactory(),
    serviceName: String = "AccountEndpoint",
    stats: StatsReceiver = NullStatsReceiver
  ) = this(
    service,
    protocolFactory,
    serviceName,
    stats,
    ctfs.ResponseClassifier.Default
  )

  import AccountEndpoint._

  protected def encodeRequest(name: String, args: ThriftStruct) = {
    val buf = new TMemoryBuffer(512)
    val oprot = protocolFactory.getProtocol(buf)

    oprot.writeMessageBegin(new TMessage(name, TMessageType.CALL, 0))
    args.write(oprot)
    oprot.writeMessageEnd()

    val bytes = Arrays.copyOfRange(buf.getArray, 0, buf.length)
    new ThriftClientRequest(bytes, false)
  }

  protected def decodeResponse[T <: ThriftStruct](resBytes: Array[Byte], codec: ThriftStructCodec[T]) = {
    val iprot = protocolFactory.getProtocol(new TMemoryInputTransport(resBytes))
    val msg = iprot.readMessageBegin()
    try {
      if (msg.`type` == TMessageType.EXCEPTION) {
        val exception = TApplicationException.read(iprot) match {
          case sourced: SourcedException =>
            if (serviceName != "") sourced.serviceName = serviceName
            sourced
          case e => e
        }
        throw exception
      } else {
        codec.decode(iprot)
      }
    } finally {
      iprot.readMessageEnd()
    }
  }

  protected def missingResult(name: String) = {
    new TApplicationException(
      TApplicationException.MISSING_RESULT,
      name + " failed: unknown result"
    )
  }

  protected def setServiceName(ex: Throwable): Throwable =
    if (this.serviceName == "") ex
    else {
      ex match {
        case se: SourcedException =>
          se.serviceName = this.serviceName
          se
        case _ => ex
      }
    }

  // ----- end boilerplate.

  private[this] val scopedStats = if (serviceName != "") stats.scope(serviceName) else stats
  private[this] object __stats_createAccount {
    val RequestsCounter = scopedStats.scope("createAccount").counter("requests")
    val SuccessCounter = scopedStats.scope("createAccount").counter("success")
    val FailuresCounter = scopedStats.scope("createAccount").counter("failures")
    val FailuresScope = scopedStats.scope("createAccount").scope("failures")
  }
  
  def createAccount(traceId: String, memberId: Long, deviceType: Int): Future[com.jxjxgo.account.rpc.domain.AccountBaseResponse] = {
    __stats_createAccount.RequestsCounter.incr()
    val inputArgs = CreateAccount.Args(traceId, memberId, deviceType)
    val replyDeserializer: Array[Byte] => _root_.com.twitter.util.Try[com.jxjxgo.account.rpc.domain.AccountBaseResponse] =
      response => {
        val result = decodeResponse(response, CreateAccount.Result)
        val exception: Throwable =
        null
  
        if (result.success.isDefined)
          _root_.com.twitter.util.Return(result.success.get)
        else if (exception != null)
          _root_.com.twitter.util.Throw(exception)
        else
          _root_.com.twitter.util.Throw(missingResult("createAccount"))
      }
  
    val serdeCtx = new _root_.com.twitter.finagle.thrift.DeserializeCtx[com.jxjxgo.account.rpc.domain.AccountBaseResponse](inputArgs, replyDeserializer)
    _root_.com.twitter.finagle.context.Contexts.local.let(
      _root_.com.twitter.finagle.thrift.DeserializeCtx.Key,
      serdeCtx
    ) {
      val serialized = encodeRequest("createAccount", inputArgs)
      this.service(serialized).flatMap { response =>
        Future.const(serdeCtx.deserialize(response))
      }.respond { response =>
        val responseClass = responseClassifier.applyOrElse(
          ctfs.ReqRep(inputArgs, response),
          ctfs.ResponseClassifier.Default)
        responseClass match {
          case ctfs.ResponseClass.Successful(_) =>
            __stats_createAccount.SuccessCounter.incr()
          case ctfs.ResponseClass.Failed(_) =>
            __stats_createAccount.FailuresCounter.incr()
            response match {
              case Throw(ex) =>
                setServiceName(ex)
                __stats_createAccount.FailuresScope.counter(Throwables.mkString(ex): _*).incr()
              case _ =>
            }
        }
      }
    }
  }
  private[this] object __stats_getAccount {
    val RequestsCounter = scopedStats.scope("getAccount").counter("requests")
    val SuccessCounter = scopedStats.scope("getAccount").counter("success")
    val FailuresCounter = scopedStats.scope("getAccount").counter("failures")
    val FailuresScope = scopedStats.scope("getAccount").scope("failures")
  }
  
  def getAccount(traceId: String, memberId: Long, deviceType: Int): Future[com.jxjxgo.account.rpc.domain.DiamondAccountResponse] = {
    __stats_getAccount.RequestsCounter.incr()
    val inputArgs = GetAccount.Args(traceId, memberId, deviceType)
    val replyDeserializer: Array[Byte] => _root_.com.twitter.util.Try[com.jxjxgo.account.rpc.domain.DiamondAccountResponse] =
      response => {
        val result = decodeResponse(response, GetAccount.Result)
        val exception: Throwable =
        null
  
        if (result.success.isDefined)
          _root_.com.twitter.util.Return(result.success.get)
        else if (exception != null)
          _root_.com.twitter.util.Throw(exception)
        else
          _root_.com.twitter.util.Throw(missingResult("getAccount"))
      }
  
    val serdeCtx = new _root_.com.twitter.finagle.thrift.DeserializeCtx[com.jxjxgo.account.rpc.domain.DiamondAccountResponse](inputArgs, replyDeserializer)
    _root_.com.twitter.finagle.context.Contexts.local.let(
      _root_.com.twitter.finagle.thrift.DeserializeCtx.Key,
      serdeCtx
    ) {
      val serialized = encodeRequest("getAccount", inputArgs)
      this.service(serialized).flatMap { response =>
        Future.const(serdeCtx.deserialize(response))
      }.respond { response =>
        val responseClass = responseClassifier.applyOrElse(
          ctfs.ReqRep(inputArgs, response),
          ctfs.ResponseClassifier.Default)
        responseClass match {
          case ctfs.ResponseClass.Successful(_) =>
            __stats_getAccount.SuccessCounter.incr()
          case ctfs.ResponseClass.Failed(_) =>
            __stats_getAccount.FailuresCounter.incr()
            response match {
              case Throw(ex) =>
                setServiceName(ex)
                __stats_getAccount.FailuresScope.counter(Throwables.mkString(ex): _*).incr()
              case _ =>
            }
        }
      }
    }
  }
  private[this] object __stats_getPriceList {
    val RequestsCounter = scopedStats.scope("getPriceList").counter("requests")
    val SuccessCounter = scopedStats.scope("getPriceList").counter("success")
    val FailuresCounter = scopedStats.scope("getPriceList").counter("failures")
    val FailuresScope = scopedStats.scope("getPriceList").scope("failures")
  }
  
  def getPriceList(traceId: String, deviceType: Int): Future[com.jxjxgo.account.rpc.domain.PriceListResponse] = {
    __stats_getPriceList.RequestsCounter.incr()
    val inputArgs = GetPriceList.Args(traceId, deviceType)
    val replyDeserializer: Array[Byte] => _root_.com.twitter.util.Try[com.jxjxgo.account.rpc.domain.PriceListResponse] =
      response => {
        val result = decodeResponse(response, GetPriceList.Result)
        val exception: Throwable =
        null
  
        if (result.success.isDefined)
          _root_.com.twitter.util.Return(result.success.get)
        else if (exception != null)
          _root_.com.twitter.util.Throw(exception)
        else
          _root_.com.twitter.util.Throw(missingResult("getPriceList"))
      }
  
    val serdeCtx = new _root_.com.twitter.finagle.thrift.DeserializeCtx[com.jxjxgo.account.rpc.domain.PriceListResponse](inputArgs, replyDeserializer)
    _root_.com.twitter.finagle.context.Contexts.local.let(
      _root_.com.twitter.finagle.thrift.DeserializeCtx.Key,
      serdeCtx
    ) {
      val serialized = encodeRequest("getPriceList", inputArgs)
      this.service(serialized).flatMap { response =>
        Future.const(serdeCtx.deserialize(response))
      }.respond { response =>
        val responseClass = responseClassifier.applyOrElse(
          ctfs.ReqRep(inputArgs, response),
          ctfs.ResponseClassifier.Default)
        responseClass match {
          case ctfs.ResponseClass.Successful(_) =>
            __stats_getPriceList.SuccessCounter.incr()
          case ctfs.ResponseClass.Failed(_) =>
            __stats_getPriceList.FailuresCounter.incr()
            response match {
              case Throw(ex) =>
                setServiceName(ex)
                __stats_getPriceList.FailuresScope.counter(Throwables.mkString(ex): _*).incr()
              case _ =>
            }
        }
      }
    }
  }
  private[this] object __stats_getChannelList {
    val RequestsCounter = scopedStats.scope("getChannelList").counter("requests")
    val SuccessCounter = scopedStats.scope("getChannelList").counter("success")
    val FailuresCounter = scopedStats.scope("getChannelList").counter("failures")
    val FailuresScope = scopedStats.scope("getChannelList").scope("failures")
  }
  
  def getChannelList(traceId: String, deviceType: Int): Future[com.jxjxgo.account.rpc.domain.ChannelListResponse] = {
    __stats_getChannelList.RequestsCounter.incr()
    val inputArgs = GetChannelList.Args(traceId, deviceType)
    val replyDeserializer: Array[Byte] => _root_.com.twitter.util.Try[com.jxjxgo.account.rpc.domain.ChannelListResponse] =
      response => {
        val result = decodeResponse(response, GetChannelList.Result)
        val exception: Throwable =
        null
  
        if (result.success.isDefined)
          _root_.com.twitter.util.Return(result.success.get)
        else if (exception != null)
          _root_.com.twitter.util.Throw(exception)
        else
          _root_.com.twitter.util.Throw(missingResult("getChannelList"))
      }
  
    val serdeCtx = new _root_.com.twitter.finagle.thrift.DeserializeCtx[com.jxjxgo.account.rpc.domain.ChannelListResponse](inputArgs, replyDeserializer)
    _root_.com.twitter.finagle.context.Contexts.local.let(
      _root_.com.twitter.finagle.thrift.DeserializeCtx.Key,
      serdeCtx
    ) {
      val serialized = encodeRequest("getChannelList", inputArgs)
      this.service(serialized).flatMap { response =>
        Future.const(serdeCtx.deserialize(response))
      }.respond { response =>
        val responseClass = responseClassifier.applyOrElse(
          ctfs.ReqRep(inputArgs, response),
          ctfs.ResponseClassifier.Default)
        responseClass match {
          case ctfs.ResponseClass.Successful(_) =>
            __stats_getChannelList.SuccessCounter.incr()
          case ctfs.ResponseClass.Failed(_) =>
            __stats_getChannelList.FailuresCounter.incr()
            response match {
              case Throw(ex) =>
                setServiceName(ex)
                __stats_getChannelList.FailuresScope.counter(Throwables.mkString(ex): _*).incr()
              case _ =>
            }
        }
      }
    }
  }
  private[this] object __stats_deposit {
    val RequestsCounter = scopedStats.scope("deposit").counter("requests")
    val SuccessCounter = scopedStats.scope("deposit").counter("success")
    val FailuresCounter = scopedStats.scope("deposit").counter("failures")
    val FailuresScope = scopedStats.scope("deposit").scope("failures")
  }
  
  def deposit(traceId: String, request: com.jxjxgo.account.rpc.domain.DepositRequest): Future[com.jxjxgo.account.rpc.domain.DepositRequestResponse] = {
    __stats_deposit.RequestsCounter.incr()
    val inputArgs = Deposit.Args(traceId, request)
    val replyDeserializer: Array[Byte] => _root_.com.twitter.util.Try[com.jxjxgo.account.rpc.domain.DepositRequestResponse] =
      response => {
        val result = decodeResponse(response, Deposit.Result)
        val exception: Throwable =
        null
  
        if (result.success.isDefined)
          _root_.com.twitter.util.Return(result.success.get)
        else if (exception != null)
          _root_.com.twitter.util.Throw(exception)
        else
          _root_.com.twitter.util.Throw(missingResult("deposit"))
      }
  
    val serdeCtx = new _root_.com.twitter.finagle.thrift.DeserializeCtx[com.jxjxgo.account.rpc.domain.DepositRequestResponse](inputArgs, replyDeserializer)
    _root_.com.twitter.finagle.context.Contexts.local.let(
      _root_.com.twitter.finagle.thrift.DeserializeCtx.Key,
      serdeCtx
    ) {
      val serialized = encodeRequest("deposit", inputArgs)
      this.service(serialized).flatMap { response =>
        Future.const(serdeCtx.deserialize(response))
      }.respond { response =>
        val responseClass = responseClassifier.applyOrElse(
          ctfs.ReqRep(inputArgs, response),
          ctfs.ResponseClassifier.Default)
        responseClass match {
          case ctfs.ResponseClass.Successful(_) =>
            __stats_deposit.SuccessCounter.incr()
          case ctfs.ResponseClass.Failed(_) =>
            __stats_deposit.FailuresCounter.incr()
            response match {
              case Throw(ex) =>
                setServiceName(ex)
                __stats_deposit.FailuresScope.counter(Throwables.mkString(ex): _*).incr()
              case _ =>
            }
        }
      }
    }
  }
  private[this] object __stats_queryDepositOrder {
    val RequestsCounter = scopedStats.scope("queryDepositOrder").counter("requests")
    val SuccessCounter = scopedStats.scope("queryDepositOrder").counter("success")
    val FailuresCounter = scopedStats.scope("queryDepositOrder").counter("failures")
    val FailuresScope = scopedStats.scope("queryDepositOrder").scope("failures")
  }
  
  def queryDepositOrder(traceId: String, paymentVoucherNo: String): Future[com.jxjxgo.account.rpc.domain.DepositResponse] = {
    __stats_queryDepositOrder.RequestsCounter.incr()
    val inputArgs = QueryDepositOrder.Args(traceId, paymentVoucherNo)
    val replyDeserializer: Array[Byte] => _root_.com.twitter.util.Try[com.jxjxgo.account.rpc.domain.DepositResponse] =
      response => {
        val result = decodeResponse(response, QueryDepositOrder.Result)
        val exception: Throwable =
        null
  
        if (result.success.isDefined)
          _root_.com.twitter.util.Return(result.success.get)
        else if (exception != null)
          _root_.com.twitter.util.Throw(exception)
        else
          _root_.com.twitter.util.Throw(missingResult("queryDepositOrder"))
      }
  
    val serdeCtx = new _root_.com.twitter.finagle.thrift.DeserializeCtx[com.jxjxgo.account.rpc.domain.DepositResponse](inputArgs, replyDeserializer)
    _root_.com.twitter.finagle.context.Contexts.local.let(
      _root_.com.twitter.finagle.thrift.DeserializeCtx.Key,
      serdeCtx
    ) {
      val serialized = encodeRequest("queryDepositOrder", inputArgs)
      this.service(serialized).flatMap { response =>
        Future.const(serdeCtx.deserialize(response))
      }.respond { response =>
        val responseClass = responseClassifier.applyOrElse(
          ctfs.ReqRep(inputArgs, response),
          ctfs.ResponseClassifier.Default)
        responseClass match {
          case ctfs.ResponseClass.Successful(_) =>
            __stats_queryDepositOrder.SuccessCounter.incr()
          case ctfs.ResponseClass.Failed(_) =>
            __stats_queryDepositOrder.FailuresCounter.incr()
            response match {
              case Throw(ex) =>
                setServiceName(ex)
                __stats_queryDepositOrder.FailuresScope.counter(Throwables.mkString(ex): _*).incr()
              case _ =>
            }
        }
      }
    }
  }
  private[this] object __stats_settle {
    val RequestsCounter = scopedStats.scope("settle").counter("requests")
    val SuccessCounter = scopedStats.scope("settle").counter("success")
    val FailuresCounter = scopedStats.scope("settle").counter("failures")
    val FailuresScope = scopedStats.scope("settle").scope("failures")
  }
  
  def settle(traceId: String, request: com.jxjxgo.account.rpc.domain.SettleRequest): Future[com.jxjxgo.account.rpc.domain.AccountBaseResponse] = {
    __stats_settle.RequestsCounter.incr()
    val inputArgs = Settle.Args(traceId, request)
    val replyDeserializer: Array[Byte] => _root_.com.twitter.util.Try[com.jxjxgo.account.rpc.domain.AccountBaseResponse] =
      response => {
        val result = decodeResponse(response, Settle.Result)
        val exception: Throwable =
        null
  
        if (result.success.isDefined)
          _root_.com.twitter.util.Return(result.success.get)
        else if (exception != null)
          _root_.com.twitter.util.Throw(exception)
        else
          _root_.com.twitter.util.Throw(missingResult("settle"))
      }
  
    val serdeCtx = new _root_.com.twitter.finagle.thrift.DeserializeCtx[com.jxjxgo.account.rpc.domain.AccountBaseResponse](inputArgs, replyDeserializer)
    _root_.com.twitter.finagle.context.Contexts.local.let(
      _root_.com.twitter.finagle.thrift.DeserializeCtx.Key,
      serdeCtx
    ) {
      val serialized = encodeRequest("settle", inputArgs)
      this.service(serialized).flatMap { response =>
        Future.const(serdeCtx.deserialize(response))
      }.respond { response =>
        val responseClass = responseClassifier.applyOrElse(
          ctfs.ReqRep(inputArgs, response),
          ctfs.ResponseClassifier.Default)
        responseClass match {
          case ctfs.ResponseClass.Successful(_) =>
            __stats_settle.SuccessCounter.incr()
          case ctfs.ResponseClass.Failed(_) =>
            __stats_settle.FailuresCounter.incr()
            response match {
              case Throw(ex) =>
                setServiceName(ex)
                __stats_settle.FailuresScope.counter(Throwables.mkString(ex): _*).incr()
              case _ =>
            }
        }
      }
    }
  }
}
