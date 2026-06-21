package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hz2 extends a53 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iz2 f39380f;

    public hz2(iz2 iz2Var) {
        this.f39380f = iz2Var;
    }

    @Override // yads.ua0
    public final void b() {
        iz2 iz2Var = this.f39380f;
        synchronized (iz2Var.f37924b) {
            this.f43049b = 0;
            this.f36636d = null;
            ua0[] ua0VarArr = iz2Var.f37928f;
            int i = iz2Var.f37930h;
            iz2Var.f37930h = i + 1;
            ua0VarArr[i] = this;
            iz2Var.f();
        }
    }
}
