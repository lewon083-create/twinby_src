package g2;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class d1 extends j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsets.Builder f19851e;

    public d1() {
        this.f19851e = androidx.lifecycle.j0.f();
    }

    @Override // g2.j1
    public x1 b() {
        a();
        x1 x1VarG = x1.g(null, this.f19851e.build());
        x1.b[] bVarArr = this.f19870b;
        t1 t1Var = x1VarG.f19943a;
        t1Var.u(bVarArr);
        t1Var.t(null);
        t1Var.y(this.f19871c);
        t1Var.z(this.f19872d);
        return x1VarG;
    }

    @Override // g2.j1
    public void e(x1.b bVar) {
        this.f19851e.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // g2.j1
    public void f(x1.b bVar) {
        this.f19851e.setStableInsets(bVar.d());
    }

    @Override // g2.j1
    public void g(x1.b bVar) {
        this.f19851e.setSystemGestureInsets(bVar.d());
    }

    @Override // g2.j1
    public void h(x1.b bVar) {
        this.f19851e.setSystemWindowInsets(bVar.d());
    }

    @Override // g2.j1
    public void i(x1.b bVar) {
        this.f19851e.setTappableElementInsets(bVar.d());
    }

    public d1(x1 x1Var) {
        WindowInsets.Builder builderF;
        super(x1Var);
        WindowInsets windowInsetsF = x1Var.f();
        if (windowInsetsF != null) {
            builderF = androidx.lifecycle.j0.g(windowInsetsF);
        } else {
            builderF = androidx.lifecycle.j0.f();
        }
        this.f19851e = builderF;
    }
}
