package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0294km extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0294km[] f24250b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24251a;

    public C0294km() {
        a();
    }

    public static C0294km[] b() {
        if (f24250b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24250b == null) {
                        f24250b = new C0294km[0];
                    }
                } finally {
                }
            }
        }
        return f24250b;
    }

    public final C0294km a() {
        this.f24251a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !this.f24251a.equals("") ? CodedOutputByteBufferNano.computeStringSize(1, this.f24251a) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f24251a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f24251a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0294km mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f24251a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0294km a(byte[] bArr) {
        return (C0294km) MessageNano.mergeFrom(new C0294km(), bArr);
    }

    public static C0294km b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0294km().mergeFrom(codedInputByteBufferNano);
    }
}
