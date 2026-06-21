package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0330m8 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0330m8[] f24354c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0305l8[] f24355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24356b;

    public C0330m8() {
        a();
    }

    public static C0330m8[] b() {
        if (f24354c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24354c == null) {
                        f24354c = new C0330m8[0];
                    }
                } finally {
                }
            }
        }
        return f24354c;
    }

    public final C0330m8 a() {
        this.f24355a = C0305l8.b();
        this.f24356b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0305l8[] c0305l8Arr = this.f24355a;
        if (c0305l8Arr != null && c0305l8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0305l8[] c0305l8Arr2 = this.f24355a;
                if (i >= c0305l8Arr2.length) {
                    break;
                }
                C0305l8 c0305l8 = c0305l8Arr2[i];
                if (c0305l8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0305l8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i10 = this.f24356b;
        return i10 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0305l8[] c0305l8Arr = this.f24355a;
        if (c0305l8Arr != null && c0305l8Arr.length > 0) {
            int i = 0;
            while (true) {
                C0305l8[] c0305l8Arr2 = this.f24355a;
                if (i >= c0305l8Arr2.length) {
                    break;
                }
                C0305l8 c0305l8 = c0305l8Arr2[i];
                if (c0305l8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0305l8);
                }
                i++;
            }
        }
        int i10 = this.f24356b;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0330m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0305l8[] c0305l8Arr = this.f24355a;
                int length = c0305l8Arr == null ? 0 : c0305l8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0305l8[] c0305l8Arr2 = new C0305l8[i];
                if (length != 0) {
                    System.arraycopy(c0305l8Arr, 0, c0305l8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0305l8 c0305l8 = new C0305l8();
                    c0305l8Arr2[length] = c0305l8;
                    codedInputByteBufferNano.readMessage(c0305l8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0305l8 c0305l82 = new C0305l8();
                c0305l8Arr2[length] = c0305l82;
                codedInputByteBufferNano.readMessage(c0305l82);
                this.f24355a = c0305l8Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f24356b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C0330m8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0330m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0330m8 a(byte[] bArr) {
        return (C0330m8) MessageNano.mergeFrom(new C0330m8(), bArr);
    }
}
