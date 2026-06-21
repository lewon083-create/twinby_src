package com.vk.sdk.api.groups.dto;

import com.appsflyer.AdRevenueScheme;
import com.vk.api.sdk.exceptions.VKApiCodes;
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
public enum GroupsFields {
    MARKET("market"),
    MARKET_SERVICES("market_services"),
    MEMBER_STATUS("member_status"),
    IS_FAVORITE("is_favorite"),
    IS_SUBSCRIBED("is_subscribed"),
    IS_SUBSCRIBED_PODCASTS("is_subscribed_podcasts"),
    CAN_SUBSCRIBE_PODCASTS("can_subscribe_podcasts"),
    CITY(Geo.JsonKeys.CITY),
    COUNTRY(AdRevenueScheme.COUNTRY),
    VERIFIED("verified"),
    DESCRIPTION("description"),
    WIKI_PAGE("wiki_page"),
    MEMBERS_COUNT("members_count"),
    REQUESTS_COUNT("requests_count"),
    COUNTERS("counters"),
    COVER("cover"),
    CAN_POST("can_post"),
    CAN_SUGGEST("can_suggest"),
    CAN_UPLOAD_STORY("can_upload_story"),
    CAN_UPLOAD_DOC("can_upload_doc"),
    CAN_UPLOAD_VIDEO("can_upload_video"),
    CAN_UPLOAD_CLIP("can_upload_clip"),
    CAN_SEE_ALL_POSTS("can_see_all_posts"),
    CAN_CREATE_TOPIC("can_create_topic"),
    CROP_PHOTO("crop_photo"),
    ACTIVITY("activity"),
    FIXED_POST("fixed_post"),
    HAS_PHOTO("has_photo"),
    STATUS("status"),
    MAIN_ALBUM_ID("main_album_id"),
    LINKS("links"),
    CONTACTS("contacts"),
    SITE("site"),
    MAIN_SECTION("main_section"),
    SECONDARY_SECTION("secondary_section"),
    WALL("wall"),
    TRENDING("trending"),
    HAD_TORCH("had_torch"),
    CAN_MESSAGE("can_message"),
    IS_MARKET_CART_ENABLED("is_market_cart_enabled"),
    IS_MESSAGES_BLOCKED("is_messages_blocked"),
    CAN_SEND_NOTIFY("can_send_notify"),
    HAS_GROUP_CHANNEL("has_group_channel"),
    GROUP_CHANNEL("group_channel"),
    ONLINE_STATUS("online_status"),
    START_DATE("start_date"),
    FINISH_DATE("finish_date"),
    AGE_LIMITS("age_limits"),
    BAN_INFO(VKApiCodes.PARAM_BAN_INFO),
    ACTION_BUTTON("action_button"),
    AUTHOR_ID("author_id"),
    PHONE("phone"),
    HAS_MARKET_APP("has_market_app"),
    VKPAY_CAN_TRANSFER("vkpay_can_transfer"),
    VKPAY_RECEIVER_ID("vkpay_receiver_id"),
    USING_VKPAY_MARKET_APP("using_vkpay_market_app"),
    ADDRESSES("addresses"),
    LIVE_COVERS("live_covers"),
    IS_ADULT("is_adult"),
    IS_HIDDEN_FROM_FEED("is_hidden_from_feed"),
    CAN_SUBSCRIBE_POSTS("can_subscribe_posts"),
    CREATE_DATE("create_date"),
    MENU("menu"),
    WARNING_NOTIFICATION("warning_notification"),
    DONUT("donut"),
    DONUT_PAYMENT_INFO("donut_payment_info"),
    CAN_POST_DONUT("can_post_donut"),
    CAN_SEE_MEMBERS("can_see_members"),
    MSG_PUSH_ALLOWED("msg_push_allowed"),
    CHATS_STATUS("chats_status"),
    CAN_REPORT("can_report"),
    HAS_SUGGESTIONS("has_suggestions"),
    SHOW_SUGGESTIONS("show_suggestions"),
    VERIFICATION_END_TIME("verification_end_time"),
    CAN_MANAGE("can_manage"),
    CAN_VIEW_STATS("can_view_stats"),
    CAN_VIEW_POST_REACH_STATS("can_view_post_reach_stats"),
    STORIES_ARCHIVE_COUNT("stories_archive_count"),
    VIDEO_LIVE_LEVEL("video_live_level"),
    VIDEO_LIVE_COUNT("video_live_count"),
    CLIPS_COUNT("clips_count"),
    MICROLANDING("microlanding"),
    TARIFFS("tariffs"),
    HAS_UNSEEN_STORIES("has_unseen_stories"),
    LIKE("like"),
    YOULA_STATUS("youla_status"),
    YOULA_USE_WALLPOST_REDIRECT("youla_use_wallpost_redirect"),
    YOULA_USE_WALLPOST_REDIRECT_ONBOARDING("youla_use_wallpost_redirect_onboarding"),
    YOULA_WALLPOST_REDIRECT_MINIAPP_URL("youla_wallpost_redirect_miniapp_url"),
    CLASSIFIEDS_ANTIBARAHOLKA_DESIGN_VERSION("classifieds_antibaraholka_design_version"),
    IS_YOULA_POSTING_TO_WALL_ALLOWED("is_youla_posting_to_wall_allowed"),
    WORKI_USE_WALLPOST_REDIRECT("worki_use_wallpost_redirect"),
    IS_BUSINESS("is_business"),
    TEXTLIVE("textlive"),
    TEXTLIVES_COUNT("textlives_count"),
    FRIENDS("friends"),
    IS_WIDGET_MESSAGES_ENABLED("is_widget_messages_enabled"),
    DEACTIVATED_MESSAGE("deactivated_message"),
    WORKI_ACTION_MENU_ITEM("worki_action_menu_item"),
    YOULA_POSTING_METHOD("youla_posting_method"),
    MEMBERS_COUNT_TEXT("members_count_text");


    @NotNull
    private final String value;

    GroupsFields(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
