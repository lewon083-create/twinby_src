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
public final class MessagesJoinChatByInviteLinkResponse {

    @b("chat_id")
    @Nullable
    private final Integer chatId;

    public MessagesJoinChatByInviteLinkResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MessagesJoinChatByInviteLinkResponse copy$default(MessagesJoinChatByInviteLinkResponse messagesJoinChatByInviteLinkResponse, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = messagesJoinChatByInviteLinkResponse.chatId;
        }
        return messagesJoinChatByInviteLinkResponse.copy(num);
    }

    @Nullable
    public final Integer component1() {
        return this.chatId;
    }

    @NotNull
    public final MessagesJoinChatByInviteLinkResponse copy(@Nullable Integer num) {
        return new MessagesJoinChatByInviteLinkResponse(num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesJoinChatByInviteLinkResponse) && Intrinsics.a(this.chatId, ((MessagesJoinChatByInviteLinkResponse) obj).chatId);
    }

    @Nullable
    public final Integer getChatId() {
        return this.chatId;
    }

    public int hashCode() {
        Integer num = this.chatId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "MessagesJoinChatByInviteLinkResponse(chatId=" + this.chatId + ")";
    }

    public MessagesJoinChatByInviteLinkResponse(@Nullable Integer num) {
        this.chatId = num;
    }

    public /* synthetic */ MessagesJoinChatByInviteLinkResponse(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
