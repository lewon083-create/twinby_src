package q0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f31577c;

    public /* synthetic */ g(l lVar, int i) {
        this.f31576b = i;
        this.f31577c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31576b) {
            case 0:
                this.f31577c.a();
                break;
            case 1:
                this.f31577c.b();
                break;
            default:
                l lVar = this.f31577c;
                n nVar = lVar.f31593r;
                if (nVar != null) {
                    nVar.d();
                }
                if (lVar.f31592q == null) {
                    lVar.f31591p.c();
                }
                lVar.f31592q = null;
                break;
        }
    }
}
