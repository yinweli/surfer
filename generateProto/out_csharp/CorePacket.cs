// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: _CorePacket.proto
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace packet._core {

  /// <summary>Holder for reflection information generated from _CorePacket.proto</summary>
  public static partial class CorePacketReflection {

    #region Descriptor
    /// <summary>File descriptor for _CorePacket.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static CorePacketReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "ChFfQ29yZVBhY2tldC5wcm90bxoMU2ltcGxlLnByb3RvIlAKCkNvcmVQYWNr",
            "ZXQSDAoEdHlwZRgBIAMoBRIZCgdTaW1wbGUxGGUgASgLMgguU2ltcGxlMRIZ",
            "CgdTaW1wbGUyGGYgASgLMgguU2ltcGxlMkIvCgxwYWNrZXQuX2NvcmVCEENv",
            "cmVQYWNrZXRXYXBwZXKqAgxwYWNrZXQuX2NvcmViBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::packet.simple.SimpleReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::packet._core.CorePacket), global::packet._core.CorePacket.Parser, new[]{ "Type", "Simple1", "Simple2" }, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class CorePacket : pb::IMessage<CorePacket> {
    private static readonly pb::MessageParser<CorePacket> _parser = new pb::MessageParser<CorePacket>(() => new CorePacket());
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<CorePacket> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::packet._core.CorePacketReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CorePacket() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CorePacket(CorePacket other) : this() {
      type_ = other.type_.Clone();
      Simple1 = other.simple1_ != null ? other.Simple1.Clone() : null;
      Simple2 = other.simple2_ != null ? other.Simple2.Clone() : null;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CorePacket Clone() {
      return new CorePacket(this);
    }

    /// <summary>Field number for the "type" field.</summary>
    public const int TypeFieldNumber = 1;
    private static readonly pb::FieldCodec<int> _repeated_type_codec
        = pb::FieldCodec.ForInt32(10);
    private readonly pbc::RepeatedField<int> type_ = new pbc::RepeatedField<int>();
    /// <summary>
    ///  內存封包編號, 此項不可更名, 型態不可變動, 編號不可變動
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<int> Type {
      get { return type_; }
    }

    /// <summary>Field number for the "Simple1" field.</summary>
    public const int Simple1FieldNumber = 101;
    private global::packet.simple.Simple1 simple1_;
    /// <summary>
    ///  範例封包
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::packet.simple.Simple1 Simple1 {
      get { return simple1_; }
      set {
        simple1_ = value;
      }
    }

    /// <summary>Field number for the "Simple2" field.</summary>
    public const int Simple2FieldNumber = 102;
    private global::packet.simple.Simple2 simple2_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::packet.simple.Simple2 Simple2 {
      get { return simple2_; }
      set {
        simple2_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as CorePacket);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(CorePacket other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if(!type_.Equals(other.type_)) return false;
      if (!object.Equals(Simple1, other.Simple1)) return false;
      if (!object.Equals(Simple2, other.Simple2)) return false;
      return true;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      hash ^= type_.GetHashCode();
      if (simple1_ != null) hash ^= Simple1.GetHashCode();
      if (simple2_ != null) hash ^= Simple2.GetHashCode();
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      type_.WriteTo(output, _repeated_type_codec);
      if (simple1_ != null) {
        output.WriteRawTag(170, 6);
        output.WriteMessage(Simple1);
      }
      if (simple2_ != null) {
        output.WriteRawTag(178, 6);
        output.WriteMessage(Simple2);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      size += type_.CalculateSize(_repeated_type_codec);
      if (simple1_ != null) {
        size += 2 + pb::CodedOutputStream.ComputeMessageSize(Simple1);
      }
      if (simple2_ != null) {
        size += 2 + pb::CodedOutputStream.ComputeMessageSize(Simple2);
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(CorePacket other) {
      if (other == null) {
        return;
      }
      type_.Add(other.type_);
      if (other.simple1_ != null) {
        if (simple1_ == null) {
          simple1_ = new global::packet.simple.Simple1();
        }
        Simple1.MergeFrom(other.Simple1);
      }
      if (other.simple2_ != null) {
        if (simple2_ == null) {
          simple2_ = new global::packet.simple.Simple2();
        }
        Simple2.MergeFrom(other.Simple2);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            input.SkipLastField();
            break;
          case 10:
          case 8: {
            type_.AddEntriesFrom(input, _repeated_type_codec);
            break;
          }
          case 810: {
            if (simple1_ == null) {
              simple1_ = new global::packet.simple.Simple1();
            }
            input.ReadMessage(simple1_);
            break;
          }
          case 818: {
            if (simple2_ == null) {
              simple2_ = new global::packet.simple.Simple2();
            }
            input.ReadMessage(simple2_);
            break;
          }
        }
      }
    }

  }

  #endregion

}

#endregion Designer generated code