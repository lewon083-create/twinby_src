package e1;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f15962b;

    public f0(h0 h0Var) {
        f2.g.b(h0Var.f());
        this.f15962b = h0Var;
    }

    @Override // e1.h0
    public final int c() {
        return this.f15962b.l();
    }

    @Override // e1.h0
    public final Range d() {
        return this.f15962b.d();
    }

    @Override // e1.h0
    public final boolean f() {
        return this.f15962b.f();
    }

    @Override // e1.h0
    public final Range h(int i) {
        return this.f15962b.k(i);
    }

    @Override // e1.h0
    public final Range k(int i) {
        return this.f15962b.h(i);
    }

    @Override // e1.h0
    public final int l() {
        return this.f15962b.c();
    }

    @Override // e1.h0
    public final Range m() {
        return this.f15962b.p();
    }

    @Override // e1.h0
    public final boolean n(int i, int i10) {
        return this.f15962b.n(i10, i);
    }

    @Override // e1.h0
    public final Range p() {
        return this.f15962b.m();
    }
}
