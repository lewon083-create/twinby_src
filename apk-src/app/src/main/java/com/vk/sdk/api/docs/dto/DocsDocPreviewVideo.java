package com.vk.sdk.api.docs.dto;

import a0.u;
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
public final class DocsDocPreviewVideo {

    @b("file_size")
    private final int fileSize;

    @b("height")
    private final int height;

    @b("src")
    @NotNull
    private final String src;

    @b("width")
    private final int width;

    public DocsDocPreviewVideo(@NotNull String src, int i, int i10, int i11) {
        Intrinsics.checkNotNullParameter(src, "src");
        this.src = src;
        this.width = i;
        this.height = i10;
        this.fileSize = i11;
    }

    public static /* synthetic */ DocsDocPreviewVideo copy$default(DocsDocPreviewVideo docsDocPreviewVideo, String str, int i, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = docsDocPreviewVideo.src;
        }
        if ((i12 & 2) != 0) {
            i = docsDocPreviewVideo.width;
        }
        if ((i12 & 4) != 0) {
            i10 = docsDocPreviewVideo.height;
        }
        if ((i12 & 8) != 0) {
            i11 = docsDocPreviewVideo.fileSize;
        }
        return docsDocPreviewVideo.copy(str, i, i10, i11);
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

    public final int component4() {
        return this.fileSize;
    }

    @NotNull
    public final DocsDocPreviewVideo copy(@NotNull String src, int i, int i10, int i11) {
        Intrinsics.checkNotNullParameter(src, "src");
        return new DocsDocPreviewVideo(src, i, i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewVideo)) {
            return false;
        }
        DocsDocPreviewVideo docsDocPreviewVideo = (DocsDocPreviewVideo) obj;
        return Intrinsics.a(this.src, docsDocPreviewVideo.src) && this.width == docsDocPreviewVideo.width && this.height == docsDocPreviewVideo.height && this.fileSize == docsDocPreviewVideo.fileSize;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getSrc() {
        return this.src;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.fileSize) + u.g(this.height, u.g(this.width, this.src.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "DocsDocPreviewVideo(src=" + this.src + ", width=" + this.width + ", height=" + this.height + ", fileSize=" + this.fileSize + ")";
    }
}
