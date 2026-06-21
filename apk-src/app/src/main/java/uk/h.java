package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f34525c;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.c.f27504a, "<this>");
        f34525c = new h(i.f34529a);
    }

    @Override // uk.a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // uk.n, uk.a
    public final void f(tk.a decoder, int i, Object obj) {
        g builder = (g) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte bS = decoder.s(this.f34589b, i);
        builder.getClass();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f34518a;
        int i10 = builder.f34519b;
        builder.f34519b = i10 + 1;
        bArr[i10] = bS;
    }

    @Override // uk.a
    public final Object g(Object obj) {
        byte[] bufferWithData = (byte[]) obj;
        Intrinsics.checkNotNullParameter(bufferWithData, "<this>");
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        g gVar = new g();
        gVar.f34518a = bufferWithData;
        gVar.f34519b = bufferWithData.length;
        gVar.b(10);
        return gVar;
    }

    @Override // uk.t0
    public final Object j() {
        return new byte[0];
    }

    @Override // uk.t0
    public final void k(wk.o encoder, Object obj, int i) {
        byte[] content = (byte[]) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < i; i10++) {
            byte b2 = content[i10];
            encoder.getClass();
            s0 descriptor = this.f34589b;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            encoder.q(descriptor, i10);
            encoder.f(b2);
        }
    }
}
