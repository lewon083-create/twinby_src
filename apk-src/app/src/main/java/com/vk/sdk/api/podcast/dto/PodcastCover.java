package com.vk.sdk.api.podcast.dto;

import com.vk.sdk.api.photos.dto.PhotosPhotoSizes;
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
public final class PodcastCover {

    @b("sizes")
    @Nullable
    private final List<PhotosPhotoSizes> sizes;

    public PodcastCover() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PodcastCover copy$default(PodcastCover podcastCover, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = podcastCover.sizes;
        }
        return podcastCover.copy(list);
    }

    @Nullable
    public final List<PhotosPhotoSizes> component1() {
        return this.sizes;
    }

    @NotNull
    public final PodcastCover copy(@Nullable List<PhotosPhotoSizes> list) {
        return new PodcastCover(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PodcastCover) && Intrinsics.a(this.sizes, ((PodcastCover) obj).sizes);
    }

    @Nullable
    public final List<PhotosPhotoSizes> getSizes() {
        return this.sizes;
    }

    public int hashCode() {
        List<PhotosPhotoSizes> list = this.sizes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "PodcastCover(sizes=" + this.sizes + ")";
    }

    public PodcastCover(@Nullable List<PhotosPhotoSizes> list) {
        this.sizes = list;
    }

    public /* synthetic */ PodcastCover(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
