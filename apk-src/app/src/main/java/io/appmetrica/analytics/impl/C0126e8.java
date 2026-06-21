package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0126e8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0126e8[] f23749b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0152f8 f23750a;

    public C0126e8() {
        a();
    }

    public static C0126e8[] b() {
        if (f23749b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23749b == null) {
                        f23749b = new C0126e8[0];
                    }
                } finally {
                }
            }
        }
        return f23749b;
    }

    public final C0126e8 a() {
        this.f23750a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0152f8 c0152f8 = this.f23750a;
        return c0152f8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0152f8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0152f8 c0152f8 = this.f23750a;
        if (c0152f8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0152f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0126e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
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
                if (this.f23750a == null) {
                    this.f23750a = new C0152f8();
                }
                codedInputByteBufferNano.readMessage(this.f23750a);
            }
        }
        return this;
    }

    public static C0126e8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0126e8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0126e8 a(byte[] bArr) {
        return (C0126e8) MessageNano.mergeFrom(new C0126e8(), bArr);
    }
}
