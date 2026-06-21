package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0255j8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0255j8[] f24140c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0152f8 f24142b;

    public C0255j8() {
        a();
    }

    public static C0255j8[] b() {
        if (f24140c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24140c == null) {
                        f24140c = new C0255j8[0];
                    }
                } finally {
                }
            }
        }
        return f24140c;
    }

    public final C0255j8 a() {
        this.f24141a = 0;
        this.f24142b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f24141a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        C0152f8 c0152f8 = this.f24142b;
        return c0152f8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0152f8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i = this.f24141a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        C0152f8 c0152f8 = this.f24142b;
        if (c0152f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0152f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0255j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f24141a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f24142b == null) {
                    this.f24142b = new C0152f8();
                }
                codedInputByteBufferNano.readMessage(this.f24142b);
            }
        }
        return this;
    }

    public static C0255j8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0255j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0255j8 a(byte[] bArr) {
        return (C0255j8) MessageNano.mergeFrom(new C0255j8(), bArr);
    }
}
