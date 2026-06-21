package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0300l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gf f24260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f24261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0636yf f24262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0587wg f24263d;

    public C0300l3(ECommerceCartItem eCommerceCartItem) {
        this(new Gf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C0636yf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C0587wg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f24260a + ", quantity=" + this.f24261b + ", revenue=" + this.f24262c + ", referrer=" + this.f24263d + '}';
    }

    public C0300l3(Gf gf2, BigDecimal bigDecimal, C0636yf c0636yf, C0587wg c0587wg) {
        this.f24260a = gf2;
        this.f24261b = bigDecimal;
        this.f24262c = c0636yf;
        this.f24263d = c0587wg;
    }
}
