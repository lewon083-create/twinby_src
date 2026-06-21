package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m1 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f34550a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f34551b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.i0.f27515a, "<this>");
        f34551b = o0.a("kotlin.UShort", z0.f34610a);
    }

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new ij.d0(decoder.r(f34551b).z());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34551b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        short s10 = ((ij.d0) obj).f21333b;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.j(f34551b).e(s10);
    }
}
