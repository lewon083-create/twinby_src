package io.appmetrica.analytics.billingv8.impl;

import d8.u;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import kotlin.collections.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f21653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8.j f21654b;

    public a(b bVar, d8.j jVar) {
        this.f21653a = bVar;
        this.f21654b = jVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f21653a;
        d8.j jVar = this.f21654b;
        bVar.getClass();
        if (jVar.f15636a != 0) {
            bVar.f21659e.onUpdateFinished();
            return;
        }
        if (!bVar.f21656b.b()) {
            bVar.f21659e.onUpdateFinished();
            return;
        }
        for (String str : s.f("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f21655a;
            d8.d dVar = bVar.f21656b;
            UtilsProvider utilsProvider = bVar.f21657c;
            d dVar2 = bVar.f21658d;
            i iVar = new i(billingConfig, dVar, utilsProvider, str, dVar2, bVar.f21659e);
            dVar2.f21664b.add(iVar);
            d8.d dVar3 = bVar.f21656b;
            u uVar = new u();
            uVar.f15702c = str;
            dVar3.d(uVar.a(), iVar);
        }
    }
}
