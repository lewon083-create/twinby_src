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
public final class ClassifiedsYoulaGroupsBlockProduct {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final String f15153id;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    public ClassifiedsYoulaGroupsBlockProduct(@NotNull String id2, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f15153id = id2;
        this.photo = photosPhoto;
    }

    public static /* synthetic */ ClassifiedsYoulaGroupsBlockProduct copy$default(ClassifiedsYoulaGroupsBlockProduct classifiedsYoulaGroupsBlockProduct, String str, PhotosPhoto photosPhoto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classifiedsYoulaGroupsBlockProduct.f15153id;
        }
        if ((i & 2) != 0) {
            photosPhoto = classifiedsYoulaGroupsBlockProduct.photo;
        }
        return classifiedsYoulaGroupsBlockProduct.copy(str, photosPhoto);
    }

    @NotNull
    public final String component1() {
        return this.f15153id;
    }

    @Nullable
    public final PhotosPhoto component2() {
        return this.photo;
    }

    @NotNull
    public final ClassifiedsYoulaGroupsBlockProduct copy(@NotNull String id2, @Nullable PhotosPhoto photosPhoto) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new ClassifiedsYoulaGroupsBlockProduct(id2, photosPhoto);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaGroupsBlockProduct)) {
            return false;
        }
        ClassifiedsYoulaGroupsBlockProduct classifiedsYoulaGroupsBlockProduct = (ClassifiedsYoulaGroupsBlockProduct) obj;
        return Intrinsics.a(this.f15153id, classifiedsYoulaGroupsBlockProduct.f15153id) && Intrinsics.a(this.photo, classifiedsYoulaGroupsBlockProduct.photo);
    }

    @NotNull
    public final String getId() {
        return this.f15153id;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    public int hashCode() {
        int iHashCode = this.f15153id.hashCode() * 31;
        PhotosPhoto photosPhoto = this.photo;
        return iHashCode + (photosPhoto == null ? 0 : photosPhoto.hashCode());
    }

    @NotNull
    public String toString() {
        return "ClassifiedsYoulaGroupsBlockProduct(id=" + this.f15153id + ", photo=" + this.photo + ")";
    }

    public /* synthetic */ ClassifiedsYoulaGroupsBlockProduct(String str, PhotosPhoto photosPhoto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : photosPhoto);
    }
}
