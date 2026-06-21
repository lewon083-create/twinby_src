package a0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import g0.a3;
import g0.w2;
import g0.x2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x2 f206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x2 f207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet f208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x2 f209h;
    public g0.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x2 f210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f211k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g0.f0 f213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g0.f0 f214n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f202a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f203b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f204c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205d = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f212l = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g0.h2 f215o = g0.h2.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g0.h2 f216p = g0.h2.a();

    public q2(x2 x2Var) {
        this.f207f = x2Var;
        this.f209h = x2Var;
    }

    public void B(Matrix matrix) {
        this.f212l = new Matrix(matrix);
    }

    public final boolean C(int i) {
        Size size;
        int iS = ((g0.i1) this.f209h).s(-1);
        if (iS != -1 && iS == i) {
            return false;
        }
        w2 w2VarN = n(this.f207f);
        g0.i1 i1Var = (g0.i1) w2VarN.b();
        int iS2 = i1Var.s(-1);
        if (iS2 == -1 || iS2 != i) {
            t0 t0Var = (t0) w2VarN;
            switch (t0Var.f223a) {
                case 0:
                    t0Var.f224b.y(g0.i1.f19605j, Integer.valueOf(i));
                    break;
                case 1:
                    t0Var.f224b.y(g0.i1.f19605j, Integer.valueOf(i));
                    break;
                case 2:
                    g0.q1 q1Var = t0Var.f224b;
                    q1Var.y(g0.i1.f19605j, Integer.valueOf(i));
                    q1Var.y(g0.i1.f19606k, Integer.valueOf(i));
                    break;
                default:
                    t0Var.f224b.y(g0.i1.f19605j, Integer.valueOf(i));
                    break;
            }
        }
        if (iS2 != -1 && i != -1 && iS2 != i) {
            if (Math.abs(e.v(i) - e.v(iS2)) % 180 == 90 && (size = (Size) i1Var.g(g0.i1.f19608m, null)) != null) {
                t0 t0Var2 = (t0) w2VarN;
                Size size2 = new Size(size.getHeight(), size.getWidth());
                switch (t0Var2.f223a) {
                    case 0:
                        t0Var2.f224b.y(g0.i1.f19608m, size2);
                        break;
                    case 1:
                        t0Var2.f224b.y(g0.i1.f19608m, size2);
                        break;
                    case 2:
                        t0Var2.f224b.y(g0.i1.f19608m, size2);
                        break;
                    default:
                        throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
            }
        }
        this.f207f = w2VarN.b();
        g0.f0 f0VarE = e();
        if (f0VarE == null) {
            this.f209h = this.f207f;
            return true;
        }
        this.f209h = p(f0VarE.p(), this.f206e, this.f210j);
        return true;
    }

    public void D(Rect rect) {
        this.f211k = rect;
    }

    public final void E(g0.f0 f0Var) {
        A();
        synchronized (this.f204c) {
            try {
                g0.f0 f0Var2 = this.f213m;
                if (f0Var == f0Var2) {
                    this.f203b.remove(f0Var2);
                    this.f213m = null;
                }
                g0.f0 f0Var3 = this.f214n;
                if (f0Var == f0Var3) {
                    this.f203b.remove(f0Var3);
                    this.f214n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.i = null;
        this.f211k = null;
        this.f209h = this.f207f;
        this.f206e = null;
        this.f210j = null;
    }

    public final void F(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f215o = (g0.h2) list.get(0);
        if (list.size() > 1) {
            this.f216p = (g0.h2) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (g0.a1 a1Var : ((g0.h2) it.next()).b()) {
                if (a1Var.f19517j == null) {
                    a1Var.f19517j = getClass();
                }
            }
        }
    }

    public final void a(g0.d2 d2Var, g0.n nVar) {
        Range range = g0.n.f19676h;
        if (!range.equals(nVar.f19681e)) {
            Range range2 = nVar.f19681e;
            g0.r0 r0Var = d2Var.f19527b;
            r0Var.getClass();
            ((g0.q1) r0Var.f19730e).y(g0.s0.f19744k, range2);
            return;
        }
        synchronized (this.f204c) {
            try {
                g0.f0 f0Var = this.f213m;
                f0Var.getClass();
                ArrayList arrayListJ = f0Var.p().r().j(AeFpsRangeQuirk.class);
                boolean z5 = true;
                if (arrayListJ.size() > 1) {
                    z5 = false;
                }
                f2.g.a("There should not have more than one AeFpsRangeQuirk.", z5);
                if (!arrayListJ.isEmpty()) {
                    Range range3 = ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListJ.get(0))).f1219a;
                    if (range3 != null) {
                        range = range3;
                    }
                    g0.r0 r0Var2 = d2Var.f19527b;
                    r0Var2.getClass();
                    ((g0.q1) r0Var2.f19730e).y(g0.s0.f19744k, range);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(g0.f0 f0Var, g0.f0 f0Var2, x2 x2Var, x2 x2Var2) {
        synchronized (this.f204c) {
            this.f213m = f0Var;
            this.f214n = f0Var2;
            this.f203b.add(f0Var);
            if (f0Var2 != null) {
                this.f203b.add(f0Var2);
            }
        }
        this.f206e = x2Var;
        this.f210j = x2Var2;
        this.f209h = p(f0Var.p(), this.f206e, this.f210j);
        t();
    }

    public final int c() {
        return ((Integer) ((g0.i1) this.f209h).g(g0.i1.f19606k, -1)).intValue();
    }

    public final Size d() {
        g0.n nVar = this.i;
        if (nVar != null) {
            return nVar.f19677a;
        }
        return null;
    }

    public final g0.f0 e() {
        g0.f0 f0Var;
        synchronized (this.f204c) {
            f0Var = this.f213m;
        }
        return f0Var;
    }

    public final g0.c0 f() {
        synchronized (this.f204c) {
            try {
                g0.f0 f0Var = this.f213m;
                if (f0Var == null) {
                    return g0.c0.f19525a;
                }
                return f0Var.g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String g() {
        g0.f0 f0VarE = e();
        f2.g.g(f0VarE, "No camera attached to use case: " + this);
        return f0VarE.p().e();
    }

    public abstract x2 h(boolean z5, a3 a3Var);

    public final String i() {
        String str = (String) this.f209h.g(l0.k.I, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int j(g0.f0 f0Var, boolean z5) {
        int iN = f0Var.p().n(((g0.i1) this.f209h).s(0));
        return (f0Var.n() || !z5) ? iN : i0.q.k(-iN);
    }

    public final g0.f0 k() {
        g0.f0 f0Var;
        synchronized (this.f204c) {
            f0Var = this.f214n;
        }
        return f0Var;
    }

    public Set l(g0.d0 d0Var) {
        return null;
    }

    public Set m() {
        return Collections.EMPTY_SET;
    }

    public abstract w2 n(g0.v0 v0Var);

    public final boolean o(g0.f0 f0Var) {
        int iIntValue = ((Integer) ((g0.i1) this.f209h).g(g0.i1.f19607l, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return f0Var.f();
        }
        throw new AssertionError(l7.o.i(iIntValue, "Unknown mirrorMode: "));
    }

    public final x2 p(g0.d0 d0Var, x2 x2Var, x2 x2Var2) {
        g0.q1 q1VarV;
        if (x2Var2 != null) {
            q1VarV = g0.q1.w(x2Var2);
            q1VarV.z(l0.k.I);
        } else {
            q1VarV = g0.q1.v();
        }
        TreeMap treeMap = q1VarV.L;
        if (this.f207f.h(g0.i1.i) || this.f207f.h(g0.i1.f19608m)) {
            g0.g gVar = g0.i1.f19612q;
            if (treeMap.containsKey(gVar)) {
                q1VarV.z(gVar);
            }
        }
        x2 x2Var3 = this.f207f;
        g0.g gVar2 = g0.i1.f19612q;
        if (x2Var3.h(gVar2)) {
            g0.g gVar3 = g0.i1.f19610o;
            if (treeMap.containsKey(gVar3) && ((t0.b) this.f207f.a(gVar2)).f33336b != null) {
                q1VarV.z(gVar3);
            }
        }
        Iterator it = this.f207f.d().iterator();
        while (it.hasNext()) {
            g0.v0.t(q1VarV, q1VarV, this.f207f, (g0.g) it.next());
        }
        if (x2Var != null) {
            for (g0.g gVar4 : x2Var.d()) {
                if (!gVar4.f19561a.equals(l0.k.I.f19561a)) {
                    g0.v0.t(q1VarV, q1VarV, x2Var, gVar4);
                }
            }
        }
        if (treeMap.containsKey(g0.i1.f19608m)) {
            g0.g gVar5 = g0.i1.i;
            if (treeMap.containsKey(gVar5)) {
                q1VarV.z(gVar5);
            }
        }
        g0.g gVar6 = g0.i1.f19612q;
        if (treeMap.containsKey(gVar6)) {
            ((t0.b) q1VarV.a(gVar6)).getClass();
        }
        com.google.android.gms.internal.auth.g.e("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f208g + ", this = " + this);
        HashSet<b0.a> hashSet = this.f208g;
        if (hashSet != null) {
            i0 i0Var = d0.a.f15483c;
            Range range = g0.n.f19676h;
            d0.e eVar = d0.f.f15501c;
            for (b0.a aVar : hashSet) {
                if (aVar instanceof d0.a) {
                    i0Var = ((d0.a) aVar).f15484a;
                } else if (aVar instanceof d0.c) {
                    d0.c cVar = (d0.c) aVar;
                    range = new Range(Integer.valueOf(cVar.f15493a), Integer.valueOf(cVar.f15494b));
                } else if (aVar instanceof d0.f) {
                    eVar = ((d0.f) aVar).f15502a;
                }
            }
            if ((this instanceof a2) || l0.f.z(this)) {
                q1VarV.y(g0.h1.f19581h, i0Var);
            }
            q1VarV.y(x2.f19803y, range);
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                q1VarV.y(x2.D, 1);
                q1VarV.y(x2.E, 1);
            } else if (iOrdinal == 1) {
                q1VarV.y(x2.D, 0);
                q1VarV.y(x2.E, 2);
            } else if (iOrdinal == 2) {
                q1VarV.y(x2.D, 2);
                q1VarV.y(x2.E, 0);
            }
        }
        return v(d0Var, n(q1VarV));
    }

    public final void q() {
        this.f205d = 1;
        s();
    }

    public final void r() {
        Iterator it = this.f203b.iterator();
        while (it.hasNext()) {
            ((p2) it.next()).e(this);
        }
    }

    public final void s() {
        int iM = t.z.m(this.f205d);
        HashSet hashSet = this.f203b;
        if (iM == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((p2) it.next()).h(this);
            }
        } else {
            if (iM != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((p2) it2.next()).d(this);
            }
        }
    }

    public abstract x2 v(g0.d0 d0Var, w2 w2Var);

    public void w() {
        this.f202a = true;
    }

    public void x() {
        this.f202a = false;
    }

    public abstract g0.n y(g0.v0 v0Var);

    public abstract g0.n z(g0.n nVar, g0.n nVar2);

    public void A() {
    }

    public void t() {
    }

    public void u() {
    }
}
