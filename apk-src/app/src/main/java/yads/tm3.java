package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tm3 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo2 f43371a;

    public tm3(vo2 vo2Var) {
        this.f43371a = vo2Var;
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
        if (this.f43371a != null) {
            this.f43371a.a(sm3.a(lm3Var));
        }
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        vo2 vo2Var = this.f43371a;
        if (vo2Var != null) {
            vo2Var.onSuccess(obj);
        }
    }
}
