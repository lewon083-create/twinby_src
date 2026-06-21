package com.vk.sdk.api.groups.dto;

import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.sdk.api.users.dto.UsersUser;
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
public final class GroupsBannedItem {

    @b(VKApiCodes.PARAM_BAN_INFO)
    @Nullable
    private final GroupsBanInfo banInfo;

    @b("group")
    @Nullable
    private final GroupsGroup group;

    @b("profile")
    @Nullable
    private final UsersUser profile;

    @b("type")
    @Nullable
    private final GroupsOwnerXtrBanInfoType type;

    public GroupsBannedItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ GroupsBannedItem copy$default(GroupsBannedItem groupsBannedItem, GroupsBanInfo groupsBanInfo, GroupsGroup groupsGroup, UsersUser usersUser, GroupsOwnerXtrBanInfoType groupsOwnerXtrBanInfoType, int i, Object obj) {
        if ((i & 1) != 0) {
            groupsBanInfo = groupsBannedItem.banInfo;
        }
        if ((i & 2) != 0) {
            groupsGroup = groupsBannedItem.group;
        }
        if ((i & 4) != 0) {
            usersUser = groupsBannedItem.profile;
        }
        if ((i & 8) != 0) {
            groupsOwnerXtrBanInfoType = groupsBannedItem.type;
        }
        return groupsBannedItem.copy(groupsBanInfo, groupsGroup, usersUser, groupsOwnerXtrBanInfoType);
    }

    @Nullable
    public final GroupsBanInfo component1() {
        return this.banInfo;
    }

    @Nullable
    public final GroupsGroup component2() {
        return this.group;
    }

    @Nullable
    public final UsersUser component3() {
        return this.profile;
    }

    @Nullable
    public final GroupsOwnerXtrBanInfoType component4() {
        return this.type;
    }

    @NotNull
    public final GroupsBannedItem copy(@Nullable GroupsBanInfo groupsBanInfo, @Nullable GroupsGroup groupsGroup, @Nullable UsersUser usersUser, @Nullable GroupsOwnerXtrBanInfoType groupsOwnerXtrBanInfoType) {
        return new GroupsBannedItem(groupsBanInfo, groupsGroup, usersUser, groupsOwnerXtrBanInfoType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBannedItem)) {
            return false;
        }
        GroupsBannedItem groupsBannedItem = (GroupsBannedItem) obj;
        return Intrinsics.a(this.banInfo, groupsBannedItem.banInfo) && Intrinsics.a(this.group, groupsBannedItem.group) && Intrinsics.a(this.profile, groupsBannedItem.profile) && this.type == groupsBannedItem.type;
    }

    @Nullable
    public final GroupsBanInfo getBanInfo() {
        return this.banInfo;
    }

    @Nullable
    public final GroupsGroup getGroup() {
        return this.group;
    }

    @Nullable
    public final UsersUser getProfile() {
        return this.profile;
    }

    @Nullable
    public final GroupsOwnerXtrBanInfoType getType() {
        return this.type;
    }

    public int hashCode() {
        GroupsBanInfo groupsBanInfo = this.banInfo;
        int iHashCode = (groupsBanInfo == null ? 0 : groupsBanInfo.hashCode()) * 31;
        GroupsGroup groupsGroup = this.group;
        int iHashCode2 = (iHashCode + (groupsGroup == null ? 0 : groupsGroup.hashCode())) * 31;
        UsersUser usersUser = this.profile;
        int iHashCode3 = (iHashCode2 + (usersUser == null ? 0 : usersUser.hashCode())) * 31;
        GroupsOwnerXtrBanInfoType groupsOwnerXtrBanInfoType = this.type;
        return iHashCode3 + (groupsOwnerXtrBanInfoType != null ? groupsOwnerXtrBanInfoType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GroupsBannedItem(banInfo=" + this.banInfo + ", group=" + this.group + ", profile=" + this.profile + ", type=" + this.type + ")";
    }

    public GroupsBannedItem(@Nullable GroupsBanInfo groupsBanInfo, @Nullable GroupsGroup groupsGroup, @Nullable UsersUser usersUser, @Nullable GroupsOwnerXtrBanInfoType groupsOwnerXtrBanInfoType) {
        this.banInfo = groupsBanInfo;
        this.group = groupsGroup;
        this.profile = usersUser;
        this.type = groupsOwnerXtrBanInfoType;
    }

    public /* synthetic */ GroupsBannedItem(GroupsBanInfo groupsBanInfo, GroupsGroup groupsGroup, UsersUser usersUser, GroupsOwnerXtrBanInfoType groupsOwnerXtrBanInfoType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : groupsBanInfo, (i & 2) != 0 ? null : groupsGroup, (i & 4) != 0 ? null : usersUser, (i & 8) != 0 ? null : groupsOwnerXtrBanInfoType);
    }
}
