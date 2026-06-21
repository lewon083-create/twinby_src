package aa;

import a0.b1;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.a90;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.at0;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.b10;
import com.google.android.gms.internal.ads.b20;
import com.google.android.gms.internal.ads.b60;
import com.google.android.gms.internal.ads.bs0;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.d10;
import com.google.android.gms.internal.ads.d60;
import com.google.android.gms.internal.ads.e50;
import com.google.android.gms.internal.ads.gd0;
import com.google.android.gms.internal.ads.gq0;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.h50;
import com.google.android.gms.internal.ads.h60;
import com.google.android.gms.internal.ads.hi;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.j10;
import com.google.android.gms.internal.ads.j21;
import com.google.android.gms.internal.ads.j80;
import com.google.android.gms.internal.ads.jc0;
import com.google.android.gms.internal.ads.jk0;
import com.google.android.gms.internal.ads.jn0;
import com.google.android.gms.internal.ads.jq0;
import com.google.android.gms.internal.ads.jx0;
import com.google.android.gms.internal.ads.k50;
import com.google.android.gms.internal.ads.kh0;
import com.google.android.gms.internal.ads.kp0;
import com.google.android.gms.internal.ads.l81;
import com.google.android.gms.internal.ads.lk0;
import com.google.android.gms.internal.ads.ls1;
import com.google.android.gms.internal.ads.ms1;
import com.google.android.gms.internal.ads.mx0;
import com.google.android.gms.internal.ads.my0;
import com.google.android.gms.internal.ads.np0;
import com.google.android.gms.internal.ads.ns1;
import com.google.android.gms.internal.ads.nx0;
import com.google.android.gms.internal.ads.oj0;
import com.google.android.gms.internal.ads.or0;
import com.google.android.gms.internal.ads.ox0;
import com.google.android.gms.internal.ads.ph0;
import com.google.android.gms.internal.ads.pr0;
import com.google.android.gms.internal.ads.q11;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qs1;
import com.google.android.gms.internal.ads.rq0;
import com.google.android.gms.internal.ads.rr0;
import com.google.android.gms.internal.ads.sd0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.te0;
import com.google.android.gms.internal.ads.tw;
import com.google.android.gms.internal.ads.uk0;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.ads.yd0;
import com.google.android.gms.internal.ads.yl0;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import q9.d3;
import q9.g3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f688a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1 f694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qs1 f695h;
    public final qs1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qs1 f696j;

    public q(d10 d10Var, k50 k50Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, d60 d60Var, ls1 ls1Var4, ls1 ls1Var5, ls1 ls1Var6) {
        this.f693f = d10Var;
        this.f692e = k50Var;
        this.f694g = ls1Var;
        this.f689b = ls1Var2;
        this.f690c = ls1Var3;
        this.f696j = d60Var;
        this.f691d = ls1Var4;
        this.f695h = ls1Var5;
        this.i = ls1Var6;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        y50 y50Var;
        String string;
        int i;
        String string2;
        int i10;
        t tVar;
        JSONObject jSONObject;
        String string3;
        Iterator it;
        long j10;
        p9.k kVar;
        long jCurrentTimeMillis;
        wk wkVar;
        q9.s sVar;
        jx0 jx0VarA;
        switch (this.f688a) {
            case 0:
                l lVar = (l) this.f693f.j();
                rr0 rr0Var = (rr0) this.f689b.j();
                s sVar2 = (s) this.f695h;
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                r rVar = new r(gxVar, ((aw) sVar2.f700b).a());
                y50 y50VarA = ((m) this.i).a();
                a90 a90Var = (a90) this.f690c.j();
                o oVar = (o) this.f694g.j();
                tw twVar = (tw) ((ls1) this.f691d).j();
                int iIntValue = ((Integer) ((ls1) this.f692e).j()).intValue();
                Bundle bundle = ((d60) this.f696j).a().f6587t;
                t tVar2 = null;
                if (iIntValue != 1 || twVar == null) {
                    y50Var = y50VarA;
                } else {
                    p9.k kVar2 = p9.k.C;
                    kVar2.f31304k.getClass();
                    bundle.putLong("read-from-disk-start", System.currentTimeMillis());
                    oVar.getClass();
                    o.b(37, bundle);
                    if (kVar2.f31302h.g().t()) {
                        oVar.f672b.c();
                        o.c(7, bundle);
                    } else {
                        PackageInfo packageInfo = oVar.f675e;
                        if (packageInfo == null) {
                            oVar.f672b.c();
                            o.c(10, bundle);
                        } else {
                            a0 a0Var = oVar.f672b;
                            Context context = oVar.f671a;
                            a0Var.e();
                            synchronized (a0Var.f551d) {
                                string = a0Var.f548a.getString("pn", null);
                                break;
                            }
                            a0Var.e();
                            synchronized (a0Var.f551d) {
                                i = a0Var.f548a.getInt("vc", -1);
                                break;
                            }
                            a0Var.e();
                            synchronized (a0Var.f551d) {
                                string2 = a0Var.f548a.getString("dm", null);
                                break;
                            }
                            a0Var.e();
                            synchronized (a0Var.f551d) {
                                i10 = a0Var.f548a.getInt("aav", -1);
                                break;
                            }
                            if (TextUtils.equals(context.getApplicationInfo().packageName, string) && i == packageInfo.versionCode && TextUtils.equals(Build.MODEL, string2) && i10 == Build.VERSION.SDK_INT) {
                                Iterator it2 = a0Var.d().entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    try {
                                        j10 = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                                        kVar = p9.k.C;
                                        kVar.f31304k.getClass();
                                        jCurrentTimeMillis = System.currentTimeMillis() - j10;
                                        wkVar = al.f3212t8;
                                        sVar = q9.s.f31967e;
                                        it = it2;
                                        try {
                                        } catch (IOException | JSONException unused) {
                                            continue;
                                        }
                                    } catch (IOException | JSONException unused2) {
                                        it = it2;
                                    }
                                    if (jCurrentTimeMillis <= ((Long) sVar.f31970c.a(wkVar)).longValue()) {
                                        mx0 mx0VarF = mx0.f(context);
                                        long jLongValue = ((Long) sVar.f31970c.a(al.T3)).longValue();
                                        boolean zT = kVar.f31302h.g().t();
                                        mx0VarF.getClass();
                                        synchronized (mx0.class) {
                                            jx0VarA = mx0VarF.a(null, null, jLongValue, zT);
                                            break;
                                        }
                                        jx0 jx0VarG = nx0.f(context).g(((Long) sVar.f31970c.a(al.U3)).longValue(), kVar.f31302h.g().t());
                                        long j11 = jx0VarA.f6963b;
                                        if (j11 == -1 || j11 <= j10) {
                                            long j12 = jx0VarG.f6963b;
                                            if (j12 == -1 || j12 <= j10) {
                                            }
                                        }
                                        it2 = it;
                                    }
                                    a0Var.a((String) entry.getKey());
                                    it2 = it;
                                }
                            } else {
                                a0Var.c();
                                String str = context.getApplicationInfo().packageName;
                                int i11 = packageInfo.versionCode;
                                String str2 = Build.MODEL;
                                a0Var.b(i11, Build.VERSION.SDK_INT, str);
                            }
                            o.b(38, bundle);
                            p9.k.C.f31304k.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - oVar.f673c;
                            wk wkVar2 = al.f3167q8;
                            q9.s sVar3 = q9.s.f31967e;
                            if (jCurrentTimeMillis2 > ((Long) sVar3.f31970c.a(wkVar2)).longValue()) {
                                o.c(2, bundle);
                                y50Var = y50VarA;
                            } else {
                                o.b(39, bundle);
                                String str3 = twVar.f10737b;
                                String str4 = twVar.f10738c;
                                d3 d3Var = twVar.f10740e;
                                String string4 = d3Var.f31813o.toString();
                                String string5 = d3Var.f31803d.toString();
                                String str5 = d3Var.f31808j;
                                String str6 = d3Var.f31815q;
                                String strValueOf = String.valueOf(d3Var.f31814p);
                                int length = String.valueOf(str3).length();
                                int length2 = String.valueOf(str4).length();
                                int length3 = String.valueOf(string4).length();
                                int length4 = String.valueOf(string5).length();
                                y50Var = y50VarA;
                                StringBuilder sb2 = new StringBuilder(length + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length() + strValueOf.length());
                                l7.o.t(sb2, str3, str4, string4, string5);
                                sb2.append(str5);
                                sb2.append(str6);
                                sb2.append(strValueOf);
                                String strD = u9.d.d(sb2.toString(), "SHA-256");
                                if (TextUtils.isEmpty(strD)) {
                                    o.c(3, bundle);
                                } else {
                                    o.b(40, bundle);
                                    o.b(41, bundle);
                                    String strA = oVar.f672b.a(strD);
                                    o.b(42, bundle);
                                    if (!oVar.a()) {
                                        oVar.f674d.schedule(new b(oVar, strD, lVar, new tw(str3, str4, twVar.f10739d, d3Var, 2, strD), 0), ((Long) sVar3.f31970c.a(al.f3197s8)).longValue(), TimeUnit.MILLISECONDS);
                                    }
                                    if (TextUtils.isEmpty(strA)) {
                                        o.c(4, bundle);
                                    } else {
                                        o.b(43, bundle);
                                        try {
                                            jSONObject = new JSONObject(strA);
                                            string3 = jSONObject.getString("sr");
                                        } catch (JSONException e3) {
                                            tVar = null;
                                            o.c(5, bundle);
                                            p9.k.C.f31302h.d("DiskCachingManager.getSignalResponse", e3);
                                        }
                                        if (TextUtils.isEmpty(string3)) {
                                            o.c(8, bundle);
                                        } else {
                                            String string6 = jSONObject.getString("rs");
                                            if (TextUtils.isEmpty(string6)) {
                                                o.c(9, bundle);
                                            } else {
                                                String strJ = t9.g0.J(new String(Base64.decode(string6, 10), StandardCharsets.UTF_8), "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2");
                                                o.b(44, bundle);
                                                try {
                                                    tVar = null;
                                                    try {
                                                        t tVar3 = new t(new JsonReader(new StringReader(string3)), null);
                                                        tVar3.f703c = strJ;
                                                        tVar3.f705e = bundle;
                                                        bundle.putBoolean("sod_h", true);
                                                        tVar2 = tVar3;
                                                    } catch (IOException e7) {
                                                        e = e7;
                                                        o.c(6, bundle);
                                                        p9.k.C.f31302h.d("DiskCachingManager.getSignalResponse", e);
                                                        tVar2 = tVar;
                                                    }
                                                } catch (IOException e10) {
                                                    e = e10;
                                                    tVar = null;
                                                }
                                                a0.u.u(p9.k.C.f31304k, bundle, "read-from-disk-end");
                                            }
                                        }
                                    }
                                }
                            }
                            tVar2 = null;
                            a0.u.u(p9.k.C.f31304k, bundle, "read-from-disk-end");
                        }
                    }
                    y50Var = y50VarA;
                    a0.u.u(p9.k.C.f31304k, bundle, "read-from-disk-end");
                }
                if (tVar2 != null) {
                    synchronized (a90Var) {
                        a90Var.A1(new ox0(19, tVar2));
                    }
                    return vv.d(tVar2);
                }
                hi hiVarH = rr0Var.a(y50Var.o(), pr0.GENERATE_SIGNALS).h(rVar);
                long jIntValue = ((Integer) q9.s.f31967e.f31970c.a(al.f3210t6)).intValue();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                or0 or0VarR = hiVarH.q(jIntValue).r();
                or0VarR.a(new l81(0, or0VarR, new b1(2, a90Var)), hx.f6279a);
                return or0VarR;
            case 1:
                return new jc0(((d10) this.f693f).a(), (Executor) this.f689b.j(), (xe) this.f690c.j(), ((j10) this.f694g).a(), b20.a(), (kh0) ((ls1) this.f691d).j(), (bt0) ((ls1) this.f692e).j(), (sd0) ((ls1) this.f695h).j(), (ph0) ((ls1) this.i).j(), (jq0) ((ls1) this.f696j).j());
            case 2:
                Executor executor = (Executor) this.f689b.j();
                Context contextA = ((d10) this.f693f).a();
                WeakReference weakReference = ((b10) this.f694g).f3555b.f12811d;
                gr.G(weakReference);
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new se0(executor, contextA, weakReference, gxVar2, (gd0) this.f690c.j(), (ScheduledExecutorService) ((ls1) this.f691d).j(), (yd0) ((ls1) this.f692e).j(), ((j10) this.f695h).a(), new j80(((h60) this.i).f6039b.j()), (bs0) ((ls1) this.f696j).j());
            case 3:
                return new xk0((Context) ((ns1) this.f692e).f8433a, (g3) ((ns1) this.f695h).f8433a, (String) ((ns1) this.i).f8433a, (kp0) this.f689b.j(), (uk0) this.f690c.j(), (np0) ((ls1) this.f691d).j(), ((j10) this.f693f).a(), (xe) this.f694g.j(), (sd0) this.f696j.j());
            case 4:
                Context contextA2 = ((d10) this.f693f).a();
                String str7 = ((e50) ((k50) this.f692e).f7123b.j()).f4838c.f12355e;
                gr.G(str7);
                return new yl0(contextA2, str7, (String) this.f694g.j(), (e50) this.f689b.j(), (rq0) this.f690c.j(), ((d60) this.f696j).a(), (qd0) ((ls1) this.f691d).j(), (h50) this.f695h.j(), ((Long) this.i.j()).longValue());
            case 5:
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new jn0(gxVar3, (ScheduledExecutorService) this.f693f.j(), (String) this.f694g.j(), (lk0) this.f692e.j(), (Context) this.f689b.j(), ((d60) this.f696j).a(), (jk0) this.f690c.j(), (gd0) this.f695h.j(), (te0) this.i.j(), ((Integer) ((ls1) this.f691d).j()).intValue());
            case 6:
                oj0 oj0Var = (oj0) this.f689b.j();
                u9.a aVarA = ((j10) this.f693f).a();
                String str8 = ((e50) ((k50) this.f691d).f7123b.j()).f4838c.f12355e;
                gr.G(str8);
                return new at0(oj0Var, aVarA, str8, (String) this.f694g.j(), ((d10) this.f692e).a(), ((b60) this.f695h).f3656b.f2789d, (gq0) this.f690c.j(), (ua.a) this.i.j(), (xe) this.f696j.j());
            default:
                return new q11((my0) this.f689b.j(), (my0) this.f690c.j(), ls1.b((ls1) this.f691d), (my0) ((ls1) this.f692e).j(), (my0) ((ls1) this.f695h).j(), ls1.b((ls1) this.i), (File) ((ls1) this.f696j).j(), (ExecutorService) this.f693f.j(), (j21) this.f694g.j());
        }
    }

    public q(d10 d10Var, ls1 ls1Var, ls1 ls1Var2, j10 j10Var, b20 b20Var, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, ls1 ls1Var6, ls1 ls1Var7) {
        this.f693f = d10Var;
        this.f689b = ls1Var;
        this.f690c = ls1Var2;
        this.f694g = j10Var;
        this.f691d = ls1Var3;
        this.f692e = ls1Var4;
        this.f695h = ls1Var5;
        this.i = ls1Var6;
        this.f696j = ls1Var7;
    }

    public q(ls1 ls1Var, d10 d10Var, b10 b10Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, j10 j10Var, h60 h60Var, ls1 ls1Var5) {
        this.f689b = ls1Var;
        this.f693f = d10Var;
        this.f694g = b10Var;
        this.f690c = ls1Var2;
        this.f691d = ls1Var3;
        this.f692e = ls1Var4;
        this.f695h = j10Var;
        this.i = h60Var;
        this.f696j = ls1Var5;
    }

    public q(ls1 ls1Var, ls1 ls1Var2, s sVar, m mVar, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, ls1 ls1Var6, d60 d60Var) {
        this.f693f = ls1Var;
        this.f689b = ls1Var2;
        this.f695h = sVar;
        this.i = mVar;
        this.f690c = ls1Var3;
        this.f694g = ls1Var4;
        this.f691d = ls1Var5;
        this.f692e = ls1Var6;
        this.f696j = d60Var;
    }

    public q(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, ls1 ls1Var6, ls1 ls1Var7, ns1 ns1Var, ls1 ls1Var8) {
        this.f689b = ls1Var;
        this.f690c = ls1Var2;
        this.f691d = ls1Var3;
        this.f692e = ls1Var4;
        this.f695h = ls1Var5;
        this.i = ls1Var6;
        this.f696j = ls1Var7;
        this.f693f = ns1Var;
        this.f694g = ls1Var8;
    }

    public q(ls1 ls1Var, qs1 qs1Var, k50 k50Var, qs1 qs1Var2, qs1 qs1Var3, b60 b60Var, ls1 ls1Var2, qs1 qs1Var4, qs1 qs1Var5) {
        this.f689b = ls1Var;
        this.f693f = qs1Var;
        this.f691d = k50Var;
        this.f694g = qs1Var2;
        this.f692e = qs1Var3;
        this.f695h = b60Var;
        this.f690c = ls1Var2;
        this.i = qs1Var4;
        this.f696j = qs1Var5;
    }

    public q(ns1 ns1Var, ns1 ns1Var2, ns1 ns1Var3, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, j10 j10Var, ls1 ls1Var4, ls1 ls1Var5) {
        this.f692e = ns1Var;
        this.f695h = ns1Var2;
        this.i = ns1Var3;
        this.f689b = ls1Var;
        this.f690c = ls1Var2;
        this.f691d = ls1Var3;
        this.f693f = j10Var;
        this.f694g = ls1Var4;
        this.f696j = ls1Var5;
    }

    public q(qs1 qs1Var, qs1 qs1Var2, qs1 qs1Var3, ls1 ls1Var, d60 d60Var, ls1 ls1Var2, qs1 qs1Var4, qs1 qs1Var5, ls1 ls1Var3) {
        this.f693f = qs1Var;
        this.f694g = qs1Var2;
        this.f692e = qs1Var3;
        this.f689b = ls1Var;
        this.f696j = d60Var;
        this.f690c = ls1Var2;
        this.f695h = qs1Var4;
        this.i = qs1Var5;
        this.f691d = ls1Var3;
    }
}
