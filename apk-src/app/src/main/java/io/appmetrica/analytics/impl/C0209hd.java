package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0209hd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0360nd f23985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f23986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23987c;

    public C0209hd(C0360nd c0360nd, AdRevenue adRevenue, boolean z5) {
        this.f23985a = c0360nd;
        this.f23986b = adRevenue;
        this.f23987c = z5;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0360nd.a(this.f23985a).reportAdRevenue(this.f23986b, this.f23987c);
    }
}
