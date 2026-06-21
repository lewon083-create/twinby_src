package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f34505a = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f34506b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.c.f27504a, "<this>");
        f34506b = o0.a("kotlin.UByte", i.f34529a);
    }

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new ij.s(decoder.r(f34506b).x());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34506b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        byte b2 = ((ij.s) obj).f21354b;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.j(f34506b).f(b2);
    }
}
