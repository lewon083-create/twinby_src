package com.vk.sdk.api.messages.dto;

import a0.u;
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
public final class MessagesGetConversationMembers {

    @b("chat_restrictions")
    @Nullable
    private final MessagesChatRestrictions chatRestrictions;

    @b("count")
    private final int count;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("items")
    @NotNull
    private final List<MessagesConversationMember> items;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public MessagesGetConversationMembers(@NotNull List<MessagesConversationMember> items, int i, @Nullable MessagesChatRestrictions messagesChatRestrictions, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.count = i;
        this.chatRestrictions = messagesChatRestrictions;
        this.profiles = list;
        this.groups = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesGetConversationMembers copy$default(MessagesGetConversationMembers messagesGetConversationMembers, List list, int i, MessagesChatRestrictions messagesChatRestrictions, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = messagesGetConversationMembers.items;
        }
        if ((i10 & 2) != 0) {
            i = messagesGetConversationMembers.count;
        }
        if ((i10 & 4) != 0) {
            messagesChatRestrictions = messagesGetConversationMembers.chatRestrictions;
        }
        if ((i10 & 8) != 0) {
            list2 = messagesGetConversationMembers.profiles;
        }
        if ((i10 & 16) != 0) {
            list3 = messagesGetConversationMembers.groups;
        }
        List list4 = list3;
        MessagesChatRestrictions messagesChatRestrictions2 = messagesChatRestrictions;
        return messagesGetConversationMembers.copy(list, i, messagesChatRestrictions2, list2, list4);
    }

    @NotNull
    public final List<MessagesConversationMember> component1() {
        return this.items;
    }

    public final int component2() {
        return this.count;
    }

    @Nullable
    public final MessagesChatRestrictions component3() {
        return this.chatRestrictions;
    }

    @Nullable
    public final List<UsersUserFull> component4() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component5() {
        return this.groups;
    }

    @NotNull
    public final MessagesGetConversationMembers copy(@NotNull List<MessagesConversationMember> items, int i, @Nullable MessagesChatRestrictions messagesChatRestrictions, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new MessagesGetConversationMembers(items, i, messagesChatRestrictions, list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetConversationMembers)) {
            return false;
        }
        MessagesGetConversationMembers messagesGetConversationMembers = (MessagesGetConversationMembers) obj;
        return Intrinsics.a(this.items, messagesGetConversationMembers.items) && this.count == messagesGetConversationMembers.count && Intrinsics.a(this.chatRestrictions, messagesGetConversationMembers.chatRestrictions) && Intrinsics.a(this.profiles, messagesGetConversationMembers.profiles) && Intrinsics.a(this.groups, messagesGetConversationMembers.groups);
    }

    @Nullable
    public final MessagesChatRestrictions getChatRestrictions() {
        return this.chatRestrictions;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<MessagesConversationMember> getItems() {
        return this.items;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        int iG = u.g(this.count, this.items.hashCode() * 31, 31);
        MessagesChatRestrictions messagesChatRestrictions = this.chatRestrictions;
        int iHashCode = (iG + (messagesChatRestrictions == null ? 0 : messagesChatRestrictions.hashCode())) * 31;
        List<UsersUserFull> list = this.profiles;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFull> list2 = this.groups;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<MessagesConversationMember> list = this.items;
        int i = this.count;
        MessagesChatRestrictions messagesChatRestrictions = this.chatRestrictions;
        List<UsersUserFull> list2 = this.profiles;
        List<GroupsGroupFull> list3 = this.groups;
        StringBuilder sb2 = new StringBuilder("MessagesGetConversationMembers(items=");
        sb2.append(list);
        sb2.append(", count=");
        sb2.append(i);
        sb2.append(", chatRestrictions=");
        sb2.append(messagesChatRestrictions);
        sb2.append(", profiles=");
        sb2.append(list2);
        sb2.append(", groups=");
        return z.h(sb2, list3, ")");
    }

    public /* synthetic */ MessagesGetConversationMembers(List list, int i, MessagesChatRestrictions messagesChatRestrictions, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, (i10 & 4) != 0 ? null : messagesChatRestrictions, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : list3);
    }
}
