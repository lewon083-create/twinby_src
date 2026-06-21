package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0493sm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0493sm[] f24744c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24746b;

    public C0493sm() {
        a();
    }

    public static C0493sm[] b() {
        if (f24744c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24744c == null) {
                        f24744c = new C0493sm[0];
                    }
                } finally {
                }
            }
        }
        return f24744c;
    }

    public final C0493sm a() {
        this.f24745a = 86400L;
        this.f24746b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f24746b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f24745a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeInt64(1, this.f24745a);
        codedOutputByteBufferNano.writeInt64(2, this.f24746b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0493sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f24745a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24746b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0493sm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0493sm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0493sm a(byte[] bArr) {
        return (C0493sm) MessageNano.mergeFrom(new C0493sm(), bArr);
    }
}
