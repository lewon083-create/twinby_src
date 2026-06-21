package a0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import com.google.android.gms.internal.measurement.b4;
import g0.a3;
import g0.w2;
import g0.x2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends q2 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final y1 f14x = new y1();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j0.d f15y = hl.d.s();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z1 f16q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Executor f17r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g0.d2 f18s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l2 f19t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q0.m f20u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o2 f21v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g0.e2 f22w;

    @Override // a0.q2
    public final void A() {
        G();
    }

    @Override // a0.q2
    public final void D(Rect rect) {
        this.f211k = rect;
        H();
    }

    public final void G() {
        g0.e2 e2Var = this.f22w;
        if (e2Var != null) {
            e2Var.b();
            this.f22w = null;
        }
        l2 l2Var = this.f19t;
        if (l2Var != null) {
            l2Var.a();
            this.f19t = null;
        }
        q0.m mVar = this.f20u;
        if (mVar != null) {
            mVar.c();
            this.f20u = null;
        }
        o2 o2Var = this.f21v;
        if (o2Var != null) {
            synchronized (o2Var.f178a) {
                o2Var.f191o = null;
                o2Var.f192p = null;
            }
        }
        this.f21v = null;
    }

    public final void H() {
        g0.f0 f0VarE = e();
        q0.m mVar = this.f20u;
        if (f0VarE == null || mVar == null) {
            return;
        }
        b4.G(new q0.j(mVar, j(f0VarE, o(f0VarE)), c()));
    }

    public final void I(z1 z1Var) {
        b4.e();
        this.f16q = z1Var;
        this.f17r = f15y;
        if (d() != null) {
            J((g0.v1) this.f209h, this.i);
            r();
        }
        q();
    }

    public final void J(g0.v1 v1Var, g0.n nVar) {
        b4.e();
        g0.f0 f0VarE = e();
        Objects.requireNonNull(f0VarE);
        G();
        f2.g.h(null, this.f20u == null);
        Matrix matrix = this.f212l;
        boolean zN = f0VarE.n();
        Size size = nVar.f19677a;
        Rect rect = this.f211k;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        q0.m mVar = new q0.m(1, 34, nVar, matrix, zN, rect, j(f0VarE, o(f0VarE)), c(), f0VarE.n() && o(f0VarE));
        this.f20u = mVar;
        mVar.a(new d1(1, this));
        o2 o2VarD = this.f20u.d(f0VarE, true);
        this.f21v = o2VarD;
        this.f19t = o2VarD.f189m;
        if (this.f16q != null) {
            H();
            z1 z1Var = this.f16q;
            z1Var.getClass();
            o2 o2Var = this.f21v;
            o2Var.getClass();
            this.f17r.execute(new d(4, z1Var, o2Var));
        }
        g0.d2 d2VarD = g0.d2.d(v1Var, nVar.f19677a);
        g0.r0 r0Var = d2VarD.f19527b;
        d2VarD.f19533h = nVar.f19680d;
        a(d2VarD, nVar);
        int iQ = v1Var.q();
        if (iQ != 0) {
            r0Var.getClass();
            if (iQ != 0) {
                ((g0.q1) r0Var.f19730e).y(x2.D, Integer.valueOf(iQ));
            }
        }
        g0.v0 v0Var = nVar.f19682f;
        if (v0Var != null) {
            r0Var.c(v0Var);
        }
        if (this.f16q != null) {
            d2VarD.b(this.f19t, nVar.f19679c, ((Integer) ((g0.i1) this.f209h).g(g0.i1.f19607l, -1)).intValue());
        }
        g0.e2 e2Var = this.f22w;
        if (e2Var != null) {
            e2Var.b();
        }
        g0.e2 e2Var2 = new g0.e2(new g1(1, this));
        this.f22w = e2Var2;
        d2VarD.f19531f = e2Var2;
        this.f18s = d2VarD;
        Object[] objArr = {d2VarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        F(Collections.unmodifiableList(arrayList));
    }

    @Override // a0.q2
    public final x2 h(boolean z5, a3 a3Var) {
        f14x.getClass();
        g0.v1 v1Var = y1.f282a;
        g0.v0 v0VarA = a3Var.a(v1Var.n(), 1);
        if (z5) {
            v0VarA = g0.v0.l(v0VarA, v1Var);
        }
        if (v0VarA == null) {
            return null;
        }
        return new g0.v1(g0.u1.u(((t0) n(v0VarA)).f224b));
    }

    @Override // a0.q2
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // a0.q2
    public final w2 n(g0.v0 v0Var) {
        return new t0(g0.q1.w(v0Var), 2);
    }

    public final String toString() {
        return "Preview:".concat(i());
    }

    @Override // a0.q2
    public final x2 v(g0.d0 d0Var, w2 w2Var) {
        w2Var.a().y(g0.h1.f19579f, 34);
        return w2Var.b();
    }

    @Override // a0.q2
    public final g0.n y(g0.v0 v0Var) {
        this.f18s.a(v0Var);
        Object[] objArr = {this.f18s.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        F(Collections.unmodifiableList(arrayList));
        h3 h3VarB = this.i.b();
        h3VarB.f28255g = v0Var;
        return h3VarB.d();
    }

    @Override // a0.q2
    public final g0.n z(g0.n nVar, g0.n nVar2) {
        com.google.android.gms.internal.auth.g.e("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + nVar + ", secondaryStreamSpec " + nVar2);
        J((g0.v1) this.f209h, nVar);
        return nVar;
    }
}
