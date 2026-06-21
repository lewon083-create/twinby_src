package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bb.e f19691c;

    public /* synthetic */ n1(bb.e eVar, int i) {
        this.f19690b = i;
        this.f19691c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19690b) {
            case 0:
                bb.e eVar = this.f19691c;
                if (((o1) eVar.f2021e) == null) {
                    eVar.f2021e = new o1(0, eVar);
                }
                ((androidx.lifecycle.d0) eVar.f2019c).f((o1) eVar.f2021e);
                break;
            default:
                bb.e eVar2 = this.f19691c;
                o1 o1Var = (o1) eVar2.f2021e;
                if (o1Var != null) {
                    ((androidx.lifecycle.d0) eVar2.f2019c).j(o1Var);
                }
                break;
        }
    }
}
