/**
 * Generated by Scrooge
 *   version: 4.5.0
 *   rev: 014664de600267b36809bbc85225e26aec286216
 *   built at: 20160203-205352
 */
package com.jxjxgo.account.rpc.domain

import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob, ThriftException, ThriftStruct, ThriftStructCodec3, ThriftStructFieldInfo,
  ThriftStructMetaData, ThriftUtil}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object PriceListResponse extends ThriftStructCodec3[PriceListResponse] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("PriceListResponse")
  val CodeField = new TField("code", TType.STRING, 1)
  val CodeFieldManifest = implicitly[Manifest[String]]
  val PriceListField = new TField("priceList", TType.LIST, 2)
  val PriceListFieldManifest = implicitly[Manifest[Seq[com.jxjxgo.account.rpc.domain.DiamondPrice]]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      CodeField,
      false,
      false,
      CodeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      PriceListField,
      false,
      false,
      PriceListFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[com.jxjxgo.account.rpc.domain.DiamondPrice]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: PriceListResponse): Unit = {
  }

  def withoutPassthroughFields(original: PriceListResponse): PriceListResponse =
    new Immutable(
      code =
        {
          val field = original.code
          field
        },
      priceList =
        {
          val field = original.priceList
          field.map { field =>
            com.jxjxgo.account.rpc.domain.DiamondPrice.withoutPassthroughFields(field)
          }
        }
    )

  override def encode(_item: PriceListResponse, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): PriceListResponse = {

    var codeOffset: Int = -1
    var priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice] = Seq[com.jxjxgo.account.rpc.domain.DiamondPrice]()

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                codeOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'code' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
    
                priceList = readPriceListValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'priceList' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      codeOffset,
      priceList,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): PriceListResponse =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): PriceListResponse = {
    var code: String = ""
    var priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice] = Seq[com.jxjxgo.account.rpc.domain.DiamondPrice]()
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                code = readCodeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'code' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.LIST =>
                priceList = readPriceListValue(_iprot)
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'priceList' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      code,
      priceList,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    code: String = "",
    priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice] = Seq[com.jxjxgo.account.rpc.domain.DiamondPrice]()
  ): PriceListResponse =
    new Immutable(
      code,
      priceList
    )

  def unapply(_item: PriceListResponse): _root_.scala.Option[scala.Product2[String, Seq[com.jxjxgo.account.rpc.domain.DiamondPrice]]] = _root_.scala.Some(_item)


  @inline private def readCodeValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeCodeField(code_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(CodeField)
    writeCodeValue(code_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeCodeValue(code_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(code_item)
  }

  @inline private def readPriceListValue(_iprot: TProtocol): Seq[com.jxjxgo.account.rpc.domain.DiamondPrice] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[com.jxjxgo.account.rpc.domain.DiamondPrice](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          com.jxjxgo.account.rpc.domain.DiamondPrice.decode(_iprot)
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writePriceListField(priceList_item: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(PriceListField)
    writePriceListValue(priceList_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writePriceListValue(priceList_item: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRUCT, priceList_item.size))
    priceList_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = priceList_item.size
        while (_i < _size) {
          val priceList_item_element = priceList_item(_i)
          priceList_item_element.write(_oprot)
          _i += 1
        }
      case _ =>
        priceList_item.foreach { priceList_item_element =>
          priceList_item_element.write(_oprot)
        }
    }
    _oprot.writeListEnd()
  }


  object Immutable extends ThriftStructCodec3[PriceListResponse] {
    override def encode(_item: PriceListResponse, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): PriceListResponse = PriceListResponse.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[PriceListResponse] = PriceListResponse.metaData
  }

  /**
   * The default read-only implementation of PriceListResponse.  You typically should not need to
   * directly reference this class; instead, use the PriceListResponse.apply method to construct
   * new instances.
   */
  class Immutable(
      val code: String,
      val priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends PriceListResponse {
    def this(
      code: String = "",
      priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice] = Seq[com.jxjxgo.account.rpc.domain.DiamondPrice]()
    ) = this(
      code,
      priceList,
      Map.empty
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      codeOffset: Int,
      val priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends PriceListResponse {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val code: String =
      if (codeOffset == -1)
        ""
      else {
        _proto.decodeString(_buf, codeOffset)
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the PriceListResponse trait with additional state or
   * behavior and implement the read-only methods from PriceListResponse using an underlying
   * instance.
   */
  trait Proxy extends PriceListResponse {
    protected def _underlying_PriceListResponse: PriceListResponse
    override def code: String = _underlying_PriceListResponse.code
    override def priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice] = _underlying_PriceListResponse.priceList
    override def _passthroughFields = _underlying_PriceListResponse._passthroughFields
  }
}

trait PriceListResponse
  extends ThriftStruct
  with scala.Product2[String, Seq[com.jxjxgo.account.rpc.domain.DiamondPrice]]
  with java.io.Serializable
{
  import PriceListResponse._

  def code: String
  def priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = code
  def _2 = priceList


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (code ne null) {
                writeCodeValue(code, _oprot)
                _root_.scala.Some(PriceListResponse.CodeField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (priceList ne null) {
                writePriceListValue(priceList, _oprot)
                _root_.scala.Some(PriceListResponse.PriceListField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
            _root_.scala.Some(TFieldBlob(_field, _data))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): PriceListResponse = {
    var code: String = this.code
    var priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice] = this.priceList
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        code = readCodeValue(_blob.read)
      case 2 =>
        priceList = readPriceListValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      code,
      priceList,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): PriceListResponse = {
    var code: String = this.code
    var priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice] = this.priceList

    _fieldId match {
      case 1 =>
        code = ""
      case 2 =>
        priceList = Seq[com.jxjxgo.account.rpc.domain.DiamondPrice]()
      case _ =>
    }
    new Immutable(
      code,
      priceList,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetCode: PriceListResponse = unsetField(1)

  def unsetPriceList: PriceListResponse = unsetField(2)


  override def write(_oprot: TProtocol): Unit = {
    PriceListResponse.validate(this)
    _oprot.writeStructBegin(Struct)
    if (code ne null) writeCodeField(code, _oprot)
    if (priceList ne null) writePriceListField(priceList, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    code: String = this.code,
    priceList: Seq[com.jxjxgo.account.rpc.domain.DiamondPrice] = this.priceList,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): PriceListResponse =
    new Immutable(
      code,
      priceList,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[PriceListResponse]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[PriceListResponse]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => this.code
    case 1 => this.priceList
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "PriceListResponse"
}