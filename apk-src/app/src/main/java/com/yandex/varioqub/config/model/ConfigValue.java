package com.yandex.varioqub.config.model;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class ConfigValue {
    public static final boolean BOOLEAN_DEFAULT_VALUE = false;
    public static final double DOUBLE_DEFAULT_VALUE = 0.0d;
    public static final long LONG_DEFAULT_VALUE = 0;
    public static final int SOURCE_DEFAULT = 0;
    public static final int SOURCE_INAPP_DEFAULT = 1;
    public static final int SOURCE_SERVER = 2;

    @NotNull
    public static final String STRING_DEFAULT_VALUE = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15430c;

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f15427d = Pattern.compile("^(true|false)$", 2);

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final ConfigValue createDefault$config_release() {
            return new ConfigValue("", 0, 0L, 4, null);
        }

        @NotNull
        public final ConfigValue createInappDefault$config_release(@NotNull String str) {
            return new ConfigValue(str, 1, 0L, 4, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ConfigValue(@Nullable String str, int i, long j10) {
        this.f15428a = str;
        this.f15429b = i;
        this.f15430c = j10;
    }

    public final boolean asBoolean() {
        if (this.f15429b == 0) {
            return false;
        }
        Pattern pattern = f15427d;
        String str = this.f15428a;
        if (str == null) {
            str = "";
        }
        if (pattern.matcher(str).matches()) {
            return Boolean.parseBoolean(this.f15428a);
        }
        if (this.f15429b == 1) {
            return false;
        }
        throw new IllegalArgumentException(u.o(new StringBuilder("Value "), this.f15428a, " cannot be converted to type Boolean"));
    }

    public final double asDouble() {
        if (this.f15429b == 0) {
            return DOUBLE_DEFAULT_VALUE;
        }
        try {
            String str = this.f15428a;
            return str != null ? Double.parseDouble(str) : DOUBLE_DEFAULT_VALUE;
        } catch (NumberFormatException unused) {
            if (this.f15429b == 1) {
                return DOUBLE_DEFAULT_VALUE;
            }
            throw new IllegalArgumentException(u.o(new StringBuilder("Value "), this.f15428a, " cannot be converted to type Double"));
        }
    }

    public final long asLong() {
        if (this.f15429b == 0) {
            return 0L;
        }
        try {
            String str = this.f15428a;
            if (str != null) {
                return Long.parseLong(str);
            }
            return 0L;
        } catch (NumberFormatException unused) {
            if (this.f15429b == 1) {
                return 0L;
            }
            throw new IllegalArgumentException(u.o(new StringBuilder("Value "), this.f15428a, " cannot be converted to type Long"));
        }
    }

    @NotNull
    public final String asString() {
        String str;
        return (this.f15429b == 0 || (str = this.f15428a) == null) ? "" : str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ConfigValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
        }
        ConfigValue configValue = (ConfigValue) obj;
        return Intrinsics.a(this.f15428a, configValue.f15428a) && this.f15429b == configValue.f15429b && this.f15430c == configValue.f15430c;
    }

    public final int getSourceType() {
        return this.f15429b;
    }

    public final long getTestId() {
        return this.f15430c;
    }

    @Nullable
    public final String getValue() {
        return this.f15428a;
    }

    public int hashCode() {
        String str = this.f15428a;
        return Long.hashCode(this.f15430c) + ((((str != null ? str.hashCode() : 0) * 31) + this.f15429b) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigValue(value='");
        sb2.append(this.f15428a);
        sb2.append("', sourceType=");
        sb2.append(this.f15429b);
        sb2.append(", testId=");
        return om1.m(sb2, this.f15430c, ')');
    }

    public /* synthetic */ ConfigValue(String str, int i, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i10 & 4) != 0 ? -1L : j10);
    }
}
