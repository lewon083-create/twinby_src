package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ug2 f41794b;

    public p01(boolean z5, ug2 ug2Var) {
        this.f41793a = z5;
        this.f41794b = ug2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p01)) {
            return false;
        }
        p01 p01Var = (p01) obj;
        return this.f41793a == p01Var.f41793a && Intrinsics.a(this.f41794b, p01Var.f41794b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f41793a) * 31;
        ug2 ug2Var = this.f41794b;
        return iHashCode + (ug2Var == null ? 0 : ug2Var.hashCode());
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.f41793a + ", handledPackage=" + this.f41794b + ")";
    }
}
