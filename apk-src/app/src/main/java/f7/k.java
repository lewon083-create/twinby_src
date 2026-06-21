package f7;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16690a;

    public k(List displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.f16690a = displayFeatures;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.a(this.f16690a, ((k) obj).f16690a);
    }

    public final int hashCode() {
        return this.f16690a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.I(this.f16690a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
