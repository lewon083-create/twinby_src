package mb;

import android.os.Bundle;
import android.os.SystemClock;
import h1.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ob.b2;
import ob.b4;
import ob.e4;
import ob.i1;
import ob.k2;
import ob.l1;
import ob.r2;
import ob.s0;
import ob.u2;
import ob.x;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f28816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2 f28817b;

    public a(l1 l1Var) {
        c0.i(l1Var);
        this.f28816a = l1Var;
        k2 k2Var = l1Var.f30271n;
        l1.i(k2Var);
        this.f28817b = k2Var;
    }

    @Override // ob.l2
    public final void W(Bundle bundle) {
        k2 k2Var = this.f28817b;
        ((l1) k2Var.f15951b).f30269l.getClass();
        k2Var.P(bundle, System.currentTimeMillis());
    }

    @Override // ob.l2
    public final void c0(String str) {
        l1 l1Var = this.f28816a;
        x xVar = l1Var.f30272o;
        l1.f(xVar);
        l1Var.f30269l.getClass();
        xVar.D(SystemClock.elapsedRealtime(), str);
    }

    @Override // ob.l2
    public final String d() {
        return (String) this.f28817b.f30222h.get();
    }

    @Override // ob.l2
    public final long e() {
        e4 e4Var = this.f28816a.f30267j;
        l1.h(e4Var);
        return e4Var.x0();
    }

    @Override // ob.l2
    public final String f() {
        u2 u2Var = ((l1) this.f28817b.f15951b).f30270m;
        l1.i(u2Var);
        r2 r2Var = u2Var.f30444d;
        if (r2Var != null) {
            return r2Var.f30386b;
        }
        return null;
    }

    @Override // ob.l2
    public final void f0(String str) {
        l1 l1Var = this.f28816a;
        x xVar = l1Var.f30272o;
        l1.f(xVar);
        l1Var.f30269l.getClass();
        xVar.E(SystemClock.elapsedRealtime(), str);
    }

    @Override // ob.l2
    public final void g0(String str, String str2, Bundle bundle) {
        k2 k2Var = this.f28817b;
        ((l1) k2Var.f15951b).f30269l.getClass();
        k2Var.H(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // ob.l2
    public final void h0(String str, String str2, Bundle bundle) {
        k2 k2Var = this.f28816a.f30271n;
        l1.i(k2Var);
        k2Var.Q(str, str2, bundle);
    }

    @Override // ob.l2
    public final List i0(String str, String str2) {
        k2 k2Var = this.f28817b;
        l1 l1Var = (l1) k2Var.f15951b;
        i1 i1Var = l1Var.f30266h;
        s0 s0Var = l1Var.f30265g;
        l1.k(i1Var);
        if (i1Var.I()) {
            l1.k(s0Var);
            s0Var.f30411g.f("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (l7.b.e()) {
            l1.k(s0Var);
            s0Var.f30411g.f("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        i1 i1Var2 = l1Var.f30266h;
        l1.k(i1Var2);
        i1Var2.M(atomicReference, 5000L, "get conditional user properties", new aa.b(k2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return e4.q0(list);
        }
        l1.k(s0Var);
        s0Var.f30411g.g(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // ob.l2
    public final int j0(String str) {
        k2 k2Var = this.f28817b;
        k2Var.getClass();
        c0.f(str);
        ((l1) k2Var.f15951b).getClass();
        return 25;
    }

    @Override // ob.l2
    public final Map k0(String str, String str2, boolean z5) {
        k2 k2Var = this.f28817b;
        l1 l1Var = (l1) k2Var.f15951b;
        i1 i1Var = l1Var.f30266h;
        s0 s0Var = l1Var.f30265g;
        l1.k(i1Var);
        if (i1Var.I()) {
            l1.k(s0Var);
            s0Var.f30411g.f("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (l7.b.e()) {
            l1.k(s0Var);
            s0Var.f30411g.f("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        i1 i1Var2 = l1Var.f30266h;
        l1.k(i1Var2);
        i1Var2.M(atomicReference, 5000L, "get user properties", new b2(k2Var, atomicReference, str, str2, z5));
        List<b4> list = (List) atomicReference.get();
        if (list == null) {
            l1.k(s0Var);
            s0Var.f30411g.g(Boolean.valueOf(z5), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (b4 b4Var : list) {
            Object objH = b4Var.h();
            if (objH != null) {
                eVar.put(b4Var.f29965c, objH);
            }
        }
        return eVar;
    }

    @Override // ob.l2
    public final String m() {
        u2 u2Var = ((l1) this.f28817b.f15951b).f30270m;
        l1.i(u2Var);
        r2 r2Var = u2Var.f30444d;
        if (r2Var != null) {
            return r2Var.f30385a;
        }
        return null;
    }

    @Override // ob.l2
    public final String n() {
        return this.f28817b.R();
    }
}
