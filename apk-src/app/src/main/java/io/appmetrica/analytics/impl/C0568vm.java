package io.appmetrica.analytics.impl;

import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0568vm extends MessageNano {
    public static final int D = -1;
    public static final int E = 0;
    public static final int F = 1;
    public static volatile C0568vm[] G;
    public C0518tm A;
    public C0468rm[] B;
    public C0419pm C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f24921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f24924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f24925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0394om[] f24926h;
    public C0444qm i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f24929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f24930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f24931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f24932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0543um f24933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f24934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f24935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f24936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f24937t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24938u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0493sm f24939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0369nm f24942y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0344mm f24943z;

    public C0568vm() {
        a();
    }

    public static C0568vm[] b() {
        if (G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (G == null) {
                        G = new C0568vm[0];
                    }
                } finally {
                }
            }
        }
        return G;
    }

    public final C0568vm a() {
        this.f24919a = "";
        this.f24920b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f24921c = strArr;
        this.f24922d = "";
        this.f24923e = "";
        this.f24924f = strArr;
        this.f24925g = strArr;
        this.f24926h = C0394om.b();
        this.i = null;
        this.f24927j = "";
        this.f24928k = "";
        this.f24929l = "";
        this.f24930m = false;
        this.f24931n = "";
        this.f24932o = strArr;
        this.f24933p = null;
        this.f24934q = false;
        this.f24935r = "";
        this.f24936s = 0L;
        this.f24937t = 0L;
        this.f24938u = false;
        this.f24939v = null;
        this.f24940w = VKApiCodes.CODE_ADVERTISE_CABINET_NO_PERMISSIONS_FOR_OPERATION;
        this.f24941x = 1;
        this.f24942y = null;
        this.f24943z = null;
        this.A = null;
        this.B = C0468rm.b();
        this.C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f24919a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f24919a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f24920b) + iComputeSerializedSize;
        String[] strArr = this.f24921c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            int iComputeStringSizeNoTag = 0;
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f24921c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    i11++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i10++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i11;
        }
        if (!this.f24922d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f24922d);
        }
        if (!this.f24923e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f24923e);
        }
        String[] strArr3 = this.f24924f;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i13 = 0;
            while (true) {
                String[] strArr4 = this.f24924f;
                if (i12 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i12];
                if (str2 != null) {
                    i13++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i12++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i13;
        }
        String[] strArr5 = this.f24925g;
        if (strArr5 != null && strArr5.length > 0) {
            int i14 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i15 = 0;
            while (true) {
                String[] strArr6 = this.f24925g;
                if (i14 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i14];
                if (str3 != null) {
                    i15++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i14++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i15;
        }
        C0394om[] c0394omArr = this.f24926h;
        if (c0394omArr != null && c0394omArr.length > 0) {
            int i16 = 0;
            while (true) {
                C0394om[] c0394omArr2 = this.f24926h;
                if (i16 >= c0394omArr2.length) {
                    break;
                }
                C0394om c0394om = c0394omArr2[i16];
                if (c0394om != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c0394om) + iComputeInt64Size;
                }
                i16++;
            }
        }
        C0444qm c0444qm = this.i;
        if (c0444qm != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c0444qm);
        }
        if (!this.f24927j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f24927j);
        }
        if (!this.f24928k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f24928k);
        }
        if (!this.f24929l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f24929l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f24930m) + iComputeInt64Size;
        if (!this.f24931n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f24931n);
        }
        String[] strArr7 = this.f24932o;
        if (strArr7 != null && strArr7.length > 0) {
            int i17 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i18 = 0;
            while (true) {
                String[] strArr8 = this.f24932o;
                if (i17 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i17];
                if (str4 != null) {
                    i18++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i17++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag4 + i18;
        }
        C0543um c0543um = this.f24933p;
        if (c0543um != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c0543um);
        }
        boolean z5 = this.f24934q;
        if (z5) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z5);
        }
        if (!this.f24935r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f24935r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f24937t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f24936s) + iComputeBoolSize;
        boolean z10 = this.f24938u;
        if (z10) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z10);
        }
        C0493sm c0493sm = this.f24939v;
        if (c0493sm != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c0493sm);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f24941x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f24940w) + iComputeInt64Size2;
        C0369nm c0369nm = this.f24942y;
        if (c0369nm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c0369nm);
        }
        C0344mm c0344mm = this.f24943z;
        if (c0344mm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c0344mm);
        }
        C0518tm c0518tm = this.A;
        if (c0518tm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c0518tm);
        }
        C0468rm[] c0468rmArr = this.B;
        if (c0468rmArr != null && c0468rmArr.length > 0) {
            while (true) {
                C0468rm[] c0468rmArr2 = this.B;
                if (i >= c0468rmArr2.length) {
                    break;
                }
                C0468rm c0468rm = c0468rmArr2[i];
                if (c0468rm != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c0468rm) + iComputeInt32Size;
                }
                i++;
            }
        }
        C0419pm c0419pm = this.C;
        return c0419pm != null ? CodedOutputByteBufferNano.computeMessageSize(32, c0419pm) + iComputeInt32Size : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f24919a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f24919a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f24920b);
        String[] strArr = this.f24921c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f24921c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i10++;
            }
        }
        if (!this.f24922d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f24922d);
        }
        if (!this.f24923e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f24923e);
        }
        String[] strArr3 = this.f24924f;
        if (strArr3 != null && strArr3.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr4 = this.f24924f;
                if (i11 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i11];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i11++;
            }
        }
        String[] strArr5 = this.f24925g;
        if (strArr5 != null && strArr5.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr6 = this.f24925g;
                if (i12 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i12];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i12++;
            }
        }
        C0394om[] c0394omArr = this.f24926h;
        if (c0394omArr != null && c0394omArr.length > 0) {
            int i13 = 0;
            while (true) {
                C0394om[] c0394omArr2 = this.f24926h;
                if (i13 >= c0394omArr2.length) {
                    break;
                }
                C0394om c0394om = c0394omArr2[i13];
                if (c0394om != null) {
                    codedOutputByteBufferNano.writeMessage(8, c0394om);
                }
                i13++;
            }
        }
        C0444qm c0444qm = this.i;
        if (c0444qm != null) {
            codedOutputByteBufferNano.writeMessage(9, c0444qm);
        }
        if (!this.f24927j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f24927j);
        }
        if (!this.f24928k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f24928k);
        }
        if (!this.f24929l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f24929l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f24930m);
        if (!this.f24931n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f24931n);
        }
        String[] strArr7 = this.f24932o;
        if (strArr7 != null && strArr7.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr8 = this.f24932o;
                if (i14 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i14];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i14++;
            }
        }
        C0543um c0543um = this.f24933p;
        if (c0543um != null) {
            codedOutputByteBufferNano.writeMessage(16, c0543um);
        }
        boolean z5 = this.f24934q;
        if (z5) {
            codedOutputByteBufferNano.writeBool(17, z5);
        }
        if (!this.f24935r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f24935r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f24936s);
        codedOutputByteBufferNano.writeInt64(22, this.f24937t);
        boolean z10 = this.f24938u;
        if (z10) {
            codedOutputByteBufferNano.writeBool(23, z10);
        }
        C0493sm c0493sm = this.f24939v;
        if (c0493sm != null) {
            codedOutputByteBufferNano.writeMessage(24, c0493sm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f24940w);
        codedOutputByteBufferNano.writeInt32(26, this.f24941x);
        C0369nm c0369nm = this.f24942y;
        if (c0369nm != null) {
            codedOutputByteBufferNano.writeMessage(27, c0369nm);
        }
        C0344mm c0344mm = this.f24943z;
        if (c0344mm != null) {
            codedOutputByteBufferNano.writeMessage(29, c0344mm);
        }
        C0518tm c0518tm = this.A;
        if (c0518tm != null) {
            codedOutputByteBufferNano.writeMessage(30, c0518tm);
        }
        C0468rm[] c0468rmArr = this.B;
        if (c0468rmArr != null && c0468rmArr.length > 0) {
            while (true) {
                C0468rm[] c0468rmArr2 = this.B;
                if (i >= c0468rmArr2.length) {
                    break;
                }
                C0468rm c0468rm = c0468rmArr2[i];
                if (c0468rm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c0468rm);
                }
                i++;
            }
        }
        C0419pm c0419pm = this.C;
        if (c0419pm != null) {
            codedOutputByteBufferNano.writeMessage(32, c0419pm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0568vm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0568vm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0568vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f24919a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f24920b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f24921c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f24921c = strArr2;
                    break;
                case 34:
                    this.f24922d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f24923e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f24924f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i10 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i10];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i10 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f24924f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f24925g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i11 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i11];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i11 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f24925g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C0394om[] c0394omArr = this.f24926h;
                    int length4 = c0394omArr == null ? 0 : c0394omArr.length;
                    int i12 = repeatedFieldArrayLength4 + length4;
                    C0394om[] c0394omArr2 = new C0394om[i12];
                    if (length4 != 0) {
                        System.arraycopy(c0394omArr, 0, c0394omArr2, 0, length4);
                    }
                    while (length4 < i12 - 1) {
                        C0394om c0394om = new C0394om();
                        c0394omArr2[length4] = c0394om;
                        codedInputByteBufferNano.readMessage(c0394om);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C0394om c0394om2 = new C0394om();
                    c0394omArr2[length4] = c0394om2;
                    codedInputByteBufferNano.readMessage(c0394om2);
                    this.f24926h = c0394omArr2;
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new C0444qm();
                    }
                    codedInputByteBufferNano.readMessage(this.i);
                    break;
                case 82:
                    this.f24927j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.f24928k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f24929l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f24930m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f24931n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f24932o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i13 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i13];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i13 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f24932o = strArr8;
                    break;
                case 130:
                    if (this.f24933p == null) {
                        this.f24933p = new C0543um();
                    }
                    codedInputByteBufferNano.readMessage(this.f24933p);
                    break;
                case 136:
                    this.f24934q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f24935r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f24936s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f24937t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f24938u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f24939v == null) {
                        this.f24939v = new C0493sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f24939v);
                    break;
                case VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM /* 200 */:
                    this.f24940w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f24941x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f24942y == null) {
                        this.f24942y = new C0369nm();
                    }
                    codedInputByteBufferNano.readMessage(this.f24942y);
                    break;
                case 234:
                    if (this.f24943z == null) {
                        this.f24943z = new C0344mm();
                    }
                    codedInputByteBufferNano.readMessage(this.f24943z);
                    break;
                case 242:
                    if (this.A == null) {
                        this.A = new C0518tm();
                    }
                    codedInputByteBufferNano.readMessage(this.A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C0468rm[] c0468rmArr = this.B;
                    int length6 = c0468rmArr == null ? 0 : c0468rmArr.length;
                    int i14 = repeatedFieldArrayLength6 + length6;
                    C0468rm[] c0468rmArr2 = new C0468rm[i14];
                    if (length6 != 0) {
                        System.arraycopy(c0468rmArr, 0, c0468rmArr2, 0, length6);
                    }
                    while (length6 < i14 - 1) {
                        C0468rm c0468rm = new C0468rm();
                        c0468rmArr2[length6] = c0468rm;
                        codedInputByteBufferNano.readMessage(c0468rm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C0468rm c0468rm2 = new C0468rm();
                    c0468rmArr2[length6] = c0468rm2;
                    codedInputByteBufferNano.readMessage(c0468rm2);
                    this.B = c0468rmArr2;
                    break;
                case 258:
                    if (this.C == null) {
                        this.C = new C0419pm();
                    }
                    codedInputByteBufferNano.readMessage(this.C);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C0568vm a(byte[] bArr) {
        return (C0568vm) MessageNano.mergeFrom(new C0568vm(), bArr);
    }
}
