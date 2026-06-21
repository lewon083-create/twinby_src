package io.appmetrica.analytics.coreutils.internal.services;

import ij.g;
import ij.h;
import io.appmetrica.analytics.coreutils.impl.l;
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
public final class UtilityServiceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f21826a = h.b(new l(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WaitForActivationDelayBarrier f21827b = new WaitForActivationDelayBarrier();

    @NotNull
    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f21827b;
    }

    @NotNull
    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) this.f21826a.getValue();
    }

    public final void initAsync() {
        this.f21827b.activate();
    }

    public final void updateConfiguration(@NotNull UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
