package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h10 f44863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a10 f44864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a10 f44865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a10 f44866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o10 f44867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f44868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f44870h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f44871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Float f44872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f44873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f44874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f44875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f44876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f44877p;

    public y00(h10 h10Var, a10 a10Var, a10 a10Var2, a10 a10Var3, o10 o10Var, String str, String str2, String str3, String str4, String str5, Float f10, String str6, String str7, String str8, String str9, boolean z5) {
        this.f44863a = h10Var;
        this.f44864b = a10Var;
        this.f44865c = a10Var2;
        this.f44866d = a10Var3;
        this.f44867e = o10Var;
        this.f44868f = str;
        this.f44869g = str2;
        this.f44870h = str3;
        this.i = str4;
        this.f44871j = str5;
        this.f44872k = f10;
        this.f44873l = str6;
        this.f44874m = str7;
        this.f44875n = str8;
        this.f44876o = str9;
        this.f44877p = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return Intrinsics.a(this.f44863a, y00Var.f44863a) && Intrinsics.a(this.f44864b, y00Var.f44864b) && Intrinsics.a(this.f44865c, y00Var.f44865c) && Intrinsics.a(this.f44866d, y00Var.f44866d) && Intrinsics.a(this.f44867e, y00Var.f44867e) && Intrinsics.a(this.f44868f, y00Var.f44868f) && Intrinsics.a(this.f44869g, y00Var.f44869g) && Intrinsics.a(this.f44870h, y00Var.f44870h) && Intrinsics.a(this.i, y00Var.i) && Intrinsics.a(this.f44871j, y00Var.f44871j) && Intrinsics.a(this.f44872k, y00Var.f44872k) && Intrinsics.a(this.f44873l, y00Var.f44873l) && Intrinsics.a(this.f44874m, y00Var.f44874m) && Intrinsics.a(this.f44875n, y00Var.f44875n) && Intrinsics.a(this.f44876o, y00Var.f44876o) && this.f44877p == y00Var.f44877p;
    }

    public final int hashCode() {
        h10 h10Var = this.f44863a;
        int iHashCode = (h10Var == null ? 0 : Float.hashCode(h10Var.f38976a)) * 31;
        a10 a10Var = this.f44864b;
        int iHashCode2 = (iHashCode + (a10Var == null ? 0 : a10Var.hashCode())) * 31;
        a10 a10Var2 = this.f44865c;
        int iHashCode3 = (iHashCode2 + (a10Var2 == null ? 0 : a10Var2.hashCode())) * 31;
        a10 a10Var3 = this.f44866d;
        int iHashCode4 = (iHashCode3 + (a10Var3 == null ? 0 : a10Var3.hashCode())) * 31;
        o10 o10Var = this.f44867e;
        int iHashCode5 = (iHashCode4 + (o10Var == null ? 0 : o10Var.hashCode())) * 31;
        String str = this.f44868f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f44869g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f44870h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f44871j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f10 = this.f44872k;
        int iHashCode11 = (iHashCode10 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str6 = this.f44873l;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f44874m;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f44875n;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f44876o;
        return Boolean.hashCode(this.f44877p) + ((iHashCode14 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        h10 h10Var = this.f44863a;
        a10 a10Var = this.f44864b;
        a10 a10Var2 = this.f44865c;
        a10 a10Var3 = this.f44866d;
        o10 o10Var = this.f44867e;
        String str = this.f44868f;
        String str2 = this.f44869g;
        String str3 = this.f44870h;
        String str4 = this.i;
        String str5 = this.f44871j;
        Float f10 = this.f44872k;
        String str6 = this.f44873l;
        String str7 = this.f44874m;
        String str8 = this.f44875n;
        String str9 = this.f44876o;
        boolean z5 = this.f44877p;
        StringBuilder sb2 = new StringBuilder("CoreNativeAdAssets(media=");
        sb2.append(h10Var);
        sb2.append(", favicon=");
        sb2.append(a10Var);
        sb2.append(", icon=");
        sb2.append(a10Var2);
        sb2.append(", image=");
        sb2.append(a10Var3);
        sb2.append(", closeButton=");
        sb2.append(o10Var);
        sb2.append(", age=");
        sb2.append(str);
        sb2.append(", body=");
        l7.o.t(sb2, str2, ", callToAction=", str3, ", domain=");
        l7.o.t(sb2, str4, ", price=", str5, ", rating=");
        sb2.append(f10);
        sb2.append(", reviewCount=");
        sb2.append(str6);
        sb2.append(", sponsored=");
        l7.o.t(sb2, str7, ", title=", str8, ", warning=");
        sb2.append(str9);
        sb2.append(", feedbackAvailable=");
        sb2.append(z5);
        sb2.append(")");
        return sb2.toString();
    }
}
