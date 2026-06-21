package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r40 f39722d;

    public j40(String str, String str2, String str3, r40 r40Var) {
        this.f39719a = str;
        this.f39720b = str2;
        this.f39721c = str3;
        this.f39722d = r40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return Intrinsics.a(this.f39719a, j40Var.f39719a) && Intrinsics.a(this.f39720b, j40Var.f39720b) && Intrinsics.a(this.f39721c, j40Var.f39721c) && Intrinsics.a(this.f39722d, j40Var.f39722d);
    }

    public final int hashCode() {
        return this.f39722d.f42485a.hashCode() + k4.a(this.f39721c, k4.a(this.f39720b, this.f39719a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f39719a;
        String str2 = this.f39720b;
        String str3 = this.f39721c;
        r40 r40Var = this.f39722d;
        StringBuilder sbJ = t.z.j("DebugPanelAdUnitFullData(name=", str, ", format=", str2, ", adUnitId=");
        sbJ.append(str3);
        sbJ.append(", mediation=");
        sbJ.append(r40Var);
        sbJ.append(")");
        return sbJ.toString();
    }
}
