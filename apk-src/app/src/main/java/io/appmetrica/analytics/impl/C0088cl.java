package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0088cl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Gf f23616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0587wg f23617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0075c8 f23618c;

    public C0088cl(@NonNull ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Gf(eCommerceProduct), eCommerceReferrer == null ? null : new C0587wg(eCommerceReferrer), new C0114dl());
    }

    @NonNull
    public final InterfaceC0075c8 a() {
        return this.f23618c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Jf
    public final List<Ci> toProto() {
        return (List) this.f23618c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f23616a + ", referrer=" + this.f23617b + ", converter=" + this.f23618c + '}';
    }

    public C0088cl(@NonNull Gf gf2, C0587wg c0587wg, @NonNull InterfaceC0075c8 interfaceC0075c8) {
        this.f23616a = gf2;
        this.f23617b = c0587wg;
        this.f23618c = interfaceC0075c8;
    }
}
