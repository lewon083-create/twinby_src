package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 implements h90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12628h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f12629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f12630k;

    public yi0(Context context, u9.a aVar, jx jxVar, xp0 xp0Var, sz szVar, iq0 iq0Var, boolean z5, xo xoVar, ph0 ph0Var, sd0 sd0Var) {
        this.f12623c = context;
        this.f12624d = aVar;
        this.f12625e = jxVar;
        this.f12626f = xp0Var;
        this.f12627g = szVar;
        this.f12628h = iq0Var;
        this.i = xoVar;
        this.f12622b = z5;
        this.f12629j = ph0Var;
        this.f12630k = sd0Var;
    }

    public void a(int i, long j10) {
        if (i == 0) {
            f(new ge.i("Unable to fetch the latest version of the template."));
        } else {
            ((ScheduledExecutorService) this.f12628h).schedule(new e1(this, i, 1, j10), ((Random) this.i).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public void b(InputStream inputStream) throws IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strX = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strX = om1.x(strX, line);
            if (line.contains("}")) {
                int iIndexOf = strX.indexOf(123);
                int iLastIndexOf = strX.lastIndexOf(125);
                strX = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strX.substring(iIndexOf, iLastIndexOf + 1);
                if (!strX.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strX);
                    } catch (JSONException e3) {
                        f(new ge.f("Unable to parse config update message.", e3.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e3);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((he.j) this.f12627g).b(new ge.i("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = ((LinkedHashSet) this.f12623c).isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j10 = ((he.g) this.f12625e).f20514g.f20547a.getLong("last_template_version", 0L);
                        long j11 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j11 > j10) {
                            a(3, j11);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        g(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    strX = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f12624d;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e7) {
                if (!this.f12622b) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e7);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (IOException e10) {
            Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.android.gms.internal.ads.h90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(boolean r18, android.content.Context r19, com.google.android.gms.internal.ads.o60 r20) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r0 = r1.i
            r2 = r0
            com.google.android.gms.internal.ads.xo r2 = (com.google.android.gms.internal.ads.xo) r2
            java.lang.Object r0 = r1.f12625e
            com.google.android.gms.internal.ads.jx r0 = (com.google.android.gms.internal.ads.jx) r0
            java.lang.Object r0 = com.google.android.gms.internal.ads.vv.M(r0)
            com.google.android.gms.internal.ads.v10 r0 = (com.google.android.gms.internal.ads.v10) r0
            java.lang.Object r3 = r1.f12627g
            r6 = r3
            com.google.android.gms.internal.ads.sz r6 = (com.google.android.gms.internal.ads.sz) r6
            r3 = 1
            r6.q1(r3)
            p9.f r7 = new p9.f
            boolean r4 = r1.f12622b
            r5 = 0
            if (r4 == 0) goto L26
            boolean r8 = r2.a(r5)
            goto L27
        L26:
            r8 = r5
        L27:
            p9.k r9 = p9.k.C
            t9.g0 r9 = r9.f31297c
            java.lang.Object r9 = r1.f12623c
            android.content.Context r9 = (android.content.Context) r9
            boolean r9 = t9.g0.j(r9)
            if (r4 == 0) goto L3d
            monitor-enter(r2)
            boolean r10 = r2.f12217b     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            if (r10 == 0) goto L3d
            r10 = r3
            goto L42
        L3d:
            r10 = r5
            goto L42
        L3f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r0
        L42:
            if (r4 == 0) goto L4d
            monitor-enter(r2)
            float r4 = r2.f12218c     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r2)
        L48:
            r11 = r4
            goto L4f
        L4a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            throw r0
        L4d:
            r4 = 0
            goto L48
        L4f:
            java.lang.Object r2 = r1.f12626f
            com.google.android.gms.internal.ads.xp0 r2 = (com.google.android.gms.internal.ads.xp0) r2
            boolean r13 = r2.O
            r14 = 0
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            if (r20 == 0) goto L60
            r20.F1()
        L60:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.ls1 r0 = r0.A
            java.lang.Object r0 = r0.j()
            r5 = r0
            com.google.android.gms.internal.ads.f90 r5 = (com.google.android.gms.internal.ads.f90) r5
            r10 = r7
            int r7 = r2.Q
            java.lang.Object r0 = r1.f12624d
            r8 = r0
            u9.a r8 = (u9.a) r8
            java.lang.String r9 = r2.B
            com.google.android.gms.internal.ads.bq0 r0 = r2.f12260s
            java.lang.String r11 = r0.f3853b
            java.lang.String r12 = r0.f3852a
            java.lang.Object r0 = r1.f12628h
            com.google.android.gms.internal.ads.iq0 r0 = (com.google.android.gms.internal.ads.iq0) r0
            boolean r2 = r2.b()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.f12629j
            com.google.android.gms.internal.ads.ph0 r2 = (com.google.android.gms.internal.ads.ph0) r2
        L89:
            r15 = r2
            goto L8d
        L8b:
            r2 = 0
            goto L89
        L8d:
            java.lang.String r13 = r0.f6575g
            java.lang.String r16 = r6.q()
            r14 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r1.f12630k
            com.google.android.gms.internal.ads.sd0 r0 = (com.google.android.gms.internal.ads.sd0) r0
            r2 = r19
            ob.z.a(r2, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yi0.d(boolean, android.content.Context, com.google.android.gms.internal.ads.o60):void");
    }

    public void e(u3.b bVar) {
        if (!this.f12622b || bVar.equals((u3.b) this.i)) {
            return;
        }
        this.i = bVar;
        u3.s sVar = (u3.s) ((s3.q) this.f12624d).f32631c;
        sVar.f();
        u3.b bVar2 = sVar.f34178g;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        sVar.f34178g = bVar;
        yf0 yf0Var = sVar.f34176e;
        if (yf0Var != null) {
            yf0Var.e(-1, new tf.a(23));
        }
    }

    public synchronized void f(ge.g gVar) {
        Iterator it = ((LinkedHashSet) this.f12623c).iterator();
        while (it.hasNext()) {
            ((ge.b) it.next()).b(gVar);
        }
    }

    public synchronized void g(int i) {
        ((ua.a) this.f12629j).getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i) * 1000));
        he.m mVar = (he.m) this.f12630k;
        synchronized (mVar.f20550d) {
            mVar.f20547a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void h(hv1 hv1Var) {
        if (!this.f12622b || hv1Var.equals((hv1) this.i)) {
            return;
        }
        this.i = hv1Var;
        com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) ((in0) this.f12624d).f6553c;
        cVar.z();
        hv1 hv1Var2 = (hv1) cVar.f13341e;
        if (hv1Var2 == null || hv1Var.equals(hv1Var2)) {
            return;
        }
        cVar.f13341e = hv1Var;
        yf0 yf0Var = (yf0) cVar.f13339c;
        if (yf0Var != null) {
            yf0Var.i(-1, bw1.f3935e);
            yf0Var.j();
        }
    }

    public void i(Runnable runnable) {
        ((Handler) ((o31) this.f12624d).mo8h()).post(new y21(this, runnable, 1));
    }

    @Override // com.google.android.gms.internal.ads.h90
    public xp0 j() {
        return (xp0) this.f12626f;
    }

    public yi0() {
        this.f12623c = new HashMap();
        this.f12624d = new HashMap();
        this.f12625e = new HashMap();
        this.f12626f = new HashSet();
        this.f12627g = new HashSet();
        this.f12628h = new HashSet();
        this.i = new HashMap();
        this.f12629j = new HashSet();
        this.f12630k = new WeakHashMap();
    }

    public yi0(Context context, in0 in0Var, s50 s50Var, AudioDeviceInfo audioDeviceInfo) {
        yi0 yi0Var;
        Context applicationContext = context.getApplicationContext();
        this.f12623c = applicationContext;
        this.f12624d = in0Var;
        this.f12630k = s50Var;
        this.f12629j = audioDeviceInfo;
        String str = cq0.f4293a;
        Looper looperMyLooper = Looper.myLooper();
        jv1 jv1Var = null;
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f12625e = handler;
        this.f12626f = new iv1(0, this);
        this.f12627g = new bj.g(6, this);
        hv1 hv1Var = hv1.f6270c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        if (uriFor != null) {
            yi0Var = this;
            jv1Var = new jv1(yi0Var, handler, applicationContext.getContentResolver(), uriFor, 0);
        } else {
            yi0Var = this;
        }
        yi0Var.f12628h = jv1Var;
    }

    public yi0(Context context, fa1 fa1Var, Intent intent) {
        this.f12627g = new ArrayList();
        this.f12623c = context;
        this.f12625e = fa1Var;
        this.f12626f = "OverlayDisplayService";
        this.f12628h = intent;
        this.f12624d = vv.c(new mp0(6, (byte) 0));
        this.i = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.x21
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                yi0 yi0Var = this.f11990a;
                ((fa1) yi0Var.f12625e).a("%s : Binder has died.", (String) yi0Var.f12626f);
                ArrayList arrayList = (ArrayList) yi0Var.f12627g;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }

    public yi0(HttpURLConnection httpURLConnection, he.g gVar, he.c cVar, LinkedHashSet linkedHashSet, he.j jVar, ScheduledExecutorService scheduledExecutorService, he.m mVar) {
        this.f12624d = httpURLConnection;
        this.f12625e = gVar;
        this.f12626f = cVar;
        this.f12623c = linkedHashSet;
        this.f12627g = jVar;
        this.f12628h = scheduledExecutorService;
        this.i = new Random();
        this.f12622b = false;
        this.f12630k = mVar;
        this.f12629j = ua.a.f34401a;
    }

    public yi0(Context context, s3.q qVar, j3.d dVar, AudioDeviceInfo audioDeviceInfo) {
        yi0 yi0Var;
        Context applicationContext = context.getApplicationContext();
        this.f12623c = applicationContext;
        this.f12624d = qVar;
        this.f12630k = dVar;
        this.f12629j = audioDeviceInfo;
        String str = m3.z.f28608a;
        Looper looperMyLooper = Looper.myLooper();
        jv1 jv1Var = null;
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f12625e = handler;
        this.f12626f = new iv1(1, this);
        this.f12627g = new bj.g(12, this);
        u3.b bVar = u3.b.f34071c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        if (uriFor != null) {
            yi0Var = this;
            jv1Var = new jv1(yi0Var, handler, applicationContext.getContentResolver(), uriFor, 1);
        } else {
            yi0Var = this;
        }
        yi0Var.f12628h = jv1Var;
    }
}
