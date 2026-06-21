package com.vk.sdk.api.stories.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.video.dto.VideoVideo;
import gf.a;
import io.sentry.rrweb.RRWebVideoEvent;
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
public final class StoriesStory {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("birthday_wish_user_id")
    @Nullable
    private final Integer birthdayWishUserId;

    @b("can_ask")
    @Nullable
    private final BaseBoolInt canAsk;

    @b("can_ask_anonymous")
    @Nullable
    private final BaseBoolInt canAskAnonymous;

    @b("can_comment")
    @Nullable
    private final BaseBoolInt canComment;

    @b("can_hide")
    @Nullable
    private final BaseBoolInt canHide;

    @b("can_like")
    @Nullable
    private final Boolean canLike;

    @b("can_reply")
    @Nullable
    private final BaseBoolInt canReply;

    @b("can_see")
    @Nullable
    private final BaseBoolInt canSee;

    @b("can_share")
    @Nullable
    private final BaseBoolInt canShare;

    @b("can_use_in_narrative")
    @Nullable
    private final Boolean canUseInNarrative;

    @b("clickable_stickers")
    @Nullable
    private final StoriesClickableStickers clickableStickers;

    @b("date")
    @Nullable
    private final Integer date;

    @b("expires_at")
    @Nullable
    private final Integer expiresAt;

    @b("first_narrative_title")
    @Nullable
    private final String firstNarrativeTitle;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15238id;

    @b("is_deleted")
    @Nullable
    private final Boolean isDeleted;

    @b("is_expired")
    @Nullable
    private final Boolean isExpired;

    @b("link")
    @Nullable
    private final StoriesStoryLink link;

    @b("narratives_count")
    @Nullable
    private final Integer narrativesCount;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("parent_story")
    @Nullable
    private final StoriesStory parentStory;

    @b("parent_story_access_key")
    @Nullable
    private final String parentStoryAccessKey;

    @b("parent_story_id")
    @Nullable
    private final Integer parentStoryId;

    @b("parent_story_owner_id")
    @Nullable
    private final Integer parentStoryOwnerId;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("replies")
    @Nullable
    private final StoriesReplies replies;

    @b("seen")
    @Nullable
    private final BaseBoolInt seen;

    @b("type")
    @Nullable
    private final StoriesStoryType type;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final VideoVideo video;

    @b("views")
    @Nullable
    private final Integer views;

    public StoriesStory(int i, @NotNull UserId ownerId, @Nullable String str, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Boolean bool, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable StoriesStoryLink storiesStoryLink, @Nullable StoriesStory storiesStory, @Nullable String str2, @Nullable Integer num3, @Nullable Integer num4, @Nullable PhotosPhoto photosPhoto, @Nullable StoriesReplies storiesReplies, @Nullable BaseBoolInt baseBoolInt6, @Nullable StoriesStoryType storiesStoryType, @Nullable StoriesClickableStickers storiesClickableStickers, @Nullable VideoVideo videoVideo, @Nullable Integer num5, @Nullable BaseBoolInt baseBoolInt7, @Nullable BaseBoolInt baseBoolInt8, @Nullable Integer num6, @Nullable String str3, @Nullable Integer num7, @Nullable Boolean bool4) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f15238id = i;
        this.ownerId = ownerId;
        this.accessKey = str;
        this.canComment = baseBoolInt;
        this.canReply = baseBoolInt2;
        this.canSee = baseBoolInt3;
        this.canLike = bool;
        this.canShare = baseBoolInt4;
        this.canHide = baseBoolInt5;
        this.date = num;
        this.expiresAt = num2;
        this.isDeleted = bool2;
        this.isExpired = bool3;
        this.link = storiesStoryLink;
        this.parentStory = storiesStory;
        this.parentStoryAccessKey = str2;
        this.parentStoryId = num3;
        this.parentStoryOwnerId = num4;
        this.photo = photosPhoto;
        this.replies = storiesReplies;
        this.seen = baseBoolInt6;
        this.type = storiesStoryType;
        this.clickableStickers = storiesClickableStickers;
        this.video = videoVideo;
        this.views = num5;
        this.canAsk = baseBoolInt7;
        this.canAskAnonymous = baseBoolInt8;
        this.narrativesCount = num6;
        this.firstNarrativeTitle = str3;
        this.birthdayWishUserId = num7;
        this.canUseInNarrative = bool4;
    }

    public static /* synthetic */ StoriesStory copy$default(StoriesStory storiesStory, int i, UserId userId, String str, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, Boolean bool, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, Integer num, Integer num2, Boolean bool2, Boolean bool3, StoriesStoryLink storiesStoryLink, StoriesStory storiesStory2, String str2, Integer num3, Integer num4, PhotosPhoto photosPhoto, StoriesReplies storiesReplies, BaseBoolInt baseBoolInt6, StoriesStoryType storiesStoryType, StoriesClickableStickers storiesClickableStickers, VideoVideo videoVideo, Integer num5, BaseBoolInt baseBoolInt7, BaseBoolInt baseBoolInt8, Integer num6, String str3, Integer num7, Boolean bool4, int i10, Object obj) {
        Boolean bool5;
        Integer num8;
        int i11 = (i10 & 1) != 0 ? storiesStory.f15238id : i;
        UserId userId2 = (i10 & 2) != 0 ? storiesStory.ownerId : userId;
        String str4 = (i10 & 4) != 0 ? storiesStory.accessKey : str;
        BaseBoolInt baseBoolInt9 = (i10 & 8) != 0 ? storiesStory.canComment : baseBoolInt;
        BaseBoolInt baseBoolInt10 = (i10 & 16) != 0 ? storiesStory.canReply : baseBoolInt2;
        BaseBoolInt baseBoolInt11 = (i10 & 32) != 0 ? storiesStory.canSee : baseBoolInt3;
        Boolean bool6 = (i10 & 64) != 0 ? storiesStory.canLike : bool;
        BaseBoolInt baseBoolInt12 = (i10 & 128) != 0 ? storiesStory.canShare : baseBoolInt4;
        BaseBoolInt baseBoolInt13 = (i10 & 256) != 0 ? storiesStory.canHide : baseBoolInt5;
        Integer num9 = (i10 & 512) != 0 ? storiesStory.date : num;
        Integer num10 = (i10 & 1024) != 0 ? storiesStory.expiresAt : num2;
        Boolean bool7 = (i10 & 2048) != 0 ? storiesStory.isDeleted : bool2;
        Boolean bool8 = (i10 & 4096) != 0 ? storiesStory.isExpired : bool3;
        StoriesStoryLink storiesStoryLink2 = (i10 & 8192) != 0 ? storiesStory.link : storiesStoryLink;
        int i12 = i11;
        StoriesStory storiesStory3 = (i10 & 16384) != 0 ? storiesStory.parentStory : storiesStory2;
        String str5 = (i10 & 32768) != 0 ? storiesStory.parentStoryAccessKey : str2;
        Integer num11 = (i10 & 65536) != 0 ? storiesStory.parentStoryId : num3;
        Integer num12 = (i10 & 131072) != 0 ? storiesStory.parentStoryOwnerId : num4;
        PhotosPhoto photosPhoto2 = (i10 & 262144) != 0 ? storiesStory.photo : photosPhoto;
        StoriesReplies storiesReplies2 = (i10 & 524288) != 0 ? storiesStory.replies : storiesReplies;
        BaseBoolInt baseBoolInt14 = (i10 & 1048576) != 0 ? storiesStory.seen : baseBoolInt6;
        StoriesStoryType storiesStoryType2 = (i10 & 2097152) != 0 ? storiesStory.type : storiesStoryType;
        StoriesClickableStickers storiesClickableStickers2 = (i10 & 4194304) != 0 ? storiesStory.clickableStickers : storiesClickableStickers;
        VideoVideo videoVideo2 = (i10 & 8388608) != 0 ? storiesStory.video : videoVideo;
        Integer num13 = (i10 & 16777216) != 0 ? storiesStory.views : num5;
        BaseBoolInt baseBoolInt15 = (i10 & 33554432) != 0 ? storiesStory.canAsk : baseBoolInt7;
        BaseBoolInt baseBoolInt16 = (i10 & 67108864) != 0 ? storiesStory.canAskAnonymous : baseBoolInt8;
        Integer num14 = (i10 & 134217728) != 0 ? storiesStory.narrativesCount : num6;
        String str6 = (i10 & 268435456) != 0 ? storiesStory.firstNarrativeTitle : str3;
        Integer num15 = (i10 & 536870912) != 0 ? storiesStory.birthdayWishUserId : num7;
        if ((i10 & 1073741824) != 0) {
            num8 = num15;
            bool5 = storiesStory.canUseInNarrative;
        } else {
            bool5 = bool4;
            num8 = num15;
        }
        return storiesStory.copy(i12, userId2, str4, baseBoolInt9, baseBoolInt10, baseBoolInt11, bool6, baseBoolInt12, baseBoolInt13, num9, num10, bool7, bool8, storiesStoryLink2, storiesStory3, str5, num11, num12, photosPhoto2, storiesReplies2, baseBoolInt14, storiesStoryType2, storiesClickableStickers2, videoVideo2, num13, baseBoolInt15, baseBoolInt16, num14, str6, num8, bool5);
    }

    public final int component1() {
        return this.f15238id;
    }

    @Nullable
    public final Integer component10() {
        return this.date;
    }

    @Nullable
    public final Integer component11() {
        return this.expiresAt;
    }

    @Nullable
    public final Boolean component12() {
        return this.isDeleted;
    }

    @Nullable
    public final Boolean component13() {
        return this.isExpired;
    }

    @Nullable
    public final StoriesStoryLink component14() {
        return this.link;
    }

    @Nullable
    public final StoriesStory component15() {
        return this.parentStory;
    }

    @Nullable
    public final String component16() {
        return this.parentStoryAccessKey;
    }

    @Nullable
    public final Integer component17() {
        return this.parentStoryId;
    }

    @Nullable
    public final Integer component18() {
        return this.parentStoryOwnerId;
    }

    @Nullable
    public final PhotosPhoto component19() {
        return this.photo;
    }

    @NotNull
    public final UserId component2() {
        return this.ownerId;
    }

    @Nullable
    public final StoriesReplies component20() {
        return this.replies;
    }

    @Nullable
    public final BaseBoolInt component21() {
        return this.seen;
    }

    @Nullable
    public final StoriesStoryType component22() {
        return this.type;
    }

    @Nullable
    public final StoriesClickableStickers component23() {
        return this.clickableStickers;
    }

    @Nullable
    public final VideoVideo component24() {
        return this.video;
    }

    @Nullable
    public final Integer component25() {
        return this.views;
    }

    @Nullable
    public final BaseBoolInt component26() {
        return this.canAsk;
    }

    @Nullable
    public final BaseBoolInt component27() {
        return this.canAskAnonymous;
    }

    @Nullable
    public final Integer component28() {
        return this.narrativesCount;
    }

    @Nullable
    public final String component29() {
        return this.firstNarrativeTitle;
    }

    @Nullable
    public final String component3() {
        return this.accessKey;
    }

    @Nullable
    public final Integer component30() {
        return this.birthdayWishUserId;
    }

    @Nullable
    public final Boolean component31() {
        return this.canUseInNarrative;
    }

    @Nullable
    public final BaseBoolInt component4() {
        return this.canComment;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.canReply;
    }

    @Nullable
    public final BaseBoolInt component6() {
        return this.canSee;
    }

    @Nullable
    public final Boolean component7() {
        return this.canLike;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.canShare;
    }

    @Nullable
    public final BaseBoolInt component9() {
        return this.canHide;
    }

    @NotNull
    public final StoriesStory copy(int i, @NotNull UserId ownerId, @Nullable String str, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Boolean bool, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable StoriesStoryLink storiesStoryLink, @Nullable StoriesStory storiesStory, @Nullable String str2, @Nullable Integer num3, @Nullable Integer num4, @Nullable PhotosPhoto photosPhoto, @Nullable StoriesReplies storiesReplies, @Nullable BaseBoolInt baseBoolInt6, @Nullable StoriesStoryType storiesStoryType, @Nullable StoriesClickableStickers storiesClickableStickers, @Nullable VideoVideo videoVideo, @Nullable Integer num5, @Nullable BaseBoolInt baseBoolInt7, @Nullable BaseBoolInt baseBoolInt8, @Nullable Integer num6, @Nullable String str3, @Nullable Integer num7, @Nullable Boolean bool4) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        return new StoriesStory(i, ownerId, str, baseBoolInt, baseBoolInt2, baseBoolInt3, bool, baseBoolInt4, baseBoolInt5, num, num2, bool2, bool3, storiesStoryLink, storiesStory, str2, num3, num4, photosPhoto, storiesReplies, baseBoolInt6, storiesStoryType, storiesClickableStickers, videoVideo, num5, baseBoolInt7, baseBoolInt8, num6, str3, num7, bool4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStory)) {
            return false;
        }
        StoriesStory storiesStory = (StoriesStory) obj;
        return this.f15238id == storiesStory.f15238id && Intrinsics.a(this.ownerId, storiesStory.ownerId) && Intrinsics.a(this.accessKey, storiesStory.accessKey) && this.canComment == storiesStory.canComment && this.canReply == storiesStory.canReply && this.canSee == storiesStory.canSee && Intrinsics.a(this.canLike, storiesStory.canLike) && this.canShare == storiesStory.canShare && this.canHide == storiesStory.canHide && Intrinsics.a(this.date, storiesStory.date) && Intrinsics.a(this.expiresAt, storiesStory.expiresAt) && Intrinsics.a(this.isDeleted, storiesStory.isDeleted) && Intrinsics.a(this.isExpired, storiesStory.isExpired) && Intrinsics.a(this.link, storiesStory.link) && Intrinsics.a(this.parentStory, storiesStory.parentStory) && Intrinsics.a(this.parentStoryAccessKey, storiesStory.parentStoryAccessKey) && Intrinsics.a(this.parentStoryId, storiesStory.parentStoryId) && Intrinsics.a(this.parentStoryOwnerId, storiesStory.parentStoryOwnerId) && Intrinsics.a(this.photo, storiesStory.photo) && Intrinsics.a(this.replies, storiesStory.replies) && this.seen == storiesStory.seen && this.type == storiesStory.type && Intrinsics.a(this.clickableStickers, storiesStory.clickableStickers) && Intrinsics.a(this.video, storiesStory.video) && Intrinsics.a(this.views, storiesStory.views) && this.canAsk == storiesStory.canAsk && this.canAskAnonymous == storiesStory.canAskAnonymous && Intrinsics.a(this.narrativesCount, storiesStory.narrativesCount) && Intrinsics.a(this.firstNarrativeTitle, storiesStory.firstNarrativeTitle) && Intrinsics.a(this.birthdayWishUserId, storiesStory.birthdayWishUserId) && Intrinsics.a(this.canUseInNarrative, storiesStory.canUseInNarrative);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final Integer getBirthdayWishUserId() {
        return this.birthdayWishUserId;
    }

    @Nullable
    public final BaseBoolInt getCanAsk() {
        return this.canAsk;
    }

    @Nullable
    public final BaseBoolInt getCanAskAnonymous() {
        return this.canAskAnonymous;
    }

    @Nullable
    public final BaseBoolInt getCanComment() {
        return this.canComment;
    }

    @Nullable
    public final BaseBoolInt getCanHide() {
        return this.canHide;
    }

    @Nullable
    public final Boolean getCanLike() {
        return this.canLike;
    }

    @Nullable
    public final BaseBoolInt getCanReply() {
        return this.canReply;
    }

    @Nullable
    public final BaseBoolInt getCanSee() {
        return this.canSee;
    }

    @Nullable
    public final BaseBoolInt getCanShare() {
        return this.canShare;
    }

    @Nullable
    public final Boolean getCanUseInNarrative() {
        return this.canUseInNarrative;
    }

    @Nullable
    public final StoriesClickableStickers getClickableStickers() {
        return this.clickableStickers;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getExpiresAt() {
        return this.expiresAt;
    }

    @Nullable
    public final String getFirstNarrativeTitle() {
        return this.firstNarrativeTitle;
    }

    public final int getId() {
        return this.f15238id;
    }

    @Nullable
    public final StoriesStoryLink getLink() {
        return this.link;
    }

    @Nullable
    public final Integer getNarrativesCount() {
        return this.narrativesCount;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final StoriesStory getParentStory() {
        return this.parentStory;
    }

    @Nullable
    public final String getParentStoryAccessKey() {
        return this.parentStoryAccessKey;
    }

    @Nullable
    public final Integer getParentStoryId() {
        return this.parentStoryId;
    }

    @Nullable
    public final Integer getParentStoryOwnerId() {
        return this.parentStoryOwnerId;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final StoriesReplies getReplies() {
        return this.replies;
    }

    @Nullable
    public final BaseBoolInt getSeen() {
        return this.seen;
    }

    @Nullable
    public final StoriesStoryType getType() {
        return this.type;
    }

    @Nullable
    public final VideoVideo getVideo() {
        return this.video;
    }

    @Nullable
    public final Integer getViews() {
        return this.views;
    }

    public int hashCode() {
        int iE = o.e(this.ownerId, Integer.hashCode(this.f15238id) * 31, 31);
        String str = this.accessKey;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canComment;
        int iHashCode2 = (iHashCode + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.canReply;
        int iHashCode3 = (iHashCode2 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.canSee;
        int iHashCode4 = (iHashCode3 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        Boolean bool = this.canLike;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.canShare;
        int iHashCode6 = (iHashCode5 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        BaseBoolInt baseBoolInt5 = this.canHide;
        int iHashCode7 = (iHashCode6 + (baseBoolInt5 == null ? 0 : baseBoolInt5.hashCode())) * 31;
        Integer num = this.date;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expiresAt;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isDeleted;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isExpired;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        StoriesStoryLink storiesStoryLink = this.link;
        int iHashCode12 = (iHashCode11 + (storiesStoryLink == null ? 0 : storiesStoryLink.hashCode())) * 31;
        StoriesStory storiesStory = this.parentStory;
        int iHashCode13 = (iHashCode12 + (storiesStory == null ? 0 : storiesStory.hashCode())) * 31;
        String str2 = this.parentStoryAccessKey;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.parentStoryId;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.parentStoryOwnerId;
        int iHashCode16 = (iHashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode17 = (iHashCode16 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        StoriesReplies storiesReplies = this.replies;
        int iHashCode18 = (iHashCode17 + (storiesReplies == null ? 0 : storiesReplies.hashCode())) * 31;
        BaseBoolInt baseBoolInt6 = this.seen;
        int iHashCode19 = (iHashCode18 + (baseBoolInt6 == null ? 0 : baseBoolInt6.hashCode())) * 31;
        StoriesStoryType storiesStoryType = this.type;
        int iHashCode20 = (iHashCode19 + (storiesStoryType == null ? 0 : storiesStoryType.hashCode())) * 31;
        StoriesClickableStickers storiesClickableStickers = this.clickableStickers;
        int iHashCode21 = (iHashCode20 + (storiesClickableStickers == null ? 0 : storiesClickableStickers.hashCode())) * 31;
        VideoVideo videoVideo = this.video;
        int iHashCode22 = (iHashCode21 + (videoVideo == null ? 0 : videoVideo.hashCode())) * 31;
        Integer num5 = this.views;
        int iHashCode23 = (iHashCode22 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BaseBoolInt baseBoolInt7 = this.canAsk;
        int iHashCode24 = (iHashCode23 + (baseBoolInt7 == null ? 0 : baseBoolInt7.hashCode())) * 31;
        BaseBoolInt baseBoolInt8 = this.canAskAnonymous;
        int iHashCode25 = (iHashCode24 + (baseBoolInt8 == null ? 0 : baseBoolInt8.hashCode())) * 31;
        Integer num6 = this.narrativesCount;
        int iHashCode26 = (iHashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str3 = this.firstNarrativeTitle;
        int iHashCode27 = (iHashCode26 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num7 = this.birthdayWishUserId;
        int iHashCode28 = (iHashCode27 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool4 = this.canUseInNarrative;
        return iHashCode28 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    @Nullable
    public final Boolean isExpired() {
        return this.isExpired;
    }

    @NotNull
    public String toString() {
        int i = this.f15238id;
        UserId userId = this.ownerId;
        String str = this.accessKey;
        BaseBoolInt baseBoolInt = this.canComment;
        BaseBoolInt baseBoolInt2 = this.canReply;
        BaseBoolInt baseBoolInt3 = this.canSee;
        Boolean bool = this.canLike;
        BaseBoolInt baseBoolInt4 = this.canShare;
        BaseBoolInt baseBoolInt5 = this.canHide;
        Integer num = this.date;
        Integer num2 = this.expiresAt;
        Boolean bool2 = this.isDeleted;
        Boolean bool3 = this.isExpired;
        StoriesStoryLink storiesStoryLink = this.link;
        StoriesStory storiesStory = this.parentStory;
        String str2 = this.parentStoryAccessKey;
        Integer num3 = this.parentStoryId;
        Integer num4 = this.parentStoryOwnerId;
        PhotosPhoto photosPhoto = this.photo;
        StoriesReplies storiesReplies = this.replies;
        BaseBoolInt baseBoolInt6 = this.seen;
        StoriesStoryType storiesStoryType = this.type;
        StoriesClickableStickers storiesClickableStickers = this.clickableStickers;
        VideoVideo videoVideo = this.video;
        Integer num5 = this.views;
        BaseBoolInt baseBoolInt7 = this.canAsk;
        BaseBoolInt baseBoolInt8 = this.canAskAnonymous;
        Integer num6 = this.narrativesCount;
        String str3 = this.firstNarrativeTitle;
        Integer num7 = this.birthdayWishUserId;
        Boolean bool4 = this.canUseInNarrative;
        StringBuilder sb2 = new StringBuilder("StoriesStory(id=");
        sb2.append(i);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", accessKey=");
        sb2.append(str);
        sb2.append(", canComment=");
        sb2.append(baseBoolInt);
        sb2.append(", canReply=");
        a.s(sb2, baseBoolInt2, ", canSee=", baseBoolInt3, ", canLike=");
        sb2.append(bool);
        sb2.append(", canShare=");
        sb2.append(baseBoolInt4);
        sb2.append(", canHide=");
        sb2.append(baseBoolInt5);
        sb2.append(", date=");
        sb2.append(num);
        sb2.append(", expiresAt=");
        sb2.append(num2);
        sb2.append(", isDeleted=");
        sb2.append(bool2);
        sb2.append(", isExpired=");
        sb2.append(bool3);
        sb2.append(", link=");
        sb2.append(storiesStoryLink);
        sb2.append(", parentStory=");
        sb2.append(storiesStory);
        sb2.append(", parentStoryAccessKey=");
        sb2.append(str2);
        sb2.append(", parentStoryId=");
        a.t(sb2, num3, ", parentStoryOwnerId=", num4, ", photo=");
        sb2.append(photosPhoto);
        sb2.append(", replies=");
        sb2.append(storiesReplies);
        sb2.append(", seen=");
        sb2.append(baseBoolInt6);
        sb2.append(", type=");
        sb2.append(storiesStoryType);
        sb2.append(", clickableStickers=");
        sb2.append(storiesClickableStickers);
        sb2.append(", video=");
        sb2.append(videoVideo);
        sb2.append(", views=");
        sb2.append(num5);
        sb2.append(", canAsk=");
        sb2.append(baseBoolInt7);
        sb2.append(", canAskAnonymous=");
        sb2.append(baseBoolInt8);
        sb2.append(", narrativesCount=");
        sb2.append(num6);
        sb2.append(", firstNarrativeTitle=");
        a.r(num7, str3, ", birthdayWishUserId=", ", canUseInNarrative=", sb2);
        sb2.append(bool4);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ StoriesStory(int i, UserId userId, String str, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, Boolean bool, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, Integer num, Integer num2, Boolean bool2, Boolean bool3, StoriesStoryLink storiesStoryLink, StoriesStory storiesStory, String str2, Integer num3, Integer num4, PhotosPhoto photosPhoto, StoriesReplies storiesReplies, BaseBoolInt baseBoolInt6, StoriesStoryType storiesStoryType, StoriesClickableStickers storiesClickableStickers, VideoVideo videoVideo, Integer num5, BaseBoolInt baseBoolInt7, BaseBoolInt baseBoolInt8, Integer num6, String str3, Integer num7, Boolean bool4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : baseBoolInt, (i10 & 16) != 0 ? null : baseBoolInt2, (i10 & 32) != 0 ? null : baseBoolInt3, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : baseBoolInt4, (i10 & 256) != 0 ? null : baseBoolInt5, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : num2, (i10 & 2048) != 0 ? null : bool2, (i10 & 4096) != 0 ? null : bool3, (i10 & 8192) != 0 ? null : storiesStoryLink, (i10 & 16384) != 0 ? null : storiesStory, (32768 & i10) != 0 ? null : str2, (65536 & i10) != 0 ? null : num3, (131072 & i10) != 0 ? null : num4, (262144 & i10) != 0 ? null : photosPhoto, (524288 & i10) != 0 ? null : storiesReplies, (1048576 & i10) != 0 ? null : baseBoolInt6, (2097152 & i10) != 0 ? null : storiesStoryType, (4194304 & i10) != 0 ? null : storiesClickableStickers, (8388608 & i10) != 0 ? null : videoVideo, (16777216 & i10) != 0 ? null : num5, (33554432 & i10) != 0 ? null : baseBoolInt7, (67108864 & i10) != 0 ? null : baseBoolInt8, (134217728 & i10) != 0 ? null : num6, (268435456 & i10) != 0 ? null : str3, (536870912 & i10) != 0 ? null : num7, (i10 & 1073741824) != 0 ? null : bool4);
    }
}
