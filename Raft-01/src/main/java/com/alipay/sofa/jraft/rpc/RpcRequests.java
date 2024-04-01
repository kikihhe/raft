

package com.alipay.sofa.jraft.rpc;

public final class RpcRequests {
  private RpcRequests() {
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface PingRequestOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.PingRequest)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 send_timestamp = 1;</code>
     */
    boolean hasSendTimestamp();

    /**
     * <code>required int64 send_timestamp = 1;</code>
     */
    long getSendTimestamp();
  }

  /**
   * Protobuf type {@code jraft.PingRequest}
   */
  public static final class PingRequest extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.PingRequest)
          PingRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use PingRequest.newBuilder() to construct.
    private PingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PingRequest() {
      sendTimestamp_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PingRequest(com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              sendTimestamp_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_PingRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_PingRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest.Builder.class);
    }

    private int             bitField0_;
    public static final int SEND_TIMESTAMP_FIELD_NUMBER = 1;
    private long            sendTimestamp_;

    /**
     * <code>required int64 send_timestamp = 1;</code>
     */
    public boolean hasSendTimestamp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required int64 send_timestamp = 1;</code>
     */
    public long getSendTimestamp() {
      return sendTimestamp_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasSendTimestamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, sendTimestamp_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, sendTimestamp_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest other = (com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest) obj;

      boolean result = true;
      result = result && (hasSendTimestamp() == other.hasSendTimestamp());
      if (hasSendTimestamp()) {
        result = result && (getSendTimestamp() == other.getSendTimestamp());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSendTimestamp()) {
        hash = (37 * hash) + SEND_TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSendTimestamp());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(java.nio.ByteBuffer data,
                                                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(com.google.protobuf.ByteString data,
                                                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(byte[] data,
                                                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(java.io.InputStream input,
                                                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseDelimitedFrom(java.io.InputStream input,
                                                                                       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parseFrom(com.google.protobuf.CodedInputStream input,
                                                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.PingRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.PingRequest)
            com.alipay.sofa.jraft.rpc.RpcRequests.PingRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_PingRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_PingRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        sendTimestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_PingRequest_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest result = new com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sendTimestamp_ = sendTimestamp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest.getDefaultInstance())
          return this;
        if (other.hasSendTimestamp()) {
          setSendTimestamp(other.getSendTimestamp());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSendTimestamp()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int  bitField0_;

      private long sendTimestamp_;

      /**
       * <code>required int64 send_timestamp = 1;</code>
       */
      public boolean hasSendTimestamp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required int64 send_timestamp = 1;</code>
       */
      public long getSendTimestamp() {
        return sendTimestamp_;
      }

      /**
       * <code>required int64 send_timestamp = 1;</code>
       */
      public Builder setSendTimestamp(long value) {
        bitField0_ |= 0x00000001;
        sendTimestamp_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 send_timestamp = 1;</code>
       */
      public Builder clearSendTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sendTimestamp_ = 0L;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.PingRequest)
    }

    // @@protoc_insertion_point(class_scope:jraft.PingRequest)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PingRequest> PARSER = new com.google.protobuf.AbstractParser<PingRequest>() {
      public PingRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new PingRequest(input,
                extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PingRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PingRequest> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.PingRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ErrorResponseOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.ErrorResponse)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 errorCode = 1;</code>
     */
    boolean hasErrorCode();

    /**
     * <code>required int32 errorCode = 1;</code>
     */
    int getErrorCode();

    /**
     * <code>optional string errorMsg = 2;</code>
     */
    boolean hasErrorMsg();

    /**
     * <code>optional string errorMsg = 2;</code>
     */
    java.lang.String getErrorMsg();

    /**
     * <code>optional string errorMsg = 2;</code>
     */
    com.google.protobuf.ByteString getErrorMsgBytes();
  }

  /**
   * Protobuf type {@code jraft.ErrorResponse}
   */
  public static final class ErrorResponse extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.ErrorResponse)
          ErrorResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ErrorResponse.newBuilder() to construct.
    private ErrorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ErrorResponse() {
      errorCode_ = 0;
      errorMsg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ErrorResponse(com.google.protobuf.CodedInputStream input,
                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              errorCode_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              errorMsg_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ErrorResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ErrorResponse_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder.class);
    }

    private int             bitField0_;
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    private int             errorCode_;

    /**
     * <code>required int32 errorCode = 1;</code>
     */
    public boolean hasErrorCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required int32 errorCode = 1;</code>
     */
    public int getErrorCode() {
      return errorCode_;
    }

    public static final int           ERRORMSG_FIELD_NUMBER = 2;
    private volatile java.lang.Object errorMsg_;

    /**
     * <code>optional string errorMsg = 2;</code>
     */
    public boolean hasErrorMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional string errorMsg = 2;</code>
     */
    public java.lang.String getErrorMsg() {
      java.lang.Object ref = errorMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errorMsg_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string errorMsg = 2;</code>
     */
    public com.google.protobuf.ByteString getErrorMsgBytes() {
      java.lang.Object ref = errorMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        errorMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasErrorCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, errorCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorMsg_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, errorCode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorMsg_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse other = (com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse) obj;

      boolean result = true;
      result = result && (hasErrorCode() == other.hasErrorCode());
      if (hasErrorCode()) {
        result = result && (getErrorCode() == other.getErrorCode());
      }
      result = result && (hasErrorMsg() == other.hasErrorMsg());
      if (hasErrorMsg()) {
        result = result && getErrorMsg().equals(other.getErrorMsg());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasErrorCode()) {
        hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorCode();
      }
      if (hasErrorMsg()) {
        hash = (37 * hash) + ERRORMSG_FIELD_NUMBER;
        hash = (53 * hash) + getErrorMsg().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(java.nio.ByteBuffer data,
                                                                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(com.google.protobuf.ByteString data,
                                                                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(byte[] data,
                                                                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(java.io.InputStream input,
                                                                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseDelimitedFrom(java.io.InputStream input,
                                                                                         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.ErrorResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.ErrorResponse)
            com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ErrorResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ErrorResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        errorCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        errorMsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ErrorResponse_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse result = new com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.errorCode_ = errorCode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.errorMsg_ = errorMsg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance())
          return this;
        if (other.hasErrorCode()) {
          setErrorCode(other.getErrorCode());
        }
        if (other.hasErrorMsg()) {
          bitField0_ |= 0x00000002;
          errorMsg_ = other.errorMsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasErrorCode()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private int errorCode_;

      /**
       * <code>required int32 errorCode = 1;</code>
       */
      public boolean hasErrorCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required int32 errorCode = 1;</code>
       */
      public int getErrorCode() {
        return errorCode_;
      }

      /**
       * <code>required int32 errorCode = 1;</code>
       */
      public Builder setErrorCode(int value) {
        bitField0_ |= 0x00000001;
        errorCode_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int32 errorCode = 1;</code>
       */
      public Builder clearErrorCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        errorCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object errorMsg_ = "";

      /**
       * <code>optional string errorMsg = 2;</code>
       */
      public boolean hasErrorMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional string errorMsg = 2;</code>
       */
      public java.lang.String getErrorMsg() {
        java.lang.Object ref = errorMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            errorMsg_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string errorMsg = 2;</code>
       */
      public com.google.protobuf.ByteString getErrorMsgBytes() {
        java.lang.Object ref = errorMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          errorMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string errorMsg = 2;</code>
       */
      public Builder setErrorMsg(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        errorMsg_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string errorMsg = 2;</code>
       */
      public Builder clearErrorMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        errorMsg_ = getDefaultInstance().getErrorMsg();
        onChanged();
        return this;
      }

      /**
       * <code>optional string errorMsg = 2;</code>
       */
      public Builder setErrorMsgBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        errorMsg_ = value;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.ErrorResponse)
    }

    // @@protoc_insertion_point(class_scope:jraft.ErrorResponse)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ErrorResponse> PARSER = new com.google.protobuf.AbstractParser<ErrorResponse>() {
      public ErrorResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorResponse(input,
                extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ErrorResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorResponse> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface InstallSnapshotRequestOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.InstallSnapshotRequest)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string group_id = 1;</code>
     */
    boolean hasGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    java.lang.String getGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    com.google.protobuf.ByteString getGroupIdBytes();

    /**
     * <code>required string server_id = 2;</code>
     */
    boolean hasServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    java.lang.String getServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    com.google.protobuf.ByteString getServerIdBytes();

    /**
     * <code>required string peer_id = 3;</code>
     */
    boolean hasPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    java.lang.String getPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    com.google.protobuf.ByteString getPeerIdBytes();

    /**
     * <code>required int64 term = 4;</code>
     */
    boolean hasTerm();

    /**
     * <code>required int64 term = 4;</code>
     */
    long getTerm();

    /**
     * <code>required .jraft.SnapshotMeta meta = 5;</code>
     */
    boolean hasMeta();

    /**
     * <code>required .jraft.SnapshotMeta meta = 5;</code>
     */
    com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta getMeta();

    /**
     * <code>required .jraft.SnapshotMeta meta = 5;</code>
     */
    com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMetaOrBuilder getMetaOrBuilder();

    /**
     * <code>required string uri = 6;</code>
     */
    boolean hasUri();

    /**
     * <code>required string uri = 6;</code>
     */
    java.lang.String getUri();

    /**
     * <code>required string uri = 6;</code>
     */
    com.google.protobuf.ByteString getUriBytes();
  }

  /**
   * Protobuf type {@code jraft.InstallSnapshotRequest}
   */
  public static final class InstallSnapshotRequest extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.InstallSnapshotRequest)
          InstallSnapshotRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use InstallSnapshotRequest.newBuilder() to construct.
    private InstallSnapshotRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private InstallSnapshotRequest() {
      groupId_ = "";
      serverId_ = "";
      peerId_ = "";
      term_ = 0L;
      uri_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private InstallSnapshotRequest(com.google.protobuf.CodedInputStream input,
                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              groupId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              serverId_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              peerId_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              term_ = input.readInt64();
              break;
            }
            case 42: {
              com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.Builder subBuilder = null;
              if (((bitField0_ & 0x00000010) == 0x00000010)) {
                subBuilder = meta_.toBuilder();
              }
              meta_ = input.readMessage(com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.PARSER,
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(meta_);
                meta_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000010;
              break;
            }
            case 50: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              uri_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest.Builder.class);
    }

    private int                       bitField0_;
    public static final int           GROUP_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object groupId_;

    /**
     * <code>required string group_id = 1;</code>
     */
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           SERVER_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object serverId_;

    /**
     * <code>required string server_id = 2;</code>
     */
    public boolean hasServerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public java.lang.String getServerId() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public com.google.protobuf.ByteString getServerIdBytes() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           PEER_ID_FIELD_NUMBER = 3;
    private volatile java.lang.Object peerId_;

    /**
     * <code>required string peer_id = 3;</code>
     */
    public boolean hasPeerId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public java.lang.String getPeerId() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          peerId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public com.google.protobuf.ByteString getPeerIdBytes() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        peerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TERM_FIELD_NUMBER = 4;
    private long            term_;

    /**
     * <code>required int64 term = 4;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>required int64 term = 4;</code>
     */
    public long getTerm() {
      return term_;
    }

    public static final int                                      META_FIELD_NUMBER = 5;
    private com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta meta_;

    /**
     * <code>required .jraft.SnapshotMeta meta = 5;</code>
     */
    public boolean hasMeta() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>required .jraft.SnapshotMeta meta = 5;</code>
     */
    public com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta getMeta() {
      return meta_ == null ? com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.getDefaultInstance() : meta_;
    }

    /**
     * <code>required .jraft.SnapshotMeta meta = 5;</code>
     */
    public com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMetaOrBuilder getMetaOrBuilder() {
      return meta_ == null ? com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.getDefaultInstance() : meta_;
    }

    public static final int           URI_FIELD_NUMBER = 6;
    private volatile java.lang.Object uri_;

    /**
     * <code>required string uri = 6;</code>
     */
    public boolean hasUri() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }

    /**
     * <code>required string uri = 6;</code>
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          uri_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string uri = 6;</code>
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasGroupId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasServerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPeerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMeta()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUri()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getMeta().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, term_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, getMeta());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, uri_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, term_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getMeta());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, uri_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest other = (com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest) obj;

      boolean result = true;
      result = result && (hasGroupId() == other.hasGroupId());
      if (hasGroupId()) {
        result = result && getGroupId().equals(other.getGroupId());
      }
      result = result && (hasServerId() == other.hasServerId());
      if (hasServerId()) {
        result = result && getServerId().equals(other.getServerId());
      }
      result = result && (hasPeerId() == other.hasPeerId());
      if (hasPeerId()) {
        result = result && getPeerId().equals(other.getPeerId());
      }
      result = result && (hasTerm() == other.hasTerm());
      if (hasTerm()) {
        result = result && (getTerm() == other.getTerm());
      }
      result = result && (hasMeta() == other.hasMeta());
      if (hasMeta()) {
        result = result && getMeta().equals(other.getMeta());
      }
      result = result && (hasUri() == other.hasUri());
      if (hasUri()) {
        result = result && getUri().equals(other.getUri());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasGroupId()) {
        hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
        hash = (53 * hash) + getGroupId().hashCode();
      }
      if (hasServerId()) {
        hash = (37 * hash) + SERVER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getServerId().hashCode();
      }
      if (hasPeerId()) {
        hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPeerId().hashCode();
      }
      if (hasTerm()) {
        hash = (37 * hash) + TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTerm());
      }
      if (hasMeta()) {
        hash = (37 * hash) + META_FIELD_NUMBER;
        hash = (53 * hash) + getMeta().hashCode();
      }
      if (hasUri()) {
        hash = (37 * hash) + URI_FIELD_NUMBER;
        hash = (53 * hash) + getUri().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(java.nio.ByteBuffer data,
                                                                                         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(com.google.protobuf.ByteString data,
                                                                                         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(byte[] data,
                                                                                         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(java.io.InputStream input,
                                                                                         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseDelimitedFrom(java.io.InputStream input,
                                                                                                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.InstallSnapshotRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.InstallSnapshotRequest)
            com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetaFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        groupId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        serverId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        peerId_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        term_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (metaBuilder_ == null) {
          meta_ = null;
        } else {
          metaBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        uri_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotRequest_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest result = new com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupId_ = groupId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverId_ = serverId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.peerId_ = peerId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.term_ = term_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (metaBuilder_ == null) {
          result.meta_ = meta_;
        } else {
          result.meta_ = metaBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.uri_ = uri_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest.getDefaultInstance())
          return this;
        if (other.hasGroupId()) {
          bitField0_ |= 0x00000001;
          groupId_ = other.groupId_;
          onChanged();
        }
        if (other.hasServerId()) {
          bitField0_ |= 0x00000002;
          serverId_ = other.serverId_;
          onChanged();
        }
        if (other.hasPeerId()) {
          bitField0_ |= 0x00000004;
          peerId_ = other.peerId_;
          onChanged();
        }
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        if (other.hasMeta()) {
          mergeMeta(other.getMeta());
        }
        if (other.hasUri()) {
          bitField0_ |= 0x00000020;
          uri_ = other.uri_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGroupId()) {
          return false;
        }
        if (!hasServerId()) {
          return false;
        }
        if (!hasPeerId()) {
          return false;
        }
        if (!hasTerm()) {
          return false;
        }
        if (!hasMeta()) {
          return false;
        }
        if (!hasUri()) {
          return false;
        }
        if (!getMeta().isInitialized()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest) e
                  .getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int              bitField0_;

      private java.lang.Object groupId_ = "";

      /**
       * <code>required string group_id = 1;</code>
       */
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public java.lang.String getGroupId() {
        java.lang.Object ref = groupId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            groupId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString getGroupIdBytes() {
        java.lang.Object ref = groupId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          groupId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = getDefaultInstance().getGroupId();
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object serverId_ = "";

      /**
       * <code>required string server_id = 2;</code>
       */
      public boolean hasServerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public java.lang.String getServerId() {
        java.lang.Object ref = serverId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public com.google.protobuf.ByteString getServerIdBytes() {
        java.lang.Object ref = serverId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          serverId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder clearServerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverId_ = getDefaultInstance().getServerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object peerId_ = "";

      /**
       * <code>required string peer_id = 3;</code>
       */
      public boolean hasPeerId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public java.lang.String getPeerId() {
        java.lang.Object ref = peerId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            peerId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public com.google.protobuf.ByteString getPeerIdBytes() {
        java.lang.Object ref = peerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          peerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder clearPeerId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        peerId_ = getDefaultInstance().getPeerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      private long term_;

      /**
       * <code>required int64 term = 4;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public long getTerm() {
        return term_;
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public Builder setTerm(long value) {
        bitField0_ |= 0x00000008;
        term_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000008);
        term_ = 0L;
        onChanged();
        return this;
      }

      private com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta                                                                                                                                                                        meta_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta, com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.Builder, com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMetaOrBuilder> metaBuilder_;

      /**
       * <code>required .jraft.SnapshotMeta meta = 5;</code>
       */
      public boolean hasMeta() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>required .jraft.SnapshotMeta meta = 5;</code>
       */
      public com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta getMeta() {
        if (metaBuilder_ == null) {
          return meta_ == null ? com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.getDefaultInstance()
                  : meta_;
        } else {
          return metaBuilder_.getMessage();
        }
      }

      /**
       * <code>required .jraft.SnapshotMeta meta = 5;</code>
       */
      public Builder setMeta(com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta value) {
        if (metaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          meta_ = value;
          onChanged();
        } else {
          metaBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }

      /**
       * <code>required .jraft.SnapshotMeta meta = 5;</code>
       */
      public Builder setMeta(com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.Builder builderForValue) {
        if (metaBuilder_ == null) {
          meta_ = builderForValue.build();
          onChanged();
        } else {
          metaBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }

      /**
       * <code>required .jraft.SnapshotMeta meta = 5;</code>
       */
      public Builder mergeMeta(com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta value) {
        if (metaBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010) && meta_ != null
                  && meta_ != com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.getDefaultInstance()) {
            meta_ = com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.newBuilder(meta_).mergeFrom(value)
                    .buildPartial();
          } else {
            meta_ = value;
          }
          onChanged();
        } else {
          metaBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }

      /**
       * <code>required .jraft.SnapshotMeta meta = 5;</code>
       */
      public Builder clearMeta() {
        if (metaBuilder_ == null) {
          meta_ = null;
          onChanged();
        } else {
          metaBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      /**
       * <code>required .jraft.SnapshotMeta meta = 5;</code>
       */
      public com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.Builder getMetaBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getMetaFieldBuilder().getBuilder();
      }

      /**
       * <code>required .jraft.SnapshotMeta meta = 5;</code>
       */
      public com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMetaOrBuilder getMetaOrBuilder() {
        if (metaBuilder_ != null) {
          return metaBuilder_.getMessageOrBuilder();
        } else {
          return meta_ == null ? com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.getDefaultInstance()
                  : meta_;
        }
      }

      /**
       * <code>required .jraft.SnapshotMeta meta = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta, com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.Builder, com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMetaOrBuilder> getMetaFieldBuilder() {
        if (metaBuilder_ == null) {
          metaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta, com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMeta.Builder, com.alipay.sofa.jraft.entity.RaftOutter.SnapshotMetaOrBuilder>(
                  getMeta(), getParentForChildren(), isClean());
          meta_ = null;
        }
        return metaBuilder_;
      }

      private java.lang.Object uri_ = "";

      /**
       * <code>required string uri = 6;</code>
       */
      public boolean hasUri() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }

      /**
       * <code>required string uri = 6;</code>
       */
      public java.lang.String getUri() {
        java.lang.Object ref = uri_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            uri_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string uri = 6;</code>
       */
      public com.google.protobuf.ByteString getUriBytes() {
        java.lang.Object ref = uri_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          uri_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string uri = 6;</code>
       */
      public Builder setUri(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        uri_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string uri = 6;</code>
       */
      public Builder clearUri() {
        bitField0_ = (bitField0_ & ~0x00000020);
        uri_ = getDefaultInstance().getUri();
        onChanged();
        return this;
      }

      /**
       * <code>required string uri = 6;</code>
       */
      public Builder setUriBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        uri_ = value;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.InstallSnapshotRequest)
    }

    // @@protoc_insertion_point(class_scope:jraft.InstallSnapshotRequest)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<InstallSnapshotRequest> PARSER = new com.google.protobuf.AbstractParser<InstallSnapshotRequest>() {
      public InstallSnapshotRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new InstallSnapshotRequest(
                input,
                extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InstallSnapshotRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InstallSnapshotRequest> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface InstallSnapshotResponseOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.InstallSnapshotResponse)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 term = 1;</code>
     */
    boolean hasTerm();

    /**
     * <code>required int64 term = 1;</code>
     */
    long getTerm();

    /**
     * <code>required bool success = 2;</code>
     */
    boolean hasSuccess();

    /**
     * <code>required bool success = 2;</code>
     */
    boolean getSuccess();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    boolean hasErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder();
  }

  /**
   * Protobuf type {@code jraft.InstallSnapshotResponse}
   */
  public static final class InstallSnapshotResponse extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.InstallSnapshotResponse)
          InstallSnapshotResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use InstallSnapshotResponse.newBuilder() to construct.
    private InstallSnapshotResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private InstallSnapshotResponse() {
      term_ = 0L;
      success_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private InstallSnapshotResponse(com.google.protobuf.CodedInputStream input,
                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              term_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              success_ = input.readBool();
              break;
            }
            case 794: {
              com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(
                      com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotResponse_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse.Builder.class);
    }

    private int             bitField0_;
    public static final int TERM_FIELD_NUMBER = 1;
    private long            term_;

    /**
     * <code>required int64 term = 1;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required int64 term = 1;</code>
     */
    public long getTerm() {
      return term_;
    }

    public static final int SUCCESS_FIELD_NUMBER = 2;
    private boolean         success_;

    /**
     * <code>required bool success = 2;</code>
     */
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required bool success = 2;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int                                     ERRORRESPONSE_FIELD_NUMBER = 99;
    private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse errorResponse_;

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasErrorResponse()) {
        if (!getErrorResponse().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(99, getErrorResponse());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(99, getErrorResponse());
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse other = (com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse) obj;

      boolean result = true;
      result = result && (hasTerm() == other.hasTerm());
      if (hasTerm()) {
        result = result && (getTerm() == other.getTerm());
      }
      result = result && (hasSuccess() == other.hasSuccess());
      if (hasSuccess()) {
        result = result && (getSuccess() == other.getSuccess());
      }
      result = result && (hasErrorResponse() == other.hasErrorResponse());
      if (hasErrorResponse()) {
        result = result && getErrorResponse().equals(other.getErrorResponse());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTerm()) {
        hash = (37 * hash) + TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTerm());
      }
      if (hasSuccess()) {
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSuccess());
      }
      if (hasErrorResponse()) {
        hash = (37 * hash) + ERRORRESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorResponse().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(java.nio.ByteBuffer data,
                                                                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(com.google.protobuf.ByteString data,
                                                                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(byte[] data,
                                                                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(java.io.InputStream input,
                                                                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseDelimitedFrom(java.io.InputStream input,
                                                                                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.InstallSnapshotResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.InstallSnapshotResponse)
            com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        term_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_InstallSnapshotResponse_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse result = new com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.term_ = term_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse.getDefaultInstance())
          return this;
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTerm()) {
          return false;
        }
        if (!hasSuccess()) {
          return false;
        }
        if (hasErrorResponse()) {
          if (!getErrorResponse().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse) e
                  .getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int  bitField0_;

      private long term_;

      /**
       * <code>required int64 term = 1;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public long getTerm() {
        return term_;
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder setTerm(long value) {
        bitField0_ |= 0x00000001;
        term_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000001);
        term_ = 0L;
        onChanged();
        return this;
      }

      private boolean success_;

      /**
       * <code>required bool success = 2;</code>
       */
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public boolean getSuccess() {
        return success_;
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000002;
        success_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000002);
        success_ = false;
        onChanged();
        return this;
      }

      private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse                                                                                                                                                                      errorResponse_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> errorResponseBuilder_;

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder mergeErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) && errorResponse_ != null
                  && errorResponse_ != com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()) {
            errorResponse_ = com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.newBuilder(errorResponse_)
                    .mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder>(
                  getErrorResponse(), getParentForChildren(), isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.InstallSnapshotResponse)
    }

    // @@protoc_insertion_point(class_scope:jraft.InstallSnapshotResponse)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<InstallSnapshotResponse> PARSER = new com.google.protobuf.AbstractParser<InstallSnapshotResponse>() {
      public InstallSnapshotResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new InstallSnapshotResponse(
                input,
                extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InstallSnapshotResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InstallSnapshotResponse> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.InstallSnapshotResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TimeoutNowRequestOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.TimeoutNowRequest)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string group_id = 1;</code>
     */
    boolean hasGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    java.lang.String getGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    com.google.protobuf.ByteString getGroupIdBytes();

    /**
     * <code>required string server_id = 2;</code>
     */
    boolean hasServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    java.lang.String getServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    com.google.protobuf.ByteString getServerIdBytes();

    /**
     * <code>required string peer_id = 3;</code>
     */
    boolean hasPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    java.lang.String getPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    com.google.protobuf.ByteString getPeerIdBytes();

    /**
     * <code>required int64 term = 4;</code>
     */
    boolean hasTerm();

    /**
     * <code>required int64 term = 4;</code>
     */
    long getTerm();
  }

  /**
   * Protobuf type {@code jraft.TimeoutNowRequest}
   */
  public static final class TimeoutNowRequest extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.TimeoutNowRequest)
          TimeoutNowRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use TimeoutNowRequest.newBuilder() to construct.
    private TimeoutNowRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private TimeoutNowRequest() {
      groupId_ = "";
      serverId_ = "";
      peerId_ = "";
      term_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TimeoutNowRequest(com.google.protobuf.CodedInputStream input,
                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              groupId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              serverId_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              peerId_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              term_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest.Builder.class);
    }

    private int                       bitField0_;
    public static final int           GROUP_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object groupId_;

    /**
     * <code>required string group_id = 1;</code>
     */
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           SERVER_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object serverId_;

    /**
     * <code>required string server_id = 2;</code>
     */
    public boolean hasServerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public java.lang.String getServerId() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public com.google.protobuf.ByteString getServerIdBytes() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           PEER_ID_FIELD_NUMBER = 3;
    private volatile java.lang.Object peerId_;

    /**
     * <code>required string peer_id = 3;</code>
     */
    public boolean hasPeerId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public java.lang.String getPeerId() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          peerId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public com.google.protobuf.ByteString getPeerIdBytes() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        peerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TERM_FIELD_NUMBER = 4;
    private long            term_;

    /**
     * <code>required int64 term = 4;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>required int64 term = 4;</code>
     */
    public long getTerm() {
      return term_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasGroupId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasServerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPeerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, term_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, term_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest other = (com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest) obj;

      boolean result = true;
      result = result && (hasGroupId() == other.hasGroupId());
      if (hasGroupId()) {
        result = result && getGroupId().equals(other.getGroupId());
      }
      result = result && (hasServerId() == other.hasServerId());
      if (hasServerId()) {
        result = result && getServerId().equals(other.getServerId());
      }
      result = result && (hasPeerId() == other.hasPeerId());
      if (hasPeerId()) {
        result = result && getPeerId().equals(other.getPeerId());
      }
      result = result && (hasTerm() == other.hasTerm());
      if (hasTerm()) {
        result = result && (getTerm() == other.getTerm());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasGroupId()) {
        hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
        hash = (53 * hash) + getGroupId().hashCode();
      }
      if (hasServerId()) {
        hash = (37 * hash) + SERVER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getServerId().hashCode();
      }
      if (hasPeerId()) {
        hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPeerId().hashCode();
      }
      if (hasTerm()) {
        hash = (37 * hash) + TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTerm());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(java.nio.ByteBuffer data,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(com.google.protobuf.ByteString data,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(byte[] data,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(java.io.InputStream input,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseDelimitedFrom(java.io.InputStream input,
                                                                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.TimeoutNowRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.TimeoutNowRequest)
            com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        groupId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        serverId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        peerId_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        term_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowRequest_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest result = new com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupId_ = groupId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverId_ = serverId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.peerId_ = peerId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.term_ = term_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest.getDefaultInstance())
          return this;
        if (other.hasGroupId()) {
          bitField0_ |= 0x00000001;
          groupId_ = other.groupId_;
          onChanged();
        }
        if (other.hasServerId()) {
          bitField0_ |= 0x00000002;
          serverId_ = other.serverId_;
          onChanged();
        }
        if (other.hasPeerId()) {
          bitField0_ |= 0x00000004;
          peerId_ = other.peerId_;
          onChanged();
        }
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGroupId()) {
          return false;
        }
        if (!hasServerId()) {
          return false;
        }
        if (!hasPeerId()) {
          return false;
        }
        if (!hasTerm()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int              bitField0_;

      private java.lang.Object groupId_ = "";

      /**
       * <code>required string group_id = 1;</code>
       */
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public java.lang.String getGroupId() {
        java.lang.Object ref = groupId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            groupId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString getGroupIdBytes() {
        java.lang.Object ref = groupId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          groupId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = getDefaultInstance().getGroupId();
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object serverId_ = "";

      /**
       * <code>required string server_id = 2;</code>
       */
      public boolean hasServerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public java.lang.String getServerId() {
        java.lang.Object ref = serverId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public com.google.protobuf.ByteString getServerIdBytes() {
        java.lang.Object ref = serverId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          serverId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder clearServerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverId_ = getDefaultInstance().getServerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object peerId_ = "";

      /**
       * <code>required string peer_id = 3;</code>
       */
      public boolean hasPeerId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public java.lang.String getPeerId() {
        java.lang.Object ref = peerId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            peerId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public com.google.protobuf.ByteString getPeerIdBytes() {
        java.lang.Object ref = peerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          peerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder clearPeerId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        peerId_ = getDefaultInstance().getPeerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      private long term_;

      /**
       * <code>required int64 term = 4;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public long getTerm() {
        return term_;
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public Builder setTerm(long value) {
        bitField0_ |= 0x00000008;
        term_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000008);
        term_ = 0L;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.TimeoutNowRequest)
    }

    // @@protoc_insertion_point(class_scope:jraft.TimeoutNowRequest)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<TimeoutNowRequest> PARSER = new com.google.protobuf.AbstractParser<TimeoutNowRequest>() {
      public TimeoutNowRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new TimeoutNowRequest(
                input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TimeoutNowRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TimeoutNowRequest> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TimeoutNowResponseOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.TimeoutNowResponse)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 term = 1;</code>
     */
    boolean hasTerm();

    /**
     * <code>required int64 term = 1;</code>
     */
    long getTerm();

    /**
     * <code>required bool success = 2;</code>
     */
    boolean hasSuccess();

    /**
     * <code>required bool success = 2;</code>
     */
    boolean getSuccess();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    boolean hasErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder();
  }

  /**
   * Protobuf type {@code jraft.TimeoutNowResponse}
   */
  public static final class TimeoutNowResponse extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.TimeoutNowResponse)
          TimeoutNowResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use TimeoutNowResponse.newBuilder() to construct.
    private TimeoutNowResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private TimeoutNowResponse() {
      term_ = 0L;
      success_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TimeoutNowResponse(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              term_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              success_ = input.readBool();
              break;
            }
            case 794: {
              com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(
                      com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowResponse_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse.Builder.class);
    }

    private int             bitField0_;
    public static final int TERM_FIELD_NUMBER = 1;
    private long            term_;

    /**
     * <code>required int64 term = 1;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required int64 term = 1;</code>
     */
    public long getTerm() {
      return term_;
    }

    public static final int SUCCESS_FIELD_NUMBER = 2;
    private boolean         success_;

    /**
     * <code>required bool success = 2;</code>
     */
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required bool success = 2;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int                                     ERRORRESPONSE_FIELD_NUMBER = 99;
    private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse errorResponse_;

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasErrorResponse()) {
        if (!getErrorResponse().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(99, getErrorResponse());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(99, getErrorResponse());
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse other = (com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse) obj;

      boolean result = true;
      result = result && (hasTerm() == other.hasTerm());
      if (hasTerm()) {
        result = result && (getTerm() == other.getTerm());
      }
      result = result && (hasSuccess() == other.hasSuccess());
      if (hasSuccess()) {
        result = result && (getSuccess() == other.getSuccess());
      }
      result = result && (hasErrorResponse() == other.hasErrorResponse());
      if (hasErrorResponse()) {
        result = result && getErrorResponse().equals(other.getErrorResponse());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTerm()) {
        hash = (37 * hash) + TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTerm());
      }
      if (hasSuccess()) {
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSuccess());
      }
      if (hasErrorResponse()) {
        hash = (37 * hash) + ERRORRESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorResponse().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(java.nio.ByteBuffer data,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(com.google.protobuf.ByteString data,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(byte[] data,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(java.io.InputStream input,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseDelimitedFrom(java.io.InputStream input,
                                                                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.TimeoutNowResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.TimeoutNowResponse)
            com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        term_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_TimeoutNowResponse_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse result = new com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.term_ = term_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse.getDefaultInstance())
          return this;
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTerm()) {
          return false;
        }
        if (!hasSuccess()) {
          return false;
        }
        if (hasErrorResponse()) {
          if (!getErrorResponse().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int  bitField0_;

      private long term_;

      /**
       * <code>required int64 term = 1;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public long getTerm() {
        return term_;
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder setTerm(long value) {
        bitField0_ |= 0x00000001;
        term_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000001);
        term_ = 0L;
        onChanged();
        return this;
      }

      private boolean success_;

      /**
       * <code>required bool success = 2;</code>
       */
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public boolean getSuccess() {
        return success_;
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000002;
        success_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000002);
        success_ = false;
        onChanged();
        return this;
      }

      private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse                                                                                                                                                                      errorResponse_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> errorResponseBuilder_;

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder mergeErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) && errorResponse_ != null
                  && errorResponse_ != com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()) {
            errorResponse_ = com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.newBuilder(errorResponse_)
                    .mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder>(
                  getErrorResponse(), getParentForChildren(), isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.TimeoutNowResponse)
    }

    // @@protoc_insertion_point(class_scope:jraft.TimeoutNowResponse)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<TimeoutNowResponse> PARSER = new com.google.protobuf.AbstractParser<TimeoutNowResponse>() {
      public TimeoutNowResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new TimeoutNowResponse(
                input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TimeoutNowResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TimeoutNowResponse> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.TimeoutNowResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestVoteRequestOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.RequestVoteRequest)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string group_id = 1;</code>
     */
    boolean hasGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    java.lang.String getGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    com.google.protobuf.ByteString getGroupIdBytes();

    /**
     * <code>required string server_id = 2;</code>
     */
    boolean hasServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    java.lang.String getServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    com.google.protobuf.ByteString getServerIdBytes();

    /**
     * <code>required string peer_id = 3;</code>
     */
    boolean hasPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    java.lang.String getPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    com.google.protobuf.ByteString getPeerIdBytes();

    /**
     * <code>required int64 term = 4;</code>
     */
    boolean hasTerm();

    /**
     * <code>required int64 term = 4;</code>
     */
    long getTerm();

    /**
     * <code>required int64 last_log_term = 5;</code>
     */
    boolean hasLastLogTerm();

    /**
     * <code>required int64 last_log_term = 5;</code>
     */
    long getLastLogTerm();

    /**
     * <code>required int64 last_log_index = 6;</code>
     */
    boolean hasLastLogIndex();

    /**
     * <code>required int64 last_log_index = 6;</code>
     */
    long getLastLogIndex();

    /**
     * <code>required bool pre_vote = 7;</code>
     */
    boolean hasPreVote();

    /**
     * <code>required bool pre_vote = 7;</code>
     */
    boolean getPreVote();
  }

  /**
   * Protobuf type {@code jraft.RequestVoteRequest}
   */
  public static final class RequestVoteRequest extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.RequestVoteRequest)
          RequestVoteRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use RequestVoteRequest.newBuilder() to construct.
    private RequestVoteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RequestVoteRequest() {
      groupId_ = "";
      serverId_ = "";
      peerId_ = "";
      term_ = 0L;
      lastLogTerm_ = 0L;
      lastLogIndex_ = 0L;
      preVote_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RequestVoteRequest(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              groupId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              serverId_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              peerId_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              term_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              lastLogTerm_ = input.readInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              lastLogIndex_ = input.readInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              preVote_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest.Builder.class);
    }

    private int                       bitField0_;
    public static final int           GROUP_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object groupId_;

    /**
     * <code>required string group_id = 1;</code>
     */
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           SERVER_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object serverId_;

    /**
     * <code>required string server_id = 2;</code>
     */
    public boolean hasServerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public java.lang.String getServerId() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public com.google.protobuf.ByteString getServerIdBytes() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           PEER_ID_FIELD_NUMBER = 3;
    private volatile java.lang.Object peerId_;

    /**
     * <code>required string peer_id = 3;</code>
     */
    public boolean hasPeerId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public java.lang.String getPeerId() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          peerId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public com.google.protobuf.ByteString getPeerIdBytes() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        peerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TERM_FIELD_NUMBER = 4;
    private long            term_;

    /**
     * <code>required int64 term = 4;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>required int64 term = 4;</code>
     */
    public long getTerm() {
      return term_;
    }

    public static final int LAST_LOG_TERM_FIELD_NUMBER = 5;
    private long            lastLogTerm_;

    /**
     * <code>required int64 last_log_term = 5;</code>
     */
    public boolean hasLastLogTerm() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>required int64 last_log_term = 5;</code>
     */
    public long getLastLogTerm() {
      return lastLogTerm_;
    }

    public static final int LAST_LOG_INDEX_FIELD_NUMBER = 6;
    private long            lastLogIndex_;

    /**
     * <code>required int64 last_log_index = 6;</code>
     */
    public boolean hasLastLogIndex() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }

    /**
     * <code>required int64 last_log_index = 6;</code>
     */
    public long getLastLogIndex() {
      return lastLogIndex_;
    }

    public static final int PRE_VOTE_FIELD_NUMBER = 7;
    private boolean         preVote_;

    /**
     * <code>required bool pre_vote = 7;</code>
     */
    public boolean hasPreVote() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }

    /**
     * <code>required bool pre_vote = 7;</code>
     */
    public boolean getPreVote() {
      return preVote_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasGroupId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasServerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPeerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLastLogTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLastLogIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPreVote()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, term_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, lastLogTerm_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, lastLogIndex_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, preVote_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, term_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(5, lastLogTerm_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(6, lastLogIndex_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, preVote_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest other = (com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest) obj;

      boolean result = true;
      result = result && (hasGroupId() == other.hasGroupId());
      if (hasGroupId()) {
        result = result && getGroupId().equals(other.getGroupId());
      }
      result = result && (hasServerId() == other.hasServerId());
      if (hasServerId()) {
        result = result && getServerId().equals(other.getServerId());
      }
      result = result && (hasPeerId() == other.hasPeerId());
      if (hasPeerId()) {
        result = result && getPeerId().equals(other.getPeerId());
      }
      result = result && (hasTerm() == other.hasTerm());
      if (hasTerm()) {
        result = result && (getTerm() == other.getTerm());
      }
      result = result && (hasLastLogTerm() == other.hasLastLogTerm());
      if (hasLastLogTerm()) {
        result = result && (getLastLogTerm() == other.getLastLogTerm());
      }
      result = result && (hasLastLogIndex() == other.hasLastLogIndex());
      if (hasLastLogIndex()) {
        result = result && (getLastLogIndex() == other.getLastLogIndex());
      }
      result = result && (hasPreVote() == other.hasPreVote());
      if (hasPreVote()) {
        result = result && (getPreVote() == other.getPreVote());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasGroupId()) {
        hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
        hash = (53 * hash) + getGroupId().hashCode();
      }
      if (hasServerId()) {
        hash = (37 * hash) + SERVER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getServerId().hashCode();
      }
      if (hasPeerId()) {
        hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPeerId().hashCode();
      }
      if (hasTerm()) {
        hash = (37 * hash) + TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTerm());
      }
      if (hasLastLogTerm()) {
        hash = (37 * hash) + LAST_LOG_TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLastLogTerm());
      }
      if (hasLastLogIndex()) {
        hash = (37 * hash) + LAST_LOG_INDEX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLastLogIndex());
      }
      if (hasPreVote()) {
        hash = (37 * hash) + PRE_VOTE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPreVote());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(java.nio.ByteBuffer data,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(com.google.protobuf.ByteString data,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(byte[] data,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(java.io.InputStream input,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseDelimitedFrom(java.io.InputStream input,
                                                                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.RequestVoteRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.RequestVoteRequest)
            com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        groupId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        serverId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        peerId_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        term_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        lastLogTerm_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        lastLogIndex_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        preVote_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteRequest_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest result = new com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupId_ = groupId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverId_ = serverId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.peerId_ = peerId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.term_ = term_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.lastLogTerm_ = lastLogTerm_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.lastLogIndex_ = lastLogIndex_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.preVote_ = preVote_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest.getDefaultInstance())
          return this;
        if (other.hasGroupId()) {
          bitField0_ |= 0x00000001;
          groupId_ = other.groupId_;
          onChanged();
        }
        if (other.hasServerId()) {
          bitField0_ |= 0x00000002;
          serverId_ = other.serverId_;
          onChanged();
        }
        if (other.hasPeerId()) {
          bitField0_ |= 0x00000004;
          peerId_ = other.peerId_;
          onChanged();
        }
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        if (other.hasLastLogTerm()) {
          setLastLogTerm(other.getLastLogTerm());
        }
        if (other.hasLastLogIndex()) {
          setLastLogIndex(other.getLastLogIndex());
        }
        if (other.hasPreVote()) {
          setPreVote(other.getPreVote());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGroupId()) {
          return false;
        }
        if (!hasServerId()) {
          return false;
        }
        if (!hasPeerId()) {
          return false;
        }
        if (!hasTerm()) {
          return false;
        }
        if (!hasLastLogTerm()) {
          return false;
        }
        if (!hasLastLogIndex()) {
          return false;
        }
        if (!hasPreVote()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int              bitField0_;

      private java.lang.Object groupId_ = "";

      /**
       * <code>required string group_id = 1;</code>
       */
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public java.lang.String getGroupId() {
        java.lang.Object ref = groupId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            groupId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString getGroupIdBytes() {
        java.lang.Object ref = groupId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          groupId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = getDefaultInstance().getGroupId();
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object serverId_ = "";

      /**
       * <code>required string server_id = 2;</code>
       */
      public boolean hasServerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public java.lang.String getServerId() {
        java.lang.Object ref = serverId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public com.google.protobuf.ByteString getServerIdBytes() {
        java.lang.Object ref = serverId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          serverId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder clearServerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverId_ = getDefaultInstance().getServerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object peerId_ = "";

      /**
       * <code>required string peer_id = 3;</code>
       */
      public boolean hasPeerId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public java.lang.String getPeerId() {
        java.lang.Object ref = peerId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            peerId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public com.google.protobuf.ByteString getPeerIdBytes() {
        java.lang.Object ref = peerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          peerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder clearPeerId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        peerId_ = getDefaultInstance().getPeerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      private long term_;

      /**
       * <code>required int64 term = 4;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public long getTerm() {
        return term_;
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public Builder setTerm(long value) {
        bitField0_ |= 0x00000008;
        term_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000008);
        term_ = 0L;
        onChanged();
        return this;
      }

      private long lastLogTerm_;

      /**
       * <code>required int64 last_log_term = 5;</code>
       */
      public boolean hasLastLogTerm() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>required int64 last_log_term = 5;</code>
       */
      public long getLastLogTerm() {
        return lastLogTerm_;
      }

      /**
       * <code>required int64 last_log_term = 5;</code>
       */
      public Builder setLastLogTerm(long value) {
        bitField0_ |= 0x00000010;
        lastLogTerm_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 last_log_term = 5;</code>
       */
      public Builder clearLastLogTerm() {
        bitField0_ = (bitField0_ & ~0x00000010);
        lastLogTerm_ = 0L;
        onChanged();
        return this;
      }

      private long lastLogIndex_;

      /**
       * <code>required int64 last_log_index = 6;</code>
       */
      public boolean hasLastLogIndex() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }

      /**
       * <code>required int64 last_log_index = 6;</code>
       */
      public long getLastLogIndex() {
        return lastLogIndex_;
      }

      /**
       * <code>required int64 last_log_index = 6;</code>
       */
      public Builder setLastLogIndex(long value) {
        bitField0_ |= 0x00000020;
        lastLogIndex_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 last_log_index = 6;</code>
       */
      public Builder clearLastLogIndex() {
        bitField0_ = (bitField0_ & ~0x00000020);
        lastLogIndex_ = 0L;
        onChanged();
        return this;
      }

      private boolean preVote_;

      /**
       * <code>required bool pre_vote = 7;</code>
       */
      public boolean hasPreVote() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }

      /**
       * <code>required bool pre_vote = 7;</code>
       */
      public boolean getPreVote() {
        return preVote_;
      }

      /**
       * <code>required bool pre_vote = 7;</code>
       */
      public Builder setPreVote(boolean value) {
        bitField0_ |= 0x00000040;
        preVote_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required bool pre_vote = 7;</code>
       */
      public Builder clearPreVote() {
        bitField0_ = (bitField0_ & ~0x00000040);
        preVote_ = false;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.RequestVoteRequest)
    }

    // @@protoc_insertion_point(class_scope:jraft.RequestVoteRequest)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RequestVoteRequest> PARSER = new com.google.protobuf.AbstractParser<RequestVoteRequest>() {
      public RequestVoteRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestVoteRequest(
                input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestVoteRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestVoteRequest> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestVoteResponseOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.RequestVoteResponse)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 term = 1;</code>
     */
    boolean hasTerm();

    /**
     * <code>required int64 term = 1;</code>
     */
    long getTerm();

    /**
     * <code>required bool granted = 2;</code>
     */
    boolean hasGranted();

    /**
     * <code>required bool granted = 2;</code>
     */
    boolean getGranted();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    boolean hasErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder();
  }

  /**
   * Protobuf type {@code jraft.RequestVoteResponse}
   */
  public static final class RequestVoteResponse extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.RequestVoteResponse)
          RequestVoteResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use RequestVoteResponse.newBuilder() to construct.
    private RequestVoteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RequestVoteResponse() {
      term_ = 0L;
      granted_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RequestVoteResponse(com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              term_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              granted_ = input.readBool();
              break;
            }
            case 794: {
              com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(
                      com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteResponse_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse.Builder.class);
    }

    private int             bitField0_;
    public static final int TERM_FIELD_NUMBER = 1;
    private long            term_;

    /**
     * <code>required int64 term = 1;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required int64 term = 1;</code>
     */
    public long getTerm() {
      return term_;
    }

    public static final int GRANTED_FIELD_NUMBER = 2;
    private boolean         granted_;

    /**
     * <code>required bool granted = 2;</code>
     */
    public boolean hasGranted() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required bool granted = 2;</code>
     */
    public boolean getGranted() {
      return granted_;
    }

    public static final int                                     ERRORRESPONSE_FIELD_NUMBER = 99;
    private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse errorResponse_;

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGranted()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasErrorResponse()) {
        if (!getErrorResponse().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, granted_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(99, getErrorResponse());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, granted_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(99, getErrorResponse());
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse other = (com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse) obj;

      boolean result = true;
      result = result && (hasTerm() == other.hasTerm());
      if (hasTerm()) {
        result = result && (getTerm() == other.getTerm());
      }
      result = result && (hasGranted() == other.hasGranted());
      if (hasGranted()) {
        result = result && (getGranted() == other.getGranted());
      }
      result = result && (hasErrorResponse() == other.hasErrorResponse());
      if (hasErrorResponse()) {
        result = result && getErrorResponse().equals(other.getErrorResponse());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTerm()) {
        hash = (37 * hash) + TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTerm());
      }
      if (hasGranted()) {
        hash = (37 * hash) + GRANTED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getGranted());
      }
      if (hasErrorResponse()) {
        hash = (37 * hash) + ERRORRESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorResponse().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(java.nio.ByteBuffer data,
                                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(com.google.protobuf.ByteString data,
                                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(byte[] data,
                                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(java.io.InputStream input,
                                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseDelimitedFrom(java.io.InputStream input,
                                                                                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.RequestVoteResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.RequestVoteResponse)
            com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        term_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        granted_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_RequestVoteResponse_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse result = new com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.term_ = term_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.granted_ = granted_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse.getDefaultInstance())
          return this;
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        if (other.hasGranted()) {
          setGranted(other.getGranted());
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTerm()) {
          return false;
        }
        if (!hasGranted()) {
          return false;
        }
        if (hasErrorResponse()) {
          if (!getErrorResponse().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse) e
                  .getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int  bitField0_;

      private long term_;

      /**
       * <code>required int64 term = 1;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public long getTerm() {
        return term_;
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder setTerm(long value) {
        bitField0_ |= 0x00000001;
        term_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000001);
        term_ = 0L;
        onChanged();
        return this;
      }

      private boolean granted_;

      /**
       * <code>required bool granted = 2;</code>
       */
      public boolean hasGranted() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required bool granted = 2;</code>
       */
      public boolean getGranted() {
        return granted_;
      }

      /**
       * <code>required bool granted = 2;</code>
       */
      public Builder setGranted(boolean value) {
        bitField0_ |= 0x00000002;
        granted_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required bool granted = 2;</code>
       */
      public Builder clearGranted() {
        bitField0_ = (bitField0_ & ~0x00000002);
        granted_ = false;
        onChanged();
        return this;
      }

      private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse                                                                                                                                                                      errorResponse_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> errorResponseBuilder_;

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder mergeErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) && errorResponse_ != null
                  && errorResponse_ != com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()) {
            errorResponse_ = com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.newBuilder(errorResponse_)
                    .mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder>(
                  getErrorResponse(), getParentForChildren(), isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.RequestVoteResponse)
    }

    // @@protoc_insertion_point(class_scope:jraft.RequestVoteResponse)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RequestVoteResponse> PARSER = new com.google.protobuf.AbstractParser<RequestVoteResponse>() {
      public RequestVoteResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestVoteResponse(
                input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestVoteResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestVoteResponse> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.RequestVoteResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AppendEntriesRequestHeaderOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.AppendEntriesRequestHeader)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string group_id = 1;</code>
     */
    boolean hasGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    java.lang.String getGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    com.google.protobuf.ByteString getGroupIdBytes();

    /**
     * <code>required string server_id = 2;</code>
     */
    boolean hasServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    java.lang.String getServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    com.google.protobuf.ByteString getServerIdBytes();

    /**
     * <code>required string peer_id = 3;</code>
     */
    boolean hasPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    java.lang.String getPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    com.google.protobuf.ByteString getPeerIdBytes();
  }

  /**
   * Protobuf type {@code jraft.AppendEntriesRequestHeader}
   */
  public static final class AppendEntriesRequestHeader extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.AppendEntriesRequestHeader)
          AppendEntriesRequestHeaderOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use AppendEntriesRequestHeader.newBuilder() to construct.
    private AppendEntriesRequestHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AppendEntriesRequestHeader() {
      groupId_ = "";
      serverId_ = "";
      peerId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AppendEntriesRequestHeader(com.google.protobuf.CodedInputStream input,
                                       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              groupId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              serverId_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              peerId_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequestHeader_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequestHeader_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader.Builder.class);
    }

    private int                       bitField0_;
    public static final int           GROUP_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object groupId_;

    /**
     * <code>required string group_id = 1;</code>
     */
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           SERVER_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object serverId_;

    /**
     * <code>required string server_id = 2;</code>
     */
    public boolean hasServerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public java.lang.String getServerId() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public com.google.protobuf.ByteString getServerIdBytes() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           PEER_ID_FIELD_NUMBER = 3;
    private volatile java.lang.Object peerId_;

    /**
     * <code>required string peer_id = 3;</code>
     */
    public boolean hasPeerId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public java.lang.String getPeerId() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          peerId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public com.google.protobuf.ByteString getPeerIdBytes() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        peerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasGroupId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasServerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPeerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, peerId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, peerId_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader other = (com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader) obj;

      boolean result = true;
      result = result && (hasGroupId() == other.hasGroupId());
      if (hasGroupId()) {
        result = result && getGroupId().equals(other.getGroupId());
      }
      result = result && (hasServerId() == other.hasServerId());
      if (hasServerId()) {
        result = result && getServerId().equals(other.getServerId());
      }
      result = result && (hasPeerId() == other.hasPeerId());
      if (hasPeerId()) {
        result = result && getPeerId().equals(other.getPeerId());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasGroupId()) {
        hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
        hash = (53 * hash) + getGroupId().hashCode();
      }
      if (hasServerId()) {
        hash = (37 * hash) + SERVER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getServerId().hashCode();
      }
      if (hasPeerId()) {
        hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPeerId().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(java.nio.ByteBuffer data,
                                                                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(com.google.protobuf.ByteString data,
                                                                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(byte[] data,
                                                                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(java.io.InputStream input,
                                                                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseDelimitedFrom(java.io.InputStream input,
                                                                                                      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.AppendEntriesRequestHeader}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.AppendEntriesRequestHeader)
            com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequestHeader_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequestHeader_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        groupId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        serverId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        peerId_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequestHeader_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader result = new com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupId_ = groupId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverId_ = serverId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.peerId_ = peerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader.getDefaultInstance())
          return this;
        if (other.hasGroupId()) {
          bitField0_ |= 0x00000001;
          groupId_ = other.groupId_;
          onChanged();
        }
        if (other.hasServerId()) {
          bitField0_ |= 0x00000002;
          serverId_ = other.serverId_;
          onChanged();
        }
        if (other.hasPeerId()) {
          bitField0_ |= 0x00000004;
          peerId_ = other.peerId_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGroupId()) {
          return false;
        }
        if (!hasServerId()) {
          return false;
        }
        if (!hasPeerId()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader) e
                  .getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int              bitField0_;

      private java.lang.Object groupId_ = "";

      /**
       * <code>required string group_id = 1;</code>
       */
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public java.lang.String getGroupId() {
        java.lang.Object ref = groupId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            groupId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString getGroupIdBytes() {
        java.lang.Object ref = groupId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          groupId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = getDefaultInstance().getGroupId();
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object serverId_ = "";

      /**
       * <code>required string server_id = 2;</code>
       */
      public boolean hasServerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public java.lang.String getServerId() {
        java.lang.Object ref = serverId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public com.google.protobuf.ByteString getServerIdBytes() {
        java.lang.Object ref = serverId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          serverId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder clearServerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverId_ = getDefaultInstance().getServerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object peerId_ = "";

      /**
       * <code>required string peer_id = 3;</code>
       */
      public boolean hasPeerId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public java.lang.String getPeerId() {
        java.lang.Object ref = peerId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            peerId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public com.google.protobuf.ByteString getPeerIdBytes() {
        java.lang.Object ref = peerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          peerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder clearPeerId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        peerId_ = getDefaultInstance().getPeerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.AppendEntriesRequestHeader)
    }

    // @@protoc_insertion_point(class_scope:jraft.AppendEntriesRequestHeader)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AppendEntriesRequestHeader> PARSER = new com.google.protobuf.AbstractParser<AppendEntriesRequestHeader>() {
      public AppendEntriesRequestHeader parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new AppendEntriesRequestHeader(
                input,
                extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AppendEntriesRequestHeader> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AppendEntriesRequestHeader> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestHeader getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AppendEntriesRequestOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.AppendEntriesRequest)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string group_id = 1;</code>
     */
    boolean hasGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    java.lang.String getGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    com.google.protobuf.ByteString getGroupIdBytes();

    /**
     * <code>required string server_id = 2;</code>
     */
    boolean hasServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    java.lang.String getServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    com.google.protobuf.ByteString getServerIdBytes();

    /**
     * <code>required string peer_id = 3;</code>
     */
    boolean hasPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    java.lang.String getPeerId();

    /**
     * <code>required string peer_id = 3;</code>
     */
    com.google.protobuf.ByteString getPeerIdBytes();

    /**
     * <code>required int64 term = 4;</code>
     */
    boolean hasTerm();

    /**
     * <code>required int64 term = 4;</code>
     */
    long getTerm();

    /**
     * <code>required int64 prev_log_term = 5;</code>
     */
    boolean hasPrevLogTerm();

    /**
     * <code>required int64 prev_log_term = 5;</code>
     */
    long getPrevLogTerm();

    /**
     * <code>required int64 prev_log_index = 6;</code>
     */
    boolean hasPrevLogIndex();

    /**
     * <code>required int64 prev_log_index = 6;</code>
     */
    long getPrevLogIndex();

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    java.util.List<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta> getEntriesList();

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta getEntries(int index);

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    int getEntriesCount();

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    java.util.List<? extends com.alipay.sofa.jraft.entity.RaftOutter.EntryMetaOrBuilder> getEntriesOrBuilderList();

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    com.alipay.sofa.jraft.entity.RaftOutter.EntryMetaOrBuilder getEntriesOrBuilder(int index);

    /**
     * <code>required int64 committed_index = 8;</code>
     */
    boolean hasCommittedIndex();

    /**
     * <code>required int64 committed_index = 8;</code>
     */
    long getCommittedIndex();

    /**
     * <code>optional bytes data = 9;</code>
     */
    boolean hasData();

    /**
     * <code>optional bytes data = 9;</code>
     */
    com.google.protobuf.ByteString getData();
  }

  /**
   * Protobuf type {@code jraft.AppendEntriesRequest}
   */
  public static final class AppendEntriesRequest extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.AppendEntriesRequest)
          AppendEntriesRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use AppendEntriesRequest.newBuilder() to construct.
    private AppendEntriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AppendEntriesRequest() {
      groupId_ = "";
      serverId_ = "";
      peerId_ = "";
      term_ = 0L;
      prevLogTerm_ = 0L;
      prevLogIndex_ = 0L;
      entries_ = java.util.Collections.emptyList();
      committedIndex_ = 0L;
      data_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AppendEntriesRequest(com.google.protobuf.CodedInputStream input,
                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              groupId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              serverId_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              peerId_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              term_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              prevLogTerm_ = input.readInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              prevLogIndex_ = input.readInt64();
              break;
            }
            case 58: {
              if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                entries_ = new java.util.ArrayList<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta>();
                mutable_bitField0_ |= 0x00000040;
              }
              entries_.add(input.readMessage(com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.PARSER,
                      extensionRegistry));
              break;
            }
            case 64: {
              bitField0_ |= 0x00000040;
              committedIndex_ = input.readInt64();
              break;
            }
            case 74: {
              bitField0_ |= 0x00000080;
              data_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest.Builder.class);
    }

    private int                       bitField0_;
    public static final int           GROUP_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object groupId_;

    /**
     * <code>required string group_id = 1;</code>
     */
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           SERVER_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object serverId_;

    /**
     * <code>required string server_id = 2;</code>
     */
    public boolean hasServerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public java.lang.String getServerId() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public com.google.protobuf.ByteString getServerIdBytes() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           PEER_ID_FIELD_NUMBER = 3;
    private volatile java.lang.Object peerId_;

    /**
     * <code>required string peer_id = 3;</code>
     */
    public boolean hasPeerId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public java.lang.String getPeerId() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          peerId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string peer_id = 3;</code>
     */
    public com.google.protobuf.ByteString getPeerIdBytes() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        peerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TERM_FIELD_NUMBER = 4;
    private long            term_;

    /**
     * <code>required int64 term = 4;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>required int64 term = 4;</code>
     */
    public long getTerm() {
      return term_;
    }

    public static final int PREV_LOG_TERM_FIELD_NUMBER = 5;
    private long            prevLogTerm_;

    /**
     * <code>required int64 prev_log_term = 5;</code>
     */
    public boolean hasPrevLogTerm() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>required int64 prev_log_term = 5;</code>
     */
    public long getPrevLogTerm() {
      return prevLogTerm_;
    }

    public static final int PREV_LOG_INDEX_FIELD_NUMBER = 6;
    private long            prevLogIndex_;

    /**
     * <code>required int64 prev_log_index = 6;</code>
     */
    public boolean hasPrevLogIndex() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }

    /**
     * <code>required int64 prev_log_index = 6;</code>
     */
    public long getPrevLogIndex() {
      return prevLogIndex_;
    }

    public static final int                                                   ENTRIES_FIELD_NUMBER = 7;
    private java.util.List<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta> entries_;

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    public java.util.List<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta> getEntriesList() {
      return entries_;
    }

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    public java.util.List<? extends com.alipay.sofa.jraft.entity.RaftOutter.EntryMetaOrBuilder> getEntriesOrBuilderList() {
      return entries_;
    }

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    public int getEntriesCount() {
      return entries_.size();
    }

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    public com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta getEntries(int index) {
      return entries_.get(index);
    }

    /**
     * <code>repeated .jraft.EntryMeta entries = 7;</code>
     */
    public com.alipay.sofa.jraft.entity.RaftOutter.EntryMetaOrBuilder getEntriesOrBuilder(int index) {
      return entries_.get(index);
    }

    public static final int COMMITTED_INDEX_FIELD_NUMBER = 8;
    private long            committedIndex_;

    /**
     * <code>required int64 committed_index = 8;</code>
     */
    public boolean hasCommittedIndex() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }

    /**
     * <code>required int64 committed_index = 8;</code>
     */
    public long getCommittedIndex() {
      return committedIndex_;
    }

    public static final int                DATA_FIELD_NUMBER = 9;
    private com.google.protobuf.ByteString data_;

    /**
     * <code>optional bytes data = 9;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }

    /**
     * <code>optional bytes data = 9;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasGroupId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasServerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPeerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPrevLogTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPrevLogIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCommittedIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getEntriesCount(); i++) {
        if (!getEntries(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, term_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, prevLogTerm_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, prevLogIndex_);
      }
      for (int i = 0; i < entries_.size(); i++) {
        output.writeMessage(7, entries_.get(i));
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt64(8, committedIndex_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(9, data_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serverId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, term_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(5, prevLogTerm_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(6, prevLogIndex_);
      }
      for (int i = 0; i < entries_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, entries_.get(i));
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(8, committedIndex_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(9, data_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest other = (com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest) obj;

      boolean result = true;
      result = result && (hasGroupId() == other.hasGroupId());
      if (hasGroupId()) {
        result = result && getGroupId().equals(other.getGroupId());
      }
      result = result && (hasServerId() == other.hasServerId());
      if (hasServerId()) {
        result = result && getServerId().equals(other.getServerId());
      }
      result = result && (hasPeerId() == other.hasPeerId());
      if (hasPeerId()) {
        result = result && getPeerId().equals(other.getPeerId());
      }
      result = result && (hasTerm() == other.hasTerm());
      if (hasTerm()) {
        result = result && (getTerm() == other.getTerm());
      }
      result = result && (hasPrevLogTerm() == other.hasPrevLogTerm());
      if (hasPrevLogTerm()) {
        result = result && (getPrevLogTerm() == other.getPrevLogTerm());
      }
      result = result && (hasPrevLogIndex() == other.hasPrevLogIndex());
      if (hasPrevLogIndex()) {
        result = result && (getPrevLogIndex() == other.getPrevLogIndex());
      }
      result = result && getEntriesList().equals(other.getEntriesList());
      result = result && (hasCommittedIndex() == other.hasCommittedIndex());
      if (hasCommittedIndex()) {
        result = result && (getCommittedIndex() == other.getCommittedIndex());
      }
      result = result && (hasData() == other.hasData());
      if (hasData()) {
        result = result && getData().equals(other.getData());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasGroupId()) {
        hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
        hash = (53 * hash) + getGroupId().hashCode();
      }
      if (hasServerId()) {
        hash = (37 * hash) + SERVER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getServerId().hashCode();
      }
      if (hasPeerId()) {
        hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPeerId().hashCode();
      }
      if (hasTerm()) {
        hash = (37 * hash) + TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTerm());
      }
      if (hasPrevLogTerm()) {
        hash = (37 * hash) + PREV_LOG_TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getPrevLogTerm());
      }
      if (hasPrevLogIndex()) {
        hash = (37 * hash) + PREV_LOG_INDEX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getPrevLogIndex());
      }
      if (getEntriesCount() > 0) {
        hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getEntriesList().hashCode();
      }
      if (hasCommittedIndex()) {
        hash = (37 * hash) + COMMITTED_INDEX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCommittedIndex());
      }
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(java.nio.ByteBuffer data,
                                                                                       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(com.google.protobuf.ByteString data,
                                                                                       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(byte[] data,
                                                                                       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(java.io.InputStream input,
                                                                                       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseDelimitedFrom(java.io.InputStream input,
                                                                                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.AppendEntriesRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.AppendEntriesRequest)
            com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getEntriesFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        groupId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        serverId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        peerId_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        term_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        prevLogTerm_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        prevLogIndex_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          entriesBuilder_.clear();
        }
        committedIndex_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesRequest_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest result = new com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupId_ = groupId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverId_ = serverId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.peerId_ = peerId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.term_ = term_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.prevLogTerm_ = prevLogTerm_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.prevLogIndex_ = prevLogIndex_;
        if (entriesBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)) {
            entries_ = java.util.Collections.unmodifiableList(entries_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.entries_ = entries_;
        } else {
          result.entries_ = entriesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000040;
        }
        result.committedIndex_ = committedIndex_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000080;
        }
        result.data_ = data_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest.getDefaultInstance())
          return this;
        if (other.hasGroupId()) {
          bitField0_ |= 0x00000001;
          groupId_ = other.groupId_;
          onChanged();
        }
        if (other.hasServerId()) {
          bitField0_ |= 0x00000002;
          serverId_ = other.serverId_;
          onChanged();
        }
        if (other.hasPeerId()) {
          bitField0_ |= 0x00000004;
          peerId_ = other.peerId_;
          onChanged();
        }
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        if (other.hasPrevLogTerm()) {
          setPrevLogTerm(other.getPrevLogTerm());
        }
        if (other.hasPrevLogIndex()) {
          setPrevLogIndex(other.getPrevLogIndex());
        }
        if (entriesBuilder_ == null) {
          if (!other.entries_.isEmpty()) {
            if (entries_.isEmpty()) {
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensureEntriesIsMutable();
              entries_.addAll(other.entries_);
            }
            onChanged();
          }
        } else {
          if (!other.entries_.isEmpty()) {
            if (entriesBuilder_.isEmpty()) {
              entriesBuilder_.dispose();
              entriesBuilder_ = null;
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000040);
              entriesBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getEntriesFieldBuilder()
                      : null;
            } else {
              entriesBuilder_.addAllMessages(other.entries_);
            }
          }
        }
        if (other.hasCommittedIndex()) {
          setCommittedIndex(other.getCommittedIndex());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGroupId()) {
          return false;
        }
        if (!hasServerId()) {
          return false;
        }
        if (!hasPeerId()) {
          return false;
        }
        if (!hasTerm()) {
          return false;
        }
        if (!hasPrevLogTerm()) {
          return false;
        }
        if (!hasPrevLogIndex()) {
          return false;
        }
        if (!hasCommittedIndex()) {
          return false;
        }
        for (int i = 0; i < getEntriesCount(); i++) {
          if (!getEntries(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest) e
                  .getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int              bitField0_;

      private java.lang.Object groupId_ = "";

      /**
       * <code>required string group_id = 1;</code>
       */
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public java.lang.String getGroupId() {
        java.lang.Object ref = groupId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            groupId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString getGroupIdBytes() {
        java.lang.Object ref = groupId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          groupId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = getDefaultInstance().getGroupId();
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object serverId_ = "";

      /**
       * <code>required string server_id = 2;</code>
       */
      public boolean hasServerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public java.lang.String getServerId() {
        java.lang.Object ref = serverId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public com.google.protobuf.ByteString getServerIdBytes() {
        java.lang.Object ref = serverId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          serverId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder clearServerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverId_ = getDefaultInstance().getServerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object peerId_ = "";

      /**
       * <code>required string peer_id = 3;</code>
       */
      public boolean hasPeerId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public java.lang.String getPeerId() {
        java.lang.Object ref = peerId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            peerId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public com.google.protobuf.ByteString getPeerIdBytes() {
        java.lang.Object ref = peerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          peerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder clearPeerId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        peerId_ = getDefaultInstance().getPeerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string peer_id = 3;</code>
       */
      public Builder setPeerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        peerId_ = value;
        onChanged();
        return this;
      }

      private long term_;

      /**
       * <code>required int64 term = 4;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public long getTerm() {
        return term_;
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public Builder setTerm(long value) {
        bitField0_ |= 0x00000008;
        term_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 term = 4;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000008);
        term_ = 0L;
        onChanged();
        return this;
      }

      private long prevLogTerm_;

      /**
       * <code>required int64 prev_log_term = 5;</code>
       */
      public boolean hasPrevLogTerm() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>required int64 prev_log_term = 5;</code>
       */
      public long getPrevLogTerm() {
        return prevLogTerm_;
      }

      /**
       * <code>required int64 prev_log_term = 5;</code>
       */
      public Builder setPrevLogTerm(long value) {
        bitField0_ |= 0x00000010;
        prevLogTerm_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 prev_log_term = 5;</code>
       */
      public Builder clearPrevLogTerm() {
        bitField0_ = (bitField0_ & ~0x00000010);
        prevLogTerm_ = 0L;
        onChanged();
        return this;
      }

      private long prevLogIndex_;

      /**
       * <code>required int64 prev_log_index = 6;</code>
       */
      public boolean hasPrevLogIndex() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }

      /**
       * <code>required int64 prev_log_index = 6;</code>
       */
      public long getPrevLogIndex() {
        return prevLogIndex_;
      }

      /**
       * <code>required int64 prev_log_index = 6;</code>
       */
      public Builder setPrevLogIndex(long value) {
        bitField0_ |= 0x00000020;
        prevLogIndex_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 prev_log_index = 6;</code>
       */
      public Builder clearPrevLogIndex() {
        bitField0_ = (bitField0_ & ~0x00000020);
        prevLogIndex_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta> entries_ = java.util.Collections
              .emptyList();

      private void ensureEntriesIsMutable() {
        if (!((bitField0_ & 0x00000040) == 0x00000040)) {
          entries_ = new java.util.ArrayList<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta>(entries_);
          bitField0_ |= 0x00000040;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta, com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder, com.alipay.sofa.jraft.entity.RaftOutter.EntryMetaOrBuilder> entriesBuilder_;

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public java.util.List<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta> getEntriesList() {
        if (entriesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entries_);
        } else {
          return entriesBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public int getEntriesCount() {
        if (entriesBuilder_ == null) {
          return entries_.size();
        } else {
          return entriesBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta getEntries(int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);
        } else {
          return entriesBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public Builder setEntries(int index, com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.set(index, value);
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public Builder setEntries(int index,
                                com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.set(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public Builder addEntries(com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public Builder addEntries(int index, com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(index, value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public Builder addEntries(com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public Builder addEntries(int index,
                                com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public Builder addAllEntries(java.lang.Iterable<? extends com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta> values) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entries_);
          onChanged();
        } else {
          entriesBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public Builder clearEntries() {
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          entriesBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public Builder removeEntries(int index) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.remove(index);
          onChanged();
        } else {
          entriesBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder getEntriesBuilder(int index) {
        return getEntriesFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public com.alipay.sofa.jraft.entity.RaftOutter.EntryMetaOrBuilder getEntriesOrBuilder(int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);
        } else {
          return entriesBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public java.util.List<? extends com.alipay.sofa.jraft.entity.RaftOutter.EntryMetaOrBuilder> getEntriesOrBuilderList() {
        if (entriesBuilder_ != null) {
          return entriesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entries_);
        }
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder addEntriesBuilder() {
        return getEntriesFieldBuilder().addBuilder(
                com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.getDefaultInstance());
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder addEntriesBuilder(int index) {
        return getEntriesFieldBuilder().addBuilder(index,
                com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.getDefaultInstance());
      }

      /**
       * <code>repeated .jraft.EntryMeta entries = 7;</code>
       */
      public java.util.List<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder> getEntriesBuilderList() {
        return getEntriesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta, com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder, com.alipay.sofa.jraft.entity.RaftOutter.EntryMetaOrBuilder> getEntriesFieldBuilder() {
        if (entriesBuilder_ == null) {
          entriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta, com.alipay.sofa.jraft.entity.RaftOutter.EntryMeta.Builder, com.alipay.sofa.jraft.entity.RaftOutter.EntryMetaOrBuilder>(
                  entries_, ((bitField0_ & 0x00000040) == 0x00000040), getParentForChildren(), isClean());
          entries_ = null;
        }
        return entriesBuilder_;
      }

      private long committedIndex_;

      /**
       * <code>required int64 committed_index = 8;</code>
       */
      public boolean hasCommittedIndex() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }

      /**
       * <code>required int64 committed_index = 8;</code>
       */
      public long getCommittedIndex() {
        return committedIndex_;
      }

      /**
       * <code>required int64 committed_index = 8;</code>
       */
      public Builder setCommittedIndex(long value) {
        bitField0_ |= 0x00000080;
        committedIndex_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 committed_index = 8;</code>
       */
      public Builder clearCommittedIndex() {
        bitField0_ = (bitField0_ & ~0x00000080);
        committedIndex_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;

      /**
       * <code>optional bytes data = 9;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }

      /**
       * <code>optional bytes data = 9;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }

      /**
       * <code>optional bytes data = 9;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000100;
        data_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes data = 9;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000100);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.AppendEntriesRequest)
    }

    // @@protoc_insertion_point(class_scope:jraft.AppendEntriesRequest)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AppendEntriesRequest> PARSER = new com.google.protobuf.AbstractParser<AppendEntriesRequest>() {
      public AppendEntriesRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new AppendEntriesRequest(
                input,
                extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AppendEntriesRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AppendEntriesRequest> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AppendEntriesResponseOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.AppendEntriesResponse)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 term = 1;</code>
     */
    boolean hasTerm();

    /**
     * <code>required int64 term = 1;</code>
     */
    long getTerm();

    /**
     * <code>required bool success = 2;</code>
     */
    boolean hasSuccess();

    /**
     * <code>required bool success = 2;</code>
     */
    boolean getSuccess();

    /**
     * <code>optional int64 last_log_index = 3;</code>
     */
    boolean hasLastLogIndex();

    /**
     * <code>optional int64 last_log_index = 3;</code>
     */
    long getLastLogIndex();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    boolean hasErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder();
  }

  /**
   * Protobuf type {@code jraft.AppendEntriesResponse}
   */
  public static final class AppendEntriesResponse extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.AppendEntriesResponse)
          AppendEntriesResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use AppendEntriesResponse.newBuilder() to construct.
    private AppendEntriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AppendEntriesResponse() {
      term_ = 0L;
      success_ = false;
      lastLogIndex_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AppendEntriesResponse(com.google.protobuf.CodedInputStream input,
                                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              term_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              success_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              lastLogIndex_ = input.readInt64();
              break;
            }
            case 794: {
              com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(
                      com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesResponse_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse.Builder.class);
    }

    private int             bitField0_;
    public static final int TERM_FIELD_NUMBER = 1;
    private long            term_;

    /**
     * <code>required int64 term = 1;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required int64 term = 1;</code>
     */
    public long getTerm() {
      return term_;
    }

    public static final int SUCCESS_FIELD_NUMBER = 2;
    private boolean         success_;

    /**
     * <code>required bool success = 2;</code>
     */
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required bool success = 2;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int LAST_LOG_INDEX_FIELD_NUMBER = 3;
    private long            lastLogIndex_;

    /**
     * <code>optional int64 last_log_index = 3;</code>
     */
    public boolean hasLastLogIndex() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional int64 last_log_index = 3;</code>
     */
    public long getLastLogIndex() {
      return lastLogIndex_;
    }

    public static final int                                     ERRORRESPONSE_FIELD_NUMBER = 99;
    private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse errorResponse_;

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasErrorResponse()) {
        if (!getErrorResponse().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, lastLogIndex_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(99, getErrorResponse());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, lastLogIndex_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(99, getErrorResponse());
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse other = (com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse) obj;

      boolean result = true;
      result = result && (hasTerm() == other.hasTerm());
      if (hasTerm()) {
        result = result && (getTerm() == other.getTerm());
      }
      result = result && (hasSuccess() == other.hasSuccess());
      if (hasSuccess()) {
        result = result && (getSuccess() == other.getSuccess());
      }
      result = result && (hasLastLogIndex() == other.hasLastLogIndex());
      if (hasLastLogIndex()) {
        result = result && (getLastLogIndex() == other.getLastLogIndex());
      }
      result = result && (hasErrorResponse() == other.hasErrorResponse());
      if (hasErrorResponse()) {
        result = result && getErrorResponse().equals(other.getErrorResponse());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTerm()) {
        hash = (37 * hash) + TERM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTerm());
      }
      if (hasSuccess()) {
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSuccess());
      }
      if (hasLastLogIndex()) {
        hash = (37 * hash) + LAST_LOG_INDEX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLastLogIndex());
      }
      if (hasErrorResponse()) {
        hash = (37 * hash) + ERRORRESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorResponse().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(java.nio.ByteBuffer data,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(com.google.protobuf.ByteString data,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(byte[] data,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(java.io.InputStream input,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseDelimitedFrom(java.io.InputStream input,
                                                                                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.AppendEntriesResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.AppendEntriesResponse)
            com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        term_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        lastLogIndex_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_AppendEntriesResponse_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse result = new com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.term_ = term_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.lastLogIndex_ = lastLogIndex_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse.getDefaultInstance())
          return this;
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasLastLogIndex()) {
          setLastLogIndex(other.getLastLogIndex());
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTerm()) {
          return false;
        }
        if (!hasSuccess()) {
          return false;
        }
        if (hasErrorResponse()) {
          if (!getErrorResponse().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse) e
                  .getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int  bitField0_;

      private long term_;

      /**
       * <code>required int64 term = 1;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public long getTerm() {
        return term_;
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder setTerm(long value) {
        bitField0_ |= 0x00000001;
        term_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 term = 1;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000001);
        term_ = 0L;
        onChanged();
        return this;
      }

      private boolean success_;

      /**
       * <code>required bool success = 2;</code>
       */
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public boolean getSuccess() {
        return success_;
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000002;
        success_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000002);
        success_ = false;
        onChanged();
        return this;
      }

      private long lastLogIndex_;

      /**
       * <code>optional int64 last_log_index = 3;</code>
       */
      public boolean hasLastLogIndex() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional int64 last_log_index = 3;</code>
       */
      public long getLastLogIndex() {
        return lastLogIndex_;
      }

      /**
       * <code>optional int64 last_log_index = 3;</code>
       */
      public Builder setLastLogIndex(long value) {
        bitField0_ |= 0x00000004;
        lastLogIndex_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional int64 last_log_index = 3;</code>
       */
      public Builder clearLastLogIndex() {
        bitField0_ = (bitField0_ & ~0x00000004);
        lastLogIndex_ = 0L;
        onChanged();
        return this;
      }

      private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse                                                                                                                                                                      errorResponse_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> errorResponseBuilder_;

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder mergeErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) && errorResponse_ != null
                  && errorResponse_ != com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()) {
            errorResponse_ = com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.newBuilder(errorResponse_)
                    .mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder>(
                  getErrorResponse(), getParentForChildren(), isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.AppendEntriesResponse)
    }

    // @@protoc_insertion_point(class_scope:jraft.AppendEntriesResponse)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AppendEntriesResponse> PARSER = new com.google.protobuf.AbstractParser<AppendEntriesResponse>() {
      public AppendEntriesResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new AppendEntriesResponse(
                input,
                extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AppendEntriesResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AppendEntriesResponse> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.AppendEntriesResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetFileRequestOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.GetFileRequest)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 reader_id = 1;</code>
     */
    boolean hasReaderId();

    /**
     * <code>required int64 reader_id = 1;</code>
     */
    long getReaderId();

    /**
     * <code>required string filename = 2;</code>
     */
    boolean hasFilename();

    /**
     * <code>required string filename = 2;</code>
     */
    java.lang.String getFilename();

    /**
     * <code>required string filename = 2;</code>
     */
    com.google.protobuf.ByteString getFilenameBytes();

    /**
     * <code>required int64 count = 3;</code>
     */
    boolean hasCount();

    /**
     * <code>required int64 count = 3;</code>
     */
    long getCount();

    /**
     * <code>required int64 offset = 4;</code>
     */
    boolean hasOffset();

    /**
     * <code>required int64 offset = 4;</code>
     */
    long getOffset();

    /**
     * <code>optional bool read_partly = 5;</code>
     */
    boolean hasReadPartly();

    /**
     * <code>optional bool read_partly = 5;</code>
     */
    boolean getReadPartly();
  }

  /**
   * Protobuf type {@code jraft.GetFileRequest}
   */
  public static final class GetFileRequest extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.GetFileRequest)
          GetFileRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use GetFileRequest.newBuilder() to construct.
    private GetFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private GetFileRequest() {
      readerId_ = 0L;
      filename_ = "";
      count_ = 0L;
      offset_ = 0L;
      readPartly_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private GetFileRequest(com.google.protobuf.CodedInputStream input,
                           com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              readerId_ = input.readInt64();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              filename_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              count_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              offset_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              readPartly_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest.Builder.class);
    }

    private int             bitField0_;
    public static final int READER_ID_FIELD_NUMBER = 1;
    private long            readerId_;

    /**
     * <code>required int64 reader_id = 1;</code>
     */
    public boolean hasReaderId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required int64 reader_id = 1;</code>
     */
    public long getReaderId() {
      return readerId_;
    }

    public static final int           FILENAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object filename_;

    /**
     * <code>required string filename = 2;</code>
     */
    public boolean hasFilename() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required string filename = 2;</code>
     */
    public java.lang.String getFilename() {
      java.lang.Object ref = filename_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          filename_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string filename = 2;</code>
     */
    public com.google.protobuf.ByteString getFilenameBytes() {
      java.lang.Object ref = filename_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COUNT_FIELD_NUMBER = 3;
    private long            count_;

    /**
     * <code>required int64 count = 3;</code>
     */
    public boolean hasCount() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>required int64 count = 3;</code>
     */
    public long getCount() {
      return count_;
    }

    public static final int OFFSET_FIELD_NUMBER = 4;
    private long            offset_;

    /**
     * <code>required int64 offset = 4;</code>
     */
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>required int64 offset = 4;</code>
     */
    public long getOffset() {
      return offset_;
    }

    public static final int READ_PARTLY_FIELD_NUMBER = 5;
    private boolean         readPartly_;

    /**
     * <code>optional bool read_partly = 5;</code>
     */
    public boolean hasReadPartly() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional bool read_partly = 5;</code>
     */
    public boolean getReadPartly() {
      return readPartly_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasReaderId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFilename()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOffset()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, readerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filename_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, count_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, offset_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, readPartly_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, readerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filename_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, count_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, offset_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, readPartly_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest other = (com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest) obj;

      boolean result = true;
      result = result && (hasReaderId() == other.hasReaderId());
      if (hasReaderId()) {
        result = result && (getReaderId() == other.getReaderId());
      }
      result = result && (hasFilename() == other.hasFilename());
      if (hasFilename()) {
        result = result && getFilename().equals(other.getFilename());
      }
      result = result && (hasCount() == other.hasCount());
      if (hasCount()) {
        result = result && (getCount() == other.getCount());
      }
      result = result && (hasOffset() == other.hasOffset());
      if (hasOffset()) {
        result = result && (getOffset() == other.getOffset());
      }
      result = result && (hasReadPartly() == other.hasReadPartly());
      if (hasReadPartly()) {
        result = result && (getReadPartly() == other.getReadPartly());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasReaderId()) {
        hash = (37 * hash) + READER_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getReaderId());
      }
      if (hasFilename()) {
        hash = (37 * hash) + FILENAME_FIELD_NUMBER;
        hash = (53 * hash) + getFilename().hashCode();
      }
      if (hasCount()) {
        hash = (37 * hash) + COUNT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCount());
      }
      if (hasOffset()) {
        hash = (37 * hash) + OFFSET_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getOffset());
      }
      if (hasReadPartly()) {
        hash = (37 * hash) + READ_PARTLY_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getReadPartly());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(java.nio.ByteBuffer data,
                                                                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(com.google.protobuf.ByteString data,
                                                                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(byte[] data,
                                                                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(java.io.InputStream input,
                                                                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseDelimitedFrom(java.io.InputStream input,
                                                                                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                 com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.GetFileRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.GetFileRequest)
            com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        readerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        filename_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        count_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        offset_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        readPartly_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileRequest_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest result = new com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.readerId_ = readerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.filename_ = filename_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.count_ = count_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.offset_ = offset_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.readPartly_ = readPartly_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest.getDefaultInstance())
          return this;
        if (other.hasReaderId()) {
          setReaderId(other.getReaderId());
        }
        if (other.hasFilename()) {
          bitField0_ |= 0x00000002;
          filename_ = other.filename_;
          onChanged();
        }
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        if (other.hasOffset()) {
          setOffset(other.getOffset());
        }
        if (other.hasReadPartly()) {
          setReadPartly(other.getReadPartly());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasReaderId()) {
          return false;
        }
        if (!hasFilename()) {
          return false;
        }
        if (!hasCount()) {
          return false;
        }
        if (!hasOffset()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int  bitField0_;

      private long readerId_;

      /**
       * <code>required int64 reader_id = 1;</code>
       */
      public boolean hasReaderId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required int64 reader_id = 1;</code>
       */
      public long getReaderId() {
        return readerId_;
      }

      /**
       * <code>required int64 reader_id = 1;</code>
       */
      public Builder setReaderId(long value) {
        bitField0_ |= 0x00000001;
        readerId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 reader_id = 1;</code>
       */
      public Builder clearReaderId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        readerId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object filename_ = "";

      /**
       * <code>required string filename = 2;</code>
       */
      public boolean hasFilename() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required string filename = 2;</code>
       */
      public java.lang.String getFilename() {
        java.lang.Object ref = filename_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            filename_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string filename = 2;</code>
       */
      public com.google.protobuf.ByteString getFilenameBytes() {
        java.lang.Object ref = filename_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          filename_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string filename = 2;</code>
       */
      public Builder setFilename(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        filename_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string filename = 2;</code>
       */
      public Builder clearFilename() {
        bitField0_ = (bitField0_ & ~0x00000002);
        filename_ = getDefaultInstance().getFilename();
        onChanged();
        return this;
      }

      /**
       * <code>required string filename = 2;</code>
       */
      public Builder setFilenameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        filename_ = value;
        onChanged();
        return this;
      }

      private long count_;

      /**
       * <code>required int64 count = 3;</code>
       */
      public boolean hasCount() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>required int64 count = 3;</code>
       */
      public long getCount() {
        return count_;
      }

      /**
       * <code>required int64 count = 3;</code>
       */
      public Builder setCount(long value) {
        bitField0_ |= 0x00000004;
        count_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 count = 3;</code>
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000004);
        count_ = 0L;
        onChanged();
        return this;
      }

      private long offset_;

      /**
       * <code>required int64 offset = 4;</code>
       */
      public boolean hasOffset() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>required int64 offset = 4;</code>
       */
      public long getOffset() {
        return offset_;
      }

      /**
       * <code>required int64 offset = 4;</code>
       */
      public Builder setOffset(long value) {
        bitField0_ |= 0x00000008;
        offset_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 offset = 4;</code>
       */
      public Builder clearOffset() {
        bitField0_ = (bitField0_ & ~0x00000008);
        offset_ = 0L;
        onChanged();
        return this;
      }

      private boolean readPartly_;

      /**
       * <code>optional bool read_partly = 5;</code>
       */
      public boolean hasReadPartly() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional bool read_partly = 5;</code>
       */
      public boolean getReadPartly() {
        return readPartly_;
      }

      /**
       * <code>optional bool read_partly = 5;</code>
       */
      public Builder setReadPartly(boolean value) {
        bitField0_ |= 0x00000010;
        readPartly_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bool read_partly = 5;</code>
       */
      public Builder clearReadPartly() {
        bitField0_ = (bitField0_ & ~0x00000010);
        readPartly_ = false;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.GetFileRequest)
    }

    // @@protoc_insertion_point(class_scope:jraft.GetFileRequest)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<GetFileRequest> PARSER = new com.google.protobuf.AbstractParser<GetFileRequest>() {
      public GetFileRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetFileRequest(input,
                extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetFileRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetFileRequest> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.GetFileRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetFileResponseOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.GetFileResponse)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Data is in attachment
     * </pre>
     *
     * <code>required bool eof = 1;</code>
     */
    boolean hasEof();

    /**
     * <pre>
     * Data is in attachment
     * </pre>
     *
     * <code>required bool eof = 1;</code>
     */
    boolean getEof();

    /**
     * <code>required bytes data = 2;</code>
     */
    boolean hasData();

    /**
     * <code>required bytes data = 2;</code>
     */
    com.google.protobuf.ByteString getData();

    /**
     * <code>optional int64 read_size = 3;</code>
     */
    boolean hasReadSize();

    /**
     * <code>optional int64 read_size = 3;</code>
     */
    long getReadSize();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    boolean hasErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder();
  }

  /**
   * Protobuf type {@code jraft.GetFileResponse}
   */
  public static final class GetFileResponse extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.GetFileResponse)
          GetFileResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use GetFileResponse.newBuilder() to construct.
    private GetFileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private GetFileResponse() {
      eof_ = false;
      data_ = com.google.protobuf.ByteString.EMPTY;
      readSize_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private GetFileResponse(com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              eof_ = input.readBool();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              data_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              readSize_ = input.readInt64();
              break;
            }
            case 794: {
              com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(
                      com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileResponse_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse.Builder.class);
    }

    private int             bitField0_;
    public static final int EOF_FIELD_NUMBER = 1;
    private boolean         eof_;

    /**
     * <pre>
     * Data is in attachment
     * </pre>
     *
     * <code>required bool eof = 1;</code>
     */
    public boolean hasEof() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <pre>
     * Data is in attachment
     * </pre>
     *
     * <code>required bool eof = 1;</code>
     */
    public boolean getEof() {
      return eof_;
    }

    public static final int                DATA_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString data_;

    /**
     * <code>required bytes data = 2;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required bytes data = 2;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    public static final int READ_SIZE_FIELD_NUMBER = 3;
    private long            readSize_;

    /**
     * <code>optional int64 read_size = 3;</code>
     */
    public boolean hasReadSize() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional int64 read_size = 3;</code>
     */
    public long getReadSize() {
      return readSize_;
    }

    public static final int                                     ERRORRESPONSE_FIELD_NUMBER = 99;
    private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse errorResponse_;

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasEof()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasErrorResponse()) {
        if (!getErrorResponse().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, eof_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, readSize_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(99, getErrorResponse());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, eof_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, data_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, readSize_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(99, getErrorResponse());
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse other = (com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse) obj;

      boolean result = true;
      result = result && (hasEof() == other.hasEof());
      if (hasEof()) {
        result = result && (getEof() == other.getEof());
      }
      result = result && (hasData() == other.hasData());
      if (hasData()) {
        result = result && getData().equals(other.getData());
      }
      result = result && (hasReadSize() == other.hasReadSize());
      if (hasReadSize()) {
        result = result && (getReadSize() == other.getReadSize());
      }
      result = result && (hasErrorResponse() == other.hasErrorResponse());
      if (hasErrorResponse()) {
        result = result && getErrorResponse().equals(other.getErrorResponse());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasEof()) {
        hash = (37 * hash) + EOF_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEof());
      }
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      if (hasReadSize()) {
        hash = (37 * hash) + READ_SIZE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getReadSize());
      }
      if (hasErrorResponse()) {
        hash = (37 * hash) + ERRORRESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorResponse().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(java.nio.ByteBuffer data,
                                                                                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(com.google.protobuf.ByteString data,
                                                                                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(byte[] data,
                                                                                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(java.io.InputStream input,
                                                                                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseDelimitedFrom(java.io.InputStream input,
                                                                                           com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.GetFileResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.GetFileResponse)
            com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        eof_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        readSize_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_GetFileResponse_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse result = new com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.eof_ = eof_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.data_ = data_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.readSize_ = readSize_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse.getDefaultInstance())
          return this;
        if (other.hasEof()) {
          setEof(other.getEof());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        if (other.hasReadSize()) {
          setReadSize(other.getReadSize());
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasEof()) {
          return false;
        }
        if (!hasData()) {
          return false;
        }
        if (hasErrorResponse()) {
          if (!getErrorResponse().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int     bitField0_;

      private boolean eof_;

      /**
       * <pre>
       * Data is in attachment
       * </pre>
       *
       * <code>required bool eof = 1;</code>
       */
      public boolean hasEof() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <pre>
       * Data is in attachment
       * </pre>
       *
       * <code>required bool eof = 1;</code>
       */
      public boolean getEof() {
        return eof_;
      }

      /**
       * <pre>
       * Data is in attachment
       * </pre>
       *
       * <code>required bool eof = 1;</code>
       */
      public Builder setEof(boolean value) {
        bitField0_ |= 0x00000001;
        eof_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       * Data is in attachment
       * </pre>
       *
       * <code>required bool eof = 1;</code>
       */
      public Builder clearEof() {
        bitField0_ = (bitField0_ & ~0x00000001);
        eof_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;

      /**
       * <code>required bytes data = 2;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required bytes data = 2;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }

      /**
       * <code>required bytes data = 2;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        data_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required bytes data = 2;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      private long readSize_;

      /**
       * <code>optional int64 read_size = 3;</code>
       */
      public boolean hasReadSize() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional int64 read_size = 3;</code>
       */
      public long getReadSize() {
        return readSize_;
      }

      /**
       * <code>optional int64 read_size = 3;</code>
       */
      public Builder setReadSize(long value) {
        bitField0_ |= 0x00000004;
        readSize_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional int64 read_size = 3;</code>
       */
      public Builder clearReadSize() {
        bitField0_ = (bitField0_ & ~0x00000004);
        readSize_ = 0L;
        onChanged();
        return this;
      }

      private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse                                                                                                                                                                      errorResponse_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> errorResponseBuilder_;

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder mergeErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) && errorResponse_ != null
                  && errorResponse_ != com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()) {
            errorResponse_ = com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.newBuilder(errorResponse_)
                    .mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder>(
                  getErrorResponse(), getParentForChildren(), isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.GetFileResponse)
    }

    // @@protoc_insertion_point(class_scope:jraft.GetFileResponse)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<GetFileResponse> PARSER = new com.google.protobuf.AbstractParser<GetFileResponse>() {
      public GetFileResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetFileResponse(
                input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetFileResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetFileResponse> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.GetFileResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReadIndexRequestOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.ReadIndexRequest)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string group_id = 1;</code>
     */
    boolean hasGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    java.lang.String getGroupId();

    /**
     * <code>required string group_id = 1;</code>
     */
    com.google.protobuf.ByteString getGroupIdBytes();

    /**
     * <code>required string server_id = 2;</code>
     */
    boolean hasServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    java.lang.String getServerId();

    /**
     * <code>required string server_id = 2;</code>
     */
    com.google.protobuf.ByteString getServerIdBytes();

    /**
     * <code>repeated bytes entries = 3;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getEntriesList();

    /**
     * <code>repeated bytes entries = 3;</code>
     */
    int getEntriesCount();

    /**
     * <code>repeated bytes entries = 3;</code>
     */
    com.google.protobuf.ByteString getEntries(int index);

    /**
     * <code>optional string peer_id = 4;</code>
     */
    boolean hasPeerId();

    /**
     * <code>optional string peer_id = 4;</code>
     */
    java.lang.String getPeerId();

    /**
     * <code>optional string peer_id = 4;</code>
     */
    com.google.protobuf.ByteString getPeerIdBytes();

    /**
     * <code>optional .jraft.ReadOnlyType readOnlyOptions = 5;</code>
     */
    boolean hasReadOnlyOptions();

    /**
     * <code>optional .jraft.ReadOnlyType readOnlyOptions = 5;</code>
     */
    com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType getReadOnlyOptions();
  }

  /**
   * Protobuf type {@code jraft.ReadIndexRequest}
   */
  public static final class ReadIndexRequest extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.ReadIndexRequest)
          ReadIndexRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ReadIndexRequest.newBuilder() to construct.
    private ReadIndexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ReadIndexRequest() {
      groupId_ = "";
      serverId_ = "";
      entries_ = java.util.Collections.emptyList();
      peerId_ = "";
      readOnlyOptions_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ReadIndexRequest(com.google.protobuf.CodedInputStream input,
                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              groupId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              serverId_ = bs;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                entries_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000004;
              }
              entries_.add(input.readBytes());
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              peerId_ = bs;
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
              com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType value = com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType
                      .valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                readOnlyOptions_ = rawValue;
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexRequest_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest.Builder.class);
    }

    private int                       bitField0_;
    public static final int           GROUP_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object groupId_;

    /**
     * <code>required string group_id = 1;</code>
     */
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int           SERVER_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object serverId_;

    /**
     * <code>required string server_id = 2;</code>
     */
    public boolean hasServerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public java.lang.String getServerId() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string server_id = 2;</code>
     */
    public com.google.protobuf.ByteString getServerIdBytes() {
      java.lang.Object ref = serverId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int                                ENTRIES_FIELD_NUMBER = 3;
    private java.util.List<com.google.protobuf.ByteString> entries_;

    /**
     * <code>repeated bytes entries = 3;</code>
     */
    public java.util.List<com.google.protobuf.ByteString> getEntriesList() {
      return entries_;
    }

    /**
     * <code>repeated bytes entries = 3;</code>
     */
    public int getEntriesCount() {
      return entries_.size();
    }

    /**
     * <code>repeated bytes entries = 3;</code>
     */
    public com.google.protobuf.ByteString getEntries(int index) {
      return entries_.get(index);
    }

    public static final int           PEER_ID_FIELD_NUMBER = 4;
    private volatile java.lang.Object peerId_;

    /**
     * <code>optional string peer_id = 4;</code>
     */
    public boolean hasPeerId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional string peer_id = 4;</code>
     */
    public java.lang.String getPeerId() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          peerId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string peer_id = 4;</code>
     */
    public com.google.protobuf.ByteString getPeerIdBytes() {
      java.lang.Object ref = peerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        peerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int READONLYOPTIONS_FIELD_NUMBER = 5;
    private int             readOnlyOptions_;

    /**
     * <code>optional .jraft.ReadOnlyType readOnlyOptions = 5;</code>
     */
    public boolean hasReadOnlyOptions() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional .jraft.ReadOnlyType readOnlyOptions = 5;</code>
     */
    public com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType getReadOnlyOptions() {
      com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType result = com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType
              .valueOf(readOnlyOptions_);
      return result == null ? com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType.READ_ONLY_SAFE : result;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasGroupId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasServerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serverId_);
      }
      for (int i = 0; i < entries_.size(); i++) {
        output.writeBytes(3, entries_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(5, readOnlyOptions_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serverId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < entries_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream.computeBytesSizeNoTag(entries_.get(i));
        }
        size += dataSize;
        size += 1 * getEntriesList().size();
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, peerId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeEnumSize(5, readOnlyOptions_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest other = (com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest) obj;

      boolean result = true;
      result = result && (hasGroupId() == other.hasGroupId());
      if (hasGroupId()) {
        result = result && getGroupId().equals(other.getGroupId());
      }
      result = result && (hasServerId() == other.hasServerId());
      if (hasServerId()) {
        result = result && getServerId().equals(other.getServerId());
      }
      result = result && getEntriesList().equals(other.getEntriesList());
      result = result && (hasPeerId() == other.hasPeerId());
      if (hasPeerId()) {
        result = result && getPeerId().equals(other.getPeerId());
      }
      result = result && (hasReadOnlyOptions() == other.hasReadOnlyOptions());
      if (hasReadOnlyOptions()) {
        result = result && readOnlyOptions_ == other.readOnlyOptions_;
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasGroupId()) {
        hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
        hash = (53 * hash) + getGroupId().hashCode();
      }
      if (hasServerId()) {
        hash = (37 * hash) + SERVER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getServerId().hashCode();
      }
      if (getEntriesCount() > 0) {
        hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getEntriesList().hashCode();
      }
      if (hasPeerId()) {
        hash = (37 * hash) + PEER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPeerId().hashCode();
      }
      if (hasReadOnlyOptions()) {
        hash = (37 * hash) + READONLYOPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + readOnlyOptions_;
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(java.nio.ByteBuffer data,
                                                                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(com.google.protobuf.ByteString data,
                                                                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(byte[] data,
                                                                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(java.io.InputStream input,
                                                                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseDelimitedFrom(java.io.InputStream input,
                                                                                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.ReadIndexRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.ReadIndexRequest)
            com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        }
      }

      public Builder clear() {
        super.clear();
        groupId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        serverId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        peerId_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        readOnlyOptions_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexRequest_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest result = new com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupId_ = groupId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverId_ = serverId_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.entries_ = entries_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.peerId_ = peerId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.readOnlyOptions_ = readOnlyOptions_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest.getDefaultInstance())
          return this;
        if (other.hasGroupId()) {
          bitField0_ |= 0x00000001;
          groupId_ = other.groupId_;
          onChanged();
        }
        if (other.hasServerId()) {
          bitField0_ |= 0x00000002;
          serverId_ = other.serverId_;
          onChanged();
        }
        if (!other.entries_.isEmpty()) {
          if (entries_.isEmpty()) {
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureEntriesIsMutable();
            entries_.addAll(other.entries_);
          }
          onChanged();
        }
        if (other.hasPeerId()) {
          bitField0_ |= 0x00000008;
          peerId_ = other.peerId_;
          onChanged();
        }
        if (other.hasReadOnlyOptions()) {
          setReadOnlyOptions(other.getReadOnlyOptions());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGroupId()) {
          return false;
        }
        if (!hasServerId()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int              bitField0_;

      private java.lang.Object groupId_ = "";

      /**
       * <code>required string group_id = 1;</code>
       */
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public java.lang.String getGroupId() {
        java.lang.Object ref = groupId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            groupId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public com.google.protobuf.ByteString getGroupIdBytes() {
        java.lang.Object ref = groupId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          groupId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = getDefaultInstance().getGroupId();
        onChanged();
        return this;
      }

      /**
       * <code>required string group_id = 1;</code>
       */
      public Builder setGroupIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object serverId_ = "";

      /**
       * <code>required string server_id = 2;</code>
       */
      public boolean hasServerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public java.lang.String getServerId() {
        java.lang.Object ref = serverId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public com.google.protobuf.ByteString getServerIdBytes() {
        java.lang.Object ref = serverId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          serverId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder clearServerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverId_ = getDefaultInstance().getServerId();
        onChanged();
        return this;
      }

      /**
       * <code>required string server_id = 2;</code>
       */
      public Builder setServerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        serverId_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> entries_ = java.util.Collections.emptyList();

      private void ensureEntriesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          entries_ = new java.util.ArrayList<com.google.protobuf.ByteString>(entries_);
          bitField0_ |= 0x00000004;
        }
      }

      /**
       * <code>repeated bytes entries = 3;</code>
       */
      public java.util.List<com.google.protobuf.ByteString> getEntriesList() {
        return java.util.Collections.unmodifiableList(entries_);
      }

      /**
       * <code>repeated bytes entries = 3;</code>
       */
      public int getEntriesCount() {
        return entries_.size();
      }

      /**
       * <code>repeated bytes entries = 3;</code>
       */
      public com.google.protobuf.ByteString getEntries(int index) {
        return entries_.get(index);
      }

      /**
       * <code>repeated bytes entries = 3;</code>
       */
      public Builder setEntries(int index, com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.set(index, value);
        onChanged();
        return this;
      }

      /**
       * <code>repeated bytes entries = 3;</code>
       */
      public Builder addEntries(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(value);
        onChanged();
        return this;
      }

      /**
       * <code>repeated bytes entries = 3;</code>
       */
      public Builder addAllEntries(java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entries_);
        onChanged();
        return this;
      }

      /**
       * <code>repeated bytes entries = 3;</code>
       */
      public Builder clearEntries() {
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      private java.lang.Object peerId_ = "";

      /**
       * <code>optional string peer_id = 4;</code>
       */
      public boolean hasPeerId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional string peer_id = 4;</code>
       */
      public java.lang.String getPeerId() {
        java.lang.Object ref = peerId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            peerId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string peer_id = 4;</code>
       */
      public com.google.protobuf.ByteString getPeerIdBytes() {
        java.lang.Object ref = peerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          peerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string peer_id = 4;</code>
       */
      public Builder setPeerId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        peerId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string peer_id = 4;</code>
       */
      public Builder clearPeerId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        peerId_ = getDefaultInstance().getPeerId();
        onChanged();
        return this;
      }

      /**
       * <code>optional string peer_id = 4;</code>
       */
      public Builder setPeerIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        peerId_ = value;
        onChanged();
        return this;
      }

      private int readOnlyOptions_ = 0;

      /**
       * <code>optional .jraft.ReadOnlyType readOnlyOptions = 5;</code>
       */
      public boolean hasReadOnlyOptions() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional .jraft.ReadOnlyType readOnlyOptions = 5;</code>
       */
      public com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType getReadOnlyOptions() {
        com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType result = com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType
                .valueOf(readOnlyOptions_);
        return result == null ? com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType.READ_ONLY_SAFE : result;
      }

      /**
       * <code>optional .jraft.ReadOnlyType readOnlyOptions = 5;</code>
       */
      public Builder setReadOnlyOptions(com.alipay.sofa.jraft.entity.EnumOutter.ReadOnlyType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        readOnlyOptions_ = value.getNumber();
        onChanged();
        return this;
      }

      /**
       * <code>optional .jraft.ReadOnlyType readOnlyOptions = 5;</code>
       */
      public Builder clearReadOnlyOptions() {
        bitField0_ = (bitField0_ & ~0x00000010);
        readOnlyOptions_ = 0;
        onChanged();
        return this;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.ReadIndexRequest)
    }

    // @@protoc_insertion_point(class_scope:jraft.ReadIndexRequest)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ReadIndexRequest> PARSER = new com.google.protobuf.AbstractParser<ReadIndexRequest>() {
      public ReadIndexRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadIndexRequest(
                input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReadIndexRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReadIndexRequest> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReadIndexResponseOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.ReadIndexResponse)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 index = 1;</code>
     */
    boolean hasIndex();

    /**
     * <code>required int64 index = 1;</code>
     */
    long getIndex();

    /**
     * <code>required bool success = 2;</code>
     */
    boolean hasSuccess();

    /**
     * <code>required bool success = 2;</code>
     */
    boolean getSuccess();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    boolean hasErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse();

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder();
  }

  /**
   * Protobuf type {@code jraft.ReadIndexResponse}
   */
  public static final class ReadIndexResponse extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.ReadIndexResponse)
          ReadIndexResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ReadIndexResponse.newBuilder() to construct.
    private ReadIndexResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ReadIndexResponse() {
      index_ = 0L;
      success_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ReadIndexResponse(com.google.protobuf.CodedInputStream input,
                              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              index_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              success_ = input.readBool();
              break;
            }
            case 794: {
              com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = errorResponse_.toBuilder();
              }
              errorResponse_ = input.readMessage(
                      com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(errorResponse_);
                errorResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexResponse_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse.class,
                      com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse.Builder.class);
    }

    private int             bitField0_;
    public static final int INDEX_FIELD_NUMBER = 1;
    private long            index_;

    /**
     * <code>required int64 index = 1;</code>
     */
    public boolean hasIndex() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required int64 index = 1;</code>
     */
    public long getIndex() {
      return index_;
    }

    public static final int SUCCESS_FIELD_NUMBER = 2;
    private boolean         success_;

    /**
     * <code>required bool success = 2;</code>
     */
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required bool success = 2;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int                                     ERRORRESPONSE_FIELD_NUMBER = 99;
    private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse errorResponse_;

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public boolean hasErrorResponse() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    /**
     * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
     */
    public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
      return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()
              : errorResponse_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasErrorResponse()) {
        if (!getErrorResponse().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, index_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(99, getErrorResponse());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, index_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(99, getErrorResponse());
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
      if (!(obj instanceof com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse other = (com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse) obj;

      boolean result = true;
      result = result && (hasIndex() == other.hasIndex());
      if (hasIndex()) {
        result = result && (getIndex() == other.getIndex());
      }
      result = result && (hasSuccess() == other.hasSuccess());
      if (hasSuccess()) {
        result = result && (getSuccess() == other.getSuccess());
      }
      result = result && (hasErrorResponse() == other.hasErrorResponse());
      if (hasErrorResponse()) {
        result = result && getErrorResponse().equals(other.getErrorResponse());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasIndex()) {
        hash = (37 * hash) + INDEX_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getIndex());
      }
      if (hasSuccess()) {
        hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSuccess());
      }
      if (hasErrorResponse()) {
        hash = (37 * hash) + ERRORRESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorResponse().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(java.nio.ByteBuffer data,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(com.google.protobuf.ByteString data,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(byte[] data,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(java.io.InputStream input,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseDelimitedFrom(java.io.InputStream input,
                                                                                             com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.ReadIndexResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.ReadIndexResponse)
            com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse.class,
                        com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getErrorResponseFieldBuilder();
        }
      }

      public Builder clear() {
        super.clear();
        index_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.internal_static_jraft_ReadIndexResponse_descriptor;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse.getDefaultInstance();
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse build() {
        com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse buildPartial() {
        com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse result = new com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.index_ = index_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (errorResponseBuilder_ == null) {
          result.errorResponse_ = errorResponse_;
        } else {
          result.errorResponse_ = errorResponseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }

      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse) {
          return mergeFrom((com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse other) {
        if (other == com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse.getDefaultInstance())
          return this;
        if (other.hasIndex()) {
          setIndex(other.getIndex());
        }
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasErrorResponse()) {
          mergeErrorResponse(other.getErrorResponse());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasIndex()) {
          return false;
        }
        if (!hasSuccess()) {
          return false;
        }
        if (hasErrorResponse()) {
          if (!getErrorResponse().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int  bitField0_;

      private long index_;

      /**
       * <code>required int64 index = 1;</code>
       */
      public boolean hasIndex() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required int64 index = 1;</code>
       */
      public long getIndex() {
        return index_;
      }

      /**
       * <code>required int64 index = 1;</code>
       */
      public Builder setIndex(long value) {
        bitField0_ |= 0x00000001;
        index_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 index = 1;</code>
       */
      public Builder clearIndex() {
        bitField0_ = (bitField0_ & ~0x00000001);
        index_ = 0L;
        onChanged();
        return this;
      }

      private boolean success_;

      /**
       * <code>required bool success = 2;</code>
       */
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public boolean getSuccess() {
        return success_;
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000002;
        success_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required bool success = 2;</code>
       */
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000002);
        success_ = false;
        onChanged();
        return this;
      }

      private com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse                                                                                                                                                                      errorResponse_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> errorResponseBuilder_;

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public boolean hasErrorResponse() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse getErrorResponse() {
        if (errorResponseBuilder_ == null) {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        } else {
          return errorResponseBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          errorResponse_ = value;
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder setErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder builderForValue) {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = builderForValue.build();
          onChanged();
        } else {
          errorResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder mergeErrorResponse(com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse value) {
        if (errorResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) && errorResponse_ != null
                  && errorResponse_ != com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.getDefaultInstance()) {
            errorResponse_ = com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.newBuilder(errorResponse_)
                    .mergeFrom(value).buildPartial();
          } else {
            errorResponse_ = value;
          }
          onChanged();
        } else {
          errorResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public Builder clearErrorResponse() {
        if (errorResponseBuilder_ == null) {
          errorResponse_ = null;
          onChanged();
        } else {
          errorResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder getErrorResponseBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getErrorResponseFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      public com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder getErrorResponseOrBuilder() {
        if (errorResponseBuilder_ != null) {
          return errorResponseBuilder_.getMessageOrBuilder();
        } else {
          return errorResponse_ == null ? com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse
                  .getDefaultInstance() : errorResponse_;
        }
      }

      /**
       * <code>optional .jraft.ErrorResponse errorResponse = 99;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder> getErrorResponseFieldBuilder() {
        if (errorResponseBuilder_ == null) {
          errorResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponse.Builder, com.alipay.sofa.jraft.rpc.RpcRequests.ErrorResponseOrBuilder>(
                  getErrorResponse(), getParentForChildren(), isClean());
          errorResponse_ = null;
        }
        return errorResponseBuilder_;
      }

      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.ReadIndexResponse)
    }

    // @@protoc_insertion_point(class_scope:jraft.ReadIndexResponse)
    private static final com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse();
    }

    public static com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ReadIndexResponse> PARSER = new com.google.protobuf.AbstractParser<ReadIndexResponse>() {
      public ReadIndexResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadIndexResponse(
                input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReadIndexResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReadIndexResponse> getParserForType() {
      return PARSER;
    }

    public com.alipay.sofa.jraft.rpc.RpcRequests.ReadIndexResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_PingRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_PingRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_ErrorResponse_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_ErrorResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_InstallSnapshotRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_InstallSnapshotRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_InstallSnapshotResponse_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_InstallSnapshotResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_TimeoutNowRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_TimeoutNowRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_TimeoutNowResponse_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_TimeoutNowResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_RequestVoteRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_RequestVoteRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_RequestVoteResponse_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_RequestVoteResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_AppendEntriesRequestHeader_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_AppendEntriesRequestHeader_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_AppendEntriesRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_AppendEntriesRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_AppendEntriesResponse_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_AppendEntriesResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_GetFileRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_GetFileRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_GetFileResponse_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_GetFileResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_ReadIndexRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_ReadIndexRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_ReadIndexResponse_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_ReadIndexResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
  static {
    java.lang.String[] descriptorData = { "\n\trpc.proto\022\005jraft\032\nraft.proto\032\nenum.pro"
            + "to\"%\n\013PingRequest\022\026\n\016send_timestamp\030\001 \002("
            + "\003\"4\n\rErrorResponse\022\021\n\terrorCode\030\001 \002(\005\022\020\n"
            + "\010errorMsg\030\002 \001(\t\"\214\001\n\026InstallSnapshotReque"
            + "st\022\020\n\010group_id\030\001 \002(\t\022\021\n\tserver_id\030\002 \002(\t\022"
            + "\017\n\007peer_id\030\003 \002(\t\022\014\n\004term\030\004 \002(\003\022!\n\004meta\030\005"
            + " \002(\0132\023.jraft.SnapshotMeta\022\013\n\003uri\030\006 \002(\t\"e"
            + "\n\027InstallSnapshotResponse\022\014\n\004term\030\001 \002(\003\022"
            + "\017\n\007success\030\002 \002(\010\022+\n\rerrorResponse\030c \001(\0132"
            + "\024.jraft.ErrorResponse\"W\n\021TimeoutNowReque"
            + "st\022\020\n\010group_id\030\001 \002(\t\022\021\n\tserver_id\030\002 \002(\t\022"
            + "\017\n\007peer_id\030\003 \002(\t\022\014\n\004term\030\004 \002(\003\"`\n\022Timeou"
            + "tNowResponse\022\014\n\004term\030\001 \002(\003\022\017\n\007success\030\002 "
            + "\002(\010\022+\n\rerrorResponse\030c \001(\0132\024.jraft.Error"
            + "Response\"\231\001\n\022RequestVoteRequest\022\020\n\010group"
            + "_id\030\001 \002(\t\022\021\n\tserver_id\030\002 \002(\t\022\017\n\007peer_id\030"
            + "\003 \002(\t\022\014\n\004term\030\004 \002(\003\022\025\n\rlast_log_term\030\005 \002"
            + "(\003\022\026\n\016last_log_index\030\006 \002(\003\022\020\n\010pre_vote\030\007"
            + " \002(\010\"a\n\023RequestVoteResponse\022\014\n\004term\030\001 \002("
            + "\003\022\017\n\007granted\030\002 \002(\010\022+\n\rerrorResponse\030c \001("
            + "\0132\024.jraft.ErrorResponse\"R\n\032AppendEntries"
            + "RequestHeader\022\020\n\010group_id\030\001 \002(\t\022\021\n\tserve"
            + "r_id\030\002 \002(\t\022\017\n\007peer_id\030\003 \002(\t\"\323\001\n\024AppendEn"
            + "triesRequest\022\020\n\010group_id\030\001 \002(\t\022\021\n\tserver"
            + "_id\030\002 \002(\t\022\017\n\007peer_id\030\003 \002(\t\022\014\n\004term\030\004 \002(\003"
            + "\022\025\n\rprev_log_term\030\005 \002(\003\022\026\n\016prev_log_inde"
            + "x\030\006 \002(\003\022!\n\007entries\030\007 \003(\0132\020.jraft.EntryMe"
            + "ta\022\027\n\017committed_index\030\010 \002(\003\022\014\n\004data\030\t \001("
            + "\014\"{\n\025AppendEntriesResponse\022\014\n\004term\030\001 \002(\003"
            + "\022\017\n\007success\030\002 \002(\010\022\026\n\016last_log_index\030\003 \001("
            + "\003\022+\n\rerrorResponse\030c \001(\0132\024.jraft.ErrorRe"
            + "sponse\"i\n\016GetFileRequest\022\021\n\treader_id\030\001 "
            + "\002(\003\022\020\n\010filename\030\002 \002(\t\022\r\n\005count\030\003 \002(\003\022\016\n\006"
            + "offset\030\004 \002(\003\022\023\n\013read_partly\030\005 \001(\010\"l\n\017Get"
            + "FileResponse\022\013\n\003eof\030\001 \002(\010\022\014\n\004data\030\002 \002(\014\022"
            + "\021\n\tread_size\030\003 \001(\003\022+\n\rerrorResponse\030c \001("
            + "\0132\024.jraft.ErrorResponse\"\207\001\n\020ReadIndexReq"
            + "uest\022\020\n\010group_id\030\001 \002(\t\022\021\n\tserver_id\030\002 \002("
            + "\t\022\017\n\007entries\030\003 \003(\014\022\017\n\007peer_id\030\004 \001(\t\022,\n\017r"
            + "eadOnlyOptions\030\005 \001(\0162\023.jraft.ReadOnlyTyp"
            + "e\"`\n\021ReadIndexResponse\022\r\n\005index\030\001 \002(\003\022\017\n"
            + "\007success\030\002 \002(\010\022+\n\rerrorResponse\030c \001(\0132\024."
            + "jraft.ErrorResponseB(\n\031com.alipay.sofa.j"
            + "raft.rpcB\013RpcRequests" };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
                    com.alipay.sofa.jraft.entity.RaftOutter.getDescriptor(),
                    com.alipay.sofa.jraft.entity.EnumOutter.getDescriptor(), }, assigner);
    internal_static_jraft_PingRequest_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_jraft_PingRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_PingRequest_descriptor, new java.lang.String[] { "SendTimestamp", });
    internal_static_jraft_ErrorResponse_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_jraft_ErrorResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_ErrorResponse_descriptor, new java.lang.String[] { "ErrorCode", "ErrorMsg", });
    internal_static_jraft_InstallSnapshotRequest_descriptor = getDescriptor().getMessageTypes().get(2);
    internal_static_jraft_InstallSnapshotRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_InstallSnapshotRequest_descriptor, new java.lang.String[] { "GroupId", "ServerId",
            "PeerId", "Term", "Meta", "Uri", });
    internal_static_jraft_InstallSnapshotResponse_descriptor = getDescriptor().getMessageTypes().get(3);
    internal_static_jraft_InstallSnapshotResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_InstallSnapshotResponse_descriptor, new java.lang.String[] { "Term", "Success",
            "ErrorResponse", });
    internal_static_jraft_TimeoutNowRequest_descriptor = getDescriptor().getMessageTypes().get(4);
    internal_static_jraft_TimeoutNowRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_TimeoutNowRequest_descriptor, new java.lang.String[] { "GroupId", "ServerId",
            "PeerId", "Term", });
    internal_static_jraft_TimeoutNowResponse_descriptor = getDescriptor().getMessageTypes().get(5);
    internal_static_jraft_TimeoutNowResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_TimeoutNowResponse_descriptor, new java.lang.String[] { "Term", "Success",
            "ErrorResponse", });
    internal_static_jraft_RequestVoteRequest_descriptor = getDescriptor().getMessageTypes().get(6);
    internal_static_jraft_RequestVoteRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_RequestVoteRequest_descriptor, new java.lang.String[] { "GroupId", "ServerId",
            "PeerId", "Term", "LastLogTerm", "LastLogIndex", "PreVote", });
    internal_static_jraft_RequestVoteResponse_descriptor = getDescriptor().getMessageTypes().get(7);
    internal_static_jraft_RequestVoteResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_RequestVoteResponse_descriptor, new java.lang.String[] { "Term", "Granted",
            "ErrorResponse", });
    internal_static_jraft_AppendEntriesRequestHeader_descriptor = getDescriptor().getMessageTypes().get(8);
    internal_static_jraft_AppendEntriesRequestHeader_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_AppendEntriesRequestHeader_descriptor, new java.lang.String[] { "GroupId",
            "ServerId", "PeerId", });
    internal_static_jraft_AppendEntriesRequest_descriptor = getDescriptor().getMessageTypes().get(9);
    internal_static_jraft_AppendEntriesRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_AppendEntriesRequest_descriptor, new java.lang.String[] { "GroupId", "ServerId",
            "PeerId", "Term", "PrevLogTerm", "PrevLogIndex", "Entries", "CommittedIndex", "Data", });
    internal_static_jraft_AppendEntriesResponse_descriptor = getDescriptor().getMessageTypes().get(10);
    internal_static_jraft_AppendEntriesResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_AppendEntriesResponse_descriptor, new java.lang.String[] { "Term", "Success",
            "LastLogIndex", "ErrorResponse", });
    internal_static_jraft_GetFileRequest_descriptor = getDescriptor().getMessageTypes().get(11);
    internal_static_jraft_GetFileRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_GetFileRequest_descriptor, new java.lang.String[] { "ReaderId", "Filename", "Count",
            "Offset", "ReadPartly", });
    internal_static_jraft_GetFileResponse_descriptor = getDescriptor().getMessageTypes().get(12);
    internal_static_jraft_GetFileResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_GetFileResponse_descriptor, new java.lang.String[] { "Eof", "Data", "ReadSize",
            "ErrorResponse", });
    internal_static_jraft_ReadIndexRequest_descriptor = getDescriptor().getMessageTypes().get(13);
    internal_static_jraft_ReadIndexRequest_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_ReadIndexRequest_descriptor, new java.lang.String[] { "GroupId", "ServerId",
            "Entries", "PeerId", "ReadOnlyOptions", });
    internal_static_jraft_ReadIndexResponse_descriptor = getDescriptor().getMessageTypes().get(14);
    internal_static_jraft_ReadIndexResponse_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_ReadIndexResponse_descriptor, new java.lang.String[] { "Index", "Success",
            "ErrorResponse", });
    com.alipay.sofa.jraft.entity.RaftOutter.getDescriptor();
    com.alipay.sofa.jraft.entity.EnumOutter.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
