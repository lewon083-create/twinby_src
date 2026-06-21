package a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n2 f106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f107d;

    public /* synthetic */ h2(n2 n2Var, m mVar, int i) {
        this.f105b = i;
        this.f106c = n2Var;
        this.f107d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f105b) {
            case 0:
                this.f106c.a(this.f107d);
                break;
            default:
                this.f106c.a(this.f107d);
                break;
        }
    }
}
