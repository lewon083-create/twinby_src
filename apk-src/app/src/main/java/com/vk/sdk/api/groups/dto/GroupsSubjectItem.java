package com.vk.sdk.api.groups.dto;

import kotlin.Metadata;
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
public final class GroupsSubjectItem {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15183id;

    @b("name")
    @NotNull
    private final String name;

    public GroupsSubjectItem(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15183id = i;
        this.name = name;
    }

    public static /* synthetic */ GroupsSubjectItem copy$default(GroupsSubjectItem groupsSubjectItem, int i, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = groupsSubjectItem.f15183id;
        }
        if ((i10 & 2) != 0) {
            str = groupsSubjectItem.name;
        }
        return groupsSubjectItem.copy(i, str);
    }

    public final int component1() {
        return this.f15183id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final GroupsSubjectItem copy(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new GroupsSubjectItem(i, name);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSubjectItem)) {
            return false;
        }
        GroupsSubjectItem groupsSubjectItem = (GroupsSubjectItem) obj;
        return this.f15183id == groupsSubjectItem.f15183id && Intrinsics.a(this.name, groupsSubjectItem.name);
    }

    public final int getId() {
        return this.f15183id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.f15183id) * 31);
    }

    @NotNull
    public String toString() {
        return "GroupsSubjectItem(id=" + this.f15183id + ", name=" + this.name + ")";
    }
}
