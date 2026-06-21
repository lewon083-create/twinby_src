package com.vk.sdk.api.photos.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import io.sentry.TraceContext;
import io.sentry.protocol.DebugMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class PhotosPhoto {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("album_id")
    private final int albumId;

    @b("can_comment")
    @Nullable
    private final BaseBoolInt canComment;

    @b("date")
    private final int date;

    @b("has_tags")
    private final boolean hasTags;

    @b("height")
    @Nullable
    private final Integer height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15215id;

    @b(DebugMeta.JsonKeys.IMAGES)
    @Nullable
    private final List<PhotosImage> images;

    @b("lat")
    @Nullable
    private final Float lat;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    @b("long")
    @Nullable
    private final Float f2long;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("photo_256")
    @Nullable
    private final String photo256;

    @b("place")
    @Nullable
    private final String place;

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("sizes")
    @Nullable
    private final List<PhotosPhotoSizes> sizes;

    @b("text")
    @Nullable
    private final String text;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final UserId userId;

    @b("width")
    @Nullable
    private final Integer width;

    public PhotosPhoto(int i, int i10, int i11, @NotNull UserId ownerId, boolean z5, @Nullable String str, @Nullable Integer num, @Nullable List<PhotosImage> list, @Nullable Float f10, @Nullable Float f11, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt, @Nullable String str3, @Nullable Integer num2, @Nullable List<PhotosPhotoSizes> list2, @Nullable String str4, @Nullable UserId userId, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.albumId = i;
        this.date = i10;
        this.f15215id = i11;
        this.ownerId = ownerId;
        this.hasTags = z5;
        this.accessKey = str;
        this.height = num;
        this.images = list;
        this.lat = f10;
        this.f2long = f11;
        this.photo256 = str2;
        this.canComment = baseBoolInt;
        this.place = str3;
        this.postId = num2;
        this.sizes = list2;
        this.text = str4;
        this.userId = userId;
        this.width = num3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosPhoto copy$default(PhotosPhoto photosPhoto, int i, int i10, int i11, UserId userId, boolean z5, String str, Integer num, List list, Float f10, Float f11, String str2, BaseBoolInt baseBoolInt, String str3, Integer num2, List list2, String str4, UserId userId2, Integer num3, int i12, Object obj) {
        Integer num4;
        UserId userId3;
        int i13 = (i12 & 1) != 0 ? photosPhoto.albumId : i;
        int i14 = (i12 & 2) != 0 ? photosPhoto.date : i10;
        int i15 = (i12 & 4) != 0 ? photosPhoto.f15215id : i11;
        UserId userId4 = (i12 & 8) != 0 ? photosPhoto.ownerId : userId;
        boolean z10 = (i12 & 16) != 0 ? photosPhoto.hasTags : z5;
        String str5 = (i12 & 32) != 0 ? photosPhoto.accessKey : str;
        Integer num5 = (i12 & 64) != 0 ? photosPhoto.height : num;
        List list3 = (i12 & 128) != 0 ? photosPhoto.images : list;
        Float f12 = (i12 & 256) != 0 ? photosPhoto.lat : f10;
        Float f13 = (i12 & 512) != 0 ? photosPhoto.f2long : f11;
        String str6 = (i12 & 1024) != 0 ? photosPhoto.photo256 : str2;
        BaseBoolInt baseBoolInt2 = (i12 & 2048) != 0 ? photosPhoto.canComment : baseBoolInt;
        String str7 = (i12 & 4096) != 0 ? photosPhoto.place : str3;
        Integer num6 = (i12 & 8192) != 0 ? photosPhoto.postId : num2;
        int i16 = i13;
        List list4 = (i12 & 16384) != 0 ? photosPhoto.sizes : list2;
        String str8 = (i12 & 32768) != 0 ? photosPhoto.text : str4;
        UserId userId5 = (i12 & 65536) != 0 ? photosPhoto.userId : userId2;
        if ((i12 & 131072) != 0) {
            userId3 = userId5;
            num4 = photosPhoto.width;
        } else {
            num4 = num3;
            userId3 = userId5;
        }
        return photosPhoto.copy(i16, i14, i15, userId4, z10, str5, num5, list3, f12, f13, str6, baseBoolInt2, str7, num6, list4, str8, userId3, num4);
    }

    public final int component1() {
        return this.albumId;
    }

    @Nullable
    public final Float component10() {
        return this.f2long;
    }

    @Nullable
    public final String component11() {
        return this.photo256;
    }

    @Nullable
    public final BaseBoolInt component12() {
        return this.canComment;
    }

    @Nullable
    public final String component13() {
        return this.place;
    }

    @Nullable
    public final Integer component14() {
        return this.postId;
    }

    @Nullable
    public final List<PhotosPhotoSizes> component15() {
        return this.sizes;
    }

    @Nullable
    public final String component16() {
        return this.text;
    }

    @Nullable
    public final UserId component17() {
        return this.userId;
    }

    @Nullable
    public final Integer component18() {
        return this.width;
    }

    public final int component2() {
        return this.date;
    }

    public final int component3() {
        return this.f15215id;
    }

    @NotNull
    public final UserId component4() {
        return this.ownerId;
    }

    public final boolean component5() {
        return this.hasTags;
    }

    @Nullable
    public final String component6() {
        return this.accessKey;
    }

    @Nullable
    public final Integer component7() {
        return this.height;
    }

    @Nullable
    public final List<PhotosImage> component8() {
        return this.images;
    }

    @Nullable
    public final Float component9() {
        return this.lat;
    }

    @NotNull
    public final PhotosPhoto copy(int i, int i10, int i11, @NotNull UserId ownerId, boolean z5, @Nullable String str, @Nullable Integer num, @Nullable List<PhotosImage> list, @Nullable Float f10, @Nullable Float f11, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt, @Nullable String str3, @Nullable Integer num2, @Nullable List<PhotosPhotoSizes> list2, @Nullable String str4, @Nullable UserId userId, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        return new PhotosPhoto(i, i10, i11, ownerId, z5, str, num, list, f10, f11, str2, baseBoolInt, str3, num2, list2, str4, userId, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhoto)) {
            return false;
        }
        PhotosPhoto photosPhoto = (PhotosPhoto) obj;
        return this.albumId == photosPhoto.albumId && this.date == photosPhoto.date && this.f15215id == photosPhoto.f15215id && Intrinsics.a(this.ownerId, photosPhoto.ownerId) && this.hasTags == photosPhoto.hasTags && Intrinsics.a(this.accessKey, photosPhoto.accessKey) && Intrinsics.a(this.height, photosPhoto.height) && Intrinsics.a(this.images, photosPhoto.images) && Intrinsics.a(this.lat, photosPhoto.lat) && Intrinsics.a(this.f2long, photosPhoto.f2long) && Intrinsics.a(this.photo256, photosPhoto.photo256) && this.canComment == photosPhoto.canComment && Intrinsics.a(this.place, photosPhoto.place) && Intrinsics.a(this.postId, photosPhoto.postId) && Intrinsics.a(this.sizes, photosPhoto.sizes) && Intrinsics.a(this.text, photosPhoto.text) && Intrinsics.a(this.userId, photosPhoto.userId) && Intrinsics.a(this.width, photosPhoto.width);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    public final int getAlbumId() {
        return this.albumId;
    }

    @Nullable
    public final BaseBoolInt getCanComment() {
        return this.canComment;
    }

    public final int getDate() {
        return this.date;
    }

    public final boolean getHasTags() {
        return this.hasTags;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.f15215id;
    }

    @Nullable
    public final List<PhotosImage> getImages() {
        return this.images;
    }

    @Nullable
    public final Float getLat() {
        return this.lat;
    }

    @Nullable
    public final Float getLong() {
        return this.f2long;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getPhoto256() {
        return this.photo256;
    }

    @Nullable
    public final String getPlace() {
        return this.place;
    }

    @Nullable
    public final Integer getPostId() {
        return this.postId;
    }

    @Nullable
    public final List<PhotosPhotoSizes> getSizes() {
        return this.sizes;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final UserId getUserId() {
        return this.userId;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    public int hashCode() {
        int iE = o.e(this.ownerId, u.g(this.f15215id, u.g(this.date, Integer.hashCode(this.albumId) * 31, 31), 31), 31);
        boolean z5 = this.hasTags;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int i = (iE + r22) * 31;
        String str = this.accessKey;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<PhotosImage> list = this.images;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Float f10 = this.lat;
        int iHashCode4 = (iHashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f2long;
        int iHashCode5 = (iHashCode4 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str2 = this.photo256;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canComment;
        int iHashCode7 = (iHashCode6 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        String str3 = this.place;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.postId;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<PhotosPhotoSizes> list2 = this.sizes;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UserId userId = this.userId;
        int iHashCode12 = (iHashCode11 + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num3 = this.width;
        return iHashCode12 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.albumId;
        int i10 = this.date;
        int i11 = this.f15215id;
        UserId userId = this.ownerId;
        boolean z5 = this.hasTags;
        String str = this.accessKey;
        Integer num = this.height;
        List<PhotosImage> list = this.images;
        Float f10 = this.lat;
        Float f11 = this.f2long;
        String str2 = this.photo256;
        BaseBoolInt baseBoolInt = this.canComment;
        String str3 = this.place;
        Integer num2 = this.postId;
        List<PhotosPhotoSizes> list2 = this.sizes;
        String str4 = this.text;
        UserId userId2 = this.userId;
        Integer num3 = this.width;
        StringBuilder sbI = z.i("PhotosPhoto(albumId=", i, ", date=", i10, ", id=");
        sbI.append(i11);
        sbI.append(", ownerId=");
        sbI.append(userId);
        sbI.append(", hasTags=");
        sbI.append(z5);
        sbI.append(", accessKey=");
        sbI.append(str);
        sbI.append(", height=");
        sbI.append(num);
        sbI.append(", images=");
        sbI.append(list);
        sbI.append(", lat=");
        sbI.append(f10);
        sbI.append(", long=");
        sbI.append(f11);
        sbI.append(", photo256=");
        sbI.append(str2);
        sbI.append(", canComment=");
        sbI.append(baseBoolInt);
        sbI.append(", place=");
        a.r(num2, str3, ", postId=", ", sizes=", sbI);
        sbI.append(list2);
        sbI.append(", text=");
        sbI.append(str4);
        sbI.append(", userId=");
        sbI.append(userId2);
        sbI.append(", width=");
        sbI.append(num3);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ PhotosPhoto(int i, int i10, int i11, UserId userId, boolean z5, String str, Integer num, List list, Float f10, Float f11, String str2, BaseBoolInt baseBoolInt, String str3, Integer num2, List list2, String str4, UserId userId2, Integer num3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, userId, z5, (i12 & 32) != 0 ? null : str, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : list, (i12 & 256) != 0 ? null : f10, (i12 & 512) != 0 ? null : f11, (i12 & 1024) != 0 ? null : str2, (i12 & 2048) != 0 ? null : baseBoolInt, (i12 & 4096) != 0 ? null : str3, (i12 & 8192) != 0 ? null : num2, (i12 & 16384) != 0 ? null : list2, (32768 & i12) != 0 ? null : str4, (65536 & i12) != 0 ? null : userId2, (i12 & 131072) != 0 ? null : num3);
    }
}
