package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0419pm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0419pm[] f24593b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24594a;

    public C0419pm() {
        a();
    }

    public static C0419pm[] b() {
        if (f24593b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24593b == null) {
                        f24593b = new C0419pm[0];
                    }
                } finally {
                }
            }
        }
        return f24593b;
    }

    public final C0419pm a() {
        this.f24594a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f24594a;
        return j10 != 864000000 ? CodedOutputByteBufferNano.computeInt64Size(1, j10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        long j10 = this.f24594a;
        if (j10 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0419pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24594a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0419pm a(byte[] bArr) {
        return (C0419pm) MessageNano.mergeFrom(new C0419pm(), bArr);
    }

    public static C0419pm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0419pm().mergeFrom(codedInputByteBufferNano);
    }
}
