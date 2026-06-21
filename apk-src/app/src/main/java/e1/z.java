package e1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f16012c;

    public /* synthetic */ z(n nVar, int i) {
        this.f16011b = i;
        this.f16012c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16011b) {
            case 0:
                this.f16012c.getClass();
                break;
            default:
                this.f16012c.g();
                break;
        }
    }
}
