package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f34566a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34567b = new u0("kotlin.Double", sk.d.f32919e);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.C());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34567b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.d(dDoubleValue);
    }
}
