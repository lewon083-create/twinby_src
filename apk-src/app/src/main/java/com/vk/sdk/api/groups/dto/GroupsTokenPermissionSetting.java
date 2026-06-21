package com.vk.sdk.api.groups.dto;

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
public final class GroupsTokenPermissionSetting {

    @b("name")
    @NotNull
    private final String name;

    @b("setting")
    private final int setting;

    public GroupsTokenPermissionSetting(@NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.setting = i;
    }

    public static /* synthetic */ GroupsTokenPermissionSetting copy$default(GroupsTokenPermissionSetting groupsTokenPermissionSetting, String str, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = groupsTokenPermissionSetting.name;
        }
        if ((i10 & 2) != 0) {
            i = groupsTokenPermissionSetting.setting;
        }
        return groupsTokenPermissionSetting.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.setting;
    }

    @NotNull
    public final GroupsTokenPermissionSetting copy(@NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new GroupsTokenPermissionSetting(name, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTokenPermissionSetting)) {
            return false;
        }
        GroupsTokenPermissionSetting groupsTokenPermissionSetting = (GroupsTokenPermissionSetting) obj;
        return Intrinsics.a(this.name, groupsTokenPermissionSetting.name) && this.setting == groupsTokenPermissionSetting.setting;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getSetting() {
        return this.setting;
    }

    public int hashCode() {
        return Integer.hashCode(this.setting) + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "GroupsTokenPermissionSetting(name=" + this.name + ", setting=" + this.setting + ")";
    }
}
