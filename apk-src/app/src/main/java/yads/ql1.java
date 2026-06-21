package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ql1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ml1 f42338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ml1 f42339b;

    public ql1(ml1 ml1Var, ml1 ml1Var2) {
        this.f42338a = ml1Var;
        this.f42339b = ml1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql1)) {
            return false;
        }
        ql1 ql1Var = (ql1) obj;
        return Intrinsics.a(this.f42338a, ql1Var.f42338a) && Intrinsics.a(this.f42339b, ql1Var.f42339b);
    }

    public final int hashCode() {
        int iHashCode = this.f42338a.hashCode() * 31;
        ml1 ml1Var = this.f42339b;
        return iHashCode + (ml1Var == null ? 0 : ml1Var.hashCode());
    }

    public final String toString() {
        return "MediaFileWithFallback(target=" + this.f42338a + ", fallback=" + this.f42339b + ")";
    }
}
