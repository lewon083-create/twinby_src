package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0142eo extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23813e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23814f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f23815g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f23816h = 3;
    public static volatile C0142eo[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0168fo f23819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0194go f23820d;

    public C0142eo() {
        a();
    }

    public static C0142eo[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new C0142eo[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final C0142eo a() {
        this.f23817a = WireFormatNano.EMPTY_BYTES;
        this.f23818b = 0;
        this.f23819c = null;
        this.f23820d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f23818b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f23817a) + super.computeSerializedSize();
        C0168fo c0168fo = this.f23819c;
        if (c0168fo != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0168fo);
        }
        C0194go c0194go = this.f23820d;
        return c0194go != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0194go) + iComputeInt32Size : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeBytes(1, this.f23817a);
        codedOutputByteBufferNano.writeInt32(2, this.f23818b);
        C0168fo c0168fo = this.f23819c;
        if (c0168fo != null) {
            codedOutputByteBufferNano.writeMessage(3, c0168fo);
        }
        C0194go c0194go = this.f23820d;
        if (c0194go != null) {
            codedOutputByteBufferNano.writeMessage(4, c0194go);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0142eo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23817a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f23818b = int32;
                }
            } else if (tag == 26) {
                if (this.f23819c == null) {
                    this.f23819c = new C0168fo();
                }
                codedInputByteBufferNano.readMessage(this.f23819c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f23820d == null) {
                    this.f23820d = new C0194go();
                }
                codedInputByteBufferNano.readMessage(this.f23820d);
            }
        }
        return this;
    }

    public static C0142eo b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0142eo().mergeFrom(codedInputByteBufferNano);
    }

    public static C0142eo a(byte[] bArr) {
        return (C0142eo) MessageNano.mergeFrom(new C0142eo(), bArr);
    }
}
