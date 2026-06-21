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
public final class MessagesSetChatPhotoResponse {

    @b("chat")
    @Nullable
    private final MessagesChat chat;

    @b("message_id")
    @Nullable
    private final Integer messageId;

    public MessagesSetChatPhotoResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MessagesSetChatPhotoResponse copy$default(MessagesSetChatPhotoResponse messagesSetChatPhotoResponse, Integer num, MessagesChat messagesChat, int i, Object obj) {
        if ((i & 1) != 0) {
            num = messagesSetChatPhotoResponse.messageId;
        }
        if ((i & 2) != 0) {
            messagesChat = messagesSetChatPhotoResponse.chat;
        }
        return messagesSetChatPhotoResponse.copy(num, messagesChat);
    }

    @Nullable
    public final Integer component1() {
        return this.messageId;
    }

    @Nullable
    public final MessagesChat component2() {
        return this.chat;
    }

    @NotNull
    public final MessagesSetChatPhotoResponse copy(@Nullable Integer num, @Nullable MessagesChat messagesChat) {
        return new MessagesSetChatPhotoResponse(num, messagesChat);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesSetChatPhotoResponse)) {
            return false;
        }
        MessagesSetChatPhotoResponse messagesSetChatPhotoResponse = (MessagesSetChatPhotoResponse) obj;
        return Intrinsics.a(this.messageId, messagesSetChatPhotoResponse.messageId) && Intrinsics.a(this.chat, messagesSetChatPhotoResponse.chat);
    }

    @Nullable
    public final MessagesChat getChat() {
        return this.chat;
    }

    @Nullable
    public final Integer getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        Integer num = this.messageId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        MessagesChat messagesChat = this.chat;
        return iHashCode + (messagesChat != null ? messagesChat.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessagesSetChatPhotoResponse(messageId=" + this.messageId + ", chat=" + this.chat + ")";
    }

    public MessagesSetChatPhotoResponse(@Nullable Integer num, @Nullable MessagesChat messagesChat) {
        this.messageId = num;
        this.chat = messagesChat;
    }

    public /* synthetic */ MessagesSetChatPhotoResponse(Integer num, MessagesChat messagesChat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : messagesChat);
    }
}
