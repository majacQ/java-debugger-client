/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/data.proto

package com.google.devtools.clouddebugger.v2;

/**
 *
 *
 * <pre>
 * Represents a message with parameters.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.FormatMessage}
 */
public final class FormatMessage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.FormatMessage)
    FormatMessageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FormatMessage.newBuilder() to construct.
  private FormatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FormatMessage() {
    format_ = "";
    parameters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FormatMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FormatMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              format_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                parameters_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              parameters_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        parameters_ = parameters_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.clouddebugger.v2.DataProto
        .internal_static_google_devtools_clouddebugger_v2_FormatMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DataProto
        .internal_static_google_devtools_clouddebugger_v2_FormatMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.FormatMessage.class,
            com.google.devtools.clouddebugger.v2.FormatMessage.Builder.class);
  }

  public static final int FORMAT_FIELD_NUMBER = 1;
  private volatile java.lang.Object format_;
  /**
   *
   *
   * <pre>
   * Format template for the message. The `format` uses placeholders `$0`,
   * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
   * character.
   * Examples:
   * *   `Failed to load '$0' which helps debug $1 the first time it
   *     is loaded.  Again, $0 is very important.`
   * *   `Please pay $$10 to use $0 instead of $1.`
   * </pre>
   *
   * <code>string format = 1;</code>
   *
   * @return The format.
   */
  @java.lang.Override
  public java.lang.String getFormat() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      format_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Format template for the message. The `format` uses placeholders `$0`,
   * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
   * character.
   * Examples:
   * *   `Failed to load '$0' which helps debug $1 the first time it
   *     is loaded.  Again, $0 is very important.`
   * *   `Please pay $$10 to use $0 instead of $1.`
   * </pre>
   *
   * <code>string format = 1;</code>
   *
   * @return The bytes for format.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFormatBytes() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      format_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMETERS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList parameters_;
  /**
   *
   *
   * <pre>
   * Optional parameters to be embedded into the message.
   * </pre>
   *
   * <code>repeated string parameters = 2;</code>
   *
   * @return A list containing the parameters.
   */
  public com.google.protobuf.ProtocolStringList getParametersList() {
    return parameters_;
  }
  /**
   *
   *
   * <pre>
   * Optional parameters to be embedded into the message.
   * </pre>
   *
   * <code>repeated string parameters = 2;</code>
   *
   * @return The count of parameters.
   */
  public int getParametersCount() {
    return parameters_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional parameters to be embedded into the message.
   * </pre>
   *
   * <code>repeated string parameters = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The parameters at the given index.
   */
  public java.lang.String getParameters(int index) {
    return parameters_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional parameters to be embedded into the message.
   * </pre>
   *
   * <code>repeated string parameters = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the parameters at the given index.
   */
  public com.google.protobuf.ByteString getParametersBytes(int index) {
    return parameters_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getFormatBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, format_);
    }
    for (int i = 0; i < parameters_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, parameters_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFormatBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, format_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < parameters_.size(); i++) {
        dataSize += computeStringSizeNoTag(parameters_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getParametersList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.FormatMessage)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.FormatMessage other =
        (com.google.devtools.clouddebugger.v2.FormatMessage) obj;

    if (!getFormat().equals(other.getFormat())) return false;
    if (!getParametersList().equals(other.getParametersList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + getFormat().hashCode();
    if (getParametersCount() > 0) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParametersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.FormatMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Represents a message with parameters.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.FormatMessage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.FormatMessage)
      com.google.devtools.clouddebugger.v2.FormatMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DataProto
          .internal_static_google_devtools_clouddebugger_v2_FormatMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DataProto
          .internal_static_google_devtools_clouddebugger_v2_FormatMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.FormatMessage.class,
              com.google.devtools.clouddebugger.v2.FormatMessage.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.FormatMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      format_ = "";

      parameters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DataProto
          .internal_static_google_devtools_clouddebugger_v2_FormatMessage_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.FormatMessage getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.FormatMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.FormatMessage build() {
      com.google.devtools.clouddebugger.v2.FormatMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.FormatMessage buildPartial() {
      com.google.devtools.clouddebugger.v2.FormatMessage result =
          new com.google.devtools.clouddebugger.v2.FormatMessage(this);
      int from_bitField0_ = bitField0_;
      result.format_ = format_;
      if (((bitField0_ & 0x00000001) != 0)) {
        parameters_ = parameters_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.parameters_ = parameters_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.clouddebugger.v2.FormatMessage) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.FormatMessage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.FormatMessage other) {
      if (other == com.google.devtools.clouddebugger.v2.FormatMessage.getDefaultInstance())
        return this;
      if (!other.getFormat().isEmpty()) {
        format_ = other.format_;
        onChanged();
      }
      if (!other.parameters_.isEmpty()) {
        if (parameters_.isEmpty()) {
          parameters_ = other.parameters_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureParametersIsMutable();
          parameters_.addAll(other.parameters_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.devtools.clouddebugger.v2.FormatMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.devtools.clouddebugger.v2.FormatMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object format_ = "";
    /**
     *
     *
     * <pre>
     * Format template for the message. The `format` uses placeholders `$0`,
     * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
     * character.
     * Examples:
     * *   `Failed to load '$0' which helps debug $1 the first time it
     *     is loaded.  Again, $0 is very important.`
     * *   `Please pay $$10 to use $0 instead of $1.`
     * </pre>
     *
     * <code>string format = 1;</code>
     *
     * @return The format.
     */
    public java.lang.String getFormat() {
      java.lang.Object ref = format_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        format_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Format template for the message. The `format` uses placeholders `$0`,
     * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
     * character.
     * Examples:
     * *   `Failed to load '$0' which helps debug $1 the first time it
     *     is loaded.  Again, $0 is very important.`
     * *   `Please pay $$10 to use $0 instead of $1.`
     * </pre>
     *
     * <code>string format = 1;</code>
     *
     * @return The bytes for format.
     */
    public com.google.protobuf.ByteString getFormatBytes() {
      java.lang.Object ref = format_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        format_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Format template for the message. The `format` uses placeholders `$0`,
     * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
     * character.
     * Examples:
     * *   `Failed to load '$0' which helps debug $1 the first time it
     *     is loaded.  Again, $0 is very important.`
     * *   `Please pay $$10 to use $0 instead of $1.`
     * </pre>
     *
     * <code>string format = 1;</code>
     *
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      format_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Format template for the message. The `format` uses placeholders `$0`,
     * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
     * character.
     * Examples:
     * *   `Failed to load '$0' which helps debug $1 the first time it
     *     is loaded.  Again, $0 is very important.`
     * *   `Please pay $$10 to use $0 instead of $1.`
     * </pre>
     *
     * <code>string format = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFormat() {

      format_ = getDefaultInstance().getFormat();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Format template for the message. The `format` uses placeholders `$0`,
     * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
     * character.
     * Examples:
     * *   `Failed to load '$0' which helps debug $1 the first time it
     *     is loaded.  Again, $0 is very important.`
     * *   `Please pay $$10 to use $0 instead of $1.`
     * </pre>
     *
     * <code>string format = 1;</code>
     *
     * @param value The bytes for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      format_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList parameters_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureParametersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        parameters_ = new com.google.protobuf.LazyStringArrayList(parameters_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional parameters to be embedded into the message.
     * </pre>
     *
     * <code>repeated string parameters = 2;</code>
     *
     * @return A list containing the parameters.
     */
    public com.google.protobuf.ProtocolStringList getParametersList() {
      return parameters_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Optional parameters to be embedded into the message.
     * </pre>
     *
     * <code>repeated string parameters = 2;</code>
     *
     * @return The count of parameters.
     */
    public int getParametersCount() {
      return parameters_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional parameters to be embedded into the message.
     * </pre>
     *
     * <code>repeated string parameters = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The parameters at the given index.
     */
    public java.lang.String getParameters(int index) {
      return parameters_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional parameters to be embedded into the message.
     * </pre>
     *
     * <code>repeated string parameters = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the parameters at the given index.
     */
    public com.google.protobuf.ByteString getParametersBytes(int index) {
      return parameters_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional parameters to be embedded into the message.
     * </pre>
     *
     * <code>repeated string parameters = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The parameters to set.
     * @return This builder for chaining.
     */
    public Builder setParameters(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureParametersIsMutable();
      parameters_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional parameters to be embedded into the message.
     * </pre>
     *
     * <code>repeated string parameters = 2;</code>
     *
     * @param value The parameters to add.
     * @return This builder for chaining.
     */
    public Builder addParameters(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureParametersIsMutable();
      parameters_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional parameters to be embedded into the message.
     * </pre>
     *
     * <code>repeated string parameters = 2;</code>
     *
     * @param values The parameters to add.
     * @return This builder for chaining.
     */
    public Builder addAllParameters(java.lang.Iterable<java.lang.String> values) {
      ensureParametersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, parameters_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional parameters to be embedded into the message.
     * </pre>
     *
     * <code>repeated string parameters = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParameters() {
      parameters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional parameters to be embedded into the message.
     * </pre>
     *
     * <code>repeated string parameters = 2;</code>
     *
     * @param value The bytes of the parameters to add.
     * @return This builder for chaining.
     */
    public Builder addParametersBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureParametersIsMutable();
      parameters_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.FormatMessage)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.FormatMessage)
  private static final com.google.devtools.clouddebugger.v2.FormatMessage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.FormatMessage();
  }

  public static com.google.devtools.clouddebugger.v2.FormatMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FormatMessage> PARSER =
      new com.google.protobuf.AbstractParser<FormatMessage>() {
        @java.lang.Override
        public FormatMessage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FormatMessage(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FormatMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FormatMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.FormatMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
