package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cf3 implements nf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me3 f37365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kf3 f37366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yf3 f37367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bg3 f37368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mg3 f37369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w5 f37370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bk3 f37371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final df3 f37372h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jf3 f37373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37374k;

    public cf3(me3 me3Var, kf3 kf3Var, yf3 yf3Var, bg3 bg3Var, mg3 mg3Var, w5 w5Var, ck3 ck3Var, df3 df3Var, boolean z5) {
        this.f37365a = me3Var;
        this.f37366b = kf3Var;
        this.f37367c = yf3Var;
        this.f37368d = bg3Var;
        this.f37369e = mg3Var;
        this.f37370f = w5Var;
        this.f37371g = ck3Var;
        this.f37372h = df3Var;
        this.i = z5;
    }

    @Override // yads.nf3
    public final void a() {
        if (this.f37374k) {
            this.f37369e.a(kg3.f40195e);
            this.f37371g.j();
        }
    }

    @Override // yads.nf3
    public final void b() {
        if (this.f37374k) {
            this.f37369e.a(kg3.i);
            this.f37371g.f();
        }
    }

    @Override // yads.nf3
    public final void c() {
        this.f37374k = true;
        this.f37369e.a(kg3.f40195e);
        yf3 yf3Var = this.f37367c;
        if (!yf3Var.f45047d) {
            yf3Var.f45047d = true;
            yf3Var.f45045b.a();
            yf3Var.f45046c.post(new xf3(yf3Var));
        }
        this.f37373j = new jf3(this.f37366b, this.f37371g);
        this.f37372h.b(this.f37365a);
    }

    @Override // yads.nf3
    public final void d() {
        this.f37374k = false;
        this.f37369e.a(kg3.f40197g);
        if (this.i) {
            this.f37371g.b();
        }
        this.f37367c.a();
        this.f37368d.b();
        this.f37372h.c(this.f37365a);
        this.f37366b.a((cf3) null);
        this.f37372h.g(this.f37365a);
    }

    @Override // yads.nf3
    public final void e() {
        this.f37371g.g();
        this.f37374k = false;
        this.f37369e.a(kg3.f40196f);
        this.f37367c.a();
        this.f37368d.b();
        this.f37372h.h(this.f37365a);
        this.f37366b.a((cf3) null);
        this.f37372h.g(this.f37365a);
    }

    @Override // yads.nf3
    public final void f() {
        this.f37369e.a(kg3.f40195e);
        if (this.f37374k) {
            this.f37371g.c();
        }
        yf3 yf3Var = this.f37367c;
        if (!yf3Var.f45047d) {
            yf3Var.f45047d = true;
            yf3Var.f45045b.a();
            yf3Var.f45046c.post(new xf3(yf3Var));
        }
        this.f37372h.d(this.f37365a);
    }

    @Override // yads.nf3
    public final void h() {
        this.f37369e.a(kg3.f40194d);
        this.f37370f.a(v5.f43890v);
        this.f37372h.j(this.f37365a);
    }

    @Override // yads.nf3
    public final void i() {
        this.f37369e.a(kg3.f40198h);
        if (this.f37374k) {
            this.f37371g.d();
        }
        this.f37372h.k(this.f37365a);
    }

    @Override // yads.nf3
    public final void onVolumeChanged(float f10) {
        this.f37371g.a(f10);
        jf3 jf3Var = this.f37373j;
        if (jf3Var != null) {
            if (f10 == 0.0f) {
                if (!jf3Var.f39852b) {
                    jf3Var.f39852b = true;
                    jf3Var.f39851a.l();
                }
            } else if (jf3Var.f39852b) {
                jf3Var.f39852b = false;
                jf3Var.f39851a.a();
            }
        }
        this.f37372h.a(this.f37365a, f10);
    }

    @Override // yads.nf3
    public final void a(mf3 mf3Var) {
        kg3 kg3Var;
        this.f37374k = false;
        mg3 mg3Var = this.f37369e;
        if (mg3Var.f40913a.contains(kg3.f40194d)) {
            kg3Var = kg3.f40199j;
        } else {
            kg3Var = kg3.f40200k;
        }
        this.f37369e.a(kg3Var);
        this.f37367c.a();
        this.f37368d.a(mf3Var);
        this.f37371g.a(mf3Var);
        this.f37372h.a(this.f37365a, mf3Var);
        this.f37366b.a((cf3) null);
        this.f37372h.g(this.f37365a);
    }
}
