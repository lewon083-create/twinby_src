package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements BillingInfoStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f21522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0005a f21523b;

    public k(@NotNull ProtobufStateStorage<C0005a> protobufStateStorage) {
        this.f21522a = protobufStateStorage;
        this.f21523b = protobufStateStorage.read();
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    @NotNull
    public final List<BillingInfo> getBillingInfo() {
        return this.f21523b.f21503a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f21523b.f21504b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(@NotNull List<? extends BillingInfo> list, boolean z5) {
        for (BillingInfo billingInfo : list) {
        }
        C0005a c0005a = new C0005a(list, z5);
        this.f21523b = c0005a;
        this.f21522a.save(c0005a);
    }
}
