package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0230i8 extends MessageNano {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile C0230i8[] f24053f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f24054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f24055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0330m8 f24056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0255j8[] f24057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24058e;

    public C0230i8() {
        a();
    }

    public static C0230i8[] b() {
        if (f24053f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24053f == null) {
                        f24053f = new C0230i8[0];
                    }
                } finally {
                }
            }
        }
        return f24053f;
    }

    public final C0230i8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f24054a = bArr;
        this.f24055b = bArr;
        this.f24056c = null;
        this.f24057d = C0255j8.b();
        this.f24058e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f24054a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f24054a);
        }
        if (!Arrays.equals(this.f24055b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f24055b);
        }
        C0330m8 c0330m8 = this.f24056c;
        if (c0330m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0330m8);
        }
        C0255j8[] c0255j8Arr = this.f24057d;
        if (c0255j8Arr != null && c0255j8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0255j8[] c0255j8Arr2 = this.f24057d;
                if (i >= c0255j8Arr2.length) {
                    break;
                }
                C0255j8 c0255j8 = c0255j8Arr2[i];
                if (c0255j8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c0255j8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i10 = this.f24058e;
        return i10 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        byte[] bArr = this.f24054a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f24054a);
        }
        if (!Arrays.equals(this.f24055b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f24055b);
        }
        C0330m8 c0330m8 = this.f24056c;
        if (c0330m8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0330m8);
        }
        C0255j8[] c0255j8Arr = this.f24057d;
        if (c0255j8Arr != null && c0255j8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0255j8[] c0255j8Arr2 = this.f24057d;
                if (i >= c0255j8Arr2.length) {
                    break;
                }
                C0255j8 c0255j8 = c0255j8Arr2[i];
                if (c0255j8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0255j8);
                }
                i++;
            }
        }
        int i10 = this.f24058e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0230i8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0230i8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0230i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f24054a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f24055b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f24056c == null) {
                    this.f24056c = new C0330m8();
                }
                codedInputByteBufferNano.readMessage(this.f24056c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C0255j8[] c0255j8Arr = this.f24057d;
                int length = c0255j8Arr == null ? 0 : c0255j8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0255j8[] c0255j8Arr2 = new C0255j8[i];
                if (length != 0) {
                    System.arraycopy(c0255j8Arr, 0, c0255j8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0255j8 c0255j8 = new C0255j8();
                    c0255j8Arr2[length] = c0255j8;
                    codedInputByteBufferNano.readMessage(c0255j8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0255j8 c0255j82 = new C0255j8();
                c0255j8Arr2[length] = c0255j82;
                codedInputByteBufferNano.readMessage(c0255j82);
                this.f24057d = c0255j8Arr2;
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24058e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0230i8 a(byte[] bArr) {
        return (C0230i8) MessageNano.mergeFrom(new C0230i8(), bArr);
    }
}
