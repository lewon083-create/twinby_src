package yads;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Location f38681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f38682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f38683h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ip2 f38684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f38685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f38686l;

    public g9(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, String str6, ip2 ip2Var, boolean z5, String str7) {
        this.f38676a = str;
        this.f38677b = str2;
        this.f38678c = str3;
        this.f38679d = str4;
        this.f38680e = list;
        this.f38681f = location;
        this.f38682g = map;
        this.f38683h = str5;
        this.i = str6;
        this.f38684j = ip2Var;
        this.f38685k = z5;
        this.f38686l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return Intrinsics.a(this.f38676a, g9Var.f38676a) && Intrinsics.a(this.f38677b, g9Var.f38677b) && Intrinsics.a(this.f38678c, g9Var.f38678c) && Intrinsics.a(this.f38679d, g9Var.f38679d) && Intrinsics.a(this.f38680e, g9Var.f38680e) && Intrinsics.a(this.f38681f, g9Var.f38681f) && Intrinsics.a(this.f38682g, g9Var.f38682g) && Intrinsics.a(this.f38683h, g9Var.f38683h) && Intrinsics.a(this.i, g9Var.i) && this.f38684j == g9Var.f38684j && this.f38685k == g9Var.f38685k && Intrinsics.a(this.f38686l, g9Var.f38686l);
    }

    public final int hashCode() {
        int iHashCode = this.f38676a.hashCode() * 31;
        String str = this.f38677b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f38678c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38679d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f38680e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Location location = this.f38681f;
        int iHashCode6 = (iHashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Map map = this.f38682g;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.f38683h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ip2 ip2Var = this.f38684j;
        int iHashCode10 = (Boolean.hashCode(this.f38685k) + ((iHashCode9 + (ip2Var == null ? 0 : ip2Var.hashCode())) * 31)) * 31;
        String str6 = this.f38686l;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f38676a;
        String str2 = this.f38677b;
        String str3 = this.f38678c;
        String str4 = this.f38679d;
        List list = this.f38680e;
        Location location = this.f38681f;
        Map map = this.f38682g;
        String str5 = this.f38683h;
        String str6 = this.i;
        ip2 ip2Var = this.f38684j;
        boolean z5 = this.f38685k;
        String str7 = this.f38686l;
        StringBuilder sbJ = t.z.j("AdRequestData(adUnitId=", str, ", age=", str2, ", gender=");
        l7.o.t(sbJ, str3, ", contextQuery=", str4, ", contextTags=");
        sbJ.append(list);
        sbJ.append(", location=");
        sbJ.append(location);
        sbJ.append(", parameters=");
        sbJ.append(map);
        sbJ.append(", openBiddingData=");
        sbJ.append(str5);
        sbJ.append(", readyResponse=");
        sbJ.append(str6);
        sbJ.append(", preferredTheme=");
        sbJ.append(ip2Var);
        sbJ.append(", shouldLoadImagesAutomatically=");
        sbJ.append(z5);
        sbJ.append(", preloadType=");
        sbJ.append(str7);
        sbJ.append(")");
        return sbJ.toString();
    }
}
