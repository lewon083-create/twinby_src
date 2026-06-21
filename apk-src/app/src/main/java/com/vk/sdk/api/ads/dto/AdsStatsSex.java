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
public final class AdsStatsSex {

    @b("clicks_rate")
    @Nullable
    private final Float clicksRate;

    @b("impressions_rate")
    @Nullable
    private final Float impressionsRate;

    @b("value")
    @Nullable
    private final AdsStatsSexValue value;

    public AdsStatsSex() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AdsStatsSex copy$default(AdsStatsSex adsStatsSex, Float f10, Float f11, AdsStatsSexValue adsStatsSexValue, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = adsStatsSex.clicksRate;
        }
        if ((i & 2) != 0) {
            f11 = adsStatsSex.impressionsRate;
        }
        if ((i & 4) != 0) {
            adsStatsSexValue = adsStatsSex.value;
        }
        return adsStatsSex.copy(f10, f11, adsStatsSexValue);
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
    public final AdsStatsSexValue component3() {
        return this.value;
    }

    @NotNull
    public final AdsStatsSex copy(@Nullable Float f10, @Nullable Float f11, @Nullable AdsStatsSexValue adsStatsSexValue) {
        return new AdsStatsSex(f10, f11, adsStatsSexValue);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsSex)) {
            return false;
        }
        AdsStatsSex adsStatsSex = (AdsStatsSex) obj;
        return Intrinsics.a(this.clicksRate, adsStatsSex.clicksRate) && Intrinsics.a(this.impressionsRate, adsStatsSex.impressionsRate) && this.value == adsStatsSex.value;
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
    public final AdsStatsSexValue getValue() {
        return this.value;
    }

    public int hashCode() {
        Float f10 = this.clicksRate;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        Float f11 = this.impressionsRate;
        int iHashCode2 = (iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31;
        AdsStatsSexValue adsStatsSexValue = this.value;
        return iHashCode2 + (adsStatsSexValue != null ? adsStatsSexValue.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsStatsSex(clicksRate=" + this.clicksRate + ", impressionsRate=" + this.impressionsRate + ", value=" + this.value + ")";
    }

    public AdsStatsSex(@Nullable Float f10, @Nullable Float f11, @Nullable AdsStatsSexValue adsStatsSexValue) {
        this.clicksRate = f10;
        this.impressionsRate = f11;
        this.value = adsStatsSexValue;
    }

    public /* synthetic */ AdsStatsSex(Float f10, Float f11, AdsStatsSexValue adsStatsSexValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f10, (i & 2) != 0 ? null : f11, (i & 4) != 0 ? null : adsStatsSexValue);
    }
}
