package com.vk.sdk.api.groups.dto;

import a0.u;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class GroupsBanInfo {

    @b("admin_id")
    @Nullable
    private final Integer adminId;

    @b("comment")
    @Nullable
    private final String comment;

    @b("comment_visible")
    @Nullable
    private final Boolean commentVisible;

    @b("date")
    @Nullable
    private final Integer date;

    @b("end_date")
    @Nullable
    private final Integer endDate;

    @b("is_closed")
    @Nullable
    private final Boolean isClosed;

    @b(DiscardedEvent.JsonKeys.REASON)
    @Nullable
    private final GroupsBanInfoReason reason;

    public GroupsBanInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ GroupsBanInfo copy$default(GroupsBanInfo groupsBanInfo, Integer num, String str, Boolean bool, Boolean bool2, Integer num2, Integer num3, GroupsBanInfoReason groupsBanInfoReason, int i, Object obj) {
        if ((i & 1) != 0) {
            num = groupsBanInfo.adminId;
        }
        if ((i & 2) != 0) {
            str = groupsBanInfo.comment;
        }
        if ((i & 4) != 0) {
            bool = groupsBanInfo.commentVisible;
        }
        if ((i & 8) != 0) {
            bool2 = groupsBanInfo.isClosed;
        }
        if ((i & 16) != 0) {
            num2 = groupsBanInfo.date;
        }
        if ((i & 32) != 0) {
            num3 = groupsBanInfo.endDate;
        }
        if ((i & 64) != 0) {
            groupsBanInfoReason = groupsBanInfo.reason;
        }
        Integer num4 = num3;
        GroupsBanInfoReason groupsBanInfoReason2 = groupsBanInfoReason;
        Integer num5 = num2;
        Boolean bool3 = bool;
        return groupsBanInfo.copy(num, str, bool3, bool2, num5, num4, groupsBanInfoReason2);
    }

    @Nullable
    public final Integer component1() {
        return this.adminId;
    }

    @Nullable
    public final String component2() {
        return this.comment;
    }

    @Nullable
    public final Boolean component3() {
        return this.commentVisible;
    }

    @Nullable
    public final Boolean component4() {
        return this.isClosed;
    }

    @Nullable
    public final Integer component5() {
        return this.date;
    }

    @Nullable
    public final Integer component6() {
        return this.endDate;
    }

    @Nullable
    public final GroupsBanInfoReason component7() {
        return this.reason;
    }

    @NotNull
    public final GroupsBanInfo copy(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable Integer num3, @Nullable GroupsBanInfoReason groupsBanInfoReason) {
        return new GroupsBanInfo(num, str, bool, bool2, num2, num3, groupsBanInfoReason);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsBanInfo)) {
            return false;
        }
        GroupsBanInfo groupsBanInfo = (GroupsBanInfo) obj;
        return Intrinsics.a(this.adminId, groupsBanInfo.adminId) && Intrinsics.a(this.comment, groupsBanInfo.comment) && Intrinsics.a(this.commentVisible, groupsBanInfo.commentVisible) && Intrinsics.a(this.isClosed, groupsBanInfo.isClosed) && Intrinsics.a(this.date, groupsBanInfo.date) && Intrinsics.a(this.endDate, groupsBanInfo.endDate) && this.reason == groupsBanInfo.reason;
    }

    @Nullable
    public final Integer getAdminId() {
        return this.adminId;
    }

    @Nullable
    public final String getComment() {
        return this.comment;
    }

    @Nullable
    public final Boolean getCommentVisible() {
        return this.commentVisible;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
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
        Integer num = this.adminId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.comment;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.commentVisible;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.date;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.endDate;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        GroupsBanInfoReason groupsBanInfoReason = this.reason;
        return iHashCode6 + (groupsBanInfoReason != null ? groupsBanInfoReason.hashCode() : 0);
    }

    @Nullable
    public final Boolean isClosed() {
        return this.isClosed;
    }

    @NotNull
    public String toString() {
        Integer num = this.adminId;
        String str = this.comment;
        Boolean bool = this.commentVisible;
        Boolean bool2 = this.isClosed;
        Integer num2 = this.date;
        Integer num3 = this.endDate;
        GroupsBanInfoReason groupsBanInfoReason = this.reason;
        StringBuilder sb2 = new StringBuilder("GroupsBanInfo(adminId=");
        sb2.append(num);
        sb2.append(", comment=");
        sb2.append(str);
        sb2.append(", commentVisible=");
        u.s(sb2, bool, ", isClosed=", bool2, ", date=");
        a.t(sb2, num2, ", endDate=", num3, ", reason=");
        sb2.append(groupsBanInfoReason);
        sb2.append(")");
        return sb2.toString();
    }

    public GroupsBanInfo(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable Integer num3, @Nullable GroupsBanInfoReason groupsBanInfoReason) {
        this.adminId = num;
        this.comment = str;
        this.commentVisible = bool;
        this.isClosed = bool2;
        this.date = num2;
        this.endDate = num3;
        this.reason = groupsBanInfoReason;
    }

    public /* synthetic */ GroupsBanInfo(Integer num, String str, Boolean bool, Boolean bool2, Integer num2, Integer num3, GroupsBanInfoReason groupsBanInfoReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : groupsBanInfoReason);
    }
}
