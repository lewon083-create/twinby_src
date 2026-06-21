package ob;

import com.google.android.gms.internal.ads.ur;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends s1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicLong f30180l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f30181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h1 f30182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PriorityBlockingQueue f30183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedBlockingQueue f30184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1 f30185h;
    public final f1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f30186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Semaphore f30187k;

    public i1(l1 l1Var) {
        super(l1Var);
        this.f30186j = new Object();
        this.f30187k = new Semaphore(2);
        this.f30183f = new PriorityBlockingQueue();
        this.f30184g = new LinkedBlockingQueue();
        this.f30185h = new f1(this, "Thread death: Uncaught exception on worker thread");
        this.i = new f1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // e1.d0
    public final void C() {
        if (Thread.currentThread() != this.f30181d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // ob.s1
    public final boolean D() {
        return false;
    }

    public final void G() {
        if (Thread.currentThread() != this.f30182e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void H() {
        if (Thread.currentThread() == this.f30181d) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean I() {
        return Thread.currentThread() == this.f30181d;
    }

    public final g1 J(Callable callable) {
        E();
        g1 g1Var = new g1(this, callable, false);
        if (Thread.currentThread() != this.f30181d) {
            P(g1Var);
            return g1Var;
        }
        if (!this.f30183f.isEmpty()) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.f("Callable skipped the worker queue.");
        }
        g1Var.run();
        return g1Var;
    }

    public final g1 K(Callable callable) {
        E();
        g1 g1Var = new g1(this, callable, true);
        if (Thread.currentThread() == this.f30181d) {
            g1Var.run();
            return g1Var;
        }
        P(g1Var);
        return g1Var;
    }

    public final void L(Runnable runnable) {
        E();
        pa.c0.i(runnable);
        P(new g1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object M(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            i1 i1Var = ((l1) this.f15951b).f30266h;
            l1.k(i1Var);
            i1Var.L(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                s0 s0Var = ((l1) this.f15951b).f30265g;
                l1.k(s0Var);
                ur urVar = s0Var.f30413j;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                urVar.f(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            s0 s0Var2 = ((l1) this.f15951b).f30265g;
            l1.k(s0Var2);
            s0Var2.f30413j.f("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void N(Runnable runnable) {
        E();
        P(new g1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void O(Runnable runnable) {
        E();
        g1 g1Var = new g1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f30186j) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f30184g;
                linkedBlockingQueue.add(g1Var);
                h1 h1Var = this.f30182e;
                if (h1Var == null) {
                    h1 h1Var2 = new h1(this, "Measurement Network", linkedBlockingQueue);
                    this.f30182e = h1Var2;
                    h1Var2.setUncaughtExceptionHandler(this.i);
                    this.f30182e.start();
                } else {
                    Object obj = h1Var.f30165b;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void P(g1 g1Var) {
        synchronized (this.f30186j) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f30183f;
                priorityBlockingQueue.add(g1Var);
                h1 h1Var = this.f30181d;
                if (h1Var == null) {
                    h1 h1Var2 = new h1(this, "Measurement Worker", priorityBlockingQueue);
                    this.f30181d = h1Var2;
                    h1Var2.setUncaughtExceptionHandler(this.f30185h);
                    this.f30181d.start();
                } else {
                    Object obj = h1Var.f30165b;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
