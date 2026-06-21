package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.f1;
import com.google.android.gms.internal.ads.uz;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import java.util.ArrayDeque;
import java.util.Objects;
import ob.h3;
import ob.i1;
import ob.k2;
import ob.k3;
import ob.l1;
import ob.r2;
import ob.t2;
import ob.u2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14842c;

    public j(k2 k2Var) {
        this.f14841b = 1;
        this.f14842c = k2Var;
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f14842c;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e3) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e3);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    jd.b bVar = (jd.b) fd.g.e().c(jd.b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (bVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        jd.c cVar = (jd.c) bVar;
                        if (!kd.a.f27375b.contains("fcm") && kd.a.b("fcm", "_ln")) {
                            m1 m1Var = (m1) cVar.f26619a.f45c;
                            m1Var.c(new w0(m1Var, "fcm", "_ln", (Object) string2, true));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        cVar.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            d4.o(bundle, "_no");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:22:0x0049, B:25:0x0050, B:27:0x0063, B:29:0x006b, B:35:0x007b, B:40:0x0088, B:15:0x002e, B:17:0x0035, B:19:0x0041), top: B:49:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(com.google.android.gms.internal.measurement.v0 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f14842c
            r1 = r0
            ob.k2 r1 = (ob.k2) r1
            java.lang.Object r0 = r1.f15951b     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ob.l1 r0 = (ob.l1) r0     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ob.s0 r2 = r0.f30265g     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ob.l1.k(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            com.google.android.gms.internal.ads.ur r2 = r2.f30418o     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "onActivityCreated"
            r2.f(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            android.content.Intent r2 = r9.f14014d     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L97
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 == 0) goto L2e
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r4 != 0) goto L26
            goto L2e
        L26:
            r5 = r3
            goto L47
        L28:
            r0 = move-exception
            goto Lb9
        L2b:
            r0 = move-exception
            goto La4
        L2e:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r4 = 0
            if (r3 == 0) goto L46
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r5 != 0) goto L46
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L26
        L46:
            r5 = r4
        L47:
            if (r5 == 0) goto L97
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L50
            goto L97
        L50:
            ob.e4 r3 = r0.f30267j     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ob.l1.h(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L78
            java.lang.String r3 = "https://www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L78
            java.lang.String r3 = "android-app://com.google.appcrawler"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L74
            goto L78
        L74:
            java.lang.String r2 = "auto"
        L76:
            r6 = r2
            goto L7b
        L78:
            java.lang.String r2 = "gs"
            goto L76
        L7b:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r10 != 0) goto L86
            r2 = 1
        L84:
            r4 = r2
            goto L88
        L86:
            r2 = 0
            goto L84
        L88:
            ob.i1 r0 = r0.f30266h     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ob.l1.k(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ob.b2 r2 = new ob.b2     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r0.L(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto Lb4
        L97:
            java.lang.Object r0 = r1.f15951b
            ob.l1 r0 = (ob.l1) r0
        L9b:
            ob.u2 r0 = r0.f30270m
            ob.l1.i(r0)
            r0.K(r9, r10)
            return
        La4:
            java.lang.Object r2 = r1.f15951b     // Catch: java.lang.Throwable -> L28
            ob.l1 r2 = (ob.l1) r2     // Catch: java.lang.Throwable -> L28
            ob.s0 r2 = r2.f30265g     // Catch: java.lang.Throwable -> L28
            ob.l1.k(r2)     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.internal.ads.ur r2 = r2.f30411g     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.g(r0, r3)     // Catch: java.lang.Throwable -> L28
        Lb4:
            java.lang.Object r0 = r1.f15951b
            ob.l1 r0 = (ob.l1) r0
            goto L9b
        Lb9:
            java.lang.Object r1 = r1.f15951b
            ob.l1 r1 = (ob.l1) r1
            ob.u2 r1 = r1.f30270m
            ob.l1.i(r1)
            r1.K(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.j.j(com.google.android.gms.internal.measurement.v0, android.os.Bundle):void");
    }

    public void k(v0 v0Var) {
        u2 u2Var = ((l1) ((k2) this.f14842c).f15951b).f30270m;
        l1.i(u2Var);
        synchronized (u2Var.f30452m) {
            try {
                if (Objects.equals(u2Var.f30448h, v0Var)) {
                    u2Var.f30448h = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((l1) u2Var.f15951b).f30263e.Q()) {
            u2Var.f30447g.remove(Integer.valueOf(v0Var.f14012b));
        }
    }

    public void l(v0 v0Var) {
        l1 l1Var = (l1) ((k2) this.f14842c).f15951b;
        u2 u2Var = l1Var.f30270m;
        l1.i(u2Var);
        synchronized (u2Var.f30452m) {
            u2Var.f30451l = false;
            u2Var.i = true;
        }
        l1 l1Var2 = (l1) u2Var.f15951b;
        l1Var2.f30269l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (l1Var2.f30263e.Q()) {
            r2 r2VarH = u2Var.H(v0Var);
            u2Var.f30445e = u2Var.f30444d;
            u2Var.f30444d = null;
            i1 i1Var = l1Var2.f30266h;
            l1.k(i1Var);
            i1Var.L(new f1(u2Var, r2VarH, jElapsedRealtime));
        } else {
            u2Var.f30444d = null;
            i1 i1Var2 = l1Var2.f30266h;
            l1.k(i1Var2);
            i1Var2.L(new uz(u2Var, jElapsedRealtime));
        }
        k3 k3Var = l1Var.i;
        l1.i(k3Var);
        l1 l1Var3 = (l1) k3Var.f15951b;
        l1Var3.f30269l.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        i1 i1Var3 = l1Var3.f30266h;
        l1.k(i1Var3);
        i1Var3.L(new h3(k3Var, jElapsedRealtime2, 1));
    }

    public void m(v0 v0Var) {
        l1 l1Var = (l1) ((k2) this.f14842c).f15951b;
        k3 k3Var = l1Var.i;
        l1.i(k3Var);
        l1 l1Var2 = (l1) k3Var.f15951b;
        l1Var2.f30269l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        i1 i1Var = l1Var2.f30266h;
        l1.k(i1Var);
        i1Var.L(new h3(k3Var, jElapsedRealtime, 0));
        u2 u2Var = l1Var.f30270m;
        l1.i(u2Var);
        Object obj = u2Var.f30452m;
        synchronized (obj) {
            u2Var.f30451l = true;
            if (!Objects.equals(v0Var, u2Var.f30448h)) {
                synchronized (obj) {
                    u2Var.f30448h = v0Var;
                    u2Var.i = false;
                    l1 l1Var3 = (l1) u2Var.f15951b;
                    if (l1Var3.f30263e.Q()) {
                        u2Var.f30449j = null;
                        i1 i1Var2 = l1Var3.f30266h;
                        l1.k(i1Var2);
                        i1Var2.L(new t2(u2Var, 1));
                    }
                }
            }
        }
        l1 l1Var4 = (l1) u2Var.f15951b;
        if (!l1Var4.f30263e.Q()) {
            u2Var.f30444d = u2Var.f30449j;
            i1 i1Var3 = l1Var4.f30266h;
            l1.k(i1Var3);
            i1Var3.L(new t2(u2Var, 0));
            return;
        }
        u2Var.L(v0Var.f14013c, u2Var.H(v0Var), false);
        ob.x xVar = ((l1) u2Var.f15951b).f30272o;
        l1.f(xVar);
        l1 l1Var5 = (l1) xVar.f15951b;
        l1Var5.f30269l.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        i1 i1Var4 = l1Var5.f30266h;
        l1.k(i1Var4);
        i1Var4.L(new uz(xVar, jElapsedRealtime2));
    }

    public void n(v0 v0Var, Bundle bundle) {
        r2 r2Var;
        u2 u2Var = ((l1) ((k2) this.f14842c).f15951b).f30270m;
        l1.i(u2Var);
        if (!((l1) u2Var.f15951b).f30263e.Q() || bundle == null || (r2Var = (r2) u2Var.f30447g.get(Integer.valueOf(v0Var.f14012b))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", r2Var.f30387c);
        bundle2.putString("name", r2Var.f30385a);
        bundle2.putString("referrer_name", r2Var.f30386b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f14841b) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new a0.d(14, this, intent));
                    }
                    break;
                }
                break;
            default:
                j(v0.a(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f14841b) {
            case 0:
                break;
            default:
                k(v0.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f14841b) {
            case 0:
                break;
            default:
                l(v0.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f14841b) {
            case 0:
                break;
            default:
                m(v0.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f14841b) {
            case 0:
                break;
            default:
                n(v0.a(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.f14841b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.f14841b;
    }

    public j() {
        this.f14841b = 0;
        this.f14842c = new ArrayDeque(10);
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
