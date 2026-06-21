package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0355n8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0355n8[] f24421c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0101d8 f24422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0101d8[] f24423b;

    public C0355n8() {
        a();
    }

    public static C0355n8[] b() {
        if (f24421c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24421c == null) {
                        f24421c = new C0355n8[0];
                    }
                } finally {
                }
            }
        }
        return f24421c;
    }

    public final C0355n8 a() {
        this.f24422a = null;
        this.f24423b = C0101d8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0101d8 c0101d8 = this.f24422a;
        if (c0101d8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0101d8);
        }
        C0101d8[] c0101d8Arr = this.f24423b;
        if (c0101d8Arr != null && c0101d8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0101d8[] c0101d8Arr2 = this.f24423b;
                if (i >= c0101d8Arr2.length) {
                    break;
                }
                C0101d8 c0101d82 = c0101d8Arr2[i];
                if (c0101d82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0101d82) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0101d8 c0101d8 = this.f24422a;
        if (c0101d8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0101d8);
        }
        C0101d8[] c0101d8Arr = this.f24423b;
        if (c0101d8Arr != null && c0101d8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0101d8[] c0101d8Arr2 = this.f24423b;
                if (i >= c0101d8Arr2.length) {
                    break;
                }
                C0101d8 c0101d82 = c0101d8Arr2[i];
                if (c0101d82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0101d82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0355n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f24422a == null) {
                    this.f24422a = new C0101d8();
                }
                codedInputByteBufferNano.readMessage(this.f24422a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0101d8[] c0101d8Arr = this.f24423b;
                int length = c0101d8Arr == null ? 0 : c0101d8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0101d8[] c0101d8Arr2 = new C0101d8[i];
                if (length != 0) {
                    System.arraycopy(c0101d8Arr, 0, c0101d8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0101d8 c0101d8 = new C0101d8();
                    c0101d8Arr2[length] = c0101d8;
                    codedInputByteBufferNano.readMessage(c0101d8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0101d8 c0101d82 = new C0101d8();
                c0101d8Arr2[length] = c0101d82;
                codedInputByteBufferNano.readMessage(c0101d82);
                this.f24423b = c0101d8Arr2;
            }
        }
        return this;
    }

    public static C0355n8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0355n8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0355n8 a(byte[] bArr) {
        return (C0355n8) MessageNano.mergeFrom(new C0355n8(), bArr);
    }
}
