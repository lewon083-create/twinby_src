package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class de0 implements bk1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m33 f37734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce0 f37735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ro f37736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bk1 f37737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37738f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37739g;

    public de0(ce0 ce0Var, i53 i53Var) {
        this.f37735c = ce0Var;
        this.f37734b = new m33(i53Var);
    }

    @Override // yads.bk1
    public final long a() {
        if (this.f37738f) {
            return this.f37734b.a();
        }
        bk1 bk1Var = this.f37737e;
        bk1Var.getClass();
        return bk1Var.a();
    }

    @Override // yads.bk1
    public final ge2 getPlaybackParameters() {
        bk1 bk1Var = this.f37737e;
        return bk1Var != null ? bk1Var.getPlaybackParameters() : this.f37734b.f40769f;
    }

    @Override // yads.bk1
    public final void a(ge2 ge2Var) {
        bk1 bk1Var = this.f37737e;
        if (bk1Var != null) {
            bk1Var.a(ge2Var);
            ge2Var = this.f37737e.getPlaybackParameters();
        }
        this.f37734b.a(ge2Var);
    }
}
