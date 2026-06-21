package io.appmetrica.analytics.ecommerce;

import a0.u;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ECommerceProduct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f21872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f21873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ECommercePrice f21874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ECommercePrice f21875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f21876g;

    public ECommerceProduct(@NonNull String str) {
        this.f21870a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f21874e;
    }

    public List<String> getCategoriesPath() {
        return this.f21872c;
    }

    public String getName() {
        return this.f21871b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f21875f;
    }

    public Map<String, String> getPayload() {
        return this.f21873d;
    }

    public List<String> getPromocodes() {
        return this.f21876g;
    }

    @NonNull
    public String getSku() {
        return this.f21870a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f21874e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f21872c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(String str) {
        this.f21871b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f21875f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f21873d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(List<String> list) {
        this.f21876g = list;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommerceProduct{sku='");
        sb2.append(this.f21870a);
        sb2.append("', name='");
        sb2.append(this.f21871b);
        sb2.append("', categoriesPath=");
        sb2.append(this.f21872c);
        sb2.append(", payload=");
        sb2.append(this.f21873d);
        sb2.append(", actualPrice=");
        sb2.append(this.f21874e);
        sb2.append(", originalPrice=");
        sb2.append(this.f21875f);
        sb2.append(", promocodes=");
        return u.p(sb2, this.f21876g, '}');
    }
}
