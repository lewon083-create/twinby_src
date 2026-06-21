package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nd implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f41228b;

    public nd(od odVar) {
        this.f41228b = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar = this.f41228b.f41511c;
        if (pdVar != null) {
            ((vc) pdVar).f43993a.f44638d.removeCallbacksAndMessages(null);
        }
    }
}
