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
public final class GroupsGroupPublicCategoryList {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15180id;

    @b("name")
    @Nullable
    private final String name;

    @b("subcategories")
    @Nullable
    private final List<GroupsGroupCategoryType> subcategories;

    public GroupsGroupPublicCategoryList() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsGroupPublicCategoryList copy$default(GroupsGroupPublicCategoryList groupsGroupPublicCategoryList, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = groupsGroupPublicCategoryList.f15180id;
        }
        if ((i & 2) != 0) {
            str = groupsGroupPublicCategoryList.name;
        }
        if ((i & 4) != 0) {
            list = groupsGroupPublicCategoryList.subcategories;
        }
        return groupsGroupPublicCategoryList.copy(num, str, list);
    }

    @Nullable
    public final Integer component1() {
        return this.f15180id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final List<GroupsGroupCategoryType> component3() {
        return this.subcategories;
    }

    @NotNull
    public final GroupsGroupPublicCategoryList copy(@Nullable Integer num, @Nullable String str, @Nullable List<GroupsGroupCategoryType> list) {
        return new GroupsGroupPublicCategoryList(num, str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupPublicCategoryList)) {
            return false;
        }
        GroupsGroupPublicCategoryList groupsGroupPublicCategoryList = (GroupsGroupPublicCategoryList) obj;
        return Intrinsics.a(this.f15180id, groupsGroupPublicCategoryList.f15180id) && Intrinsics.a(this.name, groupsGroupPublicCategoryList.name) && Intrinsics.a(this.subcategories, groupsGroupPublicCategoryList.subcategories);
    }

    @Nullable
    public final Integer getId() {
        return this.f15180id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<GroupsGroupCategoryType> getSubcategories() {
        return this.subcategories;
    }

    public int hashCode() {
        Integer num = this.f15180id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<GroupsGroupCategoryType> list = this.subcategories;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.f15180id;
        String str = this.name;
        List<GroupsGroupCategoryType> list = this.subcategories;
        StringBuilder sb2 = new StringBuilder("GroupsGroupPublicCategoryList(id=");
        sb2.append(num);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", subcategories=");
        return z.h(sb2, list, ")");
    }

    public GroupsGroupPublicCategoryList(@Nullable Integer num, @Nullable String str, @Nullable List<GroupsGroupCategoryType> list) {
        this.f15180id = num;
        this.name = str;
        this.subcategories = list;
    }

    public /* synthetic */ GroupsGroupPublicCategoryList(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
