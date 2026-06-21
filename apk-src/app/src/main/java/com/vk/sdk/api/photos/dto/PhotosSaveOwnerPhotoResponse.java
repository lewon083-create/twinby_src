package com.vk.sdk.api.photos.dto;

import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class PhotosSaveOwnerPhotoResponse {

    @b("photo_hash")
    @NotNull
    private final String photoHash;

    @b("photo_src")
    @NotNull
    private final String photoSrc;

    @b("photo_src_big")
    @Nullable
    private final String photoSrcBig;

    @b("photo_src_small")
    @Nullable
    private final String photoSrcSmall;

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("saved")
    @Nullable
    private final Integer saved;

    public PhotosSaveOwnerPhotoResponse(@NotNull String photoHash, @NotNull String photoSrc, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(photoHash, "photoHash");
        Intrinsics.checkNotNullParameter(photoSrc, "photoSrc");
        this.photoHash = photoHash;
        this.photoSrc = photoSrc;
        this.photoSrcBig = str;
        this.photoSrcSmall = str2;
        this.saved = num;
        this.postId = num2;
    }

    public static /* synthetic */ PhotosSaveOwnerPhotoResponse copy$default(PhotosSaveOwnerPhotoResponse photosSaveOwnerPhotoResponse, String str, String str2, String str3, String str4, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photosSaveOwnerPhotoResponse.photoHash;
        }
        if ((i & 2) != 0) {
            str2 = photosSaveOwnerPhotoResponse.photoSrc;
        }
        if ((i & 4) != 0) {
            str3 = photosSaveOwnerPhotoResponse.photoSrcBig;
        }
        if ((i & 8) != 0) {
            str4 = photosSaveOwnerPhotoResponse.photoSrcSmall;
        }
        if ((i & 16) != 0) {
            num = photosSaveOwnerPhotoResponse.saved;
        }
        if ((i & 32) != 0) {
            num2 = photosSaveOwnerPhotoResponse.postId;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return photosSaveOwnerPhotoResponse.copy(str, str2, str3, str4, num3, num4);
    }

    @NotNull
    public final String component1() {
        return this.photoHash;
    }

    @NotNull
    public final String component2() {
        return this.photoSrc;
    }

    @Nullable
    public final String component3() {
        return this.photoSrcBig;
    }

    @Nullable
    public final String component4() {
        return this.photoSrcSmall;
    }

    @Nullable
    public final Integer component5() {
        return this.saved;
    }

    @Nullable
    public final Integer component6() {
        return this.postId;
    }

    @NotNull
    public final PhotosSaveOwnerPhotoResponse copy(@NotNull String photoHash, @NotNull String photoSrc, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(photoHash, "photoHash");
        Intrinsics.checkNotNullParameter(photoSrc, "photoSrc");
        return new PhotosSaveOwnerPhotoResponse(photoHash, photoSrc, str, str2, num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosSaveOwnerPhotoResponse)) {
            return false;
        }
        PhotosSaveOwnerPhotoResponse photosSaveOwnerPhotoResponse = (PhotosSaveOwnerPhotoResponse) obj;
        return Intrinsics.a(this.photoHash, photosSaveOwnerPhotoResponse.photoHash) && Intrinsics.a(this.photoSrc, photosSaveOwnerPhotoResponse.photoSrc) && Intrinsics.a(this.photoSrcBig, photosSaveOwnerPhotoResponse.photoSrcBig) && Intrinsics.a(this.photoSrcSmall, photosSaveOwnerPhotoResponse.photoSrcSmall) && Intrinsics.a(this.saved, photosSaveOwnerPhotoResponse.saved) && Intrinsics.a(this.postId, photosSaveOwnerPhotoResponse.postId);
    }

    @NotNull
    public final String getPhotoHash() {
        return this.photoHash;
    }

    @NotNull
    public final String getPhotoSrc() {
        return this.photoSrc;
    }

    @Nullable
    public final String getPhotoSrcBig() {
        return this.photoSrcBig;
    }

    @Nullable
    public final String getPhotoSrcSmall() {
        return this.photoSrcSmall;
    }

    @Nullable
    public final Integer getPostId() {
        return this.postId;
    }

    @Nullable
    public final Integer getSaved() {
        return this.saved;
    }

    public int hashCode() {
        int iE = a.e(this.photoHash.hashCode() * 31, 31, this.photoSrc);
        String str = this.photoSrcBig;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoSrcSmall;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.saved;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.postId;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.photoHash;
        String str2 = this.photoSrc;
        String str3 = this.photoSrcBig;
        String str4 = this.photoSrcSmall;
        Integer num = this.saved;
        Integer num2 = this.postId;
        StringBuilder sbJ = z.j("PhotosSaveOwnerPhotoResponse(photoHash=", str, ", photoSrc=", str2, ", photoSrcBig=");
        o.t(sbJ, str3, ", photoSrcSmall=", str4, ", saved=");
        sbJ.append(num);
        sbJ.append(", postId=");
        sbJ.append(num2);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ PhotosSaveOwnerPhotoResponse(String str, String str2, String str3, String str4, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2);
    }
}
