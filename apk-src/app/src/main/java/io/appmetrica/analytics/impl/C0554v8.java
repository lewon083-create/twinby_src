package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0554v8 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f24878g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f24879h = 1;
    public static final int i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f24880j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f24881k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f24882l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f24883m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f24884n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile C0554v8[] f24885o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0529u8 f24887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0479s8 f24888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0504t8 f24889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0126e8 f24890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0280k8 f24891f;

    public C0554v8() {
        a();
    }

    public static C0554v8[] b() {
        if (f24885o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24885o == null) {
                        f24885o = new C0554v8[0];
                    }
                } finally {
                }
            }
        }
        return f24885o;
    }

    public final C0554v8 a() {
        this.f24886a = 0;
        this.f24887b = null;
        this.f24888c = null;
        this.f24889d = null;
        this.f24890e = null;
        this.f24891f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i10 = this.f24886a;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
        }
        C0529u8 c0529u8 = this.f24887b;
        if (c0529u8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0529u8);
        }
        C0479s8 c0479s8 = this.f24888c;
        if (c0479s8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0479s8);
        }
        C0504t8 c0504t8 = this.f24889d;
        if (c0504t8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0504t8);
        }
        C0126e8 c0126e8 = this.f24890e;
        if (c0126e8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0126e8);
        }
        C0280k8 c0280k8 = this.f24891f;
        return c0280k8 != null ? CodedOutputByteBufferNano.computeMessageSize(6, c0280k8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i10 = this.f24886a;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i10);
        }
        C0529u8 c0529u8 = this.f24887b;
        if (c0529u8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0529u8);
        }
        C0479s8 c0479s8 = this.f24888c;
        if (c0479s8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0479s8);
        }
        C0504t8 c0504t8 = this.f24889d;
        if (c0504t8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0504t8);
        }
        C0126e8 c0126e8 = this.f24890e;
        if (c0126e8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0126e8);
        }
        C0280k8 c0280k8 = this.f24891f;
        if (c0280k8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0280k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0554v8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0554v8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0554v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 8) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f24886a = int32;
                            break;
                    }
                } else if (tag == 18) {
                    if (this.f24887b == null) {
                        this.f24887b = new C0529u8();
                    }
                    codedInputByteBufferNano.readMessage(this.f24887b);
                } else if (tag == 26) {
                    if (this.f24888c == null) {
                        this.f24888c = new C0479s8();
                    }
                    codedInputByteBufferNano.readMessage(this.f24888c);
                } else if (tag == 34) {
                    if (this.f24889d == null) {
                        this.f24889d = new C0504t8();
                    }
                    codedInputByteBufferNano.readMessage(this.f24889d);
                } else if (tag == 42) {
                    if (this.f24890e == null) {
                        this.f24890e = new C0126e8();
                    }
                    codedInputByteBufferNano.readMessage(this.f24890e);
                } else if (tag != 50) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    if (this.f24891f == null) {
                        this.f24891f = new C0280k8();
                    }
                    codedInputByteBufferNano.readMessage(this.f24891f);
                }
            }
        }
        return this;
    }

    public static C0554v8 a(byte[] bArr) {
        return (C0554v8) MessageNano.mergeFrom(new C0554v8(), bArr);
    }
}
