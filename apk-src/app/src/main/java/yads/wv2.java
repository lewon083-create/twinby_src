package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wv2 implements z22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu2 f44494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f44495b;

    public wv2(nu2 nu2Var, d4 d4Var) {
        this.f44494a = nu2Var;
        this.f44495b = d4Var;
    }

    @Override // yads.z22
    public final y22 a(o02 o02Var) {
        return new vv2(o02Var, this.f44495b, new pv2(this.f44494a));
    }
}
