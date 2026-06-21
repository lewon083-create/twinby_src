package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0281k9 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f24211g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f24212h = 0;
    public static final int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile C0281k9[] f24213j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0205h9[] f24214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0076c9 f24215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z8[] f24216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0231i9[] f24217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f24218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[][] f24219f;

    public C0281k9() {
        a();
    }

    public static C0281k9[] b() {
        if (f24213j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24213j == null) {
                        f24213j = new C0281k9[0];
                    }
                } finally {
                }
            }
        }
        return f24213j;
    }

    public final C0281k9 a() {
        this.f24214a = C0205h9.b();
        this.f24215b = null;
        this.f24216c = Z8.b();
        this.f24217d = C0231i9.b();
        this.f24218e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f24219f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0205h9[] c0205h9Arr = this.f24214a;
        int i10 = 0;
        if (c0205h9Arr != null && c0205h9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C0205h9[] c0205h9Arr2 = this.f24214a;
                if (i11 >= c0205h9Arr2.length) {
                    break;
                }
                C0205h9 c0205h9 = c0205h9Arr2[i11];
                if (c0205h9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c0205h9) + iComputeSerializedSize;
                }
                i11++;
            }
        }
        C0076c9 c0076c9 = this.f24215b;
        if (c0076c9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0076c9);
        }
        Z8[] z8Arr = this.f24216c;
        if (z8Arr != null && z8Arr.length > 0) {
            int i12 = 0;
            while (true) {
                Z8[] z8Arr2 = this.f24216c;
                if (i12 >= z8Arr2.length) {
                    break;
                }
                Z8 z82 = z8Arr2[i12];
                if (z82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, z82) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        C0231i9[] c0231i9Arr = this.f24217d;
        if (c0231i9Arr != null && c0231i9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C0231i9[] c0231i9Arr2 = this.f24217d;
                if (i13 >= c0231i9Arr2.length) {
                    break;
                }
                C0231i9 c0231i9 = c0231i9Arr2[i13];
                if (c0231i9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0231i9) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        String[] strArr = this.f24218e;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            int iComputeStringSizeNoTag = 0;
            int i15 = 0;
            while (true) {
                String[] strArr2 = this.f24218e;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    i15++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i14++;
            }
            iComputeSerializedSize = iComputeSerializedSize + iComputeStringSizeNoTag + i15;
        }
        byte[][] bArr = this.f24219f;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeBytesSizeNoTag = 0;
        int i16 = 0;
        while (true) {
            byte[][] bArr2 = this.f24219f;
            if (i10 >= bArr2.length) {
                return iComputeSerializedSize + iComputeBytesSizeNoTag + i16;
            }
            byte[] bArr3 = bArr2[i10];
            if (bArr3 != null) {
                i16++;
                iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
            }
            i10++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0205h9[] c0205h9Arr = this.f24214a;
        int i10 = 0;
        if (c0205h9Arr != null && c0205h9Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C0205h9[] c0205h9Arr2 = this.f24214a;
                if (i11 >= c0205h9Arr2.length) {
                    break;
                }
                C0205h9 c0205h9 = c0205h9Arr2[i11];
                if (c0205h9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0205h9);
                }
                i11++;
            }
        }
        C0076c9 c0076c9 = this.f24215b;
        if (c0076c9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0076c9);
        }
        Z8[] z8Arr = this.f24216c;
        if (z8Arr != null && z8Arr.length > 0) {
            int i12 = 0;
            while (true) {
                Z8[] z8Arr2 = this.f24216c;
                if (i12 >= z8Arr2.length) {
                    break;
                }
                Z8 z82 = z8Arr2[i12];
                if (z82 != null) {
                    codedOutputByteBufferNano.writeMessage(7, z82);
                }
                i12++;
            }
        }
        C0231i9[] c0231i9Arr = this.f24217d;
        if (c0231i9Arr != null && c0231i9Arr.length > 0) {
            int i13 = 0;
            while (true) {
                C0231i9[] c0231i9Arr2 = this.f24217d;
                if (i13 >= c0231i9Arr2.length) {
                    break;
                }
                C0231i9 c0231i9 = c0231i9Arr2[i13];
                if (c0231i9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0231i9);
                }
                i13++;
            }
        }
        String[] strArr = this.f24218e;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr2 = this.f24218e;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i14++;
            }
        }
        byte[][] bArr = this.f24219f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f24219f;
                if (i10 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i10];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0281k9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0281k9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0281k9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0205h9[] c0205h9Arr = this.f24214a;
                int length = c0205h9Arr == null ? 0 : c0205h9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C0205h9[] c0205h9Arr2 = new C0205h9[i10];
                if (length != 0) {
                    System.arraycopy(c0205h9Arr, 0, c0205h9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C0205h9 c0205h9 = new C0205h9();
                    c0205h9Arr2[length] = c0205h9;
                    codedInputByteBufferNano.readMessage(c0205h9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0205h9 c0205h92 = new C0205h9();
                c0205h9Arr2[length] = c0205h92;
                codedInputByteBufferNano.readMessage(c0205h92);
                this.f24214a = c0205h9Arr2;
            } else if (tag == 34) {
                if (this.f24215b == null) {
                    this.f24215b = new C0076c9();
                }
                codedInputByteBufferNano.readMessage(this.f24215b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                Z8[] z8Arr = this.f24216c;
                int length2 = z8Arr == null ? 0 : z8Arr.length;
                int i11 = repeatedFieldArrayLength2 + length2;
                Z8[] z8Arr2 = new Z8[i11];
                if (length2 != 0) {
                    System.arraycopy(z8Arr, 0, z8Arr2, 0, length2);
                }
                while (length2 < i11 - 1) {
                    Z8 z82 = new Z8();
                    z8Arr2[length2] = z82;
                    codedInputByteBufferNano.readMessage(z82);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                Z8 z83 = new Z8();
                z8Arr2[length2] = z83;
                codedInputByteBufferNano.readMessage(z83);
                this.f24216c = z8Arr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C0231i9[] c0231i9Arr = this.f24217d;
                int length3 = c0231i9Arr == null ? 0 : c0231i9Arr.length;
                int i12 = repeatedFieldArrayLength3 + length3;
                C0231i9[] c0231i9Arr2 = new C0231i9[i12];
                if (length3 != 0) {
                    System.arraycopy(c0231i9Arr, 0, c0231i9Arr2, 0, length3);
                }
                while (length3 < i12 - 1) {
                    C0231i9 c0231i9 = new C0231i9();
                    c0231i9Arr2[length3] = c0231i9;
                    codedInputByteBufferNano.readMessage(c0231i9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C0231i9 c0231i92 = new C0231i9();
                c0231i9Arr2[length3] = c0231i92;
                codedInputByteBufferNano.readMessage(c0231i92);
                this.f24217d = c0231i9Arr2;
            } else if (tag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f24218e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i13 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i13];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i13 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f24218e = strArr2;
            } else if (tag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f24219f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i14 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i14][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i14 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f24219f = bArr2;
            }
        }
        return this;
    }

    public static C0281k9 a(byte[] bArr) {
        return (C0281k9) MessageNano.mergeFrom(new C0281k9(), bArr);
    }
}
