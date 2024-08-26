/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.officer.standardisedfields;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class StandardisedFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StandardisedFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.standardisedfields\",\"fields\":[{\"name\":\"stdCompanyRegisterdNumber_DER\",\"type\":[\"null\",\"string\"],\"doc\":\"Standardised Company number\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"stdProcessingDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date on which data loaded on Data Fabric\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"stdFormatOfSupply\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates format of supplied file\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"stdMigrationFlag\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates whether data is from live or Historical feed, H Indicates historical and <blank> Indicates live\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"entity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"entityFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity\",\"fields\":[{\"name\":\"commercial\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"commercialFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.commercial\",\"fields\":[{\"name\":\"legacyIds\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"legacyIdFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.commercial.legacyids\",\"fields\":[{\"name\":\"LEGACY_ID_COMPANY_REGISTERED_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Company Number\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"identifiers\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"identifierFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.commercial.identifiers\",\"fields\":[{\"name\":\"NAME_BUSINESS_COMPANY_TYPE\",\"type\":[\"null\",\"string\"],\"doc\":\"Type of company - L for Limited\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_VAT\",\"type\":[\"null\",\"string\"],\"doc\":\"VAT number field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_BUSINESS_EMAIL\",\"type\":[\"null\",\"string\"],\"doc\":\"EMAIL ID field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DISSOLVED_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Dissolution Date field\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_INCORPORATION_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"Date of incorporation in CCYYMMDD format\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_UPDATE_DATE\",\"type\":[\"null\",\"string\"],\"doc\":\"This is load date and will be a system date\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"IDENTIFIER_DATA_SOURCE\",\"type\":[\"null\",\"string\"],\"doc\":\"Indicates source of data\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"website\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Supplied Websites\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"phones\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Supplied Phone number\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"names\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Standardised Company Names as per Keying & Linking inputs\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"addresses\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Standardised postcode as per Keying & Linking inputs\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"discoveryData\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"discoveryDataFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.commercial.discoverydata\",\"fields\":[{\"name\":\"DISCOVERY_CLIENT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Client Number for INSIGHT_ACCOUNT and CCDS_ACCOUNT asset\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_ACCOUNT_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Account Number for INSIGHT_ACCOUNT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_FACILITY_NUMBER\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied Facility Number for CCDS_ACCOUNT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DEFENDENT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Defendent ID for COURT_JUDGMENT\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_DRC_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"DRC_ID for NONLIMITED_REGISTER\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_URN\",\"type\":[\"null\",\"string\"],\"doc\":\"Unique reference number of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CASE_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"Case ID of COMPANY_CIFAS\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"DISCOVERY_CLN_BUSINESS_NAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Cleansed business name \",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Standardised Company number */
  @Deprecated public java.lang.CharSequence stdCompanyRegisterdNumber_DER;
  /** Date on which data loaded on Data Fabric */
  @Deprecated public java.lang.CharSequence stdProcessingDate;
  /** Indicates format of supplied file */
  @Deprecated public java.lang.CharSequence stdFormatOfSupply;
  /** Indicates whether data is from live or Historical feed, H Indicates historical and <blank> Indicates live */
  @Deprecated public java.lang.CharSequence stdMigrationFlag;
  @Deprecated public com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.entityFields entity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public StandardisedFields() {}

  /**
   * All-args constructor.
   */
  public StandardisedFields(java.lang.CharSequence stdCompanyRegisterdNumber_DER, java.lang.CharSequence stdProcessingDate, java.lang.CharSequence stdFormatOfSupply, java.lang.CharSequence stdMigrationFlag, com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.entityFields entity) {
    this.stdCompanyRegisterdNumber_DER = stdCompanyRegisterdNumber_DER;
    this.stdProcessingDate = stdProcessingDate;
    this.stdFormatOfSupply = stdFormatOfSupply;
    this.stdMigrationFlag = stdMigrationFlag;
    this.entity = entity;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return stdCompanyRegisterdNumber_DER;
    case 1: return stdProcessingDate;
    case 2: return stdFormatOfSupply;
    case 3: return stdMigrationFlag;
    case 4: return entity;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: stdCompanyRegisterdNumber_DER = (java.lang.CharSequence)value$; break;
    case 1: stdProcessingDate = (java.lang.CharSequence)value$; break;
    case 2: stdFormatOfSupply = (java.lang.CharSequence)value$; break;
    case 3: stdMigrationFlag = (java.lang.CharSequence)value$; break;
    case 4: entity = (com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.entityFields)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'stdCompanyRegisterdNumber_DER' field.
   * Standardised Company number   */
  public java.lang.CharSequence getStdCompanyRegisterdNumberDER() {
    return stdCompanyRegisterdNumber_DER;
  }

  /**
   * Sets the value of the 'stdCompanyRegisterdNumber_DER' field.
   * Standardised Company number   * @param value the value to set.
   */
  public void setStdCompanyRegisterdNumberDER(java.lang.CharSequence value) {
    this.stdCompanyRegisterdNumber_DER = value;
  }

  /**
   * Gets the value of the 'stdProcessingDate' field.
   * Date on which data loaded on Data Fabric   */
  public java.lang.CharSequence getStdProcessingDate() {
    return stdProcessingDate;
  }

  /**
   * Sets the value of the 'stdProcessingDate' field.
   * Date on which data loaded on Data Fabric   * @param value the value to set.
   */
  public void setStdProcessingDate(java.lang.CharSequence value) {
    this.stdProcessingDate = value;
  }

  /**
   * Gets the value of the 'stdFormatOfSupply' field.
   * Indicates format of supplied file   */
  public java.lang.CharSequence getStdFormatOfSupply() {
    return stdFormatOfSupply;
  }

  /**
   * Sets the value of the 'stdFormatOfSupply' field.
   * Indicates format of supplied file   * @param value the value to set.
   */
  public void setStdFormatOfSupply(java.lang.CharSequence value) {
    this.stdFormatOfSupply = value;
  }

  /**
   * Gets the value of the 'stdMigrationFlag' field.
   * Indicates whether data is from live or Historical feed, H Indicates historical and <blank> Indicates live   */
  public java.lang.CharSequence getStdMigrationFlag() {
    return stdMigrationFlag;
  }

  /**
   * Sets the value of the 'stdMigrationFlag' field.
   * Indicates whether data is from live or Historical feed, H Indicates historical and <blank> Indicates live   * @param value the value to set.
   */
  public void setStdMigrationFlag(java.lang.CharSequence value) {
    this.stdMigrationFlag = value;
  }

  /**
   * Gets the value of the 'entity' field.
   */
  public com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.entityFields getEntity() {
    return entity;
  }

  /**
   * Sets the value of the 'entity' field.
   * @param value the value to set.
   */
  public void setEntity(com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.entityFields value) {
    this.entity = value;
  }

  /** Creates a new StandardisedFields RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder();
  }
  
  /** Creates a new StandardisedFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder other) {
    return new com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder(other);
  }
  
  /** Creates a new StandardisedFields RecordBuilder by copying an existing StandardisedFields instance */
  public static com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields other) {
    return new com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder(other);
  }
  
  /**
   * RecordBuilder for StandardisedFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StandardisedFields>
    implements org.apache.avro.data.RecordBuilder<StandardisedFields> {

    private java.lang.CharSequence stdCompanyRegisterdNumber_DER;
    private java.lang.CharSequence stdProcessingDate;
    private java.lang.CharSequence stdFormatOfSupply;
    private java.lang.CharSequence stdMigrationFlag;
    private com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.entityFields entity;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.stdCompanyRegisterdNumber_DER)) {
        this.stdCompanyRegisterdNumber_DER = data().deepCopy(fields()[0].schema(), other.stdCompanyRegisterdNumber_DER);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.stdProcessingDate)) {
        this.stdProcessingDate = data().deepCopy(fields()[1].schema(), other.stdProcessingDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.stdFormatOfSupply)) {
        this.stdFormatOfSupply = data().deepCopy(fields()[2].schema(), other.stdFormatOfSupply);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.stdMigrationFlag)) {
        this.stdMigrationFlag = data().deepCopy(fields()[3].schema(), other.stdMigrationFlag);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.entity)) {
        this.entity = data().deepCopy(fields()[4].schema(), other.entity);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing StandardisedFields instance */
    private Builder(com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields other) {
            super(com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.SCHEMA$);
      if (isValidValue(fields()[0], other.stdCompanyRegisterdNumber_DER)) {
        this.stdCompanyRegisterdNumber_DER = data().deepCopy(fields()[0].schema(), other.stdCompanyRegisterdNumber_DER);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.stdProcessingDate)) {
        this.stdProcessingDate = data().deepCopy(fields()[1].schema(), other.stdProcessingDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.stdFormatOfSupply)) {
        this.stdFormatOfSupply = data().deepCopy(fields()[2].schema(), other.stdFormatOfSupply);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.stdMigrationFlag)) {
        this.stdMigrationFlag = data().deepCopy(fields()[3].schema(), other.stdMigrationFlag);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.entity)) {
        this.entity = data().deepCopy(fields()[4].schema(), other.entity);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'stdCompanyRegisterdNumber_DER' field */
    public java.lang.CharSequence getStdCompanyRegisterdNumberDER() {
      return stdCompanyRegisterdNumber_DER;
    }
    
    /** Sets the value of the 'stdCompanyRegisterdNumber_DER' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder setStdCompanyRegisterdNumberDER(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.stdCompanyRegisterdNumber_DER = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'stdCompanyRegisterdNumber_DER' field has been set */
    public boolean hasStdCompanyRegisterdNumberDER() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'stdCompanyRegisterdNumber_DER' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder clearStdCompanyRegisterdNumberDER() {
      stdCompanyRegisterdNumber_DER = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'stdProcessingDate' field */
    public java.lang.CharSequence getStdProcessingDate() {
      return stdProcessingDate;
    }
    
    /** Sets the value of the 'stdProcessingDate' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder setStdProcessingDate(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.stdProcessingDate = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'stdProcessingDate' field has been set */
    public boolean hasStdProcessingDate() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'stdProcessingDate' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder clearStdProcessingDate() {
      stdProcessingDate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'stdFormatOfSupply' field */
    public java.lang.CharSequence getStdFormatOfSupply() {
      return stdFormatOfSupply;
    }
    
    /** Sets the value of the 'stdFormatOfSupply' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder setStdFormatOfSupply(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.stdFormatOfSupply = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'stdFormatOfSupply' field has been set */
    public boolean hasStdFormatOfSupply() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'stdFormatOfSupply' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder clearStdFormatOfSupply() {
      stdFormatOfSupply = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'stdMigrationFlag' field */
    public java.lang.CharSequence getStdMigrationFlag() {
      return stdMigrationFlag;
    }
    
    /** Sets the value of the 'stdMigrationFlag' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder setStdMigrationFlag(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.stdMigrationFlag = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'stdMigrationFlag' field has been set */
    public boolean hasStdMigrationFlag() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'stdMigrationFlag' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder clearStdMigrationFlag() {
      stdMigrationFlag = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'entity' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.entityFields getEntity() {
      return entity;
    }
    
    /** Sets the value of the 'entity' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder setEntity(com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.entityFields value) {
      validate(fields()[4], value);
      this.entity = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'entity' field has been set */
    public boolean hasEntity() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'entity' field */
    public com.equifax.fabric.uk.ingestion.officer.standardisedfields.StandardisedFields.Builder clearEntity() {
      entity = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public StandardisedFields build() {
      try {
        StandardisedFields record = new StandardisedFields();
        record.stdCompanyRegisterdNumber_DER = fieldSetFlags()[0] ? this.stdCompanyRegisterdNumber_DER : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.stdProcessingDate = fieldSetFlags()[1] ? this.stdProcessingDate : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.stdFormatOfSupply = fieldSetFlags()[2] ? this.stdFormatOfSupply : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.stdMigrationFlag = fieldSetFlags()[3] ? this.stdMigrationFlag : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.entity = fieldSetFlags()[4] ? this.entity : (com.equifax.fabric.uk.ingestion.officer.standardisedfields.entity.entityFields) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
