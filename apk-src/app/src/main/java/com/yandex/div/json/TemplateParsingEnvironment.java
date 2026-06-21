package com.yandex.div.json;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ParsingEnvironmentImpl;
import com.yandex.div.internal.parser.TemplateParsingErrorLogger;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public abstract class TemplateParsingEnvironment<T extends JsonTemplate<?>> implements ParsingEnvironment {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final CachingTemplateProvider<T> mainTemplateProvider;

    @NotNull
    private final TemplateProvider<T> templates;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public interface TemplateFactory<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class TemplateParsingResult<T> {

        @NotNull
        private final Map<String, T> parsedTemplates;

        @NotNull
        private final Map<String, Set<String>> templateDependencies;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateParsingResult(@NotNull Map<String, ? extends T> map, @NotNull Map<String, ? extends Set<String>> map2) {
            this.parsedTemplates = map;
            this.templateDependencies = map2;
        }

        @NotNull
        public final Map<String, T> getParsedTemplates() {
            return this.parsedTemplates;
        }
    }

    public TemplateParsingEnvironment(@NotNull ParsingErrorLogger parsingErrorLogger, @NotNull CachingTemplateProvider<T> cachingTemplateProvider) {
        this.logger = parsingErrorLogger;
        this.mainTemplateProvider = cachingTemplateProvider;
        this.templates = cachingTemplateProvider;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @NotNull
    public abstract TemplateFactory<T> getTemplateFactory();

    public final void parseTemplates(@NotNull JSONObject jSONObject) {
        this.mainTemplateProvider.putAll(parseTemplatesWithResult(jSONObject));
    }

    @NotNull
    public final Map<String, T> parseTemplatesWithResult(@NotNull JSONObject jSONObject) {
        return parseTemplatesWithResultAndDependencies(jSONObject).getParsedTemplates();
    }

    @NotNull
    public final TemplateParsingResult<T> parseTemplatesWithResultAndDependencies(@NotNull JSONObject jSONObject) {
        Map<String, T> mapArrayMap = CollectionsKt.arrayMap();
        Map mapArrayMap2 = CollectionsKt.arrayMap();
        try {
            Map<String, Set<String>> mapSort = JsonTopologicalSorting.INSTANCE.sort(this, jSONObject);
            this.mainTemplateProvider.takeSnapshot(mapArrayMap);
            TemplateProvider templateProviderWrap = TemplateProvider.Companion.wrap(mapArrayMap);
            for (Map.Entry<String, Set<String>> entry : mapSort.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                try {
                    ParsingEnvironmentImpl parsingEnvironmentImpl = new ParsingEnvironmentImpl(templateProviderWrap, new TemplateParsingErrorLogger(getLogger(), key));
                    TemplateFactory<T> templateFactory = getTemplateFactory();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    ((a) templateFactory).getClass();
                    mapArrayMap.put(key, DivParsingEnvironment.templateFactory$lambda$0(parsingEnvironmentImpl, true, jSONObject2));
                    if (!value.isEmpty()) {
                        mapArrayMap2.put(key, value);
                    }
                } catch (ParsingException e3) {
                    getLogger().logTemplateError(e3, key);
                }
            }
        } catch (Exception e7) {
            getLogger().logError(e7);
        }
        return new TemplateParsingResult<>(mapArrayMap, mapArrayMap2);
    }
}
