package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
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
public final class MessagesChat {

    @b("admin_id")
    @NotNull
    private final UserId adminId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15193id;

    @b("is_default_photo")
    @Nullable
    private final Boolean isDefaultPhoto;

    @b("is_group_channel")
    @Nullable
    private final Boolean isGroupChannel;

    @b("kicked")
    @Nullable
    private final BaseBoolInt kicked;

    @b(RRWebVideoEvent.JsonKeys.LEFT)
    @Nullable
    private final BaseBoolInt left;

    @b("members_count")
    private final int membersCount;

    @b("photo_100")
    @Nullable
    private final String photo100;

    @b("photo_200")
    @Nullable
    private final String photo200;

    @b("photo_50")
    @Nullable
    private final String photo50;

    @b("push_settings")
    @Nullable
    private final MessagesChatPushSettings pushSettings;

    @b("title")
    @Nullable
    private final String title;

    @b("type")
    @NotNull
    private final String type;

    @b("users")
    @NotNull
    private final List<UserId> users;

    public MessagesChat(@NotNull UserId adminId, int i, @NotNull String type, @NotNull List<UserId> users, int i10, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable MessagesChatPushSettings messagesChatPushSettings, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(adminId, "adminId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(users, "users");
        this.adminId = adminId;
        this.f15193id = i;
        this.type = type;
        this.users = users;
        this.membersCount = i10;
        this.kicked = baseBoolInt;
        this.left = baseBoolInt2;
        this.photo100 = str;
        this.photo200 = str2;
        this.photo50 = str3;
        this.pushSettings = messagesChatPushSettings;
        this.title = str4;
        this.isDefaultPhoto = bool;
        this.isGroupChannel = bool2;
    }

    @NotNull
    public final UserId component1() {
        return this.adminId;
    }

    @Nullable
    public final String component10() {
        return this.photo50;
    }

    @Nullable
    public final MessagesChatPushSettings component11() {
        return this.pushSettings;
    }

    @Nullable
    public final String component12() {
        return this.title;
    }

    @Nullable
    public final Boolean component13() {
        return this.isDefaultPhoto;
    }

    @Nullable
    public final Boolean component14() {
        return this.isGroupChannel;
    }

    public final int component2() {
        return this.f15193id;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final List<UserId> component4() {
        return this.users;
    }

    public final int component5() {
        return this.membersCount;
    }

    @Nullable
    public final BaseBoolInt component6() {
        return this.kicked;
    }

    @Nullable
    public final BaseBoolInt component7() {
        return this.left;
    }

    @Nullable
    public final String component8() {
        return this.photo100;
    }

    @Nullable
    public final String component9() {
        return this.photo200;
    }

    @NotNull
    public final MessagesChat copy(@NotNull UserId adminId, int i, @NotNull String type, @NotNull List<UserId> users, int i10, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable MessagesChatPushSettings messagesChatPushSettings, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(adminId, "adminId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(users, "users");
        return new MessagesChat(adminId, i, type, users, i10, baseBoolInt, baseBoolInt2, str, str2, str3, messagesChatPushSettings, str4, bool, bool2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChat)) {
            return false;
        }
        MessagesChat messagesChat = (MessagesChat) obj;
        return Intrinsics.a(this.adminId, messagesChat.adminId) && this.f15193id == messagesChat.f15193id && Intrinsics.a(this.type, messagesChat.type) && Intrinsics.a(this.users, messagesChat.users) && this.membersCount == messagesChat.membersCount && this.kicked == messagesChat.kicked && this.left == messagesChat.left && Intrinsics.a(this.photo100, messagesChat.photo100) && Intrinsics.a(this.photo200, messagesChat.photo200) && Intrinsics.a(this.photo50, messagesChat.photo50) && Intrinsics.a(this.pushSettings, messagesChat.pushSettings) && Intrinsics.a(this.title, messagesChat.title) && Intrinsics.a(this.isDefaultPhoto, messagesChat.isDefaultPhoto) && Intrinsics.a(this.isGroupChannel, messagesChat.isGroupChannel);
    }

    @NotNull
    public final UserId getAdminId() {
        return this.adminId;
    }

    public final int getId() {
        return this.f15193id;
    }

    @Nullable
    public final BaseBoolInt getKicked() {
        return this.kicked;
    }

    @Nullable
    public final BaseBoolInt getLeft() {
        return this.left;
    }

    public final int getMembersCount() {
        return this.membersCount;
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
    public final String getPhoto50() {
        return this.photo50;
    }

    @Nullable
    public final MessagesChatPushSettings getPushSettings() {
        return this.pushSettings;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<UserId> getUsers() {
        return this.users;
    }

    public int hashCode() {
        int iG = u.g(this.membersCount, u.i(this.users, a.e(u.g(this.f15193id, this.adminId.hashCode() * 31, 31), 31, this.type), 31), 31);
        BaseBoolInt baseBoolInt = this.kicked;
        int iHashCode = (iG + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.left;
        int iHashCode2 = (iHashCode + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        String str = this.photo100;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo200;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo50;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MessagesChatPushSettings messagesChatPushSettings = this.pushSettings;
        int iHashCode6 = (iHashCode5 + (messagesChatPushSettings == null ? 0 : messagesChatPushSettings.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isDefaultPhoto;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isGroupChannel;
        return iHashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDefaultPhoto() {
        return this.isDefaultPhoto;
    }

    @Nullable
    public final Boolean isGroupChannel() {
        return this.isGroupChannel;
    }

    @NotNull
    public String toString() {
        UserId userId = this.adminId;
        int i = this.f15193id;
        String str = this.type;
        List<UserId> list = this.users;
        int i10 = this.membersCount;
        BaseBoolInt baseBoolInt = this.kicked;
        BaseBoolInt baseBoolInt2 = this.left;
        String str2 = this.photo100;
        String str3 = this.photo200;
        String str4 = this.photo50;
        MessagesChatPushSettings messagesChatPushSettings = this.pushSettings;
        String str5 = this.title;
        Boolean bool = this.isDefaultPhoto;
        Boolean bool2 = this.isGroupChannel;
        StringBuilder sb2 = new StringBuilder("MessagesChat(adminId=");
        sb2.append(userId);
        sb2.append(", id=");
        sb2.append(i);
        sb2.append(", type=");
        sb2.append(str);
        sb2.append(", users=");
        sb2.append(list);
        sb2.append(", membersCount=");
        sb2.append(i10);
        sb2.append(", kicked=");
        sb2.append(baseBoolInt);
        sb2.append(", left=");
        sb2.append(baseBoolInt2);
        sb2.append(", photo100=");
        sb2.append(str2);
        sb2.append(", photo200=");
        o.t(sb2, str3, ", photo50=", str4, ", pushSettings=");
        sb2.append(messagesChatPushSettings);
        sb2.append(", title=");
        sb2.append(str5);
        sb2.append(", isDefaultPhoto=");
        sb2.append(bool);
        sb2.append(", isGroupChannel=");
        sb2.append(bool2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MessagesChat(UserId userId, int i, String str, List list, int i10, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, String str2, String str3, String str4, MessagesChatPushSettings messagesChatPushSettings, String str5, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, i, str, list, i10, (i11 & 32) != 0 ? null : baseBoolInt, (i11 & 64) != 0 ? null : baseBoolInt2, (i11 & 128) != 0 ? null : str2, (i11 & 256) != 0 ? null : str3, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? null : messagesChatPushSettings, (i11 & 2048) != 0 ? null : str5, (i11 & 4096) != 0 ? null : bool, (i11 & 8192) != 0 ? null : bool2);
    }
}
