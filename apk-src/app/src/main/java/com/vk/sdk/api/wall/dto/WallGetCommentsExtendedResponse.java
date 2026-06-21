package com.vk.sdk.api.wall.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroup;
import com.vk.sdk.api.users.dto.UsersUser;
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
public final class WallGetCommentsExtendedResponse {

    @b("can_post")
    @Nullable
    private final Boolean canPost;

    @b("count")
    private final int count;

    @b("current_level_count")
    @Nullable
    private final Integer currentLevelCount;

    @b("groups")
    @NotNull
    private final List<GroupsGroup> groups;

    @b("groups_can_post")
    @Nullable
    private final Boolean groupsCanPost;

    @b("items")
    @NotNull
    private final List<WallWallComment> items;

    @b("profiles")
    @NotNull
    private final List<UsersUser> profiles;

    @b("show_reply_button")
    @Nullable
    private final Boolean showReplyButton;

    public WallGetCommentsExtendedResponse(int i, @NotNull List<WallWallComment> items, @NotNull List<UsersUser> profiles, @NotNull List<GroupsGroup> groups, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.count = i;
        this.items = items;
        this.profiles = profiles;
        this.groups = groups;
        this.currentLevelCount = num;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WallGetCommentsExtendedResponse copy$default(WallGetCommentsExtendedResponse wallGetCommentsExtendedResponse, int i, List list, List list2, List list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = wallGetCommentsExtendedResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = wallGetCommentsExtendedResponse.items;
        }
        if ((i10 & 4) != 0) {
            list2 = wallGetCommentsExtendedResponse.profiles;
        }
        if ((i10 & 8) != 0) {
            list3 = wallGetCommentsExtendedResponse.groups;
        }
        if ((i10 & 16) != 0) {
            num = wallGetCommentsExtendedResponse.currentLevelCount;
        }
        if ((i10 & 32) != 0) {
            bool = wallGetCommentsExtendedResponse.canPost;
        }
        if ((i10 & 64) != 0) {
            bool2 = wallGetCommentsExtendedResponse.showReplyButton;
        }
        if ((i10 & 128) != 0) {
            bool3 = wallGetCommentsExtendedResponse.groupsCanPost;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        Integer num2 = num;
        Boolean bool6 = bool;
        return wallGetCommentsExtendedResponse.copy(i, list, list2, list3, num2, bool6, bool4, bool5);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<WallWallComment> component2() {
        return this.items;
    }

    @NotNull
    public final List<UsersUser> component3() {
        return this.profiles;
    }

    @NotNull
    public final List<GroupsGroup> component4() {
        return this.groups;
    }

    @Nullable
    public final Integer component5() {
        return this.currentLevelCount;
    }

    @Nullable
    public final Boolean component6() {
        return this.canPost;
    }

    @Nullable
    public final Boolean component7() {
        return this.showReplyButton;
    }

    @Nullable
    public final Boolean component8() {
        return this.groupsCanPost;
    }

    @NotNull
    public final WallGetCommentsExtendedResponse copy(int i, @NotNull List<WallWallComment> items, @NotNull List<UsersUser> profiles, @NotNull List<GroupsGroup> groups, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new WallGetCommentsExtendedResponse(i, items, profiles, groups, num, bool, bool2, bool3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetCommentsExtendedResponse)) {
            return false;
        }
        WallGetCommentsExtendedResponse wallGetCommentsExtendedResponse = (WallGetCommentsExtendedResponse) obj;
        return this.count == wallGetCommentsExtendedResponse.count && Intrinsics.a(this.items, wallGetCommentsExtendedResponse.items) && Intrinsics.a(this.profiles, wallGetCommentsExtendedResponse.profiles) && Intrinsics.a(this.groups, wallGetCommentsExtendedResponse.groups) && Intrinsics.a(this.currentLevelCount, wallGetCommentsExtendedResponse.currentLevelCount) && Intrinsics.a(this.canPost, wallGetCommentsExtendedResponse.canPost) && Intrinsics.a(this.showReplyButton, wallGetCommentsExtendedResponse.showReplyButton) && Intrinsics.a(this.groupsCanPost, wallGetCommentsExtendedResponse.groupsCanPost);
    }

    @Nullable
    public final Boolean getCanPost() {
        return this.canPost;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final Integer getCurrentLevelCount() {
        return this.currentLevelCount;
    }

    @NotNull
    public final List<GroupsGroup> getGroups() {
        return this.groups;
    }

    @Nullable
    public final Boolean getGroupsCanPost() {
        return this.groupsCanPost;
    }

    @NotNull
    public final List<WallWallComment> getItems() {
        return this.items;
    }

    @NotNull
    public final List<UsersUser> getProfiles() {
        return this.profiles;
    }

    @Nullable
    public final Boolean getShowReplyButton() {
        return this.showReplyButton;
    }

    public int hashCode() {
        int i = u.i(this.groups, u.i(this.profiles, u.i(this.items, Integer.hashCode(this.count) * 31, 31), 31), 31);
        Integer num = this.currentLevelCount;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canPost;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showReplyButton;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupsCanPost;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<WallWallComment> list = this.items;
        List<UsersUser> list2 = this.profiles;
        List<GroupsGroup> list3 = this.groups;
        Integer num = this.currentLevelCount;
        Boolean bool = this.canPost;
        Boolean bool2 = this.showReplyButton;
        Boolean bool3 = this.groupsCanPost;
        StringBuilder sbM = a.m(i, "WallGetCommentsExtendedResponse(count=", ", items=", ", profiles=", list);
        a.u(sbM, list2, ", groups=", list3, ", currentLevelCount=");
        sbM.append(num);
        sbM.append(", canPost=");
        sbM.append(bool);
        sbM.append(", showReplyButton=");
        sbM.append(bool2);
        sbM.append(", groupsCanPost=");
        sbM.append(bool3);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ WallGetCommentsExtendedResponse(int i, List list, List list2, List list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : bool2, (i10 & 128) != 0 ? null : bool3);
    }
}
