package com.vk.sdk.api.video.dto;

import com.vk.dto.common.id.UserId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class VideoSaveResult {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("description")
    @Nullable
    private final String description;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("title")
    @Nullable
    private final String title;

    @b("upload_url")
    @Nullable
    private final String uploadUrl;

    @b("video_id")
    @Nullable
    private final Integer videoId;

    public VideoSaveResult() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ VideoSaveResult copy$default(VideoSaveResult videoSaveResult, String str, String str2, UserId userId, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoSaveResult.accessKey;
        }
        if ((i & 2) != 0) {
            str2 = videoSaveResult.description;
        }
        if ((i & 4) != 0) {
            userId = videoSaveResult.ownerId;
        }
        if ((i & 8) != 0) {
            str3 = videoSaveResult.title;
        }
        if ((i & 16) != 0) {
            str4 = videoSaveResult.uploadUrl;
        }
        if ((i & 32) != 0) {
            num = videoSaveResult.videoId;
        }
        String str5 = str4;
        Integer num2 = num;
        return videoSaveResult.copy(str, str2, userId, str3, str5, num2);
    }

    @Nullable
    public final String component1() {
        return this.accessKey;
    }

    @Nullable
    public final String component2() {
        return this.description;
    }

    @Nullable
    public final UserId component3() {
        return this.ownerId;
    }

    @Nullable
    public final String component4() {
        return this.title;
    }

    @Nullable
    public final String component5() {
        return this.uploadUrl;
    }

    @Nullable
    public final Integer component6() {
        return this.videoId;
    }

    @NotNull
    public final VideoSaveResult copy(@Nullable String str, @Nullable String str2, @Nullable UserId userId, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        return new VideoSaveResult(str, str2, userId, str3, str4, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSaveResult)) {
            return false;
        }
        VideoSaveResult videoSaveResult = (VideoSaveResult) obj;
        return Intrinsics.a(this.accessKey, videoSaveResult.accessKey) && Intrinsics.a(this.description, videoSaveResult.description) && Intrinsics.a(this.ownerId, videoSaveResult.ownerId) && Intrinsics.a(this.title, videoSaveResult.title) && Intrinsics.a(this.uploadUrl, videoSaveResult.uploadUrl) && Intrinsics.a(this.videoId, videoSaveResult.videoId);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    @Nullable
    public final Integer getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        String str = this.accessKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int iHashCode3 = (iHashCode2 + (userId == null ? 0 : userId.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uploadUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.videoId;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accessKey;
        String str2 = this.description;
        UserId userId = this.ownerId;
        String str3 = this.title;
        String str4 = this.uploadUrl;
        Integer num = this.videoId;
        StringBuilder sbJ = z.j("VideoSaveResult(accessKey=", str, ", description=", str2, ", ownerId=");
        sbJ.append(userId);
        sbJ.append(", title=");
        sbJ.append(str3);
        sbJ.append(", uploadUrl=");
        sbJ.append(str4);
        sbJ.append(", videoId=");
        sbJ.append(num);
        sbJ.append(")");
        return sbJ.toString();
    }

    public VideoSaveResult(@Nullable String str, @Nullable String str2, @Nullable UserId userId, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.accessKey = str;
        this.description = str2;
        this.ownerId = userId;
        this.title = str3;
        this.uploadUrl = str4;
        this.videoId = num;
    }

    public /* synthetic */ VideoSaveResult(String str, String str2, UserId userId, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num);
    }
}
