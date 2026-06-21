package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0574w3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0574w3[] f24954c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24956b;

    public C0574w3() {
        a();
    }

    public static C0574w3[] b() {
        if (f24954c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24954c == null) {
                        f24954c = new C0574w3[0];
                    }
                } finally {
                }
            }
        }
        return f24954c;
    }

    public final C0574w3 a() {
        this.f24955a = "";
        this.f24956b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f24955a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f24955a);
        }
        return !this.f24956b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f24956b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f24955a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f24955a);
        }
        if (!this.f24956b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f24956b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0574w3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24955a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24956b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0574w3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0574w3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0574w3 a(byte[] bArr) {
        return (C0574w3) MessageNano.mergeFrom(new C0574w3(), bArr);
    }
}
