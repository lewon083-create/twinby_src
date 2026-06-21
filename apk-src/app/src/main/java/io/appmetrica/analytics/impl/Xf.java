package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Xf implements Vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0109dg f23252a;

    public Xf(C0109dg c0109dg) {
        this.f23252a = c0109dg;
    }

    @Override // io.appmetrica.analytics.impl.Vf
    public final void a() {
        C0109dg c0109dg = this.f23252a;
        Aa aa2 = c0109dg.f23691b;
        Wf wf2 = new Wf(c0109dg);
        aa2.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC0656za(aa2));
            C0382oa.I.f24493d.f24178a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + ThreadFactoryC0659zd.f25117a.incrementAndGet()).start();
            C0338mg c0338mg = (C0338mg) futureTask.get(5L, TimeUnit.SECONDS);
            ko.a(aa2.f22062b);
            C0109dg.a(c0109dg, c0338mg, C0109dg.a(c0109dg));
        } catch (Throwable th2) {
            try {
                wf2.a(th2);
            } finally {
                ko.a(aa2.f22062b);
            }
        }
    }
}
