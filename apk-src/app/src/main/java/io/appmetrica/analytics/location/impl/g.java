package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements LastKnownLocationExtractorProviderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LastKnownLocationExtractorProvider f25150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f25151b = new c("location-module-gpl");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f25152c = new v("network", new f(), "location-module-network");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f25153d = new v("gps", new e(), "location-module-gps");

    public g(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f25150a = lastKnownLocationExtractorProvider;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f25151b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f25153d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f25152c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    @NotNull
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f25150a;
    }
}
