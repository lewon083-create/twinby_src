package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0102d9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0102d9[] f23678c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f23680b;

    public C0102d9() {
        a();
    }

    public static C0102d9[] b() {
        if (f23678c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23678c == null) {
                        f23678c = new C0102d9[0];
                    }
                } finally {
                }
            }
        }
        return f23678c;
    }

    public final C0102d9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f23679a = bArr;
        this.f23680b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f23679a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f23679a);
        }
        return !Arrays.equals(this.f23680b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f23680b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f23679a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f23679a);
        }
        if (!Arrays.equals(this.f23680b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f23680b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0102d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23679a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23680b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0102d9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0102d9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0102d9 a(byte[] bArr) {
        return (C0102d9) MessageNano.mergeFrom(new C0102d9(), bArr);
    }
}
