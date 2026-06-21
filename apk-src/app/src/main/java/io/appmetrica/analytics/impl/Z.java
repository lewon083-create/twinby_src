package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f23360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23361b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AmountWrapper{amount=");
        sb2.append(this.f23360a);
        sb2.append(", unit='");
        return a0.u.o(sb2, this.f23361b, "'}");
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f23360a = bigDecimal;
        this.f23361b = str;
    }
}
