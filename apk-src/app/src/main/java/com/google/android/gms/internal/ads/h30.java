package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h30 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6014c;

    public /* synthetic */ h30(int i, Object obj) {
        this.f6013b = i;
        this.f6014c = obj;
    }

    private final void a() {
        o60 o60Var = (o60) this.f6014c;
        synchronized (o60Var) {
            u9.i.e("Timeout waiting for show call succeed to be called.");
            o60Var.y0(new g90("Timeout for show call succeed."));
            o60Var.f8620f = true;
        }
    }

    private final void b() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        hf0 hf0Var = (hf0) this.f6014c;
        sz szVar = hf0Var.f6122e;
        ff0 ff0Var = hf0Var.f6121d;
        synchronized (ff0Var) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("platform", "ANDROID");
                    String str = ff0Var.f5347k;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                        sb2.append("afma-sdk-a-v");
                        sb2.append(str);
                        jSONObject.put("sdkVersion", sb2.toString());
                    }
                    jSONObject.put("internalSdkVersion", ff0Var.i);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", ff0Var.f5341d.a());
                    wk wkVar = al.Ga;
                    q9.s sVar = q9.s.f31967e;
                    if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                        String str2 = p9.k.C.f31302h.f3946g;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("plugin", str2);
                        }
                    }
                    long j10 = ff0Var.f5353q;
                    p9.k kVar = p9.k.C;
                    kVar.f31304k.getClass();
                    if (j10 < System.currentTimeMillis() / 1000) {
                        ff0Var.f5351o = "{}";
                    }
                    jSONObject.put("networkExtras", ff0Var.f5351o);
                    jSONObject.put("adSlots", ff0Var.i());
                    jSONObject.put("appInfo", ff0Var.f5342e.m());
                    String str3 = kVar.f31302h.g().n().f12770e;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) sVar.f31970c.a(al.va)).booleanValue() && (jSONObject2 = ff0Var.f5352p) != null) {
                        String string = jSONObject2.toString();
                        StringBuilder sb3 = new StringBuilder(string.length() + 13);
                        sb3.append("Server data: ");
                        sb3.append(string);
                        u9.i.c(sb3.toString());
                        jSONObject.put("serverData", ff0Var.f5352p);
                    }
                    if (((Boolean) sVar.f31970c.a(al.f3229ua)).booleanValue()) {
                        jSONObject.put("openAction", ff0Var.f5358v);
                        jSONObject.put("gesture", ff0Var.f5354r);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", kVar.f31308o.g());
                    u9.d dVar = q9.r.f31959g.f31960a;
                    jSONObject.put("isSimulator", u9.d.q());
                    if (((Boolean) sVar.f31970c.a(al.Ia)).booleanValue()) {
                        jSONObject.put("uiStorage", new JSONObject(ff0Var.f5360x));
                    }
                    if (!TextUtils.isEmpty((CharSequence) sVar.f31970c.a(al.Ka))) {
                        jSONObject.put("gmaDisk", (JSONObject) ff0Var.f5345h.f5920b);
                    }
                    if (!TextUtils.isEmpty((CharSequence) sVar.f31970c.a(al.Ja))) {
                        jSONObject.put("userDisk", (JSONObject) ff0Var.f5344g.f5920b);
                    }
                } catch (JSONException e3) {
                    p9.k.C.f31302h.e("Inspector.toJson", e3);
                    u9.i.i("Ad inspector encountered an error", e3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        szVar.g("window.inspectorInfo", jSONObject.toString());
    }

    private final /* synthetic */ void c() {
        tf0 tf0Var = (tf0) this.f6014c;
        AtomicReference atomicReference = tf0Var.f10596d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(tf0Var.b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        eg0 eg0Var = (eg0) this.f6014c;
        synchronized (eg0Var.f6134c) {
            try {
                if (eg0Var.f6135d) {
                    return;
                }
                eg0Var.f6135d = true;
                ki kiVar = new ki(eg0Var.f4941h, p9.k.C.f31313t.i(), eg0Var, eg0Var, 2);
                eg0Var.f6138g = kiVar;
                kiVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x0017, B:8:0x001b, B:13:0x0023, B:19:0x002f, B:21:0x0033, B:23:0x0039, B:25:0x0043, B:27:0x004d, B:29:0x005e, B:28:0x0052, B:30:0x0060, B:32:0x006f, B:34:0x0076), top: B:42:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f6014c
            com.google.android.gms.internal.ads.oi0 r0 = (com.google.android.gms.internal.ads.oi0) r0
            java.lang.ref.WeakReference r1 = r0.f8695a
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.m r1 = (com.google.android.gms.internal.ads.m) r1
            if (r1 == 0) goto L9d
            com.google.android.gms.internal.ads.zj0 r0 = r0.f8697c
            int r0 = r0.b()
            com.google.android.gms.internal.ads.n r2 = r1.f7699a
            monitor-enter(r2)
            int r1 = r2.f8075m     // Catch: java.lang.Throwable -> L20
            if (r1 != r0) goto L23
            java.lang.String r1 = r2.f8076n     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L99
            goto L23
        L20:
            r0 = move-exception
            goto L9b
        L23:
            r2.f8075m = r0     // Catch: java.lang.Throwable -> L20
            r1 = 1
            if (r0 == r1) goto L99
            if (r0 == 0) goto L99
            r1 = 8
            if (r0 != r1) goto L2f
            goto L99
        L2f:
            java.lang.String r1 = r2.f8076n     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L60
            android.content.Context r1 = r2.f8065b     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = com.google.android.gms.internal.ads.cq0.f4293a     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L52
            java.lang.String r3 = "phone"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.Throwable -> L20
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L52
            java.lang.String r1 = r1.getNetworkCountryIso()     // Catch: java.lang.Throwable -> L20
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L52
            java.lang.String r1 = com.google.android.gms.internal.ads.ix.w(r1)     // Catch: java.lang.Throwable -> L20
            goto L5e
        L52:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.getCountry()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = com.google.android.gms.internal.ads.ix.w(r1)     // Catch: java.lang.Throwable -> L20
        L5e:
            r2.f8076n = r1     // Catch: java.lang.Throwable -> L20
        L60:
            long r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L20
            r2.f8073k = r0     // Catch: java.lang.Throwable -> L20
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L20
            int r3 = r2.f8069f     // Catch: java.lang.Throwable -> L20
            r8 = 0
            if (r3 <= 0) goto L75
            long r3 = r2.f8070g     // Catch: java.lang.Throwable -> L20
            long r3 = r0 - r3
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L20
            goto L76
        L75:
            r3 = r8
        L76:
            long r4 = r2.f8071h     // Catch: java.lang.Throwable -> L20
            long r6 = r2.f8073k     // Catch: java.lang.Throwable -> L20
            r2.a(r3, r4, r6)     // Catch: java.lang.Throwable -> L20
            r2.f8070g = r0     // Catch: java.lang.Throwable -> L20
            r0 = 0
            r2.f8071h = r0     // Catch: java.lang.Throwable -> L20
            r2.f8072j = r0     // Catch: java.lang.Throwable -> L20
            r2.i = r0     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.w r0 = r2.f8068e     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r0.f11553f     // Catch: java.lang.Throwable -> L20
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L20
            r1.clear()     // Catch: java.lang.Throwable -> L20
            r1 = -1
            r0.f11549b = r1     // Catch: java.lang.Throwable -> L20
            r0.f11550c = r8     // Catch: java.lang.Throwable -> L20
            r0.f11551d = r8     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return
        L99:
            monitor-exit(r2)
            return
        L9b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h30.e():void");
    }

    private final void f() {
        oj0 oj0Var = (oj0) this.f6014c;
        synchronized (oj0Var) {
            oj0Var.f8698a.getClass();
            oj0Var.f8705h = SystemClock.elapsedRealtime() - oj0Var.i;
        }
    }

    private final void g() {
        nk0 nk0Var = (nk0) this.f6014c;
        synchronized (nk0Var) {
            nk0Var.l4(3, "Signal collection timeout.");
        }
    }

    private final void h() {
        ut utVar = (ut) this.f6014c;
        synchronized (utVar) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) utVar.f11062d;
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        lr0 lr0Var;
        switch (this.f6013b) {
            case 0:
                n30 n30Var = ((g30) this.f6014c).f5645c.f6354d;
                synchronized (n30Var) {
                    n30Var.b();
                    n30Var.f8173j = true;
                }
                return;
            case 1:
                x30 x30Var = (x30) this.f6014c;
                zn znVar = x30Var.f11999q.f8254d;
                if (znVar == null) {
                    return;
                }
                try {
                    q9.l0 l0Var = (q9.l0) x30Var.f12001s.j();
                    xa.b bVar = new xa.b(x30Var.f11994l);
                    Parcel parcelD0 = znVar.D0();
                    vg.e(parcelD0, l0Var);
                    vg.e(parcelD0, bVar);
                    znVar.L1(parcelD0, 1);
                    return;
                } catch (RemoteException e3) {
                    u9.i.f("RemoteException when notifyAdLoad is called", e3);
                    return;
                }
            case 2:
                ((x40) this.f6014c).f12017c = false;
                return;
            case 3:
                i50 i50Var = (i50) this.f6014c;
                pn1.z(i50Var.f6376d);
                i50Var.i = true;
                return;
            case 4:
                q50 q50Var = (q50) this.f6014c;
                synchronized (q50Var) {
                    try {
                        y81 y81Var = q50Var.f9341g;
                        if (y81Var.isDone()) {
                            return;
                        }
                        y81Var.e(Boolean.TRUE);
                        return;
                    } finally {
                    }
                }
            case 5:
                v50 v50Var = (v50) this.f6014c;
                synchronized (v50Var.f11239b) {
                    try {
                        if (v50Var.f11246j) {
                            return;
                        }
                        v50Var.f11246j = true;
                        v50Var.a();
                        return;
                    } finally {
                    }
                }
            case 6:
                a();
                return;
            case 7:
                ((ma0) this.f6014c).t();
                return;
            case 8:
                ra0 ra0Var = (ra0) this.f6014c;
                if (ra0Var.f9776h == null) {
                    View view = new View(ra0Var.f9773e.getContext());
                    ra0Var.f9776h = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (ra0Var.f9773e != ra0Var.f9776h.getParent()) {
                    ra0Var.f9773e.addView(ra0Var.f9776h);
                    return;
                }
                return;
            case 9:
                zb0 zb0Var = (zb0) this.f6014c;
                try {
                    zb0Var.getClass();
                    pa.c0.e("#008 Must be called on the main UI thread.");
                    zb0Var.m4();
                    fa0 fa0Var = zb0Var.f12942d;
                    if (fa0Var != null) {
                        fa0Var.n();
                    }
                    zb0Var.f12942d = null;
                    zb0Var.f12940b = null;
                    zb0Var.f12941c = null;
                    zb0Var.f12943e = true;
                    return;
                } catch (RemoteException e7) {
                    u9.i.k("#007 Could not call remote method.", e7);
                    return;
                }
            case 10:
                String str = p9.k.C.f31302h.g().n().f12770e;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                jx jxVar = (jx) this.f6014c;
                if (zIsEmpty) {
                    jxVar.d(new Exception());
                    return;
                } else {
                    jxVar.b(str);
                    return;
                }
            case 11:
                b();
                return;
            case 12:
                c();
                return;
            case 13:
                ((dg0) this.f6014c).a();
                return;
            case 14:
                ((dg0) this.f6014c).a();
                return;
            case 15:
                oq0 oq0Var = (oq0) this.f6014c;
                n10 n10Var = ((n10) oq0Var.f8763d).f8104b;
                gr.L((Context) oq0Var.f8762c, Context.class);
                kx0 kx0Var = new kx0(n10Var);
                ls1 ls1Var = n10Var.f8118j;
                z00 z00Var = n10Var.f8102a;
                j40 j40Var = (j40) kx0Var.f7326c;
                Context context = z00Var.f12809b;
                gr.G(context);
                gx gxVar = hx.f6280b;
                gr.G(gxVar);
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                js1 js1VarB = ls1.b(j40Var);
                u9.a aVar = z00Var.f12808a;
                gr.G(aVar);
                oq0 oq0Var2 = new oq0(context, gxVar, gxVar2, js1VarB, aVar, kx0Var, (sd0) ls1Var.j());
                t9.g0 g0Var = p9.k.C.f31297c;
                if (t9.g0.f(context.getPackageName())) {
                    gxVar2.execute(new h30(16, oq0Var2));
                    return;
                }
                kx0 kx0Var2 = new kx0(22, oq0Var2);
                gr.G(context);
                gr.G(aVar);
                gxVar.execute(new h30(17, new eg0(context, aVar, kx0Var2)));
                return;
            case 16:
                ((oq0) this.f6014c).y();
                return;
            case 17:
                d();
                return;
            case 18:
                e();
                return;
            case 19:
                f();
                return;
            case 20:
                g();
                return;
            case 21:
                boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.Gb)).booleanValue();
                Throwable th2 = (Throwable) this.f6014c;
                if (zBooleanValue) {
                    p9.k.C.f31302h.f("TopicsSignalUnsampled.fetchTopicsSignal", th2);
                    return;
                } else {
                    p9.k.C.f31302h.e("TopicsSignal.fetchTopicsSignal", th2);
                    return;
                }
            case 22:
                ((no0) this.f6014c).f8392d.K(vv.C(6, null, null));
                return;
            case 23:
                ((so0) this.f6014c).f10358d.K(vv.C(6, null, null));
                return;
            case 24:
                ((uk0) this.f6014c).k();
                return;
            case 25:
                ((kp0) this.f6014c).f7280d.K(vv.C(6, null, null));
                return;
            case 26:
                ((np0) this.f6014c).k();
                return;
            case 27:
                ((rp0) this.f6014c).f10012d.K(vv.C(6, null, null));
                return;
            case 28:
                h();
                return;
            default:
                lr0 lr0Var2 = (lr0) this.f6014c;
                mr0 mr0Var = lr0Var2.f7601d;
                synchronized (mr0Var) {
                    try {
                        ScheduledFuture scheduledFuture = lr0Var2.f7600c;
                        lr0Var = scheduledFuture != null ? (lr0) mr0Var.f8003d.remove(scheduledFuture) : null;
                    } finally {
                    }
                    break;
                }
                if (lr0Var != null) {
                    lr0Var2.f7601d.f8002c.execute(lr0Var2.f7598a);
                    return;
                }
                return;
        }
    }
}
