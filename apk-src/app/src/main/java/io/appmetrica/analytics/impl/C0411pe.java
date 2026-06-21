package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0411pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f24580d;

    public C0411pe(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0300l3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f24577a + "', identifier='" + this.f24578b + "', cartItems=" + this.f24579c + ", payload=" + this.f24580d + '}';
    }

    public C0411pe(String str, String str2, ArrayList arrayList, Map map) {
        this.f24577a = str;
        this.f24578b = str2;
        this.f24579c = arrayList;
        this.f24580d = map;
    }
}
