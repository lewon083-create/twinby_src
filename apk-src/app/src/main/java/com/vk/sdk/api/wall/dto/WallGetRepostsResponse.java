package com.vk.sdk.api.wall.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroup;
import com.vk.sdk.api.users.dto.UsersUser;
import java.util.List;
import kotlin.Metadata;
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
public final class WallGetRepostsResponse {

    @b("groups")
    @NotNull
    private final List<GroupsGroup> groups;

    @b("items")
    @NotNull
    private final List<WallWallpostFull> items;

    @b("profiles")
    @NotNull
    private final List<UsersUser> profiles;

    public WallGetRepostsResponse(@NotNull List<WallWallpostFull> items, @NotNull List<UsersUser> profiles, @NotNull List<GroupsGroup> groups) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.items = items;
        this.profiles = profiles;
        this.groups = groups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WallGetRepostsResponse copy$default(WallGetRepostsResponse wallGetRepostsResponse, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wallGetRepostsResponse.items;
        }
        if ((i & 2) != 0) {
            list2 = wallGetRepostsResponse.profiles;
        }
        if ((i & 4) != 0) {
            list3 = wallGetRepostsResponse.groups;
        }
        return wallGetRepostsResponse.copy(list, list2, list3);
    }

    @NotNull
    public final List<WallWallpostFull> component1() {
        return this.items;
    }

    @NotNull
    public final List<UsersUser> component2() {
        return this.profiles;
    }

    @NotNull
    public final List<GroupsGroup> component3() {
        return this.groups;
    }

    @NotNull
    public final WallGetRepostsResponse copy(@NotNull List<WallWallpostFull> items, @NotNull List<UsersUser> profiles, @NotNull List<GroupsGroup> groups) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new WallGetRepostsResponse(items, profiles, groups);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetRepostsResponse)) {
            return false;
        }
        WallGetRepostsResponse wallGetRepostsResponse = (WallGetRepostsResponse) obj;
        return Intrinsics.a(this.items, wallGetRepostsResponse.items) && Intrinsics.a(this.profiles, wallGetRepostsResponse.profiles) && Intrinsics.a(this.groups, wallGetRepostsResponse.groups);
    }

    @NotNull
    public final List<GroupsGroup> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<WallWallpostFull> getItems() {
        return this.items;
    }

    @NotNull
    public final List<UsersUser> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        return this.groups.hashCode() + u.i(this.profiles, this.items.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        List<WallWallpostFull> list = this.items;
        List<UsersUser> list2 = this.profiles;
        List<GroupsGroup> list3 = this.groups;
        StringBuilder sb2 = new StringBuilder("WallGetRepostsResponse(items=");
        sb2.append(list);
        sb2.append(", profiles=");
        sb2.append(list2);
        sb2.append(", groups=");
        return z.h(sb2, list3, ")");
    }
}
