package com.vk.sdk.api.photos.dto;

import a0.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class PhotosTagsSuggestionItem {

    @b("buttons")
    @Nullable
    private final List<PhotosTagsSuggestionItemButton> buttons;

    @b("caption")
    @Nullable
    private final String caption;

    @b("photo")
    @Nullable
    private final PhotosPhoto photo;

    @b("tags")
    @Nullable
    private final List<PhotosPhotoTag> tags;

    @b("title")
    @Nullable
    private final String title;

    @b("track_code")
    @Nullable
    private final String trackCode;

    @b("type")
    @Nullable
    private final String type;

    public PhotosTagsSuggestionItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosTagsSuggestionItem copy$default(PhotosTagsSuggestionItem photosTagsSuggestionItem, String str, String str2, String str3, List list, PhotosPhoto photosPhoto, List list2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photosTagsSuggestionItem.title;
        }
        if ((i & 2) != 0) {
            str2 = photosTagsSuggestionItem.caption;
        }
        if ((i & 4) != 0) {
            str3 = photosTagsSuggestionItem.type;
        }
        if ((i & 8) != 0) {
            list = photosTagsSuggestionItem.buttons;
        }
        if ((i & 16) != 0) {
            photosPhoto = photosTagsSuggestionItem.photo;
        }
        if ((i & 32) != 0) {
            list2 = photosTagsSuggestionItem.tags;
        }
        if ((i & 64) != 0) {
            str4 = photosTagsSuggestionItem.trackCode;
        }
        List list3 = list2;
        String str5 = str4;
        PhotosPhoto photosPhoto2 = photosPhoto;
        String str6 = str3;
        return photosTagsSuggestionItem.copy(str, str2, str6, list, photosPhoto2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.caption;
    }

    @Nullable
    public final String component3() {
        return this.type;
    }

    @Nullable
    public final List<PhotosTagsSuggestionItemButton> component4() {
        return this.buttons;
    }

    @Nullable
    public final PhotosPhoto component5() {
        return this.photo;
    }

    @Nullable
    public final List<PhotosPhotoTag> component6() {
        return this.tags;
    }

    @Nullable
    public final String component7() {
        return this.trackCode;
    }

    @NotNull
    public final PhotosTagsSuggestionItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<PhotosTagsSuggestionItemButton> list, @Nullable PhotosPhoto photosPhoto, @Nullable List<PhotosPhotoTag> list2, @Nullable String str4) {
        return new PhotosTagsSuggestionItem(str, str2, str3, list, photosPhoto, list2, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosTagsSuggestionItem)) {
            return false;
        }
        PhotosTagsSuggestionItem photosTagsSuggestionItem = (PhotosTagsSuggestionItem) obj;
        return Intrinsics.a(this.title, photosTagsSuggestionItem.title) && Intrinsics.a(this.caption, photosTagsSuggestionItem.caption) && Intrinsics.a(this.type, photosTagsSuggestionItem.type) && Intrinsics.a(this.buttons, photosTagsSuggestionItem.buttons) && Intrinsics.a(this.photo, photosTagsSuggestionItem.photo) && Intrinsics.a(this.tags, photosTagsSuggestionItem.tags) && Intrinsics.a(this.trackCode, photosTagsSuggestionItem.trackCode);
    }

    @Nullable
    public final List<PhotosTagsSuggestionItemButton> getButtons() {
        return this.buttons;
    }

    @Nullable
    public final String getCaption() {
        return this.caption;
    }

    @Nullable
    public final PhotosPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final List<PhotosPhotoTag> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTrackCode() {
        return this.trackCode;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.caption;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PhotosTagsSuggestionItemButton> list = this.buttons;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        PhotosPhoto photosPhoto = this.photo;
        int iHashCode5 = (iHashCode4 + (photosPhoto == null ? 0 : photosPhoto.hashCode())) * 31;
        List<PhotosPhotoTag> list2 = this.tags;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.trackCode;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.caption;
        String str3 = this.type;
        List<PhotosTagsSuggestionItemButton> list = this.buttons;
        PhotosPhoto photosPhoto = this.photo;
        List<PhotosPhotoTag> list2 = this.tags;
        String str4 = this.trackCode;
        StringBuilder sbJ = z.j("PhotosTagsSuggestionItem(title=", str, ", caption=", str2, ", type=");
        sbJ.append(str3);
        sbJ.append(", buttons=");
        sbJ.append(list);
        sbJ.append(", photo=");
        sbJ.append(photosPhoto);
        sbJ.append(", tags=");
        sbJ.append(list2);
        sbJ.append(", trackCode=");
        return u.o(sbJ, str4, ")");
    }

    public PhotosTagsSuggestionItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<PhotosTagsSuggestionItemButton> list, @Nullable PhotosPhoto photosPhoto, @Nullable List<PhotosPhotoTag> list2, @Nullable String str4) {
        this.title = str;
        this.caption = str2;
        this.type = str3;
        this.buttons = list;
        this.photo = photosPhoto;
        this.tags = list2;
        this.trackCode = str4;
    }

    public /* synthetic */ PhotosTagsSuggestionItem(String str, String str2, String str3, List list, PhotosPhoto photosPhoto, List list2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : photosPhoto, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str4);
    }
}
