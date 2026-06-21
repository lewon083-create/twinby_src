package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Timer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l81 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7446d;

    public /* synthetic */ l81(int i, Object obj, Object obj2) {
        this.f7444b = i;
        this.f7445c = obj;
        this.f7446d = obj2;
    }

    private final void a() {
        sz szVar;
        ox0 ox0Var = new ox0(13, (d00) this.f7445c);
        vh0 vh0Var = (vh0) this.f7446d;
        synchronized (vh0Var) {
            yt0 yt0Var = vh0Var.f11386f;
            if (yt0Var == null || (szVar = vh0Var.f11384d) == null) {
                return;
            }
            p9.k.C.f31317x.getClass();
            l80.s(new l81(29, yt0Var, ox0Var));
            vh0Var.f11386f = null;
            szVar.Q0(null);
        }
    }

    private final void b() {
        View view;
        sa0 sa0Var = (sa0) this.f7445c;
        ViewGroup viewGroup = (ViewGroup) this.f7446d;
        iq0 iq0Var = sa0Var.f10220b;
        t9.e0 e0Var = sa0Var.f10219a;
        ja0 ja0Var = sa0Var.f10222d;
        synchronized (ja0Var) {
            view = ja0Var.f6779o;
        }
        if (view != null) {
            boolean z5 = viewGroup != null;
            if (ja0Var.q() == 2 || ja0Var.q() == 1) {
                e0Var.p(iq0Var.f6575g, String.valueOf(ja0Var.q()), z5);
            } else if (ja0Var.q() == 6) {
                String str = iq0Var.f6575g;
                e0Var.p(str, "2", z5);
                e0Var.p(str, "1", z5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0284  */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l81.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l81.d():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thB;
        MediaPlayer.TrackInfo[] trackInfoArr;
        int i;
        MediaFormat format;
        String strB;
        int i10 = 7;
        int i11 = 0;
        byte b2 = 0;
        byte b10 = 0;
        Application application = null;
        Object zgVar = null;
        int i12 = 1;
        switch (this.f7444b) {
            case 0:
                k81 k81Var = (k81) this.f7446d;
                Future future = (Future) this.f7445c;
                if ((future instanceof d91) && (thB = ((d91) future).b()) != null) {
                    k81Var.k(thB);
                    return;
                }
                try {
                    k81Var.mo6i(vv.L(future));
                    return;
                } catch (ExecutionException e3) {
                    k81Var.k(e3.getCause());
                    return;
                } catch (Throwable th2) {
                    k81Var.k(th2);
                    return;
                }
            case 1:
                g1 g1Var = (g1) this.f7445c;
                bs bsVar = (bs) this.f7446d;
                String str = cq0.f4293a;
                ht1 ht1Var = g1Var.f5591b;
                ht1Var.getClass();
                nu0 nu0Var = new nu0(i10, bsVar);
                yf0 yf0Var = ht1Var.f6261b.f8787o;
                yf0Var.i(25, nu0Var);
                yf0Var.j();
                return;
            case 2:
                g1 g1Var2 = (g1) this.f7445c;
                vs1 vs1Var = (vs1) this.f7446d;
                synchronized (vs1Var) {
                }
                String str2 = cq0.f4293a;
                bv1 bv1Var = g1Var2.f5591b.f6261b.f8792t;
                xu1 xu1VarW = bv1Var.w((hy1) bv1Var.f3917d.f6145f);
                bv1Var.r(xu1VarW, 1020, new in0(xu1VarW, vs1Var, 16));
                return;
            case 3:
                try {
                    ((ha) this.f7446d).f6077c.put((qa) this.f7445c);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 4:
                ph phVar = (ph) this.f7446d;
                View view = (View) this.f7445c;
                phVar.getClass();
                try {
                    kh khVar = new kh(phVar.f9054g, phVar.f9055h, phVar.i, phVar.f9056j, phVar.f9057k, phVar.f9058l, phVar.f9059m, phVar.f9062p);
                    com.google.android.gms.internal.measurement.i4 i4Var = p9.k.C.f31301g;
                    synchronized (i4Var.f13782c) {
                        try {
                            lh lhVar = (lh) i4Var.f13783d;
                            if (lhVar != null) {
                                application = lhVar.f7512c;
                            }
                        } finally {
                        }
                    }
                    if (application != null) {
                        String str3 = phVar.f9060n;
                        if (!TextUtils.isEmpty(str3)) {
                            String str4 = (String) view.getTag(application.getResources().getIdentifier((String) q9.s.f31967e.f31970c.a(al.f3248w0), "id", application.getPackageName()));
                            if (str4 != null && str4.equals(str3)) {
                                return;
                            }
                        }
                    }
                    c3 c3VarA = phVar.a(view, khVar);
                    khVar.b();
                    if (c3VarA.f4005a == 0 && c3VarA.f4006b == 0) {
                        return;
                    }
                    int i13 = c3VarA.f4006b;
                    if (i13 != 0) {
                        if (i13 == 0) {
                        }
                        phVar.f9052e.q(khVar);
                        return;
                    } else if (khVar.f7224k == 0) {
                        return;
                    }
                    ya yaVar = phVar.f9052e;
                    synchronized (yaVar.f12556c) {
                        try {
                            if (((LinkedList) yaVar.f12557d).contains(khVar)) {
                                return;
                            }
                            phVar.f9052e.q(khVar);
                            return;
                        } finally {
                        }
                    }
                } catch (Exception e7) {
                    u9.i.f("Exception in fetchContentOnUIThread", e7);
                    p9.k.C.f31302h.d("ContentFetchTask.fetchContent", e7);
                    return;
                }
            case 5:
                if (((ni) this.f7446d).isCancelled()) {
                    ((Future) this.f7445c).cancel(true);
                    return;
                }
                return;
            case 6:
                boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.U5)).booleanValue();
                Context context = (Context) this.f7446d;
                com.google.android.gms.internal.measurement.i4 i4Var2 = (com.google.android.gms.internal.measurement.i4) this.f7445c;
                if (zBooleanValue) {
                    try {
                        try {
                            IBinder iBinderB = u9.i.b(context).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                            int i14 = ah.f2902b;
                            if (iBinderB != null) {
                                IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                zgVar = iInterfaceQueryLocalInterface instanceof ch ? (ch) iInterfaceQueryLocalInterface : new zg(iBinderB, "com.google.android.gms.ads.clearcut.IClearcut", 1);
                            }
                            i4Var2.f13782c = zgVar;
                            ((zg) ((ch) i4Var2.f13782c)).d3(new xa.b(context));
                            i4Var2.f13781b = true;
                            return;
                        } catch (Exception e10) {
                            throw new u9.j(e10);
                        }
                    } catch (RemoteException | NullPointerException | u9.j unused2) {
                        u9.i.c("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 7:
                qq qqVar = (qq) this.f7446d;
                rq rqVar = (rq) this.f7445c;
                p9.k.C.f31304k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    t9.c0.m("loadJavascriptEngine > Before createJavascriptEngine");
                    Context context2 = (Context) rqVar.f10021c;
                    u9.a aVar = (u9.a) rqVar.f10023e;
                    hq hqVar = new hq();
                    sz szVarE = fp.e(context2, new j0(0, 0, 0), "", false, false, null, null, aVar, null, null, new si(), null, null, null, null, null);
                    hqVar.f6211b = szVarE;
                    szVarE.i0().setWillNotDraw(true);
                    t9.c0.m("loadJavascriptEngine > After createJavascriptEngine");
                    t9.c0.m("loadJavascriptEngine > Before setting new engine loaded listener");
                    oq oqVar = new oq();
                    oqVar.f8754b = rqVar;
                    oqVar.f8755c = arrayList;
                    oqVar.f8753a = jCurrentTimeMillis;
                    oqVar.f8756d = qqVar;
                    oqVar.f8757e = hqVar;
                    sz szVar = hqVar.f6211b;
                    if (szVar != null) {
                        szVar.q0().i = new kx0(i10, oqVar);
                    }
                    t9.c0.m("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    hqVar.j("/jsLoaded", new jq(rqVar, jCurrentTimeMillis, qqVar, hqVar));
                    k6.t0 t0Var = new k6.t0(13, (boolean) (b10 == true ? 1 : 0));
                    kq kqVar = new kq(rqVar, hqVar, t0Var);
                    t0Var.f27180c = kqVar;
                    t9.c0.m("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) bm.f3820d.r()).booleanValue() || TextUtils.equals(((Context) rqVar.f10021c).getPackageName(), "com.google.android.gms")) {
                        hqVar.j("/requestReload", kqVar);
                    }
                    String str5 = (String) rqVar.f10022d;
                    t9.c0.m("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str5)));
                    if (str5.endsWith(".js")) {
                        t9.c0.m("loadJavascriptEngine > Before newEngine.loadJavascript");
                        t9.c0.m("loadJavascript on adWebView from path: ".concat(str5));
                        hq.k(new gq(hqVar, "<!DOCTYPE html><html><head><script src=\"" + str5 + "\"></script></head><body></body></html>", b2 == true ? 1 : 0));
                        t9.c0.m("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str5.startsWith("<html>")) {
                        t9.c0.m("loadJavascriptEngine > Before newEngine.loadHtml");
                        t9.c0.m("loadHtml on adWebView from html");
                        hq.k(new gq(hqVar, str5, 1));
                        t9.c0.m("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        t9.c0.m("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        t9.c0.m("loadHtmlWrapper on adWebView from path: ".concat(str5));
                        hq.k(new gq(hqVar, str5, 2));
                        t9.c0.m("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    t9.c0.m("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    t9.g0.f33596l.postDelayed(new mq(rqVar, qqVar, hqVar, arrayList, jCurrentTimeMillis, 0), ((Integer) q9.s.f31967e.f31970c.a(al.f2979e)).intValue());
                    return;
                } catch (Throwable th3) {
                    u9.i.f("Error creating webview.", th3);
                    wk wkVar = al.B8;
                    q9.s sVar = q9.s.f31967e;
                    if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                        qqVar.g("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th3);
                        return;
                    } else if (((Boolean) sVar.f31970c.a(al.D8)).booleanValue()) {
                        p9.k.C.f31302h.e("SdkJavascriptFactory.loadJavascriptEngine", th3);
                        qqVar.f();
                        return;
                    } else {
                        p9.k.C.f31302h.d("SdkJavascriptFactory.loadJavascriptEngine", th3);
                        qqVar.f();
                        return;
                    }
                }
            case 8:
                ob.z zVar = p9.k.C.f31296b;
                ob.z.a(((zzbwl) this.f7446d).f13164a, (AdOverlayInfoParcel) this.f7445c, true, null);
                return;
            case 9:
                ((u9.l) this.f7445c).a((String) this.f7446d, null);
                return;
            case 10:
                tv tvVar = (tv) this.f7445c;
                Bitmap bitmap = (Bitmap) this.f7446d;
                tvVar.getClass();
                zm1 zm1Var = bn1.f3837c;
                an1 an1Var = new an1();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, an1Var);
                synchronized (tvVar.f10729h) {
                    gq1 gq1Var = tvVar.f10722a;
                    br1 br1VarZ = cr1.z();
                    bn1 bn1VarA = an1Var.a();
                    br1VarZ.b();
                    ((cr1) br1VarZ.f9560c).B(bn1VarA);
                    br1VarZ.b();
                    ((cr1) br1VarZ.f9560c).A("image/png");
                    br1VarZ.b();
                    ((cr1) br1VarZ.f9560c).C(2);
                    cr1 cr1Var = (cr1) br1VarZ.d();
                    gq1Var.b();
                    ((lr1) gq1Var.f9560c).J(cr1Var);
                    break;
                }
                return;
            case 11:
                qx qxVar = (qx) this.f7446d;
                MediaPlayer mediaPlayer = (MediaPlayer) this.f7445c;
                sz szVar2 = qxVar.f9620d;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue() && szVar2 != null && mediaPlayer != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap map = new HashMap();
                            while (i11 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i11];
                                if (trackInfo2 == null) {
                                    trackInfoArr = trackInfo;
                                } else {
                                    int trackType = trackInfo2.getTrackType();
                                    trackInfoArr = trackInfo;
                                    if (trackType == i12) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    map.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused3) {
                                                    map.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                qxVar.f9635t = numValueOf;
                                                map.put("bitRate", String.valueOf(numValueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                int integer = format2.getInteger("width");
                                                int integer2 = format2.getInteger("height");
                                                i = i11;
                                                StringBuilder sb2 = new StringBuilder(pe.a.a(integer, 1) + String.valueOf(integer2).length());
                                                sb2.append(integer);
                                                sb2.append("x");
                                                sb2.append(integer2);
                                                map.put("resolution", sb2.toString());
                                            } else {
                                                i = i11;
                                            }
                                            if (format2.containsKey("mime")) {
                                                map.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                map.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                        }
                                        i11 = i + 1;
                                        trackInfo = trackInfoArr;
                                        i12 = 1;
                                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            map.put("audioMime", format.getString("mime"));
                                        }
                                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                            map.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                }
                                i = i11;
                                i11 = i + 1;
                                trackInfo = trackInfoArr;
                                i12 = 1;
                                break;
                            }
                            if (!map.isEmpty()) {
                                szVar2.c("onMetadataEvent", map);
                            }
                        }
                    } catch (RuntimeException e11) {
                        p9.k.C.f31302h.d("AdMediaPlayerView.reportMetadata", e11);
                    }
                }
                vx vxVar = qxVar.f9633r;
                if (vxVar != null) {
                    vxVar.e();
                    return;
                }
                return;
            case 12:
                Context context3 = (Context) this.f7445c;
                cb0 cb0Var = (cb0) this.f7446d;
                nz.f8497b = (AudioManager) context3.getSystemService("audio");
                cb0Var.a();
                return;
            case 13:
                AtomicInteger atomicInteger = jz.f7008v;
                ((sz) this.f7445c).c("onGcacheInfoEvent", (HashMap) this.f7446d);
                return;
            case 14:
                a();
                return;
            case 15:
                ((g00) this.f7445c).B((String) this.f7446d);
                return;
            case 16:
                ((i00) this.f7445c).f6318b.c("pubVideoCmd", (HashMap) this.f7446d);
                return;
            case 17:
                j00 j00Var = (j00) this.f7445c;
                String str6 = (String) this.f7446d;
                cf cfVar = j00Var.f6669a;
                Uri uri = Uri.parse(str6);
                k00 k00Var = ((g00) cfVar.f4193c).f5576o;
                if (k00Var == null) {
                    u9.i.e("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                } else {
                    k00Var.i(uri);
                    return;
                }
            case 18:
                q30 q30Var = (q30) this.f7445c;
                JSONObject jSONObject = (JSONObject) this.f7446d;
                String string = jSONObject.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 31);
                sb3.append("Calling AFMA_updateActiveView(");
                sb3.append(string);
                sb3.append(")");
                u9.i.c(sb3.toString());
                q30Var.f9317b.a("AFMA_updateActiveView", jSONObject);
                return;
            case 19:
                try {
                    ((e80) this.f7445c).mo7a(this.f7446d);
                    return;
                } catch (Throwable th4) {
                    p9.k.C.f31302h.e("EventEmitter.notify", th4);
                    t9.c0.n("Event emitter exception.", th4);
                    return;
                }
            case 20:
                yd1 yd1Var = (yd1) this.f7445c;
                Integer num = (Integer) this.f7446d;
                if (yd1Var.f12599b == 0) {
                    yd1Var.j(num);
                    return;
                }
                return;
            case 21:
                yd1 yd1Var2 = (yd1) this.f7445c;
                Object obj = this.f7446d;
                int i15 = yd1Var2.f12599b - 1;
                yd1Var2.f12599b = i15;
                if (i15 == 0) {
                    yd1Var2.j(obj);
                    return;
                }
                return;
            case 22:
                yd1 yd1Var3 = (yd1) this.f7445c;
                Object objApply = ((gt1) this.f7446d).apply(yd1Var3.f12604g);
                yd1Var3.f12604g = objApply;
                l81 l81Var = new l81(21, yd1Var3, objApply);
                lo0 lo0Var = (lo0) yd1Var3.f12601d;
                if (lo0Var.f7588a.getLooper().getThread().isAlive()) {
                    lo0Var.e(l81Var);
                    return;
                }
                return;
            case 23:
                b();
                return;
            case 24:
                c();
                return;
            case 25:
                d();
                return;
            case 26:
                ((se0) this.f7445c).i.execute(new h30(10, (jx) this.f7446d));
                return;
            case 27:
                try {
                    ((tp) this.f7446d).k3(((se0) this.f7445c).b());
                    return;
                } catch (RemoteException e12) {
                    u9.i.f("", e12);
                    return;
                }
            case 28:
                vf0 vf0Var = (vf0) this.f7445c;
                Context context4 = (Context) this.f7446d;
                sd0 sd0Var = vf0Var.f11373c;
                il ilVar = p9.k.C.f31307n;
                if (ilVar.f6526c.getAndSet(true)) {
                    return;
                }
                ilVar.f6527d = context4;
                ilVar.f6528e = sd0Var;
                if (ilVar.f6530g != null || (strB = q.g.b(context4, null)) == null || strB.equals(context4.getPackageName())) {
                    return;
                }
                q.g.a(context4, strB, ilVar);
                return;
            default:
                yt0 yt0Var = (yt0) this.f7445c;
                ox0 ox0Var = (ox0) this.f7446d;
                Iterator it = yt0Var.f12740d.values().iterator();
                while (it.hasNext()) {
                    ((ut0) it.next()).c();
                }
                Timer timer = new Timer();
                timer.schedule(new lh0(yt0Var, ox0Var, timer), 1000L);
                return;
        }
    }

    public String toString() {
        switch (this.f7444b) {
            case 0:
                oq0 oq0Var = new oq0(l81.class.getSimpleName(), 29);
                k81 k81Var = (k81) this.f7446d;
                ut utVar = new ut(22);
                ((ut) oq0Var.f8764e).f11062d = utVar;
                oq0Var.f8764e = utVar;
                utVar.f11061c = k81Var;
                return oq0Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l81(int i, Object obj, Object obj2, boolean z5) {
        this.f7444b = i;
        this.f7445c = obj2;
        this.f7446d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l81(sa0 sa0Var, eb0 eb0Var) {
        this.f7444b = 24;
        this.f7445c = sa0Var;
        this.f7446d = (ug) eb0Var;
    }
}
