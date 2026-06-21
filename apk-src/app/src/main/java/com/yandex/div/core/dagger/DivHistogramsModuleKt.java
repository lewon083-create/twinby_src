package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramCallTypeProvider;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.histogram.reporter.HistogramReporterDelegateImpl;
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
public abstract class DivHistogramsModuleKt {
    @NotNull
    public static final HistogramReporter createHistogramReporter(@NotNull HistogramReporterDelegate histogramReporterDelegate) {
        return new HistogramReporter(histogramReporterDelegate);
    }

    @NotNull
    public static final HistogramReporterDelegate createHistogramReporterDelegate(@NotNull HistogramConfiguration histogramConfiguration, @NotNull hj.a aVar, @NotNull hj.a aVar2) {
        return !histogramConfiguration.isReportingEnabled() ? HistogramReporterDelegate.NoOp.INSTANCE : new HistogramReporterDelegateImpl(aVar, new HistogramCallTypeProvider(new DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(aVar2)), histogramConfiguration, histogramConfiguration.getTaskExecutorProvider());
    }
}
