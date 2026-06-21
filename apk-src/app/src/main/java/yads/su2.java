package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class su2 implements tu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd f43083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final km0 f43084b;

    public su2(rd rdVar, km0 km0Var) {
        this.f43083a = rdVar;
        this.f43084b = km0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su2)) {
            return false;
        }
        su2 su2Var = (su2) obj;
        return Intrinsics.a(this.f43083a, su2Var.f43083a) && Intrinsics.a(this.f43084b, su2Var.f43084b);
    }

    public final int hashCode() {
        return this.f43084b.hashCode() + (this.f43083a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(advertisingConfiguration=" + this.f43083a + ", environmentConfiguration=" + this.f43084b + ")";
    }
}
