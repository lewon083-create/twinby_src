package io.appmetrica.analytics.ecommerce;

import a0.u;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ECommercePrice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f21868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f21869b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f21868a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f21868a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f21869b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f21869b = list;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommercePrice{fiat=");
        sb2.append(this.f21868a);
        sb2.append(", internalComponents=");
        return u.p(sb2, this.f21869b, '}');
    }
}
