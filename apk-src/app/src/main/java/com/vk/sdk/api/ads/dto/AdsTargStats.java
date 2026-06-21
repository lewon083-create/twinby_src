package com.vk.sdk.api.ads.dto;

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
public final class AdsTargStats {

    @b("audience_count")
    private final int audienceCount;

    @b("recommended_cpc")
    @Nullable
    private final Float recommendedCpc;

    @b("recommended_cpc_50")
    @Nullable
    private final Float recommendedCpc50;

    @b("recommended_cpc_70")
    @Nullable
    private final Float recommendedCpc70;

    @b("recommended_cpc_90")
    @Nullable
    private final Float recommendedCpc90;

    @b("recommended_cpm")
    @Nullable
    private final Float recommendedCpm;

    @b("recommended_cpm_50")
    @Nullable
    private final Float recommendedCpm50;

    @b("recommended_cpm_70")
    @Nullable
    private final Float recommendedCpm70;

    @b("recommended_cpm_90")
    @Nullable
    private final Float recommendedCpm90;

    public AdsTargStats(int i, @Nullable Float f10, @Nullable Float f11, @Nullable Float f12, @Nullable Float f13, @Nullable Float f14, @Nullable Float f15, @Nullable Float f16, @Nullable Float f17) {
        this.audienceCount = i;
        this.recommendedCpc = f10;
        this.recommendedCpm = f11;
        this.recommendedCpc50 = f12;
        this.recommendedCpm50 = f13;
        this.recommendedCpc70 = f14;
        this.recommendedCpm70 = f15;
        this.recommendedCpc90 = f16;
        this.recommendedCpm90 = f17;
    }

    public static /* synthetic */ AdsTargStats copy$default(AdsTargStats adsTargStats, int i, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = adsTargStats.audienceCount;
        }
        if ((i10 & 2) != 0) {
            f10 = adsTargStats.recommendedCpc;
        }
        if ((i10 & 4) != 0) {
            f11 = adsTargStats.recommendedCpm;
        }
        if ((i10 & 8) != 0) {
            f12 = adsTargStats.recommendedCpc50;
        }
        if ((i10 & 16) != 0) {
            f13 = adsTargStats.recommendedCpm50;
        }
        if ((i10 & 32) != 0) {
            f14 = adsTargStats.recommendedCpc70;
        }
        if ((i10 & 64) != 0) {
            f15 = adsTargStats.recommendedCpm70;
        }
        if ((i10 & 128) != 0) {
            f16 = adsTargStats.recommendedCpc90;
        }
        if ((i10 & 256) != 0) {
            f17 = adsTargStats.recommendedCpm90;
        }
        Float f18 = f16;
        Float f19 = f17;
        Float f20 = f14;
        Float f21 = f15;
        Float f22 = f13;
        Float f23 = f11;
        return adsTargStats.copy(i, f10, f23, f12, f22, f20, f21, f18, f19);
    }

    public final int component1() {
        return this.audienceCount;
    }

    @Nullable
    public final Float component2() {
        return this.recommendedCpc;
    }

    @Nullable
    public final Float component3() {
        return this.recommendedCpm;
    }

    @Nullable
    public final Float component4() {
        return this.recommendedCpc50;
    }

    @Nullable
    public final Float component5() {
        return this.recommendedCpm50;
    }

    @Nullable
    public final Float component6() {
        return this.recommendedCpc70;
    }

    @Nullable
    public final Float component7() {
        return this.recommendedCpm70;
    }

    @Nullable
    public final Float component8() {
        return this.recommendedCpc90;
    }

    @Nullable
    public final Float component9() {
        return this.recommendedCpm90;
    }

    @NotNull
    public final AdsTargStats copy(int i, @Nullable Float f10, @Nullable Float f11, @Nullable Float f12, @Nullable Float f13, @Nullable Float f14, @Nullable Float f15, @Nullable Float f16, @Nullable Float f17) {
        return new AdsTargStats(i, f10, f11, f12, f13, f14, f15, f16, f17);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargStats)) {
            return false;
        }
        AdsTargStats adsTargStats = (AdsTargStats) obj;
        return this.audienceCount == adsTargStats.audienceCount && Intrinsics.a(this.recommendedCpc, adsTargStats.recommendedCpc) && Intrinsics.a(this.recommendedCpm, adsTargStats.recommendedCpm) && Intrinsics.a(this.recommendedCpc50, adsTargStats.recommendedCpc50) && Intrinsics.a(this.recommendedCpm50, adsTargStats.recommendedCpm50) && Intrinsics.a(this.recommendedCpc70, adsTargStats.recommendedCpc70) && Intrinsics.a(this.recommendedCpm70, adsTargStats.recommendedCpm70) && Intrinsics.a(this.recommendedCpc90, adsTargStats.recommendedCpc90) && Intrinsics.a(this.recommendedCpm90, adsTargStats.recommendedCpm90);
    }

    public final int getAudienceCount() {
        return this.audienceCount;
    }

    @Nullable
    public final Float getRecommendedCpc() {
        return this.recommendedCpc;
    }

    @Nullable
    public final Float getRecommendedCpc50() {
        return this.recommendedCpc50;
    }

    @Nullable
    public final Float getRecommendedCpc70() {
        return this.recommendedCpc70;
    }

    @Nullable
    public final Float getRecommendedCpc90() {
        return this.recommendedCpc90;
    }

    @Nullable
    public final Float getRecommendedCpm() {
        return this.recommendedCpm;
    }

    @Nullable
    public final Float getRecommendedCpm50() {
        return this.recommendedCpm50;
    }

    @Nullable
    public final Float getRecommendedCpm70() {
        return this.recommendedCpm70;
    }

    @Nullable
    public final Float getRecommendedCpm90() {
        return this.recommendedCpm90;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.audienceCount) * 31;
        Float f10 = this.recommendedCpc;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.recommendedCpm;
        int iHashCode3 = (iHashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.recommendedCpc50;
        int iHashCode4 = (iHashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.recommendedCpm50;
        int iHashCode5 = (iHashCode4 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.recommendedCpc70;
        int iHashCode6 = (iHashCode5 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.recommendedCpm70;
        int iHashCode7 = (iHashCode6 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.recommendedCpc90;
        int iHashCode8 = (iHashCode7 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Float f17 = this.recommendedCpm90;
        return iHashCode8 + (f17 != null ? f17.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsTargStats(audienceCount=" + this.audienceCount + ", recommendedCpc=" + this.recommendedCpc + ", recommendedCpm=" + this.recommendedCpm + ", recommendedCpc50=" + this.recommendedCpc50 + ", recommendedCpm50=" + this.recommendedCpm50 + ", recommendedCpc70=" + this.recommendedCpc70 + ", recommendedCpm70=" + this.recommendedCpm70 + ", recommendedCpc90=" + this.recommendedCpc90 + ", recommendedCpm90=" + this.recommendedCpm90 + ")";
    }

    public /* synthetic */ AdsTargStats(int i, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : f10, (i10 & 4) != 0 ? null : f11, (i10 & 8) != 0 ? null : f12, (i10 & 16) != 0 ? null : f13, (i10 & 32) != 0 ? null : f14, (i10 & 64) != 0 ? null : f15, (i10 & 128) != 0 ? null : f16, (i10 & 256) != 0 ? null : f17);
    }
}
