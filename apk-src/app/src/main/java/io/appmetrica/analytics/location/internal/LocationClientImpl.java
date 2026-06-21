package io.appmetrica.analytics.location.internal;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.location.impl.g;
import io.appmetrica.analytics.location.impl.i;
import io.appmetrica.analytics.location.impl.j;
import io.appmetrica.analytics.location.impl.k;
import io.appmetrica.analytics.location.impl.o;
import io.appmetrica.analytics.location.impl.p;
import io.appmetrica.analytics.location.impl.q;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class LocationClientImpl implements LocationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f25198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f25199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f25200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f25201d;

    public LocationClientImpl() {
        q qVar = new q();
        this.f25199b = new g(qVar);
        this.f25200c = new o(qVar);
        this.f25201d = new i();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    @NotNull
    public LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f25199b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    @NotNull
    public LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f25200c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public synchronized Location getSystemLocation() {
        k kVar;
        kVar = this.f25198a;
        return kVar != null ? kVar.a() : null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public synchronized Location getUserLocation() {
        k kVar;
        kVar = this.f25198a;
        return kVar != null ? kVar.b() : null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void init(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull List<? extends Consumer<Location>> list) {
        if (this.f25198a == null) {
            this.f25198a = new k(context, permissionExtractor, iHandlerExecutor, new p(list, this.f25201d));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerSystemLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        k kVar = this.f25198a;
        if (kVar != null) {
            kVar.a(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void startLocationTracking() {
        k kVar = this.f25198a;
        if (kVar != null) {
            kVar.startLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void stopLocationTracking() {
        k kVar = this.f25198a;
        if (kVar != null) {
            kVar.stopLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterSystemLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        k kVar = this.f25198a;
        if (kVar != null) {
            kVar.b(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateCacheArguments(@NotNull CacheArguments cacheArguments) {
        i iVar = new i(this.f25201d.f25155a, cacheArguments);
        this.f25201d = iVar;
        k kVar = this.f25198a;
        if (kVar != null) {
            kVar.f25162d.execute(new j(kVar, iVar));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        i iVar = new i(locationFilter, this.f25201d.f25156b);
        this.f25201d = iVar;
        k kVar = this.f25198a;
        if (kVar != null) {
            kVar.f25162d.execute(new j(kVar, iVar));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateUserLocation(@Nullable Location location) {
        k kVar = this.f25198a;
        if (kVar != null) {
            kVar.a(location);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerSystemLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        k kVar = this.f25198a;
        if (kVar != null) {
            kVar.a(locationReceiverProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterSystemLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        k kVar = this.f25198a;
        if (kVar != null) {
            kVar.b(locationReceiverProvider);
        }
    }
}
