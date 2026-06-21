package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0139el extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C0060bj f23783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0075c8 f23784b;

    public C0139el(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C0060bj(eCommerceScreen), new C0165fl());
    }

    @NonNull
    public final InterfaceC0075c8 a() {
        return this.f23784b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Jf
    public final List<Ci> toProto() {
        return (List) this.f23784b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f23783a + ", converter=" + this.f23784b + '}';
    }

    public C0139el(@NonNull C0060bj c0060bj, @NonNull InterfaceC0075c8 interfaceC0075c8) {
        this.f23783a = c0060bj;
        this.f23784b = interfaceC0075c8;
    }
}
