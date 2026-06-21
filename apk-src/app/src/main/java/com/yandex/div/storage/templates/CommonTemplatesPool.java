package com.yandex.div.storage.templates;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramRecorder;
import fh.hs;
import hj.a;
import java.util.concurrent.ConcurrentHashMap;
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
final class CommonTemplatesPool {

    @NotNull
    private final ConcurrentHashMap<String, hs> commonTemplates = new ConcurrentHashMap<>();

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final DivParsingEnvironment env;

    @Nullable
    private final String histogramComponent;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final a parsingHistogramProxy;

    public CommonTemplatesPool(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger parsingErrorLogger, @Nullable String str, @NotNull HistogramRecorder histogramRecorder, @NotNull a aVar) {
        this.divStorage = divStorage;
        this.histogramComponent = str;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = aVar;
        this.env = TemplatesContainerKt.createEmptyEnv(parsingErrorLogger);
    }
}
