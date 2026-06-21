package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Mb implements Lb, InterfaceC0269jm, LocationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qb f22671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationClient f22672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0492sl f22673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0591wk f22674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f22675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f22676g;

    public Mb(@NotNull Context context, @NotNull Qb qb2, @NotNull LocationClient locationClient) {
        this.f22670a = context;
        this.f22671b = qb2;
        this.f22672c = locationClient;
        Vb vb2 = new Vb();
        this.f22673d = new C0492sl(new C0277k5(vb2, C0382oa.k().p().getAskForPermissionStrategy()));
        this.f22674e = C0382oa.k().p();
        ((Tb) qb2).a(vb2, true);
        ((Tb) qb2).a(locationClient, true);
        this.f22675f = locationClient.getLastKnownExtractorProviderFactory();
        this.f22676g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0269jm
    public final void a(@NotNull C0140em c0140em) {
        C0121e3 c0121e3 = c0140em.f23807x;
        if (c0121e3 != null) {
            long j10 = c0121e3.f23727a;
            this.f22672c.updateCacheArguments(new CacheArguments(j10, ((long) 2) * j10));
        }
    }

    @NotNull
    public final C0492sl b() {
        return this.f22673d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f22675f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f22676g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f22673d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getSystemLocation() {
        return this.f22672c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getUserLocation() {
        return this.f22672c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void init() {
        this.f22672c.init(this.f22670a, this.f22673d, C0382oa.I.f24493d.b(), this.f22674e.e());
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceControllerF = this.f22674e.f();
        if (moduleLocationSourcesServiceControllerF != null) {
            moduleLocationSourcesServiceControllerF.init();
        } else {
            LocationClient locationClient = this.f22672c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f22672c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Tb) this.f22671b).a(this.f22674e.g());
        C0382oa.I.f24509u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
        ((Tb) this.f22671b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f22672c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f22672c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        this.f22672c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void b(@NotNull Object obj) {
        ((Tb) this.f22671b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f22672c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f22672c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(@NotNull Object obj) {
        ((Tb) this.f22671b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(boolean z5) {
        ((Tb) this.f22671b).a(z5);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(@Nullable Location location) {
        this.f22672c.updateUserLocation(location);
    }
}
