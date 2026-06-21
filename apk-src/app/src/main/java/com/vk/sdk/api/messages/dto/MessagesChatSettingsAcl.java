package com.vk.sdk.api.messages.dto;

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
public final class MessagesChatSettingsAcl {

    @b("can_call")
    private final boolean canCall;

    @b("can_change_info")
    private final boolean canChangeInfo;

    @b("can_change_invite_link")
    private final boolean canChangeInviteLink;

    @b("can_change_pin")
    private final boolean canChangePin;

    @b("can_change_service_type")
    @Nullable
    private final Boolean canChangeServiceType;

    @b("can_copy_chat")
    private final boolean canCopyChat;

    @b("can_invite")
    private final boolean canInvite;

    @b("can_moderate")
    private final boolean canModerate;

    @b("can_promote_users")
    private final boolean canPromoteUsers;

    @b("can_see_invite_link")
    private final boolean canSeeInviteLink;

    @b("can_use_mass_mentions")
    private final boolean canUseMassMentions;

    public MessagesChatSettingsAcl(boolean z5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, @Nullable Boolean bool) {
        this.canChangeInfo = z5;
        this.canChangeInviteLink = z10;
        this.canChangePin = z11;
        this.canInvite = z12;
        this.canPromoteUsers = z13;
        this.canSeeInviteLink = z14;
        this.canModerate = z15;
        this.canCopyChat = z16;
        this.canCall = z17;
        this.canUseMassMentions = z18;
        this.canChangeServiceType = bool;
    }

    public static /* synthetic */ MessagesChatSettingsAcl copy$default(MessagesChatSettingsAcl messagesChatSettingsAcl, boolean z5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = messagesChatSettingsAcl.canChangeInfo;
        }
        if ((i & 2) != 0) {
            z10 = messagesChatSettingsAcl.canChangeInviteLink;
        }
        if ((i & 4) != 0) {
            z11 = messagesChatSettingsAcl.canChangePin;
        }
        if ((i & 8) != 0) {
            z12 = messagesChatSettingsAcl.canInvite;
        }
        if ((i & 16) != 0) {
            z13 = messagesChatSettingsAcl.canPromoteUsers;
        }
        if ((i & 32) != 0) {
            z14 = messagesChatSettingsAcl.canSeeInviteLink;
        }
        if ((i & 64) != 0) {
            z15 = messagesChatSettingsAcl.canModerate;
        }
        if ((i & 128) != 0) {
            z16 = messagesChatSettingsAcl.canCopyChat;
        }
        if ((i & 256) != 0) {
            z17 = messagesChatSettingsAcl.canCall;
        }
        if ((i & 512) != 0) {
            z18 = messagesChatSettingsAcl.canUseMassMentions;
        }
        if ((i & 1024) != 0) {
            bool = messagesChatSettingsAcl.canChangeServiceType;
        }
        boolean z19 = z18;
        Boolean bool2 = bool;
        boolean z20 = z16;
        boolean z21 = z17;
        boolean z22 = z14;
        boolean z23 = z15;
        boolean z24 = z13;
        boolean z25 = z11;
        return messagesChatSettingsAcl.copy(z5, z10, z25, z12, z24, z22, z23, z20, z21, z19, bool2);
    }

    public final boolean component1() {
        return this.canChangeInfo;
    }

    public final boolean component10() {
        return this.canUseMassMentions;
    }

    @Nullable
    public final Boolean component11() {
        return this.canChangeServiceType;
    }

    public final boolean component2() {
        return this.canChangeInviteLink;
    }

    public final boolean component3() {
        return this.canChangePin;
    }

    public final boolean component4() {
        return this.canInvite;
    }

    public final boolean component5() {
        return this.canPromoteUsers;
    }

    public final boolean component6() {
        return this.canSeeInviteLink;
    }

    public final boolean component7() {
        return this.canModerate;
    }

    public final boolean component8() {
        return this.canCopyChat;
    }

    public final boolean component9() {
        return this.canCall;
    }

    @NotNull
    public final MessagesChatSettingsAcl copy(boolean z5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, @Nullable Boolean bool) {
        return new MessagesChatSettingsAcl(z5, z10, z11, z12, z13, z14, z15, z16, z17, z18, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsAcl)) {
            return false;
        }
        MessagesChatSettingsAcl messagesChatSettingsAcl = (MessagesChatSettingsAcl) obj;
        return this.canChangeInfo == messagesChatSettingsAcl.canChangeInfo && this.canChangeInviteLink == messagesChatSettingsAcl.canChangeInviteLink && this.canChangePin == messagesChatSettingsAcl.canChangePin && this.canInvite == messagesChatSettingsAcl.canInvite && this.canPromoteUsers == messagesChatSettingsAcl.canPromoteUsers && this.canSeeInviteLink == messagesChatSettingsAcl.canSeeInviteLink && this.canModerate == messagesChatSettingsAcl.canModerate && this.canCopyChat == messagesChatSettingsAcl.canCopyChat && this.canCall == messagesChatSettingsAcl.canCall && this.canUseMassMentions == messagesChatSettingsAcl.canUseMassMentions && Intrinsics.a(this.canChangeServiceType, messagesChatSettingsAcl.canChangeServiceType);
    }

    public final boolean getCanCall() {
        return this.canCall;
    }

    public final boolean getCanChangeInfo() {
        return this.canChangeInfo;
    }

    public final boolean getCanChangeInviteLink() {
        return this.canChangeInviteLink;
    }

    public final boolean getCanChangePin() {
        return this.canChangePin;
    }

    @Nullable
    public final Boolean getCanChangeServiceType() {
        return this.canChangeServiceType;
    }

    public final boolean getCanCopyChat() {
        return this.canCopyChat;
    }

    public final boolean getCanInvite() {
        return this.canInvite;
    }

    public final boolean getCanModerate() {
        return this.canModerate;
    }

    public final boolean getCanPromoteUsers() {
        return this.canPromoteUsers;
    }

    public final boolean getCanSeeInviteLink() {
        return this.canSeeInviteLink;
    }

    public final boolean getCanUseMassMentions() {
        return this.canUseMassMentions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z5 = this.canChangeInfo;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int i = r02 * 31;
        boolean z10 = this.canChangeInviteLink;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int i10 = (i + r22) * 31;
        boolean z11 = this.canChangePin;
        ?? r23 = z11;
        if (z11) {
            r23 = 1;
        }
        int i11 = (i10 + r23) * 31;
        boolean z12 = this.canInvite;
        ?? r24 = z12;
        if (z12) {
            r24 = 1;
        }
        int i12 = (i11 + r24) * 31;
        boolean z13 = this.canPromoteUsers;
        ?? r25 = z13;
        if (z13) {
            r25 = 1;
        }
        int i13 = (i12 + r25) * 31;
        boolean z14 = this.canSeeInviteLink;
        ?? r26 = z14;
        if (z14) {
            r26 = 1;
        }
        int i14 = (i13 + r26) * 31;
        boolean z15 = this.canModerate;
        ?? r27 = z15;
        if (z15) {
            r27 = 1;
        }
        int i15 = (i14 + r27) * 31;
        boolean z16 = this.canCopyChat;
        ?? r28 = z16;
        if (z16) {
            r28 = 1;
        }
        int i16 = (i15 + r28) * 31;
        boolean z17 = this.canCall;
        ?? r29 = z17;
        if (z17) {
            r29 = 1;
        }
        int i17 = (i16 + r29) * 31;
        boolean z18 = this.canUseMassMentions;
        int i18 = (i17 + (z18 ? 1 : z18)) * 31;
        Boolean bool = this.canChangeServiceType;
        return i18 + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessagesChatSettingsAcl(canChangeInfo=" + this.canChangeInfo + ", canChangeInviteLink=" + this.canChangeInviteLink + ", canChangePin=" + this.canChangePin + ", canInvite=" + this.canInvite + ", canPromoteUsers=" + this.canPromoteUsers + ", canSeeInviteLink=" + this.canSeeInviteLink + ", canModerate=" + this.canModerate + ", canCopyChat=" + this.canCopyChat + ", canCall=" + this.canCall + ", canUseMassMentions=" + this.canUseMassMentions + ", canChangeServiceType=" + this.canChangeServiceType + ")";
    }

    public /* synthetic */ MessagesChatSettingsAcl(boolean z5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, z10, z11, z12, z13, z14, z15, z16, z17, z18, (i & 1024) != 0 ? null : bool);
    }
}
