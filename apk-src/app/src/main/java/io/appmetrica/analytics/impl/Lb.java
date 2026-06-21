package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface Lb extends Ob, LocationServiceApi {
    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void a(@Nullable Location location);

    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void a(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void a(boolean z5);

    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void b(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void init();
}
