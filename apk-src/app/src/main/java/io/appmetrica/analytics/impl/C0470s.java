package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import io.sentry.SpanContext;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0470s extends MessageNano {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f24698l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f24699m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f24700n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f24701o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f24702p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f24703q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f24704r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f24705s = 7;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile C0470s[] f24706t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static byte[] f24707u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static volatile boolean f24708v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f24709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f24710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f24711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f24713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f24714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f24715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f24716h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f24717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f24718k;

    public C0470s() {
        if (!f24708v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f24708v) {
                        f24707u = InternalNano.bytesDefaultValue(SpanContext.DEFAULT_ORIGIN);
                        f24708v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0470s[] b() {
        if (f24706t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24706t == null) {
                        f24706t = new C0470s[0];
                    }
                } finally {
                }
            }
        }
        return f24706t;
    }

    public final C0470s a() {
        this.f24709a = (byte[]) f24707u.clone();
        this.f24710b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f24711c = bArr;
        this.f24712d = 0;
        this.f24713e = bArr;
        this.f24714f = bArr;
        this.f24715g = bArr;
        this.f24716h = bArr;
        this.i = bArr;
        this.f24717j = bArr;
        this.f24718k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f24709a, f24707u)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f24709a);
        }
        r rVar = this.f24710b;
        if (rVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f24711c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f24711c);
        }
        int i = this.f24712d;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        if (!Arrays.equals(this.f24713e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f24713e);
        }
        if (!Arrays.equals(this.f24714f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f24714f);
        }
        if (!Arrays.equals(this.f24715g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f24715g);
        }
        if (!Arrays.equals(this.f24716h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f24716h);
        }
        if (!Arrays.equals(this.i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        if (!Arrays.equals(this.f24717j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f24717j);
        }
        return !Arrays.equals(this.f24718k, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(11, this.f24718k) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!Arrays.equals(this.f24709a, f24707u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f24709a);
        }
        r rVar = this.f24710b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f24711c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f24711c);
        }
        int i = this.f24712d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        if (!Arrays.equals(this.f24713e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f24713e);
        }
        if (!Arrays.equals(this.f24714f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f24714f);
        }
        if (!Arrays.equals(this.f24715g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f24715g);
        }
        if (!Arrays.equals(this.f24716h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f24716h);
        }
        if (!Arrays.equals(this.i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.f24717j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f24717j);
        }
        if (!Arrays.equals(this.f24718k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f24718k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0470s b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0470s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0470s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f24709a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f24710b == null) {
                        this.f24710b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f24710b);
                    break;
                case 26:
                    this.f24711c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
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
                            this.f24712d = int32;
                            break;
                    }
                    break;
                case 42:
                    this.f24713e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f24714f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f24715g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f24716h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f24717j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    this.f24718k = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C0470s a(byte[] bArr) {
        return (C0470s) MessageNano.mergeFrom(new C0470s(), bArr);
    }
}
