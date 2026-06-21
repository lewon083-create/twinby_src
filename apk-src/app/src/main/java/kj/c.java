package kj;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f27402b = new c();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a10 = (Comparable) obj;
        Comparable b2 = (Comparable) obj2;
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return b2.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return b.f27401b;
    }
}
