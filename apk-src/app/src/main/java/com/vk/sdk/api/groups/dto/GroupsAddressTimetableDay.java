package com.vk.sdk.api.groups.dto;

import a0.u;
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
public final class GroupsAddressTimetableDay {

    @b("break_close_time")
    @Nullable
    private final Integer breakCloseTime;

    @b("break_open_time")
    @Nullable
    private final Integer breakOpenTime;

    @b("close_time")
    private final int closeTime;

    @b("open_time")
    private final int openTime;

    public GroupsAddressTimetableDay(int i, int i10, @Nullable Integer num, @Nullable Integer num2) {
        this.closeTime = i;
        this.openTime = i10;
        this.breakCloseTime = num;
        this.breakOpenTime = num2;
    }

    public static /* synthetic */ GroupsAddressTimetableDay copy$default(GroupsAddressTimetableDay groupsAddressTimetableDay, int i, int i10, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = groupsAddressTimetableDay.closeTime;
        }
        if ((i11 & 2) != 0) {
            i10 = groupsAddressTimetableDay.openTime;
        }
        if ((i11 & 4) != 0) {
            num = groupsAddressTimetableDay.breakCloseTime;
        }
        if ((i11 & 8) != 0) {
            num2 = groupsAddressTimetableDay.breakOpenTime;
        }
        return groupsAddressTimetableDay.copy(i, i10, num, num2);
    }

    public final int component1() {
        return this.closeTime;
    }

    public final int component2() {
        return this.openTime;
    }

    @Nullable
    public final Integer component3() {
        return this.breakCloseTime;
    }

    @Nullable
    public final Integer component4() {
        return this.breakOpenTime;
    }

    @NotNull
    public final GroupsAddressTimetableDay copy(int i, int i10, @Nullable Integer num, @Nullable Integer num2) {
        return new GroupsAddressTimetableDay(i, i10, num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddressTimetableDay)) {
            return false;
        }
        GroupsAddressTimetableDay groupsAddressTimetableDay = (GroupsAddressTimetableDay) obj;
        return this.closeTime == groupsAddressTimetableDay.closeTime && this.openTime == groupsAddressTimetableDay.openTime && Intrinsics.a(this.breakCloseTime, groupsAddressTimetableDay.breakCloseTime) && Intrinsics.a(this.breakOpenTime, groupsAddressTimetableDay.breakOpenTime);
    }

    @Nullable
    public final Integer getBreakCloseTime() {
        return this.breakCloseTime;
    }

    @Nullable
    public final Integer getBreakOpenTime() {
        return this.breakOpenTime;
    }

    public final int getCloseTime() {
        return this.closeTime;
    }

    public final int getOpenTime() {
        return this.openTime;
    }

    public int hashCode() {
        int iG = u.g(this.openTime, Integer.hashCode(this.closeTime) * 31, 31);
        Integer num = this.breakCloseTime;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.breakOpenTime;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.closeTime;
        int i10 = this.openTime;
        Integer num = this.breakCloseTime;
        Integer num2 = this.breakOpenTime;
        StringBuilder sbI = z.i("GroupsAddressTimetableDay(closeTime=", i, ", openTime=", i10, ", breakCloseTime=");
        sbI.append(num);
        sbI.append(", breakOpenTime=");
        sbI.append(num2);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ GroupsAddressTimetableDay(int i, int i10, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2);
    }
}
