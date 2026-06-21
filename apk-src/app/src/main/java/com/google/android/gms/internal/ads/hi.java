package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hi implements p9.d, ep0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6146g;

    public hi(ut utVar, oq0 oq0Var, g gVar, String str, gx gxVar) {
        this.f6141b = utVar;
        this.f6142c = oq0Var;
        this.f6143d = gVar;
        this.f6144e = str;
        this.f6146g = gxVar;
    }

    public static hy1 u(ip1 ip1Var, x41 x41Var, hy1 hy1Var, bh bhVar) {
        ci ciVarV1 = ip1Var.v1();
        int iY1 = ip1Var.y1();
        Object objF = ciVarV1.g() ? null : ciVarV1.f(iY1);
        if (!ip1Var.D1() && !ciVarV1.g()) {
            bh bhVarD = ciVarV1.d(iY1, bhVar, false);
            ip1Var.B1();
            String str = cq0.f4293a;
            bhVarD.getClass();
        }
        for (int i = 0; i < x41Var.size(); i++) {
            hy1 hy1Var2 = (hy1) x41Var.get(i);
            if (w(hy1Var2, objF, ip1Var.D1(), ip1Var.t(), ip1Var.E1())) {
                return hy1Var2;
            }
        }
        if (x41Var.isEmpty() && hy1Var != null && w(hy1Var, objF, ip1Var.D1(), ip1Var.t(), ip1Var.E1())) {
            return hy1Var;
        }
        return null;
    }

    public static boolean w(hy1 hy1Var, Object obj, boolean z5, int i, int i10) {
        Object obj2 = hy1Var.f6299a;
        int i11 = hy1Var.f6300b;
        if (obj2.equals(obj)) {
            return z5 ? i11 == i && hy1Var.f6301c == i10 : i11 == -1 && hy1Var.f6303e == -1;
        }
        return false;
    }

    public String a() {
        String str = (String) q9.s.f31967e.f31970c.a(al.f3066jb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.f6141b);
            jSONObject.put("eventCategory", (String) this.f6142c);
            jSONObject.putOpt("event", (String) this.f6143d);
            jSONObject.putOpt("errorCode", (Integer) this.f6144e);
            jSONObject.putOpt("rewardType", (String) this.f6145f);
            jSONObject.putOpt("rewardAmount", (Integer) this.f6146g);
        } catch (JSONException unused) {
            u9.i.h("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return om1.n(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }

    public void b(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f6141b = Integer.valueOf(i);
    }

    public void c(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f6143d) {
            try {
                if (((Context) this.f6145f) != null) {
                    return;
                }
                this.f6145f = context.getApplicationContext();
                wk wkVar = al.W4;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    v();
                } else {
                    if (((Boolean) sVar.f31970c.a(al.V4)).booleanValue()) {
                        p9.k.C.f31301g.v(new gi(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d(q9.d3 d3Var, String str, gr grVar, al0 al0Var) {
        oq0 oq0Var = (oq0) this.f6143d;
        uk0 uk0Var = (uk0) oq0Var.f8763d;
        n10 n10Var = (n10) this.f6142c;
        wk wkVar = al.Q2;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            q9.r.a();
        }
        p9.k kVar = p9.k.C;
        t9.g0 g0Var = kVar.f31297c;
        Context context = (Context) this.f6145f;
        if (t9.g0.i(context) && d3Var.f31818t == null) {
            u9.i.e("Failed to load the ad because app ID is missing.");
            final int i = 1;
            n10Var.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.cl0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ hi f4247c;

                {
                    this.f4247c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            ((zk0) ((oq0) this.f4247c.f6143d).f8764e).K(vv.C(6, null, null));
                            break;
                        default:
                            ((zk0) ((oq0) this.f4247c.f6143d).f8764e).K(vv.C(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            u9.i.e("Ad unit ID should not be null for NativeAdLoader.");
            final int i10 = 0;
            n10Var.b().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.cl0

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ hi f4247c;

                {
                    this.f4247c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ((zk0) ((oq0) this.f4247c.f6143d).f8764e).K(vv.C(6, null, null));
                            break;
                        default:
                            ((zk0) ((oq0) this.f4247c.f6143d).f8764e).K(vv.C(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z5 = d3Var.f31806g;
        gr.E(context, z5);
        if (((Boolean) sVar.f31970c.a(al.fa)).booleanValue() && z5) {
            ((ff0) n10Var.f8149z.j()).b(true);
        }
        int i11 = ((bl0) grVar).f3812d;
        kVar.f31304k.getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Bundle bundleN = gr.n(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        hq0 hq0Var = (hq0) this.f6141b;
        hq0Var.f6212a = d3Var;
        hq0Var.f6230t = bundleN;
        hq0Var.f6223m = i11;
        iq0 iq0VarA = hq0Var.a();
        xr0 xr0VarI = xr0.i(context, fs1.P(iq0VarA), 8, d3Var);
        q9.v0 v0Var = iq0VarA.f6582o;
        if (v0Var != null) {
            uk0Var.g(v0Var);
        }
        n10 n10Var2 = n10Var.f8104b;
        a60 a60Var = new a60();
        a60Var.f2786a = context;
        a60Var.f2787b = iq0VarA;
        a60 a60Var2 = new a60(a60Var);
        f80 f80Var = new f80();
        f80Var.b(uk0Var, n10Var.b());
        g80 g80Var = new g80(f80Var);
        n90 n90Var = new n90(0, (na0) oq0Var.f8762c, uk0Var.b());
        int i12 = 16;
        as0 as0Var = null;
        m10 m10Var = new m10(n10Var2, new cf(i12, as0Var), n90Var, new l80(i12), g80Var, a60Var2, new gk0(26), null, null);
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            as0Var = (as0) m10Var.f7722e.j();
            as0Var.i(8);
            as0Var.c(d3Var.f31815q);
            as0Var.d(d3Var.f31812n);
        }
        ((qq0) n10Var.N.j()).a(1);
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) n10Var.f8108d.j();
        b50 b50Var = (b50) m10Var.f7731o.j();
        or0 or0VarC = b50Var.c(b50Var.b());
        x40 x40Var = new x40(gxVar, scheduledExecutorService, or0VarC);
        this.f6146g = x40Var;
        or0VarC.a(new l81(0, or0VarC, new zd1(10, x40Var, new z7(this, (kx0) al0Var, as0Var, xr0VarI, m10Var, 5, false))), gxVar);
        return true;
    }

    public hi e(jr0 jr0Var) {
        return h(new np(14, jr0Var));
    }

    public void f(int i) throws InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f6142c = Integer.valueOf(i);
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public Object g() {
        z50 z50Var;
        synchronized (this) {
            z50Var = (z50) this.f6145f;
        }
        return z50Var;
    }

    public hi h(z71 z71Var) {
        rr0 rr0Var = (rr0) this.f6146g;
        r81 r81Var = rr0Var.f10030a;
        return new hi(rr0Var, this.f6143d, (String) this.f6141b, (ed.d) this.f6142c, (List) this.f6144e, vv.J((ed.d) this.f6145f, z71Var, r81Var));
    }

    public ii i(li liVar) {
        synchronized (this.f6143d) {
            if (((mi) this.f6146g) == null) {
                return new ii();
            }
            try {
                if (((ki) this.f6144e).x()) {
                    mi miVar = (mi) this.f6146g;
                    Parcel parcelD0 = miVar.D0();
                    vg.c(parcelD0, liVar);
                    Parcel parcelP1 = miVar.p1(parcelD0, 2);
                    ii iiVar = (ii) vg.b(parcelP1, ii.CREATOR);
                    parcelP1.recycle();
                    return iiVar;
                }
                mi miVar2 = (mi) this.f6146g;
                Parcel parcelD02 = miVar2.D0();
                vg.c(parcelD02, liVar);
                Parcel parcelP12 = miVar2.p1(parcelD02, 1);
                ii iiVar2 = (ii) vg.b(parcelP12, ii.CREATOR);
                parcelP12.recycle();
                return iiVar2;
            } catch (RemoteException e3) {
                u9.i.f("Unable to call into cache service.", e3);
                return new ii();
            }
        }
    }

    @Override // p9.d
    public void j() {
        if (((AtomicBoolean) this.f6146g).get()) {
            ((g60) this.f6141b).onAdClicked();
        }
    }

    public void k(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f6143d = Integer.valueOf(i);
    }

    @Override // p9.d
    /* JADX INFO: renamed from: l */
    public void mo5l() {
        if (((AtomicBoolean) this.f6146g).get()) {
            ((q60) this.f6142c).a();
            w80 w80Var = (w80) this.f6143d;
            synchronized (w80Var) {
                w80Var.A1(l80.i);
            }
        }
    }

    public void m(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f6144e = Integer.valueOf(i);
    }

    public ga1 n() throws GeneralSecurityException {
        if (((Integer) this.f6141b) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f6142c) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f6143d) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f6144e;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((ea1) this.f6145f) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int iIntValue = num.intValue();
        ea1 ea1Var = (ea1) this.f6145f;
        if (ea1Var == ea1.f4895d) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (ea1Var == ea1.f4896e) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (ea1Var == ea1.f4897f) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (ea1Var == ea1.f4898g) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (ea1Var != ea1.f4899h) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new ga1(((Integer) this.f6141b).intValue(), ((Integer) this.f6142c).intValue(), ((Integer) this.f6143d).intValue(), ((Integer) this.f6144e).intValue(), (fa1) this.f6146g, (ea1) this.f6145f);
    }

    public ed.d o(yq0 yq0Var, n90 n90Var) {
        z50 z50Var = yq0Var.f12687a;
        this.f6145f = z50Var;
        if (yq0Var.f12689c != null) {
            if (z50Var.l() != null) {
                yq0Var.f12689c.f9700e.b(yq0Var.f12687a.l());
            }
            return vv.d(yq0Var.f12689c);
        }
        z50Var.h().f3624g = yq0Var.f12688b;
        return ((ut) this.f6141b).m(n90Var, null, yq0Var.f12687a);
    }

    public /* synthetic */ void p() {
        synchronized (this.f6143d) {
            try {
                ki kiVar = (ki) this.f6144e;
                if (kiVar == null) {
                    return;
                }
                if (kiVar.r() || ((ki) this.f6144e).s()) {
                    ((ki) this.f6144e).f();
                }
                this.f6144e = null;
                this.f6146g = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public hi q(long j10) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        rr0 rr0Var = (rr0) this.f6146g;
        ScheduledExecutorService scheduledExecutorService = rr0Var.f10031b;
        return new hi(rr0Var, this.f6143d, (String) this.f6141b, (ed.d) this.f6142c, (List) this.f6144e, vv.I((ed.d) this.f6145f, j10, timeUnit, scheduledExecutorService));
    }

    public or0 r() {
        rr0 rr0Var = (rr0) this.f6146g;
        Object obj = this.f6143d;
        String str = (String) this.f6141b;
        if (str == null) {
            rr0Var.getClass();
            str = ((pr0) obj).f9178b;
        }
        or0 or0Var = new or0(obj, str, (ed.d) this.f6145f);
        rr0Var.f10032c.A1(new kx0(28, or0Var));
        ed.d dVar = (ed.d) this.f6142c;
        th0 th0Var = new th0(9, this, or0Var);
        gx gxVar = hx.f6285g;
        dVar.a(th0Var, gxVar);
        or0Var.a(new l81(0 == true ? 1 : 0, or0Var, new n90(17, this, or0Var, false)), gxVar);
        return or0Var;
    }

    public void s(ci ciVar) {
        ya yaVar = new ya(4);
        if (((x41) this.f6142c).isEmpty()) {
            t(yaVar, (hy1) this.f6145f, ciVar);
            if (!Objects.equals((hy1) this.f6146g, (hy1) this.f6145f)) {
                t(yaVar, (hy1) this.f6146g, ciVar);
            }
            if (!Objects.equals((hy1) this.f6144e, (hy1) this.f6145f) && !Objects.equals((hy1) this.f6144e, (hy1) this.f6146g)) {
                t(yaVar, (hy1) this.f6144e, ciVar);
            }
        } else {
            for (int i = 0; i < ((x41) this.f6142c).size(); i++) {
                t(yaVar, (hy1) ((x41) this.f6142c).get(i), ciVar);
            }
            if (!((x41) this.f6142c).contains((hy1) this.f6144e)) {
                t(yaVar, (hy1) this.f6144e, ciVar);
            }
        }
        this.f6143d = yaVar.s(true);
    }

    public void t(ya yaVar, hy1 hy1Var, ci ciVar) {
        if (hy1Var == null) {
            return;
        }
        if (ciVar.e(hy1Var.f6299a) != -1) {
            yaVar.g(hy1Var, ciVar);
            return;
        }
        ci ciVar2 = (ci) ((w51) this.f6143d).get(hy1Var);
        if (ciVar2 != null) {
            yaVar.g(hy1Var, ciVar2);
        }
    }

    public void v() {
        ki kiVar;
        synchronized (this.f6143d) {
            if (((Context) this.f6145f) != null && ((ki) this.f6144e) == null) {
                cf cfVar = new cf(7, this);
                gk0 gk0Var = new gk0(6, this);
                synchronized (this) {
                    kiVar = new ki((Context) this.f6145f, p9.k.C.f31313t.i(), cfVar, gk0Var, 0);
                }
                this.f6144e = kiVar;
                kiVar.d();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public ed.d x(n90 n90Var, dp0 dp0Var) {
        synchronized (this) {
            p10 p10VarD = dp0Var.d((cp0) n90Var.f8249d);
            uo0 uo0Var = new uo0((String) this.f6144e);
            switch (p10VarD.f8877a) {
                case 0:
                    p10VarD.f8880d = uo0Var;
                    break;
                default:
                    p10VarD.f8880d = uo0Var;
                    break;
            }
            z50 z50Var = (z50) p10VarD.c();
            z50Var.j();
            z50Var.j();
            q9.d3 d3Var = z50Var.j().f6572d;
            if (d3Var.f31818t != null || d3Var.f31823y != null) {
                this.f6145f = z50Var;
                return ((ut) this.f6141b).m(n90Var, dp0Var, z50Var);
            }
            iq0 iq0VarJ = z50Var.j();
            q9.d3 d3Var2 = iq0VarJ.f6572d;
            String str = iq0VarJ.f6575g;
            q9.j3 j3Var = iq0VarJ.f6578k;
            Executor executor = (Executor) this.f6146g;
            return vv.J(i81.s(((oq0) this.f6142c).m(z50Var)), new ui0(this, n90Var, new to0(dp0Var, n90Var, d3Var2, str, executor, j3Var, null), dp0Var, z50Var, 1), executor);
        }
    }

    @Override // p9.d
    public synchronized void z(View view) {
        if (((AtomicBoolean) this.f6146g).compareAndSet(false, true)) {
            ((n30) this.f6145f).z();
            ((t80) this.f6144e).F1(view);
        }
    }

    public /* synthetic */ hi(String str) {
        this.f6142c = str;
    }

    public hi(int i) {
        switch (i) {
            case 6:
                this.f6141b = null;
                this.f6142c = null;
                this.f6143d = null;
                this.f6144e = null;
                this.f6145f = null;
                this.f6146g = fa1.f5296e;
                break;
            default:
                this.f6141b = null;
                this.f6142c = new s(10, this);
                this.f6143d = new Object();
                break;
        }
    }

    public hi(rr0 rr0Var, Object obj, String str, ed.d dVar, List list, ed.d dVar2) {
        Objects.requireNonNull(rr0Var);
        this.f6146g = rr0Var;
        this.f6143d = obj;
        this.f6141b = str;
        this.f6142c = dVar;
        this.f6144e = list;
        this.f6145f = dVar2;
    }
}
