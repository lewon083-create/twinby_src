package g0;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f19520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19522d;

    public b(c0 c0Var, byte b2) {
        this.f19520b = c0Var;
    }

    @Override // g0.c0
    public c0 b() {
        switch (this.f19521c) {
            case 0:
                return (c0) this.f19522d;
            default:
                return this.f19520b.b();
        }
    }

    @Override // g0.c0
    public final void c() {
        this.f19520b.c();
    }

    @Override // g0.c0
    public ed.d d(a0.l0 l0Var) {
        switch (this.f19521c) {
            case 0:
                return ((c0) this.f19522d).d(l0Var);
            default:
                return this.f19520b.d(l0Var);
        }
    }

    @Override // g0.c0
    public ed.d e() {
        switch (this.f19521c) {
            case 0:
                return ((c0) this.f19522d).e();
            default:
                return this.f19520b.e();
        }
    }

    @Override // g0.c0
    public ed.d f(float f10) {
        switch (this.f19521c) {
            case 0:
                return ((c0) this.f19522d).f(f10);
            default:
                return this.f19520b.f(f10);
        }
    }

    @Override // g0.c0
    public final void g(int i) {
        this.f19520b.g(i);
    }

    @Override // g0.c0
    public final void h(v0 v0Var) {
        this.f19520b.h(v0Var);
    }

    @Override // g0.c0
    public final void i() {
        this.f19520b.i();
    }

    @Override // g0.c0
    public ed.d j(ArrayList arrayList, int i, int i10) {
        switch (this.f19521c) {
            case 1:
                f2.g.a("Only support one capture config.", arrayList.size() == 1);
                ed.d dVarQ = this.f19520b.q(i);
                return k0.j.b(Collections.singletonList(k0.j.j(k0.j.j(k0.j.j(k0.d.b(dVarQ), new k0.h(2, dVarQ), hl.d.j()), new oi.i(21, this, arrayList), hl.d.j()), new k0.h(3, dVarQ), hl.d.j())));
            default:
                return this.f19520b.j(arrayList, i, i10);
        }
    }

    @Override // g0.c0
    public ed.d k(boolean z5) {
        switch (this.f19521c) {
            case 0:
                return ((c0) this.f19522d).k(z5);
            default:
                return this.f19520b.k(z5);
        }
    }

    @Override // g0.c0
    public final v0 l() {
        return this.f19520b.l();
    }

    @Override // g0.c0
    public final void m(l0.i iVar) {
        this.f19520b.m(iVar);
    }

    @Override // g0.c0
    public ed.d n(int i) {
        switch (this.f19521c) {
            case 0:
                return ((c0) this.f19522d).n(i);
            default:
                return this.f19520b.n(i);
        }
    }

    @Override // g0.c0
    public final void o() {
        this.f19520b.o();
    }

    @Override // g0.c0
    public final void p() {
        this.f19520b.p();
    }

    @Override // g0.c0
    public final ed.d q(int i) {
        return this.f19520b.q(i);
    }

    @Override // g0.c0
    public final void r(d2 d2Var) {
        this.f19520b.r(d2Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c0 c0Var) {
        this(c0Var, (byte) 0);
        this.f19521c = 0;
        this.f19522d = c0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c0 c0Var, s3.q qVar) {
        this(c0Var, (byte) 0);
        this.f19521c = 1;
        this.f19522d = qVar;
    }
}
