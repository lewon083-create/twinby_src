package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0076c9 extends MessageNano {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile C0076c9[] f23567n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23575h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f23576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0050b9[] f23578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f23579m;

    public C0076c9() {
        a();
    }

    public static C0076c9[] b() {
        if (f23567n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23567n == null) {
                        f23567n = new C0076c9[0];
                    }
                } finally {
                }
            }
        }
        return f23567n;
    }

    public final C0076c9 a() {
        this.f23568a = "";
        this.f23569b = "";
        this.f23570c = "";
        this.f23571d = 0;
        this.f23572e = "";
        this.f23573f = "";
        this.f23574g = false;
        this.f23575h = 0;
        this.i = "";
        this.f23576j = "";
        this.f23577k = 0;
        this.f23578l = C0050b9.b();
        this.f23579m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f23568a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f23568a);
        }
        if (!this.f23569b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f23569b);
        }
        if (!this.f23570c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f23570c);
        }
        int i = this.f23571d;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        if (!this.f23572e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f23572e);
        }
        if (!this.f23573f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f23573f);
        }
        boolean z5 = this.f23574g;
        if (z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z5);
        }
        int i10 = this.f23575h;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i10);
        }
        if (!this.i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.i);
        }
        if (!this.f23576j.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f23576j);
        }
        int i11 = this.f23577k;
        if (i11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i11);
        }
        C0050b9[] c0050b9Arr = this.f23578l;
        if (c0050b9Arr != null && c0050b9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C0050b9[] c0050b9Arr2 = this.f23578l;
                if (i12 >= c0050b9Arr2.length) {
                    break;
                }
                C0050b9 c0050b9 = c0050b9Arr2[i12];
                if (c0050b9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c0050b9) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        return !this.f23579m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.f23579m) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f23568a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f23568a);
        }
        if (!this.f23569b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f23569b);
        }
        if (!this.f23570c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f23570c);
        }
        int i = this.f23571d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        if (!this.f23572e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f23572e);
        }
        if (!this.f23573f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f23573f);
        }
        boolean z5 = this.f23574g;
        if (z5) {
            codedOutputByteBufferNano.writeBool(17, z5);
        }
        int i10 = this.f23575h;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i10);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.i);
        }
        if (!this.f23576j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f23576j);
        }
        int i11 = this.f23577k;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i11);
        }
        C0050b9[] c0050b9Arr = this.f23578l;
        if (c0050b9Arr != null && c0050b9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C0050b9[] c0050b9Arr2 = this.f23578l;
                if (i12 >= c0050b9Arr2.length) {
                    break;
                }
                C0050b9 c0050b9 = c0050b9Arr2[i12];
                if (c0050b9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c0050b9);
                }
                i12++;
            }
        }
        if (!this.f23579m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f23579m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0076c9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0076c9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0076c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f23568a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f23569b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f23570c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f23571d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f23572e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f23573f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f23574g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f23575h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f23576j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f23577k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C0050b9[] c0050b9Arr = this.f23578l;
                    int length = c0050b9Arr == null ? 0 : c0050b9Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C0050b9[] c0050b9Arr2 = new C0050b9[i];
                    if (length != 0) {
                        System.arraycopy(c0050b9Arr, 0, c0050b9Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C0050b9 c0050b9 = new C0050b9();
                        c0050b9Arr2[length] = c0050b9;
                        codedInputByteBufferNano.readMessage(c0050b9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0050b9 c0050b92 = new C0050b9();
                    c0050b9Arr2[length] = c0050b92;
                    codedInputByteBufferNano.readMessage(c0050b92);
                    this.f23578l = c0050b9Arr2;
                    break;
                case 194:
                    this.f23579m = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C0076c9 a(byte[] bArr) {
        return (C0076c9) MessageNano.mergeFrom(new C0076c9(), bArr);
    }
}
