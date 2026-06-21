package com.vk.sdk.api.ads.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import io.sentry.rrweb.RRWebVideoEvent;
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
public final class AdsAd {

    @b("ad_format")
    private final int adFormat;

    @b("ad_platform")
    @Nullable
    private final Integer adPlatform;

    @b("all_limit")
    private final int allLimit;

    @b("approved")
    @NotNull
    private final AdsAdApproved approved;

    @b("autobidding_max_cost")
    @Nullable
    private final Integer autobiddingMaxCost;

    @b("campaign_id")
    private final int campaignId;

    @b("category1_id")
    @Nullable
    private final Integer category1Id;

    @b("category2_id")
    @Nullable
    private final Integer category2Id;

    @b("cost_type")
    @NotNull
    private final AdsAdCostType costType;

    @b("cpa")
    @Nullable
    private final Integer cpa;

    @b("cpc")
    @Nullable
    private final Integer cpc;

    @b("cpm")
    @Nullable
    private final Integer cpm;

    @b("disclaimer_medical")
    @Nullable
    private final BaseBoolInt disclaimerMedical;

    @b("disclaimer_specialist")
    @Nullable
    private final BaseBoolInt disclaimerSpecialist;

    @b("disclaimer_supplements")
    @Nullable
    private final BaseBoolInt disclaimerSupplements;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15109id;

    @b("impressions_limit")
    @Nullable
    private final Integer impressionsLimit;

    @b("impressions_limited")
    @Nullable
    private final BaseBoolInt impressionsLimited;

    @b("name")
    @NotNull
    private final String name;

    @b("ocpm")
    @Nullable
    private final Integer ocpm;

    @b("status")
    @NotNull
    private final AdsAdStatus status;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final BaseBoolInt video;

    public AdsAd(int i, int i10, @NotNull AdsAdApproved approved, int i11, @NotNull AdsAdCostType costType, int i12, @NotNull String name, @NotNull AdsAdStatus status, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num9, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5) {
        Intrinsics.checkNotNullParameter(approved, "approved");
        Intrinsics.checkNotNullParameter(costType, "costType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        this.adFormat = i;
        this.allLimit = i10;
        this.approved = approved;
        this.campaignId = i11;
        this.costType = costType;
        this.f15109id = i12;
        this.name = name;
        this.status = status;
        this.adPlatform = num;
        this.category1Id = num2;
        this.category2Id = num3;
        this.cpc = num4;
        this.cpm = num5;
        this.cpa = num6;
        this.ocpm = num7;
        this.autobiddingMaxCost = num8;
        this.disclaimerMedical = baseBoolInt;
        this.disclaimerSpecialist = baseBoolInt2;
        this.disclaimerSupplements = baseBoolInt3;
        this.impressionsLimit = num9;
        this.impressionsLimited = baseBoolInt4;
        this.video = baseBoolInt5;
    }

    public static /* synthetic */ AdsAd copy$default(AdsAd adsAd, int i, int i10, AdsAdApproved adsAdApproved, int i11, AdsAdCostType adsAdCostType, int i12, String str, AdsAdStatus adsAdStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, Integer num9, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, int i13, Object obj) {
        BaseBoolInt baseBoolInt6;
        BaseBoolInt baseBoolInt7;
        int i14 = (i13 & 1) != 0 ? adsAd.adFormat : i;
        int i15 = (i13 & 2) != 0 ? adsAd.allLimit : i10;
        AdsAdApproved adsAdApproved2 = (i13 & 4) != 0 ? adsAd.approved : adsAdApproved;
        int i16 = (i13 & 8) != 0 ? adsAd.campaignId : i11;
        AdsAdCostType adsAdCostType2 = (i13 & 16) != 0 ? adsAd.costType : adsAdCostType;
        int i17 = (i13 & 32) != 0 ? adsAd.f15109id : i12;
        String str2 = (i13 & 64) != 0 ? adsAd.name : str;
        AdsAdStatus adsAdStatus2 = (i13 & 128) != 0 ? adsAd.status : adsAdStatus;
        Integer num10 = (i13 & 256) != 0 ? adsAd.adPlatform : num;
        Integer num11 = (i13 & 512) != 0 ? adsAd.category1Id : num2;
        Integer num12 = (i13 & 1024) != 0 ? adsAd.category2Id : num3;
        Integer num13 = (i13 & 2048) != 0 ? adsAd.cpc : num4;
        Integer num14 = (i13 & 4096) != 0 ? adsAd.cpm : num5;
        Integer num15 = (i13 & 8192) != 0 ? adsAd.cpa : num6;
        int i18 = i14;
        Integer num16 = (i13 & 16384) != 0 ? adsAd.ocpm : num7;
        Integer num17 = (i13 & 32768) != 0 ? adsAd.autobiddingMaxCost : num8;
        BaseBoolInt baseBoolInt8 = (i13 & 65536) != 0 ? adsAd.disclaimerMedical : baseBoolInt;
        BaseBoolInt baseBoolInt9 = (i13 & 131072) != 0 ? adsAd.disclaimerSpecialist : baseBoolInt2;
        BaseBoolInt baseBoolInt10 = (i13 & 262144) != 0 ? adsAd.disclaimerSupplements : baseBoolInt3;
        Integer num18 = (i13 & 524288) != 0 ? adsAd.impressionsLimit : num9;
        BaseBoolInt baseBoolInt11 = (i13 & 1048576) != 0 ? adsAd.impressionsLimited : baseBoolInt4;
        if ((i13 & 2097152) != 0) {
            baseBoolInt7 = baseBoolInt11;
            baseBoolInt6 = adsAd.video;
        } else {
            baseBoolInt6 = baseBoolInt5;
            baseBoolInt7 = baseBoolInt11;
        }
        return adsAd.copy(i18, i15, adsAdApproved2, i16, adsAdCostType2, i17, str2, adsAdStatus2, num10, num11, num12, num13, num14, num15, num16, num17, baseBoolInt8, baseBoolInt9, baseBoolInt10, num18, baseBoolInt7, baseBoolInt6);
    }

    public final int component1() {
        return this.adFormat;
    }

    @Nullable
    public final Integer component10() {
        return this.category1Id;
    }

    @Nullable
    public final Integer component11() {
        return this.category2Id;
    }

    @Nullable
    public final Integer component12() {
        return this.cpc;
    }

    @Nullable
    public final Integer component13() {
        return this.cpm;
    }

    @Nullable
    public final Integer component14() {
        return this.cpa;
    }

    @Nullable
    public final Integer component15() {
        return this.ocpm;
    }

    @Nullable
    public final Integer component16() {
        return this.autobiddingMaxCost;
    }

    @Nullable
    public final BaseBoolInt component17() {
        return this.disclaimerMedical;
    }

    @Nullable
    public final BaseBoolInt component18() {
        return this.disclaimerSpecialist;
    }

    @Nullable
    public final BaseBoolInt component19() {
        return this.disclaimerSupplements;
    }

    public final int component2() {
        return this.allLimit;
    }

    @Nullable
    public final Integer component20() {
        return this.impressionsLimit;
    }

    @Nullable
    public final BaseBoolInt component21() {
        return this.impressionsLimited;
    }

    @Nullable
    public final BaseBoolInt component22() {
        return this.video;
    }

    @NotNull
    public final AdsAdApproved component3() {
        return this.approved;
    }

    public final int component4() {
        return this.campaignId;
    }

    @NotNull
    public final AdsAdCostType component5() {
        return this.costType;
    }

    public final int component6() {
        return this.f15109id;
    }

    @NotNull
    public final String component7() {
        return this.name;
    }

    @NotNull
    public final AdsAdStatus component8() {
        return this.status;
    }

    @Nullable
    public final Integer component9() {
        return this.adPlatform;
    }

    @NotNull
    public final AdsAd copy(int i, int i10, @NotNull AdsAdApproved approved, int i11, @NotNull AdsAdCostType costType, int i12, @NotNull String name, @NotNull AdsAdStatus status, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3, @Nullable Integer num9, @Nullable BaseBoolInt baseBoolInt4, @Nullable BaseBoolInt baseBoolInt5) {
        Intrinsics.checkNotNullParameter(approved, "approved");
        Intrinsics.checkNotNullParameter(costType, "costType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AdsAd(i, i10, approved, i11, costType, i12, name, status, num, num2, num3, num4, num5, num6, num7, num8, baseBoolInt, baseBoolInt2, baseBoolInt3, num9, baseBoolInt4, baseBoolInt5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsAd)) {
            return false;
        }
        AdsAd adsAd = (AdsAd) obj;
        return this.adFormat == adsAd.adFormat && this.allLimit == adsAd.allLimit && this.approved == adsAd.approved && this.campaignId == adsAd.campaignId && this.costType == adsAd.costType && this.f15109id == adsAd.f15109id && Intrinsics.a(this.name, adsAd.name) && this.status == adsAd.status && Intrinsics.a(this.adPlatform, adsAd.adPlatform) && Intrinsics.a(this.category1Id, adsAd.category1Id) && Intrinsics.a(this.category2Id, adsAd.category2Id) && Intrinsics.a(this.cpc, adsAd.cpc) && Intrinsics.a(this.cpm, adsAd.cpm) && Intrinsics.a(this.cpa, adsAd.cpa) && Intrinsics.a(this.ocpm, adsAd.ocpm) && Intrinsics.a(this.autobiddingMaxCost, adsAd.autobiddingMaxCost) && this.disclaimerMedical == adsAd.disclaimerMedical && this.disclaimerSpecialist == adsAd.disclaimerSpecialist && this.disclaimerSupplements == adsAd.disclaimerSupplements && Intrinsics.a(this.impressionsLimit, adsAd.impressionsLimit) && this.impressionsLimited == adsAd.impressionsLimited && this.video == adsAd.video;
    }

    public final int getAdFormat() {
        return this.adFormat;
    }

    @Nullable
    public final Integer getAdPlatform() {
        return this.adPlatform;
    }

    public final int getAllLimit() {
        return this.allLimit;
    }

    @NotNull
    public final AdsAdApproved getApproved() {
        return this.approved;
    }

    @Nullable
    public final Integer getAutobiddingMaxCost() {
        return this.autobiddingMaxCost;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    public final Integer getCategory1Id() {
        return this.category1Id;
    }

    @Nullable
    public final Integer getCategory2Id() {
        return this.category2Id;
    }

    @NotNull
    public final AdsAdCostType getCostType() {
        return this.costType;
    }

    @Nullable
    public final Integer getCpa() {
        return this.cpa;
    }

    @Nullable
    public final Integer getCpc() {
        return this.cpc;
    }

    @Nullable
    public final Integer getCpm() {
        return this.cpm;
    }

    @Nullable
    public final BaseBoolInt getDisclaimerMedical() {
        return this.disclaimerMedical;
    }

    @Nullable
    public final BaseBoolInt getDisclaimerSpecialist() {
        return this.disclaimerSpecialist;
    }

    @Nullable
    public final BaseBoolInt getDisclaimerSupplements() {
        return this.disclaimerSupplements;
    }

    public final int getId() {
        return this.f15109id;
    }

    @Nullable
    public final Integer getImpressionsLimit() {
        return this.impressionsLimit;
    }

    @Nullable
    public final BaseBoolInt getImpressionsLimited() {
        return this.impressionsLimited;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getOcpm() {
        return this.ocpm;
    }

    @NotNull
    public final AdsAdStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final BaseBoolInt getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + a.e(u.g(this.f15109id, (this.costType.hashCode() + u.g(this.campaignId, (this.approved.hashCode() + u.g(this.allLimit, Integer.hashCode(this.adFormat) * 31, 31)) * 31, 31)) * 31, 31), 31, this.name)) * 31;
        Integer num = this.adPlatform;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.category1Id;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.category2Id;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.cpc;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.cpm;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.cpa;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.ocpm;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.autobiddingMaxCost;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.disclaimerMedical;
        int iHashCode10 = (iHashCode9 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.disclaimerSpecialist;
        int iHashCode11 = (iHashCode10 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.disclaimerSupplements;
        int iHashCode12 = (iHashCode11 + (baseBoolInt3 == null ? 0 : baseBoolInt3.hashCode())) * 31;
        Integer num9 = this.impressionsLimit;
        int iHashCode13 = (iHashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
        BaseBoolInt baseBoolInt4 = this.impressionsLimited;
        int iHashCode14 = (iHashCode13 + (baseBoolInt4 == null ? 0 : baseBoolInt4.hashCode())) * 31;
        BaseBoolInt baseBoolInt5 = this.video;
        return iHashCode14 + (baseBoolInt5 != null ? baseBoolInt5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.adFormat;
        int i10 = this.allLimit;
        AdsAdApproved adsAdApproved = this.approved;
        int i11 = this.campaignId;
        AdsAdCostType adsAdCostType = this.costType;
        int i12 = this.f15109id;
        String str = this.name;
        AdsAdStatus adsAdStatus = this.status;
        Integer num = this.adPlatform;
        Integer num2 = this.category1Id;
        Integer num3 = this.category2Id;
        Integer num4 = this.cpc;
        Integer num5 = this.cpm;
        Integer num6 = this.cpa;
        Integer num7 = this.ocpm;
        Integer num8 = this.autobiddingMaxCost;
        BaseBoolInt baseBoolInt = this.disclaimerMedical;
        BaseBoolInt baseBoolInt2 = this.disclaimerSpecialist;
        BaseBoolInt baseBoolInt3 = this.disclaimerSupplements;
        Integer num9 = this.impressionsLimit;
        BaseBoolInt baseBoolInt4 = this.impressionsLimited;
        BaseBoolInt baseBoolInt5 = this.video;
        StringBuilder sbI = z.i("AdsAd(adFormat=", i, ", allLimit=", i10, ", approved=");
        sbI.append(adsAdApproved);
        sbI.append(", campaignId=");
        sbI.append(i11);
        sbI.append(", costType=");
        sbI.append(adsAdCostType);
        sbI.append(", id=");
        sbI.append(i12);
        sbI.append(", name=");
        sbI.append(str);
        sbI.append(", status=");
        sbI.append(adsAdStatus);
        sbI.append(", adPlatform=");
        a.t(sbI, num, ", category1Id=", num2, ", category2Id=");
        a.t(sbI, num3, ", cpc=", num4, ", cpm=");
        a.t(sbI, num5, ", cpa=", num6, ", ocpm=");
        a.t(sbI, num7, ", autobiddingMaxCost=", num8, ", disclaimerMedical=");
        a.s(sbI, baseBoolInt, ", disclaimerSpecialist=", baseBoolInt2, ", disclaimerSupplements=");
        sbI.append(baseBoolInt3);
        sbI.append(", impressionsLimit=");
        sbI.append(num9);
        sbI.append(", impressionsLimited=");
        sbI.append(baseBoolInt4);
        sbI.append(", video=");
        sbI.append(baseBoolInt5);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ AdsAd(int i, int i10, AdsAdApproved adsAdApproved, int i11, AdsAdCostType adsAdCostType, int i12, String str, AdsAdStatus adsAdStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, Integer num9, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, adsAdApproved, i11, adsAdCostType, i12, str, adsAdStatus, (i13 & 256) != 0 ? null : num, (i13 & 512) != 0 ? null : num2, (i13 & 1024) != 0 ? null : num3, (i13 & 2048) != 0 ? null : num4, (i13 & 4096) != 0 ? null : num5, (i13 & 8192) != 0 ? null : num6, (i13 & 16384) != 0 ? null : num7, (32768 & i13) != 0 ? null : num8, (65536 & i13) != 0 ? null : baseBoolInt, (131072 & i13) != 0 ? null : baseBoolInt2, (262144 & i13) != 0 ? null : baseBoolInt3, (524288 & i13) != 0 ? null : num9, (1048576 & i13) != 0 ? null : baseBoolInt4, (i13 & 2097152) != 0 ? null : baseBoolInt5);
    }
}
