package s3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends i4.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3.n0 f32721c;

    public y0(j3.o0 o0Var) {
        super(o0Var);
        this.f32721c = new j3.n0();
    }

    @Override // i4.s, j3.o0
    public final j3.m0 f(int i, j3.m0 m0Var, boolean z5) {
        j3.o0 o0Var = this.f20995b;
        j3.m0 m0VarF = o0Var.f(i, m0Var, z5);
        if (o0Var.m(m0VarF.f26276c, this.f32721c, 0L).a()) {
            m0VarF.h(m0Var.f26274a, m0Var.f26275b, m0Var.f26276c, m0Var.f26277d, m0Var.f26278e, j3.c.f26218c, true);
            return m0VarF;
        }
        m0VarF.f26279f = true;
        return m0VarF;
    }
}
