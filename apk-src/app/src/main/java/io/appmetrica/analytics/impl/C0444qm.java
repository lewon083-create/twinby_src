package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0444qm extends MessageNano {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C0444qm[] f24661g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24667f;

    public C0444qm() {
        a();
    }

    public static C0444qm[] b() {
        if (f24661g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f24661g == null) {
                        f24661g = new C0444qm[0];
                    }
                } finally {
                }
            }
        }
        return f24661g;
    }

    public final C0444qm a() {
        this.f24662a = false;
        this.f24663b = false;
        this.f24664c = false;
        this.f24665d = false;
        this.f24666e = false;
        this.f24667f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f24665d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f24664c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f24663b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f24662a) + super.computeSerializedSize();
        boolean z5 = this.f24666e;
        if (z5) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z5);
        }
        int i = this.f24667f;
        return i != -1 ? CodedOutputByteBufferNano.computeInt32Size(6, i) + iComputeBoolSize : iComputeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f24662a);
        codedOutputByteBufferNano.writeBool(2, this.f24663b);
        codedOutputByteBufferNano.writeBool(3, this.f24664c);
        codedOutputByteBufferNano.writeBool(4, this.f24665d);
        boolean z5 = this.f24666e;
        if (z5) {
            codedOutputByteBufferNano.writeBool(5, z5);
        }
        int i = this.f24667f;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(6, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0444qm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0444qm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0444qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f24662a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f24663b = codedInputByteBufferNano.readBool();
            } else if (tag == 24) {
                this.f24664c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f24665d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f24666e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f24667f = int32;
                }
            }
        }
        return this;
    }

    public static C0444qm a(byte[] bArr) {
        return (C0444qm) MessageNano.mergeFrom(new C0444qm(), bArr);
    }
}
