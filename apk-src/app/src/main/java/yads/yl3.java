package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yl3 implements tf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf3 f45112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk3 f45113b;

    public /* synthetic */ yl3(t52 t52Var, l72 l72Var) {
        this(t52Var, ww1.a(l72Var));
    }

    @Override // yads.tf3
    public final void a(long j10, long j11) {
        if (this.f45113b.a()) {
            if (this.f45112a.isPlayingAd()) {
                return;
            }
            this.f45112a.resumeAd();
        } else if (this.f45112a.isPlayingAd()) {
            this.f45112a.pauseAd();
        }
    }

    public yl3(t52 t52Var, jk3 jk3Var) {
        this.f45112a = t52Var;
        this.f45113b = jk3Var;
    }
}
