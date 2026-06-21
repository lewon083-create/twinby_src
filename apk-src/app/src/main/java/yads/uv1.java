package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uv1 implements fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iw1 f43793a;

    public uv1(iw1 iw1Var) {
        this.f43793a = iw1Var;
    }

    @Override // yads.fv
    public final void a(kf1 kf1Var, hv hvVar) {
        this.f43793a.setClickListener(new tv1(kf1Var, hvVar));
    }
}
