package com.yandex.div.json;

import com.yandex.div.internal.util.JsonNode;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public class ParsingException extends RuntimeException {

    @Nullable
    private final String jsonSummary;

    @NotNull
    private final ParsingExceptionReason reason;

    @Nullable
    private final JsonNode source;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th2, JsonNode jsonNode, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingExceptionReason, str, (i & 4) != 0 ? null : th2, (i & 8) != 0 ? null : jsonNode, (i & 16) != 0 ? null : str2);
    }

    @NotNull
    public ParsingExceptionReason getReason() {
        return this.reason;
    }

    public ParsingException(@NotNull ParsingExceptionReason parsingExceptionReason, @NotNull String str, @Nullable Throwable th2, @Nullable JsonNode jsonNode, @Nullable String str2) {
        super(str, th2);
        this.reason = parsingExceptionReason;
        this.source = jsonNode;
        this.jsonSummary = str2;
    }
}
