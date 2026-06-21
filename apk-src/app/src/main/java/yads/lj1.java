package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj1 f40561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj1 f40562b;

    public lj1(mj1 mj1Var, mj1 mj1Var2) {
        this.f40561a = mj1Var;
        this.f40562b = mj1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj1)) {
            return false;
        }
        lj1 lj1Var = (lj1) obj;
        return Intrinsics.a(this.f40561a, lj1Var.f40561a) && Intrinsics.a(this.f40562b, lj1Var.f40562b);
    }

    public final int hashCode() {
        return this.f40562b.hashCode() + (this.f40561a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.f40561a + ", height=" + this.f40562b + ")";
    }
}
