package com.vk.sdk.api.base.dto;

import com.vk.sdk.api.link.dto.LinkTargetObject;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.video.dto.VideoVideo;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class BaseLink {

    @b("application")
    @Nullable
    private final BaseLinkApplication application;

    @b("button")
    @Nullable
    private final BaseLinkButton button;

    @b("caption")
    @Nullable
    private final String caption;

    @b("description")
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final String f15144id;

    @b("is_external")
    @Nullable
    private final Boolean isExternal;

    @b("is_favorite")
    @Nullable
    private final Boolean isFavorite;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("preview_page")
    @Nullable
    private final String previewPage;

    @b("preview_url")
    @Nullable
    private final String previewUrl;

    @b("product")
    @Nullable
    private final BaseLinkProduct product;

    @b("rating")
    @Nullable
    private final BaseLinkRating rating;

    @b("target_object")
    @Nullable
    private final LinkTargetObject targetObject;

    @b("title")
    @Nullable
    private final String title;

    @b("url")
    @NotNull
    private final String url;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final VideoVideo video;

    public BaseLink(@NotNull String url, @Nullable BaseLinkApplication baseLinkApplication, @Nullable BaseLinkButton baseLinkButton, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable PhotosPhoto photosPhoto, @Nullable String str4, @Nullable String str5, @Nullable BaseLinkProduct baseLinkProduct, @Nullable BaseLinkRating baseLinkRating, @Nullable String str6, @Nullable LinkTargetObject linkTargetObject, @Nullable Boolean bool2, @Nullable VideoVideo videoVideo) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.application = baseLinkApplication;
        this.button = baseLinkButton;
        this.caption = str;
        this.description = str2;
        this.f15144id = str3;
        this.isFavorite = bool;
        this.photo = photosPhoto;
        this.previewPage = str4;
        this.previewUrl = str5;
        this.product = baseLinkProduct;
        this.rating = baseLinkRating;
        this.title = str6;
        this.targetObject = linkTargetObject;
        this.isExternal = bool2;
        this.video = videoVideo;
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final String component10() {
        return this.previewUrl;
    }

    @Nullable
    public final BaseLinkProduct component11() {
        return this.product;
    }

    @Nullable
    public final BaseLinkRating component12() {
        return this.rating;
    }

    @Nullable
    public final String component13() {
        return this.title;
    }

    @Nullable
    public final LinkTargetObject component14() {
        return this.targetObject;
    }

    @Nullable
    public final Boolean component15() {
        return this.isExternal;
    }

    @Nullable
    public final VideoVideo component16() {
        return this.video;
    }

    @Nullable
    public final BaseLinkApplication component2() {
        return this.application;
    }

    @Nullable
    public final BaseLinkButton component3() {
        return this.button;
    }

    @Nullable
    public final String component4() {
        return this.caption;
    }

    @Nullable
    public final String component5() {
        return this.description;
    }

    @Nullable
    public final String component6() {
        return this.f15144id;
    }

    @Nullable
    public final Boolean component7() {
        return this.isFavorite;
    }

    @Nullable
    public final PhotosPhoto component8() {
        return this.photo;
    }

    @Nullable
    public final String component9() {
        return this.previewPage;
    }

    @NotNull
    public final BaseLink copy(@NotNull String url, @Nullable BaseLinkApplication baseLinkApplication, @Nullable BaseLinkButton baseLinkButton, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable PhotosPhoto photosPhoto, @Nullable String str4, @Nullable String str5, @Nullable BaseLinkProduct baseLinkProduct, @Nullable BaseLinkRating baseLinkRating, @Nullable String str6, @Nullable LinkTargetObject linkTargetObject, @Nullable Boolean bool2, @Nullable VideoVideo videoVideo) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new BaseLink(url, baseLinkApplication, baseLinkButton, str, str2, str3, bool, photosPhoto, str4, str5, baseLinkProduct, baseLinkRating, str6, linkTargetObject, bool2, videoVideo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLink)) {
            return false;
        }
        BaseLink baseLink = (BaseLink) obj;
        return Intrinsics.a(this.url, baseLink.url) && Intrinsics.a(this.application, baseLink.application) && Intrinsics.a(this.button, baseLink.button) && Intrinsics.a(this.caption, baseLink.caption) && Intrinsics.a(this.description, baseLink.description) && Intrinsics.a(this.f15144id, baseLink.f15144id) && Intrinsics.a(this.isFavorite, baseLink.isFavorite) && Intrinsics.a(this.photo, baseLink.photo) && Intrinsics.a(this.previewPage, baseLink.previewPage) && Intrinsics.a(this.previewUrl, baseLink.previewUrl) && Intrinsics.a(this.product, baseLink.product) && Intrinsics.a(this.rating, baseLink.rating) && Intrinsics.a(this.title, baseLink.title) && Intrinsics.a(this.targetObject, baseLink.targetObject) && Intrinsics.a(this.isExternal, baseLink.isExternal) && Intrinsics.a(this.video, baseLink.video);
    }

    @Nullable
    public final BaseLinkApplication getApplication() {
        return this.application;
    }

    @Nullable
    public final BaseLinkButton getButton() {
        return this.button;
    }

    @Nullable
    public final String getCaption() {
        return this.caption;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getId() {
        return this.f15144id;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getPreviewPage() {
        return this.previewPage;
    }

    @Nullable
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    @Nullable
    public final BaseLinkProduct getProduct() {
        return this.product;
    }

    @Nullable
    public final BaseLinkRating getRating() {
        return this.rating;
    }

    @Nullable
    public final LinkTargetObject getTargetObject() {
        return this.targetObject;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final VideoVideo getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        BaseLinkApplication baseLinkApplication = this.application;
        int iHashCode2 = (iHashCode + (baseLinkApplication == null ? 0 : baseLinkApplication.hashCode())) * 31;
        BaseLinkButton baseLinkButton = this.button;
        int iHashCode3 = (iHashCode2 + (baseLinkButton == null ? 0 : baseLinkButton.hashCode())) * 31;
        String str = this.caption;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15144id;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode8 = (iHashCode7 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        String str4 = this.previewPage;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.previewUrl;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BaseLinkProduct baseLinkProduct = this.product;
        int iHashCode11 = (iHashCode10 + (baseLinkProduct == null ? 0 : baseLinkProduct.hashCode())) * 31;
        BaseLinkRating baseLinkRating = this.rating;
        int iHashCode12 = (iHashCode11 + (baseLinkRating == null ? 0 : baseLinkRating.hashCode())) * 31;
        String str6 = this.title;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LinkTargetObject linkTargetObject = this.targetObject;
        int iHashCode14 = (iHashCode13 + (linkTargetObject == null ? 0 : linkTargetObject.hashCode())) * 31;
        Boolean bool2 = this.isExternal;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VideoVideo videoVideo = this.video;
        return iHashCode15 + (videoVideo != null ? videoVideo.hashCode() : 0);
    }

    @Nullable
    public final Boolean isExternal() {
        return this.isExternal;
    }

    @Nullable
    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        String str = this.url;
        BaseLinkApplication baseLinkApplication = this.application;
        BaseLinkButton baseLinkButton = this.button;
        String str2 = this.caption;
        String str3 = this.description;
        String str4 = this.f15144id;
        Boolean bool = this.isFavorite;
        PhotosPhoto photosPhoto = this.photo;
        String str5 = this.previewPage;
        String str6 = this.previewUrl;
        BaseLinkProduct baseLinkProduct = this.product;
        BaseLinkRating baseLinkRating = this.rating;
        String str7 = this.title;
        LinkTargetObject linkTargetObject = this.targetObject;
        Boolean bool2 = this.isExternal;
        VideoVideo videoVideo = this.video;
        StringBuilder sb2 = new StringBuilder("BaseLink(url=");
        sb2.append(str);
        sb2.append(", application=");
        sb2.append(baseLinkApplication);
        sb2.append(", button=");
        sb2.append(baseLinkButton);
        sb2.append(", caption=");
        sb2.append(str2);
        sb2.append(", description=");
        o.t(sb2, str3, ", id=", str4, ", isFavorite=");
        sb2.append(bool);
        sb2.append(", photo=");
        sb2.append(photosPhoto);
        sb2.append(", previewPage=");
        o.t(sb2, str5, ", previewUrl=", str6, ", product=");
        sb2.append(baseLinkProduct);
        sb2.append(", rating=");
        sb2.append(baseLinkRating);
        sb2.append(", title=");
        sb2.append(str7);
        sb2.append(", targetObject=");
        sb2.append(linkTargetObject);
        sb2.append(", isExternal=");
        sb2.append(bool2);
        sb2.append(", video=");
        sb2.append(videoVideo);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ BaseLink(String str, BaseLinkApplication baseLinkApplication, BaseLinkButton baseLinkButton, String str2, String str3, String str4, Boolean bool, PhotosPhoto photosPhoto, String str5, String str6, BaseLinkProduct baseLinkProduct, BaseLinkRating baseLinkRating, String str7, LinkTargetObject linkTargetObject, Boolean bool2, VideoVideo videoVideo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : baseLinkApplication, (i & 4) != 0 ? null : baseLinkButton, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : photosPhoto, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : baseLinkProduct, (i & 2048) != 0 ? null : baseLinkRating, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : linkTargetObject, (i & 16384) != 0 ? null : bool2, (i & 32768) != 0 ? null : videoVideo);
    }
}
