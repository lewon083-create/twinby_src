package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile q[] f15409c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s[] f15411b;

    public q() {
        a();
    }

    public final void a() {
        this.f15410a = "";
        if (s.f15416d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (s.f15416d == null) {
                        s.f15416d = new s[0];
                    }
                } finally {
                }
            }
        }
        this.f15411b = s.f15416d;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f15410a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f15410a);
        }
        s[] sVarArr = this.f15411b;
        if (sVarArr != null && sVarArr.length > 0) {
            int i = 0;
            while (true) {
                s[] sVarArr2 = this.f15411b;
                if (i >= sVarArr2.length) {
                    break;
                }
                s sVar = sVarArr2[i];
                if (sVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, sVar) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f15410a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                s[] sVarArr = this.f15411b;
                int length = sVarArr == null ? 0 : sVarArr.length;
                int i = repeatedFieldArrayLength + length;
                s[] sVarArr2 = new s[i];
                if (length != 0) {
                    System.arraycopy(sVarArr, 0, sVarArr2, 0, length);
                }
                while (length < i - 1) {
                    s sVar = new s();
                    sVarArr2[length] = sVar;
                    codedInputByteBufferNano.readMessage(sVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                s sVar2 = new s();
                sVarArr2[length] = sVar2;
                codedInputByteBufferNano.readMessage(sVar2);
                this.f15411b = sVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f15410a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f15410a);
        }
        s[] sVarArr = this.f15411b;
        if (sVarArr != null && sVarArr.length > 0) {
            int i = 0;
            while (true) {
                s[] sVarArr2 = this.f15411b;
                if (i >= sVarArr2.length) {
                    break;
                }
                s sVar = sVarArr2[i];
                if (sVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, sVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
