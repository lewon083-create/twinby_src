package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f34533c;

    static {
        Intrinsics.checkNotNullParameter(ij.z.f21362c, "<this>");
        f34533c = new i1(j1.f34535a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        long[] collectionSize = ((ij.a0) obj).f21326b;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        h1 builder = (h1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long jO = decoder.q(this.f34589b, i).o();
        ij.y yVar = ij.z.f21362c;
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f34527a;
        int i10 = builder.f34528b;
        builder.f34528b = i10 + 1;
        jArr[i10] = jO;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        long[] bufferWithData = ((ij.a0) obj).f21326b;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        h1 h1Var = new h1();
        h1Var.f34527a = bufferWithData;
        h1Var.f34528b = bufferWithData.length;
        h1Var.b(10);
        return h1Var;
    }

    @Override // uk.t0
    public final Object j() {
        long[] storage = new long[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new ij.a0(storage);
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        long[] content = ((ij.a0) obj).f21326b;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            tk.c cVarR = encoder.r(this.f34589b, i10);
            long j10 = content[i10];
            ij.y yVar = ij.z.f21362c;
            cVarR.l(j10);
        }
    }
}
