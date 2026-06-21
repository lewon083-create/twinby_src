package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0256j9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C0256j9[] f24143e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24147d;

    public C0256j9() {
        a();
    }

    public static C0256j9[] b() {
        if (f24143e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24143e == null) {
                        f24143e = new C0256j9[0];
                    }
                } finally {
                }
            }
        }
        return f24143e;
    }

    public final C0256j9 a() {
        this.f24144a = 0L;
        this.f24145b = 0;
        this.f24146c = 0L;
        this.f24147d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f24145b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f24144a) + super.computeSerializedSize();
        long j10 = this.f24146c;
        if (j10 != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j10);
        }
        boolean z5 = this.f24147d;
        return z5 ? CodedOutputByteBufferNano.computeBoolSize(4, z5) + iComputeSInt32Size : iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeUInt64(1, this.f24144a);
        codedOutputByteBufferNano.writeSInt32(2, this.f24145b);
        long j10 = this.f24146c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j10);
        }
        boolean z5 = this.f24147d;
        if (z5) {
            codedOutputByteBufferNano.writeBool(4, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0256j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f24144a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.f24145b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f24146c = codedInputByteBufferNano.readInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24147d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0256j9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0256j9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0256j9 a(byte[] bArr) {
        return (C0256j9) MessageNano.mergeFrom(new C0256j9(), bArr);
    }
}
