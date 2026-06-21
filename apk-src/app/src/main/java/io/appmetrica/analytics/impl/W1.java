package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class W1 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23181c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23182d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23183e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23184f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f23185g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f23186h = 5;
    public static final int i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f23187j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f23188k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f23189l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile W1[] f23190m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23192b;

    public W1() {
        a();
    }

    public static W1[] b() {
        if (f23190m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23190m == null) {
                        f23190m = new W1[0];
                    }
                } finally {
                }
            }
        }
        return f23190m;
    }

    public final W1 a() {
        this.f23191a = 0;
        this.f23192b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f23192b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f23191a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(2, this.f23191a);
        codedOutputByteBufferNano.writeInt32(3, this.f23192b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 16) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f23191a = int32;
                            break;
                    }
                } else if (tag != 24) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == -1 || int322 == 0 || int322 == 1) {
                        this.f23192b = int322;
                    }
                }
            }
        }
        return this;
    }

    public static W1 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new W1().mergeFrom(codedInputByteBufferNano);
    }

    public static W1 a(byte[] bArr) {
        return (W1) MessageNano.mergeFrom(new W1(), bArr);
    }
}
