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
public final class AdsStatsCities {

    @b("clicks_rate")
    @Nullable
    private final Float clicksRate;

    @b("impressions_rate")
    @Nullable
    private final Float impressionsRate;

    @b("name")
    @Nullable
    private final String name;

    @b("value")
    @Nullable
    private final Integer value;

    public AdsStatsCities() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AdsStatsCities copy$default(AdsStatsCities adsStatsCities, Float f10, Float f11, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = adsStatsCities.clicksRate;
        }
        if ((i & 2) != 0) {
            f11 = adsStatsCities.impressionsRate;
        }
        if ((i & 4) != 0) {
            str = adsStatsCities.name;
        }
        if ((i & 8) != 0) {
            num = adsStatsCities.value;
        }
        return adsStatsCities.copy(f10, f11, str, num);
    }

    @Nullable
    public final Float component1() {
        return this.clicksRate;
    }

    @Nullable
    public final Float component2() {
        return this.impressionsRate;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final Integer component4() {
        return this.value;
    }

    @NotNull
    public final AdsStatsCities copy(@Nullable Float f10, @Nullable Float f11, @Nullable String str, @Nullable Integer num) {
        return new AdsStatsCities(f10, f11, str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsCities)) {
            return false;
        }
        AdsStatsCities adsStatsCities = (AdsStatsCities) obj;
        return Intrinsics.a(this.clicksRate, adsStatsCities.clicksRate) && Intrinsics.a(this.impressionsRate, adsStatsCities.impressionsRate) && Intrinsics.a(this.name, adsStatsCities.name) && Intrinsics.a(this.value, adsStatsCities.value);
    }

    @Nullable
    public final Float getClicksRate() {
        return this.clicksRate;
    }

    @Nullable
    public final Float getImpressionsRate() {
        return this.impressionsRate;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        Float f10 = this.clicksRate;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        Float f11 = this.impressionsRate;
        int iHashCode2 = (iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.value;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsStatsCities(clicksRate=" + this.clicksRate + ", impressionsRate=" + this.impressionsRate + ", name=" + this.name + ", value=" + this.value + ")";
    }

    public AdsStatsCities(@Nullable Float f10, @Nullable Float f11, @Nullable String str, @Nullable Integer num) {
        this.clicksRate = f10;
        this.impressionsRate = f11;
        this.name = str;
        this.value = num;
    }

    public /* synthetic */ AdsStatsCities(Float f10, Float f11, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f10, (i & 2) != 0 ? null : f11, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num);
    }
}
