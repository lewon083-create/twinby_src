package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Z5 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Z5[] f23368c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23370b;

    public Z5() {
        a();
    }

    public static Z5[] b() {
        if (f23368c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23368c == null) {
                        f23368c = new Z5[0];
                    }
                } finally {
                }
            }
        }
        return f23368c;
    }

    public final Z5 a() {
        this.f23369a = 0;
        this.f23370b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f23369a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        return !this.f23370b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f23370b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = this.f23369a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f23370b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f23370b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 3) {
                    this.f23369a = int32;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23370b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Z5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Z5().mergeFrom(codedInputByteBufferNano);
    }

    public static Z5 a(byte[] bArr) {
        return (Z5) MessageNano.mergeFrom(new Z5(), bArr);
    }
}
