package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0543um extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0543um[] f24857b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24858a;

    public C0543um() {
        a();
    }

    public static C0543um[] b() {
        if (f24857b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24857b == null) {
                        f24857b = new C0543um[0];
                    }
                } finally {
                }
            }
        }
        return f24857b;
    }

    public final C0543um a() {
        this.f24858a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f24858a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeInt64(1, this.f24858a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0543um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24858a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0543um a(byte[] bArr) {
        return (C0543um) MessageNano.mergeFrom(new C0543um(), bArr);
    }

    public static C0543um b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0543um().mergeFrom(codedInputByteBufferNano);
    }
}
