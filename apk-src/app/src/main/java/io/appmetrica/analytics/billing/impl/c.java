package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile c[] f21506f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21511e;

    public c() {
        a();
    }

    public static c[] b() {
        if (f21506f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21506f == null) {
                        f21506f = new c[0];
                    }
                } finally {
                }
            }
        }
        return f21506f;
    }

    public final c a() {
        this.f21507a = 1;
        this.f21508b = "";
        this.f21509c = "";
        this.f21510d = 0L;
        this.f21511e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f21511e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f21510d) + CodedOutputByteBufferNano.computeStringSize(3, this.f21509c) + CodedOutputByteBufferNano.computeStringSize(2, this.f21508b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f21507a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(1, this.f21507a);
        codedOutputByteBufferNano.writeString(2, this.f21508b);
        codedOutputByteBufferNano.writeString(3, this.f21509c);
        codedOutputByteBufferNano.writeUInt64(4, this.f21510d);
        codedOutputByteBufferNano.writeUInt64(5, this.f21511e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static c b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new c().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f21507a = int32;
                }
            } else if (tag == 18) {
                this.f21508b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.f21509c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f21510d = codedInputByteBufferNano.readUInt64();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f21511e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static c a(byte[] bArr) {
        return (c) MessageNano.mergeFrom(new c(), bArr);
    }
}
