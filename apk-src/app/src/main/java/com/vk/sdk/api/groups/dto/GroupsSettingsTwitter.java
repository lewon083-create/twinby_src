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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class GroupsSettingsTwitter {

    @b("name")
    @Nullable
    private final String name;

    @b("status")
    @NotNull
    private final Status status;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Status {
        LOADING("loading"),
        SYNC("sync");


        @NotNull
        private final String value;

        Status(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public GroupsSettingsTwitter(@NotNull Status status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.name = str;
    }

    public static /* synthetic */ GroupsSettingsTwitter copy$default(GroupsSettingsTwitter groupsSettingsTwitter, Status status, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            status = groupsSettingsTwitter.status;
        }
        if ((i & 2) != 0) {
            str = groupsSettingsTwitter.name;
        }
        return groupsSettingsTwitter.copy(status, str);
    }

    @NotNull
    public final Status component1() {
        return this.status;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final GroupsSettingsTwitter copy(@NotNull Status status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new GroupsSettingsTwitter(status, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSettingsTwitter)) {
            return false;
        }
        GroupsSettingsTwitter groupsSettingsTwitter = (GroupsSettingsTwitter) obj;
        return this.status == groupsSettingsTwitter.status && Intrinsics.a(this.name, groupsSettingsTwitter.name);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "GroupsSettingsTwitter(status=" + this.status + ", name=" + this.name + ")";
    }

    public /* synthetic */ GroupsSettingsTwitter(Status status, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i & 2) != 0 ? null : str);
    }
}
