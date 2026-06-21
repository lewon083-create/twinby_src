package com.vk.sdk.api.ads.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import gf.a;
import io.sentry.metrics.MetricsUnit;
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
public final class AdsStatsFormat {

    @b("clicks")
    @Nullable
    private final Integer clicks;

    @b(MetricsUnit.Duration.DAY)
    @Nullable
    private final String day;

    @b("impressions")
    @Nullable
    private final Integer impressions;

    @b("join_rate")
    @Nullable
    private final Integer joinRate;

    @b("link_external_clicks")
    @Nullable
    private final Integer linkExternalClicks;

    @b("month")
    @Nullable
    private final String month;

    @b("overall")
    @Nullable
    private final Integer overall;

    @b("reach")
    @Nullable
    private final Integer reach;

    @b("spent")
    @Nullable
    private final Integer spent;

    @b("video_clicks_site")
    @Nullable
    private final Integer videoClicksSite;

    @b("video_views")
    @Nullable
    private final Integer videoViews;

    @b("video_views_full")
    @Nullable
    private final Integer videoViewsFull;

    @b("video_views_half")
    @Nullable
    private final Integer videoViewsHalf;

    public AdsStatsFormat() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ AdsStatsFormat copy$default(AdsStatsFormat adsStatsFormat, Integer num, Integer num2, String str, Integer num3, Integer num4, String str2, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, int i, Object obj) {
        if ((i & 1) != 0) {
            num = adsStatsFormat.clicks;
        }
        return adsStatsFormat.copy(num, (i & 2) != 0 ? adsStatsFormat.linkExternalClicks : num2, (i & 4) != 0 ? adsStatsFormat.day : str, (i & 8) != 0 ? adsStatsFormat.impressions : num3, (i & 16) != 0 ? adsStatsFormat.joinRate : num4, (i & 32) != 0 ? adsStatsFormat.month : str2, (i & 64) != 0 ? adsStatsFormat.overall : num5, (i & 128) != 0 ? adsStatsFormat.reach : num6, (i & 256) != 0 ? adsStatsFormat.spent : num7, (i & 512) != 0 ? adsStatsFormat.videoClicksSite : num8, (i & 1024) != 0 ? adsStatsFormat.videoViews : num9, (i & 2048) != 0 ? adsStatsFormat.videoViewsFull : num10, (i & 4096) != 0 ? adsStatsFormat.videoViewsHalf : num11);
    }

    @Nullable
    public final Integer component1() {
        return this.clicks;
    }

    @Nullable
    public final Integer component10() {
        return this.videoClicksSite;
    }

    @Nullable
    public final Integer component11() {
        return this.videoViews;
    }

    @Nullable
    public final Integer component12() {
        return this.videoViewsFull;
    }

    @Nullable
    public final Integer component13() {
        return this.videoViewsHalf;
    }

    @Nullable
    public final Integer component2() {
        return this.linkExternalClicks;
    }

    @Nullable
    public final String component3() {
        return this.day;
    }

    @Nullable
    public final Integer component4() {
        return this.impressions;
    }

    @Nullable
    public final Integer component5() {
        return this.joinRate;
    }

    @Nullable
    public final String component6() {
        return this.month;
    }

    @Nullable
    public final Integer component7() {
        return this.overall;
    }

    @Nullable
    public final Integer component8() {
        return this.reach;
    }

    @Nullable
    public final Integer component9() {
        return this.spent;
    }

    @NotNull
    public final AdsStatsFormat copy(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11) {
        return new AdsStatsFormat(num, num2, str, num3, num4, str2, num5, num6, num7, num8, num9, num10, num11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsFormat)) {
            return false;
        }
        AdsStatsFormat adsStatsFormat = (AdsStatsFormat) obj;
        return Intrinsics.a(this.clicks, adsStatsFormat.clicks) && Intrinsics.a(this.linkExternalClicks, adsStatsFormat.linkExternalClicks) && Intrinsics.a(this.day, adsStatsFormat.day) && Intrinsics.a(this.impressions, adsStatsFormat.impressions) && Intrinsics.a(this.joinRate, adsStatsFormat.joinRate) && Intrinsics.a(this.month, adsStatsFormat.month) && Intrinsics.a(this.overall, adsStatsFormat.overall) && Intrinsics.a(this.reach, adsStatsFormat.reach) && Intrinsics.a(this.spent, adsStatsFormat.spent) && Intrinsics.a(this.videoClicksSite, adsStatsFormat.videoClicksSite) && Intrinsics.a(this.videoViews, adsStatsFormat.videoViews) && Intrinsics.a(this.videoViewsFull, adsStatsFormat.videoViewsFull) && Intrinsics.a(this.videoViewsHalf, adsStatsFormat.videoViewsHalf);
    }

    @Nullable
    public final Integer getClicks() {
        return this.clicks;
    }

    @Nullable
    public final String getDay() {
        return this.day;
    }

    @Nullable
    public final Integer getImpressions() {
        return this.impressions;
    }

    @Nullable
    public final Integer getJoinRate() {
        return this.joinRate;
    }

    @Nullable
    public final Integer getLinkExternalClicks() {
        return this.linkExternalClicks;
    }

    @Nullable
    public final String getMonth() {
        return this.month;
    }

    @Nullable
    public final Integer getOverall() {
        return this.overall;
    }

    @Nullable
    public final Integer getReach() {
        return this.reach;
    }

    @Nullable
    public final Integer getSpent() {
        return this.spent;
    }

    @Nullable
    public final Integer getVideoClicksSite() {
        return this.videoClicksSite;
    }

    @Nullable
    public final Integer getVideoViews() {
        return this.videoViews;
    }

    @Nullable
    public final Integer getVideoViewsFull() {
        return this.videoViewsFull;
    }

    @Nullable
    public final Integer getVideoViewsHalf() {
        return this.videoViewsHalf;
    }

    public int hashCode() {
        Integer num = this.clicks;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.linkExternalClicks;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.day;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.impressions;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.joinRate;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.month;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.overall;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.reach;
        int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.spent;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.videoClicksSite;
        int iHashCode10 = (iHashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.videoViews;
        int iHashCode11 = (iHashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.videoViewsFull;
        int iHashCode12 = (iHashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.videoViewsHalf;
        return iHashCode12 + (num11 != null ? num11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.clicks;
        Integer num2 = this.linkExternalClicks;
        String str = this.day;
        Integer num3 = this.impressions;
        Integer num4 = this.joinRate;
        String str2 = this.month;
        Integer num5 = this.overall;
        Integer num6 = this.reach;
        Integer num7 = this.spent;
        Integer num8 = this.videoClicksSite;
        Integer num9 = this.videoViews;
        Integer num10 = this.videoViewsFull;
        Integer num11 = this.videoViewsHalf;
        StringBuilder sbO = om1.o("AdsStatsFormat(clicks=", ", linkExternalClicks=", num, num2, ", day=");
        a.r(num3, str, ", impressions=", ", joinRate=", sbO);
        pe.a.r(num4, ", month=", str2, ", overall=", sbO);
        a.t(sbO, num5, ", reach=", num6, ", spent=");
        a.t(sbO, num7, ", videoClicksSite=", num8, ", videoViews=");
        a.t(sbO, num9, ", videoViewsFull=", num10, ", videoViewsHalf=");
        return u.m(sbO, num11, ")");
    }

    public AdsStatsFormat(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11) {
        this.clicks = num;
        this.linkExternalClicks = num2;
        this.day = str;
        this.impressions = num3;
        this.joinRate = num4;
        this.month = str2;
        this.overall = num5;
        this.reach = num6;
        this.spent = num7;
        this.videoClicksSite = num8;
        this.videoViews = num9;
        this.videoViewsFull = num10;
        this.videoViewsHalf = num11;
    }

    public /* synthetic */ AdsStatsFormat(Integer num, Integer num2, String str, Integer num3, Integer num4, String str2, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num5, (i & 128) != 0 ? null : num6, (i & 256) != 0 ? null : num7, (i & 512) != 0 ? null : num8, (i & 1024) != 0 ? null : num9, (i & 2048) != 0 ? null : num10, (i & 4096) != 0 ? null : num11);
    }
}
