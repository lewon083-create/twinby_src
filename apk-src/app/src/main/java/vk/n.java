package vk;

import com.google.android.gms.internal.measurement.j4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f34888a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sk.g f34889b = j4.d("kotlinx.serialization.json.JsonElement", sk.c.f32915b, new sk.f[0], new ch.a(17));

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return hl.l.b(decoder).p0();
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34889b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        l value = (l) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        hl.l.a(encoder);
        if (value instanceof b0) {
            encoder.m(c0.f34876a, value);
        } else if (value instanceof w) {
            encoder.m(z.f34902a, value);
        } else {
            if (!(value instanceof e)) {
                throw new ij.j();
            }
            encoder.m(h.f34883a, value);
        }
    }
}
