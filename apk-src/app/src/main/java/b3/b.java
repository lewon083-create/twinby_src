package b3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f1807c;

    public /* synthetic */ b(e eVar, int i) {
        this.f1806b = i;
        this.f1807c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1806b) {
            case 0:
                this.f1807c.h();
                break;
            default:
                this.f1807c.j();
                break;
        }
    }
}
