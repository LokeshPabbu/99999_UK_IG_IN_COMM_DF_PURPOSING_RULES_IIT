/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class miscellaneousItemsFields extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"miscellaneousItemsFields\",\"namespace\":\"com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems\",\"fields\":[{\"name\":\"objects\",\"type\":[\"null\",\"string\"],\"doc\":\"Miscellaneous Items - Objects\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"sicCode\",\"type\":[\"null\",\"string\"],\"doc\":\"Miscellaneous Items - SIC Code\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"externalCompany\",\"type\":[\"null\",\"string\"],\"doc\":\"Miscellaneous Items - External Company\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"section17Exemption\",\"type\":[\"null\",\"string\"],\"doc\":\"Miscellaneous Items - Section 17 Exemption\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"section17DateOfAccounts\",\"type\":[\"null\",\"string\"],\"doc\":\"Miscellaneous Items - Section 17 Date of Accounts\",\"default\":null,\"dataClassification\":\"3\"},{\"name\":\"section17GuaranteeProvider\",\"type\":[\"null\",\"string\"],\"doc\":\"Miscellaneous Items - Section 17 Guarantee Provider\",\"default\":null,\"dataClassification\":\"3\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Miscellaneous Items - Objects */
  @Deprecated public java.lang.CharSequence objects;
  /** Miscellaneous Items - SIC Code */
  @Deprecated public java.lang.CharSequence sicCode;
  /** Miscellaneous Items - External Company */
  @Deprecated public java.lang.CharSequence externalCompany;
  /** Miscellaneous Items - Section 17 Exemption */
  @Deprecated public java.lang.CharSequence section17Exemption;
  /** Miscellaneous Items - Section 17 Date of Accounts */
  @Deprecated public java.lang.CharSequence section17DateOfAccounts;
  /** Miscellaneous Items - Section 17 Guarantee Provider */
  @Deprecated public java.lang.CharSequence section17GuaranteeProvider;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public miscellaneousItemsFields() {}

  /**
   * All-args constructor.
   */
  public miscellaneousItemsFields(java.lang.CharSequence objects, java.lang.CharSequence sicCode, java.lang.CharSequence externalCompany, java.lang.CharSequence section17Exemption, java.lang.CharSequence section17DateOfAccounts, java.lang.CharSequence section17GuaranteeProvider) {
    this.objects = objects;
    this.sicCode = sicCode;
    this.externalCompany = externalCompany;
    this.section17Exemption = section17Exemption;
    this.section17DateOfAccounts = section17DateOfAccounts;
    this.section17GuaranteeProvider = section17GuaranteeProvider;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return objects;
    case 1: return sicCode;
    case 2: return externalCompany;
    case 3: return section17Exemption;
    case 4: return section17DateOfAccounts;
    case 5: return section17GuaranteeProvider;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: objects = (java.lang.CharSequence)value$; break;
    case 1: sicCode = (java.lang.CharSequence)value$; break;
    case 2: externalCompany = (java.lang.CharSequence)value$; break;
    case 3: section17Exemption = (java.lang.CharSequence)value$; break;
    case 4: section17DateOfAccounts = (java.lang.CharSequence)value$; break;
    case 5: section17GuaranteeProvider = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'objects' field.
   * Miscellaneous Items - Objects   */
  public java.lang.CharSequence getObjects() {
    return objects;
  }

  /**
   * Sets the value of the 'objects' field.
   * Miscellaneous Items - Objects   * @param value the value to set.
   */
  public void setObjects(java.lang.CharSequence value) {
    this.objects = value;
  }

  /**
   * Gets the value of the 'sicCode' field.
   * Miscellaneous Items - SIC Code   */
  public java.lang.CharSequence getSicCode() {
    return sicCode;
  }

  /**
   * Sets the value of the 'sicCode' field.
   * Miscellaneous Items - SIC Code   * @param value the value to set.
   */
  public void setSicCode(java.lang.CharSequence value) {
    this.sicCode = value;
  }

  /**
   * Gets the value of the 'externalCompany' field.
   * Miscellaneous Items - External Company   */
  public java.lang.CharSequence getExternalCompany() {
    return externalCompany;
  }

  /**
   * Sets the value of the 'externalCompany' field.
   * Miscellaneous Items - External Company   * @param value the value to set.
   */
  public void setExternalCompany(java.lang.CharSequence value) {
    this.externalCompany = value;
  }

  /**
   * Gets the value of the 'section17Exemption' field.
   * Miscellaneous Items - Section 17 Exemption   */
  public java.lang.CharSequence getSection17Exemption() {
    return section17Exemption;
  }

  /**
   * Sets the value of the 'section17Exemption' field.
   * Miscellaneous Items - Section 17 Exemption   * @param value the value to set.
   */
  public void setSection17Exemption(java.lang.CharSequence value) {
    this.section17Exemption = value;
  }

  /**
   * Gets the value of the 'section17DateOfAccounts' field.
   * Miscellaneous Items - Section 17 Date of Accounts   */
  public java.lang.CharSequence getSection17DateOfAccounts() {
    return section17DateOfAccounts;
  }

  /**
   * Sets the value of the 'section17DateOfAccounts' field.
   * Miscellaneous Items - Section 17 Date of Accounts   * @param value the value to set.
   */
  public void setSection17DateOfAccounts(java.lang.CharSequence value) {
    this.section17DateOfAccounts = value;
  }

  /**
   * Gets the value of the 'section17GuaranteeProvider' field.
   * Miscellaneous Items - Section 17 Guarantee Provider   */
  public java.lang.CharSequence getSection17GuaranteeProvider() {
    return section17GuaranteeProvider;
  }

  /**
   * Sets the value of the 'section17GuaranteeProvider' field.
   * Miscellaneous Items - Section 17 Guarantee Provider   * @param value the value to set.
   */
  public void setSection17GuaranteeProvider(java.lang.CharSequence value) {
    this.section17GuaranteeProvider = value;
  }

  /** Creates a new miscellaneousItemsFields RecordBuilder */
  public static com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder newBuilder() {
    return new com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder();
  }
  
  /** Creates a new miscellaneousItemsFields RecordBuilder by copying an existing Builder */
  public static com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder other) {
    return new com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder(other);
  }
  
  /** Creates a new miscellaneousItemsFields RecordBuilder by copying an existing miscellaneousItemsFields instance */
  public static com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder newBuilder(com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields other) {
    return new com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder(other);
  }
  
  /**
   * RecordBuilder for miscellaneousItemsFields instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<miscellaneousItemsFields>
    implements org.apache.avro.data.RecordBuilder<miscellaneousItemsFields> {

    private java.lang.CharSequence objects;
    private java.lang.CharSequence sicCode;
    private java.lang.CharSequence externalCompany;
    private java.lang.CharSequence section17Exemption;
    private java.lang.CharSequence section17DateOfAccounts;
    private java.lang.CharSequence section17GuaranteeProvider;

    /** Creates a new Builder */
    private Builder() {
      super(com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.objects)) {
        this.objects = data().deepCopy(fields()[0].schema(), other.objects);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sicCode)) {
        this.sicCode = data().deepCopy(fields()[1].schema(), other.sicCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.externalCompany)) {
        this.externalCompany = data().deepCopy(fields()[2].schema(), other.externalCompany);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.section17Exemption)) {
        this.section17Exemption = data().deepCopy(fields()[3].schema(), other.section17Exemption);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.section17DateOfAccounts)) {
        this.section17DateOfAccounts = data().deepCopy(fields()[4].schema(), other.section17DateOfAccounts);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.section17GuaranteeProvider)) {
        this.section17GuaranteeProvider = data().deepCopy(fields()[5].schema(), other.section17GuaranteeProvider);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing miscellaneousItemsFields instance */
    private Builder(com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields other) {
            super(com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.SCHEMA$);
      if (isValidValue(fields()[0], other.objects)) {
        this.objects = data().deepCopy(fields()[0].schema(), other.objects);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sicCode)) {
        this.sicCode = data().deepCopy(fields()[1].schema(), other.sicCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.externalCompany)) {
        this.externalCompany = data().deepCopy(fields()[2].schema(), other.externalCompany);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.section17Exemption)) {
        this.section17Exemption = data().deepCopy(fields()[3].schema(), other.section17Exemption);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.section17DateOfAccounts)) {
        this.section17DateOfAccounts = data().deepCopy(fields()[4].schema(), other.section17DateOfAccounts);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.section17GuaranteeProvider)) {
        this.section17GuaranteeProvider = data().deepCopy(fields()[5].schema(), other.section17GuaranteeProvider);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'objects' field */
    public java.lang.CharSequence getObjects() {
      return objects;
    }
    
    /** Sets the value of the 'objects' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder setObjects(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.objects = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'objects' field has been set */
    public boolean hasObjects() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'objects' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder clearObjects() {
      objects = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'sicCode' field */
    public java.lang.CharSequence getSicCode() {
      return sicCode;
    }
    
    /** Sets the value of the 'sicCode' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder setSicCode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.sicCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'sicCode' field has been set */
    public boolean hasSicCode() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'sicCode' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder clearSicCode() {
      sicCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'externalCompany' field */
    public java.lang.CharSequence getExternalCompany() {
      return externalCompany;
    }
    
    /** Sets the value of the 'externalCompany' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder setExternalCompany(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.externalCompany = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'externalCompany' field has been set */
    public boolean hasExternalCompany() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'externalCompany' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder clearExternalCompany() {
      externalCompany = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'section17Exemption' field */
    public java.lang.CharSequence getSection17Exemption() {
      return section17Exemption;
    }
    
    /** Sets the value of the 'section17Exemption' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder setSection17Exemption(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.section17Exemption = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'section17Exemption' field has been set */
    public boolean hasSection17Exemption() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'section17Exemption' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder clearSection17Exemption() {
      section17Exemption = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'section17DateOfAccounts' field */
    public java.lang.CharSequence getSection17DateOfAccounts() {
      return section17DateOfAccounts;
    }
    
    /** Sets the value of the 'section17DateOfAccounts' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder setSection17DateOfAccounts(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.section17DateOfAccounts = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'section17DateOfAccounts' field has been set */
    public boolean hasSection17DateOfAccounts() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'section17DateOfAccounts' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder clearSection17DateOfAccounts() {
      section17DateOfAccounts = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'section17GuaranteeProvider' field */
    public java.lang.CharSequence getSection17GuaranteeProvider() {
      return section17GuaranteeProvider;
    }
    
    /** Sets the value of the 'section17GuaranteeProvider' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder setSection17GuaranteeProvider(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.section17GuaranteeProvider = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'section17GuaranteeProvider' field has been set */
    public boolean hasSection17GuaranteeProvider() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'section17GuaranteeProvider' field */
    public com.equifax.fabric.uk.ingestion.companyfinancialstatement.rawfields.data.miscellaneousitems.miscellaneousItemsFields.Builder clearSection17GuaranteeProvider() {
      section17GuaranteeProvider = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public miscellaneousItemsFields build() {
      try {
        miscellaneousItemsFields record = new miscellaneousItemsFields();
        record.objects = fieldSetFlags()[0] ? this.objects : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.sicCode = fieldSetFlags()[1] ? this.sicCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.externalCompany = fieldSetFlags()[2] ? this.externalCompany : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.section17Exemption = fieldSetFlags()[3] ? this.section17Exemption : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.section17DateOfAccounts = fieldSetFlags()[4] ? this.section17DateOfAccounts : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.section17GuaranteeProvider = fieldSetFlags()[5] ? this.section17GuaranteeProvider : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
