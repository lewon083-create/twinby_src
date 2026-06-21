package com.vk.sdk.api.ads.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import gf.a;
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
public final class AdsStatsViewsTimes {

    @b("views_ads_times_1")
    @Nullable
    private final Integer viewsAdsTimes1;

    @b("views_ads_times_10")
    @Nullable
    private final Integer viewsAdsTimes10;

    @b("views_ads_times_11_plus")
    @Nullable
    private final Integer viewsAdsTimes11Plus;

    @b("views_ads_times_2")
    @Nullable
    private final Integer viewsAdsTimes2;

    @b("views_ads_times_3")
    @Nullable
    private final Integer viewsAdsTimes3;

    @b("views_ads_times_4")
    @Nullable
    private final Integer viewsAdsTimes4;

    @b("views_ads_times_5")
    @Nullable
    private final String viewsAdsTimes5;

    @b("views_ads_times_6")
    @Nullable
    private final Integer viewsAdsTimes6;

    @b("views_ads_times_7")
    @Nullable
    private final Integer viewsAdsTimes7;

    @b("views_ads_times_8")
    @Nullable
    private final Integer viewsAdsTimes8;

    @b("views_ads_times_9")
    @Nullable
    private final Integer viewsAdsTimes9;

    public AdsStatsViewsTimes() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ AdsStatsViewsTimes copy$default(AdsStatsViewsTimes adsStatsViewsTimes, Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, int i, Object obj) {
        if ((i & 1) != 0) {
            num = adsStatsViewsTimes.viewsAdsTimes1;
        }
        if ((i & 2) != 0) {
            num2 = adsStatsViewsTimes.viewsAdsTimes2;
        }
        if ((i & 4) != 0) {
            num3 = adsStatsViewsTimes.viewsAdsTimes3;
        }
        if ((i & 8) != 0) {
            num4 = adsStatsViewsTimes.viewsAdsTimes4;
        }
        if ((i & 16) != 0) {
            str = adsStatsViewsTimes.viewsAdsTimes5;
        }
        if ((i & 32) != 0) {
            num5 = adsStatsViewsTimes.viewsAdsTimes6;
        }
        if ((i & 64) != 0) {
            num6 = adsStatsViewsTimes.viewsAdsTimes7;
        }
        if ((i & 128) != 0) {
            num7 = adsStatsViewsTimes.viewsAdsTimes8;
        }
        if ((i & 256) != 0) {
            num8 = adsStatsViewsTimes.viewsAdsTimes9;
        }
        if ((i & 512) != 0) {
            num9 = adsStatsViewsTimes.viewsAdsTimes10;
        }
        if ((i & 1024) != 0) {
            num10 = adsStatsViewsTimes.viewsAdsTimes11Plus;
        }
        Integer num11 = num9;
        Integer num12 = num10;
        Integer num13 = num7;
        Integer num14 = num8;
        Integer num15 = num5;
        Integer num16 = num6;
        String str2 = str;
        Integer num17 = num3;
        return adsStatsViewsTimes.copy(num, num2, num17, num4, str2, num15, num16, num13, num14, num11, num12);
    }

    @Nullable
    public final Integer component1() {
        return this.viewsAdsTimes1;
    }

    @Nullable
    public final Integer component10() {
        return this.viewsAdsTimes10;
    }

    @Nullable
    public final Integer component11() {
        return this.viewsAdsTimes11Plus;
    }

    @Nullable
    public final Integer component2() {
        return this.viewsAdsTimes2;
    }

    @Nullable
    public final Integer component3() {
        return this.viewsAdsTimes3;
    }

    @Nullable
    public final Integer component4() {
        return this.viewsAdsTimes4;
    }

    @Nullable
    public final String component5() {
        return this.viewsAdsTimes5;
    }

    @Nullable
    public final Integer component6() {
        return this.viewsAdsTimes6;
    }

    @Nullable
    public final Integer component7() {
        return this.viewsAdsTimes7;
    }

    @Nullable
    public final Integer component8() {
        return this.viewsAdsTimes8;
    }

    @Nullable
    public final Integer component9() {
        return this.viewsAdsTimes9;
    }

    @NotNull
    public final AdsStatsViewsTimes copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10) {
        return new AdsStatsViewsTimes(num, num2, num3, num4, str, num5, num6, num7, num8, num9, num10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsViewsTimes)) {
            return false;
        }
        AdsStatsViewsTimes adsStatsViewsTimes = (AdsStatsViewsTimes) obj;
        return Intrinsics.a(this.viewsAdsTimes1, adsStatsViewsTimes.viewsAdsTimes1) && Intrinsics.a(this.viewsAdsTimes2, adsStatsViewsTimes.viewsAdsTimes2) && Intrinsics.a(this.viewsAdsTimes3, adsStatsViewsTimes.viewsAdsTimes3) && Intrinsics.a(this.viewsAdsTimes4, adsStatsViewsTimes.viewsAdsTimes4) && Intrinsics.a(this.viewsAdsTimes5, adsStatsViewsTimes.viewsAdsTimes5) && Intrinsics.a(this.viewsAdsTimes6, adsStatsViewsTimes.viewsAdsTimes6) && Intrinsics.a(this.viewsAdsTimes7, adsStatsViewsTimes.viewsAdsTimes7) && Intrinsics.a(this.viewsAdsTimes8, adsStatsViewsTimes.viewsAdsTimes8) && Intrinsics.a(this.viewsAdsTimes9, adsStatsViewsTimes.viewsAdsTimes9) && Intrinsics.a(this.viewsAdsTimes10, adsStatsViewsTimes.viewsAdsTimes10) && Intrinsics.a(this.viewsAdsTimes11Plus, adsStatsViewsTimes.viewsAdsTimes11Plus);
    }

    @Nullable
    public final Integer getViewsAdsTimes1() {
        return this.viewsAdsTimes1;
    }

    @Nullable
    public final Integer getViewsAdsTimes10() {
        return this.viewsAdsTimes10;
    }

    @Nullable
    public final Integer getViewsAdsTimes11Plus() {
        return this.viewsAdsTimes11Plus;
    }

    @Nullable
    public final Integer getViewsAdsTimes2() {
        return this.viewsAdsTimes2;
    }

    @Nullable
    public final Integer getViewsAdsTimes3() {
        return this.viewsAdsTimes3;
    }

    @Nullable
    public final Integer getViewsAdsTimes4() {
        return this.viewsAdsTimes4;
    }

    @Nullable
    public final String getViewsAdsTimes5() {
        return this.viewsAdsTimes5;
    }

    @Nullable
    public final Integer getViewsAdsTimes6() {
        return this.viewsAdsTimes6;
    }

    @Nullable
    public final Integer getViewsAdsTimes7() {
        return this.viewsAdsTimes7;
    }

    @Nullable
    public final Integer getViewsAdsTimes8() {
        return this.viewsAdsTimes8;
    }

    @Nullable
    public final Integer getViewsAdsTimes9() {
        return this.viewsAdsTimes9;
    }

    public int hashCode() {
        Integer num = this.viewsAdsTimes1;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.viewsAdsTimes2;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.viewsAdsTimes3;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.viewsAdsTimes4;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.viewsAdsTimes5;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.viewsAdsTimes6;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.viewsAdsTimes7;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.viewsAdsTimes8;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.viewsAdsTimes9;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.viewsAdsTimes10;
        int iHashCode10 = (iHashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.viewsAdsTimes11Plus;
        return iHashCode10 + (num10 != null ? num10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.viewsAdsTimes1;
        Integer num2 = this.viewsAdsTimes2;
        Integer num3 = this.viewsAdsTimes3;
        Integer num4 = this.viewsAdsTimes4;
        String str = this.viewsAdsTimes5;
        Integer num5 = this.viewsAdsTimes6;
        Integer num6 = this.viewsAdsTimes7;
        Integer num7 = this.viewsAdsTimes8;
        Integer num8 = this.viewsAdsTimes9;
        Integer num9 = this.viewsAdsTimes10;
        Integer num10 = this.viewsAdsTimes11Plus;
        StringBuilder sbO = om1.o("AdsStatsViewsTimes(viewsAdsTimes1=", ", viewsAdsTimes2=", num, num2, ", viewsAdsTimes3=");
        a.t(sbO, num3, ", viewsAdsTimes4=", num4, ", viewsAdsTimes5=");
        a.r(num5, str, ", viewsAdsTimes6=", ", viewsAdsTimes7=", sbO);
        a.t(sbO, num6, ", viewsAdsTimes8=", num7, ", viewsAdsTimes9=");
        a.t(sbO, num8, ", viewsAdsTimes10=", num9, ", viewsAdsTimes11Plus=");
        return u.m(sbO, num10, ")");
    }

    public AdsStatsViewsTimes(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10) {
        this.viewsAdsTimes1 = num;
        this.viewsAdsTimes2 = num2;
        this.viewsAdsTimes3 = num3;
        this.viewsAdsTimes4 = num4;
        this.viewsAdsTimes5 = str;
        this.viewsAdsTimes6 = num5;
        this.viewsAdsTimes7 = num6;
        this.viewsAdsTimes8 = num7;
        this.viewsAdsTimes9 = num8;
        this.viewsAdsTimes10 = num9;
        this.viewsAdsTimes11Plus = num10;
    }

    public /* synthetic */ AdsStatsViewsTimes(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? null : num7, (i & 256) != 0 ? null : num8, (i & 512) != 0 ? null : num9, (i & 1024) != 0 ? null : num10);
    }
}
