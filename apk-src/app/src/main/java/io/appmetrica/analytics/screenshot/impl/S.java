package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class S extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile S[] f25446c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f25448b;

    public S() {
        a();
    }

    public static S[] b() {
        if (f25446c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f25446c == null) {
                        f25446c = new S[0];
                    }
                } finally {
                }
            }
        }
        return f25446c;
    }

    public final S a() {
        this.f25447a = true;
        this.f25448b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f25447a;
        if (!z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        Q q2 = this.f25448b;
        return q2 != null ? CodedOutputByteBufferNano.computeMessageSize(2, q2) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        boolean z5 = this.f25447a;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        Q q2 = this.f25448b;
        if (q2 != null) {
            codedOutputByteBufferNano.writeMessage(2, q2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f25447a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f25448b == null) {
                    this.f25448b = new Q();
                }
                codedInputByteBufferNano.readMessage(this.f25448b);
            }
        }
        return this;
    }

    public static S b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new S().mergeFrom(codedInputByteBufferNano);
    }

    public static S a(byte[] bArr) {
        return (S) MessageNano.mergeFrom(new S(), bArr);
    }
}
