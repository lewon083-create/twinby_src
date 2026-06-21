package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bo2 implements nf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co2 f37116a;

    public bo2(co2 co2Var) {
        this.f37116a = co2Var;
    }

    @Override // yads.nf3
    public final void a() {
    }

    @Override // yads.nf3
    public final void c() {
        yf3 yf3Var = this.f37116a.f37460c;
        if (!yf3Var.f45047d) {
            yf3Var.f45047d = true;
            yf3Var.f45045b.a();
            yf3Var.f45046c.post(new xf3(yf3Var));
        }
        hf3 hf3Var = this.f37116a.f37462e;
        if (hf3Var != null) {
            hf3Var.c();
        }
    }

    @Override // yads.nf3
    public final void d() {
        this.f37116a.f37460c.a();
        this.f37116a.f37458a.a((nf3) null);
        hf3 hf3Var = this.f37116a.f37462e;
        if (hf3Var != null) {
            hf3Var.b();
        }
    }

    @Override // yads.nf3
    public final void e() {
        this.f37116a.f37460c.a();
        this.f37116a.f37458a.a((nf3) null);
    }

    @Override // yads.nf3
    public final void h() {
        this.f37116a.f37458a.c();
    }

    @Override // yads.nf3
    public final void a(mf3 mf3Var) {
        this.f37116a.f37460c.a();
        this.f37116a.f37458a.a((nf3) null);
        this.f37116a.f37458a.e();
    }

    @Override // yads.nf3
    public final void b() {
    }

    @Override // yads.nf3
    public final void f() {
    }

    @Override // yads.nf3
    public final void i() {
    }

    @Override // yads.nf3
    public final void onVolumeChanged(float f10) {
    }
}
