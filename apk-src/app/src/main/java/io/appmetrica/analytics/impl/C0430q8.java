package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0430q8 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C0430q8[] f24621d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f24622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f24623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0454r8 f24624c;

    public C0430q8() {
        a();
    }

    public static C0430q8[] b() {
        if (f24621d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24621d == null) {
                        f24621d = new C0430q8[0];
                    }
                } finally {
                }
            }
        }
        return f24621d;
    }

    public final C0430q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f24622a = bArr;
        this.f24623b = bArr;
        this.f24624c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f24622a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f24622a);
        }
        if (!Arrays.equals(this.f24623b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f24623b);
        }
        C0454r8 c0454r8 = this.f24624c;
        return c0454r8 != null ? CodedOutputByteBufferNano.computeMessageSize(3, c0454r8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f24622a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f24622a);
        }
        if (!Arrays.equals(this.f24623b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f24623b);
        }
        C0454r8 c0454r8 = this.f24624c;
        if (c0454r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0454r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0430q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24622a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f24623b = codedInputByteBufferNano.readBytes();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f24624c == null) {
                    this.f24624c = new C0454r8();
                }
                codedInputByteBufferNano.readMessage(this.f24624c);
            }
        }
        return this;
    }

    public static C0430q8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0430q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0430q8 a(byte[] bArr) {
        return (C0430q8) MessageNano.mergeFrom(new C0430q8(), bArr);
    }
}
