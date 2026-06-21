package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0225i3 extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24038d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24039e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C0300l3 f24041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0075c8 f24042c;

    public C0225i3(int i, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i, new C0300l3(eCommerceCartItem), new C0250j3());
    }

    @NonNull
    public final InterfaceC0075c8 a() {
        return this.f24042c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i = this.f24040a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Jf
    public final List<Ci> toProto() {
        return (List) this.f24042c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f24040a + ", cartItem=" + this.f24041b + ", converter=" + this.f24042c + '}';
    }

    public C0225i3(int i, @NonNull C0300l3 c0300l3, @NonNull InterfaceC0075c8 interfaceC0075c8) {
        this.f24040a = i;
        this.f24041b = c0300l3;
        this.f24042c = interfaceC0075c8;
    }
}
