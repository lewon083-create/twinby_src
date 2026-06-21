package com.vk.sdk.api.friends.dto;

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
import com.vk.sdk.api.owner.dto.OwnerState;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.users.dto.UsersCareer;
import com.vk.sdk.api.users.dto.UsersExports;
import com.vk.sdk.api.users.dto.UsersLastSeen;
import com.vk.sdk.api.users.dto.UsersMilitary;
import com.vk.sdk.api.users.dto.UsersOccupation;
import com.vk.sdk.api.users.dto.UsersOnlineInfo;
import com.vk.sdk.api.users.dto.UsersPersonal;
import com.vk.sdk.api.users.dto.UsersRelative;
import com.vk.sdk.api.users.dto.UsersSchool;
import com.vk.sdk.api.users.dto.UsersUniversity;
import com.vk.sdk.api.users.dto.UsersUserCounters;
import com.vk.sdk.api.users.dto.UsersUserMin;
import com.vk.sdk.api.users.dto.UsersUserRelation;
import com.vk.sdk.api.users.dto.UsersUserType;
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
public final class FriendsUserXtrPhone {

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
    private final UserId f15169id;

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

    @b("phone")
    @Nullable
    private final String phone;

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

    public FriendsUserXtrPhone(@NotNull UserId id2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable BaseCity baseCity, @Nullable BaseCountry baseCountry, @Nullable Float f10, @Nullable OwnerState ownerState, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable UsersUserType usersUserType, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable BaseBoolInt baseBoolInt8, @Nullable VideoLiveInfo videoLiveInfo, @Nullable BaseBoolInt baseBoolInt9, @Nullable Boolean bool, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable PhotosPhoto photosPhoto, @Nullable String str39, @Nullable Integer num, @Nullable Boolean bool2, @Nullable WallDefault wallDefault, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable BaseBoolInt baseBoolInt10, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable Boolean bool6, @Nullable String str49, @Nullable String str50, @Nullable String str51, @Nullable AudioAudio audioAudio, @Nullable String str52, @Nullable String str53, @Nullable UsersLastSeen usersLastSeen, @Nullable UsersExports usersExports, @Nullable BaseCropPhoto baseCropPhoto, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable BaseBoolInt baseBoolInt13, @Nullable BaseBoolInt baseBoolInt14, @Nullable BaseBoolInt baseBoolInt15, @Nullable BaseBoolInt baseBoolInt16, @Nullable Integer num6, @Nullable UsersOccupation usersOccupation, @Nullable List<UsersCareer> list, @Nullable List<UsersMilitary> list2, @Nullable Integer num7, @Nullable String str54, @Nullable Integer num8, @Nullable Integer num9, @Nullable String str55, @Nullable Integer num10, @Nullable String str56, @Nullable String str57, @Nullable String str58, @Nullable UsersUserRelation usersUserRelation, @Nullable UsersUserMin usersUserMin, @Nullable UsersPersonal usersPersonal, @Nullable List<UsersUniversity> list3, @Nullable List<UsersSchool> list4, @Nullable List<UsersRelative> list5, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable UsersUserCounters usersUserCounters, @Nullable String str59, @Nullable BaseBoolInt baseBoolInt17, @Nullable String str60, @Nullable Boolean bool10, @Nullable Integer num11, @Nullable Boolean bool11, @Nullable List<String> list6, @Nullable List<Integer> list7, @Nullable BaseSex baseSex, @Nullable String str61, @Nullable String str62, @Nullable String str63, @Nullable UsersOnlineInfo usersOnlineInfo, @Nullable BaseBoolInt baseBoolInt18, @Nullable BaseBoolInt baseBoolInt19, @Nullable Integer num12, @Nullable BaseBoolInt baseBoolInt20, @Nullable BaseBoolInt baseBoolInt21, @Nullable FriendsFriendStatusStatus friendsFriendStatusStatus, @Nullable FriendsRequestsMutual friendsRequestsMutual, @Nullable String str64, @Nullable String str65, @Nullable Integer num13, @Nullable String str66, @Nullable Boolean bool12, @Nullable Boolean bool13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f15169id = id2;
        this.phone = str;
        this.firstNameNom = str2;
        this.firstNameGen = str3;
        this.firstNameDat = str4;
        this.firstNameAcc = str5;
        this.firstNameIns = str6;
        this.firstNameAbl = str7;
        this.lastNameNom = str8;
        this.lastNameGen = str9;
        this.lastNameDat = str10;
        this.lastNameAcc = str11;
        this.lastNameIns = str12;
        this.lastNameAbl = str13;
        this.nickname = str14;
        this.maidenName = str15;
        this.contactName = str16;
        this.domain = str17;
        this.bdate = str18;
        this.city = baseCity;
        this.country = baseCountry;
        this.timezone = f10;
        this.ownerState = ownerState;
        this.photo200 = str19;
        this.photoMax = str20;
        this.photo200Orig = str21;
        this.photo400Orig = str22;
        this.photoMaxOrig = str23;
        this.photoId = str24;
        this.hasPhoto = baseBoolInt;
        this.hasMobile = baseBoolInt2;
        this.isFriend = baseBoolInt3;
        this.wallComments = baseBoolInt4;
        this.canPost = baseBoolInt5;
        this.canSeeAllPosts = baseBoolInt6;
        this.canSeeAudio = baseBoolInt7;
        this.type = usersUserType;
        this.email = str25;
        this.skype = str26;
        this.facebook = str27;
        this.facebookName = str28;
        this.twitter = str29;
        this.livejournal = str30;
        this.instagram = str31;
        this.test = baseBoolInt8;
        this.videoLive = videoLiveInfo;
        this.isVideoLiveNotificationsBlocked = baseBoolInt9;
        this.isService = bool;
        this.serviceDescription = str32;
        this.photoRec = str33;
        this.photoMedium = str34;
        this.photoMediumRec = str35;
        this.photo = str36;
        this.photoBig = str37;
        this.photo400 = str38;
        this.photoMaxSize = photosPhoto;
        this.language = str39;
        this.storiesArchiveCount = num;
        this.hasUnseenStories = bool2;
        this.wallDefault = wallDefault;
        this.canCall = bool3;
        this.canCallFromGroup = bool4;
        this.canSeeWishes = bool5;
        this.canSeeGifts = baseBoolInt10;
        this.interests = str40;
        this.books = str41;
        this.tv = str42;
        this.quotes = str43;
        this.about = str44;
        this.games = str45;
        this.movies = str46;
        this.activities = str47;
        this.music = str48;
        this.canWritePrivateMessage = baseBoolInt11;
        this.canSendFriendRequest = baseBoolInt12;
        this.canBeInvitedGroup = bool6;
        this.mobilePhone = str49;
        this.homePhone = str50;
        this.site = str51;
        this.statusAudio = audioAudio;
        this.status = str52;
        this.activity = str53;
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
        this.universityName = str54;
        this.universityGroupId = num8;
        this.faculty = num9;
        this.facultyName = str55;
        this.graduation = num10;
        this.educationForm = str56;
        this.educationStatus = str57;
        this.homeTown = str58;
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
        this.accessKey = str59;
        this.canUploadDoc = baseBoolInt17;
        this.hash = str60;
        this.isNoIndex = bool10;
        this.contactId = num11;
        this.isMessageRequest = bool11;
        this.descriptions = list6;
        this.lists = list7;
        this.sex = baseSex;
        this.screenName = str61;
        this.photo50 = str62;
        this.photo100 = str63;
        this.onlineInfo = usersOnlineInfo;
        this.online = baseBoolInt18;
        this.onlineMobile = baseBoolInt19;
        this.onlineApp = num12;
        this.verified = baseBoolInt20;
        this.trending = baseBoolInt21;
        this.friendStatus = friendsFriendStatusStatus;
        this.mutual = friendsRequestsMutual;
        this.deactivated = str64;
        this.firstName = str65;
        this.hidden = num13;
        this.lastName = str66;
        this.canAccessClosed = bool12;
        this.isClosed = bool13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendsUserXtrPhone copy$default(FriendsUserXtrPhone friendsUserXtrPhone, UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, BaseCity baseCity, BaseCountry baseCountry, Float f10, OwnerState ownerState, String str19, String str20, String str21, String str22, String str23, String str24, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, BaseBoolInt baseBoolInt6, BaseBoolInt baseBoolInt7, UsersUserType usersUserType, String str25, String str26, String str27, String str28, String str29, String str30, String str31, BaseBoolInt baseBoolInt8, VideoLiveInfo videoLiveInfo, BaseBoolInt baseBoolInt9, Boolean bool, String str32, String str33, String str34, String str35, String str36, String str37, String str38, PhotosPhoto photosPhoto, String str39, Integer num, Boolean bool2, WallDefault wallDefault, Boolean bool3, Boolean bool4, Boolean bool5, BaseBoolInt baseBoolInt10, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, BaseBoolInt baseBoolInt11, BaseBoolInt baseBoolInt12, Boolean bool6, String str49, String str50, String str51, AudioAudio audioAudio, String str52, String str53, UsersLastSeen usersLastSeen, UsersExports usersExports, BaseCropPhoto baseCropPhoto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolInt baseBoolInt13, BaseBoolInt baseBoolInt14, BaseBoolInt baseBoolInt15, BaseBoolInt baseBoolInt16, Integer num6, UsersOccupation usersOccupation, List list, List list2, Integer num7, String str54, Integer num8, Integer num9, String str55, Integer num10, String str56, String str57, String str58, UsersUserRelation usersUserRelation, UsersUserMin usersUserMin, UsersPersonal usersPersonal, List list3, List list4, List list5, Boolean bool7, Boolean bool8, Boolean bool9, UsersUserCounters usersUserCounters, String str59, BaseBoolInt baseBoolInt17, String str60, Boolean bool10, Integer num11, Boolean bool11, List list6, List list7, BaseSex baseSex, String str61, String str62, String str63, UsersOnlineInfo usersOnlineInfo, BaseBoolInt baseBoolInt18, BaseBoolInt baseBoolInt19, Integer num12, BaseBoolInt baseBoolInt20, BaseBoolInt baseBoolInt21, FriendsFriendStatusStatus friendsFriendStatusStatus, FriendsRequestsMutual friendsRequestsMutual, String str64, String str65, Integer num13, String str66, Boolean bool12, Boolean bool13, int i, int i10, int i11, int i12, int i13, Object obj) {
        UserId userId2 = (i & 1) != 0 ? friendsUserXtrPhone.f15169id : userId;
        String str67 = (i & 2) != 0 ? friendsUserXtrPhone.phone : str;
        String str68 = (i & 4) != 0 ? friendsUserXtrPhone.firstNameNom : str2;
        String str69 = (i & 8) != 0 ? friendsUserXtrPhone.firstNameGen : str3;
        String str70 = (i & 16) != 0 ? friendsUserXtrPhone.firstNameDat : str4;
        String str71 = (i & 32) != 0 ? friendsUserXtrPhone.firstNameAcc : str5;
        String str72 = (i & 64) != 0 ? friendsUserXtrPhone.firstNameIns : str6;
        String str73 = (i & 128) != 0 ? friendsUserXtrPhone.firstNameAbl : str7;
        String str74 = (i & 256) != 0 ? friendsUserXtrPhone.lastNameNom : str8;
        String str75 = (i & 512) != 0 ? friendsUserXtrPhone.lastNameGen : str9;
        UserId userId3 = userId2;
        String str76 = (i & 1024) != 0 ? friendsUserXtrPhone.lastNameDat : str10;
        String str77 = (i & 2048) != 0 ? friendsUserXtrPhone.lastNameAcc : str11;
        String str78 = (i & 4096) != 0 ? friendsUserXtrPhone.lastNameIns : str12;
        String str79 = (i & 8192) != 0 ? friendsUserXtrPhone.lastNameAbl : str13;
        String str80 = (i & 16384) != 0 ? friendsUserXtrPhone.nickname : str14;
        String str81 = (i & 32768) != 0 ? friendsUserXtrPhone.maidenName : str15;
        String str82 = (i & 65536) != 0 ? friendsUserXtrPhone.contactName : str16;
        String str83 = (i & 131072) != 0 ? friendsUserXtrPhone.domain : str17;
        String str84 = (i & 262144) != 0 ? friendsUserXtrPhone.bdate : str18;
        BaseCity baseCity2 = (i & 524288) != 0 ? friendsUserXtrPhone.city : baseCity;
        BaseCountry baseCountry2 = (i & 1048576) != 0 ? friendsUserXtrPhone.country : baseCountry;
        Float f11 = (i & 2097152) != 0 ? friendsUserXtrPhone.timezone : f10;
        OwnerState ownerState2 = (i & 4194304) != 0 ? friendsUserXtrPhone.ownerState : ownerState;
        String str85 = (i & 8388608) != 0 ? friendsUserXtrPhone.photo200 : str19;
        String str86 = (i & 16777216) != 0 ? friendsUserXtrPhone.photoMax : str20;
        String str87 = (i & 33554432) != 0 ? friendsUserXtrPhone.photo200Orig : str21;
        String str88 = (i & 67108864) != 0 ? friendsUserXtrPhone.photo400Orig : str22;
        String str89 = (i & 134217728) != 0 ? friendsUserXtrPhone.photoMaxOrig : str23;
        String str90 = (i & 268435456) != 0 ? friendsUserXtrPhone.photoId : str24;
        BaseBoolInt baseBoolInt22 = (i & 536870912) != 0 ? friendsUserXtrPhone.hasPhoto : baseBoolInt;
        BaseBoolInt baseBoolInt23 = (i & 1073741824) != 0 ? friendsUserXtrPhone.hasMobile : baseBoolInt2;
        BaseBoolInt baseBoolInt24 = (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? friendsUserXtrPhone.isFriend : baseBoolInt3;
        BaseBoolInt baseBoolInt25 = (i10 & 1) != 0 ? friendsUserXtrPhone.wallComments : baseBoolInt4;
        BaseBoolInt baseBoolInt26 = (i10 & 2) != 0 ? friendsUserXtrPhone.canPost : baseBoolInt5;
        BaseBoolInt baseBoolInt27 = (i10 & 4) != 0 ? friendsUserXtrPhone.canSeeAllPosts : baseBoolInt6;
        BaseBoolInt baseBoolInt28 = (i10 & 8) != 0 ? friendsUserXtrPhone.canSeeAudio : baseBoolInt7;
        UsersUserType usersUserType2 = (i10 & 16) != 0 ? friendsUserXtrPhone.type : usersUserType;
        String str91 = (i10 & 32) != 0 ? friendsUserXtrPhone.email : str25;
        String str92 = (i10 & 64) != 0 ? friendsUserXtrPhone.skype : str26;
        String str93 = (i10 & 128) != 0 ? friendsUserXtrPhone.facebook : str27;
        String str94 = (i10 & 256) != 0 ? friendsUserXtrPhone.facebookName : str28;
        String str95 = (i10 & 512) != 0 ? friendsUserXtrPhone.twitter : str29;
        String str96 = (i10 & 1024) != 0 ? friendsUserXtrPhone.livejournal : str30;
        String str97 = (i10 & 2048) != 0 ? friendsUserXtrPhone.instagram : str31;
        BaseBoolInt baseBoolInt29 = (i10 & 4096) != 0 ? friendsUserXtrPhone.test : baseBoolInt8;
        VideoLiveInfo videoLiveInfo2 = (i10 & 8192) != 0 ? friendsUserXtrPhone.videoLive : videoLiveInfo;
        BaseBoolInt baseBoolInt30 = (i10 & 16384) != 0 ? friendsUserXtrPhone.isVideoLiveNotificationsBlocked : baseBoolInt9;
        Boolean bool14 = (i10 & 32768) != 0 ? friendsUserXtrPhone.isService : bool;
        String str98 = (i10 & 65536) != 0 ? friendsUserXtrPhone.serviceDescription : str32;
        String str99 = (i10 & 131072) != 0 ? friendsUserXtrPhone.photoRec : str33;
        String str100 = (i10 & 262144) != 0 ? friendsUserXtrPhone.photoMedium : str34;
        String str101 = (i10 & 524288) != 0 ? friendsUserXtrPhone.photoMediumRec : str35;
        String str102 = (i10 & 1048576) != 0 ? friendsUserXtrPhone.photo : str36;
        String str103 = (i10 & 2097152) != 0 ? friendsUserXtrPhone.photoBig : str37;
        String str104 = (i10 & 4194304) != 0 ? friendsUserXtrPhone.photo400 : str38;
        PhotosPhoto photosPhoto2 = (i10 & 8388608) != 0 ? friendsUserXtrPhone.photoMaxSize : photosPhoto;
        String str105 = (i10 & 16777216) != 0 ? friendsUserXtrPhone.language : str39;
        Integer num14 = (i10 & 33554432) != 0 ? friendsUserXtrPhone.storiesArchiveCount : num;
        Boolean bool15 = (i10 & 67108864) != 0 ? friendsUserXtrPhone.hasUnseenStories : bool2;
        WallDefault wallDefault2 = (i10 & 134217728) != 0 ? friendsUserXtrPhone.wallDefault : wallDefault;
        Boolean bool16 = (i10 & 268435456) != 0 ? friendsUserXtrPhone.canCall : bool3;
        Boolean bool17 = (i10 & 536870912) != 0 ? friendsUserXtrPhone.canCallFromGroup : bool4;
        Boolean bool18 = (i10 & 1073741824) != 0 ? friendsUserXtrPhone.canSeeWishes : bool5;
        BaseBoolInt baseBoolInt31 = (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? friendsUserXtrPhone.canSeeGifts : baseBoolInt10;
        Boolean bool19 = bool18;
        String str106 = (i11 & 1) != 0 ? friendsUserXtrPhone.interests : str40;
        String str107 = (i11 & 2) != 0 ? friendsUserXtrPhone.books : str41;
        String str108 = (i11 & 4) != 0 ? friendsUserXtrPhone.tv : str42;
        String str109 = (i11 & 8) != 0 ? friendsUserXtrPhone.quotes : str43;
        String str110 = (i11 & 16) != 0 ? friendsUserXtrPhone.about : str44;
        String str111 = (i11 & 32) != 0 ? friendsUserXtrPhone.games : str45;
        String str112 = (i11 & 64) != 0 ? friendsUserXtrPhone.movies : str46;
        String str113 = (i11 & 128) != 0 ? friendsUserXtrPhone.activities : str47;
        String str114 = (i11 & 256) != 0 ? friendsUserXtrPhone.music : str48;
        BaseBoolInt baseBoolInt32 = (i11 & 512) != 0 ? friendsUserXtrPhone.canWritePrivateMessage : baseBoolInt11;
        BaseBoolInt baseBoolInt33 = (i11 & 1024) != 0 ? friendsUserXtrPhone.canSendFriendRequest : baseBoolInt12;
        Boolean bool20 = (i11 & 2048) != 0 ? friendsUserXtrPhone.canBeInvitedGroup : bool6;
        String str115 = (i11 & 4096) != 0 ? friendsUserXtrPhone.mobilePhone : str49;
        String str116 = (i11 & 8192) != 0 ? friendsUserXtrPhone.homePhone : str50;
        String str117 = (i11 & 16384) != 0 ? friendsUserXtrPhone.site : str51;
        AudioAudio audioAudio2 = (i11 & 32768) != 0 ? friendsUserXtrPhone.statusAudio : audioAudio;
        String str118 = (i11 & 65536) != 0 ? friendsUserXtrPhone.status : str52;
        String str119 = (i11 & 131072) != 0 ? friendsUserXtrPhone.activity : str53;
        UsersLastSeen usersLastSeen2 = (i11 & 262144) != 0 ? friendsUserXtrPhone.lastSeen : usersLastSeen;
        UsersExports usersExports2 = (i11 & 524288) != 0 ? friendsUserXtrPhone.exports : usersExports;
        BaseCropPhoto baseCropPhoto2 = (i11 & 1048576) != 0 ? friendsUserXtrPhone.cropPhoto : baseCropPhoto;
        Integer num15 = (i11 & 2097152) != 0 ? friendsUserXtrPhone.followersCount : num2;
        Integer num16 = (i11 & 4194304) != 0 ? friendsUserXtrPhone.videoLiveLevel : num3;
        Integer num17 = (i11 & 8388608) != 0 ? friendsUserXtrPhone.videoLiveCount : num4;
        Integer num18 = (i11 & 16777216) != 0 ? friendsUserXtrPhone.clipsCount : num5;
        BaseBoolInt baseBoolInt34 = (i11 & 33554432) != 0 ? friendsUserXtrPhone.blacklisted : baseBoolInt13;
        BaseBoolInt baseBoolInt35 = (i11 & 67108864) != 0 ? friendsUserXtrPhone.blacklistedByMe : baseBoolInt14;
        BaseBoolInt baseBoolInt36 = (i11 & 134217728) != 0 ? friendsUserXtrPhone.isFavorite : baseBoolInt15;
        BaseBoolInt baseBoolInt37 = (i11 & 268435456) != 0 ? friendsUserXtrPhone.isHiddenFromFeed : baseBoolInt16;
        Integer num19 = (i11 & 536870912) != 0 ? friendsUserXtrPhone.commonCount : num6;
        UsersOccupation usersOccupation2 = (i11 & 1073741824) != 0 ? friendsUserXtrPhone.occupation : usersOccupation;
        return friendsUserXtrPhone.copy(userId3, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, baseCity2, baseCountry2, f11, ownerState2, str85, str86, str87, str88, str89, str90, baseBoolInt22, baseBoolInt23, baseBoolInt24, baseBoolInt25, baseBoolInt26, baseBoolInt27, baseBoolInt28, usersUserType2, str91, str92, str93, str94, str95, str96, str97, baseBoolInt29, videoLiveInfo2, baseBoolInt30, bool14, str98, str99, str100, str101, str102, str103, str104, photosPhoto2, str105, num14, bool15, wallDefault2, bool16, bool17, bool19, baseBoolInt31, str106, str107, str108, str109, str110, str111, str112, str113, str114, baseBoolInt32, baseBoolInt33, bool20, str115, str116, str117, audioAudio2, str118, str119, usersLastSeen2, usersExports2, baseCropPhoto2, num15, num16, num17, num18, baseBoolInt34, baseBoolInt35, baseBoolInt36, baseBoolInt37, num19, usersOccupation2, (i11 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? friendsUserXtrPhone.career : list, (i12 & 1) != 0 ? friendsUserXtrPhone.military : list2, (i12 & 2) != 0 ? friendsUserXtrPhone.university : num7, (i12 & 4) != 0 ? friendsUserXtrPhone.universityName : str54, (i12 & 8) != 0 ? friendsUserXtrPhone.universityGroupId : num8, (i12 & 16) != 0 ? friendsUserXtrPhone.faculty : num9, (i12 & 32) != 0 ? friendsUserXtrPhone.facultyName : str55, (i12 & 64) != 0 ? friendsUserXtrPhone.graduation : num10, (i12 & 128) != 0 ? friendsUserXtrPhone.educationForm : str56, (i12 & 256) != 0 ? friendsUserXtrPhone.educationStatus : str57, (i12 & 512) != 0 ? friendsUserXtrPhone.homeTown : str58, (i12 & 1024) != 0 ? friendsUserXtrPhone.relation : usersUserRelation, (i12 & 2048) != 0 ? friendsUserXtrPhone.relationPartner : usersUserMin, (i12 & 4096) != 0 ? friendsUserXtrPhone.personal : usersPersonal, (i12 & 8192) != 0 ? friendsUserXtrPhone.universities : list3, (i12 & 16384) != 0 ? friendsUserXtrPhone.schools : list4, (i12 & 32768) != 0 ? friendsUserXtrPhone.relatives : list5, (i12 & 65536) != 0 ? friendsUserXtrPhone.isSubscribedPodcasts : bool7, (i12 & 131072) != 0 ? friendsUserXtrPhone.canSubscribePodcasts : bool8, (i12 & 262144) != 0 ? friendsUserXtrPhone.canSubscribePosts : bool9, (i12 & 524288) != 0 ? friendsUserXtrPhone.counters : usersUserCounters, (i12 & 1048576) != 0 ? friendsUserXtrPhone.accessKey : str59, (i12 & 2097152) != 0 ? friendsUserXtrPhone.canUploadDoc : baseBoolInt17, (i12 & 4194304) != 0 ? friendsUserXtrPhone.hash : str60, (i12 & 8388608) != 0 ? friendsUserXtrPhone.isNoIndex : bool10, (i12 & 16777216) != 0 ? friendsUserXtrPhone.contactId : num11, (i12 & 33554432) != 0 ? friendsUserXtrPhone.isMessageRequest : bool11, (i12 & 67108864) != 0 ? friendsUserXtrPhone.descriptions : list6, (i12 & 134217728) != 0 ? friendsUserXtrPhone.lists : list7, (i12 & 268435456) != 0 ? friendsUserXtrPhone.sex : baseSex, (i12 & 536870912) != 0 ? friendsUserXtrPhone.screenName : str61, (i12 & 1073741824) != 0 ? friendsUserXtrPhone.photo50 : str62, (i12 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? friendsUserXtrPhone.photo100 : str63, (i13 & 1) != 0 ? friendsUserXtrPhone.onlineInfo : usersOnlineInfo, (i13 & 2) != 0 ? friendsUserXtrPhone.online : baseBoolInt18, (i13 & 4) != 0 ? friendsUserXtrPhone.onlineMobile : baseBoolInt19, (i13 & 8) != 0 ? friendsUserXtrPhone.onlineApp : num12, (i13 & 16) != 0 ? friendsUserXtrPhone.verified : baseBoolInt20, (i13 & 32) != 0 ? friendsUserXtrPhone.trending : baseBoolInt21, (i13 & 64) != 0 ? friendsUserXtrPhone.friendStatus : friendsFriendStatusStatus, (i13 & 128) != 0 ? friendsUserXtrPhone.mutual : friendsRequestsMutual, (i13 & 256) != 0 ? friendsUserXtrPhone.deactivated : str64, (i13 & 512) != 0 ? friendsUserXtrPhone.firstName : str65, (i13 & 1024) != 0 ? friendsUserXtrPhone.hidden : num13, (i13 & 2048) != 0 ? friendsUserXtrPhone.lastName : str66, (i13 & 4096) != 0 ? friendsUserXtrPhone.canAccessClosed : bool12, (i13 & 8192) != 0 ? friendsUserXtrPhone.isClosed : bool13);
    }

    @NotNull
    public final UserId component1() {
        return this.f15169id;
    }

    @Nullable
    public final String component10() {
        return this.lastNameGen;
    }

    @Nullable
    public final Integer component100() {
        return this.universityGroupId;
    }

    @Nullable
    public final Integer component101() {
        return this.faculty;
    }

    @Nullable
    public final String component102() {
        return this.facultyName;
    }

    @Nullable
    public final Integer component103() {
        return this.graduation;
    }

    @Nullable
    public final String component104() {
        return this.educationForm;
    }

    @Nullable
    public final String component105() {
        return this.educationStatus;
    }

    @Nullable
    public final String component106() {
        return this.homeTown;
    }

    @Nullable
    public final UsersUserRelation component107() {
        return this.relation;
    }

    @Nullable
    public final UsersUserMin component108() {
        return this.relationPartner;
    }

    @Nullable
    public final UsersPersonal component109() {
        return this.personal;
    }

    @Nullable
    public final String component11() {
        return this.lastNameDat;
    }

    @Nullable
    public final List<UsersUniversity> component110() {
        return this.universities;
    }

    @Nullable
    public final List<UsersSchool> component111() {
        return this.schools;
    }

    @Nullable
    public final List<UsersRelative> component112() {
        return this.relatives;
    }

    @Nullable
    public final Boolean component113() {
        return this.isSubscribedPodcasts;
    }

    @Nullable
    public final Boolean component114() {
        return this.canSubscribePodcasts;
    }

    @Nullable
    public final Boolean component115() {
        return this.canSubscribePosts;
    }

    @Nullable
    public final UsersUserCounters component116() {
        return this.counters;
    }

    @Nullable
    public final String component117() {
        return this.accessKey;
    }

    @Nullable
    public final BaseBoolInt component118() {
        return this.canUploadDoc;
    }

    @Nullable
    public final String component119() {
        return this.hash;
    }

    @Nullable
    public final String component12() {
        return this.lastNameAcc;
    }

    @Nullable
    public final Boolean component120() {
        return this.isNoIndex;
    }

    @Nullable
    public final Integer component121() {
        return this.contactId;
    }

    @Nullable
    public final Boolean component122() {
        return this.isMessageRequest;
    }

    @Nullable
    public final List<String> component123() {
        return this.descriptions;
    }

    @Nullable
    public final List<Integer> component124() {
        return this.lists;
    }

    @Nullable
    public final BaseSex component125() {
        return this.sex;
    }

    @Nullable
    public final String component126() {
        return this.screenName;
    }

    @Nullable
    public final String component127() {
        return this.photo50;
    }

    @Nullable
    public final String component128() {
        return this.photo100;
    }

    @Nullable
    public final UsersOnlineInfo component129() {
        return this.onlineInfo;
    }

    @Nullable
    public final String component13() {
        return this.lastNameIns;
    }

    @Nullable
    public final BaseBoolInt component130() {
        return this.online;
    }

    @Nullable
    public final BaseBoolInt component131() {
        return this.onlineMobile;
    }

    @Nullable
    public final Integer component132() {
        return this.onlineApp;
    }

    @Nullable
    public final BaseBoolInt component133() {
        return this.verified;
    }

    @Nullable
    public final BaseBoolInt component134() {
        return this.trending;
    }

    @Nullable
    public final FriendsFriendStatusStatus component135() {
        return this.friendStatus;
    }

    @Nullable
    public final FriendsRequestsMutual component136() {
        return this.mutual;
    }

    @Nullable
    public final String component137() {
        return this.deactivated;
    }

    @Nullable
    public final String component138() {
        return this.firstName;
    }

    @Nullable
    public final Integer component139() {
        return this.hidden;
    }

    @Nullable
    public final String component14() {
        return this.lastNameAbl;
    }

    @Nullable
    public final String component140() {
        return this.lastName;
    }

    @Nullable
    public final Boolean component141() {
        return this.canAccessClosed;
    }

    @Nullable
    public final Boolean component142() {
        return this.isClosed;
    }

    @Nullable
    public final String component15() {
        return this.nickname;
    }

    @Nullable
    public final String component16() {
        return this.maidenName;
    }

    @Nullable
    public final String component17() {
        return this.contactName;
    }

    @Nullable
    public final String component18() {
        return this.domain;
    }

    @Nullable
    public final String component19() {
        return this.bdate;
    }

    @Nullable
    public final String component2() {
        return this.phone;
    }

    @Nullable
    public final BaseCity component20() {
        return this.city;
    }

    @Nullable
    public final BaseCountry component21() {
        return this.country;
    }

    @Nullable
    public final Float component22() {
        return this.timezone;
    }

    @Nullable
    public final OwnerState component23() {
        return this.ownerState;
    }

    @Nullable
    public final String component24() {
        return this.photo200;
    }

    @Nullable
    public final String component25() {
        return this.photoMax;
    }

    @Nullable
    public final String component26() {
        return this.photo200Orig;
    }

    @Nullable
    public final String component27() {
        return this.photo400Orig;
    }

    @Nullable
    public final String component28() {
        return this.photoMaxOrig;
    }

    @Nullable
    public final String component29() {
        return this.photoId;
    }

    @Nullable
    public final String component3() {
        return this.firstNameNom;
    }

    @Nullable
    public final BaseBoolInt component30() {
        return this.hasPhoto;
    }

    @Nullable
    public final BaseBoolInt component31() {
        return this.hasMobile;
    }

    @Nullable
    public final BaseBoolInt component32() {
        return this.isFriend;
    }

    @Nullable
    public final BaseBoolInt component33() {
        return this.wallComments;
    }

    @Nullable
    public final BaseBoolInt component34() {
        return this.canPost;
    }

    @Nullable
    public final BaseBoolInt component35() {
        return this.canSeeAllPosts;
    }

    @Nullable
    public final BaseBoolInt component36() {
        return this.canSeeAudio;
    }

    @Nullable
    public final UsersUserType component37() {
        return this.type;
    }

    @Nullable
    public final String component38() {
        return this.email;
    }

    @Nullable
    public final String component39() {
        return this.skype;
    }

    @Nullable
    public final String component4() {
        return this.firstNameGen;
    }

    @Nullable
    public final String component40() {
        return this.facebook;
    }

    @Nullable
    public final String component41() {
        return this.facebookName;
    }

    @Nullable
    public final String component42() {
        return this.twitter;
    }

    @Nullable
    public final String component43() {
        return this.livejournal;
    }

    @Nullable
    public final String component44() {
        return this.instagram;
    }

    @Nullable
    public final BaseBoolInt component45() {
        return this.test;
    }

    @Nullable
    public final VideoLiveInfo component46() {
        return this.videoLive;
    }

    @Nullable
    public final BaseBoolInt component47() {
        return this.isVideoLiveNotificationsBlocked;
    }

    @Nullable
    public final Boolean component48() {
        return this.isService;
    }

    @Nullable
    public final String component49() {
        return this.serviceDescription;
    }

    @Nullable
    public final String component5() {
        return this.firstNameDat;
    }

    @Nullable
    public final String component50() {
        return this.photoRec;
    }

    @Nullable
    public final String component51() {
        return this.photoMedium;
    }

    @Nullable
    public final String component52() {
        return this.photoMediumRec;
    }

    @Nullable
    public final String component53() {
        return this.photo;
    }

    @Nullable
    public final String component54() {
        return this.photoBig;
    }

    @Nullable
    public final String component55() {
        return this.photo400;
    }

    @Nullable
    public final PhotosPhoto component56() {
        return this.photoMaxSize;
    }

    @Nullable
    public final String component57() {
        return this.language;
    }

    @Nullable
    public final Integer component58() {
        return this.storiesArchiveCount;
    }

    @Nullable
    public final Boolean component59() {
        return this.hasUnseenStories;
    }

    @Nullable
    public final String component6() {
        return this.firstNameAcc;
    }

    @Nullable
    public final WallDefault component60() {
        return this.wallDefault;
    }

    @Nullable
    public final Boolean component61() {
        return this.canCall;
    }

    @Nullable
    public final Boolean component62() {
        return this.canCallFromGroup;
    }

    @Nullable
    public final Boolean component63() {
        return this.canSeeWishes;
    }

    @Nullable
    public final BaseBoolInt component64() {
        return this.canSeeGifts;
    }

    @Nullable
    public final String component65() {
        return this.interests;
    }

    @Nullable
    public final String component66() {
        return this.books;
    }

    @Nullable
    public final String component67() {
        return this.tv;
    }

    @Nullable
    public final String component68() {
        return this.quotes;
    }

    @Nullable
    public final String component69() {
        return this.about;
    }

    @Nullable
    public final String component7() {
        return this.firstNameIns;
    }

    @Nullable
    public final String component70() {
        return this.games;
    }

    @Nullable
    public final String component71() {
        return this.movies;
    }

    @Nullable
    public final String component72() {
        return this.activities;
    }

    @Nullable
    public final String component73() {
        return this.music;
    }

    @Nullable
    public final BaseBoolInt component74() {
        return this.canWritePrivateMessage;
    }

    @Nullable
    public final BaseBoolInt component75() {
        return this.canSendFriendRequest;
    }

    @Nullable
    public final Boolean component76() {
        return this.canBeInvitedGroup;
    }

    @Nullable
    public final String component77() {
        return this.mobilePhone;
    }

    @Nullable
    public final String component78() {
        return this.homePhone;
    }

    @Nullable
    public final String component79() {
        return this.site;
    }

    @Nullable
    public final String component8() {
        return this.firstNameAbl;
    }

    @Nullable
    public final AudioAudio component80() {
        return this.statusAudio;
    }

    @Nullable
    public final String component81() {
        return this.status;
    }

    @Nullable
    public final String component82() {
        return this.activity;
    }

    @Nullable
    public final UsersLastSeen component83() {
        return this.lastSeen;
    }

    @Nullable
    public final UsersExports component84() {
        return this.exports;
    }

    @Nullable
    public final BaseCropPhoto component85() {
        return this.cropPhoto;
    }

    @Nullable
    public final Integer component86() {
        return this.followersCount;
    }

    @Nullable
    public final Integer component87() {
        return this.videoLiveLevel;
    }

    @Nullable
    public final Integer component88() {
        return this.videoLiveCount;
    }

    @Nullable
    public final Integer component89() {
        return this.clipsCount;
    }

    @Nullable
    public final String component9() {
        return this.lastNameNom;
    }

    @Nullable
    public final BaseBoolInt component90() {
        return this.blacklisted;
    }

    @Nullable
    public final BaseBoolInt component91() {
        return this.blacklistedByMe;
    }

    @Nullable
    public final BaseBoolInt component92() {
        return this.isFavorite;
    }

    @Nullable
    public final BaseBoolInt component93() {
        return this.isHiddenFromFeed;
    }

    @Nullable
    public final Integer component94() {
        return this.commonCount;
    }

    @Nullable
    public final UsersOccupation component95() {
        return this.occupation;
    }

    @Nullable
    public final List<UsersCareer> component96() {
        return this.career;
    }

    @Nullable
    public final List<UsersMilitary> component97() {
        return this.military;
    }

    @Nullable
    public final Integer component98() {
        return this.university;
    }

    @Nullable
    public final String component99() {
        return this.universityName;
    }

    @NotNull
    public final FriendsUserXtrPhone copy(@NotNull UserId id2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable BaseCity baseCity, @Nullable BaseCountry baseCountry, @Nullable Float f10, @Nullable OwnerState ownerState, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5, @Nullable BaseBoolInt baseBoolInt6, @Nullable BaseBoolInt baseBoolInt7, @Nullable UsersUserType usersUserType, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable BaseBoolInt baseBoolInt8, @Nullable VideoLiveInfo videoLiveInfo, @Nullable BaseBoolInt baseBoolInt9, @Nullable Boolean bool, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable PhotosPhoto photosPhoto, @Nullable String str39, @Nullable Integer num, @Nullable Boolean bool2, @Nullable WallDefault wallDefault, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable BaseBoolInt baseBoolInt10, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48, @Nullable BaseBoolInt baseBoolInt11, @Nullable BaseBoolInt baseBoolInt12, @Nullable Boolean bool6, @Nullable String str49, @Nullable String str50, @Nullable String str51, @Nullable AudioAudio audioAudio, @Nullable String str52, @Nullable String str53, @Nullable UsersLastSeen usersLastSeen, @Nullable UsersExports usersExports, @Nullable BaseCropPhoto baseCropPhoto, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable BaseBoolInt baseBoolInt13, @Nullable BaseBoolInt baseBoolInt14, @Nullable BaseBoolInt baseBoolInt15, @Nullable BaseBoolInt baseBoolInt16, @Nullable Integer num6, @Nullable UsersOccupation usersOccupation, @Nullable List<UsersCareer> list, @Nullable List<UsersMilitary> list2, @Nullable Integer num7, @Nullable String str54, @Nullable Integer num8, @Nullable Integer num9, @Nullable String str55, @Nullable Integer num10, @Nullable String str56, @Nullable String str57, @Nullable String str58, @Nullable UsersUserRelation usersUserRelation, @Nullable UsersUserMin usersUserMin, @Nullable UsersPersonal usersPersonal, @Nullable List<UsersUniversity> list3, @Nullable List<UsersSchool> list4, @Nullable List<UsersRelative> list5, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable UsersUserCounters usersUserCounters, @Nullable String str59, @Nullable BaseBoolInt baseBoolInt17, @Nullable String str60, @Nullable Boolean bool10, @Nullable Integer num11, @Nullable Boolean bool11, @Nullable List<String> list6, @Nullable List<Integer> list7, @Nullable BaseSex baseSex, @Nullable String str61, @Nullable String str62, @Nullable String str63, @Nullable UsersOnlineInfo usersOnlineInfo, @Nullable BaseBoolInt baseBoolInt18, @Nullable BaseBoolInt baseBoolInt19, @Nullable Integer num12, @Nullable BaseBoolInt baseBoolInt20, @Nullable BaseBoolInt baseBoolInt21, @Nullable FriendsFriendStatusStatus friendsFriendStatusStatus, @Nullable FriendsRequestsMutual friendsRequestsMutual, @Nullable String str64, @Nullable String str65, @Nullable Integer num13, @Nullable String str66, @Nullable Boolean bool12, @Nullable Boolean bool13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new FriendsUserXtrPhone(id2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, baseCity, baseCountry, f10, ownerState, str19, str20, str21, str22, str23, str24, baseBoolInt, baseBoolInt2, baseBoolInt3, baseBoolInt4, baseBoolInt5, baseBoolInt6, baseBoolInt7, usersUserType, str25, str26, str27, str28, str29, str30, str31, baseBoolInt8, videoLiveInfo, baseBoolInt9, bool, str32, str33, str34, str35, str36, str37, str38, photosPhoto, str39, num, bool2, wallDefault, bool3, bool4, bool5, baseBoolInt10, str40, str41, str42, str43, str44, str45, str46, str47, str48, baseBoolInt11, baseBoolInt12, bool6, str49, str50, str51, audioAudio, str52, str53, usersLastSeen, usersExports, baseCropPhoto, num2, num3, num4, num5, baseBoolInt13, baseBoolInt14, baseBoolInt15, baseBoolInt16, num6, usersOccupation, list, list2, num7, str54, num8, num9, str55, num10, str56, str57, str58, usersUserRelation, usersUserMin, usersPersonal, list3, list4, list5, bool7, bool8, bool9, usersUserCounters, str59, baseBoolInt17, str60, bool10, num11, bool11, list6, list7, baseSex, str61, str62, str63, usersOnlineInfo, baseBoolInt18, baseBoolInt19, num12, baseBoolInt20, baseBoolInt21, friendsFriendStatusStatus, friendsRequestsMutual, str64, str65, num13, str66, bool12, bool13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsUserXtrPhone)) {
            return false;
        }
        FriendsUserXtrPhone friendsUserXtrPhone = (FriendsUserXtrPhone) obj;
        return Intrinsics.a(this.f15169id, friendsUserXtrPhone.f15169id) && Intrinsics.a(this.phone, friendsUserXtrPhone.phone) && Intrinsics.a(this.firstNameNom, friendsUserXtrPhone.firstNameNom) && Intrinsics.a(this.firstNameGen, friendsUserXtrPhone.firstNameGen) && Intrinsics.a(this.firstNameDat, friendsUserXtrPhone.firstNameDat) && Intrinsics.a(this.firstNameAcc, friendsUserXtrPhone.firstNameAcc) && Intrinsics.a(this.firstNameIns, friendsUserXtrPhone.firstNameIns) && Intrinsics.a(this.firstNameAbl, friendsUserXtrPhone.firstNameAbl) && Intrinsics.a(this.lastNameNom, friendsUserXtrPhone.lastNameNom) && Intrinsics.a(this.lastNameGen, friendsUserXtrPhone.lastNameGen) && Intrinsics.a(this.lastNameDat, friendsUserXtrPhone.lastNameDat) && Intrinsics.a(this.lastNameAcc, friendsUserXtrPhone.lastNameAcc) && Intrinsics.a(this.lastNameIns, friendsUserXtrPhone.lastNameIns) && Intrinsics.a(this.lastNameAbl, friendsUserXtrPhone.lastNameAbl) && Intrinsics.a(this.nickname, friendsUserXtrPhone.nickname) && Intrinsics.a(this.maidenName, friendsUserXtrPhone.maidenName) && Intrinsics.a(this.contactName, friendsUserXtrPhone.contactName) && Intrinsics.a(this.domain, friendsUserXtrPhone.domain) && Intrinsics.a(this.bdate, friendsUserXtrPhone.bdate) && Intrinsics.a(this.city, friendsUserXtrPhone.city) && Intrinsics.a(this.country, friendsUserXtrPhone.country) && Intrinsics.a(this.timezone, friendsUserXtrPhone.timezone) && Intrinsics.a(this.ownerState, friendsUserXtrPhone.ownerState) && Intrinsics.a(this.photo200, friendsUserXtrPhone.photo200) && Intrinsics.a(this.photoMax, friendsUserXtrPhone.photoMax) && Intrinsics.a(this.photo200Orig, friendsUserXtrPhone.photo200Orig) && Intrinsics.a(this.photo400Orig, friendsUserXtrPhone.photo400Orig) && Intrinsics.a(this.photoMaxOrig, friendsUserXtrPhone.photoMaxOrig) && Intrinsics.a(this.photoId, friendsUserXtrPhone.photoId) && this.hasPhoto == friendsUserXtrPhone.hasPhoto && this.hasMobile == friendsUserXtrPhone.hasMobile && this.isFriend == friendsUserXtrPhone.isFriend && this.wallComments == friendsUserXtrPhone.wallComments && this.canPost == friendsUserXtrPhone.canPost && this.canSeeAllPosts == friendsUserXtrPhone.canSeeAllPosts && this.canSeeAudio == friendsUserXtrPhone.canSeeAudio && this.type == friendsUserXtrPhone.type && Intrinsics.a(this.email, friendsUserXtrPhone.email) && Intrinsics.a(this.skype, friendsUserXtrPhone.skype) && Intrinsics.a(this.facebook, friendsUserXtrPhone.facebook) && Intrinsics.a(this.facebookName, friendsUserXtrPhone.facebookName) && Intrinsics.a(this.twitter, friendsUserXtrPhone.twitter) && Intrinsics.a(this.livejournal, friendsUserXtrPhone.livejournal) && Intrinsics.a(this.instagram, friendsUserXtrPhone.instagram) && this.test == friendsUserXtrPhone.test && Intrinsics.a(this.videoLive, friendsUserXtrPhone.videoLive) && this.isVideoLiveNotificationsBlocked == friendsUserXtrPhone.isVideoLiveNotificationsBlocked && Intrinsics.a(this.isService, friendsUserXtrPhone.isService) && Intrinsics.a(this.serviceDescription, friendsUserXtrPhone.serviceDescription) && Intrinsics.a(this.photoRec, friendsUserXtrPhone.photoRec) && Intrinsics.a(this.photoMedium, friendsUserXtrPhone.photoMedium) && Intrinsics.a(this.photoMediumRec, friendsUserXtrPhone.photoMediumRec) && Intrinsics.a(this.photo, friendsUserXtrPhone.photo) && Intrinsics.a(this.photoBig, friendsUserXtrPhone.photoBig) && Intrinsics.a(this.photo400, friendsUserXtrPhone.photo400) && Intrinsics.a(this.photoMaxSize, friendsUserXtrPhone.photoMaxSize) && Intrinsics.a(this.language, friendsUserXtrPhone.language) && Intrinsics.a(this.storiesArchiveCount, friendsUserXtrPhone.storiesArchiveCount) && Intrinsics.a(this.hasUnseenStories, friendsUserXtrPhone.hasUnseenStories) && this.wallDefault == friendsUserXtrPhone.wallDefault && Intrinsics.a(this.canCall, friendsUserXtrPhone.canCall) && Intrinsics.a(this.canCallFromGroup, friendsUserXtrPhone.canCallFromGroup) && Intrinsics.a(this.canSeeWishes, friendsUserXtrPhone.canSeeWishes) && this.canSeeGifts == friendsUserXtrPhone.canSeeGifts && Intrinsics.a(this.interests, friendsUserXtrPhone.interests) && Intrinsics.a(this.books, friendsUserXtrPhone.books) && Intrinsics.a(this.tv, friendsUserXtrPhone.tv) && Intrinsics.a(this.quotes, friendsUserXtrPhone.quotes) && Intrinsics.a(this.about, friendsUserXtrPhone.about) && Intrinsics.a(this.games, friendsUserXtrPhone.games) && Intrinsics.a(this.movies, friendsUserXtrPhone.movies) && Intrinsics.a(this.activities, friendsUserXtrPhone.activities) && Intrinsics.a(this.music, friendsUserXtrPhone.music) && this.canWritePrivateMessage == friendsUserXtrPhone.canWritePrivateMessage && this.canSendFriendRequest == friendsUserXtrPhone.canSendFriendRequest && Intrinsics.a(this.canBeInvitedGroup, friendsUserXtrPhone.canBeInvitedGroup) && Intrinsics.a(this.mobilePhone, friendsUserXtrPhone.mobilePhone) && Intrinsics.a(this.homePhone, friendsUserXtrPhone.homePhone) && Intrinsics.a(this.site, friendsUserXtrPhone.site) && Intrinsics.a(this.statusAudio, friendsUserXtrPhone.statusAudio) && Intrinsics.a(this.status, friendsUserXtrPhone.status) && Intrinsics.a(this.activity, friendsUserXtrPhone.activity) && Intrinsics.a(this.lastSeen, friendsUserXtrPhone.lastSeen) && Intrinsics.a(this.exports, friendsUserXtrPhone.exports) && Intrinsics.a(this.cropPhoto, friendsUserXtrPhone.cropPhoto) && Intrinsics.a(this.followersCount, friendsUserXtrPhone.followersCount) && Intrinsics.a(this.videoLiveLevel, friendsUserXtrPhone.videoLiveLevel) && Intrinsics.a(this.videoLiveCount, friendsUserXtrPhone.videoLiveCount) && Intrinsics.a(this.clipsCount, friendsUserXtrPhone.clipsCount) && this.blacklisted == friendsUserXtrPhone.blacklisted && this.blacklistedByMe == friendsUserXtrPhone.blacklistedByMe && this.isFavorite == friendsUserXtrPhone.isFavorite && this.isHiddenFromFeed == friendsUserXtrPhone.isHiddenFromFeed && Intrinsics.a(this.commonCount, friendsUserXtrPhone.commonCount) && Intrinsics.a(this.occupation, friendsUserXtrPhone.occupation) && Intrinsics.a(this.career, friendsUserXtrPhone.career) && Intrinsics.a(this.military, friendsUserXtrPhone.military) && Intrinsics.a(this.university, friendsUserXtrPhone.university) && Intrinsics.a(this.universityName, friendsUserXtrPhone.universityName) && Intrinsics.a(this.universityGroupId, friendsUserXtrPhone.universityGroupId) && Intrinsics.a(this.faculty, friendsUserXtrPhone.faculty) && Intrinsics.a(this.facultyName, friendsUserXtrPhone.facultyName) && Intrinsics.a(this.graduation, friendsUserXtrPhone.graduation) && Intrinsics.a(this.educationForm, friendsUserXtrPhone.educationForm) && Intrinsics.a(this.educationStatus, friendsUserXtrPhone.educationStatus) && Intrinsics.a(this.homeTown, friendsUserXtrPhone.homeTown) && this.relation == friendsUserXtrPhone.relation && Intrinsics.a(this.relationPartner, friendsUserXtrPhone.relationPartner) && Intrinsics.a(this.personal, friendsUserXtrPhone.personal) && Intrinsics.a(this.universities, friendsUserXtrPhone.universities) && Intrinsics.a(this.schools, friendsUserXtrPhone.schools) && Intrinsics.a(this.relatives, friendsUserXtrPhone.relatives) && Intrinsics.a(this.isSubscribedPodcasts, friendsUserXtrPhone.isSubscribedPodcasts) && Intrinsics.a(this.canSubscribePodcasts, friendsUserXtrPhone.canSubscribePodcasts) && Intrinsics.a(this.canSubscribePosts, friendsUserXtrPhone.canSubscribePosts) && Intrinsics.a(this.counters, friendsUserXtrPhone.counters) && Intrinsics.a(this.accessKey, friendsUserXtrPhone.accessKey) && this.canUploadDoc == friendsUserXtrPhone.canUploadDoc && Intrinsics.a(this.hash, friendsUserXtrPhone.hash) && Intrinsics.a(this.isNoIndex, friendsUserXtrPhone.isNoIndex) && Intrinsics.a(this.contactId, friendsUserXtrPhone.contactId) && Intrinsics.a(this.isMessageRequest, friendsUserXtrPhone.isMessageRequest) && Intrinsics.a(this.descriptions, friendsUserXtrPhone.descriptions) && Intrinsics.a(this.lists, friendsUserXtrPhone.lists) && this.sex == friendsUserXtrPhone.sex && Intrinsics.a(this.screenName, friendsUserXtrPhone.screenName) && Intrinsics.a(this.photo50, friendsUserXtrPhone.photo50) && Intrinsics.a(this.photo100, friendsUserXtrPhone.photo100) && Intrinsics.a(this.onlineInfo, friendsUserXtrPhone.onlineInfo) && this.online == friendsUserXtrPhone.online && this.onlineMobile == friendsUserXtrPhone.onlineMobile && Intrinsics.a(this.onlineApp, friendsUserXtrPhone.onlineApp) && this.verified == friendsUserXtrPhone.verified && this.trending == friendsUserXtrPhone.trending && this.friendStatus == friendsUserXtrPhone.friendStatus && Intrinsics.a(this.mutual, friendsUserXtrPhone.mutual) && Intrinsics.a(this.deactivated, friendsUserXtrPhone.deactivated) && Intrinsics.a(this.firstName, friendsUserXtrPhone.firstName) && Intrinsics.a(this.hidden, friendsUserXtrPhone.hidden) && Intrinsics.a(this.lastName, friendsUserXtrPhone.lastName) && Intrinsics.a(this.canAccessClosed, friendsUserXtrPhone.canAccessClosed) && Intrinsics.a(this.isClosed, friendsUserXtrPhone.isClosed);
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
        return this.f15169id;
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
    public final String getPhone() {
        return this.phone;
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
        int iHashCode = this.f15169id.hashCode() * 31;
        String str = this.phone;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstNameNom;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstNameGen;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameDat;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstNameAcc;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstNameIns;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstNameAbl;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastNameNom;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastNameGen;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastNameDat;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastNameAcc;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.lastNameIns;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.lastNameAbl;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.nickname;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.maidenName;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.contactName;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.domain;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.bdate;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        BaseCity baseCity = this.city;
        int iHashCode20 = (iHashCode19 + (baseCity == null ? 0 : baseCity.hashCode())) * 31;
        BaseCountry baseCountry = this.country;
        int iHashCode21 = (iHashCode20 + (baseCountry == null ? 0 : baseCountry.hashCode())) * 31;
        Float f10 = this.timezone;
        int iHashCode22 = (iHashCode21 + (f10 == null ? 0 : f10.hashCode())) * 31;
        OwnerState ownerState = this.ownerState;
        int iHashCode23 = (iHashCode22 + (ownerState == null ? 0 : ownerState.hashCode())) * 31;
        String str19 = this.photo200;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.photoMax;
        int iHashCode25 = (iHashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.photo200Orig;
        int iHashCode26 = (iHashCode25 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.photo400Orig;
        int iHashCode27 = (iHashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photoMaxOrig;
        int iHashCode28 = (iHashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.photoId;
        int iHashCode29 = (iHashCode28 + (str24 == null ? 0 : str24.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.hasPhoto;
        int iHashCode30 = (iHashCode29 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.hasMobile;
        int iHashCode31 = (iHashCode30 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.isFriend;
        int iHashCode32 = (iHashCode31 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.wallComments;
        int iHashCode33 = (iHashCode32 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        BaseBoolInt baseBoolInt5 = this.canPost;
        int iHashCode34 = (iHashCode33 + (baseBoolInt5 == null ? 0 : baseBoolInt5.hashCode())) * 31;
        BaseBoolInt baseBoolInt6 = this.canSeeAllPosts;
        int iHashCode35 = (iHashCode34 + (baseBoolInt6 == null ? 0 : baseBoolInt6.hashCode())) * 31;
        BaseBoolInt baseBoolInt7 = this.canSeeAudio;
        int iHashCode36 = (iHashCode35 + (baseBoolInt7 == null ? 0 : baseBoolInt7.hashCode())) * 31;
        UsersUserType usersUserType = this.type;
        int iHashCode37 = (iHashCode36 + (usersUserType == null ? 0 : usersUserType.hashCode())) * 31;
        String str25 = this.email;
        int iHashCode38 = (iHashCode37 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.skype;
        int iHashCode39 = (iHashCode38 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.facebook;
        int iHashCode40 = (iHashCode39 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.facebookName;
        int iHashCode41 = (iHashCode40 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.twitter;
        int iHashCode42 = (iHashCode41 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.livejournal;
        int iHashCode43 = (iHashCode42 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.instagram;
        int iHashCode44 = (iHashCode43 + (str31 == null ? 0 : str31.hashCode())) * 31;
        BaseBoolInt baseBoolInt8 = this.test;
        int iHashCode45 = (iHashCode44 + (baseBoolInt8 == null ? 0 : baseBoolInt8.hashCode())) * 31;
        VideoLiveInfo videoLiveInfo = this.videoLive;
        int iHashCode46 = (iHashCode45 + (videoLiveInfo == null ? 0 : videoLiveInfo.hashCode())) * 31;
        BaseBoolInt baseBoolInt9 = this.isVideoLiveNotificationsBlocked;
        int iHashCode47 = (iHashCode46 + (baseBoolInt9 == null ? 0 : baseBoolInt9.hashCode())) * 31;
        Boolean bool = this.isService;
        int iHashCode48 = (iHashCode47 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str32 = this.serviceDescription;
        int iHashCode49 = (iHashCode48 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.photoRec;
        int iHashCode50 = (iHashCode49 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.photoMedium;
        int iHashCode51 = (iHashCode50 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.photoMediumRec;
        int iHashCode52 = (iHashCode51 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.photo;
        int iHashCode53 = (iHashCode52 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.photoBig;
        int iHashCode54 = (iHashCode53 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.photo400;
        int iHashCode55 = (iHashCode54 + (str38 == null ? 0 : str38.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photoMaxSize;
        int iHashCode56 = (iHashCode55 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        String str39 = this.language;
        int iHashCode57 = (iHashCode56 + (str39 == null ? 0 : str39.hashCode())) * 31;
        Integer num = this.storiesArchiveCount;
        int iHashCode58 = (iHashCode57 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.hasUnseenStories;
        int iHashCode59 = (iHashCode58 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        WallDefault wallDefault = this.wallDefault;
        int iHashCode60 = (iHashCode59 + (wallDefault == null ? 0 : wallDefault.hashCode())) * 31;
        Boolean bool3 = this.canCall;
        int iHashCode61 = (iHashCode60 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canCallFromGroup;
        int iHashCode62 = (iHashCode61 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canSeeWishes;
        int iHashCode63 = (iHashCode62 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        BaseBoolInt baseBoolInt10 = this.canSeeGifts;
        int iHashCode64 = (iHashCode63 + (baseBoolInt10 == null ? 0 : baseBoolInt10.hashCode())) * 31;
        String str40 = this.interests;
        int iHashCode65 = (iHashCode64 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.books;
        int iHashCode66 = (iHashCode65 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.tv;
        int iHashCode67 = (iHashCode66 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.quotes;
        int iHashCode68 = (iHashCode67 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.about;
        int iHashCode69 = (iHashCode68 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.games;
        int iHashCode70 = (iHashCode69 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.movies;
        int iHashCode71 = (iHashCode70 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.activities;
        int iHashCode72 = (iHashCode71 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.music;
        int iHashCode73 = (iHashCode72 + (str48 == null ? 0 : str48.hashCode())) * 31;
        BaseBoolInt baseBoolInt11 = this.canWritePrivateMessage;
        int iHashCode74 = (iHashCode73 + (baseBoolInt11 == null ? 0 : baseBoolInt11.hashCode())) * 31;
        BaseBoolInt baseBoolInt12 = this.canSendFriendRequest;
        int iHashCode75 = (iHashCode74 + (baseBoolInt12 == null ? 0 : baseBoolInt12.hashCode())) * 31;
        Boolean bool6 = this.canBeInvitedGroup;
        int iHashCode76 = (iHashCode75 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str49 = this.mobilePhone;
        int iHashCode77 = (iHashCode76 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.homePhone;
        int iHashCode78 = (iHashCode77 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.site;
        int iHashCode79 = (iHashCode78 + (str51 == null ? 0 : str51.hashCode())) * 31;
        AudioAudio audioAudio = this.statusAudio;
        int iHashCode80 = (iHashCode79 + (audioAudio == null ? 0 : audioAudio.hashCode())) * 31;
        String str52 = this.status;
        int iHashCode81 = (iHashCode80 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.activity;
        int iHashCode82 = (iHashCode81 + (str53 == null ? 0 : str53.hashCode())) * 31;
        UsersLastSeen usersLastSeen = this.lastSeen;
        int iHashCode83 = (iHashCode82 + (usersLastSeen == null ? 0 : usersLastSeen.hashCode())) * 31;
        UsersExports usersExports = this.exports;
        int iHashCode84 = (iHashCode83 + (usersExports == null ? 0 : usersExports.hashCode())) * 31;
        BaseCropPhoto baseCropPhoto = this.cropPhoto;
        int iHashCode85 = (iHashCode84 + (baseCropPhoto == null ? 0 : baseCropPhoto.hashCode())) * 31;
        Integer num2 = this.followersCount;
        int iHashCode86 = (iHashCode85 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoLiveLevel;
        int iHashCode87 = (iHashCode86 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoLiveCount;
        int iHashCode88 = (iHashCode87 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.clipsCount;
        int iHashCode89 = (iHashCode88 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BaseBoolInt baseBoolInt13 = this.blacklisted;
        int iHashCode90 = (iHashCode89 + (baseBoolInt13 == null ? 0 : baseBoolInt13.hashCode())) * 31;
        BaseBoolInt baseBoolInt14 = this.blacklistedByMe;
        int iHashCode91 = (iHashCode90 + (baseBoolInt14 == null ? 0 : baseBoolInt14.hashCode())) * 31;
        BaseBoolInt baseBoolInt15 = this.isFavorite;
        int iHashCode92 = (iHashCode91 + (baseBoolInt15 == null ? 0 : baseBoolInt15.hashCode())) * 31;
        BaseBoolInt baseBoolInt16 = this.isHiddenFromFeed;
        int iHashCode93 = (iHashCode92 + (baseBoolInt16 == null ? 0 : baseBoolInt16.hashCode())) * 31;
        Integer num6 = this.commonCount;
        int iHashCode94 = (iHashCode93 + (num6 == null ? 0 : num6.hashCode())) * 31;
        UsersOccupation usersOccupation = this.occupation;
        int iHashCode95 = (iHashCode94 + (usersOccupation == null ? 0 : usersOccupation.hashCode())) * 31;
        List<UsersCareer> list = this.career;
        int iHashCode96 = (iHashCode95 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersMilitary> list2 = this.military;
        int iHashCode97 = (iHashCode96 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num7 = this.university;
        int iHashCode98 = (iHashCode97 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str54 = this.universityName;
        int iHashCode99 = (iHashCode98 + (str54 == null ? 0 : str54.hashCode())) * 31;
        Integer num8 = this.universityGroupId;
        int iHashCode100 = (iHashCode99 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.faculty;
        int iHashCode101 = (iHashCode100 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str55 = this.facultyName;
        int iHashCode102 = (iHashCode101 + (str55 == null ? 0 : str55.hashCode())) * 31;
        Integer num10 = this.graduation;
        int iHashCode103 = (iHashCode102 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str56 = this.educationForm;
        int iHashCode104 = (iHashCode103 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.educationStatus;
        int iHashCode105 = (iHashCode104 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.homeTown;
        int iHashCode106 = (iHashCode105 + (str58 == null ? 0 : str58.hashCode())) * 31;
        UsersUserRelation usersUserRelation = this.relation;
        int iHashCode107 = (iHashCode106 + (usersUserRelation == null ? 0 : usersUserRelation.hashCode())) * 31;
        UsersUserMin usersUserMin = this.relationPartner;
        int iHashCode108 = (iHashCode107 + (usersUserMin == null ? 0 : usersUserMin.hashCode())) * 31;
        UsersPersonal usersPersonal = this.personal;
        int iHashCode109 = (iHashCode108 + (usersPersonal == null ? 0 : usersPersonal.hashCode())) * 31;
        List<UsersUniversity> list3 = this.universities;
        int iHashCode110 = (iHashCode109 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UsersSchool> list4 = this.schools;
        int iHashCode111 = (iHashCode110 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UsersRelative> list5 = this.relatives;
        int iHashCode112 = (iHashCode111 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool7 = this.isSubscribedPodcasts;
        int iHashCode113 = (iHashCode112 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.canSubscribePodcasts;
        int iHashCode114 = (iHashCode113 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canSubscribePosts;
        int iHashCode115 = (iHashCode114 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        UsersUserCounters usersUserCounters = this.counters;
        int iHashCode116 = (iHashCode115 + (usersUserCounters == null ? 0 : usersUserCounters.hashCode())) * 31;
        String str59 = this.accessKey;
        int iHashCode117 = (iHashCode116 + (str59 == null ? 0 : str59.hashCode())) * 31;
        BaseBoolInt baseBoolInt17 = this.canUploadDoc;
        int iHashCode118 = (iHashCode117 + (baseBoolInt17 == null ? 0 : baseBoolInt17.hashCode())) * 31;
        String str60 = this.hash;
        int iHashCode119 = (iHashCode118 + (str60 == null ? 0 : str60.hashCode())) * 31;
        Boolean bool10 = this.isNoIndex;
        int iHashCode120 = (iHashCode119 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Integer num11 = this.contactId;
        int iHashCode121 = (iHashCode120 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool11 = this.isMessageRequest;
        int iHashCode122 = (iHashCode121 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        List<String> list6 = this.descriptions;
        int iHashCode123 = (iHashCode122 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<Integer> list7 = this.lists;
        int iHashCode124 = (iHashCode123 + (list7 == null ? 0 : list7.hashCode())) * 31;
        BaseSex baseSex = this.sex;
        int iHashCode125 = (iHashCode124 + (baseSex == null ? 0 : baseSex.hashCode())) * 31;
        String str61 = this.screenName;
        int iHashCode126 = (iHashCode125 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.photo50;
        int iHashCode127 = (iHashCode126 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.photo100;
        int iHashCode128 = (iHashCode127 + (str63 == null ? 0 : str63.hashCode())) * 31;
        UsersOnlineInfo usersOnlineInfo = this.onlineInfo;
        int iHashCode129 = (iHashCode128 + (usersOnlineInfo == null ? 0 : usersOnlineInfo.hashCode())) * 31;
        BaseBoolInt baseBoolInt18 = this.online;
        int iHashCode130 = (iHashCode129 + (baseBoolInt18 == null ? 0 : baseBoolInt18.hashCode())) * 31;
        BaseBoolInt baseBoolInt19 = this.onlineMobile;
        int iHashCode131 = (iHashCode130 + (baseBoolInt19 == null ? 0 : baseBoolInt19.hashCode())) * 31;
        Integer num12 = this.onlineApp;
        int iHashCode132 = (iHashCode131 + (num12 == null ? 0 : num12.hashCode())) * 31;
        BaseBoolInt baseBoolInt20 = this.verified;
        int iHashCode133 = (iHashCode132 + (baseBoolInt20 == null ? 0 : baseBoolInt20.hashCode())) * 31;
        BaseBoolInt baseBoolInt21 = this.trending;
        int iHashCode134 = (iHashCode133 + (baseBoolInt21 == null ? 0 : baseBoolInt21.hashCode())) * 31;
        FriendsFriendStatusStatus friendsFriendStatusStatus = this.friendStatus;
        int iHashCode135 = (iHashCode134 + (friendsFriendStatusStatus == null ? 0 : friendsFriendStatusStatus.hashCode())) * 31;
        FriendsRequestsMutual friendsRequestsMutual = this.mutual;
        int iHashCode136 = (iHashCode135 + (friendsRequestsMutual == null ? 0 : friendsRequestsMutual.hashCode())) * 31;
        String str64 = this.deactivated;
        int iHashCode137 = (iHashCode136 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.firstName;
        int iHashCode138 = (iHashCode137 + (str65 == null ? 0 : str65.hashCode())) * 31;
        Integer num13 = this.hidden;
        int iHashCode139 = (iHashCode138 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str66 = this.lastName;
        int iHashCode140 = (iHashCode139 + (str66 == null ? 0 : str66.hashCode())) * 31;
        Boolean bool12 = this.canAccessClosed;
        int iHashCode141 = (iHashCode140 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.isClosed;
        return iHashCode141 + (bool13 != null ? bool13.hashCode() : 0);
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
        UserId userId = this.f15169id;
        String str = this.phone;
        String str2 = this.firstNameNom;
        String str3 = this.firstNameGen;
        String str4 = this.firstNameDat;
        String str5 = this.firstNameAcc;
        String str6 = this.firstNameIns;
        String str7 = this.firstNameAbl;
        String str8 = this.lastNameNom;
        String str9 = this.lastNameGen;
        String str10 = this.lastNameDat;
        String str11 = this.lastNameAcc;
        String str12 = this.lastNameIns;
        String str13 = this.lastNameAbl;
        String str14 = this.nickname;
        String str15 = this.maidenName;
        String str16 = this.contactName;
        String str17 = this.domain;
        String str18 = this.bdate;
        BaseCity baseCity = this.city;
        BaseCountry baseCountry = this.country;
        Float f10 = this.timezone;
        OwnerState ownerState = this.ownerState;
        String str19 = this.photo200;
        String str20 = this.photoMax;
        String str21 = this.photo200Orig;
        String str22 = this.photo400Orig;
        String str23 = this.photoMaxOrig;
        String str24 = this.photoId;
        BaseBoolInt baseBoolInt = this.hasPhoto;
        BaseBoolInt baseBoolInt2 = this.hasMobile;
        BaseBoolInt baseBoolInt3 = this.isFriend;
        BaseBoolInt baseBoolInt4 = this.wallComments;
        BaseBoolInt baseBoolInt5 = this.canPost;
        BaseBoolInt baseBoolInt6 = this.canSeeAllPosts;
        BaseBoolInt baseBoolInt7 = this.canSeeAudio;
        UsersUserType usersUserType = this.type;
        String str25 = this.email;
        String str26 = this.skype;
        String str27 = this.facebook;
        String str28 = this.facebookName;
        String str29 = this.twitter;
        String str30 = this.livejournal;
        String str31 = this.instagram;
        BaseBoolInt baseBoolInt8 = this.test;
        VideoLiveInfo videoLiveInfo = this.videoLive;
        BaseBoolInt baseBoolInt9 = this.isVideoLiveNotificationsBlocked;
        Boolean bool = this.isService;
        String str32 = this.serviceDescription;
        String str33 = this.photoRec;
        String str34 = this.photoMedium;
        String str35 = this.photoMediumRec;
        String str36 = this.photo;
        String str37 = this.photoBig;
        String str38 = this.photo400;
        PhotosPhoto photosPhoto = this.photoMaxSize;
        String str39 = this.language;
        Integer num = this.storiesArchiveCount;
        Boolean bool2 = this.hasUnseenStories;
        WallDefault wallDefault = this.wallDefault;
        Boolean bool3 = this.canCall;
        Boolean bool4 = this.canCallFromGroup;
        Boolean bool5 = this.canSeeWishes;
        BaseBoolInt baseBoolInt10 = this.canSeeGifts;
        String str40 = this.interests;
        String str41 = this.books;
        String str42 = this.tv;
        String str43 = this.quotes;
        String str44 = this.about;
        String str45 = this.games;
        String str46 = this.movies;
        String str47 = this.activities;
        String str48 = this.music;
        BaseBoolInt baseBoolInt11 = this.canWritePrivateMessage;
        BaseBoolInt baseBoolInt12 = this.canSendFriendRequest;
        Boolean bool6 = this.canBeInvitedGroup;
        String str49 = this.mobilePhone;
        String str50 = this.homePhone;
        String str51 = this.site;
        AudioAudio audioAudio = this.statusAudio;
        String str52 = this.status;
        String str53 = this.activity;
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
        String str54 = this.universityName;
        Integer num8 = this.universityGroupId;
        Integer num9 = this.faculty;
        String str55 = this.facultyName;
        Integer num10 = this.graduation;
        String str56 = this.educationForm;
        String str57 = this.educationStatus;
        String str58 = this.homeTown;
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
        String str59 = this.accessKey;
        BaseBoolInt baseBoolInt17 = this.canUploadDoc;
        String str60 = this.hash;
        Boolean bool10 = this.isNoIndex;
        Integer num11 = this.contactId;
        Boolean bool11 = this.isMessageRequest;
        List<String> list6 = this.descriptions;
        List<Integer> list7 = this.lists;
        BaseSex baseSex = this.sex;
        String str61 = this.screenName;
        String str62 = this.photo50;
        String str63 = this.photo100;
        UsersOnlineInfo usersOnlineInfo = this.onlineInfo;
        BaseBoolInt baseBoolInt18 = this.online;
        BaseBoolInt baseBoolInt19 = this.onlineMobile;
        Integer num12 = this.onlineApp;
        BaseBoolInt baseBoolInt20 = this.verified;
        BaseBoolInt baseBoolInt21 = this.trending;
        FriendsFriendStatusStatus friendsFriendStatusStatus = this.friendStatus;
        FriendsRequestsMutual friendsRequestsMutual = this.mutual;
        String str64 = this.deactivated;
        String str65 = this.firstName;
        Integer num13 = this.hidden;
        String str66 = this.lastName;
        Boolean bool12 = this.canAccessClosed;
        Boolean bool13 = this.isClosed;
        StringBuilder sb2 = new StringBuilder("FriendsUserXtrPhone(id=");
        sb2.append(userId);
        sb2.append(", phone=");
        sb2.append(str);
        sb2.append(", firstNameNom=");
        o.t(sb2, str2, ", firstNameGen=", str3, ", firstNameDat=");
        o.t(sb2, str4, ", firstNameAcc=", str5, ", firstNameIns=");
        o.t(sb2, str6, ", firstNameAbl=", str7, ", lastNameNom=");
        o.t(sb2, str8, ", lastNameGen=", str9, ", lastNameDat=");
        o.t(sb2, str10, ", lastNameAcc=", str11, ", lastNameIns=");
        o.t(sb2, str12, ", lastNameAbl=", str13, ", nickname=");
        o.t(sb2, str14, ", maidenName=", str15, ", contactName=");
        o.t(sb2, str16, ", domain=", str17, ", bdate=");
        sb2.append(str18);
        sb2.append(", city=");
        sb2.append(baseCity);
        sb2.append(", country=");
        sb2.append(baseCountry);
        sb2.append(", timezone=");
        sb2.append(f10);
        sb2.append(", ownerState=");
        sb2.append(ownerState);
        sb2.append(", photo200=");
        sb2.append(str19);
        sb2.append(", photoMax=");
        o.t(sb2, str20, ", photo200Orig=", str21, ", photo400Orig=");
        o.t(sb2, str22, ", photoMaxOrig=", str23, ", photoId=");
        sb2.append(str24);
        sb2.append(", hasPhoto=");
        sb2.append(baseBoolInt);
        sb2.append(", hasMobile=");
        a.s(sb2, baseBoolInt2, ", isFriend=", baseBoolInt3, ", wallComments=");
        a.s(sb2, baseBoolInt4, ", canPost=", baseBoolInt5, ", canSeeAllPosts=");
        a.s(sb2, baseBoolInt6, ", canSeeAudio=", baseBoolInt7, ", type=");
        sb2.append(usersUserType);
        sb2.append(", email=");
        sb2.append(str25);
        sb2.append(", skype=");
        o.t(sb2, str26, ", facebook=", str27, ", facebookName=");
        o.t(sb2, str28, ", twitter=", str29, ", livejournal=");
        o.t(sb2, str30, ", instagram=", str31, ", test=");
        sb2.append(baseBoolInt8);
        sb2.append(", videoLive=");
        sb2.append(videoLiveInfo);
        sb2.append(", isVideoLiveNotificationsBlocked=");
        sb2.append(baseBoolInt9);
        sb2.append(", isService=");
        sb2.append(bool);
        sb2.append(", serviceDescription=");
        o.t(sb2, str32, ", photoRec=", str33, ", photoMedium=");
        o.t(sb2, str34, ", photoMediumRec=", str35, ", photo=");
        o.t(sb2, str36, ", photoBig=", str37, ", photo400=");
        sb2.append(str38);
        sb2.append(", photoMaxSize=");
        sb2.append(photosPhoto);
        sb2.append(", language=");
        a.r(num, str39, ", storiesArchiveCount=", ", hasUnseenStories=", sb2);
        sb2.append(bool2);
        sb2.append(", wallDefault=");
        sb2.append(wallDefault);
        sb2.append(", canCall=");
        u.s(sb2, bool3, ", canCallFromGroup=", bool4, ", canSeeWishes=");
        sb2.append(bool5);
        sb2.append(", canSeeGifts=");
        sb2.append(baseBoolInt10);
        sb2.append(", interests=");
        o.t(sb2, str40, ", books=", str41, ", tv=");
        o.t(sb2, str42, ", quotes=", str43, ", about=");
        o.t(sb2, str44, ", games=", str45, ", movies=");
        o.t(sb2, str46, ", activities=", str47, ", music=");
        sb2.append(str48);
        sb2.append(", canWritePrivateMessage=");
        sb2.append(baseBoolInt11);
        sb2.append(", canSendFriendRequest=");
        sb2.append(baseBoolInt12);
        sb2.append(", canBeInvitedGroup=");
        sb2.append(bool6);
        sb2.append(", mobilePhone=");
        o.t(sb2, str49, ", homePhone=", str50, ", site=");
        sb2.append(str51);
        sb2.append(", statusAudio=");
        sb2.append(audioAudio);
        sb2.append(", status=");
        o.t(sb2, str52, ", activity=", str53, ", lastSeen=");
        sb2.append(usersLastSeen);
        sb2.append(", exports=");
        sb2.append(usersExports);
        sb2.append(", cropPhoto=");
        sb2.append(baseCropPhoto);
        sb2.append(", followersCount=");
        sb2.append(num2);
        sb2.append(", videoLiveLevel=");
        a.t(sb2, num3, ", videoLiveCount=", num4, ", clipsCount=");
        sb2.append(num5);
        sb2.append(", blacklisted=");
        sb2.append(baseBoolInt13);
        sb2.append(", blacklistedByMe=");
        a.s(sb2, baseBoolInt14, ", isFavorite=", baseBoolInt15, ", isHiddenFromFeed=");
        sb2.append(baseBoolInt16);
        sb2.append(", commonCount=");
        sb2.append(num6);
        sb2.append(", occupation=");
        sb2.append(usersOccupation);
        sb2.append(", career=");
        sb2.append(list);
        sb2.append(", military=");
        sb2.append(list2);
        sb2.append(", university=");
        sb2.append(num7);
        sb2.append(", universityName=");
        a.r(num8, str54, ", universityGroupId=", ", faculty=", sb2);
        pe.a.r(num9, ", facultyName=", str55, ", graduation=", sb2);
        pe.a.r(num10, ", educationForm=", str56, ", educationStatus=", sb2);
        o.t(sb2, str57, ", homeTown=", str58, ", relation=");
        sb2.append(usersUserRelation);
        sb2.append(", relationPartner=");
        sb2.append(usersUserMin);
        sb2.append(", personal=");
        sb2.append(usersPersonal);
        sb2.append(", universities=");
        sb2.append(list3);
        sb2.append(", schools=");
        a.u(sb2, list4, ", relatives=", list5, ", isSubscribedPodcasts=");
        u.s(sb2, bool7, ", canSubscribePodcasts=", bool8, ", canSubscribePosts=");
        sb2.append(bool9);
        sb2.append(", counters=");
        sb2.append(usersUserCounters);
        sb2.append(", accessKey=");
        sb2.append(str59);
        sb2.append(", canUploadDoc=");
        sb2.append(baseBoolInt17);
        sb2.append(", hash=");
        sb2.append(str60);
        sb2.append(", isNoIndex=");
        sb2.append(bool10);
        sb2.append(", contactId=");
        sb2.append(num11);
        sb2.append(", isMessageRequest=");
        sb2.append(bool11);
        sb2.append(", descriptions=");
        a.u(sb2, list6, ", lists=", list7, ", sex=");
        sb2.append(baseSex);
        sb2.append(", screenName=");
        sb2.append(str61);
        sb2.append(", photo50=");
        o.t(sb2, str62, ", photo100=", str63, ", onlineInfo=");
        sb2.append(usersOnlineInfo);
        sb2.append(", online=");
        sb2.append(baseBoolInt18);
        sb2.append(", onlineMobile=");
        sb2.append(baseBoolInt19);
        sb2.append(", onlineApp=");
        sb2.append(num12);
        sb2.append(", verified=");
        a.s(sb2, baseBoolInt20, ", trending=", baseBoolInt21, ", friendStatus=");
        sb2.append(friendsFriendStatusStatus);
        sb2.append(", mutual=");
        sb2.append(friendsRequestsMutual);
        sb2.append(", deactivated=");
        o.t(sb2, str64, ", firstName=", str65, ", hidden=");
        pe.a.r(num13, ", lastName=", str66, ", canAccessClosed=", sb2);
        sb2.append(bool12);
        sb2.append(", isClosed=");
        sb2.append(bool13);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FriendsUserXtrPhone(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, BaseCity baseCity, BaseCountry baseCountry, Float f10, OwnerState ownerState, String str19, String str20, String str21, String str22, String str23, String str24, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, BaseBoolInt baseBoolInt6, BaseBoolInt baseBoolInt7, UsersUserType usersUserType, String str25, String str26, String str27, String str28, String str29, String str30, String str31, BaseBoolInt baseBoolInt8, VideoLiveInfo videoLiveInfo, BaseBoolInt baseBoolInt9, Boolean bool, String str32, String str33, String str34, String str35, String str36, String str37, String str38, PhotosPhoto photosPhoto, String str39, Integer num, Boolean bool2, WallDefault wallDefault, Boolean bool3, Boolean bool4, Boolean bool5, BaseBoolInt baseBoolInt10, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, BaseBoolInt baseBoolInt11, BaseBoolInt baseBoolInt12, Boolean bool6, String str49, String str50, String str51, AudioAudio audioAudio, String str52, String str53, UsersLastSeen usersLastSeen, UsersExports usersExports, BaseCropPhoto baseCropPhoto, Integer num2, Integer num3, Integer num4, Integer num5, BaseBoolInt baseBoolInt13, BaseBoolInt baseBoolInt14, BaseBoolInt baseBoolInt15, BaseBoolInt baseBoolInt16, Integer num6, UsersOccupation usersOccupation, List list, List list2, Integer num7, String str54, Integer num8, Integer num9, String str55, Integer num10, String str56, String str57, String str58, UsersUserRelation usersUserRelation, UsersUserMin usersUserMin, UsersPersonal usersPersonal, List list3, List list4, List list5, Boolean bool7, Boolean bool8, Boolean bool9, UsersUserCounters usersUserCounters, String str59, BaseBoolInt baseBoolInt17, String str60, Boolean bool10, Integer num11, Boolean bool11, List list6, List list7, BaseSex baseSex, String str61, String str62, String str63, UsersOnlineInfo usersOnlineInfo, BaseBoolInt baseBoolInt18, BaseBoolInt baseBoolInt19, Integer num12, BaseBoolInt baseBoolInt20, BaseBoolInt baseBoolInt21, FriendsFriendStatusStatus friendsFriendStatusStatus, FriendsRequestsMutual friendsRequestsMutual, String str64, String str65, Integer num13, String str66, Boolean bool12, Boolean bool13, int i, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bool14;
        String str67;
        String str68;
        String str69;
        String str70;
        String str71;
        BaseBoolInt baseBoolInt22;
        VideoLiveInfo videoLiveInfo2;
        BaseBoolInt baseBoolInt23;
        String str72;
        String str73;
        BaseBoolInt baseBoolInt24;
        BaseBoolInt baseBoolInt25;
        Boolean bool15;
        String str74;
        String str75;
        String str76;
        String str77;
        String str78;
        String str79;
        UsersUserRelation usersUserRelation2;
        UsersUserMin usersUserMin2;
        UsersPersonal usersPersonal2;
        List list8;
        List list9;
        FriendsRequestsMutual friendsRequestsMutual2;
        String str80;
        String str81;
        Integer num14;
        Boolean bool16;
        BaseBoolInt baseBoolInt26;
        List list10;
        String str82;
        String str83;
        String str84;
        String str85;
        String str86;
        String str87;
        String str88;
        String str89;
        String str90;
        String str91;
        String str92;
        List list11;
        String str93;
        Boolean bool17;
        String str94;
        Boolean bool18;
        String str95;
        Boolean bool19;
        String str96;
        UsersUserCounters usersUserCounters2;
        BaseCity baseCity2;
        String str97;
        BaseCountry baseCountry2;
        BaseBoolInt baseBoolInt27;
        Float f11;
        OwnerState ownerState2;
        String str98;
        String str99;
        String str100;
        String str101;
        String str102;
        String str103;
        BaseBoolInt baseBoolInt28;
        BaseBoolInt baseBoolInt29;
        BaseBoolInt baseBoolInt30;
        BaseBoolInt baseBoolInt31;
        BaseBoolInt baseBoolInt32;
        BaseBoolInt baseBoolInt33;
        UsersUserType usersUserType2;
        String str104;
        String str105;
        Boolean bool20;
        String str106;
        String str107;
        String str108;
        String str109;
        String str110;
        String str111;
        String str112;
        PhotosPhoto photosPhoto2;
        String str113;
        Integer num15;
        Boolean bool21;
        WallDefault wallDefault2;
        Boolean bool22;
        Boolean bool23;
        Boolean bool24;
        String str114;
        String str115;
        String str116;
        String str117;
        String str118;
        String str119;
        String str120;
        AudioAudio audioAudio2;
        String str121;
        String str122;
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
        String str123;
        Integer num22;
        Integer num23;
        String str124;
        Integer num24;
        String str125;
        Boolean bool25;
        Integer num25;
        Boolean bool26;
        List list13;
        List list14;
        BaseSex baseSex2;
        String str126;
        String str127;
        UsersOnlineInfo usersOnlineInfo2;
        BaseBoolInt baseBoolInt38;
        BaseBoolInt baseBoolInt39;
        Integer num26;
        BaseBoolInt baseBoolInt40;
        BaseBoolInt baseBoolInt41;
        FriendsFriendStatusStatus friendsFriendStatusStatus2;
        String str128;
        String str129;
        String str130;
        UserId userId2;
        String str131;
        BaseBoolInt baseBoolInt42;
        String str132;
        String str133 = (i & 2) != 0 ? null : str;
        String str134 = (i & 4) != 0 ? null : str2;
        String str135 = (i & 8) != 0 ? null : str3;
        String str136 = (i & 16) != 0 ? null : str4;
        String str137 = (i & 32) != 0 ? null : str5;
        String str138 = (i & 64) != 0 ? null : str6;
        String str139 = (i & 128) != 0 ? null : str7;
        String str140 = (i & 256) != 0 ? null : str8;
        String str141 = (i & 512) != 0 ? null : str9;
        String str142 = (i & 1024) != 0 ? null : str10;
        String str143 = (i & 2048) != 0 ? null : str11;
        String str144 = str133;
        String str145 = (i & 4096) != 0 ? null : str12;
        String str146 = (i & 8192) != 0 ? null : str13;
        String str147 = (i & 16384) != 0 ? null : str14;
        String str148 = (i & 32768) != 0 ? null : str15;
        String str149 = (i & 65536) != 0 ? null : str16;
        String str150 = (i & 131072) != 0 ? null : str17;
        String str151 = (i & 262144) != 0 ? null : str18;
        BaseCity baseCity3 = (i & 524288) != 0 ? null : baseCity;
        BaseCountry baseCountry3 = (i & 1048576) != 0 ? null : baseCountry;
        Float f12 = (i & 2097152) != 0 ? null : f10;
        OwnerState ownerState3 = (i & 4194304) != 0 ? null : ownerState;
        String str152 = (i & 8388608) != 0 ? null : str19;
        String str153 = (i & 16777216) != 0 ? null : str20;
        String str154 = (i & 33554432) != 0 ? null : str21;
        String str155 = (i & 67108864) != 0 ? null : str22;
        String str156 = (i & 134217728) != 0 ? null : str23;
        String str157 = (i & 268435456) != 0 ? null : str24;
        BaseBoolInt baseBoolInt43 = (i & 536870912) != 0 ? null : baseBoolInt;
        BaseBoolInt baseBoolInt44 = (i & 1073741824) != 0 ? null : baseBoolInt2;
        BaseBoolInt baseBoolInt45 = (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : baseBoolInt3;
        BaseBoolInt baseBoolInt46 = (i10 & 1) != 0 ? null : baseBoolInt4;
        BaseBoolInt baseBoolInt47 = (i10 & 2) != 0 ? null : baseBoolInt5;
        BaseBoolInt baseBoolInt48 = (i10 & 4) != 0 ? null : baseBoolInt6;
        BaseBoolInt baseBoolInt49 = (i10 & 8) != 0 ? null : baseBoolInt7;
        UsersUserType usersUserType3 = (i10 & 16) != 0 ? null : usersUserType;
        String str158 = (i10 & 32) != 0 ? null : str25;
        String str159 = (i10 & 64) != 0 ? null : str26;
        BaseBoolInt baseBoolInt50 = baseBoolInt45;
        String str160 = (i10 & 128) != 0 ? null : str27;
        String str161 = (i10 & 256) != 0 ? null : str28;
        String str162 = (i10 & 512) != 0 ? null : str29;
        String str163 = (i10 & 1024) != 0 ? null : str30;
        String str164 = (i10 & 2048) != 0 ? null : str31;
        BaseBoolInt baseBoolInt51 = (i10 & 4096) != 0 ? null : baseBoolInt8;
        VideoLiveInfo videoLiveInfo3 = (i10 & 8192) != 0 ? null : videoLiveInfo;
        BaseBoolInt baseBoolInt52 = (i10 & 16384) != 0 ? null : baseBoolInt9;
        Boolean bool27 = (i10 & 32768) != 0 ? null : bool;
        String str165 = (i10 & 65536) != 0 ? null : str32;
        String str166 = (i10 & 131072) != 0 ? null : str33;
        String str167 = (i10 & 262144) != 0 ? null : str34;
        String str168 = (i10 & 524288) != 0 ? null : str35;
        String str169 = (i10 & 1048576) != 0 ? null : str36;
        String str170 = (i10 & 2097152) != 0 ? null : str37;
        String str171 = (i10 & 4194304) != 0 ? null : str38;
        PhotosPhoto photosPhoto3 = (i10 & 8388608) != 0 ? null : photosPhoto;
        String str172 = (i10 & 16777216) != 0 ? null : str39;
        Integer num27 = (i10 & 33554432) != 0 ? null : num;
        Boolean bool28 = (i10 & 67108864) != 0 ? null : bool2;
        WallDefault wallDefault3 = (i10 & 134217728) != 0 ? null : wallDefault;
        Boolean bool29 = (i10 & 268435456) != 0 ? null : bool3;
        Boolean bool30 = (i10 & 536870912) != 0 ? null : bool4;
        Boolean bool31 = (i10 & 1073741824) != 0 ? null : bool5;
        BaseBoolInt baseBoolInt53 = (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : baseBoolInt10;
        String str173 = (i11 & 1) != 0 ? null : str40;
        String str174 = (i11 & 2) != 0 ? null : str41;
        String str175 = (i11 & 4) != 0 ? null : str42;
        String str176 = (i11 & 8) != 0 ? null : str43;
        String str177 = (i11 & 16) != 0 ? null : str44;
        String str178 = (i11 & 32) != 0 ? null : str45;
        String str179 = (i11 & 64) != 0 ? null : str46;
        BaseBoolInt baseBoolInt54 = baseBoolInt52;
        String str180 = (i11 & 128) != 0 ? null : str47;
        String str181 = (i11 & 256) != 0 ? null : str48;
        BaseBoolInt baseBoolInt55 = (i11 & 512) != 0 ? null : baseBoolInt11;
        BaseBoolInt baseBoolInt56 = (i11 & 1024) != 0 ? null : baseBoolInt12;
        Boolean bool32 = (i11 & 2048) != 0 ? null : bool6;
        String str182 = (i11 & 4096) != 0 ? null : str49;
        String str183 = (i11 & 8192) != 0 ? null : str50;
        String str184 = (i11 & 16384) != 0 ? null : str51;
        AudioAudio audioAudio3 = (i11 & 32768) != 0 ? null : audioAudio;
        String str185 = (i11 & 65536) != 0 ? null : str52;
        String str186 = (i11 & 131072) != 0 ? null : str53;
        UsersLastSeen usersLastSeen3 = (i11 & 262144) != 0 ? null : usersLastSeen;
        UsersExports usersExports3 = (i11 & 524288) != 0 ? null : usersExports;
        BaseCropPhoto baseCropPhoto3 = (i11 & 1048576) != 0 ? null : baseCropPhoto;
        Integer num28 = (i11 & 2097152) != 0 ? null : num2;
        Integer num29 = (i11 & 4194304) != 0 ? null : num3;
        Integer num30 = (i11 & 8388608) != 0 ? null : num4;
        Integer num31 = (i11 & 16777216) != 0 ? null : num5;
        BaseBoolInt baseBoolInt57 = (i11 & 33554432) != 0 ? null : baseBoolInt13;
        BaseBoolInt baseBoolInt58 = (i11 & 67108864) != 0 ? null : baseBoolInt14;
        BaseBoolInt baseBoolInt59 = (i11 & 134217728) != 0 ? null : baseBoolInt15;
        BaseBoolInt baseBoolInt60 = (i11 & 268435456) != 0 ? null : baseBoolInt16;
        Integer num32 = (i11 & 536870912) != 0 ? null : num6;
        UsersOccupation usersOccupation3 = (i11 & 1073741824) != 0 ? null : usersOccupation;
        List list15 = (i11 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : list;
        List list16 = (i12 & 1) != 0 ? null : list2;
        Integer num33 = (i12 & 2) != 0 ? null : num7;
        String str187 = (i12 & 4) != 0 ? null : str54;
        Integer num34 = (i12 & 8) != 0 ? null : num8;
        Integer num35 = (i12 & 16) != 0 ? null : num9;
        String str188 = (i12 & 32) != 0 ? null : str55;
        Integer num36 = (i12 & 64) != 0 ? null : num10;
        String str189 = str184;
        String str190 = (i12 & 128) != 0 ? null : str56;
        String str191 = (i12 & 256) != 0 ? null : str57;
        String str192 = (i12 & 512) != 0 ? null : str58;
        UsersUserRelation usersUserRelation3 = (i12 & 1024) != 0 ? null : usersUserRelation;
        UsersUserMin usersUserMin3 = (i12 & 2048) != 0 ? null : usersUserMin;
        UsersPersonal usersPersonal3 = (i12 & 4096) != 0 ? null : usersPersonal;
        List list17 = (i12 & 8192) != 0 ? null : list3;
        List list18 = (i12 & 16384) != 0 ? null : list4;
        List list19 = (i12 & 32768) != 0 ? null : list5;
        Boolean bool33 = (i12 & 65536) != 0 ? null : bool7;
        Boolean bool34 = (i12 & 131072) != 0 ? null : bool8;
        Boolean bool35 = (i12 & 262144) != 0 ? null : bool9;
        UsersUserCounters usersUserCounters3 = (i12 & 524288) != 0 ? null : usersUserCounters;
        String str193 = (i12 & 1048576) != 0 ? null : str59;
        BaseBoolInt baseBoolInt61 = (i12 & 2097152) != 0 ? null : baseBoolInt17;
        String str194 = (i12 & 4194304) != 0 ? null : str60;
        Boolean bool36 = (i12 & 8388608) != 0 ? null : bool10;
        Integer num37 = (i12 & 16777216) != 0 ? null : num11;
        Boolean bool37 = (i12 & 33554432) != 0 ? null : bool11;
        List list20 = (i12 & 67108864) != 0 ? null : list6;
        List list21 = (i12 & 134217728) != 0 ? null : list7;
        BaseSex baseSex3 = (i12 & 268435456) != 0 ? null : baseSex;
        String str195 = (i12 & 536870912) != 0 ? null : str61;
        String str196 = (i12 & 1073741824) != 0 ? null : str62;
        String str197 = (i12 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : str63;
        UsersOnlineInfo usersOnlineInfo3 = (i13 & 1) != 0 ? null : usersOnlineInfo;
        BaseBoolInt baseBoolInt62 = (i13 & 2) != 0 ? null : baseBoolInt18;
        BaseBoolInt baseBoolInt63 = (i13 & 4) != 0 ? null : baseBoolInt19;
        Integer num38 = (i13 & 8) != 0 ? null : num12;
        BaseBoolInt baseBoolInt64 = (i13 & 16) != 0 ? null : baseBoolInt20;
        BaseBoolInt baseBoolInt65 = (i13 & 32) != 0 ? null : baseBoolInt21;
        FriendsFriendStatusStatus friendsFriendStatusStatus3 = (i13 & 64) != 0 ? null : friendsFriendStatusStatus;
        List list22 = list18;
        FriendsRequestsMutual friendsRequestsMutual3 = (i13 & 128) != 0 ? null : friendsRequestsMutual;
        String str198 = (i13 & 256) != 0 ? null : str64;
        String str199 = (i13 & 512) != 0 ? null : str65;
        Integer num39 = (i13 & 1024) != 0 ? null : num13;
        String str200 = (i13 & 2048) != 0 ? null : str66;
        Boolean bool38 = (i13 & 4096) != 0 ? null : bool12;
        if ((i13 & 8192) != 0) {
            bool14 = null;
            str67 = str160;
            str68 = str161;
            str69 = str162;
            str70 = str163;
            str71 = str164;
            baseBoolInt22 = baseBoolInt51;
            videoLiveInfo2 = videoLiveInfo3;
            baseBoolInt23 = baseBoolInt54;
            str72 = str180;
            str73 = str181;
            baseBoolInt24 = baseBoolInt55;
            baseBoolInt25 = baseBoolInt56;
            bool15 = bool32;
            str74 = str182;
            str75 = str183;
            str76 = str189;
            str77 = str190;
            str78 = str191;
            str79 = str192;
            usersUserRelation2 = usersUserRelation3;
            usersUserMin2 = usersUserMin3;
            usersPersonal2 = usersPersonal3;
            list8 = list17;
            list9 = list22;
            friendsRequestsMutual2 = friendsRequestsMutual3;
            str80 = str198;
            str81 = str199;
            num14 = num39;
            str130 = str200;
            bool16 = bool38;
            baseBoolInt26 = baseBoolInt53;
            list10 = list15;
            str82 = str197;
            str83 = str147;
            str84 = str143;
            str85 = str135;
            str86 = str136;
            str87 = str137;
            str88 = str138;
            str89 = str139;
            str90 = str140;
            str91 = str141;
            str92 = str142;
            list11 = list19;
            str93 = str148;
            bool17 = bool33;
            str94 = str149;
            bool18 = bool34;
            str95 = str150;
            bool19 = bool35;
            str96 = str151;
            usersUserCounters2 = usersUserCounters3;
            baseCity2 = baseCity3;
            str97 = str193;
            baseCountry2 = baseCountry3;
            baseBoolInt27 = baseBoolInt61;
            f11 = f12;
            ownerState2 = ownerState3;
            str98 = str152;
            str99 = str153;
            str100 = str154;
            str101 = str155;
            str102 = str156;
            str103 = str157;
            baseBoolInt28 = baseBoolInt43;
            baseBoolInt29 = baseBoolInt44;
            baseBoolInt30 = baseBoolInt46;
            baseBoolInt31 = baseBoolInt47;
            baseBoolInt32 = baseBoolInt48;
            baseBoolInt33 = baseBoolInt49;
            usersUserType2 = usersUserType3;
            str104 = str158;
            str105 = str159;
            bool20 = bool27;
            str106 = str165;
            str107 = str166;
            str108 = str167;
            str109 = str168;
            str110 = str169;
            str111 = str170;
            str112 = str171;
            photosPhoto2 = photosPhoto3;
            str113 = str172;
            num15 = num27;
            bool21 = bool28;
            wallDefault2 = wallDefault3;
            bool22 = bool29;
            bool23 = bool30;
            bool24 = bool31;
            str114 = str173;
            str115 = str174;
            str116 = str175;
            str117 = str176;
            str118 = str177;
            str119 = str178;
            str120 = str179;
            audioAudio2 = audioAudio3;
            str121 = str185;
            str122 = str186;
            usersLastSeen2 = usersLastSeen3;
            usersExports2 = usersExports3;
            baseCropPhoto2 = baseCropPhoto3;
            num16 = num28;
            num17 = num29;
            num18 = num30;
            num19 = num31;
            baseBoolInt34 = baseBoolInt57;
            baseBoolInt35 = baseBoolInt58;
            baseBoolInt36 = baseBoolInt59;
            baseBoolInt37 = baseBoolInt60;
            num20 = num32;
            usersOccupation2 = usersOccupation3;
            list12 = list16;
            num21 = num33;
            str123 = str187;
            num22 = num34;
            num23 = num35;
            str124 = str188;
            num24 = num36;
            str125 = str194;
            bool25 = bool36;
            num25 = num37;
            bool26 = bool37;
            list13 = list20;
            list14 = list21;
            baseSex2 = baseSex3;
            str126 = str195;
            str127 = str196;
            usersOnlineInfo2 = usersOnlineInfo3;
            baseBoolInt38 = baseBoolInt62;
            baseBoolInt39 = baseBoolInt63;
            num26 = num38;
            baseBoolInt40 = baseBoolInt64;
            baseBoolInt41 = baseBoolInt65;
            friendsFriendStatusStatus2 = friendsFriendStatusStatus3;
            str128 = str145;
            str129 = str146;
            baseBoolInt42 = baseBoolInt50;
            str132 = str134;
            userId2 = userId;
            str131 = str144;
        } else {
            bool14 = bool13;
            str67 = str160;
            str68 = str161;
            str69 = str162;
            str70 = str163;
            str71 = str164;
            baseBoolInt22 = baseBoolInt51;
            videoLiveInfo2 = videoLiveInfo3;
            baseBoolInt23 = baseBoolInt54;
            str72 = str180;
            str73 = str181;
            baseBoolInt24 = baseBoolInt55;
            baseBoolInt25 = baseBoolInt56;
            bool15 = bool32;
            str74 = str182;
            str75 = str183;
            str76 = str189;
            str77 = str190;
            str78 = str191;
            str79 = str192;
            usersUserRelation2 = usersUserRelation3;
            usersUserMin2 = usersUserMin3;
            usersPersonal2 = usersPersonal3;
            list8 = list17;
            list9 = list22;
            friendsRequestsMutual2 = friendsRequestsMutual3;
            str80 = str198;
            str81 = str199;
            num14 = num39;
            bool16 = bool38;
            baseBoolInt26 = baseBoolInt53;
            list10 = list15;
            str82 = str197;
            str83 = str147;
            str84 = str143;
            str85 = str135;
            str86 = str136;
            str87 = str137;
            str88 = str138;
            str89 = str139;
            str90 = str140;
            str91 = str141;
            str92 = str142;
            list11 = list19;
            str93 = str148;
            bool17 = bool33;
            str94 = str149;
            bool18 = bool34;
            str95 = str150;
            bool19 = bool35;
            str96 = str151;
            usersUserCounters2 = usersUserCounters3;
            baseCity2 = baseCity3;
            str97 = str193;
            baseCountry2 = baseCountry3;
            baseBoolInt27 = baseBoolInt61;
            f11 = f12;
            ownerState2 = ownerState3;
            str98 = str152;
            str99 = str153;
            str100 = str154;
            str101 = str155;
            str102 = str156;
            str103 = str157;
            baseBoolInt28 = baseBoolInt43;
            baseBoolInt29 = baseBoolInt44;
            baseBoolInt30 = baseBoolInt46;
            baseBoolInt31 = baseBoolInt47;
            baseBoolInt32 = baseBoolInt48;
            baseBoolInt33 = baseBoolInt49;
            usersUserType2 = usersUserType3;
            str104 = str158;
            str105 = str159;
            bool20 = bool27;
            str106 = str165;
            str107 = str166;
            str108 = str167;
            str109 = str168;
            str110 = str169;
            str111 = str170;
            str112 = str171;
            photosPhoto2 = photosPhoto3;
            str113 = str172;
            num15 = num27;
            bool21 = bool28;
            wallDefault2 = wallDefault3;
            bool22 = bool29;
            bool23 = bool30;
            bool24 = bool31;
            str114 = str173;
            str115 = str174;
            str116 = str175;
            str117 = str176;
            str118 = str177;
            str119 = str178;
            str120 = str179;
            audioAudio2 = audioAudio3;
            str121 = str185;
            str122 = str186;
            usersLastSeen2 = usersLastSeen3;
            usersExports2 = usersExports3;
            baseCropPhoto2 = baseCropPhoto3;
            num16 = num28;
            num17 = num29;
            num18 = num30;
            num19 = num31;
            baseBoolInt34 = baseBoolInt57;
            baseBoolInt35 = baseBoolInt58;
            baseBoolInt36 = baseBoolInt59;
            baseBoolInt37 = baseBoolInt60;
            num20 = num32;
            usersOccupation2 = usersOccupation3;
            list12 = list16;
            num21 = num33;
            str123 = str187;
            num22 = num34;
            num23 = num35;
            str124 = str188;
            num24 = num36;
            str125 = str194;
            bool25 = bool36;
            num25 = num37;
            bool26 = bool37;
            list13 = list20;
            list14 = list21;
            baseSex2 = baseSex3;
            str126 = str195;
            str127 = str196;
            usersOnlineInfo2 = usersOnlineInfo3;
            baseBoolInt38 = baseBoolInt62;
            baseBoolInt39 = baseBoolInt63;
            num26 = num38;
            baseBoolInt40 = baseBoolInt64;
            baseBoolInt41 = baseBoolInt65;
            friendsFriendStatusStatus2 = friendsFriendStatusStatus3;
            str128 = str145;
            str129 = str146;
            str130 = str200;
            userId2 = userId;
            str131 = str144;
            baseBoolInt42 = baseBoolInt50;
            str132 = str134;
        }
        this(userId2, str131, str132, str85, str86, str87, str88, str89, str90, str91, str92, str84, str128, str129, str83, str93, str94, str95, str96, baseCity2, baseCountry2, f11, ownerState2, str98, str99, str100, str101, str102, str103, baseBoolInt28, baseBoolInt29, baseBoolInt42, baseBoolInt30, baseBoolInt31, baseBoolInt32, baseBoolInt33, usersUserType2, str104, str105, str67, str68, str69, str70, str71, baseBoolInt22, videoLiveInfo2, baseBoolInt23, bool20, str106, str107, str108, str109, str110, str111, str112, photosPhoto2, str113, num15, bool21, wallDefault2, bool22, bool23, bool24, baseBoolInt26, str114, str115, str116, str117, str118, str119, str120, str72, str73, baseBoolInt24, baseBoolInt25, bool15, str74, str75, str76, audioAudio2, str121, str122, usersLastSeen2, usersExports2, baseCropPhoto2, num16, num17, num18, num19, baseBoolInt34, baseBoolInt35, baseBoolInt36, baseBoolInt37, num20, usersOccupation2, list10, list12, num21, str123, num22, num23, str124, num24, str77, str78, str79, usersUserRelation2, usersUserMin2, usersPersonal2, list8, list9, list11, bool17, bool18, bool19, usersUserCounters2, str97, baseBoolInt27, str125, bool25, num25, bool26, list13, list14, baseSex2, str126, str127, str82, usersOnlineInfo2, baseBoolInt38, baseBoolInt39, num26, baseBoolInt40, baseBoolInt41, friendsFriendStatusStatus2, friendsRequestsMutual2, str80, str81, num14, str130, bool16, bool14);
    }
}
