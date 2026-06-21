package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0599x3 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0599x3[] f25002b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0574w3[] f25003a;

    public C0599x3() {
        a();
    }

    public static C0599x3[] b() {
        if (f25002b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f25002b == null) {
                        f25002b = new C0599x3[0];
                    }
                } finally {
                }
            }
        }
        return f25002b;
    }

    public final C0599x3 a() {
        this.f25003a = C0574w3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0574w3[] c0574w3Arr = this.f25003a;
        if (c0574w3Arr != null && c0574w3Arr.length > 0) {
            int i = 0;
            while (true) {
                C0574w3[] c0574w3Arr2 = this.f25003a;
                if (i >= c0574w3Arr2.length) {
                    break;
                }
                C0574w3 c0574w3 = c0574w3Arr2[i];
                if (c0574w3 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0574w3) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0574w3[] c0574w3Arr = this.f25003a;
        if (c0574w3Arr != null && c0574w3Arr.length > 0) {
            int i = 0;
            while (true) {
                C0574w3[] c0574w3Arr2 = this.f25003a;
                if (i >= c0574w3Arr2.length) {
                    break;
                }
                C0574w3 c0574w3 = c0574w3Arr2[i];
                if (c0574w3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0574w3);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0599x3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0574w3[] c0574w3Arr = this.f25003a;
                int length = c0574w3Arr == null ? 0 : c0574w3Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0574w3[] c0574w3Arr2 = new C0574w3[i];
                if (length != 0) {
                    System.arraycopy(c0574w3Arr, 0, c0574w3Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0574w3 c0574w3 = new C0574w3();
                    c0574w3Arr2[length] = c0574w3;
                    codedInputByteBufferNano.readMessage(c0574w3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0574w3 c0574w32 = new C0574w3();
                c0574w3Arr2[length] = c0574w32;
                codedInputByteBufferNano.readMessage(c0574w32);
                this.f25003a = c0574w3Arr2;
            }
        }
        return this;
    }

    public static C0599x3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0599x3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0599x3 a(byte[] bArr) {
        return (C0599x3) MessageNano.mergeFrom(new C0599x3(), bArr);
    }
}
