package q0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f31579c;

    public /* synthetic */ h(m mVar, int i) {
        this.f31578b = i;
        this.f31579c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31578b) {
            case 0:
                hl.d.s().execute(new h(this.f31579c, 1));
                break;
            default:
                m mVar = this.f31579c;
                if (!mVar.f31606n) {
                    mVar.e();
                }
                break;
        }
    }
}
