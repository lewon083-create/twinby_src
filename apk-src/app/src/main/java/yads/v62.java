package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk3 f43902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p62 f43903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final py2 f43904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s52 f43905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ij2 f43906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i72 f43907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ce2 f43908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ce2 f43909h;
    public final vn2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t62 f43910j = new t62(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ph1 f43911k = new ph1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ce2 f43912l;

    public v62(Context context, v9 v9Var, nu2 nu2Var, r52 r52Var, vd3 vd3Var, di3 di3Var, gk3 gk3Var, if3 if3Var, ck3 ck3Var, yh3 yh3Var, p62 p62Var, oi2 oi2Var, py2 py2Var) {
        this.f43902a = gk3Var;
        this.f43903b = p62Var;
        this.f43904c = py2Var;
        this.i = new vn2(gk3Var, new u62(this));
        l72 l72Var = new l72(gk3Var);
        this.f43905d = new s52(r52Var);
        this.f43907f = new i72(r52Var);
        uf3 uf3Var = new uf3();
        new z52(gk3Var, r52Var, l72Var, p62Var).a(uf3Var);
        o62 o62Var = new o62(context, v9Var, nu2Var, r52Var, vd3Var.a(), l72Var, if3Var, ck3Var, uf3Var, yh3Var);
        co2 co2Var = new co2(r52Var, vd3Var.a(), uf3Var);
        j72 j72Var = new j72(r52Var, di3Var);
        ij2 ij2Var = new ij2(vd3Var, new x31(context, new u32(v9Var), oi2Var));
        this.f43906e = ij2Var;
        this.f43909h = new ce2(gk3Var, o62Var, j72Var, ij2Var);
        this.f43908g = new ce2(gk3Var, co2Var, j72Var, ij2Var);
    }

    public final void a(ce2 ce2Var) {
        this.f43912l = ce2Var;
        if (ce2Var != null) {
            ce2Var.f37356e.f37004a = this.f43910j;
        }
        if (ce2Var != null) {
            ce2Var.f37353b.a(ce2Var.f37356e);
            ce2Var.f37353b.play();
        }
    }
}
