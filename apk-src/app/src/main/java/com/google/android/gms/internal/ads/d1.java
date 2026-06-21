package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.sentry.SentryBaseEvent;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4418e;

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, int i) {
        this.f4415b = i;
        this.f4416c = obj;
        this.f4417d = obj2;
        this.f4418e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta taVar;
        final int i = 1;
        final int i10 = 0;
        switch (this.f4415b) {
            case 0:
                g1 g1Var = (g1) this.f4416c;
                jx1 jx1Var = (jx1) this.f4417d;
                ws1 ws1Var = (ws1) this.f4418e;
                g1Var.getClass();
                String str = cq0.f4293a;
                bv1 bv1Var = g1Var.f5591b.f6261b.f8792t;
                xu1 xu1VarY = bv1Var.y();
                bv1Var.r(xu1VarY, 1017, new nu0(xu1VarY, jx1Var, ws1Var));
                return;
            case 1:
                qa qaVar = (qa) this.f4416c;
                synchronized (qaVar.f9376f) {
                    break;
                }
                b7 b7Var = (b7) this.f4417d;
                ua uaVar = (ua) b7Var.f3660e;
                if (uaVar == null) {
                    qaVar.i(b7Var.f3658c);
                } else {
                    synchronized (qaVar.f9376f) {
                        taVar = qaVar.f9377g;
                        break;
                    }
                    taVar.e(uaVar);
                }
                if (b7Var.f3657b) {
                    qaVar.a("intermediate-response");
                } else {
                    qaVar.b("done");
                }
                Runnable runnable = (Runnable) this.f4418e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                oh ohVar = (oh) this.f4416c;
                WebView webView = (WebView) this.f4417d;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", ohVar);
                        return;
                    } catch (Throwable unused) {
                        ohVar.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                vx vxVar = ((qx) this.f4418e).f9633r;
                if (vxVar != null) {
                    vxVar.c("error", "what", (String) this.f4416c, SentryBaseEvent.JsonKeys.EXTRA, (String) this.f4417d);
                    return;
                }
                return;
            case 4:
                ((g00) this.f4416c).z((String) this.f4417d, (ValueCallback) this.f4418e);
                return;
            case 5:
                u00 u00Var = (u00) this.f4416c;
                Context context = (Context) this.f4417d;
                u9.a aVar = (u9.a) this.f4418e;
                p9.k kVar = p9.k.C;
                kVar.f31304k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                kVar.f31297c.F(context, aVar.f34365b);
                wk wkVar = al.f3024gf;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    kVar.f31304k.getClass();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    zd1 zd1VarA = u00Var.f10774b.a();
                    zd1VarA.v("action", "webview_startup_l");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
                    sb2.append(jElapsedRealtime2);
                    zd1VarA.v("webview_startup_l", sb2.toString());
                    zd1VarA.w();
                }
                if (((Boolean) sVar.f31970c.a(al.nf)).booleanValue()) {
                    hx.f6284f.execute(new s(26, u00Var));
                    return;
                }
                return;
            case 6:
                ((bt0) this.f4416c).b((String) this.f4417d, (ni.i) this.f4418e, null, null);
                return;
            case 7:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f4416c;
                String str2 = (String) this.f4417d;
                u9.l lVar = (u9.l) this.f4418e;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str2});
                kh0.d(sQLiteDatabase, lVar);
                return;
            case 8:
                tj0.c((eq0) this.f4416c, (xp0) this.f4417d, (ci0) this.f4418e);
                return;
            case 9:
                g11 g11Var = (g11) this.f4416c;
                HashMap map = (HashMap) this.f4417d;
                Context context2 = (Context) this.f4418e;
                map.putAll(g11Var.f5598d.a());
                g11Var.e(map);
                map.put("f", "q");
                map.put("ctx", context2);
                return;
            case 10:
                v21 v21Var = (v21) this.f4416c;
                o21 o21Var = (o21) this.f4417d;
                ni.i iVar = (ni.i) this.f4418e;
                String str3 = v21Var.f11219b;
                try {
                    yi0 yi0Var = v21Var.f11218a;
                    if (yi0Var == null) {
                        throw null;
                    }
                    n21 n21Var = (n21) yi0Var.f12630k;
                    if (n21Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str3);
                    String str4 = o21Var.f8582a;
                    if (!v21.b(str4)) {
                        str4.getClass();
                        bundle.putString("sessionToken", str4.trim());
                    }
                    String str5 = o21Var.f8583b;
                    if (!v21.b(str5)) {
                        str5.getClass();
                        bundle.putString("appId", str5.trim());
                    }
                    u21 u21Var = new u21(v21Var, iVar);
                    l21 l21Var = (l21) n21Var;
                    Parcel parcelD0 = l21Var.D0();
                    vg.c(parcelD0, bundle);
                    vg.e(parcelD0, u21Var);
                    l21Var.X1(parcelD0, 2);
                    return;
                } catch (RemoteException e3) {
                    v21.f11216c.d(e3, "dismiss overlay display from: %s", str3);
                    return;
                }
            case 11:
                v21 v21Var2 = (v21) this.f4416c;
                q21 q21Var = (q21) this.f4417d;
                ni.i iVar2 = (ni.i) this.f4418e;
                String str6 = v21Var2.f11219b;
                try {
                    yi0 yi0Var2 = v21Var2.f11218a;
                    if (yi0Var2 == null) {
                        throw null;
                    }
                    n21 n21Var2 = (n21) yi0Var2.f12630k;
                    if (n21Var2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str6);
                    bundle2.putBinder("windowToken", q21Var.f9296a);
                    String str7 = q21Var.f9301f;
                    if (!v21.b(str7)) {
                        str7.getClass();
                        bundle2.putString("adFieldEnifd", str7.trim());
                    }
                    bundle2.putInt("layoutGravity", q21Var.f9298c);
                    bundle2.putFloat("layoutVerticalMargin", q21Var.f9299d);
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("windowWidthPx", q21Var.f9300e);
                    if (!v21.b(null) || !v21.b(null)) {
                        throw null;
                    }
                    String str8 = q21Var.f9297b;
                    if (!v21.b(str8)) {
                        str8.getClass();
                        bundle2.putString("appId", str8.trim());
                    }
                    if (!v21.b(null)) {
                        throw null;
                    }
                    bundle2.putBoolean("stableSessionToken", true);
                    u21 u21Var2 = new u21(v21Var2, iVar2);
                    l21 l21Var2 = (l21) n21Var2;
                    Parcel parcelD02 = l21Var2.D0();
                    parcelD02.writeString(str6);
                    vg.c(parcelD02, bundle2);
                    vg.e(parcelD02, u21Var2);
                    l21Var2.X1(parcelD02, 1);
                    return;
                } catch (RemoteException e7) {
                    v21.f11216c.d(e7, "show overlay display from: %s", str6);
                    return;
                }
            case 12:
                cu1 cu1Var = (cu1) this.f4416c;
                u41 u41Var = (u41) this.f4417d;
                hy1 hy1Var = (hy1) this.f4418e;
                bv1 bv1Var2 = (bv1) cu1Var.f4328j;
                r51 r51VarF = u41Var.f();
                ip1 ip1Var = bv1Var2.f3920g;
                ip1Var.getClass();
                hi hiVar = bv1Var2.f3917d;
                hiVar.getClass();
                hiVar.f6142c = x41.v(r51VarF);
                if (!r51VarF.isEmpty()) {
                    hiVar.f6145f = (hy1) r51VarF.get(0);
                    hy1Var.getClass();
                    hiVar.f6146g = hy1Var;
                }
                if (((hy1) hiVar.f6144e) == null) {
                    hiVar.f6144e = hi.u(ip1Var, (x41) hiVar.f6142c, (hy1) hiVar.f6145f, (bh) hiVar.f6141b);
                }
                hiVar.s(ip1Var.v1());
                return;
            case 13:
                Pair pair = (Pair) this.f4417d;
                ((bv1) ((gu1) this.f4416c).f5907b.f12166j).p(((Integer) pair.first).intValue(), (hy1) pair.second, (ey1) this.f4418e);
                return;
            case 14:
                g1 g1Var2 = (g1) this.f4416c;
                jx1 jx1Var2 = (jx1) this.f4417d;
                ws1 ws1Var2 = (ws1) this.f4418e;
                g1Var2.getClass();
                String str9 = cq0.f4293a;
                bv1 bv1Var3 = g1Var2.f5591b.f6261b.f8792t;
                xu1 xu1VarY2 = bv1Var3.y();
                bv1Var3.r(xu1VarY2, 1009, new xo0(xu1VarY2, jx1Var2, ws1Var2));
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f4416c;
                Handler handler = (Handler) this.f4417d;
                final yf0 yf0Var = (yf0) this.f4418e;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zv1
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i10) {
                                    case 0:
                                        zu1 zu1Var = zu1.f13124c;
                                        yf0 yf0Var2 = yf0Var;
                                        yf0Var2.i(-1, zu1Var);
                                        yf0Var2.j();
                                        break;
                                    default:
                                        zu1 zu1Var2 = zu1.f13124c;
                                        yf0 yf0Var3 = yf0Var;
                                        yf0Var3.i(-1, zu1Var2);
                                        yf0Var3.j();
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (ew1.f5106o) {
                        try {
                            int i11 = ew1.f5108q - 1;
                            ew1.f5108q = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = ew1.f5107p;
                                if (scheduledExecutorService == null) {
                                    throw null;
                                }
                                scheduledExecutorService.shutdown();
                                ew1.f5107p = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zv1
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i) {
                                    case 0:
                                        zu1 zu1Var = zu1.f13124c;
                                        yf0 yf0Var2 = yf0Var;
                                        yf0Var2.i(-1, zu1Var);
                                        yf0Var2.j();
                                        break;
                                    default:
                                        zu1 zu1Var2 = zu1.f13124c;
                                        yf0 yf0Var3 = yf0Var;
                                        yf0Var3.i(-1, zu1Var2);
                                        yf0Var3.j();
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (ew1.f5106o) {
                        try {
                            int i12 = ew1.f5108q - 1;
                            ew1.f5108q = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = ew1.f5107p;
                                if (scheduledExecutorService2 == null) {
                                    throw null;
                                }
                                scheduledExecutorService2.shutdown();
                                ew1.f5107p = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
        }
    }

    public d1(ph phVar, kh khVar, WebView webView, boolean z5) {
        this.f4415b = 2;
        this.f4417d = webView;
        this.f4418e = phVar;
        this.f4416c = new oh(this, khVar, webView, z5);
    }

    public d1(qx qxVar, String str, String str2) {
        this.f4415b = 3;
        this.f4416c = str;
        this.f4417d = str2;
        this.f4418e = qxVar;
    }
}
