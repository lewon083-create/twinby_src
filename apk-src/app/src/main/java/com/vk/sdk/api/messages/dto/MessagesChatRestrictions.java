package com.vk.sdk.api.messages.dto;

import a0.u;
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
public final class MessagesChatRestrictions {

    @b("admins_promote_users")
    @Nullable
    private final Boolean adminsPromoteUsers;

    @b("only_admins_edit_info")
    @Nullable
    private final Boolean onlyAdminsEditInfo;

    @b("only_admins_edit_pin")
    @Nullable
    private final Boolean onlyAdminsEditPin;

    @b("only_admins_invite")
    @Nullable
    private final Boolean onlyAdminsInvite;

    @b("only_admins_kick")
    @Nullable
    private final Boolean onlyAdminsKick;

    public MessagesChatRestrictions() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MessagesChatRestrictions copy$default(MessagesChatRestrictions messagesChatRestrictions, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = messagesChatRestrictions.adminsPromoteUsers;
        }
        if ((i & 2) != 0) {
            bool2 = messagesChatRestrictions.onlyAdminsEditInfo;
        }
        if ((i & 4) != 0) {
            bool3 = messagesChatRestrictions.onlyAdminsEditPin;
        }
        if ((i & 8) != 0) {
            bool4 = messagesChatRestrictions.onlyAdminsInvite;
        }
        if ((i & 16) != 0) {
            bool5 = messagesChatRestrictions.onlyAdminsKick;
        }
        Boolean bool6 = bool5;
        Boolean bool7 = bool3;
        return messagesChatRestrictions.copy(bool, bool2, bool7, bool4, bool6);
    }

    @Nullable
    public final Boolean component1() {
        return this.adminsPromoteUsers;
    }

    @Nullable
    public final Boolean component2() {
        return this.onlyAdminsEditInfo;
    }

    @Nullable
    public final Boolean component3() {
        return this.onlyAdminsEditPin;
    }

    @Nullable
    public final Boolean component4() {
        return this.onlyAdminsInvite;
    }

    @Nullable
    public final Boolean component5() {
        return this.onlyAdminsKick;
    }

    @NotNull
    public final MessagesChatRestrictions copy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5) {
        return new MessagesChatRestrictions(bool, bool2, bool3, bool4, bool5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatRestrictions)) {
            return false;
        }
        MessagesChatRestrictions messagesChatRestrictions = (MessagesChatRestrictions) obj;
        return Intrinsics.a(this.adminsPromoteUsers, messagesChatRestrictions.adminsPromoteUsers) && Intrinsics.a(this.onlyAdminsEditInfo, messagesChatRestrictions.onlyAdminsEditInfo) && Intrinsics.a(this.onlyAdminsEditPin, messagesChatRestrictions.onlyAdminsEditPin) && Intrinsics.a(this.onlyAdminsInvite, messagesChatRestrictions.onlyAdminsInvite) && Intrinsics.a(this.onlyAdminsKick, messagesChatRestrictions.onlyAdminsKick);
    }

    @Nullable
    public final Boolean getAdminsPromoteUsers() {
        return this.adminsPromoteUsers;
    }

    @Nullable
    public final Boolean getOnlyAdminsEditInfo() {
        return this.onlyAdminsEditInfo;
    }

    @Nullable
    public final Boolean getOnlyAdminsEditPin() {
        return this.onlyAdminsEditPin;
    }

    @Nullable
    public final Boolean getOnlyAdminsInvite() {
        return this.onlyAdminsInvite;
    }

    @Nullable
    public final Boolean getOnlyAdminsKick() {
        return this.onlyAdminsKick;
    }

    public int hashCode() {
        Boolean bool = this.adminsPromoteUsers;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.onlyAdminsEditInfo;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.onlyAdminsEditPin;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.onlyAdminsInvite;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.onlyAdminsKick;
        return iHashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.adminsPromoteUsers;
        Boolean bool2 = this.onlyAdminsEditInfo;
        Boolean bool3 = this.onlyAdminsEditPin;
        Boolean bool4 = this.onlyAdminsInvite;
        Boolean bool5 = this.onlyAdminsKick;
        StringBuilder sb2 = new StringBuilder("MessagesChatRestrictions(adminsPromoteUsers=");
        sb2.append(bool);
        sb2.append(", onlyAdminsEditInfo=");
        sb2.append(bool2);
        sb2.append(", onlyAdminsEditPin=");
        u.s(sb2, bool3, ", onlyAdminsInvite=", bool4, ", onlyAdminsKick=");
        sb2.append(bool5);
        sb2.append(")");
        return sb2.toString();
    }

    public MessagesChatRestrictions(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5) {
        this.adminsPromoteUsers = bool;
        this.onlyAdminsEditInfo = bool2;
        this.onlyAdminsEditPin = bool3;
        this.onlyAdminsInvite = bool4;
        this.onlyAdminsKick = bool5;
    }

    public /* synthetic */ MessagesChatRestrictions(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5);
    }
}
