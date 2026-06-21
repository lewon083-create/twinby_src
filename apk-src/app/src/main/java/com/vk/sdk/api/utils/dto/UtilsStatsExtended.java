package com.vk.sdk.api.utils.dto;

import a0.u;
import java.util.List;
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
public final class UtilsStatsExtended {

    @b("cities")
    @Nullable
    private final List<UtilsStatsCity> cities;

    @b("countries")
    @Nullable
    private final List<UtilsStatsCountry> countries;

    @b("sex_age")
    @Nullable
    private final List<UtilsStatsSexAge> sexAge;

    @b("timestamp")
    @Nullable
    private final Integer timestamp;

    @b("views")
    @Nullable
    private final Integer views;

    public UtilsStatsExtended() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtilsStatsExtended copy$default(UtilsStatsExtended utilsStatsExtended, List list, List list2, List list3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = utilsStatsExtended.cities;
        }
        if ((i & 2) != 0) {
            list2 = utilsStatsExtended.countries;
        }
        if ((i & 4) != 0) {
            list3 = utilsStatsExtended.sexAge;
        }
        if ((i & 8) != 0) {
            num = utilsStatsExtended.timestamp;
        }
        if ((i & 16) != 0) {
            num2 = utilsStatsExtended.views;
        }
        Integer num3 = num2;
        List list4 = list3;
        return utilsStatsExtended.copy(list, list2, list4, num, num3);
    }

    @Nullable
    public final List<UtilsStatsCity> component1() {
        return this.cities;
    }

    @Nullable
    public final List<UtilsStatsCountry> component2() {
        return this.countries;
    }

    @Nullable
    public final List<UtilsStatsSexAge> component3() {
        return this.sexAge;
    }

    @Nullable
    public final Integer component4() {
        return this.timestamp;
    }

    @Nullable
    public final Integer component5() {
        return this.views;
    }

    @NotNull
    public final UtilsStatsExtended copy(@Nullable List<UtilsStatsCity> list, @Nullable List<UtilsStatsCountry> list2, @Nullable List<UtilsStatsSexAge> list3, @Nullable Integer num, @Nullable Integer num2) {
        return new UtilsStatsExtended(list, list2, list3, num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsStatsExtended)) {
            return false;
        }
        UtilsStatsExtended utilsStatsExtended = (UtilsStatsExtended) obj;
        return Intrinsics.a(this.cities, utilsStatsExtended.cities) && Intrinsics.a(this.countries, utilsStatsExtended.countries) && Intrinsics.a(this.sexAge, utilsStatsExtended.sexAge) && Intrinsics.a(this.timestamp, utilsStatsExtended.timestamp) && Intrinsics.a(this.views, utilsStatsExtended.views);
    }

    @Nullable
    public final List<UtilsStatsCity> getCities() {
        return this.cities;
    }

    @Nullable
    public final List<UtilsStatsCountry> getCountries() {
        return this.countries;
    }

    @Nullable
    public final List<UtilsStatsSexAge> getSexAge() {
        return this.sexAge;
    }

    @Nullable
    public final Integer getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Integer getViews() {
        return this.views;
    }

    public int hashCode() {
        List<UtilsStatsCity> list = this.cities;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UtilsStatsCountry> list2 = this.countries;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UtilsStatsSexAge> list3 = this.sexAge;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.timestamp;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.views;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<UtilsStatsCity> list = this.cities;
        List<UtilsStatsCountry> list2 = this.countries;
        List<UtilsStatsSexAge> list3 = this.sexAge;
        Integer num = this.timestamp;
        Integer num2 = this.views;
        StringBuilder sb2 = new StringBuilder("UtilsStatsExtended(cities=");
        sb2.append(list);
        sb2.append(", countries=");
        sb2.append(list2);
        sb2.append(", sexAge=");
        sb2.append(list3);
        sb2.append(", timestamp=");
        sb2.append(num);
        sb2.append(", views=");
        return u.m(sb2, num2, ")");
    }

    public UtilsStatsExtended(@Nullable List<UtilsStatsCity> list, @Nullable List<UtilsStatsCountry> list2, @Nullable List<UtilsStatsSexAge> list3, @Nullable Integer num, @Nullable Integer num2) {
        this.cities = list;
        this.countries = list2;
        this.sexAge = list3;
        this.timestamp = num;
        this.views = num2;
    }

    public /* synthetic */ UtilsStatsExtended(List list, List list2, List list3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
