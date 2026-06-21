package com.vk.sdk.api.account.dto;

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
public enum AccountSetInfoName {
    COMMUNITY_COMMENTS("community_comments"),
    FAVE_INTRO("fave_intro"),
    FEED_TYPE("feed_type"),
    FORCE_STORE_REVIEW("force_store_review"),
    IM_USER_NAME_TYPE("im_user_name_type"),
    INTRO("intro"),
    IS_RECOGNIZE_BLOCK_FRIENDS_PHOTO_ENABLED("is_recognize_block_friends_photo_enabled"),
    IS_RECOGNIZE_BLOCK_ME_PHOTO_ENABLED("is_recognize_block_me_photo_enabled"),
    IS_RECOGNIZE_FIND_FRIENDS("is_recognize_find_friends"),
    IS_RECOGNIZE_PHOTO_ME_ENABLED("is_recognize_photo_me_enabled"),
    IS_RECOGNIZE_SHOW_ME_TO_FRIENDS("is_recognize_show_me_to_friends"),
    MARKET_ALBUMS_V2_INTRO("market_albums_v2_intro"),
    MARKET_ONBOARDING("market_onboarding"),
    MARKET_WISHLIST("market_wishlist"),
    MENU_INTRO("menu_intro"),
    MESSAGES_AUTO_UNARCHIVE("messages_auto_unarchive"),
    MESSAGES_MULTILINE_INPUT("messages_multiline_input"),
    MESSAGES_RECOMMENDATION_LIST_HIDDEN("messages_recommendation_list_hidden"),
    MESSAGES_TRANSCRIPT_AUTO_SHOW("messages_transcript_auto_show"),
    MONEY_P2P_INTRO("money_p2p_intro"),
    MUSIC_INTRO("music_intro"),
    NO_WALL_REPLIES("no_wall_replies"),
    OWN_POSTS_DEFAULT("own_posts_default"),
    SHOPPING_INTRO("shopping_intro"),
    SHOW_ONLY_NOT_MUTED_MESSAGES("show_only_not_muted_messages"),
    SHOW_VK_APPS_INTRO("show_vk_apps_intro"),
    TIMEZONE("timezone"),
    VISIBLE_TIME("visible_time"),
    WISHLISTS_AE_PROMOBANNER("wishlists_ae_promobanner");


    @NotNull
    private final String value;

    AccountSetInfoName(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
