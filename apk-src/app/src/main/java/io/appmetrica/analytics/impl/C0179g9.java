package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0179g9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23926d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23927e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23928f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C0179g9[] f23929g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0256j9 f23930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23932c;

    public C0179g9() {
        a();
    }

    public static C0179g9[] b() {
        if (f23929g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23929g == null) {
                        f23929g = new C0179g9[0];
                    }
                } finally {
                }
            }
        }
        return f23929g;
    }

    public final C0179g9 a() {
        this.f23930a = null;
        this.f23931b = "";
        this.f23932c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0256j9 c0256j9 = this.f23930a;
        if (c0256j9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0256j9);
        }
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f23931b) + iComputeSerializedSize;
        int i = this.f23932c;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(5, i) + iComputeStringSize : iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0256j9 c0256j9 = this.f23930a;
        if (c0256j9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0256j9);
        }
        codedOutputByteBufferNano.writeString(2, this.f23931b);
        int i = this.f23932c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(5, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0179g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f23930a == null) {
                    this.f23930a = new C0256j9();
                }
                codedInputByteBufferNano.readMessage(this.f23930a);
            } else if (tag == 18) {
                this.f23931b = codedInputByteBufferNano.readString();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f23932c = int32;
                }
            }
        }
        return this;
    }

    public static C0179g9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0179g9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0179g9 a(byte[] bArr) {
        return (C0179g9) MessageNano.mergeFrom(new C0179g9(), bArr);
    }
}
