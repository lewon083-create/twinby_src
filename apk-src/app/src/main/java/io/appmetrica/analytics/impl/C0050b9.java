package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0050b9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0050b9[] f23495c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23497b;

    public C0050b9() {
        a();
    }

    public static C0050b9[] b() {
        if (f23495c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23495c == null) {
                        f23495c = new C0050b9[0];
                    }
                } finally {
                }
            }
        }
        return f23495c;
    }

    public final C0050b9 a() {
        this.f23496a = "";
        this.f23497b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f23497b) + CodedOutputByteBufferNano.computeStringSize(1, this.f23496a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f23496a);
        codedOutputByteBufferNano.writeUInt64(2, this.f23497b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0050b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23496a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23497b = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static C0050b9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0050b9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0050b9 a(byte[] bArr) {
        return (C0050b9) MessageNano.mergeFrom(new C0050b9(), bArr);
    }
}
