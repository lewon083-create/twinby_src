package io.appmetrica.analytics.billingv6.impl;

import d8.u;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f21612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8.j f21613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f21614c;

    public e(f fVar, d8.j jVar, List list) {
        this.f21612a = fVar;
        this.f21613b = jVar;
        this.f21614c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f21612a;
        d8.j jVar = this.f21613b;
        List list = this.f21614c;
        fVar.getClass();
        if (jVar.f15636a != 0 || list.isEmpty()) {
            fVar.f21621g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f21617c;
            Function0 function0 = fVar.f21618d;
            List list2 = fVar.f21619e;
            d dVar = fVar.f21620f;
            k kVar = new k(utilsProvider, function0, list2, list, dVar, fVar.f21621g);
            dVar.f21611b.add(kVar);
            if (fVar.f21616b.b()) {
                d8.d dVar2 = fVar.f21616b;
                u uVar = new u();
                uVar.f15702c = fVar.f21615a;
                dVar2.d(uVar.a(), kVar);
            } else {
                fVar.f21620f.a(kVar);
                fVar.f21621g.onUpdateFinished();
            }
        }
        f fVar2 = this.f21612a;
        fVar2.f21620f.a(fVar2);
    }
}
