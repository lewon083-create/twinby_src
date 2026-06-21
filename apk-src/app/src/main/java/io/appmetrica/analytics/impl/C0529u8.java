package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0529u8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0529u8[] f24839b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0454r8 f24840a;

    public C0529u8() {
        a();
    }

    public static C0529u8[] b() {
        if (f24839b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24839b == null) {
                        f24839b = new C0529u8[0];
                    }
                } finally {
                }
            }
        }
        return f24839b;
    }

    public final C0529u8 a() {
        this.f24840a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0454r8 c0454r8 = this.f24840a;
        return c0454r8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0454r8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0454r8 c0454r8 = this.f24840a;
        if (c0454r8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0454r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0529u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f24840a == null) {
                    this.f24840a = new C0454r8();
                }
                codedInputByteBufferNano.readMessage(this.f24840a);
            }
        }
        return this;
    }

    public static C0529u8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0529u8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0529u8 a(byte[] bArr) {
        return (C0529u8) MessageNano.mergeFrom(new C0529u8(), bArr);
    }
}
