package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
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
public final class MessagesConversationMember {

    @b("can_kick")
    @Nullable
    private final Boolean canKick;

    @b("invited_by")
    @Nullable
    private final UserId invitedBy;

    @b("is_admin")
    @Nullable
    private final Boolean isAdmin;

    @b("is_message_request")
    @Nullable
    private final Boolean isMessageRequest;

    @b("is_owner")
    @Nullable
    private final Boolean isOwner;

    @b("join_date")
    @Nullable
    private final Integer joinDate;

    @b("member_id")
    @NotNull
    private final UserId memberId;

    @b("request_date")
    @Nullable
    private final Integer requestDate;

    public MessagesConversationMember(@NotNull UserId memberId, @Nullable Boolean bool, @Nullable UserId userId, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        this.memberId = memberId;
        this.canKick = bool;
        this.invitedBy = userId;
        this.isAdmin = bool2;
        this.isOwner = bool3;
        this.isMessageRequest = bool4;
        this.joinDate = num;
        this.requestDate = num2;
    }

    public static /* synthetic */ MessagesConversationMember copy$default(MessagesConversationMember messagesConversationMember, UserId userId, Boolean bool, UserId userId2, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = messagesConversationMember.memberId;
        }
        if ((i & 2) != 0) {
            bool = messagesConversationMember.canKick;
        }
        if ((i & 4) != 0) {
            userId2 = messagesConversationMember.invitedBy;
        }
        if ((i & 8) != 0) {
            bool2 = messagesConversationMember.isAdmin;
        }
        if ((i & 16) != 0) {
            bool3 = messagesConversationMember.isOwner;
        }
        if ((i & 32) != 0) {
            bool4 = messagesConversationMember.isMessageRequest;
        }
        if ((i & 64) != 0) {
            num = messagesConversationMember.joinDate;
        }
        if ((i & 128) != 0) {
            num2 = messagesConversationMember.requestDate;
        }
        Integer num3 = num;
        Integer num4 = num2;
        Boolean bool5 = bool3;
        Boolean bool6 = bool4;
        return messagesConversationMember.copy(userId, bool, userId2, bool2, bool5, bool6, num3, num4);
    }

    @NotNull
    public final UserId component1() {
        return this.memberId;
    }

    @Nullable
    public final Boolean component2() {
        return this.canKick;
    }

    @Nullable
    public final UserId component3() {
        return this.invitedBy;
    }

    @Nullable
    public final Boolean component4() {
        return this.isAdmin;
    }

    @Nullable
    public final Boolean component5() {
        return this.isOwner;
    }

    @Nullable
    public final Boolean component6() {
        return this.isMessageRequest;
    }

    @Nullable
    public final Integer component7() {
        return this.joinDate;
    }

    @Nullable
    public final Integer component8() {
        return this.requestDate;
    }

    @NotNull
    public final MessagesConversationMember copy(@NotNull UserId memberId, @Nullable Boolean bool, @Nullable UserId userId, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        return new MessagesConversationMember(memberId, bool, userId, bool2, bool3, bool4, num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationMember)) {
            return false;
        }
        MessagesConversationMember messagesConversationMember = (MessagesConversationMember) obj;
        return Intrinsics.a(this.memberId, messagesConversationMember.memberId) && Intrinsics.a(this.canKick, messagesConversationMember.canKick) && Intrinsics.a(this.invitedBy, messagesConversationMember.invitedBy) && Intrinsics.a(this.isAdmin, messagesConversationMember.isAdmin) && Intrinsics.a(this.isOwner, messagesConversationMember.isOwner) && Intrinsics.a(this.isMessageRequest, messagesConversationMember.isMessageRequest) && Intrinsics.a(this.joinDate, messagesConversationMember.joinDate) && Intrinsics.a(this.requestDate, messagesConversationMember.requestDate);
    }

    @Nullable
    public final Boolean getCanKick() {
        return this.canKick;
    }

    @Nullable
    public final UserId getInvitedBy() {
        return this.invitedBy;
    }

    @Nullable
    public final Integer getJoinDate() {
        return this.joinDate;
    }

    @NotNull
    public final UserId getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final Integer getRequestDate() {
        return this.requestDate;
    }

    public int hashCode() {
        int iHashCode = this.memberId.hashCode() * 31;
        Boolean bool = this.canKick;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        UserId userId = this.invitedBy;
        int iHashCode3 = (iHashCode2 + (userId == null ? 0 : userId.hashCode())) * 31;
        Boolean bool2 = this.isAdmin;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isOwner;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isMessageRequest;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.joinDate;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.requestDate;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAdmin() {
        return this.isAdmin;
    }

    @Nullable
    public final Boolean isMessageRequest() {
        return this.isMessageRequest;
    }

    @Nullable
    public final Boolean isOwner() {
        return this.isOwner;
    }

    @NotNull
    public String toString() {
        UserId userId = this.memberId;
        Boolean bool = this.canKick;
        UserId userId2 = this.invitedBy;
        Boolean bool2 = this.isAdmin;
        Boolean bool3 = this.isOwner;
        Boolean bool4 = this.isMessageRequest;
        Integer num = this.joinDate;
        Integer num2 = this.requestDate;
        StringBuilder sb2 = new StringBuilder("MessagesConversationMember(memberId=");
        sb2.append(userId);
        sb2.append(", canKick=");
        sb2.append(bool);
        sb2.append(", invitedBy=");
        sb2.append(userId2);
        sb2.append(", isAdmin=");
        sb2.append(bool2);
        sb2.append(", isOwner=");
        u.s(sb2, bool3, ", isMessageRequest=", bool4, ", joinDate=");
        sb2.append(num);
        sb2.append(", requestDate=");
        sb2.append(num2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MessagesConversationMember(UserId userId, Boolean bool, UserId userId2, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : userId2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2);
    }
}
