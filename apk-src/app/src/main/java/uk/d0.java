package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f34504c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.q.f27520a, "<this>");
        f34504c = new d0(e0.f34508a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        c0 builder = (c0) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int iY = decoder.y(this.f34589b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f34499a;
        int i10 = builder.f34500b;
        builder.f34500b = i10 + 1;
        iArr[i10] = iY;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        int[] bufferWithData = (int[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        c0 c0Var = new c0();
        c0Var.f34499a = bufferWithData;
        c0Var.f34500b = bufferWithData.length;
        c0Var.b(10);
        return c0Var;
    }

    @Override // uk.t0
    public final Object j() {
        return new int[0];
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        int[] content = (int[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = content[i10];
            encoder.getClass();
            s0 descriptor = this.f34589b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.q(descriptor, i10);
            encoder.k(i11);
        }
    }
}
