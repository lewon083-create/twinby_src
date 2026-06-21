package com.vk.sdk.api.users.dto;

import a0.u;
import com.appsflyer.AdRevenueScheme;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.audio.dto.AudioAudio;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseCity;
import com.vk.sdk.api.base.dto.BaseCountry;
import com.vk.sdk.api.base.dto.BaseCropPhoto;
import com.vk.sdk.api.base.dto.BaseSex;
import com.vk.sdk.api.friends.dto.FriendsFriendStatusStatus;
import com.vk.sdk.api.friends.dto.FriendsRequestsMutual;
import com.vk.sdk.api.owner.dto.OwnerState;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.video.dto.VideoLiveInfo;
import gf.a;
import io.sentry.protocol.Device;
import io.sentry.protocol.Geo;
import java.util.List;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class UsersUserFull {

    @b("about")
    @Nullable
    private final String about;

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("activities")
    @Nullable
    private final String activities;

    @b("activity")
    @Nullable
    private final String activity;

    @b("bdate")
    @Nullable
    private final String bdate;

    @b("blacklisted")
    @Nullable
    private final BaseBoolInt blacklisted;

    @b("blacklisted_by_me")
    @Nullable
    private final BaseBoolInt blacklistedByMe;

    @b("books")
    @Nullable
    private final String books;

    @b("can_access_closed")
    @Nullable
    private final Boolean canAccessClosed;

    @b("can_be_invited_group")
    @Nullable
    private final Boolean canBeInvitedGroup;

    @b("can_call")
    @Nullable
    private final Boolean canCall;

    @b("can_call_from_group")
    @Nullable
    private final Boolean canCallFromGroup;

    @b("can_post")
    @Nullable
    private final BaseBoolInt canPost;

    @b("can_see_all_posts")
    @Nullable
    private final BaseBoolInt canSeeAllPosts;

    @b("can_see_audio")
    @Nullable
    private final BaseBoolInt canSeeAudio;

    @b("can_see_gifts")
    @Nullable
    private final BaseBoolInt canSeeGifts;

    @b("can_see_wishes")
    @Nullable
    private final Boolean canSeeWishes;

    @b("can_send_friend_request")
    @Nullable
    private final BaseBoolInt canSendFriendRequest;

    @b("can_subscribe_podcasts")
    @Nullable
    private final Boolean canSubscribePodcasts;

    @b("can_subscribe_posts")
    @Nullable
    private final Boolean canSubscribePosts;

    @b("can_upload_doc")
    @Nullable
    private final BaseBoolInt canUploadDoc;

    @b("can_write_private_message")
    @Nullable
    private final BaseBoolInt canWritePrivateMessage;

    @b("career")
    @Nullable
    private final List<UsersCareer> career;

    @b(Geo.JsonKeys.CITY)
    @Nullable
    private final BaseCity city;

    @b("clips_count")
    @Nullable
    private final Integer clipsCount;

    @b("common_count")
    @Nullable
    private final Integer commonCount;

    @b("contact_id")
    @Nullable
    private final Integer contactId;

    @b("contact_name")
    @Nullable
    private final String contactName;

    @b("counters")
    @Nullable
    private final UsersUserCounters counters;

    @b(AdRevenueScheme.COUNTRY)
    @Nullable
    private final BaseCountry country;

    @b("crop_photo")
    @Nullable
    private final BaseCropPhoto cropPhoto;

    @b("deactivated")
    @Nullable
    private final String deactivated;

    @b("descriptions")
    @Nullable
    private final List<String> descriptions;

    @b("domain")
    @Nullable
    private final String domain;

    @b("education_form")
    @Nullable
    private final String educationForm;

    @b("education_status")
    @Nullable
    private final String educationStatus;

    @b("email")
    @Nullable
    private final String email;

    @b("exports")
    @Nullable
    private final UsersExports exports;

    @b("facebook")
    @Nullable
    private final String facebook;

    @b("facebook_name")
    @Nullable
    private final String facebookName;

    @b("faculty")
    @Nullable
    private final Integer faculty;

    @b("faculty_name")
    @Nullable
    private final String facultyName;

    @b("first_name")
    @Nullable
    private final String firstName;

    @b("first_name_abl")
    @Nullable
    private final String firstNameAbl;

    @b("first_name_acc")
    @Nullable
    private final String firstNameAcc;

    @b("first_name_dat")
    @Nullable
    private final String firstNameDat;

    @b("first_name_gen")
    @Nullable
    private final String firstNameGen;

    @b("first_name_ins")
    @Nullable
    private final String firstNameIns;

    @b("first_name_nom")
    @Nullable
    private final String firstNameNom;

    @b("followers_count")
    @Nullable
    private final Integer followersCount;

    @b("friend_status")
    @Nullable
    private final FriendsFriendStatusStatus friendStatus;

    @b("games")
    @Nullable
    private final String games;

    @b("graduation")
    @Nullable
    private final Integer graduation;

    @b("has_mobile")
    @Nullable
    private final BaseBoolInt hasMobile;

    @b("has_photo")
    @Nullable
    private final BaseBoolInt hasPhoto;

    @b("has_unseen_stories")
    @Nullable
    private final Boolean hasUnseenStories;

    @b("hash")
    @Nullable
    private final String hash;

    @b("hidden")
    @Nullable
    private final Integer hidden;

    @b("home_phone")
    @Nullable
    private final String homePhone;

    @b("home_town")
    @Nullable
    private final String homeTown;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final UserId f15248id;

    @b("instagram")
    @Nullable
    private final String instagram;

    @b("interests")
    @Nullable
    private final String interests;

    @b("is_closed")
    @Nullable
    private final Boolean isClosed;

    @b("is_favorite")
    @Nullable
    private final BaseBoolInt isFavorite;

    @b("is_friend")
    @Nullable
    private final BaseBoolInt isFriend;

    @b("is_hidden_from_feed")
    @Nullable
    private final BaseBoolInt isHiddenFromFeed;

    @b("is_message_request")
    @Nullable
    private final Boolean isMessageRequest;

    @b("is_no_index")
    @Nullable
    private final Boolean isNoIndex;

    @b("is_service")
    @Nullable
    private final Boolean isService;

    @b("is_subscribed_podcasts")
    @Nullable
    private final Boolean isSubscribedPodcasts;

    @b("is_video_live_notifications_blocked")
    @Nullable
    private final BaseBoolInt isVideoLiveNotificationsBlocked;

    @b("language")
    @Nullable
    private final String language;

    @b("last_name")
    @Nullable
    private final String lastName;

    @b("last_name_abl")
    @Nullable
    private final String lastNameAbl;

    @b("last_name_acc")
    @Nullable
    private final String lastNameAcc;

    @b("last_name_dat")
    @Nullable
    private final String lastNameDat;

    @b("last_name_gen")
    @Nullable
    private final String lastNameGen;

    @b("last_name_ins")
    @Nullable
    private final String lastNameIns;

    @b("last_name_nom")
    @Nullable
    private final String lastNameNom;

    @b("last_seen")
    @Nullable
    private final UsersLastSeen lastSeen;

    @b("lists")
    @Nullable
    private final List<Integer> lists;

    @b("livejournal")
    @Nullable
    private final String livejournal;

    @b("maiden_name")
    @Nullable
    private final String maidenName;

    @b("military")
    @Nullable
    private final List<UsersMilitary> military;

    @b("mobile_phone")
    @Nullable
    private final String mobilePhone;

    @b("movies")
    @Nullable
    private final String movies;

    @b("music")
    @Nullable
    private final String music;

    @b("mutual")
    @Nullable
    private final FriendsRequestsMutual mutual;

    @b("nickname")
    @Nullable
    private final String nickname;

    @b("occupation")
    @Nullable
    private final UsersOccupation occupation;

    @b(Device.JsonKeys.ONLINE)
    @Nullable
    private final BaseBoolInt online;

    @b("online_app")
    @Nullable
    private final Integer onlineApp;

    @b("online_info")
    @Nullable
    private final UsersOnlineInfo onlineInfo;

    @b("online_mobile")
    @Nullable
    private final BaseBoolInt onlineMobile;

    @b("owner_state")
    @Nullable
    private final OwnerState ownerState;

    @b("personal")
    @Nullable
    private final UsersPersonal personal;

    @b("photo")
    @Nullable
    private final String photo;

    @b("photo_100")
    @Nullable
    private final String photo100;

    @b("photo_200")
    @Nullable
    private final String photo200;

    @b("photo_200_orig")
    @Nullable
    private final String photo200Orig;

    @b("photo_400")
    @Nullable
    private final String photo400;

    @b("photo_400_orig")
    @Nullable
    private final String photo400Orig;

    @b("photo_50")
    @Nullable
    private final String photo50;

    @b("photo_big")
    @Nullable
    private final String photoBig;

    @b("photo_id")
    @Nullable
    private final String photoId;

    @b("photo_max")
    @Nullable
    private final String photoMax;

    @b("photo_max_orig")
    @Nullable
    private final String photoMaxOrig;

    @b("photo_max_size")
    @Nullable
    private final PhotosPhoto photoMaxSize;

    @b("photo_medium")
    @Nullable
    private final String photoMedium;

    @b("photo_medium_rec")
    @Nullable
    private final String photoMediumRec;

    @b("photo_rec")
    @Nullable
    private final String photoRec;

    @b("quotes")
    @Nullable
    private final String quotes;

    @b("relation")
    @Nullable
    private final UsersUserRelation relation;

    @b("relation_partner")
    @Nullable
    private final UsersUserMin relationPartner;

    @b("relatives")
    @Nullable
    private final List<UsersRelative> relatives;

    @b("schools")
    @Nullable
    private final List<UsersSchool> schools;

    @b("screen_name")
    @Nullable
    private final String screenName;

    @b("service_description")
    @Nullable
    private final String serviceDescription;

    @b("sex")
    @Nullable
    private final BaseSex sex;

    @b("site")
    @Nullable
    private final String site;

    @b("skype")
    @Nullable
    private final String skype;

    @b("status")
    @Nullable
    private final String status;

    @b("status_audio")
    @Nullable
    private final AudioAudio statusAudio;

    @b("stories_archive_count")
    @Nullable
    private final Integer storiesArchiveCount;

    @b("test")
    @Nullable
    private final BaseBoolInt test;

    @b("timezone")
    @Nullable
    private final Float timezone;

    @b("trending")
    @Nullable
    private final BaseBoolInt trending;

    @b("tv")
    @Nullable
    private final String tv;

    @b("twitter")
    @Nullable
    private final String twitter;

    @b("type")
    @Nullable
    private final UsersUserType type;

    @b("universities")
    @Nullable
    private final List<UsersUniversity> universities;

    @b("university")
    @Nullable
    private final Integer university;

    @b("university_group_id")
    @Nullable
    private final Integer universityGroupId;

    @b("university_name")
    @Nullable
    private final String universityName;

    @b("verified")
    @Nullable
    private final BaseBoolInt verified;

    @b("video_live")
    @Nullable
    private final VideoLiveInfo videoLive;

    @b("video_live_count")
    @Nullable
    private final Integer videoLiveCount;

    @b("video_live_level")
    @Nullable
    private final Integer videoLiveLevel;

    @b("wall_comments")
    @Nullable
    private final BaseBoolInt wallComments;

    @b("wall_default")
    @Nullable
    private final WallDefault wallDefault;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum WallDefault {
        OWNER("owner"),
        ALL("all");


        @NotNull
        private final String value;

        WallDefault(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public UsersUserFull(@NotNull UserId id2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable BaseCity baseCity, @Nullable BaseCountry baseCountry, @Nullable Float f10, @Nullable OwnerState ownerState, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable UsersUserType usersUserType, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable BaseBoolInt baseBoolInt8, @Nullable VideoLiveInfo videoLiveInfo, @Nullable BaseBoolInt baseBoolInt9, @Nullable Boolean bool, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable PhotosPhoto photosPhoto, @Nullable String str38, @Nullable Integer num, @Nullable Boolean bool2, @Nullable WallDefault wallDefault, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable BaseBoolInt baseBoolInt10, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable Boolean bool6, @Nullable String str48, @Nullable String str49, @Nullable String str50, @Nullable AudioAudio audioAudio, @Nullable String str51, @Nullable String str52, @Nullable UsersLastSeen usersLastSeen, @Nullable UsersExports usersExports, @Nullable BaseCropPhoto baseCropPhoto, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable BaseBoolInt baseBoolInt13, @Nullable BaseBoolInt baseBoolInt14, @Nullable BaseBoolInt baseBoolInt15, @Nullable BaseBoolInt baseBoolInt16, @Nullable Integer num6, @Nullable UsersOccupation usersOccupation, @Nullable List<UsersCareer> list, @Nullable List<UsersMilitary> list2, @Nullable Integer num7, @Nullable String str53, @Nullable Integer num8, @Nullable Integer num9, @Nullable String str54, @Nullable Integer num10, @Nullable String str55, @Nullable String str56, @Nullable String str57, @Nullable UsersUserRelation usersUserRelation, @Nullable UsersUserMin usersUserMin, @Nullable UsersPersonal usersPersonal, @Nullable List<UsersUniversity> list3, @Nullable List<UsersSchool> list4, @Nullable List<UsersRelative> list5, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable UsersUserCounters usersUserCounters, @Nullable String str58, @Nullable BaseBoolInt baseBoolInt17, @Nullable String str59, @Nullable Boolean bool10, @Nullable Integer num11, @Nullable Boolean bool11, @Nullable List<String> list6, @Nullable List<Integer> list7, @Nullable BaseSex baseSex, @Nullable String str60, @Nullable String str61, @Nullable String str62, @Nullable UsersOnlineInfo usersOnlineInfo, @Nullable BaseBoolInt baseBoolInt18, @Nullable BaseBoolInt baseBoolInt19, @Nullable Integer num12, @Nullable BaseBoolInt baseBoolInt20, @Nullable BaseBoolInt baseBoolInt21, @Nullable FriendsFriendStatusStatus friendsFriendStatusStatus, @Nullable FriendsRequestsMutual friendsRequestsMutual, @Nullable String str63, @Nullable String str64, @Nullable Integer num13, @Nullable String str65, @Nullable Boolean bool12, @Nullable Boolean bool13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f15248id = id2;
        this.firstNameNom = str;
        this.firstNameGen = str2;
        this.firstNameDat = str3;
        this.firstNameAcc = str4;
        this.firstNameIns = str5;
        this.firstNameAbl = str6;
        this.lastNameNom = str7;
        this.lastNameGen = str8;
        this.lastNameDat = str9;
        this.lastNameAcc = str10;
        this.lastNameIns = str11;
        this.lastNameAbl = str12;
        this.nickname = str13;
        this.maidenName = str14;
        this.contactName = str15;
        this.domain = str16;
        this.bdate = str17;
        this.city = baseCity;
        this.country = baseCountry;
        this.timezone = f10;
        this.ownerState = ownerState;
        this.photo200 = str18;
        this.photoMax = str19;
        this.photo200Orig = str20;
        this.photo400Orig = str21;
        this.photoMaxOrig = str22;
        this.photoId = str23;
        this.hasPhoto = baseBoolInt;
        this.hasMobile = baseBoolInt2;
        this.isFriend = baseBoolInt3;
        this.wallComments = baseBoolInt4;
        this.canPost = baseBoolInt5;
        this.canSeeAllPosts = baseBoolInt6;
        this.canSeeAudio = baseBoolInt7;
        this.type = usersUserType;
        this.email = str24;
        this.skype = str25;
        this.facebook = str26;
        this.facebookName = str27;
        this.twitter = str28;
        this.livejournal = str29;
        this.instagram = str30;
        this.test = baseBoolInt8;
        this.videoLive = videoLiveInfo;
        this.isVideoLiveNotificationsBlocked = baseBoolInt9;
        this.isService = bool;
        this.serviceDescription = str31;
        this.photoRec = str32;
        this.photoMedium = str33;
        this.photoMediumRec = str34;
        this.photo = str35;
        this.photoBig = str36;
        this.photo400 = str37;
        this.photoMaxSize = photosPhoto;
        this.language = str38;
        this.storiesArchiveCount = num;
        this.hasUnseenStories = bool2;
        this.wallDefault = wallDefault;
        this.canCall = bool3;
        this.canCallFromGroup = bool4;
        this.canSeeWishes = bool5;
        this.canSeeGifts = baseBoolInt10;
        this.interests = str39;
        this.books = str40;
        this.tv = str41;
        this.quotes = str42;
        this.about = str43;
        this.games = str44;
        this.movies = str45;
        this.activities = str46;
        this.music = str47;
        this.canWritePrivateMessage = baseBoolInt11;
        this.canSendFriendRequest = baseBoolInt12;
        this.canBeInvitedGroup = bool6;
        this.mobilePhone = str48;
        this.homePhone = str49;
        this.site = str50;
        this.statusAudio = audioAudio;
        this.status = str51;
        this.activity = str52;
        this.lastSeen = usersLastSeen;
        this.exports = usersExports;
        this.cropPhoto = baseCropPhoto;
        this.followersCount = num2;
        this.videoLiveLevel = num3;
        this.videoLiveCount = num4;
        this.clipsCount = num5;
        this.blacklisted = baseBoolInt13;
        this.blacklistedByMe = baseBoolInt14;
        this.isFavorite = baseBoolInt15;
        this.isHiddenFromFeed = baseBoolInt16;
        this.commonCount = num6;
        this.occupation = usersOccupation;
        this.career = list;
        this.military = list2;
        this.university = num7;
        this.universityName = str53;
        this.universityGroupId = num8;
        this.faculty = num9;
        this.facultyName = str54;
        this.graduation = num10;
        this.educationForm = str55;
        this.educationStatus = str56;
        this.homeTown = str57;
        this.relation = usersUserRelation;
        this.relationPartner = usersUserMin;
        this.personal = usersPersonal;
        this.universities = list3;
        this.schools = list4;
        this.relatives = list5;
        this.isSubscribedPodcasts = bool7;
        this.canSubscribePodcasts = bool8;
        this.canSubscribePosts = bool9;
        this.counters = usersUserCounters;
        this.accessKey = str58;
        this.canUploadDoc = baseBoolInt17;
        this.hash = str59;
        this.isNoIndex = bool10;
        this.contactId = num11;
        this.isMessageRequest = bool11;
        this.descriptions = list6;
        this.lists = list7;
        this.sex = baseSex;
        this.screenName = str60;
        this.photo50 = str61;
        this.photo100 = str62;
        this.onlineInfo = usersOnlineInfo;
        this.online = baseBoolInt18;
        this.onlineMobile = baseBoolInt19;
        this.onlineApp = num12;
        this.verified = baseBoolInt20;
        this.trending = baseBoolInt21;
        this.friendStatus = friendsFriendStatusStatus;
        this.mutual = friendsRequestsMutual;
        this.deactivated = str63;
        this.firstName = str64;
        this.hidden = num13;
        this.lastName = str65;
        this.canAccessClosed = bool12;
        this.isClosed = bool13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsersUserFull copy$default(UsersUserFull usersUserFull, UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BaseCity baseCity, BaseCountry baseCountry, Float f10, OwnerState ownerState, String str18, String str19, String str20, String str21, String str22, String str23, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, BaseBoolInt baseBoolInt6, BaseBoolInt baseBoolInt7, UsersUserType usersUserType, String str24, String str25, String str26, String str27, String str28, String str29, String str30, BaseBoolInt baseBoolInt8, VideoLiveInfo videoLiveInfo, BaseBoolInt baseBoolInt9, Boolean bool, String str31, String str32, String str33, String str34, String str35, String str36, String str37, PhotosPhoto photosPhoto, String str38, Integer num, Boolean bool2, WallDefault wallDefault, Boolean bool3, Boolean bool4, Boolean bool5, BaseBoolInt baseBoolInt10, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, BaseBoolInt baseBoolInt11, BaseBoolInt baseBoolInt12, Boolean bool6, String str48, String str49, String str50, AudioAudio audioAudio, String str51, String str52, UsersLastSeen usersLastSeen, UsersExports usersExports, BaseCropPhoto baseCropPhoto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolInt baseBoolInt13, BaseBoolInt baseBoolInt14, BaseBoolInt baseBoolInt15, BaseBoolInt baseBoolInt16, Integer num6, UsersOccupation usersOccupation, List list, List list2, Integer num7, String str53, Integer num8, Integer num9, String str54, Integer num10, String str55, String str56, String str57, UsersUserRelation usersUserRelation, UsersUserMin usersUserMin, UsersPersonal usersPersonal, List list3, List list4, List list5, Boolean bool7, Boolean bool8, Boolean bool9, UsersUserCounters usersUserCounters, String str58, BaseBoolInt baseBoolInt17, String str59, Boolean bool10, Integer num11, Boolean bool11, List list6, List list7, BaseSex baseSex, String str60, String str61, String str62, UsersOnlineInfo usersOnlineInfo, BaseBoolInt baseBoolInt18, BaseBoolInt baseBoolInt19, Integer num12, BaseBoolInt baseBoolInt20, BaseBoolInt baseBoolInt21, FriendsFriendStatusStatus friendsFriendStatusStatus, FriendsRequestsMutual friendsRequestsMutual, String str63, String str64, Integer num13, String str65, Boolean bool12, Boolean bool13, int i, int i10, int i11, int i12, int i13, Object obj) {
        UserId userId2 = (i & 1) != 0 ? usersUserFull.f15248id : userId;
        String str66 = (i & 2) != 0 ? usersUserFull.firstNameNom : str;
        String str67 = (i & 4) != 0 ? usersUserFull.firstNameGen : str2;
        String str68 = (i & 8) != 0 ? usersUserFull.firstNameDat : str3;
        String str69 = (i & 16) != 0 ? usersUserFull.firstNameAcc : str4;
        String str70 = (i & 32) != 0 ? usersUserFull.firstNameIns : str5;
        String str71 = (i & 64) != 0 ? usersUserFull.firstNameAbl : str6;
        String str72 = (i & 128) != 0 ? usersUserFull.lastNameNom : str7;
        String str73 = (i & 256) != 0 ? usersUserFull.lastNameGen : str8;
        String str74 = (i & 512) != 0 ? usersUserFull.lastNameDat : str9;
        UserId userId3 = userId2;
        String str75 = (i & 1024) != 0 ? usersUserFull.lastNameAcc : str10;
        String str76 = (i & 2048) != 0 ? usersUserFull.lastNameIns : str11;
        String str77 = (i & 4096) != 0 ? usersUserFull.lastNameAbl : str12;
        String str78 = (i & 8192) != 0 ? usersUserFull.nickname : str13;
        String str79 = (i & 16384) != 0 ? usersUserFull.maidenName : str14;
        String str80 = (i & 32768) != 0 ? usersUserFull.contactName : str15;
        String str81 = (i & 65536) != 0 ? usersUserFull.domain : str16;
        String str82 = (i & 131072) != 0 ? usersUserFull.bdate : str17;
        BaseCity baseCity2 = (i & 262144) != 0 ? usersUserFull.city : baseCity;
        BaseCountry baseCountry2 = (i & 524288) != 0 ? usersUserFull.country : baseCountry;
        Float f11 = (i & 1048576) != 0 ? usersUserFull.timezone : f10;
        OwnerState ownerState2 = (i & 2097152) != 0 ? usersUserFull.ownerState : ownerState;
        String str83 = (i & 4194304) != 0 ? usersUserFull.photo200 : str18;
        String str84 = (i & 8388608) != 0 ? usersUserFull.photoMax : str19;
        String str85 = (i & 16777216) != 0 ? usersUserFull.photo200Orig : str20;
        String str86 = (i & 33554432) != 0 ? usersUserFull.photo400Orig : str21;
        String str87 = (i & 67108864) != 0 ? usersUserFull.photoMaxOrig : str22;
        String str88 = (i & 134217728) != 0 ? usersUserFull.photoId : str23;
        BaseBoolInt baseBoolInt22 = (i & 268435456) != 0 ? usersUserFull.hasPhoto : baseBoolInt;
        BaseBoolInt baseBoolInt23 = (i & 536870912) != 0 ? usersUserFull.hasMobile : baseBoolInt2;
        BaseBoolInt baseBoolInt24 = (i & 1073741824) != 0 ? usersUserFull.isFriend : baseBoolInt3;
        BaseBoolInt baseBoolInt25 = (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? usersUserFull.wallComments : baseBoolInt4;
        BaseBoolInt baseBoolInt26 = (i10 & 1) != 0 ? usersUserFull.canPost : baseBoolInt5;
        BaseBoolInt baseBoolInt27 = (i10 & 2) != 0 ? usersUserFull.canSeeAllPosts : baseBoolInt6;
        BaseBoolInt baseBoolInt28 = (i10 & 4) != 0 ? usersUserFull.canSeeAudio : baseBoolInt7;
        UsersUserType usersUserType2 = (i10 & 8) != 0 ? usersUserFull.type : usersUserType;
        String str89 = (i10 & 16) != 0 ? usersUserFull.email : str24;
        String str90 = (i10 & 32) != 0 ? usersUserFull.skype : str25;
        String str91 = (i10 & 64) != 0 ? usersUserFull.facebook : str26;
        String str92 = (i10 & 128) != 0 ? usersUserFull.facebookName : str27;
        String str93 = (i10 & 256) != 0 ? usersUserFull.twitter : str28;
        String str94 = (i10 & 512) != 0 ? usersUserFull.livejournal : str29;
        String str95 = (i10 & 1024) != 0 ? usersUserFull.instagram : str30;
        BaseBoolInt baseBoolInt29 = (i10 & 2048) != 0 ? usersUserFull.test : baseBoolInt8;
        VideoLiveInfo videoLiveInfo2 = (i10 & 4096) != 0 ? usersUserFull.videoLive : videoLiveInfo;
        BaseBoolInt baseBoolInt30 = (i10 & 8192) != 0 ? usersUserFull.isVideoLiveNotificationsBlocked : baseBoolInt9;
        Boolean bool14 = (i10 & 16384) != 0 ? usersUserFull.isService : bool;
        String str96 = (i10 & 32768) != 0 ? usersUserFull.serviceDescription : str31;
        String str97 = (i10 & 65536) != 0 ? usersUserFull.photoRec : str32;
        String str98 = (i10 & 131072) != 0 ? usersUserFull.photoMedium : str33;
        String str99 = (i10 & 262144) != 0 ? usersUserFull.photoMediumRec : str34;
        String str100 = (i10 & 524288) != 0 ? usersUserFull.photo : str35;
        String str101 = (i10 & 1048576) != 0 ? usersUserFull.photoBig : str36;
        String str102 = (i10 & 2097152) != 0 ? usersUserFull.photo400 : str37;
        PhotosPhoto photosPhoto2 = (i10 & 4194304) != 0 ? usersUserFull.photoMaxSize : photosPhoto;
        String str103 = (i10 & 8388608) != 0 ? usersUserFull.language : str38;
        Integer num14 = (i10 & 16777216) != 0 ? usersUserFull.storiesArchiveCount : num;
        Boolean bool15 = (i10 & 33554432) != 0 ? usersUserFull.hasUnseenStories : bool2;
        WallDefault wallDefault2 = (i10 & 67108864) != 0 ? usersUserFull.wallDefault : wallDefault;
        Boolean bool16 = (i10 & 134217728) != 0 ? usersUserFull.canCall : bool3;
        Boolean bool17 = (i10 & 268435456) != 0 ? usersUserFull.canCallFromGroup : bool4;
        Boolean bool18 = (i10 & 536870912) != 0 ? usersUserFull.canSeeWishes : bool5;
        BaseBoolInt baseBoolInt31 = (i10 & 1073741824) != 0 ? usersUserFull.canSeeGifts : baseBoolInt10;
        String str104 = (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? usersUserFull.interests : str39;
        BaseBoolInt baseBoolInt32 = baseBoolInt31;
        String str105 = (i11 & 1) != 0 ? usersUserFull.books : str40;
        String str106 = (i11 & 2) != 0 ? usersUserFull.tv : str41;
        String str107 = (i11 & 4) != 0 ? usersUserFull.quotes : str42;
        String str108 = (i11 & 8) != 0 ? usersUserFull.about : str43;
        String str109 = (i11 & 16) != 0 ? usersUserFull.games : str44;
        String str110 = (i11 & 32) != 0 ? usersUserFull.movies : str45;
        String str111 = (i11 & 64) != 0 ? usersUserFull.activities : str46;
        String str112 = (i11 & 128) != 0 ? usersUserFull.music : str47;
        BaseBoolInt baseBoolInt33 = (i11 & 256) != 0 ? usersUserFull.canWritePrivateMessage : baseBoolInt11;
        BaseBoolInt baseBoolInt34 = (i11 & 512) != 0 ? usersUserFull.canSendFriendRequest : baseBoolInt12;
        Boolean bool19 = (i11 & 1024) != 0 ? usersUserFull.canBeInvitedGroup : bool6;
        String str113 = (i11 & 2048) != 0 ? usersUserFull.mobilePhone : str48;
        String str114 = (i11 & 4096) != 0 ? usersUserFull.homePhone : str49;
        String str115 = (i11 & 8192) != 0 ? usersUserFull.site : str50;
        AudioAudio audioAudio2 = (i11 & 16384) != 0 ? usersUserFull.statusAudio : audioAudio;
        String str116 = (i11 & 32768) != 0 ? usersUserFull.status : str51;
        String str117 = (i11 & 65536) != 0 ? usersUserFull.activity : str52;
        UsersLastSeen usersLastSeen2 = (i11 & 131072) != 0 ? usersUserFull.lastSeen : usersLastSeen;
        UsersExports usersExports2 = (i11 & 262144) != 0 ? usersUserFull.exports : usersExports;
        BaseCropPhoto baseCropPhoto2 = (i11 & 524288) != 0 ? usersUserFull.cropPhoto : baseCropPhoto;
        Integer num15 = (i11 & 1048576) != 0 ? usersUserFull.followersCount : num2;
        Integer num16 = (i11 & 2097152) != 0 ? usersUserFull.videoLiveLevel : num3;
        Integer num17 = (i11 & 4194304) != 0 ? usersUserFull.videoLiveCount : num4;
        Integer num18 = (i11 & 8388608) != 0 ? usersUserFull.clipsCount : num5;
        BaseBoolInt baseBoolInt35 = (i11 & 16777216) != 0 ? usersUserFull.blacklisted : baseBoolInt13;
        BaseBoolInt baseBoolInt36 = (i11 & 33554432) != 0 ? usersUserFull.blacklistedByMe : baseBoolInt14;
        BaseBoolInt baseBoolInt37 = (i11 & 67108864) != 0 ? usersUserFull.isFavorite : baseBoolInt15;
        BaseBoolInt baseBoolInt38 = (i11 & 134217728) != 0 ? usersUserFull.isHiddenFromFeed : baseBoolInt16;
        Integer num19 = (i11 & 268435456) != 0 ? usersUserFull.commonCount : num6;
        UsersOccupation usersOccupation2 = (i11 & 536870912) != 0 ? usersUserFull.occupation : usersOccupation;
        List list8 = (i11 & 1073741824) != 0 ? usersUserFull.career : list;
        return usersUserFull.copy(userId3, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, baseCity2, baseCountry2, f11, ownerState2, str83, str84, str85, str86, str87, str88, baseBoolInt22, baseBoolInt23, baseBoolInt24, baseBoolInt25, baseBoolInt26, baseBoolInt27, baseBoolInt28, usersUserType2, str89, str90, str91, str92, str93, str94, str95, baseBoolInt29, videoLiveInfo2, baseBoolInt30, bool14, str96, str97, str98, str99, str100, str101, str102, photosPhoto2, str103, num14, bool15, wallDefault2, bool16, bool17, bool18, baseBoolInt32, str104, str105, str106, str107, str108, str109, str110, str111, str112, baseBoolInt33, baseBoolInt34, bool19, str113, str114, str115, audioAudio2, str116, str117, usersLastSeen2, usersExports2, baseCropPhoto2, num15, num16, num17, num18, baseBoolInt35, baseBoolInt36, baseBoolInt37, baseBoolInt38, num19, usersOccupation2, list8, (i11 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? usersUserFull.military : list2, (i12 & 1) != 0 ? usersUserFull.university : num7, (i12 & 2) != 0 ? usersUserFull.universityName : str53, (i12 & 4) != 0 ? usersUserFull.universityGroupId : num8, (i12 & 8) != 0 ? usersUserFull.faculty : num9, (i12 & 16) != 0 ? usersUserFull.facultyName : str54, (i12 & 32) != 0 ? usersUserFull.graduation : num10, (i12 & 64) != 0 ? usersUserFull.educationForm : str55, (i12 & 128) != 0 ? usersUserFull.educationStatus : str56, (i12 & 256) != 0 ? usersUserFull.homeTown : str57, (i12 & 512) != 0 ? usersUserFull.relation : usersUserRelation, (i12 & 1024) != 0 ? usersUserFull.relationPartner : usersUserMin, (i12 & 2048) != 0 ? usersUserFull.personal : usersPersonal, (i12 & 4096) != 0 ? usersUserFull.universities : list3, (i12 & 8192) != 0 ? usersUserFull.schools : list4, (i12 & 16384) != 0 ? usersUserFull.relatives : list5, (i12 & 32768) != 0 ? usersUserFull.isSubscribedPodcasts : bool7, (i12 & 65536) != 0 ? usersUserFull.canSubscribePodcasts : bool8, (i12 & 131072) != 0 ? usersUserFull.canSubscribePosts : bool9, (i12 & 262144) != 0 ? usersUserFull.counters : usersUserCounters, (i12 & 524288) != 0 ? usersUserFull.accessKey : str58, (i12 & 1048576) != 0 ? usersUserFull.canUploadDoc : baseBoolInt17, (i12 & 2097152) != 0 ? usersUserFull.hash : str59, (i12 & 4194304) != 0 ? usersUserFull.isNoIndex : bool10, (i12 & 8388608) != 0 ? usersUserFull.contactId : num11, (i12 & 16777216) != 0 ? usersUserFull.isMessageRequest : bool11, (i12 & 33554432) != 0 ? usersUserFull.descriptions : list6, (i12 & 67108864) != 0 ? usersUserFull.lists : list7, (i12 & 134217728) != 0 ? usersUserFull.sex : baseSex, (i12 & 268435456) != 0 ? usersUserFull.screenName : str60, (i12 & 536870912) != 0 ? usersUserFull.photo50 : str61, (i12 & 1073741824) != 0 ? usersUserFull.photo100 : str62, (i12 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? usersUserFull.onlineInfo : usersOnlineInfo, (i13 & 1) != 0 ? usersUserFull.online : baseBoolInt18, (i13 & 2) != 0 ? usersUserFull.onlineMobile : baseBoolInt19, (i13 & 4) != 0 ? usersUserFull.onlineApp : num12, (i13 & 8) != 0 ? usersUserFull.verified : baseBoolInt20, (i13 & 16) != 0 ? usersUserFull.trending : baseBoolInt21, (i13 & 32) != 0 ? usersUserFull.friendStatus : friendsFriendStatusStatus, (i13 & 64) != 0 ? usersUserFull.mutual : friendsRequestsMutual, (i13 & 128) != 0 ? usersUserFull.deactivated : str63, (i13 & 256) != 0 ? usersUserFull.firstName : str64, (i13 & 512) != 0 ? usersUserFull.hidden : num13, (i13 & 1024) != 0 ? usersUserFull.lastName : str65, (i13 & 2048) != 0 ? usersUserFull.canAccessClosed : bool12, (i13 & 4096) != 0 ? usersUserFull.isClosed : bool13);
    }

    @NotNull
    public final UserId component1() {
        return this.f15248id;
    }

    @Nullable
    public final String component10() {
        return this.lastNameDat;
    }

    @Nullable
    public final Integer component100() {
        return this.faculty;
    }

    @Nullable
    public final String component101() {
        return this.facultyName;
    }

    @Nullable
    public final Integer component102() {
        return this.graduation;
    }

    @Nullable
    public final String component103() {
        return this.educationForm;
    }

    @Nullable
    public final String component104() {
        return this.educationStatus;
    }

    @Nullable
    public final String component105() {
        return this.homeTown;
    }

    @Nullable
    public final UsersUserRelation component106() {
        return this.relation;
    }

    @Nullable
    public final UsersUserMin component107() {
        return this.relationPartner;
    }

    @Nullable
    public final UsersPersonal component108() {
        return this.personal;
    }

    @Nullable
    public final List<UsersUniversity> component109() {
        return this.universities;
    }

    @Nullable
    public final String component11() {
        return this.lastNameAcc;
    }

    @Nullable
    public final List<UsersSchool> component110() {
        return this.schools;
    }

    @Nullable
    public final List<UsersRelative> component111() {
        return this.relatives;
    }

    @Nullable
    public final Boolean component112() {
        return this.isSubscribedPodcasts;
    }

    @Nullable
    public final Boolean component113() {
        return this.canSubscribePodcasts;
    }

    @Nullable
    public final Boolean component114() {
        return this.canSubscribePosts;
    }

    @Nullable
    public final UsersUserCounters component115() {
        return this.counters;
    }

    @Nullable
    public final String component116() {
        return this.accessKey;
    }

    @Nullable
    public final BaseBoolInt component117() {
        return this.canUploadDoc;
    }

    @Nullable
    public final String component118() {
        return this.hash;
    }

    @Nullable
    public final Boolean component119() {
        return this.isNoIndex;
    }

    @Nullable
    public final String component12() {
        return this.lastNameIns;
    }

    @Nullable
    public final Integer component120() {
        return this.contactId;
    }

    @Nullable
    public final Boolean component121() {
        return this.isMessageRequest;
    }

    @Nullable
    public final List<String> component122() {
        return this.descriptions;
    }

    @Nullable
    public final List<Integer> component123() {
        return this.lists;
    }

    @Nullable
    public final BaseSex component124() {
        return this.sex;
    }

    @Nullable
    public final String component125() {
        return this.screenName;
    }

    @Nullable
    public final String component126() {
        return this.photo50;
    }

    @Nullable
    public final String component127() {
        return this.photo100;
    }

    @Nullable
    public final UsersOnlineInfo component128() {
        return this.onlineInfo;
    }

    @Nullable
    public final BaseBoolInt component129() {
        return this.online;
    }

    @Nullable
    public final String component13() {
        return this.lastNameAbl;
    }

    @Nullable
    public final BaseBoolInt component130() {
        return this.onlineMobile;
    }

    @Nullable
    public final Integer component131() {
        return this.onlineApp;
    }

    @Nullable
    public final BaseBoolInt component132() {
        return this.verified;
    }

    @Nullable
    public final BaseBoolInt component133() {
        return this.trending;
    }

    @Nullable
    public final FriendsFriendStatusStatus component134() {
        return this.friendStatus;
    }

    @Nullable
    public final FriendsRequestsMutual component135() {
        return this.mutual;
    }

    @Nullable
    public final String component136() {
        return this.deactivated;
    }

    @Nullable
    public final String component137() {
        return this.firstName;
    }

    @Nullable
    public final Integer component138() {
        return this.hidden;
    }

    @Nullable
    public final String component139() {
        return this.lastName;
    }

    @Nullable
    public final String component14() {
        return this.nickname;
    }

    @Nullable
    public final Boolean component140() {
        return this.canAccessClosed;
    }

    @Nullable
    public final Boolean component141() {
        return this.isClosed;
    }

    @Nullable
    public final String component15() {
        return this.maidenName;
    }

    @Nullable
    public final String component16() {
        return this.contactName;
    }

    @Nullable
    public final String component17() {
        return this.domain;
    }

    @Nullable
    public final String component18() {
        return this.bdate;
    }

    @Nullable
    public final BaseCity component19() {
        return this.city;
    }

    @Nullable
    public final String component2() {
        return this.firstNameNom;
    }

    @Nullable
    public final BaseCountry component20() {
        return this.country;
    }

    @Nullable
    public final Float component21() {
        return this.timezone;
    }

    @Nullable
    public final OwnerState component22() {
        return this.ownerState;
    }

    @Nullable
    public final String component23() {
        return this.photo200;
    }

    @Nullable
    public final String component24() {
        return this.photoMax;
    }

    @Nullable
    public final String component25() {
        return this.photo200Orig;
    }

    @Nullable
    public final String component26() {
        return this.photo400Orig;
    }

    @Nullable
    public final String component27() {
        return this.photoMaxOrig;
    }

    @Nullable
    public final String component28() {
        return this.photoId;
    }

    @Nullable
    public final BaseBoolInt component29() {
        return this.hasPhoto;
    }

    @Nullable
    public final String component3() {
        return this.firstNameGen;
    }

    @Nullable
    public final BaseBoolInt component30() {
        return this.hasMobile;
    }

    @Nullable
    public final BaseBoolInt component31() {
        return this.isFriend;
    }

    @Nullable
    public final BaseBoolInt component32() {
        return this.wallComments;
    }

    @Nullable
    public final BaseBoolInt component33() {
        return this.canPost;
    }

    @Nullable
    public final BaseBoolInt component34() {
        return this.canSeeAllPosts;
    }

    @Nullable
    public final BaseBoolInt component35() {
        return this.canSeeAudio;
    }

    @Nullable
    public final UsersUserType component36() {
        return this.type;
    }

    @Nullable
    public final String component37() {
        return this.email;
    }

    @Nullable
    public final String component38() {
        return this.skype;
    }

    @Nullable
    public final String component39() {
        return this.facebook;
    }

    @Nullable
    public final String component4() {
        return this.firstNameDat;
    }

    @Nullable
    public final String component40() {
        return this.facebookName;
    }

    @Nullable
    public final String component41() {
        return this.twitter;
    }

    @Nullable
    public final String component42() {
        return this.livejournal;
    }

    @Nullable
    public final String component43() {
        return this.instagram;
    }

    @Nullable
    public final BaseBoolInt component44() {
        return this.test;
    }

    @Nullable
    public final VideoLiveInfo component45() {
        return this.videoLive;
    }

    @Nullable
    public final BaseBoolInt component46() {
        return this.isVideoLiveNotificationsBlocked;
    }

    @Nullable
    public final Boolean component47() {
        return this.isService;
    }

    @Nullable
    public final String component48() {
        return this.serviceDescription;
    }

    @Nullable
    public final String component49() {
        return this.photoRec;
    }

    @Nullable
    public final String component5() {
        return this.firstNameAcc;
    }

    @Nullable
    public final String component50() {
        return this.photoMedium;
    }

    @Nullable
    public final String component51() {
        return this.photoMediumRec;
    }

    @Nullable
    public final String component52() {
        return this.photo;
    }

    @Nullable
    public final String component53() {
        return this.photoBig;
    }

    @Nullable
    public final String component54() {
        return this.photo400;
    }

    @Nullable
    public final PhotosPhoto component55() {
        return this.photoMaxSize;
    }

    @Nullable
    public final String component56() {
        return this.language;
    }

    @Nullable
    public final Integer component57() {
        return this.storiesArchiveCount;
    }

    @Nullable
    public final Boolean component58() {
        return this.hasUnseenStories;
    }

    @Nullable
    public final WallDefault component59() {
        return this.wallDefault;
    }

    @Nullable
    public final String component6() {
        return this.firstNameIns;
    }

    @Nullable
    public final Boolean component60() {
        return this.canCall;
    }

    @Nullable
    public final Boolean component61() {
        return this.canCallFromGroup;
    }

    @Nullable
    public final Boolean component62() {
        return this.canSeeWishes;
    }

    @Nullable
    public final BaseBoolInt component63() {
        return this.canSeeGifts;
    }

    @Nullable
    public final String component64() {
        return this.interests;
    }

    @Nullable
    public final String component65() {
        return this.books;
    }

    @Nullable
    public final String component66() {
        return this.tv;
    }

    @Nullable
    public final String component67() {
        return this.quotes;
    }

    @Nullable
    public final String component68() {
        return this.about;
    }

    @Nullable
    public final String component69() {
        return this.games;
    }

    @Nullable
    public final String component7() {
        return this.firstNameAbl;
    }

    @Nullable
    public final String component70() {
        return this.movies;
    }

    @Nullable
    public final String component71() {
        return this.activities;
    }

    @Nullable
    public final String component72() {
        return this.music;
    }

    @Nullable
    public final BaseBoolInt component73() {
        return this.canWritePrivateMessage;
    }

    @Nullable
    public final BaseBoolInt component74() {
        return this.canSendFriendRequest;
    }

    @Nullable
    public final Boolean component75() {
        return this.canBeInvitedGroup;
    }

    @Nullable
    public final String component76() {
        return this.mobilePhone;
    }

    @Nullable
    public final String component77() {
        return this.homePhone;
    }

    @Nullable
    public final String component78() {
        return this.site;
    }

    @Nullable
    public final AudioAudio component79() {
        return this.statusAudio;
    }

    @Nullable
    public final String component8() {
        return this.lastNameNom;
    }

    @Nullable
    public final String component80() {
        return this.status;
    }

    @Nullable
    public final String component81() {
        return this.activity;
    }

    @Nullable
    public final UsersLastSeen component82() {
        return this.lastSeen;
    }

    @Nullable
    public final UsersExports component83() {
        return this.exports;
    }

    @Nullable
    public final BaseCropPhoto component84() {
        return this.cropPhoto;
    }

    @Nullable
    public final Integer component85() {
        return this.followersCount;
    }

    @Nullable
    public final Integer component86() {
        return this.videoLiveLevel;
    }

    @Nullable
    public final Integer component87() {
        return this.videoLiveCount;
    }

    @Nullable
    public final Integer component88() {
        return this.clipsCount;
    }

    @Nullable
    public final BaseBoolInt component89() {
        return this.blacklisted;
    }

    @Nullable
    public final String component9() {
        return this.lastNameGen;
    }

    @Nullable
    public final BaseBoolInt component90() {
        return this.blacklistedByMe;
    }

    @Nullable
    public final BaseBoolInt component91() {
        return this.isFavorite;
    }

    @Nullable
    public final BaseBoolInt component92() {
        return this.isHiddenFromFeed;
    }

    @Nullable
    public final Integer component93() {
        return this.commonCount;
    }

    @Nullable
    public final UsersOccupation component94() {
        return this.occupation;
    }

    @Nullable
    public final List<UsersCareer> component95() {
        return this.career;
    }

    @Nullable
    public final List<UsersMilitary> component96() {
        return this.military;
    }

    @Nullable
    public final Integer component97() {
        return this.university;
    }

    @Nullable
    public final String component98() {
        return this.universityName;
    }

    @Nullable
    public final Integer component99() {
        return this.universityGroupId;
    }

    @NotNull
    public final UsersUserFull copy(@NotNull UserId id2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable BaseCity baseCity, @Nullable BaseCountry baseCountry, @Nullable Float f10, @Nullable OwnerState ownerState, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable UsersUserType usersUserType, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable BaseBoolInt baseBoolInt8, @Nullable VideoLiveInfo videoLiveInfo, @Nullable BaseBoolInt baseBoolInt9, @Nullable Boolean bool, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable PhotosPhoto photosPhoto, @Nullable String str38, @Nullable Integer num, @Nullable Boolean bool2, @Nullable WallDefault wallDefault, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable BaseBoolInt baseBoolInt10, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable Boolean bool6, @Nullable String str48, @Nullable String str49, @Nullable String str50, @Nullable AudioAudio audioAudio, @Nullable String str51, @Nullable String str52, @Nullable UsersLastSeen usersLastSeen, @Nullable UsersExports usersExports, @Nullable BaseCropPhoto baseCropPhoto, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable BaseBoolInt baseBoolInt13, @Nullable BaseBoolInt baseBoolInt14, @Nullable BaseBoolInt baseBoolInt15, @Nullable BaseBoolInt baseBoolInt16, @Nullable Integer num6, @Nullable UsersOccupation usersOccupation, @Nullable List<UsersCareer> list, @Nullable List<UsersMilitary> list2, @Nullable Integer num7, @Nullable String str53, @Nullable Integer num8, @Nullable Integer num9, @Nullable String str54, @Nullable Integer num10, @Nullable String str55, @Nullable String str56, @Nullable String str57, @Nullable UsersUserRelation usersUserRelation, @Nullable UsersUserMin usersUserMin, @Nullable UsersPersonal usersPersonal, @Nullable List<UsersUniversity> list3, @Nullable List<UsersSchool> list4, @Nullable List<UsersRelative> list5, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable UsersUserCounters usersUserCounters, @Nullable String str58, @Nullable BaseBoolInt baseBoolInt17, @Nullable String str59, @Nullable Boolean bool10, @Nullable Integer num11, @Nullable Boolean bool11, @Nullable List<String> list6, @Nullable List<Integer> list7, @Nullable BaseSex baseSex, @Nullable String str60, @Nullable String str61, @Nullable String str62, @Nullable UsersOnlineInfo usersOnlineInfo, @Nullable BaseBoolInt baseBoolInt18, @Nullable BaseBoolInt baseBoolInt19, @Nullable Integer num12, @Nullable BaseBoolInt baseBoolInt20, @Nullable BaseBoolInt baseBoolInt21, @Nullable FriendsFriendStatusStatus friendsFriendStatusStatus, @Nullable FriendsRequestsMutual friendsRequestsMutual, @Nullable String str63, @Nullable String str64, @Nullable Integer num13, @Nullable String str65, @Nullable Boolean bool12, @Nullable Boolean bool13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new UsersUserFull(id2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, baseCity, baseCountry, f10, ownerState, str18, str19, str20, str21, str22, str23, baseBoolInt, baseBoolInt2, baseBoolInt3, baseBoolInt4, baseBoolInt5, baseBoolInt6, baseBoolInt7, usersUserType, str24, str25, str26, str27, str28, str29, str30, baseBoolInt8, videoLiveInfo, baseBoolInt9, bool, str31, str32, str33, str34, str35, str36, str37, photosPhoto, str38, num, bool2, wallDefault, bool3, bool4, bool5, baseBoolInt10, str39, str40, str41, str42, str43, str44, str45, str46, str47, baseBoolInt11, baseBoolInt12, bool6, str48, str49, str50, audioAudio, str51, str52, usersLastSeen, usersExports, baseCropPhoto, num2, num3, num4, num5, baseBoolInt13, baseBoolInt14, baseBoolInt15, baseBoolInt16, num6, usersOccupation, list, list2, num7, str53, num8, num9, str54, num10, str55, str56, str57, usersUserRelation, usersUserMin, usersPersonal, list3, list4, list5, bool7, bool8, bool9, usersUserCounters, str58, baseBoolInt17, str59, bool10, num11, bool11, list6, list7, baseSex, str60, str61, str62, usersOnlineInfo, baseBoolInt18, baseBoolInt19, num12, baseBoolInt20, baseBoolInt21, friendsFriendStatusStatus, friendsRequestsMutual, str63, str64, num13, str65, bool12, bool13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserFull)) {
            return false;
        }
        UsersUserFull usersUserFull = (UsersUserFull) obj;
        return Intrinsics.a(this.f15248id, usersUserFull.f15248id) && Intrinsics.a(this.firstNameNom, usersUserFull.firstNameNom) && Intrinsics.a(this.firstNameGen, usersUserFull.firstNameGen) && Intrinsics.a(this.firstNameDat, usersUserFull.firstNameDat) && Intrinsics.a(this.firstNameAcc, usersUserFull.firstNameAcc) && Intrinsics.a(this.firstNameIns, usersUserFull.firstNameIns) && Intrinsics.a(this.firstNameAbl, usersUserFull.firstNameAbl) && Intrinsics.a(this.lastNameNom, usersUserFull.lastNameNom) && Intrinsics.a(this.lastNameGen, usersUserFull.lastNameGen) && Intrinsics.a(this.lastNameDat, usersUserFull.lastNameDat) && Intrinsics.a(this.lastNameAcc, usersUserFull.lastNameAcc) && Intrinsics.a(this.lastNameIns, usersUserFull.lastNameIns) && Intrinsics.a(this.lastNameAbl, usersUserFull.lastNameAbl) && Intrinsics.a(this.nickname, usersUserFull.nickname) && Intrinsics.a(this.maidenName, usersUserFull.maidenName) && Intrinsics.a(this.contactName, usersUserFull.contactName) && Intrinsics.a(this.domain, usersUserFull.domain) && Intrinsics.a(this.bdate, usersUserFull.bdate) && Intrinsics.a(this.city, usersUserFull.city) && Intrinsics.a(this.country, usersUserFull.country) && Intrinsics.a(this.timezone, usersUserFull.timezone) && Intrinsics.a(this.ownerState, usersUserFull.ownerState) && Intrinsics.a(this.photo200, usersUserFull.photo200) && Intrinsics.a(this.photoMax, usersUserFull.photoMax) && Intrinsics.a(this.photo200Orig, usersUserFull.photo200Orig) && Intrinsics.a(this.photo400Orig, usersUserFull.photo400Orig) && Intrinsics.a(this.photoMaxOrig, usersUserFull.photoMaxOrig) && Intrinsics.a(this.photoId, usersUserFull.photoId) && this.hasPhoto == usersUserFull.hasPhoto && this.hasMobile == usersUserFull.hasMobile && this.isFriend == usersUserFull.isFriend && this.wallComments == usersUserFull.wallComments && this.canPost == usersUserFull.canPost && this.canSeeAllPosts == usersUserFull.canSeeAllPosts && this.canSeeAudio == usersUserFull.canSeeAudio && this.type == usersUserFull.type && Intrinsics.a(this.email, usersUserFull.email) && Intrinsics.a(this.skype, usersUserFull.skype) && Intrinsics.a(this.facebook, usersUserFull.facebook) && Intrinsics.a(this.facebookName, usersUserFull.facebookName) && Intrinsics.a(this.twitter, usersUserFull.twitter) && Intrinsics.a(this.livejournal, usersUserFull.livejournal) && Intrinsics.a(this.instagram, usersUserFull.instagram) && this.test == usersUserFull.test && Intrinsics.a(this.videoLive, usersUserFull.videoLive) && this.isVideoLiveNotificationsBlocked == usersUserFull.isVideoLiveNotificationsBlocked && Intrinsics.a(this.isService, usersUserFull.isService) && Intrinsics.a(this.serviceDescription, usersUserFull.serviceDescription) && Intrinsics.a(this.photoRec, usersUserFull.photoRec) && Intrinsics.a(this.photoMedium, usersUserFull.photoMedium) && Intrinsics.a(this.photoMediumRec, usersUserFull.photoMediumRec) && Intrinsics.a(this.photo, usersUserFull.photo) && Intrinsics.a(this.photoBig, usersUserFull.photoBig) && Intrinsics.a(this.photo400, usersUserFull.photo400) && Intrinsics.a(this.photoMaxSize, usersUserFull.photoMaxSize) && Intrinsics.a(this.language, usersUserFull.language) && Intrinsics.a(this.storiesArchiveCount, usersUserFull.storiesArchiveCount) && Intrinsics.a(this.hasUnseenStories, usersUserFull.hasUnseenStories) && this.wallDefault == usersUserFull.wallDefault && Intrinsics.a(this.canCall, usersUserFull.canCall) && Intrinsics.a(this.canCallFromGroup, usersUserFull.canCallFromGroup) && Intrinsics.a(this.canSeeWishes, usersUserFull.canSeeWishes) && this.canSeeGifts == usersUserFull.canSeeGifts && Intrinsics.a(this.interests, usersUserFull.interests) && Intrinsics.a(this.books, usersUserFull.books) && Intrinsics.a(this.tv, usersUserFull.tv) && Intrinsics.a(this.quotes, usersUserFull.quotes) && Intrinsics.a(this.about, usersUserFull.about) && Intrinsics.a(this.games, usersUserFull.games) && Intrinsics.a(this.movies, usersUserFull.movies) && Intrinsics.a(this.activities, usersUserFull.activities) && Intrinsics.a(this.music, usersUserFull.music) && this.canWritePrivateMessage == usersUserFull.canWritePrivateMessage && this.canSendFriendRequest == usersUserFull.canSendFriendRequest && Intrinsics.a(this.canBeInvitedGroup, usersUserFull.canBeInvitedGroup) && Intrinsics.a(this.mobilePhone, usersUserFull.mobilePhone) && Intrinsics.a(this.homePhone, usersUserFull.homePhone) && Intrinsics.a(this.site, usersUserFull.site) && Intrinsics.a(this.statusAudio, usersUserFull.statusAudio) && Intrinsics.a(this.status, usersUserFull.status) && Intrinsics.a(this.activity, usersUserFull.activity) && Intrinsics.a(this.lastSeen, usersUserFull.lastSeen) && Intrinsics.a(this.exports, usersUserFull.exports) && Intrinsics.a(this.cropPhoto, usersUserFull.cropPhoto) && Intrinsics.a(this.followersCount, usersUserFull.followersCount) && Intrinsics.a(this.videoLiveLevel, usersUserFull.videoLiveLevel) && Intrinsics.a(this.videoLiveCount, usersUserFull.videoLiveCount) && Intrinsics.a(this.clipsCount, usersUserFull.clipsCount) && this.blacklisted == usersUserFull.blacklisted && this.blacklistedByMe == usersUserFull.blacklistedByMe && this.isFavorite == usersUserFull.isFavorite && this.isHiddenFromFeed == usersUserFull.isHiddenFromFeed && Intrinsics.a(this.commonCount, usersUserFull.commonCount) && Intrinsics.a(this.occupation, usersUserFull.occupation) && Intrinsics.a(this.career, usersUserFull.career) && Intrinsics.a(this.military, usersUserFull.military) && Intrinsics.a(this.university, usersUserFull.university) && Intrinsics.a(this.universityName, usersUserFull.universityName) && Intrinsics.a(this.universityGroupId, usersUserFull.universityGroupId) && Intrinsics.a(this.faculty, usersUserFull.faculty) && Intrinsics.a(this.facultyName, usersUserFull.facultyName) && Intrinsics.a(this.graduation, usersUserFull.graduation) && Intrinsics.a(this.educationForm, usersUserFull.educationForm) && Intrinsics.a(this.educationStatus, usersUserFull.educationStatus) && Intrinsics.a(this.homeTown, usersUserFull.homeTown) && this.relation == usersUserFull.relation && Intrinsics.a(this.relationPartner, usersUserFull.relationPartner) && Intrinsics.a(this.personal, usersUserFull.personal) && Intrinsics.a(this.universities, usersUserFull.universities) && Intrinsics.a(this.schools, usersUserFull.schools) && Intrinsics.a(this.relatives, usersUserFull.relatives) && Intrinsics.a(this.isSubscribedPodcasts, usersUserFull.isSubscribedPodcasts) && Intrinsics.a(this.canSubscribePodcasts, usersUserFull.canSubscribePodcasts) && Intrinsics.a(this.canSubscribePosts, usersUserFull.canSubscribePosts) && Intrinsics.a(this.counters, usersUserFull.counters) && Intrinsics.a(this.accessKey, usersUserFull.accessKey) && this.canUploadDoc == usersUserFull.canUploadDoc && Intrinsics.a(this.hash, usersUserFull.hash) && Intrinsics.a(this.isNoIndex, usersUserFull.isNoIndex) && Intrinsics.a(this.contactId, usersUserFull.contactId) && Intrinsics.a(this.isMessageRequest, usersUserFull.isMessageRequest) && Intrinsics.a(this.descriptions, usersUserFull.descriptions) && Intrinsics.a(this.lists, usersUserFull.lists) && this.sex == usersUserFull.sex && Intrinsics.a(this.screenName, usersUserFull.screenName) && Intrinsics.a(this.photo50, usersUserFull.photo50) && Intrinsics.a(this.photo100, usersUserFull.photo100) && Intrinsics.a(this.onlineInfo, usersUserFull.onlineInfo) && this.online == usersUserFull.online && this.onlineMobile == usersUserFull.onlineMobile && Intrinsics.a(this.onlineApp, usersUserFull.onlineApp) && this.verified == usersUserFull.verified && this.trending == usersUserFull.trending && this.friendStatus == usersUserFull.friendStatus && Intrinsics.a(this.mutual, usersUserFull.mutual) && Intrinsics.a(this.deactivated, usersUserFull.deactivated) && Intrinsics.a(this.firstName, usersUserFull.firstName) && Intrinsics.a(this.hidden, usersUserFull.hidden) && Intrinsics.a(this.lastName, usersUserFull.lastName) && Intrinsics.a(this.canAccessClosed, usersUserFull.canAccessClosed) && Intrinsics.a(this.isClosed, usersUserFull.isClosed);
    }

    @Nullable
    public final String getAbout() {
        return this.about;
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final String getActivities() {
        return this.activities;
    }

    @Nullable
    public final String getActivity() {
        return this.activity;
    }

    @Nullable
    public final String getBdate() {
        return this.bdate;
    }

    @Nullable
    public final BaseBoolInt getBlacklisted() {
        return this.blacklisted;
    }

    @Nullable
    public final BaseBoolInt getBlacklistedByMe() {
        return this.blacklistedByMe;
    }

    @Nullable
    public final String getBooks() {
        return this.books;
    }

    @Nullable
    public final Boolean getCanAccessClosed() {
        return this.canAccessClosed;
    }

    @Nullable
    public final Boolean getCanBeInvitedGroup() {
        return this.canBeInvitedGroup;
    }

    @Nullable
    public final Boolean getCanCall() {
        return this.canCall;
    }

    @Nullable
    public final Boolean getCanCallFromGroup() {
        return this.canCallFromGroup;
    }

    @Nullable
    public final BaseBoolInt getCanPost() {
        return this.canPost;
    }

    @Nullable
    public final BaseBoolInt getCanSeeAllPosts() {
        return this.canSeeAllPosts;
    }

    @Nullable
    public final BaseBoolInt getCanSeeAudio() {
        return this.canSeeAudio;
    }

    @Nullable
    public final BaseBoolInt getCanSeeGifts() {
        return this.canSeeGifts;
    }

    @Nullable
    public final Boolean getCanSeeWishes() {
        return this.canSeeWishes;
    }

    @Nullable
    public final BaseBoolInt getCanSendFriendRequest() {
        return this.canSendFriendRequest;
    }

    @Nullable
    public final Boolean getCanSubscribePodcasts() {
        return this.canSubscribePodcasts;
    }

    @Nullable
    public final Boolean getCanSubscribePosts() {
        return this.canSubscribePosts;
    }

    @Nullable
    public final BaseBoolInt getCanUploadDoc() {
        return this.canUploadDoc;
    }

    @Nullable
    public final BaseBoolInt getCanWritePrivateMessage() {
        return this.canWritePrivateMessage;
    }

    @Nullable
    public final List<UsersCareer> getCareer() {
        return this.career;
    }

    @Nullable
    public final BaseCity getCity() {
        return this.city;
    }

    @Nullable
    public final Integer getClipsCount() {
        return this.clipsCount;
    }

    @Nullable
    public final Integer getCommonCount() {
        return this.commonCount;
    }

    @Nullable
    public final Integer getContactId() {
        return this.contactId;
    }

    @Nullable
    public final String getContactName() {
        return this.contactName;
    }

    @Nullable
    public final UsersUserCounters getCounters() {
        return this.counters;
    }

    @Nullable
    public final BaseCountry getCountry() {
        return this.country;
    }

    @Nullable
    public final BaseCropPhoto getCropPhoto() {
        return this.cropPhoto;
    }

    @Nullable
    public final String getDeactivated() {
        return this.deactivated;
    }

    @Nullable
    public final List<String> getDescriptions() {
        return this.descriptions;
    }

    @Nullable
    public final String getDomain() {
        return this.domain;
    }

    @Nullable
    public final String getEducationForm() {
        return this.educationForm;
    }

    @Nullable
    public final String getEducationStatus() {
        return this.educationStatus;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final UsersExports getExports() {
        return this.exports;
    }

    @Nullable
    public final String getFacebook() {
        return this.facebook;
    }

    @Nullable
    public final String getFacebookName() {
        return this.facebookName;
    }

    @Nullable
    public final Integer getFaculty() {
        return this.faculty;
    }

    @Nullable
    public final String getFacultyName() {
        return this.facultyName;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getFirstNameAbl() {
        return this.firstNameAbl;
    }

    @Nullable
    public final String getFirstNameAcc() {
        return this.firstNameAcc;
    }

    @Nullable
    public final String getFirstNameDat() {
        return this.firstNameDat;
    }

    @Nullable
    public final String getFirstNameGen() {
        return this.firstNameGen;
    }

    @Nullable
    public final String getFirstNameIns() {
        return this.firstNameIns;
    }

    @Nullable
    public final String getFirstNameNom() {
        return this.firstNameNom;
    }

    @Nullable
    public final Integer getFollowersCount() {
        return this.followersCount;
    }

    @Nullable
    public final FriendsFriendStatusStatus getFriendStatus() {
        return this.friendStatus;
    }

    @Nullable
    public final String getGames() {
        return this.games;
    }

    @Nullable
    public final Integer getGraduation() {
        return this.graduation;
    }

    @Nullable
    public final BaseBoolInt getHasMobile() {
        return this.hasMobile;
    }

    @Nullable
    public final BaseBoolInt getHasPhoto() {
        return this.hasPhoto;
    }

    @Nullable
    public final Boolean getHasUnseenStories() {
        return this.hasUnseenStories;
    }

    @Nullable
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    public final Integer getHidden() {
        return this.hidden;
    }

    @Nullable
    public final String getHomePhone() {
        return this.homePhone;
    }

    @Nullable
    public final String getHomeTown() {
        return this.homeTown;
    }

    @NotNull
    public final UserId getId() {
        return this.f15248id;
    }

    @Nullable
    public final String getInstagram() {
        return this.instagram;
    }

    @Nullable
    public final String getInterests() {
        return this.interests;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getLastNameAbl() {
        return this.lastNameAbl;
    }

    @Nullable
    public final String getLastNameAcc() {
        return this.lastNameAcc;
    }

    @Nullable
    public final String getLastNameDat() {
        return this.lastNameDat;
    }

    @Nullable
    public final String getLastNameGen() {
        return this.lastNameGen;
    }

    @Nullable
    public final String getLastNameIns() {
        return this.lastNameIns;
    }

    @Nullable
    public final String getLastNameNom() {
        return this.lastNameNom;
    }

    @Nullable
    public final UsersLastSeen getLastSeen() {
        return this.lastSeen;
    }

    @Nullable
    public final List<Integer> getLists() {
        return this.lists;
    }

    @Nullable
    public final String getLivejournal() {
        return this.livejournal;
    }

    @Nullable
    public final String getMaidenName() {
        return this.maidenName;
    }

    @Nullable
    public final List<UsersMilitary> getMilitary() {
        return this.military;
    }

    @Nullable
    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    @Nullable
    public final String getMovies() {
        return this.movies;
    }

    @Nullable
    public final String getMusic() {
        return this.music;
    }

    @Nullable
    public final FriendsRequestsMutual getMutual() {
        return this.mutual;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final UsersOccupation getOccupation() {
        return this.occupation;
    }

    @Nullable
    public final BaseBoolInt getOnline() {
        return this.online;
    }

    @Nullable
    public final Integer getOnlineApp() {
        return this.onlineApp;
    }

    @Nullable
    public final UsersOnlineInfo getOnlineInfo() {
        return this.onlineInfo;
    }

    @Nullable
    public final BaseBoolInt getOnlineMobile() {
        return this.onlineMobile;
    }

    @Nullable
    public final OwnerState getOwnerState() {
        return this.ownerState;
    }

    @Nullable
    public final UsersPersonal getPersonal() {
        return this.personal;
    }

    @Nullable
    public final String getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getPhoto100() {
        return this.photo100;
    }

    @Nullable
    public final String getPhoto200() {
        return this.photo200;
    }

    @Nullable
    public final String getPhoto200Orig() {
        return this.photo200Orig;
    }

    @Nullable
    public final String getPhoto400() {
        return this.photo400;
    }

    @Nullable
    public final String getPhoto400Orig() {
        return this.photo400Orig;
    }

    @Nullable
    public final String getPhoto50() {
        return this.photo50;
    }

    @Nullable
    public final String getPhotoBig() {
        return this.photoBig;
    }

    @Nullable
    public final String getPhotoId() {
        return this.photoId;
    }

    @Nullable
    public final String getPhotoMax() {
        return this.photoMax;
    }

    @Nullable
    public final String getPhotoMaxOrig() {
        return this.photoMaxOrig;
    }

    @Nullable
    public final PhotosPhoto getPhotoMaxSize() {
        return this.photoMaxSize;
    }

    @Nullable
    public final String getPhotoMedium() {
        return this.photoMedium;
    }

    @Nullable
    public final String getPhotoMediumRec() {
        return this.photoMediumRec;
    }

    @Nullable
    public final String getPhotoRec() {
        return this.photoRec;
    }

    @Nullable
    public final String getQuotes() {
        return this.quotes;
    }

    @Nullable
    public final UsersUserRelation getRelation() {
        return this.relation;
    }

    @Nullable
    public final UsersUserMin getRelationPartner() {
        return this.relationPartner;
    }

    @Nullable
    public final List<UsersRelative> getRelatives() {
        return this.relatives;
    }

    @Nullable
    public final List<UsersSchool> getSchools() {
        return this.schools;
    }

    @Nullable
    public final String getScreenName() {
        return this.screenName;
    }

    @Nullable
    public final String getServiceDescription() {
        return this.serviceDescription;
    }

    @Nullable
    public final BaseSex getSex() {
        return this.sex;
    }

    @Nullable
    public final String getSite() {
        return this.site;
    }

    @Nullable
    public final String getSkype() {
        return this.skype;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final AudioAudio getStatusAudio() {
        return this.statusAudio;
    }

    @Nullable
    public final Integer getStoriesArchiveCount() {
        return this.storiesArchiveCount;
    }

    @Nullable
    public final BaseBoolInt getTest() {
        return this.test;
    }

    @Nullable
    public final Float getTimezone() {
        return this.timezone;
    }

    @Nullable
    public final BaseBoolInt getTrending() {
        return this.trending;
    }

    @Nullable
    public final String getTv() {
        return this.tv;
    }

    @Nullable
    public final String getTwitter() {
        return this.twitter;
    }

    @Nullable
    public final UsersUserType getType() {
        return this.type;
    }

    @Nullable
    public final List<UsersUniversity> getUniversities() {
        return this.universities;
    }

    @Nullable
    public final Integer getUniversity() {
        return this.university;
    }

    @Nullable
    public final Integer getUniversityGroupId() {
        return this.universityGroupId;
    }

    @Nullable
    public final String getUniversityName() {
        return this.universityName;
    }

    @Nullable
    public final BaseBoolInt getVerified() {
        return this.verified;
    }

    @Nullable
    public final VideoLiveInfo getVideoLive() {
        return this.videoLive;
    }

    @Nullable
    public final Integer getVideoLiveCount() {
        return this.videoLiveCount;
    }

    @Nullable
    public final Integer getVideoLiveLevel() {
        return this.videoLiveLevel;
    }

    @Nullable
    public final BaseBoolInt getWallComments() {
        return this.wallComments;
    }

    @Nullable
    public final WallDefault getWallDefault() {
        return this.wallDefault;
    }

    public int hashCode() {
        int iHashCode = this.f15248id.hashCode() * 31;
        String str = this.firstNameNom;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstNameGen;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstNameDat;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameAcc;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstNameIns;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstNameAbl;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastNameNom;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastNameGen;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastNameDat;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastNameAcc;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastNameIns;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastNameAbl;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.nickname;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.maidenName;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.contactName;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.domain;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.bdate;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        BaseCity baseCity = this.city;
        int iHashCode19 = (iHashCode18 + (baseCity == null ? 0 : baseCity.hashCode())) * 31;
        BaseCountry baseCountry = this.country;
        int iHashCode20 = (iHashCode19 + (baseCountry == null ? 0 : baseCountry.hashCode())) * 31;
        Float f10 = this.timezone;
        int iHashCode21 = (iHashCode20 + (f10 == null ? 0 : f10.hashCode())) * 31;
        OwnerState ownerState = this.ownerState;
        int iHashCode22 = (iHashCode21 + (ownerState == null ? 0 : ownerState.hashCode())) * 31;
        String str18 = this.photo200;
        int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.photoMax;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.photo200Orig;
        int iHashCode25 = (iHashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.photo400Orig;
        int iHashCode26 = (iHashCode25 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.photoMaxOrig;
        int iHashCode27 = (iHashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photoId;
        int iHashCode28 = (iHashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.hasPhoto;
        int iHashCode29 = (iHashCode28 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.hasMobile;
        int iHashCode30 = (iHashCode29 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.isFriend;
        int iHashCode31 = (iHashCode30 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.wallComments;
        int iHashCode32 = (iHashCode31 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        BaseBoolInt baseBoolInt5 = this.canPost;
        int iHashCode33 = (iHashCode32 + (baseBoolInt5 == null ? 0 : baseBoolInt5.hashCode())) * 31;
        BaseBoolInt baseBoolInt6 = this.canSeeAllPosts;
        int iHashCode34 = (iHashCode33 + (baseBoolInt6 == null ? 0 : baseBoolInt6.hashCode())) * 31;
        BaseBoolInt baseBoolInt7 = this.canSeeAudio;
        int iHashCode35 = (iHashCode34 + (baseBoolInt7 == null ? 0 : baseBoolInt7.hashCode())) * 31;
        UsersUserType usersUserType = this.type;
        int iHashCode36 = (iHashCode35 + (usersUserType == null ? 0 : usersUserType.hashCode())) * 31;
        String str24 = this.email;
        int iHashCode37 = (iHashCode36 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.skype;
        int iHashCode38 = (iHashCode37 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.facebook;
        int iHashCode39 = (iHashCode38 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.facebookName;
        int iHashCode40 = (iHashCode39 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.twitter;
        int iHashCode41 = (iHashCode40 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.livejournal;
        int iHashCode42 = (iHashCode41 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.instagram;
        int iHashCode43 = (iHashCode42 + (str30 == null ? 0 : str30.hashCode())) * 31;
        BaseBoolInt baseBoolInt8 = this.test;
        int iHashCode44 = (iHashCode43 + (baseBoolInt8 == null ? 0 : baseBoolInt8.hashCode())) * 31;
        VideoLiveInfo videoLiveInfo = this.videoLive;
        int iHashCode45 = (iHashCode44 + (videoLiveInfo == null ? 0 : videoLiveInfo.hashCode())) * 31;
        BaseBoolInt baseBoolInt9 = this.isVideoLiveNotificationsBlocked;
        int iHashCode46 = (iHashCode45 + (baseBoolInt9 == null ? 0 : baseBoolInt9.hashCode())) * 31;
        Boolean bool = this.isService;
        int iHashCode47 = (iHashCode46 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str31 = this.serviceDescription;
        int iHashCode48 = (iHashCode47 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.photoRec;
        int iHashCode49 = (iHashCode48 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.photoMedium;
        int iHashCode50 = (iHashCode49 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.photoMediumRec;
        int iHashCode51 = (iHashCode50 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.photo;
        int iHashCode52 = (iHashCode51 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.photoBig;
        int iHashCode53 = (iHashCode52 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.photo400;
        int iHashCode54 = (iHashCode53 + (str37 == null ? 0 : str37.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photoMaxSize;
        int iHashCode55 = (iHashCode54 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        String str38 = this.language;
        int iHashCode56 = (iHashCode55 + (str38 == null ? 0 : str38.hashCode())) * 31;
        Integer num = this.storiesArchiveCount;
        int iHashCode57 = (iHashCode56 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.hasUnseenStories;
        int iHashCode58 = (iHashCode57 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        WallDefault wallDefault = this.wallDefault;
        int iHashCode59 = (iHashCode58 + (wallDefault == null ? 0 : wallDefault.hashCode())) * 31;
        Boolean bool3 = this.canCall;
        int iHashCode60 = (iHashCode59 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canCallFromGroup;
        int iHashCode61 = (iHashCode60 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canSeeWishes;
        int iHashCode62 = (iHashCode61 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        BaseBoolInt baseBoolInt10 = this.canSeeGifts;
        int iHashCode63 = (iHashCode62 + (baseBoolInt10 == null ? 0 : baseBoolInt10.hashCode())) * 31;
        String str39 = this.interests;
        int iHashCode64 = (iHashCode63 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.books;
        int iHashCode65 = (iHashCode64 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.tv;
        int iHashCode66 = (iHashCode65 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.quotes;
        int iHashCode67 = (iHashCode66 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.about;
        int iHashCode68 = (iHashCode67 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.games;
        int iHashCode69 = (iHashCode68 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.movies;
        int iHashCode70 = (iHashCode69 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.activities;
        int iHashCode71 = (iHashCode70 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.music;
        int iHashCode72 = (iHashCode71 + (str47 == null ? 0 : str47.hashCode())) * 31;
        BaseBoolInt baseBoolInt11 = this.canWritePrivateMessage;
        int iHashCode73 = (iHashCode72 + (baseBoolInt11 == null ? 0 : baseBoolInt11.hashCode())) * 31;
        BaseBoolInt baseBoolInt12 = this.canSendFriendRequest;
        int iHashCode74 = (iHashCode73 + (baseBoolInt12 == null ? 0 : baseBoolInt12.hashCode())) * 31;
        Boolean bool6 = this.canBeInvitedGroup;
        int iHashCode75 = (iHashCode74 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str48 = this.mobilePhone;
        int iHashCode76 = (iHashCode75 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.homePhone;
        int iHashCode77 = (iHashCode76 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.site;
        int iHashCode78 = (iHashCode77 + (str50 == null ? 0 : str50.hashCode())) * 31;
        AudioAudio audioAudio = this.statusAudio;
        int iHashCode79 = (iHashCode78 + (audioAudio == null ? 0 : audioAudio.hashCode())) * 31;
        String str51 = this.status;
        int iHashCode80 = (iHashCode79 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.activity;
        int iHashCode81 = (iHashCode80 + (str52 == null ? 0 : str52.hashCode())) * 31;
        UsersLastSeen usersLastSeen = this.lastSeen;
        int iHashCode82 = (iHashCode81 + (usersLastSeen == null ? 0 : usersLastSeen.hashCode())) * 31;
        UsersExports usersExports = this.exports;
        int iHashCode83 = (iHashCode82 + (usersExports == null ? 0 : usersExports.hashCode())) * 31;
        BaseCropPhoto baseCropPhoto = this.cropPhoto;
        int iHashCode84 = (iHashCode83 + (baseCropPhoto == null ? 0 : baseCropPhoto.hashCode())) * 31;
        Integer num2 = this.followersCount;
        int iHashCode85 = (iHashCode84 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoLiveLevel;
        int iHashCode86 = (iHashCode85 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveCount;
        int iHashCode87 = (iHashCode86 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.clipsCount;
        int iHashCode88 = (iHashCode87 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BaseBoolInt baseBoolInt13 = this.blacklisted;
        int iHashCode89 = (iHashCode88 + (baseBoolInt13 == null ? 0 : baseBoolInt13.hashCode())) * 31;
        BaseBoolInt baseBoolInt14 = this.blacklistedByMe;
        int iHashCode90 = (iHashCode89 + (baseBoolInt14 == null ? 0 : baseBoolInt14.hashCode())) * 31;
        BaseBoolInt baseBoolInt15 = this.isFavorite;
        int iHashCode91 = (iHashCode90 + (baseBoolInt15 == null ? 0 : baseBoolInt15.hashCode())) * 31;
        BaseBoolInt baseBoolInt16 = this.isHiddenFromFeed;
        int iHashCode92 = (iHashCode91 + (baseBoolInt16 == null ? 0 : baseBoolInt16.hashCode())) * 31;
        Integer num6 = this.commonCount;
        int iHashCode93 = (iHashCode92 + (num6 == null ? 0 : num6.hashCode())) * 31;
        UsersOccupation usersOccupation = this.occupation;
        int iHashCode94 = (iHashCode93 + (usersOccupation == null ? 0 : usersOccupation.hashCode())) * 31;
        List<UsersCareer> list = this.career;
        int iHashCode95 = (iHashCode94 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersMilitary> list2 = this.military;
        int iHashCode96 = (iHashCode95 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num7 = this.university;
        int iHashCode97 = (iHashCode96 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str53 = this.universityName;
        int iHashCode98 = (iHashCode97 + (str53 == null ? 0 : str53.hashCode())) * 31;
        Integer num8 = this.universityGroupId;
        int iHashCode99 = (iHashCode98 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.faculty;
        int iHashCode100 = (iHashCode99 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str54 = this.facultyName;
        int iHashCode101 = (iHashCode100 + (str54 == null ? 0 : str54.hashCode())) * 31;
        Integer num10 = this.graduation;
        int iHashCode102 = (iHashCode101 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str55 = this.educationForm;
        int iHashCode103 = (iHashCode102 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.educationStatus;
        int iHashCode104 = (iHashCode103 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.homeTown;
        int iHashCode105 = (iHashCode104 + (str57 == null ? 0 : str57.hashCode())) * 31;
        UsersUserRelation usersUserRelation = this.relation;
        int iHashCode106 = (iHashCode105 + (usersUserRelation == null ? 0 : usersUserRelation.hashCode())) * 31;
        UsersUserMin usersUserMin = this.relationPartner;
        int iHashCode107 = (iHashCode106 + (usersUserMin == null ? 0 : usersUserMin.hashCode())) * 31;
        UsersPersonal usersPersonal = this.personal;
        int iHashCode108 = (iHashCode107 + (usersPersonal == null ? 0 : usersPersonal.hashCode())) * 31;
        List<UsersUniversity> list3 = this.universities;
        int iHashCode109 = (iHashCode108 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UsersSchool> list4 = this.schools;
        int iHashCode110 = (iHashCode109 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UsersRelative> list5 = this.relatives;
        int iHashCode111 = (iHashCode110 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool7 = this.isSubscribedPodcasts;
        int iHashCode112 = (iHashCode111 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.canSubscribePodcasts;
        int iHashCode113 = (iHashCode112 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canSubscribePosts;
        int iHashCode114 = (iHashCode113 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        UsersUserCounters usersUserCounters = this.counters;
        int iHashCode115 = (iHashCode114 + (usersUserCounters == null ? 0 : usersUserCounters.hashCode())) * 31;
        String str58 = this.accessKey;
        int iHashCode116 = (iHashCode115 + (str58 == null ? 0 : str58.hashCode())) * 31;
        BaseBoolInt baseBoolInt17 = this.canUploadDoc;
        int iHashCode117 = (iHashCode116 + (baseBoolInt17 == null ? 0 : baseBoolInt17.hashCode())) * 31;
        String str59 = this.hash;
        int iHashCode118 = (iHashCode117 + (str59 == null ? 0 : str59.hashCode())) * 31;
        Boolean bool10 = this.isNoIndex;
        int iHashCode119 = (iHashCode118 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Integer num11 = this.contactId;
        int iHashCode120 = (iHashCode119 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool11 = this.isMessageRequest;
        int iHashCode121 = (iHashCode120 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        List<String> list6 = this.descriptions;
        int iHashCode122 = (iHashCode121 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<Integer> list7 = this.lists;
        int iHashCode123 = (iHashCode122 + (list7 == null ? 0 : list7.hashCode())) * 31;
        BaseSex baseSex = this.sex;
        int iHashCode124 = (iHashCode123 + (baseSex == null ? 0 : baseSex.hashCode())) * 31;
        String str60 = this.screenName;
        int iHashCode125 = (iHashCode124 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.photo50;
        int iHashCode126 = (iHashCode125 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.photo100;
        int iHashCode127 = (iHashCode126 + (str62 == null ? 0 : str62.hashCode())) * 31;
        UsersOnlineInfo usersOnlineInfo = this.onlineInfo;
        int iHashCode128 = (iHashCode127 + (usersOnlineInfo == null ? 0 : usersOnlineInfo.hashCode())) * 31;
        BaseBoolInt baseBoolInt18 = this.online;
        int iHashCode129 = (iHashCode128 + (baseBoolInt18 == null ? 0 : baseBoolInt18.hashCode())) * 31;
        BaseBoolInt baseBoolInt19 = this.onlineMobile;
        int iHashCode130 = (iHashCode129 + (baseBoolInt19 == null ? 0 : baseBoolInt19.hashCode())) * 31;
        Integer num12 = this.onlineApp;
        int iHashCode131 = (iHashCode130 + (num12 == null ? 0 : num12.hashCode())) * 31;
        BaseBoolInt baseBoolInt20 = this.verified;
        int iHashCode132 = (iHashCode131 + (baseBoolInt20 == null ? 0 : baseBoolInt20.hashCode())) * 31;
        BaseBoolInt baseBoolInt21 = this.trending;
        int iHashCode133 = (iHashCode132 + (baseBoolInt21 == null ? 0 : baseBoolInt21.hashCode())) * 31;
        FriendsFriendStatusStatus friendsFriendStatusStatus = this.friendStatus;
        int iHashCode134 = (iHashCode133 + (friendsFriendStatusStatus == null ? 0 : friendsFriendStatusStatus.hashCode())) * 31;
        FriendsRequestsMutual friendsRequestsMutual = this.mutual;
        int iHashCode135 = (iHashCode134 + (friendsRequestsMutual == null ? 0 : friendsRequestsMutual.hashCode())) * 31;
        String str63 = this.deactivated;
        int iHashCode136 = (iHashCode135 + (str63 == null ? 0 : str63.hashCode())) * 31;
        String str64 = this.firstName;
        int iHashCode137 = (iHashCode136 + (str64 == null ? 0 : str64.hashCode())) * 31;
        Integer num13 = this.hidden;
        int iHashCode138 = (iHashCode137 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str65 = this.lastName;
        int iHashCode139 = (iHashCode138 + (str65 == null ? 0 : str65.hashCode())) * 31;
        Boolean bool12 = this.canAccessClosed;
        int iHashCode140 = (iHashCode139 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.isClosed;
        return iHashCode140 + (bool13 != null ? bool13.hashCode() : 0);
    }

    @Nullable
    public final Boolean isClosed() {
        return this.isClosed;
    }

    @Nullable
    public final BaseBoolInt isFavorite() {
        return this.isFavorite;
    }

    @Nullable
    public final BaseBoolInt isFriend() {
        return this.isFriend;
    }

    @Nullable
    public final BaseBoolInt isHiddenFromFeed() {
        return this.isHiddenFromFeed;
    }

    @Nullable
    public final Boolean isMessageRequest() {
        return this.isMessageRequest;
    }

    @Nullable
    public final Boolean isNoIndex() {
        return this.isNoIndex;
    }

    @Nullable
    public final Boolean isService() {
        return this.isService;
    }

    @Nullable
    public final Boolean isSubscribedPodcasts() {
        return this.isSubscribedPodcasts;
    }

    @Nullable
    public final BaseBoolInt isVideoLiveNotificationsBlocked() {
        return this.isVideoLiveNotificationsBlocked;
    }

    @NotNull
    public String toString() {
        UserId userId = this.f15248id;
        String str = this.firstNameNom;
        String str2 = this.firstNameGen;
        String str3 = this.firstNameDat;
        String str4 = this.firstNameAcc;
        String str5 = this.firstNameIns;
        String str6 = this.firstNameAbl;
        String str7 = this.lastNameNom;
        String str8 = this.lastNameGen;
        String str9 = this.lastNameDat;
        String str10 = this.lastNameAcc;
        String str11 = this.lastNameIns;
        String str12 = this.lastNameAbl;
        String str13 = this.nickname;
        String str14 = this.maidenName;
        String str15 = this.contactName;
        String str16 = this.domain;
        String str17 = this.bdate;
        BaseCity baseCity = this.city;
        BaseCountry baseCountry = this.country;
        Float f10 = this.timezone;
        OwnerState ownerState = this.ownerState;
        String str18 = this.photo200;
        String str19 = this.photoMax;
        String str20 = this.photo200Orig;
        String str21 = this.photo400Orig;
        String str22 = this.photoMaxOrig;
        String str23 = this.photoId;
        BaseBoolInt baseBoolInt = this.hasPhoto;
        BaseBoolInt baseBoolInt2 = this.hasMobile;
        BaseBoolInt baseBoolInt3 = this.isFriend;
        BaseBoolInt baseBoolInt4 = this.wallComments;
        BaseBoolInt baseBoolInt5 = this.canPost;
        BaseBoolInt baseBoolInt6 = this.canSeeAllPosts;
        BaseBoolInt baseBoolInt7 = this.canSeeAudio;
        UsersUserType usersUserType = this.type;
        String str24 = this.email;
        String str25 = this.skype;
        String str26 = this.facebook;
        String str27 = this.facebookName;
        String str28 = this.twitter;
        String str29 = this.livejournal;
        String str30 = this.instagram;
        BaseBoolInt baseBoolInt8 = this.test;
        VideoLiveInfo videoLiveInfo = this.videoLive;
        BaseBoolInt baseBoolInt9 = this.isVideoLiveNotificationsBlocked;
        Boolean bool = this.isService;
        String str31 = this.serviceDescription;
        String str32 = this.photoRec;
        String str33 = this.photoMedium;
        String str34 = this.photoMediumRec;
        String str35 = this.photo;
        String str36 = this.photoBig;
        String str37 = this.photo400;
        PhotosPhoto photosPhoto = this.photoMaxSize;
        String str38 = this.language;
        Integer num = this.storiesArchiveCount;
        Boolean bool2 = this.hasUnseenStories;
        WallDefault wallDefault = this.wallDefault;
        Boolean bool3 = this.canCall;
        Boolean bool4 = this.canCallFromGroup;
        Boolean bool5 = this.canSeeWishes;
        BaseBoolInt baseBoolInt10 = this.canSeeGifts;
        String str39 = this.interests;
        String str40 = this.books;
        String str41 = this.tv;
        String str42 = this.quotes;
        String str43 = this.about;
        String str44 = this.games;
        String str45 = this.movies;
        String str46 = this.activities;
        String str47 = this.music;
        BaseBoolInt baseBoolInt11 = this.canWritePrivateMessage;
        BaseBoolInt baseBoolInt12 = this.canSendFriendRequest;
        Boolean bool6 = this.canBeInvitedGroup;
        String str48 = this.mobilePhone;
        String str49 = this.homePhone;
        String str50 = this.site;
        AudioAudio audioAudio = this.statusAudio;
        String str51 = this.status;
        String str52 = this.activity;
        UsersLastSeen usersLastSeen = this.lastSeen;
        UsersExports usersExports = this.exports;
        BaseCropPhoto baseCropPhoto = this.cropPhoto;
        Integer num2 = this.followersCount;
        Integer num3 = this.videoLiveLevel;
        Integer num4 = this.videoLiveCount;
        Integer num5 = this.clipsCount;
        BaseBoolInt baseBoolInt13 = this.blacklisted;
        BaseBoolInt baseBoolInt14 = this.blacklistedByMe;
        BaseBoolInt baseBoolInt15 = this.isFavorite;
        BaseBoolInt baseBoolInt16 = this.isHiddenFromFeed;
        Integer num6 = this.commonCount;
        UsersOccupation usersOccupation = this.occupation;
        List<UsersCareer> list = this.career;
        List<UsersMilitary> list2 = this.military;
        Integer num7 = this.university;
        String str53 = this.universityName;
        Integer num8 = this.universityGroupId;
        Integer num9 = this.faculty;
        String str54 = this.facultyName;
        Integer num10 = this.graduation;
        String str55 = this.educationForm;
        String str56 = this.educationStatus;
        String str57 = this.homeTown;
        UsersUserRelation usersUserRelation = this.relation;
        UsersUserMin usersUserMin = this.relationPartner;
        UsersPersonal usersPersonal = this.personal;
        List<UsersUniversity> list3 = this.universities;
        List<UsersSchool> list4 = this.schools;
        List<UsersRelative> list5 = this.relatives;
        Boolean bool7 = this.isSubscribedPodcasts;
        Boolean bool8 = this.canSubscribePodcasts;
        Boolean bool9 = this.canSubscribePosts;
        UsersUserCounters usersUserCounters = this.counters;
        String str58 = this.accessKey;
        BaseBoolInt baseBoolInt17 = this.canUploadDoc;
        String str59 = this.hash;
        Boolean bool10 = this.isNoIndex;
        Integer num11 = this.contactId;
        Boolean bool11 = this.isMessageRequest;
        List<String> list6 = this.descriptions;
        List<Integer> list7 = this.lists;
        BaseSex baseSex = this.sex;
        String str60 = this.screenName;
        String str61 = this.photo50;
        String str62 = this.photo100;
        UsersOnlineInfo usersOnlineInfo = this.onlineInfo;
        BaseBoolInt baseBoolInt18 = this.online;
        BaseBoolInt baseBoolInt19 = this.onlineMobile;
        Integer num12 = this.onlineApp;
        BaseBoolInt baseBoolInt20 = this.verified;
        BaseBoolInt baseBoolInt21 = this.trending;
        FriendsFriendStatusStatus friendsFriendStatusStatus = this.friendStatus;
        FriendsRequestsMutual friendsRequestsMutual = this.mutual;
        String str63 = this.deactivated;
        String str64 = this.firstName;
        Integer num13 = this.hidden;
        String str65 = this.lastName;
        Boolean bool12 = this.canAccessClosed;
        Boolean bool13 = this.isClosed;
        StringBuilder sb2 = new StringBuilder("UsersUserFull(id=");
        sb2.append(userId);
        sb2.append(", firstNameNom=");
        sb2.append(str);
        sb2.append(", firstNameGen=");
        o.t(sb2, str2, ", firstNameDat=", str3, ", firstNameAcc=");
        o.t(sb2, str4, ", firstNameIns=", str5, ", firstNameAbl=");
        o.t(sb2, str6, ", lastNameNom=", str7, ", lastNameGen=");
        o.t(sb2, str8, ", lastNameDat=", str9, ", lastNameAcc=");
        o.t(sb2, str10, ", lastNameIns=", str11, ", lastNameAbl=");
        o.t(sb2, str12, ", nickname=", str13, ", maidenName=");
        o.t(sb2, str14, ", contactName=", str15, ", domain=");
        o.t(sb2, str16, ", bdate=", str17, ", city=");
        sb2.append(baseCity);
        sb2.append(", country=");
        sb2.append(baseCountry);
        sb2.append(", timezone=");
        sb2.append(f10);
        sb2.append(", ownerState=");
        sb2.append(ownerState);
        sb2.append(", photo200=");
        o.t(sb2, str18, ", photoMax=", str19, ", photo200Orig=");
        o.t(sb2, str20, ", photo400Orig=", str21, ", photoMaxOrig=");
        o.t(sb2, str22, ", photoId=", str23, ", hasPhoto=");
        a.s(sb2, baseBoolInt, ", hasMobile=", baseBoolInt2, ", isFriend=");
        a.s(sb2, baseBoolInt3, ", wallComments=", baseBoolInt4, ", canPost=");
        a.s(sb2, baseBoolInt5, ", canSeeAllPosts=", baseBoolInt6, ", canSeeAudio=");
        sb2.append(baseBoolInt7);
        sb2.append(", type=");
        sb2.append(usersUserType);
        sb2.append(", email=");
        o.t(sb2, str24, ", skype=", str25, ", facebook=");
        o.t(sb2, str26, ", facebookName=", str27, ", twitter=");
        o.t(sb2, str28, ", livejournal=", str29, ", instagram=");
        sb2.append(str30);
        sb2.append(", test=");
        sb2.append(baseBoolInt8);
        sb2.append(", videoLive=");
        sb2.append(videoLiveInfo);
        sb2.append(", isVideoLiveNotificationsBlocked=");
        sb2.append(baseBoolInt9);
        sb2.append(", isService=");
        sb2.append(bool);
        sb2.append(", serviceDescription=");
        sb2.append(str31);
        sb2.append(", photoRec=");
        o.t(sb2, str32, ", photoMedium=", str33, ", photoMediumRec=");
        o.t(sb2, str34, ", photo=", str35, ", photoBig=");
        o.t(sb2, str36, ", photo400=", str37, ", photoMaxSize=");
        sb2.append(photosPhoto);
        sb2.append(", language=");
        sb2.append(str38);
        sb2.append(", storiesArchiveCount=");
        sb2.append(num);
        sb2.append(", hasUnseenStories=");
        sb2.append(bool2);
        sb2.append(", wallDefault=");
        sb2.append(wallDefault);
        sb2.append(", canCall=");
        sb2.append(bool3);
        sb2.append(", canCallFromGroup=");
        u.s(sb2, bool4, ", canSeeWishes=", bool5, ", canSeeGifts=");
        sb2.append(baseBoolInt10);
        sb2.append(", interests=");
        sb2.append(str39);
        sb2.append(", books=");
        o.t(sb2, str40, ", tv=", str41, ", quotes=");
        o.t(sb2, str42, ", about=", str43, ", games=");
        o.t(sb2, str44, ", movies=", str45, ", activities=");
        o.t(sb2, str46, ", music=", str47, ", canWritePrivateMessage=");
        a.s(sb2, baseBoolInt11, ", canSendFriendRequest=", baseBoolInt12, ", canBeInvitedGroup=");
        sb2.append(bool6);
        sb2.append(", mobilePhone=");
        sb2.append(str48);
        sb2.append(", homePhone=");
        o.t(sb2, str49, ", site=", str50, ", statusAudio=");
        sb2.append(audioAudio);
        sb2.append(", status=");
        sb2.append(str51);
        sb2.append(", activity=");
        sb2.append(str52);
        sb2.append(", lastSeen=");
        sb2.append(usersLastSeen);
        sb2.append(", exports=");
        sb2.append(usersExports);
        sb2.append(", cropPhoto=");
        sb2.append(baseCropPhoto);
        sb2.append(", followersCount=");
        a.t(sb2, num2, ", videoLiveLevel=", num3, ", videoLiveCount=");
        a.t(sb2, num4, ", clipsCount=", num5, ", blacklisted=");
        a.s(sb2, baseBoolInt13, ", blacklistedByMe=", baseBoolInt14, ", isFavorite=");
        a.s(sb2, baseBoolInt15, ", isHiddenFromFeed=", baseBoolInt16, ", commonCount=");
        sb2.append(num6);
        sb2.append(", occupation=");
        sb2.append(usersOccupation);
        sb2.append(", career=");
        a.u(sb2, list, ", military=", list2, ", university=");
        pe.a.r(num7, ", universityName=", str53, ", universityGroupId=", sb2);
        a.t(sb2, num8, ", faculty=", num9, ", facultyName=");
        a.r(num10, str54, ", graduation=", ", educationForm=", sb2);
        o.t(sb2, str55, ", educationStatus=", str56, ", homeTown=");
        sb2.append(str57);
        sb2.append(", relation=");
        sb2.append(usersUserRelation);
        sb2.append(", relationPartner=");
        sb2.append(usersUserMin);
        sb2.append(", personal=");
        sb2.append(usersPersonal);
        sb2.append(", universities=");
        a.u(sb2, list3, ", schools=", list4, ", relatives=");
        sb2.append(list5);
        sb2.append(", isSubscribedPodcasts=");
        sb2.append(bool7);
        sb2.append(", canSubscribePodcasts=");
        u.s(sb2, bool8, ", canSubscribePosts=", bool9, ", counters=");
        sb2.append(usersUserCounters);
        sb2.append(", accessKey=");
        sb2.append(str58);
        sb2.append(", canUploadDoc=");
        sb2.append(baseBoolInt17);
        sb2.append(", hash=");
        sb2.append(str59);
        sb2.append(", isNoIndex=");
        sb2.append(bool10);
        sb2.append(", contactId=");
        sb2.append(num11);
        sb2.append(", isMessageRequest=");
        sb2.append(bool11);
        sb2.append(", descriptions=");
        sb2.append(list6);
        sb2.append(", lists=");
        sb2.append(list7);
        sb2.append(", sex=");
        sb2.append(baseSex);
        sb2.append(", screenName=");
        o.t(sb2, str60, ", photo50=", str61, ", photo100=");
        sb2.append(str62);
        sb2.append(", onlineInfo=");
        sb2.append(usersOnlineInfo);
        sb2.append(", online=");
        a.s(sb2, baseBoolInt18, ", onlineMobile=", baseBoolInt19, ", onlineApp=");
        sb2.append(num12);
        sb2.append(", verified=");
        sb2.append(baseBoolInt20);
        sb2.append(", trending=");
        sb2.append(baseBoolInt21);
        sb2.append(", friendStatus=");
        sb2.append(friendsFriendStatusStatus);
        sb2.append(", mutual=");
        sb2.append(friendsRequestsMutual);
        sb2.append(", deactivated=");
        sb2.append(str63);
        sb2.append(", firstName=");
        a.r(num13, str64, ", hidden=", ", lastName=", sb2);
        sb2.append(str65);
        sb2.append(", canAccessClosed=");
        sb2.append(bool12);
        sb2.append(", isClosed=");
        sb2.append(bool13);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UsersUserFull(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BaseCity baseCity, BaseCountry baseCountry, Float f10, OwnerState ownerState, String str18, String str19, String str20, String str21, String str22, String str23, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, BaseBoolInt baseBoolInt6, BaseBoolInt baseBoolInt7, UsersUserType usersUserType, String str24, String str25, String str26, String str27, String str28, String str29, String str30, BaseBoolInt baseBoolInt8, VideoLiveInfo videoLiveInfo, BaseBoolInt baseBoolInt9, Boolean bool, String str31, String str32, String str33, String str34, String str35, String str36, String str37, PhotosPhoto photosPhoto, String str38, Integer num, Boolean bool2, WallDefault wallDefault, Boolean bool3, Boolean bool4, Boolean bool5, BaseBoolInt baseBoolInt10, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, BaseBoolInt baseBoolInt11, BaseBoolInt baseBoolInt12, Boolean bool6, String str48, String str49, String str50, AudioAudio audioAudio, String str51, String str52, UsersLastSeen usersLastSeen, UsersExports usersExports, BaseCropPhoto baseCropPhoto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolInt baseBoolInt13, BaseBoolInt baseBoolInt14, BaseBoolInt baseBoolInt15, BaseBoolInt baseBoolInt16, Integer num6, UsersOccupation usersOccupation, List list, List list2, Integer num7, String str53, Integer num8, Integer num9, String str54, Integer num10, String str55, String str56, String str57, UsersUserRelation usersUserRelation, UsersUserMin usersUserMin, UsersPersonal usersPersonal, List list3, List list4, List list5, Boolean bool7, Boolean bool8, Boolean bool9, UsersUserCounters usersUserCounters, String str58, BaseBoolInt baseBoolInt17, String str59, Boolean bool10, Integer num11, Boolean bool11, List list6, List list7, BaseSex baseSex, String str60, String str61, String str62, UsersOnlineInfo usersOnlineInfo, BaseBoolInt baseBoolInt18, BaseBoolInt baseBoolInt19, Integer num12, BaseBoolInt baseBoolInt20, BaseBoolInt baseBoolInt21, FriendsFriendStatusStatus friendsFriendStatusStatus, FriendsRequestsMutual friendsRequestsMutual, String str63, String str64, Integer num13, String str65, Boolean bool12, Boolean bool13, int i, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bool14;
        BaseBoolInt baseBoolInt22;
        String str66;
        String str67;
        String str68;
        String str69;
        BaseBoolInt baseBoolInt23;
        VideoLiveInfo videoLiveInfo2;
        BaseBoolInt baseBoolInt24;
        Boolean bool15;
        String str70;
        BaseBoolInt baseBoolInt25;
        BaseBoolInt baseBoolInt26;
        Boolean bool16;
        String str71;
        String str72;
        String str73;
        AudioAudio audioAudio2;
        String str74;
        String str75;
        UsersUserRelation usersUserRelation2;
        UsersUserMin usersUserMin2;
        UsersPersonal usersPersonal2;
        List list8;
        List list9;
        List list10;
        String str76;
        String str77;
        Integer num14;
        Boolean bool17;
        String str78;
        List list11;
        UsersOnlineInfo usersOnlineInfo2;
        String str79;
        String str80;
        String str81;
        String str82;
        String str83;
        String str84;
        String str85;
        String str86;
        String str87;
        String str88;
        String str89;
        Boolean bool18;
        String str90;
        Boolean bool19;
        String str91;
        Boolean bool20;
        String str92;
        UsersUserCounters usersUserCounters2;
        BaseCity baseCity2;
        String str93;
        BaseCountry baseCountry2;
        BaseBoolInt baseBoolInt27;
        Float f11;
        String str94;
        OwnerState ownerState2;
        String str95;
        String str96;
        String str97;
        String str98;
        String str99;
        String str100;
        BaseBoolInt baseBoolInt28;
        BaseBoolInt baseBoolInt29;
        BaseBoolInt baseBoolInt30;
        BaseBoolInt baseBoolInt31;
        BaseBoolInt baseBoolInt32;
        UsersUserType usersUserType2;
        String str101;
        String str102;
        String str103;
        String str104;
        String str105;
        String str106;
        String str107;
        String str108;
        String str109;
        String str110;
        PhotosPhoto photosPhoto2;
        String str111;
        Integer num15;
        Boolean bool21;
        WallDefault wallDefault2;
        Boolean bool22;
        Boolean bool23;
        Boolean bool24;
        BaseBoolInt baseBoolInt33;
        String str112;
        String str113;
        String str114;
        String str115;
        String str116;
        String str117;
        String str118;
        String str119;
        String str120;
        UsersLastSeen usersLastSeen2;
        UsersExports usersExports2;
        BaseCropPhoto baseCropPhoto2;
        Integer num16;
        Integer num17;
        Integer num18;
        Integer num19;
        BaseBoolInt baseBoolInt34;
        BaseBoolInt baseBoolInt35;
        BaseBoolInt baseBoolInt36;
        BaseBoolInt baseBoolInt37;
        Integer num20;
        UsersOccupation usersOccupation2;
        List list12;
        Integer num21;
        String str121;
        Integer num22;
        Integer num23;
        String str122;
        Integer num24;
        String str123;
        Boolean bool25;
        Integer num25;
        Boolean bool26;
        List list13;
        List list14;
        BaseSex baseSex2;
        String str124;
        String str125;
        String str126;
        BaseBoolInt baseBoolInt38;
        BaseBoolInt baseBoolInt39;
        Integer num26;
        BaseBoolInt baseBoolInt40;
        BaseBoolInt baseBoolInt41;
        FriendsFriendStatusStatus friendsFriendStatusStatus2;
        FriendsRequestsMutual friendsRequestsMutual2;
        String str127;
        String str128;
        String str129;
        BaseBoolInt baseBoolInt42;
        String str130 = (i & 2) != 0 ? null : str;
        String str131 = (i & 4) != 0 ? null : str2;
        String str132 = (i & 8) != 0 ? null : str3;
        String str133 = (i & 16) != 0 ? null : str4;
        String str134 = (i & 32) != 0 ? null : str5;
        String str135 = (i & 64) != 0 ? null : str6;
        String str136 = (i & 128) != 0 ? null : str7;
        String str137 = (i & 256) != 0 ? null : str8;
        String str138 = (i & 512) != 0 ? null : str9;
        String str139 = (i & 1024) != 0 ? null : str10;
        String str140 = (i & 2048) != 0 ? null : str11;
        String str141 = str130;
        String str142 = (i & 4096) != 0 ? null : str12;
        String str143 = (i & 8192) != 0 ? null : str13;
        String str144 = (i & 16384) != 0 ? null : str14;
        String str145 = (i & 32768) != 0 ? null : str15;
        String str146 = (i & 65536) != 0 ? null : str16;
        String str147 = (i & 131072) != 0 ? null : str17;
        BaseCity baseCity3 = (i & 262144) != 0 ? null : baseCity;
        BaseCountry baseCountry3 = (i & 524288) != 0 ? null : baseCountry;
        Float f12 = (i & 1048576) != 0 ? null : f10;
        OwnerState ownerState3 = (i & 2097152) != 0 ? null : ownerState;
        String str148 = (i & 4194304) != 0 ? null : str18;
        String str149 = (i & 8388608) != 0 ? null : str19;
        String str150 = (i & 16777216) != 0 ? null : str20;
        String str151 = (i & 33554432) != 0 ? null : str21;
        String str152 = (i & 67108864) != 0 ? null : str22;
        String str153 = (i & 134217728) != 0 ? null : str23;
        BaseBoolInt baseBoolInt43 = (i & 268435456) != 0 ? null : baseBoolInt;
        BaseBoolInt baseBoolInt44 = (i & 536870912) != 0 ? null : baseBoolInt2;
        BaseBoolInt baseBoolInt45 = (i & 1073741824) != 0 ? null : baseBoolInt3;
        BaseBoolInt baseBoolInt46 = (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : baseBoolInt4;
        BaseBoolInt baseBoolInt47 = (i10 & 1) != 0 ? null : baseBoolInt5;
        BaseBoolInt baseBoolInt48 = (i10 & 2) != 0 ? null : baseBoolInt6;
        BaseBoolInt baseBoolInt49 = (i10 & 4) != 0 ? null : baseBoolInt7;
        UsersUserType usersUserType3 = (i10 & 8) != 0 ? null : usersUserType;
        String str154 = (i10 & 16) != 0 ? null : str24;
        String str155 = (i10 & 32) != 0 ? null : str25;
        String str156 = (i10 & 64) != 0 ? null : str26;
        BaseBoolInt baseBoolInt50 = baseBoolInt46;
        String str157 = (i10 & 128) != 0 ? null : str27;
        String str158 = (i10 & 256) != 0 ? null : str28;
        String str159 = (i10 & 512) != 0 ? null : str29;
        String str160 = (i10 & 1024) != 0 ? null : str30;
        BaseBoolInt baseBoolInt51 = (i10 & 2048) != 0 ? null : baseBoolInt8;
        VideoLiveInfo videoLiveInfo3 = (i10 & 4096) != 0 ? null : videoLiveInfo;
        BaseBoolInt baseBoolInt52 = (i10 & 8192) != 0 ? null : baseBoolInt9;
        Boolean bool27 = (i10 & 16384) != 0 ? null : bool;
        String str161 = (i10 & 32768) != 0 ? null : str31;
        String str162 = (i10 & 65536) != 0 ? null : str32;
        String str163 = (i10 & 131072) != 0 ? null : str33;
        String str164 = (i10 & 262144) != 0 ? null : str34;
        String str165 = (i10 & 524288) != 0 ? null : str35;
        String str166 = (i10 & 1048576) != 0 ? null : str36;
        String str167 = (i10 & 2097152) != 0 ? null : str37;
        PhotosPhoto photosPhoto3 = (i10 & 4194304) != 0 ? null : photosPhoto;
        String str168 = (i10 & 8388608) != 0 ? null : str38;
        Integer num27 = (i10 & 16777216) != 0 ? null : num;
        Boolean bool28 = (i10 & 33554432) != 0 ? null : bool2;
        WallDefault wallDefault3 = (i10 & 67108864) != 0 ? null : wallDefault;
        Boolean bool29 = (i10 & 134217728) != 0 ? null : bool3;
        Boolean bool30 = (i10 & 268435456) != 0 ? null : bool4;
        Boolean bool31 = (i10 & 536870912) != 0 ? null : bool5;
        BaseBoolInt baseBoolInt53 = (i10 & 1073741824) != 0 ? null : baseBoolInt10;
        String str169 = (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : str39;
        String str170 = (i11 & 1) != 0 ? null : str40;
        String str171 = (i11 & 2) != 0 ? null : str41;
        String str172 = (i11 & 4) != 0 ? null : str42;
        String str173 = (i11 & 8) != 0 ? null : str43;
        String str174 = (i11 & 16) != 0 ? null : str44;
        String str175 = (i11 & 32) != 0 ? null : str45;
        String str176 = (i11 & 64) != 0 ? null : str46;
        Boolean bool32 = bool27;
        String str177 = (i11 & 128) != 0 ? null : str47;
        BaseBoolInt baseBoolInt54 = (i11 & 256) != 0 ? null : baseBoolInt11;
        BaseBoolInt baseBoolInt55 = (i11 & 512) != 0 ? null : baseBoolInt12;
        Boolean bool33 = (i11 & 1024) != 0 ? null : bool6;
        String str178 = (i11 & 2048) != 0 ? null : str48;
        String str179 = (i11 & 4096) != 0 ? null : str49;
        String str180 = (i11 & 8192) != 0 ? null : str50;
        AudioAudio audioAudio3 = (i11 & 16384) != 0 ? null : audioAudio;
        String str181 = (i11 & 32768) != 0 ? null : str51;
        String str182 = (i11 & 65536) != 0 ? null : str52;
        UsersLastSeen usersLastSeen3 = (i11 & 131072) != 0 ? null : usersLastSeen;
        UsersExports usersExports3 = (i11 & 262144) != 0 ? null : usersExports;
        BaseCropPhoto baseCropPhoto3 = (i11 & 524288) != 0 ? null : baseCropPhoto;
        Integer num28 = (i11 & 1048576) != 0 ? null : num2;
        Integer num29 = (i11 & 2097152) != 0 ? null : num3;
        Integer num30 = (i11 & 4194304) != 0 ? null : num4;
        Integer num31 = (i11 & 8388608) != 0 ? null : num5;
        BaseBoolInt baseBoolInt56 = (i11 & 16777216) != 0 ? null : baseBoolInt13;
        BaseBoolInt baseBoolInt57 = (i11 & 33554432) != 0 ? null : baseBoolInt14;
        BaseBoolInt baseBoolInt58 = (i11 & 67108864) != 0 ? null : baseBoolInt15;
        BaseBoolInt baseBoolInt59 = (i11 & 134217728) != 0 ? null : baseBoolInt16;
        Integer num32 = (i11 & 268435456) != 0 ? null : num6;
        UsersOccupation usersOccupation3 = (i11 & 536870912) != 0 ? null : usersOccupation;
        List list15 = (i11 & 1073741824) != 0 ? null : list;
        List list16 = (i11 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : list2;
        Integer num33 = (i12 & 1) != 0 ? null : num7;
        String str183 = (i12 & 2) != 0 ? null : str53;
        Integer num34 = (i12 & 4) != 0 ? null : num8;
        Integer num35 = (i12 & 8) != 0 ? null : num9;
        String str184 = (i12 & 16) != 0 ? null : str54;
        Integer num36 = (i12 & 32) != 0 ? null : num10;
        String str185 = (i12 & 64) != 0 ? null : str55;
        AudioAudio audioAudio4 = audioAudio3;
        String str186 = (i12 & 128) != 0 ? null : str56;
        String str187 = (i12 & 256) != 0 ? null : str57;
        UsersUserRelation usersUserRelation3 = (i12 & 512) != 0 ? null : usersUserRelation;
        UsersUserMin usersUserMin3 = (i12 & 1024) != 0 ? null : usersUserMin;
        UsersPersonal usersPersonal3 = (i12 & 2048) != 0 ? null : usersPersonal;
        List list17 = (i12 & 4096) != 0 ? null : list3;
        List list18 = (i12 & 8192) != 0 ? null : list4;
        List list19 = (i12 & 16384) != 0 ? null : list5;
        Boolean bool34 = (i12 & 32768) != 0 ? null : bool7;
        Boolean bool35 = (i12 & 65536) != 0 ? null : bool8;
        Boolean bool36 = (i12 & 131072) != 0 ? null : bool9;
        UsersUserCounters usersUserCounters3 = (i12 & 262144) != 0 ? null : usersUserCounters;
        String str188 = (i12 & 524288) != 0 ? null : str58;
        BaseBoolInt baseBoolInt60 = (i12 & 1048576) != 0 ? null : baseBoolInt17;
        String str189 = (i12 & 2097152) != 0 ? null : str59;
        Boolean bool37 = (i12 & 4194304) != 0 ? null : bool10;
        Integer num37 = (i12 & 8388608) != 0 ? null : num11;
        Boolean bool38 = (i12 & 16777216) != 0 ? null : bool11;
        List list20 = (i12 & 33554432) != 0 ? null : list6;
        List list21 = (i12 & 67108864) != 0 ? null : list7;
        BaseSex baseSex3 = (i12 & 134217728) != 0 ? null : baseSex;
        String str190 = (i12 & 268435456) != 0 ? null : str60;
        String str191 = (i12 & 536870912) != 0 ? null : str61;
        String str192 = (i12 & 1073741824) != 0 ? null : str62;
        UsersOnlineInfo usersOnlineInfo3 = (i12 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : usersOnlineInfo;
        BaseBoolInt baseBoolInt61 = (i13 & 1) != 0 ? null : baseBoolInt18;
        BaseBoolInt baseBoolInt62 = (i13 & 2) != 0 ? null : baseBoolInt19;
        Integer num38 = (i13 & 4) != 0 ? null : num12;
        BaseBoolInt baseBoolInt63 = (i13 & 8) != 0 ? null : baseBoolInt20;
        BaseBoolInt baseBoolInt64 = (i13 & 16) != 0 ? null : baseBoolInt21;
        FriendsFriendStatusStatus friendsFriendStatusStatus3 = (i13 & 32) != 0 ? null : friendsFriendStatusStatus;
        FriendsRequestsMutual friendsRequestsMutual3 = (i13 & 64) != 0 ? null : friendsRequestsMutual;
        List list22 = list19;
        String str193 = (i13 & 128) != 0 ? null : str63;
        String str194 = (i13 & 256) != 0 ? null : str64;
        Integer num39 = (i13 & 512) != 0 ? null : num13;
        String str195 = (i13 & 1024) != 0 ? null : str65;
        Boolean bool39 = (i13 & 2048) != 0 ? null : bool12;
        if ((i13 & 4096) != 0) {
            bool14 = null;
            baseBoolInt22 = baseBoolInt50;
            str66 = str157;
            str67 = str158;
            str68 = str159;
            str69 = str160;
            baseBoolInt23 = baseBoolInt51;
            videoLiveInfo2 = videoLiveInfo3;
            baseBoolInt24 = baseBoolInt52;
            bool15 = bool32;
            str70 = str177;
            baseBoolInt25 = baseBoolInt54;
            baseBoolInt26 = baseBoolInt55;
            bool16 = bool33;
            str71 = str178;
            str72 = str179;
            str73 = str180;
            audioAudio2 = audioAudio4;
            str74 = str186;
            str75 = str187;
            usersUserRelation2 = usersUserRelation3;
            usersUserMin2 = usersUserMin3;
            usersPersonal2 = usersPersonal3;
            list8 = list17;
            list9 = list18;
            list10 = list22;
            str76 = str193;
            str77 = str194;
            num14 = num39;
            str129 = str195;
            bool17 = bool39;
            str78 = str169;
            list11 = list16;
            usersOnlineInfo2 = usersOnlineInfo3;
            str79 = str144;
            str80 = str140;
            str81 = str131;
            str82 = str132;
            str83 = str133;
            str84 = str134;
            str85 = str135;
            str86 = str136;
            str87 = str137;
            str88 = str138;
            str89 = str139;
            bool18 = bool34;
            str90 = str145;
            bool19 = bool35;
            str91 = str146;
            bool20 = bool36;
            str92 = str147;
            usersUserCounters2 = usersUserCounters3;
            baseCity2 = baseCity3;
            str93 = str188;
            baseCountry2 = baseCountry3;
            baseBoolInt27 = baseBoolInt60;
            f11 = f12;
            str94 = str189;
            ownerState2 = ownerState3;
            str95 = str148;
            str96 = str149;
            str97 = str150;
            str98 = str151;
            str99 = str152;
            str100 = str153;
            baseBoolInt28 = baseBoolInt43;
            baseBoolInt29 = baseBoolInt44;
            baseBoolInt42 = baseBoolInt45;
            baseBoolInt30 = baseBoolInt47;
            baseBoolInt31 = baseBoolInt48;
            baseBoolInt32 = baseBoolInt49;
            usersUserType2 = usersUserType3;
            str101 = str154;
            str102 = str155;
            str103 = str156;
            str104 = str161;
            str105 = str162;
            str106 = str163;
            str107 = str164;
            str108 = str165;
            str109 = str166;
            str110 = str167;
            photosPhoto2 = photosPhoto3;
            str111 = str168;
            num15 = num27;
            bool21 = bool28;
            wallDefault2 = wallDefault3;
            bool22 = bool29;
            bool23 = bool30;
            bool24 = bool31;
            baseBoolInt33 = baseBoolInt53;
            str112 = str170;
            str113 = str171;
            str114 = str172;
            str115 = str173;
            str116 = str174;
            str117 = str175;
            str118 = str176;
            str119 = str181;
            str120 = str182;
            usersLastSeen2 = usersLastSeen3;
            usersExports2 = usersExports3;
            baseCropPhoto2 = baseCropPhoto3;
            num16 = num28;
            num17 = num29;
            num18 = num30;
            num19 = num31;
            baseBoolInt34 = baseBoolInt56;
            baseBoolInt35 = baseBoolInt57;
            baseBoolInt36 = baseBoolInt58;
            baseBoolInt37 = baseBoolInt59;
            num20 = num32;
            usersOccupation2 = usersOccupation3;
            list12 = list15;
            num21 = num33;
            str121 = str183;
            num22 = num34;
            num23 = num35;
            str122 = str184;
            num24 = num36;
            str123 = str185;
            bool25 = bool37;
            num25 = num37;
            bool26 = bool38;
            list13 = list20;
            list14 = list21;
            baseSex2 = baseSex3;
            str124 = str190;
            str125 = str191;
            str126 = str192;
            baseBoolInt38 = baseBoolInt61;
            baseBoolInt39 = baseBoolInt62;
            num26 = num38;
            baseBoolInt40 = baseBoolInt63;
            baseBoolInt41 = baseBoolInt64;
            friendsFriendStatusStatus2 = friendsFriendStatusStatus3;
            friendsRequestsMutual2 = friendsRequestsMutual3;
            str127 = str142;
            str128 = str143;
        } else {
            bool14 = bool13;
            baseBoolInt22 = baseBoolInt50;
            str66 = str157;
            str67 = str158;
            str68 = str159;
            str69 = str160;
            baseBoolInt23 = baseBoolInt51;
            videoLiveInfo2 = videoLiveInfo3;
            baseBoolInt24 = baseBoolInt52;
            bool15 = bool32;
            str70 = str177;
            baseBoolInt25 = baseBoolInt54;
            baseBoolInt26 = baseBoolInt55;
            bool16 = bool33;
            str71 = str178;
            str72 = str179;
            str73 = str180;
            audioAudio2 = audioAudio4;
            str74 = str186;
            str75 = str187;
            usersUserRelation2 = usersUserRelation3;
            usersUserMin2 = usersUserMin3;
            usersPersonal2 = usersPersonal3;
            list8 = list17;
            list9 = list18;
            list10 = list22;
            str76 = str193;
            str77 = str194;
            num14 = num39;
            bool17 = bool39;
            str78 = str169;
            list11 = list16;
            usersOnlineInfo2 = usersOnlineInfo3;
            str79 = str144;
            str80 = str140;
            str81 = str131;
            str82 = str132;
            str83 = str133;
            str84 = str134;
            str85 = str135;
            str86 = str136;
            str87 = str137;
            str88 = str138;
            str89 = str139;
            bool18 = bool34;
            str90 = str145;
            bool19 = bool35;
            str91 = str146;
            bool20 = bool36;
            str92 = str147;
            usersUserCounters2 = usersUserCounters3;
            baseCity2 = baseCity3;
            str93 = str188;
            baseCountry2 = baseCountry3;
            baseBoolInt27 = baseBoolInt60;
            f11 = f12;
            str94 = str189;
            ownerState2 = ownerState3;
            str95 = str148;
            str96 = str149;
            str97 = str150;
            str98 = str151;
            str99 = str152;
            str100 = str153;
            baseBoolInt28 = baseBoolInt43;
            baseBoolInt29 = baseBoolInt44;
            baseBoolInt30 = baseBoolInt47;
            baseBoolInt31 = baseBoolInt48;
            baseBoolInt32 = baseBoolInt49;
            usersUserType2 = usersUserType3;
            str101 = str154;
            str102 = str155;
            str103 = str156;
            str104 = str161;
            str105 = str162;
            str106 = str163;
            str107 = str164;
            str108 = str165;
            str109 = str166;
            str110 = str167;
            photosPhoto2 = photosPhoto3;
            str111 = str168;
            num15 = num27;
            bool21 = bool28;
            wallDefault2 = wallDefault3;
            bool22 = bool29;
            bool23 = bool30;
            bool24 = bool31;
            baseBoolInt33 = baseBoolInt53;
            str112 = str170;
            str113 = str171;
            str114 = str172;
            str115 = str173;
            str116 = str174;
            str117 = str175;
            str118 = str176;
            str119 = str181;
            str120 = str182;
            usersLastSeen2 = usersLastSeen3;
            usersExports2 = usersExports3;
            baseCropPhoto2 = baseCropPhoto3;
            num16 = num28;
            num17 = num29;
            num18 = num30;
            num19 = num31;
            baseBoolInt34 = baseBoolInt56;
            baseBoolInt35 = baseBoolInt57;
            baseBoolInt36 = baseBoolInt58;
            baseBoolInt37 = baseBoolInt59;
            num20 = num32;
            usersOccupation2 = usersOccupation3;
            list12 = list15;
            num21 = num33;
            str121 = str183;
            num22 = num34;
            num23 = num35;
            str122 = str184;
            num24 = num36;
            str123 = str185;
            bool25 = bool37;
            num25 = num37;
            bool26 = bool38;
            list13 = list20;
            list14 = list21;
            baseSex2 = baseSex3;
            str124 = str190;
            str125 = str191;
            str126 = str192;
            baseBoolInt38 = baseBoolInt61;
            baseBoolInt39 = baseBoolInt62;
            num26 = num38;
            baseBoolInt40 = baseBoolInt63;
            baseBoolInt41 = baseBoolInt64;
            friendsFriendStatusStatus2 = friendsFriendStatusStatus3;
            friendsRequestsMutual2 = friendsRequestsMutual3;
            str127 = str142;
            str128 = str143;
            str129 = str195;
            baseBoolInt42 = baseBoolInt45;
        }
        this(userId, str141, str81, str82, str83, str84, str85, str86, str87, str88, str89, str80, str127, str128, str79, str90, str91, str92, baseCity2, baseCountry2, f11, ownerState2, str95, str96, str97, str98, str99, str100, baseBoolInt28, baseBoolInt29, baseBoolInt42, baseBoolInt22, baseBoolInt30, baseBoolInt31, baseBoolInt32, usersUserType2, str101, str102, str103, str66, str67, str68, str69, baseBoolInt23, videoLiveInfo2, baseBoolInt24, bool15, str104, str105, str106, str107, str108, str109, str110, photosPhoto2, str111, num15, bool21, wallDefault2, bool22, bool23, bool24, baseBoolInt33, str78, str112, str113, str114, str115, str116, str117, str118, str70, baseBoolInt25, baseBoolInt26, bool16, str71, str72, str73, audioAudio2, str119, str120, usersLastSeen2, usersExports2, baseCropPhoto2, num16, num17, num18, num19, baseBoolInt34, baseBoolInt35, baseBoolInt36, baseBoolInt37, num20, usersOccupation2, list12, list11, num21, str121, num22, num23, str122, num24, str123, str74, str75, usersUserRelation2, usersUserMin2, usersPersonal2, list8, list9, list10, bool18, bool19, bool20, usersUserCounters2, str93, baseBoolInt27, str94, bool25, num25, bool26, list13, list14, baseSex2, str124, str125, str126, usersOnlineInfo2, baseBoolInt38, baseBoolInt39, num26, baseBoolInt40, baseBoolInt41, friendsFriendStatusStatus2, friendsRequestsMutual2, str76, str77, num14, str129, bool17, bool14);
    }
}
