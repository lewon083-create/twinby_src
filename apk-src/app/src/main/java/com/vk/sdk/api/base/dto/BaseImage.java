package com.vk.sdk.api.base.dto;

import a0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
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
public final class BaseImage {

    @b("height")
    private final int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final String f15143id;

    @b("url")
    @NotNull
    private final String url;

    @b("width")
    private final int width;

    public BaseImage(@NotNull String url, int i, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.width = i;
        this.height = i10;
        this.f15143id = str;
    }

    public static /* synthetic */ BaseImage copy$default(BaseImage baseImage, String str, int i, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = baseImage.url;
        }
        if ((i11 & 2) != 0) {
            i = baseImage.width;
        }
        if ((i11 & 4) != 0) {
            i10 = baseImage.height;
        }
        if ((i11 & 8) != 0) {
            str2 = baseImage.f15143id;
        }
        return baseImage.copy(str, i, i10, str2);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    @Nullable
    public final String component4() {
        return this.f15143id;
    }

    @NotNull
    public final BaseImage copy(@NotNull String url, int i, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new BaseImage(url, i, i10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseImage)) {
            return false;
        }
        BaseImage baseImage = (BaseImage) obj;
        return Intrinsics.a(this.url, baseImage.url) && this.width == baseImage.width && this.height == baseImage.height && Intrinsics.a(this.f15143id, baseImage.f15143id);
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getId() {
        return this.f15143id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iG = u.g(this.height, u.g(this.width, this.url.hashCode() * 31, 31), 31);
        String str = this.f15143id;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "BaseImage(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ", id=" + this.f15143id + ")";
    }

    public /* synthetic */ BaseImage(String str, int i, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i10, (i11 & 8) != 0 ? null : str2);
    }
}
