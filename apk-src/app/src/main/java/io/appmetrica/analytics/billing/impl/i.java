package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(@NotNull BillingInfo billingInfo) {
        c cVar = new c();
        int i = h.f21518a[billingInfo.type.ordinal()];
        cVar.f21507a = i != 1 ? i != 2 ? 1 : 3 : 2;
        cVar.f21508b = billingInfo.productId;
        cVar.f21509c = billingInfo.purchaseToken;
        cVar.f21510d = billingInfo.purchaseTime;
        cVar.f21511e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(@NotNull c cVar) {
        ProductType productType;
        int i = cVar.f21507a;
        if (i == 2) {
            productType = ProductType.INAPP;
        } else if (i != 3) {
            productType = ProductType.UNKNOWN;
        } else {
            productType = ProductType.SUBS;
        }
        return new BillingInfo(productType, cVar.f21508b, cVar.f21509c, cVar.f21510d, cVar.f21511e);
    }
}
