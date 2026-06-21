package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile r[] f24668c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24670b;

    public r() {
        a();
    }

    public static r[] b() {
        if (f24668c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24668c == null) {
                        f24668c = new r[0];
                    }
                } finally {
                }
            }
        }
        return f24668c;
    }

    public final r a() {
        this.f24669a = 0L;
        this.f24670b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f24669a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        int i = this.f24670b;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        long j10 = this.f24669a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        int i = this.f24670b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f24669a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24670b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static r b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new r().mergeFrom(codedInputByteBufferNano);
    }

    public static r a(byte[] bArr) {
        return (r) MessageNano.mergeFrom(new r(), bArr);
    }
}
