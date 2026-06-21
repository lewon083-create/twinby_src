package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class T5 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile T5[] f23000d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S5 f23001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23003c;

    public T5() {
        a();
    }

    public static T5[] b() {
        if (f23000d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23000d == null) {
                        f23000d = new T5[0];
                    }
                } finally {
                }
            }
        }
        return f23000d;
    }

    public final T5 a() {
        this.f23001a = null;
        this.f23002b = "";
        this.f23003c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        S5 s52 = this.f23001a;
        if (s52 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, s52);
        }
        if (!this.f23002b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f23002b);
        }
        int i = this.f23003c;
        return i != -1 ? CodedOutputByteBufferNano.computeInt32Size(3, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        S5 s52 = this.f23001a;
        if (s52 != null) {
            codedOutputByteBufferNano.writeMessage(1, s52);
        }
        if (!this.f23002b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f23002b);
        }
        int i = this.f23003c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f23001a == null) {
                    this.f23001a = new S5();
                }
                codedInputByteBufferNano.readMessage(this.f23001a);
            } else if (tag == 18) {
                this.f23002b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f23003c = int32;
                }
            }
        }
        return this;
    }

    public static T5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new T5().mergeFrom(codedInputByteBufferNano);
    }

    public static T5 a(byte[] bArr) {
        return (T5) MessageNano.mergeFrom(new T5(), bArr);
    }
}
