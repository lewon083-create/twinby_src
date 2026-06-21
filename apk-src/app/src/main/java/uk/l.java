package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f34543c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.f.f27509a, "<this>");
        f34543c = new l(m.f34546a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        k builder = (k) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        char cU = decoder.u(this.f34589b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        char[] cArr = builder.f34537a;
        int i10 = builder.f34538b;
        builder.f34538b = i10 + 1;
        cArr[i10] = cU;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        char[] bufferWithData = (char[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        k kVar = new k();
        kVar.f34537a = bufferWithData;
        kVar.f34538b = bufferWithData.length;
        kVar.b(10);
        return kVar;
    }

    @Override // uk.t0
    public final Object j() {
        return new char[0];
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        char[] content = (char[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            char c8 = content[i10];
            encoder.getClass();
            s0 descriptor = this.f34589b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.q(descriptor, i10);
            encoder.i(c8);
        }
    }
}
