package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Q extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Q[] f25442d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N f25443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P f25444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O f25445c;

    public Q() {
        a();
    }

    public static Q[] b() {
        if (f25442d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f25442d == null) {
                        f25442d = new Q[0];
                    }
                } finally {
                }
            }
        }
        return f25442d;
    }

    public final Q a() {
        this.f25443a = null;
        this.f25444b = null;
        this.f25445c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        N n10 = this.f25443a;
        if (n10 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n10);
        }
        P p6 = this.f25444b;
        if (p6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p6);
        }
        O o2 = this.f25445c;
        return o2 != null ? CodedOutputByteBufferNano.computeMessageSize(3, o2) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        N n10 = this.f25443a;
        if (n10 != null) {
            codedOutputByteBufferNano.writeMessage(1, n10);
        }
        P p6 = this.f25444b;
        if (p6 != null) {
            codedOutputByteBufferNano.writeMessage(2, p6);
        }
        O o2 = this.f25445c;
        if (o2 != null) {
            codedOutputByteBufferNano.writeMessage(3, o2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f25443a == null) {
                    this.f25443a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f25443a);
            } else if (tag == 18) {
                if (this.f25444b == null) {
                    this.f25444b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f25444b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f25445c == null) {
                    this.f25445c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f25445c);
            }
        }
        return this;
    }

    public static Q b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Q().mergeFrom(codedInputByteBufferNano);
    }

    public static Q a(byte[] bArr) {
        return (Q) MessageNano.mergeFrom(new Q(), bArr);
    }
}
