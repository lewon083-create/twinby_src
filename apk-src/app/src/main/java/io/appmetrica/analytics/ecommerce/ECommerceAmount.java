package io.appmetrica.analytics.ecommerce;

import a0.u;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.ko;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ECommerceAmount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigDecimal f21859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21860b;

    public ECommerceAmount(long j10, @NonNull String str) {
        this(ko.a(j10), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f21859a;
    }

    @NonNull
    public String getUnit() {
        return this.f21860b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommerceAmount{amount=");
        sb2.append(this.f21859a);
        sb2.append(", unit='");
        return u.o(sb2, this.f21860b, "'}");
    }

    public ECommerceAmount(double d10, @NonNull String str) {
        this(new BigDecimal(ko.a(d10)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f21859a = bigDecimal;
        this.f21860b = str;
    }
}
