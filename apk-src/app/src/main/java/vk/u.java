package vk;

import com.google.android.gms.internal.measurement.j4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f34895a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sk.g f34896b = j4.d("kotlinx.serialization.json.JsonNull", sk.h.f32936c, new sk.f[0], new ch.a(16));

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        hl.l.b(decoder);
        if (!decoder.p()) {
            return t.INSTANCE;
        }
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        throw new wk.g("Expected 'null' literal");
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34896b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        hl.l.a(encoder);
        encoder.c();
    }
}
