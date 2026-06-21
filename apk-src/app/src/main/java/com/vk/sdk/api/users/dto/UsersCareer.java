package com.vk.sdk.api.users.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
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
public final class UsersCareer {

    @b("city_id")
    @Nullable
    private final Integer cityId;

    @b("city_name")
    @Nullable
    private final String cityName;

    @b("company")
    @Nullable
    private final String company;

    @b("country_id")
    @Nullable
    private final Integer countryId;

    @b("from")
    @Nullable
    private final Integer from;

    @b("group_id")
    @Nullable
    private final UserId groupId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15239id;

    @b("position")
    @Nullable
    private final String position;

    @b("until")
    @Nullable
    private final Integer until;

    public UsersCareer() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ UsersCareer copy$default(UsersCareer usersCareer, Integer num, String str, String str2, Integer num2, Integer num3, UserId userId, Integer num4, String str3, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = usersCareer.cityId;
        }
        if ((i & 2) != 0) {
            str = usersCareer.cityName;
        }
        if ((i & 4) != 0) {
            str2 = usersCareer.company;
        }
        if ((i & 8) != 0) {
            num2 = usersCareer.countryId;
        }
        if ((i & 16) != 0) {
            num3 = usersCareer.from;
        }
        if ((i & 32) != 0) {
            userId = usersCareer.groupId;
        }
        if ((i & 64) != 0) {
            num4 = usersCareer.f15239id;
        }
        if ((i & 128) != 0) {
            str3 = usersCareer.position;
        }
        if ((i & 256) != 0) {
            num5 = usersCareer.until;
        }
        String str4 = str3;
        Integer num6 = num5;
        UserId userId2 = userId;
        Integer num7 = num4;
        Integer num8 = num3;
        String str5 = str2;
        return usersCareer.copy(num, str, str5, num2, num8, userId2, num7, str4, num6);
    }

    @Nullable
    public final Integer component1() {
        return this.cityId;
    }

    @Nullable
    public final String component2() {
        return this.cityName;
    }

    @Nullable
    public final String component3() {
        return this.company;
    }

    @Nullable
    public final Integer component4() {
        return this.countryId;
    }

    @Nullable
    public final Integer component5() {
        return this.from;
    }

    @Nullable
    public final UserId component6() {
        return this.groupId;
    }

    @Nullable
    public final Integer component7() {
        return this.f15239id;
    }

    @Nullable
    public final String component8() {
        return this.position;
    }

    @Nullable
    public final Integer component9() {
        return this.until;
    }

    @NotNull
    public final UsersCareer copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable Integer num3, @Nullable UserId userId, @Nullable Integer num4, @Nullable String str3, @Nullable Integer num5) {
        return new UsersCareer(num, str, str2, num2, num3, userId, num4, str3, num5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersCareer)) {
            return false;
        }
        UsersCareer usersCareer = (UsersCareer) obj;
        return Intrinsics.a(this.cityId, usersCareer.cityId) && Intrinsics.a(this.cityName, usersCareer.cityName) && Intrinsics.a(this.company, usersCareer.company) && Intrinsics.a(this.countryId, usersCareer.countryId) && Intrinsics.a(this.from, usersCareer.from) && Intrinsics.a(this.groupId, usersCareer.groupId) && Intrinsics.a(this.f15239id, usersCareer.f15239id) && Intrinsics.a(this.position, usersCareer.position) && Intrinsics.a(this.until, usersCareer.until);
    }

    @Nullable
    public final Integer getCityId() {
        return this.cityId;
    }

    @Nullable
    public final String getCityName() {
        return this.cityName;
    }

    @Nullable
    public final String getCompany() {
        return this.company;
    }

    @Nullable
    public final Integer getCountryId() {
        return this.countryId;
    }

    @Nullable
    public final Integer getFrom() {
        return this.from;
    }

    @Nullable
    public final UserId getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final Integer getId() {
        return this.f15239id;
    }

    @Nullable
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final Integer getUntil() {
        return this.until;
    }

    public int hashCode() {
        Integer num = this.cityId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.cityName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.company;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.countryId;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.from;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UserId userId = this.groupId;
        int iHashCode6 = (iHashCode5 + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num4 = this.f15239id;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.position;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.until;
        return iHashCode8 + (num5 != null ? num5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.cityId;
        String str = this.cityName;
        String str2 = this.company;
        Integer num2 = this.countryId;
        Integer num3 = this.from;
        UserId userId = this.groupId;
        Integer num4 = this.f15239id;
        String str3 = this.position;
        Integer num5 = this.until;
        StringBuilder sb2 = new StringBuilder("UsersCareer(cityId=");
        sb2.append(num);
        sb2.append(", cityName=");
        sb2.append(str);
        sb2.append(", company=");
        a.r(num2, str2, ", countryId=", ", from=", sb2);
        sb2.append(num3);
        sb2.append(", groupId=");
        sb2.append(userId);
        sb2.append(", id=");
        pe.a.r(num4, ", position=", str3, ", until=", sb2);
        return u.m(sb2, num5, ")");
    }

    public UsersCareer(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable Integer num3, @Nullable UserId userId, @Nullable Integer num4, @Nullable String str3, @Nullable Integer num5) {
        this.cityId = num;
        this.cityName = str;
        this.company = str2;
        this.countryId = num2;
        this.from = num3;
        this.groupId = userId;
        this.f15239id = num4;
        this.position = str3;
        this.until = num5;
    }

    public /* synthetic */ UsersCareer(Integer num, String str, String str2, Integer num2, Integer num3, UserId userId, Integer num4, String str3, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : userId, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : num5);
    }
}
