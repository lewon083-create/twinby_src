package com.vk.sdk.api.photos.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
import io.sentry.TraceContext;
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
public final class PhotosPhotoXtrTagInfo {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("album_id")
    private final int albumId;

    @b("date")
    private final int date;

    @b("height")
    @Nullable
    private final Integer height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15226id;

    @b("lat")
    @Nullable
    private final Float lat;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    @b("long")
    @Nullable
    private final Float f6long;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("photo_1280")
    @Nullable
    private final String photo1280;

    @b("photo_130")
    @Nullable
    private final String photo130;

    @b("photo_2560")
    @Nullable
    private final String photo2560;

    @b("photo_604")
    @Nullable
    private final String photo604;

    @b("photo_75")
    @Nullable
    private final String photo75;

    @b("photo_807")
    @Nullable
    private final String photo807;

    @b("placer_id")
    @Nullable
    private final Integer placerId;

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("sizes")
    @Nullable
    private final List<PhotosPhotoSizes> sizes;

    @b("tag_created")
    @Nullable
    private final Integer tagCreated;

    @b("tag_id")
    @Nullable
    private final Integer tagId;

    @b("text")
    @Nullable
    private final String text;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final UserId userId;

    @b("width")
    @Nullable
    private final Integer width;

    public PhotosPhotoXtrTagInfo(int i, int i10, int i11, @NotNull UserId ownerId, @Nullable String str, @Nullable Integer num, @Nullable Float f10, @Nullable Float f11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<PhotosPhotoSizes> list, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str8, @Nullable UserId userId, @Nullable Integer num6) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.albumId = i;
        this.date = i10;
        this.f15226id = i11;
        this.ownerId = ownerId;
        this.accessKey = str;
        this.height = num;
        this.lat = f10;
        this.f6long = f11;
        this.photo1280 = str2;
        this.photo130 = str3;
        this.photo2560 = str4;
        this.photo604 = str5;
        this.photo75 = str6;
        this.photo807 = str7;
        this.placerId = num2;
        this.postId = num3;
        this.sizes = list;
        this.tagCreated = num4;
        this.tagId = num5;
        this.text = str8;
        this.userId = userId;
        this.width = num6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosPhotoXtrTagInfo copy$default(PhotosPhotoXtrTagInfo photosPhotoXtrTagInfo, int i, int i10, int i11, UserId userId, String str, Integer num, Float f10, Float f11, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, List list, Integer num4, Integer num5, String str8, UserId userId2, Integer num6, int i12, Object obj) {
        Integer num7;
        UserId userId3;
        int i13 = (i12 & 1) != 0 ? photosPhotoXtrTagInfo.albumId : i;
        int i14 = (i12 & 2) != 0 ? photosPhotoXtrTagInfo.date : i10;
        int i15 = (i12 & 4) != 0 ? photosPhotoXtrTagInfo.f15226id : i11;
        UserId userId4 = (i12 & 8) != 0 ? photosPhotoXtrTagInfo.ownerId : userId;
        String str9 = (i12 & 16) != 0 ? photosPhotoXtrTagInfo.accessKey : str;
        Integer num8 = (i12 & 32) != 0 ? photosPhotoXtrTagInfo.height : num;
        Float f12 = (i12 & 64) != 0 ? photosPhotoXtrTagInfo.lat : f10;
        Float f13 = (i12 & 128) != 0 ? photosPhotoXtrTagInfo.f6long : f11;
        String str10 = (i12 & 256) != 0 ? photosPhotoXtrTagInfo.photo1280 : str2;
        String str11 = (i12 & 512) != 0 ? photosPhotoXtrTagInfo.photo130 : str3;
        String str12 = (i12 & 1024) != 0 ? photosPhotoXtrTagInfo.photo2560 : str4;
        String str13 = (i12 & 2048) != 0 ? photosPhotoXtrTagInfo.photo604 : str5;
        String str14 = (i12 & 4096) != 0 ? photosPhotoXtrTagInfo.photo75 : str6;
        String str15 = (i12 & 8192) != 0 ? photosPhotoXtrTagInfo.photo807 : str7;
        int i16 = i13;
        Integer num9 = (i12 & 16384) != 0 ? photosPhotoXtrTagInfo.placerId : num2;
        Integer num10 = (i12 & 32768) != 0 ? photosPhotoXtrTagInfo.postId : num3;
        List list2 = (i12 & 65536) != 0 ? photosPhotoXtrTagInfo.sizes : list;
        Integer num11 = (i12 & 131072) != 0 ? photosPhotoXtrTagInfo.tagCreated : num4;
        Integer num12 = (i12 & 262144) != 0 ? photosPhotoXtrTagInfo.tagId : num5;
        String str16 = (i12 & 524288) != 0 ? photosPhotoXtrTagInfo.text : str8;
        UserId userId5 = (i12 & 1048576) != 0 ? photosPhotoXtrTagInfo.userId : userId2;
        if ((i12 & 2097152) != 0) {
            userId3 = userId5;
            num7 = photosPhotoXtrTagInfo.width;
        } else {
            num7 = num6;
            userId3 = userId5;
        }
        return photosPhotoXtrTagInfo.copy(i16, i14, i15, userId4, str9, num8, f12, f13, str10, str11, str12, str13, str14, str15, num9, num10, list2, num11, num12, str16, userId3, num7);
    }

    public final int component1() {
        return this.albumId;
    }

    @Nullable
    public final String component10() {
        return this.photo130;
    }

    @Nullable
    public final String component11() {
        return this.photo2560;
    }

    @Nullable
    public final String component12() {
        return this.photo604;
    }

    @Nullable
    public final String component13() {
        return this.photo75;
    }

    @Nullable
    public final String component14() {
        return this.photo807;
    }

    @Nullable
    public final Integer component15() {
        return this.placerId;
    }

    @Nullable
    public final Integer component16() {
        return this.postId;
    }

    @Nullable
    public final List<PhotosPhotoSizes> component17() {
        return this.sizes;
    }

    @Nullable
    public final Integer component18() {
        return this.tagCreated;
    }

    @Nullable
    public final Integer component19() {
        return this.tagId;
    }

    public final int component2() {
        return this.date;
    }

    @Nullable
    public final String component20() {
        return this.text;
    }

    @Nullable
    public final UserId component21() {
        return this.userId;
    }

    @Nullable
    public final Integer component22() {
        return this.width;
    }

    public final int component3() {
        return this.f15226id;
    }

    @NotNull
    public final UserId component4() {
        return this.ownerId;
    }

    @Nullable
    public final String component5() {
        return this.accessKey;
    }

    @Nullable
    public final Integer component6() {
        return this.height;
    }

    @Nullable
    public final Float component7() {
        return this.lat;
    }

    @Nullable
    public final Float component8() {
        return this.f6long;
    }

    @Nullable
    public final String component9() {
        return this.photo1280;
    }

    @NotNull
    public final PhotosPhotoXtrTagInfo copy(int i, int i10, int i11, @NotNull UserId ownerId, @Nullable String str, @Nullable Integer num, @Nullable Float f10, @Nullable Float f11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<PhotosPhotoSizes> list, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str8, @Nullable UserId userId, @Nullable Integer num6) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        return new PhotosPhotoXtrTagInfo(i, i10, i11, ownerId, str, num, f10, f11, str2, str3, str4, str5, str6, str7, num2, num3, list, num4, num5, str8, userId, num6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoXtrTagInfo)) {
            return false;
        }
        PhotosPhotoXtrTagInfo photosPhotoXtrTagInfo = (PhotosPhotoXtrTagInfo) obj;
        return this.albumId == photosPhotoXtrTagInfo.albumId && this.date == photosPhotoXtrTagInfo.date && this.f15226id == photosPhotoXtrTagInfo.f15226id && Intrinsics.a(this.ownerId, photosPhotoXtrTagInfo.ownerId) && Intrinsics.a(this.accessKey, photosPhotoXtrTagInfo.accessKey) && Intrinsics.a(this.height, photosPhotoXtrTagInfo.height) && Intrinsics.a(this.lat, photosPhotoXtrTagInfo.lat) && Intrinsics.a(this.f6long, photosPhotoXtrTagInfo.f6long) && Intrinsics.a(this.photo1280, photosPhotoXtrTagInfo.photo1280) && Intrinsics.a(this.photo130, photosPhotoXtrTagInfo.photo130) && Intrinsics.a(this.photo2560, photosPhotoXtrTagInfo.photo2560) && Intrinsics.a(this.photo604, photosPhotoXtrTagInfo.photo604) && Intrinsics.a(this.photo75, photosPhotoXtrTagInfo.photo75) && Intrinsics.a(this.photo807, photosPhotoXtrTagInfo.photo807) && Intrinsics.a(this.placerId, photosPhotoXtrTagInfo.placerId) && Intrinsics.a(this.postId, photosPhotoXtrTagInfo.postId) && Intrinsics.a(this.sizes, photosPhotoXtrTagInfo.sizes) && Intrinsics.a(this.tagCreated, photosPhotoXtrTagInfo.tagCreated) && Intrinsics.a(this.tagId, photosPhotoXtrTagInfo.tagId) && Intrinsics.a(this.text, photosPhotoXtrTagInfo.text) && Intrinsics.a(this.userId, photosPhotoXtrTagInfo.userId) && Intrinsics.a(this.width, photosPhotoXtrTagInfo.width);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    public final int getAlbumId() {
        return this.albumId;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.f15226id;
    }

    @Nullable
    public final Float getLat() {
        return this.lat;
    }

    @Nullable
    public final Float getLong() {
        return this.f6long;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getPhoto1280() {
        return this.photo1280;
    }

    @Nullable
    public final String getPhoto130() {
        return this.photo130;
    }

    @Nullable
    public final String getPhoto2560() {
        return this.photo2560;
    }

    @Nullable
    public final String getPhoto604() {
        return this.photo604;
    }

    @Nullable
    public final String getPhoto75() {
        return this.photo75;
    }

    @Nullable
    public final String getPhoto807() {
        return this.photo807;
    }

    @Nullable
    public final Integer getPlacerId() {
        return this.placerId;
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
    public final Integer getTagCreated() {
        return this.tagCreated;
    }

    @Nullable
    public final Integer getTagId() {
        return this.tagId;
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

    public int hashCode() {
        int iE = o.e(this.ownerId, u.g(this.f15226id, u.g(this.date, Integer.hashCode(this.albumId) * 31, 31), 31), 31);
        String str = this.accessKey;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f10 = this.lat;
        int iHashCode3 = (iHashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f6long;
        int iHashCode4 = (iHashCode3 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str2 = this.photo1280;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo130;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo2560;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo604;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo75;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo807;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.placerId;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.postId;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<PhotosPhotoSizes> list = this.sizes;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.tagCreated;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.tagId;
        int iHashCode15 = (iHashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str8 = this.text;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UserId userId = this.userId;
        int iHashCode17 = (iHashCode16 + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num6 = this.width;
        return iHashCode17 + (num6 != null ? num6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.albumId;
        int i10 = this.date;
        int i11 = this.f15226id;
        UserId userId = this.ownerId;
        String str = this.accessKey;
        Integer num = this.height;
        Float f10 = this.lat;
        Float f11 = this.f6long;
        String str2 = this.photo1280;
        String str3 = this.photo130;
        String str4 = this.photo2560;
        String str5 = this.photo604;
        String str6 = this.photo75;
        String str7 = this.photo807;
        Integer num2 = this.placerId;
        Integer num3 = this.postId;
        List<PhotosPhotoSizes> list = this.sizes;
        Integer num4 = this.tagCreated;
        Integer num5 = this.tagId;
        String str8 = this.text;
        UserId userId2 = this.userId;
        Integer num6 = this.width;
        StringBuilder sbI = z.i("PhotosPhotoXtrTagInfo(albumId=", i, ", date=", i10, ", id=");
        sbI.append(i11);
        sbI.append(", ownerId=");
        sbI.append(userId);
        sbI.append(", accessKey=");
        a.r(num, str, ", height=", ", lat=", sbI);
        sbI.append(f10);
        sbI.append(", long=");
        sbI.append(f11);
        sbI.append(", photo1280=");
        o.t(sbI, str2, ", photo130=", str3, ", photo2560=");
        o.t(sbI, str4, ", photo604=", str5, ", photo75=");
        o.t(sbI, str6, ", photo807=", str7, ", placerId=");
        a.t(sbI, num2, ", postId=", num3, ", sizes=");
        sbI.append(list);
        sbI.append(", tagCreated=");
        sbI.append(num4);
        sbI.append(", tagId=");
        pe.a.r(num5, ", text=", str8, ", userId=", sbI);
        sbI.append(userId2);
        sbI.append(", width=");
        sbI.append(num6);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ PhotosPhotoXtrTagInfo(int i, int i10, int i11, UserId userId, String str, Integer num, Float f10, Float f11, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, List list, Integer num4, Integer num5, String str8, UserId userId2, Integer num6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, userId, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : f10, (i12 & 128) != 0 ? null : f11, (i12 & 256) != 0 ? null : str2, (i12 & 512) != 0 ? null : str3, (i12 & 1024) != 0 ? null : str4, (i12 & 2048) != 0 ? null : str5, (i12 & 4096) != 0 ? null : str6, (i12 & 8192) != 0 ? null : str7, (i12 & 16384) != 0 ? null : num2, (32768 & i12) != 0 ? null : num3, (65536 & i12) != 0 ? null : list, (131072 & i12) != 0 ? null : num4, (262144 & i12) != 0 ? null : num5, (524288 & i12) != 0 ? null : str8, (1048576 & i12) != 0 ? null : userId2, (i12 & 2097152) != 0 ? null : num6);
    }
}
