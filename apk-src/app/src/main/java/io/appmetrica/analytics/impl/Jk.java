package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Jk extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Jk[] f22539b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Kk[] f22540a;

    public Jk() {
        a();
    }

    public static Jk[] b() {
        if (f22539b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22539b == null) {
                        f22539b = new Jk[0];
                    }
                } finally {
                }
            }
        }
        return f22539b;
    }

    public final Jk a() {
        this.f22540a = Kk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        Kk[] kkArr = this.f22540a;
        if (kkArr != null && kkArr.length > 0) {
            int i = 0;
            while (true) {
                Kk[] kkArr2 = this.f22540a;
                if (i >= kkArr2.length) {
                    break;
                }
                Kk kk2 = kkArr2[i];
                if (kk2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, kk2) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        Kk[] kkArr = this.f22540a;
        if (kkArr != null && kkArr.length > 0) {
            int i = 0;
            while (true) {
                Kk[] kkArr2 = this.f22540a;
                if (i >= kkArr2.length) {
                    break;
                }
                Kk kk2 = kkArr2[i];
                if (kk2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, kk2);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Jk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
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
                Kk[] kkArr = this.f22540a;
                int length = kkArr == null ? 0 : kkArr.length;
                int i = repeatedFieldArrayLength + length;
                Kk[] kkArr2 = new Kk[i];
                if (length != 0) {
                    System.arraycopy(kkArr, 0, kkArr2, 0, length);
                }
                while (length < i - 1) {
                    Kk kk2 = new Kk();
                    kkArr2[length] = kk2;
                    codedInputByteBufferNano.readMessage(kk2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Kk kk3 = new Kk();
                kkArr2[length] = kk3;
                codedInputByteBufferNano.readMessage(kk3);
                this.f22540a = kkArr2;
            }
        }
        return this;
    }

    public static Jk b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Jk().mergeFrom(codedInputByteBufferNano);
    }

    public static Jk a(byte[] bArr) {
        return (Jk) MessageNano.mergeFrom(new Jk(), bArr);
    }
}
