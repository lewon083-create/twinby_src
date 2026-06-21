package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements a0.d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.d2 f19765c;

    public t2(long j10, a0.d2 d2Var) {
        f2.g.a("Timeout must be non-negative.", j10 >= 0);
        this.f19764b = j10;
        this.f19765c = d2Var;
    }

    @Override // a0.d2
    public final long a() {
        return this.f19764b;
    }

    @Override // a0.d2
    public final a0.c2 b(a4.g gVar) {
        a0.c2 c2VarB = this.f19765c.b(gVar);
        long j10 = this.f19764b;
        return (j10 <= 0 || gVar.f430c < j10 - c2VarB.f56a) ? c2VarB : a0.c2.f53d;
    }
}
