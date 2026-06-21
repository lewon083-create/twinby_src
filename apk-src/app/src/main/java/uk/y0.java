package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y0 f34609c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.i0.f27515a, "<this>");
        f34609c = new y0(z0.f34610a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        x0 builder = (x0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short sT = decoder.t(this.f34589b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f34605a;
        int i10 = builder.f34606b;
        builder.f34606b = i10 + 1;
        sArr[i10] = sT;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        short[] bufferWithData = (short[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        x0 x0Var = new x0();
        x0Var.f34605a = bufferWithData;
        x0Var.f34606b = bufferWithData.length;
        x0Var.b(10);
        return x0Var;
    }

    @Override // uk.t0
    public final Object j() {
        return new short[0];
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        short[] content = (short[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            short s10 = content[i10];
            encoder.getClass();
            s0 descriptor = this.f34589b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.q(descriptor, i10);
            encoder.e(s10);
        }
    }
}
