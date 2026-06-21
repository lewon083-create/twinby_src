package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends MessageNano {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile k[] f21986j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f21987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f21988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f21989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i[] f21990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f21993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21994h;
    public String i;

    public k() {
        a();
    }

    public static k[] b() {
        if (f21986j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21986j == null) {
                        f21986j = new k[0];
                    }
                } finally {
                }
            }
        }
        return f21986j;
    }

    public final k a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f21987a = bArr;
        this.f21988b = null;
        this.f21989c = bArr;
        this.f21990d = i.b();
        this.f21991e = 86400000L;
        this.f21992f = 3600000L;
        this.f21993g = WireFormatNano.EMPTY_INT_ARRAY;
        this.f21994h = true;
        this.i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int[] iArr;
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f21987a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f21987a);
        }
        j jVar = this.f21988b;
        if (jVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, jVar);
        }
        if (!Arrays.equals(this.f21989c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f21989c);
        }
        i[] iVarArr = this.f21990d;
        int i = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                i[] iVarArr2 = this.f21990d;
                if (i10 >= iVarArr2.length) {
                    break;
                }
                i iVar = iVarArr2[i10];
                if (iVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, iVar) + iComputeSerializedSize;
                }
                i10++;
            }
        }
        long j10 = this.f21991e;
        if (j10 != 86400000) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j10);
        }
        long j11 = this.f21992f;
        if (j11 != 3600000) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(6, j11);
        }
        int[] iArr2 = this.f21993g;
        if (iArr2 != null && iArr2.length > 0) {
            int iComputeUInt32SizeNoTag = 0;
            while (true) {
                iArr = this.f21993g;
                if (i >= iArr.length) {
                    break;
                }
                iComputeUInt32SizeNoTag += CodedOutputByteBufferNano.computeUInt32SizeNoTag(iArr[i]);
                i++;
            }
            iComputeSerializedSize = iComputeSerializedSize + iComputeUInt32SizeNoTag + iArr.length;
        }
        boolean z5 = this.f21994h;
        if (!z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, z5);
        }
        return !this.i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.i) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f21987a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f21987a);
        }
        j jVar = this.f21988b;
        if (jVar != null) {
            codedOutputByteBufferNano.writeMessage(2, jVar);
        }
        if (!Arrays.equals(this.f21989c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f21989c);
        }
        i[] iVarArr = this.f21990d;
        int i = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                i[] iVarArr2 = this.f21990d;
                if (i10 >= iVarArr2.length) {
                    break;
                }
                i iVar = iVarArr2[i10];
                if (iVar != null) {
                    codedOutputByteBufferNano.writeMessage(4, iVar);
                }
                i10++;
            }
        }
        long j10 = this.f21991e;
        if (j10 != 86400000) {
            codedOutputByteBufferNano.writeUInt64(5, j10);
        }
        long j11 = this.f21992f;
        if (j11 != 3600000) {
            codedOutputByteBufferNano.writeUInt64(6, j11);
        }
        int[] iArr = this.f21993g;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f21993g;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt32(7, iArr2[i]);
                i++;
            }
        }
        boolean z5 = this.f21994h;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(8, z5);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static k b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new k().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    this.f21987a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f21988b == null) {
                        this.f21988b = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f21988b);
                    break;
                case 26:
                    this.f21989c = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    i[] iVarArr = this.f21990d;
                    int length = iVarArr == null ? 0 : iVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    i[] iVarArr2 = new i[i];
                    if (length != 0) {
                        System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        i iVar = new i();
                        iVarArr2[length] = iVar;
                        codedInputByteBufferNano.readMessage(iVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    i iVar2 = new i();
                    iVarArr2[length] = iVar2;
                    codedInputByteBufferNano.readMessage(iVar2);
                    this.f21990d = iVarArr2;
                    break;
                case 40:
                    this.f21991e = codedInputByteBufferNano.readUInt64();
                    break;
                case 48:
                    this.f21992f = codedInputByteBufferNano.readUInt64();
                    break;
                case 56:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 56);
                    int[] iArr = this.f21993g;
                    int length2 = iArr == null ? 0 : iArr.length;
                    int i10 = repeatedFieldArrayLength2 + length2;
                    int[] iArr2 = new int[i10];
                    if (length2 != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length2);
                    }
                    while (length2 < i10 - 1) {
                        iArr2[length2] = codedInputByteBufferNano.readUInt32();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    iArr2[length2] = codedInputByteBufferNano.readUInt32();
                    this.f21993g = iArr2;
                    break;
                case 58:
                    int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    int position = codedInputByteBufferNano.getPosition();
                    int i11 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        codedInputByteBufferNano.readUInt32();
                        i11++;
                    }
                    codedInputByteBufferNano.rewindToPosition(position);
                    int[] iArr3 = this.f21993g;
                    int length3 = iArr3 == null ? 0 : iArr3.length;
                    int i12 = i11 + length3;
                    int[] iArr4 = new int[i12];
                    if (length3 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length3);
                    }
                    while (length3 < i12) {
                        iArr4[length3] = codedInputByteBufferNano.readUInt32();
                        length3++;
                    }
                    this.f21993g = iArr4;
                    codedInputByteBufferNano.popLimit(iPushLimit);
                    break;
                case 64:
                    this.f21994h = codedInputByteBufferNano.readBool();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    }
                    break;
            }
        }
        return this;
    }

    public static k a(byte[] bArr) {
        return (k) MessageNano.mergeFrom(new k(), bArr);
    }
}
