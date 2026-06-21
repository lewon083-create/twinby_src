package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface Ob extends LocationProvider {
    void a(@Nullable Location location);

    void a(@NotNull Object obj);

    void a(boolean z5);

    void b(@NotNull Object obj);

    void init();
}
