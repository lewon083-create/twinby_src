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
public final class StatsReach {

    @b("age")
    @Nullable
    private final List<StatsSexAge> age;

    @b("cities")
    @Nullable
    private final List<StatsCity> cities;

    @b("countries")
    @Nullable
    private final List<StatsCountry> countries;

    @b("mobile_reach")
    @Nullable
    private final Integer mobileReach;

    @b("reach")
    @Nullable
    private final Integer reach;

    @b("reach_subscribers")
    @Nullable
    private final Integer reachSubscribers;

    @b("sex")
    @Nullable
    private final List<StatsSexAge> sex;

    @b("sex_age")
    @Nullable
    private final List<StatsSexAge> sexAge;

    public StatsReach() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsReach copy$default(StatsReach statsReach, List list, List list2, List list3, Integer num, Integer num2, Integer num3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = statsReach.age;
        }
        if ((i & 2) != 0) {
            list2 = statsReach.cities;
        }
        if ((i & 4) != 0) {
            list3 = statsReach.countries;
        }
        if ((i & 8) != 0) {
            num = statsReach.mobileReach;
        }
        if ((i & 16) != 0) {
            num2 = statsReach.reach;
        }
        if ((i & 32) != 0) {
            num3 = statsReach.reachSubscribers;
        }
        if ((i & 64) != 0) {
            list4 = statsReach.sex;
        }
        if ((i & 128) != 0) {
            list5 = statsReach.sexAge;
        }
        List list6 = list4;
        List list7 = list5;
        Integer num4 = num2;
        Integer num5 = num3;
        return statsReach.copy(list, list2, list3, num, num4, num5, list6, list7);
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
        return this.mobileReach;
    }

    @Nullable
    public final Integer component5() {
        return this.reach;
    }

    @Nullable
    public final Integer component6() {
        return this.reachSubscribers;
    }

    @Nullable
    public final List<StatsSexAge> component7() {
        return this.sex;
    }

    @Nullable
    public final List<StatsSexAge> component8() {
        return this.sexAge;
    }

    @NotNull
    public final StatsReach copy(@Nullable List<StatsSexAge> list, @Nullable List<StatsCity> list2, @Nullable List<StatsCountry> list3, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<StatsSexAge> list4, @Nullable List<StatsSexAge> list5) {
        return new StatsReach(list, list2, list3, num, num2, num3, list4, list5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsReach)) {
            return false;
        }
        StatsReach statsReach = (StatsReach) obj;
        return Intrinsics.a(this.age, statsReach.age) && Intrinsics.a(this.cities, statsReach.cities) && Intrinsics.a(this.countries, statsReach.countries) && Intrinsics.a(this.mobileReach, statsReach.mobileReach) && Intrinsics.a(this.reach, statsReach.reach) && Intrinsics.a(this.reachSubscribers, statsReach.reachSubscribers) && Intrinsics.a(this.sex, statsReach.sex) && Intrinsics.a(this.sexAge, statsReach.sexAge);
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
    public final Integer getMobileReach() {
        return this.mobileReach;
    }

    @Nullable
    public final Integer getReach() {
        return this.reach;
    }

    @Nullable
    public final Integer getReachSubscribers() {
        return this.reachSubscribers;
    }

    @Nullable
    public final List<StatsSexAge> getSex() {
        return this.sex;
    }

    @Nullable
    public final List<StatsSexAge> getSexAge() {
        return this.sexAge;
    }

    public int hashCode() {
        List<StatsSexAge> list = this.age;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StatsCity> list2 = this.cities;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StatsCountry> list3 = this.countries;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.mobileReach;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reach;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.reachSubscribers;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<StatsSexAge> list4 = this.sex;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<StatsSexAge> list5 = this.sexAge;
        return iHashCode7 + (list5 != null ? list5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<StatsSexAge> list = this.age;
        List<StatsCity> list2 = this.cities;
        List<StatsCountry> list3 = this.countries;
        Integer num = this.mobileReach;
        Integer num2 = this.reach;
        Integer num3 = this.reachSubscribers;
        List<StatsSexAge> list4 = this.sex;
        List<StatsSexAge> list5 = this.sexAge;
        StringBuilder sb2 = new StringBuilder("StatsReach(age=");
        sb2.append(list);
        sb2.append(", cities=");
        sb2.append(list2);
        sb2.append(", countries=");
        sb2.append(list3);
        sb2.append(", mobileReach=");
        sb2.append(num);
        sb2.append(", reach=");
        a.t(sb2, num2, ", reachSubscribers=", num3, ", sex=");
        return a.l(sb2, list4, ", sexAge=", list5, ")");
    }

    public StatsReach(@Nullable List<StatsSexAge> list, @Nullable List<StatsCity> list2, @Nullable List<StatsCountry> list3, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<StatsSexAge> list4, @Nullable List<StatsSexAge> list5) {
        this.age = list;
        this.cities = list2;
        this.countries = list3;
        this.mobileReach = num;
        this.reach = num2;
        this.reachSubscribers = num3;
        this.sex = list4;
        this.sexAge = list5;
    }

    public /* synthetic */ StatsReach(List list, List list2, List list3, Integer num, Integer num2, Integer num3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : list5);
    }
}
