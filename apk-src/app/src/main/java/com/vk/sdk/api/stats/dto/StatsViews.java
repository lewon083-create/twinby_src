package com.vk.sdk.api.stats.dto;

import gf.a;
import java.util.List;
import kotlin.KotlinVersion;
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
public final class StatsViews {

    @b("age")
    @Nullable
    private final List<StatsSexAge> age;

    @b("cities")
    @Nullable
    private final List<StatsCity> cities;

    @b("countries")
    @Nullable
    private final List<StatsCountry> countries;

    @b("mobile_views")
    @Nullable
    private final Integer mobileViews;

    @b("sex")
    @Nullable
    private final List<StatsSexAge> sex;

    @b("sex_age")
    @Nullable
    private final List<StatsSexAge> sexAge;

    @b("views")
    @Nullable
    private final Integer views;

    @b("visitors")
    @Nullable
    private final Integer visitors;

    public StatsViews() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsViews copy$default(StatsViews statsViews, List list, List list2, List list3, Integer num, List list4, List list5, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = statsViews.age;
        }
        if ((i & 2) != 0) {
            list2 = statsViews.cities;
        }
        if ((i & 4) != 0) {
            list3 = statsViews.countries;
        }
        if ((i & 8) != 0) {
            num = statsViews.mobileViews;
        }
        if ((i & 16) != 0) {
            list4 = statsViews.sex;
        }
        if ((i & 32) != 0) {
            list5 = statsViews.sexAge;
        }
        if ((i & 64) != 0) {
            num2 = statsViews.views;
        }
        if ((i & 128) != 0) {
            num3 = statsViews.visitors;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        List list6 = list4;
        List list7 = list5;
        return statsViews.copy(list, list2, list3, num, list6, list7, num4, num5);
    }

    @Nullable
    public final List<StatsSexAge> component1() {
        return this.age;
    }

    @Nullable
    public final List<StatsCity> component2() {
        return this.cities;
    }

    @Nullable
    public final List<StatsCountry> component3() {
        return this.countries;
    }

    @Nullable
    public final Integer component4() {
        return this.mobileViews;
    }

    @Nullable
    public final List<StatsSexAge> component5() {
        return this.sex;
    }

    @Nullable
    public final List<StatsSexAge> component6() {
        return this.sexAge;
    }

    @Nullable
    public final Integer component7() {
        return this.views;
    }

    @Nullable
    public final Integer component8() {
        return this.visitors;
    }

    @NotNull
    public final StatsViews copy(@Nullable List<StatsSexAge> list, @Nullable List<StatsCity> list2, @Nullable List<StatsCountry> list3, @Nullable Integer num, @Nullable List<StatsSexAge> list4, @Nullable List<StatsSexAge> list5, @Nullable Integer num2, @Nullable Integer num3) {
        return new StatsViews(list, list2, list3, num, list4, list5, num2, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsViews)) {
            return false;
        }
        StatsViews statsViews = (StatsViews) obj;
        return Intrinsics.a(this.age, statsViews.age) && Intrinsics.a(this.cities, statsViews.cities) && Intrinsics.a(this.countries, statsViews.countries) && Intrinsics.a(this.mobileViews, statsViews.mobileViews) && Intrinsics.a(this.sex, statsViews.sex) && Intrinsics.a(this.sexAge, statsViews.sexAge) && Intrinsics.a(this.views, statsViews.views) && Intrinsics.a(this.visitors, statsViews.visitors);
    }

    @Nullable
    public final List<StatsSexAge> getAge() {
        return this.age;
    }

    @Nullable
    public final List<StatsCity> getCities() {
        return this.cities;
    }

    @Nullable
    public final List<StatsCountry> getCountries() {
        return this.countries;
    }

    @Nullable
    public final Integer getMobileViews() {
        return this.mobileViews;
    }

    @Nullable
    public final List<StatsSexAge> getSex() {
        return this.sex;
    }

    @Nullable
    public final List<StatsSexAge> getSexAge() {
        return this.sexAge;
    }

    @Nullable
    public final Integer getViews() {
        return this.views;
    }

    @Nullable
    public final Integer getVisitors() {
        return this.visitors;
    }

    public int hashCode() {
        List<StatsSexAge> list = this.age;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StatsCity> list2 = this.cities;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StatsCountry> list3 = this.countries;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.mobileViews;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<StatsSexAge> list4 = this.sex;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<StatsSexAge> list5 = this.sexAge;
        int iHashCode6 = (iHashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num2 = this.views;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.visitors;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<StatsSexAge> list = this.age;
        List<StatsCity> list2 = this.cities;
        List<StatsCountry> list3 = this.countries;
        Integer num = this.mobileViews;
        List<StatsSexAge> list4 = this.sex;
        List<StatsSexAge> list5 = this.sexAge;
        Integer num2 = this.views;
        Integer num3 = this.visitors;
        StringBuilder sb2 = new StringBuilder("StatsViews(age=");
        sb2.append(list);
        sb2.append(", cities=");
        sb2.append(list2);
        sb2.append(", countries=");
        sb2.append(list3);
        sb2.append(", mobileViews=");
        sb2.append(num);
        sb2.append(", sex=");
        a.u(sb2, list4, ", sexAge=", list5, ", views=");
        sb2.append(num2);
        sb2.append(", visitors=");
        sb2.append(num3);
        sb2.append(")");
        return sb2.toString();
    }

    public StatsViews(@Nullable List<StatsSexAge> list, @Nullable List<StatsCity> list2, @Nullable List<StatsCountry> list3, @Nullable Integer num, @Nullable List<StatsSexAge> list4, @Nullable List<StatsSexAge> list5, @Nullable Integer num2, @Nullable Integer num3) {
        this.age = list;
        this.cities = list2;
        this.countries = list3;
        this.mobileViews = num;
        this.sex = list4;
        this.sexAge = list5;
        this.views = num2;
        this.visitors = num3;
    }

    public /* synthetic */ StatsViews(List list, List list2, List list3, Integer num, List list4, List list5, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3);
    }
}
