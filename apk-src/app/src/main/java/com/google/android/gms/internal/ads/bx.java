package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3940a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9.e0 f3941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx f3942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f3944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u9.a f3945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.gms.internal.consent_sdk.c f3947h;
    public sd0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f3948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f3949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f3950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ax f3951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f3952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ed.d f3953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f3954p;

    public bx() {
        t9.e0 e0Var = new t9.e0();
        this.f3941b = e0Var;
        this.f3942c = new dx(q9.r.f31959g.f31965f, e0Var);
        this.f3943d = false;
        this.f3947h = null;
        this.i = null;
        this.f3948j = null;
        this.f3949k = new AtomicInteger(0);
        this.f3950l = new AtomicInteger(0);
        this.f3951m = new ax();
        this.f3952n = new Object();
        this.f3954p = new AtomicBoolean();
    }

    public final com.google.android.gms.internal.consent_sdk.c a() {
        com.google.android.gms.internal.consent_sdk.c cVar;
        synchronized (this.f3940a) {
            cVar = this.f3947h;
        }
        return cVar;
    }

    public final void b(Context context, u9.a aVar, sd0 sd0Var) {
        com.google.android.gms.internal.consent_sdk.c cVar;
        synchronized (this.f3940a) {
            try {
                if (!this.f3943d) {
                    this.f3944e = context.getApplicationContext();
                    this.f3945f = aVar;
                    p9.k.C.f31301g.v(this.f3942c);
                    this.f3941b.k(this.f3944e);
                    xt.b(this.f3944e, this.f3945f);
                    this.i = sd0Var;
                    wk wkVar = al.f3223u2;
                    q9.s sVar = q9.s.f31967e;
                    if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                        cVar = new com.google.android.gms.internal.consent_sdk.c();
                    } else {
                        t9.c0.m("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        cVar = null;
                    }
                    this.f3947h = cVar;
                    if (cVar != null) {
                        ix.m(new zw(this).B(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f3944e;
                    if (ua.b.h()) {
                        if (((Boolean) sVar.f31970c.a(al.f3287y9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new bf(this));
                            } catch (RuntimeException e3) {
                                u9.i.i("Failed to register network callback", e3);
                                this.f3954p.set(true);
                            }
                        }
                    }
                    this.f3943d = true;
                    h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3008ff)).booleanValue()) {
            return;
        }
        p9.k.C.f31297c.F(context, aVar.f34365b);
    }

    public final Resources c() {
        if (this.f3945f.f34368e) {
            return this.f3944e.getResources();
        }
        try {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.ec)).booleanValue()) {
                return u9.i.b(this.f3944e).f36586a.getResources();
            }
            u9.i.b(this.f3944e).f36586a.getResources();
            return null;
        } catch (u9.j e3) {
            u9.i.i("Cannot load resource from dynamite apk or local jar", e3);
            return null;
        }
    }

    public final void d(String str, Throwable th2) {
        xt.b(this.f3944e, this.f3945f).c(str, th2);
    }

    public final void e(String str, Throwable th2) {
        xt.b(this.f3944e, this.f3945f).d(th2, str, ((Double) km.f7262f.r()).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002d, B:13:0x0037, B:14:0x0040), top: B:19:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f3944e
            u9.a r1 = r6.f3945f
            java.lang.Object r2 = com.google.android.gms.internal.ads.xt.f12307m
            monitor-enter(r2)
            com.google.android.gms.internal.ads.yt r3 = com.google.android.gms.internal.ads.xt.f12309o     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L40
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.internal.ads.al.f3301z8     // Catch: java.lang.Throwable -> L35
            q9.s r4 = q9.s.f31967e     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.yk r5 = r4.f31970c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r5.a(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L37
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.internal.ads.al.f3286y8     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.yk r4 = r4.f31970c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L37
            com.google.android.gms.internal.ads.xt r3 = new com.google.android.gms.internal.ads.xt     // Catch: java.lang.Throwable -> L35
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.xt.f12309o = r3     // Catch: java.lang.Throwable -> L35
            goto L40
        L35:
            r7 = move-exception
            goto L47
        L37:
            com.google.android.gms.internal.ads.fp r0 = new com.google.android.gms.internal.ads.fp     // Catch: java.lang.Throwable -> L35
            r1 = 12
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.xt.f12309o = r0     // Catch: java.lang.Throwable -> L35
        L40:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.yt r0 = com.google.android.gms.internal.ads.xt.f12309o
            r0.c(r7, r8)
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bx.f(java.lang.String, java.lang.Throwable):void");
    }

    public final t9.e0 g() {
        t9.e0 e0Var;
        synchronized (this.f3940a) {
            e0Var = this.f3941b;
        }
        return e0Var;
    }

    public final ed.d h() {
        if (this.f3944e != null) {
            if (!((Boolean) q9.s.f31967e.f31970c.a(al.A3)).booleanValue()) {
                synchronized (this.f3952n) {
                    try {
                        ed.d dVar = this.f3953o;
                        if (dVar != null) {
                            return dVar;
                        }
                        ed.d dVarB = hx.f6279a.b(new ze(1, this));
                        this.f3953o = dVarB;
                        return dVarB;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return vv.d(new ArrayList());
    }

    public final boolean i(Context context) {
        if (ua.b.h()) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3287y9)).booleanValue()) {
                return this.f3954p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
