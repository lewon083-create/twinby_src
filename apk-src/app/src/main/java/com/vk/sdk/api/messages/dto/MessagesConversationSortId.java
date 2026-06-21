package com.vk.sdk.api.messages.dto;

import com.google.android.gms.internal.ads.om1;
import kotlin.Metadata;
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
public final class MessagesConversationSortId {

    @b("major_id")
    private final int majorId;

    @b("minor_id")
    private final int minorId;

    public MessagesConversationSortId(int i, int i10) {
        this.majorId = i;
        this.minorId = i10;
    }

    public static /* synthetic */ MessagesConversationSortId copy$default(MessagesConversationSortId messagesConversationSortId, int i, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = messagesConversationSortId.majorId;
        }
        if ((i11 & 2) != 0) {
            i10 = messagesConversationSortId.minorId;
        }
        return messagesConversationSortId.copy(i, i10);
    }

    public final int component1() {
        return this.majorId;
    }

    public final int component2() {
        return this.minorId;
    }

    @NotNull
    public final MessagesConversationSortId copy(int i, int i10) {
        return new MessagesConversationSortId(i, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationSortId)) {
            return false;
        }
        MessagesConversationSortId messagesConversationSortId = (MessagesConversationSortId) obj;
        return this.majorId == messagesConversationSortId.majorId && this.minorId == messagesConversationSortId.minorId;
    }

    public final int getMajorId() {
        return this.majorId;
    }

    public final int getMinorId() {
        return this.minorId;
    }

    public int hashCode() {
        return Integer.hashCode(this.minorId) + (Integer.hashCode(this.majorId) * 31);
    }

    @NotNull
    public String toString() {
        return om1.j("MessagesConversationSortId(majorId=", this.majorId, ", minorId=", this.minorId, ")");
    }
}
