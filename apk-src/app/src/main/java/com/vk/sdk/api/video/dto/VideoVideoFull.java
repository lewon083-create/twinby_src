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
import t.z;

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
public final class VideoVideoFull {

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

    @b("files")
    @Nullable
    private final VideoVideoFiles files;

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
    private final Integer f15252id;

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

    @b("live_settings")
    @Nullable
    private final VideoLiveSettings liveSettings;

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

    @b("trailer")
    @Nullable
    private final VideoVideoFiles trailer;

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

    public VideoVideoFull() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8388607, null);
    }

    @Nullable
    public final VideoVideoFiles component1() {
        return this.files;
    }

    @Nullable
    public final BaseBoolInt component10() {
        return this.canSubscribe;
    }

    @Nullable
    public final BaseBoolInt component11() {
        return this.canAddToFaves;
    }

    @Nullable
    public final BaseBoolInt component12() {
        return this.canAdd;
    }

    @Nullable
    public final BaseBoolInt component13() {
        return this.canAttachLink;
    }

    @Nullable
    public final BaseBoolInt component14() {
        return this.isPrivate;
    }

    @Nullable
    public final Integer component15() {
        return this.comments;
    }

    @Nullable
    public final Integer component16() {
        return this.date;
    }

    @Nullable
    public final String component17() {
        return this.description;
    }

    @Nullable
    public final Integer component18() {
        return this.duration;
    }

    @Nullable
    public final List<VideoVideoImage> component19() {
        return this.image;
    }

    @Nullable
    public final VideoVideoFiles component2() {
        return this.trailer;
    }

    @Nullable
    public final List<VideoVideoImage> component20() {
        return this.firstFrame;
    }

    @Nullable
    public final Integer component21() {
        return this.width;
    }

    @Nullable
    public final Integer component22() {
        return this.height;
    }

    @Nullable
    public final Integer component23() {
        return this.f15252id;
    }

    @Nullable
    public final UserId component24() {
        return this.ownerId;
    }

    @Nullable
    public final UserId component25() {
        return this.userId;
    }

    @Nullable
    public final String component26() {
        return this.title;
    }

    @Nullable
    public final Boolean component27() {
        return this.isFavorite;
    }

    @Nullable
    public final String component28() {
        return this.player;
    }

    @Nullable
    public final BasePropertyExists component29() {
        return this.processing;
    }

    @Nullable
    public final VideoLiveSettings component3() {
        return this.liveSettings;
    }

    @Nullable
    public final BaseBoolInt component30() {
        return this.converting;
    }

    @Nullable
    public final BaseBoolInt component31() {
        return this.added;
    }

    @Nullable
    public final BaseBoolInt component32() {
        return this.isSubscribed;
    }

    @Nullable
    public final String component33() {
        return this.trackCode;
    }

    @Nullable
    public final BasePropertyExists component34() {
        return this.repeat;
    }

    @Nullable
    public final Type component35() {
        return this.type;
    }

    @Nullable
    public final Integer component36() {
        return this.views;
    }

    @Nullable
    public final Integer component37() {
        return this.localViews;
    }

    @Nullable
    public final Integer component38() {
        return this.contentRestricted;
    }

    @Nullable
    public final String component39() {
        return this.contentRestrictedMessage;
    }

    @Nullable
    public final String component4() {
        return this.accessKey;
    }

    @Nullable
    public final Integer component40() {
        return this.balance;
    }

    @Nullable
    public final LiveStatus component41() {
        return this.liveStatus;
    }

    @Nullable
    public final BasePropertyExists component42() {
        return this.live;
    }

    @Nullable
    public final BasePropertyExists component43() {
        return this.upcoming;
    }

    @Nullable
    public final Integer component44() {
        return this.liveStartTime;
    }

    @Nullable
    public final BaseBoolInt component45() {
        return this.liveNotify;
    }

    @Nullable
    public final Integer component46() {
        return this.spectators;
    }

    @Nullable
    public final String component47() {
        return this.platform;
    }

    @Nullable
    public final BaseLikes component48() {
        return this.likes;
    }

    @Nullable
    public final BaseRepostsInfo component49() {
        return this.reposts;
    }

    @Nullable
    public final Integer component5() {
        return this.addingDate;
    }

    @Nullable
    public final BaseBoolInt component50() {
        return this.isExplicit;
    }

    @Nullable
    public final List<AudioArtist> component51() {
        return this.mainArtists;
    }

    @Nullable
    public final List<AudioArtist> component52() {
        return this.featuredArtists;
    }

    @Nullable
    public final String component53() {
        return this.subtitle;
    }

    @Nullable
    public final Integer component54() {
        return this.releaseDate;
    }

    @Nullable
    public final List<AudioGenre> component55() {
        return this.genres;
    }

    @Nullable
    public final BaseBoolInt component6() {
        return this.canComment;
    }

    @Nullable
    public final BaseBoolInt component7() {
        return this.canEdit;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.canLike;
    }

    @Nullable
    public final BaseBoolInt component9() {
        return this.canRepost;
    }

    @NotNull
    public final VideoVideoFull copy(@Nullable VideoVideoFiles videoVideoFiles, @Nullable VideoVideoFiles videoVideoFiles2, @Nullable VideoLiveSettings videoLiveSettings, @Nullable String str, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable BaseBoolInt baseBoolInt8, @Nullable BaseBoolInt baseBoolInt9, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable Integer num4, @Nullable List<VideoVideoImage> list, @Nullable List<VideoVideoImage> list2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable UserId userId, @Nullable UserId userId2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable BasePropertyExists basePropertyExists, @Nullable BaseBoolInt baseBoolInt10, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable String str5, @Nullable BasePropertyExists basePropertyExists2, @Nullable Type type, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable String str6, @Nullable Integer num11, @Nullable LiveStatus liveStatus, @Nullable BasePropertyExists basePropertyExists3, @Nullable BasePropertyExists basePropertyExists4, @Nullable Integer num12, @Nullable BaseBoolInt baseBoolInt13, @Nullable Integer num13, @Nullable String str7, @Nullable BaseLikes baseLikes, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable BaseBoolInt baseBoolInt14, @Nullable List<AudioArtist> list3, @Nullable List<AudioArtist> list4, @Nullable String str8, @Nullable Integer num14, @Nullable List<AudioGenre> list5) {
        return new VideoVideoFull(videoVideoFiles, videoVideoFiles2, videoLiveSettings, str, num, baseBoolInt, baseBoolInt2, baseBoolInt3, baseBoolInt4, baseBoolInt5, baseBoolInt6, baseBoolInt7, baseBoolInt8, baseBoolInt9, num2, num3, str2, num4, list, list2, num5, num6, num7, userId, userId2, str3, bool, str4, basePropertyExists, baseBoolInt10, baseBoolInt11, baseBoolInt12, str5, basePropertyExists2, type, num8, num9, num10, str6, num11, liveStatus, basePropertyExists3, basePropertyExists4, num12, baseBoolInt13, num13, str7, baseLikes, baseRepostsInfo, baseBoolInt14, list3, list4, str8, num14, list5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoFull)) {
            return false;
        }
        VideoVideoFull videoVideoFull = (VideoVideoFull) obj;
        return Intrinsics.a(this.files, videoVideoFull.files) && Intrinsics.a(this.trailer, videoVideoFull.trailer) && Intrinsics.a(this.liveSettings, videoVideoFull.liveSettings) && Intrinsics.a(this.accessKey, videoVideoFull.accessKey) && Intrinsics.a(this.addingDate, videoVideoFull.addingDate) && this.canComment == videoVideoFull.canComment && this.canEdit == videoVideoFull.canEdit && this.canLike == videoVideoFull.canLike && this.canRepost == videoVideoFull.canRepost && this.canSubscribe == videoVideoFull.canSubscribe && this.canAddToFaves == videoVideoFull.canAddToFaves && this.canAdd == videoVideoFull.canAdd && this.canAttachLink == videoVideoFull.canAttachLink && this.isPrivate == videoVideoFull.isPrivate && Intrinsics.a(this.comments, videoVideoFull.comments) && Intrinsics.a(this.date, videoVideoFull.date) && Intrinsics.a(this.description, videoVideoFull.description) && Intrinsics.a(this.duration, videoVideoFull.duration) && Intrinsics.a(this.image, videoVideoFull.image) && Intrinsics.a(this.firstFrame, videoVideoFull.firstFrame) && Intrinsics.a(this.width, videoVideoFull.width) && Intrinsics.a(this.height, videoVideoFull.height) && Intrinsics.a(this.f15252id, videoVideoFull.f15252id) && Intrinsics.a(this.ownerId, videoVideoFull.ownerId) && Intrinsics.a(this.userId, videoVideoFull.userId) && Intrinsics.a(this.title, videoVideoFull.title) && Intrinsics.a(this.isFavorite, videoVideoFull.isFavorite) && Intrinsics.a(this.player, videoVideoFull.player) && this.processing == videoVideoFull.processing && this.converting == videoVideoFull.converting && this.added == videoVideoFull.added && this.isSubscribed == videoVideoFull.isSubscribed && Intrinsics.a(this.trackCode, videoVideoFull.trackCode) && this.repeat == videoVideoFull.repeat && this.type == videoVideoFull.type && Intrinsics.a(this.views, videoVideoFull.views) && Intrinsics.a(this.localViews, videoVideoFull.localViews) && Intrinsics.a(this.contentRestricted, videoVideoFull.contentRestricted) && Intrinsics.a(this.contentRestrictedMessage, videoVideoFull.contentRestrictedMessage) && Intrinsics.a(this.balance, videoVideoFull.balance) && this.liveStatus == videoVideoFull.liveStatus && this.live == videoVideoFull.live && this.upcoming == videoVideoFull.upcoming && Intrinsics.a(this.liveStartTime, videoVideoFull.liveStartTime) && this.liveNotify == videoVideoFull.liveNotify && Intrinsics.a(this.spectators, videoVideoFull.spectators) && Intrinsics.a(this.platform, videoVideoFull.platform) && Intrinsics.a(this.likes, videoVideoFull.likes) && Intrinsics.a(this.reposts, videoVideoFull.reposts) && this.isExplicit == videoVideoFull.isExplicit && Intrinsics.a(this.mainArtists, videoVideoFull.mainArtists) && Intrinsics.a(this.featuredArtists, videoVideoFull.featuredArtists) && Intrinsics.a(this.subtitle, videoVideoFull.subtitle) && Intrinsics.a(this.releaseDate, videoVideoFull.releaseDate) && Intrinsics.a(this.genres, videoVideoFull.genres);
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
    public final VideoVideoFiles getFiles() {
        return this.files;
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
        return this.f15252id;
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
    public final VideoLiveSettings getLiveSettings() {
        return this.liveSettings;
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
    public final VideoVideoFiles getTrailer() {
        return this.trailer;
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
        VideoVideoFiles videoVideoFiles = this.files;
        int iHashCode = (videoVideoFiles == null ? 0 : videoVideoFiles.hashCode()) * 31;
        VideoVideoFiles videoVideoFiles2 = this.trailer;
        int iHashCode2 = (iHashCode + (videoVideoFiles2 == null ? 0 : videoVideoFiles2.hashCode())) * 31;
        VideoLiveSettings videoLiveSettings = this.liveSettings;
        int iHashCode3 = (iHashCode2 + (videoLiveSettings == null ? 0 : videoLiveSettings.hashCode())) * 31;
        String str = this.accessKey;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.addingDate;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canComment;
        int iHashCode6 = (iHashCode5 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.canEdit;
        int iHashCode7 = (iHashCode6 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.canLike;
        int iHashCode8 = (iHashCode7 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.canRepost;
        int iHashCode9 = (iHashCode8 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        BaseBoolInt baseBoolInt5 = this.canSubscribe;
        int iHashCode10 = (iHashCode9 + (baseBoolInt5 == null ? 0 : baseBoolInt5.hashCode())) * 31;
        BaseBoolInt baseBoolInt6 = this.canAddToFaves;
        int iHashCode11 = (iHashCode10 + (baseBoolInt6 == null ? 0 : baseBoolInt6.hashCode())) * 31;
        BaseBoolInt baseBoolInt7 = this.canAdd;
        int iHashCode12 = (iHashCode11 + (baseBoolInt7 == null ? 0 : baseBoolInt7.hashCode())) * 31;
        BaseBoolInt baseBoolInt8 = this.canAttachLink;
        int iHashCode13 = (iHashCode12 + (baseBoolInt8 == null ? 0 : baseBoolInt8.hashCode())) * 31;
        BaseBoolInt baseBoolInt9 = this.isPrivate;
        int iHashCode14 = (iHashCode13 + (baseBoolInt9 == null ? 0 : baseBoolInt9.hashCode())) * 31;
        Integer num2 = this.comments;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.date;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode17 = (iHashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.duration;
        int iHashCode18 = (iHashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<VideoVideoImage> list = this.image;
        int iHashCode19 = (iHashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoVideoImage> list2 = this.firstFrame;
        int iHashCode20 = (iHashCode19 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num5 = this.width;
        int iHashCode21 = (iHashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.height;
        int iHashCode22 = (iHashCode21 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f15252id;
        int iHashCode23 = (iHashCode22 + (num7 == null ? 0 : num7.hashCode())) * 31;
        UserId userId = this.ownerId;
        int iHashCode24 = (iHashCode23 + (userId == null ? 0 : userId.hashCode())) * 31;
        UserId userId2 = this.userId;
        int iHashCode25 = (iHashCode24 + (userId2 == null ? 0 : userId2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode26 = (iHashCode25 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int iHashCode27 = (iHashCode26 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.player;
        int iHashCode28 = (iHashCode27 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BasePropertyExists basePropertyExists = this.processing;
        int iHashCode29 = (iHashCode28 + (basePropertyExists == null ? 0 : basePropertyExists.hashCode())) * 31;
        BaseBoolInt baseBoolInt10 = this.converting;
        int iHashCode30 = (iHashCode29 + (baseBoolInt10 == null ? 0 : baseBoolInt10.hashCode())) * 31;
        BaseBoolInt baseBoolInt11 = this.added;
        int iHashCode31 = (iHashCode30 + (baseBoolInt11 == null ? 0 : baseBoolInt11.hashCode())) * 31;
        BaseBoolInt baseBoolInt12 = this.isSubscribed;
        int iHashCode32 = (iHashCode31 + (baseBoolInt12 == null ? 0 : baseBoolInt12.hashCode())) * 31;
        String str5 = this.trackCode;
        int iHashCode33 = (iHashCode32 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BasePropertyExists basePropertyExists2 = this.repeat;
        int iHashCode34 = (iHashCode33 + (basePropertyExists2 == null ? 0 : basePropertyExists2.hashCode())) * 31;
        Type type = this.type;
        int iHashCode35 = (iHashCode34 + (type == null ? 0 : type.hashCode())) * 31;
        Integer num8 = this.views;
        int iHashCode36 = (iHashCode35 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.localViews;
        int iHashCode37 = (iHashCode36 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.contentRestricted;
        int iHashCode38 = (iHashCode37 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str6 = this.contentRestrictedMessage;
        int iHashCode39 = (iHashCode38 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num11 = this.balance;
        int iHashCode40 = (iHashCode39 + (num11 == null ? 0 : num11.hashCode())) * 31;
        LiveStatus liveStatus = this.liveStatus;
        int iHashCode41 = (iHashCode40 + (liveStatus == null ? 0 : liveStatus.hashCode())) * 31;
        BasePropertyExists basePropertyExists3 = this.live;
        int iHashCode42 = (iHashCode41 + (basePropertyExists3 == null ? 0 : basePropertyExists3.hashCode())) * 31;
        BasePropertyExists basePropertyExists4 = this.upcoming;
        int iHashCode43 = (iHashCode42 + (basePropertyExists4 == null ? 0 : basePropertyExists4.hashCode())) * 31;
        Integer num12 = this.liveStartTime;
        int iHashCode44 = (iHashCode43 + (num12 == null ? 0 : num12.hashCode())) * 31;
        BaseBoolInt baseBoolInt13 = this.liveNotify;
        int iHashCode45 = (iHashCode44 + (baseBoolInt13 == null ? 0 : baseBoolInt13.hashCode())) * 31;
        Integer num13 = this.spectators;
        int iHashCode46 = (iHashCode45 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str7 = this.platform;
        int iHashCode47 = (iHashCode46 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BaseLikes baseLikes = this.likes;
        int iHashCode48 = (iHashCode47 + (baseLikes == null ? 0 : baseLikes.hashCode())) * 31;
        BaseRepostsInfo baseRepostsInfo = this.reposts;
        int iHashCode49 = (iHashCode48 + (baseRepostsInfo == null ? 0 : baseRepostsInfo.hashCode())) * 31;
        BaseBoolInt baseBoolInt14 = this.isExplicit;
        int iHashCode50 = (iHashCode49 + (baseBoolInt14 == null ? 0 : baseBoolInt14.hashCode())) * 31;
        List<AudioArtist> list3 = this.mainArtists;
        int iHashCode51 = (iHashCode50 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AudioArtist> list4 = this.featuredArtists;
        int iHashCode52 = (iHashCode51 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str8 = this.subtitle;
        int iHashCode53 = (iHashCode52 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num14 = this.releaseDate;
        int iHashCode54 = (iHashCode53 + (num14 == null ? 0 : num14.hashCode())) * 31;
        List<AudioGenre> list5 = this.genres;
        return iHashCode54 + (list5 != null ? list5.hashCode() : 0);
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
        VideoVideoFiles videoVideoFiles = this.files;
        VideoVideoFiles videoVideoFiles2 = this.trailer;
        VideoLiveSettings videoLiveSettings = this.liveSettings;
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
        Integer num7 = this.f15252id;
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
        StringBuilder sb2 = new StringBuilder("VideoVideoFull(files=");
        sb2.append(videoVideoFiles);
        sb2.append(", trailer=");
        sb2.append(videoVideoFiles2);
        sb2.append(", liveSettings=");
        sb2.append(videoLiveSettings);
        sb2.append(", accessKey=");
        sb2.append(str);
        sb2.append(", addingDate=");
        sb2.append(num);
        sb2.append(", canComment=");
        sb2.append(baseBoolInt);
        sb2.append(", canEdit=");
        a.s(sb2, baseBoolInt2, ", canLike=", baseBoolInt3, ", canRepost=");
        a.s(sb2, baseBoolInt4, ", canSubscribe=", baseBoolInt5, ", canAddToFaves=");
        a.s(sb2, baseBoolInt6, ", canAdd=", baseBoolInt7, ", canAttachLink=");
        a.s(sb2, baseBoolInt8, ", isPrivate=", baseBoolInt9, ", comments=");
        a.t(sb2, num2, ", date=", num3, ", description=");
        a.r(num4, str2, ", duration=", ", image=", sb2);
        a.u(sb2, list, ", firstFrame=", list2, ", width=");
        a.t(sb2, num5, ", height=", num6, ", id=");
        sb2.append(num7);
        sb2.append(", ownerId=");
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
        sb2.append(baseBoolInt10);
        sb2.append(", added=");
        a.s(sb2, baseBoolInt11, ", isSubscribed=", baseBoolInt12, ", trackCode=");
        sb2.append(str5);
        sb2.append(", repeat=");
        sb2.append(basePropertyExists2);
        sb2.append(", type=");
        sb2.append(type);
        sb2.append(", views=");
        sb2.append(num8);
        sb2.append(", localViews=");
        a.t(sb2, num9, ", contentRestricted=", num10, ", contentRestrictedMessage=");
        a.r(num11, str6, ", balance=", ", liveStatus=", sb2);
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
        sb2.append(num13);
        sb2.append(", platform=");
        sb2.append(str7);
        sb2.append(", likes=");
        sb2.append(baseLikes);
        sb2.append(", reposts=");
        sb2.append(baseRepostsInfo);
        sb2.append(", isExplicit=");
        sb2.append(baseBoolInt14);
        sb2.append(", mainArtists=");
        a.u(sb2, list3, ", featuredArtists=", list4, ", subtitle=");
        a.r(num14, str8, ", releaseDate=", ", genres=", sb2);
        return z.h(sb2, list5, ")");
    }

    public VideoVideoFull(@Nullable VideoVideoFiles videoVideoFiles, @Nullable VideoVideoFiles videoVideoFiles2, @Nullable VideoLiveSettings videoLiveSettings, @Nullable String str, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable BaseBoolInt baseBoolInt8, @Nullable BaseBoolInt baseBoolInt9, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable Integer num4, @Nullable List<VideoVideoImage> list, @Nullable List<VideoVideoImage> list2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable UserId userId, @Nullable UserId userId2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable BasePropertyExists basePropertyExists, @Nullable BaseBoolInt baseBoolInt10, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable String str5, @Nullable BasePropertyExists basePropertyExists2, @Nullable Type type, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable String str6, @Nullable Integer num11, @Nullable LiveStatus liveStatus, @Nullable BasePropertyExists basePropertyExists3, @Nullable BasePropertyExists basePropertyExists4, @Nullable Integer num12, @Nullable BaseBoolInt baseBoolInt13, @Nullable Integer num13, @Nullable String str7, @Nullable BaseLikes baseLikes, @Nullable BaseRepostsInfo baseRepostsInfo, @Nullable BaseBoolInt baseBoolInt14, @Nullable List<AudioArtist> list3, @Nullable List<AudioArtist> list4, @Nullable String str8, @Nullable Integer num14, @Nullable List<AudioGenre> list5) {
        this.files = videoVideoFiles;
        this.trailer = videoVideoFiles2;
        this.liveSettings = videoLiveSettings;
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
        this.f15252id = num7;
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
    public /* synthetic */ VideoVideoFull(VideoVideoFiles videoVideoFiles, VideoVideoFiles videoVideoFiles2, VideoLiveSettings videoLiveSettings, String str, Integer num, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, BaseBoolInt baseBoolInt6, BaseBoolInt baseBoolInt7, BaseBoolInt baseBoolInt8, BaseBoolInt baseBoolInt9, Integer num2, Integer num3, String str2, Integer num4, List list, List list2, Integer num5, Integer num6, Integer num7, UserId userId, UserId userId2, String str3, Boolean bool, String str4, BasePropertyExists basePropertyExists, BaseBoolInt baseBoolInt10, BaseBoolInt baseBoolInt11, BaseBoolInt baseBoolInt12, String str5, BasePropertyExists basePropertyExists2, Type type, Integer num8, Integer num9, Integer num10, String str6, Integer num11, LiveStatus liveStatus, BasePropertyExists basePropertyExists3, BasePropertyExists basePropertyExists4, Integer num12, BaseBoolInt baseBoolInt13, Integer num13, String str7, BaseLikes baseLikes, BaseRepostsInfo baseRepostsInfo, BaseBoolInt baseBoolInt14, List list3, List list4, String str8, Integer num14, List list5, int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        VideoVideoFiles videoVideoFiles3 = (i & 1) != 0 ? null : videoVideoFiles;
        this(videoVideoFiles3, (i & 2) != 0 ? null : videoVideoFiles2, (i & 4) != 0 ? null : videoLiveSettings, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : baseBoolInt, (i & 64) != 0 ? null : baseBoolInt2, (i & 128) != 0 ? null : baseBoolInt3, (i & 256) != 0 ? null : baseBoolInt4, (i & 512) != 0 ? null : baseBoolInt5, (i & 1024) != 0 ? null : baseBoolInt6, (i & 2048) != 0 ? null : baseBoolInt7, (i & 4096) != 0 ? null : baseBoolInt8, (i & 8192) != 0 ? null : baseBoolInt9, (i & 16384) != 0 ? null : num2, (i & 32768) != 0 ? null : num3, (i & 65536) != 0 ? null : str2, (i & 131072) != 0 ? null : num4, (i & 262144) != 0 ? null : list, (i & 524288) != 0 ? null : list2, (i & 1048576) != 0 ? null : num5, (i & 2097152) != 0 ? null : num6, (i & 4194304) != 0 ? null : num7, (i & 8388608) != 0 ? null : userId, (i & 16777216) != 0 ? null : userId2, (i & 33554432) != 0 ? null : str3, (i & 67108864) != 0 ? null : bool, (i & 134217728) != 0 ? null : str4, (i & 268435456) != 0 ? null : basePropertyExists, (i & 536870912) != 0 ? null : baseBoolInt10, (i & 1073741824) != 0 ? null : baseBoolInt11, (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : baseBoolInt12, (i10 & 1) != 0 ? null : str5, (i10 & 2) != 0 ? null : basePropertyExists2, (i10 & 4) != 0 ? null : type, (i10 & 8) != 0 ? null : num8, (i10 & 16) != 0 ? null : num9, (i10 & 32) != 0 ? null : num10, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : num11, (i10 & 256) != 0 ? null : liveStatus, (i10 & 512) != 0 ? null : basePropertyExists3, (i10 & 1024) != 0 ? null : basePropertyExists4, (i10 & 2048) != 0 ? null : num12, (i10 & 4096) != 0 ? null : baseBoolInt13, (i10 & 8192) != 0 ? null : num13, (i10 & 16384) != 0 ? null : str7, (i10 & 32768) != 0 ? null : baseLikes, (i10 & 65536) != 0 ? null : baseRepostsInfo, (i10 & 131072) != 0 ? null : baseBoolInt14, (i10 & 262144) != 0 ? null : list3, (i10 & 524288) != 0 ? null : list4, (i10 & 1048576) != 0 ? null : str8, (i10 & 2097152) != 0 ? null : num14, (i10 & 4194304) != 0 ? null : list5);
    }
}
