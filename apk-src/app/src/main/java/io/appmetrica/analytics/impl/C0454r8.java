package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0454r8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C0454r8[] f24680e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f24681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0178g8 f24682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f24683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0330m8 f24684d;

    public C0454r8() {
        a();
    }

    public static C0454r8[] b() {
        if (f24680e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24680e == null) {
                        f24680e = new C0454r8[0];
                    }
                } finally {
                }
            }
        }
        return f24680e;
    }

    public final C0454r8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f24681a = bArr;
        this.f24682b = null;
        this.f24683c = bArr;
        this.f24684d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f24681a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f24681a);
        }
        C0178g8 c0178g8 = this.f24682b;
        if (c0178g8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0178g8);
        }
        if (!Arrays.equals(this.f24683c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f24683c);
        }
        C0330m8 c0330m8 = this.f24684d;
        return c0330m8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0330m8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f24681a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f24681a);
        }
        C0178g8 c0178g8 = this.f24682b;
        if (c0178g8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0178g8);
        }
        if (!Arrays.equals(this.f24683c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f24683c);
        }
        C0330m8 c0330m8 = this.f24684d;
        if (c0330m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0330m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0454r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24681a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f24682b == null) {
                    this.f24682b = new C0178g8();
                }
                codedInputByteBufferNano.readMessage(this.f24682b);
            } else if (tag == 26) {
                this.f24683c = codedInputByteBufferNano.readBytes();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f24684d == null) {
                    this.f24684d = new C0330m8();
                }
                codedInputByteBufferNano.readMessage(this.f24684d);
            }
        }
        return this;
    }

    public static C0454r8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0454r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0454r8 a(byte[] bArr) {
        return (C0454r8) MessageNano.mergeFrom(new C0454r8(), bArr);
    }
}
