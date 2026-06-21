package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Z8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Z8[] f23374c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23376b;

    public Z8() {
        a();
    }

    public static Z8[] b() {
        if (f23374c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23374c == null) {
                        f23374c = new Z8[0];
                    }
                } finally {
                }
            }
        }
        return f23374c;
    }

    public final Z8 a() {
        this.f23375a = "";
        this.f23376b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f23376b) + CodedOutputByteBufferNano.computeStringSize(1, this.f23375a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f23375a);
        codedOutputByteBufferNano.writeString(2, this.f23376b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23375a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23376b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Z8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Z8().mergeFrom(codedInputByteBufferNano);
    }

    public static Z8 a(byte[] bArr) {
        return (Z8) MessageNano.mergeFrom(new Z8(), bArr);
    }
}
