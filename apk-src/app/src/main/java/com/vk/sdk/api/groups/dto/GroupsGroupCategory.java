package com.vk.sdk.api.groups.dto;

import com.vk.sdk.api.base.dto.BaseObjectWithName;
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
public final class GroupsGroupCategory {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15176id;

    @b("name")
    @NotNull
    private final String name;

    @b("subcategories")
    @Nullable
    private final List<BaseObjectWithName> subcategories;

    public GroupsGroupCategory(int i, @NotNull String name, @Nullable List<BaseObjectWithName> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15176id = i;
        this.name = name;
        this.subcategories = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsGroupCategory copy$default(GroupsGroupCategory groupsGroupCategory, int i, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = groupsGroupCategory.f15176id;
        }
        if ((i10 & 2) != 0) {
            str = groupsGroupCategory.name;
        }
        if ((i10 & 4) != 0) {
            list = groupsGroupCategory.subcategories;
        }
        return groupsGroupCategory.copy(i, str, list);
    }

    public final int component1() {
        return this.f15176id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final List<BaseObjectWithName> component3() {
        return this.subcategories;
    }

    @NotNull
    public final GroupsGroupCategory copy(int i, @NotNull String name, @Nullable List<BaseObjectWithName> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new GroupsGroupCategory(i, name, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupCategory)) {
            return false;
        }
        GroupsGroupCategory groupsGroupCategory = (GroupsGroupCategory) obj;
        return this.f15176id == groupsGroupCategory.f15176id && Intrinsics.a(this.name, groupsGroupCategory.name) && Intrinsics.a(this.subcategories, groupsGroupCategory.subcategories);
    }

    public final int getId() {
        return this.f15176id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<BaseObjectWithName> getSubcategories() {
        return this.subcategories;
    }

    public int hashCode() {
        int iE = a.e(Integer.hashCode(this.f15176id) * 31, 31, this.name);
        List<BaseObjectWithName> list = this.subcategories;
        return iE + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.f15176id;
        String str = this.name;
        return z.h(pe.a.i(i, "GroupsGroupCategory(id=", ", name=", str, ", subcategories="), this.subcategories, ")");
    }

    public /* synthetic */ GroupsGroupCategory(int i, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i10 & 4) != 0 ? null : list);
    }
}
