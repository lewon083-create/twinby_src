package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0479s8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0479s8[] f24733c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0380o8 f24734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0454r8 f24735b;

    public C0479s8() {
        a();
    }

    public static C0479s8[] b() {
        if (f24733c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24733c == null) {
                        f24733c = new C0479s8[0];
                    }
                } finally {
                }
            }
        }
        return f24733c;
    }

    public final C0479s8 a() {
        this.f24734a = null;
        this.f24735b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0380o8 c0380o8 = this.f24734a;
        if (c0380o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0380o8);
        }
        C0454r8 c0454r8 = this.f24735b;
        return c0454r8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0454r8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0380o8 c0380o8 = this.f24734a;
        if (c0380o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0380o8);
        }
        C0454r8 c0454r8 = this.f24735b;
        if (c0454r8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0454r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0479s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f24734a == null) {
                    this.f24734a = new C0380o8();
                }
                codedInputByteBufferNano.readMessage(this.f24734a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f24735b == null) {
                    this.f24735b = new C0454r8();
                }
                codedInputByteBufferNano.readMessage(this.f24735b);
            }
        }
        return this;
    }

    public static C0479s8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0479s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0479s8 a(byte[] bArr) {
        return (C0479s8) MessageNano.mergeFrom(new C0479s8(), bArr);
    }
}
