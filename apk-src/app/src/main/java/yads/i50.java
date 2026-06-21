package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h50 f39441c;

    public i50(String str, String str2, h50 h50Var) {
        this.f39439a = str;
        this.f39440b = str2;
        this.f39441c = h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return Intrinsics.a(this.f39439a, i50Var.f39439a) && Intrinsics.a(this.f39440b, i50Var.f39440b) && this.f39441c == i50Var.f39441c;
    }

    public final int hashCode() {
        String str = this.f39439a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39440b;
        return this.f39441c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f39439a;
        String str2 = this.f39440b;
        h50 h50Var = this.f39441c;
        StringBuilder sbJ = t.z.j("DebugPanelAlertData(title=", str, ", message=", str2, ", type=");
        sbJ.append(h50Var);
        sbJ.append(")");
        return sbJ.toString();
    }
}
