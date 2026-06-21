package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f34534c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.s.f27521a, "<this>");
        f34534c = new j0(k0.f34539a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        i0 builder = (i0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        long jL = decoder.l(this.f34589b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f34531a;
        int i10 = builder.f34532b;
        builder.f34532b = i10 + 1;
        jArr[i10] = jL;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        long[] bufferWithData = (long[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        i0 i0Var = new i0();
        i0Var.f34531a = bufferWithData;
        i0Var.f34532b = bufferWithData.length;
        i0Var.b(10);
        return i0Var;
    }

    @Override // uk.t0
    public final Object j() {
        return new long[0];
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        long[] content = (long[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.s(this.f34589b, i10, content[i10]);
        }
    }
}
