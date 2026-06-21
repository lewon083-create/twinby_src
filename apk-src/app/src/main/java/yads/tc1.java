package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43268d;

    public tc1(int i, int i10, String str, String str2) {
        this.f43265a = str;
        this.f43266b = str2;
        this.f43267c = i;
        this.f43268d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc1)) {
            return false;
        }
        tc1 tc1Var = (tc1) obj;
        return Intrinsics.a(this.f43265a, tc1Var.f43265a) && Intrinsics.a(this.f43266b, tc1Var.f43266b) && this.f43267c == tc1Var.f43267c && this.f43268d == tc1Var.f43268d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43268d) + qd3.a(this.f43267c, k4.a(this.f43266b, this.f43265a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f43265a;
        String str2 = this.f43266b;
        int i = this.f43267c;
        int i10 = this.f43268d;
        StringBuilder sbJ = t.z.j("InteractiveCreativeFile(html=", str, ", mimeType=", str2, ", height=");
        sbJ.append(i);
        sbJ.append(", width=");
        sbJ.append(i10);
        sbJ.append(")");
        return sbJ.toString();
    }
}
