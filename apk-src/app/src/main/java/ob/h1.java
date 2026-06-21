package ob;

import android.os.Process;
import io.sentry.TransactionOptions;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue f30166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30167d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f30168e;

    public h1(i1 i1Var, String str, BlockingQueue blockingQueue) {
        this.f30168e = i1Var;
        pa.c0.i(blockingQueue);
        this.f30165b = new Object();
        this.f30166c = blockingQueue;
        setName(str);
    }

    public final void a() {
        i1 i1Var = this.f30168e;
        synchronized (i1Var.f30186j) {
            try {
                if (!this.f30167d) {
                    i1Var.f30187k.release();
                    i1Var.f30186j.notifyAll();
                    if (this == i1Var.f30181d) {
                        i1Var.f30181d = null;
                    } else if (this == i1Var.f30182e) {
                        i1Var.f30182e = null;
                    } else {
                        s0 s0Var = ((l1) i1Var.f15951b).f30265g;
                        l1.k(s0Var);
                        s0Var.f30411g.f("Current scheduler thread is neither worker nor network");
                    }
                    this.f30167d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z5 = false;
        while (!z5) {
            try {
                this.f30168e.f30187k.acquire();
                z5 = true;
            } catch (InterruptedException e3) {
                s0 s0Var = ((l1) this.f30168e.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30413j.g(e3, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f30166c;
                g1 g1Var = (g1) blockingQueue.poll();
                if (g1Var != null) {
                    Process.setThreadPriority(true != g1Var.f30125c ? 10 : threadPriority);
                    g1Var.run();
                } else {
                    Object obj = this.f30165b;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f30168e.getClass();
                            try {
                                obj.wait(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION);
                            } catch (InterruptedException e7) {
                                s0 s0Var2 = ((l1) this.f30168e.f15951b).f30265g;
                                l1.k(s0Var2);
                                s0Var2.f30413j.g(e7, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f30168e.f30186j) {
                        if (this.f30166c.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
