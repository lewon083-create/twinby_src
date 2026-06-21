package aa;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.a20;
import com.google.android.gms.internal.ads.a81;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.as0;
import com.google.android.gms.internal.ads.bs0;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.gm;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.i81;
import com.google.android.gms.internal.ads.jq0;
import com.google.android.gms.internal.ads.kc0;
import com.google.android.gms.internal.ads.l81;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.qq0;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.r71;
import com.google.android.gms.internal.ads.r81;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.tw;
import com.google.android.gms.internal.ads.vl;
import com.google.android.gms.internal.ads.vt;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.x41;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.yk;
import com.google.android.gms.internal.ads.z71;
import com.google.android.gms.internal.measurement.d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import q9.d3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ow {
    public static final ArrayList I = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList J = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList K = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList L = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public final ArrayList A;
    public final ArrayList B;
    public final AtomicBoolean C;
    public final AtomicBoolean D;
    public final AtomicInteger E;
    public final ll F;
    public final i0 G;
    public final c0 H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n10 f622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xe f624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jq0 f625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qq0 f626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r81 f627h;
    public final ScheduledExecutorService i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public vt f628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Point f629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Point f630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wd0 f631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bt0 f632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f637s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f638t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicInteger f639u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u9.a f640v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f641w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f642x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f644z;

    public l(n10 n10Var, Context context, xe xeVar, qq0 qq0Var, r81 r81Var, ScheduledExecutorService scheduledExecutorService, wd0 wd0Var, bt0 bt0Var, u9.a aVar, ll llVar, jq0 jq0Var, i0 i0Var, c0 c0Var) {
        ArrayList arrayListT4;
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        this.f629k = new Point();
        this.f630l = new Point();
        this.f639u = new AtomicInteger(0);
        this.C = new AtomicBoolean(false);
        this.D = new AtomicBoolean(false);
        this.E = new AtomicInteger(0);
        this.f622c = n10Var;
        this.f623d = context;
        this.f624e = xeVar;
        this.f625f = jq0Var;
        this.f626g = qq0Var;
        this.f627h = r81Var;
        this.i = scheduledExecutorService;
        this.f631m = wd0Var;
        this.f632n = bt0Var;
        this.f640v = aVar;
        this.F = llVar;
        wk wkVar = al.Z7;
        q9.s sVar = q9.s.f31967e;
        this.f633o = ((Boolean) sVar.f31970c.a(wkVar)).booleanValue();
        wk wkVar2 = al.Y7;
        yk ykVar = sVar.f31970c;
        this.f634p = ((Boolean) ykVar.a(wkVar2)).booleanValue();
        this.f635q = ((Boolean) ykVar.a(al.f2940b8)).booleanValue();
        this.f636r = ((Boolean) ykVar.a(al.f2971d8)).booleanValue();
        this.f637s = (String) ykVar.a(al.c8);
        this.f638t = (String) ykVar.a(al.f2986e8);
        this.f642x = (String) ykVar.a(al.f3002f8);
        this.G = i0Var;
        this.H = c0Var;
        if (((Boolean) ykVar.a(al.f3018g8)).booleanValue()) {
            this.f643y = t4((String) ykVar.a(al.f3033h8));
            this.f644z = t4((String) ykVar.a(al.f3049i8));
            this.A = t4((String) ykVar.a(al.f3063j8));
            arrayListT4 = t4((String) ykVar.a(al.f3078k8));
        } else {
            this.f643y = I;
            this.f644z = J;
            this.A = K;
            arrayListT4 = L;
        }
        this.B = arrayListT4;
    }

    public static boolean p4(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri s4(String str, Uri uri, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(string.substring(0, i));
        l7.o.t(sb2, str, "=", str2, "&");
        sb2.append(string.substring(i));
        return Uri.parse(sb2.toString());
    }

    public static final ArrayList t4(String str) {
        String[] strArrSplit = TextUtils.split(str, StringUtils.COMMA);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!fs1.n(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static as0 u4(ed.d dVar, tw twVar) {
        if (bs0.a() && ((Boolean) vl.f11416e.r()).booleanValue()) {
            try {
                as0 as0Var = (as0) ((a20) vv.L(dVar)).f2720a.j();
                as0Var.b(new ArrayList(Collections.singletonList(twVar.f10738c)));
                d3 d3Var = twVar.f10740e;
                as0Var.c(d3Var == null ? "" : d3Var.f31815q);
                as0Var.d(d3Var.f31812n);
                return as0Var;
            } catch (ExecutionException e3) {
                p9.k.C.f31302h.d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e3);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final void V(xa.a aVar) {
        wk wkVar = al.Na;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            wk wkVar2 = al.f3124n8;
            if (!((Boolean) ykVar2.a(wkVar2)).booleanValue()) {
                n4();
            }
            WebView webView = (WebView) xa.b.X1(aVar);
            if (webView == null) {
                u9.i.e("The webView cannot be null.");
                return;
            }
            gx gxVar = hx.f6284f;
            c0 c0Var = this.H;
            f0 f0Var = new f0(webView, c0Var, gxVar);
            webView.addJavascriptInterface(new a(webView, this.f624e, this.f631m, this.f632n, this.f625f, this.G, c0Var, f0Var), "gmaSdk");
            if (((Boolean) ykVar2.a(al.Xa)).booleanValue()) {
                p9.k.C.f31302h.f3950l.incrementAndGet();
            }
            if (((Boolean) gm.f5856c.r()).booleanValue()) {
                c0Var.a(webView);
                if (((Boolean) gm.f5857d.r()).booleanValue()) {
                    hx.f6282d.scheduleWithFixedDelay(new e0(f0Var, 1), 0L, ((Integer) ykVar2.a(al.Ya)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) ykVar2.a(wkVar2)).booleanValue()) {
                n4();
            }
        }
    }

    public final void l4(ArrayList arrayList, xa.a aVar, st stVar, boolean z5) {
        Map map;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3256w8)).booleanValue()) {
            try {
                qt qtVar = (qt) stVar;
                Parcel parcelD0 = qtVar.D0();
                parcelD0.writeString("The updating URL feature is not enabled.");
                qtVar.L1(parcelD0, 2);
                return;
            } catch (RemoteException e3) {
                u9.i.f("", e3);
                return;
            }
        }
        e eVar = new e(this, arrayList, aVar, 0);
        gx gxVar = (gx) this.f627h;
        ed.d dVarB = gxVar.b(eVar);
        vt vtVar = this.f628j;
        if (vtVar == null || (map = vtVar.f11465c) == null || map.isEmpty()) {
            u9.i.g("Asset view map is empty.");
        } else {
            dVarB = vv.J(dVarB, new f(0, this), gxVar);
        }
        int i = 0;
        dVarB.a(new l81(i, dVarB, new c(this, stVar, z5, i)), this.f622c.b());
    }

    public final void m4(ArrayList arrayList, xa.a aVar, st stVar, boolean z5) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ed.d dVarJ;
        Map map;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3256w8)).booleanValue()) {
            u9.i.h("The updating URL feature is not enabled.");
            try {
                qt qtVar = (qt) stVar;
                Parcel parcelD0 = qtVar.D0();
                parcelD0.writeString("The updating URL feature is not enabled.");
                qtVar.L1(parcelD0, 2);
                return;
            } catch (RemoteException e3) {
                u9.i.f("", e3);
                return;
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList2 = this.f644z;
            arrayList3 = this.f643y;
            if (!zHasNext) {
                break;
            } else if (p4((Uri) it.next(), arrayList3, arrayList2)) {
                i++;
            }
        }
        if (i > 1) {
            u9.i.h("Multiple google urls found: ".concat(String.valueOf(arrayList)));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (p4(uri, arrayList3, arrayList2)) {
                e eVar = new e(this, uri, aVar, 1);
                gx gxVar = (gx) this.f627h;
                ed.d dVarB = gxVar.b(eVar);
                vt vtVar = this.f628j;
                if (vtVar == null || (map = vtVar.f11465c) == null || map.isEmpty()) {
                    u9.i.g("Asset view map is empty.");
                    dVarJ = dVarB;
                } else {
                    dVarJ = vv.J(dVarB, new f(1, this), gxVar);
                }
            } else {
                u9.i.h("Not a Google URL: ".concat(String.valueOf(uri)));
                dVarJ = vv.d(uri);
            }
            arrayList4.add(dVarJ);
        }
        a81 a81Var = new a81(x41.v(arrayList4), true);
        a81Var.a(new l81(0, a81Var, new c(this, stVar, z5, 1)), this.f622c.b());
    }

    public final void n4() {
        wk wkVar = al.Oa;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (!((Boolean) ykVar.a(wkVar)).booleanValue() || ((Boolean) ykVar2.a(al.Ra)).booleanValue()) {
            return;
        }
        if (((Boolean) ykVar2.a(al.Va)).booleanValue() && this.C.getAndSet(true)) {
            return;
        }
        o4();
    }

    public final void o4() {
        l lVar;
        ed.d dVarE;
        if (((Boolean) gm.f5858e.r()).booleanValue()) {
            i0 i0Var = this.G;
            synchronized (i0Var) {
                i0Var.c(true);
                i0Var.c(false);
            }
            return;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3141oc)).booleanValue()) {
            dVarE = vv.E(new v7.f(3, this), hx.f6279a);
            lVar = this;
        } else {
            lVar = this;
            dVarE = (ed.d) lVar.q4(this.f623d, null, "BANNER", null, null, 0, null, new Bundle(), null).f2721b.j();
        }
        fe.c cVar = new fe.c(3, this);
        dVarE.a(new l81(0, dVarE, cVar), lVar.f622c.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    @Override // com.google.android.gms.internal.ads.pw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q3(xa.a r11, com.google.android.gms.internal.ads.tw r12, com.google.android.gms.internal.ads.mw r13) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.l.q3(xa.a, com.google.android.gms.internal.ads.tw, com.google.android.gms.internal.ads.mw):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.a20 q4(android.content.Context r41, java.lang.String r42, java.lang.String r43, q9.g3 r44, q9.d3 r45, int r46, java.lang.String r47, android.os.Bundle r48, com.google.android.gms.internal.ads.tw r49) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.l.q4(android.content.Context, java.lang.String, java.lang.String, q9.g3, q9.d3, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.tw):com.google.android.gms.internal.ads.a20");
    }

    public final i81 r4(final String str) {
        final kc0[] kc0VarArr = new kc0[1];
        ed.d dVarB = this.f626g.b();
        z71 z71Var = new z71() { // from class: aa.j
            @Override // com.google.android.gms.internal.ads.z71
            public final /* synthetic */ ed.d a(Object obj) throws JSONException {
                kc0 kc0Var = (kc0) obj;
                l lVar = this.f603a;
                lVar.getClass();
                kc0VarArr[0] = kc0Var;
                Context context = lVar.f623d;
                vt vtVar = lVar.f628j;
                Map map = vtVar.f11465c;
                JSONObject jSONObjectH = d4.H(context, map, map, vtVar.f11464b, null);
                JSONObject jSONObjectE = d4.E(lVar.f623d, lVar.f628j.f11464b);
                JSONObject jSONObjectF = d4.F(lVar.f628j.f11464b);
                JSONObject jSONObjectG = d4.G(lVar.f623d, lVar.f628j.f11464b);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectH);
                jSONObject.put("ad_view_signal", jSONObjectE);
                jSONObject.put("scroll_view_signal", jSONObjectF);
                jSONObject.put("lock_screen_signal", jSONObjectG);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", d4.I(null, lVar.f623d, lVar.f630l, lVar.f629k));
                }
                return kc0Var.a(str2, jSONObject);
            }
        };
        r81 r81Var = this.f627h;
        r71 r71VarJ = vv.J(dVarB, z71Var, r81Var);
        r71VarJ.a(new ed.c(1, this, kc0VarArr), r81Var);
        return vv.G(vv.K((i81) vv.I(i81.s(r71VarJ), ((Integer) q9.s.f31967e.f31970c.a(al.f3272x8)).intValue(), TimeUnit.MILLISECONDS, this.i), i.f595b, r81Var), Exception.class, i.f596c, r81Var);
    }
}
