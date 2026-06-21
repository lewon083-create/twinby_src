package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0168fo extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0168fo[] f23906c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23908b;

    public C0168fo() {
        a();
    }

    public static C0168fo[] b() {
        if (f23906c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f23906c == null) {
                        f23906c = new C0168fo[0];
                    }
                } finally {
                }
            }
        }
        return f23906c;
    }

    public final C0168fo a() {
        this.f23907a = false;
        this.f23908b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f23907a;
        if (z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        boolean z10 = this.f23908b;
        return z10 ? CodedOutputByteBufferNano.computeBoolSize(2, z10) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z5 = this.f23907a;
        if (z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        boolean z10 = this.f23908b;
        if (z10) {
            codedOutputByteBufferNano.writeBool(2, z10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0168fo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f23907a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                this.f23908b = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static C0168fo b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0168fo().mergeFrom(codedInputByteBufferNano);
    }

    public static C0168fo a(byte[] bArr) {
        return (C0168fo) MessageNano.mergeFrom(new C0168fo(), bArr);
    }
}
