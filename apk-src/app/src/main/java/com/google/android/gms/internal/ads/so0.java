package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f10356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n10 f10357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uk0 f10358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wk0 f10359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f10360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gl f10361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n70 f10362h;
    public final bs0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y70 f10363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final hq0 f10364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public or0 f10365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q9.x1 f10367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public al0 f10368o;

    public so0(Context context, Executor executor, q9.g3 g3Var, n10 n10Var, uk0 uk0Var, wk0 wk0Var, hq0 hq0Var, y70 y70Var) {
        this.f10355a = context;
        this.f10356b = executor;
        this.f10357c = n10Var;
        this.f10358d = uk0Var;
        this.f10359e = wk0Var;
        this.f10364k = hq0Var;
        this.f10362h = new n70((ScheduledExecutorService) n10Var.f8108d.j(), (ua.a) n10Var.f8112f.j(), (sd0) n10Var.f8118j.j());
        this.i = n10Var.c();
        this.f10360f = new FrameLayout(context);
        this.f10363j = y70Var;
        hq0Var.f6213b = g3Var;
        this.f10366m = true;
        this.f10367n = null;
        this.f10368o = null;
    }

    public final boolean a(q9.d3 d3Var, String str, gr grVar, al0 al0Var) {
        boolean z5;
        s10 s10Var;
        Executor executor = this.f10356b;
        if (str == null) {
            u9.i.e("Ad unit ID should not be null for banner ad.");
            executor.execute(new h30(23, this));
            return false;
        }
        boolean zB = b();
        hq0 hq0Var = this.f10364k;
        if (!zB) {
            wk wkVar = al.Q2;
            q9.s sVar = q9.s.f31967e;
            yk ykVar = sVar.f31970c;
            yk ykVar2 = sVar.f31970c;
            if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
                q9.r.a();
            }
            boolean zBooleanValue = ((Boolean) ykVar2.a(al.fa)).booleanValue();
            n10 n10Var = this.f10357c;
            if (zBooleanValue && d3Var.f31806g) {
                ((ff0) n10Var.f8149z.j()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(d3Var.A));
            p9.k.C.f31304k.getClass();
            Bundle bundleN = gr.n(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            hq0Var.f6214c = str;
            hq0Var.f6212a = d3Var;
            hq0Var.f6230t = bundleN;
            iq0 iq0VarA = hq0Var.a();
            int iP = fs1.P(iq0VarA);
            Context context = this.f10355a;
            xr0 xr0VarI = xr0.i(context, iP, 3, d3Var);
            boolean zBooleanValue2 = ((Boolean) hm.f6182e.r()).booleanValue();
            uk0 uk0Var = this.f10358d;
            as0 as0Var = null;
            if (!zBooleanValue2 || !hq0Var.f6213b.f31884l) {
                boolean zBooleanValue3 = ((Boolean) ykVar2.a(al.f3096l9)).booleanValue();
                FrameLayout frameLayout = this.f10360f;
                y70 y70Var = this.f10363j;
                n70 n70Var = this.f10362h;
                if (zBooleanValue3) {
                    n10 n10Var2 = n10Var.f8104b;
                    a60 a60Var = new a60();
                    a60Var.f2786a = context;
                    a60Var.f2787b = iq0VarA;
                    a60 a60Var2 = new a60(a60Var);
                    f80 f80Var = new f80();
                    f80Var.d(uk0Var, executor);
                    f80Var.b(uk0Var, executor);
                    g80 g80Var = new g80(f80Var);
                    gk0 gk0Var = new gk0(0, this.f10361g);
                    z5 = true;
                    s10Var = new s10(n10Var2, new cf(16, frameLayout), new n90(0, na0.f8250h, as0Var), new l80(16), g80Var, a60Var2, new gk0(26), gk0Var, new n90(8, n70Var, y70Var), null, null);
                } else {
                    z5 = true;
                    n10 n10Var3 = n10Var.f8104b;
                    a60 a60Var3 = new a60();
                    a60Var3.f2786a = context;
                    a60Var3.f2787b = iq0VarA;
                    a60 a60Var4 = new a60(a60Var3);
                    f80 f80Var2 = new f80();
                    HashSet hashSet = (HashSet) f80Var2.f5260c;
                    f80Var2.d(uk0Var, executor);
                    hashSet.add(new s80(uk0Var, executor));
                    hashSet.add(new s80(this.f10359e, executor));
                    f80Var2.c(uk0Var, executor);
                    ((HashSet) f80Var2.f5263f).add(new s80(uk0Var, executor));
                    ((HashSet) f80Var2.f5262e).add(new s80(uk0Var, executor));
                    ((HashSet) f80Var2.f5265h).add(new s80(uk0Var, executor));
                    f80Var2.a(uk0Var, executor);
                    f80Var2.b(uk0Var, executor);
                    ((HashSet) f80Var2.f5269m).add(new s80(uk0Var, executor));
                    g80 g80Var2 = new g80(f80Var2);
                    gk0 gk0Var2 = new gk0(0, this.f10361g);
                    s10Var = new s10(n10Var3, new cf(16, frameLayout), new n90(0, na0.f8250h, as0Var), new l80(16), g80Var2, a60Var4, new gk0(26), gk0Var2, new n90(8, n70Var, y70Var), null, null);
                }
                if (((Boolean) vl.f11414c.r()).booleanValue()) {
                    as0Var = (as0) s10Var.f10140l.j();
                    as0Var.i(3);
                    as0Var.c(d3Var.f31815q);
                    as0Var.d(d3Var.f31812n);
                }
                this.f10368o = al0Var;
                b50 b50Var = (b50) s10Var.f10147s.j();
                or0 or0VarC = b50Var.c(b50Var.b());
                this.f10365l = or0VarC;
                or0VarC.a(new l81(0, or0VarC, new cw(this, as0Var, xr0VarI, s10Var, 19)), executor);
                return z5;
            }
            if (uk0Var != null) {
                uk0Var.K(vv.C(7, null, null));
            }
        } else if (!hq0Var.f6226p) {
            this.f10366m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        or0 or0Var = this.f10365l;
        return (or0Var == null || or0Var.f8767d.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                or0 or0Var = this.f10365l;
                if (or0Var != null && or0Var.f8767d.isDone()) {
                    try {
                        x30 x30Var = (x30) this.f10365l.f8767d.get();
                        this.f10365l = null;
                        FrameLayout frameLayout = this.f10360f;
                        frameLayout.removeAllViews();
                        x30Var.getClass();
                        ViewParent parent = x30Var.f11995m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = x30Var.f9701f.f4843b;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 78);
                            sb2.append("Banner view provided from ");
                            sb2.append(str);
                            sb2.append(" already has a parent view. Removing its old parent.");
                            u9.i.h(sb2.toString());
                            ((ViewGroup) parent).removeView(x30Var.f11995m);
                        }
                        wk wkVar = al.f3096l9;
                        q9.s sVar = q9.s.f31967e;
                        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                            kx0 kx0Var = x30Var.f9702g.f10189b;
                            uk0 uk0Var = this.f10358d;
                            s70 s70Var = (s70) kx0Var.f7326c;
                            s70Var.f10190c = uk0Var;
                            s70Var.f10191d = this.f10359e;
                        }
                        frameLayout.addView(x30Var.f11995m);
                        al0 al0Var = this.f10368o;
                        if (al0Var != null) {
                            al0Var.r(x30Var);
                        }
                        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                            Executor executor = this.f10356b;
                            uk0 uk0Var2 = this.f10358d;
                            Objects.requireNonNull(uk0Var2);
                            executor.execute(new h30(24, uk0Var2));
                        }
                        int i = ((zp0) x30Var.f9696a.f5033b.f4348d).f13058d;
                        if (i >= 0) {
                            this.f10366m = false;
                            n70 n70Var = this.f10362h;
                            n70Var.F1(i);
                            n70Var.G1(x30Var.d());
                        } else {
                            this.f10366m = true;
                            this.f10362h.F1(x30Var.d());
                        }
                    } catch (InterruptedException e3) {
                        e = e3;
                        e();
                        t9.c0.n("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f10366m = true;
                        this.f10362h.h();
                    } catch (ExecutionException e7) {
                        e = e7;
                        e();
                        t9.c0.n("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f10366m = true;
                        this.f10362h.h();
                    }
                } else if (this.f10365l != null) {
                    t9.c0.m("Show timer went off but there is an ongoing ad request.");
                    this.f10366m = true;
                } else {
                    t9.c0.m("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f10366m = true;
                    this.f10362h.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d() {
        Object parent = this.f10360f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        t9.g0 g0Var = p9.k.C.f31297c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return t9.g0.s(view, powerManager, keyguardManager);
    }

    public final void e() {
        this.f10365l = null;
        q9.x1 x1Var = this.f10367n;
        this.f10367n = null;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3096l9)).booleanValue() && x1Var != null) {
            this.f10356b.execute(new th0(6, this, x1Var));
        }
        al0 al0Var = this.f10368o;
        if (al0Var != null) {
            al0Var.mo4h();
        }
    }
}
