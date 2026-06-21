package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0363ng extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24439e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24440f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f24441g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile C0363ng[] f24442h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24446d;

    public C0363ng() {
        a();
    }

    public static C0363ng[] b() {
        if (f24442h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24442h == null) {
                        f24442h = new C0363ng[0];
                    }
                } finally {
                }
            }
        }
        return f24442h;
    }

    public final C0363ng a() {
        this.f24443a = "";
        this.f24444b = 0L;
        this.f24445c = 0L;
        this.f24446d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f24443a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f24443a);
        }
        long j10 = this.f24444b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j10);
        }
        long j11 = this.f24445c;
        if (j11 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j11);
        }
        int i = this.f24446d;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f24443a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f24443a);
        }
        long j10 = this.f24444b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j10);
        }
        long j11 = this.f24445c;
        if (j11 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j11);
        }
        int i = this.f24446d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0363ng mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24443a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f24444b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f24445c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f24446d = int32;
                }
            }
        }
        return this;
    }

    public static C0363ng b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0363ng().mergeFrom(codedInputByteBufferNano);
    }

    public static C0363ng a(byte[] bArr) {
        return (C0363ng) MessageNano.mergeFrom(new C0363ng(), bArr);
    }
}
