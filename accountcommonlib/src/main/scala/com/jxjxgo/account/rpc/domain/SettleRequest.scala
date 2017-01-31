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


object SettleRequest extends ThriftStructCodec3[SettleRequest] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("SettleRequest")
  val GameIdField = new TField("gameId", TType.I64, 1)
  val GameIdFieldManifest = implicitly[Manifest[Long]]
  val MemberId1Field = new TField("memberId1", TType.I64, 2)
  val MemberId1FieldManifest = implicitly[Manifest[Long]]
  val Amount1Field = new TField("amount1", TType.I32, 3)
  val Amount1FieldManifest = implicitly[Manifest[Int]]
  val MemberId2Field = new TField("memberId2", TType.I64, 4)
  val MemberId2FieldManifest = implicitly[Manifest[Long]]
  val Amount2Field = new TField("amount2", TType.I32, 5)
  val Amount2FieldManifest = implicitly[Manifest[Int]]
  val MemberId3Field = new TField("memberId3", TType.I64, 6)
  val MemberId3FieldManifest = implicitly[Manifest[Long]]
  val Amount3Field = new TField("amount3", TType.I32, 7)
  val Amount3FieldManifest = implicitly[Manifest[Int]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      GameIdField,
      false,
      false,
      GameIdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      MemberId1Field,
      false,
      false,
      MemberId1FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      Amount1Field,
      false,
      false,
      Amount1FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      MemberId2Field,
      false,
      false,
      MemberId2FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      Amount2Field,
      false,
      false,
      Amount2FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      MemberId3Field,
      false,
      false,
      MemberId3FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      Amount3Field,
      false,
      false,
      Amount3FieldManifest,
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
  def validate(_item: SettleRequest): Unit = {
  }

  def withoutPassthroughFields(original: SettleRequest): SettleRequest =
    new Immutable(
      gameId =
        {
          val field = original.gameId
          field
        },
      memberId1 =
        {
          val field = original.memberId1
          field
        },
      amount1 =
        {
          val field = original.amount1
          field
        },
      memberId2 =
        {
          val field = original.memberId2
          field
        },
      amount2 =
        {
          val field = original.amount2
          field
        },
      memberId3 =
        {
          val field = original.memberId3
          field
        },
      amount3 =
        {
          val field = original.amount3
          field
        }
    )

  override def encode(_item: SettleRequest, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): SettleRequest = {

    var gameId: Long = 0L
    var memberId1: Long = 0L
    var amount1: Int = 0
    var memberId2: Long = 0L
    var amount2: Int = 0
    var memberId3: Long = 0L
    var amount3: Int = 0

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
              case TType.I64 =>
    
                gameId = readGameIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'gameId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I64 =>
    
                memberId1 = readMemberId1Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'memberId1' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 =>
    
                amount1 = readAmount1Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'amount1' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.I64 =>
    
                memberId2 = readMemberId2Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'memberId2' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I32 =>
    
                amount2 = readAmount2Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'amount2' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.I64 =>
    
                memberId3 = readMemberId3Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'memberId3' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 7 =>
            _field.`type` match {
              case TType.I32 =>
    
                amount3 = readAmount3Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'amount3' (expected=%s, actual=%s).".format(
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
      gameId,
      memberId1,
      amount1,
      memberId2,
      amount2,
      memberId3,
      amount3,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): SettleRequest =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): SettleRequest = {
    var gameId: Long = 0L
    var memberId1: Long = 0L
    var amount1: Int = 0
    var memberId2: Long = 0L
    var amount2: Int = 0
    var memberId3: Long = 0L
    var amount3: Int = 0
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
              case TType.I64 =>
                gameId = readGameIdValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'gameId' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.I64 =>
                memberId1 = readMemberId1Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'memberId1' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 =>
                amount1 = readAmount1Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'amount1' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.I64 =>
                memberId2 = readMemberId2Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'memberId2' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I32 =>
                amount2 = readAmount2Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'amount2' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.I64 =>
                memberId3 = readMemberId3Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I64
                throw new TProtocolException(
                  "Received wrong type for field 'memberId3' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 7 =>
            _field.`type` match {
              case TType.I32 =>
                amount3 = readAmount3Value(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'amount3' (expected=%s, actual=%s).".format(
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
      gameId,
      memberId1,
      amount1,
      memberId2,
      amount2,
      memberId3,
      amount3,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    gameId: Long = 0L,
    memberId1: Long = 0L,
    amount1: Int = 0,
    memberId2: Long = 0L,
    amount2: Int = 0,
    memberId3: Long = 0L,
    amount3: Int = 0
  ): SettleRequest =
    new Immutable(
      gameId,
      memberId1,
      amount1,
      memberId2,
      amount2,
      memberId3,
      amount3
    )

  def unapply(_item: SettleRequest): _root_.scala.Option[scala.Product7[Long, Long, Int, Long, Int, Long, Int]] = _root_.scala.Some(_item)


  @inline private def readGameIdValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeGameIdField(gameId_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(GameIdField)
    writeGameIdValue(gameId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeGameIdValue(gameId_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(gameId_item)
  }

  @inline private def readMemberId1Value(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeMemberId1Field(memberId1_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(MemberId1Field)
    writeMemberId1Value(memberId1_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeMemberId1Value(memberId1_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(memberId1_item)
  }

  @inline private def readAmount1Value(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeAmount1Field(amount1_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(Amount1Field)
    writeAmount1Value(amount1_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeAmount1Value(amount1_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(amount1_item)
  }

  @inline private def readMemberId2Value(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeMemberId2Field(memberId2_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(MemberId2Field)
    writeMemberId2Value(memberId2_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeMemberId2Value(memberId2_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(memberId2_item)
  }

  @inline private def readAmount2Value(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeAmount2Field(amount2_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(Amount2Field)
    writeAmount2Value(amount2_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeAmount2Value(amount2_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(amount2_item)
  }

  @inline private def readMemberId3Value(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  @inline private def writeMemberId3Field(memberId3_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(MemberId3Field)
    writeMemberId3Value(memberId3_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeMemberId3Value(memberId3_item: Long, _oprot: TProtocol): Unit = {
    _oprot.writeI64(memberId3_item)
  }

  @inline private def readAmount3Value(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeAmount3Field(amount3_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(Amount3Field)
    writeAmount3Value(amount3_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeAmount3Value(amount3_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(amount3_item)
  }


  object Immutable extends ThriftStructCodec3[SettleRequest] {
    override def encode(_item: SettleRequest, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): SettleRequest = SettleRequest.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[SettleRequest] = SettleRequest.metaData
  }

  /**
   * The default read-only implementation of SettleRequest.  You typically should not need to
   * directly reference this class; instead, use the SettleRequest.apply method to construct
   * new instances.
   */
  class Immutable(
      val gameId: Long,
      val memberId1: Long,
      val amount1: Int,
      val memberId2: Long,
      val amount2: Int,
      val memberId3: Long,
      val amount3: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends SettleRequest {
    def this(
      gameId: Long = 0L,
      memberId1: Long = 0L,
      amount1: Int = 0,
      memberId2: Long = 0L,
      amount2: Int = 0,
      memberId3: Long = 0L,
      amount3: Int = 0
    ) = this(
      gameId,
      memberId1,
      amount1,
      memberId2,
      amount2,
      memberId3,
      amount3,
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
      val gameId: Long,
      val memberId1: Long,
      val amount1: Int,
      val memberId2: Long,
      val amount2: Int,
      val memberId3: Long,
      val amount3: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends SettleRequest {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
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
   * This Proxy trait allows you to extend the SettleRequest trait with additional state or
   * behavior and implement the read-only methods from SettleRequest using an underlying
   * instance.
   */
  trait Proxy extends SettleRequest {
    protected def _underlying_SettleRequest: SettleRequest
    override def gameId: Long = _underlying_SettleRequest.gameId
    override def memberId1: Long = _underlying_SettleRequest.memberId1
    override def amount1: Int = _underlying_SettleRequest.amount1
    override def memberId2: Long = _underlying_SettleRequest.memberId2
    override def amount2: Int = _underlying_SettleRequest.amount2
    override def memberId3: Long = _underlying_SettleRequest.memberId3
    override def amount3: Int = _underlying_SettleRequest.amount3
    override def _passthroughFields = _underlying_SettleRequest._passthroughFields
  }
}

trait SettleRequest
  extends ThriftStruct
  with scala.Product7[Long, Long, Int, Long, Int, Long, Int]
  with java.io.Serializable
{
  import SettleRequest._

  def gameId: Long
  def memberId1: Long
  def amount1: Int
  def memberId2: Long
  def amount2: Int
  def memberId3: Long
  def amount3: Int

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = gameId
  def _2 = memberId1
  def _3 = amount1
  def _4 = memberId2
  def _5 = amount2
  def _6 = memberId3
  def _7 = amount3


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
              if (true) {
                writeGameIdValue(gameId, _oprot)
                _root_.scala.Some(SettleRequest.GameIdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (true) {
                writeMemberId1Value(memberId1, _oprot)
                _root_.scala.Some(SettleRequest.MemberId1Field)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (true) {
                writeAmount1Value(amount1, _oprot)
                _root_.scala.Some(SettleRequest.Amount1Field)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (true) {
                writeMemberId2Value(memberId2, _oprot)
                _root_.scala.Some(SettleRequest.MemberId2Field)
              } else {
                _root_.scala.None
              }
            case 5 =>
              if (true) {
                writeAmount2Value(amount2, _oprot)
                _root_.scala.Some(SettleRequest.Amount2Field)
              } else {
                _root_.scala.None
              }
            case 6 =>
              if (true) {
                writeMemberId3Value(memberId3, _oprot)
                _root_.scala.Some(SettleRequest.MemberId3Field)
              } else {
                _root_.scala.None
              }
            case 7 =>
              if (true) {
                writeAmount3Value(amount3, _oprot)
                _root_.scala.Some(SettleRequest.Amount3Field)
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
  def setField(_blob: TFieldBlob): SettleRequest = {
    var gameId: Long = this.gameId
    var memberId1: Long = this.memberId1
    var amount1: Int = this.amount1
    var memberId2: Long = this.memberId2
    var amount2: Int = this.amount2
    var memberId3: Long = this.memberId3
    var amount3: Int = this.amount3
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        gameId = readGameIdValue(_blob.read)
      case 2 =>
        memberId1 = readMemberId1Value(_blob.read)
      case 3 =>
        amount1 = readAmount1Value(_blob.read)
      case 4 =>
        memberId2 = readMemberId2Value(_blob.read)
      case 5 =>
        amount2 = readAmount2Value(_blob.read)
      case 6 =>
        memberId3 = readMemberId3Value(_blob.read)
      case 7 =>
        amount3 = readAmount3Value(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      gameId,
      memberId1,
      amount1,
      memberId2,
      amount2,
      memberId3,
      amount3,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): SettleRequest = {
    var gameId: Long = this.gameId
    var memberId1: Long = this.memberId1
    var amount1: Int = this.amount1
    var memberId2: Long = this.memberId2
    var amount2: Int = this.amount2
    var memberId3: Long = this.memberId3
    var amount3: Int = this.amount3

    _fieldId match {
      case 1 =>
        gameId = 0L
      case 2 =>
        memberId1 = 0L
      case 3 =>
        amount1 = 0
      case 4 =>
        memberId2 = 0L
      case 5 =>
        amount2 = 0
      case 6 =>
        memberId3 = 0L
      case 7 =>
        amount3 = 0
      case _ =>
    }
    new Immutable(
      gameId,
      memberId1,
      amount1,
      memberId2,
      amount2,
      memberId3,
      amount3,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetGameId: SettleRequest = unsetField(1)

  def unsetMemberId1: SettleRequest = unsetField(2)

  def unsetAmount1: SettleRequest = unsetField(3)

  def unsetMemberId2: SettleRequest = unsetField(4)

  def unsetAmount2: SettleRequest = unsetField(5)

  def unsetMemberId3: SettleRequest = unsetField(6)

  def unsetAmount3: SettleRequest = unsetField(7)


  override def write(_oprot: TProtocol): Unit = {
    SettleRequest.validate(this)
    _oprot.writeStructBegin(Struct)
    writeGameIdField(gameId, _oprot)
    writeMemberId1Field(memberId1, _oprot)
    writeAmount1Field(amount1, _oprot)
    writeMemberId2Field(memberId2, _oprot)
    writeAmount2Field(amount2, _oprot)
    writeMemberId3Field(memberId3, _oprot)
    writeAmount3Field(amount3, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    gameId: Long = this.gameId,
    memberId1: Long = this.memberId1,
    amount1: Int = this.amount1,
    memberId2: Long = this.memberId2,
    amount2: Int = this.amount2,
    memberId3: Long = this.memberId3,
    amount3: Int = this.amount3,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): SettleRequest =
    new Immutable(
      gameId,
      memberId1,
      amount1,
      memberId2,
      amount2,
      memberId3,
      amount3,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[SettleRequest]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[SettleRequest]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 7

  override def productElement(n: Int): Any = n match {
    case 0 => this.gameId
    case 1 => this.memberId1
    case 2 => this.amount1
    case 3 => this.memberId2
    case 4 => this.amount2
    case 5 => this.memberId3
    case 6 => this.amount3
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "SettleRequest"
}