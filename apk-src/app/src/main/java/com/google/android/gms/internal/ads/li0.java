package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class li0 implements fi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f7535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7536d;

    public /* synthetic */ li0(Context context, Object obj, Executor executor, int i) {
        this.f7533a = i;
        this.f7534b = context;
        this.f7536d = obj;
        this.f7535c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0527  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object c(com.google.android.gms.internal.ads.eq0 r60, com.google.android.gms.internal.ads.xp0 r61, com.google.android.gms.internal.ads.ci0 r62) throws com.google.android.gms.internal.ads.rj0 {
        /*
            Method dump skipped, instruction units count: 3104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.li0.c(com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.xp0, com.google.android.gms.internal.ads.ci0):java.lang.Object");
    }

    public static final boolean d(eq0 eq0Var, int i) {
        return ((iq0) eq0Var.f5032a.f9149c).f6576h.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final void a(eq0 eq0Var, xp0 xp0Var, ci0 ci0Var) {
        kq0 kq0Var;
        q9.g3 g3VarH;
        switch (this.f7533a) {
            case 0:
                pq0 pq0Var = (pq0) ci0Var.f4217b;
                iq0 iq0Var = (iq0) eq0Var.f5032a.f9149c;
                String string = xp0Var.f12266v.toString();
                Context context = this.f7534b;
                nr nrVar = (nr) ci0Var.f4218c;
                try {
                    pq0Var.f9154a.P1(new xa.b(context), iq0Var.f6572d, string, nrVar);
                    return;
                } finally {
                }
            case 1:
                bq0 bq0Var = xp0Var.f12260s;
                JSONObject jSONObject = xp0Var.f12266v;
                boolean z5 = xp0Var.f12240g0;
                IInterface iInterface = ci0Var.f4218c;
                Object obj = ci0Var.f4217b;
                iq0 iq0Var2 = (iq0) eq0Var.f5032a.f9149c;
                q9.g3 g3Var = iq0Var2.f6574f;
                boolean z10 = g3Var.f31887o;
                int i = g3Var.f31876c;
                int i10 = g3Var.f31879f;
                Context context2 = this.f7534b;
                if (z10) {
                    k9.h hVar = new k9.h(i10, i);
                    hVar.f27267e = true;
                    hVar.f27268f = i;
                    g3VarH = new q9.g3(context2, hVar);
                } else {
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.U8)).booleanValue() && z5) {
                        k9.h hVar2 = new k9.h(i10, i);
                        hVar2.f27269g = true;
                        hVar2.f27270h = i;
                        g3VarH = new q9.g3(context2, hVar2);
                    } else {
                        g3VarH = fs1.h(context2, xp0Var.f12264u);
                    }
                }
                q9.g3 g3Var2 = g3VarH;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.U8)).booleanValue() && z5) {
                    pq0 pq0Var2 = (pq0) obj;
                    try {
                        pq0Var2.f9154a.s3(new xa.b(context2), g3Var2, iq0Var2.f6572d, jSONObject.toString(), com.google.android.gms.internal.measurement.b4.W(bq0Var), (nr) iInterface);
                        return;
                    } finally {
                    }
                }
                pq0 pq0Var3 = (pq0) obj;
                try {
                    pq0Var3.f9154a.z0(new xa.b(context2), g3Var2, iq0Var2.f6572d, jSONObject.toString(), com.google.android.gms.internal.measurement.b4.W(bq0Var), (nr) iInterface);
                    return;
                } finally {
                }
            default:
                pq0 pq0Var4 = (pq0) ci0Var.f4217b;
                iq0 iq0Var3 = (iq0) eq0Var.f5032a.f9149c;
                String string2 = xp0Var.f12266v.toString();
                String strW = com.google.android.gms.internal.measurement.b4.W(xp0Var.f12260s);
                Context context3 = this.f7534b;
                nr nrVar2 = (nr) ci0Var.f4218c;
                wm wmVar = iq0Var3.f6577j;
                ArrayList arrayList = iq0Var3.f6576h;
                try {
                    pq0Var4.f9154a.S0(new xa.b(context3), iq0Var3.f6572d, string2, strW, nrVar2, wmVar, arrayList);
                    return;
                } finally {
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final Object b(eq0 eq0Var, xp0 xp0Var, ci0 ci0Var) throws kq0 {
        kq0 kq0Var;
        View view;
        int i = this.f7533a;
        Executor executor = this.f7535c;
        Object obj = this.f7536d;
        switch (i) {
            case 0:
                oq0 oq0Var = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                ut utVar = new ut(12, new ki0(this, ci0Var, xp0Var, 0), (Object) null);
                l7.n nVar = new l7.n(xp0Var.f12228a0, 2);
                q10 q10Var = (q10) obj;
                n10 n10Var = q10Var.f9260c;
                q10 q10Var2 = q10Var.f9261d;
                o10 o10Var = new o10(n10Var, q10Var2, oq0Var, utVar, nVar);
                ((u60) o10Var.i.j()).x1(new u20(0, (pq0) ci0Var.f4217b), executor);
                ((wi0) ci0Var.f4218c).m4(new ek0((g60) o10Var.f8558q.j(), (u80) o10Var.f8560s.j(), (q60) o10Var.f8554m.j(), (w60) o10Var.f8557p.j(), (y60) o10Var.f8561t.j(), (x70) q10Var2.R.j(), (f70) o10Var.f8562u.j(), (b90) o10Var.f8563v.j(), (v70) o10Var.f8564w.j(), (o60) o10Var.f8566y.j()));
                return o10Var.h0();
            case 1:
                Object obj2 = ci0Var.f4217b;
                if (!((Boolean) q9.s.f31967e.f31970c.a(al.U8)).booleanValue() || !xp0Var.f12240g0) {
                    try {
                        view = (View) xa.b.X1(((pq0) obj2).f9154a.c());
                    } finally {
                    }
                    break;
                } else {
                    try {
                        or orVarO0 = ((pq0) obj2).f9154a.o0();
                        if (orVarO0 == null) {
                            u9.i.e("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new kq0(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            boolean z5 = true;
                            Parcel parcelP1 = orVarO0.p1(orVarO0.D0(), 1);
                            xa.a aVarL1 = xa.b.L1(parcelP1.readStrongBinder());
                            parcelP1.recycle();
                            view = (View) xa.b.X1(aVarL1);
                            Parcel parcelP12 = orVarO0.p1(orVarO0.D0(), 2);
                            ClassLoader classLoader = vg.f11374a;
                            if (parcelP12.readInt() == 0) {
                                z5 = false;
                            }
                            parcelP12.recycle();
                            if (view == null) {
                                throw new kq0(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (z5) {
                                try {
                                    view = (View) vv.J(n81.f8237c, new v40(this, view, xp0Var, 5), hx.f6284f).get();
                                } catch (InterruptedException | ExecutionException e3) {
                                    throw new kq0(e3);
                                }
                            }
                        } catch (RemoteException e32) {
                            throw new kq0(e32);
                        }
                    } finally {
                    }
                    break;
                }
                s10 s10Var = (s10) obj;
                oq0 oq0Var2 = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                pq0 pq0Var = (pq0) obj2;
                cw cwVar = new cw(view, (sz) null, new ox0(28, pq0Var), (yp0) xp0Var.f12264u.get(0));
                n10 n10Var2 = s10Var.f10129d;
                s10 s10Var2 = s10Var.f10131e;
                r10 r10Var = new r10(n10Var2, s10Var2, oq0Var2, cwVar);
                ((t80) r10Var.B.j()).F1(view);
                ((u60) r10Var.i.j()).x1(new u20(0, pq0Var), executor);
                ((wi0) ci0Var.f4218c).m4(new ek0((g60) r10Var.f9663n.j(), (u80) r10Var.f9669t.j(), (q60) r10Var.f9666q.j(), (w60) r10Var.f9662m.j(), r10Var.h0(), (x70) s10Var2.T.j(), (f70) r10Var.f9672w.j(), (b90) r10Var.f9673x.j(), (v70) r10Var.f9674y.j(), (o60) r10Var.f9675z.j()));
                return r10Var.i0();
            default:
                return c(eq0Var, xp0Var, ci0Var);
        }
    }
}
