package com.vk.sdk.api.ads.dto;

import a0.u;
import gf.a;
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
public final class AdsCampaign {

    @b("ads_count")
    @Nullable
    private final Integer adsCount;

    @b("all_limit")
    @NotNull
    private final String allLimit;

    @b("create_time")
    @Nullable
    private final Integer createTime;

    @b("day_limit")
    @NotNull
    private final String dayLimit;

    @b("goal_type")
    @Nullable
    private final Integer goalType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15111id;

    @b("is_cbo_enabled")
    @Nullable
    private final Boolean isCboEnabled;

    @b("name")
    @NotNull
    private final String name;

    @b("start_time")
    private final int startTime;

    @b("status")
    @NotNull
    private final AdsCampaignStatus status;

    @b("stop_time")
    private final int stopTime;

    @b("type")
    @NotNull
    private final AdsCampaignType type;

    @b("update_time")
    @Nullable
    private final Integer updateTime;

    @b("user_goal_type")
    @Nullable
    private final Integer userGoalType;

    @b("views_limit")
    @Nullable
    private final Integer viewsLimit;

    public AdsCampaign(@NotNull String allLimit, @NotNull String dayLimit, int i, @NotNull String name, int i10, @NotNull AdsCampaignStatus status, int i11, @NotNull AdsCampaignType type, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool, @Nullable Integer num5, @Nullable Integer num6) {
        Intrinsics.checkNotNullParameter(allLimit, "allLimit");
        Intrinsics.checkNotNullParameter(dayLimit, "dayLimit");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(type, "type");
        this.allLimit = allLimit;
        this.dayLimit = dayLimit;
        this.f15111id = i;
        this.name = name;
        this.startTime = i10;
        this.status = status;
        this.stopTime = i11;
        this.type = type;
        this.adsCount = num;
        this.createTime = num2;
        this.goalType = num3;
        this.userGoalType = num4;
        this.isCboEnabled = bool;
        this.updateTime = num5;
        this.viewsLimit = num6;
    }

    @NotNull
    public final String component1() {
        return this.allLimit;
    }

    @Nullable
    public final Integer component10() {
        return this.createTime;
    }

    @Nullable
    public final Integer component11() {
        return this.goalType;
    }

    @Nullable
    public final Integer component12() {
        return this.userGoalType;
    }

    @Nullable
    public final Boolean component13() {
        return this.isCboEnabled;
    }

    @Nullable
    public final Integer component14() {
        return this.updateTime;
    }

    @Nullable
    public final Integer component15() {
        return this.viewsLimit;
    }

    @NotNull
    public final String component2() {
        return this.dayLimit;
    }

    public final int component3() {
        return this.f15111id;
    }

    @NotNull
    public final String component4() {
        return this.name;
    }

    public final int component5() {
        return this.startTime;
    }

    @NotNull
    public final AdsCampaignStatus component6() {
        return this.status;
    }

    public final int component7() {
        return this.stopTime;
    }

    @NotNull
    public final AdsCampaignType component8() {
        return this.type;
    }

    @Nullable
    public final Integer component9() {
        return this.adsCount;
    }

    @NotNull
    public final AdsCampaign copy(@NotNull String allLimit, @NotNull String dayLimit, int i, @NotNull String name, int i10, @NotNull AdsCampaignStatus status, int i11, @NotNull AdsCampaignType type, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Boolean bool, @Nullable Integer num5, @Nullable Integer num6) {
        Intrinsics.checkNotNullParameter(allLimit, "allLimit");
        Intrinsics.checkNotNullParameter(dayLimit, "dayLimit");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(type, "type");
        return new AdsCampaign(allLimit, dayLimit, i, name, i10, status, i11, type, num, num2, num3, num4, bool, num5, num6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCampaign)) {
            return false;
        }
        AdsCampaign adsCampaign = (AdsCampaign) obj;
        return Intrinsics.a(this.allLimit, adsCampaign.allLimit) && Intrinsics.a(this.dayLimit, adsCampaign.dayLimit) && this.f15111id == adsCampaign.f15111id && Intrinsics.a(this.name, adsCampaign.name) && this.startTime == adsCampaign.startTime && this.status == adsCampaign.status && this.stopTime == adsCampaign.stopTime && this.type == adsCampaign.type && Intrinsics.a(this.adsCount, adsCampaign.adsCount) && Intrinsics.a(this.createTime, adsCampaign.createTime) && Intrinsics.a(this.goalType, adsCampaign.goalType) && Intrinsics.a(this.userGoalType, adsCampaign.userGoalType) && Intrinsics.a(this.isCboEnabled, adsCampaign.isCboEnabled) && Intrinsics.a(this.updateTime, adsCampaign.updateTime) && Intrinsics.a(this.viewsLimit, adsCampaign.viewsLimit);
    }

    @Nullable
    public final Integer getAdsCount() {
        return this.adsCount;
    }

    @NotNull
    public final String getAllLimit() {
        return this.allLimit;
    }

    @Nullable
    public final Integer getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getDayLimit() {
        return this.dayLimit;
    }

    @Nullable
    public final Integer getGoalType() {
        return this.goalType;
    }

    public final int getId() {
        return this.f15111id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final AdsCampaignStatus getStatus() {
        return this.status;
    }

    public final int getStopTime() {
        return this.stopTime;
    }

    @NotNull
    public final AdsCampaignType getType() {
        return this.type;
    }

    @Nullable
    public final Integer getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final Integer getUserGoalType() {
        return this.userGoalType;
    }

    @Nullable
    public final Integer getViewsLimit() {
        return this.viewsLimit;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + u.g(this.stopTime, (this.status.hashCode() + u.g(this.startTime, a.e(u.g(this.f15111id, a.e(this.allLimit.hashCode() * 31, 31, this.dayLimit), 31), 31, this.name), 31)) * 31, 31)) * 31;
        Integer num = this.adsCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.createTime;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.goalType;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.userGoalType;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.isCboEnabled;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num5 = this.updateTime;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.viewsLimit;
        return iHashCode7 + (num6 != null ? num6.hashCode() : 0);
    }

    @Nullable
    public final Boolean isCboEnabled() {
        return this.isCboEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.allLimit;
        String str2 = this.dayLimit;
        int i = this.f15111id;
        String str3 = this.name;
        int i10 = this.startTime;
        AdsCampaignStatus adsCampaignStatus = this.status;
        int i11 = this.stopTime;
        AdsCampaignType adsCampaignType = this.type;
        Integer num = this.adsCount;
        Integer num2 = this.createTime;
        Integer num3 = this.goalType;
        Integer num4 = this.userGoalType;
        Boolean bool = this.isCboEnabled;
        Integer num5 = this.updateTime;
        Integer num6 = this.viewsLimit;
        StringBuilder sbJ = z.j("AdsCampaign(allLimit=", str, ", dayLimit=", str2, ", id=");
        a.q(i, ", name=", str3, ", startTime=", sbJ);
        sbJ.append(i10);
        sbJ.append(", status=");
        sbJ.append(adsCampaignStatus);
        sbJ.append(", stopTime=");
        sbJ.append(i11);
        sbJ.append(", type=");
        sbJ.append(adsCampaignType);
        sbJ.append(", adsCount=");
        a.t(sbJ, num, ", createTime=", num2, ", goalType=");
        a.t(sbJ, num3, ", userGoalType=", num4, ", isCboEnabled=");
        sbJ.append(bool);
        sbJ.append(", updateTime=");
        sbJ.append(num5);
        sbJ.append(", viewsLimit=");
        return u.m(sbJ, num6, ")");
    }

    public /* synthetic */ AdsCampaign(String str, String str2, int i, String str3, int i10, AdsCampaignStatus adsCampaignStatus, int i11, AdsCampaignType adsCampaignType, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Integer num5, Integer num6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, i10, adsCampaignStatus, i11, adsCampaignType, (i12 & 256) != 0 ? null : num, (i12 & 512) != 0 ? null : num2, (i12 & 1024) != 0 ? null : num3, (i12 & 2048) != 0 ? null : num4, (i12 & 4096) != 0 ? null : bool, (i12 & 8192) != 0 ? null : num5, (i12 & 16384) != 0 ? null : num6);
    }
}
