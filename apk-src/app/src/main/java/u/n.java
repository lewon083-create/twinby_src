package u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f33970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33971d;

    public /* synthetic */ n(o oVar, String str, int i) {
        this.f33969b = i;
        this.f33970c = oVar;
        this.f33971d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33969b) {
            case 0:
                this.f33970c.f33973b.onCameraAvailable(this.f33971d);
                break;
            default:
                this.f33970c.f33973b.onCameraUnavailable(this.f33971d);
                break;
        }
    }
}
