package com.vk.sdk.api.groups.dto;

import gf.a;
import io.sentry.clientreport.DiscardedEvent;
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
public final class GroupsSuggestion {

    @b("description")
    @NotNull
    private final String description;

    @b("group")
    @NotNull
    private final GroupsGroupFull group;

    @b(DiscardedEvent.JsonKeys.REASON)
    @Nullable
    private final Reason reason;

    @b("track_code")
    @NotNull
    private final String trackCode;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Reason {
        SIMILAR("similar"),
        ADS("ads");


        @NotNull
        private final String value;

        Reason(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public GroupsSuggestion(@NotNull GroupsGroupFull group, @NotNull String trackCode, @NotNull String description, @Nullable Reason reason) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(trackCode, "trackCode");
        Intrinsics.checkNotNullParameter(description, "description");
        this.group = group;
        this.trackCode = trackCode;
        this.description = description;
        this.reason = reason;
    }

    public static /* synthetic */ GroupsSuggestion copy$default(GroupsSuggestion groupsSuggestion, GroupsGroupFull groupsGroupFull, String str, String str2, Reason reason, int i, Object obj) {
        if ((i & 1) != 0) {
            groupsGroupFull = groupsSuggestion.group;
        }
        if ((i & 2) != 0) {
            str = groupsSuggestion.trackCode;
        }
        if ((i & 4) != 0) {
            str2 = groupsSuggestion.description;
        }
        if ((i & 8) != 0) {
            reason = groupsSuggestion.reason;
        }
        return groupsSuggestion.copy(groupsGroupFull, str, str2, reason);
    }

    @NotNull
    public final GroupsGroupFull component1() {
        return this.group;
    }

    @NotNull
    public final String component2() {
        return this.trackCode;
    }

    @NotNull
    public final String component3() {
        return this.description;
    }

    @Nullable
    public final Reason component4() {
        return this.reason;
    }

    @NotNull
    public final GroupsSuggestion copy(@NotNull GroupsGroupFull group, @NotNull String trackCode, @NotNull String description, @Nullable Reason reason) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(trackCode, "trackCode");
        Intrinsics.checkNotNullParameter(description, "description");
        return new GroupsSuggestion(group, trackCode, description, reason);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSuggestion)) {
            return false;
        }
        GroupsSuggestion groupsSuggestion = (GroupsSuggestion) obj;
        return Intrinsics.a(this.group, groupsSuggestion.group) && Intrinsics.a(this.trackCode, groupsSuggestion.trackCode) && Intrinsics.a(this.description, groupsSuggestion.description) && this.reason == groupsSuggestion.reason;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final GroupsGroupFull getGroup() {
        return this.group;
    }

    @Nullable
    public final Reason getReason() {
        return this.reason;
    }

    @NotNull
    public final String getTrackCode() {
        return this.trackCode;
    }

    public int hashCode() {
        int iE = a.e(a.e(this.group.hashCode() * 31, 31, this.trackCode), 31, this.description);
        Reason reason = this.reason;
        return iE + (reason == null ? 0 : reason.hashCode());
    }

    @NotNull
    public String toString() {
        return "GroupsSuggestion(group=" + this.group + ", trackCode=" + this.trackCode + ", description=" + this.description + ", reason=" + this.reason + ")";
    }

    public /* synthetic */ GroupsSuggestion(GroupsGroupFull groupsGroupFull, String str, String str2, Reason reason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupsGroupFull, str, str2, (i & 8) != 0 ? null : reason);
    }
}
