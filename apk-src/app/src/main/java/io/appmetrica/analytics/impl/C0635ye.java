package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0635ye implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0493sm fromModel(@NonNull C0610xe c0610xe) {
        C0493sm c0493sm = new C0493sm();
        c0493sm.f24745a = c0610xe.f25021a;
        c0493sm.f24746b = c0610xe.f25022b;
        return c0493sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C0493sm c0493sm = (C0493sm) obj;
        return new C0610xe(c0493sm.f24745a, c0493sm.f24746b);
    }

    @NonNull
    public final C0610xe a(@NonNull C0493sm c0493sm) {
        return new C0610xe(c0493sm.f24745a, c0493sm.f24746b);
    }
}
