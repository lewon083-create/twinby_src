package io.appmetrica.analytics.billingv6.impl;

import d8.q;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f21628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d8.d f21629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f21630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f21632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f21633f;

    public i(BillingConfig billingConfig, d8.d dVar, UtilsProvider utilsProvider, String str, d dVar2, n nVar) {
        this.f21628a = billingConfig;
        this.f21629b = dVar;
        this.f21630c = utilsProvider;
        this.f21631d = str;
        this.f21632e = dVar2;
        this.f21633f = nVar;
    }

    @Override // d8.q
    public final void onPurchaseHistoryResponse(d8.j jVar, List list) {
        this.f21630c.getWorkerExecutor().execute(new g(this, jVar, list));
    }
}
