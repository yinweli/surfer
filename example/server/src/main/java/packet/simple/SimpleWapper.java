// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Simple.proto

package packet.simple;

public final class SimpleWapper {
  private SimpleWapper() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Simple1OrBuilder extends
      // @@protoc_insertion_point(interface_extends:Simple1)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 echoTime = 1;</code>
     */
    long getEchoTime();
  }
  /**
   * Protobuf type {@code Simple1}
   */
  public  static final class Simple1 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Simple1)
      Simple1OrBuilder {
    // Use Simple1.newBuilder() to construct.
    private Simple1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Simple1() {
      echoTime_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Simple1(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              echoTime_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return packet.simple.SimpleWapper.internal_static_Simple1_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return packet.simple.SimpleWapper.internal_static_Simple1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              packet.simple.SimpleWapper.Simple1.class, packet.simple.SimpleWapper.Simple1.Builder.class);
    }

    public static final int ECHOTIME_FIELD_NUMBER = 1;
    private long echoTime_;
    /**
     * <code>optional int64 echoTime = 1;</code>
     */
    public long getEchoTime() {
      return echoTime_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (echoTime_ != 0L) {
        output.writeInt64(1, echoTime_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (echoTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, echoTime_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof packet.simple.SimpleWapper.Simple1)) {
        return super.equals(obj);
      }
      packet.simple.SimpleWapper.Simple1 other = (packet.simple.SimpleWapper.Simple1) obj;

      boolean result = true;
      result = result && (getEchoTime()
          == other.getEchoTime());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ECHOTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEchoTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static packet.simple.SimpleWapper.Simple1 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static packet.simple.SimpleWapper.Simple1 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static packet.simple.SimpleWapper.Simple1 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static packet.simple.SimpleWapper.Simple1 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static packet.simple.SimpleWapper.Simple1 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static packet.simple.SimpleWapper.Simple1 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static packet.simple.SimpleWapper.Simple1 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static packet.simple.SimpleWapper.Simple1 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static packet.simple.SimpleWapper.Simple1 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static packet.simple.SimpleWapper.Simple1 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(packet.simple.SimpleWapper.Simple1 prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code Simple1}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Simple1)
        packet.simple.SimpleWapper.Simple1OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return packet.simple.SimpleWapper.internal_static_Simple1_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return packet.simple.SimpleWapper.internal_static_Simple1_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                packet.simple.SimpleWapper.Simple1.class, packet.simple.SimpleWapper.Simple1.Builder.class);
      }

      // Construct using packet.simple.SimpleWapper.Simple1.newBuilder()
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
        }
      }
      public Builder clear() {
        super.clear();
        echoTime_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return packet.simple.SimpleWapper.internal_static_Simple1_descriptor;
      }

      public packet.simple.SimpleWapper.Simple1 getDefaultInstanceForType() {
        return packet.simple.SimpleWapper.Simple1.getDefaultInstance();
      }

      public packet.simple.SimpleWapper.Simple1 build() {
        packet.simple.SimpleWapper.Simple1 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public packet.simple.SimpleWapper.Simple1 buildPartial() {
        packet.simple.SimpleWapper.Simple1 result = new packet.simple.SimpleWapper.Simple1(this);
        result.echoTime_ = echoTime_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof packet.simple.SimpleWapper.Simple1) {
          return mergeFrom((packet.simple.SimpleWapper.Simple1)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(packet.simple.SimpleWapper.Simple1 other) {
        if (other == packet.simple.SimpleWapper.Simple1.getDefaultInstance()) return this;
        if (other.getEchoTime() != 0L) {
          setEchoTime(other.getEchoTime());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        packet.simple.SimpleWapper.Simple1 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (packet.simple.SimpleWapper.Simple1) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long echoTime_ ;
      /**
       * <code>optional int64 echoTime = 1;</code>
       */
      public long getEchoTime() {
        return echoTime_;
      }
      /**
       * <code>optional int64 echoTime = 1;</code>
       */
      public Builder setEchoTime(long value) {
        
        echoTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 echoTime = 1;</code>
       */
      public Builder clearEchoTime() {
        
        echoTime_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:Simple1)
    }

    // @@protoc_insertion_point(class_scope:Simple1)
    private static final packet.simple.SimpleWapper.Simple1 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new packet.simple.SimpleWapper.Simple1();
    }

    public static packet.simple.SimpleWapper.Simple1 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Simple1>
        PARSER = new com.google.protobuf.AbstractParser<Simple1>() {
      public Simple1 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Simple1(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Simple1> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Simple1> getParserForType() {
      return PARSER;
    }

    public packet.simple.SimpleWapper.Simple1 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface Simple2OrBuilder extends
      // @@protoc_insertion_point(interface_extends:Simple2)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 echoTime = 1;</code>
     */
    long getEchoTime();
  }
  /**
   * Protobuf type {@code Simple2}
   */
  public  static final class Simple2 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Simple2)
      Simple2OrBuilder {
    // Use Simple2.newBuilder() to construct.
    private Simple2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Simple2() {
      echoTime_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Simple2(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              echoTime_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return packet.simple.SimpleWapper.internal_static_Simple2_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return packet.simple.SimpleWapper.internal_static_Simple2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              packet.simple.SimpleWapper.Simple2.class, packet.simple.SimpleWapper.Simple2.Builder.class);
    }

    public static final int ECHOTIME_FIELD_NUMBER = 1;
    private long echoTime_;
    /**
     * <code>optional int64 echoTime = 1;</code>
     */
    public long getEchoTime() {
      return echoTime_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (echoTime_ != 0L) {
        output.writeInt64(1, echoTime_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (echoTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, echoTime_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof packet.simple.SimpleWapper.Simple2)) {
        return super.equals(obj);
      }
      packet.simple.SimpleWapper.Simple2 other = (packet.simple.SimpleWapper.Simple2) obj;

      boolean result = true;
      result = result && (getEchoTime()
          == other.getEchoTime());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ECHOTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEchoTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static packet.simple.SimpleWapper.Simple2 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static packet.simple.SimpleWapper.Simple2 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static packet.simple.SimpleWapper.Simple2 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static packet.simple.SimpleWapper.Simple2 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static packet.simple.SimpleWapper.Simple2 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static packet.simple.SimpleWapper.Simple2 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static packet.simple.SimpleWapper.Simple2 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static packet.simple.SimpleWapper.Simple2 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static packet.simple.SimpleWapper.Simple2 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static packet.simple.SimpleWapper.Simple2 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(packet.simple.SimpleWapper.Simple2 prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code Simple2}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Simple2)
        packet.simple.SimpleWapper.Simple2OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return packet.simple.SimpleWapper.internal_static_Simple2_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return packet.simple.SimpleWapper.internal_static_Simple2_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                packet.simple.SimpleWapper.Simple2.class, packet.simple.SimpleWapper.Simple2.Builder.class);
      }

      // Construct using packet.simple.SimpleWapper.Simple2.newBuilder()
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
        }
      }
      public Builder clear() {
        super.clear();
        echoTime_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return packet.simple.SimpleWapper.internal_static_Simple2_descriptor;
      }

      public packet.simple.SimpleWapper.Simple2 getDefaultInstanceForType() {
        return packet.simple.SimpleWapper.Simple2.getDefaultInstance();
      }

      public packet.simple.SimpleWapper.Simple2 build() {
        packet.simple.SimpleWapper.Simple2 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public packet.simple.SimpleWapper.Simple2 buildPartial() {
        packet.simple.SimpleWapper.Simple2 result = new packet.simple.SimpleWapper.Simple2(this);
        result.echoTime_ = echoTime_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof packet.simple.SimpleWapper.Simple2) {
          return mergeFrom((packet.simple.SimpleWapper.Simple2)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(packet.simple.SimpleWapper.Simple2 other) {
        if (other == packet.simple.SimpleWapper.Simple2.getDefaultInstance()) return this;
        if (other.getEchoTime() != 0L) {
          setEchoTime(other.getEchoTime());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        packet.simple.SimpleWapper.Simple2 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (packet.simple.SimpleWapper.Simple2) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long echoTime_ ;
      /**
       * <code>optional int64 echoTime = 1;</code>
       */
      public long getEchoTime() {
        return echoTime_;
      }
      /**
       * <code>optional int64 echoTime = 1;</code>
       */
      public Builder setEchoTime(long value) {
        
        echoTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 echoTime = 1;</code>
       */
      public Builder clearEchoTime() {
        
        echoTime_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:Simple2)
    }

    // @@protoc_insertion_point(class_scope:Simple2)
    private static final packet.simple.SimpleWapper.Simple2 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new packet.simple.SimpleWapper.Simple2();
    }

    public static packet.simple.SimpleWapper.Simple2 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Simple2>
        PARSER = new com.google.protobuf.AbstractParser<Simple2>() {
      public Simple2 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Simple2(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Simple2> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Simple2> getParserForType() {
      return PARSER;
    }

    public packet.simple.SimpleWapper.Simple2 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Simple1_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Simple1_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Simple2_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Simple2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Simple.proto\"\033\n\007Simple1\022\020\n\010echoTime\030\001 " +
      "\001(\003\"\033\n\007Simple2\022\020\n\010echoTime\030\001 \001(\003B-\n\rpack" +
      "et.simpleB\014SimpleWapper\252\002\rpacket.simpleb" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Simple1_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Simple1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Simple1_descriptor,
        new java.lang.String[] { "EchoTime", });
    internal_static_Simple2_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Simple2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Simple2_descriptor,
        new java.lang.String[] { "EchoTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
