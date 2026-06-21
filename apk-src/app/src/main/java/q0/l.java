package q0;

import android.util.Size;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import g0.a1;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j1.k f31590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j1.h f31591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a1 f31592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f31593r;

    public l(Size size, int i) {
        super(size, i);
        this.f31590o = i0.o.w(new x0(24, this));
    }

    @Override // g0.a1
    public final void a() {
        super.a();
        b4.G(new g(this, 2));
    }

    @Override // g0.a1
    public final ed.d f() {
        return this.f31590o;
    }

    public final boolean g(a1 a1Var, Runnable runnable) {
        boolean z5;
        Size size = this.f19516h;
        b4.e();
        a1Var.getClass();
        int i = a1Var.i;
        Size size2 = a1Var.f19516h;
        a1 a1Var2 = this.f31592q;
        if (a1Var2 == a1Var) {
            return false;
        }
        f2.g.h("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", a1Var2 == null);
        f2.g.a("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i10 = this.i;
        f2.g.a(om1.j("The provider's format(", i10, ") must match the parent(", i, ")"), i10 == i);
        synchronized (this.f19509a) {
            z5 = this.f19511c;
        }
        f2.g.h("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z5);
        this.f31592q = a1Var;
        k0.j.g(a1Var.c(), this.f31591p);
        a1Var.d();
        k0.j.f(this.f19513e).a(new i(a1Var, 1), hl.d.j());
        k0.j.f(a1Var.f19515g).a(runnable, hl.d.s());
        return true;
    }
}
