/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Accounts extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Accounts\",\"namespace\":\"com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts\",\"fields\":[{\"name\":\"account_period_from\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AccountPeriodFrom\",\"namespace\":\"com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom\",\"fields\":[{\"name\":\"day\",\"type\":[\"null\",\"string\"],\"doc\":\"Foreign Company Account Perid from Day\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"month\",\"type\":[\"null\",\"string\"],\"doc\":\"Foreign Company Account Perid from Month\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"account_period_to\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AccountPeriodTo\",\"namespace\":\"com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto\",\"fields\":[{\"name\":\"day\",\"type\":[\"null\",\"string\"],\"doc\":\"Foreign Company Account Perid to Day\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"month\",\"type\":[\"null\",\"string\"],\"doc\":\"Foreign Company Account Perid to Month\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null},{\"name\":\"must_file_within\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"MustFileWithin\",\"namespace\":\"com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin\",\"fields\":[{\"name\":\"months\",\"type\":[\"null\",\"string\"],\"doc\":\"Foreign Company Account File Within Months\",\"default\":null,\"dataClassification\":\"3\"}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom.AccountPeriodFrom account_period_from;
  @Deprecated public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo account_period_to;
  @Deprecated public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin.MustFileWithin must_file_within;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Accounts() {}

  /**
   * All-args constructor.
   */
  public Accounts(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom.AccountPeriodFrom account_period_from, com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo account_period_to, com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin.MustFileWithin must_file_within) {
    this.account_period_from = account_period_from;
    this.account_period_to = account_period_to;
    this.must_file_within = must_file_within;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return account_period_from;
    case 1: return account_period_to;
    case 2: return must_file_within;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: account_period_from = (com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom.AccountPeriodFrom)value$; break;
    case 1: account_period_to = (com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo)value$; break;
    case 2: must_file_within = (com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin.MustFileWithin)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'account_period_from' field.
   */
  public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom.AccountPeriodFrom getAccountPeriodFrom() {
    return account_period_from;
  }

  /**
   * Sets the value of the 'account_period_from' field.
   * @param value the value to set.
   */
  public void setAccountPeriodFrom(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom.AccountPeriodFrom value) {
    this.account_period_from = value;
  }

  /**
   * Gets the value of the 'account_period_to' field.
   */
  public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo getAccountPeriodTo() {
    return account_period_to;
  }

  /**
   * Sets the value of the 'account_period_to' field.
   * @param value the value to set.
   */
  public void setAccountPeriodTo(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo value) {
    this.account_period_to = value;
  }

  /**
   * Gets the value of the 'must_file_within' field.
   */
  public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin.MustFileWithin getMustFileWithin() {
    return must_file_within;
  }

  /**
   * Sets the value of the 'must_file_within' field.
   * @param value the value to set.
   */
  public void setMustFileWithin(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin.MustFileWithin value) {
    this.must_file_within = value;
  }

  /** Creates a new Accounts RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder();
  }
  
  /** Creates a new Accounts RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder(other);
  }
  
  /** Creates a new Accounts RecordBuilder by copying an existing Accounts instance */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder(other);
  }
  
  /**
   * RecordBuilder for Accounts instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Accounts>
    implements org.apache.avro.data.RecordBuilder<Accounts> {

    private com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom.AccountPeriodFrom account_period_from;
    private com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo account_period_to;
    private com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin.MustFileWithin must_file_within;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.account_period_from)) {
        this.account_period_from = data().deepCopy(fields()[0].schema(), other.account_period_from);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.account_period_to)) {
        this.account_period_to = data().deepCopy(fields()[1].schema(), other.account_period_to);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.must_file_within)) {
        this.must_file_within = data().deepCopy(fields()[2].schema(), other.must_file_within);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Accounts instance */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts other) {
            super(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.SCHEMA$);
      if (isValidValue(fields()[0], other.account_period_from)) {
        this.account_period_from = data().deepCopy(fields()[0].schema(), other.account_period_from);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.account_period_to)) {
        this.account_period_to = data().deepCopy(fields()[1].schema(), other.account_period_to);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.must_file_within)) {
        this.must_file_within = data().deepCopy(fields()[2].schema(), other.must_file_within);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'account_period_from' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom.AccountPeriodFrom getAccountPeriodFrom() {
      return account_period_from;
    }
    
    /** Sets the value of the 'account_period_from' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder setAccountPeriodFrom(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom.AccountPeriodFrom value) {
      validate(fields()[0], value);
      this.account_period_from = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'account_period_from' field has been set */
    public boolean hasAccountPeriodFrom() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'account_period_from' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder clearAccountPeriodFrom() {
      account_period_from = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'account_period_to' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo getAccountPeriodTo() {
      return account_period_to;
    }
    
    /** Sets the value of the 'account_period_to' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder setAccountPeriodTo(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo value) {
      validate(fields()[1], value);
      this.account_period_to = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'account_period_to' field has been set */
    public boolean hasAccountPeriodTo() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'account_period_to' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder clearAccountPeriodTo() {
      account_period_to = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'must_file_within' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin.MustFileWithin getMustFileWithin() {
      return must_file_within;
    }
    
    /** Sets the value of the 'must_file_within' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder setMustFileWithin(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin.MustFileWithin value) {
      validate(fields()[2], value);
      this.must_file_within = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'must_file_within' field has been set */
    public boolean hasMustFileWithin() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'must_file_within' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.Accounts.Builder clearMustFileWithin() {
      must_file_within = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Accounts build() {
      try {
        Accounts record = new Accounts();
        record.account_period_from = fieldSetFlags()[0] ? this.account_period_from : (com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodfrom.AccountPeriodFrom) defaultValue(fields()[0]);
        record.account_period_to = fieldSetFlags()[1] ? this.account_period_to : (com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.accountperiodto.AccountPeriodTo) defaultValue(fields()[1]);
        record.must_file_within = fieldSetFlags()[2] ? this.must_file_within : (com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.foreigncompanydetails.accounts.mustfilewithin.MustFileWithin) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
