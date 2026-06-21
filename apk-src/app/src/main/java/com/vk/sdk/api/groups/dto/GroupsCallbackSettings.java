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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class GroupsCallbackSettings {

    @b("api_version")
    @Nullable
    private final String apiVersion;

    @b("events")
    @Nullable
    private final GroupsLongPollEvents events;

    public GroupsCallbackSettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GroupsCallbackSettings copy$default(GroupsCallbackSettings groupsCallbackSettings, String str, GroupsLongPollEvents groupsLongPollEvents, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupsCallbackSettings.apiVersion;
        }
        if ((i & 2) != 0) {
            groupsLongPollEvents = groupsCallbackSettings.events;
        }
        return groupsCallbackSettings.copy(str, groupsLongPollEvents);
    }

    @Nullable
    public final String component1() {
        return this.apiVersion;
    }

    @Nullable
    public final GroupsLongPollEvents component2() {
        return this.events;
    }

    @NotNull
    public final GroupsCallbackSettings copy(@Nullable String str, @Nullable GroupsLongPollEvents groupsLongPollEvents) {
        return new GroupsCallbackSettings(str, groupsLongPollEvents);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCallbackSettings)) {
            return false;
        }
        GroupsCallbackSettings groupsCallbackSettings = (GroupsCallbackSettings) obj;
        return Intrinsics.a(this.apiVersion, groupsCallbackSettings.apiVersion) && Intrinsics.a(this.events, groupsCallbackSettings.events);
    }

    @Nullable
    public final String getApiVersion() {
        return this.apiVersion;
    }

    @Nullable
    public final GroupsLongPollEvents getEvents() {
        return this.events;
    }

    public int hashCode() {
        String str = this.apiVersion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        GroupsLongPollEvents groupsLongPollEvents = this.events;
        return iHashCode + (groupsLongPollEvents != null ? groupsLongPollEvents.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GroupsCallbackSettings(apiVersion=" + this.apiVersion + ", events=" + this.events + ")";
    }

    public GroupsCallbackSettings(@Nullable String str, @Nullable GroupsLongPollEvents groupsLongPollEvents) {
        this.apiVersion = str;
        this.events = groupsLongPollEvents;
    }

    public /* synthetic */ GroupsCallbackSettings(String str, GroupsLongPollEvents groupsLongPollEvents, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : groupsLongPollEvents);
    }
}
