package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0042b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f23470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f23471b;

    public RunnableC0042b1(C0522u1 c0522u1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f23471b = c0522u1;
        this.f23470a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23471b.f24823a.getClass();
        C0621y0 c0621y0 = C0621y0.f25055e;
        c0621y0.f().a(this.f23470a);
    }
}
