package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile s[] f21534c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21536b;

    public s() {
        a();
    }

    public static s[] b() {
        if (f21534c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21534c == null) {
                        f21534c = new s[0];
                    }
                } finally {
                }
            }
        }
        return f21534c;
    }

    public final s a() {
        this.f21535a = 86400;
        this.f21536b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f21535a;
        if (i != 86400) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        int i10 = this.f21536b;
        return i10 != 86400 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = this.f21535a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        int i10 = this.f21536b;
        if (i10 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f21535a = codedInputByteBufferNano.readInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f21536b = codedInputByteBufferNano.readInt32();
            }
        }
        return this;
    }

    public static s b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new s().mergeFrom(codedInputByteBufferNano);
    }

    public static s a(byte[] bArr) {
        return (s) MessageNano.mergeFrom(new s(), bArr);
    }
}
