package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 implements h90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f6857h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f6858j;

    public ji0(u9.a aVar, jx jxVar, xp0 xp0Var, sz szVar, iq0 iq0Var, boolean z5, xo xoVar, ph0 ph0Var, sd0 sd0Var) {
        this.f6852c = aVar;
        this.f6853d = jxVar;
        this.f6854e = xp0Var;
        this.f6855f = szVar;
        this.f6856g = iq0Var;
        this.f6851b = z5;
        this.f6857h = xoVar;
        this.i = ph0Var;
        this.f6858j = sd0Var;
    }

    public ii.m a() {
        if (((ni.w) this.f6854e) == null) {
            this.f6854e = new ni.w(this);
        }
        ni.w wVar = (ni.w) this.f6854e;
        Intrinsics.b(wVar);
        return wVar;
    }

    public Display b() {
        Context context = (Context) this.f6857h;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || activity.isDestroyed()) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 30 ? activity.getDisplay() : ((WindowManager) activity.getSystemService("window")).getDefaultDisplay();
    }

    public androidx.lifecycle.u c() {
        Object obj = (Context) this.f6857h;
        if (obj instanceof androidx.lifecycle.u) {
            return (androidx.lifecycle.u) obj;
        }
        if (obj instanceof Activity) {
            return new ni.i1((Activity) obj);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    @Override // com.google.android.gms.internal.ads.h90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(boolean r19, android.content.Context r20, com.google.android.gms.internal.ads.o60 r21) {
        /*
            r18 = this;
            r1 = r18
            java.lang.Object r0 = r1.f6856g
            com.google.android.gms.internal.ads.iq0 r0 = (com.google.android.gms.internal.ads.iq0) r0
            java.lang.Object r2 = r1.f6857h
            com.google.android.gms.internal.ads.xo r2 = (com.google.android.gms.internal.ads.xo) r2
            java.lang.Object r3 = r1.f6853d
            com.google.android.gms.internal.ads.jx r3 = (com.google.android.gms.internal.ads.jx) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.vv.M(r3)
            com.google.android.gms.internal.ads.o10 r3 = (com.google.android.gms.internal.ads.o10) r3
            java.lang.Object r4 = r1.f6855f
            r7 = r4
            com.google.android.gms.internal.ads.sz r7 = (com.google.android.gms.internal.ads.sz) r7
            r4 = 1
            r7.q1(r4)
            p9.f r8 = new p9.f
            boolean r5 = r1.f6851b
            if (r5 == 0) goto L29
            boolean r6 = r2.a(r4)
            r9 = r6
            goto L2a
        L29:
            r9 = r4
        L2a:
            r6 = 0
            if (r5 == 0) goto L35
            monitor-enter(r2)
            boolean r10 = r2.f12217b     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            if (r10 == 0) goto L35
            r11 = r4
            goto L3a
        L35:
            r11 = r6
            goto L3a
        L37:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3a:
            if (r5 == 0) goto L45
            monitor-enter(r2)
            float r5 = r2.f12218c     // Catch: java.lang.Throwable -> L42
            monitor-exit(r2)
        L40:
            r12 = r5
            goto L47
        L42:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
            throw r0
        L45:
            r5 = 0
            goto L40
        L47:
            java.lang.Object r2 = r1.f6854e
            com.google.android.gms.internal.ads.xp0 r2 = (com.google.android.gms.internal.ads.xp0) r2
            boolean r14 = r2.O
            r15 = 0
            r10 = 1
            r13 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            if (r21 == 0) goto L59
            r21.F1()
        L59:
            p9.k r5 = p9.k.C
            ob.z r5 = r5.f31296b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.ls1 r3 = r3.A
            java.lang.Object r3 = r3.j()
            r6 = r3
            com.google.android.gms.internal.ads.f90 r6 = (com.google.android.gms.internal.ads.f90) r6
            int r3 = r2.Q
            r9 = -1
            if (r3 == r9) goto L6e
            goto L82
        L6e:
            q9.j3 r9 = r0.f6578k
            if (r9 == 0) goto L7d
            int r9 = r9.f31916b
            if (r9 != r4) goto L78
            r3 = 7
            goto L82
        L78:
            r10 = 2
            if (r9 != r10) goto L7d
            r3 = 6
            goto L82
        L7d:
            java.lang.String r9 = "Error setting app open orientation; no targeting orientation available."
            u9.i.c(r9)
        L82:
            java.lang.Object r9 = r1.f6852c
            u9.a r9 = (u9.a) r9
            java.lang.String r10 = r2.B
            com.google.android.gms.internal.ads.bq0 r11 = r2.f12260s
            java.lang.String r12 = r11.f3853b
            java.lang.String r13 = r11.f3852a
            boolean r2 = r2.b()
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r1.i
            com.google.android.gms.internal.ads.ph0 r2 = (com.google.android.gms.internal.ads.ph0) r2
        L98:
            r16 = r2
            goto L9d
        L9b:
            r2 = 0
            goto L98
        L9d:
            java.lang.String r14 = r0.f6575g
            java.lang.String r17 = r7.q()
            r15 = r21
            r11 = r8
            r8 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r0 = r1.f6858j
            com.google.android.gms.internal.ads.sd0 r0 = (com.google.android.gms.internal.ads.sd0) r0
            r2 = r20
            ob.z.a(r2, r5, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ji0.d(boolean, android.content.Context, com.google.android.gms.internal.ads.o60):void");
    }

    public ni.c e() {
        return new ni.c(this, 1);
    }

    public ni.f f() {
        return new ni.f(this, 1);
    }

    public ni.m g() {
        return new ni.m(this, 5);
    }

    public ni.f h() {
        return new ni.f(this, 3);
    }

    public ni.g i() {
        return new ni.g(this, 6);
    }

    @Override // com.google.android.gms.internal.ads.h90
    public xp0 j() {
        return (xp0) this.f6854e;
    }

    public ni.g k() {
        return new ni.g(this, 9);
    }

    public void l(ni.h1 h1Var) {
        Context context = (Context) this.f6857h;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(h1Var);
        } else {
            new Handler(Looper.getMainLooper()).post(h1Var);
        }
    }

    public ji0(ii.f binaryMessenger, Context context, io.flutter.embedding.engine.renderer.j jVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        this.f6852c = binaryMessenger;
        m4.d finalizationListener = new m4.d(new ni.t(binaryMessenger));
        Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
        this.f6853d = new fj.c(finalizationListener);
        fd.b bVar = new fd.b();
        bVar.f16748a = false;
        this.f6855f = bVar;
        this.f6857h = context;
        this.f6856g = jVar;
    }
}
