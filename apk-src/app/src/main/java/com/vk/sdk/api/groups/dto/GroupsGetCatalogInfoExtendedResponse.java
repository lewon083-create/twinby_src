package com.vk.sdk.api.groups.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
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
public final class GroupsGetCatalogInfoExtendedResponse {

    @b("categories")
    @Nullable
    private final List<GroupsGroupCategoryFull> categories;

    @b("enabled")
    @NotNull
    private final BaseBoolInt enabled;

    public GroupsGetCatalogInfoExtendedResponse(@NotNull BaseBoolInt enabled, @Nullable List<GroupsGroupCategoryFull> list) {
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        this.enabled = enabled;
        this.categories = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsGetCatalogInfoExtendedResponse copy$default(GroupsGetCatalogInfoExtendedResponse groupsGetCatalogInfoExtendedResponse, BaseBoolInt baseBoolInt, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = groupsGetCatalogInfoExtendedResponse.enabled;
        }
        if ((i & 2) != 0) {
            list = groupsGetCatalogInfoExtendedResponse.categories;
        }
        return groupsGetCatalogInfoExtendedResponse.copy(baseBoolInt, list);
    }

    @NotNull
    public final BaseBoolInt component1() {
        return this.enabled;
    }

    @Nullable
    public final List<GroupsGroupCategoryFull> component2() {
        return this.categories;
    }

    @NotNull
    public final GroupsGetCatalogInfoExtendedResponse copy(@NotNull BaseBoolInt enabled, @Nullable List<GroupsGroupCategoryFull> list) {
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        return new GroupsGetCatalogInfoExtendedResponse(enabled, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetCatalogInfoExtendedResponse)) {
            return false;
        }
        GroupsGetCatalogInfoExtendedResponse groupsGetCatalogInfoExtendedResponse = (GroupsGetCatalogInfoExtendedResponse) obj;
        return this.enabled == groupsGetCatalogInfoExtendedResponse.enabled && Intrinsics.a(this.categories, groupsGetCatalogInfoExtendedResponse.categories);
    }

    @Nullable
    public final List<GroupsGroupCategoryFull> getCategories() {
        return this.categories;
    }

    @NotNull
    public final BaseBoolInt getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        int iHashCode = this.enabled.hashCode() * 31;
        List<GroupsGroupCategoryFull> list = this.categories;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "GroupsGetCatalogInfoExtendedResponse(enabled=" + this.enabled + ", categories=" + this.categories + ")";
    }

    public /* synthetic */ GroupsGetCatalogInfoExtendedResponse(BaseBoolInt baseBoolInt, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseBoolInt, (i & 2) != 0 ? null : list);
    }
}
