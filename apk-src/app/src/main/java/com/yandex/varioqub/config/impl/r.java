package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends MessageNano {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q[] f15414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15415d;

    public r() {
        a();
    }

    public final void a() {
        this.f15412a = "";
        this.f15413b = "";
        if (q.f15409c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q.f15409c == null) {
                        q.f15409c = new q[0];
                    }
                } finally {
                }
            }
        }
        this.f15414c = q.f15409c;
        this.f15415d = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f15412a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f15412a);
        }
        if (!this.f15413b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f15413b);
        }
        q[] qVarArr = this.f15414c;
        if (qVarArr != null && qVarArr.length > 0) {
            int i = 0;
            while (true) {
                q[] qVarArr2 = this.f15414c;
                if (i >= qVarArr2.length) {
                    break;
                }
                q qVar = qVarArr2[i];
                if (qVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, qVar) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return !this.f15415d.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.f15415d) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f15412a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f15413b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                q[] qVarArr = this.f15414c;
                int length = qVarArr == null ? 0 : qVarArr.length;
                int i = repeatedFieldArrayLength + length;
                q[] qVarArr2 = new q[i];
                if (length != 0) {
                    System.arraycopy(qVarArr, 0, qVarArr2, 0, length);
                }
                while (length < i - 1) {
                    q qVar = new q();
                    qVarArr2[length] = qVar;
                    codedInputByteBufferNano.readMessage(qVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                q qVar2 = new q();
                qVarArr2[length] = qVar2;
                codedInputByteBufferNano.readMessage(qVar2);
                this.f15414c = qVarArr2;
            } else if (tag == 34) {
                this.f15415d = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f15412a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f15412a);
        }
        if (!this.f15413b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f15413b);
        }
        q[] qVarArr = this.f15414c;
        if (qVarArr != null && qVarArr.length > 0) {
            int i = 0;
            while (true) {
                q[] qVarArr2 = this.f15414c;
                if (i >= qVarArr2.length) {
                    break;
                }
                q qVar = qVarArr2[i];
                if (qVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, qVar);
                }
                i++;
            }
        }
        if (!this.f15415d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f15415d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
