package com.vk.sdk.api.wall.dto;

import com.vk.sdk.api.audio.dto.AudioAudio;
import com.vk.sdk.api.base.dto.BaseLink;
import com.vk.sdk.api.docs.dto.DocsDoc;
import com.vk.sdk.api.events.dto.EventsEventAttach;
import com.vk.sdk.api.groups.dto.GroupsGroupAttach;
import com.vk.sdk.api.market.dto.MarketMarketAlbum;
import com.vk.sdk.api.market.dto.MarketMarketItem;
import com.vk.sdk.api.notes.dto.NotesNote;
import com.vk.sdk.api.pages.dto.PagesWikipageFull;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.photos.dto.PhotosPhotoAlbum;
import com.vk.sdk.api.polls.dto.PollsPoll;
import com.vk.sdk.api.video.dto.VideoVideoFull;
import io.sentry.protocol.App;
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
public final class WallWallpostAttachment {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("album")
    @Nullable
    private final PhotosPhotoAlbum album;

    @b(App.TYPE)
    @Nullable
    private final WallAppPost app;

    @b("audio")
    @Nullable
    private final AudioAudio audio;

    @b("doc")
    @Nullable
    private final DocsDoc doc;

    @b("event")
    @Nullable
    private final EventsEventAttach event;

    @b("graffiti")
    @Nullable
    private final WallGraffiti graffiti;

    @b("group")
    @Nullable
    private final GroupsGroupAttach group;

    @b("link")
    @Nullable
    private final BaseLink link;

    @b("market")
    @Nullable
    private final MarketMarketItem market;

    @b("market_album")
    @Nullable
    private final MarketMarketAlbum marketAlbum;

    @b("note")
    @Nullable
    private final NotesNote note;

    @b("page")
    @Nullable
    private final PagesWikipageFull page;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("poll")
    @Nullable
    private final PollsPoll poll;

    @b("posted_photo")
    @Nullable
    private final WallPostedPhoto postedPhoto;

    @b("type")
    @NotNull
    private final WallWallpostAttachmentType type;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final VideoVideoFull video;

    public WallWallpostAttachment(@NotNull WallWallpostAttachmentType type, @Nullable String str, @Nullable PhotosPhotoAlbum photosPhotoAlbum, @Nullable WallAppPost wallAppPost, @Nullable AudioAudio audioAudio, @Nullable DocsDoc docsDoc, @Nullable EventsEventAttach eventsEventAttach, @Nullable GroupsGroupAttach groupsGroupAttach, @Nullable WallGraffiti wallGraffiti, @Nullable BaseLink baseLink, @Nullable MarketMarketItem marketMarketItem, @Nullable MarketMarketAlbum marketMarketAlbum, @Nullable NotesNote notesNote, @Nullable PagesWikipageFull pagesWikipageFull, @Nullable PhotosPhoto photosPhoto, @Nullable PollsPoll pollsPoll, @Nullable WallPostedPhoto wallPostedPhoto, @Nullable VideoVideoFull videoVideoFull) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.accessKey = str;
        this.album = photosPhotoAlbum;
        this.app = wallAppPost;
        this.audio = audioAudio;
        this.doc = docsDoc;
        this.event = eventsEventAttach;
        this.group = groupsGroupAttach;
        this.graffiti = wallGraffiti;
        this.link = baseLink;
        this.market = marketMarketItem;
        this.marketAlbum = marketMarketAlbum;
        this.note = notesNote;
        this.page = pagesWikipageFull;
        this.photo = photosPhoto;
        this.poll = pollsPoll;
        this.postedPhoto = wallPostedPhoto;
        this.video = videoVideoFull;
    }

    public static /* synthetic */ WallWallpostAttachment copy$default(WallWallpostAttachment wallWallpostAttachment, WallWallpostAttachmentType wallWallpostAttachmentType, String str, PhotosPhotoAlbum photosPhotoAlbum, WallAppPost wallAppPost, AudioAudio audioAudio, DocsDoc docsDoc, EventsEventAttach eventsEventAttach, GroupsGroupAttach groupsGroupAttach, WallGraffiti wallGraffiti, BaseLink baseLink, MarketMarketItem marketMarketItem, MarketMarketAlbum marketMarketAlbum, NotesNote notesNote, PagesWikipageFull pagesWikipageFull, PhotosPhoto photosPhoto, PollsPoll pollsPoll, WallPostedPhoto wallPostedPhoto, VideoVideoFull videoVideoFull, int i, Object obj) {
        VideoVideoFull videoVideoFull2;
        WallPostedPhoto wallPostedPhoto2;
        WallWallpostAttachmentType wallWallpostAttachmentType2 = (i & 1) != 0 ? wallWallpostAttachment.type : wallWallpostAttachmentType;
        String str2 = (i & 2) != 0 ? wallWallpostAttachment.accessKey : str;
        PhotosPhotoAlbum photosPhotoAlbum2 = (i & 4) != 0 ? wallWallpostAttachment.album : photosPhotoAlbum;
        WallAppPost wallAppPost2 = (i & 8) != 0 ? wallWallpostAttachment.app : wallAppPost;
        AudioAudio audioAudio2 = (i & 16) != 0 ? wallWallpostAttachment.audio : audioAudio;
        DocsDoc docsDoc2 = (i & 32) != 0 ? wallWallpostAttachment.doc : docsDoc;
        EventsEventAttach eventsEventAttach2 = (i & 64) != 0 ? wallWallpostAttachment.event : eventsEventAttach;
        GroupsGroupAttach groupsGroupAttach2 = (i & 128) != 0 ? wallWallpostAttachment.group : groupsGroupAttach;
        WallGraffiti wallGraffiti2 = (i & 256) != 0 ? wallWallpostAttachment.graffiti : wallGraffiti;
        BaseLink baseLink2 = (i & 512) != 0 ? wallWallpostAttachment.link : baseLink;
        MarketMarketItem marketMarketItem2 = (i & 1024) != 0 ? wallWallpostAttachment.market : marketMarketItem;
        MarketMarketAlbum marketMarketAlbum2 = (i & 2048) != 0 ? wallWallpostAttachment.marketAlbum : marketMarketAlbum;
        NotesNote notesNote2 = (i & 4096) != 0 ? wallWallpostAttachment.note : notesNote;
        PagesWikipageFull pagesWikipageFull2 = (i & 8192) != 0 ? wallWallpostAttachment.page : pagesWikipageFull;
        WallWallpostAttachmentType wallWallpostAttachmentType3 = wallWallpostAttachmentType2;
        PhotosPhoto photosPhoto2 = (i & 16384) != 0 ? wallWallpostAttachment.photo : photosPhoto;
        PollsPoll pollsPoll2 = (i & 32768) != 0 ? wallWallpostAttachment.poll : pollsPoll;
        WallPostedPhoto wallPostedPhoto3 = (i & 65536) != 0 ? wallWallpostAttachment.postedPhoto : wallPostedPhoto;
        if ((i & 131072) != 0) {
            wallPostedPhoto2 = wallPostedPhoto3;
            videoVideoFull2 = wallWallpostAttachment.video;
        } else {
            videoVideoFull2 = videoVideoFull;
            wallPostedPhoto2 = wallPostedPhoto3;
        }
        return wallWallpostAttachment.copy(wallWallpostAttachmentType3, str2, photosPhotoAlbum2, wallAppPost2, audioAudio2, docsDoc2, eventsEventAttach2, groupsGroupAttach2, wallGraffiti2, baseLink2, marketMarketItem2, marketMarketAlbum2, notesNote2, pagesWikipageFull2, photosPhoto2, pollsPoll2, wallPostedPhoto2, videoVideoFull2);
    }

    @NotNull
    public final WallWallpostAttachmentType component1() {
        return this.type;
    }

    @Nullable
    public final BaseLink component10() {
        return this.link;
    }

    @Nullable
    public final MarketMarketItem component11() {
        return this.market;
    }

    @Nullable
    public final MarketMarketAlbum component12() {
        return this.marketAlbum;
    }

    @Nullable
    public final NotesNote component13() {
        return this.note;
    }

    @Nullable
    public final PagesWikipageFull component14() {
        return this.page;
    }

    @Nullable
    public final PhotosPhoto component15() {
        return this.photo;
    }

    @Nullable
    public final PollsPoll component16() {
        return this.poll;
    }

    @Nullable
    public final WallPostedPhoto component17() {
        return this.postedPhoto;
    }

    @Nullable
    public final VideoVideoFull component18() {
        return this.video;
    }

    @Nullable
    public final String component2() {
        return this.accessKey;
    }

    @Nullable
    public final PhotosPhotoAlbum component3() {
        return this.album;
    }

    @Nullable
    public final WallAppPost component4() {
        return this.app;
    }

    @Nullable
    public final AudioAudio component5() {
        return this.audio;
    }

    @Nullable
    public final DocsDoc component6() {
        return this.doc;
    }

    @Nullable
    public final EventsEventAttach component7() {
        return this.event;
    }

    @Nullable
    public final GroupsGroupAttach component8() {
        return this.group;
    }

    @Nullable
    public final WallGraffiti component9() {
        return this.graffiti;
    }

    @NotNull
    public final WallWallpostAttachment copy(@NotNull WallWallpostAttachmentType type, @Nullable String str, @Nullable PhotosPhotoAlbum photosPhotoAlbum, @Nullable WallAppPost wallAppPost, @Nullable AudioAudio audioAudio, @Nullable DocsDoc docsDoc, @Nullable EventsEventAttach eventsEventAttach, @Nullable GroupsGroupAttach groupsGroupAttach, @Nullable WallGraffiti wallGraffiti, @Nullable BaseLink baseLink, @Nullable MarketMarketItem marketMarketItem, @Nullable MarketMarketAlbum marketMarketAlbum, @Nullable NotesNote notesNote, @Nullable PagesWikipageFull pagesWikipageFull, @Nullable PhotosPhoto photosPhoto, @Nullable PollsPoll pollsPoll, @Nullable WallPostedPhoto wallPostedPhoto, @Nullable VideoVideoFull videoVideoFull) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new WallWallpostAttachment(type, str, photosPhotoAlbum, wallAppPost, audioAudio, docsDoc, eventsEventAttach, groupsGroupAttach, wallGraffiti, baseLink, marketMarketItem, marketMarketAlbum, notesNote, pagesWikipageFull, photosPhoto, pollsPoll, wallPostedPhoto, videoVideoFull);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAttachment)) {
            return false;
        }
        WallWallpostAttachment wallWallpostAttachment = (WallWallpostAttachment) obj;
        return this.type == wallWallpostAttachment.type && Intrinsics.a(this.accessKey, wallWallpostAttachment.accessKey) && Intrinsics.a(this.album, wallWallpostAttachment.album) && Intrinsics.a(this.app, wallWallpostAttachment.app) && Intrinsics.a(this.audio, wallWallpostAttachment.audio) && Intrinsics.a(this.doc, wallWallpostAttachment.doc) && Intrinsics.a(this.event, wallWallpostAttachment.event) && Intrinsics.a(this.group, wallWallpostAttachment.group) && Intrinsics.a(this.graffiti, wallWallpostAttachment.graffiti) && Intrinsics.a(this.link, wallWallpostAttachment.link) && Intrinsics.a(this.market, wallWallpostAttachment.market) && Intrinsics.a(this.marketAlbum, wallWallpostAttachment.marketAlbum) && Intrinsics.a(this.note, wallWallpostAttachment.note) && Intrinsics.a(this.page, wallWallpostAttachment.page) && Intrinsics.a(this.photo, wallWallpostAttachment.photo) && Intrinsics.a(this.poll, wallWallpostAttachment.poll) && Intrinsics.a(this.postedPhoto, wallWallpostAttachment.postedPhoto) && Intrinsics.a(this.video, wallWallpostAttachment.video);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final PhotosPhotoAlbum getAlbum() {
        return this.album;
    }

    @Nullable
    public final WallAppPost getApp() {
        return this.app;
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
    public final EventsEventAttach getEvent() {
        return this.event;
    }

    @Nullable
    public final WallGraffiti getGraffiti() {
        return this.graffiti;
    }

    @Nullable
    public final GroupsGroupAttach getGroup() {
        return this.group;
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
    public final MarketMarketAlbum getMarketAlbum() {
        return this.marketAlbum;
    }

    @Nullable
    public final NotesNote getNote() {
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
    public final PollsPoll getPoll() {
        return this.poll;
    }

    @Nullable
    public final WallPostedPhoto getPostedPhoto() {
        return this.postedPhoto;
    }

    @NotNull
    public final WallWallpostAttachmentType getType() {
        return this.type;
    }

    @Nullable
    public final VideoVideoFull getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.accessKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PhotosPhotoAlbum photosPhotoAlbum = this.album;
        int iHashCode3 = (iHashCode2 + (photosPhotoAlbum == null ? 0 : photosPhotoAlbum.hashCode())) * 31;
        WallAppPost wallAppPost = this.app;
        int iHashCode4 = (iHashCode3 + (wallAppPost == null ? 0 : wallAppPost.hashCode())) * 31;
        AudioAudio audioAudio = this.audio;
        int iHashCode5 = (iHashCode4 + (audioAudio == null ? 0 : audioAudio.hashCode())) * 31;
        DocsDoc docsDoc = this.doc;
        int iHashCode6 = (iHashCode5 + (docsDoc == null ? 0 : docsDoc.hashCode())) * 31;
        EventsEventAttach eventsEventAttach = this.event;
        int iHashCode7 = (iHashCode6 + (eventsEventAttach == null ? 0 : eventsEventAttach.hashCode())) * 31;
        GroupsGroupAttach groupsGroupAttach = this.group;
        int iHashCode8 = (iHashCode7 + (groupsGroupAttach == null ? 0 : groupsGroupAttach.hashCode())) * 31;
        WallGraffiti wallGraffiti = this.graffiti;
        int iHashCode9 = (iHashCode8 + (wallGraffiti == null ? 0 : wallGraffiti.hashCode())) * 31;
        BaseLink baseLink = this.link;
        int iHashCode10 = (iHashCode9 + (baseLink == null ? 0 : baseLink.hashCode())) * 31;
        MarketMarketItem marketMarketItem = this.market;
        int iHashCode11 = (iHashCode10 + (marketMarketItem == null ? 0 : marketMarketItem.hashCode())) * 31;
        MarketMarketAlbum marketMarketAlbum = this.marketAlbum;
        int iHashCode12 = (iHashCode11 + (marketMarketAlbum == null ? 0 : marketMarketAlbum.hashCode())) * 31;
        NotesNote notesNote = this.note;
        int iHashCode13 = (iHashCode12 + (notesNote == null ? 0 : notesNote.hashCode())) * 31;
        PagesWikipageFull pagesWikipageFull = this.page;
        int iHashCode14 = (iHashCode13 + (pagesWikipageFull == null ? 0 : pagesWikipageFull.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode15 = (iHashCode14 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        PollsPoll pollsPoll = this.poll;
        int iHashCode16 = (iHashCode15 + (pollsPoll == null ? 0 : pollsPoll.hashCode())) * 31;
        WallPostedPhoto wallPostedPhoto = this.postedPhoto;
        int iHashCode17 = (iHashCode16 + (wallPostedPhoto == null ? 0 : wallPostedPhoto.hashCode())) * 31;
        VideoVideoFull videoVideoFull = this.video;
        return iHashCode17 + (videoVideoFull != null ? videoVideoFull.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WallWallpostAttachment(type=" + this.type + ", accessKey=" + this.accessKey + ", album=" + this.album + ", app=" + this.app + ", audio=" + this.audio + ", doc=" + this.doc + ", event=" + this.event + ", group=" + this.group + ", graffiti=" + this.graffiti + ", link=" + this.link + ", market=" + this.market + ", marketAlbum=" + this.marketAlbum + ", note=" + this.note + ", page=" + this.page + ", photo=" + this.photo + ", poll=" + this.poll + ", postedPhoto=" + this.postedPhoto + ", video=" + this.video + ")";
    }

    public /* synthetic */ WallWallpostAttachment(WallWallpostAttachmentType wallWallpostAttachmentType, String str, PhotosPhotoAlbum photosPhotoAlbum, WallAppPost wallAppPost, AudioAudio audioAudio, DocsDoc docsDoc, EventsEventAttach eventsEventAttach, GroupsGroupAttach groupsGroupAttach, WallGraffiti wallGraffiti, BaseLink baseLink, MarketMarketItem marketMarketItem, MarketMarketAlbum marketMarketAlbum, NotesNote notesNote, PagesWikipageFull pagesWikipageFull, PhotosPhoto photosPhoto, PollsPoll pollsPoll, WallPostedPhoto wallPostedPhoto, VideoVideoFull videoVideoFull, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wallWallpostAttachmentType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : photosPhotoAlbum, (i & 8) != 0 ? null : wallAppPost, (i & 16) != 0 ? null : audioAudio, (i & 32) != 0 ? null : docsDoc, (i & 64) != 0 ? null : eventsEventAttach, (i & 128) != 0 ? null : groupsGroupAttach, (i & 256) != 0 ? null : wallGraffiti, (i & 512) != 0 ? null : baseLink, (i & 1024) != 0 ? null : marketMarketItem, (i & 2048) != 0 ? null : marketMarketAlbum, (i & 4096) != 0 ? null : notesNote, (i & 8192) != 0 ? null : pagesWikipageFull, (i & 16384) != 0 ? null : photosPhoto, (i & 32768) != 0 ? null : pollsPoll, (i & 65536) != 0 ? null : wallPostedPhoto, (i & 131072) != 0 ? null : videoVideoFull);
    }
}
