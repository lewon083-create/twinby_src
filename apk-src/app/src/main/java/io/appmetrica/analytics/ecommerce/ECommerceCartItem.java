package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.ko;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ECommerceCartItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f21861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigDecimal f21862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ECommercePrice f21863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f21864d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j10) {
        this(eCommerceProduct, eCommercePrice, ko.a(j10));
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f21861a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f21862b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f21864d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f21863c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f21864d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f21861a + ", quantity=" + this.f21862b + ", revenue=" + this.f21863c + ", referrer=" + this.f21864d + '}';
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d10) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(ko.a(d10)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f21861a = eCommerceProduct;
        this.f21862b = bigDecimal;
        this.f21863c = eCommercePrice;
    }
}
