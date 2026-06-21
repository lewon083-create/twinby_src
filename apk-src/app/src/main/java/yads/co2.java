package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class co2 implements bf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r52 f37458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final me3 f37459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yf3 f37460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bo2 f37461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hf3 f37462e;

    public /* synthetic */ co2(r52 r52Var, me3 me3Var, uf3 uf3Var) {
        this(r52Var, me3Var, new yf3(new t52(r52Var), uf3Var));
    }

    @Override // yads.bf3
    public final void a(be2 be2Var) {
        this.f37462e = be2Var;
    }

    @Override // yads.bf3
    public final void play() {
        this.f37458a.a(this.f37461d);
        r52 r52Var = this.f37458a;
        me3 me3Var = this.f37459b;
        r52Var.a((q62) me3Var.f40902d, (q62) me3Var.f40903e);
    }

    @Override // yads.bf3
    public final void stop() {
        this.f37460c.a();
        this.f37458a.pauseAd();
        this.f37458a.a();
    }

    public co2(r52 r52Var, me3 me3Var, yf3 yf3Var) {
        this.f37458a = r52Var;
        this.f37459b = me3Var;
        this.f37460c = yf3Var;
        this.f37461d = new bo2(this);
    }
}
