package com.vk.sdk.api.wall.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseCommentsInfo;
import com.vk.sdk.api.base.dto.BaseLikesInfo;
import com.vk.sdk.api.base.dto.BaseRepostsInfo;
import io.sentry.UserFeedback;
import io.sentry.protocol.User;
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
public final class WallWallpostToId {

    @b("attachments")
    @Nullable
    private final List<WallWallpostAttachment> attachments;

    @b(UserFeedback.JsonKeys.COMMENTS)
    @Nullable
    private final BaseCommentsInfo comments;

    @b("copy_owner_id")
    @Nullable
    private final UserId copyOwnerId;

    @b("copy_post_id")
    @Nullable
    private final Integer copyPostId;

    @b("date")
    @Nullable
    private final Integer date;

    @b("from_id")
    @Nullable
    private final UserId fromId;

    @b(User.JsonKeys.GEO)
    @Nullable
    private final WallGeo geo;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15261id;

    @b("is_favorite")
    @Nullable
    private final Boolean isFavorite;

    @b("likes")
    @Nullable
    private final BaseLikesInfo likes;

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("post_source")
    @Nullable
    private final WallPostSource postSource;

    @b("post_type")
    @Nullable
    private final WallPostType postType;

    @b("reposts")
    @Nullable
    private final BaseRepostsInfo reposts;

    @b("signer_id")
    @Nullable
    private final UserId signerId;

    @b("text")
    @Nullable
    private final String text;

    @b("to_id")
    @Nullable
    private final UserId toId;

    public WallWallpostToId() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WallWallpostToId copy$default(WallWallpostToId wallWallpostToId, List list, BaseCommentsInfo baseCommentsInfo, UserId userId, Integer num, Integer num2, UserId userId2, WallGeo wallGeo, Integer num3, Boolean bool, BaseLikesInfo baseLikesInfo, Integer num4, WallPostSource wallPostSource, WallPostType wallPostType, BaseRepostsInfo baseRepostsInfo, UserId userId3, String str, UserId userId4, int i, Object obj) {
        UserId userId5;
        String str2;
        List list2;
        WallWallpostToId wallWallpostToId2;
        UserId userId6;
        BaseCommentsInfo baseCommentsInfo2;
        UserId userId7;
        Integer num5;
        Integer num6;
        UserId userId8;
        WallGeo wallGeo2;
        Integer num7;
        Boolean bool2;
        BaseLikesInfo baseLikesInfo2;
        Integer num8;
        WallPostSource wallPostSource2;
        WallPostType wallPostType2;
        BaseRepostsInfo baseRepostsInfo2;
        List list3 = (i & 1) != 0 ? wallWallpostToId.attachments : list;
        BaseCommentsInfo baseCommentsInfo3 = (i & 2) != 0 ? wallWallpostToId.comments : baseCommentsInfo;
        UserId userId9 = (i & 4) != 0 ? wallWallpostToId.copyOwnerId : userId;
        Integer num9 = (i & 8) != 0 ? wallWallpostToId.copyPostId : num;
        Integer num10 = (i & 16) != 0 ? wallWallpostToId.date : num2;
        UserId userId10 = (i & 32) != 0 ? wallWallpostToId.fromId : userId2;
        WallGeo wallGeo3 = (i & 64) != 0 ? wallWallpostToId.geo : wallGeo;
        Integer num11 = (i & 128) != 0 ? wallWallpostToId.f15261id : num3;
        Boolean bool3 = (i & 256) != 0 ? wallWallpostToId.isFavorite : bool;
        BaseLikesInfo baseLikesInfo3 = (i & 512) != 0 ? wallWallpostToId.likes : baseLikesInfo;
        Integer num12 = (i & 1024) != 0 ? wallWallpostToId.postId : num4;
        WallPostSource wallPostSource3 = (i & 2048) != 0 ? wallWallpostToId.postSource : wallPostSource;
        WallPostType wallPostType3 = (i & 4096) != 0 ? wallWallpostToId.postType : wallPostType;
        BaseRepostsInfo baseRepostsInfo3 = (i & 8192) != 0 ? wallWallpostToId.reposts : baseRepostsInfo;
        List list4 = list3;
        UserId userId11 = (i & 16384) != 0 ? wallWallpostToId.signerId : userId3;
        String str3 = (i & 32768) != 0 ? wallWallpostToId.text : str;
        if ((i & 65536) != 0) {
            str2 = str3;
            userId5 = wallWallpostToId.toId;
            userId6 = userId11;
            baseCommentsInfo2 = baseCommentsInfo3;
            userId7 = userId9;
            num5 = num9;
            num6 = num10;
            userId8 = userId10;
            wallGeo2 = wallGeo3;
            num7 = num11;
            bool2 = bool3;
            baseLikesInfo2 = baseLikesInfo3;
            num8 = num12;
            wallPostSource2 = wallPostSource3;
            wallPostType2 = wallPostType3;
            baseRepostsInfo2 = baseRepostsInfo3;
            list2 = list4;
            wallWallpostToId2 = wallWallpostToId;
        } else {
            userId5 = userId4;
            str2 = str3;
            list2 = list4;
            wallWallpostToId2 = wallWallpostToId;
            userId6 = userId11;
            baseCommentsInfo2 = baseCommentsInfo3;
            userId7 = userId9;
            num5 = num9;
            num6 = num10;
            userId8 = userId10;
            wallGeo2 = wallGeo3;
            num7 = num11;
            bool2 = bool3;
            baseLikesInfo2 = baseLikesInfo3;
            num8 = num12;
            wallPostSource2 = wallPostSource3;
            wallPostType2 = wallPostType3;
            baseRepostsInfo2 = baseRepostsInfo3;
        }
        return wallWallpostToId2.copy(list2, baseCommentsInfo2, userId7, num5, num6, userId8, wallGeo2, num7, bool2, baseLikesInfo2, num8, wallPostSource2, wallPostType2, baseRepostsInfo2, userId6, str2, userId5);
    }

    @Nullable
    public final List<WallWallpostAttachment> component1() {
        return this.attachments;
    }

    @Nullable
    public final BaseLikesInfo component10() {
        return this.likes;
    }

    @Nullable
    public final Integer component11() {
        return this.postId;
    }

    @Nullable
    public final WallPostSource component12() {
        return this.postSource;
    }

    @Nullable
    public final WallPostType component13() {
        return this.postType;
    }

    @Nullable
    public final BaseRepostsInfo component14() {
        return this.reposts;
    }

    @Nullable
    public final UserId component15() {
        return this.signerId;
    }

    @Nullable
    public final String component16() {
        return this.text;
    }

    @Nullable
    public final UserId component17() {
        return this.toId;
    }

    @Nullable
    public final BaseCommentsInfo component2() {
        return this.comments;
    }

    @Nullable
    public final UserId component3() {
        return this.copyOwnerId;
    }

    @Nullable
    public final Integer component4() {
        return this.copyPostId;
    }

    @Nullable
    public final Integer component5() {
        return this.date;
    }

    @Nullable
    public final UserId component6() {
        return this.fromId;
    }

    @Nullable
    public final WallGeo component7() {
        return this.geo;
    }

    @Nullable
    public final Integer component8() {
        return this.f15261id;
    }

    @Nullable
    public final Boolean component9() {
        return this.isFavorite;
    }

    @NotNull
    public final WallWallpostToId copy(@Nullable List<WallWallpostAttachment> list, @Nullable BaseCommentsInfo baseCommentsInfo, @Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable UserId userId2, @Nullable WallGeo wallGeo, @Nullable Integer num3, @Nullable Boolean bool, @Nullable BaseLikesInfo baseLikesInfo, @Nullable Integer num4, @Nullable WallPostSource wallPostSource, @Nullable WallPostType wallPostType, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UserId userId3, @Nullable String str, @Nullable UserId userId4) {
        return new WallWallpostToId(list, baseCommentsInfo, userId, num, num2, userId2, wallGeo, num3, bool, baseLikesInfo, num4, wallPostSource, wallPostType, baseRepostsInfo, userId3, str, userId4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostToId)) {
            return false;
        }
        WallWallpostToId wallWallpostToId = (WallWallpostToId) obj;
        return Intrinsics.a(this.attachments, wallWallpostToId.attachments) && Intrinsics.a(this.comments, wallWallpostToId.comments) && Intrinsics.a(this.copyOwnerId, wallWallpostToId.copyOwnerId) && Intrinsics.a(this.copyPostId, wallWallpostToId.copyPostId) && Intrinsics.a(this.date, wallWallpostToId.date) && Intrinsics.a(this.fromId, wallWallpostToId.fromId) && Intrinsics.a(this.geo, wallWallpostToId.geo) && Intrinsics.a(this.f15261id, wallWallpostToId.f15261id) && Intrinsics.a(this.isFavorite, wallWallpostToId.isFavorite) && Intrinsics.a(this.likes, wallWallpostToId.likes) && Intrinsics.a(this.postId, wallWallpostToId.postId) && Intrinsics.a(this.postSource, wallWallpostToId.postSource) && this.postType == wallWallpostToId.postType && Intrinsics.a(this.reposts, wallWallpostToId.reposts) && Intrinsics.a(this.signerId, wallWallpostToId.signerId) && Intrinsics.a(this.text, wallWallpostToId.text) && Intrinsics.a(this.toId, wallWallpostToId.toId);
    }

    @Nullable
    public final List<WallWallpostAttachment> getAttachments() {
        return this.attachments;
    }

    @Nullable
    public final BaseCommentsInfo getComments() {
        return this.comments;
    }

    @Nullable
    public final UserId getCopyOwnerId() {
        return this.copyOwnerId;
    }

    @Nullable
    public final Integer getCopyPostId() {
        return this.copyPostId;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final UserId getFromId() {
        return this.fromId;
    }

    @Nullable
    public final WallGeo getGeo() {
        return this.geo;
    }

    @Nullable
    public final Integer getId() {
        return this.f15261id;
    }

    @Nullable
    public final BaseLikesInfo getLikes() {
        return this.likes;
    }

    @Nullable
    public final Integer getPostId() {
        return this.postId;
    }

    @Nullable
    public final WallPostSource getPostSource() {
        return this.postSource;
    }

    @Nullable
    public final WallPostType getPostType() {
        return this.postType;
    }

    @Nullable
    public final BaseRepostsInfo getReposts() {
        return this.reposts;
    }

    @Nullable
    public final UserId getSignerId() {
        return this.signerId;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final UserId getToId() {
        return this.toId;
    }

    public int hashCode() {
        List<WallWallpostAttachment> list = this.attachments;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BaseCommentsInfo baseCommentsInfo = this.comments;
        int iHashCode2 = (iHashCode + (baseCommentsInfo == null ? 0 : baseCommentsInfo.hashCode())) * 31;
        UserId userId = this.copyOwnerId;
        int iHashCode3 = (iHashCode2 + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num = this.copyPostId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.date;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId2 = this.fromId;
        int iHashCode6 = (iHashCode5 + (userId2 == null ? 0 : userId2.hashCode())) * 31;
        WallGeo wallGeo = this.geo;
        int iHashCode7 = (iHashCode6 + (wallGeo == null ? 0 : wallGeo.hashCode())) * 31;
        Integer num3 = this.f15261id;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseLikesInfo baseLikesInfo = this.likes;
        int iHashCode10 = (iHashCode9 + (baseLikesInfo == null ? 0 : baseLikesInfo.hashCode())) * 31;
        Integer num4 = this.postId;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        WallPostSource wallPostSource = this.postSource;
        int iHashCode12 = (iHashCode11 + (wallPostSource == null ? 0 : wallPostSource.hashCode())) * 31;
        WallPostType wallPostType = this.postType;
        int iHashCode13 = (iHashCode12 + (wallPostType == null ? 0 : wallPostType.hashCode())) * 31;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        int iHashCode14 = (iHashCode13 + (baseRepostsInfo == null ? 0 : baseRepostsInfo.hashCode())) * 31;
        UserId userId3 = this.signerId;
        int iHashCode15 = (iHashCode14 + (userId3 == null ? 0 : userId3.hashCode())) * 31;
        String str = this.text;
        int iHashCode16 = (iHashCode15 + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId4 = this.toId;
        return iHashCode16 + (userId4 != null ? userId4.hashCode() : 0);
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        return "WallWallpostToId(attachments=" + this.attachments + ", comments=" + this.comments + ", copyOwnerId=" + this.copyOwnerId + ", copyPostId=" + this.copyPostId + ", date=" + this.date + ", fromId=" + this.fromId + ", geo=" + this.geo + ", id=" + this.f15261id + ", isFavorite=" + this.isFavorite + ", likes=" + this.likes + ", postId=" + this.postId + ", postSource=" + this.postSource + ", postType=" + this.postType + ", reposts=" + this.reposts + ", signerId=" + this.signerId + ", text=" + this.text + ", toId=" + this.toId + ")";
    }

    public WallWallpostToId(@Nullable List<WallWallpostAttachment> list, @Nullable BaseCommentsInfo baseCommentsInfo, @Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable UserId userId2, @Nullable WallGeo wallGeo, @Nullable Integer num3, @Nullable Boolean bool, @Nullable BaseLikesInfo baseLikesInfo, @Nullable Integer num4, @Nullable WallPostSource wallPostSource, @Nullable WallPostType wallPostType, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UserId userId3, @Nullable String str, @Nullable UserId userId4) {
        this.attachments = list;
        this.comments = baseCommentsInfo;
        this.copyOwnerId = userId;
        this.copyPostId = num;
        this.date = num2;
        this.fromId = userId2;
        this.geo = wallGeo;
        this.f15261id = num3;
        this.isFavorite = bool;
        this.likes = baseLikesInfo;
        this.postId = num4;
        this.postSource = wallPostSource;
        this.postType = wallPostType;
        this.reposts = baseRepostsInfo;
        this.signerId = userId3;
        this.text = str;
        this.toId = userId4;
    }

    public /* synthetic */ WallWallpostToId(List list, BaseCommentsInfo baseCommentsInfo, UserId userId, Integer num, Integer num2, UserId userId2, WallGeo wallGeo, Integer num3, Boolean bool, BaseLikesInfo baseLikesInfo, Integer num4, WallPostSource wallPostSource, WallPostType wallPostType, BaseRepostsInfo baseRepostsInfo, UserId userId3, String str, UserId userId4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : baseCommentsInfo, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : userId2, (i & 64) != 0 ? null : wallGeo, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : baseLikesInfo, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : wallPostSource, (i & 4096) != 0 ? null : wallPostType, (i & 8192) != 0 ? null : baseRepostsInfo, (i & 16384) != 0 ? null : userId3, (i & 32768) != 0 ? null : str, (i & 65536) != 0 ? null : userId4);
    }
}
