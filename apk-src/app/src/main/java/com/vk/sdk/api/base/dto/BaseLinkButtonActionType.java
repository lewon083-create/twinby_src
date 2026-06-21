package com.vk.sdk.api.base.dto;

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
public enum BaseLinkButtonActionType {
    OPEN_URL("open_url"),
    JOIN_GROUP_AND_OPEN_URL("join_group_and_open_url"),
    OPEN_SECTION("open_section"),
    FOLLOW("follow"),
    UPLOAD_VIDEO("upload_video"),
    CREATE_PLAYLIST("create_playlist"),
    CREATE_ALBUM("create_album"),
    FRIENDS_LISTS("friends_lists"),
    FRIENDS_SORT_MODES("friends_sort_modes"),
    ADD_FRIEND("add_friend"),
    QR_CAMERA("qr_camera"),
    FRIENDS_REQUESTS("friends_requests"),
    OPEN_SCREEN("open_screen"),
    OPEN_SCREEN_LARGE("open_screen_large"),
    FRIENDS_MESSAGE("friends_message"),
    FRIENDS_CALL("friends_call"),
    FRIENDS_SEND_GIFT("friends_send_gift"),
    FRIENDS_LABEL("friends_label"),
    PLAY_AUDIOS_FROM_BLOCK("play_audios_from_block"),
    PLAY_SHUFFLED_AUDIOS_FROM_BLOCK("play_shuffled_audios_from_block"),
    UNFOLLOW_ARTIST("unfollow_artist"),
    CREATE_GROUP("create_group"),
    CLOSE_NOTIFICATION("close_notification"),
    SWITCH_SECTION("switch_section"),
    CLEAR_RECENT_GROUPS("clear_recent_groups"),
    CLOSE_CATALOG_BANNER("close_catalog_banner"),
    ENABLE_TOP_NEWSFEED("enable_top_newsfeed"),
    GROUPS_ADVERTISEMENT("groups_advertisement"),
    OWNER_BUTTON("owner_button"),
    ENTER_EDIT_MODE("enter_edit_mode"),
    PLAYLISTS_LISTS("playlists_lists"),
    UNFOLLOW_CURATOR("unfollow_curator"),
    UNFOLLOW_MUSIC_OWNER("unfollow_music_owner"),
    REORDER_ITEMS("reorder_items"),
    EDIT_ITEMS("edit_items"),
    SELECT_SORTING("select_sorting"),
    MARKET_ABANDONED_CARTS("market_abandoned_carts"),
    MARKET_WRITE("market_write"),
    CALL("call"),
    MODAL_PAGE("modal_page"),
    LIVE_CATEGORIES("live_categories"),
    MOVIE_CATEGORIES("movie_categories"),
    TOGGLE_VIDEO_ALBUM_SUBSCRIPTION("toggle_video_album_subscription"),
    CLEAR_VIDEO_HISTORY("clear_video_history"),
    HELP_HINT("help_hint"),
    SHOW_RECOMMENDATIONS_FOR_POST("show_recommendations_for_post"),
    SHOW_FULL_POST("show_full_post"),
    OPEN_VKAPP("open_vkapp"),
    OPEN_GAME("open_game"),
    OPEN_INTERNAL_VKUI("open_internal_vkui"),
    SPECIALS_PERFORM_ACTION("specials_perform_action"),
    OPEN_BIRTHDAY_MODAL("open_birthday_modal"),
    SHARE("share"),
    PERFORM_ACTION_WITH_URL("perform_action_with_url");


    @NotNull
    private final String value;

    BaseLinkButtonActionType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
