package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ECommerceOrder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f21866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f21867c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f21865a = str;
        this.f21866b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f21866b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f21865a;
    }

    public Map<String, String> getPayload() {
        return this.f21867c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f21867c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f21865a + "', cartItems=" + this.f21866b + ", payload=" + this.f21867c + '}';
    }
}
