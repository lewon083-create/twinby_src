package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Y5 extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f23303l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f23304m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile Y5[] f23305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static byte[] f23306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile boolean f23307p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0073c6 f23308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S5 f23309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0021a6[] f23312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X5 f23315h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f23316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public U5[] f23317k;

    public Y5() {
        if (!f23307p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f23307p) {
                        f23306o = InternalNano.bytesDefaultValue("JVM");
                        f23307p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static Y5[] b() {
        if (f23305n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23305n == null) {
                        f23305n = new Y5[0];
                    }
                } finally {
                }
            }
        }
        return f23305n;
    }

    public final Y5 a() {
        this.f23308a = null;
        this.f23309b = null;
        this.f23310c = "";
        this.f23311d = -1;
        this.f23312e = C0021a6.b();
        this.f23313f = "";
        this.f23314g = 0;
        this.f23315h = null;
        this.i = (byte[]) f23306o.clone();
        this.f23316j = WireFormatNano.EMPTY_BYTES;
        this.f23317k = U5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0073c6 c0073c6 = this.f23308a;
        if (c0073c6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0073c6);
        }
        S5 s52 = this.f23309b;
        if (s52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, s52);
        }
        if (!this.f23310c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f23310c);
        }
        int i = this.f23311d;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C0021a6[] c0021a6Arr = this.f23312e;
        int i10 = 0;
        if (c0021a6Arr != null && c0021a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C0021a6[] c0021a6Arr2 = this.f23312e;
                if (i11 >= c0021a6Arr2.length) {
                    break;
                }
                C0021a6 c0021a6 = c0021a6Arr2[i11];
                if (c0021a6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c0021a6) + iComputeSerializedSize;
                }
                i11++;
            }
        }
        if (!this.f23313f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f23313f);
        }
        int i12 = this.f23314g;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i12);
        }
        X5 x52 = this.f23315h;
        if (x52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, x52);
        }
        if (!Arrays.equals(this.i, f23306o)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        if (!Arrays.equals(this.f23316j, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f23316j);
        }
        U5[] u5Arr = this.f23317k;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f23317k;
                if (i10 >= u5Arr2.length) {
                    break;
                }
                U5 u5 = u5Arr2[i10];
                if (u5 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, u5) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0073c6 c0073c6 = this.f23308a;
        if (c0073c6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0073c6);
        }
        S5 s52 = this.f23309b;
        if (s52 != null) {
            codedOutputByteBufferNano.writeMessage(2, s52);
        }
        if (!this.f23310c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f23310c);
        }
        int i = this.f23311d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C0021a6[] c0021a6Arr = this.f23312e;
        int i10 = 0;
        if (c0021a6Arr != null && c0021a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C0021a6[] c0021a6Arr2 = this.f23312e;
                if (i11 >= c0021a6Arr2.length) {
                    break;
                }
                C0021a6 c0021a6 = c0021a6Arr2[i11];
                if (c0021a6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0021a6);
                }
                i11++;
            }
        }
        if (!this.f23313f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f23313f);
        }
        int i12 = this.f23314g;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i12);
        }
        X5 x52 = this.f23315h;
        if (x52 != null) {
            codedOutputByteBufferNano.writeMessage(8, x52);
        }
        if (!Arrays.equals(this.i, f23306o)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.f23316j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f23316j);
        }
        U5[] u5Arr = this.f23317k;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f23317k;
                if (i10 >= u5Arr2.length) {
                    break;
                }
                U5 u5 = u5Arr2[i10];
                if (u5 != null) {
                    codedOutputByteBufferNano.writeMessage(11, u5);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Y5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Y5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    if (this.f23308a == null) {
                        this.f23308a = new C0073c6();
                    }
                    codedInputByteBufferNano.readMessage(this.f23308a);
                    break;
                case 18:
                    if (this.f23309b == null) {
                        this.f23309b = new S5();
                    }
                    codedInputByteBufferNano.readMessage(this.f23309b);
                    break;
                case 26:
                    this.f23310c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f23311d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0021a6[] c0021a6Arr = this.f23312e;
                    int length = c0021a6Arr == null ? 0 : c0021a6Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C0021a6[] c0021a6Arr2 = new C0021a6[i];
                    if (length != 0) {
                        System.arraycopy(c0021a6Arr, 0, c0021a6Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C0021a6 c0021a6 = new C0021a6();
                        c0021a6Arr2[length] = c0021a6;
                        codedInputByteBufferNano.readMessage(c0021a6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0021a6 c0021a62 = new C0021a6();
                    c0021a6Arr2[length] = c0021a62;
                    codedInputByteBufferNano.readMessage(c0021a62);
                    this.f23312e = c0021a6Arr2;
                    break;
                case 50:
                    this.f23313f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 0 || int322 == 1) {
                        this.f23314g = int322;
                    }
                    break;
                case 66:
                    if (this.f23315h == null) {
                        this.f23315h = new X5();
                    }
                    codedInputByteBufferNano.readMessage(this.f23315h);
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f23316j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    U5[] u5Arr = this.f23317k;
                    int length2 = u5Arr == null ? 0 : u5Arr.length;
                    int i10 = repeatedFieldArrayLength2 + length2;
                    U5[] u5Arr2 = new U5[i10];
                    if (length2 != 0) {
                        System.arraycopy(u5Arr, 0, u5Arr2, 0, length2);
                    }
                    while (length2 < i10 - 1) {
                        U5 u5 = new U5();
                        u5Arr2[length2] = u5;
                        codedInputByteBufferNano.readMessage(u5);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    U5 u52 = new U5();
                    u5Arr2[length2] = u52;
                    codedInputByteBufferNano.readMessage(u52);
                    this.f23317k = u5Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static Y5 a(byte[] bArr) {
        return (Y5) MessageNano.mergeFrom(new Y5(), bArr);
    }
}
