package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0555v9 extends MessageNano {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C0555v9[] f24892e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f24896d;

    public C0555v9() {
        a();
    }

    public static C0555v9[] b() {
        if (f24892e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24892e == null) {
                        f24892e = new C0555v9[0];
                    }
                } finally {
                }
            }
        }
        return f24892e;
    }

    public final C0555v9 a() {
        this.f24893a = false;
        this.f24894b = 0;
        this.f24895c = 0;
        this.f24896d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f24895c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f24894b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f24893a) + super.computeSerializedSize();
        int[] iArr = this.f24896d;
        if (iArr == null || iArr.length <= 0) {
            return iComputeUInt32Size;
        }
        int i = 0;
        int iComputeInt32SizeNoTag = 0;
        while (true) {
            int[] iArr2 = this.f24896d;
            if (i >= iArr2.length) {
                return iComputeUInt32Size + iComputeInt32SizeNoTag + iArr2.length;
            }
            iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeBool(1, this.f24893a);
        codedOutputByteBufferNano.writeUInt32(2, this.f24894b);
        codedOutputByteBufferNano.writeUInt32(3, this.f24895c);
        int[] iArr = this.f24896d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f24896d;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i]);
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0555v9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f24893a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f24894b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 24) {
                this.f24895c = codedInputByteBufferNano.readUInt32();
            } else if (tag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f24896d;
                int length = iArr == null ? 0 : iArr.length;
                int i = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f24896d = iArr2;
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i10 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i10++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f24896d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i11 = i10 + length2;
                int[] iArr4 = new int[i11];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i11) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f24896d = iArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            }
        }
        return this;
    }

    public static C0555v9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0555v9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0555v9 a(byte[] bArr) {
        return (C0555v9) MessageNano.mergeFrom(new C0555v9(), bArr);
    }
}
