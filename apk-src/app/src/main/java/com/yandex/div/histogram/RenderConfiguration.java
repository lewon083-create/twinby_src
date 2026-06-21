package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class RenderConfiguration {

    @NotNull
    private final HistogramFilter drawFilter;

    @NotNull
    private final HistogramFilter layoutFilter;

    @NotNull
    private final HistogramFilter measureFilter;

    @NotNull
    private final HistogramFilter totalFilter;

    public RenderConfiguration(@NotNull HistogramFilter histogramFilter, @NotNull HistogramFilter histogramFilter2, @NotNull HistogramFilter histogramFilter3, @NotNull HistogramFilter histogramFilter4) {
        this.measureFilter = histogramFilter;
        this.layoutFilter = histogramFilter2;
        this.drawFilter = histogramFilter3;
        this.totalFilter = histogramFilter4;
    }

    public /* synthetic */ RenderConfiguration(HistogramFilter histogramFilter, HistogramFilter histogramFilter2, HistogramFilter histogramFilter3, HistogramFilter histogramFilter4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter, (i & 2) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter2, (i & 4) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter3, (i & 8) != 0 ? HistogramFilter.Companion.getON() : histogramFilter4);
    }
}
