package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7 f39742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7 f39743c;

    public j7(long j10, k7 k7Var, l7 l7Var) {
        this.f39741a = j10;
        this.f39742b = k7Var;
        this.f39743c = l7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return this.f39741a == j7Var.f39741a && Intrinsics.a(this.f39742b, j7Var.f39742b) && this.f39743c == j7Var.f39743c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f39741a) * 31;
        k7 k7Var = this.f39742b;
        int iHashCode2 = (iHashCode + (k7Var == null ? 0 : k7Var.hashCode())) * 31;
        l7 l7Var = this.f39743c;
        return iHashCode2 + (l7Var != null ? l7Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.f39741a + ", skip=" + this.f39742b + ", transitionPolicy=" + this.f39743c + ")";
    }
}
