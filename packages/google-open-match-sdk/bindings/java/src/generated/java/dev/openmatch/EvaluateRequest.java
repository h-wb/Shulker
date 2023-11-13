// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/evaluator.proto

// Protobuf Java Version: 3.25.0
package dev.openmatch;

/**
 * Protobuf type {@code openmatch.EvaluateRequest}
 */
public final class EvaluateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:openmatch.EvaluateRequest)
    EvaluateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EvaluateRequest.newBuilder() to construct.
  private EvaluateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EvaluateRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EvaluateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dev.openmatch.EvaluatorProto.internal_static_openmatch_EvaluateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.openmatch.EvaluatorProto.internal_static_openmatch_EvaluateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.openmatch.EvaluateRequest.class, dev.openmatch.EvaluateRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MATCH_FIELD_NUMBER = 1;
  private dev.openmatch.Match match_;
  /**
   * <pre>
   * A Matches proposed by the Match Function representing a candidate of the final results.
   * </pre>
   *
   * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
   * @return Whether the match field is set.
   */
  @java.lang.Override
  public boolean hasMatch() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * A Matches proposed by the Match Function representing a candidate of the final results.
   * </pre>
   *
   * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
   * @return The match.
   */
  @java.lang.Override
  public dev.openmatch.Match getMatch() {
    return match_ == null ? dev.openmatch.Match.getDefaultInstance() : match_;
  }
  /**
   * <pre>
   * A Matches proposed by the Match Function representing a candidate of the final results.
   * </pre>
   *
   * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
   */
  @java.lang.Override
  public dev.openmatch.MatchOrBuilder getMatchOrBuilder() {
    return match_ == null ? dev.openmatch.Match.getDefaultInstance() : match_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getMatch());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMatch());
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
    if (!(obj instanceof dev.openmatch.EvaluateRequest)) {
      return super.equals(obj);
    }
    dev.openmatch.EvaluateRequest other = (dev.openmatch.EvaluateRequest) obj;

    if (hasMatch() != other.hasMatch()) return false;
    if (hasMatch()) {
      if (!getMatch()
          .equals(other.getMatch())) return false;
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
    if (hasMatch()) {
      hash = (37 * hash) + MATCH_FIELD_NUMBER;
      hash = (53 * hash) + getMatch().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.openmatch.EvaluateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.EvaluateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.EvaluateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.EvaluateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.EvaluateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.EvaluateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.EvaluateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.openmatch.EvaluateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static dev.openmatch.EvaluateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static dev.openmatch.EvaluateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.openmatch.EvaluateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.openmatch.EvaluateRequest parseFrom(
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
  public static Builder newBuilder(dev.openmatch.EvaluateRequest prototype) {
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
   * Protobuf type {@code openmatch.EvaluateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:openmatch.EvaluateRequest)
      dev.openmatch.EvaluateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.openmatch.EvaluatorProto.internal_static_openmatch_EvaluateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.openmatch.EvaluatorProto.internal_static_openmatch_EvaluateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.openmatch.EvaluateRequest.class, dev.openmatch.EvaluateRequest.Builder.class);
    }

    // Construct using dev.openmatch.EvaluateRequest.newBuilder()
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
        getMatchFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      match_ = null;
      if (matchBuilder_ != null) {
        matchBuilder_.dispose();
        matchBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.openmatch.EvaluatorProto.internal_static_openmatch_EvaluateRequest_descriptor;
    }

    @java.lang.Override
    public dev.openmatch.EvaluateRequest getDefaultInstanceForType() {
      return dev.openmatch.EvaluateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public dev.openmatch.EvaluateRequest build() {
      dev.openmatch.EvaluateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.openmatch.EvaluateRequest buildPartial() {
      dev.openmatch.EvaluateRequest result = new dev.openmatch.EvaluateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(dev.openmatch.EvaluateRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.match_ = matchBuilder_ == null
            ? match_
            : matchBuilder_.build();
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
      if (other instanceof dev.openmatch.EvaluateRequest) {
        return mergeFrom((dev.openmatch.EvaluateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.openmatch.EvaluateRequest other) {
      if (other == dev.openmatch.EvaluateRequest.getDefaultInstance()) return this;
      if (other.hasMatch()) {
        mergeMatch(other.getMatch());
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
              input.readMessage(
                  getMatchFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private dev.openmatch.Match match_;
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.openmatch.Match, dev.openmatch.Match.Builder, dev.openmatch.MatchOrBuilder> matchBuilder_;
    /**
     * <pre>
     * A Matches proposed by the Match Function representing a candidate of the final results.
     * </pre>
     *
     * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
     * @return Whether the match field is set.
     */
    public boolean hasMatch() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * A Matches proposed by the Match Function representing a candidate of the final results.
     * </pre>
     *
     * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
     * @return The match.
     */
    public dev.openmatch.Match getMatch() {
      if (matchBuilder_ == null) {
        return match_ == null ? dev.openmatch.Match.getDefaultInstance() : match_;
      } else {
        return matchBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A Matches proposed by the Match Function representing a candidate of the final results.
     * </pre>
     *
     * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
     */
    public Builder setMatch(dev.openmatch.Match value) {
      if (matchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        match_ = value;
      } else {
        matchBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A Matches proposed by the Match Function representing a candidate of the final results.
     * </pre>
     *
     * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
     */
    public Builder setMatch(
        dev.openmatch.Match.Builder builderForValue) {
      if (matchBuilder_ == null) {
        match_ = builderForValue.build();
      } else {
        matchBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A Matches proposed by the Match Function representing a candidate of the final results.
     * </pre>
     *
     * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
     */
    public Builder mergeMatch(dev.openmatch.Match value) {
      if (matchBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          match_ != null &&
          match_ != dev.openmatch.Match.getDefaultInstance()) {
          getMatchBuilder().mergeFrom(value);
        } else {
          match_ = value;
        }
      } else {
        matchBuilder_.mergeFrom(value);
      }
      if (match_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * A Matches proposed by the Match Function representing a candidate of the final results.
     * </pre>
     *
     * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
     */
    public Builder clearMatch() {
      bitField0_ = (bitField0_ & ~0x00000001);
      match_ = null;
      if (matchBuilder_ != null) {
        matchBuilder_.dispose();
        matchBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A Matches proposed by the Match Function representing a candidate of the final results.
     * </pre>
     *
     * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
     */
    public dev.openmatch.Match.Builder getMatchBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMatchFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A Matches proposed by the Match Function representing a candidate of the final results.
     * </pre>
     *
     * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
     */
    public dev.openmatch.MatchOrBuilder getMatchOrBuilder() {
      if (matchBuilder_ != null) {
        return matchBuilder_.getMessageOrBuilder();
      } else {
        return match_ == null ?
            dev.openmatch.Match.getDefaultInstance() : match_;
      }
    }
    /**
     * <pre>
     * A Matches proposed by the Match Function representing a candidate of the final results.
     * </pre>
     *
     * <code>.openmatch.Match match = 1 [json_name = "match"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.openmatch.Match, dev.openmatch.Match.Builder, dev.openmatch.MatchOrBuilder> 
        getMatchFieldBuilder() {
      if (matchBuilder_ == null) {
        matchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            dev.openmatch.Match, dev.openmatch.Match.Builder, dev.openmatch.MatchOrBuilder>(
                getMatch(),
                getParentForChildren(),
                isClean());
        match_ = null;
      }
      return matchBuilder_;
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


    // @@protoc_insertion_point(builder_scope:openmatch.EvaluateRequest)
  }

  // @@protoc_insertion_point(class_scope:openmatch.EvaluateRequest)
  private static final dev.openmatch.EvaluateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.openmatch.EvaluateRequest();
  }

  public static dev.openmatch.EvaluateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvaluateRequest>
      PARSER = new com.google.protobuf.AbstractParser<EvaluateRequest>() {
    @java.lang.Override
    public EvaluateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<EvaluateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvaluateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.openmatch.EvaluateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

