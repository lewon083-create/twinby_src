package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0127e9 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0127e9[] f23751c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23753b;

    public C0127e9() {
        a();
    }

    public static C0127e9[] b() {
        if (f23751c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23751c == null) {
                        f23751c = new C0127e9[0];
                    }
                } finally {
                }
            }
        }
        return f23751c;
    }

    public final C0127e9 a() {
        this.f23752a = 2;
        this.f23753b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f23752a;
        if (i != 2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        return !this.f23753b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f23753b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = this.f23752a;
        if (i != 2) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        if (!this.f23753b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f23753b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0127e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag != 0) {
                if (tag == 24) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f23752a = int32;
                            break;
                    }
                } else if (tag != 34) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                } else {
                    this.f23753b = codedInputByteBufferNano.readString();
                }
            }
        }
        return this;
    }

    public static C0127e9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0127e9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0127e9 a(byte[] bArr) {
        return (C0127e9) MessageNano.mergeFrom(new C0127e9(), bArr);
    }
}
