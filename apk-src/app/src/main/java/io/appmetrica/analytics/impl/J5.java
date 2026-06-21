package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class J5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f22515b = C0382oa.k().w().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f22516c = C0382oa.k().a();

    public J5(List list) {
        this.f22514a = list;
    }

    public static final void a(J5 j52) {
        Iterator it = j52.f22514a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22516c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f22515b, new he.e(7, this));
    }
}
