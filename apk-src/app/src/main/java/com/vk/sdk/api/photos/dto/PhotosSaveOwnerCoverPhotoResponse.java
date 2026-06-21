package com.vk.sdk.api.photos.dto;

import com.vk.sdk.api.base.dto.BaseImage;
import io.sentry.protocol.DebugMeta;
import java.util.List;
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
public final class PhotosSaveOwnerCoverPhotoResponse {

    @b(DebugMeta.JsonKeys.IMAGES)
    @Nullable
    private final List<BaseImage> images;

    public PhotosSaveOwnerCoverPhotoResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosSaveOwnerCoverPhotoResponse copy$default(PhotosSaveOwnerCoverPhotoResponse photosSaveOwnerCoverPhotoResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = photosSaveOwnerCoverPhotoResponse.images;
        }
        return photosSaveOwnerCoverPhotoResponse.copy(list);
    }

    @Nullable
    public final List<BaseImage> component1() {
        return this.images;
    }

    @NotNull
    public final PhotosSaveOwnerCoverPhotoResponse copy(@Nullable List<BaseImage> list) {
        return new PhotosSaveOwnerCoverPhotoResponse(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhotosSaveOwnerCoverPhotoResponse) && Intrinsics.a(this.images, ((PhotosSaveOwnerCoverPhotoResponse) obj).images);
    }

    @Nullable
    public final List<BaseImage> getImages() {
        return this.images;
    }

    public int hashCode() {
        List<BaseImage> list = this.images;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "PhotosSaveOwnerCoverPhotoResponse(images=" + this.images + ")";
    }

    public PhotosSaveOwnerCoverPhotoResponse(@Nullable List<BaseImage> list) {
        this.images = list;
    }

    public /* synthetic */ PhotosSaveOwnerCoverPhotoResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
