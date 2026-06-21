package com.vk.sdk.api.groups.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.video.dto.VideoLiveInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class GroupsGroup {

    @b("admin_level")
    @Nullable
    private final GroupsGroupAdminLevel adminLevel;

    @b("deactivated")
    @Nullable
    private final String deactivated;

    @b("est_date")
    @Nullable
    private final String estDate;

    @b("finish_date")
    @Nullable
    private final Integer finishDate;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final UserId f15174id;

    @b("is_admin")
    @Nullable
    private final BaseBoolInt isAdmin;

    @b("is_advertiser")
    @Nullable
    private final BaseBoolInt isAdvertiser;

    @b("is_closed")
    @Nullable
    private final GroupsGroupIsClosed isClosed;

    @b("is_member")
    @Nullable
    private final BaseBoolInt isMember;

    @b("is_video_live_notifications_blocked")
    @Nullable
    private final BaseBoolInt isVideoLiveNotificationsBlocked;

    @b("name")
    @Nullable
    private final String name;

    @b("photo_100")
    @Nullable
    private final String photo100;

    @b("photo_200")
    @Nullable
    private final String photo200;

    @b("photo_200_orig")
    @Nullable
    private final String photo200Orig;

    @b("photo_400")
    @Nullable
    private final String photo400;

    @b("photo_400_orig")
    @Nullable
    private final String photo400Orig;

    @b("photo_50")
    @Nullable
    private final String photo50;

    @b("photo_max")
    @Nullable
    private final String photoMax;

    @b("photo_max_orig")
    @Nullable
    private final String photoMaxOrig;

    @b("photo_max_size")
    @Nullable
    private final GroupsPhotoSize photoMaxSize;

    @b("public_date_label")
    @Nullable
    private final String publicDateLabel;

    @b("screen_name")
    @Nullable
    private final String screenName;

    @b("start_date")
    @Nullable
    private final Integer startDate;

    @b("type")
    @Nullable
    private final GroupsGroupType type;

    @b("video_live")
    @Nullable
    private final VideoLiveInfo videoLive;

    public GroupsGroup(@NotNull UserId id2, @Nullable String str, @Nullable String str2, @Nullable GroupsGroupIsClosed groupsGroupIsClosed, @Nullable GroupsGroupType groupsGroupType, @Nullable BaseBoolInt baseBoolInt, @Nullable GroupsGroupAdminLevel groupsGroupAdminLevel, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable GroupsPhotoSize groupsPhotoSize, @Nullable BaseBoolInt baseBoolInt4, @Nullable VideoLiveInfo videoLiveInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f15174id = id2;
        this.name = str;
        this.screenName = str2;
        this.isClosed = groupsGroupIsClosed;
        this.type = groupsGroupType;
        this.isAdmin = baseBoolInt;
        this.adminLevel = groupsGroupAdminLevel;
        this.isMember = baseBoolInt2;
        this.isAdvertiser = baseBoolInt3;
        this.startDate = num;
        this.finishDate = num2;
        this.deactivated = str3;
        this.photo50 = str4;
        this.photo100 = str5;
        this.photo200 = str6;
        this.photo200Orig = str7;
        this.photo400 = str8;
        this.photo400Orig = str9;
        this.photoMax = str10;
        this.photoMaxOrig = str11;
        this.estDate = str12;
        this.publicDateLabel = str13;
        this.photoMaxSize = groupsPhotoSize;
        this.isVideoLiveNotificationsBlocked = baseBoolInt4;
        this.videoLive = videoLiveInfo;
    }

    public static /* synthetic */ GroupsGroup copy$default(GroupsGroup groupsGroup, UserId userId, String str, String str2, GroupsGroupIsClosed groupsGroupIsClosed, GroupsGroupType groupsGroupType, BaseBoolInt baseBoolInt, GroupsGroupAdminLevel groupsGroupAdminLevel, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, GroupsPhotoSize groupsPhotoSize, BaseBoolInt baseBoolInt4, VideoLiveInfo videoLiveInfo, int i, Object obj) {
        VideoLiveInfo videoLiveInfo2;
        BaseBoolInt baseBoolInt5;
        UserId userId2 = (i & 1) != 0 ? groupsGroup.f15174id : userId;
        String str14 = (i & 2) != 0 ? groupsGroup.name : str;
        String str15 = (i & 4) != 0 ? groupsGroup.screenName : str2;
        GroupsGroupIsClosed groupsGroupIsClosed2 = (i & 8) != 0 ? groupsGroup.isClosed : groupsGroupIsClosed;
        GroupsGroupType groupsGroupType2 = (i & 16) != 0 ? groupsGroup.type : groupsGroupType;
        BaseBoolInt baseBoolInt6 = (i & 32) != 0 ? groupsGroup.isAdmin : baseBoolInt;
        GroupsGroupAdminLevel groupsGroupAdminLevel2 = (i & 64) != 0 ? groupsGroup.adminLevel : groupsGroupAdminLevel;
        BaseBoolInt baseBoolInt7 = (i & 128) != 0 ? groupsGroup.isMember : baseBoolInt2;
        BaseBoolInt baseBoolInt8 = (i & 256) != 0 ? groupsGroup.isAdvertiser : baseBoolInt3;
        Integer num3 = (i & 512) != 0 ? groupsGroup.startDate : num;
        Integer num4 = (i & 1024) != 0 ? groupsGroup.finishDate : num2;
        String str16 = (i & 2048) != 0 ? groupsGroup.deactivated : str3;
        String str17 = (i & 4096) != 0 ? groupsGroup.photo50 : str4;
        String str18 = (i & 8192) != 0 ? groupsGroup.photo100 : str5;
        UserId userId3 = userId2;
        String str19 = (i & 16384) != 0 ? groupsGroup.photo200 : str6;
        String str20 = (i & 32768) != 0 ? groupsGroup.photo200Orig : str7;
        String str21 = (i & 65536) != 0 ? groupsGroup.photo400 : str8;
        String str22 = (i & 131072) != 0 ? groupsGroup.photo400Orig : str9;
        String str23 = (i & 262144) != 0 ? groupsGroup.photoMax : str10;
        String str24 = (i & 524288) != 0 ? groupsGroup.photoMaxOrig : str11;
        String str25 = (i & 1048576) != 0 ? groupsGroup.estDate : str12;
        String str26 = (i & 2097152) != 0 ? groupsGroup.publicDateLabel : str13;
        GroupsPhotoSize groupsPhotoSize2 = (i & 4194304) != 0 ? groupsGroup.photoMaxSize : groupsPhotoSize;
        BaseBoolInt baseBoolInt9 = (i & 8388608) != 0 ? groupsGroup.isVideoLiveNotificationsBlocked : baseBoolInt4;
        if ((i & 16777216) != 0) {
            baseBoolInt5 = baseBoolInt9;
            videoLiveInfo2 = groupsGroup.videoLive;
        } else {
            videoLiveInfo2 = videoLiveInfo;
            baseBoolInt5 = baseBoolInt9;
        }
        return groupsGroup.copy(userId3, str14, str15, groupsGroupIsClosed2, groupsGroupType2, baseBoolInt6, groupsGroupAdminLevel2, baseBoolInt7, baseBoolInt8, num3, num4, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, groupsPhotoSize2, baseBoolInt5, videoLiveInfo2);
    }

    @NotNull
    public final UserId component1() {
        return this.f15174id;
    }

    @Nullable
    public final Integer component10() {
        return this.startDate;
    }

    @Nullable
    public final Integer component11() {
        return this.finishDate;
    }

    @Nullable
    public final String component12() {
        return this.deactivated;
    }

    @Nullable
    public final String component13() {
        return this.photo50;
    }

    @Nullable
    public final String component14() {
        return this.photo100;
    }

    @Nullable
    public final String component15() {
        return this.photo200;
    }

    @Nullable
    public final String component16() {
        return this.photo200Orig;
    }

    @Nullable
    public final String component17() {
        return this.photo400;
    }

    @Nullable
    public final String component18() {
        return this.photo400Orig;
    }

    @Nullable
    public final String component19() {
        return this.photoMax;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component20() {
        return this.photoMaxOrig;
    }

    @Nullable
    public final String component21() {
        return this.estDate;
    }

    @Nullable
    public final String component22() {
        return this.publicDateLabel;
    }

    @Nullable
    public final GroupsPhotoSize component23() {
        return this.photoMaxSize;
    }

    @Nullable
    public final BaseBoolInt component24() {
        return this.isVideoLiveNotificationsBlocked;
    }

    @Nullable
    public final VideoLiveInfo component25() {
        return this.videoLive;
    }

    @Nullable
    public final String component3() {
        return this.screenName;
    }

    @Nullable
    public final GroupsGroupIsClosed component4() {
        return this.isClosed;
    }

    @Nullable
    public final GroupsGroupType component5() {
        return this.type;
    }

    @Nullable
    public final BaseBoolInt component6() {
        return this.isAdmin;
    }

    @Nullable
    public final GroupsGroupAdminLevel component7() {
        return this.adminLevel;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.isMember;
    }

    @Nullable
    public final BaseBoolInt component9() {
        return this.isAdvertiser;
    }

    @NotNull
    public final GroupsGroup copy(@NotNull UserId id2, @Nullable String str, @Nullable String str2, @Nullable GroupsGroupIsClosed groupsGroupIsClosed, @Nullable GroupsGroupType groupsGroupType, @Nullable BaseBoolInt baseBoolInt, @Nullable GroupsGroupAdminLevel groupsGroupAdminLevel, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable GroupsPhotoSize groupsPhotoSize, @Nullable BaseBoolInt baseBoolInt4, @Nullable VideoLiveInfo videoLiveInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new GroupsGroup(id2, str, str2, groupsGroupIsClosed, groupsGroupType, baseBoolInt, groupsGroupAdminLevel, baseBoolInt2, baseBoolInt3, num, num2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, groupsPhotoSize, baseBoolInt4, videoLiveInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroup)) {
            return false;
        }
        GroupsGroup groupsGroup = (GroupsGroup) obj;
        return Intrinsics.a(this.f15174id, groupsGroup.f15174id) && Intrinsics.a(this.name, groupsGroup.name) && Intrinsics.a(this.screenName, groupsGroup.screenName) && this.isClosed == groupsGroup.isClosed && this.type == groupsGroup.type && this.isAdmin == groupsGroup.isAdmin && this.adminLevel == groupsGroup.adminLevel && this.isMember == groupsGroup.isMember && this.isAdvertiser == groupsGroup.isAdvertiser && Intrinsics.a(this.startDate, groupsGroup.startDate) && Intrinsics.a(this.finishDate, groupsGroup.finishDate) && Intrinsics.a(this.deactivated, groupsGroup.deactivated) && Intrinsics.a(this.photo50, groupsGroup.photo50) && Intrinsics.a(this.photo100, groupsGroup.photo100) && Intrinsics.a(this.photo200, groupsGroup.photo200) && Intrinsics.a(this.photo200Orig, groupsGroup.photo200Orig) && Intrinsics.a(this.photo400, groupsGroup.photo400) && Intrinsics.a(this.photo400Orig, groupsGroup.photo400Orig) && Intrinsics.a(this.photoMax, groupsGroup.photoMax) && Intrinsics.a(this.photoMaxOrig, groupsGroup.photoMaxOrig) && Intrinsics.a(this.estDate, groupsGroup.estDate) && Intrinsics.a(this.publicDateLabel, groupsGroup.publicDateLabel) && Intrinsics.a(this.photoMaxSize, groupsGroup.photoMaxSize) && this.isVideoLiveNotificationsBlocked == groupsGroup.isVideoLiveNotificationsBlocked && Intrinsics.a(this.videoLive, groupsGroup.videoLive);
    }

    @Nullable
    public final GroupsGroupAdminLevel getAdminLevel() {
        return this.adminLevel;
    }

    @Nullable
    public final String getDeactivated() {
        return this.deactivated;
    }

    @Nullable
    public final String getEstDate() {
        return this.estDate;
    }

    @Nullable
    public final Integer getFinishDate() {
        return this.finishDate;
    }

    @NotNull
    public final UserId getId() {
        return this.f15174id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPhoto100() {
        return this.photo100;
    }

    @Nullable
    public final String getPhoto200() {
        return this.photo200;
    }

    @Nullable
    public final String getPhoto200Orig() {
        return this.photo200Orig;
    }

    @Nullable
    public final String getPhoto400() {
        return this.photo400;
    }

    @Nullable
    public final String getPhoto400Orig() {
        return this.photo400Orig;
    }

    @Nullable
    public final String getPhoto50() {
        return this.photo50;
    }

    @Nullable
    public final String getPhotoMax() {
        return this.photoMax;
    }

    @Nullable
    public final String getPhotoMaxOrig() {
        return this.photoMaxOrig;
    }

    @Nullable
    public final GroupsPhotoSize getPhotoMaxSize() {
        return this.photoMaxSize;
    }

    @Nullable
    public final String getPublicDateLabel() {
        return this.publicDateLabel;
    }

    @Nullable
    public final String getScreenName() {
        return this.screenName;
    }

    @Nullable
    public final Integer getStartDate() {
        return this.startDate;
    }

    @Nullable
    public final GroupsGroupType getType() {
        return this.type;
    }

    @Nullable
    public final VideoLiveInfo getVideoLive() {
        return this.videoLive;
    }

    public int hashCode() {
        int iHashCode = this.f15174id.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GroupsGroupIsClosed groupsGroupIsClosed = this.isClosed;
        int iHashCode4 = (iHashCode3 + (groupsGroupIsClosed == null ? 0 : groupsGroupIsClosed.hashCode())) * 31;
        GroupsGroupType groupsGroupType = this.type;
        int iHashCode5 = (iHashCode4 + (groupsGroupType == null ? 0 : groupsGroupType.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.isAdmin;
        int iHashCode6 = (iHashCode5 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        GroupsGroupAdminLevel groupsGroupAdminLevel = this.adminLevel;
        int iHashCode7 = (iHashCode6 + (groupsGroupAdminLevel == null ? 0 : groupsGroupAdminLevel.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.isMember;
        int iHashCode8 = (iHashCode7 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.isAdvertiser;
        int iHashCode9 = (iHashCode8 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        Integer num = this.startDate;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.finishDate;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.deactivated;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo50;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo100;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo200;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo200Orig;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.photo400;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.photo400Orig;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.photoMax;
        int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.photoMaxOrig;
        int iHashCode20 = (iHashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.estDate;
        int iHashCode21 = (iHashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.publicDateLabel;
        int iHashCode22 = (iHashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        GroupsPhotoSize groupsPhotoSize = this.photoMaxSize;
        int iHashCode23 = (iHashCode22 + (groupsPhotoSize == null ? 0 : groupsPhotoSize.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.isVideoLiveNotificationsBlocked;
        int iHashCode24 = (iHashCode23 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        VideoLiveInfo videoLiveInfo = this.videoLive;
        return iHashCode24 + (videoLiveInfo != null ? videoLiveInfo.hashCode() : 0);
    }

    @Nullable
    public final BaseBoolInt isAdmin() {
        return this.isAdmin;
    }

    @Nullable
    public final BaseBoolInt isAdvertiser() {
        return this.isAdvertiser;
    }

    @Nullable
    public final GroupsGroupIsClosed isClosed() {
        return this.isClosed;
    }

    @Nullable
    public final BaseBoolInt isMember() {
        return this.isMember;
    }

    @Nullable
    public final BaseBoolInt isVideoLiveNotificationsBlocked() {
        return this.isVideoLiveNotificationsBlocked;
    }

    @NotNull
    public String toString() {
        UserId userId = this.f15174id;
        String str = this.name;
        String str2 = this.screenName;
        GroupsGroupIsClosed groupsGroupIsClosed = this.isClosed;
        GroupsGroupType groupsGroupType = this.type;
        BaseBoolInt baseBoolInt = this.isAdmin;
        GroupsGroupAdminLevel groupsGroupAdminLevel = this.adminLevel;
        BaseBoolInt baseBoolInt2 = this.isMember;
        BaseBoolInt baseBoolInt3 = this.isAdvertiser;
        Integer num = this.startDate;
        Integer num2 = this.finishDate;
        String str3 = this.deactivated;
        String str4 = this.photo50;
        String str5 = this.photo100;
        String str6 = this.photo200;
        String str7 = this.photo200Orig;
        String str8 = this.photo400;
        String str9 = this.photo400Orig;
        String str10 = this.photoMax;
        String str11 = this.photoMaxOrig;
        String str12 = this.estDate;
        String str13 = this.publicDateLabel;
        GroupsPhotoSize groupsPhotoSize = this.photoMaxSize;
        BaseBoolInt baseBoolInt4 = this.isVideoLiveNotificationsBlocked;
        VideoLiveInfo videoLiveInfo = this.videoLive;
        StringBuilder sb2 = new StringBuilder("GroupsGroup(id=");
        sb2.append(userId);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", screenName=");
        sb2.append(str2);
        sb2.append(", isClosed=");
        sb2.append(groupsGroupIsClosed);
        sb2.append(", type=");
        sb2.append(groupsGroupType);
        sb2.append(", isAdmin=");
        sb2.append(baseBoolInt);
        sb2.append(", adminLevel=");
        sb2.append(groupsGroupAdminLevel);
        sb2.append(", isMember=");
        sb2.append(baseBoolInt2);
        sb2.append(", isAdvertiser=");
        sb2.append(baseBoolInt3);
        sb2.append(", startDate=");
        sb2.append(num);
        sb2.append(", finishDate=");
        a.r(num2, ", deactivated=", str3, ", photo50=", sb2);
        o.t(sb2, str4, ", photo100=", str5, ", photo200=");
        o.t(sb2, str6, ", photo200Orig=", str7, ", photo400=");
        o.t(sb2, str8, ", photo400Orig=", str9, ", photoMax=");
        o.t(sb2, str10, ", photoMaxOrig=", str11, ", estDate=");
        o.t(sb2, str12, ", publicDateLabel=", str13, ", photoMaxSize=");
        sb2.append(groupsPhotoSize);
        sb2.append(", isVideoLiveNotificationsBlocked=");
        sb2.append(baseBoolInt4);
        sb2.append(", videoLive=");
        sb2.append(videoLiveInfo);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ GroupsGroup(UserId userId, String str, String str2, GroupsGroupIsClosed groupsGroupIsClosed, GroupsGroupType groupsGroupType, BaseBoolInt baseBoolInt, GroupsGroupAdminLevel groupsGroupAdminLevel, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, GroupsPhotoSize groupsPhotoSize, BaseBoolInt baseBoolInt4, VideoLiveInfo videoLiveInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : groupsGroupIsClosed, (i & 16) != 0 ? null : groupsGroupType, (i & 32) != 0 ? null : baseBoolInt, (i & 64) != 0 ? null : groupsGroupAdminLevel, (i & 128) != 0 ? null : baseBoolInt2, (i & 256) != 0 ? null : baseBoolInt3, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : str6, (i & 32768) != 0 ? null : str7, (i & 65536) != 0 ? null : str8, (i & 131072) != 0 ? null : str9, (i & 262144) != 0 ? null : str10, (i & 524288) != 0 ? null : str11, (i & 1048576) != 0 ? null : str12, (i & 2097152) != 0 ? null : str13, (i & 4194304) != 0 ? null : groupsPhotoSize, (i & 8388608) != 0 ? null : baseBoolInt4, (i & 16777216) != 0 ? null : videoLiveInfo);
    }
}
