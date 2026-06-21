package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class M8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile M8[] f22668b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L8[] f22669a;

    public M8() {
        a();
    }

    public static M8[] b() {
        if (f22668b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22668b == null) {
                        f22668b = new M8[0];
                    }
                } finally {
                }
            }
        }
        return f22668b;
    }

    public final M8 a() {
        this.f22669a = L8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        L8[] l8Arr = this.f22669a;
        if (l8Arr != null && l8Arr.length > 0) {
            int i = 0;
            while (true) {
                L8[] l8Arr2 = this.f22669a;
                if (i >= l8Arr2.length) {
                    break;
                }
                L8 l82 = l8Arr2[i];
                if (l82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, l82) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        L8[] l8Arr = this.f22669a;
        if (l8Arr != null && l8Arr.length > 0) {
            int i = 0;
            while (true) {
                L8[] l8Arr2 = this.f22669a;
                if (i >= l8Arr2.length) {
                    break;
                }
                L8 l82 = l8Arr2[i];
                if (l82 != null) {
                    codedOutputByteBufferNano.writeMessage(1, l82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
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
                L8[] l8Arr = this.f22669a;
                int length = l8Arr == null ? 0 : l8Arr.length;
                int i = repeatedFieldArrayLength + length;
                L8[] l8Arr2 = new L8[i];
                if (length != 0) {
                    System.arraycopy(l8Arr, 0, l8Arr2, 0, length);
                }
                while (length < i - 1) {
                    L8 l82 = new L8();
                    l8Arr2[length] = l82;
                    codedInputByteBufferNano.readMessage(l82);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                L8 l83 = new L8();
                l8Arr2[length] = l83;
                codedInputByteBufferNano.readMessage(l83);
                this.f22669a = l8Arr2;
            }
        }
        return this;
    }

    public static M8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new M8().mergeFrom(codedInputByteBufferNano);
    }

    public static M8 a(byte[] bArr) {
        return (M8) MessageNano.mergeFrom(new M8(), bArr);
    }
}
