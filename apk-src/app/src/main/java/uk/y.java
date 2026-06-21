package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f34607a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34608b = new u0("kotlin.Float", sk.d.f32920f);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.A());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34608b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(fFloatValue);
    }
}
