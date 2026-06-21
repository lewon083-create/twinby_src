package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0380o8 extends MessageNano {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C0380o8[] f24480h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f24481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f24482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0178g8 f24483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0330m8 f24484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0355n8 f24485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0355n8 f24486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0405p8[] f24487g;

    public C0380o8() {
        a();
    }

    public static C0380o8[] b() {
        if (f24480h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24480h == null) {
                        f24480h = new C0380o8[0];
                    }
                } finally {
                }
            }
        }
        return f24480h;
    }

    public final C0380o8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f24481a = bArr;
        this.f24482b = bArr;
        this.f24483c = null;
        this.f24484d = null;
        this.f24485e = null;
        this.f24486f = null;
        this.f24487g = C0405p8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f24481a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f24481a);
        }
        if (!Arrays.equals(this.f24482b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f24482b);
        }
        C0178g8 c0178g8 = this.f24483c;
        if (c0178g8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0178g8);
        }
        C0330m8 c0330m8 = this.f24484d;
        if (c0330m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0330m8);
        }
        C0355n8 c0355n8 = this.f24485e;
        if (c0355n8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0355n8);
        }
        C0355n8 c0355n82 = this.f24486f;
        if (c0355n82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c0355n82);
        }
        C0405p8[] c0405p8Arr = this.f24487g;
        if (c0405p8Arr != null && c0405p8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0405p8[] c0405p8Arr2 = this.f24487g;
                if (i >= c0405p8Arr2.length) {
                    break;
                }
                C0405p8 c0405p8 = c0405p8Arr2[i];
                if (c0405p8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0405p8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f24481a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f24481a);
        }
        if (!Arrays.equals(this.f24482b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f24482b);
        }
        C0178g8 c0178g8 = this.f24483c;
        if (c0178g8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0178g8);
        }
        C0330m8 c0330m8 = this.f24484d;
        if (c0330m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0330m8);
        }
        C0355n8 c0355n8 = this.f24485e;
        if (c0355n8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0355n8);
        }
        C0355n8 c0355n82 = this.f24486f;
        if (c0355n82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0355n82);
        }
        C0405p8[] c0405p8Arr = this.f24487g;
        if (c0405p8Arr != null && c0405p8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0405p8[] c0405p8Arr2 = this.f24487g;
                if (i >= c0405p8Arr2.length) {
                    break;
                }
                C0405p8 c0405p8 = c0405p8Arr2[i];
                if (c0405p8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0405p8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0380o8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0380o8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0380o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24481a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f24482b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f24483c == null) {
                    this.f24483c = new C0178g8();
                }
                codedInputByteBufferNano.readMessage(this.f24483c);
            } else if (tag == 34) {
                if (this.f24484d == null) {
                    this.f24484d = new C0330m8();
                }
                codedInputByteBufferNano.readMessage(this.f24484d);
            } else if (tag == 42) {
                if (this.f24485e == null) {
                    this.f24485e = new C0355n8();
                }
                codedInputByteBufferNano.readMessage(this.f24485e);
            } else if (tag == 50) {
                if (this.f24486f == null) {
                    this.f24486f = new C0355n8();
                }
                codedInputByteBufferNano.readMessage(this.f24486f);
            } else if (tag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0405p8[] c0405p8Arr = this.f24487g;
                int length = c0405p8Arr == null ? 0 : c0405p8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0405p8[] c0405p8Arr2 = new C0405p8[i];
                if (length != 0) {
                    System.arraycopy(c0405p8Arr, 0, c0405p8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0405p8 c0405p8 = new C0405p8();
                    c0405p8Arr2[length] = c0405p8;
                    codedInputByteBufferNano.readMessage(c0405p8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0405p8 c0405p82 = new C0405p8();
                c0405p8Arr2[length] = c0405p82;
                codedInputByteBufferNano.readMessage(c0405p82);
                this.f24487g = c0405p8Arr2;
            }
        }
        return this;
    }

    public static C0380o8 a(byte[] bArr) {
        return (C0380o8) MessageNano.mergeFrom(new C0380o8(), bArr);
    }
}
