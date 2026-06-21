package com.yandex.varioqub.config;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.config.impl.A;
import com.yandex.varioqub.config.impl.B;
import com.yandex.varioqub.config.model.ConfigValue;
import ij.g;
import ij.h;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class Varioqub {

    @NotNull
    public static final Varioqub INSTANCE = new Varioqub();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f15332a = h.b(A.f15346a);

    private Varioqub() {
    }

    public static final void activateConfig(@Nullable Function0<Unit> function0) {
        getInstance().activateConfig(function0);
    }

    public static /* synthetic */ void activateConfig$default(Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        activateConfig(function0);
    }

    public static final void clearClientFeatures() {
        getInstance().clearClientFeatures();
    }

    public static final void fetchConfig(@Nullable OnFetchCompleteListener onFetchCompleteListener) {
        getInstance().fetchConfig(onFetchCompleteListener);
    }

    @NotNull
    public static final Set<String> getAllKeys() {
        return getInstance().getAllKeys();
    }

    public static final boolean getBoolean(@NotNull String str, boolean z5) {
        return getInstance().getBoolean(str, z5);
    }

    public static /* synthetic */ boolean getBoolean$default(String str, boolean z5, int i, Object obj) {
        if ((i & 2) != 0) {
            z5 = false;
        }
        return getBoolean(str, z5);
    }

    public static final double getDouble(@NotNull String str, double d10) {
        return getInstance().getDouble(str, d10);
    }

    public static /* synthetic */ double getDouble$default(String str, double d10, int i, Object obj) {
        if ((i & 2) != 0) {
            d10 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        return getDouble(str, d10);
    }

    @NotNull
    public static final String getId() {
        return getInstance().getId();
    }

    @NotNull
    public static final VarioqubApi getInstance() {
        INSTANCE.getClass();
        return (B) f15332a.getValue();
    }

    public static final long getLong(@NotNull String str, long j10) {
        return getInstance().getLong(str, j10);
    }

    public static /* synthetic */ long getLong$default(String str, long j10, int i, Object obj) {
        if ((i & 2) != 0) {
            j10 = 0;
        }
        return getLong(str, j10);
    }

    @NotNull
    public static final String getString(@NotNull String str, @NotNull String str2) {
        return getInstance().getString(str, str2);
    }

    public static /* synthetic */ String getString$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return getString(str, str2);
    }

    @Nullable
    public static final ConfigValue getValue(@NotNull String str) {
        return getInstance().getValue(str);
    }

    public static final void init(@NotNull VarioqubSettings varioqubSettings, @NotNull VarioqubConfigAdapter varioqubConfigAdapter, @NotNull Context context) {
        getInstance().init(varioqubSettings, varioqubConfigAdapter, context);
    }

    public static final void putClientFeature(@NotNull String str, @NotNull String str2) {
        getInstance().putClientFeature(str, str2);
    }

    public static final void setDefaults(@NotNull Map<String, ? extends Object> map) {
        getInstance().setDefaults(map);
    }

    public static /* synthetic */ void setDefaults$default(int i, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        setDefaults(i, function0);
    }

    public static final void setDefaults(int i, @Nullable Function0<Unit> function0) {
        getInstance().setDefaults(i, function0);
    }
}
