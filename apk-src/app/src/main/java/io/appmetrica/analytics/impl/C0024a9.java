package io.appmetrica.analytics.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0024a9 extends MessageNano {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f23412j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f23413k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f23414l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile C0024a9[] f23415m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f23416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f23417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23423h;
    public String i;

    public C0024a9() {
        a();
    }

    public static C0024a9[] b() {
        if (f23415m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23415m == null) {
                        f23415m = new C0024a9[0];
                    }
                } finally {
                }
            }
        }
        return f23415m;
    }

    public final C0024a9 a() {
        this.f23416a = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f23417b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f23418c = 0L;
        this.f23419d = 0;
        this.f23420e = 0;
        this.f23421f = 0;
        this.f23422g = 0;
        this.f23423h = 0;
        this.i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f23417b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f23416a) + super.computeSerializedSize();
        long j10 = this.f23418c;
        if (j10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j10);
        }
        int i = this.f23419d;
        if (i != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
        }
        int i10 = this.f23420e;
        if (i10 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        int i11 = this.f23421f;
        if (i11 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i11);
        }
        int i12 = this.f23422g;
        if (i12 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i12);
        }
        int i13 = this.f23423h;
        if (i13 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i13);
        }
        return !this.i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.i) + iComputeDoubleSize : iComputeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeDouble(1, this.f23416a);
        codedOutputByteBufferNano.writeDouble(2, this.f23417b);
        long j10 = this.f23418c;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j10);
        }
        int i = this.f23419d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i);
        }
        int i10 = this.f23420e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        int i11 = this.f23421f;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i11);
        }
        int i12 = this.f23422g;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i12);
        }
        int i13 = this.f23423h;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i13);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0024a9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0024a9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0024a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 9) {
                this.f23416a = codedInputByteBufferNano.readDouble();
            } else if (tag == 17) {
                this.f23417b = codedInputByteBufferNano.readDouble();
            } else if (tag == 24) {
                this.f23418c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                this.f23419d = codedInputByteBufferNano.readUInt32();
            } else if (tag == 40) {
                this.f23420e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 48) {
                this.f23421f = codedInputByteBufferNano.readUInt32();
            } else if (tag == 56) {
                this.f23422g = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f23423h = int32;
                }
            } else if (tag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.i = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0024a9 a(byte[] bArr) {
        return (C0024a9) MessageNano.mergeFrom(new C0024a9(), bArr);
    }
}
