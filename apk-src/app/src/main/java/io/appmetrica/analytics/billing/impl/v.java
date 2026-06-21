package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile v[] f21543e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f21545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f21547d;

    public v() {
        a();
    }

    public static v[] b() {
        if (f21543e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21543e == null) {
                        f21543e = new v[0];
                    }
                } finally {
                }
            }
        }
        return f21543e;
    }

    public final v a() {
        this.f21544a = 0L;
        this.f21545b = null;
        this.f21546c = 0;
        this.f21547d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f21544a;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j10);
        }
        w wVar = this.f21545b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i = this.f21546c;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
        }
        return !Arrays.equals(this.f21547d, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(4, this.f21547d) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        long j10 = this.f21544a;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j10);
        }
        w wVar = this.f21545b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i = this.f21546c;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i);
        }
        if (!Arrays.equals(this.f21547d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f21547d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f21544a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f21545b == null) {
                    this.f21545b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f21545b);
            } else if (tag == 24) {
                this.f21546c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f21547d = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static v b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new v().mergeFrom(codedInputByteBufferNano);
    }

    public static v a(byte[] bArr) {
        return (v) MessageNano.mergeFrom(new v(), bArr);
    }
}
