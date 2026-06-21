package com.vk.sdk.api.account.dto;

import gf.a;
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
public final class AccountPushParams {

    @b("app_request")
    @Nullable
    private final List<AccountPushParamsOnoff> appRequest;

    @b("birthday")
    @Nullable
    private final List<AccountPushParamsOnoff> birthday;

    @b("chat")
    @Nullable
    private final List<AccountPushParamsMode> chat;

    @b("comment")
    @Nullable
    private final List<AccountPushParamsSettings> comment;

    @b("event_soon")
    @Nullable
    private final List<AccountPushParamsOnoff> eventSoon;

    @b("friend")
    @Nullable
    private final List<AccountPushParamsOnoff> friend;

    @b("friend_accepted")
    @Nullable
    private final List<AccountPushParamsOnoff> friendAccepted;

    @b("friend_found")
    @Nullable
    private final List<AccountPushParamsOnoff> friendFound;

    @b("group_accepted")
    @Nullable
    private final List<AccountPushParamsOnoff> groupAccepted;

    @b("group_invite")
    @Nullable
    private final List<AccountPushParamsOnoff> groupInvite;

    @b("like")
    @Nullable
    private final List<AccountPushParamsSettings> like;

    @b("mention")
    @Nullable
    private final List<AccountPushParamsSettings> mention;

    @b("msg")
    @Nullable
    private final List<AccountPushParamsMode> msg;

    @b("new_post")
    @Nullable
    private final List<AccountPushParamsOnoff> newPost;

    @b("reply")
    @Nullable
    private final List<AccountPushParamsOnoff> reply;

    @b("repost")
    @Nullable
    private final List<AccountPushParamsSettings> repost;

    @b("sdk_open")
    @Nullable
    private final List<AccountPushParamsOnoff> sdkOpen;

    @b("wall_post")
    @Nullable
    private final List<AccountPushParamsOnoff> wallPost;

    @b("wall_publish")
    @Nullable
    private final List<AccountPushParamsOnoff> wallPublish;

    public AccountPushParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountPushParams copy$default(AccountPushParams accountPushParams, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, int i, Object obj) {
        List list20;
        List list21;
        List list22 = (i & 1) != 0 ? accountPushParams.msg : list;
        List list23 = (i & 2) != 0 ? accountPushParams.chat : list2;
        List list24 = (i & 4) != 0 ? accountPushParams.like : list3;
        List list25 = (i & 8) != 0 ? accountPushParams.repost : list4;
        List list26 = (i & 16) != 0 ? accountPushParams.comment : list5;
        List list27 = (i & 32) != 0 ? accountPushParams.mention : list6;
        List list28 = (i & 64) != 0 ? accountPushParams.reply : list7;
        List list29 = (i & 128) != 0 ? accountPushParams.newPost : list8;
        List list30 = (i & 256) != 0 ? accountPushParams.wallPost : list9;
        List list31 = (i & 512) != 0 ? accountPushParams.wallPublish : list10;
        List list32 = (i & 1024) != 0 ? accountPushParams.friend : list11;
        List list33 = (i & 2048) != 0 ? accountPushParams.friendFound : list12;
        List list34 = (i & 4096) != 0 ? accountPushParams.friendAccepted : list13;
        List list35 = (i & 8192) != 0 ? accountPushParams.groupInvite : list14;
        List list36 = list22;
        List list37 = (i & 16384) != 0 ? accountPushParams.groupAccepted : list15;
        List list38 = (i & 32768) != 0 ? accountPushParams.birthday : list16;
        List list39 = (i & 65536) != 0 ? accountPushParams.eventSoon : list17;
        List list40 = (i & 131072) != 0 ? accountPushParams.appRequest : list18;
        if ((i & 262144) != 0) {
            list21 = list40;
            list20 = accountPushParams.sdkOpen;
        } else {
            list20 = list19;
            list21 = list40;
        }
        return accountPushParams.copy(list36, list23, list24, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list35, list37, list38, list39, list21, list20);
    }

    @Nullable
    public final List<AccountPushParamsMode> component1() {
        return this.msg;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component10() {
        return this.wallPublish;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component11() {
        return this.friend;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component12() {
        return this.friendFound;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component13() {
        return this.friendAccepted;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component14() {
        return this.groupInvite;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component15() {
        return this.groupAccepted;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component16() {
        return this.birthday;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component17() {
        return this.eventSoon;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component18() {
        return this.appRequest;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component19() {
        return this.sdkOpen;
    }

    @Nullable
    public final List<AccountPushParamsMode> component2() {
        return this.chat;
    }

    @Nullable
    public final List<AccountPushParamsSettings> component3() {
        return this.like;
    }

    @Nullable
    public final List<AccountPushParamsSettings> component4() {
        return this.repost;
    }

    @Nullable
    public final List<AccountPushParamsSettings> component5() {
        return this.comment;
    }

    @Nullable
    public final List<AccountPushParamsSettings> component6() {
        return this.mention;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component7() {
        return this.reply;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component8() {
        return this.newPost;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> component9() {
        return this.wallPost;
    }

    @NotNull
    public final AccountPushParams copy(@Nullable List<? extends AccountPushParamsMode> list, @Nullable List<? extends AccountPushParamsMode> list2, @Nullable List<? extends AccountPushParamsSettings> list3, @Nullable List<? extends AccountPushParamsSettings> list4, @Nullable List<? extends AccountPushParamsSettings> list5, @Nullable List<? extends AccountPushParamsSettings> list6, @Nullable List<? extends AccountPushParamsOnoff> list7, @Nullable List<? extends AccountPushParamsOnoff> list8, @Nullable List<? extends AccountPushParamsOnoff> list9, @Nullable List<? extends AccountPushParamsOnoff> list10, @Nullable List<? extends AccountPushParamsOnoff> list11, @Nullable List<? extends AccountPushParamsOnoff> list12, @Nullable List<? extends AccountPushParamsOnoff> list13, @Nullable List<? extends AccountPushParamsOnoff> list14, @Nullable List<? extends AccountPushParamsOnoff> list15, @Nullable List<? extends AccountPushParamsOnoff> list16, @Nullable List<? extends AccountPushParamsOnoff> list17, @Nullable List<? extends AccountPushParamsOnoff> list18, @Nullable List<? extends AccountPushParamsOnoff> list19) {
        return new AccountPushParams(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, list19);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPushParams)) {
            return false;
        }
        AccountPushParams accountPushParams = (AccountPushParams) obj;
        return Intrinsics.a(this.msg, accountPushParams.msg) && Intrinsics.a(this.chat, accountPushParams.chat) && Intrinsics.a(this.like, accountPushParams.like) && Intrinsics.a(this.repost, accountPushParams.repost) && Intrinsics.a(this.comment, accountPushParams.comment) && Intrinsics.a(this.mention, accountPushParams.mention) && Intrinsics.a(this.reply, accountPushParams.reply) && Intrinsics.a(this.newPost, accountPushParams.newPost) && Intrinsics.a(this.wallPost, accountPushParams.wallPost) && Intrinsics.a(this.wallPublish, accountPushParams.wallPublish) && Intrinsics.a(this.friend, accountPushParams.friend) && Intrinsics.a(this.friendFound, accountPushParams.friendFound) && Intrinsics.a(this.friendAccepted, accountPushParams.friendAccepted) && Intrinsics.a(this.groupInvite, accountPushParams.groupInvite) && Intrinsics.a(this.groupAccepted, accountPushParams.groupAccepted) && Intrinsics.a(this.birthday, accountPushParams.birthday) && Intrinsics.a(this.eventSoon, accountPushParams.eventSoon) && Intrinsics.a(this.appRequest, accountPushParams.appRequest) && Intrinsics.a(this.sdkOpen, accountPushParams.sdkOpen);
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getAppRequest() {
        return this.appRequest;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getBirthday() {
        return this.birthday;
    }

    @Nullable
    public final List<AccountPushParamsMode> getChat() {
        return this.chat;
    }

    @Nullable
    public final List<AccountPushParamsSettings> getComment() {
        return this.comment;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getEventSoon() {
        return this.eventSoon;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getFriend() {
        return this.friend;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getFriendAccepted() {
        return this.friendAccepted;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getFriendFound() {
        return this.friendFound;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getGroupAccepted() {
        return this.groupAccepted;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getGroupInvite() {
        return this.groupInvite;
    }

    @Nullable
    public final List<AccountPushParamsSettings> getLike() {
        return this.like;
    }

    @Nullable
    public final List<AccountPushParamsSettings> getMention() {
        return this.mention;
    }

    @Nullable
    public final List<AccountPushParamsMode> getMsg() {
        return this.msg;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getNewPost() {
        return this.newPost;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getReply() {
        return this.reply;
    }

    @Nullable
    public final List<AccountPushParamsSettings> getRepost() {
        return this.repost;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getSdkOpen() {
        return this.sdkOpen;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getWallPost() {
        return this.wallPost;
    }

    @Nullable
    public final List<AccountPushParamsOnoff> getWallPublish() {
        return this.wallPublish;
    }

    public int hashCode() {
        List<AccountPushParamsMode> list = this.msg;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AccountPushParamsMode> list2 = this.chat;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AccountPushParamsSettings> list3 = this.like;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AccountPushParamsSettings> list4 = this.repost;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<AccountPushParamsSettings> list5 = this.comment;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<AccountPushParamsSettings> list6 = this.mention;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<AccountPushParamsOnoff> list7 = this.reply;
        int iHashCode7 = (iHashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<AccountPushParamsOnoff> list8 = this.newPost;
        int iHashCode8 = (iHashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<AccountPushParamsOnoff> list9 = this.wallPost;
        int iHashCode9 = (iHashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<AccountPushParamsOnoff> list10 = this.wallPublish;
        int iHashCode10 = (iHashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<AccountPushParamsOnoff> list11 = this.friend;
        int iHashCode11 = (iHashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<AccountPushParamsOnoff> list12 = this.friendFound;
        int iHashCode12 = (iHashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<AccountPushParamsOnoff> list13 = this.friendAccepted;
        int iHashCode13 = (iHashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<AccountPushParamsOnoff> list14 = this.groupInvite;
        int iHashCode14 = (iHashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<AccountPushParamsOnoff> list15 = this.groupAccepted;
        int iHashCode15 = (iHashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<AccountPushParamsOnoff> list16 = this.birthday;
        int iHashCode16 = (iHashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<AccountPushParamsOnoff> list17 = this.eventSoon;
        int iHashCode17 = (iHashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<AccountPushParamsOnoff> list18 = this.appRequest;
        int iHashCode18 = (iHashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<AccountPushParamsOnoff> list19 = this.sdkOpen;
        return iHashCode18 + (list19 != null ? list19.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<AccountPushParamsMode> list = this.msg;
        List<AccountPushParamsMode> list2 = this.chat;
        List<AccountPushParamsSettings> list3 = this.like;
        List<AccountPushParamsSettings> list4 = this.repost;
        List<AccountPushParamsSettings> list5 = this.comment;
        List<AccountPushParamsSettings> list6 = this.mention;
        List<AccountPushParamsOnoff> list7 = this.reply;
        List<AccountPushParamsOnoff> list8 = this.newPost;
        List<AccountPushParamsOnoff> list9 = this.wallPost;
        List<AccountPushParamsOnoff> list10 = this.wallPublish;
        List<AccountPushParamsOnoff> list11 = this.friend;
        List<AccountPushParamsOnoff> list12 = this.friendFound;
        List<AccountPushParamsOnoff> list13 = this.friendAccepted;
        List<AccountPushParamsOnoff> list14 = this.groupInvite;
        List<AccountPushParamsOnoff> list15 = this.groupAccepted;
        List<AccountPushParamsOnoff> list16 = this.birthday;
        List<AccountPushParamsOnoff> list17 = this.eventSoon;
        List<AccountPushParamsOnoff> list18 = this.appRequest;
        List<AccountPushParamsOnoff> list19 = this.sdkOpen;
        StringBuilder sb2 = new StringBuilder("AccountPushParams(msg=");
        sb2.append(list);
        sb2.append(", chat=");
        sb2.append(list2);
        sb2.append(", like=");
        a.u(sb2, list3, ", repost=", list4, ", comment=");
        a.u(sb2, list5, ", mention=", list6, ", reply=");
        a.u(sb2, list7, ", newPost=", list8, ", wallPost=");
        a.u(sb2, list9, ", wallPublish=", list10, ", friend=");
        a.u(sb2, list11, ", friendFound=", list12, ", friendAccepted=");
        a.u(sb2, list13, ", groupInvite=", list14, ", groupAccepted=");
        a.u(sb2, list15, ", birthday=", list16, ", eventSoon=");
        a.u(sb2, list17, ", appRequest=", list18, ", sdkOpen=");
        return z.h(sb2, list19, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountPushParams(@Nullable List<? extends AccountPushParamsMode> list, @Nullable List<? extends AccountPushParamsMode> list2, @Nullable List<? extends AccountPushParamsSettings> list3, @Nullable List<? extends AccountPushParamsSettings> list4, @Nullable List<? extends AccountPushParamsSettings> list5, @Nullable List<? extends AccountPushParamsSettings> list6, @Nullable List<? extends AccountPushParamsOnoff> list7, @Nullable List<? extends AccountPushParamsOnoff> list8, @Nullable List<? extends AccountPushParamsOnoff> list9, @Nullable List<? extends AccountPushParamsOnoff> list10, @Nullable List<? extends AccountPushParamsOnoff> list11, @Nullable List<? extends AccountPushParamsOnoff> list12, @Nullable List<? extends AccountPushParamsOnoff> list13, @Nullable List<? extends AccountPushParamsOnoff> list14, @Nullable List<? extends AccountPushParamsOnoff> list15, @Nullable List<? extends AccountPushParamsOnoff> list16, @Nullable List<? extends AccountPushParamsOnoff> list17, @Nullable List<? extends AccountPushParamsOnoff> list18, @Nullable List<? extends AccountPushParamsOnoff> list19) {
        this.msg = list;
        this.chat = list2;
        this.like = list3;
        this.repost = list4;
        this.comment = list5;
        this.mention = list6;
        this.reply = list7;
        this.newPost = list8;
        this.wallPost = list9;
        this.wallPublish = list10;
        this.friend = list11;
        this.friendFound = list12;
        this.friendAccepted = list13;
        this.groupInvite = list14;
        this.groupAccepted = list15;
        this.birthday = list16;
        this.eventSoon = list17;
        this.appRequest = list18;
        this.sdkOpen = list19;
    }

    public /* synthetic */ AccountPushParams(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? null : list6, (i & 64) != 0 ? null : list7, (i & 128) != 0 ? null : list8, (i & 256) != 0 ? null : list9, (i & 512) != 0 ? null : list10, (i & 1024) != 0 ? null : list11, (i & 2048) != 0 ? null : list12, (i & 4096) != 0 ? null : list13, (i & 8192) != 0 ? null : list14, (i & 16384) != 0 ? null : list15, (i & 32768) != 0 ? null : list16, (i & 65536) != 0 ? null : list17, (i & 131072) != 0 ? null : list18, (i & 262144) != 0 ? null : list19);
    }
}
