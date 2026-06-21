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
public final class W5 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f23197k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f23198l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile W5[] f23199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static byte[] f23200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile boolean f23201o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0073c6 f23202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S5 f23203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0021a6[] f23206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V5 f23208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f23209h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public U5[] f23210j;

    public W5() {
        if (!f23201o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f23201o) {
                        f23200n = InternalNano.bytesDefaultValue("JVM");
                        f23201o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static W5[] b() {
        if (f23199m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23199m == null) {
                        f23199m = new W5[0];
                    }
                } finally {
                }
            }
        }
        return f23199m;
    }

    public final W5 a() {
        this.f23202a = null;
        this.f23203b = null;
        this.f23204c = "";
        this.f23205d = -1;
        this.f23206e = C0021a6.b();
        this.f23207f = 0;
        this.f23208g = null;
        this.f23209h = (byte[]) f23200n.clone();
        this.i = WireFormatNano.EMPTY_BYTES;
        this.f23210j = U5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0073c6 c0073c6 = this.f23202a;
        if (c0073c6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0073c6);
        }
        S5 s52 = this.f23203b;
        if (s52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, s52);
        }
        if (!this.f23204c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f23204c);
        }
        int i = this.f23205d;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C0021a6[] c0021a6Arr = this.f23206e;
        int i10 = 0;
        if (c0021a6Arr != null && c0021a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C0021a6[] c0021a6Arr2 = this.f23206e;
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
        int i12 = this.f23207f;
        if (i12 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i12);
        }
        V5 v5 = this.f23208g;
        if (v5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, v5);
        }
        if (!Arrays.equals(this.f23209h, f23200n)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f23209h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        U5[] u5Arr = this.f23210j;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f23210j;
                if (i10 >= u5Arr2.length) {
                    break;
                }
                U5 u5 = u5Arr2[i10];
                if (u5 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, u5) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0073c6 c0073c6 = this.f23202a;
        if (c0073c6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0073c6);
        }
        S5 s52 = this.f23203b;
        if (s52 != null) {
            codedOutputByteBufferNano.writeMessage(2, s52);
        }
        if (!this.f23204c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f23204c);
        }
        int i = this.f23205d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C0021a6[] c0021a6Arr = this.f23206e;
        int i10 = 0;
        if (c0021a6Arr != null && c0021a6Arr.length > 0) {
            int i11 = 0;
            while (true) {
                C0021a6[] c0021a6Arr2 = this.f23206e;
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
        int i12 = this.f23207f;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i12);
        }
        V5 v5 = this.f23208g;
        if (v5 != null) {
            codedOutputByteBufferNano.writeMessage(7, v5);
        }
        if (!Arrays.equals(this.f23209h, f23200n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f23209h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        U5[] u5Arr = this.f23210j;
        if (u5Arr != null && u5Arr.length > 0) {
            while (true) {
                U5[] u5Arr2 = this.f23210j;
                if (i10 >= u5Arr2.length) {
                    break;
                }
                U5 u5 = u5Arr2[i10];
                if (u5 != null) {
                    codedOutputByteBufferNano.writeMessage(10, u5);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static W5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new W5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    if (this.f23202a == null) {
                        this.f23202a = new C0073c6();
                    }
                    codedInputByteBufferNano.readMessage(this.f23202a);
                    break;
                case 18:
                    if (this.f23203b == null) {
                        this.f23203b = new S5();
                    }
                    codedInputByteBufferNano.readMessage(this.f23203b);
                    break;
                case 26:
                    this.f23204c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f23205d = int32;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0021a6[] c0021a6Arr = this.f23206e;
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
                    this.f23206e = c0021a6Arr2;
                    break;
                case 48:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 0 || int322 == 1) {
                        this.f23207f = int322;
                    }
                    break;
                case 58:
                    if (this.f23208g == null) {
                        this.f23208g = new V5();
                    }
                    codedInputByteBufferNano.readMessage(this.f23208g);
                    break;
                case 66:
                    this.f23209h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    U5[] u5Arr = this.f23210j;
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
                    this.f23210j = u5Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static W5 a(byte[] bArr) {
        return (W5) MessageNano.mergeFrom(new W5(), bArr);
    }
}
