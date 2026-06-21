package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class O extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile O[] f25435d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f25438c;

    public O() {
        a();
    }

    public static O[] b() {
        if (f25435d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f25435d == null) {
                        f25435d = new O[0];
                    }
                } finally {
                }
            }
        }
        return f25435d;
    }

    public final O a() {
        this.f25436a = true;
        this.f25437b = 5L;
        this.f25438c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f25436a;
        if (!z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        long j10 = this.f25437b;
        if (j10 != 5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j10);
        }
        String[] strArr = this.f25438c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeStringSizeNoTag = 0;
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f25438c;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i10;
            }
            String str = strArr2[i];
            if (str != null) {
                i10++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        boolean z5 = this.f25436a;
        if (!z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        long j10 = this.f25437b;
        if (j10 != 5) {
            codedOutputByteBufferNano.writeInt64(2, j10);
        }
        String[] strArr = this.f25438c;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f25438c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f25436a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f25437b = codedInputByteBufferNano.readInt64();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f25438c;
                int length = strArr == null ? 0 : strArr.length;
                int i = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f25438c = strArr2;
            }
        }
        return this;
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new O().mergeFrom(codedInputByteBufferNano);
    }

    public static O a(byte[] bArr) {
        return (O) MessageNano.mergeFrom(new O(), bArr);
    }
}
