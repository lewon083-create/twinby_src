package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f22386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0636yf f22387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0636yf f22388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f22389g;

    public Gf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C0636yf(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new C0636yf(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProductWrapper{sku='");
        sb2.append(this.f22383a);
        sb2.append("', name='");
        sb2.append(this.f22384b);
        sb2.append("', categoriesPath=");
        sb2.append(this.f22385c);
        sb2.append(", payload=");
        sb2.append(this.f22386d);
        sb2.append(", actualPrice=");
        sb2.append(this.f22387e);
        sb2.append(", originalPrice=");
        sb2.append(this.f22388f);
        sb2.append(", promocodes=");
        return a0.u.p(sb2, this.f22389g, '}');
    }

    public Gf(String str, String str2, List list, Map map, C0636yf c0636yf, C0636yf c0636yf2, List list2) {
        this.f22383a = str;
        this.f22384b = str2;
        this.f22385c = list;
        this.f22386d = map;
        this.f22387e = c0636yf;
        this.f22388f = c0636yf2;
        this.f22389g = list2;
    }
}
