package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class u implements LastKnownLocationExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f25192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationListener f25193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25194d;

    public u(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull String str) {
        this.f25191a = context;
        this.f25192b = permissionResolutionStrategy;
        this.f25193c = locationListener;
        this.f25194d = str;
    }

    @NotNull
    public final Context a() {
        return this.f25191a;
    }

    @NotNull
    public final LocationListener b() {
        return this.f25193c;
    }

    @NotNull
    public final PermissionResolutionStrategy c() {
        return this.f25192b;
    }

    @NotNull
    public final String d() {
        return this.f25194d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f25192b.hasNecessaryPermissions(this.f25191a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f25191a, "location", "getting last known location for provider " + this.f25194d, "location manager", new s3.q(16, this));
            if (location != null) {
                this.f25193c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f25194d);
    }
}
