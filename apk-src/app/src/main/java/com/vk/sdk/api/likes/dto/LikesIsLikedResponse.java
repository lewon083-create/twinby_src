package com.vk.sdk.api.likes.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
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
public final class LikesIsLikedResponse {

    @b("copied")
    @NotNull
    private final BaseBoolInt copied;

    @b("liked")
    @NotNull
    private final BaseBoolInt liked;

    public LikesIsLikedResponse(@NotNull BaseBoolInt liked, @NotNull BaseBoolInt copied) {
        Intrinsics.checkNotNullParameter(liked, "liked");
        Intrinsics.checkNotNullParameter(copied, "copied");
        this.liked = liked;
        this.copied = copied;
    }

    public static /* synthetic */ LikesIsLikedResponse copy$default(LikesIsLikedResponse likesIsLikedResponse, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = likesIsLikedResponse.liked;
        }
        if ((i & 2) != 0) {
            baseBoolInt2 = likesIsLikedResponse.copied;
        }
        return likesIsLikedResponse.copy(baseBoolInt, baseBoolInt2);
    }

    @NotNull
    public final BaseBoolInt component1() {
        return this.liked;
    }

    @NotNull
    public final BaseBoolInt component2() {
        return this.copied;
    }

    @NotNull
    public final LikesIsLikedResponse copy(@NotNull BaseBoolInt liked, @NotNull BaseBoolInt copied) {
        Intrinsics.checkNotNullParameter(liked, "liked");
        Intrinsics.checkNotNullParameter(copied, "copied");
        return new LikesIsLikedResponse(liked, copied);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesIsLikedResponse)) {
            return false;
        }
        LikesIsLikedResponse likesIsLikedResponse = (LikesIsLikedResponse) obj;
        return this.liked == likesIsLikedResponse.liked && this.copied == likesIsLikedResponse.copied;
    }

    @NotNull
    public final BaseBoolInt getCopied() {
        return this.copied;
    }

    @NotNull
    public final BaseBoolInt getLiked() {
        return this.liked;
    }

    public int hashCode() {
        return this.copied.hashCode() + (this.liked.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LikesIsLikedResponse(liked=" + this.liked + ", copied=" + this.copied + ")";
    }
}
