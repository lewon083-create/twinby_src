package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zn2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk3 f45491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u62 f45492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xn2 f45493c;

    public zn2(gk3 gk3Var, u62 u62Var, xn2 xn2Var) {
        this.f45491a = gk3Var;
        this.f45492b = u62Var;
        this.f45493c = xn2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h72 h72Var = (h72) this.f45491a.b();
        if (h72Var != null) {
            wn2 wn2Var = h72Var.f39052c.f41821a;
            this.f45493c.getClass();
            xn2.a(wn2Var);
            v62 v62Var = this.f45492b.f43574a;
            v62Var.a(v62Var.f43908g);
        }
    }
}
