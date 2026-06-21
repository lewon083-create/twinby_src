package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends MessageNano {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21998c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21999d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile m[] f22000e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f22002b;

    public m() {
        a();
    }

    public static m[] b() {
        if (f22000e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f22000e == null) {
                        f22000e = new m[0];
                    }
                } finally {
                }
            }
        }
        return f22000e;
    }

    public final m a() {
        this.f22001a = false;
        this.f22002b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f22001a;
        if (z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        l lVar = this.f22002b;
        return lVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, lVar) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        boolean z5 = this.f22001a;
        if (z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        l lVar = this.f22002b;
        if (lVar != null) {
            codedOutputByteBufferNano.writeMessage(2, lVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f22001a = codedInputByteBufferNano.readBool();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f22002b == null) {
                    this.f22002b = new l();
                }
                codedInputByteBufferNano.readMessage(this.f22002b);
            }
        }
        return this;
    }

    public static m b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new m().mergeFrom(codedInputByteBufferNano);
    }

    public static m a(byte[] bArr) {
        return (m) MessageNano.mergeFrom(new m(), bArr);
    }
}
