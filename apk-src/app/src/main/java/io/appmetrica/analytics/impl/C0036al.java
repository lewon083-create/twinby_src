package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.al, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0036al extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Gf f23448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C0060bj f23449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0075c8 f23450c;

    public C0036al(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new Gf(eCommerceProduct), new C0060bj(eCommerceScreen), new C0062bl());
    }

    @NonNull
    public final InterfaceC0075c8 a() {
        return this.f23450c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Jf
    public final List<Ci> toProto() {
        return (List) this.f23450c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f23448a + ", screen=" + this.f23449b + ", converter=" + this.f23450c + '}';
    }

    public C0036al(@NonNull Gf gf2, @NonNull C0060bj c0060bj, @NonNull InterfaceC0075c8 interfaceC0075c8) {
        this.f23448a = gf2;
        this.f23449b = c0060bj;
        this.f23450c = interfaceC0075c8;
    }
}
