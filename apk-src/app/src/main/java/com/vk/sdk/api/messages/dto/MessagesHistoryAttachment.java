package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
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
public final class MessagesHistoryAttachment {

    @b("attachment")
    @NotNull
    private final MessagesHistoryMessageAttachment attachment;

    @b("forward_level")
    @Nullable
    private final Integer forwardLevel;

    @b("from_id")
    @NotNull
    private final UserId fromId;

    @b("message_id")
    private final int messageId;

    @b("was_listened")
    @Nullable
    private final Boolean wasListened;

    public MessagesHistoryAttachment(@NotNull MessagesHistoryMessageAttachment attachment, int i, @NotNull UserId fromId, @Nullable Integer num, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        this.attachment = attachment;
        this.messageId = i;
        this.fromId = fromId;
        this.forwardLevel = num;
        this.wasListened = bool;
    }

    public static /* synthetic */ MessagesHistoryAttachment copy$default(MessagesHistoryAttachment messagesHistoryAttachment, MessagesHistoryMessageAttachment messagesHistoryMessageAttachment, int i, UserId userId, Integer num, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            messagesHistoryMessageAttachment = messagesHistoryAttachment.attachment;
        }
        if ((i10 & 2) != 0) {
            i = messagesHistoryAttachment.messageId;
        }
        if ((i10 & 4) != 0) {
            userId = messagesHistoryAttachment.fromId;
        }
        if ((i10 & 8) != 0) {
            num = messagesHistoryAttachment.forwardLevel;
        }
        if ((i10 & 16) != 0) {
            bool = messagesHistoryAttachment.wasListened;
        }
        Boolean bool2 = bool;
        UserId userId2 = userId;
        return messagesHistoryAttachment.copy(messagesHistoryMessageAttachment, i, userId2, num, bool2);
    }

    @NotNull
    public final MessagesHistoryMessageAttachment component1() {
        return this.attachment;
    }

    public final int component2() {
        return this.messageId;
    }

    @NotNull
    public final UserId component3() {
        return this.fromId;
    }

    @Nullable
    public final Integer component4() {
        return this.forwardLevel;
    }

    @Nullable
    public final Boolean component5() {
        return this.wasListened;
    }

    @NotNull
    public final MessagesHistoryAttachment copy(@NotNull MessagesHistoryMessageAttachment attachment, int i, @NotNull UserId fromId, @Nullable Integer num, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        return new MessagesHistoryAttachment(attachment, i, fromId, num, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesHistoryAttachment)) {
            return false;
        }
        MessagesHistoryAttachment messagesHistoryAttachment = (MessagesHistoryAttachment) obj;
        return Intrinsics.a(this.attachment, messagesHistoryAttachment.attachment) && this.messageId == messagesHistoryAttachment.messageId && Intrinsics.a(this.fromId, messagesHistoryAttachment.fromId) && Intrinsics.a(this.forwardLevel, messagesHistoryAttachment.forwardLevel) && Intrinsics.a(this.wasListened, messagesHistoryAttachment.wasListened);
    }

    @NotNull
    public final MessagesHistoryMessageAttachment getAttachment() {
        return this.attachment;
    }

    @Nullable
    public final Integer getForwardLevel() {
        return this.forwardLevel;
    }

    @NotNull
    public final UserId getFromId() {
        return this.fromId;
    }

    public final int getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final Boolean getWasListened() {
        return this.wasListened;
    }

    public int hashCode() {
        int iE = o.e(this.fromId, u.g(this.messageId, this.attachment.hashCode() * 31, 31), 31);
        Integer num = this.forwardLevel;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.wasListened;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessagesHistoryAttachment(attachment=" + this.attachment + ", messageId=" + this.messageId + ", fromId=" + this.fromId + ", forwardLevel=" + this.forwardLevel + ", wasListened=" + this.wasListened + ")";
    }

    public /* synthetic */ MessagesHistoryAttachment(MessagesHistoryMessageAttachment messagesHistoryMessageAttachment, int i, UserId userId, Integer num, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagesHistoryMessageAttachment, i, userId, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : bool);
    }
}
