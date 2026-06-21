package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.C0677h;
import io.appmetrica.analytics.screenshot.impl.C0681l;
import io.appmetrica.analytics.screenshot.impl.C0682m;
import io.appmetrica.analytics.screenshot.impl.C0691w;
import io.appmetrica.analytics.screenshot.impl.C0692x;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.I;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.V;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0681l f25520a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f25523d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0677h f25521b = new C0677h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f25522c = new ServiceConfigUpdateListener<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(@NotNull ModuleServiceConfig<D> moduleServiceConfig) {
            C0681l c0681l;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = this.f25526a;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    D featuresConfig = moduleServiceConfig.getFeaturesConfig();
                    if (featuresConfig != null) {
                        boolean zB = featuresConfig.b();
                        F fA = featuresConfig.a();
                        c0681l = new C0681l(zB, fA != null ? new C0682m(fA) : null);
                    } else {
                        c0681l = null;
                    }
                    screenshotClientModuleEntryPoint.f25520a = c0681l;
                    if (screenshotClientModuleEntryPoint.f25523d != null) {
                        V v5 = screenshotClientModuleEntryPoint.f25523d;
                        if (v5 == null) {
                            Intrinsics.g("screenshotCaptorsController");
                            throw null;
                        }
                        v5.a(screenshotClientModuleEntryPoint.f25520a);
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25524e = "screenshot";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f25525f = new ServiceConfigExtensionConfiguration<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        @NotNull
        public BundleToServiceConfigConverter<D> getBundleConverter() {
            return this.f25527a.f25521b;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        @NotNull
        public ServiceConfigUpdateListener<D> getServiceConfigUpdateListener() {
            return this.f25527a.f25522c;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public String getIdentifier() {
        return this.f25524e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public ServiceConfigExtensionConfiguration<D> getServiceConfigExtensionConfiguration() {
        return this.f25525f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NotNull ClientContext clientContext) {
        synchronized (this) {
            try {
                C0692x c0692x = new C0692x(clientContext);
                this.f25523d = new V(AndroidUtils.isApiAchieved(34) ? new C0691w(clientContext, c0692x) : new I(clientContext, c0692x));
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                V v5 = this.f25523d;
                if (v5 != null) {
                    C0681l c0681l = this.f25520a;
                    Iterator it = v5.f25449a.iterator();
                    while (it.hasNext()) {
                        ((T) it.next()).a();
                    }
                    v5.a(c0681l);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
