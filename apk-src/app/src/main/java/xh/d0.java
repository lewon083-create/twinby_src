package xh;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements io.flutter.embedding.engine.renderer.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f36117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f36118b;

    public d0(f0 f0Var, Runnable runnable) {
        this.f36118b = f0Var;
        this.f36117a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        this.f36117a.run();
        io.flutter.embedding.engine.renderer.j jVar = this.f36118b.f36120c;
        if (jVar != null) {
            jVar.g(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }
}
