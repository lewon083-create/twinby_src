package com.vk.api.sdk;

import com.vk.api.sdk.VKKeyValueStorage;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class VKCachedKeyValueStorage implements VKKeyValueStorage {
    public static final Companion Companion = new Companion(null);
    private static final String NULL_STRING = new String();
    private final Map<String, String> cache;
    private final VKKeyValueStorage storage;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VKCachedKeyValueStorage(VKKeyValueStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        this.cache = new ConcurrentHashMap();
    }

    private final String getFromStorage(String str) {
        String str2 = this.storage.get(str);
        this.cache.put(str, str2 == null ? NULL_STRING : str2);
        return str2;
    }

    @Override // com.vk.api.sdk.VKKeyValueStorage
    public String get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = this.cache.get(key);
        if (str != NULL_STRING) {
            return str == null ? getFromStorage(key) : str;
        }
        return null;
    }

    @Override // com.vk.api.sdk.VKKeyValueStorage
    public void put(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.a(this.cache.get(key), value)) {
            return;
        }
        this.cache.put(key, value);
        this.storage.put(key, value);
    }

    @Override // com.vk.api.sdk.VKKeyValueStorage
    public void putOrRemove(String str, String str2) {
        VKKeyValueStorage.DefaultImpls.putOrRemove(this, str, str2);
    }

    @Override // com.vk.api.sdk.VKKeyValueStorage
    public void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = this.cache.get(key);
        String str2 = NULL_STRING;
        if (str != str2) {
            this.cache.put(key, str2);
            this.storage.remove(key);
        }
    }
}
