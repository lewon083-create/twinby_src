package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0205h9 extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23968d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23969e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23970f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f23971g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f23972h = 4;
    public static final int i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f23973j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f23974k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f23975l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f23976m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f23977n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f23978o = 11;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f23979p = 12;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile C0205h9[] f23980q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0179g9 f23982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0153f9[] f23983c;

    public C0205h9() {
        a();
    }

    public static C0205h9[] b() {
        if (f23980q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23980q == null) {
                        f23980q = new C0205h9[0];
                    }
                } finally {
                }
            }
        }
        return f23980q;
    }

    public final C0205h9 a() {
        this.f23981a = 0L;
        this.f23982b = null;
        this.f23983c = C0153f9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f23981a) + super.computeSerializedSize();
        C0179g9 c0179g9 = this.f23982b;
        if (c0179g9 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c0179g9);
        }
        C0153f9[] c0153f9Arr = this.f23983c;
        if (c0153f9Arr != null && c0153f9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C0153f9[] c0153f9Arr2 = this.f23983c;
                if (i10 >= c0153f9Arr2.length) {
                    break;
                }
                C0153f9 c0153f9 = c0153f9Arr2[i10];
                if (c0153f9 != null) {
                    iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0153f9) + iComputeUInt64Size;
                }
                i10++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeUInt64(1, this.f23981a);
        C0179g9 c0179g9 = this.f23982b;
        if (c0179g9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0179g9);
        }
        C0153f9[] c0153f9Arr = this.f23983c;
        if (c0153f9Arr != null && c0153f9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C0153f9[] c0153f9Arr2 = this.f23983c;
                if (i10 >= c0153f9Arr2.length) {
                    break;
                }
                C0153f9 c0153f9 = c0153f9Arr2[i10];
                if (c0153f9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0153f9);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0205h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f23981a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.f23982b == null) {
                    this.f23982b = new C0179g9();
                }
                codedInputByteBufferNano.readMessage(this.f23982b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0153f9[] c0153f9Arr = this.f23983c;
                int length = c0153f9Arr == null ? 0 : c0153f9Arr.length;
                int i10 = repeatedFieldArrayLength + length;
                C0153f9[] c0153f9Arr2 = new C0153f9[i10];
                if (length != 0) {
                    System.arraycopy(c0153f9Arr, 0, c0153f9Arr2, 0, length);
                }
                while (length < i10 - 1) {
                    C0153f9 c0153f9 = new C0153f9();
                    c0153f9Arr2[length] = c0153f9;
                    codedInputByteBufferNano.readMessage(c0153f9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0153f9 c0153f92 = new C0153f9();
                c0153f9Arr2[length] = c0153f92;
                codedInputByteBufferNano.readMessage(c0153f92);
                this.f23983c = c0153f9Arr2;
            }
        }
        return this;
    }

    public static C0205h9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0205h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0205h9 a(byte[] bArr) {
        return (C0205h9) MessageNano.mergeFrom(new C0205h9(), bArr);
    }
}
