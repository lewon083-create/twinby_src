package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gg3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg3 f38757b;

    public gg3(hg3 hg3Var) {
        this.f38757b = hg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hg3 hg3Var = this.f38757b;
        if (hg3Var.f39185d || !hg3Var.f39182a.a()) {
            this.f38757b.f39184c.postDelayed(this, 200L);
            return;
        }
        ((bg3) this.f38757b.f39183b).a();
        hg3 hg3Var2 = this.f38757b;
        hg3Var2.f39185d = true;
        hg3Var2.f39184c.removeCallbacksAndMessages(null);
        hg3Var2.f39186e = false;
    }
}
