package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21548c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21549d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21550e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21551f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21552g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile w[] f21553h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21555b;

    public w() {
        a();
    }

    public static w[] b() {
        if (f21553h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21553h == null) {
                        f21553h = new w[0];
                    }
                } finally {
                }
            }
        }
        return f21553h;
    }

    public final w a() {
        this.f21554a = 0;
        this.f21555b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f21554a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i10 = this.f21555b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i = this.f21554a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i10 = this.f21555b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f21554a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f21555b = int32;
                }
            }
        }
        return this;
    }

    public static w b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new w().mergeFrom(codedInputByteBufferNano);
    }

    public static w a(byte[] bArr) {
        return (w) MessageNano.mergeFrom(new w(), bArr);
    }
}
