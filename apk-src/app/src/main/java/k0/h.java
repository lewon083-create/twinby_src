package k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements j1.i, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ed.d f26773c;

    public /* synthetic */ h(int i, ed.d dVar) {
        this.f26772b = i;
        this.f26773c = dVar;
    }

    @Override // k0.a
    public ed.d apply(Object obj) {
        switch (this.f26772b) {
            case 2:
                return ((f0.h) this.f26773c.get()).a();
            default:
                return ((f0.h) this.f26773c.get()).b();
        }
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        switch (this.f26772b) {
            case 0:
                j0.b bVarJ = hl.d.j();
                ed.d dVar = this.f26773c;
                j.h(false, dVar, hVar, bVarJ);
                return "nonCancellationPropagating[" + dVar + "]";
            default:
                e eVar = new e(0, hVar);
                j0.b bVarJ2 = hl.d.j();
                ed.d dVar2 = this.f26773c;
                dVar2.a(eVar, bVarJ2);
                return "transformVoidFuture [" + dVar2 + "]";
        }
    }
}
