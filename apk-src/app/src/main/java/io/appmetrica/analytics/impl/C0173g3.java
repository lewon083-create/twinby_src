package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0173g3 implements ProtobufConverter {
    @NonNull
    public final C0369nm a(@NonNull C0121e3 c0121e3) {
        C0369nm c0369nm = new C0369nm();
        c0369nm.f24455a = c0121e3.f23727a;
        return c0369nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C0369nm c0369nm = new C0369nm();
        c0369nm.f24455a = ((C0121e3) obj).f23727a;
        return c0369nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C0121e3(((C0369nm) obj).f24455a);
    }

    @NonNull
    public final C0121e3 a(@NonNull C0369nm c0369nm) {
        return new C0121e3(c0369nm.f24455a);
    }
}
