package com.vk.sdk.api.docs.dto;

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
public final class DocsDocPreview {

    @b("audio_msg")
    @Nullable
    private final DocsDocPreviewAudioMsg audioMsg;

    @b("graffiti")
    @Nullable
    private final DocsDocPreviewGraffiti graffiti;

    @b("photo")
    @Nullable
    private final DocsDocPreviewPhoto photo;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final DocsDocPreviewVideo video;

    public DocsDocPreview() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DocsDocPreview copy$default(DocsDocPreview docsDocPreview, DocsDocPreviewAudioMsg docsDocPreviewAudioMsg, DocsDocPreviewGraffiti docsDocPreviewGraffiti, DocsDocPreviewPhoto docsDocPreviewPhoto, DocsDocPreviewVideo docsDocPreviewVideo, int i, Object obj) {
        if ((i & 1) != 0) {
            docsDocPreviewAudioMsg = docsDocPreview.audioMsg;
        }
        if ((i & 2) != 0) {
            docsDocPreviewGraffiti = docsDocPreview.graffiti;
        }
        if ((i & 4) != 0) {
            docsDocPreviewPhoto = docsDocPreview.photo;
        }
        if ((i & 8) != 0) {
            docsDocPreviewVideo = docsDocPreview.video;
        }
        return docsDocPreview.copy(docsDocPreviewAudioMsg, docsDocPreviewGraffiti, docsDocPreviewPhoto, docsDocPreviewVideo);
    }

    @Nullable
    public final DocsDocPreviewAudioMsg component1() {
        return this.audioMsg;
    }

    @Nullable
    public final DocsDocPreviewGraffiti component2() {
        return this.graffiti;
    }

    @Nullable
    public final DocsDocPreviewPhoto component3() {
        return this.photo;
    }

    @Nullable
    public final DocsDocPreviewVideo component4() {
        return this.video;
    }

    @NotNull
    public final DocsDocPreview copy(@Nullable DocsDocPreviewAudioMsg docsDocPreviewAudioMsg, @Nullable DocsDocPreviewGraffiti docsDocPreviewGraffiti, @Nullable DocsDocPreviewPhoto docsDocPreviewPhoto, @Nullable DocsDocPreviewVideo docsDocPreviewVideo) {
        return new DocsDocPreview(docsDocPreviewAudioMsg, docsDocPreviewGraffiti, docsDocPreviewPhoto, docsDocPreviewVideo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreview)) {
            return false;
        }
        DocsDocPreview docsDocPreview = (DocsDocPreview) obj;
        return Intrinsics.a(this.audioMsg, docsDocPreview.audioMsg) && Intrinsics.a(this.graffiti, docsDocPreview.graffiti) && Intrinsics.a(this.photo, docsDocPreview.photo) && Intrinsics.a(this.video, docsDocPreview.video);
    }

    @Nullable
    public final DocsDocPreviewAudioMsg getAudioMsg() {
        return this.audioMsg;
    }

    @Nullable
    public final DocsDocPreviewGraffiti getGraffiti() {
        return this.graffiti;
    }

    @Nullable
    public final DocsDocPreviewPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final DocsDocPreviewVideo getVideo() {
        return this.video;
    }

    public int hashCode() {
        DocsDocPreviewAudioMsg docsDocPreviewAudioMsg = this.audioMsg;
        int iHashCode = (docsDocPreviewAudioMsg == null ? 0 : docsDocPreviewAudioMsg.hashCode()) * 31;
        DocsDocPreviewGraffiti docsDocPreviewGraffiti = this.graffiti;
        int iHashCode2 = (iHashCode + (docsDocPreviewGraffiti == null ? 0 : docsDocPreviewGraffiti.hashCode())) * 31;
        DocsDocPreviewPhoto docsDocPreviewPhoto = this.photo;
        int iHashCode3 = (iHashCode2 + (docsDocPreviewPhoto == null ? 0 : docsDocPreviewPhoto.hashCode())) * 31;
        DocsDocPreviewVideo docsDocPreviewVideo = this.video;
        return iHashCode3 + (docsDocPreviewVideo != null ? docsDocPreviewVideo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DocsDocPreview(audioMsg=" + this.audioMsg + ", graffiti=" + this.graffiti + ", photo=" + this.photo + ", video=" + this.video + ")";
    }

    public DocsDocPreview(@Nullable DocsDocPreviewAudioMsg docsDocPreviewAudioMsg, @Nullable DocsDocPreviewGraffiti docsDocPreviewGraffiti, @Nullable DocsDocPreviewPhoto docsDocPreviewPhoto, @Nullable DocsDocPreviewVideo docsDocPreviewVideo) {
        this.audioMsg = docsDocPreviewAudioMsg;
        this.graffiti = docsDocPreviewGraffiti;
        this.photo = docsDocPreviewPhoto;
        this.video = docsDocPreviewVideo;
    }

    public /* synthetic */ DocsDocPreview(DocsDocPreviewAudioMsg docsDocPreviewAudioMsg, DocsDocPreviewGraffiti docsDocPreviewGraffiti, DocsDocPreviewPhoto docsDocPreviewPhoto, DocsDocPreviewVideo docsDocPreviewVideo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : docsDocPreviewAudioMsg, (i & 2) != 0 ? null : docsDocPreviewGraffiti, (i & 4) != 0 ? null : docsDocPreviewPhoto, (i & 8) != 0 ? null : docsDocPreviewVideo);
    }
}
