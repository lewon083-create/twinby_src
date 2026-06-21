package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f34548a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f34549b = l0.f34544a;

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new qk.d("'kotlin.Nothing' does not have instances");
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34549b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new qk.d("'kotlin.Nothing' cannot be serialized");
    }
}
