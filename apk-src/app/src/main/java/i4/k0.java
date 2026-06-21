package i4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements l4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4.r f20941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.p0 f20942b;

    public k0(l4.r rVar, j3.p0 p0Var) {
        this.f20941a = rVar;
        this.f20942b = p0Var;
    }

    @Override // l4.r
    public final boolean a(int i, long j10) {
        return this.f20941a.a(i, j10);
    }

    @Override // l4.r
    public final j3.p0 b() {
        return this.f20942b;
    }

    @Override // l4.r
    public final int c() {
        return this.f20941a.c();
    }

    @Override // l4.r
    public final boolean d(long j10, j4.f fVar, List list) {
        return this.f20941a.d(j10, fVar, list);
    }

    @Override // l4.r
    public final void disable() {
        this.f20941a.disable();
    }

    @Override // l4.r
    public final void e(boolean z5) {
        this.f20941a.e(z5);
    }

    public final boolean equals(Object obj) {
        if (u(obj) && (obj instanceof k0)) {
            return this.f20942b.equals(((k0) obj).f20942b);
        }
        return false;
    }

    @Override // l4.r
    public final j3.o f(int i) {
        return this.f20942b.f26354d[this.f20941a.h(i)];
    }

    @Override // l4.r
    public final void g() {
        this.f20941a.g();
    }

    @Override // l4.r
    public final int h(int i) {
        return this.f20941a.h(i);
    }

    public final int hashCode() {
        return this.f20942b.hashCode() + (this.f20941a.hashCode() * 31);
    }

    @Override // l4.r
    public final int i(long j10, List list) {
        return this.f20941a.i(j10, list);
    }

    @Override // l4.r
    public final int j() {
        return this.f20941a.j();
    }

    @Override // l4.r
    public final int k(j3.o oVar) {
        return this.f20941a.t(this.f20942b.a(oVar));
    }

    @Override // l4.r
    public final j3.o l() {
        return this.f20942b.f26354d[this.f20941a.j()];
    }

    @Override // l4.r
    public final int length() {
        return this.f20941a.length();
    }

    @Override // l4.r
    public final int m() {
        return this.f20941a.m();
    }

    @Override // l4.r
    public final boolean n(int i, long j10) {
        return this.f20941a.n(i, j10);
    }

    @Override // l4.r
    public final void o(float f10) {
        this.f20941a.o(f10);
    }

    @Override // l4.r
    public final Object p() {
        return this.f20941a.p();
    }

    @Override // l4.r
    public final void q() {
        this.f20941a.q();
    }

    @Override // l4.r
    public final void r() {
        this.f20941a.r();
    }

    @Override // l4.r
    public final void s(long j10, long j11, long j12, List list, j4.n[] nVarArr) {
        this.f20941a.s(j10, j11, j12, list, nVarArr);
    }

    @Override // l4.r
    public final int t(int i) {
        return this.f20941a.t(i);
    }

    public final boolean u(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return this.f20941a.equals(((k0) obj).f20941a);
        }
        return false;
    }
}
