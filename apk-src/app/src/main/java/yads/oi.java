package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f41542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kf1 f41543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f41545f;

    public oi(String str, String str2, Object obj, kf1 kf1Var, boolean z5, boolean z10) {
        this.f41540a = str;
        this.f41541b = str2;
        this.f41542c = obj;
        this.f41543d = kf1Var;
        this.f41544e = z5;
        this.f41545f = z10;
    }

    public final String b() {
        return this.f41540a;
    }

    public final Object c() {
        return this.f41542c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return Intrinsics.a(this.f41540a, oiVar.f41540a) && Intrinsics.a(this.f41541b, oiVar.f41541b) && Intrinsics.a(this.f41542c, oiVar.f41542c) && Intrinsics.a(this.f41543d, oiVar.f41543d) && this.f41544e == oiVar.f41544e && this.f41545f == oiVar.f41545f;
    }

    public final int hashCode() {
        int iA = k4.a(this.f41541b, this.f41540a.hashCode() * 31, 31);
        Object obj = this.f41542c;
        int iHashCode = (iA + (obj == null ? 0 : obj.hashCode())) * 31;
        kf1 kf1Var = this.f41543d;
        return Boolean.hashCode(this.f41545f) + ((Boolean.hashCode(this.f41544e) + ((iHashCode + (kf1Var != null ? kf1Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f41540a;
        String str2 = this.f41541b;
        Object obj = this.f41542c;
        kf1 kf1Var = this.f41543d;
        boolean z5 = this.f41544e;
        boolean z10 = this.f41545f;
        StringBuilder sbJ = t.z.j("Asset(name=", str, ", type=", str2, ", value=");
        sbJ.append(obj);
        sbJ.append(", link=");
        sbJ.append(kf1Var);
        sbJ.append(", isClickable=");
        sbJ.append(z5);
        sbJ.append(", isRequired=");
        sbJ.append(z10);
        sbJ.append(")");
        return sbJ.toString();
    }
}
