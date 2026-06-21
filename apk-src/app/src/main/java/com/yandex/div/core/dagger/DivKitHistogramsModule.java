package com.yandex.div.core.dagger;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporterImpl;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.util.DoubleCheckProvider;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.r;
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
public final class DivKitHistogramsModule {

    @NotNull
    public static final DivKitHistogramsModule INSTANCE = new DivKitHistogramsModule();

    /* JADX INFO: renamed from: com.yandex.div.core.dagger.DivKitHistogramsModule$provideDivParsingHistogramReporter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public /* synthetic */ class AnonymousClass1 extends p implements Function0<HistogramReporter> {
        public AnonymousClass1(Object obj) {
            super(0, obj, hj.a.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HistogramReporter invoke() {
            return (HistogramReporter) ((hj.a) this.receiver).get();
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.dagger.DivKitHistogramsModule$provideDivParsingHistogramReporter$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public /* synthetic */ class AnonymousClass2 extends p implements Function0<Executor> {
        public AnonymousClass2(Object obj) {
            super(0, obj, hj.a.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Executor invoke() {
            return (Executor) ((hj.a) this.receiver).get();
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.dagger.DivKitHistogramsModule$provideHistogramReporter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class C00001 extends r implements Function0<HistogramReporter> {
        final /* synthetic */ HistogramReporterDelegate $histogramReporterDelegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00001(HistogramReporterDelegate histogramReporterDelegate) {
            super(0);
            this.$histogramReporterDelegate = histogramReporterDelegate;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final HistogramReporter invoke() {
            return DivHistogramsModuleKt.createHistogramReporter(this.$histogramReporterDelegate);
        }
    }

    private DivKitHistogramsModule() {
    }

    private final hj.a provideCalculateSizeExecutor(HistogramConfiguration histogramConfiguration, hj.a aVar) {
        if (!histogramConfiguration.isSizeRecordingEnabled()) {
            return new a(0);
        }
        Intrinsics.c(aVar, "null cannot be cast to non-null type javax.inject.Provider<java.util.concurrent.Executor>");
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor provideCalculateSizeExecutor$lambda$1() {
        return new b(0);
    }

    private final hj.a provideHistogramReporter(HistogramReporterDelegate histogramReporterDelegate) {
        return new DoubleCheckProvider(new C00001(histogramReporterDelegate));
    }

    @NotNull
    public final DivParsingHistogramReporter provideDivParsingHistogramReporter(@NotNull HistogramConfiguration histogramConfiguration, @NotNull hj.a aVar, @NotNull hj.a aVar2) {
        if (!histogramConfiguration.isReportingEnabled()) {
            return DivParsingHistogramReporter.Companion.getDEFAULT();
        }
        return new DivParsingHistogramReporterImpl(new AnonymousClass1(provideHistogramReporter((HistogramReporterDelegate) aVar.get())), new AnonymousClass2(provideCalculateSizeExecutor(histogramConfiguration, aVar2)));
    }

    @NotNull
    public final HistogramReporterDelegate provideHistogramReporterDelegate(@NotNull HistogramConfiguration histogramConfiguration, @NotNull hj.a aVar, @NotNull hj.a aVar2) {
        return histogramConfiguration.isReportingEnabled() ? DivHistogramsModuleKt.createHistogramReporterDelegate(histogramConfiguration, aVar, aVar2) : HistogramReporterDelegate.NoOp.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideCalculateSizeExecutor$lambda$1$lambda$0(Runnable runnable) {
    }
}
