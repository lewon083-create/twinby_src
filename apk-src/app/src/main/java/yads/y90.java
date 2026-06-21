package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x80 f44957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q50 f44958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f44960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f44962h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c50 f44963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f44964k;

    public y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6) {
        super(0);
        this.f44955a = str;
        this.f44956b = str2;
        this.f44957c = x80Var;
        this.f44958d = q50Var;
        this.f44959e = str3;
        this.f44960f = str4;
        this.f44961g = str5;
        this.f44962h = list;
        this.i = list2;
        this.f44963j = c50Var;
        this.f44964k = str6;
    }

    public final String a() {
        return this.f44960f;
    }

    public final List b() {
        return this.i;
    }

    public final String c() {
        return this.f44955a;
    }

    public final String d() {
        return this.f44961g;
    }

    public final List e() {
        return this.f44962h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        return Intrinsics.a(this.f44955a, y90Var.f44955a) && Intrinsics.a(this.f44956b, y90Var.f44956b) && Intrinsics.a(this.f44957c, y90Var.f44957c) && Intrinsics.a(this.f44958d, y90Var.f44958d) && Intrinsics.a(this.f44959e, y90Var.f44959e) && Intrinsics.a(this.f44960f, y90Var.f44960f) && Intrinsics.a(this.f44961g, y90Var.f44961g) && Intrinsics.a(this.f44962h, y90Var.f44962h) && Intrinsics.a(this.i, y90Var.i) && this.f44963j == y90Var.f44963j && Intrinsics.a(this.f44964k, y90Var.f44964k);
    }

    public final c50 f() {
        return this.f44963j;
    }

    public final int hashCode() {
        int iHashCode = this.f44955a.hashCode() * 31;
        String str = this.f44956b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        x80 x80Var = this.f44957c;
        int iHashCode3 = (this.f44958d.hashCode() + ((iHashCode2 + (x80Var == null ? 0 : x80Var.hashCode())) * 31)) * 31;
        String str2 = this.f44959e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f44960f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f44961g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f44962h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int iHashCode8 = (this.f44963j.hashCode() + ((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str5 = this.f44964k;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f44955a;
        String str2 = this.f44956b;
        x80 x80Var = this.f44957c;
        q50 q50Var = this.f44958d;
        String str3 = this.f44959e;
        String str4 = this.f44960f;
        String str5 = this.f44961g;
        List list = this.f44962h;
        List list2 = this.i;
        c50 c50Var = this.f44963j;
        String str6 = this.f44964k;
        StringBuilder sbJ = t.z.j("MediationAdapter(name=", str, ", logoUrl=", str2, ", infoFirst=");
        sbJ.append(x80Var);
        sbJ.append(", infoSecond=");
        sbJ.append(q50Var);
        sbJ.append(", waringMessage=");
        l7.o.t(sbJ, str3, ", adUnitId=", str4, ", networkAdUnitIdName=");
        sbJ.append(str5);
        sbJ.append(", parameters=");
        sbJ.append(list);
        sbJ.append(", cpmFloors=");
        sbJ.append(list2);
        sbJ.append(", type=");
        sbJ.append(c50Var);
        sbJ.append(", sdk=");
        return a0.u.o(sbJ, str6, ")");
    }

    public /* synthetic */ y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6, int i) {
        this(str, str2, x80Var, q50Var, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? c50.f37293e : c50Var, (i & 1024) != 0 ? null : str6);
    }
}
