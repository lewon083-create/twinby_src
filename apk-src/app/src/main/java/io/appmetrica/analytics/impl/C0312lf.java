package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0312lf extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C0312lf[] f24297d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24300c;

    public C0312lf() {
        a();
    }

    public static C0312lf[] b() {
        if (f24297d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24297d == null) {
                        f24297d = new C0312lf[0];
                    }
                } finally {
                }
            }
        }
        return f24297d;
    }

    public final C0312lf a() {
        this.f24298a = "";
        this.f24299b = "";
        this.f24300c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f24298a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f24298a);
        }
        if (!this.f24299b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f24299b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f24300c) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f24298a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f24298a);
        }
        if (!this.f24299b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f24299b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f24300c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0312lf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24298a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f24299b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f24300c = int32;
                }
            }
        }
        return this;
    }

    public static C0312lf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0312lf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0312lf a(byte[] bArr) {
        return (C0312lf) MessageNano.mergeFrom(new C0312lf(), bArr);
    }
}
