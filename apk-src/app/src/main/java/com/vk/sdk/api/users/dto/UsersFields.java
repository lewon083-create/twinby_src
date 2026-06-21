package com.vk.sdk.api.users.dto;

import com.appsflyer.AdRevenueScheme;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.sentry.protocol.Device;
import io.sentry.protocol.Geo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

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
public enum UsersFields {
    FIRST_NAME_NOM("first_name_nom"),
    FIRST_NAME_GEN("first_name_gen"),
    FIRST_NAME_DAT("first_name_dat"),
    FIRST_NAME_ACC("first_name_acc"),
    FIRST_NAME_INS("first_name_ins"),
    FIRST_NAME_ABL("first_name_abl"),
    LAST_NAME_NOM("last_name_nom"),
    LAST_NAME_GEN("last_name_gen"),
    LAST_NAME_DAT("last_name_dat"),
    LAST_NAME_ACC("last_name_acc"),
    LAST_NAME_INS("last_name_ins"),
    LAST_NAME_ABL("last_name_abl"),
    PHOTO_ID("photo_id"),
    VERIFIED("verified"),
    SEX("sex"),
    BDATE("bdate"),
    BIRTHDATE("birthdate"),
    BDATE_VISIBILITY("bdate_visibility"),
    CITY(Geo.JsonKeys.CITY),
    COUNTRY(AdRevenueScheme.COUNTRY),
    HOME_TOWN("home_town"),
    HAS_PHOTO("has_photo"),
    PHOTO("photo"),
    PHOTO_REC("photo_rec"),
    PHOTO_50("photo_50"),
    PHOTO_100("photo_100"),
    PHOTO_200_ORIG("photo_200_orig"),
    PHOTO_200("photo_200"),
    PHOTO_400("photo_400"),
    PHOTO_400_ORIG("photo_400_orig"),
    PHOTO_BIG("photo_big"),
    PHOTO_MEDIUM("photo_medium"),
    PHOTO_MEDIUM_REC("photo_medium_rec"),
    PHOTO_MAX("photo_max"),
    PHOTO_MAX_ORIG("photo_max_orig"),
    PHOTO_MAX_SIZE("photo_max_size"),
    PROFILE_BUTTONS("profile_buttons"),
    PROFILE_BUTTONS_TABLET("profile_buttons_tablet"),
    THIRD_PARTY_BUTTONS("third_party_buttons"),
    ONLINE(Device.JsonKeys.ONLINE),
    LISTS("lists"),
    DOMAIN("domain"),
    HAS_MOBILE("has_mobile"),
    CONTACTS("contacts"),
    LANG(VKApiCodes.PARAM_LANG),
    LANGUAGE("language"),
    CAN_CALL("can_call"),
    SITE("site"),
    EDUCATION("education"),
    UNIVERSITIES("universities"),
    SCHOOLS("schools"),
    STATUS("status"),
    LAST_SEEN("last_seen"),
    FOLLOWERS_COUNT("followers_count"),
    COUNTERS("counters"),
    COMMON_COUNT("common_count"),
    ONLINE_INFO("online_info"),
    CONTACT_NAME("contact_name"),
    OCCUPATION("occupation"),
    NICKNAME("nickname"),
    RELATIVES("relatives"),
    RELATION("relation"),
    PERSONAL("personal"),
    CONNECTIONS("connections"),
    EXPORTS("exports"),
    WALL_COMMENTS("wall_comments"),
    WALL_DEFAULT("wall_default"),
    IS_STUDENT("is_student"),
    ACTIVITIES("activities"),
    ACTIVITY("activity"),
    INTERESTS("interests"),
    IMAGE_STATUS("image_status"),
    MUSIC("music"),
    MUSIC_AWARDS("music_awards"),
    MOVIES("movies"),
    TV("tv"),
    BOOKS("books"),
    BUTTONS("buttons"),
    IS_NO_INDEX("is_no_index"),
    GAMES("games"),
    ABOUT("about"),
    QUOTES("quotes"),
    CAN_POST("can_post"),
    CAN_SEE_ALL_POSTS("can_see_all_posts"),
    CAN_SEE_AUDIO("can_see_audio"),
    CAN_SEE_GIFTS("can_see_gifts"),
    WORK("work"),
    PLACES("places"),
    CAN_WRITE_PRIVATE_MESSAGE("can_write_private_message"),
    CAN_SEND_FRIEND_REQUEST("can_send_friend_request"),
    CAN_BE_INVITED_GROUP("can_be_invited_group"),
    CAN_UPLOAD_DOC("can_upload_doc"),
    IS_FAVORITE("is_favorite"),
    IS_HIDDEN_FROM_FEED("is_hidden_from_feed"),
    TIMEZONE("timezone"),
    SCREEN_NAME("screen_name"),
    MAIDEN_NAME("maiden_name"),
    CROP_PHOTO("crop_photo"),
    IS_FRIEND("is_friend"),
    FRIEND_STATUS("friend_status"),
    CAREER("career"),
    MILITARY("military"),
    BLACKLISTED("blacklisted"),
    BLACKLISTED_BY_ME("blacklisted_by_me"),
    CAN_SUBSCRIBE_POSTS("can_subscribe_posts"),
    DESCRIPTIONS("descriptions"),
    TRENDING("trending"),
    MUTUAL("mutual"),
    FRIENDSHIP_WEEKS("friendship_weeks"),
    CAN_INVITE_TO_CHATS("can_invite_to_chats"),
    STORIES_ARCHIVE_COUNT("stories_archive_count"),
    HAS_UNSEEN_STORIES("has_unseen_stories"),
    VIDEO_LIVE("video_live"),
    VIDEO_LIVE_LEVEL("video_live_level"),
    VIDEO_LIVE_COUNT("video_live_count"),
    CLIPS_COUNT("clips_count"),
    SERVICE_DESCRIPTION("service_description"),
    IS_DEAD("is_dead"),
    TEST("test"),
    GIFTS_TOOLTIP("gifts_tooltip"),
    EMOJI_STATUS("emoji_status"),
    CAN_CALL_FROM_GROUP("can_call_from_group"),
    CAN_SEE_WISHES("can_see_wishes"),
    IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED("is_video_live_notifications_blocked"),
    IS_ADULT("is_adult"),
    IS_SUBSCRIBED("is_subscribed"),
    IS_SUBSCRIBED_STORIES("is_subscribed_stories"),
    CAN_SUBSCRIBE_STORIES("can_subscribe_stories"),
    CAN_ASK_QUESTION("can_ask_question"),
    CAN_ASK_ANONYMOUS("can_ask_anonymous"),
    IS_SUBSCRIBED_PODCASTS("is_subscribed_podcasts"),
    CAN_SUBSCRIBE_PODCASTS("can_subscribe_podcasts"),
    SUBSCRIPTION_COUNTRY("subscription_country"),
    HAS_EMAIL("has_email"),
    HAS_RIGHTS("has_rights"),
    SYS_USERNAME("sys_username"),
    EMPLOYEE_MARK("employee_mark"),
    RIGHTS_LOCATION("rights_location");


    @NotNull
    private final String value;

    UsersFields(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
