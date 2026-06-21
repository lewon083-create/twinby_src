package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0549v3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0549v3[] f24866c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0599x3 f24867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24868b;

    public C0549v3() {
        a();
    }

    public static C0549v3[] b() {
        if (f24866c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24866c == null) {
                        f24866c = new C0549v3[0];
                    }
                } finally {
                }
            }
        }
        return f24866c;
    }

    public final C0549v3 a() {
        this.f24867a = null;
        this.f24868b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0599x3 c0599x3 = this.f24867a;
        if (c0599x3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0599x3);
        }
        int i = this.f24868b;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0599x3 c0599x3 = this.f24867a;
        if (c0599x3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0599x3);
        }
        int i = this.f24868b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0549v3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f24867a == null) {
                    this.f24867a = new C0599x3();
                }
                codedInputByteBufferNano.readMessage(this.f24867a);
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f24868b = int32;
                }
            }
        }
        return this;
    }

    public static C0549v3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0549v3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0549v3 a(byte[] bArr) {
        return (C0549v3) MessageNano.mergeFrom(new C0549v3(), bArr);
    }
}
