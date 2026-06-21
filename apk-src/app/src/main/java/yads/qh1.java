package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qh1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt f42300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh1 f42301d;

    public qh1(rh1 rh1Var, long j10, zw1 zw1Var) {
        this.f42301d = rh1Var;
        this.f42299b = j10;
        this.f42300c = zw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dt dtVar = this.f42300c;
        if (dtVar.f37883b == ct.f37491b) {
            ((zw1) dtVar).run();
            this.f42301d.f42605a.postDelayed(this, this.f42299b);
        }
    }
}
