package q0;

import a0.h2;
import a0.l2;
import a0.n2;
import a0.o2;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.internal.measurement.b4;
import g0.f0;
import g0.z0;
import i0.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f31595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f31597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0.n f31600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31601h;
    public int i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o2 f31603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f31604l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31602j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f31605m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31606n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f31607o = new ArrayList();

    public m(int i, int i10, g0.n nVar, Matrix matrix, boolean z5, Rect rect, int i11, int i12, boolean z10) {
        this.f31599f = i;
        this.f31594a = i10;
        this.f31600g = nVar;
        this.f31595b = matrix;
        this.f31596c = z5;
        this.f31597d = rect;
        this.i = i11;
        this.f31601h = i12;
        this.f31598e = z10;
        this.f31604l = new l(nVar.f19677a, i10);
    }

    public final void a(Runnable runnable) {
        b4.e();
        b();
        this.f31605m.add(runnable);
    }

    public final void b() {
        f2.g.h("Edge is already closed.", !this.f31606n);
    }

    public final void c() {
        b4.e();
        this.f31604l.a();
        this.f31606n = true;
        this.f31607o.clear();
        this.f31605m.clear();
    }

    public final o2 d(f0 f0Var, boolean z5) {
        b4.e();
        b();
        g0.n nVar = this.f31600g;
        o2 o2Var = new o2(nVar.f19677a, f0Var, z5, nVar.f19679c, nVar.f19680d, nVar.f19681e, new h(this, 0));
        try {
            l2 l2Var = o2Var.f189m;
            l lVar = this.f31604l;
            Objects.requireNonNull(lVar);
            if (lVar.g(l2Var, new g(lVar, 0))) {
                k0.j.f(lVar.f19513e).a(new i(l2Var, 0), hl.d.j());
            }
            this.f31603k = o2Var;
            f();
            return o2Var;
        } catch (z0 e3) {
            throw new AssertionError("Surface is somehow already closed", e3);
        } catch (RuntimeException e7) {
            o2Var.d();
            throw e7;
        }
    }

    public final void e() {
        boolean z5;
        b4.e();
        b();
        l lVar = this.f31604l;
        lVar.getClass();
        b4.e();
        if (lVar.f31592q == null) {
            synchronized (lVar.f19509a) {
                z5 = lVar.f19511c;
            }
            if (!z5) {
                return;
            }
        }
        this.f31602j = false;
        this.f31604l.a();
        this.f31604l = new l(this.f31600g.f19677a, this.f31594a);
        Iterator it = this.f31605m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        n2 n2Var;
        Executor executor;
        b4.e();
        a0.m mVar = new a0.m(this.f31597d, this.i, this.f31601h, this.f31596c, this.f31595b, this.f31598e);
        o2 o2Var = this.f31603k;
        if (o2Var != null) {
            synchronized (o2Var.f178a) {
                o2Var.f190n = mVar;
                n2Var = o2Var.f191o;
                executor = o2Var.f192p;
            }
            if (n2Var != null && executor != null) {
                executor.execute(new h2(n2Var, mVar, 0));
            }
        }
        Iterator it = this.f31607o.iterator();
        while (it.hasNext()) {
            ((f2.a) it.next()).accept(mVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurfaceEdge{targets=");
        sb2.append(this.f31599f);
        sb2.append(", format=");
        sb2.append(this.f31594a);
        sb2.append(", resolution=");
        sb2.append(this.f31600g.f19677a);
        sb2.append(", cropRect=");
        sb2.append(this.f31597d);
        sb2.append(", rotationDegrees=");
        sb2.append(this.i);
        sb2.append(", mirroring=");
        sb2.append(this.f31598e);
        sb2.append(", sensorToBufferTransform= ");
        Matrix matrix = this.f31595b;
        sb2.append(matrix);
        sb2.append(", rotationInTransform= ");
        sb2.append(q.b(matrix));
        sb2.append(", isMirrorInTransform= ");
        sb2.append(q.f(matrix));
        sb2.append(", isClosed=");
        sb2.append(this.f31606n);
        sb2.append('}');
        return sb2.toString();
    }
}
