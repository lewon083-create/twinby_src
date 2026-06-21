package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements BillingInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f21607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f21609c;

    public c(@NotNull BillingInfoStorage billingInfoStorage) {
        this.f21607a = billingInfoStorage;
        this.f21608b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f21609c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @Nullable
    public final BillingInfo get(@NotNull String str) {
        return (BillingInfo) this.f21609c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f21608b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f21608b) {
            return;
        }
        this.f21608b = true;
        this.f21607a.saveInfo(CollectionsKt.R(this.f21609c.values()), this.f21608b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(@NotNull Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f21609c.put(billingInfo.productId, billingInfo);
        }
        this.f21607a.saveInfo(CollectionsKt.R(this.f21609c.values()), this.f21608b);
    }
}
