package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends MessageNano {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f15329o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long[] f15330p = WireFormatNano.EMPTY_LONG_ARRAY;

    public k() {
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f15329o.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f15329o);
        }
        long[] jArr = this.f15330p;
        if (jArr == null || jArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeInt64SizeNoTag = 0;
        while (true) {
            long[] jArr2 = this.f15330p;
            if (i >= jArr2.length) {
                return iComputeSerializedSize + iComputeInt64SizeNoTag + jArr2.length;
            }
            iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeInt64SizeNoTag(jArr2[i]);
            i++;
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f15329o = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                long[] jArr = this.f15330p;
                int length = jArr == null ? 0 : jArr.length;
                int i = repeatedFieldArrayLength + length;
                long[] jArr2 = new long[i];
                if (length != 0) {
                    System.arraycopy(jArr, 0, jArr2, 0, length);
                }
                while (length < i - 1) {
                    jArr2[length] = codedInputByteBufferNano.readInt64();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                jArr2[length] = codedInputByteBufferNano.readInt64();
                this.f15330p = jArr2;
            } else if (tag == 18) {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i10 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt64();
                    i10++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                long[] jArr3 = this.f15330p;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                int i11 = i10 + length2;
                long[] jArr4 = new long[i11];
                if (length2 != 0) {
                    System.arraycopy(jArr3, 0, jArr4, 0, length2);
                }
                while (length2 < i11) {
                    jArr4[length2] = codedInputByteBufferNano.readInt64();
                    length2++;
                }
                this.f15330p = jArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f15329o.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f15329o);
        }
        long[] jArr = this.f15330p;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.f15330p;
                if (i >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt64(2, jArr2[i]);
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
