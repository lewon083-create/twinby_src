package com.vk.sdk.api.groups.dto;

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
public final class GroupsAddressesInfo {

    @b("is_enabled")
    private final boolean isEnabled;

    @b("main_address_id")
    @Nullable
    private final Integer mainAddressId;

    public GroupsAddressesInfo(boolean z5, @Nullable Integer num) {
        this.isEnabled = z5;
        this.mainAddressId = num;
    }

    public static /* synthetic */ GroupsAddressesInfo copy$default(GroupsAddressesInfo groupsAddressesInfo, boolean z5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = groupsAddressesInfo.isEnabled;
        }
        if ((i & 2) != 0) {
            num = groupsAddressesInfo.mainAddressId;
        }
        return groupsAddressesInfo.copy(z5, num);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    @Nullable
    public final Integer component2() {
        return this.mainAddressId;
    }

    @NotNull
    public final GroupsAddressesInfo copy(boolean z5, @Nullable Integer num) {
        return new GroupsAddressesInfo(z5, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddressesInfo)) {
            return false;
        }
        GroupsAddressesInfo groupsAddressesInfo = (GroupsAddressesInfo) obj;
        return this.isEnabled == groupsAddressesInfo.isEnabled && Intrinsics.a(this.mainAddressId, groupsAddressesInfo.mainAddressId);
    }

    @Nullable
    public final Integer getMainAddressId() {
        return this.mainAddressId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z5 = this.isEnabled;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int i = r02 * 31;
        Integer num = this.mainAddressId;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        return "GroupsAddressesInfo(isEnabled=" + this.isEnabled + ", mainAddressId=" + this.mainAddressId + ")";
    }

    public /* synthetic */ GroupsAddressesInfo(boolean z5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, (i & 2) != 0 ? null : num);
    }
}
