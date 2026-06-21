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
public final class AdsDemoStats {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15117id;

    @b("stats")
    @Nullable
    private final AdsDemostatsFormat stats;

    @b("type")
    @Nullable
    private final AdsObjectType type;

    public AdsDemoStats() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AdsDemoStats copy$default(AdsDemoStats adsDemoStats, Integer num, AdsDemostatsFormat adsDemostatsFormat, AdsObjectType adsObjectType, int i, Object obj) {
        if ((i & 1) != 0) {
            num = adsDemoStats.f15117id;
        }
        if ((i & 2) != 0) {
            adsDemostatsFormat = adsDemoStats.stats;
        }
        if ((i & 4) != 0) {
            adsObjectType = adsDemoStats.type;
        }
        return adsDemoStats.copy(num, adsDemostatsFormat, adsObjectType);
    }

    @Nullable
    public final Integer component1() {
        return this.f15117id;
    }

    @Nullable
    public final AdsDemostatsFormat component2() {
        return this.stats;
    }

    @Nullable
    public final AdsObjectType component3() {
        return this.type;
    }

    @NotNull
    public final AdsDemoStats copy(@Nullable Integer num, @Nullable AdsDemostatsFormat adsDemostatsFormat, @Nullable AdsObjectType adsObjectType) {
        return new AdsDemoStats(num, adsDemostatsFormat, adsObjectType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsDemoStats)) {
            return false;
        }
        AdsDemoStats adsDemoStats = (AdsDemoStats) obj;
        return Intrinsics.a(this.f15117id, adsDemoStats.f15117id) && Intrinsics.a(this.stats, adsDemoStats.stats) && this.type == adsDemoStats.type;
    }

    @Nullable
    public final Integer getId() {
        return this.f15117id;
    }

    @Nullable
    public final AdsDemostatsFormat getStats() {
        return this.stats;
    }

    @Nullable
    public final AdsObjectType getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.f15117id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        AdsDemostatsFormat adsDemostatsFormat = this.stats;
        int iHashCode2 = (iHashCode + (adsDemostatsFormat == null ? 0 : adsDemostatsFormat.hashCode())) * 31;
        AdsObjectType adsObjectType = this.type;
        return iHashCode2 + (adsObjectType != null ? adsObjectType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsDemoStats(id=" + this.f15117id + ", stats=" + this.stats + ", type=" + this.type + ")";
    }

    public AdsDemoStats(@Nullable Integer num, @Nullable AdsDemostatsFormat adsDemostatsFormat, @Nullable AdsObjectType adsObjectType) {
        this.f15117id = num;
        this.stats = adsDemostatsFormat;
        this.type = adsObjectType;
    }

    public /* synthetic */ AdsDemoStats(Integer num, AdsDemostatsFormat adsDemostatsFormat, AdsObjectType adsObjectType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : adsDemostatsFormat, (i & 4) != 0 ? null : adsObjectType);
    }
}
