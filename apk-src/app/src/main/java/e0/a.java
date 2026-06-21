package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.c f15879a;

    public a(c0.c resolvedFeatureGroup) {
        Intrinsics.checkNotNullParameter(resolvedFeatureGroup, "resolvedFeatureGroup");
        this.f15879a = resolvedFeatureGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.a(this.f15879a, ((a) obj).f15879a);
    }

    public final int hashCode() {
        return this.f15879a.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.f15879a + ')';
    }
}
