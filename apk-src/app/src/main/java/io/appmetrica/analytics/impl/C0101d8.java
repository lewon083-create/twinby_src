package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0101d8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0101d8[] f23675c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0204h8 f23677b;

    public C0101d8() {
        a();
    }

    public static C0101d8[] b() {
        if (f23675c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23675c == null) {
                        f23675c = new C0101d8[0];
                    }
                } finally {
                }
            }
        }
        return f23675c;
    }

    public final C0101d8 a() {
        this.f23676a = WireFormatNano.EMPTY_BYTES;
        this.f23677b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f23676a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f23676a);
        }
        C0204h8 c0204h8 = this.f23677b;
        return c0204h8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0204h8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!Arrays.equals(this.f23676a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f23676a);
        }
        C0204h8 c0204h8 = this.f23677b;
        if (c0204h8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0204h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0101d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23676a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f23677b == null) {
                    this.f23677b = new C0204h8();
                }
                codedInputByteBufferNano.readMessage(this.f23677b);
            }
        }
        return this;
    }

    public static C0101d8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0101d8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0101d8 a(byte[] bArr) {
        return (C0101d8) MessageNano.mergeFrom(new C0101d8(), bArr);
    }
}
