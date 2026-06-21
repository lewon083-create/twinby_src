package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Gm implements ProtobufConverter {
    @NonNull
    public final C0543um a(@NonNull Fm fm) {
        C0543um c0543um = new C0543um();
        c0543um.f24858a = fm.f22352a;
        return c0543um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C0543um c0543um = new C0543um();
        c0543um.f24858a = ((Fm) obj).f22352a;
        return c0543um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Fm(((C0543um) obj).f24858a);
    }

    @NonNull
    public final Fm a(@NonNull C0543um c0543um) {
        return new Fm(c0543um.f24858a);
    }
}
