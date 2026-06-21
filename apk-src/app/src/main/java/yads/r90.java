package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42522c;

    public r90(String str, String str2, String str3) {
        super(0);
        this.f42520a = str;
        this.f42521b = str2;
        this.f42522c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return Intrinsics.a(this.f42520a, r90Var.f42520a) && Intrinsics.a(this.f42521b, r90Var.f42521b) && Intrinsics.a(this.f42522c, r90Var.f42522c);
    }

    public final int hashCode() {
        return this.f42522c.hashCode() + k4.a(this.f42521b, this.f42520a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f42520a;
        String str2 = this.f42521b;
        return a0.u.o(t.z.j("AdUnit(name=", str, ", format=", str2, ", id="), this.f42522c, ")");
    }
}
