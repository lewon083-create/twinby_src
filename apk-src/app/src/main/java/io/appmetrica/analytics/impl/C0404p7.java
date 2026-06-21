package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0404p7 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C0404p7[] f24564d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24567c;

    public C0404p7() {
        a();
    }

    public static C0404p7[] b() {
        if (f24564d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24564d == null) {
                        f24564d = new C0404p7[0];
                    }
                } finally {
                }
            }
        }
        return f24564d;
    }

    public final C0404p7 a() {
        this.f24565a = -1L;
        this.f24566b = -1L;
        this.f24567c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f24565a;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        long j11 = this.f24566b;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j11);
        }
        int i = this.f24567c;
        return i != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        long j10 = this.f24565a;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        long j11 = this.f24566b;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j11);
        }
        int i = this.f24567c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0404p7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f24565a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f24566b = codedInputByteBufferNano.readInt64();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f24567c = int32;
                }
            }
        }
        return this;
    }

    public static C0404p7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0404p7().mergeFrom(codedInputByteBufferNano);
    }

    public static C0404p7 a(byte[] bArr) {
        return (C0404p7) MessageNano.mergeFrom(new C0404p7(), bArr);
    }
}
