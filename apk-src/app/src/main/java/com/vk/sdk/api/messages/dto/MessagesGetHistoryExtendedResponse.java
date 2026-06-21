package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUserFull;
import gf.a;
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
public final class MessagesGetHistoryExtendedResponse {

    @b("conversations")
    @Nullable
    private final List<MessagesConversation> conversations;

    @b("count")
    private final int count;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("items")
    @NotNull
    private final List<MessagesMessage> items;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public MessagesGetHistoryExtendedResponse(int i, @NotNull List<MessagesMessage> items, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2, @Nullable List<MessagesConversation> list3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.items = items;
        this.profiles = list;
        this.groups = list2;
        this.conversations = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesGetHistoryExtendedResponse copy$default(MessagesGetHistoryExtendedResponse messagesGetHistoryExtendedResponse, int i, List list, List list2, List list3, List list4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = messagesGetHistoryExtendedResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = messagesGetHistoryExtendedResponse.items;
        }
        if ((i10 & 4) != 0) {
            list2 = messagesGetHistoryExtendedResponse.profiles;
        }
        if ((i10 & 8) != 0) {
            list3 = messagesGetHistoryExtendedResponse.groups;
        }
        if ((i10 & 16) != 0) {
            list4 = messagesGetHistoryExtendedResponse.conversations;
        }
        List list5 = list4;
        List list6 = list2;
        return messagesGetHistoryExtendedResponse.copy(i, list, list6, list3, list5);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<MessagesMessage> component2() {
        return this.items;
    }

    @Nullable
    public final List<UsersUserFull> component3() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component4() {
        return this.groups;
    }

    @Nullable
    public final List<MessagesConversation> component5() {
        return this.conversations;
    }

    @NotNull
    public final MessagesGetHistoryExtendedResponse copy(int i, @NotNull List<MessagesMessage> items, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2, @Nullable List<MessagesConversation> list3) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new MessagesGetHistoryExtendedResponse(i, items, list, list2, list3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetHistoryExtendedResponse)) {
            return false;
        }
        MessagesGetHistoryExtendedResponse messagesGetHistoryExtendedResponse = (MessagesGetHistoryExtendedResponse) obj;
        return this.count == messagesGetHistoryExtendedResponse.count && Intrinsics.a(this.items, messagesGetHistoryExtendedResponse.items) && Intrinsics.a(this.profiles, messagesGetHistoryExtendedResponse.profiles) && Intrinsics.a(this.groups, messagesGetHistoryExtendedResponse.groups) && Intrinsics.a(this.conversations, messagesGetHistoryExtendedResponse.conversations);
    }

    @Nullable
    public final List<MessagesConversation> getConversations() {
        return this.conversations;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<MessagesMessage> getItems() {
        return this.items;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        int i = u.i(this.items, Integer.hashCode(this.count) * 31, 31);
        List<UsersUserFull> list = this.profiles;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFull> list2 = this.groups;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesConversation> list3 = this.conversations;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<MessagesMessage> list = this.items;
        List<UsersUserFull> list2 = this.profiles;
        List<GroupsGroupFull> list3 = this.groups;
        List<MessagesConversation> list4 = this.conversations;
        StringBuilder sbM = a.m(i, "MessagesGetHistoryExtendedResponse(count=", ", items=", ", profiles=", list);
        a.u(sbM, list2, ", groups=", list3, ", conversations=");
        return z.h(sbM, list4, ")");
    }

    public /* synthetic */ MessagesGetHistoryExtendedResponse(int i, List list, List list2, List list3, List list4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3, (i10 & 16) != 0 ? null : list4);
    }
}
