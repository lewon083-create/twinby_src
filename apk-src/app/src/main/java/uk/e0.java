package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f34508a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34509b = new u0("kotlin.Int", sk.d.f32921g);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.h());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34509b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.k(iIntValue);
    }
}
