package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0518tm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0518tm[] f24814b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24815a;

    public C0518tm() {
        a();
    }

    public static C0518tm[] b() {
        if (f24814b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24814b == null) {
                        f24814b = new C0518tm[0];
                    }
                } finally {
                }
            }
        }
        return f24814b;
    }

    public final C0518tm a() {
        this.f24815a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f24815a;
        return i != 86400 ? CodedOutputByteBufferNano.computeUInt32Size(1, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i = this.f24815a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0518tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f24815a = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0518tm a(byte[] bArr) {
        return (C0518tm) MessageNano.mergeFrom(new C0518tm(), bArr);
    }

    public static C0518tm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0518tm().mergeFrom(codedInputByteBufferNano);
    }
}
