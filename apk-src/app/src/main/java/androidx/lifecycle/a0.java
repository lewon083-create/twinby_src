package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b0 implements s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f1534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f1535g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, u uVar, e0 e0Var) {
        super(d0Var, e0Var);
        this.f1535g = d0Var;
        this.f1534f = uVar;
    }

    @Override // androidx.lifecycle.b0
    public final void b() {
        this.f1534f.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.b0
    public final boolean c(u uVar) {
        return this.f1534f == uVar;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, n nVar) {
        u uVar2 = this.f1534f;
        o oVar = ((w) uVar2.getLifecycle()).f1606c;
        if (oVar == o.f1573b) {
            this.f1535g.j(this.f1536b);
            return;
        }
        o oVar2 = null;
        while (oVar2 != oVar) {
            a(e());
            oVar2 = oVar;
            oVar = ((w) uVar2.getLifecycle()).f1606c;
        }
    }

    @Override // androidx.lifecycle.b0
    public final boolean e() {
        return ((w) this.f1534f.getLifecycle()).f1606c.a(o.f1576e);
    }
}
