package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w1 f14196d = new w1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w1 f14197e = new w1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f14198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f14199c;

    public g2(h2 h2Var, Callable callable) {
        this.f14199c = h2Var;
        callable.getClass();
        this.f14198b = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        v1 v1Var = null;
        boolean z5 = false;
        int i = 0;
        while (true) {
            boolean z10 = runnable instanceof v1;
            w1 w1Var = f14197e;
            if (!z10) {
                if (runnable != w1Var) {
                    break;
                }
            } else {
                v1Var = (v1) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == w1Var || compareAndSet(runnable, w1Var)) {
                z5 = Thread.interrupted() || z5;
                LockSupport.park(v1Var);
            }
            runnable = (Runnable) get();
        }
        if (z5) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            h2 h2Var = this.f14199c;
            boolean zIsDone = h2Var.isDone();
            w1 w1Var = f14196d;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.f14198b.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, w1Var)) {
                            a(threadCurrentThread);
                        }
                        h2Var.e(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, w1Var)) {
                            a(threadCurrentThread);
                        }
                        if (n1.f14250g.E(h2Var, null, n1.f14251h)) {
                            n1.h(h2Var);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, w1Var)) {
                a(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            if (objCall == null) {
                objCall = n1.f14251h;
            }
            if (n1.f14250g.E(h2Var, null, objCall)) {
                n1.h(h2Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return gf.a.k(runnable == f14196d ? "running=[DONE]" : runnable instanceof v1 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? pe.a.f("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.f14198b.toString());
    }
}
