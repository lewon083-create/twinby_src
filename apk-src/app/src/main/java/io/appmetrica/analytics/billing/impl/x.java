package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends MessageNano {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile x[] f21556d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f21558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f21559c;

    public x() {
        a();
    }

    public static x[] b() {
        if (f21556d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f21556d == null) {
                        f21556d = new x[0];
                    }
                } finally {
                }
            }
        }
        return f21556d;
    }

    public final x a() {
        this.f21557a = false;
        this.f21558b = null;
        this.f21559c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z5 = this.f21557a;
        if (z5) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z5);
        }
        w wVar = this.f21558b;
        if (wVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        v vVar = this.f21559c;
        return vVar != null ? CodedOutputByteBufferNano.computeMessageSize(3, vVar) + iComputeSerializedSize : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        boolean z5 = this.f21557a;
        if (z5) {
            codedOutputByteBufferNano.writeBool(1, z5);
        }
        w wVar = this.f21558b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        v vVar = this.f21559c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 8) {
                this.f21557a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f21558b == null) {
                    this.f21558b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f21558b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            } else {
                if (this.f21559c == null) {
                    this.f21559c = new v();
                }
                codedInputByteBufferNano.readMessage(this.f21559c);
            }
        }
        return this;
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public static x a(byte[] bArr) {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }
}
