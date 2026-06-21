package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
import io.sentry.protocol.App;
import io.sentry.protocol.SentryThread;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class MessagesChatSettings {

    @b("acl")
    @NotNull
    private final MessagesChatSettingsAcl acl;

    @b("active_ids")
    @NotNull
    private final List<UserId> activeIds;

    @b("admin_ids")
    @Nullable
    private final List<UserId> adminIds;

    @b("disappearing_chat_link")
    @Nullable
    private final String disappearingChatLink;

    @b("friends_count")
    @Nullable
    private final Integer friendsCount;

    @b("is_disappearing")
    @Nullable
    private final Boolean isDisappearing;

    @b("is_group_channel")
    @Nullable
    private final Boolean isGroupChannel;

    @b("is_service")
    @Nullable
    private final Boolean isService;

    @b("members_count")
    @Nullable
    private final Integer membersCount;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b(App.JsonKeys.APP_PERMISSIONS)
    @Nullable
    private final MessagesChatSettingsPermissions permissions;

    @b("photo")
    @Nullable
    private final MessagesChatSettingsPhoto photo;

    @b("pinned_message")
    @Nullable
    private final MessagesPinnedMessage pinnedMessage;

    @b(SentryThread.JsonKeys.STATE)
    @NotNull
    private final MessagesChatSettingsState state;

    @b("theme")
    @Nullable
    private final String theme;

    @b("title")
    @NotNull
    private final String title;

    public MessagesChatSettings(@NotNull UserId ownerId, @NotNull String title, @NotNull MessagesChatSettingsState state, @NotNull List<UserId> activeIds, @NotNull MessagesChatSettingsAcl acl, @Nullable Integer num, @Nullable Integer num2, @Nullable MessagesPinnedMessage messagesPinnedMessage, @Nullable MessagesChatSettingsPhoto messagesChatSettingsPhoto, @Nullable List<UserId> list, @Nullable Boolean bool, @Nullable MessagesChatSettingsPermissions messagesChatSettingsPermissions, @Nullable Boolean bool2, @Nullable String str, @Nullable String str2, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activeIds, "activeIds");
        Intrinsics.checkNotNullParameter(acl, "acl");
        this.ownerId = ownerId;
        this.title = title;
        this.state = state;
        this.activeIds = activeIds;
        this.acl = acl;
        this.membersCount = num;
        this.friendsCount = num2;
        this.pinnedMessage = messagesPinnedMessage;
        this.photo = messagesChatSettingsPhoto;
        this.adminIds = list;
        this.isGroupChannel = bool;
        this.permissions = messagesChatSettingsPermissions;
        this.isDisappearing = bool2;
        this.theme = str;
        this.disappearingChatLink = str2;
        this.isService = bool3;
    }

    @NotNull
    public final UserId component1() {
        return this.ownerId;
    }

    @Nullable
    public final List<UserId> component10() {
        return this.adminIds;
    }

    @Nullable
    public final Boolean component11() {
        return this.isGroupChannel;
    }

    @Nullable
    public final MessagesChatSettingsPermissions component12() {
        return this.permissions;
    }

    @Nullable
    public final Boolean component13() {
        return this.isDisappearing;
    }

    @Nullable
    public final String component14() {
        return this.theme;
    }

    @Nullable
    public final String component15() {
        return this.disappearingChatLink;
    }

    @Nullable
    public final Boolean component16() {
        return this.isService;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final MessagesChatSettingsState component3() {
        return this.state;
    }

    @NotNull
    public final List<UserId> component4() {
        return this.activeIds;
    }

    @NotNull
    public final MessagesChatSettingsAcl component5() {
        return this.acl;
    }

    @Nullable
    public final Integer component6() {
        return this.membersCount;
    }

    @Nullable
    public final Integer component7() {
        return this.friendsCount;
    }

    @Nullable
    public final MessagesPinnedMessage component8() {
        return this.pinnedMessage;
    }

    @Nullable
    public final MessagesChatSettingsPhoto component9() {
        return this.photo;
    }

    @NotNull
    public final MessagesChatSettings copy(@NotNull UserId ownerId, @NotNull String title, @NotNull MessagesChatSettingsState state, @NotNull List<UserId> activeIds, @NotNull MessagesChatSettingsAcl acl, @Nullable Integer num, @Nullable Integer num2, @Nullable MessagesPinnedMessage messagesPinnedMessage, @Nullable MessagesChatSettingsPhoto messagesChatSettingsPhoto, @Nullable List<UserId> list, @Nullable Boolean bool, @Nullable MessagesChatSettingsPermissions messagesChatSettingsPermissions, @Nullable Boolean bool2, @Nullable String str, @Nullable String str2, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activeIds, "activeIds");
        Intrinsics.checkNotNullParameter(acl, "acl");
        return new MessagesChatSettings(ownerId, title, state, activeIds, acl, num, num2, messagesPinnedMessage, messagesChatSettingsPhoto, list, bool, messagesChatSettingsPermissions, bool2, str, str2, bool3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettings)) {
            return false;
        }
        MessagesChatSettings messagesChatSettings = (MessagesChatSettings) obj;
        return Intrinsics.a(this.ownerId, messagesChatSettings.ownerId) && Intrinsics.a(this.title, messagesChatSettings.title) && this.state == messagesChatSettings.state && Intrinsics.a(this.activeIds, messagesChatSettings.activeIds) && Intrinsics.a(this.acl, messagesChatSettings.acl) && Intrinsics.a(this.membersCount, messagesChatSettings.membersCount) && Intrinsics.a(this.friendsCount, messagesChatSettings.friendsCount) && Intrinsics.a(this.pinnedMessage, messagesChatSettings.pinnedMessage) && Intrinsics.a(this.photo, messagesChatSettings.photo) && Intrinsics.a(this.adminIds, messagesChatSettings.adminIds) && Intrinsics.a(this.isGroupChannel, messagesChatSettings.isGroupChannel) && Intrinsics.a(this.permissions, messagesChatSettings.permissions) && Intrinsics.a(this.isDisappearing, messagesChatSettings.isDisappearing) && Intrinsics.a(this.theme, messagesChatSettings.theme) && Intrinsics.a(this.disappearingChatLink, messagesChatSettings.disappearingChatLink) && Intrinsics.a(this.isService, messagesChatSettings.isService);
    }

    @NotNull
    public final MessagesChatSettingsAcl getAcl() {
        return this.acl;
    }

    @NotNull
    public final List<UserId> getActiveIds() {
        return this.activeIds;
    }

    @Nullable
    public final List<UserId> getAdminIds() {
        return this.adminIds;
    }

    @Nullable
    public final String getDisappearingChatLink() {
        return this.disappearingChatLink;
    }

    @Nullable
    public final Integer getFriendsCount() {
        return this.friendsCount;
    }

    @Nullable
    public final Integer getMembersCount() {
        return this.membersCount;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final MessagesChatSettingsPermissions getPermissions() {
        return this.permissions;
    }

    @Nullable
    public final MessagesChatSettingsPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final MessagesPinnedMessage getPinnedMessage() {
        return this.pinnedMessage;
    }

    @NotNull
    public final MessagesChatSettingsState getState() {
        return this.state;
    }

    @Nullable
    public final String getTheme() {
        return this.theme;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.acl.hashCode() + u.i(this.activeIds, (this.state.hashCode() + a.e(this.ownerId.hashCode() * 31, 31, this.title)) * 31, 31)) * 31;
        Integer num = this.membersCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.friendsCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MessagesPinnedMessage messagesPinnedMessage = this.pinnedMessage;
        int iHashCode4 = (iHashCode3 + (messagesPinnedMessage == null ? 0 : messagesPinnedMessage.hashCode())) * 31;
        MessagesChatSettingsPhoto messagesChatSettingsPhoto = this.photo;
        int iHashCode5 = (iHashCode4 + (messagesChatSettingsPhoto == null ? 0 : messagesChatSettingsPhoto.hashCode())) * 31;
        List<UserId> list = this.adminIds;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isGroupChannel;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        MessagesChatSettingsPermissions messagesChatSettingsPermissions = this.permissions;
        int iHashCode8 = (iHashCode7 + (messagesChatSettingsPermissions == null ? 0 : messagesChatSettingsPermissions.hashCode())) * 31;
        Boolean bool2 = this.isDisappearing;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.theme;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.disappearingChatLink;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.isService;
        return iHashCode11 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDisappearing() {
        return this.isDisappearing;
    }

    @Nullable
    public final Boolean isGroupChannel() {
        return this.isGroupChannel;
    }

    @Nullable
    public final Boolean isService() {
        return this.isService;
    }

    @NotNull
    public String toString() {
        return "MessagesChatSettings(ownerId=" + this.ownerId + ", title=" + this.title + ", state=" + this.state + ", activeIds=" + this.activeIds + ", acl=" + this.acl + ", membersCount=" + this.membersCount + ", friendsCount=" + this.friendsCount + ", pinnedMessage=" + this.pinnedMessage + ", photo=" + this.photo + ", adminIds=" + this.adminIds + ", isGroupChannel=" + this.isGroupChannel + ", permissions=" + this.permissions + ", isDisappearing=" + this.isDisappearing + ", theme=" + this.theme + ", disappearingChatLink=" + this.disappearingChatLink + ", isService=" + this.isService + ")";
    }

    public /* synthetic */ MessagesChatSettings(UserId userId, String str, MessagesChatSettingsState messagesChatSettingsState, List list, MessagesChatSettingsAcl messagesChatSettingsAcl, Integer num, Integer num2, MessagesPinnedMessage messagesPinnedMessage, MessagesChatSettingsPhoto messagesChatSettingsPhoto, List list2, Boolean bool, MessagesChatSettingsPermissions messagesChatSettingsPermissions, Boolean bool2, String str2, String str3, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, str, messagesChatSettingsState, list, messagesChatSettingsAcl, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : messagesPinnedMessage, (i & 256) != 0 ? null : messagesChatSettingsPhoto, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : messagesChatSettingsPermissions, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : str3, (i & 32768) != 0 ? null : bool3);
    }
}
