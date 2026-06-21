package aj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f972b;

    public i0(String str, g0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f971a = str;
        this.f972b = type;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        i0 i0Var = (i0) obj;
        return j0.g.I(kotlin.collections.s.f(this.f971a, this.f972b), kotlin.collections.s.f(i0Var.f971a, i0Var.f972b));
    }

    public final int hashCode() {
        return kotlin.collections.s.f(this.f971a, this.f972b).hashCode();
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f971a + ", type=" + this.f972b + ")";
    }
}
