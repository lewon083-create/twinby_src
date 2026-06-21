package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0073c6 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C0073c6[] f23559f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0021a6[] f23562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0073c6 f23563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0073c6[] f23564e;

    public C0073c6() {
        a();
    }

    public static C0073c6[] b() {
        if (f23559f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23559f == null) {
                        f23559f = new C0073c6[0];
                    }
                } finally {
                }
            }
        }
        return f23559f;
    }

    public final C0073c6 a() {
        this.f23560a = "";
        this.f23561b = "";
        this.f23562c = C0021a6.b();
        this.f23563d = null;
        this.f23564e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f23560a) + super.computeSerializedSize();
        if (!this.f23561b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f23561b);
        }
        C0021a6[] c0021a6Arr = this.f23562c;
        int i = 0;
        if (c0021a6Arr != null && c0021a6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C0021a6[] c0021a6Arr2 = this.f23562c;
                if (i10 >= c0021a6Arr2.length) {
                    break;
                }
                C0021a6 c0021a6 = c0021a6Arr2[i10];
                if (c0021a6 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c0021a6) + iComputeStringSize;
                }
                i10++;
            }
        }
        C0073c6 c0073c6 = this.f23563d;
        if (c0073c6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c0073c6);
        }
        C0073c6[] c0073c6Arr = this.f23564e;
        if (c0073c6Arr != null && c0073c6Arr.length > 0) {
            while (true) {
                C0073c6[] c0073c6Arr2 = this.f23564e;
                if (i >= c0073c6Arr2.length) {
                    break;
                }
                C0073c6 c0073c62 = c0073c6Arr2[i];
                if (c0073c62 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c0073c62) + iComputeStringSize;
                }
                i++;
            }
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeString(1, this.f23560a);
        if (!this.f23561b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f23561b);
        }
        C0021a6[] c0021a6Arr = this.f23562c;
        int i = 0;
        if (c0021a6Arr != null && c0021a6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C0021a6[] c0021a6Arr2 = this.f23562c;
                if (i10 >= c0021a6Arr2.length) {
                    break;
                }
                C0021a6 c0021a6 = c0021a6Arr2[i10];
                if (c0021a6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0021a6);
                }
                i10++;
            }
        }
        C0073c6 c0073c6 = this.f23563d;
        if (c0073c6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0073c6);
        }
        C0073c6[] c0073c6Arr = this.f23564e;
        if (c0073c6Arr != null && c0073c6Arr.length > 0) {
            while (true) {
                C0073c6[] c0073c6Arr2 = this.f23564e;
                if (i >= c0073c6Arr2.length) {
                    break;
                }
                C0073c6 c0073c62 = c0073c6Arr2[i];
                if (c0073c62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0073c62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0073c6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0073c6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0073c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23560a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f23561b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0021a6[] c0021a6Arr = this.f23562c;
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
                this.f23562c = c0021a6Arr2;
            } else if (tag == 34) {
                if (this.f23563d == null) {
                    this.f23563d = new C0073c6();
                }
                codedInputByteBufferNano.readMessage(this.f23563d);
            } else if (tag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C0073c6[] c0073c6Arr = this.f23564e;
                int length2 = c0073c6Arr == null ? 0 : c0073c6Arr.length;
                int i10 = repeatedFieldArrayLength2 + length2;
                C0073c6[] c0073c6Arr2 = new C0073c6[i10];
                if (length2 != 0) {
                    System.arraycopy(c0073c6Arr, 0, c0073c6Arr2, 0, length2);
                }
                while (length2 < i10 - 1) {
                    C0073c6 c0073c6 = new C0073c6();
                    c0073c6Arr2[length2] = c0073c6;
                    codedInputByteBufferNano.readMessage(c0073c6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0073c6 c0073c62 = new C0073c6();
                c0073c6Arr2[length2] = c0073c62;
                codedInputByteBufferNano.readMessage(c0073c62);
                this.f23564e = c0073c6Arr2;
            }
        }
        return this;
    }

    public static C0073c6 a(byte[] bArr) {
        return (C0073c6) MessageNano.mergeFrom(new C0073c6(), bArr);
    }
}
