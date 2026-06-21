package com.vk.sdk.api.classifieds.dto;

import com.vk.sdk.api.photos.dto.PhotosPhoto;
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
public final class ClassifiedsYoulaItemPhoto {

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("url")
    @Nullable
    private final String url;

    public ClassifiedsYoulaItemPhoto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ClassifiedsYoulaItemPhoto copy$default(ClassifiedsYoulaItemPhoto classifiedsYoulaItemPhoto, PhotosPhoto photosPhoto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            photosPhoto = classifiedsYoulaItemPhoto.photo;
        }
        if ((i & 2) != 0) {
            str = classifiedsYoulaItemPhoto.url;
        }
        return classifiedsYoulaItemPhoto.copy(photosPhoto, str);
    }

    @Nullable
    public final PhotosPhoto component1() {
        return this.photo;
    }

    @Nullable
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final ClassifiedsYoulaItemPhoto copy(@Nullable PhotosPhoto photosPhoto, @Nullable String str) {
        return new ClassifiedsYoulaItemPhoto(photosPhoto, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemPhoto)) {
            return false;
        }
        ClassifiedsYoulaItemPhoto classifiedsYoulaItemPhoto = (ClassifiedsYoulaItemPhoto) obj;
        return Intrinsics.a(this.photo, classifiedsYoulaItemPhoto.photo) && Intrinsics.a(this.url, classifiedsYoulaItemPhoto.url);
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode = (photosPhoto == null ? 0 : photosPhoto.hashCode()) * 31;
        String str = this.url;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ClassifiedsYoulaItemPhoto(photo=" + this.photo + ", url=" + this.url + ")";
    }

    public ClassifiedsYoulaItemPhoto(@Nullable PhotosPhoto photosPhoto, @Nullable String str) {
        this.photo = photosPhoto;
        this.url = str;
    }

    public /* synthetic */ ClassifiedsYoulaItemPhoto(PhotosPhoto photosPhoto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : photosPhoto, (i & 2) != 0 ? null : str);
    }
}
