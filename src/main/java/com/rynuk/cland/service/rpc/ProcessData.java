/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.rynuk.cland.service.rpc;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class ProcessData implements org.apache.thrift.TBase<ProcessData, ProcessData._Fields>, java.io.Serializable, Cloneable, Comparable<ProcessData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProcessData");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CRC_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("crcCode", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("length", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProcessDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProcessDataTupleSchemeFactory());
  }

  public int type; // optional
  public int crcCode; // optional
  public int length; // optional
  public long sessionId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    CRC_CODE((short)2, "crcCode"),
    LENGTH((short)3, "length"),
    SESSION_ID((short)4, "sessionId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // CRC_CODE
          return CRC_CODE;
        case 3: // LENGTH
          return LENGTH;
        case 4: // SESSION_ID
          return SESSION_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TYPE_ISSET_ID = 0;
  private static final int __CRCCODE_ISSET_ID = 1;
  private static final int __LENGTH_ISSET_ID = 2;
  private static final int __SESSIONID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.TYPE,_Fields.CRC_CODE,_Fields.LENGTH,_Fields.SESSION_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CRC_CODE, new org.apache.thrift.meta_data.FieldMetaData("crcCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LENGTH, new org.apache.thrift.meta_data.FieldMetaData("length", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProcessData.class, metaDataMap);
  }

  public ProcessData() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProcessData(ProcessData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.type = other.type;
    this.crcCode = other.crcCode;
    this.length = other.length;
    this.sessionId = other.sessionId;
  }

  public ProcessData deepCopy() {
    return new ProcessData(this);
  }

  @Override
  public void clear() {
    setTypeIsSet(false);
    this.type = 0;
    setCrcCodeIsSet(false);
    this.crcCode = 0;
    setLengthIsSet(false);
    this.length = 0;
    setSessionIdIsSet(false);
    this.sessionId = 0;
  }

  public int getType() {
    return this.type;
  }

  public ProcessData setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public int getCrcCode() {
    return this.crcCode;
  }

  public ProcessData setCrcCode(int crcCode) {
    this.crcCode = crcCode;
    setCrcCodeIsSet(true);
    return this;
  }

  public void unsetCrcCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CRCCODE_ISSET_ID);
  }

  /** Returns true if field crcCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCrcCode() {
    return EncodingUtils.testBit(__isset_bitfield, __CRCCODE_ISSET_ID);
  }

  public void setCrcCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CRCCODE_ISSET_ID, value);
  }

  public int getLength() {
    return this.length;
  }

  public ProcessData setLength(int length) {
    this.length = length;
    setLengthIsSet(true);
    return this;
  }

  public void unsetLength() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  /** Returns true if field length is set (has been assigned a value) and false otherwise */
  public boolean isSetLength() {
    return EncodingUtils.testBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  public void setLengthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LENGTH_ISSET_ID, value);
  }

  public long getSessionId() {
    return this.sessionId;
  }

  public ProcessData setSessionId(long sessionId) {
    this.sessionId = sessionId;
    setSessionIdIsSet(true);
    return this;
  }

  public void unsetSessionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return EncodingUtils.testBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  public void setSessionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SESSIONID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((Integer)value);
      }
      break;

    case CRC_CODE:
      if (value == null) {
        unsetCrcCode();
      } else {
        setCrcCode((Integer)value);
      }
      break;

    case LENGTH:
      if (value == null) {
        unsetLength();
      } else {
        setLength((Integer)value);
      }
      break;

    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return Integer.valueOf(getType());

    case CRC_CODE:
      return Integer.valueOf(getCrcCode());

    case LENGTH:
      return Integer.valueOf(getLength());

    case SESSION_ID:
      return Long.valueOf(getSessionId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case CRC_CODE:
      return isSetCrcCode();
    case LENGTH:
      return isSetLength();
    case SESSION_ID:
      return isSetSessionId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProcessData)
      return this.equals((ProcessData)that);
    return false;
  }

  public boolean equals(ProcessData that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    boolean this_present_crcCode = true && this.isSetCrcCode();
    boolean that_present_crcCode = true && that.isSetCrcCode();
    if (this_present_crcCode || that_present_crcCode) {
      if (!(this_present_crcCode && that_present_crcCode))
        return false;
      if (this.crcCode != that.crcCode)
        return false;
    }

    boolean this_present_length = true && this.isSetLength();
    boolean that_present_length = true && that.isSetLength();
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
        return false;
    }

    boolean this_present_sessionId = true && this.isSetSessionId();
    boolean that_present_sessionId = true && that.isSetSessionId();
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (this.sessionId != that.sessionId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ProcessData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCrcCode()).compareTo(other.isSetCrcCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCrcCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.crcCode, other.crcCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLength()).compareTo(other.isSetLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.length, other.length);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ProcessData(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      sb.append(this.type);
      first = false;
    }
    if (isSetCrcCode()) {
      if (!first) sb.append(", ");
      sb.append("crcCode:");
      sb.append(this.crcCode);
      first = false;
    }
    if (isSetLength()) {
      if (!first) sb.append(", ");
      sb.append("length:");
      sb.append(this.length);
      first = false;
    }
    if (isSetSessionId()) {
      if (!first) sb.append(", ");
      sb.append("sessionId:");
      sb.append(this.sessionId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProcessDataStandardSchemeFactory implements SchemeFactory {
    public ProcessDataStandardScheme getScheme() {
      return new ProcessDataStandardScheme();
    }
  }

  private static class ProcessDataStandardScheme extends StandardScheme<ProcessData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProcessData struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CRC_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.crcCode = iprot.readI32();
              struct.setCrcCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LENGTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.length = iprot.readI32();
              struct.setLengthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sessionId = iprot.readI64();
              struct.setSessionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProcessData struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetType()) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCrcCode()) {
        oprot.writeFieldBegin(CRC_CODE_FIELD_DESC);
        oprot.writeI32(struct.crcCode);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLength()) {
        oprot.writeFieldBegin(LENGTH_FIELD_DESC);
        oprot.writeI32(struct.length);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSessionId()) {
        oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
        oprot.writeI64(struct.sessionId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProcessDataTupleSchemeFactory implements SchemeFactory {
    public ProcessDataTupleScheme getScheme() {
      return new ProcessDataTupleScheme();
    }
  }

  private static class ProcessDataTupleScheme extends TupleScheme<ProcessData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProcessData struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetCrcCode()) {
        optionals.set(1);
      }
      if (struct.isSetLength()) {
        optionals.set(2);
      }
      if (struct.isSetSessionId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type);
      }
      if (struct.isSetCrcCode()) {
        oprot.writeI32(struct.crcCode);
      }
      if (struct.isSetLength()) {
        oprot.writeI32(struct.length);
      }
      if (struct.isSetSessionId()) {
        oprot.writeI64(struct.sessionId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProcessData struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.type = iprot.readI32();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.crcCode = iprot.readI32();
        struct.setCrcCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.length = iprot.readI32();
        struct.setLengthIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sessionId = iprot.readI64();
        struct.setSessionIdIsSet(true);
      }
    }
  }

}

