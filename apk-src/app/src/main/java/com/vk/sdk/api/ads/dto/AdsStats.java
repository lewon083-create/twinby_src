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
public final class AdsStats {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15122id;

    @b("stats")
    @Nullable
    private final AdsStatsFormat stats;

    @b("type")
    @Nullable
    private final AdsObjectType type;

    @b("views_times")
    @Nullable
    private final AdsStatsViewsTimes viewsTimes;

    public AdsStats() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AdsStats copy$default(AdsStats adsStats, Integer num, AdsStatsFormat adsStatsFormat, AdsObjectType adsObjectType, AdsStatsViewsTimes adsStatsViewsTimes, int i, Object obj) {
        if ((i & 1) != 0) {
            num = adsStats.f15122id;
        }
        if ((i & 2) != 0) {
            adsStatsFormat = adsStats.stats;
        }
        if ((i & 4) != 0) {
            adsObjectType = adsStats.type;
        }
        if ((i & 8) != 0) {
            adsStatsViewsTimes = adsStats.viewsTimes;
        }
        return adsStats.copy(num, adsStatsFormat, adsObjectType, adsStatsViewsTimes);
    }

    @Nullable
    public final Integer component1() {
        return this.f15122id;
    }

    @Nullable
    public final AdsStatsFormat component2() {
        return this.stats;
    }

    @Nullable
    public final AdsObjectType component3() {
        return this.type;
    }

    @Nullable
    public final AdsStatsViewsTimes component4() {
        return this.viewsTimes;
    }

    @NotNull
    public final AdsStats copy(@Nullable Integer num, @Nullable AdsStatsFormat adsStatsFormat, @Nullable AdsObjectType adsObjectType, @Nullable AdsStatsViewsTimes adsStatsViewsTimes) {
        return new AdsStats(num, adsStatsFormat, adsObjectType, adsStatsViewsTimes);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStats)) {
            return false;
        }
        AdsStats adsStats = (AdsStats) obj;
        return Intrinsics.a(this.f15122id, adsStats.f15122id) && Intrinsics.a(this.stats, adsStats.stats) && this.type == adsStats.type && Intrinsics.a(this.viewsTimes, adsStats.viewsTimes);
    }

    @Nullable
    public final Integer getId() {
        return this.f15122id;
    }

    @Nullable
    public final AdsStatsFormat getStats() {
        return this.stats;
    }

    @Nullable
    public final AdsObjectType getType() {
        return this.type;
    }

    @Nullable
    public final AdsStatsViewsTimes getViewsTimes() {
        return this.viewsTimes;
    }

    public int hashCode() {
        Integer num = this.f15122id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        AdsStatsFormat adsStatsFormat = this.stats;
        int iHashCode2 = (iHashCode + (adsStatsFormat == null ? 0 : adsStatsFormat.hashCode())) * 31;
        AdsObjectType adsObjectType = this.type;
        int iHashCode3 = (iHashCode2 + (adsObjectType == null ? 0 : adsObjectType.hashCode())) * 31;
        AdsStatsViewsTimes adsStatsViewsTimes = this.viewsTimes;
        return iHashCode3 + (adsStatsViewsTimes != null ? adsStatsViewsTimes.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsStats(id=" + this.f15122id + ", stats=" + this.stats + ", type=" + this.type + ", viewsTimes=" + this.viewsTimes + ")";
    }

    public AdsStats(@Nullable Integer num, @Nullable AdsStatsFormat adsStatsFormat, @Nullable AdsObjectType adsObjectType, @Nullable AdsStatsViewsTimes adsStatsViewsTimes) {
        this.f15122id = num;
        this.stats = adsStatsFormat;
        this.type = adsObjectType;
        this.viewsTimes = adsStatsViewsTimes;
    }

    public /* synthetic */ AdsStats(Integer num, AdsStatsFormat adsStatsFormat, AdsObjectType adsObjectType, AdsStatsViewsTimes adsStatsViewsTimes, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : adsStatsFormat, (i & 4) != 0 ? null : adsObjectType, (i & 8) != 0 ? null : adsStatsViewsTimes);
    }
}
