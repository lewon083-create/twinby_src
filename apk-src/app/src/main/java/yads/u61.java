package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt1 f43572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l00 f43573b;

    public u61(pt1 pt1Var, l00 l00Var) {
        this.f43572a = pt1Var;
        this.f43573b = l00Var;
    }

    public final void a() {
        pt1 pt1Var = this.f43572a;
        pt1Var.f42017a.f42383a.execute(new zl.a1(0, this));
    }

    public static final void a(u61 u61Var) {
        u61Var.f43573b.onInitializationCompleted();
    }
}
