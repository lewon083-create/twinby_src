package com.yandex.div.core;

import com.yandex.div.core.dagger.ExternalOptional;
import com.yandex.div.histogram.HistogramBridge;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.storage.DivStorageComponent;
import hj.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class DivKitConfiguration {

    @NotNull
    private final a divRequestExecutor;

    @Nullable
    private final a divStorageComponent;

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final a histogramConfiguration;

    @Nullable
    private final a sendBeaconConfiguration;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Builder {

        @Nullable
        private a divStorageComponent;

        @Nullable
        private ExecutorService executorService;

        @Nullable
        private a sendBeaconConfiguration;

        @NotNull
        private a histogramConfiguration = new com.yandex.div.core.dagger.a(1);

        @NotNull
        private a divRequestExecutor = new com.yandex.div.core.dagger.a(2);

        @NotNull
        public final DivKitConfiguration build() {
            a aVar = this.sendBeaconConfiguration;
            ExecutorService executorServiceNewSingleThreadExecutor = this.executorService;
            if (executorServiceNewSingleThreadExecutor == null) {
                executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            }
            return new DivKitConfiguration(aVar, executorServiceNewSingleThreadExecutor, this.histogramConfiguration, this.divStorageComponent, this.divRequestExecutor, null);
        }
    }

    public /* synthetic */ DivKitConfiguration(a aVar, ExecutorService executorService, a aVar2, a aVar3, a aVar4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, executorService, aVar2, aVar3, aVar4);
    }

    @NotNull
    public final ExecutorService executorService() {
        return this.executorService;
    }

    @NotNull
    public final ExternalOptional<DivStorageComponent> externalDivStorageComponent() {
        ExternalOptional.Companion companion = ExternalOptional.Companion;
        a aVar = this.divStorageComponent;
        return companion.ofNullable(aVar != null ? (DivStorageComponent) aVar.get() : null);
    }

    @NotNull
    public final HistogramConfiguration histogramConfiguration() {
        return (HistogramConfiguration) this.histogramConfiguration.get();
    }

    @NotNull
    public final HistogramRecorder histogramRecorder() {
        return new HistogramRecorder((HistogramBridge) ((HistogramConfiguration) this.histogramConfiguration.get()).getHistogramBridge().get());
    }

    @Nullable
    public final xg.a sendBeaconConfiguration() {
        a aVar = this.sendBeaconConfiguration;
        if (aVar == null || aVar.get() == null) {
            return null;
        }
        throw new ClassCastException();
    }

    private DivKitConfiguration(a aVar, ExecutorService executorService, a aVar2, a aVar3, a aVar4) {
        this.sendBeaconConfiguration = aVar;
        this.executorService = executorService;
        this.histogramConfiguration = aVar2;
        this.divStorageComponent = aVar3;
        this.divRequestExecutor = aVar4;
    }
}
