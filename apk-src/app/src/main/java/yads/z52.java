package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe2 f45262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zi3 f45263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yl3 f45264c;

    public z52(gk3 gk3Var, r52 r52Var, l72 l72Var, p62 p62Var) {
        t52 t52Var = new t52(r52Var);
        this.f45262a = new fe2(p62Var);
        this.f45263b = new zi3(gk3Var);
        this.f45264c = new yl3(t52Var, l72Var);
    }

    public final void a(uf3 uf3Var) {
        kotlin.collections.x.n(uf3Var.f43641a, new tf3[]{this.f45262a, this.f45263b, this.f45264c});
    }
}
