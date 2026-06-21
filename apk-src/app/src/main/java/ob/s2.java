package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r2 f30420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r2 f30421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f30423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u2 f30424f;

    public s2(u2 u2Var, r2 r2Var, r2 r2Var2, long j10, boolean z5) {
        this.f30420b = r2Var;
        this.f30421c = r2Var2;
        this.f30422d = j10;
        this.f30423e = z5;
        this.f30424f = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30424f.M(this.f30420b, this.f30421c, this.f30422d, this.f30423e, null);
    }
}
