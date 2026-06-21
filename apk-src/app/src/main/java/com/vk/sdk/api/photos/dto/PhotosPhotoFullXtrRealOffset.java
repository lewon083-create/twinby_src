package com.vk.sdk.api.photos.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseLikes;
import com.vk.sdk.api.base.dto.BaseObjectCount;
import com.vk.sdk.api.base.dto.BasePropertyExists;
import gf.a;
import io.sentry.TraceContext;
import io.sentry.UserFeedback;
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
public final class PhotosPhotoFullXtrRealOffset {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("album_id")
    private final int albumId;

    @b("can_comment")
    @Nullable
    private final BaseBoolInt canComment;

    @b(UserFeedback.JsonKeys.COMMENTS)
    @Nullable
    private final BaseObjectCount comments;

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
    private final int f15219id;

    @b("lat")
    @Nullable
    private final Float lat;

    @b("likes")
    @Nullable
    private final BaseLikes likes;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    @b("long")
    @Nullable
    private final Float f4long;

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

    @b("reposts")
    @Nullable
    private final BaseObjectCount reposts;

    @b("sizes")
    @Nullable
    private final List<PhotosPhotoSizes> sizes;

    @b("tags")
    @Nullable
    private final BaseObjectCount tags;

    @b("text")
    @Nullable
    private final String text;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final UserId userId;

    @b("width")
    @Nullable
    private final Integer width;

    public PhotosPhotoFullXtrRealOffset(int i, int i10, int i11, @NotNull UserId ownerId, @Nullable String str, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseObjectCount baseObjectCount, @Nullable Integer num, @Nullable BasePropertyExists basePropertyExists, @Nullable Float f10, @Nullable BaseLikes baseLikes, @Nullable Float f11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num2, @Nullable Integer num3, @Nullable BaseObjectCount baseObjectCount2, @Nullable List<PhotosPhotoSizes> list, @Nullable BaseObjectCount baseObjectCount3, @Nullable String str8, @Nullable UserId userId, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.albumId = i;
        this.date = i10;
        this.f15219id = i11;
        this.ownerId = ownerId;
        this.accessKey = str;
        this.canComment = baseBoolInt;
        this.comments = baseObjectCount;
        this.height = num;
        this.hidden = basePropertyExists;
        this.lat = f10;
        this.likes = baseLikes;
        this.f4long = f11;
        this.photo1280 = str2;
        this.photo130 = str3;
        this.photo2560 = str4;
        this.photo604 = str5;
        this.photo75 = str6;
        this.photo807 = str7;
        this.postId = num2;
        this.realOffset = num3;
        this.reposts = baseObjectCount2;
        this.sizes = list;
        this.tags = baseObjectCount3;
        this.text = str8;
        this.userId = userId;
        this.width = num4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosPhotoFullXtrRealOffset copy$default(PhotosPhotoFullXtrRealOffset photosPhotoFullXtrRealOffset, int i, int i10, int i11, UserId userId, String str, BaseBoolInt baseBoolInt, BaseObjectCount baseObjectCount, Integer num, BasePropertyExists basePropertyExists, Float f10, BaseLikes baseLikes, Float f11, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, BaseObjectCount baseObjectCount2, List list, BaseObjectCount baseObjectCount3, String str8, UserId userId2, Integer num4, int i12, Object obj) {
        Integer num5;
        UserId userId3;
        int i13 = (i12 & 1) != 0 ? photosPhotoFullXtrRealOffset.albumId : i;
        int i14 = (i12 & 2) != 0 ? photosPhotoFullXtrRealOffset.date : i10;
        int i15 = (i12 & 4) != 0 ? photosPhotoFullXtrRealOffset.f15219id : i11;
        UserId userId4 = (i12 & 8) != 0 ? photosPhotoFullXtrRealOffset.ownerId : userId;
        String str9 = (i12 & 16) != 0 ? photosPhotoFullXtrRealOffset.accessKey : str;
        BaseBoolInt baseBoolInt2 = (i12 & 32) != 0 ? photosPhotoFullXtrRealOffset.canComment : baseBoolInt;
        BaseObjectCount baseObjectCount4 = (i12 & 64) != 0 ? photosPhotoFullXtrRealOffset.comments : baseObjectCount;
        Integer num6 = (i12 & 128) != 0 ? photosPhotoFullXtrRealOffset.height : num;
        BasePropertyExists basePropertyExists2 = (i12 & 256) != 0 ? photosPhotoFullXtrRealOffset.hidden : basePropertyExists;
        Float f12 = (i12 & 512) != 0 ? photosPhotoFullXtrRealOffset.lat : f10;
        BaseLikes baseLikes2 = (i12 & 1024) != 0 ? photosPhotoFullXtrRealOffset.likes : baseLikes;
        Float f13 = (i12 & 2048) != 0 ? photosPhotoFullXtrRealOffset.f4long : f11;
        String str10 = (i12 & 4096) != 0 ? photosPhotoFullXtrRealOffset.photo1280 : str2;
        String str11 = (i12 & 8192) != 0 ? photosPhotoFullXtrRealOffset.photo130 : str3;
        int i16 = i13;
        String str12 = (i12 & 16384) != 0 ? photosPhotoFullXtrRealOffset.photo2560 : str4;
        String str13 = (i12 & 32768) != 0 ? photosPhotoFullXtrRealOffset.photo604 : str5;
        String str14 = (i12 & 65536) != 0 ? photosPhotoFullXtrRealOffset.photo75 : str6;
        String str15 = (i12 & 131072) != 0 ? photosPhotoFullXtrRealOffset.photo807 : str7;
        Integer num7 = (i12 & 262144) != 0 ? photosPhotoFullXtrRealOffset.postId : num2;
        Integer num8 = (i12 & 524288) != 0 ? photosPhotoFullXtrRealOffset.realOffset : num3;
        BaseObjectCount baseObjectCount5 = (i12 & 1048576) != 0 ? photosPhotoFullXtrRealOffset.reposts : baseObjectCount2;
        List list2 = (i12 & 2097152) != 0 ? photosPhotoFullXtrRealOffset.sizes : list;
        BaseObjectCount baseObjectCount6 = (i12 & 4194304) != 0 ? photosPhotoFullXtrRealOffset.tags : baseObjectCount3;
        String str16 = (i12 & 8388608) != 0 ? photosPhotoFullXtrRealOffset.text : str8;
        UserId userId5 = (i12 & 16777216) != 0 ? photosPhotoFullXtrRealOffset.userId : userId2;
        if ((i12 & 33554432) != 0) {
            userId3 = userId5;
            num5 = photosPhotoFullXtrRealOffset.width;
        } else {
            num5 = num4;
            userId3 = userId5;
        }
        return photosPhotoFullXtrRealOffset.copy(i16, i14, i15, userId4, str9, baseBoolInt2, baseObjectCount4, num6, basePropertyExists2, f12, baseLikes2, f13, str10, str11, str12, str13, str14, str15, num7, num8, baseObjectCount5, list2, baseObjectCount6, str16, userId3, num5);
    }

    public final int component1() {
        return this.albumId;
    }

    @Nullable
    public final Float component10() {
        return this.lat;
    }

    @Nullable
    public final BaseLikes component11() {
        return this.likes;
    }

    @Nullable
    public final Float component12() {
        return this.f4long;
    }

    @Nullable
    public final String component13() {
        return this.photo1280;
    }

    @Nullable
    public final String component14() {
        return this.photo130;
    }

    @Nullable
    public final String component15() {
        return this.photo2560;
    }

    @Nullable
    public final String component16() {
        return this.photo604;
    }

    @Nullable
    public final String component17() {
        return this.photo75;
    }

    @Nullable
    public final String component18() {
        return this.photo807;
    }

    @Nullable
    public final Integer component19() {
        return this.postId;
    }

    public final int component2() {
        return this.date;
    }

    @Nullable
    public final Integer component20() {
        return this.realOffset;
    }

    @Nullable
    public final BaseObjectCount component21() {
        return this.reposts;
    }

    @Nullable
    public final List<PhotosPhotoSizes> component22() {
        return this.sizes;
    }

    @Nullable
    public final BaseObjectCount component23() {
        return this.tags;
    }

    @Nullable
    public final String component24() {
        return this.text;
    }

    @Nullable
    public final UserId component25() {
        return this.userId;
    }

    @Nullable
    public final Integer component26() {
        return this.width;
    }

    public final int component3() {
        return this.f15219id;
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
    public final BaseBoolInt component6() {
        return this.canComment;
    }

    @Nullable
    public final BaseObjectCount component7() {
        return this.comments;
    }

    @Nullable
    public final Integer component8() {
        return this.height;
    }

    @Nullable
    public final BasePropertyExists component9() {
        return this.hidden;
    }

    @NotNull
    public final PhotosPhotoFullXtrRealOffset copy(int i, int i10, int i11, @NotNull UserId ownerId, @Nullable String str, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseObjectCount baseObjectCount, @Nullable Integer num, @Nullable BasePropertyExists basePropertyExists, @Nullable Float f10, @Nullable BaseLikes baseLikes, @Nullable Float f11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num2, @Nullable Integer num3, @Nullable BaseObjectCount baseObjectCount2, @Nullable List<PhotosPhotoSizes> list, @Nullable BaseObjectCount baseObjectCount3, @Nullable String str8, @Nullable UserId userId, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        return new PhotosPhotoFullXtrRealOffset(i, i10, i11, ownerId, str, baseBoolInt, baseObjectCount, num, basePropertyExists, f10, baseLikes, f11, str2, str3, str4, str5, str6, str7, num2, num3, baseObjectCount2, list, baseObjectCount3, str8, userId, num4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoFullXtrRealOffset)) {
            return false;
        }
        PhotosPhotoFullXtrRealOffset photosPhotoFullXtrRealOffset = (PhotosPhotoFullXtrRealOffset) obj;
        return this.albumId == photosPhotoFullXtrRealOffset.albumId && this.date == photosPhotoFullXtrRealOffset.date && this.f15219id == photosPhotoFullXtrRealOffset.f15219id && Intrinsics.a(this.ownerId, photosPhotoFullXtrRealOffset.ownerId) && Intrinsics.a(this.accessKey, photosPhotoFullXtrRealOffset.accessKey) && this.canComment == photosPhotoFullXtrRealOffset.canComment && Intrinsics.a(this.comments, photosPhotoFullXtrRealOffset.comments) && Intrinsics.a(this.height, photosPhotoFullXtrRealOffset.height) && this.hidden == photosPhotoFullXtrRealOffset.hidden && Intrinsics.a(this.lat, photosPhotoFullXtrRealOffset.lat) && Intrinsics.a(this.likes, photosPhotoFullXtrRealOffset.likes) && Intrinsics.a(this.f4long, photosPhotoFullXtrRealOffset.f4long) && Intrinsics.a(this.photo1280, photosPhotoFullXtrRealOffset.photo1280) && Intrinsics.a(this.photo130, photosPhotoFullXtrRealOffset.photo130) && Intrinsics.a(this.photo2560, photosPhotoFullXtrRealOffset.photo2560) && Intrinsics.a(this.photo604, photosPhotoFullXtrRealOffset.photo604) && Intrinsics.a(this.photo75, photosPhotoFullXtrRealOffset.photo75) && Intrinsics.a(this.photo807, photosPhotoFullXtrRealOffset.photo807) && Intrinsics.a(this.postId, photosPhotoFullXtrRealOffset.postId) && Intrinsics.a(this.realOffset, photosPhotoFullXtrRealOffset.realOffset) && Intrinsics.a(this.reposts, photosPhotoFullXtrRealOffset.reposts) && Intrinsics.a(this.sizes, photosPhotoFullXtrRealOffset.sizes) && Intrinsics.a(this.tags, photosPhotoFullXtrRealOffset.tags) && Intrinsics.a(this.text, photosPhotoFullXtrRealOffset.text) && Intrinsics.a(this.userId, photosPhotoFullXtrRealOffset.userId) && Intrinsics.a(this.width, photosPhotoFullXtrRealOffset.width);
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

    @Nullable
    public final BaseObjectCount getComments() {
        return this.comments;
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
        return this.f15219id;
    }

    @Nullable
    public final Float getLat() {
        return this.lat;
    }

    @Nullable
    public final BaseLikes getLikes() {
        return this.likes;
    }

    @Nullable
    public final Float getLong() {
        return this.f4long;
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
    public final BaseObjectCount getReposts() {
        return this.reposts;
    }

    @Nullable
    public final List<PhotosPhotoSizes> getSizes() {
        return this.sizes;
    }

    @Nullable
    public final BaseObjectCount getTags() {
        return this.tags;
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
        int iE = o.e(this.ownerId, u.g(this.f15219id, u.g(this.date, Integer.hashCode(this.albumId) * 31, 31), 31), 31);
        String str = this.accessKey;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.canComment;
        int iHashCode2 = (iHashCode + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseObjectCount baseObjectCount = this.comments;
        int iHashCode3 = (iHashCode2 + (baseObjectCount == null ? 0 : baseObjectCount.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BasePropertyExists basePropertyExists = this.hidden;
        int iHashCode5 = (iHashCode4 + (basePropertyExists == null ? 0 : basePropertyExists.hashCode())) * 31;
        Float f10 = this.lat;
        int iHashCode6 = (iHashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31;
        BaseLikes baseLikes = this.likes;
        int iHashCode7 = (iHashCode6 + (baseLikes == null ? 0 : baseLikes.hashCode())) * 31;
        Float f11 = this.f4long;
        int iHashCode8 = (iHashCode7 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str2 = this.photo1280;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo130;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo2560;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo604;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo75;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo807;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.postId;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.realOffset;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BaseObjectCount baseObjectCount2 = this.reposts;
        int iHashCode17 = (iHashCode16 + (baseObjectCount2 == null ? 0 : baseObjectCount2.hashCode())) * 31;
        List<PhotosPhotoSizes> list = this.sizes;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        BaseObjectCount baseObjectCount3 = this.tags;
        int iHashCode19 = (iHashCode18 + (baseObjectCount3 == null ? 0 : baseObjectCount3.hashCode())) * 31;
        String str8 = this.text;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UserId userId = this.userId;
        int iHashCode21 = (iHashCode20 + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num4 = this.width;
        return iHashCode21 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.albumId;
        int i10 = this.date;
        int i11 = this.f15219id;
        UserId userId = this.ownerId;
        String str = this.accessKey;
        BaseBoolInt baseBoolInt = this.canComment;
        BaseObjectCount baseObjectCount = this.comments;
        Integer num = this.height;
        BasePropertyExists basePropertyExists = this.hidden;
        Float f10 = this.lat;
        BaseLikes baseLikes = this.likes;
        Float f11 = this.f4long;
        String str2 = this.photo1280;
        String str3 = this.photo130;
        String str4 = this.photo2560;
        String str5 = this.photo604;
        String str6 = this.photo75;
        String str7 = this.photo807;
        Integer num2 = this.postId;
        Integer num3 = this.realOffset;
        BaseObjectCount baseObjectCount2 = this.reposts;
        List<PhotosPhotoSizes> list = this.sizes;
        BaseObjectCount baseObjectCount3 = this.tags;
        String str8 = this.text;
        UserId userId2 = this.userId;
        Integer num4 = this.width;
        StringBuilder sbI = z.i("PhotosPhotoFullXtrRealOffset(albumId=", i, ", date=", i10, ", id=");
        sbI.append(i11);
        sbI.append(", ownerId=");
        sbI.append(userId);
        sbI.append(", accessKey=");
        sbI.append(str);
        sbI.append(", canComment=");
        sbI.append(baseBoolInt);
        sbI.append(", comments=");
        sbI.append(baseObjectCount);
        sbI.append(", height=");
        sbI.append(num);
        sbI.append(", hidden=");
        sbI.append(basePropertyExists);
        sbI.append(", lat=");
        sbI.append(f10);
        sbI.append(", likes=");
        sbI.append(baseLikes);
        sbI.append(", long=");
        sbI.append(f11);
        sbI.append(", photo1280=");
        o.t(sbI, str2, ", photo130=", str3, ", photo2560=");
        o.t(sbI, str4, ", photo604=", str5, ", photo75=");
        o.t(sbI, str6, ", photo807=", str7, ", postId=");
        a.t(sbI, num2, ", realOffset=", num3, ", reposts=");
        sbI.append(baseObjectCount2);
        sbI.append(", sizes=");
        sbI.append(list);
        sbI.append(", tags=");
        sbI.append(baseObjectCount3);
        sbI.append(", text=");
        sbI.append(str8);
        sbI.append(", userId=");
        sbI.append(userId2);
        sbI.append(", width=");
        sbI.append(num4);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ PhotosPhotoFullXtrRealOffset(int i, int i10, int i11, UserId userId, String str, BaseBoolInt baseBoolInt, BaseObjectCount baseObjectCount, Integer num, BasePropertyExists basePropertyExists, Float f10, BaseLikes baseLikes, Float f11, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, BaseObjectCount baseObjectCount2, List list, BaseObjectCount baseObjectCount3, String str8, UserId userId2, Integer num4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, userId, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : baseBoolInt, (i12 & 64) != 0 ? null : baseObjectCount, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : basePropertyExists, (i12 & 512) != 0 ? null : f10, (i12 & 1024) != 0 ? null : baseLikes, (i12 & 2048) != 0 ? null : f11, (i12 & 4096) != 0 ? null : str2, (i12 & 8192) != 0 ? null : str3, (i12 & 16384) != 0 ? null : str4, (32768 & i12) != 0 ? null : str5, (65536 & i12) != 0 ? null : str6, (131072 & i12) != 0 ? null : str7, (262144 & i12) != 0 ? null : num2, (524288 & i12) != 0 ? null : num3, (1048576 & i12) != 0 ? null : baseObjectCount2, (2097152 & i12) != 0 ? null : list, (4194304 & i12) != 0 ? null : baseObjectCount3, (8388608 & i12) != 0 ? null : str8, (16777216 & i12) != 0 ? null : userId2, (i12 & 33554432) != 0 ? null : num4);
    }
}
