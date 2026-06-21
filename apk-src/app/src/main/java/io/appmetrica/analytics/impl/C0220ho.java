package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0220ho extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0220ho[] f24028b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0142eo[] f24029a;

    public C0220ho() {
        a();
    }

    public static C0220ho[] b() {
        if (f24028b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24028b == null) {
                        f24028b = new C0220ho[0];
                    }
                } finally {
                }
            }
        }
        return f24028b;
    }

    public final C0220ho a() {
        this.f24029a = C0142eo.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0142eo[] c0142eoArr = this.f24029a;
        if (c0142eoArr != null && c0142eoArr.length > 0) {
            int i = 0;
            while (true) {
                C0142eo[] c0142eoArr2 = this.f24029a;
                if (i >= c0142eoArr2.length) {
                    break;
                }
                C0142eo c0142eo = c0142eoArr2[i];
                if (c0142eo != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0142eo) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0142eo[] c0142eoArr = this.f24029a;
        if (c0142eoArr != null && c0142eoArr.length > 0) {
            int i = 0;
            while (true) {
                C0142eo[] c0142eoArr2 = this.f24029a;
                if (i >= c0142eoArr2.length) {
                    break;
                }
                C0142eo c0142eo = c0142eoArr2[i];
                if (c0142eo != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0142eo);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0220ho mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
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
                C0142eo[] c0142eoArr = this.f24029a;
                int length = c0142eoArr == null ? 0 : c0142eoArr.length;
                int i = repeatedFieldArrayLength + length;
                C0142eo[] c0142eoArr2 = new C0142eo[i];
                if (length != 0) {
                    System.arraycopy(c0142eoArr, 0, c0142eoArr2, 0, length);
                }
                while (length < i - 1) {
                    C0142eo c0142eo = new C0142eo();
                    c0142eoArr2[length] = c0142eo;
                    codedInputByteBufferNano.readMessage(c0142eo);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0142eo c0142eo2 = new C0142eo();
                c0142eoArr2[length] = c0142eo2;
                codedInputByteBufferNano.readMessage(c0142eo2);
                this.f24029a = c0142eoArr2;
            }
        }
        return this;
    }

    public static C0220ho b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0220ho().mergeFrom(codedInputByteBufferNano);
    }

    public static C0220ho a(byte[] bArr) {
        return (C0220ho) MessageNano.mergeFrom(new C0220ho(), bArr);
    }
}
