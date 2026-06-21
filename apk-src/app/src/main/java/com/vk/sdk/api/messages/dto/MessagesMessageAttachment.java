package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.audio.dto.AudioAudio;
import com.vk.sdk.api.base.dto.BaseSticker;
import com.vk.sdk.api.calls.dto.CallsCall;
import com.vk.sdk.api.docs.dto.DocsDoc;
import com.vk.sdk.api.gifts.dto.GiftsLayout;
import com.vk.sdk.api.market.dto.MarketMarketAlbum;
import com.vk.sdk.api.market.dto.MarketMarketItem;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.polls.dto.PollsPoll;
import com.vk.sdk.api.stories.dto.StoriesStory;
import com.vk.sdk.api.video.dto.VideoVideoFull;
import com.vk.sdk.api.wall.dto.WallWallComment;
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
public final class MessagesMessageAttachment {

    @b("audio")
    @Nullable
    private final AudioAudio audio;

    @b("audio_message")
    @Nullable
    private final MessagesAudioMessage audioMessage;

    @b("call")
    @Nullable
    private final CallsCall call;

    @b("doc")
    @Nullable
    private final DocsDoc doc;

    @b("gift")
    @Nullable
    private final GiftsLayout gift;

    @b("graffiti")
    @Nullable
    private final MessagesGraffiti graffiti;

    @b("market")
    @Nullable
    private final MarketMarketItem market;

    @b("market_market_album")
    @Nullable
    private final MarketMarketAlbum marketMarketAlbum;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("poll")
    @Nullable
    private final PollsPoll poll;

    @b("sticker")
    @Nullable
    private final BaseSticker sticker;

    @b("story")
    @Nullable
    private final StoriesStory story;

    @b("type")
    @NotNull
    private final MessagesMessageAttachmentType type;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final VideoVideoFull video;

    @b("wall_reply")
    @Nullable
    private final WallWallComment wallReply;

    public MessagesMessageAttachment(@NotNull MessagesMessageAttachmentType type, @Nullable AudioAudio audioAudio, @Nullable MessagesAudioMessage messagesAudioMessage, @Nullable CallsCall callsCall, @Nullable DocsDoc docsDoc, @Nullable GiftsLayout giftsLayout, @Nullable MessagesGraffiti messagesGraffiti, @Nullable MarketMarketItem marketMarketItem, @Nullable MarketMarketAlbum marketMarketAlbum, @Nullable PhotosPhoto photosPhoto, @Nullable BaseSticker baseSticker, @Nullable StoriesStory storiesStory, @Nullable VideoVideoFull videoVideoFull, @Nullable WallWallComment wallWallComment, @Nullable PollsPoll pollsPoll) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.audio = audioAudio;
        this.audioMessage = messagesAudioMessage;
        this.call = callsCall;
        this.doc = docsDoc;
        this.gift = giftsLayout;
        this.graffiti = messagesGraffiti;
        this.market = marketMarketItem;
        this.marketMarketAlbum = marketMarketAlbum;
        this.photo = photosPhoto;
        this.sticker = baseSticker;
        this.story = storiesStory;
        this.video = videoVideoFull;
        this.wallReply = wallWallComment;
        this.poll = pollsPoll;
    }

    @NotNull
    public final MessagesMessageAttachmentType component1() {
        return this.type;
    }

    @Nullable
    public final PhotosPhoto component10() {
        return this.photo;
    }

    @Nullable
    public final BaseSticker component11() {
        return this.sticker;
    }

    @Nullable
    public final StoriesStory component12() {
        return this.story;
    }

    @Nullable
    public final VideoVideoFull component13() {
        return this.video;
    }

    @Nullable
    public final WallWallComment component14() {
        return this.wallReply;
    }

    @Nullable
    public final PollsPoll component15() {
        return this.poll;
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
    public final CallsCall component4() {
        return this.call;
    }

    @Nullable
    public final DocsDoc component5() {
        return this.doc;
    }

    @Nullable
    public final GiftsLayout component6() {
        return this.gift;
    }

    @Nullable
    public final MessagesGraffiti component7() {
        return this.graffiti;
    }

    @Nullable
    public final MarketMarketItem component8() {
        return this.market;
    }

    @Nullable
    public final MarketMarketAlbum component9() {
        return this.marketMarketAlbum;
    }

    @NotNull
    public final MessagesMessageAttachment copy(@NotNull MessagesMessageAttachmentType type, @Nullable AudioAudio audioAudio, @Nullable MessagesAudioMessage messagesAudioMessage, @Nullable CallsCall callsCall, @Nullable DocsDoc docsDoc, @Nullable GiftsLayout giftsLayout, @Nullable MessagesGraffiti messagesGraffiti, @Nullable MarketMarketItem marketMarketItem, @Nullable MarketMarketAlbum marketMarketAlbum, @Nullable PhotosPhoto photosPhoto, @Nullable BaseSticker baseSticker, @Nullable StoriesStory storiesStory, @Nullable VideoVideoFull videoVideoFull, @Nullable WallWallComment wallWallComment, @Nullable PollsPoll pollsPoll) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MessagesMessageAttachment(type, audioAudio, messagesAudioMessage, callsCall, docsDoc, giftsLayout, messagesGraffiti, marketMarketItem, marketMarketAlbum, photosPhoto, baseSticker, storiesStory, videoVideoFull, wallWallComment, pollsPoll);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAttachment)) {
            return false;
        }
        MessagesMessageAttachment messagesMessageAttachment = (MessagesMessageAttachment) obj;
        return this.type == messagesMessageAttachment.type && Intrinsics.a(this.audio, messagesMessageAttachment.audio) && Intrinsics.a(this.audioMessage, messagesMessageAttachment.audioMessage) && Intrinsics.a(this.call, messagesMessageAttachment.call) && Intrinsics.a(this.doc, messagesMessageAttachment.doc) && Intrinsics.a(this.gift, messagesMessageAttachment.gift) && Intrinsics.a(this.graffiti, messagesMessageAttachment.graffiti) && Intrinsics.a(this.market, messagesMessageAttachment.market) && Intrinsics.a(this.marketMarketAlbum, messagesMessageAttachment.marketMarketAlbum) && Intrinsics.a(this.photo, messagesMessageAttachment.photo) && Intrinsics.a(this.sticker, messagesMessageAttachment.sticker) && Intrinsics.a(this.story, messagesMessageAttachment.story) && Intrinsics.a(this.video, messagesMessageAttachment.video) && Intrinsics.a(this.wallReply, messagesMessageAttachment.wallReply) && Intrinsics.a(this.poll, messagesMessageAttachment.poll);
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
    public final CallsCall getCall() {
        return this.call;
    }

    @Nullable
    public final DocsDoc getDoc() {
        return this.doc;
    }

    @Nullable
    public final GiftsLayout getGift() {
        return this.gift;
    }

    @Nullable
    public final MessagesGraffiti getGraffiti() {
        return this.graffiti;
    }

    @Nullable
    public final MarketMarketItem getMarket() {
        return this.market;
    }

    @Nullable
    public final MarketMarketAlbum getMarketMarketAlbum() {
        return this.marketMarketAlbum;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final PollsPoll getPoll() {
        return this.poll;
    }

    @Nullable
    public final BaseSticker getSticker() {
        return this.sticker;
    }

    @Nullable
    public final StoriesStory getStory() {
        return this.story;
    }

    @NotNull
    public final MessagesMessageAttachmentType getType() {
        return this.type;
    }

    @Nullable
    public final VideoVideoFull getVideo() {
        return this.video;
    }

    @Nullable
    public final WallWallComment getWallReply() {
        return this.wallReply;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        AudioAudio audioAudio = this.audio;
        int iHashCode2 = (iHashCode + (audioAudio == null ? 0 : audioAudio.hashCode())) * 31;
        MessagesAudioMessage messagesAudioMessage = this.audioMessage;
        int iHashCode3 = (iHashCode2 + (messagesAudioMessage == null ? 0 : messagesAudioMessage.hashCode())) * 31;
        CallsCall callsCall = this.call;
        int iHashCode4 = (iHashCode3 + (callsCall == null ? 0 : callsCall.hashCode())) * 31;
        DocsDoc docsDoc = this.doc;
        int iHashCode5 = (iHashCode4 + (docsDoc == null ? 0 : docsDoc.hashCode())) * 31;
        GiftsLayout giftsLayout = this.gift;
        int iHashCode6 = (iHashCode5 + (giftsLayout == null ? 0 : giftsLayout.hashCode())) * 31;
        MessagesGraffiti messagesGraffiti = this.graffiti;
        int iHashCode7 = (iHashCode6 + (messagesGraffiti == null ? 0 : messagesGraffiti.hashCode())) * 31;
        MarketMarketItem marketMarketItem = this.market;
        int iHashCode8 = (iHashCode7 + (marketMarketItem == null ? 0 : marketMarketItem.hashCode())) * 31;
        MarketMarketAlbum marketMarketAlbum = this.marketMarketAlbum;
        int iHashCode9 = (iHashCode8 + (marketMarketAlbum == null ? 0 : marketMarketAlbum.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode10 = (iHashCode9 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        BaseSticker baseSticker = this.sticker;
        int iHashCode11 = (iHashCode10 + (baseSticker == null ? 0 : baseSticker.hashCode())) * 31;
        StoriesStory storiesStory = this.story;
        int iHashCode12 = (iHashCode11 + (storiesStory == null ? 0 : storiesStory.hashCode())) * 31;
        VideoVideoFull videoVideoFull = this.video;
        int iHashCode13 = (iHashCode12 + (videoVideoFull == null ? 0 : videoVideoFull.hashCode())) * 31;
        WallWallComment wallWallComment = this.wallReply;
        int iHashCode14 = (iHashCode13 + (wallWallComment == null ? 0 : wallWallComment.hashCode())) * 31;
        PollsPoll pollsPoll = this.poll;
        return iHashCode14 + (pollsPoll != null ? pollsPoll.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessagesMessageAttachment(type=" + this.type + ", audio=" + this.audio + ", audioMessage=" + this.audioMessage + ", call=" + this.call + ", doc=" + this.doc + ", gift=" + this.gift + ", graffiti=" + this.graffiti + ", market=" + this.market + ", marketMarketAlbum=" + this.marketMarketAlbum + ", photo=" + this.photo + ", sticker=" + this.sticker + ", story=" + this.story + ", video=" + this.video + ", wallReply=" + this.wallReply + ", poll=" + this.poll + ")";
    }

    public /* synthetic */ MessagesMessageAttachment(MessagesMessageAttachmentType messagesMessageAttachmentType, AudioAudio audioAudio, MessagesAudioMessage messagesAudioMessage, CallsCall callsCall, DocsDoc docsDoc, GiftsLayout giftsLayout, MessagesGraffiti messagesGraffiti, MarketMarketItem marketMarketItem, MarketMarketAlbum marketMarketAlbum, PhotosPhoto photosPhoto, BaseSticker baseSticker, StoriesStory storiesStory, VideoVideoFull videoVideoFull, WallWallComment wallWallComment, PollsPoll pollsPoll, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagesMessageAttachmentType, (i & 2) != 0 ? null : audioAudio, (i & 4) != 0 ? null : messagesAudioMessage, (i & 8) != 0 ? null : callsCall, (i & 16) != 0 ? null : docsDoc, (i & 32) != 0 ? null : giftsLayout, (i & 64) != 0 ? null : messagesGraffiti, (i & 128) != 0 ? null : marketMarketItem, (i & 256) != 0 ? null : marketMarketAlbum, (i & 512) != 0 ? null : photosPhoto, (i & 1024) != 0 ? null : baseSticker, (i & 2048) != 0 ? null : storiesStory, (i & 4096) != 0 ? null : videoVideoFull, (i & 8192) != 0 ? null : wallWallComment, (i & 16384) != 0 ? null : pollsPoll);
    }
}
