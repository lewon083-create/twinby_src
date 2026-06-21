package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8488a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f8489b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n90 f8490c = new n90(27, new CopyOnWriteArrayList(), null, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ly1 f8491d = new ly1(new CopyOnWriteArrayList(), (hy1) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f8492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ci f8493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fv1 f8494g;

    public abstract void a(n5 n5Var);

    public abstract void b(gy1 gy1Var);

    public abstract gy1 c(hy1 hy1Var, i iVar, long j10);

    public abstract n5 f();

    public abstract void h(em1 em1Var);

    public abstract void j();

    public final void k(ci ciVar) {
        this.f8493f = ciVar;
        ArrayList arrayList = this.f8488a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((iy1) arrayList.get(i)).a(this, ciVar);
        }
    }

    public final void l(ny1 ny1Var) {
        CopyOnWriteArrayList<jy1> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8490c.f8249d;
        for (jy1 jy1Var : copyOnWriteArrayList) {
            if (jy1Var.f7007b == ny1Var) {
                copyOnWriteArrayList.remove(jy1Var);
            }
        }
    }

    public final void m(vw1 vw1Var) {
        CopyOnWriteArrayList<uw1> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8491d.f7676c;
        for (uw1 uw1Var : copyOnWriteArrayList) {
            if (uw1Var.f11121a == vw1Var) {
                copyOnWriteArrayList.remove(uw1Var);
            }
        }
    }

    public final void n(iy1 iy1Var, em1 em1Var, fv1 fv1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f8492e;
        boolean z5 = true;
        if (looper != null && looper != looperMyLooper) {
            z5 = false;
        }
        ix.o(z5);
        this.f8494g = fv1Var;
        ci ciVar = this.f8493f;
        this.f8488a.add(iy1Var);
        if (this.f8492e == null) {
            this.f8492e = looperMyLooper;
            this.f8489b.add(iy1Var);
            h(em1Var);
        } else if (ciVar != null) {
            o(iy1Var);
            iy1Var.a(this, ciVar);
        }
    }

    public final void o(iy1 iy1Var) {
        this.f8492e.getClass();
        HashSet hashSet = this.f8489b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(iy1Var);
        if (zIsEmpty) {
            g();
        }
    }

    public final void p(iy1 iy1Var) {
        HashSet hashSet = this.f8489b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(iy1Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void q(iy1 iy1Var) {
        ArrayList arrayList = this.f8488a;
        arrayList.remove(iy1Var);
        if (!arrayList.isEmpty()) {
            p(iy1Var);
            return;
        }
        this.f8492e = null;
        this.f8493f = null;
        this.f8494g = null;
        this.f8489b.clear();
        j();
    }

    public abstract void r();

    public void d() {
    }

    public void e() {
    }

    public void g() {
    }

    public void i() {
    }
}
