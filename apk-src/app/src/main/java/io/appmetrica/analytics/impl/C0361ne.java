package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0361ne extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24433d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24434e = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C0411pe f24436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0075c8 f24437c;

    public C0361ne(int i, @NonNull ECommerceOrder eCommerceOrder) {
        this(i, new C0411pe(eCommerceOrder), new C0386oe());
    }

    @NonNull
    public final InterfaceC0075c8 a() {
        return this.f24437c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Jf
    public final List<Ci> toProto() {
        return (List) this.f24437c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f24435a + ", order=" + this.f24436b + ", converter=" + this.f24437c + '}';
    }

    public C0361ne(int i, @NonNull C0411pe c0411pe, @NonNull InterfaceC0075c8 interfaceC0075c8) {
        this.f24435a = i;
        this.f24436b = c0411pe;
        this.f24437c = interfaceC0075c8;
    }
}
