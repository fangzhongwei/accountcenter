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


object DepositRequest extends ThriftStructCodec3[DepositRequest] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("DepositRequest")
  val MemberIdField = new TField("memberId", TType.I64, 1)
  val MemberIdFieldManifest = implicitly[Manifest[Long]]
  val PriceCodeField = new TField("priceCode", TType.STRING, 2)
  val PriceCodeFieldManifest = implicitly[Manifest[String]]
  val ChannelCodeField = new TField("channelCode", TType.STRING, 3)
  val ChannelCodeFieldManifest = implicitly[Manifest[String]]
  val PriceField = new TField("price", TType.STRING, 4)
  val PriceFieldManifest = implicitly[Manifest[String]]
  val DiamondAmountField = new TField("diamondAmount", TType.I32, 5)
  val DiamondAmountFieldManifest = implicitly[Manifest[Int]]
  val Ext1Field = new TField("ext1", TType.STRING, 6)
  val Ext1FieldManifest = implicitly[Manifest[String]]
  val Ext2Field = new TField("ext2", TType.STRING, 7)
  val Ext2FieldManifest = implicitly[Manifest[String]]
  val Ext3Field = new TField("ext3", TType.STRING, 8)
  val Ext3FieldManifest = implicitly[Manifest[String]]
  val Ext4Field = new TField("ext4", TType.STRING, 9)
  val Ext4FieldManifest = implicitly[Manifest[String]]
  val Ext5Field = new TField("ext5", TType.STRING, 10)
  val Ext5FieldManifest = implicitly[Manifest[String]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
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
      PriceCodeField,
      false,
      false,
      PriceCodeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      ChannelCodeField,
      false,
      false,
      ChannelCodeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      PriceField,
      false,
      false,
      PriceFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      DiamondAmountField,
      false,
      false,
      DiamondAmountFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      Ext1Field,
      false,
      false,
      Ext1FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      Ext2Field,
      false,
      false,
      Ext2FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      Ext3Field,
      false,
      false,
      Ext3FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      Ext4Field,
      false,
      false,
      Ext4FieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      Ext5Field,
      false,
      false,
      Ext5FieldManifest,
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
  def validate(_item: DepositRequest): Unit = {
  }

  def withoutPassthroughFields(original: DepositRequest): DepositRequest =
    new Immutable(
      memberId =
        {
          val field = original.memberId
          field
        },
      priceCode =
        {
          val field = original.priceCode
          field
        },
      channelCode =
        {
          val field = original.channelCode
          field
        },
      price =
        {
          val field = original.price
          field
        },
      diamondAmount =
        {
          val field = original.diamondAmount
          field
        },
      ext1 =
        {
          val field = original.ext1
          field
        },
      ext2 =
        {
          val field = original.ext2
          field
        },
      ext3 =
        {
          val field = original.ext3
          field
        },
      ext4 =
        {
          val field = original.ext4
          field
        },
      ext5 =
        {
          val field = original.ext5
          field
        }
    )

  override def encode(_item: DepositRequest, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): DepositRequest = {

    var memberId: Long = 0L
    var priceCodeOffset: Int = -1
    var channelCodeOffset: Int = -1
    var priceOffset: Int = -1
    var diamondAmount: Int = 0
    var ext1Offset: Int = -1
    var ext2Offset: Int = -1
    var ext3Offset: Int = -1
    var ext4Offset: Int = -1
    var ext5Offset: Int = -1

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
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                priceCodeOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'priceCode' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRING =>
                channelCodeOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'channelCode' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
                priceOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'price' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I32 =>
    
                diamondAmount = readDiamondAmountValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'diamondAmount' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.STRING =>
                ext1Offset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext1' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 7 =>
            _field.`type` match {
              case TType.STRING =>
                ext2Offset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext2' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 8 =>
            _field.`type` match {
              case TType.STRING =>
                ext3Offset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext3' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 9 =>
            _field.`type` match {
              case TType.STRING =>
                ext4Offset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext4' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 10 =>
            _field.`type` match {
              case TType.STRING =>
                ext5Offset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext5' (expected=%s, actual=%s).".format(
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
      memberId,
      priceCodeOffset,
      channelCodeOffset,
      priceOffset,
      diamondAmount,
      ext1Offset,
      ext2Offset,
      ext3Offset,
      ext4Offset,
      ext5Offset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): DepositRequest =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): DepositRequest = {
    var memberId: Long = 0L
    var priceCode: String = ""
    var channelCode: String = ""
    var price: String = ""
    var diamondAmount: Int = 0
    var ext1: String = ""
    var ext2: String = ""
    var ext3: String = ""
    var ext4: String = ""
    var ext5: String = ""
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
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                priceCode = readPriceCodeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'priceCode' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.STRING =>
                channelCode = readChannelCodeValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'channelCode' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRING =>
                price = readPriceValue(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'price' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I32 =>
                diamondAmount = readDiamondAmountValue(_iprot)
              case _actualType =>
                val _expectedType = TType.I32
                throw new TProtocolException(
                  "Received wrong type for field 'diamondAmount' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.STRING =>
                ext1 = readExt1Value(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext1' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 7 =>
            _field.`type` match {
              case TType.STRING =>
                ext2 = readExt2Value(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext2' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 8 =>
            _field.`type` match {
              case TType.STRING =>
                ext3 = readExt3Value(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext3' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 9 =>
            _field.`type` match {
              case TType.STRING =>
                ext4 = readExt4Value(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext4' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 10 =>
            _field.`type` match {
              case TType.STRING =>
                ext5 = readExt5Value(_iprot)
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'ext5' (expected=%s, actual=%s).".format(
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
      memberId,
      priceCode,
      channelCode,
      price,
      diamondAmount,
      ext1,
      ext2,
      ext3,
      ext4,
      ext5,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    memberId: Long = 0L,
    priceCode: String = "",
    channelCode: String = "",
    price: String = "",
    diamondAmount: Int = 0,
    ext1: String = "",
    ext2: String = "",
    ext3: String = "",
    ext4: String = "",
    ext5: String = ""
  ): DepositRequest =
    new Immutable(
      memberId,
      priceCode,
      channelCode,
      price,
      diamondAmount,
      ext1,
      ext2,
      ext3,
      ext4,
      ext5
    )

  def unapply(_item: DepositRequest): _root_.scala.Option[scala.Product10[Long, String, String, String, Int, String, String, String, String, String]] = _root_.scala.Some(_item)


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

  @inline private def readPriceCodeValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writePriceCodeField(priceCode_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(PriceCodeField)
    writePriceCodeValue(priceCode_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writePriceCodeValue(priceCode_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(priceCode_item)
  }

  @inline private def readChannelCodeValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeChannelCodeField(channelCode_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ChannelCodeField)
    writeChannelCodeValue(channelCode_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeChannelCodeValue(channelCode_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(channelCode_item)
  }

  @inline private def readPriceValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writePriceField(price_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(PriceField)
    writePriceValue(price_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writePriceValue(price_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(price_item)
  }

  @inline private def readDiamondAmountValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  @inline private def writeDiamondAmountField(diamondAmount_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(DiamondAmountField)
    writeDiamondAmountValue(diamondAmount_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeDiamondAmountValue(diamondAmount_item: Int, _oprot: TProtocol): Unit = {
    _oprot.writeI32(diamondAmount_item)
  }

  @inline private def readExt1Value(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeExt1Field(ext1_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(Ext1Field)
    writeExt1Value(ext1_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeExt1Value(ext1_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(ext1_item)
  }

  @inline private def readExt2Value(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeExt2Field(ext2_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(Ext2Field)
    writeExt2Value(ext2_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeExt2Value(ext2_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(ext2_item)
  }

  @inline private def readExt3Value(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeExt3Field(ext3_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(Ext3Field)
    writeExt3Value(ext3_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeExt3Value(ext3_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(ext3_item)
  }

  @inline private def readExt4Value(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeExt4Field(ext4_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(Ext4Field)
    writeExt4Value(ext4_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeExt4Value(ext4_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(ext4_item)
  }

  @inline private def readExt5Value(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeExt5Field(ext5_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(Ext5Field)
    writeExt5Value(ext5_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeExt5Value(ext5_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(ext5_item)
  }


  object Immutable extends ThriftStructCodec3[DepositRequest] {
    override def encode(_item: DepositRequest, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): DepositRequest = DepositRequest.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[DepositRequest] = DepositRequest.metaData
  }

  /**
   * The default read-only implementation of DepositRequest.  You typically should not need to
   * directly reference this class; instead, use the DepositRequest.apply method to construct
   * new instances.
   */
  class Immutable(
      val memberId: Long,
      val priceCode: String,
      val channelCode: String,
      val price: String,
      val diamondAmount: Int,
      val ext1: String,
      val ext2: String,
      val ext3: String,
      val ext4: String,
      val ext5: String,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends DepositRequest {
    def this(
      memberId: Long = 0L,
      priceCode: String = "",
      channelCode: String = "",
      price: String = "",
      diamondAmount: Int = 0,
      ext1: String = "",
      ext2: String = "",
      ext3: String = "",
      ext4: String = "",
      ext5: String = ""
    ) = this(
      memberId,
      priceCode,
      channelCode,
      price,
      diamondAmount,
      ext1,
      ext2,
      ext3,
      ext4,
      ext5,
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
      val memberId: Long,
      priceCodeOffset: Int,
      channelCodeOffset: Int,
      priceOffset: Int,
      val diamondAmount: Int,
      ext1Offset: Int,
      ext2Offset: Int,
      ext3Offset: Int,
      ext4Offset: Int,
      ext5Offset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends DepositRequest {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val priceCode: String =
      if (priceCodeOffset == -1)
        ""
      else {
        _proto.decodeString(_buf, priceCodeOffset)
      }
    lazy val channelCode: String =
      if (channelCodeOffset == -1)
        ""
      else {
        _proto.decodeString(_buf, channelCodeOffset)
      }
    lazy val price: String =
      if (priceOffset == -1)
        ""
      else {
        _proto.decodeString(_buf, priceOffset)
      }
    lazy val ext1: String =
      if (ext1Offset == -1)
        ""
      else {
        _proto.decodeString(_buf, ext1Offset)
      }
    lazy val ext2: String =
      if (ext2Offset == -1)
        ""
      else {
        _proto.decodeString(_buf, ext2Offset)
      }
    lazy val ext3: String =
      if (ext3Offset == -1)
        ""
      else {
        _proto.decodeString(_buf, ext3Offset)
      }
    lazy val ext4: String =
      if (ext4Offset == -1)
        ""
      else {
        _proto.decodeString(_buf, ext4Offset)
      }
    lazy val ext5: String =
      if (ext5Offset == -1)
        ""
      else {
        _proto.decodeString(_buf, ext5Offset)
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
   * This Proxy trait allows you to extend the DepositRequest trait with additional state or
   * behavior and implement the read-only methods from DepositRequest using an underlying
   * instance.
   */
  trait Proxy extends DepositRequest {
    protected def _underlying_DepositRequest: DepositRequest
    override def memberId: Long = _underlying_DepositRequest.memberId
    override def priceCode: String = _underlying_DepositRequest.priceCode
    override def channelCode: String = _underlying_DepositRequest.channelCode
    override def price: String = _underlying_DepositRequest.price
    override def diamondAmount: Int = _underlying_DepositRequest.diamondAmount
    override def ext1: String = _underlying_DepositRequest.ext1
    override def ext2: String = _underlying_DepositRequest.ext2
    override def ext3: String = _underlying_DepositRequest.ext3
    override def ext4: String = _underlying_DepositRequest.ext4
    override def ext5: String = _underlying_DepositRequest.ext5
    override def _passthroughFields = _underlying_DepositRequest._passthroughFields
  }
}

trait DepositRequest
  extends ThriftStruct
  with scala.Product10[Long, String, String, String, Int, String, String, String, String, String]
  with java.io.Serializable
{
  import DepositRequest._

  def memberId: Long
  def priceCode: String
  def channelCode: String
  def price: String
  def diamondAmount: Int
  def ext1: String
  def ext2: String
  def ext3: String
  def ext4: String
  def ext5: String

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = memberId
  def _2 = priceCode
  def _3 = channelCode
  def _4 = price
  def _5 = diamondAmount
  def _6 = ext1
  def _7 = ext2
  def _8 = ext3
  def _9 = ext4
  def _10 = ext5


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
                writeMemberIdValue(memberId, _oprot)
                _root_.scala.Some(DepositRequest.MemberIdField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (priceCode ne null) {
                writePriceCodeValue(priceCode, _oprot)
                _root_.scala.Some(DepositRequest.PriceCodeField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (channelCode ne null) {
                writeChannelCodeValue(channelCode, _oprot)
                _root_.scala.Some(DepositRequest.ChannelCodeField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (price ne null) {
                writePriceValue(price, _oprot)
                _root_.scala.Some(DepositRequest.PriceField)
              } else {
                _root_.scala.None
              }
            case 5 =>
              if (true) {
                writeDiamondAmountValue(diamondAmount, _oprot)
                _root_.scala.Some(DepositRequest.DiamondAmountField)
              } else {
                _root_.scala.None
              }
            case 6 =>
              if (ext1 ne null) {
                writeExt1Value(ext1, _oprot)
                _root_.scala.Some(DepositRequest.Ext1Field)
              } else {
                _root_.scala.None
              }
            case 7 =>
              if (ext2 ne null) {
                writeExt2Value(ext2, _oprot)
                _root_.scala.Some(DepositRequest.Ext2Field)
              } else {
                _root_.scala.None
              }
            case 8 =>
              if (ext3 ne null) {
                writeExt3Value(ext3, _oprot)
                _root_.scala.Some(DepositRequest.Ext3Field)
              } else {
                _root_.scala.None
              }
            case 9 =>
              if (ext4 ne null) {
                writeExt4Value(ext4, _oprot)
                _root_.scala.Some(DepositRequest.Ext4Field)
              } else {
                _root_.scala.None
              }
            case 10 =>
              if (ext5 ne null) {
                writeExt5Value(ext5, _oprot)
                _root_.scala.Some(DepositRequest.Ext5Field)
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
  def setField(_blob: TFieldBlob): DepositRequest = {
    var memberId: Long = this.memberId
    var priceCode: String = this.priceCode
    var channelCode: String = this.channelCode
    var price: String = this.price
    var diamondAmount: Int = this.diamondAmount
    var ext1: String = this.ext1
    var ext2: String = this.ext2
    var ext3: String = this.ext3
    var ext4: String = this.ext4
    var ext5: String = this.ext5
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        memberId = readMemberIdValue(_blob.read)
      case 2 =>
        priceCode = readPriceCodeValue(_blob.read)
      case 3 =>
        channelCode = readChannelCodeValue(_blob.read)
      case 4 =>
        price = readPriceValue(_blob.read)
      case 5 =>
        diamondAmount = readDiamondAmountValue(_blob.read)
      case 6 =>
        ext1 = readExt1Value(_blob.read)
      case 7 =>
        ext2 = readExt2Value(_blob.read)
      case 8 =>
        ext3 = readExt3Value(_blob.read)
      case 9 =>
        ext4 = readExt4Value(_blob.read)
      case 10 =>
        ext5 = readExt5Value(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      memberId,
      priceCode,
      channelCode,
      price,
      diamondAmount,
      ext1,
      ext2,
      ext3,
      ext4,
      ext5,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): DepositRequest = {
    var memberId: Long = this.memberId
    var priceCode: String = this.priceCode
    var channelCode: String = this.channelCode
    var price: String = this.price
    var diamondAmount: Int = this.diamondAmount
    var ext1: String = this.ext1
    var ext2: String = this.ext2
    var ext3: String = this.ext3
    var ext4: String = this.ext4
    var ext5: String = this.ext5

    _fieldId match {
      case 1 =>
        memberId = 0L
      case 2 =>
        priceCode = ""
      case 3 =>
        channelCode = ""
      case 4 =>
        price = ""
      case 5 =>
        diamondAmount = 0
      case 6 =>
        ext1 = ""
      case 7 =>
        ext2 = ""
      case 8 =>
        ext3 = ""
      case 9 =>
        ext4 = ""
      case 10 =>
        ext5 = ""
      case _ =>
    }
    new Immutable(
      memberId,
      priceCode,
      channelCode,
      price,
      diamondAmount,
      ext1,
      ext2,
      ext3,
      ext4,
      ext5,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetMemberId: DepositRequest = unsetField(1)

  def unsetPriceCode: DepositRequest = unsetField(2)

  def unsetChannelCode: DepositRequest = unsetField(3)

  def unsetPrice: DepositRequest = unsetField(4)

  def unsetDiamondAmount: DepositRequest = unsetField(5)

  def unsetExt1: DepositRequest = unsetField(6)

  def unsetExt2: DepositRequest = unsetField(7)

  def unsetExt3: DepositRequest = unsetField(8)

  def unsetExt4: DepositRequest = unsetField(9)

  def unsetExt5: DepositRequest = unsetField(10)


  override def write(_oprot: TProtocol): Unit = {
    DepositRequest.validate(this)
    _oprot.writeStructBegin(Struct)
    writeMemberIdField(memberId, _oprot)
    if (priceCode ne null) writePriceCodeField(priceCode, _oprot)
    if (channelCode ne null) writeChannelCodeField(channelCode, _oprot)
    if (price ne null) writePriceField(price, _oprot)
    writeDiamondAmountField(diamondAmount, _oprot)
    if (ext1 ne null) writeExt1Field(ext1, _oprot)
    if (ext2 ne null) writeExt2Field(ext2, _oprot)
    if (ext3 ne null) writeExt3Field(ext3, _oprot)
    if (ext4 ne null) writeExt4Field(ext4, _oprot)
    if (ext5 ne null) writeExt5Field(ext5, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    memberId: Long = this.memberId,
    priceCode: String = this.priceCode,
    channelCode: String = this.channelCode,
    price: String = this.price,
    diamondAmount: Int = this.diamondAmount,
    ext1: String = this.ext1,
    ext2: String = this.ext2,
    ext3: String = this.ext3,
    ext4: String = this.ext4,
    ext5: String = this.ext5,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): DepositRequest =
    new Immutable(
      memberId,
      priceCode,
      channelCode,
      price,
      diamondAmount,
      ext1,
      ext2,
      ext3,
      ext4,
      ext5,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[DepositRequest]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[DepositRequest]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 10

  override def productElement(n: Int): Any = n match {
    case 0 => this.memberId
    case 1 => this.priceCode
    case 2 => this.channelCode
    case 3 => this.price
    case 4 => this.diamondAmount
    case 5 => this.ext1
    case 6 => this.ext2
    case 7 => this.ext3
    case 8 => this.ext4
    case 9 => this.ext5
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "DepositRequest"
}