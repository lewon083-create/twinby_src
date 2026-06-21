package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements d8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f21602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d8.d f21603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f21604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f21605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f21606e;

    public b(BillingConfig billingConfig, d8.d dVar, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar2, n nVar) {
        this.f21602a = billingConfig;
        this.f21603b = dVar;
        this.f21604c = billingLibraryMonitor$updateBilling$1;
        this.f21605d = dVar2;
        this.f21606e = nVar;
    }

    @Override // d8.f
    public final void onBillingSetupFinished(d8.j jVar) {
        this.f21604c.getWorkerExecutor().execute(new a(this, jVar));
    }

    @Override // d8.f
    public final void onBillingServiceDisconnected() {
    }
}
