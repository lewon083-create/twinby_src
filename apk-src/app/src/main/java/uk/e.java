package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f34507c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.b.f27503a, "<this>");
        f34507c = new e(f.f34512a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        d builder = (d) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zD = decoder.d(this.f34589b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f34502a;
        int i10 = builder.f34503b;
        builder.f34503b = i10 + 1;
        zArr[i10] = zD;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        boolean[] bufferWithData = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        d dVar = new d();
        dVar.f34502a = bufferWithData;
        dVar.f34503b = bufferWithData.length;
        dVar.b(10);
        return dVar;
    }

    @Override // uk.t0
    public final Object j() {
        return new boolean[0];
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        boolean[] content = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            encoder.p(this.f34589b, i10, content[i10]);
        }
    }
}
