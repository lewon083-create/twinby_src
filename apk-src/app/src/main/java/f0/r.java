package f0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f16551c;

    public /* synthetic */ r(s sVar, int i) {
        this.f16550b = i;
        this.f16551c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16550b) {
            case 0:
                s sVar = this.f16551c;
                sVar.f16555e = null;
                sVar.c();
                break;
            default:
                this.f16551c.c();
                break;
        }
    }
}
