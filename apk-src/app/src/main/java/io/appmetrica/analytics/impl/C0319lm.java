package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0319lm extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0319lm[] f24318c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0294km f24320b;

    public C0319lm() {
        a();
    }

    public static C0319lm[] b() {
        if (f24318c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24318c == null) {
                        f24318c = new C0319lm[0];
                    }
                } finally {
                }
            }
        }
        return f24318c;
    }

    public final C0319lm a() {
        this.f24319a = "";
        this.f24320b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f24319a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f24319a);
        }
        C0294km c0294km = this.f24320b;
        return c0294km != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0294km) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f24319a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f24319a);
        }
        C0294km c0294km = this.f24320b;
        if (c0294km != null) {
            codedOutputByteBufferNano.writeMessage(2, c0294km);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0319lm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24319a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f24320b == null) {
                    this.f24320b = new C0294km();
                }
                codedInputByteBufferNano.readMessage(this.f24320b);
            }
        }
        return this;
    }

    public static C0319lm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0319lm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0319lm a(byte[] bArr) {
        return (C0319lm) MessageNano.mergeFrom(new C0319lm(), bArr);
    }
}
