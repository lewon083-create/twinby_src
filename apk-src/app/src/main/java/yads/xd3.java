package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xd3 implements yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f44650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f44651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ge3 f44652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f44654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f44656h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rl3 f44657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f44658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f44659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lp3 f44660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f44661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f44662o;

    public xd3(boolean z5, ArrayList arrayList, LinkedHashMap linkedHashMap, ge3 ge3Var, String str, String str2, String str3, String str4, String str5, rl3 rl3Var, Integer num, String str6, lp3 lp3Var, ArrayList arrayList2, Map map) {
        this.f44649a = z5;
        this.f44650b = arrayList;
        this.f44651c = linkedHashMap;
        this.f44652d = ge3Var;
        this.f44653e = str;
        this.f44654f = str2;
        this.f44655g = str3;
        this.f44656h = str4;
        this.i = str5;
        this.f44657j = rl3Var;
        this.f44658k = num;
        this.f44659l = str6;
        this.f44660m = lp3Var;
        this.f44661n = arrayList2;
        this.f44662o = map;
    }

    @Override // yads.yj3
    public final Map a() {
        return this.f44662o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd3)) {
            return false;
        }
        xd3 xd3Var = (xd3) obj;
        return this.f44649a == xd3Var.f44649a && Intrinsics.a(this.f44650b, xd3Var.f44650b) && Intrinsics.a(this.f44651c, xd3Var.f44651c) && Intrinsics.a(this.f44652d, xd3Var.f44652d) && Intrinsics.a(this.f44653e, xd3Var.f44653e) && Intrinsics.a(this.f44654f, xd3Var.f44654f) && Intrinsics.a(this.f44655g, xd3Var.f44655g) && Intrinsics.a(this.f44656h, xd3Var.f44656h) && Intrinsics.a(this.i, xd3Var.i) && Intrinsics.a(this.f44657j, xd3Var.f44657j) && Intrinsics.a(this.f44658k, xd3Var.f44658k) && Intrinsics.a(this.f44659l, xd3Var.f44659l) && Intrinsics.a(this.f44660m, xd3Var.f44660m) && Intrinsics.a(this.f44661n, xd3Var.f44661n) && Intrinsics.a(this.f44662o, xd3Var.f44662o);
    }

    public final int hashCode() {
        int iHashCode = (this.f44652d.hashCode() + ((this.f44651c.hashCode() + eb.a(this.f44650b, Boolean.hashCode(this.f44649a) * 31, 31)) * 31)) * 31;
        String str = this.f44653e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f44654f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f44655g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f44656h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        rl3 rl3Var = this.f44657j;
        int iHashCode7 = (iHashCode6 + (rl3Var == null ? 0 : rl3Var.f42631a.hashCode())) * 31;
        Integer num = this.f44658k;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.f44659l;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        lp3 lp3Var = this.f44660m;
        return this.f44662o.hashCode() + eb.a(this.f44661n, (iHashCode9 + (lp3Var != null ? lp3Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        boolean z5 = this.f44649a;
        List list = this.f44650b;
        Map map = this.f44651c;
        ge3 ge3Var = this.f44652d;
        String str = this.f44653e;
        String str2 = this.f44654f;
        String str3 = this.f44655g;
        String str4 = this.f44656h;
        String str5 = this.i;
        rl3 rl3Var = this.f44657j;
        Integer num = this.f44658k;
        String str6 = this.f44659l;
        lp3 lp3Var = this.f44660m;
        List list2 = this.f44661n;
        Map map2 = this.f44662o;
        StringBuilder sb2 = new StringBuilder("VideoAd(isWrapper=");
        sb2.append(z5);
        sb2.append(", creatives=");
        sb2.append(list);
        sb2.append(", rawTrackingEvents=");
        sb2.append(map);
        sb2.append(", videoAdExtensions=");
        sb2.append(ge3Var);
        sb2.append(", adSystem=");
        l7.o.t(sb2, str, ", adTitle=", str2, ", description=");
        l7.o.t(sb2, str3, ", survey=", str4, ", vastAdTagUri=");
        sb2.append(str5);
        sb2.append(", viewableImpression=");
        sb2.append(rl3Var);
        sb2.append(", sequence=");
        pe.a.r(num, ", id=", str6, ", wrapperConfiguration=", sb2);
        sb2.append(lp3Var);
        sb2.append(", adVerifications=");
        sb2.append(list2);
        sb2.append(", trackingEvents=");
        sb2.append(map2);
        sb2.append(")");
        return sb2.toString();
    }
}
