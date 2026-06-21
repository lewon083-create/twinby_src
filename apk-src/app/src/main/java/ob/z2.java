package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d3 f30604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(d3 d3Var, l1 l1Var, int i) {
        super(l1Var);
        this.f30603e = i;
        this.f30604f = d3Var;
    }

    @Override // ob.o
    public final void a() {
        switch (this.f30603e) {
            case 0:
                d3 d3Var = this.f30604f;
                d3Var.C();
                if (d3Var.T()) {
                    s0 s0Var = ((l1) d3Var.f15951b).f30265g;
                    l1.k(s0Var);
                    s0Var.f30418o.f("Inactivity, disconnecting from the service");
                    d3Var.K();
                    break;
                }
                break;
            default:
                s0 s0Var2 = ((l1) this.f30604f.f15951b).f30265g;
                l1.k(s0Var2);
                s0Var2.f30413j.f("Tasks have been queued for a long time");
                break;
        }
    }
}
