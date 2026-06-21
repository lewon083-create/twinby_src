package io.appmetrica.analytics.billingv6.impl;

import d8.n0;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.sentry.TransactionOptions;
import kotlin.collections.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f21600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8.j f21601b;

    public a(b bVar, d8.j jVar) {
        this.f21600a = bVar;
        this.f21601b = jVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f21600a;
        d8.j jVar = this.f21601b;
        bVar.getClass();
        if (jVar.f15636a != 0) {
            bVar.f21606e.onUpdateFinished();
            return;
        }
        for (String str : s.f("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f21602a;
            d8.d dVar = bVar.f21603b;
            UtilsProvider utilsProvider = bVar.f21604c;
            d dVar2 = bVar.f21605d;
            i iVar = new i(billingConfig, dVar, utilsProvider, str, dVar2, bVar.f21606e);
            dVar2.f21611b.add(iVar);
            if (bVar.f21603b.b()) {
                d8.d dVar3 = bVar.f21603b;
                if (str == null) {
                    throw new IllegalArgumentException("Product type must be set");
                }
                d8.e eVar = (d8.e) dVar3;
                eVar.getClass();
                if (eVar.b()) {
                    int i = 7;
                    if (d8.e.m(new aa.e(eVar, str, (Object) iVar, i), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new k0.i(i, eVar, iVar), eVar.D(), eVar.q()) == null) {
                        d8.j jVarN = eVar.n();
                        eVar.H(25, 11, jVarN);
                        iVar.onPurchaseHistoryResponse(jVarN, null);
                    }
                } else {
                    d8.j jVar2 = n0.f15669k;
                    eVar.H(2, 11, jVar2);
                    iVar.onPurchaseHistoryResponse(jVar2, null);
                }
            } else {
                bVar.f21605d.a(iVar);
                bVar.f21606e.onUpdateFinished();
            }
        }
    }
}
