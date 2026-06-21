package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f21622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d8.j f21623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f21624c;

    public g(i iVar, d8.j jVar, List list) {
        this.f21622a = iVar;
        this.f21623b = jVar;
        this.f21624c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f21622a;
        d8.j jVar = this.f21623b;
        List<PurchaseHistoryRecord> list = this.f21624c;
        iVar.getClass();
        if (jVar.f15636a != 0 || list == null) {
            iVar.f21633f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.a()) {
                    String str2 = iVar.f21631d;
                    BillingInfo billingInfo = new BillingInfo(Intrinsics.a(str2, "inapp") ? ProductType.INAPP : Intrinsics.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.b(), purchaseHistoryRecord.f2430c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f21630c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f21628a, linkedHashMap, iVar.f21630c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f21631d, iVar.f21630c.getBillingInfoManager());
                iVar.f21633f.onUpdateFinished();
            } else {
                List<String> listR = CollectionsKt.R(billingInfoToUpdate.keySet());
                n nVar = iVar.f21633f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f21631d;
                d8.d dVar = iVar.f21629b;
                UtilsProvider utilsProvider = iVar.f21630c;
                d dVar2 = iVar.f21632e;
                f fVar = new f(str3, dVar, utilsProvider, hVar, list, dVar2, nVar);
                dVar2.f21611b.add(fVar);
                if (iVar.f21629b.b()) {
                    d8.d dVar3 = iVar.f21629b;
                    a7.l lVar = new a7.l(11);
                    ArrayList arrayList = new ArrayList(t.j(listR, 10));
                    for (String str4 : listR) {
                        d8.a aVar = new d8.a(1);
                        aVar.f15576b = str4;
                        aVar.f15577c = iVar.f21631d;
                        arrayList.add(aVar.a());
                    }
                    lVar.j(arrayList);
                    dVar3.c(lVar.a(), fVar);
                } else {
                    iVar.f21632e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f21622a;
        iVar2.f21632e.a(iVar2);
    }
}
