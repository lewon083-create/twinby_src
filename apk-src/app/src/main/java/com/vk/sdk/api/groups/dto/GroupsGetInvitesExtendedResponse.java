package com.vk.sdk.api.groups.dto;

import a0.u;
import com.vk.sdk.api.users.dto.UsersUserMin;
import gf.a;
import java.util.List;
import kotlin.Metadata;
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
public final class GroupsGetInvitesExtendedResponse {

    @b("count")
    private final int count;

    @b("groups")
    @NotNull
    private final List<GroupsGroupFull> groups;

    @b("items")
    @NotNull
    private final List<GroupsGroupFull> items;

    @b("profiles")
    @NotNull
    private final List<UsersUserMin> profiles;

    public GroupsGetInvitesExtendedResponse(int i, @NotNull List<GroupsGroupFull> items, @NotNull List<UsersUserMin> profiles, @NotNull List<GroupsGroupFull> groups) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.count = i;
        this.items = items;
        this.profiles = profiles;
        this.groups = groups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsGetInvitesExtendedResponse copy$default(GroupsGetInvitesExtendedResponse groupsGetInvitesExtendedResponse, int i, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = groupsGetInvitesExtendedResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = groupsGetInvitesExtendedResponse.items;
        }
        if ((i10 & 4) != 0) {
            list2 = groupsGetInvitesExtendedResponse.profiles;
        }
        if ((i10 & 8) != 0) {
            list3 = groupsGetInvitesExtendedResponse.groups;
        }
        return groupsGetInvitesExtendedResponse.copy(i, list, list2, list3);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<GroupsGroupFull> component2() {
        return this.items;
    }

    @NotNull
    public final List<UsersUserMin> component3() {
        return this.profiles;
    }

    @NotNull
    public final List<GroupsGroupFull> component4() {
        return this.groups;
    }

    @NotNull
    public final GroupsGetInvitesExtendedResponse copy(int i, @NotNull List<GroupsGroupFull> items, @NotNull List<UsersUserMin> profiles, @NotNull List<GroupsGroupFull> groups) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new GroupsGetInvitesExtendedResponse(i, items, profiles, groups);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetInvitesExtendedResponse)) {
            return false;
        }
        GroupsGetInvitesExtendedResponse groupsGetInvitesExtendedResponse = (GroupsGetInvitesExtendedResponse) obj;
        return this.count == groupsGetInvitesExtendedResponse.count && Intrinsics.a(this.items, groupsGetInvitesExtendedResponse.items) && Intrinsics.a(this.profiles, groupsGetInvitesExtendedResponse.profiles) && Intrinsics.a(this.groups, groupsGetInvitesExtendedResponse.groups);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<GroupsGroupFull> getItems() {
        return this.items;
    }

    @NotNull
    public final List<UsersUserMin> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        return this.groups.hashCode() + u.i(this.profiles, u.i(this.items, Integer.hashCode(this.count) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<GroupsGroupFull> list = this.items;
        return a.l(a.m(i, "GroupsGetInvitesExtendedResponse(count=", ", items=", ", profiles=", list), this.profiles, ", groups=", this.groups, ")");
    }
}
