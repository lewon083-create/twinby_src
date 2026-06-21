package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class am3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36779b;

    public am3(int i, String str) {
        this.f36778a = i;
        this.f36779b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am3)) {
            return false;
        }
        am3 am3Var = (am3) obj;
        return this.f36778a == am3Var.f36778a && Intrinsics.a(this.f36779b, am3Var.f36779b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f36778a) * 31;
        String str = this.f36779b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VisibleAreaResult(area=" + this.f36778a + ", description=" + this.f36779b + ")";
    }
}
