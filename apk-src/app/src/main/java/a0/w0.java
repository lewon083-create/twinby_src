package a0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import com.google.android.gms.internal.measurement.b4;
import g0.a3;
import g0.w2;
import g0.x2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends q2 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u0 f240z = new u0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z0 f242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Executor f243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r0 f244t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Rect f245u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Matrix f246v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g0.d2 f247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l2 f248x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g0.e2 f249y;

    public w0(g0.f1 f1Var) {
        super(f1Var);
        this.f241q = new Object();
    }

    @Override // a0.q2
    public final void A() {
        b4.e();
        g0.e2 e2Var = this.f249y;
        if (e2Var != null) {
            e2Var.b();
            this.f249y = null;
        }
        l2 l2Var = this.f248x;
        if (l2Var != null) {
            l2Var.a();
            this.f248x = null;
        }
        synchronized (this.f241q) {
            z0 z0Var = this.f242r;
            z0Var.f309v = false;
            z0Var.d();
            this.f242r = null;
        }
    }

    @Override // a0.q2
    public final void B(Matrix matrix) {
        super.B(matrix);
        synchronized (this.f241q) {
            try {
                z0 z0Var = this.f242r;
                if (z0Var != null) {
                    z0Var.j(matrix);
                }
                this.f246v = matrix;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a0.q2
    public final void D(Rect rect) {
        this.f211k = rect;
        synchronized (this.f241q) {
            try {
                z0 z0Var = this.f242r;
                if (z0Var != null) {
                    z0Var.k(rect);
                }
                this.f245u = rect;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g0.d2 G(g0.f1 r17, g0.n r18) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.w0.G(g0.f1, g0.n):g0.d2");
    }

    public final int H() {
        return ((Integer) ((g0.f1) this.f209h).g(g0.f1.P, 1)).intValue();
    }

    public final void I() {
        r0 r0Var;
        synchronized (this.f241q) {
            try {
                g0.f1 f1Var = (g0.f1) this.f209h;
                if (((Integer) f1Var.g(g0.f1.M, 0)).intValue() == 1) {
                    this.f242r = new a1();
                } else {
                    this.f242r = new f1((Executor) f1Var.g(l0.l.K, hl.d.n()));
                }
                this.f242r.f293e = H();
                this.f242r.f294f = ((Boolean) ((g0.f1) this.f209h).g(g0.f1.R, Boolean.FALSE)).booleanValue();
                g0.f0 f0VarE = e();
                Boolean bool = (Boolean) ((g0.f1) this.f209h).g(g0.f1.Q, null);
                boolean zH = f0VarE != null ? f0VarE.p().r().h(OnePixelShiftQuirk.class) : false;
                z0 z0Var = this.f242r;
                if (bool != null) {
                    zH = bool.booleanValue();
                }
                z0Var.f295g = zH;
                if (f0VarE != null) {
                    this.f242r.f291c = j(f0VarE, false);
                }
                Rect rect = this.f245u;
                if (rect != null) {
                    this.f242r.k(rect);
                }
                Matrix matrix = this.f246v;
                if (matrix != null) {
                    this.f242r.j(matrix);
                }
                Executor executor = this.f243s;
                if (executor != null && (r0Var = this.f244t) != null) {
                    this.f242r.i(executor, r0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void J() {
        synchronized (this.f241q) {
            try {
                g0.f0 f0VarE = e();
                if (f0VarE != null) {
                    this.f242r.f291c = j(f0VarE, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a0.q2
    public final x2 h(boolean z5, a3 a3Var) {
        f240z.getClass();
        g0.f1 f1Var = u0.f225a;
        g0.v0 v0VarA = a3Var.a(f1Var.n(), 1);
        if (z5) {
            v0VarA = g0.v0.l(v0VarA, f1Var);
        }
        if (v0VarA == null) {
            return null;
        }
        return new g0.f1(g0.u1.u(((t0) n(v0VarA)).f224b));
    }

    @Override // a0.q2
    public final w2 n(g0.v0 v0Var) {
        return new t0(g0.q1.w(v0Var), 0);
    }

    public final String toString() {
        return "ImageAnalysis:".concat(i());
    }

    @Override // a0.q2
    public final x2 v(g0.d0 d0Var, w2 w2Var) {
        synchronized (this.f241q) {
        }
        return w2Var.b();
    }

    @Override // a0.q2
    public final g0.n y(g0.v0 v0Var) {
        this.f247w.a(v0Var);
        Object[] objArr = {this.f247w.c()};
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
        com.google.android.gms.internal.auth.g.e("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + nVar + ", secondaryStreamSpec " + nVar2);
        g0.f1 f1Var = (g0.f1) this.f209h;
        g();
        g0.d2 d2VarG = G(f1Var, nVar);
        this.f247w = d2VarG;
        Object[] objArr = {d2VarG.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        F(Collections.unmodifiableList(arrayList));
        return nVar;
    }
}
