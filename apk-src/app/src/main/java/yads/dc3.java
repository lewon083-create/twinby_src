package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf3 f37718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hk3 f37719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me3 f37720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mg3 f37721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bk3 f37722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w5 f37723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bg3 f37724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yf3 f37725h;
    public final cf3 i;

    public dc3(Context context, nu2 nu2Var, kf3 kf3Var, hk3 hk3Var, me3 me3Var, ej3 ej3Var, mg3 mg3Var, ck3 ck3Var, uf3 uf3Var, df3 df3Var, v9 v9Var, boolean z5) {
        this.f37718a = kf3Var;
        this.f37719b = hk3Var;
        this.f37720c = me3Var;
        this.f37721d = mg3Var;
        this.f37722e = ck3Var;
        w5 w5Var = new w5();
        this.f37723f = w5Var;
        bg3 bg3Var = new bg3(context, nu2Var, v9Var, me3Var, w5Var, mg3Var, hk3Var, ej3Var, ck3Var);
        this.f37724g = bg3Var;
        yf3 yf3Var = new yf3(kf3Var, uf3Var);
        this.f37725h = yf3Var;
        this.i = new cf3(me3Var, kf3Var, yf3Var, bg3Var, mg3Var, w5Var, ck3Var, df3Var, z5);
        new wf3(context, me3Var, hk3Var, mg3Var, ck3Var, kf3Var, df3Var).a(uf3Var, z5);
    }

    public final void a() {
        this.f37718a.a(this.i);
        this.f37718a.a(this.f37720c);
        this.f37723f.a(v5.f43890v, null);
        View view = this.f37719b.getView();
        if (view != null) {
            this.f37722e.a(view, this.f37719b.a());
        }
        hg3 hg3Var = this.f37724g.f37019d;
        if (!hg3Var.f39186e && !hg3Var.f39185d) {
            hg3Var.f39186e = true;
            hg3Var.f39184c.post(new gg3(hg3Var));
        }
        this.f37721d.a(kg3.f40193c);
    }

    public final void a(dg3 dg3Var) {
        bg3 bg3Var = this.f37724g;
        bg3Var.i.setValue(bg3Var, bg3.f37014k[0], dg3Var);
    }
}
