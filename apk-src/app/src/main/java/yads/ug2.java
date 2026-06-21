package yads;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ug2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f43652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f43653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bb0 f43654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f43655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f43656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f43657h;
    public final String i;

    public ug2(String str, String str2, Map map, Integer num, bb0 bb0Var, List list, List list2, String str3, String str4) {
        this.f43650a = str;
        this.f43651b = str2;
        this.f43652c = map;
        this.f43653d = num;
        this.f43654e = bb0Var;
        this.f43655f = list;
        this.f43656g = list2;
        this.f43657h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug2)) {
            return false;
        }
        ug2 ug2Var = (ug2) obj;
        return Intrinsics.a(this.f43650a, ug2Var.f43650a) && Intrinsics.a(this.f43651b, ug2Var.f43651b) && Intrinsics.a(this.f43652c, ug2Var.f43652c) && Intrinsics.a(this.f43653d, ug2Var.f43653d) && this.f43654e == ug2Var.f43654e && Intrinsics.a(this.f43655f, ug2Var.f43655f) && Intrinsics.a(this.f43656g, ug2Var.f43656g) && Intrinsics.a(this.f43657h, ug2Var.f43657h) && Intrinsics.a(this.i, ug2Var.i);
    }

    public final int hashCode() {
        int iA = k4.a(this.f43651b, this.f43650a.hashCode() * 31, 31);
        Map map = this.f43652c;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f43653d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        bb0 bb0Var = this.f43654e;
        int iHashCode3 = (iHashCode2 + (bb0Var == null ? 0 : bb0Var.hashCode())) * 31;
        List list = this.f43655f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f43656g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f43657h;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f43650a;
        String str2 = this.f43651b;
        Map map = this.f43652c;
        Integer num = this.f43653d;
        bb0 bb0Var = this.f43654e;
        List list = this.f43655f;
        List list2 = this.f43656g;
        String str3 = this.f43657h;
        String str4 = this.i;
        StringBuilder sbJ = t.z.j("PreferredPackage(packageName=", str, ", url=", str2, ", extras=");
        sbJ.append(map);
        sbJ.append(", flags=");
        sbJ.append(num);
        sbJ.append(", launchMode=");
        sbJ.append(bb0Var);
        sbJ.append(", trackingUrls=");
        sbJ.append(list);
        sbJ.append(", fallbackTrackingUrls=");
        sbJ.append(list2);
        sbJ.append(", deeplinkType=");
        sbJ.append(str3);
        sbJ.append(", className=");
        return a0.u.o(sbJ, str4, ")");
    }
}
