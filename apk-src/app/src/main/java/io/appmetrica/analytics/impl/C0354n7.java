package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0354n7 extends MessageNano {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile C0354n7[] f24403s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f24406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0379o7 f24408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f24410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f24411h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f24415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f24419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f24420r;

    public C0354n7() {
        a();
    }

    public static C0354n7[] b() {
        if (f24403s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24403s == null) {
                        f24403s = new C0354n7[0];
                    }
                } finally {
                }
            }
        }
        return f24403s;
    }

    public final C0354n7 a() {
        this.f24404a = -1;
        this.f24405b = "";
        this.f24406c = "";
        this.f24407d = -1L;
        this.f24408e = null;
        this.f24409f = "";
        this.f24410g = "";
        this.f24411h = -1L;
        this.i = -1;
        this.f24412j = -1;
        this.f24413k = "";
        this.f24414l = -1;
        this.f24415m = "";
        this.f24416n = -1;
        this.f24417o = -1;
        this.f24418p = -1;
        this.f24419q = -1;
        this.f24420r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f24404a;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (!this.f24405b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f24405b);
        }
        if (!this.f24406c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f24406c);
        }
        long j10 = this.f24407d;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j10);
        }
        C0379o7 c0379o7 = this.f24408e;
        if (c0379o7 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0379o7);
        }
        if (!this.f24409f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f24409f);
        }
        if (!this.f24410g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f24410g);
        }
        long j11 = this.f24411h;
        if (j11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j11);
        }
        int i10 = this.i;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i10);
        }
        int i11 = this.f24412j;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i11);
        }
        if (!this.f24413k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f24413k);
        }
        int i12 = this.f24414l;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i12);
        }
        if (!this.f24415m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f24415m);
        }
        int i13 = this.f24416n;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i13);
        }
        int i14 = this.f24417o;
        if (i14 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i14);
        }
        int i15 = this.f24418p;
        if (i15 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i15);
        }
        int i16 = this.f24419q;
        if (i16 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i16);
        }
        return !Arrays.equals(this.f24420r, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(18, this.f24420r) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i = this.f24404a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f24405b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f24405b);
        }
        if (!this.f24406c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f24406c);
        }
        long j10 = this.f24407d;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j10);
        }
        C0379o7 c0379o7 = this.f24408e;
        if (c0379o7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0379o7);
        }
        if (!this.f24409f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f24409f);
        }
        if (!this.f24410g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f24410g);
        }
        long j11 = this.f24411h;
        if (j11 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j11);
        }
        int i10 = this.i;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i10);
        }
        int i11 = this.f24412j;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i11);
        }
        if (!this.f24413k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f24413k);
        }
        int i12 = this.f24414l;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i12);
        }
        if (!this.f24415m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f24415m);
        }
        int i13 = this.f24416n;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i13);
        }
        int i14 = this.f24417o;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i14);
        }
        int i15 = this.f24418p;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i15);
        }
        int i16 = this.f24419q;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i16);
        }
        if (!Arrays.equals(this.f24420r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f24420r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0354n7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0354n7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0354n7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f24404a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f24405b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f24406c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f24407d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f24408e == null) {
                        this.f24408e = new C0379o7();
                    }
                    codedInputByteBufferNano.readMessage(this.f24408e);
                    break;
                case 50:
                    this.f24409f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f24410g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f24411h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f24412j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.f24413k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f24414l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f24415m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f24416n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f24417o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f24418p = int32;
                    }
                    break;
                case 136:
                    this.f24419q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f24420r = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C0354n7 a(byte[] bArr) {
        return (C0354n7) MessageNano.mergeFrom(new C0354n7(), bArr);
    }
}
