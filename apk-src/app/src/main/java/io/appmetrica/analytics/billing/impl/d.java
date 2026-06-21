package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21512c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21513d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21514e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile d[] f21515f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c[] f21516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21517b;

    public d() {
        a();
    }

    public static d[] b() {
        if (f21515f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21515f == null) {
                        f21515f = new d[0];
                    }
                } finally {
                }
            }
        }
        return f21515f;
    }

    public final d a() {
        this.f21516a = c.b();
        this.f21517b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        c[] cVarArr = this.f21516a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i = 0;
            while (true) {
                c[] cVarArr2 = this.f21516a;
                if (i >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i];
                if (cVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, cVar) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f21517b) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        c[] cVarArr = this.f21516a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i = 0;
            while (true) {
                c[] cVarArr2 = this.f21516a;
                if (i >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i];
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, cVar);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f21517b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                c[] cVarArr = this.f21516a;
                int length = cVarArr == null ? 0 : cVarArr.length;
                int i = repeatedFieldArrayLength + length;
                c[] cVarArr2 = new c[i];
                if (length != 0) {
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                }
                while (length < i - 1) {
                    c cVar = new c();
                    cVarArr2[length] = cVar;
                    codedInputByteBufferNano.readMessage(cVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                c cVar2 = new c();
                cVarArr2[length] = cVar2;
                codedInputByteBufferNano.readMessage(cVar2);
                this.f21516a = cVarArr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f21517b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static d b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new d().mergeFrom(codedInputByteBufferNano);
    }

    public static d a(byte[] bArr) {
        return (d) MessageNano.mergeFrom(new d(), bArr);
    }
}
