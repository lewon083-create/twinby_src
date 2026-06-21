package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kx0 implements aa, p00, kx, lx, w9.c, k81, e80, p9.g, qg0, p9.d, al0, ep0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static kx0 f7323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final jl1 f7324e = new jl1(3, (byte) 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7326c;

    public /* synthetic */ kx0(int i, Object obj) {
        this.f7325b = i;
        this.f7326c = obj;
    }

    public static final kx0 B(Context context) {
        kx0 kx0Var;
        synchronized (kx0.class) {
            try {
                if (f7323d == null) {
                    f7323d = new kx0(context);
                }
                kx0Var = f7323d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kx0Var;
    }

    @Override // p9.g
    public void A() {
        n70 n70Var = ((yc0) this.f7326c).f12587g;
        synchronized (n70Var) {
            try {
                if (n70Var.f8225k) {
                    return;
                }
                ScheduledFuture scheduledFuture = n70Var.f8226l;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    n70Var.i = -1L;
                } else {
                    n70Var.f8226l.cancel(false);
                    long j10 = n70Var.f8222g;
                    n70Var.f8220e.getClass();
                    n70Var.i = j10 - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = n70Var.f8227m;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    n70Var.f8224j = -1L;
                } else {
                    n70Var.f8227m.cancel(false);
                    long j11 = n70Var.f8223h;
                    n70Var.f8220e.getClass();
                    n70Var.f8224j = j11 - SystemClock.elapsedRealtime();
                }
                n70Var.f8225k = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void D(int i, long j10, mt0 mt0Var, String str) {
        zd1 zd1VarA = ((sd0) this.f7326c).a();
        zd1VarA.v("action", "start_preload");
        zd1VarA.v("sp_ts", Long.toString(j10));
        zd1VarA.v("ad_format", mt0Var.a());
        zd1VarA.v("ad_unit_id", mt0Var.f8005a);
        zd1VarA.v("pid", mt0Var.f8007c);
        zd1VarA.v("max_ads", Integer.toString(i));
        zd1VarA.v("pv", str);
        zd1VarA.w();
    }

    public ed.d E(n90 n90Var, dp0 dp0Var, z50 z50Var) {
        p10 p10VarD = dp0Var.d((cp0) n90Var.f8249d);
        gp0 gp0Var = new gp0();
        switch (p10VarD.f8877a) {
            case 0:
                p10VarD.f8879c = gp0Var;
                break;
            default:
                p10VarD.f8879c = gp0Var;
                break;
        }
        z50 z50Var2 = (z50) p10VarD.c();
        this.f7326c = z50Var2;
        b50 b50VarH = z50Var2.h();
        yq0 yq0Var = new yq0();
        i81 i81VarS = i81.s(b50VarH.b());
        zq zqVar = new zq(12, yq0Var, b50VarH);
        f81 f81Var = f81.f5272b;
        return vv.K(vv.J(i81VarS, zqVar, f81Var), new ju(7, yq0Var), f81Var);
    }

    public void F(RemoteException remoteException) {
        ((oq0) this.f7326c).y();
        if (((Boolean) q9.s.f31967e.f31970c.a(al.rf)).booleanValue()) {
            p9.k.C.f31302h.d("Preconnect Remote", remoteException);
        }
    }

    public void H(EnumMap enumMap, long j10) {
        zd1 zd1VarA = ((sd0) this.f7326c).a();
        zd1VarA.v("action", "start_preload");
        zd1VarA.v("sp_ts", Long.toString(j10));
        zd1VarA.v("pv", "1");
        for (k9.a aVar : enumMap.keySet()) {
            String strValueOf = String.valueOf(aVar.name().toLowerCase(Locale.ENGLISH));
            zd1VarA.v(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(aVar)).intValue()));
        }
        zd1VarA.w();
    }

    public void I(boolean z5) {
        synchronized (kx0.class) {
            try {
                n90 n90Var = (n90) this.f7326c;
                n90Var.m(Boolean.valueOf(z5), "paidv2_publisher_option");
                if (!z5) {
                    n90Var.p("paidv2_creation_time");
                    n90Var.p("paidv2_id");
                    n90Var.p("vendor_scoped_gpid_v2_id");
                    n90Var.p("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int J() {
        int iOptInt = ((JSONObject) this.f7326c).optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }

    public void K(int i, int i10, long j10, Long l10, String str, mt0 mt0Var, String str2) {
        zd1 zd1VarA = ((sd0) this.f7326c).a();
        zd1VarA.v("plaac_ts", Long.toString(j10));
        zd1VarA.v("max_ads", Integer.toString(i));
        zd1VarA.v("cache_size", Integer.toString(i10));
        zd1VarA.v("action", "is_ad_available");
        if (mt0Var != null) {
            zd1VarA.v("ad_unit_id", mt0Var.f8005a);
            zd1VarA.v("pid", mt0Var.f8007c);
            zd1VarA.v("ad_format", mt0Var.a());
        }
        if (l10 != null) {
            zd1VarA.v("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            zd1VarA.v("gqi", str);
        }
        zd1VarA.v("pv", str2);
        zd1VarA.w();
    }

    public void L(long j10, int i, int i10, String str, mt0 mt0Var, String str2) {
        zd1 zd1VarA = ((sd0) this.f7326c).a();
        zd1VarA.v("ppla_ts", Long.toString(j10));
        zd1VarA.v("ad_format", mt0Var.a());
        zd1VarA.v("ad_unit_id", mt0Var.f8005a);
        zd1VarA.v("pid", mt0Var.f8007c);
        zd1VarA.v("max_ads", Integer.toString(i));
        zd1VarA.v("cache_size", Integer.toString(i10));
        zd1VarA.v("action", "poll_ad");
        if (str != null) {
            zd1VarA.v("gqi", str);
        }
        zd1VarA.v("pv", str2);
        zd1VarA.w();
    }

    public void N(long j10, mt0 mt0Var, q9.x1 x1Var, int i, int i10, String str) {
        zd1 zd1VarA = ((sd0) this.f7326c).a();
        zd1VarA.v("action", "pftla");
        zd1VarA.v("pftlat_ts", Long.toString(j10));
        zd1VarA.v("pftlaec", Integer.toString(x1Var.f31976b));
        zd1VarA.v("ad_format", mt0Var.a());
        zd1VarA.v("max_ads", Integer.toString(i));
        zd1VarA.v("cache_size", Integer.toString(i10));
        zd1VarA.v("ad_unit_id", mt0Var.f8005a);
        zd1VarA.v("pid", mt0Var.f8007c);
        zd1VarA.v("pv", str);
        zd1VarA.w();
    }

    public void O(String str, long j10, String str2, String str3, k9.a aVar, int i, int i10, int i11) {
        zd1 zd1VarA = ((sd0) this.f7326c).a();
        zd1VarA.v("action", str);
        zd1VarA.v("pat", Long.toString(j10));
        zd1VarA.v("ad_format", aVar.name().toLowerCase(Locale.ENGLISH));
        zd1VarA.v("max_ads", Integer.toString(i));
        zd1VarA.v("cache_size", Integer.toString(i10));
        zd1VarA.v("pas", Integer.toString(i11));
        zd1VarA.v("pv", "2");
        zd1VarA.v("ad_unit_id", str3);
        zd1VarA.v("pid", str2);
        zd1VarA.w();
    }

    public void P(String str, String str2, long j10, int i, int i10, String str3, mt0 mt0Var, String str4) {
        zd1 zd1VarA = ((sd0) this.f7326c).a();
        zd1VarA.v(str2, Long.toString(j10));
        if (mt0Var != null) {
            zd1VarA.v("ad_unit_id", mt0Var.f8005a);
            zd1VarA.v("ad_format", mt0Var.a());
            zd1VarA.v("pid", mt0Var.f8007c);
        }
        zd1VarA.v("action", str);
        if (str3 != null) {
            zd1VarA.v("gqi", str3);
        }
        if (i >= 0) {
            zd1VarA.v("max_ads", Integer.toString(i));
        }
        if (i10 >= 0) {
            zd1VarA.v("cache_size", Integer.toString(i10));
        }
        zd1VarA.v("pv", str4);
        zd1VarA.w();
    }

    public void Q(String str, long j10, String str2, String str3, k9.a aVar, int i, int i10, int i11, int i12, int i13) {
        zd1 zd1VarA = ((sd0) this.f7326c).a();
        zd1VarA.v("action", str);
        zd1VarA.v("pat", Long.toString(j10));
        zd1VarA.v("pid", str2);
        zd1VarA.v("ad_unit_id", str3);
        zd1VarA.v("max_ads", Integer.toString(i));
        zd1VarA.v("cache_size", Integer.toString(i10));
        zd1VarA.v("tpcnt", Integer.toString(i12));
        zd1VarA.v("mpl", Integer.toString(i13));
        if (aVar != null) {
            zd1VarA.v("ad_format", aVar.name().toLowerCase(Locale.ENGLISH));
        }
        if (i11 > 0) {
            zd1VarA.v("nptr", Integer.toString(i11));
        }
        zd1VarA.w();
    }

    @Override // com.google.android.gms.internal.ads.lx, com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f7325b) {
            case 9:
                ((jx) this.f7326c).b((sq) obj);
                break;
            case 14:
                p60 p60Var = (p60) obj;
                String message = ((g90) this.f7326c).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                p60Var.j(vv.C(12, message, null));
                break;
            case 15:
                ((h70) obj).a((q9.h3) this.f7326c);
                break;
            default:
                or0 or0Var = (or0) this.f7326c;
                ((sr0) obj).b(or0Var.f8766c);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.aa
    public void b(MessageDigest[] messageDigestArr, long j10, int i) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = (ByteBuffer) this.f7326c;
        synchronized (byteBuffer) {
            int i10 = (int) j10;
            byteBuffer.position(i10);
            byteBuffer.limit(i10 + i);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public ed.d c(ku kuVar) {
        jg0 jg0Var = (jg0) this.f7326c;
        synchronized (jg0Var.f6134c) {
            try {
                int i = jg0Var.i;
                if (i != 1 && i != 2) {
                    return vv.y(new og0(2));
                }
                if (jg0Var.f6135d) {
                    return jg0Var.f6133b;
                }
                jg0Var.i = 2;
                jg0Var.f6135d = true;
                jg0Var.f6137f = kuVar;
                jg0Var.f6138g.d();
                jx jxVar = jg0Var.f6133b;
                jxVar.f6961b.a(new ig0(jg0Var, 1), hx.f6285g);
                return jxVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public /* synthetic */ Object g() {
        return (z50) this.f7326c;
    }

    @Override // com.google.android.gms.internal.ads.aa
    public long h() {
        return ((ByteBuffer) this.f7326c).capacity();
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        switch (this.f7325b) {
            case 13:
                ((b50) this.f7326c).f3623f.A(true);
                return;
            case 17:
                try {
                    sz szVar = (sz) ((List) obj).get(0);
                    if (szVar != null) {
                        fb0 fb0Var = (fb0) this.f7326c;
                        fb0Var.getClass();
                        fb0Var.f5308d.execute(new c00(szVar, 5));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e3) {
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3047i6)).booleanValue()) {
                        p9.k.C.f31302h.d("omid native display exp", e3);
                        return;
                    }
                    return;
                }
            case 19:
                String str = (String) obj;
                synchronized (this) {
                    se0 se0Var = (se0) this.f7326c;
                    se0Var.f10269c = true;
                    p9.k.C.f31304k.getClass();
                    se0Var.d((int) (SystemClock.elapsedRealtime() - se0Var.f10270d), "com.google.android.gms.ads.MobileAds", "", true);
                    se0Var.i.execute(new l81(25, this, str));
                    break;
                }
                return;
            default:
                eq0 eq0Var = (eq0) obj;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.W6)).booleanValue()) {
                    bg0 bg0Var = (bg0) this.f7326c;
                    zp0 zp0Var = (zp0) eq0Var.f5033b.f4348d;
                    eh0 eh0Var = bg0Var.f3781e;
                    int i = zp0Var.f13060f;
                    synchronized (eh0Var.f4959g) {
                        eh0Var.f4954b = i;
                        break;
                    }
                    eh0 eh0Var2 = bg0Var.f3781e;
                    long j10 = zp0Var.f13061g;
                    synchronized (eh0Var2.f4960h) {
                        eh0Var2.f4955c = j10;
                        break;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p9.d
    public void j() {
        ((g60) ((v10) this.f7326c).f11194p.j()).onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        switch (this.f7325b) {
            case 13:
                ((b50) this.f7326c).f3623f.A(false);
                return;
            case 17:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3047i6)).booleanValue()) {
                    p9.k.C.f31302h.d("omid native display exp", th2);
                    return;
                }
                return;
            case 19:
                synchronized (this) {
                    se0 se0Var = (se0) this.f7326c;
                    se0Var.f10269c = true;
                    p9.k.C.f31304k.getClass();
                    se0Var.d((int) (SystemClock.elapsedRealtime() - se0Var.f10270d), "com.google.android.gms.ads.MobileAds", "Internal Error.", false);
                    se0Var.f10271e.d(new Exception());
                    break;
                }
                return;
            default:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.W6)).booleanValue()) {
                    Matcher matcher = bg0.f3776h.matcher(th2.getMessage());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        bg0 bg0Var = (bg0) this.f7326c;
                        int i = Integer.parseInt(strGroup);
                        eh0 eh0Var = bg0Var.f3781e;
                        synchronized (eh0Var.f4959g) {
                            eh0Var.f4954b = i;
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // p9.d
    /* JADX INFO: renamed from: l */
    public void mo5l() {
        v10 v10Var = (v10) this.f7326c;
        ((q60) v10Var.f11190l.j()).a();
        w80 w80Var = (w80) v10Var.f11196r.j();
        synchronized (w80Var) {
            w80Var.A1(l80.i);
        }
    }

    @Override // com.google.android.gms.internal.ads.al0
    public void r(r40 r40Var) {
        switch (this.f7325b) {
            case 24:
                oq0 oq0Var = (oq0) this.f7326c;
                synchronized (oq0Var) {
                    oq0Var.f8764e = r40Var.f9701f;
                    r40Var.a();
                    break;
                }
                return;
            default:
                tp0 tp0Var = (tp0) this.f7326c;
                qc0 qc0Var = (qc0) r40Var;
                synchronized (tp0Var) {
                    try {
                        tp0Var.f10691k = qc0Var;
                        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3075k4)).booleanValue()) {
                            qc0Var.f9451u.f5889a = tp0Var.f10687f;
                        }
                        tp0Var.f10691k.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // w9.c
    public void w(la.m mVar) {
        try {
            ((ks) this.f7326c).a(mVar.j());
        } catch (RemoteException e3) {
            u9.i.f("", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public /* bridge */ /* synthetic */ ed.d x(n90 n90Var, dp0 dp0Var) {
        return E(n90Var, dp0Var, null);
    }

    @Override // p9.g
    public void y() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        n70 n70Var = ((yc0) this.f7326c).f12587g;
        synchronized (n70Var) {
            try {
                if (n70Var.f8225k) {
                    if (n70Var.i > 0 && (scheduledFuture2 = n70Var.f8226l) != null && scheduledFuture2.isCancelled()) {
                        n70Var.H1(n70Var.i);
                    }
                    if (n70Var.f8224j > 0 && (scheduledFuture = n70Var.f8227m) != null && scheduledFuture.isCancelled()) {
                        n70Var.I1(n70Var.f8224j);
                    }
                    n70Var.f8225k = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ kx0(int i, Object obj, Object obj2) {
        this.f7325b = i;
        this.f7326c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.p00, com.google.android.gms.internal.ads.kx, com.google.android.gms.internal.ads.vm, com.google.android.gms.internal.ads.al0
    /* JADX INFO: renamed from: h */
    public void mo4h() {
        switch (this.f7325b) {
            case 7:
                oq oqVar = (oq) this.f7326c;
                p9.k.C.f31304k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = oqVar.f8753a;
                ArrayList arrayList = (ArrayList) oqVar.f8755c;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j10));
                String strValueOf = String.valueOf(arrayList.get(0));
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52);
                sb2.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb2.append(strValueOf);
                sb2.append(" ms.");
                t9.c0.m(sb2.toString());
                t9.g0.f33596l.postDelayed(new mq((rq) oqVar.f8754b, (qq) oqVar.f8756d, (hq) oqVar.f8757e, arrayList, j10, 1), ((Integer) q9.s.f31967e.f31970c.a(al.f2962d)).intValue());
                return;
            case 8:
                ((pq) this.f7326c).f9152e.i();
                return;
            case 22:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.qf)).booleanValue()) {
                    zd1 zd1VarA = ((sd0) ((oq0) this.f7326c).f8764e).a();
                    zd1VarA.v("action", "ptard");
                    zd1VarA.v("ptard", "r");
                    zd1VarA.w();
                    return;
                }
                return;
            case 24:
                synchronized (((oq0) this.f7326c)) {
                    break;
                }
                return;
            default:
                tp0 tp0Var = (tp0) this.f7326c;
                synchronized (tp0Var) {
                    tp0Var.f10691k = null;
                    break;
                }
                return;
        }
    }

    public kx0(n10 n10Var) {
        this.f7325b = 12;
        this.f7326c = new j40((qs1) n10Var.f8114g, (qs1) n10Var.T, (ms1) new i20(n10Var.U, 18), (qs1) n10Var.V, (qs1) n10Var.f8137t, 8);
    }

    public kx0(int i) {
        this.f7325b = i;
        switch (i) {
            case 11:
                this.f7326c = new WeakHashMap();
                break;
            case 25:
                break;
            default:
                int i10 = tm1.f10663a;
                nu0 nu0Var = new nu0(6, new lo1[]{c6.f4049j, f7324e});
                Charset charset = ao1.f3341a;
                this.f7326c = nu0Var;
                break;
        }
    }

    public kx0(Context context) {
        this.f7325b = 0;
        if (n90.f8246e == null) {
            n90.f8246e = new n90(context, 18);
        }
        this.f7326c = n90.f8246e;
    }

    public kx0(qn qnVar) {
        Context context;
        this.f7325b = 6;
        this.f7326c = qnVar;
        try {
            context = (Context) xa.b.X1(qnVar.J2());
        } catch (RemoteException | NullPointerException e3) {
            u9.i.f("", e3);
            context = null;
        }
        if (context != null) {
            try {
                ((qn) this.f7326c).L(new xa.b(new n9.b(context)));
            } catch (RemoteException e7) {
                u9.i.f("", e7);
            }
        }
    }

    public kx0(pq pqVar) {
        this.f7325b = 8;
        Objects.requireNonNull(pqVar);
        this.f7326c = pqVar;
    }

    public kx0(se0 se0Var) {
        this.f7325b = 19;
        Objects.requireNonNull(se0Var);
        this.f7326c = se0Var;
    }

    public kx0(oq0 oq0Var) {
        this.f7325b = 24;
        Objects.requireNonNull(oq0Var);
        this.f7326c = oq0Var;
    }

    public kx0(ByteBuffer byteBuffer) {
        this.f7325b = 4;
        this.f7326c = byteBuffer.slice();
    }

    @Override // p9.d
    public void z(View view) {
    }
}
