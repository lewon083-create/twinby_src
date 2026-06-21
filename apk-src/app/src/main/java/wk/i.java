package wk;

import kotlin.jvm.internal.Intrinsics;
import uk.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f35286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35287b;

    public i(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f35286a = new s(descriptor, new h(2, this, i.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
