package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j1 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f34535a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f34536b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.s.f27521a, "<this>");
        f34536b = o0.a("kotlin.ULong", k0.f34539a);
    }

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new ij.z(decoder.r(f34536b).o());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34536b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        long j10 = ((ij.z) obj).f21363b;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.j(f34536b).l(j10);
    }
}
