package i4;

import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends l1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f21071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j3.n0 f21072n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j3.m0 f21073o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w f21074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v f21075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21078t;

    public y(a aVar, boolean z5) {
        super(aVar);
        this.f21071m = z5 && aVar.k();
        this.f21072n = new j3.n0();
        this.f21073o = new j3.m0();
        j3.o0 o0VarH = aVar.h();
        if (o0VarH == null) {
            this.f21074p = new w(new x(aVar.j()), j3.n0.f26306q, w.f21050e);
        } else {
            this.f21074p = new w(o0VarH, null, null);
            this.f21078t = true;
        }
    }

    @Override // i4.l1
    public final c0 C(c0 c0Var) {
        Object obj = c0Var.f20861a;
        Object obj2 = this.f21074p.f21052d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = w.f21050e;
        }
        return c0Var.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // i4.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(j3.o0 r12) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.y.D(j3.o0):void");
    }

    @Override // i4.l1
    public final void F() {
        if (this.f21071m) {
            return;
        }
        this.f21076r = true;
        E();
    }

    @Override // i4.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final v b(c0 c0Var, bb.e eVar, long j10) {
        v vVar = new v(c0Var, eVar, j10);
        h5.r(vVar.f21022e == null);
        vVar.f21022e = this.f20955l;
        if (!this.f21077s) {
            this.f21075q = vVar;
            if (!this.f21076r) {
                this.f21076r = true;
                E();
            }
            return vVar;
        }
        Object obj = c0Var.f20861a;
        if (this.f21074p.f21052d != null && obj.equals(w.f21050e)) {
            obj = this.f21074p.f21052d;
        }
        vVar.a(c0Var.a(obj));
        return vVar;
    }

    public final boolean H(long j10) {
        v vVar = this.f21075q;
        int iB = this.f21074p.b(vVar.f21019b.f20861a);
        if (iB == -1) {
            return false;
        }
        w wVar = this.f21074p;
        j3.m0 m0Var = this.f21073o;
        wVar.f(iB, m0Var, false);
        long j11 = m0Var.f26277d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        vVar.f21025h = j10;
        return true;
    }

    @Override // i4.a
    public final void r(a0 a0Var) {
        v vVar = (v) a0Var;
        if (vVar.f21023f != null) {
            a aVar = vVar.f21022e;
            aVar.getClass();
            aVar.r(vVar.f21023f);
        }
        if (a0Var == this.f21075q) {
            this.f21075q = null;
        }
    }

    @Override // i4.l, i4.a
    public final void t() {
        this.f21077s = false;
        this.f21076r = false;
        super.t();
    }

    @Override // i4.l1, i4.a
    public final void w(j3.x xVar) {
        if (this.f21078t) {
            w wVar = this.f21074p;
            j3.o0 o0Var = wVar.f20995b;
            this.f21074p = new w(o0Var instanceof i1 ? new i1(((i1) o0Var).f20995b, xVar) : new i1(o0Var, xVar), wVar.f21051c, wVar.f21052d);
        } else {
            this.f21074p = new w(new x(xVar), j3.n0.f26306q, w.f21050e);
        }
        this.f20955l.w(xVar);
    }
}
