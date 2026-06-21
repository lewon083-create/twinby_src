package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0344mm extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0344mm[] f24383b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0319lm[] f24384a;

    public C0344mm() {
        a();
    }

    public static C0344mm[] b() {
        if (f24383b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24383b == null) {
                        f24383b = new C0344mm[0];
                    }
                } finally {
                }
            }
        }
        return f24383b;
    }

    public final C0344mm a() {
        this.f24384a = C0319lm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0319lm[] c0319lmArr = this.f24384a;
        if (c0319lmArr != null && c0319lmArr.length > 0) {
            int i = 0;
            while (true) {
                C0319lm[] c0319lmArr2 = this.f24384a;
                if (i >= c0319lmArr2.length) {
                    break;
                }
                C0319lm c0319lm = c0319lmArr2[i];
                if (c0319lm != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0319lm) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0319lm[] c0319lmArr = this.f24384a;
        if (c0319lmArr != null && c0319lmArr.length > 0) {
            int i = 0;
            while (true) {
                C0319lm[] c0319lmArr2 = this.f24384a;
                if (i >= c0319lmArr2.length) {
                    break;
                }
                C0319lm c0319lm = c0319lmArr2[i];
                if (c0319lm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0319lm);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0344mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
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
                C0319lm[] c0319lmArr = this.f24384a;
                int length = c0319lmArr == null ? 0 : c0319lmArr.length;
                int i = repeatedFieldArrayLength + length;
                C0319lm[] c0319lmArr2 = new C0319lm[i];
                if (length != 0) {
                    System.arraycopy(c0319lmArr, 0, c0319lmArr2, 0, length);
                }
                while (length < i - 1) {
                    C0319lm c0319lm = new C0319lm();
                    c0319lmArr2[length] = c0319lm;
                    codedInputByteBufferNano.readMessage(c0319lm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0319lm c0319lm2 = new C0319lm();
                c0319lmArr2[length] = c0319lm2;
                codedInputByteBufferNano.readMessage(c0319lm2);
                this.f24384a = c0319lmArr2;
            }
        }
        return this;
    }

    public static C0344mm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0344mm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0344mm a(byte[] bArr) {
        return (C0344mm) MessageNano.mergeFrom(new C0344mm(), bArr);
    }
}
