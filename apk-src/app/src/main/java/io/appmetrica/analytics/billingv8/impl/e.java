package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.QueryProductDetailsResult;
import d8.u;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f21665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8.j f21666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsResult f21667c;

    public e(f fVar, d8.j jVar, QueryProductDetailsResult queryProductDetailsResult) {
        this.f21665a = fVar;
        this.f21666b = jVar;
        this.f21667c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f21665a;
        d8.j jVar = this.f21666b;
        List productDetailsList = this.f21667c.getProductDetailsList();
        fVar.getClass();
        if (jVar.f15636a != 0 || productDetailsList.isEmpty()) {
            fVar.f21674g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f21670c;
            Function0 function0 = fVar.f21671d;
            List list = fVar.f21672e;
            d dVar = fVar.f21673f;
            k kVar = new k(utilsProvider, function0, list, productDetailsList, dVar, fVar.f21674g);
            dVar.f21664b.add(kVar);
            if (fVar.f21669b.b()) {
                d8.d dVar2 = fVar.f21669b;
                u uVar = new u();
                uVar.f15702c = fVar.f21668a;
                dVar2.d(uVar.a(), kVar);
            } else {
                fVar.f21673f.a(kVar);
                fVar.f21674g.onUpdateFinished();
            }
        }
        f fVar2 = this.f21665a;
        fVar2.f21673f.a(fVar2);
    }
}
