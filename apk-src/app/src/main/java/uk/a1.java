package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f34493a = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34494b = new u0("kotlin.String", sk.d.f32923j);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.j();
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34494b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.n(value);
    }
}
