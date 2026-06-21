package com.vk.sdk.api.account.dto;

import com.appsflyer.AdRevenueScheme;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.audio.dto.AudioAudio;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseCity;
import com.vk.sdk.api.base.dto.BaseCountry;
import com.vk.sdk.api.base.dto.BaseSex;
import com.vk.sdk.api.users.dto.UsersPersonal;
import com.vk.sdk.api.users.dto.UsersUserConnections;
import com.vk.sdk.api.users.dto.UsersUserMin;
import com.vk.sdk.api.users.dto.UsersUserRelation;
import gf.a;
import io.sentry.protocol.Geo;
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
public final class AccountUserSettings {

    @b("bdate")
    @Nullable
    private final String bdate;

    @b("bdate_visibility")
    @Nullable
    private final Integer bdateVisibility;

    @b("can_access_closed")
    @Nullable
    private final Boolean canAccessClosed;

    @b(Geo.JsonKeys.CITY)
    @Nullable
    private final BaseCity city;

    @b("connections")
    @Nullable
    private final UsersUserConnections connections;

    @b(AdRevenueScheme.COUNTRY)
    @Nullable
    private final BaseCountry country;

    @b("deactivated")
    @Nullable
    private final String deactivated;

    @b("first_name")
    @Nullable
    private final String firstName;

    @b("hidden")
    @Nullable
    private final Integer hidden;

    @b("home_town")
    @NotNull
    private final String homeTown;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final UserId f15108id;

    @b("interests")
    @Nullable
    private final AccountUserSettingsInterests interests;

    @b("is_closed")
    @Nullable
    private final Boolean isClosed;

    @b("is_service_account")
    @Nullable
    private final Boolean isServiceAccount;

    @b("languages")
    @Nullable
    private final List<String> languages;

    @b("last_name")
    @Nullable
    private final String lastName;

    @b("maiden_name")
    @Nullable
    private final String maidenName;

    @b("name_request")
    @Nullable
    private final AccountNameRequest nameRequest;

    @b("personal")
    @Nullable
    private final UsersPersonal personal;

    @b("phone")
    @Nullable
    private final String phone;

    @b("photo_200")
    @Nullable
    private final String photo200;

    @b("relation")
    @Nullable
    private final UsersUserRelation relation;

    @b("relation_partner")
    @Nullable
    private final UsersUserMin relationPartner;

    @b("relation_pending")
    @Nullable
    private final BaseBoolInt relationPending;

    @b("relation_requests")
    @Nullable
    private final List<UsersUserMin> relationRequests;

    @b("screen_name")
    @Nullable
    private final String screenName;

    @b("sex")
    @Nullable
    private final BaseSex sex;

    @b("status")
    @NotNull
    private final String status;

    @b("status_audio")
    @Nullable
    private final AudioAudio statusAudio;

    public AccountUserSettings(@NotNull UserId id2, @NotNull String homeTown, @NotNull String status, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable UsersUserConnections usersUserConnections, @Nullable String str5, @Nullable Integer num2, @Nullable BaseCity baseCity, @Nullable BaseCountry baseCountry, @Nullable String str6, @Nullable AccountNameRequest accountNameRequest, @Nullable UsersPersonal usersPersonal, @Nullable String str7, @Nullable UsersUserRelation usersUserRelation, @Nullable UsersUserMin usersUserMin, @Nullable BaseBoolInt baseBoolInt, @Nullable List<UsersUserMin> list, @Nullable String str8, @Nullable BaseSex baseSex, @Nullable AudioAudio audioAudio, @Nullable AccountUserSettingsInterests accountUserSettingsInterests, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(homeTown, "homeTown");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f15108id = id2;
        this.homeTown = homeTown;
        this.status = status;
        this.photo200 = str;
        this.isServiceAccount = bool;
        this.deactivated = str2;
        this.firstName = str3;
        this.hidden = num;
        this.lastName = str4;
        this.canAccessClosed = bool2;
        this.isClosed = bool3;
        this.connections = usersUserConnections;
        this.bdate = str5;
        this.bdateVisibility = num2;
        this.city = baseCity;
        this.country = baseCountry;
        this.maidenName = str6;
        this.nameRequest = accountNameRequest;
        this.personal = usersPersonal;
        this.phone = str7;
        this.relation = usersUserRelation;
        this.relationPartner = usersUserMin;
        this.relationPending = baseBoolInt;
        this.relationRequests = list;
        this.screenName = str8;
        this.sex = baseSex;
        this.statusAudio = audioAudio;
        this.interests = accountUserSettingsInterests;
        this.languages = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountUserSettings copy$default(AccountUserSettings accountUserSettings, UserId userId, String str, String str2, String str3, Boolean bool, String str4, String str5, Integer num, String str6, Boolean bool2, Boolean bool3, UsersUserConnections usersUserConnections, String str7, Integer num2, BaseCity baseCity, BaseCountry baseCountry, String str8, AccountNameRequest accountNameRequest, UsersPersonal usersPersonal, String str9, UsersUserRelation usersUserRelation, UsersUserMin usersUserMin, BaseBoolInt baseBoolInt, List list, String str10, BaseSex baseSex, AudioAudio audioAudio, AccountUserSettingsInterests accountUserSettingsInterests, List list2, int i, Object obj) {
        List list3;
        AccountUserSettingsInterests accountUserSettingsInterests2;
        UserId userId2 = (i & 1) != 0 ? accountUserSettings.f15108id : userId;
        String str11 = (i & 2) != 0 ? accountUserSettings.homeTown : str;
        String str12 = (i & 4) != 0 ? accountUserSettings.status : str2;
        String str13 = (i & 8) != 0 ? accountUserSettings.photo200 : str3;
        Boolean bool4 = (i & 16) != 0 ? accountUserSettings.isServiceAccount : bool;
        String str14 = (i & 32) != 0 ? accountUserSettings.deactivated : str4;
        String str15 = (i & 64) != 0 ? accountUserSettings.firstName : str5;
        Integer num3 = (i & 128) != 0 ? accountUserSettings.hidden : num;
        String str16 = (i & 256) != 0 ? accountUserSettings.lastName : str6;
        Boolean bool5 = (i & 512) != 0 ? accountUserSettings.canAccessClosed : bool2;
        Boolean bool6 = (i & 1024) != 0 ? accountUserSettings.isClosed : bool3;
        UsersUserConnections usersUserConnections2 = (i & 2048) != 0 ? accountUserSettings.connections : usersUserConnections;
        String str17 = (i & 4096) != 0 ? accountUserSettings.bdate : str7;
        Integer num4 = (i & 8192) != 0 ? accountUserSettings.bdateVisibility : num2;
        UserId userId3 = userId2;
        BaseCity baseCity2 = (i & 16384) != 0 ? accountUserSettings.city : baseCity;
        BaseCountry baseCountry2 = (i & 32768) != 0 ? accountUserSettings.country : baseCountry;
        String str18 = (i & 65536) != 0 ? accountUserSettings.maidenName : str8;
        AccountNameRequest accountNameRequest2 = (i & 131072) != 0 ? accountUserSettings.nameRequest : accountNameRequest;
        UsersPersonal usersPersonal2 = (i & 262144) != 0 ? accountUserSettings.personal : usersPersonal;
        String str19 = (i & 524288) != 0 ? accountUserSettings.phone : str9;
        UsersUserRelation usersUserRelation2 = (i & 1048576) != 0 ? accountUserSettings.relation : usersUserRelation;
        UsersUserMin usersUserMin2 = (i & 2097152) != 0 ? accountUserSettings.relationPartner : usersUserMin;
        BaseBoolInt baseBoolInt2 = (i & 4194304) != 0 ? accountUserSettings.relationPending : baseBoolInt;
        List list4 = (i & 8388608) != 0 ? accountUserSettings.relationRequests : list;
        String str20 = (i & 16777216) != 0 ? accountUserSettings.screenName : str10;
        BaseSex baseSex2 = (i & 33554432) != 0 ? accountUserSettings.sex : baseSex;
        AudioAudio audioAudio2 = (i & 67108864) != 0 ? accountUserSettings.statusAudio : audioAudio;
        AccountUserSettingsInterests accountUserSettingsInterests3 = (i & 134217728) != 0 ? accountUserSettings.interests : accountUserSettingsInterests;
        if ((i & 268435456) != 0) {
            accountUserSettingsInterests2 = accountUserSettingsInterests3;
            list3 = accountUserSettings.languages;
        } else {
            list3 = list2;
            accountUserSettingsInterests2 = accountUserSettingsInterests3;
        }
        return accountUserSettings.copy(userId3, str11, str12, str13, bool4, str14, str15, num3, str16, bool5, bool6, usersUserConnections2, str17, num4, baseCity2, baseCountry2, str18, accountNameRequest2, usersPersonal2, str19, usersUserRelation2, usersUserMin2, baseBoolInt2, list4, str20, baseSex2, audioAudio2, accountUserSettingsInterests2, list3);
    }

    @NotNull
    public final UserId component1() {
        return this.f15108id;
    }

    @Nullable
    public final Boolean component10() {
        return this.canAccessClosed;
    }

    @Nullable
    public final Boolean component11() {
        return this.isClosed;
    }

    @Nullable
    public final UsersUserConnections component12() {
        return this.connections;
    }

    @Nullable
    public final String component13() {
        return this.bdate;
    }

    @Nullable
    public final Integer component14() {
        return this.bdateVisibility;
    }

    @Nullable
    public final BaseCity component15() {
        return this.city;
    }

    @Nullable
    public final BaseCountry component16() {
        return this.country;
    }

    @Nullable
    public final String component17() {
        return this.maidenName;
    }

    @Nullable
    public final AccountNameRequest component18() {
        return this.nameRequest;
    }

    @Nullable
    public final UsersPersonal component19() {
        return this.personal;
    }

    @NotNull
    public final String component2() {
        return this.homeTown;
    }

    @Nullable
    public final String component20() {
        return this.phone;
    }

    @Nullable
    public final UsersUserRelation component21() {
        return this.relation;
    }

    @Nullable
    public final UsersUserMin component22() {
        return this.relationPartner;
    }

    @Nullable
    public final BaseBoolInt component23() {
        return this.relationPending;
    }

    @Nullable
    public final List<UsersUserMin> component24() {
        return this.relationRequests;
    }

    @Nullable
    public final String component25() {
        return this.screenName;
    }

    @Nullable
    public final BaseSex component26() {
        return this.sex;
    }

    @Nullable
    public final AudioAudio component27() {
        return this.statusAudio;
    }

    @Nullable
    public final AccountUserSettingsInterests component28() {
        return this.interests;
    }

    @Nullable
    public final List<String> component29() {
        return this.languages;
    }

    @NotNull
    public final String component3() {
        return this.status;
    }

    @Nullable
    public final String component4() {
        return this.photo200;
    }

    @Nullable
    public final Boolean component5() {
        return this.isServiceAccount;
    }

    @Nullable
    public final String component6() {
        return this.deactivated;
    }

    @Nullable
    public final String component7() {
        return this.firstName;
    }

    @Nullable
    public final Integer component8() {
        return this.hidden;
    }

    @Nullable
    public final String component9() {
        return this.lastName;
    }

    @NotNull
    public final AccountUserSettings copy(@NotNull UserId id2, @NotNull String homeTown, @NotNull String status, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable UsersUserConnections usersUserConnections, @Nullable String str5, @Nullable Integer num2, @Nullable BaseCity baseCity, @Nullable BaseCountry baseCountry, @Nullable String str6, @Nullable AccountNameRequest accountNameRequest, @Nullable UsersPersonal usersPersonal, @Nullable String str7, @Nullable UsersUserRelation usersUserRelation, @Nullable UsersUserMin usersUserMin, @Nullable BaseBoolInt baseBoolInt, @Nullable List<UsersUserMin> list, @Nullable String str8, @Nullable BaseSex baseSex, @Nullable AudioAudio audioAudio, @Nullable AccountUserSettingsInterests accountUserSettingsInterests, @Nullable List<String> list2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(homeTown, "homeTown");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AccountUserSettings(id2, homeTown, status, str, bool, str2, str3, num, str4, bool2, bool3, usersUserConnections, str5, num2, baseCity, baseCountry, str6, accountNameRequest, usersPersonal, str7, usersUserRelation, usersUserMin, baseBoolInt, list, str8, baseSex, audioAudio, accountUserSettingsInterests, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUserSettings)) {
            return false;
        }
        AccountUserSettings accountUserSettings = (AccountUserSettings) obj;
        return Intrinsics.a(this.f15108id, accountUserSettings.f15108id) && Intrinsics.a(this.homeTown, accountUserSettings.homeTown) && Intrinsics.a(this.status, accountUserSettings.status) && Intrinsics.a(this.photo200, accountUserSettings.photo200) && Intrinsics.a(this.isServiceAccount, accountUserSettings.isServiceAccount) && Intrinsics.a(this.deactivated, accountUserSettings.deactivated) && Intrinsics.a(this.firstName, accountUserSettings.firstName) && Intrinsics.a(this.hidden, accountUserSettings.hidden) && Intrinsics.a(this.lastName, accountUserSettings.lastName) && Intrinsics.a(this.canAccessClosed, accountUserSettings.canAccessClosed) && Intrinsics.a(this.isClosed, accountUserSettings.isClosed) && Intrinsics.a(this.connections, accountUserSettings.connections) && Intrinsics.a(this.bdate, accountUserSettings.bdate) && Intrinsics.a(this.bdateVisibility, accountUserSettings.bdateVisibility) && Intrinsics.a(this.city, accountUserSettings.city) && Intrinsics.a(this.country, accountUserSettings.country) && Intrinsics.a(this.maidenName, accountUserSettings.maidenName) && Intrinsics.a(this.nameRequest, accountUserSettings.nameRequest) && Intrinsics.a(this.personal, accountUserSettings.personal) && Intrinsics.a(this.phone, accountUserSettings.phone) && this.relation == accountUserSettings.relation && Intrinsics.a(this.relationPartner, accountUserSettings.relationPartner) && this.relationPending == accountUserSettings.relationPending && Intrinsics.a(this.relationRequests, accountUserSettings.relationRequests) && Intrinsics.a(this.screenName, accountUserSettings.screenName) && this.sex == accountUserSettings.sex && Intrinsics.a(this.statusAudio, accountUserSettings.statusAudio) && Intrinsics.a(this.interests, accountUserSettings.interests) && Intrinsics.a(this.languages, accountUserSettings.languages);
    }

    @Nullable
    public final String getBdate() {
        return this.bdate;
    }

    @Nullable
    public final Integer getBdateVisibility() {
        return this.bdateVisibility;
    }

    @Nullable
    public final Boolean getCanAccessClosed() {
        return this.canAccessClosed;
    }

    @Nullable
    public final BaseCity getCity() {
        return this.city;
    }

    @Nullable
    public final UsersUserConnections getConnections() {
        return this.connections;
    }

    @Nullable
    public final BaseCountry getCountry() {
        return this.country;
    }

    @Nullable
    public final String getDeactivated() {
        return this.deactivated;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final Integer getHidden() {
        return this.hidden;
    }

    @NotNull
    public final String getHomeTown() {
        return this.homeTown;
    }

    @NotNull
    public final UserId getId() {
        return this.f15108id;
    }

    @Nullable
    public final AccountUserSettingsInterests getInterests() {
        return this.interests;
    }

    @Nullable
    public final List<String> getLanguages() {
        return this.languages;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getMaidenName() {
        return this.maidenName;
    }

    @Nullable
    public final AccountNameRequest getNameRequest() {
        return this.nameRequest;
    }

    @Nullable
    public final UsersPersonal getPersonal() {
        return this.personal;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getPhoto200() {
        return this.photo200;
    }

    @Nullable
    public final UsersUserRelation getRelation() {
        return this.relation;
    }

    @Nullable
    public final UsersUserMin getRelationPartner() {
        return this.relationPartner;
    }

    @Nullable
    public final BaseBoolInt getRelationPending() {
        return this.relationPending;
    }

    @Nullable
    public final List<UsersUserMin> getRelationRequests() {
        return this.relationRequests;
    }

    @Nullable
    public final String getScreenName() {
        return this.screenName;
    }

    @Nullable
    public final BaseSex getSex() {
        return this.sex;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final AudioAudio getStatusAudio() {
        return this.statusAudio;
    }

    public int hashCode() {
        int iE = a.e(a.e(this.f15108id.hashCode() * 31, 31, this.homeTown), 31, this.status);
        String str = this.photo200;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isServiceAccount;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.deactivated;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.hidden;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.canAccessClosed;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isClosed;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        UsersUserConnections usersUserConnections = this.connections;
        int iHashCode9 = (iHashCode8 + (usersUserConnections == null ? 0 : usersUserConnections.hashCode())) * 31;
        String str5 = this.bdate;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.bdateVisibility;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseCity baseCity = this.city;
        int iHashCode12 = (iHashCode11 + (baseCity == null ? 0 : baseCity.hashCode())) * 31;
        BaseCountry baseCountry = this.country;
        int iHashCode13 = (iHashCode12 + (baseCountry == null ? 0 : baseCountry.hashCode())) * 31;
        String str6 = this.maidenName;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AccountNameRequest accountNameRequest = this.nameRequest;
        int iHashCode15 = (iHashCode14 + (accountNameRequest == null ? 0 : accountNameRequest.hashCode())) * 31;
        UsersPersonal usersPersonal = this.personal;
        int iHashCode16 = (iHashCode15 + (usersPersonal == null ? 0 : usersPersonal.hashCode())) * 31;
        String str7 = this.phone;
        int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        UsersUserRelation usersUserRelation = this.relation;
        int iHashCode18 = (iHashCode17 + (usersUserRelation == null ? 0 : usersUserRelation.hashCode())) * 31;
        UsersUserMin usersUserMin = this.relationPartner;
        int iHashCode19 = (iHashCode18 + (usersUserMin == null ? 0 : usersUserMin.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.relationPending;
        int iHashCode20 = (iHashCode19 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        List<UsersUserMin> list = this.relationRequests;
        int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.screenName;
        int iHashCode22 = (iHashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BaseSex baseSex = this.sex;
        int iHashCode23 = (iHashCode22 + (baseSex == null ? 0 : baseSex.hashCode())) * 31;
        AudioAudio audioAudio = this.statusAudio;
        int iHashCode24 = (iHashCode23 + (audioAudio == null ? 0 : audioAudio.hashCode())) * 31;
        AccountUserSettingsInterests accountUserSettingsInterests = this.interests;
        int iHashCode25 = (iHashCode24 + (accountUserSettingsInterests == null ? 0 : accountUserSettingsInterests.hashCode())) * 31;
        List<String> list2 = this.languages;
        return iHashCode25 + (list2 != null ? list2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isClosed() {
        return this.isClosed;
    }

    @Nullable
    public final Boolean isServiceAccount() {
        return this.isServiceAccount;
    }

    @NotNull
    public String toString() {
        UserId userId = this.f15108id;
        String str = this.homeTown;
        String str2 = this.status;
        String str3 = this.photo200;
        Boolean bool = this.isServiceAccount;
        String str4 = this.deactivated;
        String str5 = this.firstName;
        Integer num = this.hidden;
        String str6 = this.lastName;
        Boolean bool2 = this.canAccessClosed;
        Boolean bool3 = this.isClosed;
        UsersUserConnections usersUserConnections = this.connections;
        String str7 = this.bdate;
        Integer num2 = this.bdateVisibility;
        BaseCity baseCity = this.city;
        BaseCountry baseCountry = this.country;
        String str8 = this.maidenName;
        AccountNameRequest accountNameRequest = this.nameRequest;
        UsersPersonal usersPersonal = this.personal;
        String str9 = this.phone;
        UsersUserRelation usersUserRelation = this.relation;
        UsersUserMin usersUserMin = this.relationPartner;
        BaseBoolInt baseBoolInt = this.relationPending;
        List<UsersUserMin> list = this.relationRequests;
        String str10 = this.screenName;
        BaseSex baseSex = this.sex;
        AudioAudio audioAudio = this.statusAudio;
        AccountUserSettingsInterests accountUserSettingsInterests = this.interests;
        List<String> list2 = this.languages;
        StringBuilder sb2 = new StringBuilder("AccountUserSettings(id=");
        sb2.append(userId);
        sb2.append(", homeTown=");
        sb2.append(str);
        sb2.append(", status=");
        o.t(sb2, str2, ", photo200=", str3, ", isServiceAccount=");
        sb2.append(bool);
        sb2.append(", deactivated=");
        sb2.append(str4);
        sb2.append(", firstName=");
        a.r(num, str5, ", hidden=", ", lastName=", sb2);
        sb2.append(str6);
        sb2.append(", canAccessClosed=");
        sb2.append(bool2);
        sb2.append(", isClosed=");
        sb2.append(bool3);
        sb2.append(", connections=");
        sb2.append(usersUserConnections);
        sb2.append(", bdate=");
        a.r(num2, str7, ", bdateVisibility=", ", city=", sb2);
        sb2.append(baseCity);
        sb2.append(", country=");
        sb2.append(baseCountry);
        sb2.append(", maidenName=");
        sb2.append(str8);
        sb2.append(", nameRequest=");
        sb2.append(accountNameRequest);
        sb2.append(", personal=");
        sb2.append(usersPersonal);
        sb2.append(", phone=");
        sb2.append(str9);
        sb2.append(", relation=");
        sb2.append(usersUserRelation);
        sb2.append(", relationPartner=");
        sb2.append(usersUserMin);
        sb2.append(", relationPending=");
        sb2.append(baseBoolInt);
        sb2.append(", relationRequests=");
        sb2.append(list);
        sb2.append(", screenName=");
        sb2.append(str10);
        sb2.append(", sex=");
        sb2.append(baseSex);
        sb2.append(", statusAudio=");
        sb2.append(audioAudio);
        sb2.append(", interests=");
        sb2.append(accountUserSettingsInterests);
        sb2.append(", languages=");
        return z.h(sb2, list2, ")");
    }

    public /* synthetic */ AccountUserSettings(UserId userId, String str, String str2, String str3, Boolean bool, String str4, String str5, Integer num, String str6, Boolean bool2, Boolean bool3, UsersUserConnections usersUserConnections, String str7, Integer num2, BaseCity baseCity, BaseCountry baseCountry, String str8, AccountNameRequest accountNameRequest, UsersPersonal usersPersonal, String str9, UsersUserRelation usersUserRelation, UsersUserMin usersUserMin, BaseBoolInt baseBoolInt, List list, String str10, BaseSex baseSex, AudioAudio audioAudio, AccountUserSettingsInterests accountUserSettingsInterests, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : usersUserConnections, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : baseCity, (32768 & i) != 0 ? null : baseCountry, (65536 & i) != 0 ? null : str8, (131072 & i) != 0 ? null : accountNameRequest, (262144 & i) != 0 ? null : usersPersonal, (524288 & i) != 0 ? null : str9, (1048576 & i) != 0 ? null : usersUserRelation, (2097152 & i) != 0 ? null : usersUserMin, (4194304 & i) != 0 ? null : baseBoolInt, (8388608 & i) != 0 ? null : list, (16777216 & i) != 0 ? null : str10, (33554432 & i) != 0 ? null : baseSex, (67108864 & i) != 0 ? null : audioAudio, (134217728 & i) != 0 ? null : accountUserSettingsInterests, (i & 268435456) != 0 ? null : list2);
    }
}
