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
public final class MessagesMessageAction {

    @b("conversation_message_id")
    @Nullable
    private final Integer conversationMessageId;

    @b("email")
    @Nullable
    private final String email;

    @b("member_id")
    @Nullable
    private final UserId memberId;

    @b("message")
    @Nullable
    private final String message;

    @b("photo")
    @Nullable
    private final MessagesMessageActionPhoto photo;

    @b("text")
    @Nullable
    private final String text;

    @b("type")
    @NotNull
    private final MessagesMessageActionStatus type;

    public MessagesMessageAction(@NotNull MessagesMessageActionStatus type, @Nullable Integer num, @Nullable String str, @Nullable UserId userId, @Nullable String str2, @Nullable MessagesMessageActionPhoto messagesMessageActionPhoto, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.conversationMessageId = num;
        this.email = str;
        this.memberId = userId;
        this.message = str2;
        this.photo = messagesMessageActionPhoto;
        this.text = str3;
    }

    public static /* synthetic */ MessagesMessageAction copy$default(MessagesMessageAction messagesMessageAction, MessagesMessageActionStatus messagesMessageActionStatus, Integer num, String str, UserId userId, String str2, MessagesMessageActionPhoto messagesMessageActionPhoto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            messagesMessageActionStatus = messagesMessageAction.type;
        }
        if ((i & 2) != 0) {
            num = messagesMessageAction.conversationMessageId;
        }
        if ((i & 4) != 0) {
            str = messagesMessageAction.email;
        }
        if ((i & 8) != 0) {
            userId = messagesMessageAction.memberId;
        }
        if ((i & 16) != 0) {
            str2 = messagesMessageAction.message;
        }
        if ((i & 32) != 0) {
            messagesMessageActionPhoto = messagesMessageAction.photo;
        }
        if ((i & 64) != 0) {
            str3 = messagesMessageAction.text;
        }
        MessagesMessageActionPhoto messagesMessageActionPhoto2 = messagesMessageActionPhoto;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        return messagesMessageAction.copy(messagesMessageActionStatus, num, str6, userId, str5, messagesMessageActionPhoto2, str4);
    }

    @NotNull
    public final MessagesMessageActionStatus component1() {
        return this.type;
    }

    @Nullable
    public final Integer component2() {
        return this.conversationMessageId;
    }

    @Nullable
    public final String component3() {
        return this.email;
    }

    @Nullable
    public final UserId component4() {
        return this.memberId;
    }

    @Nullable
    public final String component5() {
        return this.message;
    }

    @Nullable
    public final MessagesMessageActionPhoto component6() {
        return this.photo;
    }

    @Nullable
    public final String component7() {
        return this.text;
    }

    @NotNull
    public final MessagesMessageAction copy(@NotNull MessagesMessageActionStatus type, @Nullable Integer num, @Nullable String str, @Nullable UserId userId, @Nullable String str2, @Nullable MessagesMessageActionPhoto messagesMessageActionPhoto, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MessagesMessageAction(type, num, str, userId, str2, messagesMessageActionPhoto, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAction)) {
            return false;
        }
        MessagesMessageAction messagesMessageAction = (MessagesMessageAction) obj;
        return this.type == messagesMessageAction.type && Intrinsics.a(this.conversationMessageId, messagesMessageAction.conversationMessageId) && Intrinsics.a(this.email, messagesMessageAction.email) && Intrinsics.a(this.memberId, messagesMessageAction.memberId) && Intrinsics.a(this.message, messagesMessageAction.message) && Intrinsics.a(this.photo, messagesMessageAction.photo) && Intrinsics.a(this.text, messagesMessageAction.text);
    }

    @Nullable
    public final Integer getConversationMessageId() {
        return this.conversationMessageId;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final UserId getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final MessagesMessageActionPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final MessagesMessageActionStatus getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Integer num = this.conversationMessageId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.email;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.memberId;
        int iHashCode4 = (iHashCode3 + (userId == null ? 0 : userId.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessagesMessageActionPhoto messagesMessageActionPhoto = this.photo;
        int iHashCode6 = (iHashCode5 + (messagesMessageActionPhoto == null ? 0 : messagesMessageActionPhoto.hashCode())) * 31;
        String str3 = this.text;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        MessagesMessageActionStatus messagesMessageActionStatus = this.type;
        Integer num = this.conversationMessageId;
        String str = this.email;
        UserId userId = this.memberId;
        String str2 = this.message;
        MessagesMessageActionPhoto messagesMessageActionPhoto = this.photo;
        String str3 = this.text;
        StringBuilder sb2 = new StringBuilder("MessagesMessageAction(type=");
        sb2.append(messagesMessageActionStatus);
        sb2.append(", conversationMessageId=");
        sb2.append(num);
        sb2.append(", email=");
        sb2.append(str);
        sb2.append(", memberId=");
        sb2.append(userId);
        sb2.append(", message=");
        sb2.append(str2);
        sb2.append(", photo=");
        sb2.append(messagesMessageActionPhoto);
        sb2.append(", text=");
        return u.o(sb2, str3, ")");
    }

    public /* synthetic */ MessagesMessageAction(MessagesMessageActionStatus messagesMessageActionStatus, Integer num, String str, UserId userId, String str2, MessagesMessageActionPhoto messagesMessageActionPhoto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagesMessageActionStatus, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : messagesMessageActionPhoto, (i & 64) != 0 ? null : str3);
    }
}
