package com.vk.sdk.api.textlives.dto;

import com.vk.sdk.api.base.dto.BaseLink;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.polls.dto.PollsPoll;
import com.vk.sdk.api.video.dto.VideoVideoFull;
import com.vk.sdk.api.wall.dto.WallWallpostAttachmentType;
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
public final class TextlivesTextpostAttachment {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("link")
    @Nullable
    private final BaseLink link;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("poll")
    @Nullable
    private final PollsPoll poll;

    @b("type")
    @NotNull
    private final WallWallpostAttachmentType type;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final VideoVideoFull video;

    public TextlivesTextpostAttachment(@NotNull WallWallpostAttachmentType type, @Nullable String str, @Nullable BaseLink baseLink, @Nullable PhotosPhoto photosPhoto, @Nullable PollsPoll pollsPoll, @Nullable VideoVideoFull videoVideoFull) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.accessKey = str;
        this.link = baseLink;
        this.photo = photosPhoto;
        this.poll = pollsPoll;
        this.video = videoVideoFull;
    }

    public static /* synthetic */ TextlivesTextpostAttachment copy$default(TextlivesTextpostAttachment textlivesTextpostAttachment, WallWallpostAttachmentType wallWallpostAttachmentType, String str, BaseLink baseLink, PhotosPhoto photosPhoto, PollsPoll pollsPoll, VideoVideoFull videoVideoFull, int i, Object obj) {
        if ((i & 1) != 0) {
            wallWallpostAttachmentType = textlivesTextpostAttachment.type;
        }
        if ((i & 2) != 0) {
            str = textlivesTextpostAttachment.accessKey;
        }
        if ((i & 4) != 0) {
            baseLink = textlivesTextpostAttachment.link;
        }
        if ((i & 8) != 0) {
            photosPhoto = textlivesTextpostAttachment.photo;
        }
        if ((i & 16) != 0) {
            pollsPoll = textlivesTextpostAttachment.poll;
        }
        if ((i & 32) != 0) {
            videoVideoFull = textlivesTextpostAttachment.video;
        }
        PollsPoll pollsPoll2 = pollsPoll;
        VideoVideoFull videoVideoFull2 = videoVideoFull;
        return textlivesTextpostAttachment.copy(wallWallpostAttachmentType, str, baseLink, photosPhoto, pollsPoll2, videoVideoFull2);
    }

    @NotNull
    public final WallWallpostAttachmentType component1() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.accessKey;
    }

    @Nullable
    public final BaseLink component3() {
        return this.link;
    }

    @Nullable
    public final PhotosPhoto component4() {
        return this.photo;
    }

    @Nullable
    public final PollsPoll component5() {
        return this.poll;
    }

    @Nullable
    public final VideoVideoFull component6() {
        return this.video;
    }

    @NotNull
    public final TextlivesTextpostAttachment copy(@NotNull WallWallpostAttachmentType type, @Nullable String str, @Nullable BaseLink baseLink, @Nullable PhotosPhoto photosPhoto, @Nullable PollsPoll pollsPoll, @Nullable VideoVideoFull videoVideoFull) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new TextlivesTextpostAttachment(type, str, baseLink, photosPhoto, pollsPoll, videoVideoFull);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextlivesTextpostAttachment)) {
            return false;
        }
        TextlivesTextpostAttachment textlivesTextpostAttachment = (TextlivesTextpostAttachment) obj;
        return this.type == textlivesTextpostAttachment.type && Intrinsics.a(this.accessKey, textlivesTextpostAttachment.accessKey) && Intrinsics.a(this.link, textlivesTextpostAttachment.link) && Intrinsics.a(this.photo, textlivesTextpostAttachment.photo) && Intrinsics.a(this.poll, textlivesTextpostAttachment.poll) && Intrinsics.a(this.video, textlivesTextpostAttachment.video);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    @Nullable
    public final BaseLink getLink() {
        return this.link;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final PollsPoll getPoll() {
        return this.poll;
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
        BaseLink baseLink = this.link;
        int iHashCode3 = (iHashCode2 + (baseLink == null ? 0 : baseLink.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode4 = (iHashCode3 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        PollsPoll pollsPoll = this.poll;
        int iHashCode5 = (iHashCode4 + (pollsPoll == null ? 0 : pollsPoll.hashCode())) * 31;
        VideoVideoFull videoVideoFull = this.video;
        return iHashCode5 + (videoVideoFull != null ? videoVideoFull.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TextlivesTextpostAttachment(type=" + this.type + ", accessKey=" + this.accessKey + ", link=" + this.link + ", photo=" + this.photo + ", poll=" + this.poll + ", video=" + this.video + ")";
    }

    public /* synthetic */ TextlivesTextpostAttachment(WallWallpostAttachmentType wallWallpostAttachmentType, String str, BaseLink baseLink, PhotosPhoto photosPhoto, PollsPoll pollsPoll, VideoVideoFull videoVideoFull, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wallWallpostAttachmentType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : baseLink, (i & 8) != 0 ? null : photosPhoto, (i & 16) != 0 ? null : pollsPoll, (i & 32) != 0 ? null : videoVideoFull);
    }
}
