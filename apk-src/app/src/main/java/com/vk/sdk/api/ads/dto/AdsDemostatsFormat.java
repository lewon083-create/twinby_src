package com.vk.sdk.api.ads.dto;

import io.sentry.metrics.MetricsUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class AdsDemostatsFormat {

    @b("age")
    @Nullable
    private final List<AdsStatsAge> age;

    @b("cities")
    @Nullable
    private final List<AdsStatsCities> cities;

    @b(MetricsUnit.Duration.DAY)
    @Nullable
    private final String day;

    @b("month")
    @Nullable
    private final String month;

    @b("overall")
    @Nullable
    private final Integer overall;

    @b("sex")
    @Nullable
    private final List<AdsStatsSex> sex;

    @b("sex_age")
    @Nullable
    private final List<AdsStatsSexAge> sexAge;

    public AdsDemostatsFormat() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdsDemostatsFormat copy$default(AdsDemostatsFormat adsDemostatsFormat, List list, List list2, String str, String str2, Integer num, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adsDemostatsFormat.age;
        }
        if ((i & 2) != 0) {
            list2 = adsDemostatsFormat.cities;
        }
        if ((i & 4) != 0) {
            str = adsDemostatsFormat.day;
        }
        if ((i & 8) != 0) {
            str2 = adsDemostatsFormat.month;
        }
        if ((i & 16) != 0) {
            num = adsDemostatsFormat.overall;
        }
        if ((i & 32) != 0) {
            list3 = adsDemostatsFormat.sex;
        }
        if ((i & 64) != 0) {
            list4 = adsDemostatsFormat.sexAge;
        }
        List list5 = list3;
        List list6 = list4;
        Integer num2 = num;
        String str3 = str;
        return adsDemostatsFormat.copy(list, list2, str3, str2, num2, list5, list6);
    }

    @Nullable
    public final List<AdsStatsAge> component1() {
        return this.age;
    }

    @Nullable
    public final List<AdsStatsCities> component2() {
        return this.cities;
    }

    @Nullable
    public final String component3() {
        return this.day;
    }

    @Nullable
    public final String component4() {
        return this.month;
    }

    @Nullable
    public final Integer component5() {
        return this.overall;
    }

    @Nullable
    public final List<AdsStatsSex> component6() {
        return this.sex;
    }

    @Nullable
    public final List<AdsStatsSexAge> component7() {
        return this.sexAge;
    }

    @NotNull
    public final AdsDemostatsFormat copy(@Nullable List<AdsStatsAge> list, @Nullable List<AdsStatsCities> list2, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable List<AdsStatsSex> list3, @Nullable List<AdsStatsSexAge> list4) {
        return new AdsDemostatsFormat(list, list2, str, str2, num, list3, list4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsDemostatsFormat)) {
            return false;
        }
        AdsDemostatsFormat adsDemostatsFormat = (AdsDemostatsFormat) obj;
        return Intrinsics.a(this.age, adsDemostatsFormat.age) && Intrinsics.a(this.cities, adsDemostatsFormat.cities) && Intrinsics.a(this.day, adsDemostatsFormat.day) && Intrinsics.a(this.month, adsDemostatsFormat.month) && Intrinsics.a(this.overall, adsDemostatsFormat.overall) && Intrinsics.a(this.sex, adsDemostatsFormat.sex) && Intrinsics.a(this.sexAge, adsDemostatsFormat.sexAge);
    }

    @Nullable
    public final List<AdsStatsAge> getAge() {
        return this.age;
    }

    @Nullable
    public final List<AdsStatsCities> getCities() {
        return this.cities;
    }

    @Nullable
    public final String getDay() {
        return this.day;
    }

    @Nullable
    public final String getMonth() {
        return this.month;
    }

    @Nullable
    public final Integer getOverall() {
        return this.overall;
    }

    @Nullable
    public final List<AdsStatsSex> getSex() {
        return this.sex;
    }

    @Nullable
    public final List<AdsStatsSexAge> getSexAge() {
        return this.sexAge;
    }

    public int hashCode() {
        List<AdsStatsAge> list = this.age;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AdsStatsCities> list2 = this.cities;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.day;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.month;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.overall;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<AdsStatsSex> list3 = this.sex;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AdsStatsSexAge> list4 = this.sexAge;
        return iHashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<AdsStatsAge> list = this.age;
        List<AdsStatsCities> list2 = this.cities;
        String str = this.day;
        String str2 = this.month;
        Integer num = this.overall;
        List<AdsStatsSex> list3 = this.sex;
        List<AdsStatsSexAge> list4 = this.sexAge;
        StringBuilder sb2 = new StringBuilder("AdsDemostatsFormat(age=");
        sb2.append(list);
        sb2.append(", cities=");
        sb2.append(list2);
        sb2.append(", day=");
        o.t(sb2, str, ", month=", str2, ", overall=");
        sb2.append(num);
        sb2.append(", sex=");
        sb2.append(list3);
        sb2.append(", sexAge=");
        return z.h(sb2, list4, ")");
    }

    public AdsDemostatsFormat(@Nullable List<AdsStatsAge> list, @Nullable List<AdsStatsCities> list2, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable List<AdsStatsSex> list3, @Nullable List<AdsStatsSexAge> list4) {
        this.age = list;
        this.cities = list2;
        this.day = str;
        this.month = str2;
        this.overall = num;
        this.sex = list3;
        this.sexAge = list4;
    }

    public /* synthetic */ AdsDemostatsFormat(List list, List list2, String str, String str2, Integer num, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : list4);
    }
}
