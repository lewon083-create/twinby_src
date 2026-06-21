package com.yandex.varioqub.config;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public interface VarioqubApi {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void activateConfig$default(VarioqubApi varioqubApi, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activateConfig");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            varioqubApi.activateConfig(function0);
        }

        public static /* synthetic */ boolean getBoolean$default(VarioqubApi varioqubApi, String str, boolean z5, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
            }
            if ((i & 2) != 0) {
                z5 = false;
            }
            return varioqubApi.getBoolean(str, z5);
        }

        public static /* synthetic */ double getDouble$default(VarioqubApi varioqubApi, String str, double d10, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDouble");
            }
            if ((i & 2) != 0) {
                d10 = ConfigValue.DOUBLE_DEFAULT_VALUE;
            }
            return varioqubApi.getDouble(str, d10);
        }

        public static /* synthetic */ long getLong$default(VarioqubApi varioqubApi, String str, long j10, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i & 2) != 0) {
                j10 = 0;
            }
            return varioqubApi.getLong(str, j10);
        }

        public static /* synthetic */ String getString$default(VarioqubApi varioqubApi, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return varioqubApi.getString(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setDefaults$default(VarioqubApi varioqubApi, int i, Function0 function0, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDefaults");
            }
            if ((i10 & 2) != 0) {
                function0 = null;
            }
            varioqubApi.setDefaults(i, function0);
        }
    }

    void activateConfig(@Nullable Function0<Unit> function0);

    void clearClientFeatures();

    void fetchConfig(@Nullable OnFetchCompleteListener onFetchCompleteListener);

    @NotNull
    Set<String> getAllKeys();

    boolean getBoolean(@NotNull String str, boolean z5);

    double getDouble(@NotNull String str, double d10);

    @NotNull
    String getId();

    long getLong(@NotNull String str, long j10);

    @NotNull
    String getString(@NotNull String str, @NotNull String str2);

    @Nullable
    ConfigValue getValue(@NotNull String str);

    void init(@NotNull VarioqubSettings varioqubSettings, @NotNull VarioqubConfigAdapter varioqubConfigAdapter, @NotNull Context context);

    void putClientFeature(@NotNull String str, @NotNull String str2);

    void setDefaults(int i, @Nullable Function0<Unit> function0);

    void setDefaults(@NotNull Map<String, ? extends Object> map);
}
