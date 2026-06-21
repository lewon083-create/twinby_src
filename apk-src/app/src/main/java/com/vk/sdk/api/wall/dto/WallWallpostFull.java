package com.vk.sdk.api.wall.dto;

import a0.u;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
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
import pe.a;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class WallWallpostFull {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("attachments")
    @Nullable
    private final List<WallWallpostAttachment> attachments;

    @b("can_delete")
    @Nullable
    private final BaseBoolInt canDelete;

    @b("can_edit")
    @Nullable
    private final BaseBoolInt canEdit;

    @b("can_pin")
    @Nullable
    private final BaseBoolInt canPin;

    @b("carousel_offset")
    @Nullable
    private final Integer carouselOffset;

    @b(UserFeedback.JsonKeys.COMMENTS)
    @Nullable
    private final BaseCommentsInfo comments;

    @b("copy_history")
    @Nullable
    private final List<WallWallpostFull> copyHistory;

    @b("copyright")
    @Nullable
    private final WallPostCopyright copyright;

    @b("created_by")
    @Nullable
    private final UserId createdBy;

    @b("date")
    @Nullable
    private final Integer date;

    @b("donut")
    @Nullable
    private final WallWallpostDonut donut;

    @b("edited")
    @Nullable
    private final Integer edited;

    @b("from_id")
    @Nullable
    private final UserId fromId;

    @b(User.JsonKeys.GEO)
    @Nullable
    private final WallGeo geo;

    @b("hash")
    @Nullable
    private final String hash;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15260id;

    @b("is_archived")
    @Nullable
    private final Boolean isArchived;

    @b("is_deleted")
    @Nullable
    private final Boolean isDeleted;

    @b("is_favorite")
    @Nullable
    private final Boolean isFavorite;

    @b("is_pinned")
    @Nullable
    private final Integer isPinned;

    @b("likes")
    @Nullable
    private final BaseLikesInfo likes;

    @b("marked_as_ads")
    @Nullable
    private final BaseBoolInt markedAsAds;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("parents_stack")
    @Nullable
    private final List<Integer> parentsStack;

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

    @b("short_text_rate")
    @Nullable
    private final Float shortTextRate;

    @b("signer_id")
    @Nullable
    private final UserId signerId;

    @b("text")
    @Nullable
    private final String text;

    @b("topic_id")
    @Nullable
    private final TopicId topicId;

    @b("views")
    @Nullable
    private final WallViews views;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum TopicId {
        EMPTY_TOPIC(0),
        ART(1),
        IT(7),
        GAMES(12),
        MUSIC(16),
        PHOTO(19),
        SCIENCE_AND_TECH(21),
        SPORT(23),
        TRAVEL(25),
        TV_AND_CINEMA(26),
        HUMOR(32),
        FASHION(43);

        private final int value;

        TopicId(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public WallWallpostFull() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WallWallpostFull copy$default(WallWallpostFull wallWallpostFull, List list, BaseBoolInt baseBoolInt, UserId userId, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, WallWallpostDonut wallWallpostDonut, Integer num, BaseCommentsInfo baseCommentsInfo, BaseBoolInt baseBoolInt4, TopicId topicId, Float f10, String str, Integer num2, String str2, Boolean bool, List list2, WallPostCopyright wallPostCopyright, Integer num3, Integer num4, UserId userId2, WallGeo wallGeo, Integer num5, Boolean bool2, Boolean bool3, BaseLikesInfo baseLikesInfo, UserId userId3, Integer num6, List list3, WallPostSource wallPostSource, WallPostType wallPostType, BaseRepostsInfo baseRepostsInfo, UserId userId4, String str3, WallViews wallViews, int i, int i10, Object obj) {
        WallViews wallViews2;
        String str4;
        Integer num7;
        Integer num8;
        UserId userId5;
        WallGeo wallGeo2;
        Integer num9;
        Boolean bool4;
        Boolean bool5;
        BaseLikesInfo baseLikesInfo2;
        UserId userId6;
        Integer num10;
        List list4;
        WallPostSource wallPostSource2;
        WallPostType wallPostType2;
        BaseRepostsInfo baseRepostsInfo2;
        UserId userId7;
        Boolean bool6;
        UserId userId8;
        BaseBoolInt baseBoolInt5;
        BaseBoolInt baseBoolInt6;
        WallWallpostDonut wallWallpostDonut2;
        Integer num11;
        BaseCommentsInfo baseCommentsInfo2;
        BaseBoolInt baseBoolInt7;
        TopicId topicId2;
        Float f11;
        String str5;
        Integer num12;
        String str6;
        List list5;
        WallPostCopyright wallPostCopyright2;
        BaseBoolInt baseBoolInt8;
        List list6 = (i & 1) != 0 ? wallWallpostFull.copyHistory : list;
        BaseBoolInt baseBoolInt9 = (i & 2) != 0 ? wallWallpostFull.canEdit : baseBoolInt;
        UserId userId9 = (i & 4) != 0 ? wallWallpostFull.createdBy : userId;
        BaseBoolInt baseBoolInt10 = (i & 8) != 0 ? wallWallpostFull.canDelete : baseBoolInt2;
        BaseBoolInt baseBoolInt11 = (i & 16) != 0 ? wallWallpostFull.canPin : baseBoolInt3;
        WallWallpostDonut wallWallpostDonut3 = (i & 32) != 0 ? wallWallpostFull.donut : wallWallpostDonut;
        Integer num13 = (i & 64) != 0 ? wallWallpostFull.isPinned : num;
        BaseCommentsInfo baseCommentsInfo3 = (i & 128) != 0 ? wallWallpostFull.comments : baseCommentsInfo;
        BaseBoolInt baseBoolInt12 = (i & 256) != 0 ? wallWallpostFull.markedAsAds : baseBoolInt4;
        TopicId topicId3 = (i & 512) != 0 ? wallWallpostFull.topicId : topicId;
        Float f12 = (i & 1024) != 0 ? wallWallpostFull.shortTextRate : f10;
        String str7 = (i & 2048) != 0 ? wallWallpostFull.hash : str;
        Integer num14 = (i & 4096) != 0 ? wallWallpostFull.carouselOffset : num2;
        String str8 = (i & 8192) != 0 ? wallWallpostFull.accessKey : str2;
        List list7 = list6;
        Boolean bool7 = (i & 16384) != 0 ? wallWallpostFull.isDeleted : bool;
        List list8 = (i & 32768) != 0 ? wallWallpostFull.attachments : list2;
        WallPostCopyright wallPostCopyright3 = (i & 65536) != 0 ? wallWallpostFull.copyright : wallPostCopyright;
        Integer num15 = (i & 131072) != 0 ? wallWallpostFull.date : num3;
        Integer num16 = (i & 262144) != 0 ? wallWallpostFull.edited : num4;
        UserId userId10 = (i & 524288) != 0 ? wallWallpostFull.fromId : userId2;
        WallGeo wallGeo3 = (i & 1048576) != 0 ? wallWallpostFull.geo : wallGeo;
        Integer num17 = (i & 2097152) != 0 ? wallWallpostFull.f15260id : num5;
        Boolean bool8 = (i & 4194304) != 0 ? wallWallpostFull.isArchived : bool2;
        Boolean bool9 = (i & 8388608) != 0 ? wallWallpostFull.isFavorite : bool3;
        BaseLikesInfo baseLikesInfo3 = (i & 16777216) != 0 ? wallWallpostFull.likes : baseLikesInfo;
        UserId userId11 = (i & 33554432) != 0 ? wallWallpostFull.ownerId : userId3;
        Integer num18 = (i & 67108864) != 0 ? wallWallpostFull.postId : num6;
        List list9 = (i & 134217728) != 0 ? wallWallpostFull.parentsStack : list3;
        WallPostSource wallPostSource3 = (i & 268435456) != 0 ? wallWallpostFull.postSource : wallPostSource;
        WallPostType wallPostType3 = (i & 536870912) != 0 ? wallWallpostFull.postType : wallPostType;
        BaseRepostsInfo baseRepostsInfo3 = (i & 1073741824) != 0 ? wallWallpostFull.reposts : baseRepostsInfo;
        UserId userId12 = (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? wallWallpostFull.signerId : userId4;
        String str9 = (i10 & 1) != 0 ? wallWallpostFull.text : str3;
        if ((i10 & 2) != 0) {
            str4 = str9;
            wallViews2 = wallWallpostFull.views;
            num8 = num16;
            userId5 = userId10;
            wallGeo2 = wallGeo3;
            num9 = num17;
            bool4 = bool8;
            bool5 = bool9;
            baseLikesInfo2 = baseLikesInfo3;
            userId6 = userId11;
            num10 = num18;
            list4 = list9;
            wallPostSource2 = wallPostSource3;
            wallPostType2 = wallPostType3;
            baseRepostsInfo2 = baseRepostsInfo3;
            userId7 = userId12;
            bool6 = bool7;
            baseBoolInt5 = baseBoolInt10;
            baseBoolInt6 = baseBoolInt11;
            wallWallpostDonut2 = wallWallpostDonut3;
            num11 = num13;
            baseCommentsInfo2 = baseCommentsInfo3;
            baseBoolInt7 = baseBoolInt12;
            topicId2 = topicId3;
            f11 = f12;
            str5 = str7;
            num12 = num14;
            str6 = str8;
            list5 = list8;
            wallPostCopyright2 = wallPostCopyright3;
            num7 = num15;
            baseBoolInt8 = baseBoolInt9;
            userId8 = userId9;
        } else {
            wallViews2 = wallViews;
            str4 = str9;
            num7 = num15;
            num8 = num16;
            userId5 = userId10;
            wallGeo2 = wallGeo3;
            num9 = num17;
            bool4 = bool8;
            bool5 = bool9;
            baseLikesInfo2 = baseLikesInfo3;
            userId6 = userId11;
            num10 = num18;
            list4 = list9;
            wallPostSource2 = wallPostSource3;
            wallPostType2 = wallPostType3;
            baseRepostsInfo2 = baseRepostsInfo3;
            userId7 = userId12;
            bool6 = bool7;
            userId8 = userId9;
            baseBoolInt5 = baseBoolInt10;
            baseBoolInt6 = baseBoolInt11;
            wallWallpostDonut2 = wallWallpostDonut3;
            num11 = num13;
            baseCommentsInfo2 = baseCommentsInfo3;
            baseBoolInt7 = baseBoolInt12;
            topicId2 = topicId3;
            f11 = f12;
            str5 = str7;
            num12 = num14;
            str6 = str8;
            list5 = list8;
            wallPostCopyright2 = wallPostCopyright3;
            baseBoolInt8 = baseBoolInt9;
        }
        return wallWallpostFull.copy(list7, baseBoolInt8, userId8, baseBoolInt5, baseBoolInt6, wallWallpostDonut2, num11, baseCommentsInfo2, baseBoolInt7, topicId2, f11, str5, num12, str6, bool6, list5, wallPostCopyright2, num7, num8, userId5, wallGeo2, num9, bool4, bool5, baseLikesInfo2, userId6, num10, list4, wallPostSource2, wallPostType2, baseRepostsInfo2, userId7, str4, wallViews2);
    }

    @Nullable
    public final List<WallWallpostFull> component1() {
        return this.copyHistory;
    }

    @Nullable
    public final TopicId component10() {
        return this.topicId;
    }

    @Nullable
    public final Float component11() {
        return this.shortTextRate;
    }

    @Nullable
    public final String component12() {
        return this.hash;
    }

    @Nullable
    public final Integer component13() {
        return this.carouselOffset;
    }

    @Nullable
    public final String component14() {
        return this.accessKey;
    }

    @Nullable
    public final Boolean component15() {
        return this.isDeleted;
    }

    @Nullable
    public final List<WallWallpostAttachment> component16() {
        return this.attachments;
    }

    @Nullable
    public final WallPostCopyright component17() {
        return this.copyright;
    }

    @Nullable
    public final Integer component18() {
        return this.date;
    }

    @Nullable
    public final Integer component19() {
        return this.edited;
    }

    @Nullable
    public final BaseBoolInt component2() {
        return this.canEdit;
    }

    @Nullable
    public final UserId component20() {
        return this.fromId;
    }

    @Nullable
    public final WallGeo component21() {
        return this.geo;
    }

    @Nullable
    public final Integer component22() {
        return this.f15260id;
    }

    @Nullable
    public final Boolean component23() {
        return this.isArchived;
    }

    @Nullable
    public final Boolean component24() {
        return this.isFavorite;
    }

    @Nullable
    public final BaseLikesInfo component25() {
        return this.likes;
    }

    @Nullable
    public final UserId component26() {
        return this.ownerId;
    }

    @Nullable
    public final Integer component27() {
        return this.postId;
    }

    @Nullable
    public final List<Integer> component28() {
        return this.parentsStack;
    }

    @Nullable
    public final WallPostSource component29() {
        return this.postSource;
    }

    @Nullable
    public final UserId component3() {
        return this.createdBy;
    }

    @Nullable
    public final WallPostType component30() {
        return this.postType;
    }

    @Nullable
    public final BaseRepostsInfo component31() {
        return this.reposts;
    }

    @Nullable
    public final UserId component32() {
        return this.signerId;
    }

    @Nullable
    public final String component33() {
        return this.text;
    }

    @Nullable
    public final WallViews component34() {
        return this.views;
    }

    @Nullable
    public final BaseBoolInt component4() {
        return this.canDelete;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.canPin;
    }

    @Nullable
    public final WallWallpostDonut component6() {
        return this.donut;
    }

    @Nullable
    public final Integer component7() {
        return this.isPinned;
    }

    @Nullable
    public final BaseCommentsInfo component8() {
        return this.comments;
    }

    @Nullable
    public final BaseBoolInt component9() {
        return this.markedAsAds;
    }

    @NotNull
    public final WallWallpostFull copy(@Nullable List<WallWallpostFull> list, @Nullable BaseBoolInt baseBoolInt, @Nullable UserId userId, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable WallWallpostDonut wallWallpostDonut, @Nullable Integer num, @Nullable BaseCommentsInfo baseCommentsInfo, @Nullable BaseBoolInt baseBoolInt4, @Nullable TopicId topicId, @Nullable Float f10, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable Boolean bool, @Nullable List<WallWallpostAttachment> list2, @Nullable WallPostCopyright wallPostCopyright, @Nullable Integer num3, @Nullable Integer num4, @Nullable UserId userId2, @Nullable WallGeo wallGeo, @Nullable Integer num5, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable BaseLikesInfo baseLikesInfo, @Nullable UserId userId3, @Nullable Integer num6, @Nullable List<Integer> list3, @Nullable WallPostSource wallPostSource, @Nullable WallPostType wallPostType, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UserId userId4, @Nullable String str3, @Nullable WallViews wallViews) {
        return new WallWallpostFull(list, baseBoolInt, userId, baseBoolInt2, baseBoolInt3, wallWallpostDonut, num, baseCommentsInfo, baseBoolInt4, topicId, f10, str, num2, str2, bool, list2, wallPostCopyright, num3, num4, userId2, wallGeo, num5, bool2, bool3, baseLikesInfo, userId3, num6, list3, wallPostSource, wallPostType, baseRepostsInfo, userId4, str3, wallViews);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostFull)) {
            return false;
        }
        WallWallpostFull wallWallpostFull = (WallWallpostFull) obj;
        return Intrinsics.a(this.copyHistory, wallWallpostFull.copyHistory) && this.canEdit == wallWallpostFull.canEdit && Intrinsics.a(this.createdBy, wallWallpostFull.createdBy) && this.canDelete == wallWallpostFull.canDelete && this.canPin == wallWallpostFull.canPin && Intrinsics.a(this.donut, wallWallpostFull.donut) && Intrinsics.a(this.isPinned, wallWallpostFull.isPinned) && Intrinsics.a(this.comments, wallWallpostFull.comments) && this.markedAsAds == wallWallpostFull.markedAsAds && this.topicId == wallWallpostFull.topicId && Intrinsics.a(this.shortTextRate, wallWallpostFull.shortTextRate) && Intrinsics.a(this.hash, wallWallpostFull.hash) && Intrinsics.a(this.carouselOffset, wallWallpostFull.carouselOffset) && Intrinsics.a(this.accessKey, wallWallpostFull.accessKey) && Intrinsics.a(this.isDeleted, wallWallpostFull.isDeleted) && Intrinsics.a(this.attachments, wallWallpostFull.attachments) && Intrinsics.a(this.copyright, wallWallpostFull.copyright) && Intrinsics.a(this.date, wallWallpostFull.date) && Intrinsics.a(this.edited, wallWallpostFull.edited) && Intrinsics.a(this.fromId, wallWallpostFull.fromId) && Intrinsics.a(this.geo, wallWallpostFull.geo) && Intrinsics.a(this.f15260id, wallWallpostFull.f15260id) && Intrinsics.a(this.isArchived, wallWallpostFull.isArchived) && Intrinsics.a(this.isFavorite, wallWallpostFull.isFavorite) && Intrinsics.a(this.likes, wallWallpostFull.likes) && Intrinsics.a(this.ownerId, wallWallpostFull.ownerId) && Intrinsics.a(this.postId, wallWallpostFull.postId) && Intrinsics.a(this.parentsStack, wallWallpostFull.parentsStack) && Intrinsics.a(this.postSource, wallWallpostFull.postSource) && this.postType == wallWallpostFull.postType && Intrinsics.a(this.reposts, wallWallpostFull.reposts) && Intrinsics.a(this.signerId, wallWallpostFull.signerId) && Intrinsics.a(this.text, wallWallpostFull.text) && Intrinsics.a(this.views, wallWallpostFull.views);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final List<WallWallpostAttachment> getAttachments() {
        return this.attachments;
    }

    @Nullable
    public final BaseBoolInt getCanDelete() {
        return this.canDelete;
    }

    @Nullable
    public final BaseBoolInt getCanEdit() {
        return this.canEdit;
    }

    @Nullable
    public final BaseBoolInt getCanPin() {
        return this.canPin;
    }

    @Nullable
    public final Integer getCarouselOffset() {
        return this.carouselOffset;
    }

    @Nullable
    public final BaseCommentsInfo getComments() {
        return this.comments;
    }

    @Nullable
    public final List<WallWallpostFull> getCopyHistory() {
        return this.copyHistory;
    }

    @Nullable
    public final WallPostCopyright getCopyright() {
        return this.copyright;
    }

    @Nullable
    public final UserId getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final WallWallpostDonut getDonut() {
        return this.donut;
    }

    @Nullable
    public final Integer getEdited() {
        return this.edited;
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
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    public final Integer getId() {
        return this.f15260id;
    }

    @Nullable
    public final BaseLikesInfo getLikes() {
        return this.likes;
    }

    @Nullable
    public final BaseBoolInt getMarkedAsAds() {
        return this.markedAsAds;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final List<Integer> getParentsStack() {
        return this.parentsStack;
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
    public final Float getShortTextRate() {
        return this.shortTextRate;
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
    public final TopicId getTopicId() {
        return this.topicId;
    }

    @Nullable
    public final WallViews getViews() {
        return this.views;
    }

    public int hashCode() {
        List<WallWallpostFull> list = this.copyHistory;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BaseBoolInt baseBoolInt = this.canEdit;
        int iHashCode2 = (iHashCode + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        UserId userId = this.createdBy;
        int iHashCode3 = (iHashCode2 + (userId == null ? 0 : userId.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.canDelete;
        int iHashCode4 = (iHashCode3 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.canPin;
        int iHashCode5 = (iHashCode4 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        WallWallpostDonut wallWallpostDonut = this.donut;
        int iHashCode6 = (iHashCode5 + (wallWallpostDonut == null ? 0 : wallWallpostDonut.hashCode())) * 31;
        Integer num = this.isPinned;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        BaseCommentsInfo baseCommentsInfo = this.comments;
        int iHashCode8 = (iHashCode7 + (baseCommentsInfo == null ? 0 : baseCommentsInfo.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.markedAsAds;
        int iHashCode9 = (iHashCode8 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        TopicId topicId = this.topicId;
        int iHashCode10 = (iHashCode9 + (topicId == null ? 0 : topicId.hashCode())) * 31;
        Float f10 = this.shortTextRate;
        int iHashCode11 = (iHashCode10 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str = this.hash;
        int iHashCode12 = (iHashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.carouselOffset;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.accessKey;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isDeleted;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<WallWallpostAttachment> list2 = this.attachments;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WallPostCopyright wallPostCopyright = this.copyright;
        int iHashCode17 = (iHashCode16 + (wallPostCopyright == null ? 0 : wallPostCopyright.hashCode())) * 31;
        Integer num3 = this.date;
        int iHashCode18 = (iHashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.edited;
        int iHashCode19 = (iHashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        UserId userId2 = this.fromId;
        int iHashCode20 = (iHashCode19 + (userId2 == null ? 0 : userId2.hashCode())) * 31;
        WallGeo wallGeo = this.geo;
        int iHashCode21 = (iHashCode20 + (wallGeo == null ? 0 : wallGeo.hashCode())) * 31;
        Integer num5 = this.f15260id;
        int iHashCode22 = (iHashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool2 = this.isArchived;
        int iHashCode23 = (iHashCode22 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFavorite;
        int iHashCode24 = (iHashCode23 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BaseLikesInfo baseLikesInfo = this.likes;
        int iHashCode25 = (iHashCode24 + (baseLikesInfo == null ? 0 : baseLikesInfo.hashCode())) * 31;
        UserId userId3 = this.ownerId;
        int iHashCode26 = (iHashCode25 + (userId3 == null ? 0 : userId3.hashCode())) * 31;
        Integer num6 = this.postId;
        int iHashCode27 = (iHashCode26 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List<Integer> list3 = this.parentsStack;
        int iHashCode28 = (iHashCode27 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WallPostSource wallPostSource = this.postSource;
        int iHashCode29 = (iHashCode28 + (wallPostSource == null ? 0 : wallPostSource.hashCode())) * 31;
        WallPostType wallPostType = this.postType;
        int iHashCode30 = (iHashCode29 + (wallPostType == null ? 0 : wallPostType.hashCode())) * 31;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        int iHashCode31 = (iHashCode30 + (baseRepostsInfo == null ? 0 : baseRepostsInfo.hashCode())) * 31;
        UserId userId4 = this.signerId;
        int iHashCode32 = (iHashCode31 + (userId4 == null ? 0 : userId4.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode33 = (iHashCode32 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WallViews wallViews = this.views;
        return iHashCode33 + (wallViews != null ? wallViews.hashCode() : 0);
    }

    @Nullable
    public final Boolean isArchived() {
        return this.isArchived;
    }

    @Nullable
    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @Nullable
    public final Integer isPinned() {
        return this.isPinned;
    }

    @NotNull
    public String toString() {
        List<WallWallpostFull> list = this.copyHistory;
        BaseBoolInt baseBoolInt = this.canEdit;
        UserId userId = this.createdBy;
        BaseBoolInt baseBoolInt2 = this.canDelete;
        BaseBoolInt baseBoolInt3 = this.canPin;
        WallWallpostDonut wallWallpostDonut = this.donut;
        Integer num = this.isPinned;
        BaseCommentsInfo baseCommentsInfo = this.comments;
        BaseBoolInt baseBoolInt4 = this.markedAsAds;
        TopicId topicId = this.topicId;
        Float f10 = this.shortTextRate;
        String str = this.hash;
        Integer num2 = this.carouselOffset;
        String str2 = this.accessKey;
        Boolean bool = this.isDeleted;
        List<WallWallpostAttachment> list2 = this.attachments;
        WallPostCopyright wallPostCopyright = this.copyright;
        Integer num3 = this.date;
        Integer num4 = this.edited;
        UserId userId2 = this.fromId;
        WallGeo wallGeo = this.geo;
        Integer num5 = this.f15260id;
        Boolean bool2 = this.isArchived;
        Boolean bool3 = this.isFavorite;
        BaseLikesInfo baseLikesInfo = this.likes;
        UserId userId3 = this.ownerId;
        Integer num6 = this.postId;
        List<Integer> list3 = this.parentsStack;
        WallPostSource wallPostSource = this.postSource;
        WallPostType wallPostType = this.postType;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        UserId userId4 = this.signerId;
        String str3 = this.text;
        WallViews wallViews = this.views;
        StringBuilder sb2 = new StringBuilder("WallWallpostFull(copyHistory=");
        sb2.append(list);
        sb2.append(", canEdit=");
        sb2.append(baseBoolInt);
        sb2.append(", createdBy=");
        sb2.append(userId);
        sb2.append(", canDelete=");
        sb2.append(baseBoolInt2);
        sb2.append(", canPin=");
        sb2.append(baseBoolInt3);
        sb2.append(", donut=");
        sb2.append(wallWallpostDonut);
        sb2.append(", isPinned=");
        sb2.append(num);
        sb2.append(", comments=");
        sb2.append(baseCommentsInfo);
        sb2.append(", markedAsAds=");
        sb2.append(baseBoolInt4);
        sb2.append(", topicId=");
        sb2.append(topicId);
        sb2.append(", shortTextRate=");
        sb2.append(f10);
        sb2.append(", hash=");
        sb2.append(str);
        sb2.append(", carouselOffset=");
        a.r(num2, ", accessKey=", str2, ", isDeleted=", sb2);
        sb2.append(bool);
        sb2.append(", attachments=");
        sb2.append(list2);
        sb2.append(", copyright=");
        sb2.append(wallPostCopyright);
        sb2.append(", date=");
        sb2.append(num3);
        sb2.append(", edited=");
        sb2.append(num4);
        sb2.append(", fromId=");
        sb2.append(userId2);
        sb2.append(", geo=");
        sb2.append(wallGeo);
        sb2.append(", id=");
        sb2.append(num5);
        sb2.append(", isArchived=");
        u.s(sb2, bool2, ", isFavorite=", bool3, ", likes=");
        sb2.append(baseLikesInfo);
        sb2.append(", ownerId=");
        sb2.append(userId3);
        sb2.append(", postId=");
        sb2.append(num6);
        sb2.append(", parentsStack=");
        sb2.append(list3);
        sb2.append(", postSource=");
        sb2.append(wallPostSource);
        sb2.append(", postType=");
        sb2.append(wallPostType);
        sb2.append(", reposts=");
        sb2.append(baseRepostsInfo);
        sb2.append(", signerId=");
        sb2.append(userId4);
        sb2.append(", text=");
        sb2.append(str3);
        sb2.append(", views=");
        sb2.append(wallViews);
        sb2.append(")");
        return sb2.toString();
    }

    public WallWallpostFull(@Nullable List<WallWallpostFull> list, @Nullable BaseBoolInt baseBoolInt, @Nullable UserId userId, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable WallWallpostDonut wallWallpostDonut, @Nullable Integer num, @Nullable BaseCommentsInfo baseCommentsInfo, @Nullable BaseBoolInt baseBoolInt4, @Nullable TopicId topicId, @Nullable Float f10, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable Boolean bool, @Nullable List<WallWallpostAttachment> list2, @Nullable WallPostCopyright wallPostCopyright, @Nullable Integer num3, @Nullable Integer num4, @Nullable UserId userId2, @Nullable WallGeo wallGeo, @Nullable Integer num5, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable BaseLikesInfo baseLikesInfo, @Nullable UserId userId3, @Nullable Integer num6, @Nullable List<Integer> list3, @Nullable WallPostSource wallPostSource, @Nullable WallPostType wallPostType, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable UserId userId4, @Nullable String str3, @Nullable WallViews wallViews) {
        this.copyHistory = list;
        this.canEdit = baseBoolInt;
        this.createdBy = userId;
        this.canDelete = baseBoolInt2;
        this.canPin = baseBoolInt3;
        this.donut = wallWallpostDonut;
        this.isPinned = num;
        this.comments = baseCommentsInfo;
        this.markedAsAds = baseBoolInt4;
        this.topicId = topicId;
        this.shortTextRate = f10;
        this.hash = str;
        this.carouselOffset = num2;
        this.accessKey = str2;
        this.isDeleted = bool;
        this.attachments = list2;
        this.copyright = wallPostCopyright;
        this.date = num3;
        this.edited = num4;
        this.fromId = userId2;
        this.geo = wallGeo;
        this.f15260id = num5;
        this.isArchived = bool2;
        this.isFavorite = bool3;
        this.likes = baseLikesInfo;
        this.ownerId = userId3;
        this.postId = num6;
        this.parentsStack = list3;
        this.postSource = wallPostSource;
        this.postType = wallPostType;
        this.reposts = baseRepostsInfo;
        this.signerId = userId4;
        this.text = str3;
        this.views = wallViews;
    }

    public /* synthetic */ WallWallpostFull(List list, BaseBoolInt baseBoolInt, UserId userId, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, WallWallpostDonut wallWallpostDonut, Integer num, BaseCommentsInfo baseCommentsInfo, BaseBoolInt baseBoolInt4, TopicId topicId, Float f10, String str, Integer num2, String str2, Boolean bool, List list2, WallPostCopyright wallPostCopyright, Integer num3, Integer num4, UserId userId2, WallGeo wallGeo, Integer num5, Boolean bool2, Boolean bool3, BaseLikesInfo baseLikesInfo, UserId userId3, Integer num6, List list3, WallPostSource wallPostSource, WallPostType wallPostType, BaseRepostsInfo baseRepostsInfo, UserId userId4, String str3, WallViews wallViews, int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : baseBoolInt, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : baseBoolInt2, (i & 16) != 0 ? null : baseBoolInt3, (i & 32) != 0 ? null : wallWallpostDonut, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : baseCommentsInfo, (i & 256) != 0 ? null : baseBoolInt4, (i & 512) != 0 ? null : topicId, (i & 1024) != 0 ? null : f10, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : bool, (i & 32768) != 0 ? null : list2, (i & 65536) != 0 ? null : wallPostCopyright, (i & 131072) != 0 ? null : num3, (i & 262144) != 0 ? null : num4, (i & 524288) != 0 ? null : userId2, (i & 1048576) != 0 ? null : wallGeo, (i & 2097152) != 0 ? null : num5, (i & 4194304) != 0 ? null : bool2, (i & 8388608) != 0 ? null : bool3, (i & 16777216) != 0 ? null : baseLikesInfo, (i & 33554432) != 0 ? null : userId3, (i & 67108864) != 0 ? null : num6, (i & 134217728) != 0 ? null : list3, (i & 268435456) != 0 ? null : wallPostSource, (i & 536870912) != 0 ? null : wallPostType, (i & 1073741824) != 0 ? null : baseRepostsInfo, (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : userId4, (i10 & 1) != 0 ? null : str3, (i10 & 2) != 0 ? null : wallViews);
    }
}
