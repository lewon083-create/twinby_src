package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q50 implements i60, m80, w70, p60, fh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q60 f9336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i70 f9337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xp0 f9338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f9339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f9340f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledFuture f9342h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f9343j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y81 f9341g = new y81();
    public final AtomicBoolean i = new AtomicBoolean();

    public q50(q60 q60Var, xp0 xp0Var, ScheduledExecutorService scheduledExecutorService, gx gxVar, String str, i70 i70Var) {
        this.f9336b = q60Var;
        this.f9338d = xp0Var;
        this.f9339e = scheduledExecutorService;
        this.f9340f = gxVar;
        this.f9343j = str;
        this.f9337c = i70Var;
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final void I(eh ehVar) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Ic)).booleanValue() && this.f9343j.equals("com.google.ads.mediation.admob.AdMobAdapter") && ehVar.f4951j && this.i.compareAndSet(false, true) && this.f9338d.f12235e != 3) {
            t9.c0.m("Full screen 1px impression occurred");
            this.f9336b.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void N() {
        xp0 xp0Var = this.f9338d;
        if (xp0Var.f12235e == 3) {
            return;
        }
        int i = xp0Var.Y;
        if (i == 0 || i == 1) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Ic)).booleanValue() && this.f9343j.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f9336b.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.w70
    public final synchronized void g() {
        if (this.f9338d.f12235e == 4) {
            this.f9336b.a();
            return;
        }
        y81 y81Var = this.f9341g;
        if (y81Var.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f9342h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        y81Var.e(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final synchronized void j(q9.x1 x1Var) {
        try {
            y81 y81Var = this.f9341g;
            if (y81Var.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f9342h;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            y81Var.f(new Exception());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void k() {
        xp0 xp0Var = this.f9338d;
        int i = xp0Var.f12235e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.f9337c.a();
            return;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.T1)).booleanValue() && xp0Var.Y == 2) {
            int i10 = xp0Var.f12256q;
            if (i10 == 0) {
                this.f9336b.a();
                return;
            }
            cf cfVar = new cf(17, this);
            y81 y81Var = this.f9341g;
            y81Var.a(new l81(0, y81Var, cfVar), this.f9340f);
            this.f9342h = this.f9339e.schedule(new h30(4, this), i10, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void H() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.w70
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void F(ru ruVar, String str, String str2) {
    }
}
