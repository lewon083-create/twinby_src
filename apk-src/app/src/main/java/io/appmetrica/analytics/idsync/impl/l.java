package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile l[] f21995c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k[] f21997b;

    public l() {
        a();
    }

    public static l[] b() {
        if (f21995c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21995c == null) {
                        f21995c = new l[0];
                    }
                } finally {
                }
            }
        }
        return f21995c;
    }

    public final l a() {
        this.f21996a = 10000L;
        this.f21997b = k.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j10 = this.f21996a;
        if (j10 != 10000) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j10);
        }
        k[] kVarArr = this.f21997b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i = 0;
            while (true) {
                k[] kVarArr2 = this.f21997b;
                if (i >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i];
                if (kVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, kVar) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        long j10 = this.f21996a;
        if (j10 != 10000) {
            codedOutputByteBufferNano.writeUInt64(1, j10);
        }
        k[] kVarArr = this.f21997b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i = 0;
            while (true) {
                k[] kVarArr2 = this.f21997b;
                if (i >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, kVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f21996a = codedInputByteBufferNano.readUInt64();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                k[] kVarArr = this.f21997b;
                int length = kVarArr == null ? 0 : kVarArr.length;
                int i = repeatedFieldArrayLength + length;
                k[] kVarArr2 = new k[i];
                if (length != 0) {
                    System.arraycopy(kVarArr, 0, kVarArr2, 0, length);
                }
                while (length < i - 1) {
                    k kVar = new k();
                    kVarArr2[length] = kVar;
                    codedInputByteBufferNano.readMessage(kVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                k kVar2 = new k();
                kVarArr2[length] = kVar2;
                codedInputByteBufferNano.readMessage(kVar2);
                this.f21997b = kVarArr2;
            }
        }
        return this;
    }

    public static l b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new l().mergeFrom(codedInputByteBufferNano);
    }

    public static l a(byte[] bArr) {
        return (l) MessageNano.mergeFrom(new l(), bArr);
    }
}
