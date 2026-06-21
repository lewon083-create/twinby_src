package g0;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f19534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f19535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f19536d;

    public d(f0 f0Var, c cVar) {
        this.f19534b = f0Var;
        this.f19535c = cVar;
        w wVar = cVar.f19524c;
        c0 c0VarG = f0Var.g();
        wVar.p();
        this.f19536d = new b(c0VarG);
    }

    @Override // g0.f0, a0.n
    public final c0 a() {
        return this.f19536d;
    }

    @Override // g0.f0, a0.n
    public final d0 b() {
        return this.f19535c;
    }

    @Override // a0.p2
    public final void c(a0.q2 q2Var) {
        this.f19534b.c(q2Var);
    }

    @Override // a0.p2
    public final void d(a0.q2 q2Var) {
        this.f19534b.d(q2Var);
    }

    @Override // a0.p2
    public final void e(a0.q2 q2Var) {
        this.f19534b.e(q2Var);
    }

    @Override // g0.f0
    public final boolean f() {
        return this.f19534b.f();
    }

    @Override // g0.f0
    public final c0 g() {
        return this.f19536d;
    }

    @Override // a0.p2
    public final void h(a0.q2 q2Var) {
        this.f19534b.h(q2Var);
    }

    @Override // g0.f0
    public final w i() {
        return this.f19534b.i();
    }

    @Override // g0.f0
    public final void j(boolean z5) {
        this.f19534b.j(z5);
    }

    @Override // g0.f0
    public final void k(Collection collection) {
        this.f19534b.k(collection);
    }

    @Override // g0.f0
    public final void l(ArrayList arrayList) {
        this.f19534b.l(arrayList);
    }

    @Override // g0.f0
    public final boolean n() {
        return this.f19534b.n();
    }

    @Override // g0.f0
    public final void o(boolean z5) {
        this.f19534b.o(z5);
    }

    @Override // g0.f0
    public final d0 p() {
        return this.f19535c;
    }

    @Override // g0.f0
    public final void q(w wVar) {
        this.f19534b.q(wVar);
    }

    @Override // g0.f0
    public final ed.d release() {
        return this.f19534b.release();
    }
}
