package com.vk.sdk.api.users.dto;

import a0.u;
import com.appsflyer.AdRevenueScheme;
import io.sentry.protocol.Geo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class UsersSchool {

    @b(Geo.JsonKeys.CITY)
    @Nullable
    private final Integer city;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    @b("class")
    @Nullable
    private final String f8class;

    @b(AdRevenueScheme.COUNTRY)
    @Nullable
    private final Integer country;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final String f15243id;

    @b("name")
    @Nullable
    private final String name;

    @b("speciality")
    @Nullable
    private final String speciality;

    @b("type")
    @Nullable
    private final Integer type;

    @b("type_str")
    @Nullable
    private final String typeStr;

    @b("year_from")
    @Nullable
    private final Integer yearFrom;

    @b("year_graduated")
    @Nullable
    private final Integer yearGraduated;

    @b("year_to")
    @Nullable
    private final Integer yearTo;

    public UsersSchool() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ UsersSchool copy$default(UsersSchool usersSchool, Integer num, String str, Integer num2, String str2, String str3, Integer num3, String str4, Integer num4, Integer num5, Integer num6, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = usersSchool.city;
        }
        if ((i & 2) != 0) {
            str = usersSchool.f8class;
        }
        if ((i & 4) != 0) {
            num2 = usersSchool.country;
        }
        if ((i & 8) != 0) {
            str2 = usersSchool.f15243id;
        }
        if ((i & 16) != 0) {
            str3 = usersSchool.name;
        }
        if ((i & 32) != 0) {
            num3 = usersSchool.type;
        }
        if ((i & 64) != 0) {
            str4 = usersSchool.typeStr;
        }
        if ((i & 128) != 0) {
            num4 = usersSchool.yearFrom;
        }
        if ((i & 256) != 0) {
            num5 = usersSchool.yearGraduated;
        }
        if ((i & 512) != 0) {
            num6 = usersSchool.yearTo;
        }
        if ((i & 1024) != 0) {
            str5 = usersSchool.speciality;
        }
        Integer num7 = num6;
        String str6 = str5;
        Integer num8 = num4;
        Integer num9 = num5;
        Integer num10 = num3;
        String str7 = str4;
        String str8 = str3;
        Integer num11 = num2;
        return usersSchool.copy(num, str, num11, str2, str8, num10, str7, num8, num9, num7, str6);
    }

    @Nullable
    public final Integer component1() {
        return this.city;
    }

    @Nullable
    public final Integer component10() {
        return this.yearTo;
    }

    @Nullable
    public final String component11() {
        return this.speciality;
    }

    @Nullable
    public final String component2() {
        return this.f8class;
    }

    @Nullable
    public final Integer component3() {
        return this.country;
    }

    @Nullable
    public final String component4() {
        return this.f15243id;
    }

    @Nullable
    public final String component5() {
        return this.name;
    }

    @Nullable
    public final Integer component6() {
        return this.type;
    }

    @Nullable
    public final String component7() {
        return this.typeStr;
    }

    @Nullable
    public final Integer component8() {
        return this.yearFrom;
    }

    @Nullable
    public final Integer component9() {
        return this.yearGraduated;
    }

    @NotNull
    public final UsersSchool copy(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable Integer num3, @Nullable String str4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str5) {
        return new UsersSchool(num, str, num2, str2, str3, num3, str4, num4, num5, num6, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersSchool)) {
            return false;
        }
        UsersSchool usersSchool = (UsersSchool) obj;
        return Intrinsics.a(this.city, usersSchool.city) && Intrinsics.a(this.f8class, usersSchool.f8class) && Intrinsics.a(this.country, usersSchool.country) && Intrinsics.a(this.f15243id, usersSchool.f15243id) && Intrinsics.a(this.name, usersSchool.name) && Intrinsics.a(this.type, usersSchool.type) && Intrinsics.a(this.typeStr, usersSchool.typeStr) && Intrinsics.a(this.yearFrom, usersSchool.yearFrom) && Intrinsics.a(this.yearGraduated, usersSchool.yearGraduated) && Intrinsics.a(this.yearTo, usersSchool.yearTo) && Intrinsics.a(this.speciality, usersSchool.speciality);
    }

    @Nullable
    public final Integer getCity() {
        return this.city;
    }

    @Nullable
    public final String getClass() {
        return this.f8class;
    }

    @Nullable
    public final Integer getCountry() {
        return this.country;
    }

    @Nullable
    public final String getId() {
        return this.f15243id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSpeciality() {
        return this.speciality;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getTypeStr() {
        return this.typeStr;
    }

    @Nullable
    public final Integer getYearFrom() {
        return this.yearFrom;
    }

    @Nullable
    public final Integer getYearGraduated() {
        return this.yearGraduated;
    }

    @Nullable
    public final Integer getYearTo() {
        return this.yearTo;
    }

    public int hashCode() {
        Integer num = this.city;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f8class;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.country;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f15243id;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.type;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.typeStr;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.yearFrom;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.yearGraduated;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.yearTo;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.speciality;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.city;
        String str = this.f8class;
        Integer num2 = this.country;
        String str2 = this.f15243id;
        String str3 = this.name;
        Integer num3 = this.type;
        String str4 = this.typeStr;
        Integer num4 = this.yearFrom;
        Integer num5 = this.yearGraduated;
        Integer num6 = this.yearTo;
        String str5 = this.speciality;
        StringBuilder sb2 = new StringBuilder("UsersSchool(city=");
        sb2.append(num);
        sb2.append(", class=");
        sb2.append(str);
        sb2.append(", country=");
        a.r(num2, ", id=", str2, ", name=", sb2);
        gf.a.r(num3, str3, ", type=", ", typeStr=", sb2);
        gf.a.r(num4, str4, ", yearFrom=", ", yearGraduated=", sb2);
        gf.a.t(sb2, num5, ", yearTo=", num6, ", speciality=");
        return u.o(sb2, str5, ")");
    }

    public UsersSchool(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable Integer num3, @Nullable String str4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str5) {
        this.city = num;
        this.f8class = str;
        this.country = num2;
        this.f15243id = str2;
        this.name = str3;
        this.type = num3;
        this.typeStr = str4;
        this.yearFrom = num4;
        this.yearGraduated = num5;
        this.yearTo = num6;
        this.speciality = str5;
    }

    public /* synthetic */ UsersSchool(Integer num, String str, Integer num2, String str2, String str3, Integer num3, String str4, Integer num4, Integer num5, Integer num6, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : num6, (i & 1024) != 0 ? null : str5);
    }
}
