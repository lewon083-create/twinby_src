package yads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d82 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f37666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo f37667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mr f37668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dq2 f37669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f37670f = false;

    public d82(PriorityBlockingQueue priorityBlockingQueue, xo xoVar, mr mrVar, dq2 dq2Var) {
        this.f37666b = priorityBlockingQueue;
        this.f37667c = xoVar;
        this.f37668d = mrVar;
        this.f37669e = dq2Var;
    }

    private void a() {
        ro2 ro2Var = (ro2) this.f37666b.take();
        SystemClock.elapsedRealtime();
        ro2Var.a(3);
        try {
            try {
                ro2Var.a("network-queue-take");
                if (ro2Var.i()) {
                    ro2Var.c("network-discard-cancelled");
                    ro2Var.j();
                } else {
                    TrafficStats.setThreadStatsTag(ro2Var.f42661e);
                    h82 h82VarA = this.f37667c.a(ro2Var);
                    ro2Var.a("network-http-complete");
                    if (h82VarA.f39073e && ro2Var.h()) {
                        ro2Var.c("not-modified");
                        ro2Var.j();
                    } else {
                        xp2 xp2VarA = ro2Var.a(h82VarA);
                        ro2Var.a("network-parse-complete");
                        if (ro2Var.f42665j && xp2VarA.f44787b != null) {
                            this.f37668d.a(ro2Var.c(), xp2VarA.f44787b);
                            ro2Var.a("network-cache-written");
                        }
                        synchronized (ro2Var.f42662f) {
                            ro2Var.f42667l = true;
                        }
                        ((hn0) this.f37669e).a(ro2Var, xp2VarA, null);
                        ro2Var.a(xp2VarA);
                    }
                }
            } catch (lm3 e3) {
                SystemClock.elapsedRealtime();
                lm3 lm3VarA = ro2Var.a(e3);
                hn0 hn0Var = (hn0) this.f37669e;
                hn0Var.getClass();
                ro2Var.a("post-error");
                xp2 xp2Var = new xp2(lm3VarA);
                fn0 fn0Var = hn0Var.f39250a;
                fn0Var.f38493a.post(new gn0(ro2Var, xp2Var, null));
                ro2Var.j();
            } catch (Exception e7) {
                boolean z5 = om3.f41652a;
                lm3 lm3Var = new lm3(e7);
                SystemClock.elapsedRealtime();
                hn0 hn0Var2 = (hn0) this.f37669e;
                hn0Var2.getClass();
                ro2Var.a("post-error");
                xp2 xp2Var2 = new xp2(lm3Var);
                fn0 fn0Var2 = hn0Var2.f39250a;
                fn0Var2.f38493a.post(new gn0(ro2Var, xp2Var2, null));
                ro2Var.j();
            }
            ro2Var.a(4);
        } catch (Throwable th2) {
            ro2Var.a(4);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f37670f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                boolean z5 = om3.f41652a;
            } catch (Throwable unused2) {
                boolean z10 = om3.f41652a;
                return;
            }
        }
    }
}
