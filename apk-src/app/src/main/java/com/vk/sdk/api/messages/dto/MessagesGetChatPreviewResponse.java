package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUserFull;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class MessagesGetChatPreviewResponse {

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("preview")
    @Nullable
    private final MessagesChatPreview preview;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public MessagesGetChatPreviewResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesGetChatPreviewResponse copy$default(MessagesGetChatPreviewResponse messagesGetChatPreviewResponse, MessagesChatPreview messagesChatPreview, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            messagesChatPreview = messagesGetChatPreviewResponse.preview;
        }
        if ((i & 2) != 0) {
            list = messagesGetChatPreviewResponse.profiles;
        }
        if ((i & 4) != 0) {
            list2 = messagesGetChatPreviewResponse.groups;
        }
        return messagesGetChatPreviewResponse.copy(messagesChatPreview, list, list2);
    }

    @Nullable
    public final MessagesChatPreview component1() {
        return this.preview;
    }

    @Nullable
    public final List<UsersUserFull> component2() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component3() {
        return this.groups;
    }

    @NotNull
    public final MessagesGetChatPreviewResponse copy(@Nullable MessagesChatPreview messagesChatPreview, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        return new MessagesGetChatPreviewResponse(messagesChatPreview, list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetChatPreviewResponse)) {
            return false;
        }
        MessagesGetChatPreviewResponse messagesGetChatPreviewResponse = (MessagesGetChatPreviewResponse) obj;
        return Intrinsics.a(this.preview, messagesGetChatPreviewResponse.preview) && Intrinsics.a(this.profiles, messagesGetChatPreviewResponse.profiles) && Intrinsics.a(this.groups, messagesGetChatPreviewResponse.groups);
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @Nullable
    public final MessagesChatPreview getPreview() {
        return this.preview;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        MessagesChatPreview messagesChatPreview = this.preview;
        int iHashCode = (messagesChatPreview == null ? 0 : messagesChatPreview.hashCode()) * 31;
        List<UsersUserFull> list = this.profiles;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFull> list2 = this.groups;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        MessagesChatPreview messagesChatPreview = this.preview;
        List<UsersUserFull> list = this.profiles;
        List<GroupsGroupFull> list2 = this.groups;
        StringBuilder sb2 = new StringBuilder("MessagesGetChatPreviewResponse(preview=");
        sb2.append(messagesChatPreview);
        sb2.append(", profiles=");
        sb2.append(list);
        sb2.append(", groups=");
        return z.h(sb2, list2, ")");
    }

    public MessagesGetChatPreviewResponse(@Nullable MessagesChatPreview messagesChatPreview, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        this.preview = messagesChatPreview;
        this.profiles = list;
        this.groups = list2;
    }

    public /* synthetic */ MessagesGetChatPreviewResponse(MessagesChatPreview messagesChatPreview, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : messagesChatPreview, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
