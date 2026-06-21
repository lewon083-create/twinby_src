package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t62 implements hf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v62 f43196a;

    public t62(v62 v62Var) {
        this.f43196a = v62Var;
    }

    public static final void a(v62 v62Var) {
        v62Var.a(v62Var.f43908g);
    }

    @Override // yads.hf3
    public final void b() {
        v62 v62Var = this.f43196a;
        v62Var.f43912l = null;
        py2 py2Var = v62Var.f43904c;
        if (py2Var == null || !py2Var.f42118d) {
            v62Var.i.a();
        } else {
            ph1 ph1Var = v62Var.f43911k;
            ph1Var.f41927a.post(new t.a0(29, v62Var));
        }
        this.f43196a.f43903b.b();
    }

    @Override // yads.hf3
    public final void c() {
        h72 h72Var = (h72) this.f43196a.f43902a.b();
        if (h72Var != null) {
            h72Var.setClickable(true);
        }
    }

    @Override // yads.hf3
    public final void a() {
        this.f43196a.f43903b.a();
    }
}
