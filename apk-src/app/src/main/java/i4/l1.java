package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 extends l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f20955l;

    public l1(a aVar) {
        this.f20955l = aVar;
    }

    @Override // i4.l
    public final void A(Object obj, a aVar, j3.o0 o0Var) {
        D(o0Var);
    }

    public abstract void D(j3.o0 o0Var);

    public final void E() {
        B(null, this.f20955l);
    }

    public void F() {
        E();
    }

    @Override // i4.a
    public final j3.o0 h() {
        return this.f20955l.h();
    }

    @Override // i4.a
    public final j3.x j() {
        return this.f20955l.j();
    }

    @Override // i4.a
    public final boolean k() {
        return this.f20955l.k();
    }

    @Override // i4.a
    public final void p(p3.e0 e0Var) {
        this.f20945k = e0Var;
        this.f20944j = m3.z.o(null);
        F();
    }

    @Override // i4.a
    public void w(j3.x xVar) {
        this.f20955l.w(xVar);
    }

    @Override // i4.l
    public final c0 x(Object obj, c0 c0Var) {
        return C(c0Var);
    }

    @Override // i4.l
    public final long y(long j10, Object obj) {
        return j10;
    }

    @Override // i4.l
    public final int z(int i, Object obj) {
        return i;
    }

    public c0 C(c0 c0Var) {
        return c0Var;
    }
}
