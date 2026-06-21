package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ju2 implements ku2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt2 f39987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy f39988b;

    public ju2(pt2 pt2Var, xy xyVar) {
        this.f39987a = pt2Var;
        this.f39988b = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju2)) {
            return false;
        }
        ju2 ju2Var = (ju2) obj;
        return Intrinsics.a(this.f39987a, ju2Var.f39987a) && this.f39988b == ju2Var.f39988b;
    }

    public final int hashCode() {
        return this.f39988b.hashCode() + (this.f39987a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(sdkConfiguration=" + this.f39987a + ", configurationSource=" + this.f39988b + ")";
    }
}
