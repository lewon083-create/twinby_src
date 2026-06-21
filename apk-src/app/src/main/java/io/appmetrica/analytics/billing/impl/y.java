package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21560f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21561g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21562h = 2;
    public static volatile y[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f21563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f21566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21567e;

    public y() {
        a();
    }

    public static y[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new y[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f21563a = bArr;
        this.f21564b = 0L;
        this.f21565c = 0;
        this.f21566d = bArr;
        this.f21567e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f21563a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f21563a);
        }
        long j10 = this.f21564b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        int i10 = this.f21565c;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i10);
        }
        if (!Arrays.equals(this.f21566d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f21566d);
        }
        long j11 = this.f21567e;
        return j11 != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j11) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f21563a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f21563a);
        }
        long j10 = this.f21564b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        int i10 = this.f21565c;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i10);
        }
        if (!Arrays.equals(this.f21566d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f21566d);
        }
        long j11 = this.f21567e;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j11);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f21563a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f21564b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f21565c = int32;
                }
            } else if (tag == 34) {
                this.f21566d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f21567e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static y a(byte[] bArr) {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
