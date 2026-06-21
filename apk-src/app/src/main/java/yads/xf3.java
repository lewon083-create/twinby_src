package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xf3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf3 f44687b;

    public xf3(yf3 yf3Var) {
        this.f44687b = yf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long adPosition = this.f44687b.f45044a.getAdPosition();
        this.f44687b.f45045b.a(this.f44687b.f45044a.b(), adPosition);
        yf3 yf3Var = this.f44687b;
        if (yf3Var.f45047d) {
            yf3Var.f45046c.postDelayed(this, 200L);
        }
    }
}
