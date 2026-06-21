package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends s1 implements RunnableFuture {
    public volatile g2 i;

    public h2(Callable callable) {
        this.i = new g2(this, callable);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final String b() {
        g2 g2Var = this.i;
        return g2Var != null ? pe.a.f("task=[", g2Var.toString(), "]") : super.b();
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final void d() {
        g2 g2Var;
        Object obj = this.f14252b;
        if ((obj instanceof c1) && ((c1) obj).f14149a && (g2Var = this.i) != null) {
            w1 w1Var = g2.f14197e;
            w1 w1Var2 = g2.f14196d;
            Runnable runnable = (Runnable) g2Var.get();
            if (runnable instanceof Thread) {
                v1 v1Var = new v1(g2Var);
                v1Var.setExclusiveOwnerThread(Thread.currentThread());
                if (g2Var.compareAndSet(runnable, v1Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) g2Var.getAndSet(w1Var2)) == w1Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th2) {
                        if (((Runnable) g2Var.getAndSet(w1Var2)) == w1Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th2;
                    }
                }
            }
        }
        this.i = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        g2 g2Var = this.i;
        if (g2Var != null) {
            g2Var.run();
        }
        this.i = null;
    }
}
