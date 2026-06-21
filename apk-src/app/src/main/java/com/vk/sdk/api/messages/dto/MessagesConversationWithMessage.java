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
public final class MessagesConversationWithMessage {

    @b("conversation")
    @NotNull
    private final MessagesConversation conversation;

    @b("last_message")
    @Nullable
    private final MessagesMessage lastMessage;

    public MessagesConversationWithMessage(@NotNull MessagesConversation conversation, @Nullable MessagesMessage messagesMessage) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        this.conversation = conversation;
        this.lastMessage = messagesMessage;
    }

    public static /* synthetic */ MessagesConversationWithMessage copy$default(MessagesConversationWithMessage messagesConversationWithMessage, MessagesConversation messagesConversation, MessagesMessage messagesMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            messagesConversation = messagesConversationWithMessage.conversation;
        }
        if ((i & 2) != 0) {
            messagesMessage = messagesConversationWithMessage.lastMessage;
        }
        return messagesConversationWithMessage.copy(messagesConversation, messagesMessage);
    }

    @NotNull
    public final MessagesConversation component1() {
        return this.conversation;
    }

    @Nullable
    public final MessagesMessage component2() {
        return this.lastMessage;
    }

    @NotNull
    public final MessagesConversationWithMessage copy(@NotNull MessagesConversation conversation, @Nullable MessagesMessage messagesMessage) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        return new MessagesConversationWithMessage(conversation, messagesMessage);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationWithMessage)) {
            return false;
        }
        MessagesConversationWithMessage messagesConversationWithMessage = (MessagesConversationWithMessage) obj;
        return Intrinsics.a(this.conversation, messagesConversationWithMessage.conversation) && Intrinsics.a(this.lastMessage, messagesConversationWithMessage.lastMessage);
    }

    @NotNull
    public final MessagesConversation getConversation() {
        return this.conversation;
    }

    @Nullable
    public final MessagesMessage getLastMessage() {
        return this.lastMessage;
    }

    public int hashCode() {
        int iHashCode = this.conversation.hashCode() * 31;
        MessagesMessage messagesMessage = this.lastMessage;
        return iHashCode + (messagesMessage == null ? 0 : messagesMessage.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessagesConversationWithMessage(conversation=" + this.conversation + ", lastMessage=" + this.lastMessage + ")";
    }

    public /* synthetic */ MessagesConversationWithMessage(MessagesConversation messagesConversation, MessagesMessage messagesMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagesConversation, (i & 2) != 0 ? null : messagesMessage);
    }
}
