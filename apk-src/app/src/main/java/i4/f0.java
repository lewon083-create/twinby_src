package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements m3.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f20889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f20890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f4.g f20891e;

    public /* synthetic */ f0(i0 i0Var, u uVar, f4.g gVar, int i) {
        this.f20888b = i;
        this.f20889c = i0Var;
        this.f20890d = uVar;
        this.f20891e = gVar;
    }

    @Override // m3.g
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f20888b) {
            case 0:
                i0 i0Var = this.f20889c;
                j0Var.c(i0Var.f20926a, i0Var.f20927b, this.f20890d, this.f20891e);
                break;
            default:
                i0 i0Var2 = this.f20889c;
                j0Var.s(i0Var2.f20926a, i0Var2.f20927b, this.f20890d, this.f20891e);
                break;
        }
    }
}
