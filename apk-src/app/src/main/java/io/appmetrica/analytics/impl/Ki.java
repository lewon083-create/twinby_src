package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ki extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22574f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22575g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22576h = 2;
    public static volatile Ki[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f22580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22581e;

    public Ki() {
        a();
    }

    public static Ki[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new Ki[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final Ki a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f22577a = bArr;
        this.f22578b = 0L;
        this.f22579c = 0;
        this.f22580d = bArr;
        this.f22581e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f22577a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f22577a);
        }
        long j10 = this.f22578b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f22579c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f22580d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f22580d);
        }
        long j11 = this.f22581e;
        return j11 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f22577a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f22577a);
        }
        long j10 = this.f22578b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f22579c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f22580d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f22580d);
        }
        long j11 = this.f22581e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Ki b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Ki().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ki mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f22577a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f22578b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f22579c = int32;
                }
            } else if (tag == 34) {
                this.f22580d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f22581e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static Ki a(byte[] bArr) {
        return (Ki) MessageNano.mergeFrom(new Ki(), bArr);
    }
}
