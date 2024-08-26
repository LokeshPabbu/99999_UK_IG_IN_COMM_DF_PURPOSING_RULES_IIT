/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.purposing.wizzards.header;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PurposingHeader extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PurposingHeader\",\"namespace\":\"com.equifax.fabric.uk.purposing.wizzards.header\",\"fields\":[{\"name\":\"dateReported\",\"type\":[\"null\",\"long\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"recordUuid\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"matchKey\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"additionalInfo\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Long dateReported;
  @Deprecated public java.lang.CharSequence recordUuid;
  @Deprecated public java.lang.CharSequence matchKey;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> additionalInfo;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public PurposingHeader() {}

  /**
   * All-args constructor.
   */
  public PurposingHeader(java.lang.Long dateReported, java.lang.CharSequence recordUuid, java.lang.CharSequence matchKey, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> additionalInfo) {
    this.dateReported = dateReported;
    this.recordUuid = recordUuid;
    this.matchKey = matchKey;
    this.additionalInfo = additionalInfo;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dateReported;
    case 1: return recordUuid;
    case 2: return matchKey;
    case 3: return additionalInfo;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dateReported = (java.lang.Long)value$; break;
    case 1: recordUuid = (java.lang.CharSequence)value$; break;
    case 2: matchKey = (java.lang.CharSequence)value$; break;
    case 3: additionalInfo = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'dateReported' field.
   */
  public java.lang.Long getDateReported() {
    return dateReported;
  }

  /**
   * Sets the value of the 'dateReported' field.
   * @param value the value to set.
   */
  public void setDateReported(java.lang.Long value) {
    this.dateReported = value;
  }

  /**
   * Gets the value of the 'recordUuid' field.
   */
  public java.lang.CharSequence getRecordUuid() {
    return recordUuid;
  }

  /**
   * Sets the value of the 'recordUuid' field.
   * @param value the value to set.
   */
  public void setRecordUuid(java.lang.CharSequence value) {
    this.recordUuid = value;
  }

  /**
   * Gets the value of the 'matchKey' field.
   */
  public java.lang.CharSequence getMatchKey() {
    return matchKey;
  }

  /**
   * Sets the value of the 'matchKey' field.
   * @param value the value to set.
   */
  public void setMatchKey(java.lang.CharSequence value) {
    this.matchKey = value;
  }

  /**
   * Gets the value of the 'additionalInfo' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getAdditionalInfo() {
    return additionalInfo;
  }

  /**
   * Sets the value of the 'additionalInfo' field.
   * @param value the value to set.
   */
  public void setAdditionalInfo(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.additionalInfo = value;
  }

  /** Creates a new PurposingHeader RecordBuilder */
  public static com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder newBuilder() {
    return new com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder();
  }
  
  /** Creates a new PurposingHeader RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder newBuilder(com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder other) {
    return new com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder(other);
  }
  
  /** Creates a new PurposingHeader RecordBuilder by copying an existing PurposingHeader instance */
  public static com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder newBuilder(com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader other) {
    return new com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder(other);
  }
  
  /**
   * RecordBuilder for PurposingHeader instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PurposingHeader>
    implements org.apache.avro.data.RecordBuilder<PurposingHeader> {

    private java.lang.Long dateReported;
    private java.lang.CharSequence recordUuid;
    private java.lang.CharSequence matchKey;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> additionalInfo;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dateReported)) {
        this.dateReported = data().deepCopy(fields()[0].schema(), other.dateReported);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recordUuid)) {
        this.recordUuid = data().deepCopy(fields()[1].schema(), other.recordUuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.matchKey)) {
        this.matchKey = data().deepCopy(fields()[2].schema(), other.matchKey);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.additionalInfo)) {
        this.additionalInfo = data().deepCopy(fields()[3].schema(), other.additionalInfo);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PurposingHeader instance */
    private Builder(com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader other) {
            super(com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.SCHEMA$);
      if (isValidValue(fields()[0], other.dateReported)) {
        this.dateReported = data().deepCopy(fields()[0].schema(), other.dateReported);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recordUuid)) {
        this.recordUuid = data().deepCopy(fields()[1].schema(), other.recordUuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.matchKey)) {
        this.matchKey = data().deepCopy(fields()[2].schema(), other.matchKey);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.additionalInfo)) {
        this.additionalInfo = data().deepCopy(fields()[3].schema(), other.additionalInfo);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'dateReported' field */
    public java.lang.Long getDateReported() {
      return dateReported;
    }
    
    /** Sets the value of the 'dateReported' field */
    public com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder setDateReported(java.lang.Long value) {
      validate(fields()[0], value);
      this.dateReported = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'dateReported' field has been set */
    public boolean hasDateReported() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'dateReported' field */
    public com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder clearDateReported() {
      dateReported = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'recordUuid' field */
    public java.lang.CharSequence getRecordUuid() {
      return recordUuid;
    }
    
    /** Sets the value of the 'recordUuid' field */
    public com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder setRecordUuid(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.recordUuid = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'recordUuid' field has been set */
    public boolean hasRecordUuid() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'recordUuid' field */
    public com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder clearRecordUuid() {
      recordUuid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'matchKey' field */
    public java.lang.CharSequence getMatchKey() {
      return matchKey;
    }
    
    /** Sets the value of the 'matchKey' field */
    public com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder setMatchKey(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.matchKey = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'matchKey' field has been set */
    public boolean hasMatchKey() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'matchKey' field */
    public com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder clearMatchKey() {
      matchKey = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'additionalInfo' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getAdditionalInfo() {
      return additionalInfo;
    }
    
    /** Sets the value of the 'additionalInfo' field */
    public com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder setAdditionalInfo(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.additionalInfo = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'additionalInfo' field has been set */
    public boolean hasAdditionalInfo() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'additionalInfo' field */
    public com.equifax.fabric.uk.purposing.wizzards.header.PurposingHeader.Builder clearAdditionalInfo() {
      additionalInfo = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public PurposingHeader build() {
      try {
        PurposingHeader record = new PurposingHeader();
        record.dateReported = fieldSetFlags()[0] ? this.dateReported : (java.lang.Long) defaultValue(fields()[0]);
        record.recordUuid = fieldSetFlags()[1] ? this.recordUuid : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.matchKey = fieldSetFlags()[2] ? this.matchKey : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.additionalInfo = fieldSetFlags()[3] ? this.additionalInfo : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
