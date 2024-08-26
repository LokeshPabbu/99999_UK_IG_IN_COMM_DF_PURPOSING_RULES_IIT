/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RawFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RawFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields\",\"fields\":[{\"name\":\"companiesHouseOutput\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CompaniesHouseOutput\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput\",\"fields\":[{\"name\":\"corporateBody\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CorporateBody\",\"namespace\":\"com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.corporatebody\",\"fields\":[{\"name\":\"incorporationNumber\",\"type\":[\"null\",\"string\"],\"doc\":\"Company Number\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"doc\":\"Company Name\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"changeType\",\"type\":[\"null\",\"string\"],\"doc\":\"Change Type - appointment, termination ,change ,correction ,secureRemoval ,merge\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"transactionType\",\"type\":[\"null\",\"string\"],\"doc\":\"Transaction Type\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"transactionId\",\"type\":[\"null\",\"string\"],\"doc\":\"Transaction ID\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"officer\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"officercorporateBodycompaniesHouseOutput\",\"fields\":[{\"name\":\"externalNumber\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer Person number\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"dateOfBirth\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer Date of birth\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"residentialAddress\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"residentialAddressofficercorporateBodycompaniesHouseOutput\",\"fields\":[{\"name\":\"houseNameNum\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer residential address house name/number\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"street\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer residential address street\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"area\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer residential address area\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"postTown\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer residential address posttown\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"region\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer residential address region\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"country\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer residential address country\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"postCode\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer residential address postcode\",\"default\":null,\"protect\":\"true\",\"dataClassification\":\"5\"},{\"name\":\"sameAsServiceAddress\",\"type\":[\"null\",\"string\"],\"doc\":\"Officer residential address same as service address indicator\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}],\"default\":null},{\"name\":\"FILE_NAME\",\"type\":[\"null\",\"string\"],\"doc\":\"Supplied File Name\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"tapeDate\",\"type\":[\"null\",\"string\"],\"doc\":\"Date of loading the supplied file on legacy database\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"tapeReference\",\"type\":[\"null\",\"string\"],\"doc\":\"Unique number assigned by Companies House to each supplied file\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.CompaniesHouseOutput companiesHouseOutput;
  /** Supplied File Name */
  @Deprecated public java.lang.CharSequence FILE_NAME;
  /** Date of loading the supplied file on legacy database */
  @Deprecated public java.lang.CharSequence tapeDate;
  /** Unique number assigned by Companies House to each supplied file */
  @Deprecated public java.lang.CharSequence tapeReference;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public RawFields() {}

  /**
   * All-args constructor.
   */
  public RawFields(com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.CompaniesHouseOutput companiesHouseOutput, java.lang.CharSequence FILE_NAME, java.lang.CharSequence tapeDate, java.lang.CharSequence tapeReference) {
    this.companiesHouseOutput = companiesHouseOutput;
    this.FILE_NAME = FILE_NAME;
    this.tapeDate = tapeDate;
    this.tapeReference = tapeReference;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return companiesHouseOutput;
    case 1: return FILE_NAME;
    case 2: return tapeDate;
    case 3: return tapeReference;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: companiesHouseOutput = (com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.CompaniesHouseOutput)value$; break;
    case 1: FILE_NAME = (java.lang.CharSequence)value$; break;
    case 2: tapeDate = (java.lang.CharSequence)value$; break;
    case 3: tapeReference = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'companiesHouseOutput' field.
   */
  public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.CompaniesHouseOutput getCompaniesHouseOutput() {
    return companiesHouseOutput;
  }

  /**
   * Sets the value of the 'companiesHouseOutput' field.
   * @param value the value to set.
   */
  public void setCompaniesHouseOutput(com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.CompaniesHouseOutput value) {
    this.companiesHouseOutput = value;
  }

  /**
   * Gets the value of the 'FILE_NAME' field.
   * Supplied File Name   */
  public java.lang.CharSequence getFILENAME() {
    return FILE_NAME;
  }

  /**
   * Sets the value of the 'FILE_NAME' field.
   * Supplied File Name   * @param value the value to set.
   */
  public void setFILENAME(java.lang.CharSequence value) {
    this.FILE_NAME = value;
  }

  /**
   * Gets the value of the 'tapeDate' field.
   * Date of loading the supplied file on legacy database   */
  public java.lang.CharSequence getTapeDate() {
    return tapeDate;
  }

  /**
   * Sets the value of the 'tapeDate' field.
   * Date of loading the supplied file on legacy database   * @param value the value to set.
   */
  public void setTapeDate(java.lang.CharSequence value) {
    this.tapeDate = value;
  }

  /**
   * Gets the value of the 'tapeReference' field.
   * Unique number assigned by Companies House to each supplied file   */
  public java.lang.CharSequence getTapeReference() {
    return tapeReference;
  }

  /**
   * Sets the value of the 'tapeReference' field.
   * Unique number assigned by Companies House to each supplied file   * @param value the value to set.
   */
  public void setTapeReference(java.lang.CharSequence value) {
    this.tapeReference = value;
  }

  /** Creates a new RawFields RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder();
  }
  
  /** Creates a new RawFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder other) {
    return new com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder(other);
  }
  
  /** Creates a new RawFields RecordBuilder by copying an existing RawFields instance */
  public static com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields other) {
    return new com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder(other);
  }
  
  /**
   * RecordBuilder for RawFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RawFields>
    implements org.apache.avro.data.RecordBuilder<RawFields> {

    private com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.CompaniesHouseOutput companiesHouseOutput;
    private java.lang.CharSequence FILE_NAME;
    private java.lang.CharSequence tapeDate;
    private java.lang.CharSequence tapeReference;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.companiesHouseOutput)) {
        this.companiesHouseOutput = data().deepCopy(fields()[0].schema(), other.companiesHouseOutput);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.FILE_NAME)) {
        this.FILE_NAME = data().deepCopy(fields()[1].schema(), other.FILE_NAME);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tapeDate)) {
        this.tapeDate = data().deepCopy(fields()[2].schema(), other.tapeDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tapeReference)) {
        this.tapeReference = data().deepCopy(fields()[3].schema(), other.tapeReference);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing RawFields instance */
    private Builder(com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields other) {
            super(com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.SCHEMA$);
      if (isValidValue(fields()[0], other.companiesHouseOutput)) {
        this.companiesHouseOutput = data().deepCopy(fields()[0].schema(), other.companiesHouseOutput);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.FILE_NAME)) {
        this.FILE_NAME = data().deepCopy(fields()[1].schema(), other.FILE_NAME);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tapeDate)) {
        this.tapeDate = data().deepCopy(fields()[2].schema(), other.tapeDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tapeReference)) {
        this.tapeReference = data().deepCopy(fields()[3].schema(), other.tapeReference);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'companiesHouseOutput' field */
    public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.CompaniesHouseOutput getCompaniesHouseOutput() {
      return companiesHouseOutput;
    }
    
    /** Sets the value of the 'companiesHouseOutput' field */
    public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder setCompaniesHouseOutput(com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.CompaniesHouseOutput value) {
      validate(fields()[0], value);
      this.companiesHouseOutput = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'companiesHouseOutput' field has been set */
    public boolean hasCompaniesHouseOutput() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'companiesHouseOutput' field */
    public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder clearCompaniesHouseOutput() {
      companiesHouseOutput = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'FILE_NAME' field */
    public java.lang.CharSequence getFILENAME() {
      return FILE_NAME;
    }
    
    /** Sets the value of the 'FILE_NAME' field */
    public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder setFILENAME(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.FILE_NAME = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'FILE_NAME' field has been set */
    public boolean hasFILENAME() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'FILE_NAME' field */
    public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder clearFILENAME() {
      FILE_NAME = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'tapeDate' field */
    public java.lang.CharSequence getTapeDate() {
      return tapeDate;
    }
    
    /** Sets the value of the 'tapeDate' field */
    public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder setTapeDate(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.tapeDate = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'tapeDate' field has been set */
    public boolean hasTapeDate() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'tapeDate' field */
    public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder clearTapeDate() {
      tapeDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'tapeReference' field */
    public java.lang.CharSequence getTapeReference() {
      return tapeReference;
    }
    
    /** Sets the value of the 'tapeReference' field */
    public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder setTapeReference(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.tapeReference = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'tapeReference' field has been set */
    public boolean hasTapeReference() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'tapeReference' field */
    public com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.RawFields.Builder clearTapeReference() {
      tapeReference = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public RawFields build() {
      try {
        RawFields record = new RawFields();
        record.companiesHouseOutput = fieldSetFlags()[0] ? this.companiesHouseOutput : (com.equifax.fabric.uk.ingestion.officerresidentialaddr.rawfields.companieshouseoutput.CompaniesHouseOutput) defaultValue(fields()[0]);
        record.FILE_NAME = fieldSetFlags()[1] ? this.FILE_NAME : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.tapeDate = fieldSetFlags()[2] ? this.tapeDate : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.tapeReference = fieldSetFlags()[3] ? this.tapeReference : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
