package com.vk.sdk.api.base.dto;

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
public enum BaseUserGroupFields {
    ABOUT("about"),
    ACTION_BUTTON("action_button"),
    ACTIVITIES("activities"),
    ACTIVITY("activity"),
    ADDRESSES("addresses"),
    ADMIN_LEVEL("admin_level"),
    AGE_LIMITS("age_limits"),
    AUTHOR_ID("author_id"),
    BAN_INFO(VKApiCodes.PARAM_BAN_INFO),
    BDATE("bdate"),
    BLACKLISTED("blacklisted"),
    BLACKLISTED_BY_ME("blacklisted_by_me"),
    BOOKS("books"),
    CAN_CREATE_TOPIC("can_create_topic"),
    CAN_MESSAGE("can_message"),
    IS_WIDGET_MESSAGES_ENABLED("is_widget_messages_enabled"),
    CAN_POST("can_post"),
    CAN_SEE_ALL_POSTS("can_see_all_posts"),
    CAN_SEE_AUDIO("can_see_audio"),
    CAN_SEND_FRIEND_REQUEST("can_send_friend_request"),
    CAN_UPLOAD_VIDEO("can_upload_video"),
    CAN_WRITE_PRIVATE_MESSAGE("can_write_private_message"),
    CAREER("career"),
    CITY(Geo.JsonKeys.CITY),
    COMMON_COUNT("common_count"),
    CONNECTIONS("connections"),
    CONTACTS("contacts"),
    COUNTERS("counters"),
    COUNTRY(AdRevenueScheme.COUNTRY),
    COVER("cover"),
    CROP_PHOTO("crop_photo"),
    DEACTIVATED("deactivated"),
    DESCRIPTION("description"),
    DOMAIN("domain"),
    EDUCATION("education"),
    EXPORTS("exports"),
    FINISH_DATE("finish_date"),
    FIXED_POST("fixed_post"),
    FOLLOWERS_COUNT("followers_count"),
    FRIEND_STATUS("friend_status"),
    GAMES("games"),
    HAS_MARKET_APP("has_market_app"),
    HAS_MOBILE("has_mobile"),
    HAS_PHOTO("has_photo"),
    HOME_TOWN("home_town"),
    ID("id"),
    INTERESTS("interests"),
    IS_ADMIN("is_admin"),
    IS_CLOSED("is_closed"),
    IS_FAVORITE("is_favorite"),
    IS_FRIEND("is_friend"),
    IS_HIDDEN_FROM_FEED("is_hidden_from_feed"),
    IS_MEMBER("is_member"),
    IS_MESSAGES_BLOCKED("is_messages_blocked"),
    CAN_SEND_NOTIFY("can_send_notify"),
    IS_SUBSCRIBED("is_subscribed"),
    LAST_SEEN("last_seen"),
    LINKS("links"),
    LISTS("lists"),
    MAIDEN_NAME("maiden_name"),
    MAIN_ALBUM_ID("main_album_id"),
    MAIN_SECTION("main_section"),
    MARKET("market"),
    MEMBER_STATUS("member_status"),
    MEMBERS_COUNT("members_count"),
    MILITARY("military"),
    MOVIES("movies"),
    MUSIC("music"),
    NAME("name"),
    NICKNAME("nickname"),
    OCCUPATION("occupation"),
    ONLINE(Device.JsonKeys.ONLINE),
    ONLINE_STATUS("online_status"),
    PERSONAL("personal"),
    PHONE("phone"),
    PHOTO_100("photo_100"),
    PHOTO_200("photo_200"),
    PHOTO_200_ORIG("photo_200_orig"),
    PHOTO_400_ORIG("photo_400_orig"),
    PHOTO_50("photo_50"),
    PHOTO_ID("photo_id"),
    PHOTO_MAX("photo_max"),
    PHOTO_MAX_ORIG("photo_max_orig"),
    QUOTES("quotes"),
    RELATION("relation"),
    RELATIVES("relatives"),
    SCHOOLS("schools"),
    SCREEN_NAME("screen_name"),
    SEX("sex"),
    SITE("site"),
    START_DATE("start_date"),
    STATUS("status"),
    TIMEZONE("timezone"),
    TRENDING("trending"),
    TV("tv"),
    TYPE("type"),
    UNIVERSITIES("universities"),
    VERIFIED("verified"),
    WALL_COMMENTS("wall_comments"),
    WIKI_PAGE("wiki_page"),
    VK_ADMIN_STATUS("vk_admin_status");


    @NotNull
    private final String value;

    BaseUserGroupFields(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
