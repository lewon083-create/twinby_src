package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sy2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ty2 f43132d;

    public sy2(int i, long j10, ty2 ty2Var, String str) {
        this.f43129a = j10;
        this.f43130b = str;
        this.f43131c = i;
        this.f43132d = ty2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy2)) {
            return false;
        }
        sy2 sy2Var = (sy2) obj;
        return this.f43129a == sy2Var.f43129a && Intrinsics.a(this.f43130b, sy2Var.f43130b) && this.f43131c == sy2Var.f43131c && this.f43132d == sy2Var.f43132d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f43129a) * 31;
        String str = this.f43130b;
        return this.f43132d.hashCode() + qd3.a(this.f43131c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowNotice(delay=" + this.f43129a + ", url=" + this.f43130b + ", visibilityPercent=" + this.f43131c + ", type=" + this.f43132d + ")";
    }
}
