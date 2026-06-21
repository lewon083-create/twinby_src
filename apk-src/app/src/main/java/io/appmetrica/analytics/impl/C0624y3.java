package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0624y3 extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f25064c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f25065d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25066e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f25067f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C0624y3[] f25068g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0549v3 f25069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0549v3[] f25070b;

    public C0624y3() {
        a();
    }

    public static C0624y3[] b() {
        if (f25068g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f25068g == null) {
                        f25068g = new C0624y3[0];
                    }
                } finally {
                }
            }
        }
        return f25068g;
    }

    public final C0624y3 a() {
        this.f25069a = null;
        this.f25070b = C0549v3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0549v3 c0549v3 = this.f25069a;
        if (c0549v3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0549v3);
        }
        C0549v3[] c0549v3Arr = this.f25070b;
        if (c0549v3Arr != null && c0549v3Arr.length > 0) {
            int i = 0;
            while (true) {
                C0549v3[] c0549v3Arr2 = this.f25070b;
                if (i >= c0549v3Arr2.length) {
                    break;
                }
                C0549v3 c0549v32 = c0549v3Arr2[i];
                if (c0549v32 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0549v32) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0549v3 c0549v3 = this.f25069a;
        if (c0549v3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0549v3);
        }
        C0549v3[] c0549v3Arr = this.f25070b;
        if (c0549v3Arr != null && c0549v3Arr.length > 0) {
            int i = 0;
            while (true) {
                C0549v3[] c0549v3Arr2 = this.f25070b;
                if (i >= c0549v3Arr2.length) {
                    break;
                }
                C0549v3 c0549v32 = c0549v3Arr2[i];
                if (c0549v32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0549v32);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0624y3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f25069a == null) {
                    this.f25069a = new C0549v3();
                }
                codedInputByteBufferNano.readMessage(this.f25069a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0549v3[] c0549v3Arr = this.f25070b;
                int length = c0549v3Arr == null ? 0 : c0549v3Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0549v3[] c0549v3Arr2 = new C0549v3[i];
                if (length != 0) {
                    System.arraycopy(c0549v3Arr, 0, c0549v3Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0549v3 c0549v3 = new C0549v3();
                    c0549v3Arr2[length] = c0549v3;
                    codedInputByteBufferNano.readMessage(c0549v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0549v3 c0549v32 = new C0549v3();
                c0549v3Arr2[length] = c0549v32;
                codedInputByteBufferNano.readMessage(c0549v32);
                this.f25070b = c0549v3Arr2;
            }
        }
        return this;
    }

    public static C0624y3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0624y3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0624y3 a(byte[] bArr) {
        return (C0624y3) MessageNano.mergeFrom(new C0624y3(), bArr);
    }
}
