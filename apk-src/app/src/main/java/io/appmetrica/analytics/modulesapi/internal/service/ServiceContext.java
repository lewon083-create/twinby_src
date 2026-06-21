package io.appmetrica.analytics.modulesapi.internal.service;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import kotlin.Metadata;
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
public interface ServiceContext {
    @NotNull
    ActivationBarrier getActivationBarrier();

    @NotNull
    ActiveNetworkTypeProvider getActiveNetworkTypeProvider();

    @NotNull
    ApplicationStateProvider getApplicationStateProvider();

    @NotNull
    ChargeTypeProvider getChargeTypeProvider();

    @NotNull
    Context getContext();

    @NotNull
    CryptoProvider getCryptoProvider();

    @NotNull
    DataSendingRestrictionController getDataSendingRestrictionController();

    @NotNull
    ExecutorProvider getExecutorProvider();

    @NotNull
    FirstExecutionConditionService getFirstExecutionConditionService();

    @NotNull
    LocationServiceApi getLocationServiceApi();

    @NotNull
    ModuleServiceLifecycleController getModuleServiceLifecycleController();

    @NotNull
    ServiceNetworkContext getNetworkContext();

    @NotNull
    PermissionExtractor getPermissionExtractor();

    @NotNull
    PlatformIdentifiers getPlatformIdentifiers();

    @NotNull
    SdkEnvironmentProvider getSdkEnvironmentProvider();

    @NotNull
    ModuleSelfReporter getSelfReporter();

    @NotNull
    ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle();

    @NotNull
    ServiceStorageProvider getServiceStorageProvider();

    @NotNull
    ServiceWakeLock getServiceWakeLock();
}
