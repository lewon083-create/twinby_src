package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.InvalidProtocolBufferNanoException;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends MessageNano {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n[] f15398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15403h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o[] f15404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f15407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f15408n;

    public p() {
        a();
    }

    public final void a() {
        this.f15396a = "";
        this.f15397b = "";
        if (n.f15390c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (n.f15390c == null) {
                        n.f15390c = new n[0];
                    }
                } finally {
                }
            }
        }
        this.f15398c = n.f15390c;
        this.f15399d = "";
        this.f15400e = "";
        this.f15401f = "";
        this.f15402g = "";
        this.f15403h = "";
        this.i = "";
        this.f15404j = o.b();
        this.f15405k = "";
        this.f15406l = "";
        this.f15407m = "";
        this.f15408n = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f15396a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f15396a);
        }
        if (!this.f15397b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f15397b);
        }
        n[] nVarArr = this.f15398c;
        int i = 0;
        if (nVarArr != null && nVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                n[] nVarArr2 = this.f15398c;
                if (i10 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i10];
                if (nVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, nVar) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        if (!this.f15399d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f15399d);
        }
        if (!this.f15400e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(5, this.f15400e);
        }
        if (!this.f15401f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f15401f);
        }
        if (!this.f15402g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f15402g);
        }
        if (!this.f15403h.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.f15403h);
        }
        if (!this.i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        o[] oVarArr = this.f15404j;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                o[] oVarArr2 = this.f15404j;
                if (i >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i];
                if (oVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, oVar) + iComputeSerializedSize;
                }
                i++;
            }
        }
        if (!this.f15405k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f15405k);
        }
        if (!this.f15406l.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(12, this.f15406l);
        }
        if (!this.f15407m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f15407m);
        }
        return !this.f15408n.equals("") ? CodedOutputByteBufferNano.computeStringSize(14, this.f15408n) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f15396a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f15397b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    n[] nVarArr = this.f15398c;
                    int length = nVarArr == null ? 0 : nVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    n[] nVarArr2 = new n[i];
                    if (length != 0) {
                        System.arraycopy(nVarArr, 0, nVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        n nVar = new n();
                        nVarArr2[length] = nVar;
                        codedInputByteBufferNano.readMessage(nVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    n nVar2 = new n();
                    nVarArr2[length] = nVar2;
                    codedInputByteBufferNano.readMessage(nVar2);
                    this.f15398c = nVarArr2;
                    break;
                case 34:
                    this.f15399d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f15400e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    this.f15401f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f15402g = codedInputByteBufferNano.readString();
                    break;
                case 66:
                    this.f15403h = codedInputByteBufferNano.readString();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    o[] oVarArr = this.f15404j;
                    int length2 = oVarArr == null ? 0 : oVarArr.length;
                    int i10 = repeatedFieldArrayLength2 + length2;
                    o[] oVarArr2 = new o[i10];
                    if (length2 != 0) {
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length2);
                    }
                    while (length2 < i10 - 1) {
                        o oVar = new o();
                        oVarArr2[length2] = oVar;
                        codedInputByteBufferNano.readMessage(oVar);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    o oVar2 = new o();
                    oVarArr2[length2] = oVar2;
                    codedInputByteBufferNano.readMessage(oVar2);
                    this.f15404j = oVarArr2;
                    break;
                case 90:
                    this.f15405k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f15406l = codedInputByteBufferNano.readString();
                    break;
                case 106:
                    this.f15407m = codedInputByteBufferNano.readString();
                    break;
                case 114:
                    this.f15408n = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        if (!this.f15396a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f15396a);
        }
        if (!this.f15397b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f15397b);
        }
        n[] nVarArr = this.f15398c;
        int i = 0;
        if (nVarArr != null && nVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                n[] nVarArr2 = this.f15398c;
                if (i10 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i10];
                if (nVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, nVar);
                }
                i10++;
            }
        }
        if (!this.f15399d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f15399d);
        }
        if (!this.f15400e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f15400e);
        }
        if (!this.f15401f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f15401f);
        }
        if (!this.f15402g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f15402g);
        }
        if (!this.f15403h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f15403h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        o[] oVarArr = this.f15404j;
        if (oVarArr != null && oVarArr.length > 0) {
            while (true) {
                o[] oVarArr2 = this.f15404j;
                if (i >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i];
                if (oVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, oVar);
                }
                i++;
            }
        }
        if (!this.f15405k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f15405k);
        }
        if (!this.f15406l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f15406l);
        }
        if (!this.f15407m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f15407m);
        }
        if (!this.f15408n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f15408n);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
