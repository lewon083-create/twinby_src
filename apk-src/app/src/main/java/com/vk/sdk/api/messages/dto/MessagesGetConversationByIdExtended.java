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
public final class MessagesGetConversationByIdExtended {

    @b("count")
    private final int count;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("items")
    @NotNull
    private final List<MessagesConversation> items;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public MessagesGetConversationByIdExtended(int i, @NotNull List<MessagesConversation> items, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.items = items;
        this.profiles = list;
        this.groups = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesGetConversationByIdExtended copy$default(MessagesGetConversationByIdExtended messagesGetConversationByIdExtended, int i, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = messagesGetConversationByIdExtended.count;
        }
        if ((i10 & 2) != 0) {
            list = messagesGetConversationByIdExtended.items;
        }
        if ((i10 & 4) != 0) {
            list2 = messagesGetConversationByIdExtended.profiles;
        }
        if ((i10 & 8) != 0) {
            list3 = messagesGetConversationByIdExtended.groups;
        }
        return messagesGetConversationByIdExtended.copy(i, list, list2, list3);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<MessagesConversation> component2() {
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

    @NotNull
    public final MessagesGetConversationByIdExtended copy(int i, @NotNull List<MessagesConversation> items, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new MessagesGetConversationByIdExtended(i, items, list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetConversationByIdExtended)) {
            return false;
        }
        MessagesGetConversationByIdExtended messagesGetConversationByIdExtended = (MessagesGetConversationByIdExtended) obj;
        return this.count == messagesGetConversationByIdExtended.count && Intrinsics.a(this.items, messagesGetConversationByIdExtended.items) && Intrinsics.a(this.profiles, messagesGetConversationByIdExtended.profiles) && Intrinsics.a(this.groups, messagesGetConversationByIdExtended.groups);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<MessagesConversation> getItems() {
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
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<MessagesConversation> list = this.items;
        return a.l(a.m(i, "MessagesGetConversationByIdExtended(count=", ", items=", ", profiles=", list), this.profiles, ", groups=", this.groups, ")");
    }

    public /* synthetic */ MessagesGetConversationByIdExtended(int i, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }
}
