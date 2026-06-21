package hk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends f1 implements o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f20698f;

    public p(k1 k1Var) {
        this.f20698f = k1Var;
    }

    @Override // hk.o
    public final boolean b(Throwable th2) {
        return i().r(th2);
    }

    @Override // hk.f1
    public final boolean j() {
        return true;
    }

    @Override // hk.f1
    public final void k(Throwable th2) {
        this.f20698f.n(i());
    }
}
