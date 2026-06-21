package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0596x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0621y0 f24993a;

    public RunnableC0596x0(C0621y0 c0621y0) {
        this.f24993a = c0621y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0071c4.l().f23537c.a().executeDelayed(new RunnableC0572w1(this.f24993a.f25058a), TimeUnit.SECONDS.toMillis(5L));
    }
}
