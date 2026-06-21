package uk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f34546a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f34547b = new u0("kotlin.Char", sk.d.f32918d);

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.e());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34547b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.i(cCharValue);
    }
}
