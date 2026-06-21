package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0636yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f25095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25096b;

    public C0636yf(ECommercePrice eCommercePrice) {
        this(new Z(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new Z(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceWrapper{fiat=");
        sb2.append(this.f25095a);
        sb2.append(", internalComponents=");
        return a0.u.p(sb2, this.f25096b, '}');
    }

    public C0636yf(Z z5, LinkedList linkedList) {
        this.f25095a = z5;
        this.f25096b = linkedList;
    }
}
