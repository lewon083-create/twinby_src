package a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o2 f134c;

    public /* synthetic */ j2(o2 o2Var, int i) {
        this.f133b = i;
        this.f134c = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f133b) {
            case 0:
                this.f134c.f185h.cancel(true);
                break;
            default:
                this.f134c.d();
                break;
        }
    }
}
