package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sr implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ro2 f43060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f43061c;

    public sr(tr trVar, ro2 ro2Var) {
        this.f43061c = trVar;
        this.f43060b = ro2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f43061c.f43420c.put(this.f43060b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
