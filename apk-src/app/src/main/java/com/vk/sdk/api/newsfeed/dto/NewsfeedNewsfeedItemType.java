package com.vk.sdk.api.newsfeed.dto;

import io.sentry.rrweb.RRWebVideoEvent;
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
public enum NewsfeedNewsfeedItemType {
    POST("post"),
    PHOTO("photo"),
    PHOTO_TAG("photo_tag"),
    WALL_PHOTO("wall_photo"),
    FRIEND("friend"),
    AUDIO("audio"),
    VIDEO(RRWebVideoEvent.EVENT_TAG),
    TOPIC("topic"),
    DIGEST("digest"),
    STORIES("stories"),
    CLIPS("clips"),
    PROMO_BUTTON("promo_button"),
    RECOMMENDED_GROUPS("recommended_groups"),
    TAGS_SUGGESTIONS("tags_suggestions"),
    GAMES_CAROUSEL("games_carousel"),
    FEEDBACK_POLL("feedback_poll"),
    ANIMATED_BLOCK("animated_block"),
    TEXTLIVE("textlive"),
    VIDEOS_PROMO("videos_promo"),
    RECOMMENDED_ARTISTS("recommended_artists"),
    RECOMMENDED_PLAYLISTS("recommended_playlists"),
    CLIPS_AUTOPLAY("clips_autoplay"),
    RECOMMENDED_GAME("recommended_game"),
    CLIPS_CHALLENGES("clips_challenges"),
    EXPERT_CARD("expert_card"),
    VIDEOS_FOR_YOU("videos_for_you"),
    LIKED_BY_FRIENDS_GROUPS("liked_by_friends_groups"),
    RECOMMENDED_MINI_APP("recommended_mini_app"),
    NOTE("note"),
    AUDIO_PLAYLIST("audio_playlist"),
    CLIP("clip"),
    CLIPS_BLOCK("clips_block"),
    VIDEOS_FOR_YOU_BLOCK("videos_for_you_block"),
    MINI_APPS_CAROUSEL("mini_apps_carousel"),
    VIDEO_POSTCARD("video_postcard");


    @NotNull
    private final String value;

    NewsfeedNewsfeedItemType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
