package com.vk.sdk.api.docs.dto;

import a0.u;
import com.vk.sdk.api.photos.dto.PhotosPhotoSizesType;
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
public final class DocsDocPreviewPhotoSizes {

    @b("height")
    private final int height;

    @b("src")
    @NotNull
    private final String src;

    @b("type")
    @NotNull
    private final PhotosPhotoSizesType type;

    @b("width")
    private final int width;

    public DocsDocPreviewPhotoSizes(@NotNull String src, int i, int i10, @NotNull PhotosPhotoSizesType type) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(type, "type");
        this.src = src;
        this.width = i;
        this.height = i10;
        this.type = type;
    }

    public static /* synthetic */ DocsDocPreviewPhotoSizes copy$default(DocsDocPreviewPhotoSizes docsDocPreviewPhotoSizes, String str, int i, int i10, PhotosPhotoSizesType photosPhotoSizesType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = docsDocPreviewPhotoSizes.src;
        }
        if ((i11 & 2) != 0) {
            i = docsDocPreviewPhotoSizes.width;
        }
        if ((i11 & 4) != 0) {
            i10 = docsDocPreviewPhotoSizes.height;
        }
        if ((i11 & 8) != 0) {
            photosPhotoSizesType = docsDocPreviewPhotoSizes.type;
        }
        return docsDocPreviewPhotoSizes.copy(str, i, i10, photosPhotoSizesType);
    }

    @NotNull
    public final String component1() {
        return this.src;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    @NotNull
    public final PhotosPhotoSizesType component4() {
        return this.type;
    }

    @NotNull
    public final DocsDocPreviewPhotoSizes copy(@NotNull String src, int i, int i10, @NotNull PhotosPhotoSizesType type) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(type, "type");
        return new DocsDocPreviewPhotoSizes(src, i, i10, type);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewPhotoSizes)) {
            return false;
        }
        DocsDocPreviewPhotoSizes docsDocPreviewPhotoSizes = (DocsDocPreviewPhotoSizes) obj;
        return Intrinsics.a(this.src, docsDocPreviewPhotoSizes.src) && this.width == docsDocPreviewPhotoSizes.width && this.height == docsDocPreviewPhotoSizes.height && this.type == docsDocPreviewPhotoSizes.type;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getSrc() {
        return this.src;
    }

    @NotNull
    public final PhotosPhotoSizesType getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.type.hashCode() + u.g(this.height, u.g(this.width, this.src.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "DocsDocPreviewPhotoSizes(src=" + this.src + ", width=" + this.width + ", height=" + this.height + ", type=" + this.type + ")";
    }
}
