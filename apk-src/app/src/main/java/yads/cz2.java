package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cz2 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz2 f37581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz2(iz2 iz2Var) {
        super("ExoPlayer:SimpleDecoder");
        this.f37581b = iz2Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        dz2 dz2Var = this.f37581b;
        dz2Var.getClass();
        do {
            try {
            } catch (InterruptedException e3) {
                throw new IllegalStateException(e3);
            }
        } while (dz2Var.e());
    }
}
