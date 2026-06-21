package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb2 f45066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb2 f45067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45068h;
    public int i;

    public yj(lb2 lb2Var, lb2 lb2Var2, boolean z5) throws qb2 {
        this.f45067g = lb2Var;
        this.f45066f = lb2Var2;
        this.f45065e = z5;
        lb2Var2.e(12);
        this.f45061a = lb2Var2.p();
        lb2Var.e(12);
        this.i = lb2Var.p();
        rq0.a("first_chunk must be 1", lb2Var.b() == 1);
        this.f45062b = -1;
    }

    public final boolean a() {
        int i = this.f45062b + 1;
        this.f45062b = i;
        if (i == this.f45061a) {
            return false;
        }
        this.f45064d = this.f45065e ? this.f45066f.q() : this.f45066f.n();
        if (this.f45062b == this.f45068h) {
            this.f45063c = this.f45067g.p();
            lb2 lb2Var = this.f45067g;
            lb2Var.e(lb2Var.f40464b + 4);
            int i10 = this.i - 1;
            this.i = i10;
            this.f45068h = i10 > 0 ? this.f45067g.p() - 1 : -1;
        }
        return true;
    }
}
