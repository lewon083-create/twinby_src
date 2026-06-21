package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class N extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile N[] f25433b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25434a;

    public N() {
        a();
    }

    public static N[] b() {
        if (f25433b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f25433b == null) {
                        f25433b = new N[0];
                    }
                } finally {
                }
            }
        }
        return f25433b;
    }

    public final N a() {
        this.f25434a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f25434a;
        return !z5 ? CodedOutputByteBufferNano.computeBoolSize(1, z5) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z5 = this.f25434a;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f25434a = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static N a(byte[] bArr) {
        return (N) MessageNano.mergeFrom(new N(), bArr);
    }

    public static N b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new N().mergeFrom(codedInputByteBufferNano);
    }
}
