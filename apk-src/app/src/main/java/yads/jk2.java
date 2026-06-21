package yads;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jk2 extends mo implements ck2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hm1 f39886h;
    public final bm1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o30 f39887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ak2 f39888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tk0 f39889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ae0 f39890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f39891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39892o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f39893p = -9223372036854775807L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f39894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u83 f39896s;

    public jk2(hm1 hm1Var, o30 o30Var, ak2 ak2Var, tk0 tk0Var, ae0 ae0Var, int i) {
        this.i = (bm1) ni.a(hm1Var.f39245c);
        this.f39886h = hm1Var;
        this.f39887j = o30Var;
        this.f39888k = ak2Var;
        this.f39889l = tk0Var;
        this.f39890m = ae0Var;
        this.f39891n = i;
    }

    @Override // yads.mo
    public final rm1 a(an1 an1Var, qe qeVar, long j10) {
        p30 p30VarCreateDataSource = this.f39887j.createDataSource();
        u83 u83Var = this.f39896s;
        if (u83Var != null) {
            p30VarCreateDataSource.a(u83Var);
        }
        Uri uri = this.i.f37092a;
        ak2 ak2Var = this.f39888k;
        af2 af2Var = this.f40979g;
        if (af2Var != null) {
            return new gk2(uri, p30VarCreateDataSource, ik2.a((sq0) ((yi.f0) ak2Var).f45657c, af2Var), this.f39889l, a(an1Var), this.f39890m, b(an1Var), this, qeVar, this.i.f37096e, this.f39891n);
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final hm1 c() {
        return this.f39886h;
    }

    @Override // yads.mo
    public final void e() {
        this.f39889l.release();
    }

    @Override // yads.mo
    public final void a(u83 u83Var) {
        this.f39896s = u83Var;
        this.f39889l.prepare();
        tk0 tk0Var = this.f39889l;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        af2 af2Var = this.f40979g;
        if (af2Var != null) {
            tk0Var.a(looperMyLooper, af2Var);
            long j10 = this.f39893p;
            sz2 sz2Var = new sz2(j10, j10, this.f39894q, this.f39895r, this.f39886h);
            v63 hk2Var = sz2Var;
            if (this.f39892o) {
                hk2Var = new hk2(sz2Var);
            }
            a(hk2Var);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final void d() {
    }

    @Override // yads.mo
    public final void a(rm1 rm1Var) {
        gk2 gk2Var = (gk2) rm1Var;
        if (gk2Var.f38807w) {
            for (os2 os2Var : gk2Var.f38804t) {
                os2Var.a();
                os2Var.d();
            }
        }
        gk2Var.f38796l.a(gk2Var);
        gk2Var.f38801q.removeCallbacksAndMessages(null);
        gk2Var.f38802r = null;
        gk2Var.M = true;
    }
}
