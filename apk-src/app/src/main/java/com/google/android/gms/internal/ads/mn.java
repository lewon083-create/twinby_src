package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7936h;
    public final x41 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x41 f7937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x41 f7938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x41 f7939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x41 f7940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x41 f7943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xl f7944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x41 f7945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x41 f7946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f7947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final w51 f7948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d51 f7949v;

    static {
        new mn(new rm(0));
        String str = cq0.f4293a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
    }

    public mn(rm rmVar) {
        this.f7929a = rmVar.f9964a;
        this.f7930b = rmVar.f9965b;
        this.f7931c = rmVar.f9966c;
        this.f7932d = rmVar.f9967d;
        this.f7933e = rmVar.f9968e;
        this.f7934f = rmVar.f9969f;
        this.f7935g = rmVar.f9970g;
        this.f7936h = rmVar.f9971h;
        this.i = (x41) rmVar.f9976n;
        this.f7937j = (x41) rmVar.f9977o;
        this.f7938k = (x41) rmVar.f9978p;
        this.f7939l = (x41) rmVar.f9979q;
        this.f7941n = rmVar.i;
        this.f7940m = (x41) rmVar.f9980r;
        this.f7942o = rmVar.f9972j;
        this.f7943p = (x41) rmVar.f9981s;
        this.f7944q = (xl) rmVar.f9984v;
        this.f7945r = (x41) rmVar.f9982t;
        this.f7947t = rmVar.f9973k;
        this.f7946s = (x41) rmVar.f9983u;
        this.f7948u = w51.a(rmVar.f9974l);
        this.f7949v = d51.r(rmVar.f9975m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mn mnVar = (mn) obj;
        if (this.f7929a != mnVar.f7929a || this.f7930b != mnVar.f7930b || this.f7931c != mnVar.f7931c || this.f7932d != mnVar.f7932d || this.f7936h != mnVar.f7936h || this.f7933e != mnVar.f7933e || this.f7934f != mnVar.f7934f || this.f7935g != mnVar.f7935g || !this.i.equals(mnVar.i) || !this.f7937j.equals(mnVar.f7937j) || !this.f7938k.equals(mnVar.f7938k) || !this.f7939l.equals(mnVar.f7939l) || this.f7941n != mnVar.f7941n || !this.f7940m.equals(mnVar.f7940m) || this.f7942o != mnVar.f7942o || !this.f7943p.equals(mnVar.f7943p) || !this.f7944q.equals(mnVar.f7944q) || !this.f7946s.equals(mnVar.f7946s) || !this.f7945r.equals(mnVar.f7945r) || this.f7947t != mnVar.f7947t) {
            return false;
        }
        w51 w51Var = mnVar.f7948u;
        w51 w51Var2 = this.f7948u;
        w51Var2.getClass();
        return gr.I(w51Var, w51Var2) && this.f7949v.equals(mnVar.f7949v);
    }

    public int hashCode() {
        return this.f7949v.hashCode() + ((this.f7948u.hashCode() + ((this.f7946s.hashCode() + ((((this.f7945r.hashCode() + ((((this.f7943p.hashCode() + ((((this.f7940m.hashCode() + ((((this.f7939l.hashCode() + ((this.f7938k.hashCode() + ((this.f7937j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.f7929a + 31) * 31) + this.f7930b) * 31) + this.f7931c) * 31) + this.f7932d) * 28629151) + (this.f7936h ? 1 : 0)) * 31) + this.f7933e) * 31) + this.f7934f) * 31) + (this.f7935g ? 1 : 0)) * 31)) * 31)) * 31)) * VKApiCodes.CODE_CALL_LINK_OUTDATED)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + this.f7941n) * 31)) * 31) + this.f7942o) * 31)) * 31) + 29791) * VKApiCodes.CODE_CALL_LINK_OUTDATED)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (this.f7947t ? 1 : 0)) * 31)) * 887503681)) * 31);
    }
}
