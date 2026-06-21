package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g1 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f34523a = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f34524b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.q.f27520a, "<this>");
        f34524b = o0.a("kotlin.UInt", e0.f34508a);
    }

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new ij.w(decoder.r(f34524b).h());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34524b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        int i = ((ij.w) obj).f21360b;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.j(f34524b).k(i);
    }
}
