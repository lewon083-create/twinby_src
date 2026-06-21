package vk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import uk.a1;
import uk.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f34902a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f34903b = y.f34899b;

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        hl.l.b(decoder);
        com.google.android.gms.internal.auth.g.D(j0.f27517a);
        a1 a1Var = a1.f34493a;
        n nVar = n.f34888a;
        a1 keySerializer = a1.f34493a;
        n valueSerializer = n.f34888a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new w((Map) new g0(keySerializer, valueSerializer).deserialize(decoder));
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34903b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        w value = (w) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        hl.l.a(encoder);
        com.google.android.gms.internal.auth.g.D(j0.f27517a);
        a1 a1Var = a1.f34493a;
        n nVar = n.f34888a;
        a1 keySerializer = a1.f34493a;
        n valueSerializer = n.f34888a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        new g0(keySerializer, valueSerializer).serialize(encoder, value);
    }
}
