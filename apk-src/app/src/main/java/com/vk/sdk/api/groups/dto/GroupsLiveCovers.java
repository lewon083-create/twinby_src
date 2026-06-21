package com.vk.sdk.api.groups.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class GroupsLiveCovers {

    @b("is_enabled")
    private final boolean isEnabled;

    @b("is_scalable")
    @Nullable
    private final Boolean isScalable;

    @b("story_ids")
    @Nullable
    private final List<String> storyIds;

    public GroupsLiveCovers(boolean z5, @Nullable Boolean bool, @Nullable List<String> list) {
        this.isEnabled = z5;
        this.isScalable = bool;
        this.storyIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsLiveCovers copy$default(GroupsLiveCovers groupsLiveCovers, boolean z5, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = groupsLiveCovers.isEnabled;
        }
        if ((i & 2) != 0) {
            bool = groupsLiveCovers.isScalable;
        }
        if ((i & 4) != 0) {
            list = groupsLiveCovers.storyIds;
        }
        return groupsLiveCovers.copy(z5, bool, list);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    @Nullable
    public final Boolean component2() {
        return this.isScalable;
    }

    @Nullable
    public final List<String> component3() {
        return this.storyIds;
    }

    @NotNull
    public final GroupsLiveCovers copy(boolean z5, @Nullable Boolean bool, @Nullable List<String> list) {
        return new GroupsLiveCovers(z5, bool, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLiveCovers)) {
            return false;
        }
        GroupsLiveCovers groupsLiveCovers = (GroupsLiveCovers) obj;
        return this.isEnabled == groupsLiveCovers.isEnabled && Intrinsics.a(this.isScalable, groupsLiveCovers.isScalable) && Intrinsics.a(this.storyIds, groupsLiveCovers.storyIds);
    }

    @Nullable
    public final List<String> getStoryIds() {
        return this.storyIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z5 = this.isEnabled;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int i = r02 * 31;
        Boolean bool = this.isScalable;
        int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.storyIds;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @Nullable
    public final Boolean isScalable() {
        return this.isScalable;
    }

    @NotNull
    public String toString() {
        boolean z5 = this.isEnabled;
        Boolean bool = this.isScalable;
        List<String> list = this.storyIds;
        StringBuilder sb2 = new StringBuilder("GroupsLiveCovers(isEnabled=");
        sb2.append(z5);
        sb2.append(", isScalable=");
        sb2.append(bool);
        sb2.append(", storyIds=");
        return z.h(sb2, list, ")");
    }

    public /* synthetic */ GroupsLiveCovers(boolean z5, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list);
    }
}
