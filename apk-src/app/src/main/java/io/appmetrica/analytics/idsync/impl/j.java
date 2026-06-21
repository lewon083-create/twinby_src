package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile j[] f21984b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21985a;

    public j() {
        a();
    }

    public static j[] b() {
        if (f21984b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21984b == null) {
                        f21984b = new j[0];
                    }
                } finally {
                }
            }
        }
        return f21984b;
    }

    public final j a() {
        this.f21985a = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f21985a;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(1, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = this.f21985a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1) {
                    this.f21985a = int32;
                }
            }
        }
        return this;
    }

    public static j a(byte[] bArr) {
        return (j) MessageNano.mergeFrom(new j(), bArr);
    }

    public static j b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new j().mergeFrom(codedInputByteBufferNano);
    }
}
