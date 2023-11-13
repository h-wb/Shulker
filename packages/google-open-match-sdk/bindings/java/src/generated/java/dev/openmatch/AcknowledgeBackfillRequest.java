// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/frontend.proto

// Protobuf Java Version: 3.25.0
package dev.openmatch;

/**
 * <pre>
 * BETA FEATURE WARNING: This Request message is not finalized and still subject
 * to possible change or removal.
 * </pre>
 *
 * Protobuf type {@code openmatch.AcknowledgeBackfillRequest}
 */
public final class AcknowledgeBackfillRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:openmatch.AcknowledgeBackfillRequest)
    AcknowledgeBackfillRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AcknowledgeBackfillRequest.newBuilder() to construct.
  private AcknowledgeBackfillRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AcknowledgeBackfillRequest() {
    backfillId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AcknowledgeBackfillRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dev.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.openmatch.AcknowledgeBackfillRequest.class, dev.openmatch.AcknowledgeBackfillRequest.Builder.class);
  }

  private int bitField0_;
  public static final int BACKFILL_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object backfillId_ = "";
  /**
   * <pre>
   * An existing ID of Backfill to acknowledge.
   * </pre>
   *
   * <code>string backfill_id = 1 [json_name = "backfillId"];</code>
   * @return The backfillId.
   */
  @java.lang.Override
  public java.lang.String getBackfillId() {
    java.lang.Object ref = backfillId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backfillId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An existing ID of Backfill to acknowledge.
   * </pre>
   *
   * <code>string backfill_id = 1 [json_name = "backfillId"];</code>
   * @return The bytes for backfillId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBackfillIdBytes() {
    java.lang.Object ref = backfillId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      backfillId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSIGNMENT_FIELD_NUMBER = 2;
  private dev.openmatch.Assignment assignment_;
  /**
   * <pre>
   * An updated Assignment of the requested Backfill.
   * </pre>
   *
   * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
   * @return Whether the assignment field is set.
   */
  @java.lang.Override
  public boolean hasAssignment() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * An updated Assignment of the requested Backfill.
   * </pre>
   *
   * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
   * @return The assignment.
   */
  @java.lang.Override
  public dev.openmatch.Assignment getAssignment() {
    return assignment_ == null ? dev.openmatch.Assignment.getDefaultInstance() : assignment_;
  }
  /**
   * <pre>
   * An updated Assignment of the requested Backfill.
   * </pre>
   *
   * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
   */
  @java.lang.Override
  public dev.openmatch.AssignmentOrBuilder getAssignmentOrBuilder() {
    return assignment_ == null ? dev.openmatch.Assignment.getDefaultInstance() : assignment_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backfillId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, backfillId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAssignment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backfillId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, backfillId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAssignment());
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
    if (!(obj instanceof dev.openmatch.AcknowledgeBackfillRequest)) {
      return super.equals(obj);
    }
    dev.openmatch.AcknowledgeBackfillRequest other = (dev.openmatch.AcknowledgeBackfillRequest) obj;

    if (!getBackfillId()
        .equals(other.getBackfillId())) return false;
    if (hasAssignment() != other.hasAssignment()) return false;
    if (hasAssignment()) {
      if (!getAssignment()
          .equals(other.getAssignment())) return false;
    }
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
    hash = (37 * hash) + BACKFILL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBackfillId().hashCode();
    if (hasAssignment()) {
      hash = (37 * hash) + ASSIGNMENT_FIELD_NUMBER;
      hash = (53 * hash) + getAssignment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static dev.openmatch.AcknowledgeBackfillRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static dev.openmatch.AcknowledgeBackfillRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.openmatch.AcknowledgeBackfillRequest parseFrom(
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
  public static Builder newBuilder(dev.openmatch.AcknowledgeBackfillRequest prototype) {
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
   * BETA FEATURE WARNING: This Request message is not finalized and still subject
   * to possible change or removal.
   * </pre>
   *
   * Protobuf type {@code openmatch.AcknowledgeBackfillRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:openmatch.AcknowledgeBackfillRequest)
      dev.openmatch.AcknowledgeBackfillRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.openmatch.AcknowledgeBackfillRequest.class, dev.openmatch.AcknowledgeBackfillRequest.Builder.class);
    }

    // Construct using dev.openmatch.AcknowledgeBackfillRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAssignmentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      backfillId_ = "";
      assignment_ = null;
      if (assignmentBuilder_ != null) {
        assignmentBuilder_.dispose();
        assignmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.openmatch.FrontendProto.internal_static_openmatch_AcknowledgeBackfillRequest_descriptor;
    }

    @java.lang.Override
    public dev.openmatch.AcknowledgeBackfillRequest getDefaultInstanceForType() {
      return dev.openmatch.AcknowledgeBackfillRequest.getDefaultInstance();
    }

    @java.lang.Override
    public dev.openmatch.AcknowledgeBackfillRequest build() {
      dev.openmatch.AcknowledgeBackfillRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.openmatch.AcknowledgeBackfillRequest buildPartial() {
      dev.openmatch.AcknowledgeBackfillRequest result = new dev.openmatch.AcknowledgeBackfillRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(dev.openmatch.AcknowledgeBackfillRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.backfillId_ = backfillId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assignment_ = assignmentBuilder_ == null
            ? assignment_
            : assignmentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof dev.openmatch.AcknowledgeBackfillRequest) {
        return mergeFrom((dev.openmatch.AcknowledgeBackfillRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.openmatch.AcknowledgeBackfillRequest other) {
      if (other == dev.openmatch.AcknowledgeBackfillRequest.getDefaultInstance()) return this;
      if (!other.getBackfillId().isEmpty()) {
        backfillId_ = other.backfillId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAssignment()) {
        mergeAssignment(other.getAssignment());
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
              backfillId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAssignmentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object backfillId_ = "";
    /**
     * <pre>
     * An existing ID of Backfill to acknowledge.
     * </pre>
     *
     * <code>string backfill_id = 1 [json_name = "backfillId"];</code>
     * @return The backfillId.
     */
    public java.lang.String getBackfillId() {
      java.lang.Object ref = backfillId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backfillId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An existing ID of Backfill to acknowledge.
     * </pre>
     *
     * <code>string backfill_id = 1 [json_name = "backfillId"];</code>
     * @return The bytes for backfillId.
     */
    public com.google.protobuf.ByteString
        getBackfillIdBytes() {
      java.lang.Object ref = backfillId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        backfillId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An existing ID of Backfill to acknowledge.
     * </pre>
     *
     * <code>string backfill_id = 1 [json_name = "backfillId"];</code>
     * @param value The backfillId to set.
     * @return This builder for chaining.
     */
    public Builder setBackfillId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      backfillId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An existing ID of Backfill to acknowledge.
     * </pre>
     *
     * <code>string backfill_id = 1 [json_name = "backfillId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBackfillId() {
      backfillId_ = getDefaultInstance().getBackfillId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An existing ID of Backfill to acknowledge.
     * </pre>
     *
     * <code>string backfill_id = 1 [json_name = "backfillId"];</code>
     * @param value The bytes for backfillId to set.
     * @return This builder for chaining.
     */
    public Builder setBackfillIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      backfillId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private dev.openmatch.Assignment assignment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.openmatch.Assignment, dev.openmatch.Assignment.Builder, dev.openmatch.AssignmentOrBuilder> assignmentBuilder_;
    /**
     * <pre>
     * An updated Assignment of the requested Backfill.
     * </pre>
     *
     * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
     * @return Whether the assignment field is set.
     */
    public boolean hasAssignment() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * An updated Assignment of the requested Backfill.
     * </pre>
     *
     * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
     * @return The assignment.
     */
    public dev.openmatch.Assignment getAssignment() {
      if (assignmentBuilder_ == null) {
        return assignment_ == null ? dev.openmatch.Assignment.getDefaultInstance() : assignment_;
      } else {
        return assignmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * An updated Assignment of the requested Backfill.
     * </pre>
     *
     * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
     */
    public Builder setAssignment(dev.openmatch.Assignment value) {
      if (assignmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assignment_ = value;
      } else {
        assignmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An updated Assignment of the requested Backfill.
     * </pre>
     *
     * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
     */
    public Builder setAssignment(
        dev.openmatch.Assignment.Builder builderForValue) {
      if (assignmentBuilder_ == null) {
        assignment_ = builderForValue.build();
      } else {
        assignmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An updated Assignment of the requested Backfill.
     * </pre>
     *
     * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
     */
    public Builder mergeAssignment(dev.openmatch.Assignment value) {
      if (assignmentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          assignment_ != null &&
          assignment_ != dev.openmatch.Assignment.getDefaultInstance()) {
          getAssignmentBuilder().mergeFrom(value);
        } else {
          assignment_ = value;
        }
      } else {
        assignmentBuilder_.mergeFrom(value);
      }
      if (assignment_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * An updated Assignment of the requested Backfill.
     * </pre>
     *
     * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
     */
    public Builder clearAssignment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      assignment_ = null;
      if (assignmentBuilder_ != null) {
        assignmentBuilder_.dispose();
        assignmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An updated Assignment of the requested Backfill.
     * </pre>
     *
     * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
     */
    public dev.openmatch.Assignment.Builder getAssignmentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAssignmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An updated Assignment of the requested Backfill.
     * </pre>
     *
     * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
     */
    public dev.openmatch.AssignmentOrBuilder getAssignmentOrBuilder() {
      if (assignmentBuilder_ != null) {
        return assignmentBuilder_.getMessageOrBuilder();
      } else {
        return assignment_ == null ?
            dev.openmatch.Assignment.getDefaultInstance() : assignment_;
      }
    }
    /**
     * <pre>
     * An updated Assignment of the requested Backfill.
     * </pre>
     *
     * <code>.openmatch.Assignment assignment = 2 [json_name = "assignment"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.openmatch.Assignment, dev.openmatch.Assignment.Builder, dev.openmatch.AssignmentOrBuilder> 
        getAssignmentFieldBuilder() {
      if (assignmentBuilder_ == null) {
        assignmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            dev.openmatch.Assignment, dev.openmatch.Assignment.Builder, dev.openmatch.AssignmentOrBuilder>(
                getAssignment(),
                getParentForChildren(),
                isClean());
        assignment_ = null;
      }
      return assignmentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:openmatch.AcknowledgeBackfillRequest)
  }

  // @@protoc_insertion_point(class_scope:openmatch.AcknowledgeBackfillRequest)
  private static final dev.openmatch.AcknowledgeBackfillRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.openmatch.AcknowledgeBackfillRequest();
  }

  public static dev.openmatch.AcknowledgeBackfillRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcknowledgeBackfillRequest>
      PARSER = new com.google.protobuf.AbstractParser<AcknowledgeBackfillRequest>() {
    @java.lang.Override
    public AcknowledgeBackfillRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcknowledgeBackfillRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcknowledgeBackfillRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.openmatch.AcknowledgeBackfillRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

