package com.vk.sdk.api.stats.dto;

import com.google.android.gms.internal.ads.om1;
import gf.a;
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
public final class StatsWallpostStat {

    @b("hide")
    @Nullable
    private final Integer hide;

    @b("join_group")
    @Nullable
    private final Integer joinGroup;

    @b("links")
    @Nullable
    private final Integer links;

    @b("post_id")
    @Nullable
    private final Integer postId;

    @b("reach_ads")
    @Nullable
    private final Integer reachAds;

    @b("reach_subscribers")
    @Nullable
    private final Integer reachSubscribers;

    @b("reach_subscribers_count")
    @Nullable
    private final Integer reachSubscribersCount;

    @b("reach_total")
    @Nullable
    private final Integer reachTotal;

    @b("reach_total_count")
    @Nullable
    private final Integer reachTotalCount;

    @b("reach_viral")
    @Nullable
    private final Integer reachViral;

    @b("report")
    @Nullable
    private final Integer report;

    @b("sex_age")
    @Nullable
    private final List<StatsSexAge> sexAge;

    @b("to_group")
    @Nullable
    private final Integer toGroup;

    @b("unsubscribe")
    @Nullable
    private final Integer unsubscribe;

    public StatsWallpostStat() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Nullable
    public final Integer component1() {
        return this.postId;
    }

    @Nullable
    public final Integer component10() {
        return this.reachAds;
    }

    @Nullable
    public final Integer component11() {
        return this.report;
    }

    @Nullable
    public final Integer component12() {
        return this.toGroup;
    }

    @Nullable
    public final Integer component13() {
        return this.unsubscribe;
    }

    @Nullable
    public final List<StatsSexAge> component14() {
        return this.sexAge;
    }

    @Nullable
    public final Integer component2() {
        return this.hide;
    }

    @Nullable
    public final Integer component3() {
        return this.joinGroup;
    }

    @Nullable
    public final Integer component4() {
        return this.links;
    }

    @Nullable
    public final Integer component5() {
        return this.reachSubscribers;
    }

    @Nullable
    public final Integer component6() {
        return this.reachSubscribersCount;
    }

    @Nullable
    public final Integer component7() {
        return this.reachTotal;
    }

    @Nullable
    public final Integer component8() {
        return this.reachTotalCount;
    }

    @Nullable
    public final Integer component9() {
        return this.reachViral;
    }

    @NotNull
    public final StatsWallpostStat copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable List<StatsSexAge> list) {
        return new StatsWallpostStat(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsWallpostStat)) {
            return false;
        }
        StatsWallpostStat statsWallpostStat = (StatsWallpostStat) obj;
        return Intrinsics.a(this.postId, statsWallpostStat.postId) && Intrinsics.a(this.hide, statsWallpostStat.hide) && Intrinsics.a(this.joinGroup, statsWallpostStat.joinGroup) && Intrinsics.a(this.links, statsWallpostStat.links) && Intrinsics.a(this.reachSubscribers, statsWallpostStat.reachSubscribers) && Intrinsics.a(this.reachSubscribersCount, statsWallpostStat.reachSubscribersCount) && Intrinsics.a(this.reachTotal, statsWallpostStat.reachTotal) && Intrinsics.a(this.reachTotalCount, statsWallpostStat.reachTotalCount) && Intrinsics.a(this.reachViral, statsWallpostStat.reachViral) && Intrinsics.a(this.reachAds, statsWallpostStat.reachAds) && Intrinsics.a(this.report, statsWallpostStat.report) && Intrinsics.a(this.toGroup, statsWallpostStat.toGroup) && Intrinsics.a(this.unsubscribe, statsWallpostStat.unsubscribe) && Intrinsics.a(this.sexAge, statsWallpostStat.sexAge);
    }

    @Nullable
    public final Integer getHide() {
        return this.hide;
    }

    @Nullable
    public final Integer getJoinGroup() {
        return this.joinGroup;
    }

    @Nullable
    public final Integer getLinks() {
        return this.links;
    }

    @Nullable
    public final Integer getPostId() {
        return this.postId;
    }

    @Nullable
    public final Integer getReachAds() {
        return this.reachAds;
    }

    @Nullable
    public final Integer getReachSubscribers() {
        return this.reachSubscribers;
    }

    @Nullable
    public final Integer getReachSubscribersCount() {
        return this.reachSubscribersCount;
    }

    @Nullable
    public final Integer getReachTotal() {
        return this.reachTotal;
    }

    @Nullable
    public final Integer getReachTotalCount() {
        return this.reachTotalCount;
    }

    @Nullable
    public final Integer getReachViral() {
        return this.reachViral;
    }

    @Nullable
    public final Integer getReport() {
        return this.report;
    }

    @Nullable
    public final List<StatsSexAge> getSexAge() {
        return this.sexAge;
    }

    @Nullable
    public final Integer getToGroup() {
        return this.toGroup;
    }

    @Nullable
    public final Integer getUnsubscribe() {
        return this.unsubscribe;
    }

    public int hashCode() {
        Integer num = this.postId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.hide;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.joinGroup;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.links;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.reachSubscribers;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.reachSubscribersCount;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.reachTotal;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.reachTotalCount;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.reachViral;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.reachAds;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.report;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.toGroup;
        int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.unsubscribe;
        int iHashCode13 = (iHashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        List<StatsSexAge> list = this.sexAge;
        return iHashCode13 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.postId;
        Integer num2 = this.hide;
        Integer num3 = this.joinGroup;
        Integer num4 = this.links;
        Integer num5 = this.reachSubscribers;
        Integer num6 = this.reachSubscribersCount;
        Integer num7 = this.reachTotal;
        Integer num8 = this.reachTotalCount;
        Integer num9 = this.reachViral;
        Integer num10 = this.reachAds;
        Integer num11 = this.report;
        Integer num12 = this.toGroup;
        Integer num13 = this.unsubscribe;
        List<StatsSexAge> list = this.sexAge;
        StringBuilder sbO = om1.o("StatsWallpostStat(postId=", ", hide=", num, num2, ", joinGroup=");
        a.t(sbO, num3, ", links=", num4, ", reachSubscribers=");
        a.t(sbO, num5, ", reachSubscribersCount=", num6, ", reachTotal=");
        a.t(sbO, num7, ", reachTotalCount=", num8, ", reachViral=");
        a.t(sbO, num9, ", reachAds=", num10, ", report=");
        a.t(sbO, num11, ", toGroup=", num12, ", unsubscribe=");
        sbO.append(num13);
        sbO.append(", sexAge=");
        sbO.append(list);
        sbO.append(")");
        return sbO.toString();
    }

    public StatsWallpostStat(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable List<StatsSexAge> list) {
        this.postId = num;
        this.hide = num2;
        this.joinGroup = num3;
        this.links = num4;
        this.reachSubscribers = num5;
        this.reachSubscribersCount = num6;
        this.reachTotal = num7;
        this.reachTotalCount = num8;
        this.reachViral = num9;
        this.reachAds = num10;
        this.report = num11;
        this.toGroup = num12;
        this.unsubscribe = num13;
        this.sexAge = list;
    }

    public /* synthetic */ StatsWallpostStat(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : num8, (i & 256) != 0 ? null : num9, (i & 512) != 0 ? null : num10, (i & 1024) != 0 ? null : num11, (i & 2048) != 0 ? null : num12, (i & 4096) != 0 ? null : num13, (i & 8192) != 0 ? null : list);
    }
}
