package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f34539a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34540b = new u0("kotlin.Long", sk.d.f32922h);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.o());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34540b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.l(jLongValue);
    }
}
