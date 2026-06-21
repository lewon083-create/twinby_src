package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0305l8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0305l8[] f24275c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f24276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f24277b;

    public C0305l8() {
        a();
    }

    public static C0305l8[] b() {
        if (f24275c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24275c == null) {
                        f24275c = new C0305l8[0];
                    }
                } finally {
                }
            }
        }
        return f24275c;
    }

    public final C0305l8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f24276a = bArr;
        this.f24277b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f24276a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f24276a);
        }
        return !Arrays.equals(this.f24277b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f24277b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f24276a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f24276a);
        }
        if (!Arrays.equals(this.f24277b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f24277b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0305l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24276a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24277b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0305l8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0305l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0305l8 a(byte[] bArr) {
        return (C0305l8) MessageNano.mergeFrom(new C0305l8(), bArr);
    }
}
