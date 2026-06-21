package com.vk.sdk.api.messages.dto;

import io.sentry.clientreport.DiscardedEvent;
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
public final class MessagesConversationCanWrite {

    @b("allowed")
    private final boolean allowed;

    @b(DiscardedEvent.JsonKeys.REASON)
    @Nullable
    private final Integer reason;

    public MessagesConversationCanWrite(boolean z5, @Nullable Integer num) {
        this.allowed = z5;
        this.reason = num;
    }

    public static /* synthetic */ MessagesConversationCanWrite copy$default(MessagesConversationCanWrite messagesConversationCanWrite, boolean z5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = messagesConversationCanWrite.allowed;
        }
        if ((i & 2) != 0) {
            num = messagesConversationCanWrite.reason;
        }
        return messagesConversationCanWrite.copy(z5, num);
    }

    public final boolean component1() {
        return this.allowed;
    }

    @Nullable
    public final Integer component2() {
        return this.reason;
    }

    @NotNull
    public final MessagesConversationCanWrite copy(boolean z5, @Nullable Integer num) {
        return new MessagesConversationCanWrite(z5, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationCanWrite)) {
            return false;
        }
        MessagesConversationCanWrite messagesConversationCanWrite = (MessagesConversationCanWrite) obj;
        return this.allowed == messagesConversationCanWrite.allowed && Intrinsics.a(this.reason, messagesConversationCanWrite.reason);
    }

    public final boolean getAllowed() {
        return this.allowed;
    }

    @Nullable
    public final Integer getReason() {
        return this.reason;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z5 = this.allowed;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int i = r02 * 31;
        Integer num = this.reason;
        return i + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessagesConversationCanWrite(allowed=" + this.allowed + ", reason=" + this.reason + ")";
    }

    public /* synthetic */ MessagesConversationCanWrite(boolean z5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, (i & 2) != 0 ? null : num);
    }
}
