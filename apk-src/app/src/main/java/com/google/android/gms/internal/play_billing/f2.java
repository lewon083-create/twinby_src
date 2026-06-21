package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends s1 {
    public x1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduledFuture f14182j;

    @Override // com.google.android.gms.internal.play_billing.n1
    public final String b() {
        x1 x1Var = this.i;
        ScheduledFuture scheduledFuture = this.f14182j;
        if (x1Var == null) {
            return null;
        }
        String strF = pe.a.f("inputFuture=[", x1Var.toString(), "]");
        if (scheduledFuture == null) {
            return strF;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strF;
        }
        return strF + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final void d() {
        x1 x1Var = this.i;
        if ((x1Var != null) & (this.f14252b instanceof c1)) {
            Object obj = this.f14252b;
            x1Var.cancel((obj instanceof c1) && ((c1) obj).f14149a);
        }
        ScheduledFuture scheduledFuture = this.f14182j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.i = null;
        this.f14182j = null;
    }
}
