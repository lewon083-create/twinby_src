package hk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f20663j;

    public g1(k1 k1Var, mj.a aVar) {
        super(1, aVar);
        this.f20663j = k1Var;
    }

    @Override // hk.l
    public final Throwable r(k1 k1Var) {
        Throwable thB;
        k1 k1Var2 = this.f20663j;
        k1Var2.getClass();
        Object obj = k1.f20683b.get(k1Var2);
        return (!(obj instanceof i1) || (thB = ((i1) obj).b()) == null) ? obj instanceof t ? ((t) obj).f20711a : k1Var.v() : thB;
    }

    @Override // hk.l
    public final String z() {
        return "AwaitContinuation";
    }
}
