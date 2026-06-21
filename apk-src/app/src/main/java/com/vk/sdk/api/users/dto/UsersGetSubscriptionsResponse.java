package com.vk.sdk.api.users.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupsArray;
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
public final class UsersGetSubscriptionsResponse {

    @b("groups")
    @NotNull
    private final GroupsGroupsArray groups;

    @b("users")
    @NotNull
    private final UsersUsersArray users;

    public UsersGetSubscriptionsResponse(@NotNull UsersUsersArray users, @NotNull GroupsGroupsArray groups) {
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.users = users;
        this.groups = groups;
    }

    public static /* synthetic */ UsersGetSubscriptionsResponse copy$default(UsersGetSubscriptionsResponse usersGetSubscriptionsResponse, UsersUsersArray usersUsersArray, GroupsGroupsArray groupsGroupsArray, int i, Object obj) {
        if ((i & 1) != 0) {
            usersUsersArray = usersGetSubscriptionsResponse.users;
        }
        if ((i & 2) != 0) {
            groupsGroupsArray = usersGetSubscriptionsResponse.groups;
        }
        return usersGetSubscriptionsResponse.copy(usersUsersArray, groupsGroupsArray);
    }

    @NotNull
    public final UsersUsersArray component1() {
        return this.users;
    }

    @NotNull
    public final GroupsGroupsArray component2() {
        return this.groups;
    }

    @NotNull
    public final UsersGetSubscriptionsResponse copy(@NotNull UsersUsersArray users, @NotNull GroupsGroupsArray groups) {
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new UsersGetSubscriptionsResponse(users, groups);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGetSubscriptionsResponse)) {
            return false;
        }
        UsersGetSubscriptionsResponse usersGetSubscriptionsResponse = (UsersGetSubscriptionsResponse) obj;
        return Intrinsics.a(this.users, usersGetSubscriptionsResponse.users) && Intrinsics.a(this.groups, usersGetSubscriptionsResponse.groups);
    }

    @NotNull
    public final GroupsGroupsArray getGroups() {
        return this.groups;
    }

    @NotNull
    public final UsersUsersArray getUsers() {
        return this.users;
    }

    public int hashCode() {
        return this.groups.hashCode() + (this.users.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UsersGetSubscriptionsResponse(users=" + this.users + ", groups=" + this.groups + ")";
    }
}
