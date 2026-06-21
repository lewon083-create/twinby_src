package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ECommerceScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f21881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f21883d;

    public List<String> getCategoriesPath() {
        return this.f21881b;
    }

    public String getName() {
        return this.f21880a;
    }

    public Map<String, String> getPayload() {
        return this.f21883d;
    }

    public String getSearchQuery() {
        return this.f21882c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f21881b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f21880a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f21883d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f21882c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f21880a + "', categoriesPath=" + this.f21881b + ", searchQuery='" + this.f21882c + "', payload=" + this.f21883d + '}';
    }
}
