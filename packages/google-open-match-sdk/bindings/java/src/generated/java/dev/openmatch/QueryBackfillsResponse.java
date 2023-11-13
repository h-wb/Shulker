// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/query.proto

// Protobuf Java Version: 3.25.0
package dev.openmatch;

/**
 * <pre>
 * BETA FEATURE WARNING:  This Request messages are not finalized and 
 * still subject to possible change or removal.
 * </pre>
 *
 * Protobuf type {@code openmatch.QueryBackfillsResponse}
 */
public final class QueryBackfillsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:openmatch.QueryBackfillsResponse)
    QueryBackfillsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryBackfillsResponse.newBuilder() to construct.
  private QueryBackfillsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryBackfillsResponse() {
    backfills_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryBackfillsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dev.openmatch.QueryProto.internal_static_openmatch_QueryBackfillsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.openmatch.QueryProto.internal_static_openmatch_QueryBackfillsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.openmatch.QueryBackfillsResponse.class, dev.openmatch.QueryBackfillsResponse.Builder.class);
  }

  public static final int BACKFILLS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<dev.openmatch.Backfill> backfills_;
  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  @java.lang.Override
  public java.util.List<dev.openmatch.Backfill> getBackfillsList() {
    return backfills_;
  }
  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends dev.openmatch.BackfillOrBuilder> 
      getBackfillsOrBuilderList() {
    return backfills_;
  }
  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  @java.lang.Override
  public int getBackfillsCount() {
    return backfills_.size();
  }
  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  @java.lang.Override
  public dev.openmatch.Backfill getBackfills(int index) {
    return backfills_.get(index);
  }
  /**
   * <pre>
   * Backfills that meet all the filtering criteria requested by the pool.
   * </pre>
   *
   * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
   */
  @java.lang.Override
  public dev.openmatch.BackfillOrBuilder getBackfillsOrBuilder(
      int index) {
    return backfills_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < backfills_.size(); i++) {
      output.writeMessage(1, backfills_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < backfills_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, backfills_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof dev.openmatch.QueryBackfillsResponse)) {
      return super.equals(obj);
    }
    dev.openmatch.QueryBackfillsResponse other = (dev.openmatch.QueryBackfillsResponse) obj;

    if (!getBackfillsList()
        .equals(other.getBackfillsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getBackfillsCount() > 0) {
      hash = (37 * hash) + BACKFILLS_FIELD_NUMBER;
      hash = (53 * hash) + getBackfillsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.openmatch.QueryBackfillsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.QueryBackfillsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.QueryBackfillsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.QueryBackfillsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.QueryBackfillsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.QueryBackfillsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.QueryBackfillsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.openmatch.QueryBackfillsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static dev.openmatch.QueryBackfillsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static dev.openmatch.QueryBackfillsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.openmatch.QueryBackfillsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.openmatch.QueryBackfillsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dev.openmatch.QueryBackfillsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * BETA FEATURE WARNING:  This Request messages are not finalized and 
   * still subject to possible change or removal.
   * </pre>
   *
   * Protobuf type {@code openmatch.QueryBackfillsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:openmatch.QueryBackfillsResponse)
      dev.openmatch.QueryBackfillsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.openmatch.QueryProto.internal_static_openmatch_QueryBackfillsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.openmatch.QueryProto.internal_static_openmatch_QueryBackfillsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.openmatch.QueryBackfillsResponse.class, dev.openmatch.QueryBackfillsResponse.Builder.class);
    }

    // Construct using dev.openmatch.QueryBackfillsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (backfillsBuilder_ == null) {
        backfills_ = java.util.Collections.emptyList();
      } else {
        backfills_ = null;
        backfillsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.openmatch.QueryProto.internal_static_openmatch_QueryBackfillsResponse_descriptor;
    }

    @java.lang.Override
    public dev.openmatch.QueryBackfillsResponse getDefaultInstanceForType() {
      return dev.openmatch.QueryBackfillsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public dev.openmatch.QueryBackfillsResponse build() {
      dev.openmatch.QueryBackfillsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.openmatch.QueryBackfillsResponse buildPartial() {
      dev.openmatch.QueryBackfillsResponse result = new dev.openmatch.QueryBackfillsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(dev.openmatch.QueryBackfillsResponse result) {
      if (backfillsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          backfills_ = java.util.Collections.unmodifiableList(backfills_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.backfills_ = backfills_;
      } else {
        result.backfills_ = backfillsBuilder_.build();
      }
    }

    private void buildPartial0(dev.openmatch.QueryBackfillsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dev.openmatch.QueryBackfillsResponse) {
        return mergeFrom((dev.openmatch.QueryBackfillsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.openmatch.QueryBackfillsResponse other) {
      if (other == dev.openmatch.QueryBackfillsResponse.getDefaultInstance()) return this;
      if (backfillsBuilder_ == null) {
        if (!other.backfills_.isEmpty()) {
          if (backfills_.isEmpty()) {
            backfills_ = other.backfills_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBackfillsIsMutable();
            backfills_.addAll(other.backfills_);
          }
          onChanged();
        }
      } else {
        if (!other.backfills_.isEmpty()) {
          if (backfillsBuilder_.isEmpty()) {
            backfillsBuilder_.dispose();
            backfillsBuilder_ = null;
            backfills_ = other.backfills_;
            bitField0_ = (bitField0_ & ~0x00000001);
            backfillsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBackfillsFieldBuilder() : null;
          } else {
            backfillsBuilder_.addAllMessages(other.backfills_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              dev.openmatch.Backfill m =
                  input.readMessage(
                      dev.openmatch.Backfill.parser(),
                      extensionRegistry);
              if (backfillsBuilder_ == null) {
                ensureBackfillsIsMutable();
                backfills_.add(m);
              } else {
                backfillsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<dev.openmatch.Backfill> backfills_ =
      java.util.Collections.emptyList();
    private void ensureBackfillsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        backfills_ = new java.util.ArrayList<dev.openmatch.Backfill>(backfills_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        dev.openmatch.Backfill, dev.openmatch.Backfill.Builder, dev.openmatch.BackfillOrBuilder> backfillsBuilder_;

    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public java.util.List<dev.openmatch.Backfill> getBackfillsList() {
      if (backfillsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(backfills_);
      } else {
        return backfillsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public int getBackfillsCount() {
      if (backfillsBuilder_ == null) {
        return backfills_.size();
      } else {
        return backfillsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public dev.openmatch.Backfill getBackfills(int index) {
      if (backfillsBuilder_ == null) {
        return backfills_.get(index);
      } else {
        return backfillsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public Builder setBackfills(
        int index, dev.openmatch.Backfill value) {
      if (backfillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBackfillsIsMutable();
        backfills_.set(index, value);
        onChanged();
      } else {
        backfillsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public Builder setBackfills(
        int index, dev.openmatch.Backfill.Builder builderForValue) {
      if (backfillsBuilder_ == null) {
        ensureBackfillsIsMutable();
        backfills_.set(index, builderForValue.build());
        onChanged();
      } else {
        backfillsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public Builder addBackfills(dev.openmatch.Backfill value) {
      if (backfillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBackfillsIsMutable();
        backfills_.add(value);
        onChanged();
      } else {
        backfillsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public Builder addBackfills(
        int index, dev.openmatch.Backfill value) {
      if (backfillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBackfillsIsMutable();
        backfills_.add(index, value);
        onChanged();
      } else {
        backfillsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public Builder addBackfills(
        dev.openmatch.Backfill.Builder builderForValue) {
      if (backfillsBuilder_ == null) {
        ensureBackfillsIsMutable();
        backfills_.add(builderForValue.build());
        onChanged();
      } else {
        backfillsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public Builder addBackfills(
        int index, dev.openmatch.Backfill.Builder builderForValue) {
      if (backfillsBuilder_ == null) {
        ensureBackfillsIsMutable();
        backfills_.add(index, builderForValue.build());
        onChanged();
      } else {
        backfillsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public Builder addAllBackfills(
        java.lang.Iterable<? extends dev.openmatch.Backfill> values) {
      if (backfillsBuilder_ == null) {
        ensureBackfillsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, backfills_);
        onChanged();
      } else {
        backfillsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public Builder clearBackfills() {
      if (backfillsBuilder_ == null) {
        backfills_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        backfillsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public Builder removeBackfills(int index) {
      if (backfillsBuilder_ == null) {
        ensureBackfillsIsMutable();
        backfills_.remove(index);
        onChanged();
      } else {
        backfillsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public dev.openmatch.Backfill.Builder getBackfillsBuilder(
        int index) {
      return getBackfillsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public dev.openmatch.BackfillOrBuilder getBackfillsOrBuilder(
        int index) {
      if (backfillsBuilder_ == null) {
        return backfills_.get(index);  } else {
        return backfillsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public java.util.List<? extends dev.openmatch.BackfillOrBuilder> 
         getBackfillsOrBuilderList() {
      if (backfillsBuilder_ != null) {
        return backfillsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(backfills_);
      }
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public dev.openmatch.Backfill.Builder addBackfillsBuilder() {
      return getBackfillsFieldBuilder().addBuilder(
          dev.openmatch.Backfill.getDefaultInstance());
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public dev.openmatch.Backfill.Builder addBackfillsBuilder(
        int index) {
      return getBackfillsFieldBuilder().addBuilder(
          index, dev.openmatch.Backfill.getDefaultInstance());
    }
    /**
     * <pre>
     * Backfills that meet all the filtering criteria requested by the pool.
     * </pre>
     *
     * <code>repeated .openmatch.Backfill backfills = 1 [json_name = "backfills"];</code>
     */
    public java.util.List<dev.openmatch.Backfill.Builder> 
         getBackfillsBuilderList() {
      return getBackfillsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        dev.openmatch.Backfill, dev.openmatch.Backfill.Builder, dev.openmatch.BackfillOrBuilder> 
        getBackfillsFieldBuilder() {
      if (backfillsBuilder_ == null) {
        backfillsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            dev.openmatch.Backfill, dev.openmatch.Backfill.Builder, dev.openmatch.BackfillOrBuilder>(
                backfills_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        backfills_ = null;
      }
      return backfillsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:openmatch.QueryBackfillsResponse)
  }

  // @@protoc_insertion_point(class_scope:openmatch.QueryBackfillsResponse)
  private static final dev.openmatch.QueryBackfillsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.openmatch.QueryBackfillsResponse();
  }

  public static dev.openmatch.QueryBackfillsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryBackfillsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryBackfillsResponse>() {
    @java.lang.Override
    public QueryBackfillsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<QueryBackfillsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryBackfillsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.openmatch.QueryBackfillsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

