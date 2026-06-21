package com.vk.sdk.api.photos.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUserFull;
import com.vk.sdk.api.wall.dto.WallWallComment;
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
public final class PhotosGetCommentsExtendedResponse {

    @b("count")
    private final int count;

    @b("groups")
    @NotNull
    private final List<GroupsGroupFull> groups;

    @b("items")
    @NotNull
    private final List<WallWallComment> items;

    @b("profiles")
    @NotNull
    private final List<UsersUserFull> profiles;

    @b("real_offset")
    @Nullable
    private final Integer realOffset;

    public PhotosGetCommentsExtendedResponse(int i, @NotNull List<WallWallComment> items, @NotNull List<UsersUserFull> profiles, @NotNull List<GroupsGroupFull> groups, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.count = i;
        this.items = items;
        this.profiles = profiles;
        this.groups = groups;
        this.realOffset = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotosGetCommentsExtendedResponse copy$default(PhotosGetCommentsExtendedResponse photosGetCommentsExtendedResponse, int i, List list, List list2, List list3, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = photosGetCommentsExtendedResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = photosGetCommentsExtendedResponse.items;
        }
        if ((i10 & 4) != 0) {
            list2 = photosGetCommentsExtendedResponse.profiles;
        }
        if ((i10 & 8) != 0) {
            list3 = photosGetCommentsExtendedResponse.groups;
        }
        if ((i10 & 16) != 0) {
            num = photosGetCommentsExtendedResponse.realOffset;
        }
        Integer num2 = num;
        List list4 = list2;
        return photosGetCommentsExtendedResponse.copy(i, list, list4, list3, num2);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<WallWallComment> component2() {
        return this.items;
    }

    @NotNull
    public final List<UsersUserFull> component3() {
        return this.profiles;
    }

    @NotNull
    public final List<GroupsGroupFull> component4() {
        return this.groups;
    }

    @Nullable
    public final Integer component5() {
        return this.realOffset;
    }

    @NotNull
    public final PhotosGetCommentsExtendedResponse copy(int i, @NotNull List<WallWallComment> items, @NotNull List<UsersUserFull> profiles, @NotNull List<GroupsGroupFull> groups, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new PhotosGetCommentsExtendedResponse(i, items, profiles, groups, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetCommentsExtendedResponse)) {
            return false;
        }
        PhotosGetCommentsExtendedResponse photosGetCommentsExtendedResponse = (PhotosGetCommentsExtendedResponse) obj;
        return this.count == photosGetCommentsExtendedResponse.count && Intrinsics.a(this.items, photosGetCommentsExtendedResponse.items) && Intrinsics.a(this.profiles, photosGetCommentsExtendedResponse.profiles) && Intrinsics.a(this.groups, photosGetCommentsExtendedResponse.groups) && Intrinsics.a(this.realOffset, photosGetCommentsExtendedResponse.realOffset);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<WallWallComment> getItems() {
        return this.items;
    }

    @NotNull
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    @Nullable
    public final Integer getRealOffset() {
        return this.realOffset;
    }

    public int hashCode() {
        int i = u.i(this.groups, u.i(this.profiles, u.i(this.items, Integer.hashCode(this.count) * 31, 31), 31), 31);
        Integer num = this.realOffset;
        return i + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<WallWallComment> list = this.items;
        List<UsersUserFull> list2 = this.profiles;
        List<GroupsGroupFull> list3 = this.groups;
        Integer num = this.realOffset;
        StringBuilder sbM = a.m(i, "PhotosGetCommentsExtendedResponse(count=", ", items=", ", profiles=", list);
        a.u(sbM, list2, ", groups=", list3, ", realOffset=");
        return u.m(sbM, num, ")");
    }

    public /* synthetic */ PhotosGetCommentsExtendedResponse(int i, List list, List list2, List list3, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, (i10 & 16) != 0 ? null : num);
    }
}
