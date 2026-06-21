package com.vk.sdk.api.users.dto;

import com.appsflyer.AdRevenueScheme;
import gf.a;
import io.sentry.protocol.Geo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class UsersUniversity {

    @b("chair")
    @Nullable
    private final Integer chair;

    @b("chair_name")
    @Nullable
    private final String chairName;

    @b(Geo.JsonKeys.CITY)
    @Nullable
    private final Integer city;

    @b(AdRevenueScheme.COUNTRY)
    @Nullable
    private final Integer country;

    @b("education_form")
    @Nullable
    private final String educationForm;

    @b("education_status")
    @Nullable
    private final String educationStatus;

    @b("faculty")
    @Nullable
    private final Integer faculty;

    @b("faculty_name")
    @Nullable
    private final String facultyName;

    @b("graduation")
    @Nullable
    private final Integer graduation;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15246id;

    @b("name")
    @Nullable
    private final String name;

    @b("university_group_id")
    @Nullable
    private final Integer universityGroupId;

    public UsersUniversity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ UsersUniversity copy$default(UsersUniversity usersUniversity, Integer num, String str, Integer num2, Integer num3, String str2, String str3, Integer num4, String str4, Integer num5, Integer num6, String str5, Integer num7, int i, Object obj) {
        if ((i & 1) != 0) {
            num = usersUniversity.chair;
        }
        if ((i & 2) != 0) {
            str = usersUniversity.chairName;
        }
        if ((i & 4) != 0) {
            num2 = usersUniversity.city;
        }
        if ((i & 8) != 0) {
            num3 = usersUniversity.country;
        }
        if ((i & 16) != 0) {
            str2 = usersUniversity.educationForm;
        }
        if ((i & 32) != 0) {
            str3 = usersUniversity.educationStatus;
        }
        if ((i & 64) != 0) {
            num4 = usersUniversity.faculty;
        }
        if ((i & 128) != 0) {
            str4 = usersUniversity.facultyName;
        }
        if ((i & 256) != 0) {
            num5 = usersUniversity.graduation;
        }
        if ((i & 512) != 0) {
            num6 = usersUniversity.f15246id;
        }
        if ((i & 1024) != 0) {
            str5 = usersUniversity.name;
        }
        if ((i & 2048) != 0) {
            num7 = usersUniversity.universityGroupId;
        }
        String str6 = str5;
        Integer num8 = num7;
        Integer num9 = num5;
        Integer num10 = num6;
        Integer num11 = num4;
        String str7 = str4;
        String str8 = str2;
        String str9 = str3;
        return usersUniversity.copy(num, str, num2, num3, str8, str9, num11, str7, num9, num10, str6, num8);
    }

    @Nullable
    public final Integer component1() {
        return this.chair;
    }

    @Nullable
    public final Integer component10() {
        return this.f15246id;
    }

    @Nullable
    public final String component11() {
        return this.name;
    }

    @Nullable
    public final Integer component12() {
        return this.universityGroupId;
    }

    @Nullable
    public final String component2() {
        return this.chairName;
    }

    @Nullable
    public final Integer component3() {
        return this.city;
    }

    @Nullable
    public final Integer component4() {
        return this.country;
    }

    @Nullable
    public final String component5() {
        return this.educationForm;
    }

    @Nullable
    public final String component6() {
        return this.educationStatus;
    }

    @Nullable
    public final Integer component7() {
        return this.faculty;
    }

    @Nullable
    public final String component8() {
        return this.facultyName;
    }

    @Nullable
    public final Integer component9() {
        return this.graduation;
    }

    @NotNull
    public final UsersUniversity copy(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable String str3, @Nullable Integer num4, @Nullable String str4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str5, @Nullable Integer num7) {
        return new UsersUniversity(num, str, num2, num3, str2, str3, num4, str4, num5, num6, str5, num7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUniversity)) {
            return false;
        }
        UsersUniversity usersUniversity = (UsersUniversity) obj;
        return Intrinsics.a(this.chair, usersUniversity.chair) && Intrinsics.a(this.chairName, usersUniversity.chairName) && Intrinsics.a(this.city, usersUniversity.city) && Intrinsics.a(this.country, usersUniversity.country) && Intrinsics.a(this.educationForm, usersUniversity.educationForm) && Intrinsics.a(this.educationStatus, usersUniversity.educationStatus) && Intrinsics.a(this.faculty, usersUniversity.faculty) && Intrinsics.a(this.facultyName, usersUniversity.facultyName) && Intrinsics.a(this.graduation, usersUniversity.graduation) && Intrinsics.a(this.f15246id, usersUniversity.f15246id) && Intrinsics.a(this.name, usersUniversity.name) && Intrinsics.a(this.universityGroupId, usersUniversity.universityGroupId);
    }

    @Nullable
    public final Integer getChair() {
        return this.chair;
    }

    @Nullable
    public final String getChairName() {
        return this.chairName;
    }

    @Nullable
    public final Integer getCity() {
        return this.city;
    }

    @Nullable
    public final Integer getCountry() {
        return this.country;
    }

    @Nullable
    public final String getEducationForm() {
        return this.educationForm;
    }

    @Nullable
    public final String getEducationStatus() {
        return this.educationStatus;
    }

    @Nullable
    public final Integer getFaculty() {
        return this.faculty;
    }

    @Nullable
    public final String getFacultyName() {
        return this.facultyName;
    }

    @Nullable
    public final Integer getGraduation() {
        return this.graduation;
    }

    @Nullable
    public final Integer getId() {
        return this.f15246id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getUniversityGroupId() {
        return this.universityGroupId;
    }

    public int hashCode() {
        Integer num = this.chair;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.chairName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.city;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.country;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.educationForm;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.educationStatus;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.faculty;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.facultyName;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.graduation;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f15246id;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num7 = this.universityGroupId;
        return iHashCode11 + (num7 != null ? num7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.chair;
        String str = this.chairName;
        Integer num2 = this.city;
        Integer num3 = this.country;
        String str2 = this.educationForm;
        String str3 = this.educationStatus;
        Integer num4 = this.faculty;
        String str4 = this.facultyName;
        Integer num5 = this.graduation;
        Integer num6 = this.f15246id;
        String str5 = this.name;
        Integer num7 = this.universityGroupId;
        StringBuilder sb2 = new StringBuilder("UsersUniversity(chair=");
        sb2.append(num);
        sb2.append(", chairName=");
        sb2.append(str);
        sb2.append(", city=");
        a.t(sb2, num2, ", country=", num3, ", educationForm=");
        o.t(sb2, str2, ", educationStatus=", str3, ", faculty=");
        pe.a.r(num4, ", facultyName=", str4, ", graduation=", sb2);
        a.t(sb2, num5, ", id=", num6, ", name=");
        sb2.append(str5);
        sb2.append(", universityGroupId=");
        sb2.append(num7);
        sb2.append(")");
        return sb2.toString();
    }

    public UsersUniversity(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable String str3, @Nullable Integer num4, @Nullable String str4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str5, @Nullable Integer num7) {
        this.chair = num;
        this.chairName = str;
        this.city = num2;
        this.country = num3;
        this.educationForm = str2;
        this.educationStatus = str3;
        this.faculty = num4;
        this.facultyName = str4;
        this.graduation = num5;
        this.f15246id = num6;
        this.name = str5;
        this.universityGroupId = num7;
    }

    public /* synthetic */ UsersUniversity(Integer num, String str, Integer num2, Integer num3, String str2, String str3, Integer num4, String str4, Integer num5, Integer num6, String str5, Integer num7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : num6, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : num7);
    }
}
