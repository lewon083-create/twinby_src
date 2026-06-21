package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends j3.o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.x f21058b;

    public x(j3.x xVar) {
        this.f21058b = xVar;
    }

    @Override // j3.o0
    public final int b(Object obj) {
        return obj == w.f21050e ? 0 : -1;
    }

    @Override // j3.o0
    public final j3.m0 f(int i, j3.m0 m0Var, boolean z5) {
        m0Var.h(z5 ? 0 : null, z5 ? w.f21050e : null, 0, -9223372036854775807L, 0L, j3.c.f26218c, true);
        return m0Var;
    }

    @Override // j3.o0
    public final int h() {
        return 1;
    }

    @Override // j3.o0
    public final Object l(int i) {
        return w.f21050e;
    }

    @Override // j3.o0
    public final j3.n0 m(int i, j3.n0 n0Var, long j10) {
        Object obj = j3.n0.f26306q;
        n0Var.b(this.f21058b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        n0Var.f26317k = true;
        return n0Var;
    }

    @Override // j3.o0
    public final int o() {
        return 1;
    }
}
