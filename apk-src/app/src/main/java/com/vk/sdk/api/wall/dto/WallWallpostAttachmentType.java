package com.vk.sdk.api.wall.dto;

import io.sentry.protocol.App;
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
public enum WallWallpostAttachmentType {
    PHOTO("photo"),
    PHOTOS_LIST("photos_list"),
    POSTED_PHOTO("posted_photo"),
    AUDIO("audio"),
    AUDIO_PLAYLIST("audio_playlist"),
    VIDEO(RRWebVideoEvent.EVENT_TAG),
    DOC("doc"),
    LINK("link"),
    GRAFFITI("graffiti"),
    NOTE("note"),
    APP(App.TYPE),
    POLL("poll"),
    PAGE("page"),
    PRETTY_CARDS("pretty_cards"),
    ALBUM("album"),
    MARKET_ALBUM("market_album"),
    MARKET("market"),
    EVENT("event"),
    MINI_APP("mini_app"),
    DONUT_LINK("donut_link"),
    ARTICLE("article"),
    TEXTLIVE("textlive"),
    TEXTPOST("textpost"),
    TEXTPOST_PUBLISH("textpost_publish"),
    SITUATIONAL_THEME("situational_theme"),
    GROUP("group"),
    STICKER("sticker"),
    PODCAST("podcast"),
    CURATOR("curator"),
    ARTIST("artist");


    @NotNull
    private final String value;

    WallWallpostAttachmentType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
