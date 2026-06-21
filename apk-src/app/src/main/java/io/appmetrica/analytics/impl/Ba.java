package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface Ba extends SimpleAdvertisingIdGetter, InterfaceC0269jm {
    @NotNull
    AdvertisingIdsHolder a();

    @NotNull
    AdvertisingIdsHolder a(@NotNull Fi fi2);

    @Override // io.appmetrica.analytics.impl.InterfaceC0269jm
    /* synthetic */ void a(@NonNull C0140em c0140em);

    void b(boolean z5);

    void c(boolean z5);

    @NotNull
    AdvertisingIdsHolder getIdentifiers();

    void init();
}
