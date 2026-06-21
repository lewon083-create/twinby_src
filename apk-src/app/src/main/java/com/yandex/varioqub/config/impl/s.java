package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile s[] f15416d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15419c;

    public s() {
        a();
    }

    public final void a() {
        this.f15417a = "";
        this.f15418b = 0L;
        this.f15419c = false;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f15417a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f15417a);
        }
        long j10 = this.f15418b;
        if (j10 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j10);
        }
        boolean z5 = this.f15419c;
        return z5 ? CodedOutputByteBufferNano.computeBoolSize(3, z5) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f15417a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f15418b = codedInputByteBufferNano.readInt64();
            } else if (tag == 24) {
                this.f15419c = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f15417a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f15417a);
        }
        long j10 = this.f15418b;
        if (j10 != 0) {
            codedOutputByteBufferNano.writeInt64(2, j10);
        }
        boolean z5 = this.f15419c;
        if (z5) {
            codedOutputByteBufferNano.writeBool(3, z5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
