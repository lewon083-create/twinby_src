package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.ArrayList;
import java.util.List;
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
final class ErrorCollectingParsingContext implements ParsingContext, ParsingContextWrapper {

    @NotNull
    private final ParsingContext baseContext;

    @NotNull
    private final List<Exception> errors = new ArrayList();

    @NotNull
    private final ParsingErrorLogger logger = new ParsingErrorLogger() { // from class: com.yandex.div.serialization.a
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            ErrorCollectingParsingContext.logger$lambda$0(this.f15267a, exc);
        }
    };

    public ErrorCollectingParsingContext(@NotNull ParsingContext parsingContext) {
        this.baseContext = parsingContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logger$lambda$0(ErrorCollectingParsingContext errorCollectingParsingContext, Exception exc) {
        errorCollectingParsingContext.errors.add(exc);
        errorCollectingParsingContext.getBaseContext().getLogger().logError(exc);
    }

    @Override // com.yandex.div.serialization.ParsingContext
    public boolean getAllowPropertyOverride() {
        return this.baseContext.getAllowPropertyOverride();
    }

    @Override // com.yandex.div.serialization.ParsingContextWrapper
    @NotNull
    public ParsingContext getBaseContext() {
        return this.baseContext;
    }

    @NotNull
    public final List<Exception> getErrors() {
        return this.errors;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public TemplateProvider<EntityTemplate<?>> getTemplates() {
        return this.baseContext.getTemplates();
    }
}
