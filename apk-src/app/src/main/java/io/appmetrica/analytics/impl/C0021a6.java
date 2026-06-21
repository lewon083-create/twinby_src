package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0021a6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C0021a6[] f23402g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23408f;

    public C0021a6() {
        a();
    }

    public static C0021a6[] b() {
        if (f23402g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23402g == null) {
                        f23402g = new C0021a6[0];
                    }
                } finally {
                }
            }
        }
        return f23402g;
    }

    public final C0021a6 a() {
        this.f23403a = "";
        this.f23404b = "";
        this.f23405c = -1;
        this.f23406d = "";
        this.f23407e = false;
        this.f23408f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f23403a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f23403a);
        }
        if (!this.f23404b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f23404b);
        }
        int i = this.f23405c;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i);
        }
        if (!this.f23406d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f23406d);
        }
        boolean z5 = this.f23407e;
        if (z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z5);
        }
        int i10 = this.f23408f;
        return i10 != -1 ? CodedOutputByteBufferNano.computeSInt32Size(6, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f23403a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f23403a);
        }
        if (!this.f23404b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f23404b);
        }
        int i = this.f23405c;
        if (i != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i);
        }
        if (!this.f23406d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f23406d);
        }
        boolean z5 = this.f23407e;
        if (z5) {
            codedOutputByteBufferNano.writeBool(5, z5);
        }
        int i10 = this.f23408f;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0021a6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0021a6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0021a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23403a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f23404b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f23405c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f23406d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f23407e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23408f = codedInputByteBufferNano.readSInt32();
            }
        }
        return this;
    }

    public static C0021a6 a(byte[] bArr) {
        return (C0021a6) MessageNano.mergeFrom(new C0021a6(), bArr);
    }
}
