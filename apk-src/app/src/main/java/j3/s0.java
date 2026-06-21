package j3;

import ad.g1;
import com.google.android.gms.internal.ads.rm;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26372h;
    public final ad.j0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ad.j0 f26373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ad.j0 f26374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ad.j0 f26375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ad.j0 f26376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f26377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f26378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ad.j0 f26379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f26380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ad.j0 f26381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ad.j0 f26382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f26383t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g1 f26384u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ad.o0 f26385v;

    static {
        new s0(new rm(1));
        m3.z.G(1);
        m3.z.G(2);
        m3.z.G(3);
        m3.z.G(4);
        gf.a.o(5, 6, 7, 8, 9);
        gf.a.o(10, 11, 12, 13, 14);
        gf.a.o(15, 16, 17, 18, 19);
        gf.a.o(20, 21, 22, 23, 24);
        gf.a.o(25, 26, 27, 28, 29);
        gf.a.o(30, 31, 32, 33, 34);
        m3.z.G(35);
        m3.z.G(36);
        m3.z.G(37);
        m3.z.G(38);
    }

    public s0(rm rmVar) {
        this.f26365a = rmVar.f9964a;
        this.f26366b = rmVar.f9965b;
        this.f26367c = rmVar.f9966c;
        this.f26368d = rmVar.f9967d;
        this.f26369e = rmVar.f9968e;
        this.f26370f = rmVar.f9969f;
        this.f26371g = rmVar.f9970g;
        this.f26372h = rmVar.f9971h;
        this.i = (ad.j0) rmVar.f9976n;
        this.f26373j = (ad.j0) rmVar.f9977o;
        this.f26374k = (ad.j0) rmVar.f9978p;
        this.f26375l = (ad.j0) rmVar.f9979q;
        this.f26377n = rmVar.i;
        this.f26376m = (ad.j0) rmVar.f9980r;
        this.f26378o = rmVar.f9972j;
        this.f26379p = (ad.j0) rmVar.f9981s;
        this.f26380q = (r0) rmVar.f9982t;
        this.f26381r = (ad.j0) rmVar.f9983u;
        this.f26383t = rmVar.f9973k;
        this.f26382s = (ad.j0) rmVar.f9984v;
        this.f26384u = g1.a(rmVar.f9974l);
        this.f26385v = ad.o0.r(rmVar.f9975m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f26365a != s0Var.f26365a || this.f26366b != s0Var.f26366b || this.f26367c != s0Var.f26367c || this.f26368d != s0Var.f26368d || this.f26372h != s0Var.f26372h || this.f26369e != s0Var.f26369e || this.f26370f != s0Var.f26370f || this.f26371g != s0Var.f26371g || !this.i.equals(s0Var.i) || !this.f26373j.equals(s0Var.f26373j) || !this.f26374k.equals(s0Var.f26374k) || !this.f26375l.equals(s0Var.f26375l) || this.f26377n != s0Var.f26377n || !this.f26376m.equals(s0Var.f26376m) || this.f26378o != s0Var.f26378o || !this.f26379p.equals(s0Var.f26379p) || !this.f26380q.equals(s0Var.f26380q) || !this.f26382s.equals(s0Var.f26382s) || !this.f26381r.equals(s0Var.f26381r) || this.f26383t != s0Var.f26383t) {
            return false;
        }
        g1 g1Var = s0Var.f26384u;
        g1 g1Var2 = this.f26384u;
        g1Var2.getClass();
        return ad.q.f(g1Var, g1Var2) && this.f26385v.equals(s0Var.f26385v);
    }

    public int hashCode() {
        int iHashCode = (this.f26379p.hashCode() + ((((this.f26376m.hashCode() + ((((this.f26375l.hashCode() + ((this.f26374k.hashCode() + ((this.f26373j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.f26365a + 31) * 31) + this.f26366b) * 31) + this.f26367c) * 31) + this.f26368d) * 28629151) + (this.f26372h ? 1 : 0)) * 31) + this.f26369e) * 31) + this.f26370f) * 31) + (this.f26371g ? 1 : 0)) * 31)) * 31)) * 31)) * VKApiCodes.CODE_CALL_LINK_OUTDATED)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + this.f26377n) * 31)) * 31) + this.f26378o) * 31)) * 31;
        this.f26380q.getClass();
        return this.f26385v.hashCode() + ((this.f26384u.hashCode() + ((this.f26382s.hashCode() + ((((this.f26381r.hashCode() + ((iHashCode + 29791) * VKApiCodes.CODE_CALL_LINK_OUTDATED)) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (this.f26383t ? 1 : 0)) * 31)) * 887503681)) * 31);
    }
}
