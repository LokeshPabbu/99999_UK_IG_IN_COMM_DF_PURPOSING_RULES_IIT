/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class legacyIdFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"legacyIdFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids\",\"fields\":[{\"name\":\"LEGACY_ID_COMPANY_REGISTERED_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Company Number\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Supplied Company Number */
  @Deprecated public java.lang.CharSequence LEGACY_ID_COMPANY_REGISTERED_NUMBER;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public legacyIdFields() {}

  /**
   * All-args constructor.
   */
  public legacyIdFields(java.lang.CharSequence LEGACY_ID_COMPANY_REGISTERED_NUMBER) {
    this.LEGACY_ID_COMPANY_REGISTERED_NUMBER = LEGACY_ID_COMPANY_REGISTERED_NUMBER;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return LEGACY_ID_COMPANY_REGISTERED_NUMBER;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: LEGACY_ID_COMPANY_REGISTERED_NUMBER = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'LEGACY_ID_COMPANY_REGISTERED_NUMBER' field.
   * Supplied Company Number   */
  public java.lang.CharSequence getLEGACYIDCOMPANYREGISTEREDNUMBER() {
    return LEGACY_ID_COMPANY_REGISTERED_NUMBER;
  }

  /**
   * Sets the value of the 'LEGACY_ID_COMPANY_REGISTERED_NUMBER' field.
   * Supplied Company Number   * @param value the value to set.
   */
  public void setLEGACYIDCOMPANYREGISTEREDNUMBER(java.lang.CharSequence value) {
    this.LEGACY_ID_COMPANY_REGISTERED_NUMBER = value;
  }

  /** Creates a new legacyIdFields RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder();
  }
  
  /** Creates a new legacyIdFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder(other);
  }
  
  /** Creates a new legacyIdFields RecordBuilder by copying an existing legacyIdFields instance */
  public static com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder(other);
  }
  
  /**
   * RecordBuilder for legacyIdFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<legacyIdFields>
    implements org.apache.avro.data.RecordBuilder<legacyIdFields> {

    private java.lang.CharSequence LEGACY_ID_COMPANY_REGISTERED_NUMBER;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.LEGACY_ID_COMPANY_REGISTERED_NUMBER)) {
        this.LEGACY_ID_COMPANY_REGISTERED_NUMBER = data().deepCopy(fields()[0].schema(), other.LEGACY_ID_COMPANY_REGISTERED_NUMBER);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing legacyIdFields instance */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields other) {
            super(com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.SCHEMA$);
      if (isValidValue(fields()[0], other.LEGACY_ID_COMPANY_REGISTERED_NUMBER)) {
        this.LEGACY_ID_COMPANY_REGISTERED_NUMBER = data().deepCopy(fields()[0].schema(), other.LEGACY_ID_COMPANY_REGISTERED_NUMBER);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'LEGACY_ID_COMPANY_REGISTERED_NUMBER' field */
    public java.lang.CharSequence getLEGACYIDCOMPANYREGISTEREDNUMBER() {
      return LEGACY_ID_COMPANY_REGISTERED_NUMBER;
    }
    
    /** Sets the value of the 'LEGACY_ID_COMPANY_REGISTERED_NUMBER' field */
    public com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder setLEGACYIDCOMPANYREGISTEREDNUMBER(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.LEGACY_ID_COMPANY_REGISTERED_NUMBER = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'LEGACY_ID_COMPANY_REGISTERED_NUMBER' field has been set */
    public boolean hasLEGACYIDCOMPANYREGISTEREDNUMBER() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'LEGACY_ID_COMPANY_REGISTERED_NUMBER' field */
    public com.equifax.fabric.uk.ingestion.companyregister.standardisedfields.entity.commercial.legacyids.legacyIdFields.Builder clearLEGACYIDCOMPANYREGISTEREDNUMBER() {
      LEGACY_ID_COMPANY_REGISTERED_NUMBER = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public legacyIdFields build() {
      try {
        legacyIdFields record = new legacyIdFields();
        record.LEGACY_ID_COMPANY_REGISTERED_NUMBER = fieldSetFlags()[0] ? this.LEGACY_ID_COMPANY_REGISTERED_NUMBER : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
