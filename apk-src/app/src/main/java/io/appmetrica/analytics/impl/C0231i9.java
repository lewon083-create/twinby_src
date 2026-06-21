package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0231i9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C0231i9[] f24059e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f24062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24063d;

    public C0231i9() {
        a();
    }

    public static C0231i9[] b() {
        if (f24059e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24059e == null) {
                        f24059e = new C0231i9[0];
                    }
                } finally {
                }
            }
        }
        return f24059e;
    }

    public final C0231i9 a() {
        this.f24060a = 0;
        this.f24061b = 0;
        this.f24062c = "";
        this.f24063d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f24060a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i10 = this.f24061b;
        if (i10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i10);
        }
        if (!this.f24062c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f24062c);
        }
        boolean z5 = this.f24063d;
        return z5 ? CodedOutputByteBufferNano.computeBoolSize(4, z5) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i = this.f24060a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i10 = this.f24061b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i10);
        }
        if (!this.f24062c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f24062c);
        }
        boolean z5 = this.f24063d;
        if (z5) {
            codedOutputByteBufferNano.writeBool(4, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0231i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f24060a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                this.f24061b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 26) {
                this.f24062c = codedInputByteBufferNano.readString();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24063d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0231i9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0231i9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0231i9 a(byte[] bArr) {
        return (C0231i9) MessageNano.mergeFrom(new C0231i9(), bArr);
    }
}
