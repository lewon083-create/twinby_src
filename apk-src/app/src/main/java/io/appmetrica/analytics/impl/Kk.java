package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Kk extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Kk[] f22582c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f22584b;

    public Kk() {
        a();
    }

    public static Kk[] b() {
        if (f22582c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22582c == null) {
                        f22582c = new Kk[0];
                    }
                } finally {
                }
            }
        }
        return f22582c;
    }

    public final Kk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f22583a = bArr;
        this.f22584b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f22583a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f22583a);
        }
        return !Arrays.equals(this.f22584b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f22584b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f22583a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f22583a);
        }
        if (!Arrays.equals(this.f22584b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f22584b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Kk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f22583a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f22584b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Kk b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Kk().mergeFrom(codedInputByteBufferNano);
    }

    public static Kk a(byte[] bArr) {
        return (Kk) MessageNano.mergeFrom(new Kk(), bArr);
    }
}
