package com.vk.api.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.api.sdk.VKKeyValueStorage;
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
public final class VKPreferencesKeyValueStorage implements VKKeyValueStorage {
    public static final Companion Companion = new Companion(null);
    private static final String PREFERENCE_NAME = "com.vkontakte.android_pref_name";
    private final SharedPreferences prefs;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VKPreferencesKeyValueStorage(Context context, String prefsName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefsName, "prefsName");
        this.prefs = context.getSharedPreferences(prefsName, 0);
    }

    @Override // com.vk.api.sdk.VKKeyValueStorage
    public String get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getString(key, null);
    }

    @Override // com.vk.api.sdk.VKKeyValueStorage
    public void put(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.prefs.edit().putString(key, value).apply();
    }

    @Override // com.vk.api.sdk.VKKeyValueStorage
    public void putOrRemove(String str, String str2) {
        VKKeyValueStorage.DefaultImpls.putOrRemove(this, str, str2);
    }

    @Override // com.vk.api.sdk.VKKeyValueStorage
    public void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.prefs.edit().remove(key).apply();
    }

    public /* synthetic */ VKPreferencesKeyValueStorage(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? PREFERENCE_NAME : str);
    }
}
