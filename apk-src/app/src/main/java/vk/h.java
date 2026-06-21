package vk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements qk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f34883a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f34884b = g.f34880b;

    @Override // qk.a
    public final Object deserialize(tk.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        hl.l.b(decoder);
        n elementSerializer = n.f34888a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new e((List) new uk.c(elementSerializer).deserialize(decoder));
    }

    @Override // qk.a
    public final sk.f getDescriptor() {
        return f34884b;
    }

    @Override // qk.a
    public final void serialize(tk.c encoder, Object obj) {
        e value = (e) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        hl.l.a(encoder);
        n elementSerializer = n.f34888a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        new uk.c(elementSerializer).serialize(encoder, value);
    }
}
