package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f30170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f30172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k2 f30173f;

    public /* synthetic */ h2(k2 k2Var, x1 x1Var, long j10, boolean z5, int i) {
        this.f30169b = i;
        this.f30170c = x1Var;
        this.f30171d = j10;
        this.f30172e = z5;
        this.f30173f = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30169b) {
            case 0:
                k2 k2Var = this.f30173f;
                x1 x1Var = this.f30170c;
                k2Var.G(x1Var);
                k2Var.S(x1Var, this.f30171d, this.f30172e);
                break;
            default:
                k2 k2Var2 = this.f30173f;
                x1 x1Var2 = this.f30170c;
                k2Var2.G(x1Var2);
                k2Var2.S(x1Var2, this.f30171d, this.f30172e);
                break;
        }
    }
}
