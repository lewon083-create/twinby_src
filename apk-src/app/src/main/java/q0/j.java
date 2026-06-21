package q0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f31582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31584d;

    public /* synthetic */ j(m mVar, int i, int i10) {
        this.f31582b = mVar;
        this.f31583c = i;
        this.f31584d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        m mVar = this.f31582b;
        int i = mVar.i;
        int i10 = this.f31583c;
        boolean z10 = true;
        if (i != i10) {
            mVar.i = i10;
            z5 = true;
        } else {
            z5 = false;
        }
        int i11 = mVar.f31601h;
        int i12 = this.f31584d;
        if (i11 != i12) {
            mVar.f31601h = i12;
        } else {
            z10 = z5;
        }
        if (z10) {
            mVar.f();
        }
    }
}
