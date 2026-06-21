package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0468rm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0468rm[] f24692c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f24694b;

    public C0468rm() {
        a();
    }

    public static C0468rm[] b() {
        if (f24692c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24692c == null) {
                        f24692c = new C0468rm[0];
                    }
                } finally {
                }
            }
        }
        return f24692c;
    }

    public final C0468rm a() {
        this.f24693a = "";
        this.f24694b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f24693a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f24693a);
        }
        return !Arrays.equals(this.f24694b, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f24694b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f24693a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f24693a);
        }
        if (!Arrays.equals(this.f24694b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f24694b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0468rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24693a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24694b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0468rm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0468rm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0468rm a(byte[] bArr) {
        return (C0468rm) MessageNano.mergeFrom(new C0468rm(), bArr);
    }
}
