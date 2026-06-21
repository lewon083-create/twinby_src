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
public final class z extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f21568l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f21569m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f21570n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f21571o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f21572p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile z[] f21573q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f21575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f21576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f21577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f21578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21581h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f21582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x f21583k;

    public z() {
        a();
    }

    public static z[] b() {
        if (f21573q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21573q == null) {
                        f21573q = new z[0];
                    }
                } finally {
                }
            }
        }
        return f21573q;
    }

    public final z a() {
        this.f21574a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f21575b = bArr;
        this.f21576c = bArr;
        this.f21577d = bArr;
        this.f21578e = null;
        this.f21579f = 0L;
        this.f21580g = false;
        this.f21581h = 0;
        this.i = 1;
        this.f21582j = null;
        this.f21583k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f21574a;
        if (i != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f21575b) + iComputeSerializedSize;
        byte[] bArr = this.f21576c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f21576c);
        }
        if (!Arrays.equals(this.f21577d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f21577d);
        }
        u uVar = this.f21578e;
        if (uVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j10 = this.f21579f;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j10);
        }
        boolean z5 = this.f21580g;
        if (z5) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z5);
        }
        int i10 = this.f21581h;
        if (i10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i10);
        }
        int i11 = this.i;
        if (i11 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i11);
        }
        y yVar = this.f21582j;
        if (yVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        x xVar = this.f21583k;
        return xVar != null ? CodedOutputByteBufferNano.computeMessageSize(12, xVar) + iComputeBytesSize : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i = this.f21574a;
        if (i != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f21575b);
        byte[] bArr = this.f21576c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f21576c);
        }
        if (!Arrays.equals(this.f21577d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f21577d);
        }
        u uVar = this.f21578e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j10 = this.f21579f;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j10);
        }
        boolean z5 = this.f21580g;
        if (z5) {
            codedOutputByteBufferNano.writeBool(8, z5);
        }
        int i10 = this.f21581h;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i10);
        }
        int i11 = this.i;
        if (i11 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i11);
        }
        y yVar = this.f21582j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        x xVar = this.f21583k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static z b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new z().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f21574a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f21575b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f21576c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f21577d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f21578e == null) {
                        this.f21578e = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f21578e);
                    break;
                case 56:
                    this.f21579f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f21580g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f21581h = int32;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 1 || int322 == 2) {
                        this.i = int322;
                    }
                    break;
                case 90:
                    if (this.f21582j == null) {
                        this.f21582j = new y();
                    }
                    codedInputByteBufferNano.readMessage(this.f21582j);
                    break;
                case 98:
                    if (this.f21583k == null) {
                        this.f21583k = new x();
                    }
                    codedInputByteBufferNano.readMessage(this.f21583k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static z a(byte[] bArr) {
        return (z) MessageNano.mergeFrom(new z(), bArr);
    }
}
