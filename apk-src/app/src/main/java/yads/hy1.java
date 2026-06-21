package yads;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eq2 f39363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f39364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kf1 f39367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j5 f39368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f39369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f39370h;
    public final gc i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f39371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f39372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f39373l;

    public hy1(eq2 eq2Var, List list, String str, String str2, kf1 kf1Var, j5 j5Var, List list2, List list3, gc gcVar, String str3, String str4, Map map) {
        this.f39363a = eq2Var;
        this.f39364b = list;
        this.f39365c = str;
        this.f39366d = str2;
        this.f39367e = kf1Var;
        this.f39368f = j5Var;
        this.f39369g = list2;
        this.f39370h = list3;
        this.i = gcVar;
        this.f39371j = str3;
        this.f39372k = str4;
        this.f39373l = map;
    }

    public final kf1 a() {
        return this.f39367e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy1)) {
            return false;
        }
        hy1 hy1Var = (hy1) obj;
        return this.f39363a == hy1Var.f39363a && Intrinsics.a(this.f39364b, hy1Var.f39364b) && Intrinsics.a(this.f39365c, hy1Var.f39365c) && Intrinsics.a(this.f39366d, hy1Var.f39366d) && Intrinsics.a(this.f39367e, hy1Var.f39367e) && Intrinsics.a(this.f39368f, hy1Var.f39368f) && Intrinsics.a(this.f39369g, hy1Var.f39369g) && Intrinsics.a(this.f39370h, hy1Var.f39370h) && Intrinsics.a(this.i, hy1Var.i) && Intrinsics.a(this.f39371j, hy1Var.f39371j) && Intrinsics.a(this.f39372k, hy1Var.f39372k) && Intrinsics.a(this.f39373l, hy1Var.f39373l);
    }

    public final int hashCode() {
        int iA = eb.a(this.f39364b, this.f39363a.hashCode() * 31, 31);
        String str = this.f39365c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39366d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        kf1 kf1Var = this.f39367e;
        int iHashCode3 = (iHashCode2 + (kf1Var == null ? 0 : kf1Var.hashCode())) * 31;
        j5 j5Var = this.f39368f;
        int iA2 = eb.a(this.f39370h, eb.a(this.f39369g, (iHashCode3 + (j5Var == null ? 0 : j5Var.f39727b.hashCode())) * 31, 31), 31);
        gc gcVar = this.i;
        int iHashCode4 = (iA2 + (gcVar == null ? 0 : gcVar.hashCode())) * 31;
        String str3 = this.f39371j;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39372k;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map map = this.f39373l;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        eq2 eq2Var = this.f39363a;
        List list = this.f39364b;
        String str = this.f39365c;
        String str2 = this.f39366d;
        kf1 kf1Var = this.f39367e;
        j5 j5Var = this.f39368f;
        List list2 = this.f39369g;
        List list3 = this.f39370h;
        gc gcVar = this.i;
        String str3 = this.f39371j;
        String str4 = this.f39372k;
        Map map = this.f39373l;
        StringBuilder sb2 = new StringBuilder("Native(responseNativeType=");
        sb2.append(eq2Var);
        sb2.append(", assets=");
        sb2.append(list);
        sb2.append(", adId=");
        l7.o.t(sb2, str, ", info=", str2, ", link=");
        sb2.append(kf1Var);
        sb2.append(", impressionData=");
        sb2.append(j5Var);
        sb2.append(", renderTrackingUrls=");
        gf.a.u(sb2, list2, ", showNotices=", list3, ", additionalInfo=");
        sb2.append(gcVar);
        sb2.append(", creativeId=");
        sb2.append(str3);
        sb2.append(", campaignId=");
        sb2.append(str4);
        sb2.append(", analyticsParameters=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
