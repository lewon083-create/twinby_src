package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class NativeAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f15292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f15293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f15294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15295h;
    private final AdTheme i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f15296j;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f15298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f15299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f15300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f15301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f15302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f15303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f15304h;
        private AdTheme i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f15305j = true;

        public Builder(@NotNull String str) {
            this.f15297a = str;
        }

        @NotNull
        public final NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this.f15297a, this.f15298b, this.f15299c, this.f15301e, this.f15302f, this.f15300d, this.f15303g, this.f15304h, this.i, this.f15305j, null);
        }

        @NotNull
        public final Builder setParameters(@NotNull Map<String, String> map) {
            this.f15303g = map;
            return this;
        }
    }

    public /* synthetic */ NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme, z5);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f15288a;
    }

    @Nullable
    public final String getAge() {
        return this.f15289b;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f15295h;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f15291d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f15292e;
    }

    @Nullable
    public final String getGender() {
        return this.f15290c;
    }

    @Nullable
    public final Location getLocation() {
        return this.f15293f;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f15294g;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.i;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.f15296j;
    }

    private NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z5) {
        this.f15288a = str;
        this.f15289b = str2;
        this.f15290c = str3;
        this.f15291d = str4;
        this.f15292e = list;
        this.f15293f = location;
        this.f15294g = map;
        this.f15295h = str5;
        this.i = adTheme;
        this.f15296j = z5;
    }
}
