package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0047b6 extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C0047b6[] f23486g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0021a6[] f23492f;

    public C0047b6() {
        a();
    }

    public static C0047b6[] b() {
        if (f23486g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23486g == null) {
                        f23486g = new C0047b6[0];
                    }
                } finally {
                }
            }
        }
        return f23486g;
    }

    public final C0047b6 a() {
        this.f23487a = "";
        this.f23488b = 0;
        this.f23489c = 0L;
        this.f23490d = "";
        this.f23491e = 0;
        this.f23492f = C0021a6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f23489c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f23488b) + CodedOutputByteBufferNano.computeStringSize(1, this.f23487a) + super.computeSerializedSize();
        if (!this.f23490d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f23490d);
        }
        int i = this.f23491e;
        if (i != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        C0021a6[] c0021a6Arr = this.f23492f;
        if (c0021a6Arr != null && c0021a6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C0021a6[] c0021a6Arr2 = this.f23492f;
                if (i10 >= c0021a6Arr2.length) {
                    break;
                }
                C0021a6 c0021a6 = c0021a6Arr2[i10];
                if (c0021a6 != null) {
                    iComputeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c0021a6) + iComputeSInt64Size;
                }
                i10++;
            }
        }
        return iComputeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        codedOutputByteBufferNano.writeString(1, this.f23487a);
        codedOutputByteBufferNano.writeSInt32(2, this.f23488b);
        codedOutputByteBufferNano.writeSInt64(3, this.f23489c);
        if (!this.f23490d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f23490d);
        }
        int i = this.f23491e;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        C0021a6[] c0021a6Arr = this.f23492f;
        if (c0021a6Arr != null && c0021a6Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C0021a6[] c0021a6Arr2 = this.f23492f;
                if (i10 >= c0021a6Arr2.length) {
                    break;
                }
                C0021a6 c0021a6 = c0021a6Arr2[i10];
                if (c0021a6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c0021a6);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0047b6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0047b6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0047b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f23487a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f23488b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f23489c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f23490d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f23491e = codedInputByteBufferNano.readUInt32();
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C0021a6[] c0021a6Arr = this.f23492f;
                int length = c0021a6Arr == null ? 0 : c0021a6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0021a6[] c0021a6Arr2 = new C0021a6[i];
                if (length != 0) {
                    System.arraycopy(c0021a6Arr, 0, c0021a6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0021a6 c0021a6 = new C0021a6();
                    c0021a6Arr2[length] = c0021a6;
                    codedInputByteBufferNano.readMessage(c0021a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0021a6 c0021a62 = new C0021a6();
                c0021a6Arr2[length] = c0021a62;
                codedInputByteBufferNano.readMessage(c0021a62);
                this.f23492f = c0021a6Arr2;
            }
        }
        return this;
    }

    public static C0047b6 a(byte[] bArr) {
        return (C0047b6) MessageNano.mergeFrom(new C0047b6(), bArr);
    }
}
