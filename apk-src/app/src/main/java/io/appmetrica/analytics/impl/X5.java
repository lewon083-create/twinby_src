package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class X5 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile X5[] f23240b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23241a;

    public X5() {
        a();
    }

    public static X5[] b() {
        if (f23240b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23240b == null) {
                        f23240b = new X5[0];
                    }
                } finally {
                }
            }
        }
        return f23240b;
    }

    public final X5 a() {
        this.f23241a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f23241a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f23241a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23241a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static X5 a(byte[] bArr) {
        return (X5) MessageNano.mergeFrom(new X5(), bArr);
    }

    public static X5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new X5().mergeFrom(codedInputByteBufferNano);
    }
}
