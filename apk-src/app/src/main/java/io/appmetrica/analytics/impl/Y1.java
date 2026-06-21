package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Y1 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Y1[] f23278d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X1[] f23279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W1 f23280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f23281c;

    public Y1() {
        a();
    }

    public static Y1[] b() {
        if (f23278d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23278d == null) {
                        f23278d = new Y1[0];
                    }
                } finally {
                }
            }
        }
        return f23278d;
    }

    public final Y1 a() {
        this.f23279a = X1.b();
        this.f23280b = null;
        this.f23281c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        X1[] x1Arr = this.f23279a;
        int i = 0;
        if (x1Arr != null && x1Arr.length > 0) {
            int i10 = 0;
            while (true) {
                X1[] x1Arr2 = this.f23279a;
                if (i10 >= x1Arr2.length) {
                    break;
                }
                X1 x12 = x1Arr2[i10];
                if (x12 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, x12) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        W1 w12 = this.f23280b;
        if (w12 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, w12);
        }
        String[] strArr = this.f23281c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.f23281c;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i11;
            }
            String str = strArr2[i];
            if (str != null) {
                i11++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        X1[] x1Arr = this.f23279a;
        int i = 0;
        if (x1Arr != null && x1Arr.length > 0) {
            int i10 = 0;
            while (true) {
                X1[] x1Arr2 = this.f23279a;
                if (i10 >= x1Arr2.length) {
                    break;
                }
                X1 x12 = x1Arr2[i10];
                if (x12 != null) {
                    codedOutputByteBufferNano.writeMessage(1, x12);
                }
                i10++;
            }
        }
        W1 w12 = this.f23280b;
        if (w12 != null) {
            codedOutputByteBufferNano.writeMessage(2, w12);
        }
        String[] strArr = this.f23281c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f23281c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                X1[] x1Arr = this.f23279a;
                int length = x1Arr == null ? 0 : x1Arr.length;
                int i = repeatedFieldArrayLength + length;
                X1[] x1Arr2 = new X1[i];
                if (length != 0) {
                    System.arraycopy(x1Arr, 0, x1Arr2, 0, length);
                }
                while (length < i - 1) {
                    X1 x12 = new X1();
                    x1Arr2[length] = x12;
                    codedInputByteBufferNano.readMessage(x12);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                X1 x13 = new X1();
                x1Arr2[length] = x13;
                codedInputByteBufferNano.readMessage(x13);
                this.f23279a = x1Arr2;
            } else if (tag == 18) {
                if (this.f23280b == null) {
                    this.f23280b = new W1();
                }
                codedInputByteBufferNano.readMessage(this.f23280b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f23281c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i10 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i10];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i10 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f23281c = strArr2;
            }
        }
        return this;
    }

    public static Y1 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Y1().mergeFrom(codedInputByteBufferNano);
    }

    public static Y1 a(byte[] bArr) {
        return (Y1) MessageNano.mergeFrom(new Y1(), bArr);
    }
}
