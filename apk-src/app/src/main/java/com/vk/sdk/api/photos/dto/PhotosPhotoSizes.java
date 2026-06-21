package com.vk.sdk.api.photos.dto;

import a0.u;
import gf.a;
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
public final class PhotosPhotoSizes {

    @b("height")
    private final int height;

    @b("src")
    @Nullable
    private final String src;

    @b("type")
    @NotNull
    private final PhotosPhotoSizesType type;

    @b("url")
    @NotNull
    private final String url;

    @b("width")
    private final int width;

    public PhotosPhotoSizes(int i, @NotNull String url, @NotNull PhotosPhotoSizesType type, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        this.height = i;
        this.url = url;
        this.type = type;
        this.width = i10;
        this.src = str;
    }

    public static /* synthetic */ PhotosPhotoSizes copy$default(PhotosPhotoSizes photosPhotoSizes, int i, String str, PhotosPhotoSizesType photosPhotoSizesType, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = photosPhotoSizes.height;
        }
        if ((i11 & 2) != 0) {
            str = photosPhotoSizes.url;
        }
        if ((i11 & 4) != 0) {
            photosPhotoSizesType = photosPhotoSizes.type;
        }
        if ((i11 & 8) != 0) {
            i10 = photosPhotoSizes.width;
        }
        if ((i11 & 16) != 0) {
            str2 = photosPhotoSizes.src;
        }
        String str3 = str2;
        PhotosPhotoSizesType photosPhotoSizesType2 = photosPhotoSizesType;
        return photosPhotoSizes.copy(i, str, photosPhotoSizesType2, i10, str3);
    }

    public final int component1() {
        return this.height;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final PhotosPhotoSizesType component3() {
        return this.type;
    }

    public final int component4() {
        return this.width;
    }

    @Nullable
    public final String component5() {
        return this.src;
    }

    @NotNull
    public final PhotosPhotoSizes copy(int i, @NotNull String url, @NotNull PhotosPhotoSizesType type, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PhotosPhotoSizes(i, url, type, i10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoSizes)) {
            return false;
        }
        PhotosPhotoSizes photosPhotoSizes = (PhotosPhotoSizes) obj;
        return this.height == photosPhotoSizes.height && Intrinsics.a(this.url, photosPhotoSizes.url) && this.type == photosPhotoSizes.type && this.width == photosPhotoSizes.width && Intrinsics.a(this.src, photosPhotoSizes.src);
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getSrc() {
        return this.src;
    }

    @NotNull
    public final PhotosPhotoSizesType getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iG = u.g(this.width, (this.type.hashCode() + a.e(Integer.hashCode(this.height) * 31, 31, this.url)) * 31, 31);
        String str = this.src;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.height;
        String str = this.url;
        PhotosPhotoSizesType photosPhotoSizesType = this.type;
        int i10 = this.width;
        String str2 = this.src;
        StringBuilder sbI = pe.a.i(i, "PhotosPhotoSizes(height=", ", url=", str, ", type=");
        sbI.append(photosPhotoSizesType);
        sbI.append(", width=");
        sbI.append(i10);
        sbI.append(", src=");
        return u.o(sbI, str2, ")");
    }

    public /* synthetic */ PhotosPhotoSizes(int i, String str, PhotosPhotoSizesType photosPhotoSizesType, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, photosPhotoSizesType, i10, (i11 & 16) != 0 ? null : str2);
    }
}
