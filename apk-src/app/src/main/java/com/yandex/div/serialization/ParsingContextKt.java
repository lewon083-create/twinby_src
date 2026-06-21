package com.yandex.div.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b0;
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
public abstract class ParsingContextKt {
    @NotNull
    public static final ParsingContext collectingErrors(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? parsingContext : new ErrorCollectingParsingContext(parsingContext);
    }

    @NotNull
    public static final List<Exception> getCollectedErrors(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? ((ErrorCollectingParsingContext) parsingContext).getErrors() : parsingContext instanceof ParsingContextWrapper ? getCollectedErrors(((ParsingContextWrapper) parsingContext).getBaseContext()) : b0.f27475b;
    }

    @NotNull
    public static final ParsingContext restrictPropertyOverride(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof OverrideRestrictingParsingContext ? parsingContext : new OverrideRestrictingParsingContext(parsingContext);
    }
}
