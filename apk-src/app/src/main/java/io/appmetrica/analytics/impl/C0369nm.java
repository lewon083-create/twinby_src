package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0369nm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0369nm[] f24454b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24455a;

    public C0369nm() {
        a();
    }

    public static C0369nm[] b() {
        if (f24454b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24454b == null) {
                        f24454b = new C0369nm[0];
                    }
                } finally {
                }
            }
        }
        return f24454b;
    }

    public final C0369nm a() {
        this.f24455a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f24455a;
        return j10 != 10000 ? CodedOutputByteBufferNano.computeInt64Size(1, j10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        long j10 = this.f24455a;
        if (j10 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0369nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f24455a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0369nm a(byte[] bArr) {
        return (C0369nm) MessageNano.mergeFrom(new C0369nm(), bArr);
    }

    public static C0369nm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0369nm().mergeFrom(codedInputByteBufferNano);
    }
}
