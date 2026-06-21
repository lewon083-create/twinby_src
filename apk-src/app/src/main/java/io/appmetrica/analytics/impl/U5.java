package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class U5 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile U5[] f23061c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f23063b;

    public U5() {
        a();
    }

    public static U5[] b() {
        if (f23061c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23061c == null) {
                        f23061c = new U5[0];
                    }
                } finally {
                }
            }
        }
        return f23061c;
    }

    public final U5 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f23062a = bArr;
        this.f23063b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f23062a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f23062a);
        }
        return !Arrays.equals(this.f23063b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f23063b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f23062a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f23062a);
        }
        if (!Arrays.equals(this.f23063b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f23063b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23062a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23063b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static U5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new U5().mergeFrom(codedInputByteBufferNano);
    }

    public static U5 a(byte[] bArr) {
        return (U5) MessageNano.mergeFrom(new U5(), bArr);
    }
}
