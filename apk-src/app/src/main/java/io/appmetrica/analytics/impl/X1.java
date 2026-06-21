package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class X1 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile X1[] f23234c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23236b;

    public X1() {
        a();
    }

    public static X1[] b() {
        if (f23234c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23234c == null) {
                        f23234c = new X1[0];
                    }
                } finally {
                }
            }
        }
        return f23234c;
    }

    public final X1 a() {
        this.f23235a = "";
        this.f23236b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f23236b) + CodedOutputByteBufferNano.computeStringSize(1, this.f23235a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f23235a);
        codedOutputByteBufferNano.writeBool(2, this.f23236b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23235a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23236b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static X1 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new X1().mergeFrom(codedInputByteBufferNano);
    }

    public static X1 a(byte[] bArr) {
        return (X1) MessageNano.mergeFrom(new X1(), bArr);
    }
}
