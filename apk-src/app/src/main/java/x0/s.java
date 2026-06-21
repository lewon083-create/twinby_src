package x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f35668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f35669d;

    public /* synthetic */ s(b0 b0Var, h hVar, int i) {
        this.f35667b = i;
        this.f35668c = b0Var;
        this.f35669d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35667b) {
            case 0:
                this.f35668c.t(this.f35669d);
                break;
            default:
                b0 b0Var = this.f35668c;
                if (b0Var.f35554r == this.f35669d && !b0Var.f35555s) {
                    if (b0Var.n()) {
                        b0Var.I.m();
                    }
                    e1.c0 c0Var = b0Var.G;
                    if (c0Var == null) {
                        b0Var.f35538f0 = true;
                    } else {
                        c0Var.m();
                        h hVar = b0Var.f35554r;
                        hVar.i(new p0(hVar.i, b0Var.k()), true);
                    }
                    break;
                }
                break;
        }
    }
}
