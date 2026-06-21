package com.vk.sdk.api.groups.dto;

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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class GroupsGroupBanInfo {

    @b("comment")
    @Nullable
    private final String comment;

    @b("end_date")
    @Nullable
    private final Integer endDate;

    @b(DiscardedEvent.JsonKeys.REASON)
    @Nullable
    private final GroupsBanInfoReason reason;

    public GroupsGroupBanInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ GroupsGroupBanInfo copy$default(GroupsGroupBanInfo groupsGroupBanInfo, String str, Integer num, GroupsBanInfoReason groupsBanInfoReason, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupsGroupBanInfo.comment;
        }
        if ((i & 2) != 0) {
            num = groupsGroupBanInfo.endDate;
        }
        if ((i & 4) != 0) {
            groupsBanInfoReason = groupsGroupBanInfo.reason;
        }
        return groupsGroupBanInfo.copy(str, num, groupsBanInfoReason);
    }

    @Nullable
    public final String component1() {
        return this.comment;
    }

    @Nullable
    public final Integer component2() {
        return this.endDate;
    }

    @Nullable
    public final GroupsBanInfoReason component3() {
        return this.reason;
    }

    @NotNull
    public final GroupsGroupBanInfo copy(@Nullable String str, @Nullable Integer num, @Nullable GroupsBanInfoReason groupsBanInfoReason) {
        return new GroupsGroupBanInfo(str, num, groupsBanInfoReason);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupBanInfo)) {
            return false;
        }
        GroupsGroupBanInfo groupsGroupBanInfo = (GroupsGroupBanInfo) obj;
        return Intrinsics.a(this.comment, groupsGroupBanInfo.comment) && Intrinsics.a(this.endDate, groupsGroupBanInfo.endDate) && this.reason == groupsGroupBanInfo.reason;
    }

    @Nullable
    public final String getComment() {
        return this.comment;
    }

    @Nullable
    public final Integer getEndDate() {
        return this.endDate;
    }

    @Nullable
    public final GroupsBanInfoReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        String str = this.comment;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.endDate;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        GroupsBanInfoReason groupsBanInfoReason = this.reason;
        return iHashCode2 + (groupsBanInfoReason != null ? groupsBanInfoReason.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GroupsGroupBanInfo(comment=" + this.comment + ", endDate=" + this.endDate + ", reason=" + this.reason + ")";
    }

    public GroupsGroupBanInfo(@Nullable String str, @Nullable Integer num, @Nullable GroupsBanInfoReason groupsBanInfoReason) {
        this.comment = str;
        this.endDate = num;
        this.reason = groupsBanInfoReason;
    }

    public /* synthetic */ GroupsGroupBanInfo(String str, Integer num, GroupsBanInfoReason groupsBanInfoReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : groupsBanInfoReason);
    }
}
