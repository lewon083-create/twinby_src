package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0337mf extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24365c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24366d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24367e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24368f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C0337mf[] f24369g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0287kf f24370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0312lf[] f24371b;

    public C0337mf() {
        a();
    }

    public static C0337mf[] b() {
        if (f24369g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24369g == null) {
                        f24369g = new C0337mf[0];
                    }
                } finally {
                }
            }
        }
        return f24369g;
    }

    public final C0337mf a() {
        this.f24370a = null;
        this.f24371b = C0312lf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C0287kf c0287kf = this.f24370a;
        if (c0287kf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0287kf);
        }
        C0312lf[] c0312lfArr = this.f24371b;
        if (c0312lfArr != null && c0312lfArr.length > 0) {
            int i = 0;
            while (true) {
                C0312lf[] c0312lfArr2 = this.f24371b;
                if (i >= c0312lfArr2.length) {
                    break;
                }
                C0312lf c0312lf = c0312lfArr2[i];
                if (c0312lf != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0312lf) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        C0287kf c0287kf = this.f24370a;
        if (c0287kf != null) {
            codedOutputByteBufferNano.writeMessage(1, c0287kf);
        }
        C0312lf[] c0312lfArr = this.f24371b;
        if (c0312lfArr != null && c0312lfArr.length > 0) {
            int i = 0;
            while (true) {
                C0312lf[] c0312lfArr2 = this.f24371b;
                if (i >= c0312lfArr2.length) {
                    break;
                }
                C0312lf c0312lf = c0312lfArr2[i];
                if (c0312lf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0312lf);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0337mf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f24370a == null) {
                    this.f24370a = new C0287kf();
                }
                codedInputByteBufferNano.readMessage(this.f24370a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0312lf[] c0312lfArr = this.f24371b;
                int length = c0312lfArr == null ? 0 : c0312lfArr.length;
                int i = repeatedFieldArrayLength + length;
                C0312lf[] c0312lfArr2 = new C0312lf[i];
                if (length != 0) {
                    System.arraycopy(c0312lfArr, 0, c0312lfArr2, 0, length);
                }
                while (length < i - 1) {
                    C0312lf c0312lf = new C0312lf();
                    c0312lfArr2[length] = c0312lf;
                    codedInputByteBufferNano.readMessage(c0312lf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0312lf c0312lf2 = new C0312lf();
                c0312lfArr2[length] = c0312lf2;
                codedInputByteBufferNano.readMessage(c0312lf2);
                this.f24371b = c0312lfArr2;
            }
        }
        return this;
    }

    public static C0337mf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0337mf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0337mf a(byte[] bArr) {
        return (C0337mf) MessageNano.mergeFrom(new C0337mf(), bArr);
    }
}
