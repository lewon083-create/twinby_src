package com.vk.sdk.api.photos.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BasePropertyExists;
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
public final class PhotosPhotoXtrRealOffset {

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

    @b("hidden")
    @Nullable
    private final BasePropertyExists hidden;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15225id;

    @b("lat")
    @Nullable
    private final Float lat;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    @b("long")
    @Nullable
    private final Float f5long;

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

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("real_offset")
    @Nullable
    private final Integer realOffset;

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

    public PhotosPhotoXtrRealOffset(int i, int i10, int i11, @NotNull UserId ownerId, @Nullable String str, @Nullable Integer num, @Nullable BasePropertyExists basePropertyExists, @Nullable Float f10, @Nullable Float f11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<PhotosPhotoSizes> list, @Nullable String str8, @Nullable UserId userId, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.albumId = i;
        this.date = i10;
        this.f15225id = i11;
        this.ownerId = ownerId;
        this.accessKey = str;
        this.height = num;
        this.hidden = basePropertyExists;
        this.lat = f10;
        this.f5long = f11;
        this.photo1280 = str2;
        this.photo130 = str3;
        this.photo2560 = str4;
        this.photo604 = str5;
        this.photo75 = str6;
        this.photo807 = str7;
        this.postId = num2;
        this.realOffset = num3;
        this.sizes = list;
        this.text = str8;
        this.userId = userId;
        this.width = num4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosPhotoXtrRealOffset copy$default(PhotosPhotoXtrRealOffset photosPhotoXtrRealOffset, int i, int i10, int i11, UserId userId, String str, Integer num, BasePropertyExists basePropertyExists, Float f10, Float f11, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, List list, String str8, UserId userId2, Integer num4, int i12, Object obj) {
        Integer num5;
        UserId userId3;
        int i13 = (i12 & 1) != 0 ? photosPhotoXtrRealOffset.albumId : i;
        int i14 = (i12 & 2) != 0 ? photosPhotoXtrRealOffset.date : i10;
        int i15 = (i12 & 4) != 0 ? photosPhotoXtrRealOffset.f15225id : i11;
        UserId userId4 = (i12 & 8) != 0 ? photosPhotoXtrRealOffset.ownerId : userId;
        String str9 = (i12 & 16) != 0 ? photosPhotoXtrRealOffset.accessKey : str;
        Integer num6 = (i12 & 32) != 0 ? photosPhotoXtrRealOffset.height : num;
        BasePropertyExists basePropertyExists2 = (i12 & 64) != 0 ? photosPhotoXtrRealOffset.hidden : basePropertyExists;
        Float f12 = (i12 & 128) != 0 ? photosPhotoXtrRealOffset.lat : f10;
        Float f13 = (i12 & 256) != 0 ? photosPhotoXtrRealOffset.f5long : f11;
        String str10 = (i12 & 512) != 0 ? photosPhotoXtrRealOffset.photo1280 : str2;
        String str11 = (i12 & 1024) != 0 ? photosPhotoXtrRealOffset.photo130 : str3;
        String str12 = (i12 & 2048) != 0 ? photosPhotoXtrRealOffset.photo2560 : str4;
        String str13 = (i12 & 4096) != 0 ? photosPhotoXtrRealOffset.photo604 : str5;
        String str14 = (i12 & 8192) != 0 ? photosPhotoXtrRealOffset.photo75 : str6;
        int i16 = i13;
        String str15 = (i12 & 16384) != 0 ? photosPhotoXtrRealOffset.photo807 : str7;
        Integer num7 = (i12 & 32768) != 0 ? photosPhotoXtrRealOffset.postId : num2;
        Integer num8 = (i12 & 65536) != 0 ? photosPhotoXtrRealOffset.realOffset : num3;
        List list2 = (i12 & 131072) != 0 ? photosPhotoXtrRealOffset.sizes : list;
        String str16 = (i12 & 262144) != 0 ? photosPhotoXtrRealOffset.text : str8;
        UserId userId5 = (i12 & 524288) != 0 ? photosPhotoXtrRealOffset.userId : userId2;
        if ((i12 & 1048576) != 0) {
            userId3 = userId5;
            num5 = photosPhotoXtrRealOffset.width;
        } else {
            num5 = num4;
            userId3 = userId5;
        }
        return photosPhotoXtrRealOffset.copy(i16, i14, i15, userId4, str9, num6, basePropertyExists2, f12, f13, str10, str11, str12, str13, str14, str15, num7, num8, list2, str16, userId3, num5);
    }

    public final int component1() {
        return this.albumId;
    }

    @Nullable
    public final String component10() {
        return this.photo1280;
    }

    @Nullable
    public final String component11() {
        return this.photo130;
    }

    @Nullable
    public final String component12() {
        return this.photo2560;
    }

    @Nullable
    public final String component13() {
        return this.photo604;
    }

    @Nullable
    public final String component14() {
        return this.photo75;
    }

    @Nullable
    public final String component15() {
        return this.photo807;
    }

    @Nullable
    public final Integer component16() {
        return this.postId;
    }

    @Nullable
    public final Integer component17() {
        return this.realOffset;
    }

    @Nullable
    public final List<PhotosPhotoSizes> component18() {
        return this.sizes;
    }

    @Nullable
    public final String component19() {
        return this.text;
    }

    public final int component2() {
        return this.date;
    }

    @Nullable
    public final UserId component20() {
        return this.userId;
    }

    @Nullable
    public final Integer component21() {
        return this.width;
    }

    public final int component3() {
        return this.f15225id;
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
    public final BasePropertyExists component7() {
        return this.hidden;
    }

    @Nullable
    public final Float component8() {
        return this.lat;
    }

    @Nullable
    public final Float component9() {
        return this.f5long;
    }

    @NotNull
    public final PhotosPhotoXtrRealOffset copy(int i, int i10, int i11, @NotNull UserId ownerId, @Nullable String str, @Nullable Integer num, @Nullable BasePropertyExists basePropertyExists, @Nullable Float f10, @Nullable Float f11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<PhotosPhotoSizes> list, @Nullable String str8, @Nullable UserId userId, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        return new PhotosPhotoXtrRealOffset(i, i10, i11, ownerId, str, num, basePropertyExists, f10, f11, str2, str3, str4, str5, str6, str7, num2, num3, list, str8, userId, num4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoXtrRealOffset)) {
            return false;
        }
        PhotosPhotoXtrRealOffset photosPhotoXtrRealOffset = (PhotosPhotoXtrRealOffset) obj;
        return this.albumId == photosPhotoXtrRealOffset.albumId && this.date == photosPhotoXtrRealOffset.date && this.f15225id == photosPhotoXtrRealOffset.f15225id && Intrinsics.a(this.ownerId, photosPhotoXtrRealOffset.ownerId) && Intrinsics.a(this.accessKey, photosPhotoXtrRealOffset.accessKey) && Intrinsics.a(this.height, photosPhotoXtrRealOffset.height) && this.hidden == photosPhotoXtrRealOffset.hidden && Intrinsics.a(this.lat, photosPhotoXtrRealOffset.lat) && Intrinsics.a(this.f5long, photosPhotoXtrRealOffset.f5long) && Intrinsics.a(this.photo1280, photosPhotoXtrRealOffset.photo1280) && Intrinsics.a(this.photo130, photosPhotoXtrRealOffset.photo130) && Intrinsics.a(this.photo2560, photosPhotoXtrRealOffset.photo2560) && Intrinsics.a(this.photo604, photosPhotoXtrRealOffset.photo604) && Intrinsics.a(this.photo75, photosPhotoXtrRealOffset.photo75) && Intrinsics.a(this.photo807, photosPhotoXtrRealOffset.photo807) && Intrinsics.a(this.postId, photosPhotoXtrRealOffset.postId) && Intrinsics.a(this.realOffset, photosPhotoXtrRealOffset.realOffset) && Intrinsics.a(this.sizes, photosPhotoXtrRealOffset.sizes) && Intrinsics.a(this.text, photosPhotoXtrRealOffset.text) && Intrinsics.a(this.userId, photosPhotoXtrRealOffset.userId) && Intrinsics.a(this.width, photosPhotoXtrRealOffset.width);
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

    @Nullable
    public final BasePropertyExists getHidden() {
        return this.hidden;
    }

    public final int getId() {
        return this.f15225id;
    }

    @Nullable
    public final Float getLat() {
        return this.lat;
    }

    @Nullable
    public final Float getLong() {
        return this.f5long;
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
    public final Integer getPostId() {
        return this.postId;
    }

    @Nullable
    public final Integer getRealOffset() {
        return this.realOffset;
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

    public int hashCode() {
        int iE = o.e(this.ownerId, u.g(this.f15225id, u.g(this.date, Integer.hashCode(this.albumId) * 31, 31), 31), 31);
        String str = this.accessKey;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        BasePropertyExists basePropertyExists = this.hidden;
        int iHashCode3 = (iHashCode2 + (basePropertyExists == null ? 0 : basePropertyExists.hashCode())) * 31;
        Float f10 = this.lat;
        int iHashCode4 = (iHashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f5long;
        int iHashCode5 = (iHashCode4 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str2 = this.photo1280;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo130;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo2560;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo604;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo75;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo807;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.postId;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.realOffset;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<PhotosPhotoSizes> list = this.sizes;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.text;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UserId userId = this.userId;
        int iHashCode16 = (iHashCode15 + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num4 = this.width;
        return iHashCode16 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.albumId;
        int i10 = this.date;
        int i11 = this.f15225id;
        UserId userId = this.ownerId;
        String str = this.accessKey;
        Integer num = this.height;
        BasePropertyExists basePropertyExists = this.hidden;
        Float f10 = this.lat;
        Float f11 = this.f5long;
        String str2 = this.photo1280;
        String str3 = this.photo130;
        String str4 = this.photo2560;
        String str5 = this.photo604;
        String str6 = this.photo75;
        String str7 = this.photo807;
        Integer num2 = this.postId;
        Integer num3 = this.realOffset;
        List<PhotosPhotoSizes> list = this.sizes;
        String str8 = this.text;
        UserId userId2 = this.userId;
        Integer num4 = this.width;
        StringBuilder sbI = z.i("PhotosPhotoXtrRealOffset(albumId=", i, ", date=", i10, ", id=");
        sbI.append(i11);
        sbI.append(", ownerId=");
        sbI.append(userId);
        sbI.append(", accessKey=");
        a.r(num, str, ", height=", ", hidden=", sbI);
        sbI.append(basePropertyExists);
        sbI.append(", lat=");
        sbI.append(f10);
        sbI.append(", long=");
        sbI.append(f11);
        sbI.append(", photo1280=");
        sbI.append(str2);
        sbI.append(", photo130=");
        o.t(sbI, str3, ", photo2560=", str4, ", photo604=");
        o.t(sbI, str5, ", photo75=", str6, ", photo807=");
        a.r(num2, str7, ", postId=", ", realOffset=", sbI);
        sbI.append(num3);
        sbI.append(", sizes=");
        sbI.append(list);
        sbI.append(", text=");
        sbI.append(str8);
        sbI.append(", userId=");
        sbI.append(userId2);
        sbI.append(", width=");
        return u.m(sbI, num4, ")");
    }

    public /* synthetic */ PhotosPhotoXtrRealOffset(int i, int i10, int i11, UserId userId, String str, Integer num, BasePropertyExists basePropertyExists, Float f10, Float f11, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, List list, String str8, UserId userId2, Integer num4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, userId, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : basePropertyExists, (i12 & 128) != 0 ? null : f10, (i12 & 256) != 0 ? null : f11, (i12 & 512) != 0 ? null : str2, (i12 & 1024) != 0 ? null : str3, (i12 & 2048) != 0 ? null : str4, (i12 & 4096) != 0 ? null : str5, (i12 & 8192) != 0 ? null : str6, (i12 & 16384) != 0 ? null : str7, (32768 & i12) != 0 ? null : num2, (65536 & i12) != 0 ? null : num3, (131072 & i12) != 0 ? null : list, (262144 & i12) != 0 ? null : str8, (524288 & i12) != 0 ? null : userId2, (i12 & 1048576) != 0 ? null : num4);
    }
}
