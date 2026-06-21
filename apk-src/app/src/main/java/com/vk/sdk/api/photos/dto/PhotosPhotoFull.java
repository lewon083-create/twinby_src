package com.vk.sdk.api.photos.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseLikes;
import com.vk.sdk.api.base.dto.BaseObjectCount;
import com.vk.sdk.api.base.dto.BaseRepostsInfo;
import io.sentry.TraceContext;
import io.sentry.UserFeedback;
import io.sentry.protocol.DebugMeta;
import java.util.List;
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
public final class PhotosPhotoFull {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("album_id")
    private final int albumId;

    @b("can_comment")
    @Nullable
    private final BaseBoolInt canComment;

    @b(UserFeedback.JsonKeys.COMMENTS)
    @Nullable
    private final BaseObjectCount comments;

    @b("date")
    private final int date;

    @b("height")
    @Nullable
    private final Integer height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15218id;

    @b(DebugMeta.JsonKeys.IMAGES)
    @Nullable
    private final List<PhotosImage> images;

    @b("lat")
    @Nullable
    private final Float lat;

    @b("likes")
    @Nullable
    private final BaseLikes likes;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    @b("long")
    @Nullable
    private final Float f3long;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("reposts")
    @Nullable
    private final BaseRepostsInfo reposts;

    @b("tags")
    @Nullable
    private final BaseObjectCount tags;

    @b("text")
    @Nullable
    private final String text;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final UserId userId;

    @b("width")
    @Nullable
    private final Integer width;

    public PhotosPhotoFull(int i, int i10, int i11, @NotNull UserId ownerId, @Nullable String str, @Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable List<PhotosImage> list, @Nullable Float f10, @Nullable BaseLikes baseLikes, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable BaseObjectCount baseObjectCount, @Nullable Float f11, @Nullable Integer num2, @Nullable BaseObjectCount baseObjectCount2, @Nullable String str2, @Nullable UserId userId, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.albumId = i;
        this.date = i10;
        this.f15218id = i11;
        this.ownerId = ownerId;
        this.accessKey = str;
        this.canComment = baseBoolInt;
        this.height = num;
        this.images = list;
        this.lat = f10;
        this.likes = baseLikes;
        this.reposts = baseRepostsInfo;
        this.comments = baseObjectCount;
        this.f3long = f11;
        this.postId = num2;
        this.tags = baseObjectCount2;
        this.text = str2;
        this.userId = userId;
        this.width = num3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosPhotoFull copy$default(PhotosPhotoFull photosPhotoFull, int i, int i10, int i11, UserId userId, String str, BaseBoolInt baseBoolInt, Integer num, List list, Float f10, BaseLikes baseLikes, BaseRepostsInfo baseRepostsInfo, BaseObjectCount baseObjectCount, Float f11, Integer num2, BaseObjectCount baseObjectCount2, String str2, UserId userId2, Integer num3, int i12, Object obj) {
        Integer num4;
        UserId userId3;
        int i13 = (i12 & 1) != 0 ? photosPhotoFull.albumId : i;
        int i14 = (i12 & 2) != 0 ? photosPhotoFull.date : i10;
        int i15 = (i12 & 4) != 0 ? photosPhotoFull.f15218id : i11;
        UserId userId4 = (i12 & 8) != 0 ? photosPhotoFull.ownerId : userId;
        String str3 = (i12 & 16) != 0 ? photosPhotoFull.accessKey : str;
        BaseBoolInt baseBoolInt2 = (i12 & 32) != 0 ? photosPhotoFull.canComment : baseBoolInt;
        Integer num5 = (i12 & 64) != 0 ? photosPhotoFull.height : num;
        List list2 = (i12 & 128) != 0 ? photosPhotoFull.images : list;
        Float f12 = (i12 & 256) != 0 ? photosPhotoFull.lat : f10;
        BaseLikes baseLikes2 = (i12 & 512) != 0 ? photosPhotoFull.likes : baseLikes;
        BaseRepostsInfo baseRepostsInfo2 = (i12 & 1024) != 0 ? photosPhotoFull.reposts : baseRepostsInfo;
        BaseObjectCount baseObjectCount3 = (i12 & 2048) != 0 ? photosPhotoFull.comments : baseObjectCount;
        Float f13 = (i12 & 4096) != 0 ? photosPhotoFull.f3long : f11;
        Integer num6 = (i12 & 8192) != 0 ? photosPhotoFull.postId : num2;
        int i16 = i13;
        BaseObjectCount baseObjectCount4 = (i12 & 16384) != 0 ? photosPhotoFull.tags : baseObjectCount2;
        String str4 = (i12 & 32768) != 0 ? photosPhotoFull.text : str2;
        UserId userId5 = (i12 & 65536) != 0 ? photosPhotoFull.userId : userId2;
        if ((i12 & 131072) != 0) {
            userId3 = userId5;
            num4 = photosPhotoFull.width;
        } else {
            num4 = num3;
            userId3 = userId5;
        }
        return photosPhotoFull.copy(i16, i14, i15, userId4, str3, baseBoolInt2, num5, list2, f12, baseLikes2, baseRepostsInfo2, baseObjectCount3, f13, num6, baseObjectCount4, str4, userId3, num4);
    }

    public final int component1() {
        return this.albumId;
    }

    @Nullable
    public final BaseLikes component10() {
        return this.likes;
    }

    @Nullable
    public final BaseRepostsInfo component11() {
        return this.reposts;
    }

    @Nullable
    public final BaseObjectCount component12() {
        return this.comments;
    }

    @Nullable
    public final Float component13() {
        return this.f3long;
    }

    @Nullable
    public final Integer component14() {
        return this.postId;
    }

    @Nullable
    public final BaseObjectCount component15() {
        return this.tags;
    }

    @Nullable
    public final String component16() {
        return this.text;
    }

    @Nullable
    public final UserId component17() {
        return this.userId;
    }

    @Nullable
    public final Integer component18() {
        return this.width;
    }

    public final int component2() {
        return this.date;
    }

    public final int component3() {
        return this.f15218id;
    }

    @NotNull
    public final UserId component4() {
        return this.ownerId;
    }

    @Nullable
    public final String component5() {
        return this.accessKey;
    }

    @Nullable
    public final BaseBoolInt component6() {
        return this.canComment;
    }

    @Nullable
    public final Integer component7() {
        return this.height;
    }

    @Nullable
    public final List<PhotosImage> component8() {
        return this.images;
    }

    @Nullable
    public final Float component9() {
        return this.lat;
    }

    @NotNull
    public final PhotosPhotoFull copy(int i, int i10, int i11, @NotNull UserId ownerId, @Nullable String str, @Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable List<PhotosImage> list, @Nullable Float f10, @Nullable BaseLikes baseLikes, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable BaseObjectCount baseObjectCount, @Nullable Float f11, @Nullable Integer num2, @Nullable BaseObjectCount baseObjectCount2, @Nullable String str2, @Nullable UserId userId, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        return new PhotosPhotoFull(i, i10, i11, ownerId, str, baseBoolInt, num, list, f10, baseLikes, baseRepostsInfo, baseObjectCount, f11, num2, baseObjectCount2, str2, userId, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoFull)) {
            return false;
        }
        PhotosPhotoFull photosPhotoFull = (PhotosPhotoFull) obj;
        return this.albumId == photosPhotoFull.albumId && this.date == photosPhotoFull.date && this.f15218id == photosPhotoFull.f15218id && Intrinsics.a(this.ownerId, photosPhotoFull.ownerId) && Intrinsics.a(this.accessKey, photosPhotoFull.accessKey) && this.canComment == photosPhotoFull.canComment && Intrinsics.a(this.height, photosPhotoFull.height) && Intrinsics.a(this.images, photosPhotoFull.images) && Intrinsics.a(this.lat, photosPhotoFull.lat) && Intrinsics.a(this.likes, photosPhotoFull.likes) && Intrinsics.a(this.reposts, photosPhotoFull.reposts) && Intrinsics.a(this.comments, photosPhotoFull.comments) && Intrinsics.a(this.f3long, photosPhotoFull.f3long) && Intrinsics.a(this.postId, photosPhotoFull.postId) && Intrinsics.a(this.tags, photosPhotoFull.tags) && Intrinsics.a(this.text, photosPhotoFull.text) && Intrinsics.a(this.userId, photosPhotoFull.userId) && Intrinsics.a(this.width, photosPhotoFull.width);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    public final int getAlbumId() {
        return this.albumId;
    }

    @Nullable
    public final BaseBoolInt getCanComment() {
        return this.canComment;
    }

    @Nullable
    public final BaseObjectCount getComments() {
        return this.comments;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.f15218id;
    }

    @Nullable
    public final List<PhotosImage> getImages() {
        return this.images;
    }

    @Nullable
    public final Float getLat() {
        return this.lat;
    }

    @Nullable
    public final BaseLikes getLikes() {
        return this.likes;
    }

    @Nullable
    public final Float getLong() {
        return this.f3long;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final Integer getPostId() {
        return this.postId;
    }

    @Nullable
    public final BaseRepostsInfo getReposts() {
        return this.reposts;
    }

    @Nullable
    public final BaseObjectCount getTags() {
        return this.tags;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final UserId getUserId() {
        return this.userId;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iE = o.e(this.ownerId, u.g(this.f15218id, u.g(this.date, Integer.hashCode(this.albumId) * 31, 31), 31), 31);
        String str = this.accessKey;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canComment;
        int iHashCode2 = (iHashCode + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<PhotosImage> list = this.images;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Float f10 = this.lat;
        int iHashCode5 = (iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        BaseLikes baseLikes = this.likes;
        int iHashCode6 = (iHashCode5 + (baseLikes == null ? 0 : baseLikes.hashCode())) * 31;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        int iHashCode7 = (iHashCode6 + (baseRepostsInfo == null ? 0 : baseRepostsInfo.hashCode())) * 31;
        BaseObjectCount baseObjectCount = this.comments;
        int iHashCode8 = (iHashCode7 + (baseObjectCount == null ? 0 : baseObjectCount.hashCode())) * 31;
        Float f11 = this.f3long;
        int iHashCode9 = (iHashCode8 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Integer num2 = this.postId;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseObjectCount baseObjectCount2 = this.tags;
        int iHashCode11 = (iHashCode10 + (baseObjectCount2 == null ? 0 : baseObjectCount2.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.userId;
        int iHashCode13 = (iHashCode12 + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num3 = this.width;
        return iHashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.albumId;
        int i10 = this.date;
        int i11 = this.f15218id;
        UserId userId = this.ownerId;
        String str = this.accessKey;
        BaseBoolInt baseBoolInt = this.canComment;
        Integer num = this.height;
        List<PhotosImage> list = this.images;
        Float f10 = this.lat;
        BaseLikes baseLikes = this.likes;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        BaseObjectCount baseObjectCount = this.comments;
        Float f11 = this.f3long;
        Integer num2 = this.postId;
        BaseObjectCount baseObjectCount2 = this.tags;
        String str2 = this.text;
        UserId userId2 = this.userId;
        Integer num3 = this.width;
        StringBuilder sbI = z.i("PhotosPhotoFull(albumId=", i, ", date=", i10, ", id=");
        sbI.append(i11);
        sbI.append(", ownerId=");
        sbI.append(userId);
        sbI.append(", accessKey=");
        sbI.append(str);
        sbI.append(", canComment=");
        sbI.append(baseBoolInt);
        sbI.append(", height=");
        sbI.append(num);
        sbI.append(", images=");
        sbI.append(list);
        sbI.append(", lat=");
        sbI.append(f10);
        sbI.append(", likes=");
        sbI.append(baseLikes);
        sbI.append(", reposts=");
        sbI.append(baseRepostsInfo);
        sbI.append(", comments=");
        sbI.append(baseObjectCount);
        sbI.append(", long=");
        sbI.append(f11);
        sbI.append(", postId=");
        sbI.append(num2);
        sbI.append(", tags=");
        sbI.append(baseObjectCount2);
        sbI.append(", text=");
        sbI.append(str2);
        sbI.append(", userId=");
        sbI.append(userId2);
        sbI.append(", width=");
        sbI.append(num3);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ PhotosPhotoFull(int i, int i10, int i11, UserId userId, String str, BaseBoolInt baseBoolInt, Integer num, List list, Float f10, BaseLikes baseLikes, BaseRepostsInfo baseRepostsInfo, BaseObjectCount baseObjectCount, Float f11, Integer num2, BaseObjectCount baseObjectCount2, String str2, UserId userId2, Integer num3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, userId, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : baseBoolInt, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : list, (i12 & 256) != 0 ? null : f10, (i12 & 512) != 0 ? null : baseLikes, (i12 & 1024) != 0 ? null : baseRepostsInfo, (i12 & 2048) != 0 ? null : baseObjectCount, (i12 & 4096) != 0 ? null : f11, (i12 & 8192) != 0 ? null : num2, (i12 & 16384) != 0 ? null : baseObjectCount2, (32768 & i12) != 0 ? null : str2, (65536 & i12) != 0 ? null : userId2, (i12 & 131072) != 0 ? null : num3);
    }
}
