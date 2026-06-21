package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Gi extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Gi[] f22393c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f22395b;

    public Gi() {
        a();
    }

    public static Gi[] b() {
        if (f22393c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22393c == null) {
                        f22393c = new Gi[0];
                    }
                } finally {
                }
            }
        }
        return f22393c;
    }

    public final Gi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f22394a = bArr;
        this.f22395b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f22394a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f22394a);
        }
        return !Arrays.equals(this.f22395b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f22395b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f22394a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f22394a);
        }
        if (!Arrays.equals(this.f22395b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f22395b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Gi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f22394a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f22395b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Gi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Gi().mergeFrom(codedInputByteBufferNano);
    }

    public static Gi a(byte[] bArr) {
        return (Gi) MessageNano.mergeFrom(new Gi(), bArr);
    }
}
