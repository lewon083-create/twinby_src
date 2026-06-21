package com.vk.sdk.api.wall.dto;

import com.vk.sdk.api.audio.dto.AudioAudio;
import com.vk.sdk.api.base.dto.BaseLink;
import com.vk.sdk.api.base.dto.BaseSticker;
import com.vk.sdk.api.docs.dto.DocsDoc;
import com.vk.sdk.api.market.dto.MarketMarketAlbum;
import com.vk.sdk.api.market.dto.MarketMarketItem;
import com.vk.sdk.api.pages.dto.PagesWikipageFull;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.video.dto.VideoVideo;
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
public final class WallCommentAttachment {

    @b("audio")
    @Nullable
    private final AudioAudio audio;

    @b("doc")
    @Nullable
    private final DocsDoc doc;

    @b("link")
    @Nullable
    private final BaseLink link;

    @b("market")
    @Nullable
    private final MarketMarketItem market;

    @b("market_market_album")
    @Nullable
    private final MarketMarketAlbum marketMarketAlbum;

    @b("note")
    @Nullable
    private final WallAttachedNote note;

    @b("page")
    @Nullable
    private final PagesWikipageFull page;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("sticker")
    @Nullable
    private final BaseSticker sticker;

    @b("type")
    @NotNull
    private final WallCommentAttachmentType type;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final VideoVideo video;

    public WallCommentAttachment(@NotNull WallCommentAttachmentType type, @Nullable AudioAudio audioAudio, @Nullable DocsDoc docsDoc, @Nullable BaseLink baseLink, @Nullable MarketMarketItem marketMarketItem, @Nullable MarketMarketAlbum marketMarketAlbum, @Nullable WallAttachedNote wallAttachedNote, @Nullable PagesWikipageFull pagesWikipageFull, @Nullable PhotosPhoto photosPhoto, @Nullable BaseSticker baseSticker, @Nullable VideoVideo videoVideo) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.audio = audioAudio;
        this.doc = docsDoc;
        this.link = baseLink;
        this.market = marketMarketItem;
        this.marketMarketAlbum = marketMarketAlbum;
        this.note = wallAttachedNote;
        this.page = pagesWikipageFull;
        this.photo = photosPhoto;
        this.sticker = baseSticker;
        this.video = videoVideo;
    }

    public static /* synthetic */ WallCommentAttachment copy$default(WallCommentAttachment wallCommentAttachment, WallCommentAttachmentType wallCommentAttachmentType, AudioAudio audioAudio, DocsDoc docsDoc, BaseLink baseLink, MarketMarketItem marketMarketItem, MarketMarketAlbum marketMarketAlbum, WallAttachedNote wallAttachedNote, PagesWikipageFull pagesWikipageFull, PhotosPhoto photosPhoto, BaseSticker baseSticker, VideoVideo videoVideo, int i, Object obj) {
        if ((i & 1) != 0) {
            wallCommentAttachmentType = wallCommentAttachment.type;
        }
        if ((i & 2) != 0) {
            audioAudio = wallCommentAttachment.audio;
        }
        if ((i & 4) != 0) {
            docsDoc = wallCommentAttachment.doc;
        }
        if ((i & 8) != 0) {
            baseLink = wallCommentAttachment.link;
        }
        if ((i & 16) != 0) {
            marketMarketItem = wallCommentAttachment.market;
        }
        if ((i & 32) != 0) {
            marketMarketAlbum = wallCommentAttachment.marketMarketAlbum;
        }
        if ((i & 64) != 0) {
            wallAttachedNote = wallCommentAttachment.note;
        }
        if ((i & 128) != 0) {
            pagesWikipageFull = wallCommentAttachment.page;
        }
        if ((i & 256) != 0) {
            photosPhoto = wallCommentAttachment.photo;
        }
        if ((i & 512) != 0) {
            baseSticker = wallCommentAttachment.sticker;
        }
        if ((i & 1024) != 0) {
            videoVideo = wallCommentAttachment.video;
        }
        BaseSticker baseSticker2 = baseSticker;
        VideoVideo videoVideo2 = videoVideo;
        PagesWikipageFull pagesWikipageFull2 = pagesWikipageFull;
        PhotosPhoto photosPhoto2 = photosPhoto;
        MarketMarketAlbum marketMarketAlbum2 = marketMarketAlbum;
        WallAttachedNote wallAttachedNote2 = wallAttachedNote;
        MarketMarketItem marketMarketItem2 = marketMarketItem;
        DocsDoc docsDoc2 = docsDoc;
        return wallCommentAttachment.copy(wallCommentAttachmentType, audioAudio, docsDoc2, baseLink, marketMarketItem2, marketMarketAlbum2, wallAttachedNote2, pagesWikipageFull2, photosPhoto2, baseSticker2, videoVideo2);
    }

    @NotNull
    public final WallCommentAttachmentType component1() {
        return this.type;
    }

    @Nullable
    public final BaseSticker component10() {
        return this.sticker;
    }

    @Nullable
    public final VideoVideo component11() {
        return this.video;
    }

    @Nullable
    public final AudioAudio component2() {
        return this.audio;
    }

    @Nullable
    public final DocsDoc component3() {
        return this.doc;
    }

    @Nullable
    public final BaseLink component4() {
        return this.link;
    }

    @Nullable
    public final MarketMarketItem component5() {
        return this.market;
    }

    @Nullable
    public final MarketMarketAlbum component6() {
        return this.marketMarketAlbum;
    }

    @Nullable
    public final WallAttachedNote component7() {
        return this.note;
    }

    @Nullable
    public final PagesWikipageFull component8() {
        return this.page;
    }

    @Nullable
    public final PhotosPhoto component9() {
        return this.photo;
    }

    @NotNull
    public final WallCommentAttachment copy(@NotNull WallCommentAttachmentType type, @Nullable AudioAudio audioAudio, @Nullable DocsDoc docsDoc, @Nullable BaseLink baseLink, @Nullable MarketMarketItem marketMarketItem, @Nullable MarketMarketAlbum marketMarketAlbum, @Nullable WallAttachedNote wallAttachedNote, @Nullable PagesWikipageFull pagesWikipageFull, @Nullable PhotosPhoto photosPhoto, @Nullable BaseSticker baseSticker, @Nullable VideoVideo videoVideo) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new WallCommentAttachment(type, audioAudio, docsDoc, baseLink, marketMarketItem, marketMarketAlbum, wallAttachedNote, pagesWikipageFull, photosPhoto, baseSticker, videoVideo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallCommentAttachment)) {
            return false;
        }
        WallCommentAttachment wallCommentAttachment = (WallCommentAttachment) obj;
        return this.type == wallCommentAttachment.type && Intrinsics.a(this.audio, wallCommentAttachment.audio) && Intrinsics.a(this.doc, wallCommentAttachment.doc) && Intrinsics.a(this.link, wallCommentAttachment.link) && Intrinsics.a(this.market, wallCommentAttachment.market) && Intrinsics.a(this.marketMarketAlbum, wallCommentAttachment.marketMarketAlbum) && Intrinsics.a(this.note, wallCommentAttachment.note) && Intrinsics.a(this.page, wallCommentAttachment.page) && Intrinsics.a(this.photo, wallCommentAttachment.photo) && Intrinsics.a(this.sticker, wallCommentAttachment.sticker) && Intrinsics.a(this.video, wallCommentAttachment.video);
    }

    @Nullable
    public final AudioAudio getAudio() {
        return this.audio;
    }

    @Nullable
    public final DocsDoc getDoc() {
        return this.doc;
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
    public final MarketMarketAlbum getMarketMarketAlbum() {
        return this.marketMarketAlbum;
    }

    @Nullable
    public final WallAttachedNote getNote() {
        return this.note;
    }

    @Nullable
    public final PagesWikipageFull getPage() {
        return this.page;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final BaseSticker getSticker() {
        return this.sticker;
    }

    @NotNull
    public final WallCommentAttachmentType getType() {
        return this.type;
    }

    @Nullable
    public final VideoVideo getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        AudioAudio audioAudio = this.audio;
        int iHashCode2 = (iHashCode + (audioAudio == null ? 0 : audioAudio.hashCode())) * 31;
        DocsDoc docsDoc = this.doc;
        int iHashCode3 = (iHashCode2 + (docsDoc == null ? 0 : docsDoc.hashCode())) * 31;
        BaseLink baseLink = this.link;
        int iHashCode4 = (iHashCode3 + (baseLink == null ? 0 : baseLink.hashCode())) * 31;
        MarketMarketItem marketMarketItem = this.market;
        int iHashCode5 = (iHashCode4 + (marketMarketItem == null ? 0 : marketMarketItem.hashCode())) * 31;
        MarketMarketAlbum marketMarketAlbum = this.marketMarketAlbum;
        int iHashCode6 = (iHashCode5 + (marketMarketAlbum == null ? 0 : marketMarketAlbum.hashCode())) * 31;
        WallAttachedNote wallAttachedNote = this.note;
        int iHashCode7 = (iHashCode6 + (wallAttachedNote == null ? 0 : wallAttachedNote.hashCode())) * 31;
        PagesWikipageFull pagesWikipageFull = this.page;
        int iHashCode8 = (iHashCode7 + (pagesWikipageFull == null ? 0 : pagesWikipageFull.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode9 = (iHashCode8 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        BaseSticker baseSticker = this.sticker;
        int iHashCode10 = (iHashCode9 + (baseSticker == null ? 0 : baseSticker.hashCode())) * 31;
        VideoVideo videoVideo = this.video;
        return iHashCode10 + (videoVideo != null ? videoVideo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WallCommentAttachment(type=" + this.type + ", audio=" + this.audio + ", doc=" + this.doc + ", link=" + this.link + ", market=" + this.market + ", marketMarketAlbum=" + this.marketMarketAlbum + ", note=" + this.note + ", page=" + this.page + ", photo=" + this.photo + ", sticker=" + this.sticker + ", video=" + this.video + ")";
    }

    public /* synthetic */ WallCommentAttachment(WallCommentAttachmentType wallCommentAttachmentType, AudioAudio audioAudio, DocsDoc docsDoc, BaseLink baseLink, MarketMarketItem marketMarketItem, MarketMarketAlbum marketMarketAlbum, WallAttachedNote wallAttachedNote, PagesWikipageFull pagesWikipageFull, PhotosPhoto photosPhoto, BaseSticker baseSticker, VideoVideo videoVideo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wallCommentAttachmentType, (i & 2) != 0 ? null : audioAudio, (i & 4) != 0 ? null : docsDoc, (i & 8) != 0 ? null : baseLink, (i & 16) != 0 ? null : marketMarketItem, (i & 32) != 0 ? null : marketMarketAlbum, (i & 64) != 0 ? null : wallAttachedNote, (i & 128) != 0 ? null : pagesWikipageFull, (i & 256) != 0 ? null : photosPhoto, (i & 512) != 0 ? null : baseSticker, (i & 1024) != 0 ? null : videoVideo);
    }
}
