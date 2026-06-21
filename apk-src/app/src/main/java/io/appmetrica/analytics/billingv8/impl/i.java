package io.appmetrica.analytics.billingv8.impl;

import d8.r;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f21681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d8.d f21682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f21683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f21685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f21686f;

    public i(BillingConfig billingConfig, d8.d dVar, UtilsProvider utilsProvider, String str, d dVar2, n nVar) {
        this.f21681a = billingConfig;
        this.f21682b = dVar;
        this.f21683c = utilsProvider;
        this.f21684d = str;
        this.f21685e = dVar2;
        this.f21686f = nVar;
    }

    @Override // d8.r
    public final void onQueryPurchasesResponse(d8.j jVar, List list) {
        this.f21683c.getWorkerExecutor().execute(new g(this, jVar, list));
    }
}
