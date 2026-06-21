package io.appmetrica.analytics.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0194go extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C0194go[] f23945e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f23946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f23947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f23948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23949d;

    public C0194go() {
        a();
    }

    public static C0194go[] b() {
        if (f23945e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23945e == null) {
                        f23945e = new C0194go[0];
                    }
                } finally {
                }
            }
        }
        return f23945e;
    }

    public final C0194go a() {
        this.f23946a = WireFormatNano.EMPTY_BYTES;
        this.f23947b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f23948c = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f23949d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f23946a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f23946a);
        }
        if (Double.doubleToLongBits(this.f23947b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f23947b);
        }
        if (Double.doubleToLongBits(this.f23948c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f23948c);
        }
        boolean z5 = this.f23949d;
        return z5 ? CodedOutputByteBufferNano.computeBoolSize(4, z5) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!Arrays.equals(this.f23946a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f23946a);
        }
        if (Double.doubleToLongBits(this.f23947b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f23947b);
        }
        if (Double.doubleToLongBits(this.f23948c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(3, this.f23948c);
        }
        boolean z5 = this.f23949d;
        if (z5) {
            codedOutputByteBufferNano.writeBool(4, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0194go mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23946a = codedInputByteBufferNano.readBytes();
            } else if (tag == 17) {
                this.f23947b = codedInputByteBufferNano.readDouble();
            } else if (tag == 25) {
                this.f23948c = codedInputByteBufferNano.readDouble();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23949d = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0194go b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0194go().mergeFrom(codedInputByteBufferNano);
    }

    public static C0194go a(byte[] bArr) {
        return (C0194go) MessageNano.mergeFrom(new C0194go(), bArr);
    }
}
