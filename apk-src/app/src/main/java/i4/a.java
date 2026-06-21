package i4;

import android.os.Looper;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20826b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f20827c = new HashSet(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f20828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f20829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Looper f20830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j3.o0 f20831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t3.j f20832h;

    public a() {
        int i = 0;
        c0 c0Var = null;
        this.f20828d = new i0(new CopyOnWriteArrayList(), i, c0Var);
        this.f20829e = new i0(new CopyOnWriteArrayList(), i, c0Var);
    }

    public final i0 a(c0 c0Var) {
        return new i0(this.f20828d.f20928c, 0, c0Var);
    }

    public abstract a0 b(c0 c0Var, bb.e eVar, long j10);

    public final void c(d0 d0Var) {
        HashSet hashSet = this.f20827c;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(d0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void f(d0 d0Var) {
        this.f20830f.getClass();
        HashSet hashSet = this.f20827c;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(d0Var);
        if (zIsEmpty) {
            g();
        }
    }

    public j3.o0 h() {
        return null;
    }

    public abstract j3.x j();

    public boolean k() {
        return true;
    }

    public abstract void l();

    public final void n(d0 d0Var, p3.e0 e0Var, t3.j jVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f20830f;
        h5.h(looper == null || looper == looperMyLooper);
        this.f20832h = jVar;
        j3.o0 o0Var = this.f20831g;
        this.f20826b.add(d0Var);
        if (this.f20830f == null) {
            this.f20830f = looperMyLooper;
            this.f20827c.add(d0Var);
            p(e0Var);
        } else if (o0Var != null) {
            f(d0Var);
            d0Var.a(this, o0Var);
        }
    }

    public abstract void p(p3.e0 e0Var);

    public final void q(j3.o0 o0Var) {
        this.f20831g = o0Var;
        Iterator it = this.f20826b.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).a(this, o0Var);
        }
    }

    public abstract void r(a0 a0Var);

    public final void s(d0 d0Var) {
        ArrayList arrayList = this.f20826b;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            c(d0Var);
            return;
        }
        this.f20830f = null;
        this.f20831g = null;
        this.f20832h = null;
        this.f20827c.clear();
        t();
    }

    public abstract void t();

    public final void u(x3.e eVar) {
        CopyOnWriteArrayList<x3.d> copyOnWriteArrayList = this.f20829e.f20928c;
        for (x3.d dVar : copyOnWriteArrayList) {
            if (dVar.f35761a == eVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void v(j0 j0Var) {
        CopyOnWriteArrayList<h0> copyOnWriteArrayList = this.f20828d.f20928c;
        for (h0 h0Var : copyOnWriteArrayList) {
            if (h0Var.f20920b == j0Var) {
                copyOnWriteArrayList.remove(h0Var);
            }
        }
    }

    public abstract void w(j3.x xVar);

    public void d() {
    }

    public void g() {
    }
}
