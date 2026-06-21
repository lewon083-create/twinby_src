package com.yandex.div.storage.templates;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import hj.a;
import ij.g;
import ij.h;
import java.util.LinkedHashMap;
import java.util.Map;
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
public class TemplatesContainer {

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final ParsingErrorLogger errorLogger;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final a parsingHistogramProxy;

    @NotNull
    private final CommonTemplatesPool templatesPool;

    @Nullable
    private final String histogramComponentName = null;

    @NotNull
    private final Map<String, Object> groupTemplateReferences = new LinkedHashMap();

    @NotNull
    private final Map<String, DivParsingEnvironment> templateEnvironments = new LinkedHashMap();

    @NotNull
    private final g messageDigest$delegate = h.b(new TemplatesContainer$messageDigest$2(this));

    public TemplatesContainer(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull HistogramRecorder histogramRecorder, @NotNull a aVar, @Nullable HistogramNameProvider histogramNameProvider) {
        this.divStorage = divStorage;
        this.errorLogger = parsingErrorLogger;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = aVar;
        this.templatesPool = new CommonTemplatesPool(divStorage, parsingErrorLogger, null, histogramRecorder, aVar);
    }
}
