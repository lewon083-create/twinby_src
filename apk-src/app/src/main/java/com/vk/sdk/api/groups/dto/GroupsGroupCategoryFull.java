package com.vk.sdk.api.groups.dto;

import a0.u;
import gf.a;
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
public final class GroupsGroupCategoryFull {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15177id;

    @b("name")
    @NotNull
    private final String name;

    @b("page_count")
    private final int pageCount;

    @b("page_previews")
    @NotNull
    private final List<GroupsGroup> pagePreviews;

    @b("subcategories")
    @Nullable
    private final List<GroupsGroupCategory> subcategories;

    public GroupsGroupCategoryFull(int i, @NotNull String name, int i10, @NotNull List<GroupsGroup> pagePreviews, @Nullable List<GroupsGroupCategory> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pagePreviews, "pagePreviews");
        this.f15177id = i;
        this.name = name;
        this.pageCount = i10;
        this.pagePreviews = pagePreviews;
        this.subcategories = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsGroupCategoryFull copy$default(GroupsGroupCategoryFull groupsGroupCategoryFull, int i, String str, int i10, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = groupsGroupCategoryFull.f15177id;
        }
        if ((i11 & 2) != 0) {
            str = groupsGroupCategoryFull.name;
        }
        if ((i11 & 4) != 0) {
            i10 = groupsGroupCategoryFull.pageCount;
        }
        if ((i11 & 8) != 0) {
            list = groupsGroupCategoryFull.pagePreviews;
        }
        if ((i11 & 16) != 0) {
            list2 = groupsGroupCategoryFull.subcategories;
        }
        List list3 = list2;
        int i12 = i10;
        return groupsGroupCategoryFull.copy(i, str, i12, list, list3);
    }

    public final int component1() {
        return this.f15177id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.pageCount;
    }

    @NotNull
    public final List<GroupsGroup> component4() {
        return this.pagePreviews;
    }

    @Nullable
    public final List<GroupsGroupCategory> component5() {
        return this.subcategories;
    }

    @NotNull
    public final GroupsGroupCategoryFull copy(int i, @NotNull String name, int i10, @NotNull List<GroupsGroup> pagePreviews, @Nullable List<GroupsGroupCategory> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pagePreviews, "pagePreviews");
        return new GroupsGroupCategoryFull(i, name, i10, pagePreviews, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupCategoryFull)) {
            return false;
        }
        GroupsGroupCategoryFull groupsGroupCategoryFull = (GroupsGroupCategoryFull) obj;
        return this.f15177id == groupsGroupCategoryFull.f15177id && Intrinsics.a(this.name, groupsGroupCategoryFull.name) && this.pageCount == groupsGroupCategoryFull.pageCount && Intrinsics.a(this.pagePreviews, groupsGroupCategoryFull.pagePreviews) && Intrinsics.a(this.subcategories, groupsGroupCategoryFull.subcategories);
    }

    public final int getId() {
        return this.f15177id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    @NotNull
    public final List<GroupsGroup> getPagePreviews() {
        return this.pagePreviews;
    }

    @Nullable
    public final List<GroupsGroupCategory> getSubcategories() {
        return this.subcategories;
    }

    public int hashCode() {
        int i = u.i(this.pagePreviews, u.g(this.pageCount, a.e(Integer.hashCode(this.f15177id) * 31, 31, this.name), 31), 31);
        List<GroupsGroupCategory> list = this.subcategories;
        return i + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.f15177id;
        String str = this.name;
        int i10 = this.pageCount;
        List<GroupsGroup> list = this.pagePreviews;
        List<GroupsGroupCategory> list2 = this.subcategories;
        StringBuilder sbI = pe.a.i(i, "GroupsGroupCategoryFull(id=", ", name=", str, ", pageCount=");
        sbI.append(i10);
        sbI.append(", pagePreviews=");
        sbI.append(list);
        sbI.append(", subcategories=");
        return z.h(sbI, list2, ")");
    }

    public /* synthetic */ GroupsGroupCategoryFull(int i, String str, int i10, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i10, list, (i11 & 16) != 0 ? null : list2);
    }
}
