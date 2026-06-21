package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f34604c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.l.f27519a, "<this>");
        f34604c = new x(y.f34607a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        w builder = (w) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        float fB = decoder.B(this.f34589b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        float[] fArr = builder.f34599a;
        int i10 = builder.f34600b;
        builder.f34600b = i10 + 1;
        fArr[i10] = fB;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        float[] bufferWithData = (float[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        w wVar = new w();
        wVar.f34599a = bufferWithData;
        wVar.f34600b = bufferWithData.length;
        wVar.b(10);
        return wVar;
    }

    @Override // uk.t0
    public final Object j() {
        return new float[0];
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        float[] content = (float[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            float f10 = content[i10];
            encoder.getClass();
            s0 descriptor = this.f34589b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.q(descriptor, i10);
            encoder.h(f10);
        }
    }
}
