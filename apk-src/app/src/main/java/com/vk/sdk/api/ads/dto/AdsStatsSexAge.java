package com.vk.sdk.api.ads.dto;

import a0.u;
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
public final class AdsStatsSexAge {

    @b("clicks_rate")
    @Nullable
    private final Float clicksRate;

    @b("impressions_rate")
    @Nullable
    private final Float impressionsRate;

    @b("value")
    @Nullable
    private final String value;

    public AdsStatsSexAge() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AdsStatsSexAge copy$default(AdsStatsSexAge adsStatsSexAge, Float f10, Float f11, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = adsStatsSexAge.clicksRate;
        }
        if ((i & 2) != 0) {
            f11 = adsStatsSexAge.impressionsRate;
        }
        if ((i & 4) != 0) {
            str = adsStatsSexAge.value;
        }
        return adsStatsSexAge.copy(f10, f11, str);
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
        return this.value;
    }

    @NotNull
    public final AdsStatsSexAge copy(@Nullable Float f10, @Nullable Float f11, @Nullable String str) {
        return new AdsStatsSexAge(f10, f11, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsSexAge)) {
            return false;
        }
        AdsStatsSexAge adsStatsSexAge = (AdsStatsSexAge) obj;
        return Intrinsics.a(this.clicksRate, adsStatsSexAge.clicksRate) && Intrinsics.a(this.impressionsRate, adsStatsSexAge.impressionsRate) && Intrinsics.a(this.value, adsStatsSexAge.value);
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
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        Float f10 = this.clicksRate;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        Float f11 = this.impressionsRate;
        int iHashCode2 = (iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str = this.value;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Float f10 = this.clicksRate;
        Float f11 = this.impressionsRate;
        String str = this.value;
        StringBuilder sb2 = new StringBuilder("AdsStatsSexAge(clicksRate=");
        sb2.append(f10);
        sb2.append(", impressionsRate=");
        sb2.append(f11);
        sb2.append(", value=");
        return u.o(sb2, str, ")");
    }

    public AdsStatsSexAge(@Nullable Float f10, @Nullable Float f11, @Nullable String str) {
        this.clicksRate = f10;
        this.impressionsRate = f11;
        this.value = str;
    }

    public /* synthetic */ AdsStatsSexAge(Float f10, Float f11, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f10, (i & 2) != 0 ? null : f11, (i & 4) != 0 ? null : str);
    }
}
