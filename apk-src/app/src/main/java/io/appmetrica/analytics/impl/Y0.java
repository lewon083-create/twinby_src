package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f23276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f23277b;

    public Y0(C0522u1 c0522u1, AdRevenue adRevenue) {
        this.f23277b = c0522u1;
        this.f23276a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1.a(this.f23277b).reportAdRevenue(this.f23276a);
    }
}
