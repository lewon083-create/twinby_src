package com.yandex.div.storage;

import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.TemplatesContainer;
import hj.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j0;
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
public final class DivDataRepositoryImpl implements DivDataRepository {

    @NotNull
    private final CardErrorLoggerFactory cardErrorFactory;

    @NotNull
    private final a divParsingHistogramProxy;

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final TemplatesContainer templateContainer;

    @NotNull
    private final Map<String, Object> inMemoryData = new LinkedHashMap();

    @NotNull
    private Map<String, ? extends List<Object>> cardsWithErrors = j0.d();

    public DivDataRepositoryImpl(@NotNull DivStorage divStorage, @NotNull TemplatesContainer templatesContainer, @NotNull HistogramRecorder histogramRecorder, @Nullable HistogramNameProvider histogramNameProvider, @NotNull a aVar, @NotNull CardErrorLoggerFactory cardErrorLoggerFactory) {
        this.divStorage = divStorage;
        this.templateContainer = templatesContainer;
        this.histogramRecorder = histogramRecorder;
        this.divParsingHistogramProxy = aVar;
        this.cardErrorFactory = cardErrorLoggerFactory;
    }
}
