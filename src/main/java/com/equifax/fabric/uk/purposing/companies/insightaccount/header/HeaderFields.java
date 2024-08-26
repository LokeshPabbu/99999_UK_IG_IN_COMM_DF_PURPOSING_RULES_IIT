/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.purposing.companies.insightaccount.header;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HeaderFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HeaderFields\",\"namespace\":\"com.equifax.fabric.uk.purposing.companies.insightaccount.header\",\"fields\":[{\"name\":\"H_DATE_IN_HEADER\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"H_SUPPLIED_SOURCE_CODE\",\"type\":[\"null\",\"string\"],\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence H_DATE_IN_HEADER;
  @Deprecated public java.lang.CharSequence H_SUPPLIED_SOURCE_CODE;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public HeaderFields() {}

  /**
   * All-args constructor.
   */
  public HeaderFields(java.lang.CharSequence H_DATE_IN_HEADER, java.lang.CharSequence H_SUPPLIED_SOURCE_CODE) {
    this.H_DATE_IN_HEADER = H_DATE_IN_HEADER;
    this.H_SUPPLIED_SOURCE_CODE = H_SUPPLIED_SOURCE_CODE;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return H_DATE_IN_HEADER;
    case 1: return H_SUPPLIED_SOURCE_CODE;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: H_DATE_IN_HEADER = (java.lang.CharSequence)value$; break;
    case 1: H_SUPPLIED_SOURCE_CODE = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'H_DATE_IN_HEADER' field.
   */
  public java.lang.CharSequence getHDATEINHEADER() {
    return H_DATE_IN_HEADER;
  }

  /**
   * Sets the value of the 'H_DATE_IN_HEADER' field.
   * @param value the value to set.
   */
  public void setHDATEINHEADER(java.lang.CharSequence value) {
    this.H_DATE_IN_HEADER = value;
  }

  /**
   * Gets the value of the 'H_SUPPLIED_SOURCE_CODE' field.
   */
  public java.lang.CharSequence getHSUPPLIEDSOURCECODE() {
    return H_SUPPLIED_SOURCE_CODE;
  }

  /**
   * Sets the value of the 'H_SUPPLIED_SOURCE_CODE' field.
   * @param value the value to set.
   */
  public void setHSUPPLIEDSOURCECODE(java.lang.CharSequence value) {
    this.H_SUPPLIED_SOURCE_CODE = value;
  }

  /** Creates a new HeaderFields RecordBuilder */
  public static com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder();
  }
  
  /** Creates a new HeaderFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder newBuilder(com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder other) {
    return new com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder(other);
  }
  
  /** Creates a new HeaderFields RecordBuilder by copying an existing HeaderFields instance */
  public static com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder newBuilder(com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields other) {
    return new com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder(other);
  }
  
  /**
   * RecordBuilder for HeaderFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HeaderFields>
    implements org.apache.avro.data.RecordBuilder<HeaderFields> {

    private java.lang.CharSequence H_DATE_IN_HEADER;
    private java.lang.CharSequence H_SUPPLIED_SOURCE_CODE;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.H_DATE_IN_HEADER)) {
        this.H_DATE_IN_HEADER = data().deepCopy(fields()[0].schema(), other.H_DATE_IN_HEADER);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.H_SUPPLIED_SOURCE_CODE)) {
        this.H_SUPPLIED_SOURCE_CODE = data().deepCopy(fields()[1].schema(), other.H_SUPPLIED_SOURCE_CODE);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HeaderFields instance */
    private Builder(com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields other) {
            super(com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.SCHEMA$);
      if (isValidValue(fields()[0], other.H_DATE_IN_HEADER)) {
        this.H_DATE_IN_HEADER = data().deepCopy(fields()[0].schema(), other.H_DATE_IN_HEADER);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.H_SUPPLIED_SOURCE_CODE)) {
        this.H_SUPPLIED_SOURCE_CODE = data().deepCopy(fields()[1].schema(), other.H_SUPPLIED_SOURCE_CODE);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'H_DATE_IN_HEADER' field */
    public java.lang.CharSequence getHDATEINHEADER() {
      return H_DATE_IN_HEADER;
    }
    
    /** Sets the value of the 'H_DATE_IN_HEADER' field */
    public com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder setHDATEINHEADER(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.H_DATE_IN_HEADER = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'H_DATE_IN_HEADER' field has been set */
    public boolean hasHDATEINHEADER() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'H_DATE_IN_HEADER' field */
    public com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder clearHDATEINHEADER() {
      H_DATE_IN_HEADER = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'H_SUPPLIED_SOURCE_CODE' field */
    public java.lang.CharSequence getHSUPPLIEDSOURCECODE() {
      return H_SUPPLIED_SOURCE_CODE;
    }
    
    /** Sets the value of the 'H_SUPPLIED_SOURCE_CODE' field */
    public com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder setHSUPPLIEDSOURCECODE(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.H_SUPPLIED_SOURCE_CODE = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'H_SUPPLIED_SOURCE_CODE' field has been set */
    public boolean hasHSUPPLIEDSOURCECODE() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'H_SUPPLIED_SOURCE_CODE' field */
    public com.equifax.fabric.uk.purposing.companies.insightaccount.header.HeaderFields.Builder clearHSUPPLIEDSOURCECODE() {
      H_SUPPLIED_SOURCE_CODE = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public HeaderFields build() {
      try {
        HeaderFields record = new HeaderFields();
        record.H_DATE_IN_HEADER = fieldSetFlags()[0] ? this.H_DATE_IN_HEADER : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.H_SUPPLIED_SOURCE_CODE = fieldSetFlags()[1] ? this.H_SUPPLIED_SOURCE_CODE : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
