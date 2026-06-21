package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f25160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f25161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f25162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f25163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f25164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f25166h = new HashMap();
    public final HashMap i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Location f25167j;

    public k(@NonNull Context context, @NonNull PermissionExtractor permissionExtractor, @NonNull IHandlerExecutor iHandlerExecutor, @NonNull p pVar) {
        this.f25159a = context;
        this.f25161c = pVar;
        this.f25160b = permissionExtractor;
        this.f25162d = iHandlerExecutor;
        this.f25163e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f25164f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized Location a() {
        return (Location) this.f25161c.f25178b.getData();
    }

    public final synchronized void b(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f25166h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized Location c() {
        Location locationA;
        locationA = this.f25167j;
        if (locationA == null) {
            locationA = a();
        }
        return locationA;
    }

    public final synchronized void d() {
        try {
            this.f25164f.startUpdates();
            Iterator it = this.i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e() {
        this.f25164f.stopUpdates();
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f25165g) {
            this.f25165g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f25165g) {
            this.f25165g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f25166h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f25165g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(@NonNull i iVar) {
        this.f25162d.execute(new j(this, iVar));
    }

    public final synchronized void a(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f25159a, this.f25160b, this.f25162d, this.f25163e);
        this.f25166h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f25165g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized Location b() {
        return this.f25167j;
    }

    public final synchronized void a(@NonNull LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f25159a, this.f25160b, this.f25162d, this.f25163e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f25165g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.f25167j = location;
        }
    }
}
