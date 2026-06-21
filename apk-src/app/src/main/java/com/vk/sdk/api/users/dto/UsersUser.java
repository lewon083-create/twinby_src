package com.vk.sdk.api.users.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseSex;
import com.vk.sdk.api.friends.dto.FriendsFriendStatusStatus;
import com.vk.sdk.api.friends.dto.FriendsRequestsMutual;
import gf.a;
import io.sentry.protocol.Device;
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
public final class UsersUser {

    @b("can_access_closed")
    @Nullable
    private final Boolean canAccessClosed;

    @b("deactivated")
    @Nullable
    private final String deactivated;

    @b("first_name")
    @Nullable
    private final String firstName;

    @b("friend_status")
    @Nullable
    private final FriendsFriendStatusStatus friendStatus;

    @b("hidden")
    @Nullable
    private final Integer hidden;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final UserId f15247id;

    @b("is_closed")
    @Nullable
    private final Boolean isClosed;

    @b("last_name")
    @Nullable
    private final String lastName;

    @b("mutual")
    @Nullable
    private final FriendsRequestsMutual mutual;

    @b(Device.JsonKeys.ONLINE)
    @Nullable
    private final BaseBoolInt online;

    @b("online_app")
    @Nullable
    private final Integer onlineApp;

    @b("online_info")
    @Nullable
    private final UsersOnlineInfo onlineInfo;

    @b("online_mobile")
    @Nullable
    private final BaseBoolInt onlineMobile;

    @b("photo_100")
    @Nullable
    private final String photo100;

    @b("photo_50")
    @Nullable
    private final String photo50;

    @b("screen_name")
    @Nullable
    private final String screenName;

    @b("sex")
    @Nullable
    private final BaseSex sex;

    @b("trending")
    @Nullable
    private final BaseBoolInt trending;

    @b("verified")
    @Nullable
    private final BaseBoolInt verified;

    public UsersUser(@NotNull UserId id2, @Nullable BaseSex baseSex, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable UsersOnlineInfo usersOnlineInfo, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable FriendsFriendStatusStatus friendsFriendStatusStatus, @Nullable FriendsRequestsMutual friendsRequestsMutual, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f15247id = id2;
        this.sex = baseSex;
        this.screenName = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.onlineInfo = usersOnlineInfo;
        this.online = baseBoolInt;
        this.onlineMobile = baseBoolInt2;
        this.onlineApp = num;
        this.verified = baseBoolInt3;
        this.trending = baseBoolInt4;
        this.friendStatus = friendsFriendStatusStatus;
        this.mutual = friendsRequestsMutual;
        this.deactivated = str4;
        this.firstName = str5;
        this.hidden = num2;
        this.lastName = str6;
        this.canAccessClosed = bool;
        this.isClosed = bool2;
    }

    public static /* synthetic */ UsersUser copy$default(UsersUser usersUser, UserId userId, BaseSex baseSex, String str, String str2, String str3, UsersOnlineInfo usersOnlineInfo, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, FriendsFriendStatusStatus friendsFriendStatusStatus, FriendsRequestsMutual friendsRequestsMutual, String str4, String str5, Integer num2, String str6, Boolean bool, Boolean bool2, int i, Object obj) {
        Boolean bool3;
        Boolean bool4;
        UserId userId2 = (i & 1) != 0 ? usersUser.f15247id : userId;
        BaseSex baseSex2 = (i & 2) != 0 ? usersUser.sex : baseSex;
        String str7 = (i & 4) != 0 ? usersUser.screenName : str;
        String str8 = (i & 8) != 0 ? usersUser.photo50 : str2;
        String str9 = (i & 16) != 0 ? usersUser.photo100 : str3;
        UsersOnlineInfo usersOnlineInfo2 = (i & 32) != 0 ? usersUser.onlineInfo : usersOnlineInfo;
        BaseBoolInt baseBoolInt5 = (i & 64) != 0 ? usersUser.online : baseBoolInt;
        BaseBoolInt baseBoolInt6 = (i & 128) != 0 ? usersUser.onlineMobile : baseBoolInt2;
        Integer num3 = (i & 256) != 0 ? usersUser.onlineApp : num;
        BaseBoolInt baseBoolInt7 = (i & 512) != 0 ? usersUser.verified : baseBoolInt3;
        BaseBoolInt baseBoolInt8 = (i & 1024) != 0 ? usersUser.trending : baseBoolInt4;
        FriendsFriendStatusStatus friendsFriendStatusStatus2 = (i & 2048) != 0 ? usersUser.friendStatus : friendsFriendStatusStatus;
        FriendsRequestsMutual friendsRequestsMutual2 = (i & 4096) != 0 ? usersUser.mutual : friendsRequestsMutual;
        String str10 = (i & 8192) != 0 ? usersUser.deactivated : str4;
        UserId userId3 = userId2;
        String str11 = (i & 16384) != 0 ? usersUser.firstName : str5;
        Integer num4 = (i & 32768) != 0 ? usersUser.hidden : num2;
        String str12 = (i & 65536) != 0 ? usersUser.lastName : str6;
        Boolean bool5 = (i & 131072) != 0 ? usersUser.canAccessClosed : bool;
        if ((i & 262144) != 0) {
            bool4 = bool5;
            bool3 = usersUser.isClosed;
        } else {
            bool3 = bool2;
            bool4 = bool5;
        }
        return usersUser.copy(userId3, baseSex2, str7, str8, str9, usersOnlineInfo2, baseBoolInt5, baseBoolInt6, num3, baseBoolInt7, baseBoolInt8, friendsFriendStatusStatus2, friendsRequestsMutual2, str10, str11, num4, str12, bool4, bool3);
    }

    @NotNull
    public final UserId component1() {
        return this.f15247id;
    }

    @Nullable
    public final BaseBoolInt component10() {
        return this.verified;
    }

    @Nullable
    public final BaseBoolInt component11() {
        return this.trending;
    }

    @Nullable
    public final FriendsFriendStatusStatus component12() {
        return this.friendStatus;
    }

    @Nullable
    public final FriendsRequestsMutual component13() {
        return this.mutual;
    }

    @Nullable
    public final String component14() {
        return this.deactivated;
    }

    @Nullable
    public final String component15() {
        return this.firstName;
    }

    @Nullable
    public final Integer component16() {
        return this.hidden;
    }

    @Nullable
    public final String component17() {
        return this.lastName;
    }

    @Nullable
    public final Boolean component18() {
        return this.canAccessClosed;
    }

    @Nullable
    public final Boolean component19() {
        return this.isClosed;
    }

    @Nullable
    public final BaseSex component2() {
        return this.sex;
    }

    @Nullable
    public final String component3() {
        return this.screenName;
    }

    @Nullable
    public final String component4() {
        return this.photo50;
    }

    @Nullable
    public final String component5() {
        return this.photo100;
    }

    @Nullable
    public final UsersOnlineInfo component6() {
        return this.onlineInfo;
    }

    @Nullable
    public final BaseBoolInt component7() {
        return this.online;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.onlineMobile;
    }

    @Nullable
    public final Integer component9() {
        return this.onlineApp;
    }

    @NotNull
    public final UsersUser copy(@NotNull UserId id2, @Nullable BaseSex baseSex, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable UsersOnlineInfo usersOnlineInfo, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num, @Nullable BaseBoolInt baseBoolInt3, @Nullable BaseBoolInt baseBoolInt4, @Nullable FriendsFriendStatusStatus friendsFriendStatusStatus, @Nullable FriendsRequestsMutual friendsRequestsMutual, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new UsersUser(id2, baseSex, str, str2, str3, usersOnlineInfo, baseBoolInt, baseBoolInt2, num, baseBoolInt3, baseBoolInt4, friendsFriendStatusStatus, friendsRequestsMutual, str4, str5, num2, str6, bool, bool2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUser)) {
            return false;
        }
        UsersUser usersUser = (UsersUser) obj;
        return Intrinsics.a(this.f15247id, usersUser.f15247id) && this.sex == usersUser.sex && Intrinsics.a(this.screenName, usersUser.screenName) && Intrinsics.a(this.photo50, usersUser.photo50) && Intrinsics.a(this.photo100, usersUser.photo100) && Intrinsics.a(this.onlineInfo, usersUser.onlineInfo) && this.online == usersUser.online && this.onlineMobile == usersUser.onlineMobile && Intrinsics.a(this.onlineApp, usersUser.onlineApp) && this.verified == usersUser.verified && this.trending == usersUser.trending && this.friendStatus == usersUser.friendStatus && Intrinsics.a(this.mutual, usersUser.mutual) && Intrinsics.a(this.deactivated, usersUser.deactivated) && Intrinsics.a(this.firstName, usersUser.firstName) && Intrinsics.a(this.hidden, usersUser.hidden) && Intrinsics.a(this.lastName, usersUser.lastName) && Intrinsics.a(this.canAccessClosed, usersUser.canAccessClosed) && Intrinsics.a(this.isClosed, usersUser.isClosed);
    }

    @Nullable
    public final Boolean getCanAccessClosed() {
        return this.canAccessClosed;
    }

    @Nullable
    public final String getDeactivated() {
        return this.deactivated;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final FriendsFriendStatusStatus getFriendStatus() {
        return this.friendStatus;
    }

    @Nullable
    public final Integer getHidden() {
        return this.hidden;
    }

    @NotNull
    public final UserId getId() {
        return this.f15247id;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final FriendsRequestsMutual getMutual() {
        return this.mutual;
    }

    @Nullable
    public final BaseBoolInt getOnline() {
        return this.online;
    }

    @Nullable
    public final Integer getOnlineApp() {
        return this.onlineApp;
    }

    @Nullable
    public final UsersOnlineInfo getOnlineInfo() {
        return this.onlineInfo;
    }

    @Nullable
    public final BaseBoolInt getOnlineMobile() {
        return this.onlineMobile;
    }

    @Nullable
    public final String getPhoto100() {
        return this.photo100;
    }

    @Nullable
    public final String getPhoto50() {
        return this.photo50;
    }

    @Nullable
    public final String getScreenName() {
        return this.screenName;
    }

    @Nullable
    public final BaseSex getSex() {
        return this.sex;
    }

    @Nullable
    public final BaseBoolInt getTrending() {
        return this.trending;
    }

    @Nullable
    public final BaseBoolInt getVerified() {
        return this.verified;
    }

    public int hashCode() {
        int iHashCode = this.f15247id.hashCode() * 31;
        BaseSex baseSex = this.sex;
        int iHashCode2 = (iHashCode + (baseSex == null ? 0 : baseSex.hashCode())) * 31;
        String str = this.screenName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo50;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo100;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UsersOnlineInfo usersOnlineInfo = this.onlineInfo;
        int iHashCode6 = (iHashCode5 + (usersOnlineInfo == null ? 0 : usersOnlineInfo.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.online;
        int iHashCode7 = (iHashCode6 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.onlineMobile;
        int iHashCode8 = (iHashCode7 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        Integer num = this.onlineApp;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.verified;
        int iHashCode10 = (iHashCode9 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.trending;
        int iHashCode11 = (iHashCode10 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        FriendsFriendStatusStatus friendsFriendStatusStatus = this.friendStatus;
        int iHashCode12 = (iHashCode11 + (friendsFriendStatusStatus == null ? 0 : friendsFriendStatusStatus.hashCode())) * 31;
        FriendsRequestsMutual friendsRequestsMutual = this.mutual;
        int iHashCode13 = (iHashCode12 + (friendsRequestsMutual == null ? 0 : friendsRequestsMutual.hashCode())) * 31;
        String str4 = this.deactivated;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstName;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.hidden;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.lastName;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.canAccessClosed;
        int iHashCode18 = (iHashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        return iHashCode18 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isClosed() {
        return this.isClosed;
    }

    @NotNull
    public String toString() {
        UserId userId = this.f15247id;
        BaseSex baseSex = this.sex;
        String str = this.screenName;
        String str2 = this.photo50;
        String str3 = this.photo100;
        UsersOnlineInfo usersOnlineInfo = this.onlineInfo;
        BaseBoolInt baseBoolInt = this.online;
        BaseBoolInt baseBoolInt2 = this.onlineMobile;
        Integer num = this.onlineApp;
        BaseBoolInt baseBoolInt3 = this.verified;
        BaseBoolInt baseBoolInt4 = this.trending;
        FriendsFriendStatusStatus friendsFriendStatusStatus = this.friendStatus;
        FriendsRequestsMutual friendsRequestsMutual = this.mutual;
        String str4 = this.deactivated;
        String str5 = this.firstName;
        Integer num2 = this.hidden;
        String str6 = this.lastName;
        Boolean bool = this.canAccessClosed;
        Boolean bool2 = this.isClosed;
        StringBuilder sb2 = new StringBuilder("UsersUser(id=");
        sb2.append(userId);
        sb2.append(", sex=");
        sb2.append(baseSex);
        sb2.append(", screenName=");
        o.t(sb2, str, ", photo50=", str2, ", photo100=");
        sb2.append(str3);
        sb2.append(", onlineInfo=");
        sb2.append(usersOnlineInfo);
        sb2.append(", online=");
        a.s(sb2, baseBoolInt, ", onlineMobile=", baseBoolInt2, ", onlineApp=");
        sb2.append(num);
        sb2.append(", verified=");
        sb2.append(baseBoolInt3);
        sb2.append(", trending=");
        sb2.append(baseBoolInt4);
        sb2.append(", friendStatus=");
        sb2.append(friendsFriendStatusStatus);
        sb2.append(", mutual=");
        sb2.append(friendsRequestsMutual);
        sb2.append(", deactivated=");
        sb2.append(str4);
        sb2.append(", firstName=");
        a.r(num2, str5, ", hidden=", ", lastName=", sb2);
        sb2.append(str6);
        sb2.append(", canAccessClosed=");
        sb2.append(bool);
        sb2.append(", isClosed=");
        sb2.append(bool2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ UsersUser(UserId userId, BaseSex baseSex, String str, String str2, String str3, UsersOnlineInfo usersOnlineInfo, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, FriendsFriendStatusStatus friendsFriendStatusStatus, FriendsRequestsMutual friendsRequestsMutual, String str4, String str5, Integer num2, String str6, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, (i & 2) != 0 ? null : baseSex, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : usersOnlineInfo, (i & 64) != 0 ? null : baseBoolInt, (i & 128) != 0 ? null : baseBoolInt2, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : baseBoolInt3, (i & 1024) != 0 ? null : baseBoolInt4, (i & 2048) != 0 ? null : friendsFriendStatusStatus, (i & 4096) != 0 ? null : friendsRequestsMutual, (i & 8192) != 0 ? null : str4, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? null : num2, (i & 65536) != 0 ? null : str6, (i & 131072) != 0 ? null : bool, (i & 262144) != 0 ? null : bool2);
    }
}
