package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class V5 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile V5[] f23115c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z5 f23117b;

    public V5() {
        a();
    }

    public static V5[] b() {
        if (f23115c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23115c == null) {
                        f23115c = new V5[0];
                    }
                } finally {
                }
            }
        }
        return f23115c;
    }

    public final V5 a() {
        this.f23116a = WireFormatNano.EMPTY_BYTES;
        this.f23117b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f23116a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f23116a);
        }
        Z5 z5 = this.f23117b;
        return z5 != null ? CodedOutputByteBufferNano.computeMessageSize(2, z5) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!Arrays.equals(this.f23116a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f23116a);
        }
        Z5 z5 = this.f23117b;
        if (z5 != null) {
            codedOutputByteBufferNano.writeMessage(2, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23116a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f23117b == null) {
                    this.f23117b = new Z5();
                }
                codedInputByteBufferNano.readMessage(this.f23117b);
            }
        }
        return this;
    }

    public static V5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new V5().mergeFrom(codedInputByteBufferNano);
    }

    public static V5 a(byte[] bArr) {
        return (V5) MessageNano.mergeFrom(new V5(), bArr);
    }
}
