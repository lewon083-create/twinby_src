package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1 f34545c;

    static {
        Intrinsics.checkNotNullParameter(ij.d0.f21332c, "<this>");
        f34545c = new l1(m1.f34550a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        short[] collectionSize = ((ij.e0) obj).f21334b;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        k1 builder = (k1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        short sZ = decoder.q(this.f34589b, i).z();
        ij.c0 c0Var = ij.d0.f21332c;
        builder.getClass();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f34541a;
        int i10 = builder.f34542b;
        builder.f34542b = i10 + 1;
        sArr[i10] = sZ;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        short[] bufferWithData = ((ij.e0) obj).f21334b;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        k1 k1Var = new k1();
        k1Var.f34541a = bufferWithData;
        k1Var.f34542b = bufferWithData.length;
        k1Var.b(10);
        return k1Var;
    }

    @Override // uk.t0
    public final Object j() {
        short[] storage = new short[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new ij.e0(storage);
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        short[] content = ((ij.e0) obj).f21334b;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            tk.c cVarR = encoder.r(this.f34589b, i10);
            short s10 = content[i10];
            ij.c0 c0Var = ij.d0.f21332c;
            cVarR.e(s10);
        }
    }
}
