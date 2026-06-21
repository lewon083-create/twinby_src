package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile n[] f15390c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15392b;

    public n() {
        a();
    }

    public final void a() {
        this.f15391a = "";
        this.f15392b = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f15391a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f15391a);
        }
        return !this.f15392b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f15392b) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f15391a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f15392b = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f15391a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f15391a);
        }
        if (!this.f15392b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f15392b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
