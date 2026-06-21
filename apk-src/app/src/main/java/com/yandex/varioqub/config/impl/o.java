package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile o[] f15393c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f15395b;

    public o() {
        a();
    }

    public static o[] b() {
        if (f15393c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f15393c == null) {
                        f15393c = new o[0];
                    }
                } finally {
                }
            }
        }
        return f15393c;
    }

    public final void a() {
        this.f15394a = "";
        this.f15395b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f15394a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f15394a);
        }
        return Double.doubleToLongBits(this.f15395b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE) ? CodedOutputByteBufferNano.computeDoubleSize(2, this.f15395b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f15394a = codedInputByteBufferNano.readString();
            } else if (tag == 17) {
                this.f15395b = codedInputByteBufferNano.readDouble();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f15394a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f15394a);
        }
        if (Double.doubleToLongBits(this.f15395b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f15395b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
