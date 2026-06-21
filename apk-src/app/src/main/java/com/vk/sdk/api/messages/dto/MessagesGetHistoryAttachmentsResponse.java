package com.vk.sdk.api.messages.dto;

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
public final class MessagesGetHistoryAttachmentsResponse {

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("items")
    @Nullable
    private final List<MessagesHistoryAttachment> items;

    @b("next_from")
    @Nullable
    private final String nextFrom;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public MessagesGetHistoryAttachmentsResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesGetHistoryAttachmentsResponse copy$default(MessagesGetHistoryAttachmentsResponse messagesGetHistoryAttachmentsResponse, List list, String str, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = messagesGetHistoryAttachmentsResponse.items;
        }
        if ((i & 2) != 0) {
            str = messagesGetHistoryAttachmentsResponse.nextFrom;
        }
        if ((i & 4) != 0) {
            list2 = messagesGetHistoryAttachmentsResponse.profiles;
        }
        if ((i & 8) != 0) {
            list3 = messagesGetHistoryAttachmentsResponse.groups;
        }
        return messagesGetHistoryAttachmentsResponse.copy(list, str, list2, list3);
    }

    @Nullable
    public final List<MessagesHistoryAttachment> component1() {
        return this.items;
    }

    @Nullable
    public final String component2() {
        return this.nextFrom;
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
    public final MessagesGetHistoryAttachmentsResponse copy(@Nullable List<MessagesHistoryAttachment> list, @Nullable String str, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroupFull> list3) {
        return new MessagesGetHistoryAttachmentsResponse(list, str, list2, list3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetHistoryAttachmentsResponse)) {
            return false;
        }
        MessagesGetHistoryAttachmentsResponse messagesGetHistoryAttachmentsResponse = (MessagesGetHistoryAttachmentsResponse) obj;
        return Intrinsics.a(this.items, messagesGetHistoryAttachmentsResponse.items) && Intrinsics.a(this.nextFrom, messagesGetHistoryAttachmentsResponse.nextFrom) && Intrinsics.a(this.profiles, messagesGetHistoryAttachmentsResponse.profiles) && Intrinsics.a(this.groups, messagesGetHistoryAttachmentsResponse.groups);
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<MessagesHistoryAttachment> getItems() {
        return this.items;
    }

    @Nullable
    public final String getNextFrom() {
        return this.nextFrom;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        List<MessagesHistoryAttachment> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextFrom;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFull> list2 = this.profiles;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFull> list3 = this.groups;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<MessagesHistoryAttachment> list = this.items;
        String str = this.nextFrom;
        List<UsersUserFull> list2 = this.profiles;
        List<GroupsGroupFull> list3 = this.groups;
        StringBuilder sb2 = new StringBuilder("MessagesGetHistoryAttachmentsResponse(items=");
        sb2.append(list);
        sb2.append(", nextFrom=");
        sb2.append(str);
        sb2.append(", profiles=");
        return a.l(sb2, list2, ", groups=", list3, ")");
    }

    public MessagesGetHistoryAttachmentsResponse(@Nullable List<MessagesHistoryAttachment> list, @Nullable String str, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroupFull> list3) {
        this.items = list;
        this.nextFrom = str;
        this.profiles = list2;
        this.groups = list3;
    }

    public /* synthetic */ MessagesGetHistoryAttachmentsResponse(List list, String str, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
