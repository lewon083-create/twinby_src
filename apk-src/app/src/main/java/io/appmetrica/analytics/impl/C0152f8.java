package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0152f8 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C0152f8[] f23841e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0380o8 f23842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0430q8 f23843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0204h8 f23844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0355n8 f23845d;

    public C0152f8() {
        a();
    }

    public static C0152f8[] b() {
        if (f23841e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23841e == null) {
                        f23841e = new C0152f8[0];
                    }
                } finally {
                }
            }
        }
        return f23841e;
    }

    public final C0152f8 a() {
        this.f23842a = null;
        this.f23843b = null;
        this.f23844c = null;
        this.f23845d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0380o8 c0380o8 = this.f23842a;
        if (c0380o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0380o8);
        }
        C0430q8 c0430q8 = this.f23843b;
        if (c0430q8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0430q8);
        }
        C0204h8 c0204h8 = this.f23844c;
        if (c0204h8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0204h8);
        }
        C0355n8 c0355n8 = this.f23845d;
        return c0355n8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0355n8) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0380o8 c0380o8 = this.f23842a;
        if (c0380o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0380o8);
        }
        C0430q8 c0430q8 = this.f23843b;
        if (c0430q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0430q8);
        }
        C0204h8 c0204h8 = this.f23844c;
        if (c0204h8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0204h8);
        }
        C0355n8 c0355n8 = this.f23845d;
        if (c0355n8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0355n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0152f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f23842a == null) {
                    this.f23842a = new C0380o8();
                }
                codedInputByteBufferNano.readMessage(this.f23842a);
            } else if (tag == 18) {
                if (this.f23843b == null) {
                    this.f23843b = new C0430q8();
                }
                codedInputByteBufferNano.readMessage(this.f23843b);
            } else if (tag == 26) {
                if (this.f23844c == null) {
                    this.f23844c = new C0204h8();
                }
                codedInputByteBufferNano.readMessage(this.f23844c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f23845d == null) {
                    this.f23845d = new C0355n8();
                }
                codedInputByteBufferNano.readMessage(this.f23845d);
            }
        }
        return this;
    }

    public static C0152f8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0152f8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0152f8 a(byte[] bArr) {
        return (C0152f8) MessageNano.mergeFrom(new C0152f8(), bArr);
    }
}
