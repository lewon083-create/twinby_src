package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class k00 extends WebViewClient implements q9.a, v80 {
    public static final /* synthetic */ int J = 0;
    public sd0 A;
    public r50 B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public final HashSet G;
    public final ph0 H;
    public tz I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d00 f7056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final si f7057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f7058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q9.a f7060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s9.l f7061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o00 f7062h;
    public p00 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lo f7063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public mo f7064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v80 f7065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f7069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f7070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7073t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7074u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s9.c f7075v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public bt f7076w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p9.a f7077x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ys f7078y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public wv f7079z;

    public k00(d00 d00Var, si siVar, boolean z5, ph0 ph0Var) {
        bt btVar = new bt(d00Var, d00Var.o0(), new uk(d00Var.getContext()));
        this.f7058d = new HashMap();
        this.f7059e = new Object();
        this.f7068o = 0;
        this.f7069p = "";
        this.f7070q = "";
        this.f7057c = siVar;
        this.f7056b = d00Var;
        this.f7071r = z5;
        this.f7076w = btVar;
        this.f7078y = null;
        this.G = new HashSet(Arrays.asList(((String) q9.s.f31967e.f31970c.a(al.f3270x6)).split(StringUtils.COMMA)));
        this.H = ph0Var;
    }

    public static WebResourceResponse r() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3026h1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean y(d00 d00Var) {
        xp0 xp0Var = d00Var.f4408b.f5572k;
        return xp0Var != null && xp0Var.b();
    }

    public static final boolean z(boolean z5, d00 d00Var) {
        return (!z5 || d00Var.f4408b.m0().b() || d00Var.f4408b.S().equals("interstitial_mb")) ? false : true;
    }

    public final void A(w20 w20Var, kh0 kh0Var, bt0 bt0Var) {
        c("/click");
        if (kh0Var != null && bt0Var != null) {
            b("/click", new s90(this.f7065l, w20Var, bt0Var, kh0Var));
            return;
        }
        v80 v80Var = this.f7065l;
        po poVar = uo.f11011a;
        b("/click", new so(0, v80Var, w20Var));
    }

    public final void B(w20 w20Var, kh0 kh0Var, sd0 sd0Var) {
        c("/open");
        b("/open", new bp(this.f7077x, this.f7078y, kh0Var, sd0Var, w20Var, null));
    }

    public final boolean D() {
        boolean z5;
        synchronized (this.f7059e) {
            z5 = this.f7072s;
        }
        return z5;
    }

    public final void E() {
        wv wvVar = this.f7079z;
        if (wvVar != null) {
            d00 d00Var = this.f7056b;
            g00 g00Var = d00Var.f4408b;
            Field field = g2.n0.f19900a;
            if (g00Var.isAttachedToWindow()) {
                l(g00Var, wvVar, 10);
                return;
            }
            tz tzVar = this.I;
            if (tzVar != null) {
                d00Var.removeOnAttachStateChangeListener(tzVar);
            }
            tz tzVar2 = new tz(this, wvVar);
            this.I = tzVar2;
            d00Var.addOnAttachStateChangeListener(tzVar2);
        }
    }

    public final void F() {
        g00 g00Var;
        ut utVar;
        o00 o00Var = this.f7062h;
        d00 d00Var = this.f7056b;
        if (o00Var != null && ((this.C && this.E <= 0) || this.D || this.f7067n)) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue() && (utVar = (g00Var = d00Var.f4408b).M) != null) {
                c80.g((el) utVar.f11062d, g00Var.K, "awfllc");
            }
            o00 o00Var2 = this.f7062h;
            boolean z5 = false;
            if (!this.D && !this.f7067n) {
                z5 = true;
            }
            o00Var2.b(this.f7068o, this.f7069p, this.f7070q, z5);
            this.f7062h = null;
        }
        g00 g00Var2 = d00Var.f4408b;
        if (g00Var2.L == null) {
            ut utVar2 = g00Var2.M;
            utVar2.getClass();
            cl clVarD = el.d();
            g00Var2.L = clVarD;
            ((HashMap) utVar2.f11061c).put("native:view_load", clVarD);
        }
    }

    public final void H(s9.e eVar, boolean z5, boolean z10, String str) {
        boolean z11;
        d00 d00Var = this.f7056b;
        boolean zO0 = d00Var.f4408b.O0();
        boolean z12 = false;
        boolean z13 = z(zO0, d00Var) || z10;
        if (z13 || !z5) {
            z11 = zO0;
            z12 = true;
        } else {
            z11 = zO0;
        }
        a(new AdOverlayInfoParcel(eVar, z13 ? null : this.f7060f, z11 ? null : this.f7061g, this.f7075v, d00Var.f4408b.f5568f, d00Var, z12 ? null : this.f7065l, str));
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void J() {
        v80 v80Var = this.f7065l;
        if (v80Var != null) {
            v80Var.J();
        }
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void L() {
        v80 v80Var = this.f7065l;
        if (v80Var != null) {
            v80Var.L();
        }
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        s9.e eVar;
        ys ysVar = this.f7078y;
        if (ysVar != null) {
            synchronized (ysVar.f12719m) {
                z = ysVar.f12726t != null;
            }
        }
        ob.z zVar = p9.k.C.f31296b;
        ob.z.a(this.f7056b.getContext(), adOverlayInfoParcel, !z, this.A);
        wv wvVar = this.f7079z;
        if (wvVar != null) {
            String str = adOverlayInfoParcel.f2554m;
            if (str == null && (eVar = adOverlayInfoParcel.f2544b) != null) {
                str = eVar.f32831c;
            }
            ((tv) wvVar).a(str);
        }
    }

    public final void b(String str, vo voVar) {
        synchronized (this.f7059e) {
            try {
                HashMap map = this.f7058d;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(voVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.f7059e) {
            try {
                List list = (List) this.f7058d.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        wv wvVar = this.f7079z;
        if (wvVar != null) {
            tv tvVar = (tv) wvVar;
            synchronized (tvVar.f10729h) {
                tvVar.f10723b.keySet();
                n81 n81VarD = vv.d(Collections.EMPTY_MAP);
                np npVar = new np(1, tvVar);
                gx gxVar = hx.f6285g;
                r71 r71VarJ = vv.J(n81VarD, npVar, gxVar);
                ed.d dVarI = vv.I(r71VarJ, 10L, TimeUnit.SECONDS, hx.f6282d);
                r71VarJ.a(new l81(0, r71VarJ, new gk0(tvVar, dVarI)), gxVar);
                tv.f10721l.add(dVarI);
            }
            this.f7079z = null;
        }
        tz tzVar = this.I;
        if (tzVar != null) {
            this.f7056b.removeOnAttachStateChangeListener(tzVar);
        }
        synchronized (this.f7059e) {
            try {
                this.f7058d.clear();
                this.f7060f = null;
                this.f7061g = null;
                this.f7062h = null;
                this.i = null;
                this.f7063j = null;
                this.f7064k = null;
                this.f7066m = false;
                this.f7071r = false;
                this.f7072s = false;
                this.f7073t = false;
                this.f7075v = null;
                this.f7077x = null;
                this.f7076w = null;
                ys ysVar = this.f7078y;
                if (ysVar != null) {
                    ysVar.D(true);
                    this.f7078y = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02fd A[Catch: NoClassDefFoundError -> 0x0024, Exception -> 0x0027, TryCatch #17 {Exception -> 0x0027, NoClassDefFoundError -> 0x0024, blocks: (B:3:0x0014, B:5:0x0021, B:10:0x002a, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0083, B:22:0x009c, B:24:0x00a2, B:26:0x00a6, B:28:0x00b8, B:31:0x00c2, B:33:0x00d0, B:35:0x00e5, B:94:0x0232, B:83:0x0205, B:120:0x02fd, B:123:0x030f, B:125:0x0315, B:127:0x0323, B:95:0x026b, B:96:0x02a4, B:82:0x01cf, B:52:0x014a, B:34:0x00db, B:97:0x02a5, B:99:0x02af, B:101:0x02b5, B:103:0x02b8, B:104:0x02b9, B:105:0x02d6, B:107:0x02d9, B:108:0x02da, B:110:0x02e8, B:114:0x02f5, B:117:0x02f8, B:106:0x02d7, B:102:0x02b6), top: B:142:0x0014, inners: #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0315 A[Catch: NoClassDefFoundError -> 0x0024, Exception -> 0x0027, TryCatch #17 {Exception -> 0x0027, NoClassDefFoundError -> 0x0024, blocks: (B:3:0x0014, B:5:0x0021, B:10:0x002a, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0083, B:22:0x009c, B:24:0x00a2, B:26:0x00a6, B:28:0x00b8, B:31:0x00c2, B:33:0x00d0, B:35:0x00e5, B:94:0x0232, B:83:0x0205, B:120:0x02fd, B:123:0x030f, B:125:0x0315, B:127:0x0323, B:95:0x026b, B:96:0x02a4, B:82:0x01cf, B:52:0x014a, B:34:0x00db, B:97:0x02a5, B:99:0x02af, B:101:0x02b5, B:103:0x02b8, B:104:0x02b9, B:105:0x02d6, B:107:0x02d9, B:108:0x02da, B:110:0x02e8, B:114:0x02f5, B:117:0x02f8, B:106:0x02d7, B:102:0x02b6), top: B:142:0x0014, inners: #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0224 A[Catch: all -> 0x022d, TryCatch #8 {all -> 0x022d, blocks: (B:87:0x0212, B:89:0x0224, B:93:0x022f), top: B:136:0x0212 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse h(java.lang.String r24, java.util.Map r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k00.h(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void i(Uri uri) {
        t9.c0.m("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.f7058d.get(path);
        if (path == null || list == null) {
            t9.c0.m("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3255w7)).booleanValue() || p9.k.C.f31302h.a() == null) {
                return;
            }
            hx.f6279a.execute(new s(24, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        wk wkVar = al.f3254w6;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && this.G.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) sVar.f31970c.a(al.f3285y6)).intValue()) {
                t9.c0.m("Parsing gmsg query params on BG thread: ".concat(path));
                t9.g0 g0Var = p9.k.C.f31297c;
                g0Var.getClass();
                c91 c91VarB = vv.B(new aa.w(6, uri), g0Var.f33606k);
                c91VarB.a(new l81(0, c91VarB, new cw(this, list, path, uri, 8)), hx.f6284f);
                return;
            }
        }
        t9.g0 g0Var2 = p9.k.C.f31297c;
        x(t9.g0.p(uri), list, path);
    }

    public final void j(int i, int i10) {
        bt btVar = this.f7076w;
        if (btVar != null) {
            btVar.D(i, i10);
        }
        ys ysVar = this.f7078y;
        if (ysVar != null) {
            synchronized (ysVar.f12719m) {
                ysVar.f12714g = i;
                ysVar.f12715h = i10;
            }
        }
    }

    public final void k(q9.a aVar, lo loVar, s9.l lVar, mo moVar, s9.c cVar, boolean z5, xo xoVar, p9.a aVar2, ox0 ox0Var, wv wvVar, kh0 kh0Var, bt0 bt0Var, sd0 sd0Var, wo woVar, v80 v80Var, ko koVar, ko koVar2, wo woVar2, w20 w20Var, de0 de0Var, v50 v50Var, r50 r50Var) {
        xp0 xp0Var;
        d00 d00Var = this.f7056b;
        p9.a aVar3 = aVar2 == null ? new p9.a(d00Var.getContext(), wvVar) : aVar2;
        this.f7078y = new ys(d00Var, ox0Var);
        this.f7079z = wvVar;
        wk wkVar = al.f3162q1;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            b("/adMetadata", new ko(0, loVar));
        }
        if (moVar != null) {
            b("/appEvent", new ko(1, moVar));
        }
        b("/backButton", uo.f11015e);
        b("/refresh", uo.f11016f);
        b("/canOpenApp", po.f9134c);
        b("/canOpenURLs", po.f9138g);
        b("/canOpenIntents", po.f9135d);
        b("/close", uo.f11011a);
        b("/customClose", uo.f11012b);
        b("/instrument", uo.i);
        b("/delayPageLoaded", uo.f11020k);
        b("/delayPageClosed", uo.f11021l);
        b("/getLocationInfo", uo.f11022m);
        b("/log", uo.f11013c);
        b("/mraid", new yo(aVar3, this.f7078y, ox0Var));
        bt btVar = this.f7076w;
        if (btVar != null) {
            b("/mraidLoaded", btVar);
        }
        p9.a aVar4 = aVar3;
        b("/open", new bp(aVar4, this.f7078y, kh0Var, sd0Var, w20Var, v50Var));
        b("/precache", new po(26));
        b("/touch", po.f9137f);
        b("/video", uo.f11017g);
        b("/videoMeta", uo.f11018h);
        if (kh0Var == null || bt0Var == null) {
            b("/click", new so(0, v80Var, w20Var));
            b("/httpTrack", po.f9136e);
        } else {
            b("/click", new s90(v80Var, w20Var, bt0Var, kh0Var));
            b("/httpTrack", new so(6, bt0Var, kh0Var));
        }
        fw fwVar = p9.k.C.f31318y;
        Context context = d00Var.getContext();
        g00 g00Var = d00Var.f4408b;
        if (fwVar.a(context)) {
            HashMap map = new HashMap();
            xp0 xp0Var2 = g00Var.f5572k;
            if (xp0Var2 != null) {
                map = xp0Var2.f12269w0;
            }
            b("/logScionEvent", new so(1, d00Var.getContext(), map));
        }
        if (xoVar != null) {
            b("/setInterstitialProperties", new ko(2, xoVar));
        }
        if (woVar != null && ((Boolean) ykVar2.a(al.fa)).booleanValue()) {
            b("/inspectorNetworkExtras", woVar);
        }
        if (((Boolean) ykVar2.a(al.f3288ya)).booleanValue() && koVar != null) {
            b("/shareSheet", koVar);
        }
        if (((Boolean) ykVar2.a(al.G8)).booleanValue() && de0Var != null) {
            b("/onDeviceStorageEvent", new ko(3, de0Var));
        }
        if (((Boolean) ykVar2.a(al.Da)).booleanValue() && koVar2 != null) {
            b("/inspectorOutOfContextTest", koVar2);
        }
        if (((Boolean) ykVar2.a(al.Ia)).booleanValue() && woVar2 != null) {
            b("/inspectorStorage", woVar2);
        }
        if (((Boolean) ykVar2.a(al.Kc)).booleanValue()) {
            b("/bindPlayStoreOverlay", uo.f11025p);
            b("/presentPlayStoreOverlay", uo.f11026q);
            b("/expandPlayStoreOverlay", uo.f11027r);
            b("/collapsePlayStoreOverlay", uo.f11028s);
            b("/closePlayStoreOverlay", uo.f11029t);
        }
        if (((Boolean) ykVar2.a(al.V3)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", uo.f11031v);
            b("/resetPAID", uo.f11030u);
        }
        if (((Boolean) ykVar2.a(al.f2990ed)).booleanValue() && (xp0Var = g00Var.f5572k) != null && xp0Var.f12259r0) {
            b("/writeToLocalStorage", uo.f11032w);
            b("/clearLocalStorageKeys", uo.f11033x);
        }
        this.f7060f = aVar;
        this.f7061g = lVar;
        this.f7063j = loVar;
        this.f7064k = moVar;
        this.f7075v = cVar;
        this.f7077x = aVar4;
        this.f7065l = v80Var;
        this.A = sd0Var;
        this.B = r50Var;
        this.f7066m = z5;
    }

    public final void l(View view, wv wvVar, int i) {
        boolean z5;
        Bitmap bitmapCreateBitmap;
        boolean zIsDrawingCacheEnabled;
        tv tvVar = (tv) wvVar;
        boolean z10 = tvVar.f10728g.f11107d;
        if (!z10 || (z5 = tvVar.f10730j) || i <= 0) {
            return;
        }
        if (z10 && !z5) {
            t9.g0 g0Var = p9.k.C.f31297c;
            Bitmap bitmap = null;
            if (view != null) {
                try {
                    zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e3) {
                    e = e3;
                    bitmapCreateBitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                } catch (RuntimeException e7) {
                    e = e7;
                    u9.i.f("Fail to capture the web view", e);
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            u9.i.h("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e10) {
                        u9.i.f("Fail to capture the webview", e10);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                vv.l("Failed to capture the webview bitmap.");
            } else {
                tvVar.f10730j = true;
                l81 l81Var = new l81(10, tvVar, bitmap);
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    l81Var.run();
                } else {
                    hx.f6279a.execute(l81Var);
                }
            }
        }
        if (!tvVar.f10728g.f11107d || tvVar.f10730j) {
            return;
        }
        t9.g0.f33596l.postDelayed(new uy(this, view, tvVar, i), 100L);
    }

    @Override // q9.a
    public final void onAdClicked() {
        q9.a aVar = this.f7060f;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        t9.c0.m("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            i(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.f7059e) {
            try {
                d00 d00Var = this.f7056b;
                if (d00Var.f4408b.A0()) {
                    t9.c0.m("Blank page loaded, 1...");
                    d00Var.k();
                    return;
                }
                this.C = true;
                p00 p00Var = this.i;
                if (p00Var != null) {
                    p00Var.mo4h();
                    this.i = null;
                }
                F();
                d00 d00Var2 = this.f7056b;
                if (d00Var2.f4408b.G0() != null) {
                    if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3006fd)).booleanValue() || (toolbar = d00Var2.f4408b.G0().f32827w) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f7067n = true;
        this.f7068o = i;
        this.f7069p = str;
        this.f7070q = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String string = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof sz)) {
                u9.i.h("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            sz szVar = (sz) webView;
            wv wvVar = this.f7079z;
            if (wvVar != null) {
                ((tv) wvVar).b(1, string, requestHeaders);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return h(string, requestHeaders);
            }
            if (szVar.q0() != null) {
                k00 k00VarQ0 = szVar.q0();
                synchronized (k00VarQ0.f7059e) {
                    k00VarQ0.f7066m = false;
                    k00VarQ0.f7071r = true;
                    hx.f6284f.execute(new s(23, k00VarQ0));
                }
            }
            if (szVar.m0().b()) {
                str = (String) q9.s.f31967e.f31970c.a(al.o0);
            } else if (szVar.O0()) {
                str = (String) q9.s.f31967e.f31970c.a(al.f3116n0);
            } else {
                str = (String) q9.s.f31967e.f31970c.a(al.f3102m0);
            }
            p9.k kVar = p9.k.C;
            t9.g0 g0Var = kVar.f31297c;
            Context context = szVar.getContext();
            String str2 = szVar.v().f34365b;
            try {
                HashMap map = new HashMap();
                map.put("User-Agent", kVar.f31297c.F(context, str2));
                map.put("Cache-Control", "max-stale=3600");
                t9.s sVarA = new t9.u(context).a(0, str, map, null);
                String str3 = (String) sVarA.f6961b.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                u9.i.i("Could not fetch MRAID JS.", e3);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case VKApiCodes.CODE_INVALID_PHOTO_FORMAT /* 129 */:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        t9.c0.m("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriB = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriB.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriB.getHost())) {
            i(uriB);
            return true;
        }
        boolean z5 = this.f7066m;
        d00 d00Var = this.f7056b;
        if (z5 && webView == d00Var.f4408b) {
            String scheme = uriB.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                q9.a aVar = this.f7060f;
                if (aVar != null) {
                    aVar.onAdClicked();
                    wv wvVar = this.f7079z;
                    if (wvVar != null) {
                        ((tv) wvVar).a(str);
                    }
                    this.f7060f = null;
                }
                v80 v80Var = this.f7065l;
                if (v80Var != null) {
                    v80Var.J();
                    this.f7065l = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        g00 g00Var = d00Var.f4408b;
        g00 g00Var2 = d00Var.f4408b;
        if (g00Var.willNotDraw()) {
            u9.i.h("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            xe xeVar = g00Var2.f5564c;
            jq0 jq0Var = g00Var2.f5566d;
            if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3067jd)).booleanValue() || jq0Var == null) {
                if (xeVar != null && xeVar.a(uriB)) {
                    uriB = xeVar.b(uriB, d00Var.getContext(), d00Var, d00Var.d());
                }
            } else if (xeVar != null && xeVar.a(uriB)) {
                uriB = jq0Var.a(uriB, d00Var.getContext(), d00Var, d00Var.d());
            }
        } catch (ye unused) {
            u9.i.h("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        p9.a aVar2 = this.f7077x;
        if (aVar2 == null || aVar2.a()) {
            H(new s9.e("android.intent.action.VIEW", uriB.toString(), null, null, null, null, null, null), true, false, g00Var2.q());
        } else {
            aVar2.b(str);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        r11 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011c, code lost:
    
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
    
        if (r0.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
    
        if (r1 >= r0.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (r0[r1].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
    
        r2 = r0[r1].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (r2.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        r0 = r7.getHeaderFields();
        r15 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0174, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0180, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0192, code lost:
    
        if (r1.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
    
        r15.put(r1.getKey(), r1.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01aa, code lost:
    
        r0 = p9.k.C.f31300f;
        r13 = r7.getResponseCode();
        r14 = r7.getResponseMessage();
        r16 = r7.getInputStream();
        r0.getClass();
        r10 = new android.webkit.WebResourceResponse(r11, r12, r13, r14, r15, r16);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse w(java.lang.String r18, java.util.Map r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k00.w(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void x(Map map, List list, String str) {
        if (t9.c0.o()) {
            t9.c0.m("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str3);
                t9.c0.m(sb2.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((vo) it.next()).o(this.f7056b, map);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return h(str, Collections.EMPTY_MAP);
    }
}
