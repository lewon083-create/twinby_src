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
public final class GroupsOnlineStatus {

    @b("minutes")
    @Nullable
    private final Integer minutes;

    @b("status")
    @NotNull
    private final GroupsOnlineStatusType status;

    public GroupsOnlineStatus(@NotNull GroupsOnlineStatusType status, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.minutes = num;
    }

    public static /* synthetic */ GroupsOnlineStatus copy$default(GroupsOnlineStatus groupsOnlineStatus, GroupsOnlineStatusType groupsOnlineStatusType, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            groupsOnlineStatusType = groupsOnlineStatus.status;
        }
        if ((i & 2) != 0) {
            num = groupsOnlineStatus.minutes;
        }
        return groupsOnlineStatus.copy(groupsOnlineStatusType, num);
    }

    @NotNull
    public final GroupsOnlineStatusType component1() {
        return this.status;
    }

    @Nullable
    public final Integer component2() {
        return this.minutes;
    }

    @NotNull
    public final GroupsOnlineStatus copy(@NotNull GroupsOnlineStatusType status, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new GroupsOnlineStatus(status, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsOnlineStatus)) {
            return false;
        }
        GroupsOnlineStatus groupsOnlineStatus = (GroupsOnlineStatus) obj;
        return this.status == groupsOnlineStatus.status && Intrinsics.a(this.minutes, groupsOnlineStatus.minutes);
    }

    @Nullable
    public final Integer getMinutes() {
        return this.minutes;
    }

    @NotNull
    public final GroupsOnlineStatusType getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Integer num = this.minutes;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "GroupsOnlineStatus(status=" + this.status + ", minutes=" + this.minutes + ")";
    }

    public /* synthetic */ GroupsOnlineStatus(GroupsOnlineStatusType groupsOnlineStatusType, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupsOnlineStatusType, (i & 2) != 0 ? null : num);
    }
}
