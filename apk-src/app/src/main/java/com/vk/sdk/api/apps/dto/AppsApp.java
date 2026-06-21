package com.vk.sdk.api.apps.dto;

import a0.u;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import java.util.List;
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
public final class AppsApp {

    @b("author_owner_id")
    @Nullable
    private final Integer authorOwnerId;

    @b("author_url")
    @Nullable
    private final String authorUrl;

    @b("background_loader_color")
    @Nullable
    private final String backgroundLoaderColor;

    @b("banner_1120")
    @Nullable
    private final String banner1120;

    @b("banner_560")
    @Nullable
    private final String banner560;

    @b("catalog_position")
    @Nullable
    private final Integer catalogPosition;

    @b("description")
    @Nullable
    private final String description;

    @b("friends")
    @Nullable
    private final List<Integer> friends;

    @b("genre")
    @Nullable
    private final String genre;

    @b("genre_id")
    @Nullable
    private final Integer genreId;

    @b("icon_139")
    @Nullable
    private final String icon139;

    @b("icon_150")
    @Nullable
    private final String icon150;

    @b("icon_16")
    @Nullable
    private final String icon16;

    @b("icon_278")
    @Nullable
    private final String icon278;

    @b("icon_576")
    @Nullable
    private final String icon576;

    @b("icon_75")
    @Nullable
    private final String icon75;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15128id;

    @b("international")
    @Nullable
    private final Boolean international;

    @b("is_in_catalog")
    @Nullable
    private final Integer isInCatalog;

    @b("is_installed")
    @Nullable
    private final Boolean isInstalled;

    @b("is_new")
    @Nullable
    private final BaseBoolInt isNew;

    @b("leaderboard_type")
    @Nullable
    private final AppsAppLeaderboardType leaderboardType;

    @b("loader_icon")
    @Nullable
    private final String loaderIcon;

    @b("members_count")
    @Nullable
    private final Integer membersCount;

    @b("open_in_external_browser")
    @Nullable
    private final Boolean openInExternalBrowser;

    @b("platform_id")
    @Nullable
    private final String platformId;

    @b("published_date")
    @Nullable
    private final Integer publishedDate;

    @b("push_enabled")
    @Nullable
    private final BaseBoolInt pushEnabled;

    @b("screen_name")
    @Nullable
    private final String screenName;

    @b("screen_orientation")
    @Nullable
    private final Integer screenOrientation;

    @b("section")
    @Nullable
    private final String section;

    @b("title")
    @NotNull
    private final String title;

    @b("type")
    @NotNull
    private final AppsAppType type;

    public AppsApp(@NotNull AppsAppType type, int i, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num, @Nullable List<Integer> list, @Nullable Integer num2, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Integer num4, @Nullable AppsAppLeaderboardType appsAppLeaderboardType, @Nullable Integer num5, @Nullable String str7, @Nullable Integer num6, @Nullable String str8, @Nullable String str9, @Nullable Integer num7, @Nullable Boolean bool2, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.type = type;
        this.f15128id = i;
        this.title = title;
        this.authorUrl = str;
        this.banner1120 = str2;
        this.banner560 = str3;
        this.icon16 = str4;
        this.isNew = baseBoolInt;
        this.pushEnabled = baseBoolInt2;
        this.screenOrientation = num;
        this.friends = list;
        this.catalogPosition = num2;
        this.description = str5;
        this.genre = str6;
        this.genreId = num3;
        this.international = bool;
        this.isInCatalog = num4;
        this.leaderboardType = appsAppLeaderboardType;
        this.membersCount = num5;
        this.platformId = str7;
        this.publishedDate = num6;
        this.screenName = str8;
        this.section = str9;
        this.authorOwnerId = num7;
        this.isInstalled = bool2;
        this.icon139 = str10;
        this.icon150 = str11;
        this.icon278 = str12;
        this.icon576 = str13;
        this.backgroundLoaderColor = str14;
        this.loaderIcon = str15;
        this.icon75 = str16;
        this.openInExternalBrowser = bool3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppsApp copy$default(AppsApp appsApp, AppsAppType appsAppType, int i, String str, String str2, String str3, String str4, String str5, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num, List list, Integer num2, String str6, String str7, Integer num3, Boolean bool, Integer num4, AppsAppLeaderboardType appsAppLeaderboardType, Integer num5, String str8, Integer num6, String str9, String str10, Integer num7, Boolean bool2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool3, int i10, int i11, Object obj) {
        Boolean bool4;
        String str18;
        Integer num8;
        AppsAppLeaderboardType appsAppLeaderboardType2;
        Integer num9;
        String str19;
        Integer num10;
        String str20;
        String str21;
        Integer num11;
        Boolean bool5;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        Integer num12;
        int i12;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        BaseBoolInt baseBoolInt3;
        BaseBoolInt baseBoolInt4;
        Integer num13;
        List list2;
        Integer num14;
        String str33;
        String str34;
        Boolean bool6;
        AppsAppType appsAppType2 = (i10 & 1) != 0 ? appsApp.type : appsAppType;
        int i13 = (i10 & 2) != 0 ? appsApp.f15128id : i;
        String str35 = (i10 & 4) != 0 ? appsApp.title : str;
        String str36 = (i10 & 8) != 0 ? appsApp.authorUrl : str2;
        String str37 = (i10 & 16) != 0 ? appsApp.banner1120 : str3;
        String str38 = (i10 & 32) != 0 ? appsApp.banner560 : str4;
        String str39 = (i10 & 64) != 0 ? appsApp.icon16 : str5;
        BaseBoolInt baseBoolInt5 = (i10 & 128) != 0 ? appsApp.isNew : baseBoolInt;
        BaseBoolInt baseBoolInt6 = (i10 & 256) != 0 ? appsApp.pushEnabled : baseBoolInt2;
        Integer num15 = (i10 & 512) != 0 ? appsApp.screenOrientation : num;
        List list3 = (i10 & 1024) != 0 ? appsApp.friends : list;
        Integer num16 = (i10 & 2048) != 0 ? appsApp.catalogPosition : num2;
        String str40 = (i10 & 4096) != 0 ? appsApp.description : str6;
        String str41 = (i10 & 8192) != 0 ? appsApp.genre : str7;
        AppsAppType appsAppType3 = appsAppType2;
        Integer num17 = (i10 & 16384) != 0 ? appsApp.genreId : num3;
        Boolean bool7 = (i10 & 32768) != 0 ? appsApp.international : bool;
        Integer num18 = (i10 & 65536) != 0 ? appsApp.isInCatalog : num4;
        AppsAppLeaderboardType appsAppLeaderboardType3 = (i10 & 131072) != 0 ? appsApp.leaderboardType : appsAppLeaderboardType;
        Integer num19 = (i10 & 262144) != 0 ? appsApp.membersCount : num5;
        String str42 = (i10 & 524288) != 0 ? appsApp.platformId : str8;
        Integer num20 = (i10 & 1048576) != 0 ? appsApp.publishedDate : num6;
        String str43 = (i10 & 2097152) != 0 ? appsApp.screenName : str9;
        String str44 = (i10 & 4194304) != 0 ? appsApp.section : str10;
        Integer num21 = (i10 & 8388608) != 0 ? appsApp.authorOwnerId : num7;
        Boolean bool8 = (i10 & 16777216) != 0 ? appsApp.isInstalled : bool2;
        String str45 = (i10 & 33554432) != 0 ? appsApp.icon139 : str11;
        String str46 = (i10 & 67108864) != 0 ? appsApp.icon150 : str12;
        String str47 = (i10 & 134217728) != 0 ? appsApp.icon278 : str13;
        String str48 = (i10 & 268435456) != 0 ? appsApp.icon576 : str14;
        String str49 = (i10 & 536870912) != 0 ? appsApp.backgroundLoaderColor : str15;
        String str50 = (i10 & 1073741824) != 0 ? appsApp.loaderIcon : str16;
        String str51 = (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? appsApp.icon75 : str17;
        if ((i11 & 1) != 0) {
            str18 = str51;
            bool4 = appsApp.openInExternalBrowser;
            appsAppLeaderboardType2 = appsAppLeaderboardType3;
            num9 = num19;
            str19 = str42;
            num10 = num20;
            str20 = str43;
            str21 = str44;
            num11 = num21;
            bool5 = bool8;
            str22 = str45;
            str23 = str46;
            str24 = str47;
            str25 = str48;
            str26 = str49;
            str27 = str50;
            num12 = num17;
            str28 = str35;
            str29 = str36;
            str30 = str37;
            str31 = str38;
            str32 = str39;
            baseBoolInt3 = baseBoolInt5;
            baseBoolInt4 = baseBoolInt6;
            num13 = num15;
            list2 = list3;
            num14 = num16;
            str33 = str40;
            str34 = str41;
            bool6 = bool7;
            num8 = num18;
            i12 = i13;
        } else {
            bool4 = bool3;
            str18 = str51;
            num8 = num18;
            appsAppLeaderboardType2 = appsAppLeaderboardType3;
            num9 = num19;
            str19 = str42;
            num10 = num20;
            str20 = str43;
            str21 = str44;
            num11 = num21;
            bool5 = bool8;
            str22 = str45;
            str23 = str46;
            str24 = str47;
            str25 = str48;
            str26 = str49;
            str27 = str50;
            num12 = num17;
            i12 = i13;
            str28 = str35;
            str29 = str36;
            str30 = str37;
            str31 = str38;
            str32 = str39;
            baseBoolInt3 = baseBoolInt5;
            baseBoolInt4 = baseBoolInt6;
            num13 = num15;
            list2 = list3;
            num14 = num16;
            str33 = str40;
            str34 = str41;
            bool6 = bool7;
        }
        return appsApp.copy(appsAppType3, i12, str28, str29, str30, str31, str32, baseBoolInt3, baseBoolInt4, num13, list2, num14, str33, str34, num12, bool6, num8, appsAppLeaderboardType2, num9, str19, num10, str20, str21, num11, bool5, str22, str23, str24, str25, str26, str27, str18, bool4);
    }

    @NotNull
    public final AppsAppType component1() {
        return this.type;
    }

    @Nullable
    public final Integer component10() {
        return this.screenOrientation;
    }

    @Nullable
    public final List<Integer> component11() {
        return this.friends;
    }

    @Nullable
    public final Integer component12() {
        return this.catalogPosition;
    }

    @Nullable
    public final String component13() {
        return this.description;
    }

    @Nullable
    public final String component14() {
        return this.genre;
    }

    @Nullable
    public final Integer component15() {
        return this.genreId;
    }

    @Nullable
    public final Boolean component16() {
        return this.international;
    }

    @Nullable
    public final Integer component17() {
        return this.isInCatalog;
    }

    @Nullable
    public final AppsAppLeaderboardType component18() {
        return this.leaderboardType;
    }

    @Nullable
    public final Integer component19() {
        return this.membersCount;
    }

    public final int component2() {
        return this.f15128id;
    }

    @Nullable
    public final String component20() {
        return this.platformId;
    }

    @Nullable
    public final Integer component21() {
        return this.publishedDate;
    }

    @Nullable
    public final String component22() {
        return this.screenName;
    }

    @Nullable
    public final String component23() {
        return this.section;
    }

    @Nullable
    public final Integer component24() {
        return this.authorOwnerId;
    }

    @Nullable
    public final Boolean component25() {
        return this.isInstalled;
    }

    @Nullable
    public final String component26() {
        return this.icon139;
    }

    @Nullable
    public final String component27() {
        return this.icon150;
    }

    @Nullable
    public final String component28() {
        return this.icon278;
    }

    @Nullable
    public final String component29() {
        return this.icon576;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @Nullable
    public final String component30() {
        return this.backgroundLoaderColor;
    }

    @Nullable
    public final String component31() {
        return this.loaderIcon;
    }

    @Nullable
    public final String component32() {
        return this.icon75;
    }

    @Nullable
    public final Boolean component33() {
        return this.openInExternalBrowser;
    }

    @Nullable
    public final String component4() {
        return this.authorUrl;
    }

    @Nullable
    public final String component5() {
        return this.banner1120;
    }

    @Nullable
    public final String component6() {
        return this.banner560;
    }

    @Nullable
    public final String component7() {
        return this.icon16;
    }

    @Nullable
    public final BaseBoolInt component8() {
        return this.isNew;
    }

    @Nullable
    public final BaseBoolInt component9() {
        return this.pushEnabled;
    }

    @NotNull
    public final AppsApp copy(@NotNull AppsAppType type, int i, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable Integer num, @Nullable List<Integer> list, @Nullable Integer num2, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Integer num4, @Nullable AppsAppLeaderboardType appsAppLeaderboardType, @Nullable Integer num5, @Nullable String str7, @Nullable Integer num6, @Nullable String str8, @Nullable String str9, @Nullable Integer num7, @Nullable Boolean bool2, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable Boolean bool3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        return new AppsApp(type, i, title, str, str2, str3, str4, baseBoolInt, baseBoolInt2, num, list, num2, str5, str6, num3, bool, num4, appsAppLeaderboardType, num5, str7, num6, str8, str9, num7, bool2, str10, str11, str12, str13, str14, str15, str16, bool3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsApp)) {
            return false;
        }
        AppsApp appsApp = (AppsApp) obj;
        return this.type == appsApp.type && this.f15128id == appsApp.f15128id && Intrinsics.a(this.title, appsApp.title) && Intrinsics.a(this.authorUrl, appsApp.authorUrl) && Intrinsics.a(this.banner1120, appsApp.banner1120) && Intrinsics.a(this.banner560, appsApp.banner560) && Intrinsics.a(this.icon16, appsApp.icon16) && this.isNew == appsApp.isNew && this.pushEnabled == appsApp.pushEnabled && Intrinsics.a(this.screenOrientation, appsApp.screenOrientation) && Intrinsics.a(this.friends, appsApp.friends) && Intrinsics.a(this.catalogPosition, appsApp.catalogPosition) && Intrinsics.a(this.description, appsApp.description) && Intrinsics.a(this.genre, appsApp.genre) && Intrinsics.a(this.genreId, appsApp.genreId) && Intrinsics.a(this.international, appsApp.international) && Intrinsics.a(this.isInCatalog, appsApp.isInCatalog) && this.leaderboardType == appsApp.leaderboardType && Intrinsics.a(this.membersCount, appsApp.membersCount) && Intrinsics.a(this.platformId, appsApp.platformId) && Intrinsics.a(this.publishedDate, appsApp.publishedDate) && Intrinsics.a(this.screenName, appsApp.screenName) && Intrinsics.a(this.section, appsApp.section) && Intrinsics.a(this.authorOwnerId, appsApp.authorOwnerId) && Intrinsics.a(this.isInstalled, appsApp.isInstalled) && Intrinsics.a(this.icon139, appsApp.icon139) && Intrinsics.a(this.icon150, appsApp.icon150) && Intrinsics.a(this.icon278, appsApp.icon278) && Intrinsics.a(this.icon576, appsApp.icon576) && Intrinsics.a(this.backgroundLoaderColor, appsApp.backgroundLoaderColor) && Intrinsics.a(this.loaderIcon, appsApp.loaderIcon) && Intrinsics.a(this.icon75, appsApp.icon75) && Intrinsics.a(this.openInExternalBrowser, appsApp.openInExternalBrowser);
    }

    @Nullable
    public final Integer getAuthorOwnerId() {
        return this.authorOwnerId;
    }

    @Nullable
    public final String getAuthorUrl() {
        return this.authorUrl;
    }

    @Nullable
    public final String getBackgroundLoaderColor() {
        return this.backgroundLoaderColor;
    }

    @Nullable
    public final String getBanner1120() {
        return this.banner1120;
    }

    @Nullable
    public final String getBanner560() {
        return this.banner560;
    }

    @Nullable
    public final Integer getCatalogPosition() {
        return this.catalogPosition;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final List<Integer> getFriends() {
        return this.friends;
    }

    @Nullable
    public final String getGenre() {
        return this.genre;
    }

    @Nullable
    public final Integer getGenreId() {
        return this.genreId;
    }

    @Nullable
    public final String getIcon139() {
        return this.icon139;
    }

    @Nullable
    public final String getIcon150() {
        return this.icon150;
    }

    @Nullable
    public final String getIcon16() {
        return this.icon16;
    }

    @Nullable
    public final String getIcon278() {
        return this.icon278;
    }

    @Nullable
    public final String getIcon576() {
        return this.icon576;
    }

    @Nullable
    public final String getIcon75() {
        return this.icon75;
    }

    public final int getId() {
        return this.f15128id;
    }

    @Nullable
    public final Boolean getInternational() {
        return this.international;
    }

    @Nullable
    public final AppsAppLeaderboardType getLeaderboardType() {
        return this.leaderboardType;
    }

    @Nullable
    public final String getLoaderIcon() {
        return this.loaderIcon;
    }

    @Nullable
    public final Integer getMembersCount() {
        return this.membersCount;
    }

    @Nullable
    public final Boolean getOpenInExternalBrowser() {
        return this.openInExternalBrowser;
    }

    @Nullable
    public final String getPlatformId() {
        return this.platformId;
    }

    @Nullable
    public final Integer getPublishedDate() {
        return this.publishedDate;
    }

    @Nullable
    public final BaseBoolInt getPushEnabled() {
        return this.pushEnabled;
    }

    @Nullable
    public final String getScreenName() {
        return this.screenName;
    }

    @Nullable
    public final Integer getScreenOrientation() {
        return this.screenOrientation;
    }

    @Nullable
    public final String getSection() {
        return this.section;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final AppsAppType getType() {
        return this.type;
    }

    public int hashCode() {
        int iE = a.e(u.g(this.f15128id, this.type.hashCode() * 31, 31), 31, this.title);
        String str = this.authorUrl;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.banner1120;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.banner560;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon16;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.isNew;
        int iHashCode5 = (iHashCode4 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.pushEnabled;
        int iHashCode6 = (iHashCode5 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        Integer num = this.screenOrientation;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.friends;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.catalogPosition;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.genre;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.genreId;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.international;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.isInCatalog;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        AppsAppLeaderboardType appsAppLeaderboardType = this.leaderboardType;
        int iHashCode15 = (iHashCode14 + (appsAppLeaderboardType == null ? 0 : appsAppLeaderboardType.hashCode())) * 31;
        Integer num5 = this.membersCount;
        int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str7 = this.platformId;
        int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num6 = this.publishedDate;
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str8 = this.screenName;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.section;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num7 = this.authorOwnerId;
        int iHashCode21 = (iHashCode20 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool2 = this.isInstalled;
        int iHashCode22 = (iHashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str10 = this.icon139;
        int iHashCode23 = (iHashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.icon150;
        int iHashCode24 = (iHashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.icon278;
        int iHashCode25 = (iHashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.icon576;
        int iHashCode26 = (iHashCode25 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.backgroundLoaderColor;
        int iHashCode27 = (iHashCode26 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.loaderIcon;
        int iHashCode28 = (iHashCode27 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.icon75;
        int iHashCode29 = (iHashCode28 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool3 = this.openInExternalBrowser;
        return iHashCode29 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Integer isInCatalog() {
        return this.isInCatalog;
    }

    @Nullable
    public final Boolean isInstalled() {
        return this.isInstalled;
    }

    @Nullable
    public final BaseBoolInt isNew() {
        return this.isNew;
    }

    @NotNull
    public String toString() {
        AppsAppType appsAppType = this.type;
        int i = this.f15128id;
        String str = this.title;
        String str2 = this.authorUrl;
        String str3 = this.banner1120;
        String str4 = this.banner560;
        String str5 = this.icon16;
        BaseBoolInt baseBoolInt = this.isNew;
        BaseBoolInt baseBoolInt2 = this.pushEnabled;
        Integer num = this.screenOrientation;
        List<Integer> list = this.friends;
        Integer num2 = this.catalogPosition;
        String str6 = this.description;
        String str7 = this.genre;
        Integer num3 = this.genreId;
        Boolean bool = this.international;
        Integer num4 = this.isInCatalog;
        AppsAppLeaderboardType appsAppLeaderboardType = this.leaderboardType;
        Integer num5 = this.membersCount;
        String str8 = this.platformId;
        Integer num6 = this.publishedDate;
        String str9 = this.screenName;
        String str10 = this.section;
        Integer num7 = this.authorOwnerId;
        Boolean bool2 = this.isInstalled;
        String str11 = this.icon139;
        String str12 = this.icon150;
        String str13 = this.icon278;
        String str14 = this.icon576;
        String str15 = this.backgroundLoaderColor;
        String str16 = this.loaderIcon;
        String str17 = this.icon75;
        Boolean bool3 = this.openInExternalBrowser;
        StringBuilder sb2 = new StringBuilder("AppsApp(type=");
        sb2.append(appsAppType);
        sb2.append(", id=");
        sb2.append(i);
        sb2.append(", title=");
        o.t(sb2, str, ", authorUrl=", str2, ", banner1120=");
        o.t(sb2, str3, ", banner560=", str4, ", icon16=");
        sb2.append(str5);
        sb2.append(", isNew=");
        sb2.append(baseBoolInt);
        sb2.append(", pushEnabled=");
        sb2.append(baseBoolInt2);
        sb2.append(", screenOrientation=");
        sb2.append(num);
        sb2.append(", friends=");
        sb2.append(list);
        sb2.append(", catalogPosition=");
        sb2.append(num2);
        sb2.append(", description=");
        o.t(sb2, str6, ", genre=", str7, ", genreId=");
        sb2.append(num3);
        sb2.append(", international=");
        sb2.append(bool);
        sb2.append(", isInCatalog=");
        sb2.append(num4);
        sb2.append(", leaderboardType=");
        sb2.append(appsAppLeaderboardType);
        sb2.append(", membersCount=");
        pe.a.r(num5, ", platformId=", str8, ", publishedDate=", sb2);
        pe.a.r(num6, ", screenName=", str9, ", section=", sb2);
        a.r(num7, str10, ", authorOwnerId=", ", isInstalled=", sb2);
        sb2.append(bool2);
        sb2.append(", icon139=");
        sb2.append(str11);
        sb2.append(", icon150=");
        o.t(sb2, str12, ", icon278=", str13, ", icon576=");
        o.t(sb2, str14, ", backgroundLoaderColor=", str15, ", loaderIcon=");
        o.t(sb2, str16, ", icon75=", str17, ", openInExternalBrowser=");
        sb2.append(bool3);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ AppsApp(AppsAppType appsAppType, int i, String str, String str2, String str3, String str4, String str5, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, Integer num, List list, Integer num2, String str6, String str7, Integer num3, Boolean bool, Integer num4, AppsAppLeaderboardType appsAppLeaderboardType, Integer num5, String str8, Integer num6, String str9, String str10, Integer num7, Boolean bool2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(appsAppType, i, str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : baseBoolInt, (i10 & 256) != 0 ? null : baseBoolInt2, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : list, (i10 & 2048) != 0 ? null : num2, (i10 & 4096) != 0 ? null : str6, (i10 & 8192) != 0 ? null : str7, (i10 & 16384) != 0 ? null : num3, (32768 & i10) != 0 ? null : bool, (65536 & i10) != 0 ? null : num4, (131072 & i10) != 0 ? null : appsAppLeaderboardType, (262144 & i10) != 0 ? null : num5, (524288 & i10) != 0 ? null : str8, (1048576 & i10) != 0 ? null : num6, (2097152 & i10) != 0 ? null : str9, (4194304 & i10) != 0 ? null : str10, (8388608 & i10) != 0 ? null : num7, (16777216 & i10) != 0 ? null : bool2, (33554432 & i10) != 0 ? null : str11, (67108864 & i10) != 0 ? null : str12, (134217728 & i10) != 0 ? null : str13, (268435456 & i10) != 0 ? null : str14, (536870912 & i10) != 0 ? null : str15, (1073741824 & i10) != 0 ? null : str16, (i10 & VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR) != 0 ? null : str17, (i11 & 1) != 0 ? null : bool3);
    }
}
