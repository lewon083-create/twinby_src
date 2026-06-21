package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class B9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22129c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22130d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22131e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22132f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22133g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22134h = 5;
    public static final int i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile B9[] f22135j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f22137b;

    public B9() {
        a();
    }

    public static B9[] b() {
        if (f22135j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22135j == null) {
                        f22135j = new B9[0];
                    }
                } finally {
                }
            }
        }
        return f22135j;
    }

    public final B9 a() {
        this.f22136a = 0;
        this.f22137b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f22136a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        return !Arrays.equals(this.f22137b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f22137b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i10 = this.f22136a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        if (!Arrays.equals(this.f22137b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f22137b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 8) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f22136a = int32;
                            break;
                    }
                } else if (tag != 18) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    this.f22137b = codedInputByteBufferNano.readBytes();
                }
            }
        }
        return this;
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new B9().mergeFrom(codedInputByteBufferNano);
    }

    public static B9 a(byte[] bArr) {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }
}
