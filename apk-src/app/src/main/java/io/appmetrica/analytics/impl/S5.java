package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class S5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile S5[] f22944d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0047b6 f22945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0047b6[] f22946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22947c;

    public S5() {
        a();
    }

    public static S5[] b() {
        if (f22944d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22944d == null) {
                        f22944d = new S5[0];
                    }
                } finally {
                }
            }
        }
        return f22944d;
    }

    public final S5 a() {
        this.f22945a = null;
        this.f22946b = C0047b6.b();
        this.f22947c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0047b6 c0047b6 = this.f22945a;
        if (c0047b6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0047b6);
        }
        C0047b6[] c0047b6Arr = this.f22946b;
        if (c0047b6Arr != null && c0047b6Arr.length > 0) {
            int i = 0;
            while (true) {
                C0047b6[] c0047b6Arr2 = this.f22946b;
                if (i >= c0047b6Arr2.length) {
                    break;
                }
                C0047b6 c0047b62 = c0047b6Arr2[i];
                if (c0047b62 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0047b62) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return !this.f22947c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.f22947c) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0047b6 c0047b6 = this.f22945a;
        if (c0047b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0047b6);
        }
        C0047b6[] c0047b6Arr = this.f22946b;
        if (c0047b6Arr != null && c0047b6Arr.length > 0) {
            int i = 0;
            while (true) {
                C0047b6[] c0047b6Arr2 = this.f22946b;
                if (i >= c0047b6Arr2.length) {
                    break;
                }
                C0047b6 c0047b62 = c0047b6Arr2[i];
                if (c0047b62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0047b62);
                }
                i++;
            }
        }
        if (!this.f22947c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f22947c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f22945a == null) {
                    this.f22945a = new C0047b6();
                }
                codedInputByteBufferNano.readMessage(this.f22945a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0047b6[] c0047b6Arr = this.f22946b;
                int length = c0047b6Arr == null ? 0 : c0047b6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0047b6[] c0047b6Arr2 = new C0047b6[i];
                if (length != 0) {
                    System.arraycopy(c0047b6Arr, 0, c0047b6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0047b6 c0047b6 = new C0047b6();
                    c0047b6Arr2[length] = c0047b6;
                    codedInputByteBufferNano.readMessage(c0047b6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0047b6 c0047b62 = new C0047b6();
                c0047b6Arr2[length] = c0047b62;
                codedInputByteBufferNano.readMessage(c0047b62);
                this.f22946b = c0047b6Arr2;
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f22947c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static S5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new S5().mergeFrom(codedInputByteBufferNano);
    }

    public static S5 a(byte[] bArr) {
        return (S5) MessageNano.mergeFrom(new S5(), bArr);
    }
}
