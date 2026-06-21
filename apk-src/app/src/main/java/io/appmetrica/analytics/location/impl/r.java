package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends u implements LocationReceiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f25184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25185f;

    public r(@NotNull Context context, @NotNull Looper looper, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f25184e = looper;
        this.f25185f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final Unit a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f25194d, rVar.f25185f, 0.0f, rVar.f25193c, rVar.f25184e);
        return Unit.f27471a;
    }

    public static final Unit b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f25193c);
        return Unit.f27471a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f25192b.hasNecessaryPermissions(this.f25191a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f25191a, "location", a0.u.o(new StringBuilder("request location updates for "), this.f25194d, " provider"), "location manager", new uh.a(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f25191a, "location", "stop location updates for passive provider", "location manager", new uh.a(this, 0));
    }
}
