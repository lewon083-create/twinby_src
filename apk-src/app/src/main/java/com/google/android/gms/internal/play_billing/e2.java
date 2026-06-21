package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.z81;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f2 f14168b;

    @Override // java.lang.Runnable
    public final void run() {
        x1 x1Var;
        e1 e1Var;
        f2 f2Var = this.f14168b;
        if (f2Var == null || (x1Var = f2Var.i) == null) {
            return;
        }
        this.f14168b = null;
        if (x1Var.isDone()) {
            Object obj = f2Var.f14252b;
            if (obj == null) {
                if (x1Var.isDone()) {
                    if (n1.f14250g.E(f2Var, null, n1.f(x1Var))) {
                        n1.h(f2Var);
                        return;
                    }
                    return;
                }
                h1 h1Var = new h1(f2Var, x1Var);
                if (n1.f14250g.E(f2Var, null, h1Var)) {
                    try {
                        x1Var.c(h1Var, r1.f14293b);
                        return;
                    } catch (Throwable th2) {
                        try {
                            e1Var = new e1(th2);
                        } catch (Error | Exception unused) {
                            e1Var = e1.f14166b;
                        }
                        n1.f14250g.E(f2Var, h1Var, e1Var);
                        return;
                    }
                }
                obj = f2Var.f14252b;
            }
            if (obj instanceof c1) {
                x1Var.cancel(((c1) obj).f14149a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = f2Var.f14182j;
            f2Var.f14182j = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th3) {
                    f2Var.e(new z81(str, 1));
                    throw th3;
                }
            }
            f2Var.e(new z81(str + ": " + x1Var.toString(), 1));
        } finally {
            x1Var.cancel(true);
        }
    }
}
