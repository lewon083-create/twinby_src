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
public final class Hi extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Hi[] f22428e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f22429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ii f22430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f22432d;

    public Hi() {
        a();
    }

    public static Hi[] b() {
        if (f22428e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22428e == null) {
                        f22428e = new Hi[0];
                    }
                } finally {
                }
            }
        }
        return f22428e;
    }

    public final Hi a() {
        this.f22429a = 0L;
        this.f22430b = null;
        this.f22431c = 0;
        this.f22432d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f22429a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        Ii ii2 = this.f22430b;
        if (ii2 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ii2);
        }
        int i = this.f22431c;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
        }
        return !Arrays.equals(this.f22432d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f22432d) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        long j10 = this.f22429a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        Ii ii2 = this.f22430b;
        if (ii2 != null) {
            codedOutputByteBufferNano.writeMessage(2, ii2);
        }
        int i = this.f22431c;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i);
        }
        if (!Arrays.equals(this.f22432d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f22432d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f22429a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f22430b == null) {
                    this.f22430b = new Ii();
                }
                codedInputByteBufferNano.readMessage(this.f22430b);
            } else if (tag == 24) {
                this.f22431c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f22432d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Hi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Hi().mergeFrom(codedInputByteBufferNano);
    }

    public static Hi a(byte[] bArr) {
        return (Hi) MessageNano.mergeFrom(new Hi(), bArr);
    }
}
