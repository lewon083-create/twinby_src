package t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f33287c;

    public /* synthetic */ t(c0 c0Var, int i) {
        this.f33286b = i;
        this.f33287c = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33286b) {
            case 0:
                c0 c0Var = this.f33287c;
                c0Var.v("Camera is removed. Updating state and cleaning up.", null);
                if (c0Var.M != 2 && c0Var.M != 1) {
                    a0.g gVar = new a0.g(null, 8);
                    c0Var.f32972g.J(g0.e0.CLOSED, gVar);
                    c0Var.G(2, gVar, true);
                    c0Var.i.a();
                    c0Var.L.o();
                    if (c0Var.f32975k == null) {
                        c0Var.w();
                    } else {
                        c0Var.s();
                    }
                    break;
                }
                break;
            default:
                c0 c0Var2 = this.f33287c;
                c0Var2.f32990z = false;
                c0Var2.f32989y = false;
                c0Var2.v("OpenCameraConfigAndClose is done, state: ".concat(z.n(c0Var2.M)), null);
                int iM = z.m(c0Var2.M);
                if (iM == 1 || iM == 5) {
                    f2.g.h(null, c0Var2.f32981q.isEmpty());
                    c0Var2.w();
                } else if (iM == 7) {
                    int i = c0Var2.f32976l;
                    if (i == 0) {
                        c0Var2.K(false);
                    } else {
                        c0Var2.v("OpenCameraConfigAndClose in error: ".concat(c0.x(i)), null);
                        c0Var2.i.b();
                    }
                } else {
                    c0Var2.v("OpenCameraConfigAndClose finished while in state: ".concat(z.n(c0Var2.M)), null);
                }
                break;
        }
    }
}
