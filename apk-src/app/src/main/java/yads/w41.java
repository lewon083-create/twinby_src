package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r13 f44277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f44278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44279g;

    public w41(int i, int i10, String str, String str2, r13 r13Var, boolean z5, String str3) {
        this.f44273a = i;
        this.f44274b = i10;
        this.f44275c = str;
        this.f44276d = str2;
        this.f44277e = r13Var;
        this.f44278f = z5;
        this.f44279g = str3;
    }

    public final int a() {
        return this.f44274b;
    }

    public final int b() {
        return this.f44273a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w41)) {
            return false;
        }
        w41 w41Var = (w41) obj;
        return this.f44273a == w41Var.f44273a && this.f44274b == w41Var.f44274b && Intrinsics.a(this.f44275c, w41Var.f44275c) && Intrinsics.a(this.f44276d, w41Var.f44276d) && Intrinsics.a(this.f44277e, w41Var.f44277e) && this.f44278f == w41Var.f44278f && Intrinsics.a(this.f44279g, w41Var.f44279g);
    }

    public final int hashCode() {
        int iA = k4.a(this.f44275c, qd3.a(this.f44274b, Integer.hashCode(this.f44273a) * 31, 31), 31);
        String str = this.f44276d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        r13 r13Var = this.f44277e;
        int iHashCode2 = (Boolean.hashCode(this.f44278f) + ((iHashCode + (r13Var == null ? 0 : r13Var.hashCode())) * 31)) * 31;
        String str2 = this.f44279g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f44273a;
        int i10 = this.f44274b;
        String str = this.f44275c;
        String str2 = this.f44276d;
        r13 r13Var = this.f44277e;
        boolean z5 = this.f44278f;
        String str3 = this.f44279g;
        StringBuilder sbI = t.z.i("ImageValue(width=", i, ", height=", i10, ", url=");
        l7.o.t(sbI, str, ", sizeType=", str2, ", smartCenterSettings=");
        sbI.append(r13Var);
        sbI.append(", preload=");
        sbI.append(z5);
        sbI.append(", preview=");
        return a0.u.o(sbI, str3, ")");
    }
}
