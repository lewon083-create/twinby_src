package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gn0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ro2 f38826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xp2 f38827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f38828d;

    public gn0(ro2 ro2Var, xp2 xp2Var, sr srVar) {
        this.f38826b = ro2Var;
        this.f38827c = xp2Var;
        this.f38828d = srVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vp2 vp2Var;
        if (this.f38826b.i()) {
            this.f38826b.c("canceled-at-delivery");
            return;
        }
        xp2 xp2Var = this.f38827c;
        lm3 lm3Var = xp2Var.f44788c;
        if (lm3Var == null) {
            this.f38826b.a(xp2Var.f44786a);
        } else {
            ro2 ro2Var = this.f38826b;
            synchronized (ro2Var.f42662f) {
                vp2Var = ro2Var.f42663g;
            }
            if (vp2Var != null) {
                vp2Var.a(lm3Var);
            }
        }
        if (this.f38827c.f44789d) {
            this.f38826b.a("intermediate-response");
        } else {
            this.f38826b.c("done");
        }
        Runnable runnable = this.f38828d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
