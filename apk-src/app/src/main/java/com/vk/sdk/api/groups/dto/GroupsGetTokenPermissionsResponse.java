package com.vk.sdk.api.groups.dto;

import gf.a;
import io.sentry.protocol.App;
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
public final class GroupsGetTokenPermissionsResponse {

    @b("mask")
    private final int mask;

    @b(App.JsonKeys.APP_PERMISSIONS)
    @NotNull
    private final List<GroupsTokenPermissionSetting> permissions;

    public GroupsGetTokenPermissionsResponse(int i, @NotNull List<GroupsTokenPermissionSetting> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.mask = i;
        this.permissions = permissions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsGetTokenPermissionsResponse copy$default(GroupsGetTokenPermissionsResponse groupsGetTokenPermissionsResponse, int i, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = groupsGetTokenPermissionsResponse.mask;
        }
        if ((i10 & 2) != 0) {
            list = groupsGetTokenPermissionsResponse.permissions;
        }
        return groupsGetTokenPermissionsResponse.copy(i, list);
    }

    public final int component1() {
        return this.mask;
    }

    @NotNull
    public final List<GroupsTokenPermissionSetting> component2() {
        return this.permissions;
    }

    @NotNull
    public final GroupsGetTokenPermissionsResponse copy(int i, @NotNull List<GroupsTokenPermissionSetting> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return new GroupsGetTokenPermissionsResponse(i, permissions);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetTokenPermissionsResponse)) {
            return false;
        }
        GroupsGetTokenPermissionsResponse groupsGetTokenPermissionsResponse = (GroupsGetTokenPermissionsResponse) obj;
        return this.mask == groupsGetTokenPermissionsResponse.mask && Intrinsics.a(this.permissions, groupsGetTokenPermissionsResponse.permissions);
    }

    public final int getMask() {
        return this.mask;
    }

    @NotNull
    public final List<GroupsTokenPermissionSetting> getPermissions() {
        return this.permissions;
    }

    public int hashCode() {
        return this.permissions.hashCode() + (Integer.hashCode(this.mask) * 31);
    }

    @NotNull
    public String toString() {
        return a.h(this.mask, "GroupsGetTokenPermissionsResponse(mask=", ", permissions=", ")", this.permissions);
    }
}
