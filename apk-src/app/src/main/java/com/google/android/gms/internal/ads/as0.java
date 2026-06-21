package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class as0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bs0 f3369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3370d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public cw f3373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q9.x1 f3374h;
    public ScheduledFuture i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3368b = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3375j = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3371e = 2;

    public as0(bs0 bs0Var) {
        this.f3369c = bs0Var;
    }

    public final synchronized void a(xr0 xr0Var) {
        try {
            if (((Boolean) vl.f11414c.r()).booleanValue()) {
                ArrayList arrayList = this.f3368b;
                xr0Var.l();
                arrayList.add(xr0Var);
                ScheduledFuture scheduledFuture = this.i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.i = hx.f6282d.schedule(this, ((Integer) q9.s.f31967e.f31970c.a(al.S9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) vl.f11414c.r()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains("BANNER")) {
                    this.f3375j = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains("INTERSTITIAL")) {
                    this.f3375j = 4;
                } else if (arrayList.contains("native") || arrayList.contains("NATIVE")) {
                    this.f3375j = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains("REWARDED")) {
                    this.f3375j = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f3375j = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                    this.f3375j = 6;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(String str) {
        boolean zMatches;
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) q9.s.f31967e.f31970c.a(al.T9), str);
            }
            if (zMatches) {
                this.f3370d = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            this.f3371e = hl.l.y(bundle);
        }
    }

    public final synchronized void e(cw cwVar) {
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            this.f3373g = cwVar;
        }
    }

    public final synchronized void f(q9.x1 x1Var) {
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            this.f3374h = x1Var;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            this.f3372f = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) vl.f11414c.r()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList<xr0> arrayList = this.f3368b;
                for (xr0 xr0Var : arrayList) {
                    int i = this.f3375j;
                    if (i != 2) {
                        xr0Var.o(i);
                    }
                    if (!TextUtils.isEmpty(this.f3370d)) {
                        xr0Var.D(this.f3370d);
                    }
                    if (!TextUtils.isEmpty(this.f3372f) && !xr0Var.e()) {
                        xr0Var.v0(this.f3372f);
                    }
                    cw cwVar = this.f3373g;
                    if (cwVar != null) {
                        xr0Var.m(cwVar);
                    } else {
                        q9.x1 x1Var = this.f3374h;
                        if (x1Var != null) {
                            xr0Var.n(x1Var);
                        }
                    }
                    xr0Var.t(this.f3371e);
                    this.f3369c.b(xr0Var.p());
                }
                arrayList.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            this.f3375j = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
