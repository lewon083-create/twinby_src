package com.yandex.div.json.templates;

import com.yandex.div.json.JsonTemplate;
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
public class CachingTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {

    @NotNull
    private final InMemoryTemplateProvider<T> cacheProvider;

    @NotNull
    private TemplateProvider<? extends T> fallbackProvider;

    public CachingTemplateProvider(@NotNull InMemoryTemplateProvider<T> inMemoryTemplateProvider, @NotNull TemplateProvider<? extends T> templateProvider) {
        this.cacheProvider = inMemoryTemplateProvider;
        this.fallbackProvider = templateProvider;
    }

    public void putAll(@NotNull Map<String, ? extends T> map) {
        for (Map.Entry<String, ? extends T> entry : map.entrySet()) {
            this.cacheProvider.put$div_data_release(entry.getKey(), entry.getValue());
        }
    }

    public void takeSnapshot(@NotNull Map<String, T> map) {
        this.cacheProvider.takeSnapshot$div_data_release(map);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @Nullable
    public T get(@NotNull String str) {
        T t10 = (T) this.cacheProvider.get(str);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) this.fallbackProvider.get(str);
        if (t11 == null) {
            return null;
        }
        this.cacheProvider.put$div_data_release(str, t11);
        return t11;
    }
}
