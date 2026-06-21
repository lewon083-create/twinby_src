package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class MessagesIsMessagesFromGroupAllowedResponse {

    @b("is_allowed")
    @Nullable
    private final BaseBoolInt isAllowed;

    public MessagesIsMessagesFromGroupAllowedResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MessagesIsMessagesFromGroupAllowedResponse copy$default(MessagesIsMessagesFromGroupAllowedResponse messagesIsMessagesFromGroupAllowedResponse, BaseBoolInt baseBoolInt, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = messagesIsMessagesFromGroupAllowedResponse.isAllowed;
        }
        return messagesIsMessagesFromGroupAllowedResponse.copy(baseBoolInt);
    }

    @Nullable
    public final BaseBoolInt component1() {
        return this.isAllowed;
    }

    @NotNull
    public final MessagesIsMessagesFromGroupAllowedResponse copy(@Nullable BaseBoolInt baseBoolInt) {
        return new MessagesIsMessagesFromGroupAllowedResponse(baseBoolInt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesIsMessagesFromGroupAllowedResponse) && this.isAllowed == ((MessagesIsMessagesFromGroupAllowedResponse) obj).isAllowed;
    }

    public int hashCode() {
        BaseBoolInt baseBoolInt = this.isAllowed;
        if (baseBoolInt == null) {
            return 0;
        }
        return baseBoolInt.hashCode();
    }

    @Nullable
    public final BaseBoolInt isAllowed() {
        return this.isAllowed;
    }

    @NotNull
    public String toString() {
        return "MessagesIsMessagesFromGroupAllowedResponse(isAllowed=" + this.isAllowed + ")";
    }

    public MessagesIsMessagesFromGroupAllowedResponse(@Nullable BaseBoolInt baseBoolInt) {
        this.isAllowed = baseBoolInt;
    }

    public /* synthetic */ MessagesIsMessagesFromGroupAllowedResponse(BaseBoolInt baseBoolInt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseBoolInt);
    }
}
