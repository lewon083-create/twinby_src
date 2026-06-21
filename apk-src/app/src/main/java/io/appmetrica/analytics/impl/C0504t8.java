package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0504t8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0504t8[] f24761c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0380o8 f24762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0430q8 f24763b;

    public C0504t8() {
        a();
    }

    public static C0504t8[] b() {
        if (f24761c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24761c == null) {
                        f24761c = new C0504t8[0];
                    }
                } finally {
                }
            }
        }
        return f24761c;
    }

    public final C0504t8 a() {
        this.f24762a = null;
        this.f24763b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0380o8 c0380o8 = this.f24762a;
        if (c0380o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0380o8);
        }
        C0430q8 c0430q8 = this.f24763b;
        return c0430q8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0430q8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0380o8 c0380o8 = this.f24762a;
        if (c0380o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0380o8);
        }
        C0430q8 c0430q8 = this.f24763b;
        if (c0430q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0430q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0504t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f24762a == null) {
                    this.f24762a = new C0380o8();
                }
                codedInputByteBufferNano.readMessage(this.f24762a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f24763b == null) {
                    this.f24763b = new C0430q8();
                }
                codedInputByteBufferNano.readMessage(this.f24763b);
            }
        }
        return this;
    }

    public static C0504t8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0504t8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0504t8 a(byte[] bArr) {
        return (C0504t8) MessageNano.mergeFrom(new C0504t8(), bArr);
    }
}
