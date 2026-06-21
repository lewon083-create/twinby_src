package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class cw implements a7, k81, lx, ri, h90 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static cw f4345g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4350f;

    public cw(Context context, Executor executor, dv0 dv0Var, iv0 iv0Var) {
        this.f4346b = 24;
        this.f4347c = context;
        this.f4348d = executor;
        this.f4349e = dv0Var;
    }

    public static final boolean B(Context context) {
        if (((Boolean) hm.f6180c.r()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return t9.g0.K(context).f15577c.toLowerCase(Locale.ROOT).equals("ru");
    }

    public static cw f(Reader reader, Bundle bundle) {
        try {
            try {
                return new cw(new JsonReader(reader), bundle);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e3) {
                throw new aq0("unable to parse ServerResponse", e3);
            }
        } finally {
            ua.b.d(reader);
        }
    }

    public static synchronized cw o(Context context) {
        try {
            cw cwVar = f4345g;
            if (cwVar != null) {
                return cwVar;
            }
            Context applicationContext = context.getApplicationContext();
            al.a(applicationContext);
            p9.k kVar = p9.k.C;
            t9.e0 e0VarG = kVar.f31302h.g();
            e0VarG.k(applicationContext);
            applicationContext.getClass();
            ua.a aVar = kVar.f31304k;
            aVar.getClass();
            fw fwVar = kVar.f31318y;
            gr.L(fwVar, fw.class);
            cw cwVar2 = new cw(applicationContext, aVar, e0VarG, fwVar);
            f4345g = cwVar2;
            xv xvVar = (xv) ((ls1) cwVar2.f4348d).j();
            SharedPreferences sharedPreferences = xvVar.f12341b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(xvVar);
            xvVar.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            wk wkVar = al.Y0;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                xvVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
            } else {
                xvVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            iw iwVar = (iw) ((ls1) f4345g.f4350f).j();
            if (((Boolean) sVar.f31970c.a(al.S0)).booleanValue()) {
                HashMap mapR = t9.g0.R((String) sVar.f31970c.a(al.T0));
                Iterator it = mapR.keySet().iterator();
                while (it.hasNext()) {
                    iwVar.a((String) it.next());
                }
                hw hwVar = new hw(iwVar, mapR);
                synchronized (iwVar) {
                    iwVar.f6626b.add(hwVar);
                }
            }
            return f4345g;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void A(int i, ed.d dVar) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.I2)).booleanValue()) {
            d8.e0 e0Var = new d8.e0(this, i, 6);
            dVar.a(new l81(0, dVar, e0Var), (r81) this.f4347c);
        }
    }

    public String C() {
        int i = ((ng) this.f4350f).f8295b;
        return l7.o.j(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    @Override // com.google.android.gms.internal.ads.lx, com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public void mo7a(Object obj) {
        sq sqVar = (sq) obj;
        t9.c0.m("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f4348d;
        jx jxVar = (jx) this.f4349e;
        yq yqVar = (yq) this.f4350f;
        pq pqVar = (pq) this.f4347c;
        yqVar.getClass();
        try {
            t9.g0 g0Var = p9.k.C.f31297c;
            String string = UUID.randomUUID().toString();
            uo.f11019j.a(string, new xq(yqVar, pqVar, jxVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", ((vq) yqVar.f12685d).i(obj2));
            String str = (String) yqVar.f12683b;
            eq eqVar = (eq) sqVar;
            eqVar.getClass();
            eqVar.g(str, jSONObject.toString());
        } catch (Exception e3) {
            try {
                jxVar.d(e3);
                u9.i.f("Unable to invokeJavascript", e3);
            } finally {
                pqVar.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ri
    public void b(ok okVar) {
        ui uiVar = (ui) ((pk) okVar.f9560c).B().r();
        ti tiVar = (ti) this.f4347c;
        uiVar.b();
        ((vi) uiVar.f9560c).A(tiVar);
        okVar.b();
        ((pk) okVar.f9560c).G((vi) uiVar.d());
        lk lkVar = (lk) ((pk) okVar.f9560c).z().r();
        String str = (String) this.f4348d;
        lkVar.b();
        ((mk) lkVar.f9560c).A(str);
        kj kjVar = (kj) this.f4349e;
        lkVar.b();
        ((mk) lkVar.f9560c).B(kjVar);
        okVar.b();
        ((pk) okVar.f9560c).F((mk) lkVar.d());
        String str2 = (String) this.f4350f;
        okVar.b();
        ((pk) okVar.f9560c).A(str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f1  */
    @Override // com.google.android.gms.internal.ads.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r40, int r41, a4.g r42, byte[] r43) {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw.c(int, int, a4.g, byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.h90
    public void d(boolean z5, Context context, o60 o60Var) throws g90 {
        boolean zF4;
        os osVar = (os) this.f4348d;
        try {
            int iOrdinal = ((k9.a) this.f4349e).ordinal();
            if (iOrdinal == 1) {
                zF4 = osVar.f4(new xa.b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zF4 = osVar.y0(new xa.b(context));
                    }
                    throw new g90("Adapter failed to show.");
                }
                zF4 = osVar.m1(new xa.b(context));
            }
            if (zF4) {
                q60 q60Var = (q60) this.f4350f;
                if (q60Var == null) {
                    return;
                }
                if (((Boolean) q9.s.f31967e.f31970c.a(al.T1)).booleanValue() || ((xp0) this.f4347c).Y != 2) {
                    return;
                }
                q60Var.a();
                return;
            }
            throw new g90("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new g90(th2);
        }
    }

    public wq e(Context context, u9.a aVar, bs0 bs0Var) {
        wq wqVar;
        String str;
        synchronized (this.f4348d) {
            try {
                if (((wq) this.f4350f) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (B(context)) {
                        str = (String) q9.s.f31967e.f31970c.a(al.f2948c);
                    } else {
                        str = (String) pn1.f9120n.r();
                    }
                    this.f4350f = new wq(applicationContext, aVar, str, bs0Var);
                }
                wqVar = (wq) this.f4350f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wqVar;
    }

    public void g(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f4347c = Integer.valueOf(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(com.google.android.gms.internal.ads.og r9, com.google.android.gms.internal.ads.c6 r10) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw.h(com.google.android.gms.internal.ads.og, com.google.android.gms.internal.ads.c6):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:261:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6i(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 2096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw.mo6i(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.h90
    public xp0 j() {
        return (xp0) this.f4347c;
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        as0 as0Var;
        int i;
        switch (this.f4346b) {
            case 5:
                p9.k.C.f31302h.d("OpenGmsgHandler.attributionReportingManager", th2);
                return;
            case 8:
                u9.i.h("Failed to parse gmsg params for: ".concat(String.valueOf((Uri) this.f4349e)));
                return;
            case 10:
                ((gx) ((w20) this.f4350f).f11600e).a(new wy(this, th2, (bt0) this.f4347c, (String) this.f4348d, (ni.i) this.f4349e));
                return;
            case 14:
                return;
            case 19:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.B6)).booleanValue()) {
                    t9.c0.n("Banner ad failed to load", th2);
                }
                so0 so0Var = (so0) this.f4350f;
                synchronized (so0Var) {
                    s10 s10Var = (s10) this.f4349e;
                    q9.x1 x1VarV = vv.v(th2, ((b50) s10Var.f10147s.j()).f3628l);
                    so0Var.f10367n = x1VarV;
                    ((k60) s10Var.f10141m.j()).K(x1VarV);
                    gr.v("BannerAdLoader.onFailure", th2, x1VarV.f31976b);
                    if (so0Var.f10366m) {
                        so0Var.e();
                        n70 n70Var = so0Var.f10362h;
                        y70 y70Var = so0Var.f10363j;
                        synchronized (y70Var) {
                            i = y70Var.f12533b;
                        }
                        n70Var.F1(i);
                    }
                    if (!((Boolean) vl.f11414c.r()).booleanValue() || (as0Var = (as0) this.f4347c) == null) {
                        bs0 bs0Var = so0Var.i;
                        xr0 xr0Var = (xr0) this.f4348d;
                        xr0Var.n(x1VarV);
                        xr0Var.g(th2);
                        xr0Var.a(false);
                        bs0Var.b(xr0Var.p());
                    } else {
                        as0Var.f(x1VarV);
                        xr0 xr0Var2 = (xr0) this.f4348d;
                        xr0Var2.g(th2);
                        xr0Var2.a(false);
                        as0Var.a(xr0Var2);
                        as0Var.h();
                    }
                }
                return;
            case 22:
                return;
            default:
                xr0 xr0Var3 = (xr0) this.f4347c;
                if (xr0Var3 == null) {
                    return;
                }
                xr0Var3.a(false);
                as0 as0Var2 = (as0) this.f4348d;
                if (as0Var2 == null) {
                    ((bt0) this.f4350f).f3892f.b(xr0Var3.p());
                    return;
                } else {
                    as0Var2.a(xr0Var3);
                    as0Var2.h();
                    return;
                }
        }
    }

    public wq n(Context context, u9.a aVar, bs0 bs0Var) {
        wq wqVar;
        String str;
        synchronized (this.f4347c) {
            try {
                if (((wq) this.f4349e) == null) {
                    if (B(context)) {
                        str = (String) q9.s.f31967e.f31970c.a(al.f2948c);
                    } else if (((Boolean) hm.f6184g.r()).booleanValue()) {
                        str = (String) q9.s.f31967e.f31970c.a(al.f2915a);
                    } else {
                        str = (String) q9.s.f31967e.f31970c.a(al.f2932b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f4349e = new wq(context, aVar, str, bs0Var);
                }
                wqVar = (wq) this.f4349e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wqVar;
    }

    public void p(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f4348d = Integer.valueOf(i);
    }

    public synchronized void q(qa qaVar) {
        try {
            HashMap map = (HashMap) this.f4347c;
            String strD = qaVar.d();
            List list = (List) map.remove(strD);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (xa.f12090a) {
                xa.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strD);
            }
            qa qaVar2 = (qa) list.remove(0);
            map.put(strD, list);
            synchronized (qaVar2.f9376f) {
                qaVar2.f9381l = this;
            }
            try {
                ((BlockingQueue) this.f4349e).put(qaVar2);
            } catch (InterruptedException e3) {
                xa.c("Couldn't add request to queue. %s", e3.toString());
                Thread.currentThread().interrupt();
                ha haVar = (ha) this.f4348d;
                haVar.f6079e = true;
                haVar.interrupt();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public sg r(int i) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f4349e;
        String string = i == 1 ? sharedPreferences.getString(C(), null) : sharedPreferences.getString(z(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrM = ua.b.m(string);
                sg sgVarE = sg.E(bn1.A(bArrM, 0, bArrM.length));
                String strZ = sgVarE.z();
                File fileB = ix.b(strZ, "pcam.jar", u());
                if (!fileB.exists()) {
                    fileB = ix.b(strZ, "pcam", u());
                }
                File fileB2 = ix.b(strZ, "pcbc", u());
                if (fileB.exists()) {
                    if (fileB2.exists()) {
                        return sgVarE;
                    }
                }
            } catch (co1 unused) {
            }
        }
        return null;
    }

    public void s() {
        this.f4349e = 16;
    }

    public synchronized boolean t(qa qaVar) {
        try {
            HashMap map = (HashMap) this.f4347c;
            String strD = qaVar.d();
            if (!map.containsKey(strD)) {
                map.put(strD, null);
                synchronized (qaVar.f9376f) {
                    qaVar.f9381l = this;
                }
                if (xa.f12090a) {
                    xa.b("new request, sending to network %s", strD);
                }
                return false;
            }
            List arrayList = (List) map.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            qaVar.a("waiting-for-response");
            arrayList.add(qaVar);
            map.put(strD, arrayList);
            if (xa.f12090a) {
                xa.b("Request for cacheKey=%s is in flight, putting on hold.", strD);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public File u() {
        File file = new File((File) this.f4347c, Integer.toString(((ng) this.f4350f).f8295b));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public y60 v(Set set) {
        return new y60(set);
    }

    public ar0 w() {
        iq0 iq0VarJ = ((z50) this.f4348d).j();
        q9.d3 d3Var = iq0VarJ.f6572d;
        String str = iq0VarJ.f6575g;
        q9.j3 j3Var = iq0VarJ.f6578k;
        xq0 xq0Var = (xq0) ((oq0) this.f4347c).f8763d;
        return new ar0(d3Var, str, new mu(xq0Var.f12279b).a().f8450j, xq0Var.f12285h, j3Var);
    }

    public aa1 x() throws GeneralSecurityException {
        xo0 xo0Var;
        sl1 sl1VarB;
        ga1 ga1Var = (ga1) this.f4347c;
        if (ga1Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        xo0 xo0Var2 = (xo0) this.f4348d;
        if (xo0Var2 == null || (xo0Var = (xo0) this.f4349e) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (ga1Var.f5745a != ((sl1) xo0Var2.f12221c).f10334a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (ga1Var.f5746b != ((sl1) xo0Var.f12221c).f10334a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (ga1Var.a() && ((Integer) this.f4350f) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ga1) this.f4347c).a() && ((Integer) this.f4350f) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        fa1 fa1Var = ((ga1) this.f4347c).f5749e;
        if (fa1Var == fa1.f5296e) {
            sl1VarB = kd1.f7203a;
        } else if (fa1Var == fa1.f5295d) {
            sl1VarB = kd1.a(((Integer) this.f4350f).intValue());
        } else {
            if (fa1Var != fa1.f5294c) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((ga1) this.f4347c).f5749e)));
            }
            sl1VarB = kd1.b(((Integer) this.f4350f).intValue());
        }
        return new aa1((ga1) this.f4347c, (xo0) this.f4348d, (xo0) this.f4349e, sl1VarB, (Integer) this.f4350f);
    }

    public ka1 y() throws GeneralSecurityException {
        Integer num = (Integer) this.f4347c;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f4348d) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f4349e) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f4348d).intValue();
        ((Integer) this.f4349e).getClass();
        return new ka1(iIntValue, iIntValue2, (ja1) this.f4350f);
    }

    public String z() {
        int i = ((ng) this.f4350f).f8295b;
        return l7.o.j(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public cw(Context context, ua.a aVar, t9.e0 e0Var, fw fwVar) {
        this.f4346b = 0;
        this.f4347c = aVar;
        ns1 ns1VarA = ns1.a(context);
        ns1 ns1VarA2 = ns1.a(e0Var);
        int i = 0;
        this.f4348d = ls1.a(new yv(ns1VarA, ns1VarA2, i));
        ns1 ns1VarA3 = ns1.a(aVar);
        ls1 ls1VarA = ls1.a(new aw(ns1VarA3, ns1VarA2, ns1.a(fwVar), i));
        this.f4349e = ls1VarA;
        this.f4350f = ls1.a(new jw(ns1VarA, new bw(ns1VarA3, ls1VarA), 0));
    }

    public cw(View view, sz szVar, q40 q40Var, yp0 yp0Var) {
        this.f4346b = 11;
        this.f4348d = view;
        this.f4350f = szVar;
        this.f4347c = q40Var;
        this.f4349e = yp0Var;
    }

    public cw(n10 n10Var, d8.e0 e0Var) {
        this.f4346b = 9;
        this.f4350f = n10Var;
        this.f4347c = e0Var;
        this.f4348d = ls1.a(new wm0(n10Var.f8137t, 9));
        ho0 ho0Var = new ho0(e0Var, 1);
        ho0 ho0Var2 = new ho0(e0Var, 2);
        ho0 ho0Var3 = new ho0(e0Var, 3);
        d10 d10Var = n10Var.f8114g;
        ls1 ls1Var = n10Var.f8108d;
        new j40((qs1) d10Var, (qs1) ls1Var, (ms1) ho0Var, (qs1) ho0Var2, (qs1) ho0Var3, 16);
        int i = 5;
        new wm0(d10Var, i);
        ho0 ho0Var4 = new ho0(e0Var, 0);
        new p20(21, ho0Var4);
        new d40(ls1Var, d10Var, 10);
        ho0 ho0Var5 = new ho0(e0Var, i);
        ho0 ho0Var6 = new ho0(e0Var, 6);
        ls1 ls1Var2 = n10Var.B;
        new l90((qs1) ls1Var2, (ms1) ho0Var3, (ms1) ho0Var4, (qs1) ls1Var, (qs1) ho0Var5, (qs1) ho0Var6, 7);
        new aw(ho0Var4, ls1Var2, ls1Var, 29);
        ho0 ho0Var7 = new ho0(e0Var, 4);
        ls1 ls1VarA = ls1.a(rs.f10048r);
        ls1 ls1VarA2 = ls1.a(pn1.f9126t);
        ls1 ls1VarA3 = ls1.a(nz.f8513s);
        ls1 ls1VarA4 = ls1.a(c80.F);
        int i10 = os1.f8768b;
        LinkedHashMap linkedHashMapK = ix.K(4);
        linkedHashMapK.put(pr0.GMS_SIGNALS, ls1VarA);
        linkedHashMapK.put(pr0.BUILD_URL, ls1VarA2);
        linkedHashMapK.put(pr0.HTTP, ls1VarA3);
        linkedHashMapK.put(pr0.PRE_PROCESS, ls1VarA4);
        ls1 ls1VarA5 = ls1.a(new aw(ho0Var7, n10Var.f8114g, new os1(linkedHashMapK), 11));
        int i11 = rs1.f10057c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(ls1VarA5);
        this.f4349e = ls1.a(new mm0(n10Var.f8108d, new h60(new rs1(list, arrayList), 25)));
    }

    private final void l(Throwable th2) {
    }

    private final void m(Throwable th2) {
    }

    public cw(xp0 xp0Var, os osVar, k9.a aVar) {
        this.f4346b = 17;
        this.f4350f = null;
        this.f4347c = xp0Var;
        this.f4348d = osVar;
        this.f4349e = aVar;
    }

    public cw(oq0 oq0Var, z50 z50Var, Executor executor) {
        this.f4346b = 20;
        this.f4347c = oq0Var;
        this.f4348d = z50Var;
        this.f4349e = executor;
    }

    public /* synthetic */ cw(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f4346b = i;
        this.f4347c = obj2;
        this.f4348d = obj3;
        this.f4349e = obj4;
        this.f4350f = obj;
    }

    public /* synthetic */ cw(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z5) {
        this.f4346b = i;
        this.f4347c = obj;
        this.f4348d = obj2;
        this.f4349e = obj3;
        this.f4350f = obj4;
    }

    public cw(int i) {
        this.f4346b = i;
        switch (i) {
            case 6:
                this.f4347c = new Object();
                this.f4348d = new Object();
                break;
            case 28:
                this.f4347c = null;
                this.f4348d = null;
                this.f4349e = null;
                this.f4350f = null;
                break;
            case 29:
                this.f4347c = null;
                this.f4348d = null;
                this.f4349e = null;
                this.f4350f = ja1.f6792e;
                break;
            default:
                this.f4347c = new tk0();
                this.f4348d = new tk0();
                this.f4349e = new l7(0);
                break;
        }
    }

    public cw(Context context, ng ngVar) {
        this.f4346b = 25;
        this.f4349e = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        ix.S(dir, false);
        this.f4347c = dir;
        File dir2 = context.getDir("tmppccache", 0);
        ix.S(dir2, true);
        this.f4348d = dir2;
        this.f4350f = ngVar;
    }

    public cw(Context context, String str) {
        String packageName;
        this.f4346b = 4;
        this.f4349e = context;
        this.f4350f = str;
        this.f4347c = (String) nz.f8506l.r();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4348d = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put(OperatingSystem.TYPE, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        p9.k kVar = p9.k.C;
        t9.g0 g0Var = kVar.f31297c;
        linkedHashMap.put(Device.TYPE, t9.g0.Q());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put(App.TYPE, packageName);
        linkedHashMap.put("is_lite_sdk", true != t9.g0.g(context) ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        kx0 kx0Var = kVar.f31309p;
        kx0Var.getClass();
        ed.d dVarB = hx.f6279a.b(new je(kx0Var, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((nu) dVarB.get()).f8450j));
            linkedHashMap.put("network_fine", Integer.toString(((nu) dVarB.get()).f8451k));
        } catch (Exception e3) {
            p9.k.C.f31302h.d("CsiConfiguration.CsiConfiguration", e3);
        }
        wk wkVar = al.Bc;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f4348d;
            t9.g0 g0Var2 = p9.k.C.f31297c;
            linkedHashMap2.put("is_bstar", true != t9.g0.e(context) ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        if (((Boolean) ykVar2.a(al.Ga)).booleanValue() && ((Boolean) ykVar2.a(al.O2)).booleanValue()) {
            p9.k kVar2 = p9.k.C;
            if (fs1.n(kVar2.f31302h.f3946g)) {
                return;
            }
            ((LinkedHashMap) this.f4348d).put("plugin", kVar2.f31302h.f3946g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public cw(JsonReader jsonReader, Bundle bundle) throws IOException {
        this.f4346b = 21;
        this.f4350f = bundle;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue() && bundle != null) {
            a0.u.u(p9.k.C.f31304k, bundle, "server-response-parse-start");
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        zp0 zp0Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new xp0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zp0Var = new zp0(jsonReader);
                        if (((Boolean) q9.s.f31967e.f31970c.a(al.C2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", zp0Var.f13072s);
                            bundle.putLong("normalize-ad-response-end", zp0Var.f13073t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectQ = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectQ = com.google.android.gms.internal.measurement.b4.Q(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new dq0(strNextString, jSONObjectQ));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f4349e = arrayList2;
        this.f4347c = arrayList;
        this.f4348d = zp0Var == null ? new zp0(new JsonReader(new StringReader("{}"))) : zp0Var;
    }

    public cw(ha haVar, BlockingQueue blockingQueue, ox0 ox0Var) {
        this.f4346b = 3;
        this.f4347c = new HashMap();
        this.f4350f = ox0Var;
        this.f4348d = haVar;
        this.f4349e = blockingQueue;
    }

    public cw(w20 w20Var, bt0 bt0Var, String str, ni.i iVar) {
        this.f4346b = 10;
        this.f4347c = bt0Var;
        this.f4348d = str;
        this.f4349e = iVar;
        Objects.requireNonNull(w20Var);
        this.f4350f = w20Var;
    }

    public cw(f80 f80Var) {
        this.f4346b = 26;
        this.f4350f = this;
        this.f4347c = f80Var;
        ls1 ls1VarA = ls1.a(new n50((ns1) f80Var.f5259b, (ns1) f80Var.f5261d, (ls1) f80Var.f5268l, ls1.a(rs.f10055y), (ls1) f80Var.f5270n, (ls1) f80Var.i, (ns1) f80Var.f5262e));
        this.f4348d = ls1VarA;
        this.f4349e = ls1.a(new n50((ns1) f80Var.f5261d, ls1VarA, (ls1) f80Var.f5268l, (ls1) f80Var.f5267k, ls1.a(nz.B), new vx0(3, this), (ns1) f80Var.f5262e));
    }

    public cw(r51 r51Var, zd1 zd1Var, ut utVar, n90 n90Var) {
        Object objV;
        this.f4346b = 27;
        if (r51Var != null) {
            objV = x41.v(r51Var);
        } else {
            v41 v41Var = x41.f12018c;
            objV = r51.f9713f;
        }
        this.f4347c = objV;
        this.f4348d = zd1Var;
        this.f4349e = utVar;
        this.f4350f = n90Var;
    }

    public cw(List list) {
        int i;
        this.f4346b = 2;
        this.f4347c = new tk0();
        this.f4348d = new tk0();
        b8 b8Var = new b8(0);
        this.f4349e = b8Var;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = cq0.f4293a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(StringUtils.COMMA, -1);
                b8Var.f3666d = new int[strArrSplit.length];
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    int[] iArr = b8Var.f3666d;
                    try {
                        i = Integer.parseInt(strArrSplit[i10].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i10] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        b8Var.f3667e = Integer.parseInt(strArrSplit2[0]);
                        b8Var.f3668f = Integer.parseInt(strArrSplit2[1]);
                        b8Var.f3664b = true;
                    } catch (RuntimeException e3) {
                        rs.w("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }
}
