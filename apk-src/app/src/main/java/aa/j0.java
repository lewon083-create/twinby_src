package aa;

import android.util.Pair;
import com.google.android.gms.internal.ads.gm;
import com.google.android.gms.internal.ads.wd0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends da.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd0 f607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f611f;

    public j0(i0 i0Var, boolean z5, int i, Boolean bool, wd0 wd0Var) {
        this.f606a = i0Var;
        this.f608c = z5;
        this.f609d = i;
        this.f611f = bool;
        this.f607b = wd0Var;
        p9.k.C.f31304k.getClass();
        this.f610e = System.currentTimeMillis();
    }

    @Override // da.a
    public final void a(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        p9.k kVar = p9.k.C;
        kVar.f31304k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f610e));
        int i = this.f609d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f611f));
        boolean z5 = this.f608c;
        hl.l.z(this.f607b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z5 ? CommonUrlParts.Values.FALSE_INTEGER : "1"));
        kVar.f31304k.getClass();
        this.f606a.b(z5, new k0(null, str, ((Long) gm.f5861h.r()).longValue() + System.currentTimeMillis(), i));
    }

    @Override // da.a
    public final void b(v7.f fVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        p9.k kVar = p9.k.C;
        kVar.f31304k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f610e));
        int i = this.f609d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f611f));
        boolean z5 = this.f608c;
        hl.l.z(this.f607b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z5 ? CommonUrlParts.Values.FALSE_INTEGER : "1"));
        kVar.f31304k.getClass();
        this.f606a.b(z5, new k0(fVar, "", ((Long) gm.f5861h.r()).longValue() + System.currentTimeMillis(), i));
    }
}
