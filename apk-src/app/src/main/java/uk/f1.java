package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f34517c;

    static {
        Intrinsics.checkNotNullParameter(ij.w.f21359c, "<this>");
        f34517c = new f1(g1.f34523a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        int[] collectionSize = ((ij.x) obj).f21361b;
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        e1 builder = (e1) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int iH = decoder.q(this.f34589b, i).h();
        ij.v vVar = ij.w.f21359c;
        builder.getClass();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f34510a;
        int i10 = builder.f34511b;
        builder.f34511b = i10 + 1;
        iArr[i10] = iH;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        int[] bufferWithData = ((ij.x) obj).f21361b;
        Intrinsics.checkNotNullParameter(bufferWithData, "$this$toBuilder");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        e1 e1Var = new e1();
        e1Var.f34510a = bufferWithData;
        e1Var.f34511b = bufferWithData.length;
        e1Var.b(10);
        return e1Var;
    }

    @Override // uk.t0
    public final Object j() {
        int[] storage = new int[0];
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new ij.x(storage);
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        int[] content = ((ij.x) obj).f21361b;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            tk.c cVarR = encoder.r(this.f34589b, i10);
            int i11 = content[i10];
            ij.v vVar = ij.w.f21359c;
            cVarR.k(i11);
        }
    }
}
