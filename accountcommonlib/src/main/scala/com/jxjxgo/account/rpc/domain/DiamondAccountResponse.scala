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


object DiamondAccountResponse extends ThriftStructCodec3[DiamondAccountResponse] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("DiamondAccountResponse")
  val CodeField = new TField("code", TType.STRING, 1)
  val CodeFieldManifest = implicitly[Manifest[String]]
  val AccountIdField = new TField("accountId", TType.I64, 2)
  val AccountIdFieldManifest = implicitly[Manifest[Long]]
  val DeviceTypeField = new TField("deviceType", TType.I32, 3)
  val DeviceTypeFieldManifest = implicitly[Manifest[Int]]
  val MemberIdField = new TField("memberId", TType.I64, 4)
  val MemberIdFieldManifest = implicitly[Manifest[Long]]
  val AmountField = new TField("amount", TType.I32, 5)
  val AmountFieldManifest = implicitly[Manifest[Int]]
  val GmtCreateField = new TField("gmtCreate", TType.I64, 6)
  val GmtCreateFieldManifest = implicitly[Manifest[Long]]
  val GmtUpdateField = new TField("gmtUpdate", TType.I64, 7)
  val GmtUpdateFieldManifest = implicitly[Manifest[Long]]

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
      AccountIdField,
      false,
      false,
      AccountIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      DeviceTypeField,
      false,
      false,
      DeviceTypeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      MemberIdField,
      false,
      false,
      MemberIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      AmountField,
      false,
      false,
      AmountFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      GmtCreateField,
      false,
      false,
      GmtCreateFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      GmtUpdateField,
      false,
      false,
      GmtUpdateFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: DiamondAccountResponse): Unit = {
  }

  def withoutPassthroughFields(original: DiamondAccountResponse): DiamondAccountResponse =
    new Immutable(
      code =
        {
          val field = original.code
          field
        },
      accountId =
        {
          val field = original.accountId
          field
        },
      deviceType =
        {
          val field = original.deviceType
          field
        },
      memberId =
        {
          val field = original.memberId
          field
        },
      amount =
        {
          val field = original.amount
          field
        },
      gmtCreate =
        {
          val field = original.gmtCreate
          field
        },
      gmtUpdate =
        {
          val field = original.gmtUpdate
          field
        }
    )

  override def encode(_item: DiamondAccountResponse, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): DiamondAccountResponse = {

    var codeOffset: Int = -1
    var accountId: Long = 0L
    var deviceType: Int = 0
    var memberId: Long = 0L
    var amount: Int = 0
    var gmtCreate: Long = 0L
    var gmtUpdate: Long = 0L

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
              case TType.I64 =>
    
                accountId = readAccountIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'accountId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 =>
    
                deviceType = readDeviceTypeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'deviceType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.I64 =>
    
                memberId = readMemberIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'memberId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I32 =>
    
                amount = readAmountValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'amount' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.I64 =>
    
                gmtCreate = readGmtCreateValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'gmtCreate' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 7 =>
            _field.`type` match {
              case TType.I64 =>
    
                gmtUpdate = readGmtUpdateValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'gmtUpdate' (expected=%s, actual=%s).".format(
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
      accountId,
      deviceType,
      memberId,
      amount,
      gmtCreate,
      gmtUpdate,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): DiamondAccountResponse =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): DiamondAccountResponse = {
    var code: String = ""
    var accountId: Long = 0L
    var deviceType: Int = 0
    var memberId: Long = 0L
    var amount: Int = 0
    var gmtCreate: Long = 0L
    var gmtUpdate: Long = 0L
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
              case TType.I64 =>
                accountId = readAccountIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'accountId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 =>
                deviceType = readDeviceTypeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'deviceType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.I64 =>
                memberId = readMemberIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'memberId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I32 =>
                amount = readAmountValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'amount' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.I64 =>
                gmtCreate = readGmtCreateValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'gmtCreate' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 7 =>
            _field.`type` match {
              case TType.I64 =>
                gmtUpdate = readGmtUpdateValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'gmtUpdate' (expected=%s, actual=%s).".format(
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
      accountId,
      deviceType,
      memberId,
      amount,
      gmtCreate,
      gmtUpdate,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    code: String = "",
    accountId: Long = 0L,
    deviceType: Int = 0,
    memberId: Long = 0L,
    amount: Int = 0,
    gmtCreate: Long = 0L,
    gmtUpdate: Long = 0L
  ): DiamondAccountResponse =
    new Immutable(
      code,
      accountId,
      deviceType,
      memberId,
      amount,
      gmtCreate,
      gmtUpdate
    )

  def unapply(_item: DiamondAccountResponse): _root_.scala.Option[scala.Product7[String, Long, Int, Long, Int, Long, Long]] = _root_.scala.Some(_item)


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

  @inline private def readAccountIdValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeAccountIdField(accountId_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(AccountIdField)
    writeAccountIdValue(accountId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeAccountIdValue(accountId_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(accountId_item)
  }

  @inline private def readDeviceTypeValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeDeviceTypeField(deviceType_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(DeviceTypeField)
    writeDeviceTypeValue(deviceType_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeDeviceTypeValue(deviceType_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(deviceType_item)
  }

  @inline private def readMemberIdValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeMemberIdField(memberId_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(MemberIdField)
    writeMemberIdValue(memberId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeMemberIdValue(memberId_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(memberId_item)
  }

  @inline private def readAmountValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeAmountField(amount_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(AmountField)
    writeAmountValue(amount_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeAmountValue(amount_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(amount_item)
  }

  @inline private def readGmtCreateValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeGmtCreateField(gmtCreate_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(GmtCreateField)
    writeGmtCreateValue(gmtCreate_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeGmtCreateValue(gmtCreate_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(gmtCreate_item)
  }

  @inline private def readGmtUpdateValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeGmtUpdateField(gmtUpdate_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(GmtUpdateField)
    writeGmtUpdateValue(gmtUpdate_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeGmtUpdateValue(gmtUpdate_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(gmtUpdate_item)
  }


  object Immutable extends ThriftStructCodec3[DiamondAccountResponse] {
    override def encode(_item: DiamondAccountResponse, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): DiamondAccountResponse = DiamondAccountResponse.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[DiamondAccountResponse] = DiamondAccountResponse.metaData
  }

  /**
   * The default read-only implementation of DiamondAccountResponse.  You typically should not need to
   * directly reference this class; instead, use the DiamondAccountResponse.apply method to construct
   * new instances.
   */
  class Immutable(
      val code: String,
      val accountId: Long,
      val deviceType: Int,
      val memberId: Long,
      val amount: Int,
      val gmtCreate: Long,
      val gmtUpdate: Long,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends DiamondAccountResponse {
    def this(
      code: String = "",
      accountId: Long = 0L,
      deviceType: Int = 0,
      memberId: Long = 0L,
      amount: Int = 0,
      gmtCreate: Long = 0L,
      gmtUpdate: Long = 0L
    ) = this(
      code,
      accountId,
      deviceType,
      memberId,
      amount,
      gmtCreate,
      gmtUpdate,
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
      val accountId: Long,
      val deviceType: Int,
      val memberId: Long,
      val amount: Int,
      val gmtCreate: Long,
      val gmtUpdate: Long,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends DiamondAccountResponse {

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
   * This Proxy trait allows you to extend the DiamondAccountResponse trait with additional state or
   * behavior and implement the read-only methods from DiamondAccountResponse using an underlying
   * instance.
   */
  trait Proxy extends DiamondAccountResponse {
    protected def _underlying_DiamondAccountResponse: DiamondAccountResponse
    override def code: String = _underlying_DiamondAccountResponse.code
    override def accountId: Long = _underlying_DiamondAccountResponse.accountId
    override def deviceType: Int = _underlying_DiamondAccountResponse.deviceType
    override def memberId: Long = _underlying_DiamondAccountResponse.memberId
    override def amount: Int = _underlying_DiamondAccountResponse.amount
    override def gmtCreate: Long = _underlying_DiamondAccountResponse.gmtCreate
    override def gmtUpdate: Long = _underlying_DiamondAccountResponse.gmtUpdate
    override def _passthroughFields = _underlying_DiamondAccountResponse._passthroughFields
  }
}

trait DiamondAccountResponse
  extends ThriftStruct
  with scala.Product7[String, Long, Int, Long, Int, Long, Long]
  with java.io.Serializable
{
  import DiamondAccountResponse._

  def code: String
  def accountId: Long
  def deviceType: Int
  def memberId: Long
  def amount: Int
  def gmtCreate: Long
  def gmtUpdate: Long

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = code
  def _2 = accountId
  def _3 = deviceType
  def _4 = memberId
  def _5 = amount
  def _6 = gmtCreate
  def _7 = gmtUpdate


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
                _root_.scala.Some(DiamondAccountResponse.CodeField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (true) {
                writeAccountIdValue(accountId, _oprot)
                _root_.scala.Some(DiamondAccountResponse.AccountIdField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (true) {
                writeDeviceTypeValue(deviceType, _oprot)
                _root_.scala.Some(DiamondAccountResponse.DeviceTypeField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (true) {
                writeMemberIdValue(memberId, _oprot)
                _root_.scala.Some(DiamondAccountResponse.MemberIdField)
              } else {
                _root_.scala.None
              }
            case 5 =>
              if (true) {
                writeAmountValue(amount, _oprot)
                _root_.scala.Some(DiamondAccountResponse.AmountField)
              } else {
                _root_.scala.None
              }
            case 6 =>
              if (true) {
                writeGmtCreateValue(gmtCreate, _oprot)
                _root_.scala.Some(DiamondAccountResponse.GmtCreateField)
              } else {
                _root_.scala.None
              }
            case 7 =>
              if (true) {
                writeGmtUpdateValue(gmtUpdate, _oprot)
                _root_.scala.Some(DiamondAccountResponse.GmtUpdateField)
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
  def setField(_blob: TFieldBlob): DiamondAccountResponse = {
    var code: String = this.code
    var accountId: Long = this.accountId
    var deviceType: Int = this.deviceType
    var memberId: Long = this.memberId
    var amount: Int = this.amount
    var gmtCreate: Long = this.gmtCreate
    var gmtUpdate: Long = this.gmtUpdate
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        code = readCodeValue(_blob.read)
      case 2 =>
        accountId = readAccountIdValue(_blob.read)
      case 3 =>
        deviceType = readDeviceTypeValue(_blob.read)
      case 4 =>
        memberId = readMemberIdValue(_blob.read)
      case 5 =>
        amount = readAmountValue(_blob.read)
      case 6 =>
        gmtCreate = readGmtCreateValue(_blob.read)
      case 7 =>
        gmtUpdate = readGmtUpdateValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      code,
      accountId,
      deviceType,
      memberId,
      amount,
      gmtCreate,
      gmtUpdate,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): DiamondAccountResponse = {
    var code: String = this.code
    var accountId: Long = this.accountId
    var deviceType: Int = this.deviceType
    var memberId: Long = this.memberId
    var amount: Int = this.amount
    var gmtCreate: Long = this.gmtCreate
    var gmtUpdate: Long = this.gmtUpdate

    _fieldId match {
      case 1 =>
        code = ""
      case 2 =>
        accountId = 0L
      case 3 =>
        deviceType = 0
      case 4 =>
        memberId = 0L
      case 5 =>
        amount = 0
      case 6 =>
        gmtCreate = 0L
      case 7 =>
        gmtUpdate = 0L
      case _ =>
    }
    new Immutable(
      code,
      accountId,
      deviceType,
      memberId,
      amount,
      gmtCreate,
      gmtUpdate,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetCode: DiamondAccountResponse = unsetField(1)

  def unsetAccountId: DiamondAccountResponse = unsetField(2)

  def unsetDeviceType: DiamondAccountResponse = unsetField(3)

  def unsetMemberId: DiamondAccountResponse = unsetField(4)

  def unsetAmount: DiamondAccountResponse = unsetField(5)

  def unsetGmtCreate: DiamondAccountResponse = unsetField(6)

  def unsetGmtUpdate: DiamondAccountResponse = unsetField(7)


  override def write(_oprot: TProtocol): Unit = {
    DiamondAccountResponse.validate(this)
    _oprot.writeStructBegin(Struct)
    if (code ne null) writeCodeField(code, _oprot)
    writeAccountIdField(accountId, _oprot)
    writeDeviceTypeField(deviceType, _oprot)
    writeMemberIdField(memberId, _oprot)
    writeAmountField(amount, _oprot)
    writeGmtCreateField(gmtCreate, _oprot)
    writeGmtUpdateField(gmtUpdate, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    code: String = this.code,
    accountId: Long = this.accountId,
    deviceType: Int = this.deviceType,
    memberId: Long = this.memberId,
    amount: Int = this.amount,
    gmtCreate: Long = this.gmtCreate,
    gmtUpdate: Long = this.gmtUpdate,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): DiamondAccountResponse =
    new Immutable(
      code,
      accountId,
      deviceType,
      memberId,
      amount,
      gmtCreate,
      gmtUpdate,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[DiamondAccountResponse]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[DiamondAccountResponse]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 7

  override def productElement(n: Int): Any = n match {
    case 0 => this.code
    case 1 => this.accountId
    case 2 => this.deviceType
    case 3 => this.memberId
    case 4 => this.amount
    case 5 => this.gmtCreate
    case 6 => this.gmtUpdate
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "DiamondAccountResponse"
}