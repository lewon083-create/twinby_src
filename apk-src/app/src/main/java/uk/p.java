package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f34563c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.k.f27518a, "<this>");
        f34563c = new p(q.f34566a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        o builder = (o) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        double dK = decoder.k(this.f34589b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        double[] dArr = builder.f34557a;
        int i10 = builder.f34558b;
        builder.f34558b = i10 + 1;
        dArr[i10] = dK;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        double[] bufferWithData = (double[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        o oVar = new o();
        oVar.f34557a = bufferWithData;
        oVar.f34558b = bufferWithData.length;
        oVar.b(10);
        return oVar;
    }

    @Override // uk.t0
    public final Object j() {
        return new double[0];
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        double[] content = (double[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            double d10 = content[i10];
            encoder.getClass();
            s0 descriptor = this.f34589b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.q(descriptor, i10);
            encoder.d(d10);
        }
    }
}
