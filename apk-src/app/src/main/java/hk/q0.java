package hk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f20701d;

    public q0(long j10, w1 w1Var) {
        super(j10);
        this.f20701d = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20701d.run();
    }

    @Override // hk.r0
    public final String toString() {
        return super.toString() + this.f20701d;
    }
}
