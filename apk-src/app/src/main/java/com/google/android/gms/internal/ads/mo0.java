package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mo0 implements l60, e70, bp0, s9.l, h70, p60, v80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sq0 f7956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f7957c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f7958d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f7959e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f7960f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f7961g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f7962h = new AtomicReference();
    public mo0 i = null;

    public mo0(sq0 sq0Var) {
        this.f7956b = sq0Var;
    }

    @Override // s9.l
    public final void A2() {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.A2();
        } else {
            vv.n(this.f7961g, l80.f7440x);
        }
    }

    @Override // s9.l
    public final void E0(int i) {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.E0(i);
            return;
        }
        Object obj = this.f7961g.get();
        if (obj == null) {
            return;
        }
        try {
            ((s9.l) obj).E0(i);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void J() {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.J();
            return;
        }
        Object obj = this.f7959e.get();
        if (obj == null) {
            return;
        }
        try {
            ((fi) obj).k();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void K(q9.x1 x1Var) {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.K(x1Var);
            return;
        }
        AtomicReference atomicReference = this.f7957c;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((di) obj).d0(x1Var);
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((di) obj2).E(x1Var.f31976b);
        } catch (RemoteException e10) {
            u9.i.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final void a(q9.h3 h3Var) {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.a(h3Var);
            return;
        }
        Object obj = this.f7962h.get();
        if (obj == null) {
            return;
        }
        try {
            ((q9.s1) obj).l3(h3Var);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.bp0
    public final void b(bp0 bp0Var) {
        this.i = (mo0) bp0Var;
    }

    public final void c(u30 u30Var) {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.c(u30Var);
            return;
        }
        Object obj = this.f7957c.get();
        if (obj == null) {
            return;
        }
        try {
            ((di) obj).q2(u30Var);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // s9.l
    public final void d3() {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.d3();
        } else {
            vv.n(this.f7961g, l80.f7441y);
        }
    }

    @Override // com.google.android.gms.internal.ads.e70
    public final void e() {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.e();
        } else {
            vv.n(this.f7960f, l80.f7439w);
        }
    }

    public final void g() {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.g();
            return;
        }
        in0 in0Var = this.f7956b.f10376a;
        if (in0Var != null) {
            g gVar = (g) in0Var.f6553c;
            synchronized (gVar) {
                gVar.f5552b = 1;
                gVar.f();
            }
        }
        if (this.f7958d.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj = this.f7959e.get();
        if (obj == null) {
            return;
        }
        try {
            ((fi) obj).g();
        } catch (RemoteException e10) {
            u9.i.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void j(q9.x1 x1Var) {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.j(x1Var);
            return;
        }
        Object obj = this.f7959e.get();
        if (obj == null) {
            return;
        }
        try {
            ((fi) obj).j0(x1Var);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // s9.l
    public final void m() {
        mo0 mo0Var = this.i;
        if (mo0Var != null) {
            mo0Var.m();
            return;
        }
        Object obj = this.f7961g.get();
        if (obj != null) {
            try {
                ((s9.l) obj).m();
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        AtomicReference atomicReference = this.f7959e;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((fi) obj2).h();
            } catch (RemoteException e10) {
                u9.i.k("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((fi) obj3).c();
        } catch (RemoteException e12) {
            u9.i.k("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // s9.l
    public final void D0() {
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void L() {
    }

    @Override // s9.l
    public final void L1() {
    }

    @Override // s9.l
    public final void T0() {
    }

    @Override // s9.l
    public final void X1() {
    }

    @Override // s9.l
    public final void i2() {
    }

    @Override // s9.l
    public final void p1() {
    }

    @Override // s9.l
    public final void w1() {
    }
}
