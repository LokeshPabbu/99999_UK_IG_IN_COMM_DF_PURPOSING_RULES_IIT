/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ignite.config;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

import java.io.Serializable;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ProtectionInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord, Serializable {
  private static final long serialVersionUID = 4623015505443012399L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProtectionInfo\",\"namespace\":\"com.ignite.config\",\"fields\":[{\"name\":\"unprotected\",\"type\":\"boolean\"},{\"name\":\"protectionTime\",\"type\":\"long\"},{\"name\":\"keyGenTime\",\"type\":\"long\"},{\"name\":\"keyId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"keyBytes\",\"type\":[\"null\",\"bytes\"],\"default\":null},{\"name\":\"keystoreId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"keyIndex\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"encryptionMeta\",\"type\":[\"null\",\"bytes\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ProtectionInfo> ENCODER =
      new BinaryMessageEncoder<ProtectionInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ProtectionInfo> DECODER =
      new BinaryMessageDecoder<ProtectionInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ProtectionInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ProtectionInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ProtectionInfo>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ProtectionInfo to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ProtectionInfo from a ByteBuffer. */
  public static ProtectionInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private boolean unprotected;
   private long protectionTime;
   private long keyGenTime;
   private CharSequence keyId;
   private java.nio.ByteBuffer keyBytes;
   private CharSequence keystoreId;
   private Integer keyIndex;
   private java.nio.ByteBuffer encryptionMeta;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProtectionInfo() {}

  /**
   * All-args constructor.
   * @param unprotected The new value for unprotected
   * @param protectionTime The new value for protectionTime
   * @param keyGenTime The new value for keyGenTime
   * @param keyId The new value for keyId
   * @param keyBytes The new value for keyBytes
   * @param keystoreId The new value for keystoreId
   * @param keyIndex The new value for keyIndex
   * @param encryptionMeta The new value for encryptionMeta
   */
  public ProtectionInfo(Boolean unprotected, Long protectionTime, Long keyGenTime, CharSequence keyId, java.nio.ByteBuffer keyBytes, CharSequence keystoreId, Integer keyIndex, java.nio.ByteBuffer encryptionMeta) {
    this.unprotected = unprotected;
    this.protectionTime = protectionTime;
    this.keyGenTime = keyGenTime;
    this.keyId = keyId;
    this.keyBytes = keyBytes;
    this.keystoreId = keystoreId;
    this.keyIndex = keyIndex;
    this.encryptionMeta = encryptionMeta;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return unprotected;
    case 1: return protectionTime;
    case 2: return keyGenTime;
    case 3: return keyId;
    case 4: return keyBytes;
    case 5: return keystoreId;
    case 6: return keyIndex;
    case 7: return encryptionMeta;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: unprotected = (Boolean)value$; break;
    case 1: protectionTime = (Long)value$; break;
    case 2: keyGenTime = (Long)value$; break;
    case 3: keyId = (CharSequence)value$; break;
    case 4: keyBytes = (java.nio.ByteBuffer)value$; break;
    case 5: keystoreId = (CharSequence)value$; break;
    case 6: keyIndex = (Integer)value$; break;
    case 7: encryptionMeta = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'unprotected' field.
   * @return The value of the 'unprotected' field.
   */
  public Boolean getUnprotected() {
    return unprotected;
  }

  /**
   * Sets the value of the 'unprotected' field.
   * @param value the value to set.
   */
  public void setUnprotected(Boolean value) {
    this.unprotected = value;
  }

  /**
   * Gets the value of the 'protectionTime' field.
   * @return The value of the 'protectionTime' field.
   */
  public Long getProtectionTime() {
    return protectionTime;
  }

  /**
   * Sets the value of the 'protectionTime' field.
   * @param value the value to set.
   */
  public void setProtectionTime(Long value) {
    this.protectionTime = value;
  }

  /**
   * Gets the value of the 'keyGenTime' field.
   * @return The value of the 'keyGenTime' field.
   */
  public Long getKeyGenTime() {
    return keyGenTime;
  }

  /**
   * Sets the value of the 'keyGenTime' field.
   * @param value the value to set.
   */
  public void setKeyGenTime(Long value) {
    this.keyGenTime = value;
  }

  /**
   * Gets the value of the 'keyId' field.
   * @return The value of the 'keyId' field.
   */
  public CharSequence getKeyId() {
    return keyId;
  }

  /**
   * Sets the value of the 'keyId' field.
   * @param value the value to set.
   */
  public void setKeyId(CharSequence value) {
    this.keyId = value;
  }

  /**
   * Gets the value of the 'keyBytes' field.
   * @return The value of the 'keyBytes' field.
   */
  public java.nio.ByteBuffer getKeyBytes() {
    return keyBytes;
  }

  /**
   * Sets the value of the 'keyBytes' field.
   * @param value the value to set.
   */
  public void setKeyBytes(java.nio.ByteBuffer value) {
    this.keyBytes = value;
  }

  /**
   * Gets the value of the 'keystoreId' field.
   * @return The value of the 'keystoreId' field.
   */
  public CharSequence getKeystoreId() {
    return keystoreId;
  }

  /**
   * Sets the value of the 'keystoreId' field.
   * @param value the value to set.
   */
  public void setKeystoreId(CharSequence value) {
    this.keystoreId = value;
  }

  /**
   * Gets the value of the 'keyIndex' field.
   * @return The value of the 'keyIndex' field.
   */
  public Integer getKeyIndex() {
    return keyIndex;
  }

  /**
   * Sets the value of the 'keyIndex' field.
   * @param value the value to set.
   */
  public void setKeyIndex(Integer value) {
    this.keyIndex = value;
  }

  /**
   * Gets the value of the 'encryptionMeta' field.
   * @return The value of the 'encryptionMeta' field.
   */
  public java.nio.ByteBuffer getEncryptionMeta() {
    return encryptionMeta;
  }

  /**
   * Sets the value of the 'encryptionMeta' field.
   * @param value the value to set.
   */
  public void setEncryptionMeta(java.nio.ByteBuffer value) {
    this.encryptionMeta = value;
  }

  /**
   * Creates a new ProtectionInfo RecordBuilder.
   * @return A new ProtectionInfo RecordBuilder
   */
  public static com.ignite.config.ProtectionInfo.Builder newBuilder() {
    return new com.ignite.config.ProtectionInfo.Builder();
  }

  /**
   * Creates a new ProtectionInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProtectionInfo RecordBuilder
   */
  public static com.ignite.config.ProtectionInfo.Builder newBuilder(com.ignite.config.ProtectionInfo.Builder other) {
    return new com.ignite.config.ProtectionInfo.Builder(other);
  }

  /**
   * Creates a new ProtectionInfo RecordBuilder by copying an existing ProtectionInfo instance.
   * @param other The existing instance to copy.
   * @return A new ProtectionInfo RecordBuilder
   */
  public static com.ignite.config.ProtectionInfo.Builder newBuilder(com.ignite.config.ProtectionInfo other) {
    return new com.ignite.config.ProtectionInfo.Builder(other);
  }

  /**
   * RecordBuilder for ProtectionInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProtectionInfo>
    implements org.apache.avro.data.RecordBuilder<ProtectionInfo> {

    private boolean unprotected;
    private long protectionTime;
    private long keyGenTime;
    private CharSequence keyId;
    private java.nio.ByteBuffer keyBytes;
    private CharSequence keystoreId;
    private Integer keyIndex;
    private java.nio.ByteBuffer encryptionMeta;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.ignite.config.ProtectionInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.unprotected)) {
        this.unprotected = data().deepCopy(fields()[0].schema(), other.unprotected);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.protectionTime)) {
        this.protectionTime = data().deepCopy(fields()[1].schema(), other.protectionTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.keyGenTime)) {
        this.keyGenTime = data().deepCopy(fields()[2].schema(), other.keyGenTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.keyId)) {
        this.keyId = data().deepCopy(fields()[3].schema(), other.keyId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.keyBytes)) {
        this.keyBytes = data().deepCopy(fields()[4].schema(), other.keyBytes);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.keystoreId)) {
        this.keystoreId = data().deepCopy(fields()[5].schema(), other.keystoreId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.keyIndex)) {
        this.keyIndex = data().deepCopy(fields()[6].schema(), other.keyIndex);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.encryptionMeta)) {
        this.encryptionMeta = data().deepCopy(fields()[7].schema(), other.encryptionMeta);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ProtectionInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.ignite.config.ProtectionInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.unprotected)) {
        this.unprotected = data().deepCopy(fields()[0].schema(), other.unprotected);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.protectionTime)) {
        this.protectionTime = data().deepCopy(fields()[1].schema(), other.protectionTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.keyGenTime)) {
        this.keyGenTime = data().deepCopy(fields()[2].schema(), other.keyGenTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.keyId)) {
        this.keyId = data().deepCopy(fields()[3].schema(), other.keyId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.keyBytes)) {
        this.keyBytes = data().deepCopy(fields()[4].schema(), other.keyBytes);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.keystoreId)) {
        this.keystoreId = data().deepCopy(fields()[5].schema(), other.keystoreId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.keyIndex)) {
        this.keyIndex = data().deepCopy(fields()[6].schema(), other.keyIndex);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.encryptionMeta)) {
        this.encryptionMeta = data().deepCopy(fields()[7].schema(), other.encryptionMeta);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'unprotected' field.
      * @return The value.
      */
    public Boolean getUnprotected() {
      return unprotected;
    }

    /**
      * Sets the value of the 'unprotected' field.
      * @param value The value of 'unprotected'.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder setUnprotected(boolean value) {
      validate(fields()[0], value);
      this.unprotected = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'unprotected' field has been set.
      * @return True if the 'unprotected' field has been set, false otherwise.
      */
    public boolean hasUnprotected() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'unprotected' field.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder clearUnprotected() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'protectionTime' field.
      * @return The value.
      */
    public Long getProtectionTime() {
      return protectionTime;
    }

    /**
      * Sets the value of the 'protectionTime' field.
      * @param value The value of 'protectionTime'.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder setProtectionTime(long value) {
      validate(fields()[1], value);
      this.protectionTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'protectionTime' field has been set.
      * @return True if the 'protectionTime' field has been set, false otherwise.
      */
    public boolean hasProtectionTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'protectionTime' field.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder clearProtectionTime() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'keyGenTime' field.
      * @return The value.
      */
    public Long getKeyGenTime() {
      return keyGenTime;
    }

    /**
      * Sets the value of the 'keyGenTime' field.
      * @param value The value of 'keyGenTime'.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder setKeyGenTime(long value) {
      validate(fields()[2], value);
      this.keyGenTime = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'keyGenTime' field has been set.
      * @return True if the 'keyGenTime' field has been set, false otherwise.
      */
    public boolean hasKeyGenTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'keyGenTime' field.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder clearKeyGenTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'keyId' field.
      * @return The value.
      */
    public CharSequence getKeyId() {
      return keyId;
    }

    /**
      * Sets the value of the 'keyId' field.
      * @param value The value of 'keyId'.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder setKeyId(CharSequence value) {
      validate(fields()[3], value);
      this.keyId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'keyId' field has been set.
      * @return True if the 'keyId' field has been set, false otherwise.
      */
    public boolean hasKeyId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'keyId' field.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder clearKeyId() {
      keyId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'keyBytes' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getKeyBytes() {
      return keyBytes;
    }

    /**
      * Sets the value of the 'keyBytes' field.
      * @param value The value of 'keyBytes'.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder setKeyBytes(java.nio.ByteBuffer value) {
      validate(fields()[4], value);
      this.keyBytes = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'keyBytes' field has been set.
      * @return True if the 'keyBytes' field has been set, false otherwise.
      */
    public boolean hasKeyBytes() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'keyBytes' field.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder clearKeyBytes() {
      keyBytes = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'keystoreId' field.
      * @return The value.
      */
    public CharSequence getKeystoreId() {
      return keystoreId;
    }

    /**
      * Sets the value of the 'keystoreId' field.
      * @param value The value of 'keystoreId'.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder setKeystoreId(CharSequence value) {
      validate(fields()[5], value);
      this.keystoreId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'keystoreId' field has been set.
      * @return True if the 'keystoreId' field has been set, false otherwise.
      */
    public boolean hasKeystoreId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'keystoreId' field.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder clearKeystoreId() {
      keystoreId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'keyIndex' field.
      * @return The value.
      */
    public Integer getKeyIndex() {
      return keyIndex;
    }

    /**
      * Sets the value of the 'keyIndex' field.
      * @param value The value of 'keyIndex'.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder setKeyIndex(Integer value) {
      validate(fields()[6], value);
      this.keyIndex = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'keyIndex' field has been set.
      * @return True if the 'keyIndex' field has been set, false otherwise.
      */
    public boolean hasKeyIndex() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'keyIndex' field.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder clearKeyIndex() {
      keyIndex = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'encryptionMeta' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getEncryptionMeta() {
      return encryptionMeta;
    }

    /**
      * Sets the value of the 'encryptionMeta' field.
      * @param value The value of 'encryptionMeta'.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder setEncryptionMeta(java.nio.ByteBuffer value) {
      validate(fields()[7], value);
      this.encryptionMeta = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'encryptionMeta' field has been set.
      * @return True if the 'encryptionMeta' field has been set, false otherwise.
      */
    public boolean hasEncryptionMeta() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'encryptionMeta' field.
      * @return This builder.
      */
    public com.ignite.config.ProtectionInfo.Builder clearEncryptionMeta() {
      encryptionMeta = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProtectionInfo build() {
      try {
        ProtectionInfo record = new ProtectionInfo();
        record.unprotected = fieldSetFlags()[0] ? this.unprotected : (Boolean) defaultValue(fields()[0]);
        record.protectionTime = fieldSetFlags()[1] ? this.protectionTime : (Long) defaultValue(fields()[1]);
        record.keyGenTime = fieldSetFlags()[2] ? this.keyGenTime : (Long) defaultValue(fields()[2]);
        record.keyId = fieldSetFlags()[3] ? this.keyId : (CharSequence) defaultValue(fields()[3]);
        record.keyBytes = fieldSetFlags()[4] ? this.keyBytes : (java.nio.ByteBuffer) defaultValue(fields()[4]);
        record.keystoreId = fieldSetFlags()[5] ? this.keystoreId : (CharSequence) defaultValue(fields()[5]);
        record.keyIndex = fieldSetFlags()[6] ? this.keyIndex : (Integer) defaultValue(fields()[6]);
        record.encryptionMeta = fieldSetFlags()[7] ? this.encryptionMeta : (java.nio.ByteBuffer) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ProtectionInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<ProtectionInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ProtectionInfo>
    READER$ = (org.apache.avro.io.DatumReader<ProtectionInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
