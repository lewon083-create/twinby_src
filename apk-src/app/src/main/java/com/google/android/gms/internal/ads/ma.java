package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ma extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f7823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final la f7824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cb f7825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f7826e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ox0 f7827f;

    public ma(PriorityBlockingQueue priorityBlockingQueue, ut utVar, cb cbVar, ox0 ox0Var) {
        this.f7823b = priorityBlockingQueue;
        this.f7824c = utVar;
        this.f7825d = cbVar;
        this.f7827f = ox0Var;
    }

    public final void a() {
        ox0 ox0Var = this.f7827f;
        qa qaVar = (qa) this.f7823b.take();
        SystemClock.elapsedRealtime();
        qaVar.c();
        try {
            try {
                qaVar.a("network-queue-take");
                synchronized (qaVar.f9376f) {
                }
                TrafficStats.setThreadStatsTag(qaVar.f9375e);
                oa oaVarA = this.f7824c.a(qaVar);
                qaVar.a("network-http-complete");
                if (oaVarA.f8648e && qaVar.g()) {
                    qaVar.b("not-modified");
                    qaVar.k();
                } else {
                    b7 b7VarH = qaVar.h(oaVarA);
                    qaVar.a("network-parse-complete");
                    ga gaVar = (ga) b7VarH.f3659d;
                    if (gaVar != null) {
                        this.f7825d.b(qaVar.d(), gaVar);
                        qaVar.a("network-cache-written");
                    }
                    synchronized (qaVar.f9376f) {
                        qaVar.f9379j = true;
                    }
                    ox0Var.g(qaVar, b7VarH, null);
                    qaVar.j(b7VarH);
                }
            } catch (ua e3) {
                SystemClock.elapsedRealtime();
                ox0Var.getClass();
                qaVar.a("post-error");
                ((ja) ox0Var.f8851c).f6765c.post(new d1(qaVar, new b7(e3), (Object) null, 1));
                qaVar.k();
            } catch (Exception e7) {
                Log.e("Volley", xa.d("Unhandled exception %s", e7.toString()), e7);
                ua uaVar = new ua(e7);
                SystemClock.elapsedRealtime();
                ox0Var.getClass();
                qaVar.a("post-error");
                ((ja) ox0Var.f8851c).f6765c.post(new d1(qaVar, new b7(uaVar), (Object) null, 1));
                qaVar.k();
            }
            qaVar.c();
        } catch (Throwable th2) {
            qaVar.c();
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
                if (this.f7826e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                xa.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
