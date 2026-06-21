package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.Session;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g00 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, sz {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f5560d0 = 0;
    public final String A;
    public i00 B;
    public boolean C;
    public boolean D;
    public vm E;
    public zb0 F;
    public uh G;
    public int H;
    public int I;
    public cl J;
    public final cl K;
    public cl L;
    public final ut M;
    public int N;
    public s9.d O;
    public boolean P;
    public final hi.h Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public HashMap W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final WindowManager f5561a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r00 f5562b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final si f5563b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe f5564c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f5565c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jq0 f5566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nl f5567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u9.a f5568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p9.g f5569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l6.i f5570h;
    public final DisplayMetrics i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f5571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public xp0 f5572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zp0 f5573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k00 f5576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s9.d f5577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public wh0 f5578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public vh0 f5579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j0 f5580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f5581t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5582u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5583v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f5586y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5587z;

    public g00(r00 r00Var, j0 j0Var, String str, boolean z5, xe xeVar, nl nlVar, u9.a aVar, p9.g gVar, l6.i iVar, si siVar, xp0 xp0Var, zp0 zp0Var, jq0 jq0Var) {
        zp0 zp0Var2;
        String str2;
        super(r00Var);
        this.f5574m = false;
        this.f5575n = false;
        this.f5587z = true;
        this.A = "";
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.f5562b = r00Var;
        this.f5580s = j0Var;
        this.f5581t = str;
        this.f5584w = z5;
        this.f5564c = xeVar;
        this.f5566d = jq0Var;
        this.f5567e = nlVar;
        this.f5568f = aVar;
        this.f5569g = gVar;
        this.f5570h = iVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f5561a0 = windowManager;
        t9.g0 g0Var = p9.k.C.f31297c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.i = displayMetrics;
        this.f5571j = displayMetrics.density;
        this.f5563b0 = siVar;
        this.f5572k = xp0Var;
        this.f5573l = zp0Var;
        this.Q = new hi.h(r00Var.f9647a, this, this);
        this.f5565c0 = false;
        setBackgroundColor(0);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Oc)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e3) {
            u9.i.f("Unable to enable Javascript.", e3);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        wk wkVar = al.Nc;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) sVar.f31970c.a(al.ue)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        p9.k kVar = p9.k.C;
        settings.setUserAgentString(kVar.f31297c.F(r00Var, aVar.f34365b));
        Context context = getContext();
        com.google.android.gms.internal.measurement.j4.A(context, new aa.x(10, settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        F();
        addJavascriptInterface(new j00(this, new cf(15, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        ut utVar = this.M;
        if (utVar != null) {
            el elVar = (el) utVar.f11062d;
            com.google.android.gms.internal.consent_sdk.c cVarA = kVar.f31302h.a();
            if (cVarA != null) {
                ((ArrayBlockingQueue) cVarA.f13337a).offer(elVar);
            }
        }
        el elVar2 = new el(this.f5581t);
        ut utVar2 = new ut(elVar2);
        this.M = utVar2;
        synchronized (elVar2.f4994c) {
        }
        if (((Boolean) sVar.f31970c.a(al.f3118n2)).booleanValue() && (zp0Var2 = this.f5573l) != null && (str2 = zp0Var2.f13056b) != null) {
            elVar2.c("gqi", str2);
        }
        cl clVarD = el.d();
        this.K = clVarD;
        ((HashMap) utVar2.f11061c).put("native:view_create", clVarD);
        Context contextCreatePackageContext = null;
        this.L = null;
        this.J = null;
        int i = 3;
        if (d8.k.f15638d == null) {
            d8.k.f15638d = new d8.k(i);
        }
        d8.k kVar2 = d8.k.f15638d;
        kVar2.getClass();
        t9.c0.m("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(r00Var);
        if (!defaultUserAgent.equals(kVar2.f15640c)) {
            int i10 = ma.j.f28781e;
            try {
                contextCreatePackageContext = r00Var.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (contextCreatePackageContext == null) {
                r00Var.getSharedPreferences("admob_user_agent", 0).edit().putString(Session.JsonKeys.USER_AGENT, WebSettings.getDefaultUserAgent(r00Var)).apply();
            }
            kVar2.f15640c = defaultUserAgent;
        }
        t9.c0.m("User agent is updated.");
        kVar.f31302h.f3949k.incrementAndGet();
    }

    @Override // p9.g
    public final synchronized void A() {
        p9.g gVar = this.f5569g;
        if (gVar != null) {
            gVar.A();
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized boolean A0() {
        return this.f5583v;
    }

    public final /* synthetic */ void B(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final ed.d B0() {
        nl nlVar = this.f5567e;
        return nlVar == null ? n81.f8237c : (i81) vv.I(i81.s(n81.f8237c), ((Long) am.f3316c.r()).longValue(), TimeUnit.MILLISECONDS, nlVar.f8355c);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final ArrayList C() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void C0(xp0 xp0Var, zp0 zp0Var) {
        this.f5572k = xp0Var;
        this.f5573l = zp0Var;
    }

    public final /* synthetic */ void D() {
        super.loadUrl("about:blank");
    }

    public final synchronized void E() {
        try {
            t9.g0.f33596l.post(new e00(this, 1));
        } catch (Throwable th2) {
            p9.k.C.f31302h.d("AdWebViewImpl.loadUrlUnsafe", th2);
            u9.i.i("Could not call loadUrl in destroy(). ", th2);
        }
    }

    public final synchronized void F() {
        try {
            xp0 xp0Var = this.f5572k;
            if (xp0Var != null && xp0Var.f12250m0) {
                u9.i.c("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.f5585x) {
                            setLayerType(1, null);
                        }
                        this.f5585x = true;
                    } finally {
                    }
                }
                return;
            }
            if (this.f5584w || this.f5580s.b()) {
                u9.i.c("Enabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (this.f5585x) {
                            setLayerType(0, null);
                        }
                        this.f5585x = false;
                    } finally {
                    }
                }
                return;
            }
            u9.i.c("Enabling hardware acceleration on an AdView.");
            synchronized (this) {
                try {
                    if (this.f5585x) {
                        setLayerType(0, null);
                    }
                    this.f5585x = false;
                } finally {
                }
            }
            return;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void F0(boolean z5) {
        boolean z10;
        s9.d dVar = this.f5577p;
        if (dVar == null) {
            this.f5582u = z5;
            return;
        }
        k00 k00Var = this.f5576o;
        synchronized (k00Var.f7059e) {
            z10 = k00Var.f7071r;
        }
        dVar.r4(z10, z5);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final int G() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized s9.d G0() {
        return this.f5577p;
    }

    public final synchronized void H() {
        if (this.P) {
            return;
        }
        this.P = true;
        p9.k.C.f31302h.f3949k.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void H0(zb0 zb0Var) {
        this.F = zb0Var;
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final void I(eh ehVar) {
        boolean z5;
        synchronized (this) {
            z5 = ehVar.f4951j;
            this.C = z5;
        }
        N(z5);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final zp0 I0() {
        return this.f5573l;
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void J() {
        k00 k00Var = this.f5576o;
        if (k00Var != null) {
            k00Var.J();
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void J0() {
        t9.c0.m("Cannot add text view to inner AdWebView");
    }

    public final synchronized void K() {
        try {
            HashMap map = this.W;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((xy) it.next()).a();
                }
            }
            this.W = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void K0(String str, String str2) throws Throwable {
        Throwable th2;
        String str3;
        try {
            try {
                if (A0()) {
                    u9.i.h("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) q9.s.f31967e.f31970c.a(al.f3145p0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e3) {
                        u9.i.i("Unable to build MRAID_ENV", e3);
                        str3 = null;
                    }
                    super.loadDataWithBaseURL(str, n00.a(str2, str3), "text/html", "UTF-8", null);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void L() {
        k00 k00Var = this.f5576o;
        if (k00Var != null) {
            k00Var.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void L0(Context context) {
        r00 r00Var = this.f5562b;
        r00Var.setBaseContext(context);
        this.Q.f20601f = r00Var.f9647a;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final xp0 M() {
        return this.f5572k;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized s9.d M0() {
        return this.O;
    }

    public final void N(boolean z5) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z5 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        c("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized vh0 N0() {
        return this.f5579r;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized boolean O0() {
        return this.f5584w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.sz
    public final void P0(int i, boolean z5, boolean z10) {
        q9.a aVar;
        v80 v80Var;
        ph0 ph0Var;
        int i10;
        q9.a aVar2;
        boolean z11;
        k00 k00Var = this.f5576o;
        d00 d00Var = k00Var.f7056b;
        boolean z12 = k00.z(d00Var.f4408b.O0(), d00Var);
        boolean z13 = true;
        if (!z12 && z10) {
            z13 = false;
        }
        if (z12) {
            aVar = null;
            v80Var = null;
        } else {
            aVar = k00Var.f7060f;
            v80Var = null;
        }
        s9.l lVar = k00Var.f7061g;
        v80 v80Var2 = v80Var;
        s9.c cVar = k00Var.f7075v;
        u9.a aVar3 = d00Var.f4408b.f5568f;
        v80 v80Var3 = z13 ? v80Var2 : k00Var.f7065l;
        if (k00.y(d00Var)) {
            ph0Var = k00Var.H;
            i10 = i;
            z11 = z5;
            aVar2 = aVar;
        } else {
            ph0Var = v80Var2;
            i10 = i;
            aVar2 = aVar;
            z11 = z5;
        }
        k00Var.a(new AdOverlayInfoParcel(aVar2, lVar, cVar, d00Var, z11, i10, aVar3, v80Var3, ph0Var));
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void Q0(vh0 vh0Var) {
        this.f5579r = vh0Var;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void R0(int i) {
        this.N = i;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized String S() {
        return this.f5581t;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void S0(boolean z5) {
        s9.d dVar;
        int i = this.H + (true != z5 ? -1 : 1);
        this.H = i;
        if (i > 0 || (dVar = this.f5577p) == null) {
            return;
        }
        synchronized (dVar.f32819o) {
            try {
                dVar.f32822r = true;
                ob.h4 h4Var = dVar.f32821q;
                if (h4Var != null) {
                    t9.d0 d0Var = t9.g0.f33596l;
                    d0Var.removeCallbacks(h4Var);
                    d0Var.post(dVar.f32821q);
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void U() {
        zb0 zb0Var = this.F;
        if (zb0Var != null) {
            t9.g0.f33596l.post(new h30(9, zb0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void U0(long j10, boolean z5) {
        HashMap map = new HashMap(2);
        map.put("success", true != z5 ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        map.put("duration", Long.toString(j10));
        c("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void V0(String str, xy xyVar) {
        try {
            if (this.W == null) {
                this.W = new HashMap();
            }
            this.W.put(str, xyVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void W0(j0 j0Var) {
        this.f5580s = j0Var;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void X0(boolean z5, int i, String str, boolean z10, boolean z11) {
        k00 k00Var = this.f5576o;
        d00 d00Var = k00Var.f7056b;
        boolean zO0 = d00Var.f4408b.O0();
        boolean z12 = k00.z(zO0, d00Var);
        boolean z13 = true;
        if (!z12 && z10) {
            z13 = false;
        }
        q9.a aVar = z12 ? null : k00Var.f7060f;
        wz wzVar = zO0 ? null : new wz(d00Var, k00Var.f7061g);
        lo loVar = k00Var.f7063j;
        ph0 ph0Var = null;
        mo moVar = k00Var.f7064k;
        boolean z14 = z13;
        wz wzVar2 = wzVar;
        s9.c cVar = k00Var.f7075v;
        u9.a aVar2 = d00Var.f4408b.f5568f;
        v80 v80Var = z14 ? null : k00Var.f7065l;
        if (k00.y(d00Var)) {
            ph0Var = k00Var.H;
        }
        k00Var.a(new AdOverlayInfoParcel(aVar, wzVar2, loVar, moVar, cVar, d00Var, z5, i, str, aVar2, v80Var, ph0Var, z11));
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void Y0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final xe Z0() {
        return this.f5564c;
    }

    @Override // com.google.android.gms.internal.ads.iq
    public final void a(String str, JSONObject jSONObject) {
        g(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void a1(String str, ox0 ox0Var) {
        k00 k00Var = this.f5576o;
        if (k00Var != null) {
            synchronized (k00Var.f7059e) {
                try {
                    List<vo> list = (List) k00Var.f7058d.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (vo voVar : list) {
                        if (voVar instanceof fq) {
                            if (((fq) voVar).f5419b.equals((vo) ox0Var.f8851c)) {
                                arrayList.add(voVar);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.iq
    public final void b(String str) {
        r(str);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void b1(uh uhVar) {
        this.G = uhVar;
    }

    @Override // com.google.android.gms.internal.ads.dq
    public final void c(String str, Map map) {
        try {
            h(str, q9.r.f31959g.f31960a.k(map));
        } catch (JSONException unused) {
            u9.i.h("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void c1(int i) {
        cl clVar = this.K;
        ut utVar = this.M;
        if (i == 0) {
            c80.g((el) utVar.f11062d, clVar, "aebb2");
        }
        c80.g((el) utVar.f11062d, clVar, "aeh2");
        utVar.getClass();
        ((el) utVar.f11062d).c("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.f5568f.f34365b);
        c("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final Activity d() {
        return this.f5562b.f9647a;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final boolean d1() {
        return false;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.sz
    public final synchronized void destroy() {
        View decorView;
        try {
            ut utVar = this.M;
            if (utVar != null) {
                el elVar = (el) utVar.f11062d;
                com.google.android.gms.internal.consent_sdk.c cVarA = p9.k.C.f31302h.a();
                if (cVarA != null) {
                    ((ArrayBlockingQueue) cVarA.f13337a).offer(elVar);
                }
            }
            hi.h hVar = this.Q;
            hVar.f20599d = false;
            Activity activity = (Activity) hVar.f20601f;
            if (activity != null && hVar.f20597b) {
                g00 g00Var = (g00) hVar.f20602g;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(g00Var);
                }
                hVar.f20597b = false;
            }
            s9.d dVar = this.f5577p;
            if (dVar != null) {
                dVar.z();
                this.f5577p.y();
                this.f5577p = null;
            }
            this.f5578q = null;
            this.f5579r = null;
            this.f5576o.g();
            this.G = null;
            this.f5569g = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f5583v) {
                return;
            }
            p9.k.C.A.a(this);
            K();
            this.f5583v = true;
            if (!((Boolean) q9.s.f31967e.f31970c.a(al.Yb)).booleanValue()) {
                t9.c0.m("Destroying the WebView immediately...");
                k();
                return;
            }
            Activity activity2 = this.f5562b.f9647a;
            if (activity2 != null && activity2.isDestroyed()) {
                t9.c0.m("Destroying the WebView immediately...");
                k();
            } else {
                t9.c0.m("Initiating WebView self destruct sequence in 3...");
                t9.c0.m("Loading blank page in WebView, 2...");
                E();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void e() {
        s9.d dVarG0 = G0();
        if (dVarG0 != null) {
            dVarG0.f32817m.f32842c = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final jq0 e1() {
        return this.f5566d;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (A0()) {
            u9.i.k("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.Zb)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            hx.f6284f.a(new d1(this, str, valueCallback, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final cl f() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final z7 f1() {
        return null;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f5583v) {
                        this.f5576o.g();
                        p9.k.C.A.a(this);
                        K();
                        H();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.iq
    public final void g(String str, String str2) {
        r(om1.n(new StringBuilder(pe.a.b(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized wh0 g0() {
        return this.f5578q;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void g1(s9.d dVar) {
        this.O = dVar;
    }

    @Override // com.google.android.gms.internal.ads.dq
    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbJ = t.z.j("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        u9.i.c("Dispatching AFMA event: ".concat(sbJ.toString()));
        r(sbJ.toString());
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void h1(boolean z5) {
        this.f5576o.F = z5;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void i1(s9.e eVar, boolean z5, boolean z10, String str) {
        this.f5576o.H(eVar, z5, z10, str);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized xy j0(String str) {
        HashMap map = this.W;
        if (map == null) {
            return null;
        }
        return (xy) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void j1(s9.d dVar) {
        this.f5577p = dVar;
    }

    public final synchronized void k() {
        t9.c0.m("Destroying WebView!");
        H();
        t9.g0.f33596l.post(new e00(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void k0(i00 i00Var) {
        if (this.B != null) {
            u9.i.e("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.B = i00Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized boolean k1() {
        return this.H > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r11.V != r9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g00.l():boolean");
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void l0(boolean z5, int i, String str, String str2, boolean z10) {
        k00 k00Var = this.f5576o;
        d00 d00Var = k00Var.f7056b;
        boolean zO0 = d00Var.f4408b.O0();
        boolean z11 = k00.z(zO0, d00Var);
        boolean z12 = true;
        if (!z11 && z10) {
            z12 = false;
        }
        q9.a aVar = z11 ? null : k00Var.f7060f;
        wz wzVar = zO0 ? null : new wz(d00Var, k00Var.f7061g);
        lo loVar = k00Var.f7063j;
        ph0 ph0Var = null;
        mo moVar = k00Var.f7064k;
        boolean z13 = z12;
        wz wzVar2 = wzVar;
        s9.c cVar = k00Var.f7075v;
        u9.a aVar2 = d00Var.f4408b.f5568f;
        v80 v80Var = z13 ? null : k00Var.f7065l;
        if (k00.y(d00Var)) {
            ph0Var = k00Var.H;
        }
        k00Var.a(new AdOverlayInfoParcel(aVar, wzVar2, loVar, moVar, cVar, d00Var, z5, i, str, str2, aVar2, v80Var, ph0Var));
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized vm l1() {
        return this.E;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.sz
    public final synchronized void loadData(String str, String str2, String str3) {
        if (A0()) {
            u9.i.h("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.sz
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (A0()) {
                    u9.i.h("#004 The webview is destroyed. Ignoring action.");
                    return;
                } else {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.sz
    public final synchronized void loadUrl(String str) {
        if (A0()) {
            u9.i.h("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            t9.g0.f33596l.post(new l81(15, this, str));
        } catch (Throwable th2) {
            p9.k.C.f31302h.d("AdWebViewImpl.loadUrl", th2);
            u9.i.i("Could not call loadUrl. ", th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized i00 m() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized j0 m0() {
        return this.f5580s;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void m1() {
        this.f5565c0 = true;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final l6.i n() {
        return this.f5570h;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void n0(int i) {
        s9.d dVar = this.f5577p;
        if (dVar != null) {
            dVar.s4(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void n1() {
        boolean z5;
        HashMap map = new HashMap(3);
        p9.k kVar = p9.k.C;
        t9.a aVar = kVar.i;
        synchronized (aVar) {
            z5 = aVar.f33541a;
        }
        map.put("app_muted", String.valueOf(z5));
        map.put("app_volume", String.valueOf(kVar.i.a()));
        map.put("device_volume", String.valueOf(t9.a.b(getContext())));
        c("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final ut o() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final Context o0() {
        return this.f5562b.f9649c;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void o1(boolean z5) {
        if (z5) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        s9.d dVar = this.f5577p;
        if (dVar != null) {
            if (z5) {
                dVar.f32817m.setBackgroundColor(0);
            } else {
                dVar.f32817m.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // q9.a
    public final void onAdClicked() {
        k00 k00Var = this.f5576o;
        if (k00Var != null) {
            k00Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z5 = true;
            if (!A0()) {
                hi.h hVar = this.Q;
                hVar.f20598c = true;
                if (hVar.f20599d) {
                    hVar.c();
                }
            }
            if (this.f5565c0) {
                onResume();
                this.f5565c0 = false;
            }
            boolean z10 = this.C;
            k00 k00Var = this.f5576o;
            if (k00Var == null || !k00Var.D()) {
                z5 = z10;
            } else {
                if (!this.D) {
                    synchronized (this.f5576o.f7059e) {
                    }
                    synchronized (this.f5576o.f7059e) {
                    }
                    this.D = true;
                }
                l();
            }
            N(z5);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k00 k00Var;
        View decorView;
        synchronized (this) {
            try {
                if (!A0()) {
                    hi.h hVar = this.Q;
                    hVar.f20598c = false;
                    Activity activity = (Activity) hVar.f20601f;
                    if (activity != null && hVar.f20597b) {
                        g00 g00Var = (g00) hVar.f20602g;
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(g00Var);
                        }
                        hVar.f20597b = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.D && (k00Var = this.f5576o) != null && k00Var.D() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.f5576o.f7059e) {
                    }
                    synchronized (this.f5576o.f7059e) {
                    }
                    this.D = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        N(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3127nc)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            t9.g0 g0Var = p9.k.C.f31297c;
            t9.g0.u(getContext(), intent);
        } catch (ActivityNotFoundException e3) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb2.append("Couldn't find an Activity to view url/mimetype: ");
            sb2.append(str);
            sb2.append(" / ");
            sb2.append(str4);
            u9.i.c(sb2.toString());
            p9.k.C.f31302h.d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e3);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (A0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zL = l();
        s9.d dVarG0 = G0();
        if (dVarG0 != null && zL && dVarG0.f32818n) {
            dVarG0.f32818n = false;
            dVarG0.f32810e.t0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g00.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.sz
    public final void onPause() {
        if (A0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Od)).booleanValue() && com.google.android.gms.internal.measurement.d4.m("MUTE_AUDIO")) {
                u9.i.c("Muting webview");
                WeakHashMap weakHashMap = z6.b.f46197a;
                if (!a7.p.f501h.b()) {
                    throw a7.p.a();
                }
                z6.b.b(this).f505a.setAudioMuted(true);
            }
        } catch (Exception e3) {
            u9.i.f("Could not pause webview.", e3);
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Rd)).booleanValue()) {
                p9.k.C.f31302h.d("AdWebViewImpl.onPause", e3);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.sz
    public final void onResume() {
        if (A0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Od)).booleanValue() && com.google.android.gms.internal.measurement.d4.m("MUTE_AUDIO")) {
                u9.i.c("Unmuting webview");
                WeakHashMap weakHashMap = z6.b.f46197a;
                if (!a7.p.f501h.b()) {
                    throw a7.p.a();
                }
                z6.b.b(this).f505a.setAudioMuted(false);
            }
        } catch (Exception e3) {
            u9.i.f("Could not resume webview.", e3);
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Rd)).booleanValue()) {
                p9.k.C.f31302h.d("AdWebViewImpl.onResume", e3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.f3045i4
            q9.s r1 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r1 = r1.f31970c
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            com.google.android.gms.internal.ads.k00 r0 = r7.f5576o
            java.lang.Object r3 = r0.f7059e
            monitor-enter(r3)
            boolean r0 = r0.f7073t     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L20
            r0 = r1
            goto L25
        L20:
            r0 = r2
            goto L25
        L22:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r8
        L25:
            com.google.android.gms.internal.ads.k00 r3 = r7.f5576o
            boolean r3 = r3.D()
            if (r3 == 0) goto L3b
            com.google.android.gms.internal.ads.k00 r3 = r7.f5576o
            java.lang.Object r4 = r3.f7059e
            monitor-enter(r4)
            boolean r3 = r3.f7074u     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3d
            goto L3b
        L38:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r8
        L3b:
            if (r0 == 0) goto L4c
        L3d:
            monitor-enter(r7)
            com.google.android.gms.internal.ads.vm r0 = r7.E     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L48
            r0.e(r8)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r8 = move-exception
            goto L4a
        L48:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            goto L8f
        L4a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            throw r8
        L4c:
            com.google.android.gms.internal.ads.xe r0 = r7.f5564c
            if (r0 == 0) goto L55
            com.google.android.gms.internal.ads.ve r0 = r0.f12136b
            r0.b(r8)
        L55:
            com.google.android.gms.internal.ads.nl r0 = r7.f5567e
            if (r0 == 0) goto L8f
            int r3 = r8.getAction()
            if (r3 != r1) goto L75
            long r3 = r8.getEventTime()
            android.view.MotionEvent r1 = r0.f8353a
            long r5 = r1.getEventTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L6e
            goto L75
        L6e:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            r0.f8353a = r1
            goto L8f
        L75:
            int r1 = r8.getAction()
            if (r1 != 0) goto L8f
            long r3 = r8.getEventTime()
            android.view.MotionEvent r1 = r0.f8354b
            long r5 = r1.getEventTime()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L8f
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            r0.f8354b = r1
        L8f:
            boolean r0 = r7.A0()
            if (r0 == 0) goto L96
            return r2
        L96:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g00.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized String p() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized String q() {
        zp0 zp0Var = this.f5573l;
        if (zp0Var == null) {
            return null;
        }
        return zp0Var.f13056b;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final /* synthetic */ k00 q0() {
        return this.f5576o;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void q1(boolean z5) {
        try {
            boolean z10 = this.f5584w;
            this.f5584w = z5;
            F();
            if (z5 != z10) {
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3161q0)).booleanValue()) {
                    if (!this.f5580s.b()) {
                    }
                }
                try {
                    h("onStateChanged", new JSONObject().put(SentryThread.JsonKeys.STATE, true != z5 ? "default" : "expanded"));
                } catch (JSONException e3) {
                    u9.i.f("Error occurred while dispatching state change.", e3);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.f5586y     // Catch: java.lang.Throwable -> L71
            monitor-exit(r3)
            r1 = 0
            if (r0 != 0) goto L30
            monitor-enter(r3)
            p9.k r0 = p9.k.C     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.bx r0 = r0.f31302h     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r0.f3940a     // Catch: java.lang.Throwable -> L22
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r0 = r0.f3948j     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r3.f5586y = r0     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L20
            java.lang.String r0 = "(function(){})()"
            r3.evaluateJavascript(r0, r1)     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
            r3.w(r0)     // Catch: java.lang.Throwable -> L22 java.lang.IllegalStateException -> L24
        L20:
            monitor-exit(r3)
            goto L30
        L22:
            r4 = move-exception
            goto L2e
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L22
            r3.w(r0)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r3)
            goto L30
        L2b:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r4     // Catch: java.lang.Throwable -> L22
        L2e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22
            throw r4
        L30:
            monitor-enter(r3)
            java.lang.Boolean r0 = r3.f5586y     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
            monitor-enter(r3)
            boolean r0 = r3.A0()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L48
            r3.evaluateJavascript(r4, r1)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            goto L6b
        L46:
            r4 = move-exception
            goto L4f
        L48:
            java.lang.String r4 = "#004 The webview is destroyed. Ignoring action."
            u9.i.h(r4)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            goto L6b
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            throw r4
        L51:
            java.lang.String r0 = "javascript:"
            java.lang.String r4 = r0.concat(r4)
            monitor-enter(r3)
            boolean r0 = r3.A0()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L65
            r3.loadUrl(r4)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
            goto L6b
        L63:
            r4 = move-exception
            goto L6c
        L65:
            java.lang.String r4 = "#004 The webview is destroyed. Ignoring action."
            u9.i.h(r4)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
        L6b:
            return
        L6c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            throw r4
        L6e:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6e
            throw r4
        L71:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g00.r(java.lang.String):void");
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized boolean r1() {
        return this.f5587z;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized int s() {
        return this.N;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void s0(String str, String str2) {
        k00 k00Var = this.f5576o;
        ph0 ph0Var = k00Var.H;
        d00 d00Var = k00Var.f7056b;
        k00Var.a(new AdOverlayInfoParcel(d00Var, d00Var.f4408b.f5568f, str, str2, ph0Var));
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void s1(String str, vo voVar) {
        k00 k00Var = this.f5576o;
        if (k00Var != null) {
            synchronized (k00Var.f7059e) {
                try {
                    List list = (List) k00Var.f7058d.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(voVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.sz
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof k00) {
            this.f5576o = (k00) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (A0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e3) {
            u9.i.f("Could not stop loading webview.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final int t() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void t0() {
        if (this.J == null) {
            ut utVar = this.M;
            c80.g((el) utVar.f11062d, this.K, "aes2");
            cl clVarD = el.d();
            this.J = clVarD;
            ((HashMap) utVar.f11061c).put("native:view_show", clVarD);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f5568f.f34365b);
        c("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void t1(boolean z5) {
        this.f5587z = z5;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void u0(String str, vo voVar) {
        k00 k00Var = this.f5576o;
        if (k00Var != null) {
            k00Var.b(str, voVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized boolean u1() {
        return this.f5582u;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final u9.a v() {
        return this.f5568f;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void v0(vm vmVar) {
        this.E = vmVar;
    }

    public final void w(Boolean bool) {
        synchronized (this) {
            this.f5586y = bool;
        }
        bx bxVar = p9.k.C.f31302h;
        synchronized (bxVar.f3940a) {
            bxVar.f3948j = bool;
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized uh w0() {
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final synchronized void x0(wh0 wh0Var) {
        this.f5578q = wh0Var;
    }

    @Override // p9.g
    public final synchronized void y() {
        p9.g gVar = this.f5569g;
        if (gVar != null) {
            gVar.y();
        }
    }

    public final /* synthetic */ void z(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void z0() {
        c80.g((el) this.M.f11062d, this.K, "aeh2");
        HashMap map = new HashMap(1);
        map.put("version", this.f5568f.f34365b);
        c("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final View i0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final WebView u() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void R(int i) {
    }
}
