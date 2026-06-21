package com.vk.sdk.api.groups.dto;

import a0.u;
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
public final class GroupsLongPollSettings {

    @b("api_version")
    @Nullable
    private final String apiVersion;

    @b("events")
    @NotNull
    private final GroupsLongPollEvents events;

    @b("is_enabled")
    private final boolean isEnabled;

    public GroupsLongPollSettings(@NotNull GroupsLongPollEvents events, boolean z5, @Nullable String str) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.events = events;
        this.isEnabled = z5;
        this.apiVersion = str;
    }

    public static /* synthetic */ GroupsLongPollSettings copy$default(GroupsLongPollSettings groupsLongPollSettings, GroupsLongPollEvents groupsLongPollEvents, boolean z5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            groupsLongPollEvents = groupsLongPollSettings.events;
        }
        if ((i & 2) != 0) {
            z5 = groupsLongPollSettings.isEnabled;
        }
        if ((i & 4) != 0) {
            str = groupsLongPollSettings.apiVersion;
        }
        return groupsLongPollSettings.copy(groupsLongPollEvents, z5, str);
    }

    @NotNull
    public final GroupsLongPollEvents component1() {
        return this.events;
    }

    public final boolean component2() {
        return this.isEnabled;
    }

    @Nullable
    public final String component3() {
        return this.apiVersion;
    }

    @NotNull
    public final GroupsLongPollSettings copy(@NotNull GroupsLongPollEvents events, boolean z5, @Nullable String str) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new GroupsLongPollSettings(events, z5, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLongPollSettings)) {
            return false;
        }
        GroupsLongPollSettings groupsLongPollSettings = (GroupsLongPollSettings) obj;
        return Intrinsics.a(this.events, groupsLongPollSettings.events) && this.isEnabled == groupsLongPollSettings.isEnabled && Intrinsics.a(this.apiVersion, groupsLongPollSettings.apiVersion);
    }

    @Nullable
    public final String getApiVersion() {
        return this.apiVersion;
    }

    @NotNull
    public final GroupsLongPollEvents getEvents() {
        return this.events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.events.hashCode() * 31;
        boolean z5 = this.isEnabled;
        ?? r12 = z5;
        if (z5) {
            r12 = 1;
        }
        int i = (iHashCode + r12) * 31;
        String str = this.apiVersion;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        GroupsLongPollEvents groupsLongPollEvents = this.events;
        boolean z5 = this.isEnabled;
        String str = this.apiVersion;
        StringBuilder sb2 = new StringBuilder("GroupsLongPollSettings(events=");
        sb2.append(groupsLongPollEvents);
        sb2.append(", isEnabled=");
        sb2.append(z5);
        sb2.append(", apiVersion=");
        return u.o(sb2, str, ")");
    }

    public /* synthetic */ GroupsLongPollSettings(GroupsLongPollEvents groupsLongPollEvents, boolean z5, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupsLongPollEvents, z5, (i & 4) != 0 ? null : str);
    }
}
