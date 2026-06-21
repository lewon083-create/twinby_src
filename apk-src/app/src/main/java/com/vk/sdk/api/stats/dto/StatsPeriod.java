package com.vk.sdk.api.stats.dto;

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
public final class StatsPeriod {

    @b("activity")
    @Nullable
    private final StatsActivity activity;

    @b("period_from")
    @Nullable
    private final Integer periodFrom;

    @b("period_to")
    @Nullable
    private final Integer periodTo;

    @b("reach")
    @Nullable
    private final StatsReach reach;

    @b("visitors")
    @Nullable
    private final StatsViews visitors;

    public StatsPeriod() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ StatsPeriod copy$default(StatsPeriod statsPeriod, StatsActivity statsActivity, Integer num, Integer num2, StatsReach statsReach, StatsViews statsViews, int i, Object obj) {
        if ((i & 1) != 0) {
            statsActivity = statsPeriod.activity;
        }
        if ((i & 2) != 0) {
            num = statsPeriod.periodFrom;
        }
        if ((i & 4) != 0) {
            num2 = statsPeriod.periodTo;
        }
        if ((i & 8) != 0) {
            statsReach = statsPeriod.reach;
        }
        if ((i & 16) != 0) {
            statsViews = statsPeriod.visitors;
        }
        StatsViews statsViews2 = statsViews;
        Integer num3 = num2;
        return statsPeriod.copy(statsActivity, num, num3, statsReach, statsViews2);
    }

    @Nullable
    public final StatsActivity component1() {
        return this.activity;
    }

    @Nullable
    public final Integer component2() {
        return this.periodFrom;
    }

    @Nullable
    public final Integer component3() {
        return this.periodTo;
    }

    @Nullable
    public final StatsReach component4() {
        return this.reach;
    }

    @Nullable
    public final StatsViews component5() {
        return this.visitors;
    }

    @NotNull
    public final StatsPeriod copy(@Nullable StatsActivity statsActivity, @Nullable Integer num, @Nullable Integer num2, @Nullable StatsReach statsReach, @Nullable StatsViews statsViews) {
        return new StatsPeriod(statsActivity, num, num2, statsReach, statsViews);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsPeriod)) {
            return false;
        }
        StatsPeriod statsPeriod = (StatsPeriod) obj;
        return Intrinsics.a(this.activity, statsPeriod.activity) && Intrinsics.a(this.periodFrom, statsPeriod.periodFrom) && Intrinsics.a(this.periodTo, statsPeriod.periodTo) && Intrinsics.a(this.reach, statsPeriod.reach) && Intrinsics.a(this.visitors, statsPeriod.visitors);
    }

    @Nullable
    public final StatsActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Integer getPeriodFrom() {
        return this.periodFrom;
    }

    @Nullable
    public final Integer getPeriodTo() {
        return this.periodTo;
    }

    @Nullable
    public final StatsReach getReach() {
        return this.reach;
    }

    @Nullable
    public final StatsViews getVisitors() {
        return this.visitors;
    }

    public int hashCode() {
        StatsActivity statsActivity = this.activity;
        int iHashCode = (statsActivity == null ? 0 : statsActivity.hashCode()) * 31;
        Integer num = this.periodFrom;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.periodTo;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        StatsReach statsReach = this.reach;
        int iHashCode4 = (iHashCode3 + (statsReach == null ? 0 : statsReach.hashCode())) * 31;
        StatsViews statsViews = this.visitors;
        return iHashCode4 + (statsViews != null ? statsViews.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StatsPeriod(activity=" + this.activity + ", periodFrom=" + this.periodFrom + ", periodTo=" + this.periodTo + ", reach=" + this.reach + ", visitors=" + this.visitors + ")";
    }

    public StatsPeriod(@Nullable StatsActivity statsActivity, @Nullable Integer num, @Nullable Integer num2, @Nullable StatsReach statsReach, @Nullable StatsViews statsViews) {
        this.activity = statsActivity;
        this.periodFrom = num;
        this.periodTo = num2;
        this.reach = statsReach;
        this.visitors = statsViews;
    }

    public /* synthetic */ StatsPeriod(StatsActivity statsActivity, Integer num, Integer num2, StatsReach statsReach, StatsViews statsViews, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : statsActivity, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : statsReach, (i & 16) != 0 ? null : statsViews);
    }
}
