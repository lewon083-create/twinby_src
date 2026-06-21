package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ji extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Ji[] f22533d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ii f22535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Hi f22536c;

    public Ji() {
        a();
    }

    public static Ji[] b() {
        if (f22533d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22533d == null) {
                        f22533d = new Ji[0];
                    }
                } finally {
                }
            }
        }
        return f22533d;
    }

    public final Ji a() {
        this.f22534a = false;
        this.f22535b = null;
        this.f22536c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f22534a;
        if (z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        Ii ii2 = this.f22535b;
        if (ii2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ii2);
        }
        Hi hi2 = this.f22536c;
        return hi2 != null ? CodedOutputByteBufferNano.computeMessageSize(3, hi2) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        boolean z5 = this.f22534a;
        if (z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        Ii ii2 = this.f22535b;
        if (ii2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ii2);
        }
        Hi hi2 = this.f22536c;
        if (hi2 != null) {
            codedOutputByteBufferNano.writeMessage(3, hi2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ji mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f22534a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f22535b == null) {
                    this.f22535b = new Ii();
                }
                codedInputByteBufferNano.readMessage(this.f22535b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f22536c == null) {
                    this.f22536c = new Hi();
                }
                codedInputByteBufferNano.readMessage(this.f22536c);
            }
        }
        return this;
    }

    public static Ji b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Ji().mergeFrom(codedInputByteBufferNano);
    }

    public static Ji a(byte[] bArr) {
        return (Ji) MessageNano.mergeFrom(new Ji(), bArr);
    }
}
