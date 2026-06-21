package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class np0 implements ea.a, z60, l60, i60, p60, h70, bp0, v80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sq0 f8411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f8412c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f8413d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f8414e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f8415f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f8416g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f8417h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public np0 f8418j = null;

    public np0(sq0 sq0Var) {
        this.f8411b = sq0Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void F(ru ruVar, String str, String str2) {
        int i = ruVar.f10066c;
        String str3 = ruVar.f10065b;
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.F(ruVar, str, str2);
            return;
        }
        Object obj = this.f8414e.get();
        if (obj != null) {
            try {
                ((hv) obj).Z2(new qv(str3, i));
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f8416g.get();
        if (obj2 != null) {
            try {
                mv mvVar = (mv) obj2;
                qv qvVar = new qv(str3, i);
                Parcel parcelD0 = mvVar.D0();
                vg.e(parcelD0, qvVar);
                parcelD0.writeString(str);
                parcelD0.writeString(str2);
                mvVar.L1(parcelD0, 2);
            } catch (RemoteException e10) {
                u9.i.k("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f8415f.get();
        if (obj3 != null) {
            try {
                uu uuVar = (uu) obj3;
                Parcel parcelD02 = uuVar.D0();
                vg.e(parcelD02, ruVar);
                uuVar.L1(parcelD02, 5);
            } catch (RemoteException e12) {
                u9.i.k("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        Object obj4 = this.f8417h.get();
        if (obj4 == null) {
            return;
        }
        try {
            tu tuVar = (tu) obj4;
            Parcel parcelD03 = tuVar.D0();
            vg.e(parcelD03, ruVar);
            parcelD03.writeString(str);
            parcelD03.writeString(str2);
            tuVar.L1(parcelD03, 2);
        } catch (RemoteException e14) {
            u9.i.k("#007 Could not call remote method.", e14);
        } catch (NullPointerException e15) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e15);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void H() {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.H();
            return;
        }
        in0 in0Var = this.f8411b.f10376a;
        if (in0Var != null) {
            g gVar = (g) in0Var.f6553c;
            synchronized (gVar) {
                gVar.f5552b = 1;
                gVar.f();
            }
        }
        Object obj = this.f8414e.get();
        if (obj != null) {
            try {
                ((hv) obj).c();
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f8415f.get();
        if (obj2 == null) {
            return;
        }
        try {
            uu uuVar = (uu) obj2;
            uuVar.L1(uuVar.D0(), 4);
        } catch (RemoteException e10) {
            u9.i.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void J() {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.J();
        } else {
            vv.n(this.f8414e, l80.f7442z);
        }
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void K(q9.x1 x1Var) {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.K(x1Var);
            return;
        }
        int i = x1Var.f31976b;
        AtomicReference atomicReference = this.f8413d;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((lv) obj).a(x1Var);
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((lv) obj2).t(i);
            } catch (RemoteException e10) {
                u9.i.k("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f8415f.get();
        if (obj3 == null) {
            return;
        }
        try {
            uu uuVar = (uu) obj3;
            Parcel parcelD0 = uuVar.D0();
            parcelD0.writeInt(i);
            uuVar.L1(parcelD0, 7);
        } catch (RemoteException e12) {
            u9.i.k("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void N() {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.N();
            return;
        }
        AtomicReference atomicReference = this.f8414e;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((hv) obj).i();
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f8415f.get();
        if (obj2 != null) {
            try {
                uu uuVar = (uu) obj2;
                uuVar.L1(uuVar.D0(), 2);
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
            ((hv) obj3).d();
        } catch (RemoteException e12) {
            u9.i.k("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final void a(q9.h3 h3Var) {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.a(h3Var);
            return;
        }
        Object obj = this.i.get();
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
        this.f8418j = (np0) bp0Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void c() {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.c();
            return;
        }
        Object obj = this.f8415f.get();
        if (obj == null) {
            return;
        }
        try {
            uu uuVar = (uu) obj;
            uuVar.L1(uuVar.D0(), 8);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // ea.a
    public final void g() {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.g();
        } else {
            vv.n(this.f8412c, mp0.f7965c);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void i() {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.i();
            return;
        }
        Object obj = this.f8415f.get();
        if (obj == null) {
            return;
        }
        try {
            uu uuVar = (uu) obj;
            uuVar.L1(uuVar.D0(), 3);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void j(q9.x1 x1Var) {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.j(x1Var);
            return;
        }
        AtomicReference atomicReference = this.f8414e;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((hv) obj).A3(x1Var);
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
            ((hv) obj2).b(x1Var.f31976b);
        } catch (RemoteException e10) {
            u9.i.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.k();
            return;
        }
        Object obj = this.f8413d.get();
        if (obj != null) {
            try {
                ((lv) obj).i();
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            } catch (NullPointerException e7) {
                u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj2 = this.f8415f.get();
        if (obj2 == null) {
            return;
        }
        try {
            uu uuVar = (uu) obj2;
            uuVar.L1(uuVar.D0(), 1);
        } catch (RemoteException e10) {
            u9.i.k("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void w() {
        np0 np0Var = this.f8418j;
        if (np0Var != null) {
            np0Var.w();
            return;
        }
        Object obj = this.f8415f.get();
        if (obj == null) {
            return;
        }
        try {
            uu uuVar = (uu) obj;
            uuVar.L1(uuVar.D0(), 6);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void L() {
    }
}
