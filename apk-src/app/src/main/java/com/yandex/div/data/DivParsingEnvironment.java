package com.yandex.div.data;

import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import com.yandex.div.serialization.BuiltInParserKt;
import fh.hs;
import fh.th;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import zf.a;

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
public class DivParsingEnvironment extends TemplateParsingEnvironment<hs> {

    @NotNull
    private final TemplateParsingEnvironment.TemplateFactory<hs> templateFactory;

    @NotNull
    private final CachingTemplateProvider<hs> templates;

    public /* synthetic */ DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider cachingTemplateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingErrorLogger, (i & 2) != 0 ? new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.Companion.empty()) : cachingTemplateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs templateFactory$lambda$0(ParsingEnvironment parsingEnvironment, boolean z5, JSONObject jSONObject) {
        return ((th) BuiltInParserKt.getBuiltInParserComponent().f18541t9.getValue()).deserialize(parsingEnvironment, jSONObject);
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment
    @NotNull
    public TemplateParsingEnvironment.TemplateFactory<hs> getTemplateFactory() {
        return this.templateFactory;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public CachingTemplateProvider<hs> getTemplates() {
        return this.templates;
    }

    public DivParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull CachingTemplateProvider<hs> cachingTemplateProvider) {
        super(parsingErrorLogger, cachingTemplateProvider);
        this.templates = cachingTemplateProvider;
        this.templateFactory = new a(12);
    }
}
