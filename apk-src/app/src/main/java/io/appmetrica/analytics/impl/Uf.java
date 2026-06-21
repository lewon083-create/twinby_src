package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Uf extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23094e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23095f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f23096g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Uf[] f23097h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23101d;

    public Uf() {
        a();
    }

    public static Uf[] b() {
        if (f23097h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23097h == null) {
                        f23097h = new Uf[0];
                    }
                } finally {
                }
            }
        }
        return f23097h;
    }

    public final Uf a() {
        this.f23098a = WireFormatNano.EMPTY_BYTES;
        this.f23099b = 0L;
        this.f23100c = 0L;
        this.f23101d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f23098a) + super.computeSerializedSize();
        long j10 = this.f23099b;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        long j11 = this.f23100c;
        if (j11 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j11);
        }
        int i = this.f23101d;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i) + iComputeBytesSize : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeBytes(1, this.f23098a);
        long j10 = this.f23099b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        long j11 = this.f23100c;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j11);
        }
        int i = this.f23101d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Uf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23098a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f23099b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f23100c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f23101d = int32;
                }
            }
        }
        return this;
    }

    public static Uf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Uf().mergeFrom(codedInputByteBufferNano);
    }

    public static Uf a(byte[] bArr) {
        return (Uf) MessageNano.mergeFrom(new Uf(), bArr);
    }
}
