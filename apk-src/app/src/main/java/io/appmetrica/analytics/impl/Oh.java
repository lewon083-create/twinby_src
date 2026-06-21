package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Oh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f22806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0162fi f22807b;

    public Oh(C0162fi c0162fi, AdRevenue adRevenue) {
        this.f22807b = c0162fi;
        this.f22806a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f22807b;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).reportAdRevenue(this.f22806a);
    }
}
