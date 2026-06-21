package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f20975c;

    public /* synthetic */ o0(v0 v0Var, int i) {
        this.f20974b = i;
        this.f20975c = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20974b) {
            case 0:
                this.f20975c.K = true;
                break;
            case 1:
                this.f20975c.q();
                break;
            default:
                v0 v0Var = this.f20975c;
                if (!v0Var.Q) {
                    z zVar = v0Var.f21042s;
                    zVar.getClass();
                    zVar.d(v0Var);
                }
                break;
        }
    }
}
