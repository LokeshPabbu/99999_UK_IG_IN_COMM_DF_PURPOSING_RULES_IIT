/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BranchCompanyDetails extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BranchCompanyDetails\",\"namespace\":\"com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails\",\"fields\":[{\"name\":\"business_activity\",\"type\":[\"null\",\"string\"],\"doc\":\"Type of business undertaken by the UK establishment.\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"parent_company_name\",\"type\":[\"null\",\"string\"],\"doc\":\"Parent Company Name\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"parent_company_number\",\"type\":[\"null\",\"string\"],\"doc\":\"Parent Company Number\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Type of business undertaken by the UK establishment. */
  @Deprecated public java.lang.CharSequence business_activity;
  /** Parent Company Name */
  @Deprecated public java.lang.CharSequence parent_company_name;
  /** Parent Company Number */
  @Deprecated public java.lang.CharSequence parent_company_number;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public BranchCompanyDetails() {}

  /**
   * All-args constructor.
   */
  public BranchCompanyDetails(java.lang.CharSequence business_activity, java.lang.CharSequence parent_company_name, java.lang.CharSequence parent_company_number) {
    this.business_activity = business_activity;
    this.parent_company_name = parent_company_name;
    this.parent_company_number = parent_company_number;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return business_activity;
    case 1: return parent_company_name;
    case 2: return parent_company_number;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: business_activity = (java.lang.CharSequence)value$; break;
    case 1: parent_company_name = (java.lang.CharSequence)value$; break;
    case 2: parent_company_number = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'business_activity' field.
   * Type of business undertaken by the UK establishment.   */
  public java.lang.CharSequence getBusinessActivity() {
    return business_activity;
  }

  /**
   * Sets the value of the 'business_activity' field.
   * Type of business undertaken by the UK establishment.   * @param value the value to set.
   */
  public void setBusinessActivity(java.lang.CharSequence value) {
    this.business_activity = value;
  }

  /**
   * Gets the value of the 'parent_company_name' field.
   * Parent Company Name   */
  public java.lang.CharSequence getParentCompanyName() {
    return parent_company_name;
  }

  /**
   * Sets the value of the 'parent_company_name' field.
   * Parent Company Name   * @param value the value to set.
   */
  public void setParentCompanyName(java.lang.CharSequence value) {
    this.parent_company_name = value;
  }

  /**
   * Gets the value of the 'parent_company_number' field.
   * Parent Company Number   */
  public java.lang.CharSequence getParentCompanyNumber() {
    return parent_company_number;
  }

  /**
   * Sets the value of the 'parent_company_number' field.
   * Parent Company Number   * @param value the value to set.
   */
  public void setParentCompanyNumber(java.lang.CharSequence value) {
    this.parent_company_number = value;
  }

  /** Creates a new BranchCompanyDetails RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder();
  }
  
  /** Creates a new BranchCompanyDetails RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder(other);
  }
  
  /** Creates a new BranchCompanyDetails RecordBuilder by copying an existing BranchCompanyDetails instance */
  public static com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails other) {
    return new com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder(other);
  }
  
  /**
   * RecordBuilder for BranchCompanyDetails instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BranchCompanyDetails>
    implements org.apache.avro.data.RecordBuilder<BranchCompanyDetails> {

    private java.lang.CharSequence business_activity;
    private java.lang.CharSequence parent_company_name;
    private java.lang.CharSequence parent_company_number;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.business_activity)) {
        this.business_activity = data().deepCopy(fields()[0].schema(), other.business_activity);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.parent_company_name)) {
        this.parent_company_name = data().deepCopy(fields()[1].schema(), other.parent_company_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parent_company_number)) {
        this.parent_company_number = data().deepCopy(fields()[2].schema(), other.parent_company_number);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing BranchCompanyDetails instance */
    private Builder(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails other) {
            super(com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.SCHEMA$);
      if (isValidValue(fields()[0], other.business_activity)) {
        this.business_activity = data().deepCopy(fields()[0].schema(), other.business_activity);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.parent_company_name)) {
        this.parent_company_name = data().deepCopy(fields()[1].schema(), other.parent_company_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parent_company_number)) {
        this.parent_company_number = data().deepCopy(fields()[2].schema(), other.parent_company_number);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'business_activity' field */
    public java.lang.CharSequence getBusinessActivity() {
      return business_activity;
    }
    
    /** Sets the value of the 'business_activity' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder setBusinessActivity(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.business_activity = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'business_activity' field has been set */
    public boolean hasBusinessActivity() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'business_activity' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder clearBusinessActivity() {
      business_activity = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'parent_company_name' field */
    public java.lang.CharSequence getParentCompanyName() {
      return parent_company_name;
    }
    
    /** Sets the value of the 'parent_company_name' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder setParentCompanyName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.parent_company_name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'parent_company_name' field has been set */
    public boolean hasParentCompanyName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'parent_company_name' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder clearParentCompanyName() {
      parent_company_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'parent_company_number' field */
    public java.lang.CharSequence getParentCompanyNumber() {
      return parent_company_number;
    }
    
    /** Sets the value of the 'parent_company_number' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder setParentCompanyNumber(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.parent_company_number = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'parent_company_number' field has been set */
    public boolean hasParentCompanyNumber() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'parent_company_number' field */
    public com.equifax.fabric.uk.ingestion.companyregister.rawfields.data.branchcompanydetails.BranchCompanyDetails.Builder clearParentCompanyNumber() {
      parent_company_number = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public BranchCompanyDetails build() {
      try {
        BranchCompanyDetails record = new BranchCompanyDetails();
        record.business_activity = fieldSetFlags()[0] ? this.business_activity : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.parent_company_name = fieldSetFlags()[1] ? this.parent_company_name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.parent_company_number = fieldSetFlags()[2] ? this.parent_company_number : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
