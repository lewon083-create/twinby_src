package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile u[] f21540c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f21541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f21542b;

    public u() {
        a();
    }

    public static u[] b() {
        if (f21540c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21540c == null) {
                        f21540c = new u[0];
                    }
                } finally {
                }
            }
        }
        return f21540c;
    }

    public final u a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f21541a = bArr;
        this.f21542b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f21541a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f21541a);
        }
        return !Arrays.equals(this.f21542b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f21542b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f21541a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f21541a);
        }
        if (!Arrays.equals(this.f21542b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f21542b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f21541a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f21542b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static u b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new u().mergeFrom(codedInputByteBufferNano);
    }

    public static u a(byte[] bArr) {
        return (u) MessageNano.mergeFrom(new u(), bArr);
    }
}
