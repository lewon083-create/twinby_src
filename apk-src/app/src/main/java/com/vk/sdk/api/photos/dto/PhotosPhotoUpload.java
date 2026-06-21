package com.vk.sdk.api.photos.dto;

import com.vk.dto.common.id.UserId;
import gf.a;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class PhotosPhotoUpload {

    @b("album_id")
    private final int albumId;

    @b("fallback_upload_url")
    @Nullable
    private final String fallbackUploadUrl;

    @b("group_id")
    @Nullable
    private final UserId groupId;

    @b("upload_url")
    @NotNull
    private final String uploadUrl;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    public PhotosPhotoUpload(int i, @NotNull String uploadUrl, @NotNull UserId userId, @Nullable String str, @Nullable UserId userId2) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.albumId = i;
        this.uploadUrl = uploadUrl;
        this.userId = userId;
        this.fallbackUploadUrl = str;
        this.groupId = userId2;
    }

    public static /* synthetic */ PhotosPhotoUpload copy$default(PhotosPhotoUpload photosPhotoUpload, int i, String str, UserId userId, String str2, UserId userId2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = photosPhotoUpload.albumId;
        }
        if ((i10 & 2) != 0) {
            str = photosPhotoUpload.uploadUrl;
        }
        if ((i10 & 4) != 0) {
            userId = photosPhotoUpload.userId;
        }
        if ((i10 & 8) != 0) {
            str2 = photosPhotoUpload.fallbackUploadUrl;
        }
        if ((i10 & 16) != 0) {
            userId2 = photosPhotoUpload.groupId;
        }
        UserId userId3 = userId2;
        UserId userId4 = userId;
        return photosPhotoUpload.copy(i, str, userId4, str2, userId3);
    }

    public final int component1() {
        return this.albumId;
    }

    @NotNull
    public final String component2() {
        return this.uploadUrl;
    }

    @NotNull
    public final UserId component3() {
        return this.userId;
    }

    @Nullable
    public final String component4() {
        return this.fallbackUploadUrl;
    }

    @Nullable
    public final UserId component5() {
        return this.groupId;
    }

    @NotNull
    public final PhotosPhotoUpload copy(int i, @NotNull String uploadUrl, @NotNull UserId userId, @Nullable String str, @Nullable UserId userId2) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new PhotosPhotoUpload(i, uploadUrl, userId, str, userId2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoUpload)) {
            return false;
        }
        PhotosPhotoUpload photosPhotoUpload = (PhotosPhotoUpload) obj;
        return this.albumId == photosPhotoUpload.albumId && Intrinsics.a(this.uploadUrl, photosPhotoUpload.uploadUrl) && Intrinsics.a(this.userId, photosPhotoUpload.userId) && Intrinsics.a(this.fallbackUploadUrl, photosPhotoUpload.fallbackUploadUrl) && Intrinsics.a(this.groupId, photosPhotoUpload.groupId);
    }

    public final int getAlbumId() {
        return this.albumId;
    }

    @Nullable
    public final String getFallbackUploadUrl() {
        return this.fallbackUploadUrl;
    }

    @Nullable
    public final UserId getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iE = o.e(this.userId, a.e(Integer.hashCode(this.albumId) * 31, 31, this.uploadUrl), 31);
        String str = this.fallbackUploadUrl;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.groupId;
        return iHashCode + (userId != null ? userId.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.albumId;
        String str = this.uploadUrl;
        UserId userId = this.userId;
        String str2 = this.fallbackUploadUrl;
        UserId userId2 = this.groupId;
        StringBuilder sbI = pe.a.i(i, "PhotosPhotoUpload(albumId=", ", uploadUrl=", str, ", userId=");
        sbI.append(userId);
        sbI.append(", fallbackUploadUrl=");
        sbI.append(str2);
        sbI.append(", groupId=");
        sbI.append(userId2);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ PhotosPhotoUpload(int i, String str, UserId userId, String str2, UserId userId2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, userId, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : userId2);
    }
}
