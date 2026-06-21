package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f34501c;

    static {
        Intrinsics.checkNotNullParameter(ij.s.f21353c, "<this>");
        f34501c = new c1(d1.f34505a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        byte[] collectionSize = ((ij.u) obj).f21358b;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        b1 builder = (b1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte bX = decoder.q(this.f34589b, i).x();
        ij.r rVar = ij.s.f21353c;
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f34496a;
        int i10 = builder.f34497b;
        builder.f34497b = i10 + 1;
        bArr[i10] = bX;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        byte[] bufferWithData = ((ij.u) obj).f21358b;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        b1 b1Var = new b1();
        b1Var.f34496a = bufferWithData;
        b1Var.f34497b = bufferWithData.length;
        b1Var.b(10);
        return b1Var;
    }

    @Override // uk.t0
    public final Object j() {
        byte[] storage = new byte[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new ij.u(storage);
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        byte[] content = ((ij.u) obj).f21358b;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            tk.c cVarR = encoder.r(this.f34589b, i10);
            byte b2 = content[i10];
            ij.r rVar = ij.s.f21353c;
            cVarR.f(b2);
        }
    }
}
