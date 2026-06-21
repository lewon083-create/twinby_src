package com.vk.sdk.api.video.dto;

import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.audio.dto.AudioArtist;
import com.vk.sdk.api.audio.dto.AudioGenre;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseLikes;
import com.vk.sdk.api.base.dto.BasePropertyExists;
import com.vk.sdk.api.base.dto.BaseRepostsInfo;
import gf.a;
import io.sentry.Session;
import io.sentry.TraceContext;
import io.sentry.UserFeedback;
import io.sentry.rrweb.RRWebVideoEvent;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class VideoVideo {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("added")
    @Nullable
    private final BaseBoolInt added;

    @b("adding_date")
    @Nullable
    private final Integer addingDate;

    @b("balance")
    @Nullable
    private final Integer balance;

    @b("can_add")
    @Nullable
    private final BaseBoolInt canAdd;

    @b("can_add_to_faves")
    @Nullable
    private final BaseBoolInt canAddToFaves;

    @b("can_attach_link")
    @Nullable
    private final BaseBoolInt canAttachLink;

    @b("can_comment")
    @Nullable
    private final BaseBoolInt canComment;

    @b("can_edit")
    @Nullable
    private final BaseBoolInt canEdit;

    @b("can_like")
    @Nullable
    private final BaseBoolInt canLike;

    @b("can_repost")
    @Nullable
    private final BaseBoolInt canRepost;

    @b("can_subscribe")
    @Nullable
    private final BaseBoolInt canSubscribe;

    @b(UserFeedback.JsonKeys.COMMENTS)
    @Nullable
    private final Integer comments;

    @b("content_restricted")
    @Nullable
    private final Integer contentRestricted;

    @b("content_restricted_message")
    @Nullable
    private final String contentRestrictedMessage;

    @b("converting")
    @Nullable
    private final BaseBoolInt converting;

    @b("date")
    @Nullable
    private final Integer date;

    @b("description")
    @Nullable
    private final String description;

    @b("duration")
    @Nullable
    private final Integer duration;

    @b("featured_artists")
    @Nullable
    private final List<AudioArtist> featuredArtists;

    @b("first_frame")
    @Nullable
    private final List<VideoVideoImage> firstFrame;

    @b("genres")
    @Nullable
    private final List<AudioGenre> genres;

    @b("height")
    @Nullable
    private final Integer height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15250id;

    @b("image")
    @Nullable
    private final List<VideoVideoImage> image;

    @b("is_explicit")
    @Nullable
    private final BaseBoolInt isExplicit;

    @b("is_favorite")
    @Nullable
    private final Boolean isFavorite;

    @b("is_private")
    @Nullable
    private final BaseBoolInt isPrivate;

    @b("is_subscribed")
    @Nullable
    private final BaseBoolInt isSubscribed;

    @b("likes")
    @Nullable
    private final BaseLikes likes;

    @b("live")
    @Nullable
    private final BasePropertyExists live;

    @b("live_notify")
    @Nullable
    private final BaseBoolInt liveNotify;

    @b("live_start_time")
    @Nullable
    private final Integer liveStartTime;

    @b("live_status")
    @Nullable
    private final LiveStatus liveStatus;

    @b("local_views")
    @Nullable
    private final Integer localViews;

    @b("main_artists")
    @Nullable
    private final List<AudioArtist> mainArtists;

    @b("owner_id")
    @Nullable
    private final UserId ownerId;

    @b("platform")
    @Nullable
    private final String platform;

    @b("player")
    @Nullable
    private final String player;

    @b("processing")
    @Nullable
    private final BasePropertyExists processing;

    @b("release_date")
    @Nullable
    private final Integer releaseDate;

    @b("repeat")
    @Nullable
    private final BasePropertyExists repeat;

    @b("reposts")
    @Nullable
    private final BaseRepostsInfo reposts;

    @b("spectators")
    @Nullable
    private final Integer spectators;

    @b("subtitle")
    @Nullable
    private final String subtitle;

    @b("title")
    @Nullable
    private final String title;

    @b("track_code")
    @Nullable
    private final String trackCode;

    @b("type")
    @Nullable
    private final Type type;

    @b("upcoming")
    @Nullable
    private final BasePropertyExists upcoming;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final UserId userId;

    @b("views")
    @Nullable
    private final Integer views;

    @b("width")
    @Nullable
    private final Integer width;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum LiveStatus {
        WAITING("waiting"),
        STARTED(Session.JsonKeys.STARTED),
        FINISHED("finished"),
        FAILED("failed"),
        UPCOMING("upcoming");


        @NotNull
        private final String value;

        LiveStatus(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        VIDEO(RRWebVideoEvent.EVENT_TAG),
        MUSIC_VIDEO("music_video"),
        MOVIE("movie");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public VideoVideo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1048575, null);
    }

    @Nullable
    public final String component1() {
        return this.accessKey;
    }

    @Nullable
    public final BaseBoolInt component10() {
        return this.canAttachLink;
    }

    @Nullable
    public final BaseBoolInt component11() {
        return this.isPrivate;
    }

    @Nullable
    public final Integer component12() {
        return this.comments;
    }

    @Nullable
    public final Integer component13() {
        return this.date;
    }

    @Nullable
    public final String component14() {
        return this.description;
    }

    @Nullable
    public final Integer component15() {
        return this.duration;
    }

    @Nullable
    public final List<VideoVideoImage> component16() {
        return this.image;
    }

    @Nullable
    public final List<VideoVideoImage> component17() {
        return this.firstFrame;
    }

    @Nullable
    public final Integer component18() {
        return this.width;
    }

    @Nullable
    public final Integer component19() {
        return this.height;
    }

    @Nullable
    public final Integer component2() {
        return this.addingDate;
    }

    @Nullable
    public final Integer component20() {
        return this.f15250id;
    }

    @Nullable
    public final UserId component21() {
        return this.ownerId;
    }

    @Nullable
    public final UserId component22() {
        return this.userId;
    }

    @Nullable
    public final String component23() {
        return this.title;
    }

    @Nullable
    public final Boolean component24() {
        return this.isFavorite;
    }

    @Nullable
    public final String component25() {
        return this.player;
    }

    @Nullable
    public final BasePropertyExists component26() {
        return this.processing;
    }

    @Nullable
    public final BaseBoolInt component27() {
        return this.converting;
    }

    @Nullable
    public final BaseBoolInt component28() {
        return this.added;
    }

    @Nullable
    public final BaseBoolInt component29() {
        return this.isSubscribed;
    }

    @Nullable
    public final BaseBoolInt component3() {
        return this.canComment;
    }

    @Nullable
    public final String component30() {
        return this.trackCode;
    }

    @Nullable
    public final BasePropertyExists component31() {
        return this.repeat;
    }

    @Nullable
    public final Type component32() {
        return this.type;
    }

    @Nullable
    public final Integer component33() {
        return this.views;
    }

    @Nullable
    public final Integer component34() {
        return this.localViews;
    }

    @Nullable
    public final Integer component35() {
        return this.contentRestricted;
    }

    @Nullable
    public final String component36() {
        return this.contentRestrictedMessage;
    }

    @Nullable
    public final Integer component37() {
        return this.balance;
    }

    @Nullable
    public final LiveStatus component38() {
        return this.liveStatus;
    }

    @Nullable
    public final BasePropertyExists component39() {
        return this.live;
    }

    @Nullable
    public final BaseBoolInt component4() {
        return this.canEdit;
    }

    @Nullable
    public final BasePropertyExists component40() {
        return this.upcoming;
    }

    @Nullable
    public final Integer component41() {
        return this.liveStartTime;
    }

    @Nullable
    public final BaseBoolInt component42() {
        return this.liveNotify;
    }

    @Nullable
    public final Integer component43() {
        return this.spectators;
    }

    @Nullable
    public final String component44() {
        return this.platform;
    }

    @Nullable
    public final BaseLikes component45() {
        return this.likes;
    }

    @Nullable
    public final BaseRepostsInfo component46() {
        return this.reposts;
    }

    @Nullable
    public final BaseBoolInt component47() {
        return this.isExplicit;
    }

    @Nullable
    public final List<AudioArtist> component48() {
        return this.mainArtists;
    }

    @Nullable
    public final List<AudioArtist> component49() {
        return this.featuredArtists;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.canLike;
    }

    @Nullable
    public final String component50() {
        return this.subtitle;
    }

    @Nullable
    public final Integer component51() {
        return this.releaseDate;
    }

    @Nullable
    public final List<AudioGenre> component52() {
        return this.genres;
    }

    @Nullable
    public final BaseBoolInt component6() {
        return this.canRepost;
    }

    @Nullable
    public final BaseBoolInt component7() {
        return this.canSubscribe;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.canAddToFaves;
    }

    @Nullable
    public final BaseBoolInt component9() {
        return this.canAdd;
    }

    @NotNull
    public final VideoVideo copy(@Nullable String str, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable BaseBoolInt baseBoolInt8, @Nullable BaseBoolInt baseBoolInt9, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable Integer num4, @Nullable List<VideoVideoImage> list, @Nullable List<VideoVideoImage> list2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable UserId userId, @Nullable UserId userId2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable BasePropertyExists basePropertyExists, @Nullable BaseBoolInt baseBoolInt10, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable String str5, @Nullable BasePropertyExists basePropertyExists2, @Nullable Type type, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable String str6, @Nullable Integer num11, @Nullable LiveStatus liveStatus, @Nullable BasePropertyExists basePropertyExists3, @Nullable BasePropertyExists basePropertyExists4, @Nullable Integer num12, @Nullable BaseBoolInt baseBoolInt13, @Nullable Integer num13, @Nullable String str7, @Nullable BaseLikes baseLikes, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable BaseBoolInt baseBoolInt14, @Nullable List<AudioArtist> list3, @Nullable List<AudioArtist> list4, @Nullable String str8, @Nullable Integer num14, @Nullable List<AudioGenre> list5) {
        return new VideoVideo(str, num, baseBoolInt, baseBoolInt2, baseBoolInt3, baseBoolInt4, baseBoolInt5, baseBoolInt6, baseBoolInt7, baseBoolInt8, baseBoolInt9, num2, num3, str2, num4, list, list2, num5, num6, num7, userId, userId2, str3, bool, str4, basePropertyExists, baseBoolInt10, baseBoolInt11, baseBoolInt12, str5, basePropertyExists2, type, num8, num9, num10, str6, num11, liveStatus, basePropertyExists3, basePropertyExists4, num12, baseBoolInt13, num13, str7, baseLikes, baseRepostsInfo, baseBoolInt14, list3, list4, str8, num14, list5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideo)) {
            return false;
        }
        VideoVideo videoVideo = (VideoVideo) obj;
        return Intrinsics.a(this.accessKey, videoVideo.accessKey) && Intrinsics.a(this.addingDate, videoVideo.addingDate) && this.canComment == videoVideo.canComment && this.canEdit == videoVideo.canEdit && this.canLike == videoVideo.canLike && this.canRepost == videoVideo.canRepost && this.canSubscribe == videoVideo.canSubscribe && this.canAddToFaves == videoVideo.canAddToFaves && this.canAdd == videoVideo.canAdd && this.canAttachLink == videoVideo.canAttachLink && this.isPrivate == videoVideo.isPrivate && Intrinsics.a(this.comments, videoVideo.comments) && Intrinsics.a(this.date, videoVideo.date) && Intrinsics.a(this.description, videoVideo.description) && Intrinsics.a(this.duration, videoVideo.duration) && Intrinsics.a(this.image, videoVideo.image) && Intrinsics.a(this.firstFrame, videoVideo.firstFrame) && Intrinsics.a(this.width, videoVideo.width) && Intrinsics.a(this.height, videoVideo.height) && Intrinsics.a(this.f15250id, videoVideo.f15250id) && Intrinsics.a(this.ownerId, videoVideo.ownerId) && Intrinsics.a(this.userId, videoVideo.userId) && Intrinsics.a(this.title, videoVideo.title) && Intrinsics.a(this.isFavorite, videoVideo.isFavorite) && Intrinsics.a(this.player, videoVideo.player) && this.processing == videoVideo.processing && this.converting == videoVideo.converting && this.added == videoVideo.added && this.isSubscribed == videoVideo.isSubscribed && Intrinsics.a(this.trackCode, videoVideo.trackCode) && this.repeat == videoVideo.repeat && this.type == videoVideo.type && Intrinsics.a(this.views, videoVideo.views) && Intrinsics.a(this.localViews, videoVideo.localViews) && Intrinsics.a(this.contentRestricted, videoVideo.contentRestricted) && Intrinsics.a(this.contentRestrictedMessage, videoVideo.contentRestrictedMessage) && Intrinsics.a(this.balance, videoVideo.balance) && this.liveStatus == videoVideo.liveStatus && this.live == videoVideo.live && this.upcoming == videoVideo.upcoming && Intrinsics.a(this.liveStartTime, videoVideo.liveStartTime) && this.liveNotify == videoVideo.liveNotify && Intrinsics.a(this.spectators, videoVideo.spectators) && Intrinsics.a(this.platform, videoVideo.platform) && Intrinsics.a(this.likes, videoVideo.likes) && Intrinsics.a(this.reposts, videoVideo.reposts) && this.isExplicit == videoVideo.isExplicit && Intrinsics.a(this.mainArtists, videoVideo.mainArtists) && Intrinsics.a(this.featuredArtists, videoVideo.featuredArtists) && Intrinsics.a(this.subtitle, videoVideo.subtitle) && Intrinsics.a(this.releaseDate, videoVideo.releaseDate) && Intrinsics.a(this.genres, videoVideo.genres);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final BaseBoolInt getAdded() {
        return this.added;
    }

    @Nullable
    public final Integer getAddingDate() {
        return this.addingDate;
    }

    @Nullable
    public final Integer getBalance() {
        return this.balance;
    }

    @Nullable
    public final BaseBoolInt getCanAdd() {
        return this.canAdd;
    }

    @Nullable
    public final BaseBoolInt getCanAddToFaves() {
        return this.canAddToFaves;
    }

    @Nullable
    public final BaseBoolInt getCanAttachLink() {
        return this.canAttachLink;
    }

    @Nullable
    public final BaseBoolInt getCanComment() {
        return this.canComment;
    }

    @Nullable
    public final BaseBoolInt getCanEdit() {
        return this.canEdit;
    }

    @Nullable
    public final BaseBoolInt getCanLike() {
        return this.canLike;
    }

    @Nullable
    public final BaseBoolInt getCanRepost() {
        return this.canRepost;
    }

    @Nullable
    public final BaseBoolInt getCanSubscribe() {
        return this.canSubscribe;
    }

    @Nullable
    public final Integer getComments() {
        return this.comments;
    }

    @Nullable
    public final Integer getContentRestricted() {
        return this.contentRestricted;
    }

    @Nullable
    public final String getContentRestrictedMessage() {
        return this.contentRestrictedMessage;
    }

    @Nullable
    public final BaseBoolInt getConverting() {
        return this.converting;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    public final List<AudioArtist> getFeaturedArtists() {
        return this.featuredArtists;
    }

    @Nullable
    public final List<VideoVideoImage> getFirstFrame() {
        return this.firstFrame;
    }

    @Nullable
    public final List<AudioGenre> getGenres() {
        return this.genres;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getId() {
        return this.f15250id;
    }

    @Nullable
    public final List<VideoVideoImage> getImage() {
        return this.image;
    }

    @Nullable
    public final BaseLikes getLikes() {
        return this.likes;
    }

    @Nullable
    public final BasePropertyExists getLive() {
        return this.live;
    }

    @Nullable
    public final BaseBoolInt getLiveNotify() {
        return this.liveNotify;
    }

    @Nullable
    public final Integer getLiveStartTime() {
        return this.liveStartTime;
    }

    @Nullable
    public final LiveStatus getLiveStatus() {
        return this.liveStatus;
    }

    @Nullable
    public final Integer getLocalViews() {
        return this.localViews;
    }

    @Nullable
    public final List<AudioArtist> getMainArtists() {
        return this.mainArtists;
    }

    @Nullable
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getPlayer() {
        return this.player;
    }

    @Nullable
    public final BasePropertyExists getProcessing() {
        return this.processing;
    }

    @Nullable
    public final Integer getReleaseDate() {
        return this.releaseDate;
    }

    @Nullable
    public final BasePropertyExists getRepeat() {
        return this.repeat;
    }

    @Nullable
    public final BaseRepostsInfo getReposts() {
        return this.reposts;
    }

    @Nullable
    public final Integer getSpectators() {
        return this.spectators;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTrackCode() {
        return this.trackCode;
    }

    @Nullable
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final BasePropertyExists getUpcoming() {
        return this.upcoming;
    }

    @Nullable
    public final UserId getUserId() {
        return this.userId;
    }

    @Nullable
    public final Integer getViews() {
        return this.views;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.accessKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.addingDate;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canComment;
        int iHashCode3 = (iHashCode2 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.canEdit;
        int iHashCode4 = (iHashCode3 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.canLike;
        int iHashCode5 = (iHashCode4 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.canRepost;
        int iHashCode6 = (iHashCode5 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        BaseBoolInt baseBoolInt5 = this.canSubscribe;
        int iHashCode7 = (iHashCode6 + (baseBoolInt5 == null ? 0 : baseBoolInt5.hashCode())) * 31;
        BaseBoolInt baseBoolInt6 = this.canAddToFaves;
        int iHashCode8 = (iHashCode7 + (baseBoolInt6 == null ? 0 : baseBoolInt6.hashCode())) * 31;
        BaseBoolInt baseBoolInt7 = this.canAdd;
        int iHashCode9 = (iHashCode8 + (baseBoolInt7 == null ? 0 : baseBoolInt7.hashCode())) * 31;
        BaseBoolInt baseBoolInt8 = this.canAttachLink;
        int iHashCode10 = (iHashCode9 + (baseBoolInt8 == null ? 0 : baseBoolInt8.hashCode())) * 31;
        BaseBoolInt baseBoolInt9 = this.isPrivate;
        int iHashCode11 = (iHashCode10 + (baseBoolInt9 == null ? 0 : baseBoolInt9.hashCode())) * 31;
        Integer num2 = this.comments;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.date;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.duration;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<VideoVideoImage> list = this.image;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoVideoImage> list2 = this.firstFrame;
        int iHashCode17 = (iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num5 = this.width;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.height;
        int iHashCode19 = (iHashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f15250id;
        int iHashCode20 = (iHashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        UserId userId = this.ownerId;
        int iHashCode21 = (iHashCode20 + (userId == null ? 0 : userId.hashCode())) * 31;
        UserId userId2 = this.userId;
        int iHashCode22 = (iHashCode21 + (userId2 == null ? 0 : userId2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode23 = (iHashCode22 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int iHashCode24 = (iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.player;
        int iHashCode25 = (iHashCode24 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BasePropertyExists basePropertyExists = this.processing;
        int iHashCode26 = (iHashCode25 + (basePropertyExists == null ? 0 : basePropertyExists.hashCode())) * 31;
        BaseBoolInt baseBoolInt10 = this.converting;
        int iHashCode27 = (iHashCode26 + (baseBoolInt10 == null ? 0 : baseBoolInt10.hashCode())) * 31;
        BaseBoolInt baseBoolInt11 = this.added;
        int iHashCode28 = (iHashCode27 + (baseBoolInt11 == null ? 0 : baseBoolInt11.hashCode())) * 31;
        BaseBoolInt baseBoolInt12 = this.isSubscribed;
        int iHashCode29 = (iHashCode28 + (baseBoolInt12 == null ? 0 : baseBoolInt12.hashCode())) * 31;
        String str5 = this.trackCode;
        int iHashCode30 = (iHashCode29 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BasePropertyExists basePropertyExists2 = this.repeat;
        int iHashCode31 = (iHashCode30 + (basePropertyExists2 == null ? 0 : basePropertyExists2.hashCode())) * 31;
        Type type = this.type;
        int iHashCode32 = (iHashCode31 + (type == null ? 0 : type.hashCode())) * 31;
        Integer num8 = this.views;
        int iHashCode33 = (iHashCode32 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.localViews;
        int iHashCode34 = (iHashCode33 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.contentRestricted;
        int iHashCode35 = (iHashCode34 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str6 = this.contentRestrictedMessage;
        int iHashCode36 = (iHashCode35 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num11 = this.balance;
        int iHashCode37 = (iHashCode36 + (num11 == null ? 0 : num11.hashCode())) * 31;
        LiveStatus liveStatus = this.liveStatus;
        int iHashCode38 = (iHashCode37 + (liveStatus == null ? 0 : liveStatus.hashCode())) * 31;
        BasePropertyExists basePropertyExists3 = this.live;
        int iHashCode39 = (iHashCode38 + (basePropertyExists3 == null ? 0 : basePropertyExists3.hashCode())) * 31;
        BasePropertyExists basePropertyExists4 = this.upcoming;
        int iHashCode40 = (iHashCode39 + (basePropertyExists4 == null ? 0 : basePropertyExists4.hashCode())) * 31;
        Integer num12 = this.liveStartTime;
        int iHashCode41 = (iHashCode40 + (num12 == null ? 0 : num12.hashCode())) * 31;
        BaseBoolInt baseBoolInt13 = this.liveNotify;
        int iHashCode42 = (iHashCode41 + (baseBoolInt13 == null ? 0 : baseBoolInt13.hashCode())) * 31;
        Integer num13 = this.spectators;
        int iHashCode43 = (iHashCode42 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str7 = this.platform;
        int iHashCode44 = (iHashCode43 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BaseLikes baseLikes = this.likes;
        int iHashCode45 = (iHashCode44 + (baseLikes == null ? 0 : baseLikes.hashCode())) * 31;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        int iHashCode46 = (iHashCode45 + (baseRepostsInfo == null ? 0 : baseRepostsInfo.hashCode())) * 31;
        BaseBoolInt baseBoolInt14 = this.isExplicit;
        int iHashCode47 = (iHashCode46 + (baseBoolInt14 == null ? 0 : baseBoolInt14.hashCode())) * 31;
        List<AudioArtist> list3 = this.mainArtists;
        int iHashCode48 = (iHashCode47 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AudioArtist> list4 = this.featuredArtists;
        int iHashCode49 = (iHashCode48 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str8 = this.subtitle;
        int iHashCode50 = (iHashCode49 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num14 = this.releaseDate;
        int iHashCode51 = (iHashCode50 + (num14 == null ? 0 : num14.hashCode())) * 31;
        List<AudioGenre> list5 = this.genres;
        return iHashCode51 + (list5 != null ? list5.hashCode() : 0);
    }

    @Nullable
    public final BaseBoolInt isExplicit() {
        return this.isExplicit;
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @Nullable
    public final BaseBoolInt isPrivate() {
        return this.isPrivate;
    }

    @Nullable
    public final BaseBoolInt isSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    public String toString() {
        String str = this.accessKey;
        Integer num = this.addingDate;
        BaseBoolInt baseBoolInt = this.canComment;
        BaseBoolInt baseBoolInt2 = this.canEdit;
        BaseBoolInt baseBoolInt3 = this.canLike;
        BaseBoolInt baseBoolInt4 = this.canRepost;
        BaseBoolInt baseBoolInt5 = this.canSubscribe;
        BaseBoolInt baseBoolInt6 = this.canAddToFaves;
        BaseBoolInt baseBoolInt7 = this.canAdd;
        BaseBoolInt baseBoolInt8 = this.canAttachLink;
        BaseBoolInt baseBoolInt9 = this.isPrivate;
        Integer num2 = this.comments;
        Integer num3 = this.date;
        String str2 = this.description;
        Integer num4 = this.duration;
        List<VideoVideoImage> list = this.image;
        List<VideoVideoImage> list2 = this.firstFrame;
        Integer num5 = this.width;
        Integer num6 = this.height;
        Integer num7 = this.f15250id;
        UserId userId = this.ownerId;
        UserId userId2 = this.userId;
        String str3 = this.title;
        Boolean bool = this.isFavorite;
        String str4 = this.player;
        BasePropertyExists basePropertyExists = this.processing;
        BaseBoolInt baseBoolInt10 = this.converting;
        BaseBoolInt baseBoolInt11 = this.added;
        BaseBoolInt baseBoolInt12 = this.isSubscribed;
        String str5 = this.trackCode;
        BasePropertyExists basePropertyExists2 = this.repeat;
        Type type = this.type;
        Integer num8 = this.views;
        Integer num9 = this.localViews;
        Integer num10 = this.contentRestricted;
        String str6 = this.contentRestrictedMessage;
        Integer num11 = this.balance;
        LiveStatus liveStatus = this.liveStatus;
        BasePropertyExists basePropertyExists3 = this.live;
        BasePropertyExists basePropertyExists4 = this.upcoming;
        Integer num12 = this.liveStartTime;
        BaseBoolInt baseBoolInt13 = this.liveNotify;
        Integer num13 = this.spectators;
        String str7 = this.platform;
        BaseLikes baseLikes = this.likes;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        BaseBoolInt baseBoolInt14 = this.isExplicit;
        List<AudioArtist> list3 = this.mainArtists;
        List<AudioArtist> list4 = this.featuredArtists;
        String str8 = this.subtitle;
        Integer num14 = this.releaseDate;
        List<AudioGenre> list5 = this.genres;
        StringBuilder sb2 = new StringBuilder("VideoVideo(accessKey=");
        sb2.append(str);
        sb2.append(", addingDate=");
        sb2.append(num);
        sb2.append(", canComment=");
        a.s(sb2, baseBoolInt, ", canEdit=", baseBoolInt2, ", canLike=");
        a.s(sb2, baseBoolInt3, ", canRepost=", baseBoolInt4, ", canSubscribe=");
        a.s(sb2, baseBoolInt5, ", canAddToFaves=", baseBoolInt6, ", canAdd=");
        a.s(sb2, baseBoolInt7, ", canAttachLink=", baseBoolInt8, ", isPrivate=");
        sb2.append(baseBoolInt9);
        sb2.append(", comments=");
        sb2.append(num2);
        sb2.append(", date=");
        pe.a.r(num3, ", description=", str2, ", duration=", sb2);
        sb2.append(num4);
        sb2.append(", image=");
        sb2.append(list);
        sb2.append(", firstFrame=");
        sb2.append(list2);
        sb2.append(", width=");
        sb2.append(num5);
        sb2.append(", height=");
        a.t(sb2, num6, ", id=", num7, ", ownerId=");
        sb2.append(userId);
        sb2.append(", userId=");
        sb2.append(userId2);
        sb2.append(", title=");
        sb2.append(str3);
        sb2.append(", isFavorite=");
        sb2.append(bool);
        sb2.append(", player=");
        sb2.append(str4);
        sb2.append(", processing=");
        sb2.append(basePropertyExists);
        sb2.append(", converting=");
        a.s(sb2, baseBoolInt10, ", added=", baseBoolInt11, ", isSubscribed=");
        sb2.append(baseBoolInt12);
        sb2.append(", trackCode=");
        sb2.append(str5);
        sb2.append(", repeat=");
        sb2.append(basePropertyExists2);
        sb2.append(", type=");
        sb2.append(type);
        sb2.append(", views=");
        a.t(sb2, num8, ", localViews=", num9, ", contentRestricted=");
        pe.a.r(num10, ", contentRestrictedMessage=", str6, ", balance=", sb2);
        sb2.append(num11);
        sb2.append(", liveStatus=");
        sb2.append(liveStatus);
        sb2.append(", live=");
        sb2.append(basePropertyExists3);
        sb2.append(", upcoming=");
        sb2.append(basePropertyExists4);
        sb2.append(", liveStartTime=");
        sb2.append(num12);
        sb2.append(", liveNotify=");
        sb2.append(baseBoolInt13);
        sb2.append(", spectators=");
        pe.a.r(num13, ", platform=", str7, ", likes=", sb2);
        sb2.append(baseLikes);
        sb2.append(", reposts=");
        sb2.append(baseRepostsInfo);
        sb2.append(", isExplicit=");
        sb2.append(baseBoolInt14);
        sb2.append(", mainArtists=");
        sb2.append(list3);
        sb2.append(", featuredArtists=");
        sb2.append(list4);
        sb2.append(", subtitle=");
        sb2.append(str8);
        sb2.append(", releaseDate=");
        sb2.append(num14);
        sb2.append(", genres=");
        sb2.append(list5);
        sb2.append(")");
        return sb2.toString();
    }

    public VideoVideo(@Nullable String str, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable BaseBoolInt baseBoolInt8, @Nullable BaseBoolInt baseBoolInt9, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable Integer num4, @Nullable List<VideoVideoImage> list, @Nullable List<VideoVideoImage> list2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable UserId userId, @Nullable UserId userId2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable BasePropertyExists basePropertyExists, @Nullable BaseBoolInt baseBoolInt10, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable String str5, @Nullable BasePropertyExists basePropertyExists2, @Nullable Type type, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable String str6, @Nullable Integer num11, @Nullable LiveStatus liveStatus, @Nullable BasePropertyExists basePropertyExists3, @Nullable BasePropertyExists basePropertyExists4, @Nullable Integer num12, @Nullable BaseBoolInt baseBoolInt13, @Nullable Integer num13, @Nullable String str7, @Nullable BaseLikes baseLikes, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable BaseBoolInt baseBoolInt14, @Nullable List<AudioArtist> list3, @Nullable List<AudioArtist> list4, @Nullable String str8, @Nullable Integer num14, @Nullable List<AudioGenre> list5) {
        this.accessKey = str;
        this.addingDate = num;
        this.canComment = baseBoolInt;
        this.canEdit = baseBoolInt2;
        this.canLike = baseBoolInt3;
        this.canRepost = baseBoolInt4;
        this.canSubscribe = baseBoolInt5;
        this.canAddToFaves = baseBoolInt6;
        this.canAdd = baseBoolInt7;
        this.canAttachLink = baseBoolInt8;
        this.isPrivate = baseBoolInt9;
        this.comments = num2;
        this.date = num3;
        this.description = str2;
        this.duration = num4;
        this.image = list;
        this.firstFrame = list2;
        this.width = num5;
        this.height = num6;
        this.f15250id = num7;
        this.ownerId = userId;
        this.userId = userId2;
        this.title = str3;
        this.isFavorite = bool;
        this.player = str4;
        this.processing = basePropertyExists;
        this.converting = baseBoolInt10;
        this.added = baseBoolInt11;
        this.isSubscribed = baseBoolInt12;
        this.trackCode = str5;
        this.repeat = basePropertyExists2;
        this.type = type;
        this.views = num8;
        this.localViews = num9;
        this.contentRestricted = num10;
        this.contentRestrictedMessage = str6;
        this.balance = num11;
        this.liveStatus = liveStatus;
        this.live = basePropertyExists3;
        this.upcoming = basePropertyExists4;
        this.liveStartTime = num12;
        this.liveNotify = baseBoolInt13;
        this.spectators = num13;
        this.platform = str7;
        this.likes = baseLikes;
        this.reposts = baseRepostsInfo;
        this.isExplicit = baseBoolInt14;
        this.mainArtists = list3;
        this.featuredArtists = list4;
        this.subtitle = str8;
        this.releaseDate = num14;
        this.genres = list5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoVideo(String str, Integer num, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, BaseBoolInt baseBoolInt6, BaseBoolInt baseBoolInt7, BaseBoolInt baseBoolInt8, BaseBoolInt baseBoolInt9, Integer num2, Integer num3, String str2, Integer num4, List list, List list2, Integer num5, Integer num6, Integer num7, UserId userId, UserId userId2, String str3, Boolean bool, String str4, BasePropertyExists basePropertyExists, BaseBoolInt baseBoolInt10, BaseBoolInt baseBoolInt11, BaseBoolInt baseBoolInt12, String str5, BasePropertyExists basePropertyExists2, Type type, Integer num8, Integer num9, Integer num10, String str6, Integer num11, LiveStatus liveStatus, BasePropertyExists basePropertyExists3, BasePropertyExists basePropertyExists4, Integer num12, BaseBoolInt baseBoolInt13, Integer num13, String str7, BaseLikes baseLikes, BaseRepostsInfo baseRepostsInfo, BaseBoolInt baseBoolInt14, List list3, List list4, String str8, Integer num14, List list5, int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String str9 = (i & 1) != 0 ? null : str;
        this(str9, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : baseBoolInt, (i & 8) != 0 ? null : baseBoolInt2, (i & 16) != 0 ? null : baseBoolInt3, (i & 32) != 0 ? null : baseBoolInt4, (i & 64) != 0 ? null : baseBoolInt5, (i & 128) != 0 ? null : baseBoolInt6, (i & 256) != 0 ? null : baseBoolInt7, (i & 512) != 0 ? null : baseBoolInt8, (i & 1024) != 0 ? null : baseBoolInt9, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : num3, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : num4, (i & 32768) != 0 ? null : list, (i & 65536) != 0 ? null : list2, (i & 131072) != 0 ? null : num5, (i & 262144) != 0 ? null : num6, (i & 524288) != 0 ? null : num7, (i & 1048576) != 0 ? null : userId, (i & 2097152) != 0 ? null : userId2, (i & 4194304) != 0 ? null : str3, (i & 8388608) != 0 ? null : bool, (i & 16777216) != 0 ? null : str4, (i & 33554432) != 0 ? null : basePropertyExists, (i & 67108864) != 0 ? null : baseBoolInt10, (i & 134217728) != 0 ? null : baseBoolInt11, (i & 268435456) != 0 ? null : baseBoolInt12, (i & 536870912) != 0 ? null : str5, (i & 1073741824) != 0 ? null : basePropertyExists2, (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : type, (i10 & 1) != 0 ? null : num8, (i10 & 2) != 0 ? null : num9, (i10 & 4) != 0 ? null : num10, (i10 & 8) != 0 ? null : str6, (i10 & 16) != 0 ? null : num11, (i10 & 32) != 0 ? null : liveStatus, (i10 & 64) != 0 ? null : basePropertyExists3, (i10 & 128) != 0 ? null : basePropertyExists4, (i10 & 256) != 0 ? null : num12, (i10 & 512) != 0 ? null : baseBoolInt13, (i10 & 1024) != 0 ? null : num13, (i10 & 2048) != 0 ? null : str7, (i10 & 4096) != 0 ? null : baseLikes, (i10 & 8192) != 0 ? null : baseRepostsInfo, (i10 & 16384) != 0 ? null : baseBoolInt14, (i10 & 32768) != 0 ? null : list3, (i10 & 65536) != 0 ? null : list4, (i10 & 131072) != 0 ? null : str8, (i10 & 262144) != 0 ? null : num14, (i10 & 524288) != 0 ? null : list5);
    }
}
