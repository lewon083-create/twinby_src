package he;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ge.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f20523a;

    public j(k kVar) {
        this.f20523a = kVar;
    }

    @Override // ge.b
    public final void b(ge.g gVar) {
        k kVar = this.f20523a;
        synchronized (kVar) {
            kVar.f20529d = true;
        }
        this.f20523a.g(gVar);
    }

    @Override // ge.b
    public final void a(ge.a aVar) {
    }
}
