package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f20 extends q9.g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9.a f5183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gd0 f5184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bi0 f5185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lk0 f5186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final se0 f5187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fw f5188h;
    public final id0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ff0 f5189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ku0 f5190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bs0 f5191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oq0 f5192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i50 f5193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sd0 f5194o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sf0 f5195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5196q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Long f5197r;

    public f20(Context context, u9.a aVar, gd0 gd0Var, bi0 bi0Var, lk0 lk0Var, se0 se0Var, fw fwVar, id0 id0Var, ff0 ff0Var, ku0 ku0Var, bs0 bs0Var, oq0 oq0Var, i50 i50Var, sd0 sd0Var, sf0 sf0Var) {
        this.f5182b = context;
        this.f5183c = aVar;
        this.f5184d = gd0Var;
        this.f5185e = bi0Var;
        this.f5186f = lk0Var;
        this.f5187g = se0Var;
        this.f5188h = fwVar;
        this.i = id0Var;
        this.f5189j = ff0Var;
        this.f5190k = ku0Var;
        this.f5191l = bs0Var;
        this.f5192m = oq0Var;
        this.f5193n = i50Var;
        this.f5194o = sd0Var;
        this.f5195p = sf0Var;
        p9.k.C.f31304k.getClass();
        this.f5197r = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // q9.h1
    public final synchronized void I(boolean z5) {
        t9.a aVar = p9.k.C.i;
        synchronized (aVar) {
            aVar.f33541a = z5;
        }
    }

    @Override // q9.h1
    public final void I0(boolean z5) throws RemoteException {
        Context context;
        try {
            context = this.f5182b;
            kx0.B(context).I(z5);
        } catch (IOException e3) {
            throw new RemoteException(e3.getMessage());
        }
        if (z5) {
            return;
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                return;
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e7) {
            p9.k.C.f31302h.d("clearStorageOnGpidPubDisable_scar", e7);
            return;
        }
        throw new RemoteException(e3.getMessage());
    }

    @Override // q9.h1
    public final void K0(q9.y2 y2Var) {
        fw fwVar = this.f5188h;
        Context context = this.f5182b;
        fwVar.getClass();
        cw cwVarO = cw.o(context);
        zv zvVar = (zv) ((ls1) cwVarO.f4349e).j();
        ((ua.a) cwVarO.f4347c).getClass();
        zvVar.a(-1, System.currentTimeMillis());
        if (((Boolean) q9.s.f31967e.f31970c.a(al.P0)).booleanValue() && fwVar.a(context) && fw.g(context)) {
            synchronized (fwVar.i) {
            }
        }
    }

    @Override // q9.h1
    public final void K3(ir irVar) {
        this.f5192m.t(irVar);
    }

    @Override // q9.h1
    public final void M0(q9.o1 o1Var) {
        this.f5189j.e(o1Var, ef0.f4931c);
    }

    @Override // q9.h1
    public final void Q3(String str, xa.a aVar) {
        String strO;
        e20 e20Var;
        Context context = this.f5182b;
        al.a(context);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Q4)).booleanValue()) {
            try {
                t9.g0 g0Var = p9.k.C.f31297c;
                strO = t9.g0.O(context);
            } catch (RemoteException | RuntimeException e3) {
                p9.k.C.f31302h.d("NonagonMobileAdsSettingManager_AppId", e3);
                strO = "";
            }
        } else {
            strO = "";
        }
        boolean z5 = true;
        String str2 = true == TextUtils.isEmpty(strO) ? str : strO;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        wk wkVar = al.J4;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        boolean zBooleanValue = ((Boolean) ykVar.a(wkVar)).booleanValue();
        wk wkVar2 = al.f3146p1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) ykVar2.a(wkVar2)).booleanValue();
        if (((Boolean) ykVar2.a(wkVar2)).booleanValue()) {
            e20Var = new e20(this, (Runnable) xa.b.X1(aVar), 0);
        } else {
            e20Var = null;
            z5 = zBooleanValue2;
        }
        e20 e20Var2 = e20Var;
        if (z5) {
            p9.k.C.f31305l.f0(this.f5182b, this.f5183c, true, null, str2, null, e20Var2, this.f5191l, this.f5194o, this.f5197r, this.f5189j.f());
        }
    }

    @Override // q9.h1
    public final void R1(tp tpVar) {
        se0 se0Var = this.f5187g;
        se0Var.getClass();
        se0Var.f10271e.f6961b.a(new l81(27, se0Var, tpVar), se0Var.f10275j);
    }

    @Override // q9.h1
    public final void a0(String str) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Ga)).booleanValue()) {
            p9.k.C.f31302h.f3946g = str;
        }
    }

    @Override // q9.h1
    public final synchronized void b0() {
        wk wkVar = al.P2;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            cw cwVar = p9.k.C.f31311r;
            synchronized (cwVar.f4347c) {
                try {
                    wq wqVar = (wq) cwVar.f4349e;
                    if (wqVar != null) {
                        rq rqVar = wqVar.f11874a;
                        qq qqVar = (qq) rqVar.f10025g;
                        if (qqVar != null) {
                            qqVar.j();
                            rqVar.f10025g = null;
                        }
                        cwVar.f4349e = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (((Boolean) sVar.f31970c.a(al.Q2)).booleanValue()) {
                q9.r.f31959g.f31962c = true;
            }
        }
    }

    @Override // q9.h1
    public final synchronized boolean e() {
        boolean z5;
        t9.a aVar = p9.k.C.i;
        synchronized (aVar) {
            z5 = aVar.f33541a;
        }
        return z5;
    }

    @Override // q9.h1
    public final void f0(String str) {
        this.f5186f.b(str);
    }

    @Override // q9.h1
    public final synchronized void f3(String str) {
        Context context = this.f5182b;
        al.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.J4)).booleanValue()) {
                p9.k.C.f31305l.f0(context, this.f5183c, true, null, str, null, null, this.f5191l, null, null, this.f5189j.f());
            }
        }
    }

    @Override // q9.h1
    public final synchronized void i() {
        if (this.f5196q) {
            u9.i.h("Mobile ads is initialized already.");
            return;
        }
        wk wkVar = al.Q2;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            q9.r.a();
        }
        Context context = this.f5182b;
        al.a(context);
        u9.a aVar = this.f5183c;
        sd0 sd0Var = this.f5194o;
        p9.k kVar = p9.k.C;
        kVar.f31302h.b(context, aVar, sd0Var);
        this.f5193n.b();
        kVar.f31303j.c(context);
        this.f5196q = true;
        this.f5187g.a();
        lk0 lk0Var = this.f5186f;
        lk0Var.getClass();
        t9.e0 e0VarG = kVar.f31302h.g();
        e0VarG.f33566c.add(new kk0(lk0Var, 2));
        lk0Var.f7556f.execute(new kk0(lk0Var, 0));
        if (((Boolean) sVar.f31970c.a(al.L4)).booleanValue()) {
            id0 id0Var = this.i;
            if (!id0Var.f6469f.getAndSet(true)) {
                t9.e0 e0VarG2 = kVar.f31302h.g();
                e0VarG2.f33566c.add(new hd0(id0Var, 0));
            }
            id0Var.f6466c.execute(new hd0(id0Var, 2));
        }
        this.f5189j.a();
        if (((Boolean) sVar.f31970c.a(al.f3229ua)).booleanValue()) {
            final int i = 3;
            hx.f6279a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.d20

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f20 f4423c;

                {
                    this.f4423c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strB;
                    qm qmVar;
                    boolean z5;
                    String str;
                    switch (i) {
                        case 0:
                            nz.f(this.f4423c.f5182b, true);
                            return;
                        case 1:
                            f20 f20Var = this.f4423c;
                            il ilVar = p9.k.C.f31307n;
                            Context context2 = f20Var.f5182b;
                            sd0 sd0Var2 = f20Var.f5194o;
                            if (ilVar.f6526c.getAndSet(true)) {
                                return;
                            }
                            ilVar.f6527d = context2;
                            ilVar.f6528e = sd0Var2;
                            if (ilVar.f6530g != null || context2 == null || (strB = q.g.b(context2, null)) == null || strB.equals(context2.getPackageName())) {
                                return;
                            }
                            q.g.a(context2, strB, ilVar);
                            return;
                        case 2:
                            f20 f20Var2 = this.f4423c;
                            f20Var2.getClass();
                            zt ztVar = new zt("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            ku0 ku0Var = f20Var2.f5190k;
                            ku0Var.getClass();
                            try {
                                try {
                                    IBinder iBinderB = u9.i.b(ku0Var.f7313c).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        qmVar = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        qmVar = iInterfaceQueryLocalInterface instanceof qm ? (qm) iInterfaceQueryLocalInterface : new qm(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                    }
                                    Parcel parcelD0 = qmVar.D0();
                                    vg.e(parcelD0, ztVar);
                                    qmVar.L1(parcelD0, 1);
                                    return;
                                } catch (Exception e3) {
                                    throw new u9.j(e3);
                                }
                            } catch (RemoteException e7) {
                                u9.i.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e7.getMessage())));
                                return;
                            } catch (u9.j e10) {
                                u9.i.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                return;
                            }
                        default:
                            f20 f20Var3 = this.f4423c;
                            p9.k kVar2 = p9.k.C;
                            t9.e0 e0VarG3 = kVar2.f31302h.g();
                            e0VarG3.i();
                            synchronized (e0VarG3.f33564a) {
                                z5 = e0VarG3.f33587y;
                                break;
                            }
                            if (z5) {
                                t9.e0 e0VarG4 = kVar2.f31302h.g();
                                e0VarG4.i();
                                synchronized (e0VarG4.f33564a) {
                                    str = e0VarG4.f33588z;
                                    break;
                                }
                                if (kVar2.f31308o.b(f20Var3.f5182b, str, f20Var3.f5183c.f34365b)) {
                                    return;
                                }
                                kVar2.f31302h.g().e(false);
                                kVar2.f31302h.g().f("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) sVar.f31970c.a(al.f3037hc)).booleanValue()) {
            final int i10 = 2;
            hx.f6279a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.d20

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f20 f4423c;

                {
                    this.f4423c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strB;
                    qm qmVar;
                    boolean z5;
                    String str;
                    switch (i10) {
                        case 0:
                            nz.f(this.f4423c.f5182b, true);
                            return;
                        case 1:
                            f20 f20Var = this.f4423c;
                            il ilVar = p9.k.C.f31307n;
                            Context context2 = f20Var.f5182b;
                            sd0 sd0Var2 = f20Var.f5194o;
                            if (ilVar.f6526c.getAndSet(true)) {
                                return;
                            }
                            ilVar.f6527d = context2;
                            ilVar.f6528e = sd0Var2;
                            if (ilVar.f6530g != null || context2 == null || (strB = q.g.b(context2, null)) == null || strB.equals(context2.getPackageName())) {
                                return;
                            }
                            q.g.a(context2, strB, ilVar);
                            return;
                        case 2:
                            f20 f20Var2 = this.f4423c;
                            f20Var2.getClass();
                            zt ztVar = new zt("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            ku0 ku0Var = f20Var2.f5190k;
                            ku0Var.getClass();
                            try {
                                try {
                                    IBinder iBinderB = u9.i.b(ku0Var.f7313c).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        qmVar = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        qmVar = iInterfaceQueryLocalInterface instanceof qm ? (qm) iInterfaceQueryLocalInterface : new qm(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                    }
                                    Parcel parcelD0 = qmVar.D0();
                                    vg.e(parcelD0, ztVar);
                                    qmVar.L1(parcelD0, 1);
                                    return;
                                } catch (Exception e3) {
                                    throw new u9.j(e3);
                                }
                            } catch (RemoteException e7) {
                                u9.i.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e7.getMessage())));
                                return;
                            } catch (u9.j e10) {
                                u9.i.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                return;
                            }
                        default:
                            f20 f20Var3 = this.f4423c;
                            p9.k kVar2 = p9.k.C;
                            t9.e0 e0VarG3 = kVar2.f31302h.g();
                            e0VarG3.i();
                            synchronized (e0VarG3.f33564a) {
                                z5 = e0VarG3.f33587y;
                                break;
                            }
                            if (z5) {
                                t9.e0 e0VarG4 = kVar2.f31302h.g();
                                e0VarG4.i();
                                synchronized (e0VarG4.f33564a) {
                                    str = e0VarG4.f33588z;
                                    break;
                                }
                                if (kVar2.f31308o.b(f20Var3.f5182b, str, f20Var3.f5183c.f34365b)) {
                                    return;
                                }
                                kVar2.f31302h.g().e(false);
                                kVar2.f31302h.g().f("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) sVar.f31970c.a(al.F3)).booleanValue()) {
            final int i11 = 0;
            hx.f6279a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.d20

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f20 f4423c;

                {
                    this.f4423c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String strB;
                    qm qmVar;
                    boolean z5;
                    String str;
                    switch (i11) {
                        case 0:
                            nz.f(this.f4423c.f5182b, true);
                            return;
                        case 1:
                            f20 f20Var = this.f4423c;
                            il ilVar = p9.k.C.f31307n;
                            Context context2 = f20Var.f5182b;
                            sd0 sd0Var2 = f20Var.f5194o;
                            if (ilVar.f6526c.getAndSet(true)) {
                                return;
                            }
                            ilVar.f6527d = context2;
                            ilVar.f6528e = sd0Var2;
                            if (ilVar.f6530g != null || context2 == null || (strB = q.g.b(context2, null)) == null || strB.equals(context2.getPackageName())) {
                                return;
                            }
                            q.g.a(context2, strB, ilVar);
                            return;
                        case 2:
                            f20 f20Var2 = this.f4423c;
                            f20Var2.getClass();
                            zt ztVar = new zt("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            ku0 ku0Var = f20Var2.f5190k;
                            ku0Var.getClass();
                            try {
                                try {
                                    IBinder iBinderB = u9.i.b(ku0Var.f7313c).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (iBinderB == null) {
                                        qmVar = null;
                                    } else {
                                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        qmVar = iInterfaceQueryLocalInterface instanceof qm ? (qm) iInterfaceQueryLocalInterface : new qm(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                    }
                                    Parcel parcelD0 = qmVar.D0();
                                    vg.e(parcelD0, ztVar);
                                    qmVar.L1(parcelD0, 1);
                                    return;
                                } catch (Exception e3) {
                                    throw new u9.j(e3);
                                }
                            } catch (RemoteException e7) {
                                u9.i.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e7.getMessage())));
                                return;
                            } catch (u9.j e10) {
                                u9.i.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                return;
                            }
                        default:
                            f20 f20Var3 = this.f4423c;
                            p9.k kVar2 = p9.k.C;
                            t9.e0 e0VarG3 = kVar2.f31302h.g();
                            e0VarG3.i();
                            synchronized (e0VarG3.f33564a) {
                                z5 = e0VarG3.f33587y;
                                break;
                            }
                            if (z5) {
                                t9.e0 e0VarG4 = kVar2.f31302h.g();
                                e0VarG4.i();
                                synchronized (e0VarG4.f33564a) {
                                    str = e0VarG4.f33588z;
                                    break;
                                }
                                if (kVar2.f31308o.b(f20Var3.f5182b, str, f20Var3.f5183c.f34365b)) {
                                    return;
                                }
                                kVar2.f31302h.g().e(false);
                                kVar2.f31302h.g().f("");
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) sVar.f31970c.a(al.q5)).booleanValue()) {
            if (((Boolean) sVar.f31970c.a(al.f3179r5)).booleanValue()) {
                final int i12 = 1;
                hx.f6279a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.d20

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ f20 f4423c;

                    {
                        this.f4423c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String strB;
                        qm qmVar;
                        boolean z5;
                        String str;
                        switch (i12) {
                            case 0:
                                nz.f(this.f4423c.f5182b, true);
                                return;
                            case 1:
                                f20 f20Var = this.f4423c;
                                il ilVar = p9.k.C.f31307n;
                                Context context2 = f20Var.f5182b;
                                sd0 sd0Var2 = f20Var.f5194o;
                                if (ilVar.f6526c.getAndSet(true)) {
                                    return;
                                }
                                ilVar.f6527d = context2;
                                ilVar.f6528e = sd0Var2;
                                if (ilVar.f6530g != null || context2 == null || (strB = q.g.b(context2, null)) == null || strB.equals(context2.getPackageName())) {
                                    return;
                                }
                                q.g.a(context2, strB, ilVar);
                                return;
                            case 2:
                                f20 f20Var2 = this.f4423c;
                                f20Var2.getClass();
                                zt ztVar = new zt("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                ku0 ku0Var = f20Var2.f5190k;
                                ku0Var.getClass();
                                try {
                                    try {
                                        IBinder iBinderB = u9.i.b(ku0Var.f7313c).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (iBinderB == null) {
                                            qmVar = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            qmVar = iInterfaceQueryLocalInterface instanceof qm ? (qm) iInterfaceQueryLocalInterface : new qm(iBinderB, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 1);
                                        }
                                        Parcel parcelD0 = qmVar.D0();
                                        vg.e(parcelD0, ztVar);
                                        qmVar.L1(parcelD0, 1);
                                        return;
                                    } catch (Exception e3) {
                                        throw new u9.j(e3);
                                    }
                                } catch (RemoteException e7) {
                                    u9.i.h("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e7.getMessage())));
                                    return;
                                } catch (u9.j e10) {
                                    u9.i.h("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                    return;
                                }
                            default:
                                f20 f20Var3 = this.f4423c;
                                p9.k kVar2 = p9.k.C;
                                t9.e0 e0VarG3 = kVar2.f31302h.g();
                                e0VarG3.i();
                                synchronized (e0VarG3.f33564a) {
                                    z5 = e0VarG3.f33587y;
                                    break;
                                }
                                if (z5) {
                                    t9.e0 e0VarG4 = kVar2.f31302h.g();
                                    e0VarG4.i();
                                    synchronized (e0VarG4.f33564a) {
                                        str = e0VarG4.f33588z;
                                        break;
                                    }
                                    if (kVar2.f31308o.b(f20Var3.f5182b, str, f20Var3.f5183c.f34365b)) {
                                        return;
                                    }
                                    kVar2.f31302h.g().e(false);
                                    kVar2.f31302h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
        if (((Boolean) sVar.f31970c.a(al.E5)).booleanValue()) {
            sf0 sf0Var = this.f5195p;
            gx gxVar = hx.f6284f;
            Objects.requireNonNull(sf0Var);
            gxVar.execute(new s(28, sf0Var));
        }
    }

    @Override // q9.h1
    public final synchronized float n() {
        return p9.k.C.i.a();
    }

    @Override // q9.h1
    public final List o() {
        return this.f5187g.b();
    }

    @Override // q9.h1
    public final String p() {
        return this.f5183c.f34365b;
    }

    @Override // q9.h1
    public final synchronized void r1(float f10) {
        t9.a aVar = p9.k.C.i;
        synchronized (aVar) {
            aVar.f33542b = f10;
        }
    }

    @Override // q9.h1
    public final void s2(String str, xa.a aVar) {
        if (aVar == null) {
            u9.i.e("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) xa.b.X1(aVar);
        if (context == null) {
            u9.i.e("Context is null. Failed to open debug menu.");
            return;
        }
        t9.i iVar = new t9.i(context);
        iVar.f33611d = str;
        iVar.f33612e = this.f5183c.f34365b;
        iVar.b();
    }

    @Override // q9.h1
    public final void v() {
        this.f5187g.f10282q = false;
    }
}
