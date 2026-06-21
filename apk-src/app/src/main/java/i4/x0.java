package i4;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends a {
    public final p3.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final he.e f21059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x3.h f21060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final le.a f21061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f21062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j3.o f21063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21064o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f21065p = -9223372036854775807L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p3.e0 f21069t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j3.x f21070u;

    public x0(j3.x xVar, p3.g gVar, he.e eVar, x3.h hVar, le.a aVar, int i, j3.o oVar) {
        this.f21070u = xVar;
        this.i = gVar;
        this.f21059j = eVar;
        this.f21060k = hVar;
        this.f21061l = aVar;
        this.f21062m = i;
        this.f21063n = oVar;
    }

    @Override // i4.a
    public final a0 b(c0 c0Var, bb.e eVar, long j10) {
        p3.h hVarCreateDataSource = this.i.createDataSource();
        p3.e0 e0Var = this.f21069t;
        if (e0Var != null) {
            hVarCreateDataSource.addTransferListener(e0Var);
        }
        j3.u uVar = j().f26407b;
        uVar.getClass();
        Uri uri = uVar.f26396a;
        this.f20832h.getClass();
        return new v0(uri, hVarCreateDataSource, new bb.e((q4.n) this.f21059j.f20503c), this.f21060k, new i0(this.f20829e.f20928c, 0, c0Var), this.f21061l, a(c0Var), this, eVar, this.f21062m, this.f21063n, m3.z.M(uVar.f26400e), null);
    }

    @Override // i4.a
    public final synchronized j3.x j() {
        return this.f21070u;
    }

    @Override // i4.a
    public final void p(p3.e0 e0Var) {
        this.f21069t = e0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        t3.j jVar = this.f20832h;
        jVar.getClass();
        x3.h hVar = this.f21060k;
        hVar.b(looperMyLooper, jVar);
        hVar.prepare();
        x();
    }

    @Override // i4.a
    public final void r(a0 a0Var) {
        v0 v0Var = (v0) a0Var;
        if (v0Var.f21048y) {
            for (a1 a1Var : v0Var.f21045v) {
                a1Var.k();
                ni.i iVar = a1Var.f20840h;
                if (iVar != null) {
                    iVar.A(a1Var.f20837e);
                    a1Var.f20840h = null;
                    a1Var.f20839g = null;
                }
            }
        }
        v0Var.f21036m.e(v0Var);
        v0Var.f21041r.removeCallbacksAndMessages(null);
        v0Var.f21042s = null;
        v0Var.Q = true;
    }

    @Override // i4.a
    public final void t() {
        this.f21060k.release();
    }

    @Override // i4.a
    public final synchronized void w(j3.x xVar) {
        this.f21070u = xVar;
    }

    public final void x() {
        j3.o0 f1Var = new f1(this.f21065p, this.f21066q, this.f21067r, j());
        if (this.f21064o) {
            f1Var = new e4.t(f1Var, 1);
        }
        q(f1Var);
    }

    public final void y(long j10, q4.t tVar, boolean z5) {
        if (this.f21068s && tVar.d()) {
            return;
        }
        this.f21068s = !tVar.d();
        if (j10 == -9223372036854775807L) {
            j10 = this.f21065p;
        }
        boolean zA = tVar.a();
        if (!this.f21064o && this.f21065p == j10 && this.f21066q == zA && this.f21067r == z5) {
            return;
        }
        this.f21065p = j10;
        this.f21066q = zA;
        this.f21067r = z5;
        this.f21064o = false;
        x();
    }

    @Override // i4.a
    public final void l() {
    }
}
