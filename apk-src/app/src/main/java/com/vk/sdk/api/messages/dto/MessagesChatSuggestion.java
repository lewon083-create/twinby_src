package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.base.dto.BaseLinkChat;
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
public final class MessagesChatSuggestion {

    @b("chat")
    @NotNull
    private final BaseLinkChat chat;

    @b("track_code")
    @Nullable
    private final String trackCode;

    public MessagesChatSuggestion(@NotNull BaseLinkChat chat, @Nullable String str) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        this.chat = chat;
        this.trackCode = str;
    }

    public static /* synthetic */ MessagesChatSuggestion copy$default(MessagesChatSuggestion messagesChatSuggestion, BaseLinkChat baseLinkChat, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            baseLinkChat = messagesChatSuggestion.chat;
        }
        if ((i & 2) != 0) {
            str = messagesChatSuggestion.trackCode;
        }
        return messagesChatSuggestion.copy(baseLinkChat, str);
    }

    @NotNull
    public final BaseLinkChat component1() {
        return this.chat;
    }

    @Nullable
    public final String component2() {
        return this.trackCode;
    }

    @NotNull
    public final MessagesChatSuggestion copy(@NotNull BaseLinkChat chat, @Nullable String str) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        return new MessagesChatSuggestion(chat, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSuggestion)) {
            return false;
        }
        MessagesChatSuggestion messagesChatSuggestion = (MessagesChatSuggestion) obj;
        return Intrinsics.a(this.chat, messagesChatSuggestion.chat) && Intrinsics.a(this.trackCode, messagesChatSuggestion.trackCode);
    }

    @NotNull
    public final BaseLinkChat getChat() {
        return this.chat;
    }

    @Nullable
    public final String getTrackCode() {
        return this.trackCode;
    }

    public int hashCode() {
        int iHashCode = this.chat.hashCode() * 31;
        String str = this.trackCode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessagesChatSuggestion(chat=" + this.chat + ", trackCode=" + this.trackCode + ")";
    }

    public /* synthetic */ MessagesChatSuggestion(BaseLinkChat baseLinkChat, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseLinkChat, (i & 2) != 0 ? null : str);
    }
}
