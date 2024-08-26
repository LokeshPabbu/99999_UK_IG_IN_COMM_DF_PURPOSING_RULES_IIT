/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AccountPeriodTo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AccountPeriodTo\",\"namespace\":\"com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto\",\"fields\":[{\"name\":\"day\",\"type\":[\"null\",\"string\"],\"doc\":\"Foreign Company Account Perid to Day\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"month\",\"type\":[\"null\",\"string\"],\"doc\":\"Foreign Company Account Perid to Month\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Foreign Company Account Perid to Day */
  @Deprecated public java.lang.CharSequence day;
  /** Foreign Company Account Perid to Month */
  @Deprecated public java.lang.CharSequence month;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AccountPeriodTo() {}

  /**
   * All-args constructor.
   */
  public AccountPeriodTo(java.lang.CharSequence day, java.lang.CharSequence month) {
    this.day = day;
    this.month = month;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return day;
    case 1: return month;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: day = (java.lang.CharSequence)value$; break;
    case 1: month = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'day' field.
   * Foreign Company Account Perid to Day   */
  public java.lang.CharSequence getDay() {
    return day;
  }

  /**
   * Sets the value of the 'day' field.
   * Foreign Company Account Perid to Day   * @param value the value to set.
   */
  public void setDay(java.lang.CharSequence value) {
    this.day = value;
  }

  /**
   * Gets the value of the 'month' field.
   * Foreign Company Account Perid to Month   */
  public java.lang.CharSequence getMonth() {
    return month;
  }

  /**
   * Sets the value of the 'month' field.
   * Foreign Company Account Perid to Month   * @param value the value to set.
   */
  public void setMonth(java.lang.CharSequence value) {
    this.month = value;
  }

  /** Creates a new AccountPeriodTo RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder();
  }
  
  /** Creates a new AccountPeriodTo RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder(other);
  }
  
  /** Creates a new AccountPeriodTo RecordBuilder by copying an existing AccountPeriodTo instance */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder(other);
  }
  
  /**
   * RecordBuilder for AccountPeriodTo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AccountPeriodTo>
    implements org.apache.avro.data.RecordBuilder<AccountPeriodTo> {

    private java.lang.CharSequence day;
    private java.lang.CharSequence month;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.day)) {
        this.day = data().deepCopy(fields()[0].schema(), other.day);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.month)) {
        this.month = data().deepCopy(fields()[1].schema(), other.month);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AccountPeriodTo instance */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo other) {
            super(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.SCHEMA$);
      if (isValidValue(fields()[0], other.day)) {
        this.day = data().deepCopy(fields()[0].schema(), other.day);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.month)) {
        this.month = data().deepCopy(fields()[1].schema(), other.month);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'day' field */
    public java.lang.CharSequence getDay() {
      return day;
    }
    
    /** Sets the value of the 'day' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder setDay(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.day = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'day' field has been set */
    public boolean hasDay() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'day' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder clearDay() {
      day = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'month' field */
    public java.lang.CharSequence getMonth() {
      return month;
    }
    
    /** Sets the value of the 'month' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder setMonth(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.month = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'month' field has been set */
    public boolean hasMonth() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'month' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo.Builder clearMonth() {
      month = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public AccountPeriodTo build() {
      try {
        AccountPeriodTo record = new AccountPeriodTo();
        record.day = fieldSetFlags()[0] ? this.day : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.month = fieldSetFlags()[1] ? this.month : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
