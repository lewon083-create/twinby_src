package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile t[] f21537c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f21539b;

    public t() {
        a();
    }

    public static t[] b() {
        if (f21537c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21537c == null) {
                        f21537c = new t[0];
                    }
                } finally {
                }
            }
        }
        return f21537c;
    }

    public final t a() {
        this.f21538a = true;
        this.f21539b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f21538a;
        if (!z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        s sVar = this.f21539b;
        return sVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, sVar) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        boolean z5 = this.f21538a;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        s sVar = this.f21539b;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(2, sVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f21538a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f21539b == null) {
                    this.f21539b = new s();
                }
                codedInputByteBufferNano.readMessage(this.f21539b);
            }
        }
        return this;
    }

    public static t b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new t().mergeFrom(codedInputByteBufferNano);
    }

    public static t a(byte[] bArr) {
        return (t) MessageNano.mergeFrom(new t(), bArr);
    }
}
