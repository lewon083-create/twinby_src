package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class X0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f23232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f23233b;

    public X0(C0522u1 c0522u1, Revenue revenue) {
        this.f23233b = c0522u1;
        this.f23232a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1.a(this.f23233b).reportRevenue(this.f23232a);
    }
}
