package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p81 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ke f8978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ke f8979c;

    static {
        int i = 9;
        f8978b = new ke(i);
        f8979c = new ke(i);
    }

    public abstract Object a();

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        o81 o81Var = null;
        boolean z5 = false;
        int i = 0;
        while (true) {
            boolean z10 = runnable instanceof o81;
            ke keVar = f8979c;
            if (!z10) {
                if (runnable != keVar) {
                    break;
                }
            } else {
                o81Var = (o81) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == keVar || compareAndSet(runnable, keVar)) {
                z5 = Thread.interrupted() || z5;
                LockSupport.park(o81Var);
            }
            runnable = (Runnable) get();
        }
        if (z5) {
            thread.interrupt();
        }
    }

    public abstract String c();

    public abstract boolean d();

    public abstract void e(Object obj);

    public abstract void f(Throwable th2);

    public final void g() {
        ke keVar = f8979c;
        ke keVar2 = f8978b;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            o81 o81Var = new o81(this);
            o81Var.a(Thread.currentThread());
            if (compareAndSet(runnable, o81Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(keVar2)) == keVar) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(keVar2)) == keVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            ke keVar = f8978b;
            if (!zD) {
                try {
                    objA = a();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, keVar)) {
                            b(threadCurrentThread);
                        }
                        f(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, keVar)) {
                            b(threadCurrentThread);
                        }
                        e(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, keVar)) {
                b(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strG;
        Runnable runnable = (Runnable) get();
        if (runnable == f8978b) {
            strG = "running=[DONE]";
        } else if (runnable instanceof o81) {
            strG = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strG = t.z.g(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strG = "running=[NOT STARTED YET]";
        }
        String strC = c();
        return t.z.g(new StringBuilder(strG.length() + 2 + String.valueOf(strC).length()), strG, ", ", strC);
    }
}
