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
public final class MessagesGetByIdExtendedResponse {

    @b("count")
    private final int count;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("items")
    @NotNull
    private final List<MessagesMessage> items;

    @b("profiles")
    @NotNull
    private final List<UsersUserFull> profiles;

    public MessagesGetByIdExtendedResponse(int i, @NotNull List<MessagesMessage> items, @NotNull List<UsersUserFull> profiles, @Nullable List<GroupsGroupFull> list) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        this.count = i;
        this.items = items;
        this.profiles = profiles;
        this.groups = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesGetByIdExtendedResponse copy$default(MessagesGetByIdExtendedResponse messagesGetByIdExtendedResponse, int i, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = messagesGetByIdExtendedResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = messagesGetByIdExtendedResponse.items;
        }
        if ((i10 & 4) != 0) {
            list2 = messagesGetByIdExtendedResponse.profiles;
        }
        if ((i10 & 8) != 0) {
            list3 = messagesGetByIdExtendedResponse.groups;
        }
        return messagesGetByIdExtendedResponse.copy(i, list, list2, list3);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<MessagesMessage> component2() {
        return this.items;
    }

    @NotNull
    public final List<UsersUserFull> component3() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component4() {
        return this.groups;
    }

    @NotNull
    public final MessagesGetByIdExtendedResponse copy(int i, @NotNull List<MessagesMessage> items, @NotNull List<UsersUserFull> profiles, @Nullable List<GroupsGroupFull> list) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        return new MessagesGetByIdExtendedResponse(i, items, profiles, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetByIdExtendedResponse)) {
            return false;
        }
        MessagesGetByIdExtendedResponse messagesGetByIdExtendedResponse = (MessagesGetByIdExtendedResponse) obj;
        return this.count == messagesGetByIdExtendedResponse.count && Intrinsics.a(this.items, messagesGetByIdExtendedResponse.items) && Intrinsics.a(this.profiles, messagesGetByIdExtendedResponse.profiles) && Intrinsics.a(this.groups, messagesGetByIdExtendedResponse.groups);
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

    @NotNull
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        int i = u.i(this.profiles, u.i(this.items, Integer.hashCode(this.count) * 31, 31), 31);
        List<GroupsGroupFull> list = this.groups;
        return i + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<MessagesMessage> list = this.items;
        return a.l(a.m(i, "MessagesGetByIdExtendedResponse(count=", ", items=", ", profiles=", list), this.profiles, ", groups=", this.groups, ")");
    }

    public /* synthetic */ MessagesGetByIdExtendedResponse(int i, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, (i10 & 8) != 0 ? null : list3);
    }
}
