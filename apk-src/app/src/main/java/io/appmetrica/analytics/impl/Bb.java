package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Bb extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Bb[] f22138f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22143e;

    public Bb() {
        a();
    }

    public static Bb[] b() {
        if (f22138f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22138f == null) {
                        f22138f = new Bb[0];
                    }
                } finally {
                }
            }
        }
        return f22138f;
    }

    public final Bb a() {
        this.f22139a = "";
        this.f22140b = "";
        this.f22141c = false;
        this.f22142d = "";
        this.f22143e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f22139a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f22139a);
        }
        if (!this.f22140b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f22140b);
        }
        boolean z5 = this.f22141c;
        if (z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z5);
        }
        if (!this.f22142d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f22142d);
        }
        return !this.f22143e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.f22143e) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f22139a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f22139a);
        }
        if (!this.f22140b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f22140b);
        }
        boolean z5 = this.f22141c;
        if (z5) {
            codedOutputByteBufferNano.writeBool(22, z5);
        }
        if (!this.f22142d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f22142d);
        }
        if (!this.f22143e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f22143e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Bb b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Bb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f22139a = codedInputByteBufferNano.readString();
            } else if (tag == 154) {
                this.f22140b = codedInputByteBufferNano.readString();
            } else if (tag == 176) {
                this.f22141c = codedInputByteBufferNano.readBool();
            } else if (tag == 202) {
                this.f22142d = codedInputByteBufferNano.readString();
            } else if (tag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f22143e = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Bb a(byte[] bArr) {
        return (Bb) MessageNano.mergeFrom(new Bb(), bArr);
    }
}
