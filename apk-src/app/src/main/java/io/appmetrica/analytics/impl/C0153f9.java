package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0153f9 extends MessageNano {
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 29;
    public static final int J = 35;
    public static final int K = 38;
    public static final int L = 40;
    public static final int M = 42;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static volatile C0153f9[] T = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f23846t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f23847u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f23848v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f23849w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f23850x = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f23851y = 13;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f23852z = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f23857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0024a9 f23858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0127e9 f23859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f23860h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f23863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f23865n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f23866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23867p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23868q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f23869r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0102d9[] f23870s;

    public C0153f9() {
        a();
    }

    public static C0153f9[] b() {
        if (T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (T == null) {
                        T = new C0153f9[0];
                    }
                } finally {
                }
            }
        }
        return T;
    }

    public final C0153f9 a() {
        this.f23853a = 0L;
        this.f23854b = 0L;
        this.f23855c = 0;
        this.f23856d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f23857e = bArr;
        this.f23858f = null;
        this.f23859g = null;
        this.f23860h = "";
        this.i = 0;
        this.f23861j = 0;
        this.f23862k = -1;
        this.f23863l = bArr;
        this.f23864m = -1;
        this.f23865n = 0L;
        this.f23866o = 0L;
        this.f23867p = 0;
        this.f23868q = false;
        this.f23869r = 1L;
        this.f23870s = C0102d9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f23855c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f23854b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f23853a) + super.computeSerializedSize();
        if (!this.f23856d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f23856d);
        }
        byte[] bArr = this.f23857e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f23857e);
        }
        C0024a9 c0024a9 = this.f23858f;
        if (c0024a9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c0024a9);
        }
        C0127e9 c0127e9 = this.f23859g;
        if (c0127e9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c0127e9);
        }
        if (!this.f23860h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f23860h);
        }
        int i = this.i;
        if (i != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i);
        }
        int i10 = this.f23861j;
        if (i10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i10);
        }
        int i11 = this.f23862k;
        if (i11 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i11);
        }
        if (!Arrays.equals(this.f23863l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f23863l);
        }
        int i12 = this.f23864m;
        if (i12 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i12);
        }
        long j10 = this.f23865n;
        if (j10 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j10);
        }
        long j11 = this.f23866o;
        if (j11 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j11);
        }
        int i13 = this.f23867p;
        if (i13 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i13);
        }
        boolean z5 = this.f23868q;
        if (z5) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z5);
        }
        long j12 = this.f23869r;
        if (j12 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j12);
        }
        C0102d9[] c0102d9Arr = this.f23870s;
        if (c0102d9Arr != null && c0102d9Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C0102d9[] c0102d9Arr2 = this.f23870s;
                if (i14 >= c0102d9Arr2.length) {
                    break;
                }
                C0102d9 c0102d9 = c0102d9Arr2[i14];
                if (c0102d9 != null) {
                    iComputeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c0102d9) + iComputeUInt32Size;
                }
                i14++;
            }
        }
        return iComputeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeUInt64(1, this.f23853a);
        codedOutputByteBufferNano.writeUInt64(2, this.f23854b);
        codedOutputByteBufferNano.writeUInt32(3, this.f23855c);
        if (!this.f23856d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f23856d);
        }
        byte[] bArr = this.f23857e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f23857e);
        }
        C0024a9 c0024a9 = this.f23858f;
        if (c0024a9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0024a9);
        }
        C0127e9 c0127e9 = this.f23859g;
        if (c0127e9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0127e9);
        }
        if (!this.f23860h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f23860h);
        }
        int i = this.i;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i);
        }
        int i10 = this.f23861j;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i10);
        }
        int i11 = this.f23862k;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i11);
        }
        if (!Arrays.equals(this.f23863l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f23863l);
        }
        int i12 = this.f23864m;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i12);
        }
        long j10 = this.f23865n;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j10);
        }
        long j11 = this.f23866o;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j11);
        }
        int i13 = this.f23867p;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i13);
        }
        boolean z5 = this.f23868q;
        if (z5) {
            codedOutputByteBufferNano.writeBool(23, z5);
        }
        long j12 = this.f23869r;
        if (j12 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j12);
        }
        C0102d9[] c0102d9Arr = this.f23870s;
        if (c0102d9Arr != null && c0102d9Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C0102d9[] c0102d9Arr2 = this.f23870s;
                if (i14 >= c0102d9Arr2.length) {
                    break;
                }
                C0102d9 c0102d9 = c0102d9Arr2[i14];
                if (c0102d9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c0102d9);
                }
                i14++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0153f9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0153f9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0153f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f23853a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f23854b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f23855c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f23856d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f23857e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f23858f == null) {
                        this.f23858f = new C0024a9();
                    }
                    codedInputByteBufferNano.readMessage(this.f23858f);
                    break;
                case 58:
                    if (this.f23859g == null) {
                        this.f23859g = new C0127e9();
                    }
                    codedInputByteBufferNano.readMessage(this.f23859g);
                    break;
                case 66:
                    this.f23860h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f23861j = int32;
                    }
                    break;
                case 104:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == -1 || int322 == 0 || int322 == 1) {
                        this.f23862k = int322;
                    }
                    break;
                case 114:
                    this.f23863l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int323 = codedInputByteBufferNano.readInt32();
                    if (int323 == -1 || int323 == 0 || int323 == 1) {
                        this.f23864m = int323;
                    }
                    break;
                case 128:
                    this.f23865n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f23866o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int324 = codedInputByteBufferNano.readInt32();
                    if (int324 == 0 || int324 == 1 || int324 == 2) {
                        this.f23867p = int324;
                    }
                    break;
                case 184:
                    this.f23868q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f23869r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C0102d9[] c0102d9Arr = this.f23870s;
                    int length = c0102d9Arr == null ? 0 : c0102d9Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C0102d9[] c0102d9Arr2 = new C0102d9[i];
                    if (length != 0) {
                        System.arraycopy(c0102d9Arr, 0, c0102d9Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C0102d9 c0102d9 = new C0102d9();
                        c0102d9Arr2[length] = c0102d9;
                        codedInputByteBufferNano.readMessage(c0102d9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0102d9 c0102d92 = new C0102d9();
                    c0102d9Arr2[length] = c0102d92;
                    codedInputByteBufferNano.readMessage(c0102d92);
                    this.f23870s = c0102d9Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C0153f9 a(byte[] bArr) {
        return (C0153f9) MessageNano.mergeFrom(new C0153f9(), bArr);
    }
}
