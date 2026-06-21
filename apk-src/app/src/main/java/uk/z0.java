package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f34610a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34611b = new u0("kotlin.Short", sk.d.i);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.z());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34611b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.e(sShortValue);
    }
}
