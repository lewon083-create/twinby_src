package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class P extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile P[] f25439c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25441b;

    public P() {
        a();
    }

    public static P[] b() {
        if (f25439c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f25439c == null) {
                        f25439c = new P[0];
                    }
                } finally {
                }
            }
        }
        return f25439c;
    }

    public final P a() {
        this.f25440a = true;
        this.f25441b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f25440a;
        if (!z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        long j10 = this.f25441b;
        return j10 != 1 ? CodedOutputByteBufferNano.computeInt64Size(2, j10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        boolean z5 = this.f25440a;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        long j10 = this.f25441b;
        if (j10 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f25440a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f25441b = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static P b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new P().mergeFrom(codedInputByteBufferNano);
    }

    public static P a(byte[] bArr) {
        return (P) MessageNano.mergeFrom(new P(), bArr);
    }
}
