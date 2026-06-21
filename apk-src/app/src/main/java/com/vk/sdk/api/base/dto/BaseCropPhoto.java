package com.vk.sdk.api.base.dto;

import com.vk.sdk.api.photos.dto.PhotosPhoto;
import kotlin.Metadata;
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
public final class BaseCropPhoto {

    @b("crop")
    @NotNull
    private final BaseCropPhotoCrop crop;

    @b("photo")
    @NotNull
    private final PhotosPhoto photo;

    @b("rect")
    @NotNull
    private final BaseCropPhotoRect rect;

    public BaseCropPhoto(@NotNull PhotosPhoto photo, @NotNull BaseCropPhotoCrop crop, @NotNull BaseCropPhotoRect rect) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(crop, "crop");
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.photo = photo;
        this.crop = crop;
        this.rect = rect;
    }

    public static /* synthetic */ BaseCropPhoto copy$default(BaseCropPhoto baseCropPhoto, PhotosPhoto photosPhoto, BaseCropPhotoCrop baseCropPhotoCrop, BaseCropPhotoRect baseCropPhotoRect, int i, Object obj) {
        if ((i & 1) != 0) {
            photosPhoto = baseCropPhoto.photo;
        }
        if ((i & 2) != 0) {
            baseCropPhotoCrop = baseCropPhoto.crop;
        }
        if ((i & 4) != 0) {
            baseCropPhotoRect = baseCropPhoto.rect;
        }
        return baseCropPhoto.copy(photosPhoto, baseCropPhotoCrop, baseCropPhotoRect);
    }

    @NotNull
    public final PhotosPhoto component1() {
        return this.photo;
    }

    @NotNull
    public final BaseCropPhotoCrop component2() {
        return this.crop;
    }

    @NotNull
    public final BaseCropPhotoRect component3() {
        return this.rect;
    }

    @NotNull
    public final BaseCropPhoto copy(@NotNull PhotosPhoto photo, @NotNull BaseCropPhotoCrop crop, @NotNull BaseCropPhotoRect rect) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(crop, "crop");
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new BaseCropPhoto(photo, crop, rect);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCropPhoto)) {
            return false;
        }
        BaseCropPhoto baseCropPhoto = (BaseCropPhoto) obj;
        return Intrinsics.a(this.photo, baseCropPhoto.photo) && Intrinsics.a(this.crop, baseCropPhoto.crop) && Intrinsics.a(this.rect, baseCropPhoto.rect);
    }

    @NotNull
    public final BaseCropPhotoCrop getCrop() {
        return this.crop;
    }

    @NotNull
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @NotNull
    public final BaseCropPhotoRect getRect() {
        return this.rect;
    }

    public int hashCode() {
        return this.rect.hashCode() + ((this.crop.hashCode() + (this.photo.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "BaseCropPhoto(photo=" + this.photo + ", crop=" + this.crop + ", rect=" + this.rect + ")";
    }
}
