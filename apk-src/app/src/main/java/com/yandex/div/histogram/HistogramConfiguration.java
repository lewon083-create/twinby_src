package com.yandex.div.histogram;

import com.yandex.div.internal.util.DoubleCheckProvider;
import hj.a;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public interface HistogramConfiguration extends HistogramRecordConfiguration {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final HistogramConfiguration DEFAULT = new DefaultHistogramConfiguration();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static class DefaultHistogramConfiguration implements HistogramConfiguration {
        private final boolean isReportingEnabled;
        private final boolean isSizeRecordingEnabled;

        @NotNull
        private final a histogramBridge = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1.INSTANCE);

        @NotNull
        private final a cpuUsageHistogramReporter = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1.INSTANCE);

        @NotNull
        private final a taskExecutorProvider = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1.INSTANCE);

        @NotNull
        private final a renderConfiguration = new DoubleCheckProvider(HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1.INSTANCE);

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a getHistogramBridge() {
            return this.histogramBridge;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        @NotNull
        public a getTaskExecutorProvider() {
            return this.taskExecutorProvider;
        }

        @Override // com.yandex.div.histogram.HistogramConfiguration
        public boolean isReportingEnabled() {
            return this.isReportingEnabled;
        }

        @Override // com.yandex.div.histogram.HistogramRecordConfiguration
        public boolean isSizeRecordingEnabled() {
            return this.isSizeRecordingEnabled;
        }
    }

    @NotNull
    a getHistogramBridge();

    @NotNull
    a getTaskExecutorProvider();

    boolean isReportingEnabled();
}
