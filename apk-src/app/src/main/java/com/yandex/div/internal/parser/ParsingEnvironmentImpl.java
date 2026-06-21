package com.yandex.div.internal.parser;

import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
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
public final class ParsingEnvironmentImpl implements ParsingEnvironment {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final TemplateProvider<JsonTemplate<?>> templates;

    /* JADX WARN: Multi-variable type inference failed */
    public ParsingEnvironmentImpl(@NotNull TemplateProvider<? extends JsonTemplate<?>> templateProvider, @NotNull ParsingErrorLogger parsingErrorLogger) {
        this.templates = templateProvider;
        this.logger = parsingErrorLogger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public TemplateProvider<JsonTemplate<?>> getTemplates() {
        return this.templates;
    }
}
