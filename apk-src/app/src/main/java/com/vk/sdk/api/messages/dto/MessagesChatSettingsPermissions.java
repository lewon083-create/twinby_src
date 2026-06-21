package com.vk.sdk.api.messages.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class MessagesChatSettingsPermissions {

    @b("call")
    @Nullable
    private final Call call;

    @b("change_admins")
    @Nullable
    private final ChangeAdmins changeAdmins;

    @b("change_info")
    @Nullable
    private final ChangeInfo changeInfo;

    @b("change_pin")
    @Nullable
    private final ChangePin changePin;

    @b("invite")
    @Nullable
    private final Invite invite;

    @b("see_invite_link")
    @Nullable
    private final SeeInviteLink seeInviteLink;

    @b("use_mass_mentions")
    @Nullable
    private final UseMassMentions useMassMentions;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Call {
        OWNER("owner"),
        OWNER_AND_ADMINS("owner_and_admins"),
        ALL("all");


        @NotNull
        private final String value;

        Call(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum ChangeAdmins {
        OWNER("owner"),
        OWNER_AND_ADMINS("owner_and_admins");


        @NotNull
        private final String value;

        ChangeAdmins(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum ChangeInfo {
        OWNER("owner"),
        OWNER_AND_ADMINS("owner_and_admins"),
        ALL("all");


        @NotNull
        private final String value;

        ChangeInfo(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum ChangePin {
        OWNER("owner"),
        OWNER_AND_ADMINS("owner_and_admins"),
        ALL("all");


        @NotNull
        private final String value;

        ChangePin(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Invite {
        OWNER("owner"),
        OWNER_AND_ADMINS("owner_and_admins"),
        ALL("all");


        @NotNull
        private final String value;

        Invite(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum SeeInviteLink {
        OWNER("owner"),
        OWNER_AND_ADMINS("owner_and_admins"),
        ALL("all");


        @NotNull
        private final String value;

        SeeInviteLink(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum UseMassMentions {
        OWNER("owner"),
        OWNER_AND_ADMINS("owner_and_admins"),
        ALL("all");


        @NotNull
        private final String value;

        UseMassMentions(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public MessagesChatSettingsPermissions() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ MessagesChatSettingsPermissions copy$default(MessagesChatSettingsPermissions messagesChatSettingsPermissions, Invite invite, ChangeInfo changeInfo, ChangePin changePin, UseMassMentions useMassMentions, SeeInviteLink seeInviteLink, Call call, ChangeAdmins changeAdmins, int i, Object obj) {
        if ((i & 1) != 0) {
            invite = messagesChatSettingsPermissions.invite;
        }
        if ((i & 2) != 0) {
            changeInfo = messagesChatSettingsPermissions.changeInfo;
        }
        if ((i & 4) != 0) {
            changePin = messagesChatSettingsPermissions.changePin;
        }
        if ((i & 8) != 0) {
            useMassMentions = messagesChatSettingsPermissions.useMassMentions;
        }
        if ((i & 16) != 0) {
            seeInviteLink = messagesChatSettingsPermissions.seeInviteLink;
        }
        if ((i & 32) != 0) {
            call = messagesChatSettingsPermissions.call;
        }
        if ((i & 64) != 0) {
            changeAdmins = messagesChatSettingsPermissions.changeAdmins;
        }
        Call call2 = call;
        ChangeAdmins changeAdmins2 = changeAdmins;
        SeeInviteLink seeInviteLink2 = seeInviteLink;
        ChangePin changePin2 = changePin;
        return messagesChatSettingsPermissions.copy(invite, changeInfo, changePin2, useMassMentions, seeInviteLink2, call2, changeAdmins2);
    }

    @Nullable
    public final Invite component1() {
        return this.invite;
    }

    @Nullable
    public final ChangeInfo component2() {
        return this.changeInfo;
    }

    @Nullable
    public final ChangePin component3() {
        return this.changePin;
    }

    @Nullable
    public final UseMassMentions component4() {
        return this.useMassMentions;
    }

    @Nullable
    public final SeeInviteLink component5() {
        return this.seeInviteLink;
    }

    @Nullable
    public final Call component6() {
        return this.call;
    }

    @Nullable
    public final ChangeAdmins component7() {
        return this.changeAdmins;
    }

    @NotNull
    public final MessagesChatSettingsPermissions copy(@Nullable Invite invite, @Nullable ChangeInfo changeInfo, @Nullable ChangePin changePin, @Nullable UseMassMentions useMassMentions, @Nullable SeeInviteLink seeInviteLink, @Nullable Call call, @Nullable ChangeAdmins changeAdmins) {
        return new MessagesChatSettingsPermissions(invite, changeInfo, changePin, useMassMentions, seeInviteLink, call, changeAdmins);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsPermissions)) {
            return false;
        }
        MessagesChatSettingsPermissions messagesChatSettingsPermissions = (MessagesChatSettingsPermissions) obj;
        return this.invite == messagesChatSettingsPermissions.invite && this.changeInfo == messagesChatSettingsPermissions.changeInfo && this.changePin == messagesChatSettingsPermissions.changePin && this.useMassMentions == messagesChatSettingsPermissions.useMassMentions && this.seeInviteLink == messagesChatSettingsPermissions.seeInviteLink && this.call == messagesChatSettingsPermissions.call && this.changeAdmins == messagesChatSettingsPermissions.changeAdmins;
    }

    @Nullable
    public final Call getCall() {
        return this.call;
    }

    @Nullable
    public final ChangeAdmins getChangeAdmins() {
        return this.changeAdmins;
    }

    @Nullable
    public final ChangeInfo getChangeInfo() {
        return this.changeInfo;
    }

    @Nullable
    public final ChangePin getChangePin() {
        return this.changePin;
    }

    @Nullable
    public final Invite getInvite() {
        return this.invite;
    }

    @Nullable
    public final SeeInviteLink getSeeInviteLink() {
        return this.seeInviteLink;
    }

    @Nullable
    public final UseMassMentions getUseMassMentions() {
        return this.useMassMentions;
    }

    public int hashCode() {
        Invite invite = this.invite;
        int iHashCode = (invite == null ? 0 : invite.hashCode()) * 31;
        ChangeInfo changeInfo = this.changeInfo;
        int iHashCode2 = (iHashCode + (changeInfo == null ? 0 : changeInfo.hashCode())) * 31;
        ChangePin changePin = this.changePin;
        int iHashCode3 = (iHashCode2 + (changePin == null ? 0 : changePin.hashCode())) * 31;
        UseMassMentions useMassMentions = this.useMassMentions;
        int iHashCode4 = (iHashCode3 + (useMassMentions == null ? 0 : useMassMentions.hashCode())) * 31;
        SeeInviteLink seeInviteLink = this.seeInviteLink;
        int iHashCode5 = (iHashCode4 + (seeInviteLink == null ? 0 : seeInviteLink.hashCode())) * 31;
        Call call = this.call;
        int iHashCode6 = (iHashCode5 + (call == null ? 0 : call.hashCode())) * 31;
        ChangeAdmins changeAdmins = this.changeAdmins;
        return iHashCode6 + (changeAdmins != null ? changeAdmins.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessagesChatSettingsPermissions(invite=" + this.invite + ", changeInfo=" + this.changeInfo + ", changePin=" + this.changePin + ", useMassMentions=" + this.useMassMentions + ", seeInviteLink=" + this.seeInviteLink + ", call=" + this.call + ", changeAdmins=" + this.changeAdmins + ")";
    }

    public MessagesChatSettingsPermissions(@Nullable Invite invite, @Nullable ChangeInfo changeInfo, @Nullable ChangePin changePin, @Nullable UseMassMentions useMassMentions, @Nullable SeeInviteLink seeInviteLink, @Nullable Call call, @Nullable ChangeAdmins changeAdmins) {
        this.invite = invite;
        this.changeInfo = changeInfo;
        this.changePin = changePin;
        this.useMassMentions = useMassMentions;
        this.seeInviteLink = seeInviteLink;
        this.call = call;
        this.changeAdmins = changeAdmins;
    }

    public /* synthetic */ MessagesChatSettingsPermissions(Invite invite, ChangeInfo changeInfo, ChangePin changePin, UseMassMentions useMassMentions, SeeInviteLink seeInviteLink, Call call, ChangeAdmins changeAdmins, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : invite, (i & 2) != 0 ? null : changeInfo, (i & 4) != 0 ? null : changePin, (i & 8) != 0 ? null : useMassMentions, (i & 16) != 0 ? null : seeInviteLink, (i & 32) != 0 ? null : call, (i & 64) != 0 ? null : changeAdmins);
    }
}
