package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.audio.dto.AudioAudio;
import com.vk.sdk.api.base.dto.BaseLink;
import com.vk.sdk.api.docs.dto.DocsDoc;
import com.vk.sdk.api.market.dto.MarketMarketItem;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.video.dto.VideoVideo;
import com.vk.sdk.api.wall.dto.WallWallpostFull;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class MessagesHistoryMessageAttachment {

    @b("audio")
    @Nullable
    private final AudioAudio audio;

    @b("audio_message")
    @Nullable
    private final MessagesAudioMessage audioMessage;

    @b("doc")
    @Nullable
    private final DocsDoc doc;

    @b("graffiti")
    @Nullable
    private final MessagesGraffiti graffiti;

    @b("link")
    @Nullable
    private final BaseLink link;

    @b("market")
    @Nullable
    private final MarketMarketItem market;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("type")
    @NotNull
    private final MessagesHistoryMessageAttachmentType type;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final VideoVideo video;

    @b("wall")
    @Nullable
    private final WallWallpostFull wall;

    public MessagesHistoryMessageAttachment(@NotNull MessagesHistoryMessageAttachmentType type, @Nullable AudioAudio audioAudio, @Nullable MessagesAudioMessage messagesAudioMessage, @Nullable DocsDoc docsDoc, @Nullable MessagesGraffiti messagesGraffiti, @Nullable BaseLink baseLink, @Nullable MarketMarketItem marketMarketItem, @Nullable PhotosPhoto photosPhoto, @Nullable VideoVideo videoVideo, @Nullable WallWallpostFull wallWallpostFull) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.audio = audioAudio;
        this.audioMessage = messagesAudioMessage;
        this.doc = docsDoc;
        this.graffiti = messagesGraffiti;
        this.link = baseLink;
        this.market = marketMarketItem;
        this.photo = photosPhoto;
        this.video = videoVideo;
        this.wall = wallWallpostFull;
    }

    public static /* synthetic */ MessagesHistoryMessageAttachment copy$default(MessagesHistoryMessageAttachment messagesHistoryMessageAttachment, MessagesHistoryMessageAttachmentType messagesHistoryMessageAttachmentType, AudioAudio audioAudio, MessagesAudioMessage messagesAudioMessage, DocsDoc docsDoc, MessagesGraffiti messagesGraffiti, BaseLink baseLink, MarketMarketItem marketMarketItem, PhotosPhoto photosPhoto, VideoVideo videoVideo, WallWallpostFull wallWallpostFull, int i, Object obj) {
        if ((i & 1) != 0) {
            messagesHistoryMessageAttachmentType = messagesHistoryMessageAttachment.type;
        }
        if ((i & 2) != 0) {
            audioAudio = messagesHistoryMessageAttachment.audio;
        }
        if ((i & 4) != 0) {
            messagesAudioMessage = messagesHistoryMessageAttachment.audioMessage;
        }
        if ((i & 8) != 0) {
            docsDoc = messagesHistoryMessageAttachment.doc;
        }
        if ((i & 16) != 0) {
            messagesGraffiti = messagesHistoryMessageAttachment.graffiti;
        }
        if ((i & 32) != 0) {
            baseLink = messagesHistoryMessageAttachment.link;
        }
        if ((i & 64) != 0) {
            marketMarketItem = messagesHistoryMessageAttachment.market;
        }
        if ((i & 128) != 0) {
            photosPhoto = messagesHistoryMessageAttachment.photo;
        }
        if ((i & 256) != 0) {
            videoVideo = messagesHistoryMessageAttachment.video;
        }
        if ((i & 512) != 0) {
            wallWallpostFull = messagesHistoryMessageAttachment.wall;
        }
        VideoVideo videoVideo2 = videoVideo;
        WallWallpostFull wallWallpostFull2 = wallWallpostFull;
        MarketMarketItem marketMarketItem2 = marketMarketItem;
        PhotosPhoto photosPhoto2 = photosPhoto;
        MessagesGraffiti messagesGraffiti2 = messagesGraffiti;
        BaseLink baseLink2 = baseLink;
        return messagesHistoryMessageAttachment.copy(messagesHistoryMessageAttachmentType, audioAudio, messagesAudioMessage, docsDoc, messagesGraffiti2, baseLink2, marketMarketItem2, photosPhoto2, videoVideo2, wallWallpostFull2);
    }

    @NotNull
    public final MessagesHistoryMessageAttachmentType component1() {
        return this.type;
    }

    @Nullable
    public final WallWallpostFull component10() {
        return this.wall;
    }

    @Nullable
    public final AudioAudio component2() {
        return this.audio;
    }

    @Nullable
    public final MessagesAudioMessage component3() {
        return this.audioMessage;
    }

    @Nullable
    public final DocsDoc component4() {
        return this.doc;
    }

    @Nullable
    public final MessagesGraffiti component5() {
        return this.graffiti;
    }

    @Nullable
    public final BaseLink component6() {
        return this.link;
    }

    @Nullable
    public final MarketMarketItem component7() {
        return this.market;
    }

    @Nullable
    public final PhotosPhoto component8() {
        return this.photo;
    }

    @Nullable
    public final VideoVideo component9() {
        return this.video;
    }

    @NotNull
    public final MessagesHistoryMessageAttachment copy(@NotNull MessagesHistoryMessageAttachmentType type, @Nullable AudioAudio audioAudio, @Nullable MessagesAudioMessage messagesAudioMessage, @Nullable DocsDoc docsDoc, @Nullable MessagesGraffiti messagesGraffiti, @Nullable BaseLink baseLink, @Nullable MarketMarketItem marketMarketItem, @Nullable PhotosPhoto photosPhoto, @Nullable VideoVideo videoVideo, @Nullable WallWallpostFull wallWallpostFull) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MessagesHistoryMessageAttachment(type, audioAudio, messagesAudioMessage, docsDoc, messagesGraffiti, baseLink, marketMarketItem, photosPhoto, videoVideo, wallWallpostFull);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesHistoryMessageAttachment)) {
            return false;
        }
        MessagesHistoryMessageAttachment messagesHistoryMessageAttachment = (MessagesHistoryMessageAttachment) obj;
        return this.type == messagesHistoryMessageAttachment.type && Intrinsics.a(this.audio, messagesHistoryMessageAttachment.audio) && Intrinsics.a(this.audioMessage, messagesHistoryMessageAttachment.audioMessage) && Intrinsics.a(this.doc, messagesHistoryMessageAttachment.doc) && Intrinsics.a(this.graffiti, messagesHistoryMessageAttachment.graffiti) && Intrinsics.a(this.link, messagesHistoryMessageAttachment.link) && Intrinsics.a(this.market, messagesHistoryMessageAttachment.market) && Intrinsics.a(this.photo, messagesHistoryMessageAttachment.photo) && Intrinsics.a(this.video, messagesHistoryMessageAttachment.video) && Intrinsics.a(this.wall, messagesHistoryMessageAttachment.wall);
    }

    @Nullable
    public final AudioAudio getAudio() {
        return this.audio;
    }

    @Nullable
    public final MessagesAudioMessage getAudioMessage() {
        return this.audioMessage;
    }

    @Nullable
    public final DocsDoc getDoc() {
        return this.doc;
    }

    @Nullable
    public final MessagesGraffiti getGraffiti() {
        return this.graffiti;
    }

    @Nullable
    public final BaseLink getLink() {
        return this.link;
    }

    @Nullable
    public final MarketMarketItem getMarket() {
        return this.market;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @NotNull
    public final MessagesHistoryMessageAttachmentType getType() {
        return this.type;
    }

    @Nullable
    public final VideoVideo getVideo() {
        return this.video;
    }

    @Nullable
    public final WallWallpostFull getWall() {
        return this.wall;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        AudioAudio audioAudio = this.audio;
        int iHashCode2 = (iHashCode + (audioAudio == null ? 0 : audioAudio.hashCode())) * 31;
        MessagesAudioMessage messagesAudioMessage = this.audioMessage;
        int iHashCode3 = (iHashCode2 + (messagesAudioMessage == null ? 0 : messagesAudioMessage.hashCode())) * 31;
        DocsDoc docsDoc = this.doc;
        int iHashCode4 = (iHashCode3 + (docsDoc == null ? 0 : docsDoc.hashCode())) * 31;
        MessagesGraffiti messagesGraffiti = this.graffiti;
        int iHashCode5 = (iHashCode4 + (messagesGraffiti == null ? 0 : messagesGraffiti.hashCode())) * 31;
        BaseLink baseLink = this.link;
        int iHashCode6 = (iHashCode5 + (baseLink == null ? 0 : baseLink.hashCode())) * 31;
        MarketMarketItem marketMarketItem = this.market;
        int iHashCode7 = (iHashCode6 + (marketMarketItem == null ? 0 : marketMarketItem.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode8 = (iHashCode7 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        VideoVideo videoVideo = this.video;
        int iHashCode9 = (iHashCode8 + (videoVideo == null ? 0 : videoVideo.hashCode())) * 31;
        WallWallpostFull wallWallpostFull = this.wall;
        return iHashCode9 + (wallWallpostFull != null ? wallWallpostFull.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessagesHistoryMessageAttachment(type=" + this.type + ", audio=" + this.audio + ", audioMessage=" + this.audioMessage + ", doc=" + this.doc + ", graffiti=" + this.graffiti + ", link=" + this.link + ", market=" + this.market + ", photo=" + this.photo + ", video=" + this.video + ", wall=" + this.wall + ")";
    }

    public /* synthetic */ MessagesHistoryMessageAttachment(MessagesHistoryMessageAttachmentType messagesHistoryMessageAttachmentType, AudioAudio audioAudio, MessagesAudioMessage messagesAudioMessage, DocsDoc docsDoc, MessagesGraffiti messagesGraffiti, BaseLink baseLink, MarketMarketItem marketMarketItem, PhotosPhoto photosPhoto, VideoVideo videoVideo, WallWallpostFull wallWallpostFull, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagesHistoryMessageAttachmentType, (i & 2) != 0 ? null : audioAudio, (i & 4) != 0 ? null : messagesAudioMessage, (i & 8) != 0 ? null : docsDoc, (i & 16) != 0 ? null : messagesGraffiti, (i & 32) != 0 ? null : baseLink, (i & 64) != 0 ? null : marketMarketItem, (i & 128) != 0 ? null : photosPhoto, (i & 256) != 0 ? null : videoVideo, (i & 512) != 0 ? null : wallWallpostFull);
    }
}
