package com.vk.sdk.api.messages.dto;

import a0.u;
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
public final class MessagesConversationPeer {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15194id;

    @b("local_id")
    @Nullable
    private final Integer localId;

    @b("type")
    @NotNull
    private final MessagesConversationPeerType type;

    public MessagesConversationPeer(int i, @NotNull MessagesConversationPeerType type, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15194id = i;
        this.type = type;
        this.localId = num;
    }

    public static /* synthetic */ MessagesConversationPeer copy$default(MessagesConversationPeer messagesConversationPeer, int i, MessagesConversationPeerType messagesConversationPeerType, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = messagesConversationPeer.f15194id;
        }
        if ((i10 & 2) != 0) {
            messagesConversationPeerType = messagesConversationPeer.type;
        }
        if ((i10 & 4) != 0) {
            num = messagesConversationPeer.localId;
        }
        return messagesConversationPeer.copy(i, messagesConversationPeerType, num);
    }

    public final int component1() {
        return this.f15194id;
    }

    @NotNull
    public final MessagesConversationPeerType component2() {
        return this.type;
    }

    @Nullable
    public final Integer component3() {
        return this.localId;
    }

    @NotNull
    public final MessagesConversationPeer copy(int i, @NotNull MessagesConversationPeerType type, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MessagesConversationPeer(i, type, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationPeer)) {
            return false;
        }
        MessagesConversationPeer messagesConversationPeer = (MessagesConversationPeer) obj;
        return this.f15194id == messagesConversationPeer.f15194id && this.type == messagesConversationPeer.type && Intrinsics.a(this.localId, messagesConversationPeer.localId);
    }

    public final int getId() {
        return this.f15194id;
    }

    @Nullable
    public final Integer getLocalId() {
        return this.localId;
    }

    @NotNull
    public final MessagesConversationPeerType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (Integer.hashCode(this.f15194id) * 31)) * 31;
        Integer num = this.localId;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.f15194id;
        MessagesConversationPeerType messagesConversationPeerType = this.type;
        Integer num = this.localId;
        StringBuilder sb2 = new StringBuilder("MessagesConversationPeer(id=");
        sb2.append(i);
        sb2.append(", type=");
        sb2.append(messagesConversationPeerType);
        sb2.append(", localId=");
        return u.m(sb2, num, ")");
    }

    public /* synthetic */ MessagesConversationPeer(int i, MessagesConversationPeerType messagesConversationPeerType, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, messagesConversationPeerType, (i10 & 4) != 0 ? null : num);
    }
}
