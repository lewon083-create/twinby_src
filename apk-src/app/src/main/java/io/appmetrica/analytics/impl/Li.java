package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Li extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f22618l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f22619m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f22620n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f22621o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f22622p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile Li[] f22623q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f22625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f22626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f22627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Gi f22628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22631h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ki f22632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ji f22633k;

    public Li() {
        a();
    }

    public static Li[] b() {
        if (f22623q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22623q == null) {
                        f22623q = new Li[0];
                    }
                } finally {
                }
            }
        }
        return f22623q;
    }

    public final Li a() {
        this.f22624a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f22625b = bArr;
        this.f22626c = bArr;
        this.f22627d = bArr;
        this.f22628e = null;
        this.f22629f = 0L;
        this.f22630g = false;
        this.f22631h = 0;
        this.i = 1;
        this.f22632j = null;
        this.f22633k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f22624a;
        if (i != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f22625b) + iComputeSerializedSize;
        byte[] bArr = this.f22626c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f22626c);
        }
        if (!Arrays.equals(this.f22627d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f22627d);
        }
        Gi gi = this.f22628e;
        if (gi != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, gi);
        }
        long j10 = this.f22629f;
        if (j10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j10);
        }
        boolean z5 = this.f22630g;
        if (z5) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z5);
        }
        int i10 = this.f22631h;
        if (i10 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i10);
        }
        int i11 = this.i;
        if (i11 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i11);
        }
        Ki ki2 = this.f22632j;
        if (ki2 != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, ki2);
        }
        Ji ji2 = this.f22633k;
        return ji2 != null ? CodedOutputByteBufferNano.computeMessageSize(12, ji2) + iComputeBytesSize : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i = this.f22624a;
        if (i != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f22625b);
        byte[] bArr = this.f22626c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f22626c);
        }
        if (!Arrays.equals(this.f22627d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f22627d);
        }
        Gi gi = this.f22628e;
        if (gi != null) {
            codedOutputByteBufferNano.writeMessage(6, gi);
        }
        long j10 = this.f22629f;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j10);
        }
        boolean z5 = this.f22630g;
        if (z5) {
            codedOutputByteBufferNano.writeBool(8, z5);
        }
        int i10 = this.f22631h;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i10);
        }
        int i11 = this.i;
        if (i11 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i11);
        }
        Ki ki2 = this.f22632j;
        if (ki2 != null) {
            codedOutputByteBufferNano.writeMessage(11, ki2);
        }
        Ji ji2 = this.f22633k;
        if (ji2 != null) {
            codedOutputByteBufferNano.writeMessage(12, ji2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Li b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Li().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Li mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f22624a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f22625b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f22626c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f22627d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f22628e == null) {
                        this.f22628e = new Gi();
                    }
                    codedInputByteBufferNano.readMessage(this.f22628e);
                    break;
                case 56:
                    this.f22629f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f22630g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f22631h = int32;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 1 || int322 == 2) {
                        this.i = int322;
                    }
                    break;
                case 90:
                    if (this.f22632j == null) {
                        this.f22632j = new Ki();
                    }
                    codedInputByteBufferNano.readMessage(this.f22632j);
                    break;
                case 98:
                    if (this.f22633k == null) {
                        this.f22633k = new Ji();
                    }
                    codedInputByteBufferNano.readMessage(this.f22633k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static Li a(byte[] bArr) {
        return (Li) MessageNano.mergeFrom(new Li(), bArr);
    }
}
