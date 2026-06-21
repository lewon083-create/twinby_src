package com.yandex.div.internal.parser;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
public abstract class ParsingConvertersKt {

    @NotNull
    public static final Function1<Integer, String> COLOR_INT_TO_STRING = ParsingConvertersKt$COLOR_INT_TO_STRING$1.INSTANCE;

    @NotNull
    public static final Function1<Object, Integer> STRING_TO_COLOR_INT = ParsingConvertersKt$STRING_TO_COLOR_INT$1.INSTANCE;

    @NotNull
    public static final Function1<Uri, String> URI_TO_STRING = ParsingConvertersKt$URI_TO_STRING$1.INSTANCE;

    @NotNull
    public static final Function1<String, Uri> STRING_TO_URI = ParsingConvertersKt$STRING_TO_URI$1.INSTANCE;

    @NotNull
    public static final Function1<Object, Uri> ANY_TO_URI = ParsingConvertersKt$ANY_TO_URI$1.INSTANCE;

    @NotNull
    public static final Function1<Object, Boolean> ANY_TO_BOOLEAN = ParsingConvertersKt$ANY_TO_BOOLEAN$1.INSTANCE;

    @NotNull
    public static final Function1<Number, Double> NUMBER_TO_DOUBLE = ParsingConvertersKt$NUMBER_TO_DOUBLE$1.INSTANCE;

    @NotNull
    public static final Function1<Number, Long> NUMBER_TO_INT = ParsingConvertersKt$NUMBER_TO_INT$1.INSTANCE;
}
