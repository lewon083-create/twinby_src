package com.vk.sdk.api.ads.dto;

import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.internal.ads.om1;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BasePropertyExists;
import gf.a;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
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
public final class AdsTargSettings {

    @b("age_from")
    @Nullable
    private final Integer ageFrom;

    @b("age_to")
    @Nullable
    private final Integer ageTo;

    @b("apps")
    @Nullable
    private final String apps;

    @b("apps_not")
    @Nullable
    private final String appsNot;

    @b("birthday")
    @Nullable
    private final Integer birthday;

    @b("campaign_id")
    @Nullable
    private final Integer campaignId;

    @b("cities")
    @Nullable
    private final String cities;

    @b("cities_not")
    @Nullable
    private final String citiesNot;

    @b(AdRevenueScheme.COUNTRY)
    @Nullable
    private final Integer country;

    @b("districts")
    @Nullable
    private final String districts;

    @b("groups")
    @Nullable
    private final String groups;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15123id;

    @b("interest_categories")
    @Nullable
    private final String interestCategories;

    @b("interests")
    @Nullable
    private final String interests;

    @b("paying")
    @Nullable
    private final BaseBoolInt paying;

    @b(RRWebInteractionMoveEvent.JsonKeys.POSITIONS)
    @Nullable
    private final String positions;

    @b("religions")
    @Nullable
    private final String religions;

    @b("retargeting_groups")
    @Nullable
    private final String retargetingGroups;

    @b("retargeting_groups_not")
    @Nullable
    private final String retargetingGroupsNot;

    @b("school_from")
    @Nullable
    private final Integer schoolFrom;

    @b("school_to")
    @Nullable
    private final Integer schoolTo;

    @b("schools")
    @Nullable
    private final String schools;

    @b("sex")
    @Nullable
    private final AdsCriteriaSex sex;

    @b("stations")
    @Nullable
    private final String stations;

    @b("statuses")
    @Nullable
    private final String statuses;

    @b("streets")
    @Nullable
    private final String streets;

    @b("travellers")
    @Nullable
    private final BasePropertyExists travellers;

    @b("uni_from")
    @Nullable
    private final Integer uniFrom;

    @b("uni_to")
    @Nullable
    private final Integer uniTo;

    @b("user_browsers")
    @Nullable
    private final String userBrowsers;

    @b("user_devices")
    @Nullable
    private final String userDevices;

    @b("user_os")
    @Nullable
    private final String userOs;

    public AdsTargSettings() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    public static /* synthetic */ AdsTargSettings copy$default(AdsTargSettings adsTargSettings, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Integer num5, String str3, String str4, Integer num6, String str5, String str6, String str7, String str8, BaseBoolInt baseBoolInt, String str9, String str10, String str11, String str12, Integer num7, Integer num8, String str13, AdsCriteriaSex adsCriteriaSex, String str14, String str15, String str16, BasePropertyExists basePropertyExists, Integer num9, Integer num10, String str17, String str18, String str19, int i, Object obj) {
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        Integer num11;
        Integer num12;
        String str26;
        AdsCriteriaSex adsCriteriaSex2;
        String str27;
        String str28;
        String str29;
        BasePropertyExists basePropertyExists2;
        Integer num13;
        Integer num14;
        String str30;
        BaseBoolInt baseBoolInt2;
        Integer num15;
        Integer num16;
        Integer num17;
        String str31;
        String str32;
        Integer num18;
        String str33;
        String str34;
        Integer num19;
        String str35;
        String str36;
        String str37;
        String str38;
        Integer num20 = (i & 1) != 0 ? adsTargSettings.f15123id : num;
        Integer num21 = (i & 2) != 0 ? adsTargSettings.campaignId : num2;
        Integer num22 = (i & 4) != 0 ? adsTargSettings.ageFrom : num3;
        Integer num23 = (i & 8) != 0 ? adsTargSettings.ageTo : num4;
        String str39 = (i & 16) != 0 ? adsTargSettings.apps : str;
        String str40 = (i & 32) != 0 ? adsTargSettings.appsNot : str2;
        Integer num24 = (i & 64) != 0 ? adsTargSettings.birthday : num5;
        String str41 = (i & 128) != 0 ? adsTargSettings.cities : str3;
        String str42 = (i & 256) != 0 ? adsTargSettings.citiesNot : str4;
        Integer num25 = (i & 512) != 0 ? adsTargSettings.country : num6;
        String str43 = (i & 1024) != 0 ? adsTargSettings.districts : str5;
        String str44 = (i & 2048) != 0 ? adsTargSettings.groups : str6;
        String str45 = (i & 4096) != 0 ? adsTargSettings.interestCategories : str7;
        String str46 = (i & 8192) != 0 ? adsTargSettings.interests : str8;
        Integer num26 = num20;
        BaseBoolInt baseBoolInt3 = (i & 16384) != 0 ? adsTargSettings.paying : baseBoolInt;
        String str47 = (i & 32768) != 0 ? adsTargSettings.positions : str9;
        String str48 = (i & 65536) != 0 ? adsTargSettings.religions : str10;
        String str49 = (i & 131072) != 0 ? adsTargSettings.retargetingGroups : str11;
        String str50 = (i & 262144) != 0 ? adsTargSettings.retargetingGroupsNot : str12;
        Integer num27 = (i & 524288) != 0 ? adsTargSettings.schoolFrom : num7;
        Integer num28 = (i & 1048576) != 0 ? adsTargSettings.schoolTo : num8;
        String str51 = (i & 2097152) != 0 ? adsTargSettings.schools : str13;
        AdsCriteriaSex adsCriteriaSex3 = (i & 4194304) != 0 ? adsTargSettings.sex : adsCriteriaSex;
        String str52 = (i & 8388608) != 0 ? adsTargSettings.stations : str14;
        String str53 = (i & 16777216) != 0 ? adsTargSettings.statuses : str15;
        String str54 = (i & 33554432) != 0 ? adsTargSettings.streets : str16;
        BasePropertyExists basePropertyExists3 = (i & 67108864) != 0 ? adsTargSettings.travellers : basePropertyExists;
        Integer num29 = (i & 134217728) != 0 ? adsTargSettings.uniFrom : num9;
        Integer num30 = (i & 268435456) != 0 ? adsTargSettings.uniTo : num10;
        String str55 = (i & 536870912) != 0 ? adsTargSettings.userBrowsers : str17;
        String str56 = (i & 1073741824) != 0 ? adsTargSettings.userDevices : str18;
        if ((i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0) {
            str21 = str56;
            str20 = adsTargSettings.userOs;
            str23 = str48;
            str24 = str49;
            str25 = str50;
            num11 = num27;
            num12 = num28;
            str26 = str51;
            adsCriteriaSex2 = adsCriteriaSex3;
            str27 = str52;
            str28 = str53;
            str29 = str54;
            basePropertyExists2 = basePropertyExists3;
            num13 = num29;
            num14 = num30;
            str30 = str55;
            baseBoolInt2 = baseBoolInt3;
            num15 = num21;
            num16 = num22;
            num17 = num23;
            str31 = str39;
            str32 = str40;
            num18 = num24;
            str33 = str41;
            str34 = str42;
            num19 = num25;
            str35 = str43;
            str36 = str44;
            str37 = str45;
            str38 = str46;
            str22 = str47;
        } else {
            str20 = str19;
            str21 = str56;
            str22 = str47;
            str23 = str48;
            str24 = str49;
            str25 = str50;
            num11 = num27;
            num12 = num28;
            str26 = str51;
            adsCriteriaSex2 = adsCriteriaSex3;
            str27 = str52;
            str28 = str53;
            str29 = str54;
            basePropertyExists2 = basePropertyExists3;
            num13 = num29;
            num14 = num30;
            str30 = str55;
            baseBoolInt2 = baseBoolInt3;
            num15 = num21;
            num16 = num22;
            num17 = num23;
            str31 = str39;
            str32 = str40;
            num18 = num24;
            str33 = str41;
            str34 = str42;
            num19 = num25;
            str35 = str43;
            str36 = str44;
            str37 = str45;
            str38 = str46;
        }
        return adsTargSettings.copy(num26, num15, num16, num17, str31, str32, num18, str33, str34, num19, str35, str36, str37, str38, baseBoolInt2, str22, str23, str24, str25, num11, num12, str26, adsCriteriaSex2, str27, str28, str29, basePropertyExists2, num13, num14, str30, str21, str20);
    }

    @Nullable
    public final Integer component1() {
        return this.f15123id;
    }

    @Nullable
    public final Integer component10() {
        return this.country;
    }

    @Nullable
    public final String component11() {
        return this.districts;
    }

    @Nullable
    public final String component12() {
        return this.groups;
    }

    @Nullable
    public final String component13() {
        return this.interestCategories;
    }

    @Nullable
    public final String component14() {
        return this.interests;
    }

    @Nullable
    public final BaseBoolInt component15() {
        return this.paying;
    }

    @Nullable
    public final String component16() {
        return this.positions;
    }

    @Nullable
    public final String component17() {
        return this.religions;
    }

    @Nullable
    public final String component18() {
        return this.retargetingGroups;
    }

    @Nullable
    public final String component19() {
        return this.retargetingGroupsNot;
    }

    @Nullable
    public final Integer component2() {
        return this.campaignId;
    }

    @Nullable
    public final Integer component20() {
        return this.schoolFrom;
    }

    @Nullable
    public final Integer component21() {
        return this.schoolTo;
    }

    @Nullable
    public final String component22() {
        return this.schools;
    }

    @Nullable
    public final AdsCriteriaSex component23() {
        return this.sex;
    }

    @Nullable
    public final String component24() {
        return this.stations;
    }

    @Nullable
    public final String component25() {
        return this.statuses;
    }

    @Nullable
    public final String component26() {
        return this.streets;
    }

    @Nullable
    public final BasePropertyExists component27() {
        return this.travellers;
    }

    @Nullable
    public final Integer component28() {
        return this.uniFrom;
    }

    @Nullable
    public final Integer component29() {
        return this.uniTo;
    }

    @Nullable
    public final Integer component3() {
        return this.ageFrom;
    }

    @Nullable
    public final String component30() {
        return this.userBrowsers;
    }

    @Nullable
    public final String component31() {
        return this.userDevices;
    }

    @Nullable
    public final String component32() {
        return this.userOs;
    }

    @Nullable
    public final Integer component4() {
        return this.ageTo;
    }

    @Nullable
    public final String component5() {
        return this.apps;
    }

    @Nullable
    public final String component6() {
        return this.appsNot;
    }

    @Nullable
    public final Integer component7() {
        return this.birthday;
    }

    @Nullable
    public final String component8() {
        return this.cities;
    }

    @Nullable
    public final String component9() {
        return this.citiesNot;
    }

    @NotNull
    public final AdsTargSettings copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str, @Nullable String str2, @Nullable Integer num5, @Nullable String str3, @Nullable String str4, @Nullable Integer num6, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable BaseBoolInt baseBoolInt, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Integer num7, @Nullable Integer num8, @Nullable String str13, @Nullable AdsCriteriaSex adsCriteriaSex, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable BasePropertyExists basePropertyExists, @Nullable Integer num9, @Nullable Integer num10, @Nullable String str17, @Nullable String str18, @Nullable String str19) {
        return new AdsTargSettings(num, num2, num3, num4, str, str2, num5, str3, str4, num6, str5, str6, str7, str8, baseBoolInt, str9, str10, str11, str12, num7, num8, str13, adsCriteriaSex, str14, str15, str16, basePropertyExists, num9, num10, str17, str18, str19);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargSettings)) {
            return false;
        }
        AdsTargSettings adsTargSettings = (AdsTargSettings) obj;
        return Intrinsics.a(this.f15123id, adsTargSettings.f15123id) && Intrinsics.a(this.campaignId, adsTargSettings.campaignId) && Intrinsics.a(this.ageFrom, adsTargSettings.ageFrom) && Intrinsics.a(this.ageTo, adsTargSettings.ageTo) && Intrinsics.a(this.apps, adsTargSettings.apps) && Intrinsics.a(this.appsNot, adsTargSettings.appsNot) && Intrinsics.a(this.birthday, adsTargSettings.birthday) && Intrinsics.a(this.cities, adsTargSettings.cities) && Intrinsics.a(this.citiesNot, adsTargSettings.citiesNot) && Intrinsics.a(this.country, adsTargSettings.country) && Intrinsics.a(this.districts, adsTargSettings.districts) && Intrinsics.a(this.groups, adsTargSettings.groups) && Intrinsics.a(this.interestCategories, adsTargSettings.interestCategories) && Intrinsics.a(this.interests, adsTargSettings.interests) && this.paying == adsTargSettings.paying && Intrinsics.a(this.positions, adsTargSettings.positions) && Intrinsics.a(this.religions, adsTargSettings.religions) && Intrinsics.a(this.retargetingGroups, adsTargSettings.retargetingGroups) && Intrinsics.a(this.retargetingGroupsNot, adsTargSettings.retargetingGroupsNot) && Intrinsics.a(this.schoolFrom, adsTargSettings.schoolFrom) && Intrinsics.a(this.schoolTo, adsTargSettings.schoolTo) && Intrinsics.a(this.schools, adsTargSettings.schools) && this.sex == adsTargSettings.sex && Intrinsics.a(this.stations, adsTargSettings.stations) && Intrinsics.a(this.statuses, adsTargSettings.statuses) && Intrinsics.a(this.streets, adsTargSettings.streets) && this.travellers == adsTargSettings.travellers && Intrinsics.a(this.uniFrom, adsTargSettings.uniFrom) && Intrinsics.a(this.uniTo, adsTargSettings.uniTo) && Intrinsics.a(this.userBrowsers, adsTargSettings.userBrowsers) && Intrinsics.a(this.userDevices, adsTargSettings.userDevices) && Intrinsics.a(this.userOs, adsTargSettings.userOs);
    }

    @Nullable
    public final Integer getAgeFrom() {
        return this.ageFrom;
    }

    @Nullable
    public final Integer getAgeTo() {
        return this.ageTo;
    }

    @Nullable
    public final String getApps() {
        return this.apps;
    }

    @Nullable
    public final String getAppsNot() {
        return this.appsNot;
    }

    @Nullable
    public final Integer getBirthday() {
        return this.birthday;
    }

    @Nullable
    public final Integer getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    public final String getCities() {
        return this.cities;
    }

    @Nullable
    public final String getCitiesNot() {
        return this.citiesNot;
    }

    @Nullable
    public final Integer getCountry() {
        return this.country;
    }

    @Nullable
    public final String getDistricts() {
        return this.districts;
    }

    @Nullable
    public final String getGroups() {
        return this.groups;
    }

    @Nullable
    public final Integer getId() {
        return this.f15123id;
    }

    @Nullable
    public final String getInterestCategories() {
        return this.interestCategories;
    }

    @Nullable
    public final String getInterests() {
        return this.interests;
    }

    @Nullable
    public final BaseBoolInt getPaying() {
        return this.paying;
    }

    @Nullable
    public final String getPositions() {
        return this.positions;
    }

    @Nullable
    public final String getReligions() {
        return this.religions;
    }

    @Nullable
    public final String getRetargetingGroups() {
        return this.retargetingGroups;
    }

    @Nullable
    public final String getRetargetingGroupsNot() {
        return this.retargetingGroupsNot;
    }

    @Nullable
    public final Integer getSchoolFrom() {
        return this.schoolFrom;
    }

    @Nullable
    public final Integer getSchoolTo() {
        return this.schoolTo;
    }

    @Nullable
    public final String getSchools() {
        return this.schools;
    }

    @Nullable
    public final AdsCriteriaSex getSex() {
        return this.sex;
    }

    @Nullable
    public final String getStations() {
        return this.stations;
    }

    @Nullable
    public final String getStatuses() {
        return this.statuses;
    }

    @Nullable
    public final String getStreets() {
        return this.streets;
    }

    @Nullable
    public final BasePropertyExists getTravellers() {
        return this.travellers;
    }

    @Nullable
    public final Integer getUniFrom() {
        return this.uniFrom;
    }

    @Nullable
    public final Integer getUniTo() {
        return this.uniTo;
    }

    @Nullable
    public final String getUserBrowsers() {
        return this.userBrowsers;
    }

    @Nullable
    public final String getUserDevices() {
        return this.userDevices;
    }

    @Nullable
    public final String getUserOs() {
        return this.userOs;
    }

    public int hashCode() {
        Integer num = this.f15123id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.campaignId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.ageFrom;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.ageTo;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.apps;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appsNot;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.birthday;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.cities;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.citiesNot;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num6 = this.country;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.districts;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.groups;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.interestCategories;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.interests;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.paying;
        int iHashCode15 = (iHashCode14 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        String str9 = this.positions;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.religions;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.retargetingGroups;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.retargetingGroupsNot;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num7 = this.schoolFrom;
        int iHashCode20 = (iHashCode19 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.schoolTo;
        int iHashCode21 = (iHashCode20 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str13 = this.schools;
        int iHashCode22 = (iHashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        AdsCriteriaSex adsCriteriaSex = this.sex;
        int iHashCode23 = (iHashCode22 + (adsCriteriaSex == null ? 0 : adsCriteriaSex.hashCode())) * 31;
        String str14 = this.stations;
        int iHashCode24 = (iHashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.statuses;
        int iHashCode25 = (iHashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.streets;
        int iHashCode26 = (iHashCode25 + (str16 == null ? 0 : str16.hashCode())) * 31;
        BasePropertyExists basePropertyExists = this.travellers;
        int iHashCode27 = (iHashCode26 + (basePropertyExists == null ? 0 : basePropertyExists.hashCode())) * 31;
        Integer num9 = this.uniFrom;
        int iHashCode28 = (iHashCode27 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.uniTo;
        int iHashCode29 = (iHashCode28 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str17 = this.userBrowsers;
        int iHashCode30 = (iHashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.userDevices;
        int iHashCode31 = (iHashCode30 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.userOs;
        return iHashCode31 + (str19 != null ? str19.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.f15123id;
        Integer num2 = this.campaignId;
        Integer num3 = this.ageFrom;
        Integer num4 = this.ageTo;
        String str = this.apps;
        String str2 = this.appsNot;
        Integer num5 = this.birthday;
        String str3 = this.cities;
        String str4 = this.citiesNot;
        Integer num6 = this.country;
        String str5 = this.districts;
        String str6 = this.groups;
        String str7 = this.interestCategories;
        String str8 = this.interests;
        BaseBoolInt baseBoolInt = this.paying;
        String str9 = this.positions;
        String str10 = this.religions;
        String str11 = this.retargetingGroups;
        String str12 = this.retargetingGroupsNot;
        Integer num7 = this.schoolFrom;
        Integer num8 = this.schoolTo;
        String str13 = this.schools;
        AdsCriteriaSex adsCriteriaSex = this.sex;
        String str14 = this.stations;
        String str15 = this.statuses;
        String str16 = this.streets;
        BasePropertyExists basePropertyExists = this.travellers;
        Integer num9 = this.uniFrom;
        Integer num10 = this.uniTo;
        String str17 = this.userBrowsers;
        String str18 = this.userDevices;
        String str19 = this.userOs;
        StringBuilder sbO = om1.o("AdsTargSettings(id=", ", campaignId=", num, num2, ", ageFrom=");
        a.t(sbO, num3, ", ageTo=", num4, ", apps=");
        o.t(sbO, str, ", appsNot=", str2, ", birthday=");
        pe.a.r(num5, ", cities=", str3, ", citiesNot=", sbO);
        a.r(num6, str4, ", country=", ", districts=", sbO);
        o.t(sbO, str5, ", groups=", str6, ", interestCategories=");
        o.t(sbO, str7, ", interests=", str8, ", paying=");
        sbO.append(baseBoolInt);
        sbO.append(", positions=");
        sbO.append(str9);
        sbO.append(", religions=");
        o.t(sbO, str10, ", retargetingGroups=", str11, ", retargetingGroupsNot=");
        a.r(num7, str12, ", schoolFrom=", ", schoolTo=", sbO);
        pe.a.r(num8, ", schools=", str13, ", sex=", sbO);
        sbO.append(adsCriteriaSex);
        sbO.append(", stations=");
        sbO.append(str14);
        sbO.append(", statuses=");
        o.t(sbO, str15, ", streets=", str16, ", travellers=");
        sbO.append(basePropertyExists);
        sbO.append(", uniFrom=");
        sbO.append(num9);
        sbO.append(", uniTo=");
        pe.a.r(num10, ", userBrowsers=", str17, ", userDevices=", sbO);
        return om1.n(sbO, str18, ", userOs=", str19, ")");
    }

    public AdsTargSettings(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str, @Nullable String str2, @Nullable Integer num5, @Nullable String str3, @Nullable String str4, @Nullable Integer num6, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable BaseBoolInt baseBoolInt, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Integer num7, @Nullable Integer num8, @Nullable String str13, @Nullable AdsCriteriaSex adsCriteriaSex, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable BasePropertyExists basePropertyExists, @Nullable Integer num9, @Nullable Integer num10, @Nullable String str17, @Nullable String str18, @Nullable String str19) {
        this.f15123id = num;
        this.campaignId = num2;
        this.ageFrom = num3;
        this.ageTo = num4;
        this.apps = str;
        this.appsNot = str2;
        this.birthday = num5;
        this.cities = str3;
        this.citiesNot = str4;
        this.country = num6;
        this.districts = str5;
        this.groups = str6;
        this.interestCategories = str7;
        this.interests = str8;
        this.paying = baseBoolInt;
        this.positions = str9;
        this.religions = str10;
        this.retargetingGroups = str11;
        this.retargetingGroupsNot = str12;
        this.schoolFrom = num7;
        this.schoolTo = num8;
        this.schools = str13;
        this.sex = adsCriteriaSex;
        this.stations = str14;
        this.statuses = str15;
        this.streets = str16;
        this.travellers = basePropertyExists;
        this.uniFrom = num9;
        this.uniTo = num10;
        this.userBrowsers = str17;
        this.userDevices = str18;
        this.userOs = str19;
    }

    public /* synthetic */ AdsTargSettings(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Integer num5, String str3, String str4, Integer num6, String str5, String str6, String str7, String str8, BaseBoolInt baseBoolInt, String str9, String str10, String str11, String str12, Integer num7, Integer num8, String str13, AdsCriteriaSex adsCriteriaSex, String str14, String str15, String str16, BasePropertyExists basePropertyExists, Integer num9, Integer num10, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num5, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : num6, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : baseBoolInt, (i & 32768) != 0 ? null : str9, (i & 65536) != 0 ? null : str10, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : str12, (i & 524288) != 0 ? null : num7, (i & 1048576) != 0 ? null : num8, (i & 2097152) != 0 ? null : str13, (i & 4194304) != 0 ? null : adsCriteriaSex, (i & 8388608) != 0 ? null : str14, (i & 16777216) != 0 ? null : str15, (i & 33554432) != 0 ? null : str16, (i & 67108864) != 0 ? null : basePropertyExists, (i & 134217728) != 0 ? null : num9, (i & 268435456) != 0 ? null : num10, (i & 536870912) != 0 ? null : str17, (i & 1073741824) != 0 ? null : str18, (i & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : str19);
    }
}
