package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class if3 implements dg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f39532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f39533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v22 f39534c;

    public /* synthetic */ if3(d4 d4Var, v9 v9Var) {
        this(d4Var, v9Var, new h22());
    }

    @Override // yads.dg3
    public final ho2 a() {
        v9 v9Var = this.f39533b;
        f12 f12Var = (f12) v9Var.f43948t;
        if (f12Var == null) {
            f12Var = null;
        }
        ho2 ho2VarA = this.f39534c.a(v9Var, this.f39532a, f12Var);
        ho2VarA.b(do2.f37869a, "adapter");
        ho2VarA.f39287b = this.f39533b.i;
        return ho2VarA;
    }

    public if3(d4 d4Var, v9 v9Var, v22 v22Var) {
        this.f39532a = d4Var;
        this.f39533b = v9Var;
        this.f39534c = v22Var;
    }
}
