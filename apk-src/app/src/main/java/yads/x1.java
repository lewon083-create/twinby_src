package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f44562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f44563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9 f44564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nu2 f44565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y02 f44566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qf0 f44568g;

    public x1(v9 v9Var, d4 d4Var, z9 z9Var, nu2 nu2Var, y02 y02Var, int i, qf0 qf0Var) {
        this.f44562a = v9Var;
        this.f44563b = d4Var;
        this.f44564c = z9Var;
        this.f44565d = nu2Var;
        this.f44566e = y02Var;
        this.f44567f = i;
        this.f44568g = qf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.a(this.f44562a, x1Var.f44562a) && Intrinsics.a(this.f44563b, x1Var.f44563b) && Intrinsics.a(this.f44564c, x1Var.f44564c) && Intrinsics.a(this.f44565d, x1Var.f44565d) && Intrinsics.a(this.f44566e, x1Var.f44566e) && this.f44567f == x1Var.f44567f && Intrinsics.a(this.f44568g, x1Var.f44568g);
    }

    public final int hashCode() {
        int iHashCode = (this.f44565d.hashCode() + ((this.f44564c.hashCode() + ((this.f44563b.hashCode() + (this.f44562a.hashCode() * 31)) * 31)) * 31)) * 31;
        y02 y02Var = this.f44566e;
        int iA = qd3.a(this.f44567f, (iHashCode + (y02Var == null ? 0 : y02Var.hashCode())) * 31, 31);
        qf0 qf0Var = this.f44568g;
        return iA + (qf0Var != null ? qf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdActivityData(adResponse=" + this.f44562a + ", adConfiguration=" + this.f44563b + ", adResultReceiver=" + this.f44564c + ", sdkEnvironmentModule=" + this.f44565d + ", nativeAd=" + this.f44566e + ", requestedOrientation=" + this.f44567f + ", delegatedActivityLaunchInfo=" + this.f44568g + ")";
    }

    public /* synthetic */ x1(v9 v9Var, d4 d4Var, z9 z9Var, nu2 nu2Var, y02 y02Var, int i, qf0 qf0Var, int i10) {
        this(v9Var, d4Var, z9Var, nu2Var, (i10 & 16) != 0 ? null : y02Var, (i10 & 32) != 0 ? 0 : i, (i10 & 64) != 0 ? null : qf0Var);
    }
}
