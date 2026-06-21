package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0379o7 extends MessageNano {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile C0379o7[] f24470k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f24472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f24473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f24478h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24479j;

    public C0379o7() {
        a();
    }

    public static C0379o7[] b() {
        if (f24470k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24470k == null) {
                        f24470k = new C0379o7[0];
                    }
                } finally {
                }
            }
        }
        return f24470k;
    }

    public final C0379o7 a() {
        this.f24471a = -1;
        this.f24472b = -1.0d;
        this.f24473c = -1.0d;
        this.f24474d = -1;
        this.f24475e = -1;
        this.f24476f = -1;
        this.f24477g = -1;
        this.f24478h = -1L;
        this.i = "";
        this.f24479j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f24471a;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (Double.doubleToLongBits(this.f24472b) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f24472b);
        }
        if (Double.doubleToLongBits(this.f24473c) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f24473c);
        }
        int i10 = this.f24474d;
        if (i10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        int i11 = this.f24475e;
        if (i11 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i11);
        }
        int i12 = this.f24476f;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i12);
        }
        int i13 = this.f24477g;
        if (i13 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        long j10 = this.f24478h;
        if (j10 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j10);
        }
        if (!this.i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        return !this.f24479j.equals("") ? CodedOutputByteBufferNano.computeStringSize(10, this.f24479j) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i = this.f24471a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (Double.doubleToLongBits(this.f24472b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f24472b);
        }
        if (Double.doubleToLongBits(this.f24473c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f24473c);
        }
        int i10 = this.f24474d;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        int i11 = this.f24475e;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i11);
        }
        int i12 = this.f24476f;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i12);
        }
        int i13 = this.f24477g;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        long j10 = this.f24478h;
        if (j10 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j10);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        if (!this.f24479j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f24479j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0379o7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0379o7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0379o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == -1 || int32 == 0 || int32 == 1) {
                        this.f24471a = int32;
                    }
                    break;
                case 17:
                    this.f24472b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f24473c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f24474d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f24475e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f24476f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f24477g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f24478h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f24479j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static C0379o7 a(byte[] bArr) {
        return (C0379o7) MessageNano.mergeFrom(new C0379o7(), bArr);
    }
}
