package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUser;
import gf.a;
import java.util.List;
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
public final class MessagesGetImportantMessagesResponse {

    @b("conversations")
    @Nullable
    private final List<MessagesConversation> conversations;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("messages")
    @NotNull
    private final MessagesMessagesArray messages;

    @b("profiles")
    @Nullable
    private final List<UsersUser> profiles;

    public MessagesGetImportantMessagesResponse(@NotNull MessagesMessagesArray messages, @Nullable List<UsersUser> list, @Nullable List<GroupsGroupFull> list2, @Nullable List<MessagesConversation> list3) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
        this.profiles = list;
        this.groups = list2;
        this.conversations = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesGetImportantMessagesResponse copy$default(MessagesGetImportantMessagesResponse messagesGetImportantMessagesResponse, MessagesMessagesArray messagesMessagesArray, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            messagesMessagesArray = messagesGetImportantMessagesResponse.messages;
        }
        if ((i & 2) != 0) {
            list = messagesGetImportantMessagesResponse.profiles;
        }
        if ((i & 4) != 0) {
            list2 = messagesGetImportantMessagesResponse.groups;
        }
        if ((i & 8) != 0) {
            list3 = messagesGetImportantMessagesResponse.conversations;
        }
        return messagesGetImportantMessagesResponse.copy(messagesMessagesArray, list, list2, list3);
    }

    @NotNull
    public final MessagesMessagesArray component1() {
        return this.messages;
    }

    @Nullable
    public final List<UsersUser> component2() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component3() {
        return this.groups;
    }

    @Nullable
    public final List<MessagesConversation> component4() {
        return this.conversations;
    }

    @NotNull
    public final MessagesGetImportantMessagesResponse copy(@NotNull MessagesMessagesArray messages, @Nullable List<UsersUser> list, @Nullable List<GroupsGroupFull> list2, @Nullable List<MessagesConversation> list3) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new MessagesGetImportantMessagesResponse(messages, list, list2, list3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetImportantMessagesResponse)) {
            return false;
        }
        MessagesGetImportantMessagesResponse messagesGetImportantMessagesResponse = (MessagesGetImportantMessagesResponse) obj;
        return Intrinsics.a(this.messages, messagesGetImportantMessagesResponse.messages) && Intrinsics.a(this.profiles, messagesGetImportantMessagesResponse.profiles) && Intrinsics.a(this.groups, messagesGetImportantMessagesResponse.groups) && Intrinsics.a(this.conversations, messagesGetImportantMessagesResponse.conversations);
    }

    @Nullable
    public final List<MessagesConversation> getConversations() {
        return this.conversations;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @NotNull
    public final MessagesMessagesArray getMessages() {
        return this.messages;
    }

    @Nullable
    public final List<UsersUser> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        int iHashCode = this.messages.hashCode() * 31;
        List<UsersUser> list = this.profiles;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFull> list2 = this.groups;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesConversation> list3 = this.conversations;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        MessagesMessagesArray messagesMessagesArray = this.messages;
        List<UsersUser> list = this.profiles;
        List<GroupsGroupFull> list2 = this.groups;
        List<MessagesConversation> list3 = this.conversations;
        StringBuilder sb2 = new StringBuilder("MessagesGetImportantMessagesResponse(messages=");
        sb2.append(messagesMessagesArray);
        sb2.append(", profiles=");
        sb2.append(list);
        sb2.append(", groups=");
        return a.l(sb2, list2, ", conversations=", list3, ")");
    }

    public /* synthetic */ MessagesGetImportantMessagesResponse(MessagesMessagesArray messagesMessagesArray, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagesMessagesArray, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
