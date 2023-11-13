// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/backend.proto

// Protobuf Java Version: 3.25.0
package dev.openmatch;

/**
 * <pre>
 * AssignmentGroup contains an Assignment and the Tickets to which it should be applied. 
 * </pre>
 *
 * Protobuf type {@code openmatch.AssignmentGroup}
 */
public final class AssignmentGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:openmatch.AssignmentGroup)
    AssignmentGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignmentGroup.newBuilder() to construct.
  private AssignmentGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignmentGroup() {
    ticketIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignmentGroup();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dev.openmatch.BackendProto.internal_static_openmatch_AssignmentGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.openmatch.BackendProto.internal_static_openmatch_AssignmentGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.openmatch.AssignmentGroup.class, dev.openmatch.AssignmentGroup.Builder.class);
  }

  private int bitField0_;
  public static final int TICKET_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList ticketIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
   * </pre>
   *
   * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
   * @return A list containing the ticketIds.
   */
  public com.google.protobuf.ProtocolStringList
      getTicketIdsList() {
    return ticketIds_;
  }
  /**
   * <pre>
   * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
   * </pre>
   *
   * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
   * @return The count of ticketIds.
   */
  public int getTicketIdsCount() {
    return ticketIds_.size();
  }
  /**
   * <pre>
   * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
   * </pre>
   *
   * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
   * @param index The index of the element to return.
   * @return The ticketIds at the given index.
   */
  public java.lang.String getTicketIds(int index) {
    return ticketIds_.get(index);
  }
  /**
   * <pre>
   * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
   * </pre>
   *
   * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ticketIds at the given index.
   */
  public com.google.protobuf.ByteString
      getTicketIdsBytes(int index) {
    return ticketIds_.getByteString(index);
  }

  public static final int ASSIGNMENT_FIELD_NUMBER = 2;
  private dev.openmatch.Assignment assignment_;
  /**
   * <pre>
   * An Assignment specifies game connection related information to be associated with the TicketIds.
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
   * An Assignment specifies game connection related information to be associated with the TicketIds.
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
   * An Assignment specifies game connection related information to be associated with the TicketIds.
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
    for (int i = 0; i < ticketIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ticketIds_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < ticketIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(ticketIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTicketIdsList().size();
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
    if (!(obj instanceof dev.openmatch.AssignmentGroup)) {
      return super.equals(obj);
    }
    dev.openmatch.AssignmentGroup other = (dev.openmatch.AssignmentGroup) obj;

    if (!getTicketIdsList()
        .equals(other.getTicketIdsList())) return false;
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
    if (getTicketIdsCount() > 0) {
      hash = (37 * hash) + TICKET_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getTicketIdsList().hashCode();
    }
    if (hasAssignment()) {
      hash = (37 * hash) + ASSIGNMENT_FIELD_NUMBER;
      hash = (53 * hash) + getAssignment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.openmatch.AssignmentGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.AssignmentGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.AssignmentGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.AssignmentGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.AssignmentGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.openmatch.AssignmentGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.openmatch.AssignmentGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.openmatch.AssignmentGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static dev.openmatch.AssignmentGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static dev.openmatch.AssignmentGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.openmatch.AssignmentGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.openmatch.AssignmentGroup parseFrom(
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
  public static Builder newBuilder(dev.openmatch.AssignmentGroup prototype) {
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
   * AssignmentGroup contains an Assignment and the Tickets to which it should be applied. 
   * </pre>
   *
   * Protobuf type {@code openmatch.AssignmentGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:openmatch.AssignmentGroup)
      dev.openmatch.AssignmentGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.openmatch.BackendProto.internal_static_openmatch_AssignmentGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.openmatch.BackendProto.internal_static_openmatch_AssignmentGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.openmatch.AssignmentGroup.class, dev.openmatch.AssignmentGroup.Builder.class);
    }

    // Construct using dev.openmatch.AssignmentGroup.newBuilder()
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
      ticketIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
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
      return dev.openmatch.BackendProto.internal_static_openmatch_AssignmentGroup_descriptor;
    }

    @java.lang.Override
    public dev.openmatch.AssignmentGroup getDefaultInstanceForType() {
      return dev.openmatch.AssignmentGroup.getDefaultInstance();
    }

    @java.lang.Override
    public dev.openmatch.AssignmentGroup build() {
      dev.openmatch.AssignmentGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.openmatch.AssignmentGroup buildPartial() {
      dev.openmatch.AssignmentGroup result = new dev.openmatch.AssignmentGroup(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(dev.openmatch.AssignmentGroup result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        ticketIds_.makeImmutable();
        result.ticketIds_ = ticketIds_;
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
      if (other instanceof dev.openmatch.AssignmentGroup) {
        return mergeFrom((dev.openmatch.AssignmentGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.openmatch.AssignmentGroup other) {
      if (other == dev.openmatch.AssignmentGroup.getDefaultInstance()) return this;
      if (!other.ticketIds_.isEmpty()) {
        if (ticketIds_.isEmpty()) {
          ticketIds_ = other.ticketIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureTicketIdsIsMutable();
          ticketIds_.addAll(other.ticketIds_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureTicketIdsIsMutable();
              ticketIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList ticketIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTicketIdsIsMutable() {
      if (!ticketIds_.isModifiable()) {
        ticketIds_ = new com.google.protobuf.LazyStringArrayList(ticketIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
     * </pre>
     *
     * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
     * @return A list containing the ticketIds.
     */
    public com.google.protobuf.ProtocolStringList
        getTicketIdsList() {
      ticketIds_.makeImmutable();
      return ticketIds_;
    }
    /**
     * <pre>
     * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
     * </pre>
     *
     * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
     * @return The count of ticketIds.
     */
    public int getTicketIdsCount() {
      return ticketIds_.size();
    }
    /**
     * <pre>
     * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
     * </pre>
     *
     * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
     * @param index The index of the element to return.
     * @return The ticketIds at the given index.
     */
    public java.lang.String getTicketIds(int index) {
      return ticketIds_.get(index);
    }
    /**
     * <pre>
     * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
     * </pre>
     *
     * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the ticketIds at the given index.
     */
    public com.google.protobuf.ByteString
        getTicketIdsBytes(int index) {
      return ticketIds_.getByteString(index);
    }
    /**
     * <pre>
     * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
     * </pre>
     *
     * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
     * @param index The index to set the value at.
     * @param value The ticketIds to set.
     * @return This builder for chaining.
     */
    public Builder setTicketIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTicketIdsIsMutable();
      ticketIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
     * </pre>
     *
     * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
     * @param value The ticketIds to add.
     * @return This builder for chaining.
     */
    public Builder addTicketIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTicketIdsIsMutable();
      ticketIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
     * </pre>
     *
     * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
     * @param values The ticketIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllTicketIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureTicketIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ticketIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
     * </pre>
     *
     * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketIds() {
      ticketIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TicketIds is a list of strings representing Open Match generated Ids which apply to an Assignment.
     * </pre>
     *
     * <code>repeated string ticket_ids = 1 [json_name = "ticketIds"];</code>
     * @param value The bytes of the ticketIds to add.
     * @return This builder for chaining.
     */
    public Builder addTicketIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTicketIdsIsMutable();
      ticketIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private dev.openmatch.Assignment assignment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        dev.openmatch.Assignment, dev.openmatch.Assignment.Builder, dev.openmatch.AssignmentOrBuilder> assignmentBuilder_;
    /**
     * <pre>
     * An Assignment specifies game connection related information to be associated with the TicketIds.
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
     * An Assignment specifies game connection related information to be associated with the TicketIds.
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
     * An Assignment specifies game connection related information to be associated with the TicketIds.
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
     * An Assignment specifies game connection related information to be associated with the TicketIds.
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
     * An Assignment specifies game connection related information to be associated with the TicketIds.
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
     * An Assignment specifies game connection related information to be associated with the TicketIds.
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
     * An Assignment specifies game connection related information to be associated with the TicketIds.
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
     * An Assignment specifies game connection related information to be associated with the TicketIds.
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
     * An Assignment specifies game connection related information to be associated with the TicketIds.
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


    // @@protoc_insertion_point(builder_scope:openmatch.AssignmentGroup)
  }

  // @@protoc_insertion_point(class_scope:openmatch.AssignmentGroup)
  private static final dev.openmatch.AssignmentGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.openmatch.AssignmentGroup();
  }

  public static dev.openmatch.AssignmentGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignmentGroup>
      PARSER = new com.google.protobuf.AbstractParser<AssignmentGroup>() {
    @java.lang.Override
    public AssignmentGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignmentGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignmentGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.openmatch.AssignmentGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

