package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0280k8 extends MessageNano {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0280k8[] f24209b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0230i8 f24210a;

    public C0280k8() {
        a();
    }

    public static C0280k8[] b() {
        if (f24209b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24209b == null) {
                        f24209b = new C0280k8[0];
                    }
                } finally {
                }
            }
        }
        return f24209b;
    }

    public final C0280k8 a() {
        this.f24210a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0230i8 c0230i8 = this.f24210a;
        return c0230i8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0230i8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0230i8 c0230i8 = this.f24210a;
        if (c0230i8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0230i8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0280k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
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
                if (this.f24210a == null) {
                    this.f24210a = new C0230i8();
                }
                codedInputByteBufferNano.readMessage(this.f24210a);
            }
        }
        return this;
    }

    public static C0280k8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0280k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0280k8 a(byte[] bArr) {
        return (C0280k8) MessageNano.mergeFrom(new C0280k8(), bArr);
    }
}
