package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0287kf extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C0287kf[] f24234f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24239e;

    public C0287kf() {
        a();
    }

    public static C0287kf[] b() {
        if (f24234f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24234f == null) {
                        f24234f = new C0287kf[0];
                    }
                } finally {
                }
            }
        }
        return f24234f;
    }

    public final C0287kf a() {
        this.f24235a = "";
        this.f24236b = "";
        this.f24237c = false;
        this.f24238d = false;
        this.f24239e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f24235a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f24235a);
        }
        if (!this.f24236b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f24236b);
        }
        boolean z5 = this.f24237c;
        if (z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z5);
        }
        boolean z10 = this.f24238d;
        if (z10) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z10);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f24239e) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f24235a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f24235a);
        }
        if (!this.f24236b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f24236b);
        }
        boolean z5 = this.f24237c;
        if (z5) {
            codedOutputByteBufferNano.writeBool(3, z5);
        }
        boolean z10 = this.f24238d;
        if (z10) {
            codedOutputByteBufferNano.writeBool(4, z10);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f24239e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0287kf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0287kf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0287kf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24235a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f24236b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f24237c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f24238d = codedInputByteBufferNano.readBool();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f24239e = int32;
                }
            }
        }
        return this;
    }

    public static C0287kf a(byte[] bArr) {
        return (C0287kf) MessageNano.mergeFrom(new C0287kf(), bArr);
    }
}
