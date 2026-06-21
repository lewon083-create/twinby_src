package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39428c;

    public i40(String str, String str2, String str3) {
        this.f39426a = str;
        this.f39427b = str2;
        this.f39428c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i40)) {
            return false;
        }
        i40 i40Var = (i40) obj;
        return Intrinsics.a(this.f39426a, i40Var.f39426a) && Intrinsics.a(this.f39427b, i40Var.f39427b) && Intrinsics.a(this.f39428c, i40Var.f39428c);
    }

    public final int hashCode() {
        return this.f39428c.hashCode() + k4.a(this.f39427b, this.f39426a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f39426a;
        String str2 = this.f39427b;
        return a0.u.o(t.z.j("DebugPanelAdUnitData(name=", str, ", format=", str2, ", adUnitId="), this.f39428c, ")");
    }
}
