package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Vb implements PermissionStrategy, LocationControllerObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Ub f23126b = new Ub();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f23127c = kotlin.collections.s.f("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f23128a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        if (f23127c.contains(str)) {
            return !this.f23128a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f23128a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f23128a = false;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationFlagStrategy(enabled=");
        sb2.append(this.f23128a);
        sb2.append(", locationPermissions=");
        return a0.u.p(sb2, f23127c, ')');
    }
}
