package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o60 extends ip1 implements m60 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f8618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture f8619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8620f;

    public o60(n60 n60Var, Set set, gx gxVar, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f8620f = false;
        this.f8618d = scheduledExecutorService;
        x1(n60Var, gxVar);
    }

    public final void F1() {
        this.f8619e = this.f8618d.schedule(new h30(6, this), ((Integer) q9.s.f31967e.f31970c.a(al.Ub)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void i() {
        A1(fp.f5412h);
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void p0(q9.x1 x1Var) {
        A1(new j60(1, x1Var));
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void y0(g90 g90Var) {
        if (this.f8620f) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f8619e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        A1(new cf(18, g90Var));
    }
}
