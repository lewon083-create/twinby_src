package vk;

import com.google.android.gms.internal.measurement.j4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f34876a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sk.g f34877b = j4.d("kotlinx.serialization.json.JsonPrimitive", sk.d.f32923j, new sk.f[0], new ch.a(16));

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        l lVarP0 = hl.l.b(decoder).p0();
        if (lVarP0 instanceof b0) {
            return (b0) lVarP0;
        }
        throw wk.j.b(-1, "Unexpected JSON element, expected JsonPrimitive, had " + g0.a(lVarP0.getClass()), lVarP0.toString());
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34877b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        b0 value = (b0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        hl.l.a(encoder);
        if (value instanceof t) {
            encoder.m(u.f34895a, t.INSTANCE);
        } else {
            encoder.m(r.f34893a, (q) value);
        }
    }
}
