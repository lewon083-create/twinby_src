package hk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends f1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f20666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i1 f20667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f20668h;
    public final Object i;

    public h1(k1 k1Var, i1 i1Var, p pVar, Object obj) {
        this.f20666f = k1Var;
        this.f20667g = i1Var;
        this.f20668h = pVar;
        this.i = obj;
    }

    @Override // hk.f1
    public final boolean j() {
        return false;
    }

    @Override // hk.f1
    public final void k(Throwable th2) {
        p pVar = this.f20668h;
        p pVarK = k1.K(pVar);
        k1 k1Var = this.f20666f;
        i1 i1Var = this.f20667g;
        Object obj = this.i;
        if (pVarK == null || !k1Var.T(i1Var, pVarK, obj)) {
            i1Var.f20673b.d(new mk.h(2), 2);
            p pVarK2 = k1.K(pVar);
            if (pVarK2 == null || !k1Var.T(i1Var, pVarK2, obj)) {
                k1Var.k(k1Var.u(i1Var, obj));
            }
        }
    }
}
