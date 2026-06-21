package com.vk.sdk.api.photos.dto;

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
public final class PhotosImage {

    @b("height")
    @Nullable
    private final Integer height;

    @b("type")
    @Nullable
    private final PhotosImageType type;

    @b("url")
    @Nullable
    private final String url;

    @b("width")
    @Nullable
    private final Integer width;

    public PhotosImage() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ PhotosImage copy$default(PhotosImage photosImage, Integer num, PhotosImageType photosImageType, String str, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = photosImage.height;
        }
        if ((i & 2) != 0) {
            photosImageType = photosImage.type;
        }
        if ((i & 4) != 0) {
            str = photosImage.url;
        }
        if ((i & 8) != 0) {
            num2 = photosImage.width;
        }
        return photosImage.copy(num, photosImageType, str, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.height;
    }

    @Nullable
    public final PhotosImageType component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final Integer component4() {
        return this.width;
    }

    @NotNull
    public final PhotosImage copy(@Nullable Integer num, @Nullable PhotosImageType photosImageType, @Nullable String str, @Nullable Integer num2) {
        return new PhotosImage(num, photosImageType, str, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosImage)) {
            return false;
        }
        PhotosImage photosImage = (PhotosImage) obj;
        return Intrinsics.a(this.height, photosImage.height) && this.type == photosImage.type && Intrinsics.a(this.url, photosImage.url) && Intrinsics.a(this.width, photosImage.width);
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final PhotosImageType getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.height;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        PhotosImageType photosImageType = this.type;
        int iHashCode2 = (iHashCode + (photosImageType == null ? 0 : photosImageType.hashCode())) * 31;
        String str = this.url;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.width;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PhotosImage(height=" + this.height + ", type=" + this.type + ", url=" + this.url + ", width=" + this.width + ")";
    }

    public PhotosImage(@Nullable Integer num, @Nullable PhotosImageType photosImageType, @Nullable String str, @Nullable Integer num2) {
        this.height = num;
        this.type = photosImageType;
        this.url = str;
        this.width = num2;
    }

    public /* synthetic */ PhotosImage(Integer num, PhotosImageType photosImageType, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : photosImageType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2);
    }
}
