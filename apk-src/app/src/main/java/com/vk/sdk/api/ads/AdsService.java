package com.vk.sdk.api.ads;

import com.appsflyer.AdRevenueScheme;
import com.google.gson.reflect.a;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.ads.dto.AdsAccount;
import com.vk.sdk.api.ads.dto.AdsAd;
import com.vk.sdk.api.ads.dto.AdsAdLayout;
import com.vk.sdk.api.ads.dto.AdsCampaign;
import com.vk.sdk.api.ads.dto.AdsCheckLinkLinkType;
import com.vk.sdk.api.ads.dto.AdsClient;
import com.vk.sdk.api.ads.dto.AdsCreateAdStatus;
import com.vk.sdk.api.ads.dto.AdsCreateCampaignStatus;
import com.vk.sdk.api.ads.dto.AdsCreateTargetGroupResponse;
import com.vk.sdk.api.ads.dto.AdsDemoStats;
import com.vk.sdk.api.ads.dto.AdsFloodStats;
import com.vk.sdk.api.ads.dto.AdsGetCampaignsFields;
import com.vk.sdk.api.ads.dto.AdsGetCategoriesResponse;
import com.vk.sdk.api.ads.dto.AdsGetDemographicsIdsType;
import com.vk.sdk.api.ads.dto.AdsGetDemographicsPeriod;
import com.vk.sdk.api.ads.dto.AdsGetLookalikeRequestsResponse;
import com.vk.sdk.api.ads.dto.AdsGetMusiciansResponse;
import com.vk.sdk.api.ads.dto.AdsGetPostsReachIdsType;
import com.vk.sdk.api.ads.dto.AdsGetStatisticsIdsType;
import com.vk.sdk.api.ads.dto.AdsGetStatisticsPeriod;
import com.vk.sdk.api.ads.dto.AdsGetStatisticsStatsFields;
import com.vk.sdk.api.ads.dto.AdsGetSuggestionsLang;
import com.vk.sdk.api.ads.dto.AdsGetSuggestionsSection;
import com.vk.sdk.api.ads.dto.AdsGetTargetingStatsAdFormat;
import com.vk.sdk.api.ads.dto.AdsGetUploadURLAdFormat;
import com.vk.sdk.api.ads.dto.AdsLinkStatus;
import com.vk.sdk.api.ads.dto.AdsPromotedPostReach;
import com.vk.sdk.api.ads.dto.AdsRejectReason;
import com.vk.sdk.api.ads.dto.AdsStats;
import com.vk.sdk.api.ads.dto.AdsTargSettings;
import com.vk.sdk.api.ads.dto.AdsTargStats;
import com.vk.sdk.api.ads.dto.AdsTargSuggestions;
import com.vk.sdk.api.ads.dto.AdsTargetGroup;
import com.vk.sdk.api.ads.dto.AdsUpdateOfficeUsersResult;
import com.vk.sdk.api.ads.dto.AdsUserSpecification;
import com.vk.sdk.api.ads.dto.AdsUserSpecificationCutted;
import com.vk.sdk.api.ads.dto.AdsUsers;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import gg.b;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import me.p;
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
public final class AdsService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsAddOfficeUsers$lambda-0, reason: not valid java name */
    public static final Boolean m53adsAddOfficeUsers$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Boolean) GsonHolder.INSTANCE.getGson().b(it, Boolean.TYPE);
    }

    public static /* synthetic */ VKRequest adsCheckLink$default(AdsService adsService, int i, AdsCheckLinkLinkType adsCheckLinkLinkType, String str, Integer num, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        return adsService.adsCheckLink(i, adsCheckLinkLinkType, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsCheckLink$lambda-2, reason: not valid java name */
    public static final AdsLinkStatus m54adsCheckLink$lambda2(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AdsLinkStatus) GsonHolder.INSTANCE.getGson().b(it, AdsLinkStatus.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsCreateAds$lambda-5, reason: not valid java name */
    public static final List m55adsCreateAds$lambda5(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsCreateAdStatus>>() { // from class: com.vk.sdk.api.ads.AdsService$adsCreateAds$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsCreateCampaigns$lambda-7, reason: not valid java name */
    public static final List m56adsCreateCampaigns$lambda7(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsCreateCampaignStatus>>() { // from class: com.vk.sdk.api.ads.AdsService$adsCreateCampaigns$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsCreateClients$lambda-9, reason: not valid java name */
    public static final List m57adsCreateClients$lambda9(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends Integer>>() { // from class: com.vk.sdk.api.ads.AdsService$adsCreateClients$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest adsCreateLookalikeRequest$default(AdsService adsService, int i, String str, Integer num, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return adsService.adsCreateLookalikeRequest(i, str, num, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsCreateLookalikeRequest$lambda-11, reason: not valid java name */
    public static final Unit m58adsCreateLookalikeRequest$lambda11(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    public static /* synthetic */ VKRequest adsCreateTargetGroup$default(AdsService adsService, int i, String str, int i10, Integer num, Integer num2, String str2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        if ((i11 & 16) != 0) {
            num2 = null;
        }
        if ((i11 & 32) != 0) {
            str2 = null;
        }
        return adsService.adsCreateTargetGroup(i, str, i10, num, num2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsCreateTargetGroup$lambda-15, reason: not valid java name */
    public static final AdsCreateTargetGroupResponse m59adsCreateTargetGroup$lambda15(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AdsCreateTargetGroupResponse) GsonHolder.INSTANCE.getGson().b(it, AdsCreateTargetGroupResponse.class);
    }

    public static /* synthetic */ VKRequest adsCreateTargetPixel$default(AdsService adsService, int i, String str, int i10, Integer num, String str2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        if ((i11 & 16) != 0) {
            str2 = null;
        }
        return adsService.adsCreateTargetPixel(i, str, i10, num, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsCreateTargetPixel$lambda-20, reason: not valid java name */
    public static final Unit m60adsCreateTargetPixel$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsDeleteAds$lambda-24, reason: not valid java name */
    public static final List m61adsDeleteAds$lambda24(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends Integer>>() { // from class: com.vk.sdk.api.ads.AdsService$adsDeleteAds$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsDeleteCampaigns$lambda-26, reason: not valid java name */
    public static final List m62adsDeleteCampaigns$lambda26(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends Integer>>() { // from class: com.vk.sdk.api.ads.AdsService$adsDeleteCampaigns$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsDeleteClients$lambda-28, reason: not valid java name */
    public static final List m63adsDeleteClients$lambda28(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends Integer>>() { // from class: com.vk.sdk.api.ads.AdsService$adsDeleteClients$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest adsDeleteTargetGroup$default(AdsService adsService, int i, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        return adsService.adsDeleteTargetGroup(i, i10, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsDeleteTargetGroup$lambda-30, reason: not valid java name */
    public static final BaseOkResponse m64adsDeleteTargetGroup$lambda30(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest adsDeleteTargetPixel$default(AdsService adsService, int i, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        return adsService.adsDeleteTargetPixel(i, i10, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsDeleteTargetPixel$lambda-33, reason: not valid java name */
    public static final Unit m65adsDeleteTargetPixel$lambda33(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetAccounts$lambda-36, reason: not valid java name */
    public static final List m66adsGetAccounts$lambda36(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objC = GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsAccount>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetAccounts$1$typeToken$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objC, "GsonHolder.gson.fromJson…sAccount>>(it, typeToken)");
        return (List) objC;
    }

    public static /* synthetic */ VKRequest adsGetAds$default(AdsService adsService, int i, String str, String str2, Integer num, Boolean bool, Boolean bool2, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            bool2 = null;
        }
        if ((i10 & 64) != 0) {
            num2 = null;
        }
        if ((i10 & 128) != 0) {
            num3 = null;
        }
        return adsService.adsGetAds(i, str, str2, num, bool, bool2, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetAds$lambda-37, reason: not valid java name */
    public static final List m67adsGetAds$lambda37(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsAd>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetAds$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest adsGetAdsLayout$default(AdsService adsService, int i, Integer num, Boolean bool, Boolean bool2, String str, String str2, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            bool2 = null;
        }
        if ((i10 & 16) != 0) {
            str = null;
        }
        if ((i10 & 32) != 0) {
            str2 = null;
        }
        if ((i10 & 64) != 0) {
            num2 = null;
        }
        if ((i10 & 128) != 0) {
            num3 = null;
        }
        return adsService.adsGetAdsLayout(i, num, bool, bool2, str, str2, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetAdsLayout$lambda-46, reason: not valid java name */
    public static final List m68adsGetAdsLayout$lambda46(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsAdLayout>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetAdsLayout$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest adsGetAdsTargeting$default(AdsService adsService, int i, String str, String str2, Integer num, Boolean bool, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            num2 = null;
        }
        if ((i10 & 64) != 0) {
            num3 = null;
        }
        return adsService.adsGetAdsTargeting(i, str, str2, num, bool, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetAdsTargeting$lambda-55, reason: not valid java name */
    public static final List m69adsGetAdsTargeting$lambda55(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsTargSettings>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetAdsTargeting$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetBudget$lambda-63, reason: not valid java name */
    public static final Integer m70adsGetBudget$lambda63(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest adsGetCampaigns$default(AdsService adsService, int i, Integer num, Boolean bool, String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            list = null;
        }
        return adsService.adsGetCampaigns(i, num, bool, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetCampaigns$lambda-65, reason: not valid java name */
    public static final List m71adsGetCampaigns$lambda65(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsCampaign>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetCampaigns$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest adsGetCategories$default(AdsService adsService, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return adsService.adsGetCategories(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetCategories$lambda-72, reason: not valid java name */
    public static final AdsGetCategoriesResponse m72adsGetCategories$lambda72(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AdsGetCategoriesResponse) GsonHolder.INSTANCE.getGson().b(it, AdsGetCategoriesResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetClients$lambda-75, reason: not valid java name */
    public static final List m73adsGetClients$lambda75(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsClient>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetClients$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetDemographics$lambda-77, reason: not valid java name */
    public static final List m74adsGetDemographics$lambda77(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsDemoStats>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetDemographics$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetFloodStats$lambda-79, reason: not valid java name */
    public static final AdsFloodStats m75adsGetFloodStats$lambda79(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AdsFloodStats) GsonHolder.INSTANCE.getGson().b(it, AdsFloodStats.class);
    }

    public static /* synthetic */ VKRequest adsGetLookalikeRequests$default(AdsService adsService, int i, Integer num, String str, Integer num2, Integer num3, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        if ((i10 & 16) != 0) {
            num3 = null;
        }
        if ((i10 & 32) != 0) {
            str2 = null;
        }
        return adsService.adsGetLookalikeRequests(i, num, str, num2, num3, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetLookalikeRequests$lambda-81, reason: not valid java name */
    public static final AdsGetLookalikeRequestsResponse m76adsGetLookalikeRequests$lambda81(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AdsGetLookalikeRequestsResponse) GsonHolder.INSTANCE.getGson().b(it, AdsGetLookalikeRequestsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetMusicians$lambda-88, reason: not valid java name */
    public static final AdsGetMusiciansResponse m77adsGetMusicians$lambda88(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AdsGetMusiciansResponse) GsonHolder.INSTANCE.getGson().b(it, AdsGetMusiciansResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetMusiciansByIds$lambda-90, reason: not valid java name */
    public static final AdsGetMusiciansResponse m78adsGetMusiciansByIds$lambda90(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AdsGetMusiciansResponse) GsonHolder.INSTANCE.getGson().b(it, AdsGetMusiciansResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetOfficeUsers$lambda-92, reason: not valid java name */
    public static final List m79adsGetOfficeUsers$lambda92(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsUsers>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetOfficeUsers$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetPostsReach$lambda-94, reason: not valid java name */
    public static final List m80adsGetPostsReach$lambda94(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsPromotedPostReach>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetPostsReach$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetRejectionReason$lambda-96, reason: not valid java name */
    public static final AdsRejectReason m81adsGetRejectionReason$lambda96(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AdsRejectReason) GsonHolder.INSTANCE.getGson().b(it, AdsRejectReason.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetStatistics$lambda-98, reason: not valid java name */
    public static final List m82adsGetStatistics$lambda98(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsStats>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetStatistics$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest adsGetSuggestions$default(AdsService adsService, AdsGetSuggestionsSection adsGetSuggestionsSection, String str, String str2, Integer num, String str3, AdsGetSuggestionsLang adsGetSuggestionsLang, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            adsGetSuggestionsLang = null;
        }
        return adsService.adsGetSuggestions(adsGetSuggestionsSection, str, str2, num, str3, adsGetSuggestionsLang);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetSuggestions$lambda-102, reason: not valid java name */
    public static final List m83adsGetSuggestions$lambda102(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsTargSuggestions>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetSuggestions$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest adsGetTargetGroups$default(AdsService adsService, int i, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return adsService.adsGetTargetGroups(i, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetTargetGroups$lambda-109, reason: not valid java name */
    public static final List m84adsGetTargetGroups$lambda109(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsTargetGroup>>() { // from class: com.vk.sdk.api.ads.AdsService$adsGetTargetGroups$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest adsGetTargetPixels$default(AdsService adsService, int i, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return adsService.adsGetTargetPixels(i, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetTargetPixels$lambda-112, reason: not valid java name */
    public static final Unit m85adsGetTargetPixels$lambda112(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetTargetingStats$lambda-115, reason: not valid java name */
    public static final AdsTargStats m86adsGetTargetingStats$lambda115(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AdsTargStats) GsonHolder.INSTANCE.getGson().b(it, AdsTargStats.class);
    }

    public static /* synthetic */ VKRequest adsGetUploadURL$default(AdsService adsService, AdsGetUploadURLAdFormat adsGetUploadURLAdFormat, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return adsService.adsGetUploadURL(adsGetUploadURLAdFormat, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetUploadURL$lambda-128, reason: not valid java name */
    public static final String m87adsGetUploadURL$lambda128(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (String) GsonHolder.INSTANCE.getGson().b(it, String.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsGetVideoUploadURL$lambda-131, reason: not valid java name */
    public static final String m88adsGetVideoUploadURL$lambda131(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, String.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson(it, String::class.java)");
        return (String) objB;
    }

    public static /* synthetic */ VKRequest adsImportTargetContacts$default(AdsService adsService, int i, int i10, String str, Integer num, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        return adsService.adsImportTargetContacts(i, i10, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsImportTargetContacts$lambda-132, reason: not valid java name */
    public static final Integer m89adsImportTargetContacts$lambda132(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsRemoveOfficeUsers$lambda-135, reason: not valid java name */
    public static final Boolean m90adsRemoveOfficeUsers$lambda135(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Boolean) GsonHolder.INSTANCE.getGson().b(it, Boolean.TYPE);
    }

    public static /* synthetic */ VKRequest adsRemoveTargetContacts$default(AdsService adsService, int i, int i10, String str, Integer num, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        return adsService.adsRemoveTargetContacts(i, i10, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsRemoveTargetContacts$lambda-137, reason: not valid java name */
    public static final Unit m91adsRemoveTargetContacts$lambda137(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    public static /* synthetic */ VKRequest adsSaveLookalikeRequestResult$default(AdsService adsService, int i, int i10, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            num = null;
        }
        return adsService.adsSaveLookalikeRequestResult(i, i10, i11, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsSaveLookalikeRequestResult$lambda-140, reason: not valid java name */
    public static final Unit m92adsSaveLookalikeRequestResult$lambda140(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    public static /* synthetic */ VKRequest adsShareTargetGroup$default(AdsService adsService, int i, int i10, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            num2 = null;
        }
        return adsService.adsShareTargetGroup(i, i10, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsShareTargetGroup$lambda-143, reason: not valid java name */
    public static final Unit m93adsShareTargetGroup$lambda143(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsUpdateAds$lambda-147, reason: not valid java name */
    public static final List m94adsUpdateAds$lambda147(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends Integer>>() { // from class: com.vk.sdk.api.ads.AdsService$adsUpdateAds$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsUpdateCampaigns$lambda-149, reason: not valid java name */
    public static final Integer m95adsUpdateCampaigns$lambda149(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsUpdateClients$lambda-151, reason: not valid java name */
    public static final Integer m96adsUpdateClients$lambda151(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsUpdateOfficeUsers$lambda-153, reason: not valid java name */
    public static final List m97adsUpdateOfficeUsers$lambda153(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AdsUpdateOfficeUsersResult>>() { // from class: com.vk.sdk.api.ads.AdsService$adsUpdateOfficeUsers$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest adsUpdateTargetGroup$default(AdsService adsService, int i, int i10, String str, int i11, Integer num, String str2, Integer num2, String str3, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            num = null;
        }
        if ((i12 & 32) != 0) {
            str2 = null;
        }
        if ((i12 & 64) != 0) {
            num2 = null;
        }
        if ((i12 & 128) != 0) {
            str3 = null;
        }
        return adsService.adsUpdateTargetGroup(i, i10, str, i11, num, str2, num2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsUpdateTargetGroup$lambda-155, reason: not valid java name */
    public static final BaseOkResponse m98adsUpdateTargetGroup$lambda155(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest adsUpdateTargetPixel$default(AdsService adsService, int i, int i10, String str, int i11, Integer num, String str2, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            num = null;
        }
        if ((i12 & 32) != 0) {
            str2 = null;
        }
        return adsService.adsUpdateTargetPixel(i, i10, str, i11, num, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adsUpdateTargetPixel$lambda-161, reason: not valid java name */
    public static final Unit m99adsUpdateTargetPixel$lambda161(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    @NotNull
    public final VKRequest<Boolean> adsAddOfficeUsers(int i, @NotNull List<AdsUserSpecificationCutted> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        NewApiRequest newApiRequest = new NewApiRequest("ads.addOfficeUsers", new hf.a(12));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("data", GsonHolder.INSTANCE.getGson().g(data));
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AdsLinkStatus> adsCheckLink(int i, @NotNull AdsCheckLinkLinkType linkType, @NotNull String linkUrl, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        NewApiRequest newApiRequest = new NewApiRequest("ads.checkLink", new hf.a(2));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("link_type", linkType.getValue());
        newApiRequest.addParam("link_url", linkUrl);
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("campaign_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsCreateAdStatus>> adsCreateAds(int i, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        NewApiRequest newApiRequest = new NewApiRequest("ads.createAds", new hf.a(11));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("data", data);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsCreateCampaignStatus>> adsCreateCampaigns(int i, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        NewApiRequest newApiRequest = new NewApiRequest("ads.createCampaigns", new hf.a(8));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("data", data);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<Integer>> adsCreateClients(int i, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        NewApiRequest newApiRequest = new NewApiRequest("ads.createClients", new hf.a(17));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("data", data);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> adsCreateLookalikeRequest(int i, @NotNull String sourceType, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        NewApiRequest newApiRequest = new NewApiRequest("ads.createLookalikeRequest", new b(8));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("source_type", sourceType);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("retargeting_group_id", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AdsCreateTargetGroupResponse> adsCreateTargetGroup(int i, @NotNull String name, int i10, @Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        NewApiRequest newApiRequest = new NewApiRequest("ads.createTargetGroup", new hf.a(20));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("name", name);
        newApiRequest.addParam("lifetime", i10, 1, 720);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("target_pixel_id", num2.intValue());
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("target_pixel_rules", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> adsCreateTargetPixel(int i, @NotNull String name, int i10, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        NewApiRequest newApiRequest = new NewApiRequest("ads.createTargetPixel", new b(7));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("name", name);
        newApiRequest.addParam("category_id", i10);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("domain", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<Integer>> adsDeleteAds(int i, @NotNull String ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        NewApiRequest newApiRequest = new NewApiRequest("ads.deleteAds", new b(24));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("ids", ids);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<Integer>> adsDeleteCampaigns(int i, @NotNull String ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        NewApiRequest newApiRequest = new NewApiRequest("ads.deleteCampaigns", new b(10));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("ids", ids);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<Integer>> adsDeleteClients(int i, @NotNull String ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        NewApiRequest newApiRequest = new NewApiRequest("ads.deleteClients", new hf.a(21));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("ids", ids);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> adsDeleteTargetGroup(int i, int i10, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.deleteTargetGroup", new hf.a(7));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("target_group_id", i10);
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("client_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> adsDeleteTargetPixel(int i, int i10, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.deleteTargetPixel", new hf.a(23));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("target_pixel_id", i10);
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("client_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsAccount>> adsGetAccounts() {
        return new NewApiRequest("ads.getAccounts", new b(25));
    }

    @NotNull
    public final VKRequest<List<AdsAd>> adsGetAds(int i, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getAds", new b(26));
        newApiRequest.addParam("account_id", i);
        if (str != null) {
            newApiRequest.addParam("ad_ids", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("campaign_ids", str2);
        }
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (bool != null) {
            newApiRequest.addParam("include_deleted", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("only_deleted", bool2.booleanValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("limit", num2.intValue());
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("offset", num3.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsAdLayout>> adsGetAdsLayout(int i, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getAdsLayout", new hf.a(15));
        newApiRequest.addParam("account_id", i);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (bool != null) {
            newApiRequest.addParam("include_deleted", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("only_deleted", bool2.booleanValue());
        }
        if (str != null) {
            newApiRequest.addParam("campaign_ids", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("ad_ids", str2);
        }
        if (num2 != null) {
            newApiRequest.addParam("limit", num2.intValue());
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("offset", num3.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsTargSettings>> adsGetAdsTargeting(int i, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getAdsTargeting", new hf.a(4));
        newApiRequest.addParam("account_id", i);
        if (str != null) {
            newApiRequest.addParam("ad_ids", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("campaign_ids", str2);
        }
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (bool != null) {
            newApiRequest.addParam("include_deleted", bool.booleanValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("limit", num2.intValue());
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("offset", num3.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> adsGetBudget(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getBudget", new b(17));
        newApiRequest.addParam("account_id", i);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsCampaign>> adsGetCampaigns(int i, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str, @Nullable List<? extends AdsGetCampaignsFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("ads.getCampaigns", new b(13));
        newApiRequest.addParam("account_id", i);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (bool != null) {
            newApiRequest.addParam("include_deleted", bool.booleanValue());
        }
        if (str != null) {
            newApiRequest.addParam("campaign_ids", str);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends AdsGetCampaignsFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AdsGetCampaignsFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AdsGetCategoriesResponse> adsGetCategories(@Nullable String str) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getCategories", new b(23));
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(VKApiCodes.PARAM_LANG, str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsClient>> adsGetClients(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getClients", new b(19));
        newApiRequest.addParam("account_id", i);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsDemoStats>> adsGetDemographics(int i, @NotNull AdsGetDemographicsIdsType idsType, @NotNull String ids, @NotNull AdsGetDemographicsPeriod period, @NotNull String dateFrom, @NotNull String dateTo) {
        Intrinsics.checkNotNullParameter(idsType, "idsType");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(dateFrom, "dateFrom");
        Intrinsics.checkNotNullParameter(dateTo, "dateTo");
        NewApiRequest newApiRequest = new NewApiRequest("ads.getDemographics", new b(15));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("ids_type", idsType.getValue());
        newApiRequest.addParam("ids", ids);
        newApiRequest.addParam("period", period.getValue());
        newApiRequest.addParam("date_from", dateFrom);
        newApiRequest.addParam("date_to", dateTo);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AdsFloodStats> adsGetFloodStats(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getFloodStats", new hf.a(6));
        newApiRequest.addParam("account_id", i);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AdsGetLookalikeRequestsResponse> adsGetLookalikeRequests(int i, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getLookalikeRequests", new hf.a(3));
        newApiRequest.addParam("account_id", i);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (str != null) {
            newApiRequest.addParam("requests_ids", str);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("limit", num3.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sort_by", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AdsGetMusiciansResponse> adsGetMusicians(@NotNull String artistName) {
        Intrinsics.checkNotNullParameter(artistName, "artistName");
        NewApiRequest newApiRequest = new NewApiRequest("ads.getMusicians", new b(20));
        NewApiRequest.addParam$default(newApiRequest, "artist_name", artistName, 3, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AdsGetMusiciansResponse> adsGetMusiciansByIds(@NotNull List<Integer> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        NewApiRequest newApiRequest = new NewApiRequest("ads.getMusiciansByIds", new hf.a(19));
        newApiRequest.addParam("ids", ids);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsUsers>> adsGetOfficeUsers(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getOfficeUsers", new hf.a(9));
        newApiRequest.addParam("account_id", i);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsPromotedPostReach>> adsGetPostsReach(int i, @NotNull AdsGetPostsReachIdsType idsType, @NotNull String ids) {
        Intrinsics.checkNotNullParameter(idsType, "idsType");
        Intrinsics.checkNotNullParameter(ids, "ids");
        NewApiRequest newApiRequest = new NewApiRequest("ads.getPostsReach", new b(12));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("ids_type", idsType.getValue());
        newApiRequest.addParam("ids", ids);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AdsRejectReason> adsGetRejectionReason(int i, int i10) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getRejectionReason", new hf.a(14));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("ad_id", i10);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsStats>> adsGetStatistics(int i, @NotNull AdsGetStatisticsIdsType idsType, @NotNull String ids, @NotNull AdsGetStatisticsPeriod period, @NotNull String dateFrom, @NotNull String dateTo, @Nullable List<? extends AdsGetStatisticsStatsFields> list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(idsType, "idsType");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(dateFrom, "dateFrom");
        Intrinsics.checkNotNullParameter(dateTo, "dateTo");
        NewApiRequest newApiRequest = new NewApiRequest("ads.getStatistics", new b(11));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("ids_type", idsType.getValue());
        newApiRequest.addParam("ids", ids);
        newApiRequest.addParam("period", period.getValue());
        newApiRequest.addParam("date_from", dateFrom);
        newApiRequest.addParam("date_to", dateTo);
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends AdsGetStatisticsStatsFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AdsGetStatisticsStatsFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("stats_fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsTargSuggestions>> adsGetSuggestions(@NotNull AdsGetSuggestionsSection section, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable AdsGetSuggestionsLang adsGetSuggestionsLang) {
        Intrinsics.checkNotNullParameter(section, "section");
        NewApiRequest newApiRequest = new NewApiRequest("ads.getSuggestions", new b(14));
        newApiRequest.addParam("section", section.getValue());
        if (str != null) {
            newApiRequest.addParam("ids", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("q", str2);
        }
        if (num != null) {
            newApiRequest.addParam(AdRevenueScheme.COUNTRY, num.intValue());
        }
        if (str3 != null) {
            newApiRequest.addParam("cities", str3);
        }
        if (adsGetSuggestionsLang == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(VKApiCodes.PARAM_LANG, adsGetSuggestionsLang.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsTargetGroup>> adsGetTargetGroups(int i, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getTargetGroups", new b(27));
        newApiRequest.addParam("account_id", i);
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("client_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> adsGetTargetPixels(int i, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.getTargetPixels", new hf.a(18));
        newApiRequest.addParam("account_id", i);
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("client_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AdsTargStats> adsGetTargetingStats(int i, @NotNull String linkUrl, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable AdsGetTargetingStatsAdFormat adsGetTargetingStatsAdFormat, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        NewApiRequest newApiRequest = new NewApiRequest("ads.getTargetingStats", new b(9));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("link_url", linkUrl);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (str != null) {
            newApiRequest.addParam("criteria", str);
        }
        if (num2 != null) {
            newApiRequest.addParam("ad_id", num2.intValue());
        }
        if (adsGetTargetingStatsAdFormat != null) {
            newApiRequest.addParam("ad_format", adsGetTargetingStatsAdFormat.getValue());
        }
        if (str2 != null) {
            newApiRequest.addParam("ad_platform", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("ad_platform_no_wall", str3);
        }
        if (str4 != null) {
            newApiRequest.addParam("ad_platform_no_ad_network", str4);
        }
        if (str5 != null) {
            newApiRequest.addParam("publisher_platforms", str5);
        }
        if (str6 != null) {
            newApiRequest.addParam("link_domain", str6);
        }
        if (bool != null) {
            newApiRequest.addParam("need_precise", bool.booleanValue());
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("impressions_limit_period", num3.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<String> adsGetUploadURL(@NotNull AdsGetUploadURLAdFormat adFormat, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        NewApiRequest newApiRequest = new NewApiRequest("ads.getUploadURL", new hf.a(10));
        newApiRequest.addParam("ad_format", adFormat.getValue());
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("icon", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<String> adsGetVideoUploadURL() {
        return new NewApiRequest("ads.getVideoUploadURL", new b(16));
    }

    @NotNull
    public final VKRequest<Integer> adsImportTargetContacts(int i, int i10, @NotNull String contacts, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        NewApiRequest newApiRequest = new NewApiRequest("ads.importTargetContacts", new b(29));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("target_group_id", i10);
        newApiRequest.addParam("contacts", contacts);
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("client_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Boolean> adsRemoveOfficeUsers(int i, @NotNull String ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        NewApiRequest newApiRequest = new NewApiRequest("ads.removeOfficeUsers", new hf.a(16));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("ids", ids);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> adsRemoveTargetContacts(int i, int i10, @NotNull String contacts, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        NewApiRequest newApiRequest = new NewApiRequest("ads.removeTargetContacts", new hf.a(5));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("target_group_id", i10);
        newApiRequest.addParam("contacts", contacts);
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("client_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> adsSaveLookalikeRequestResult(int i, int i10, int i11, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.saveLookalikeRequestResult", new b(18));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam(CommonUrlParts.REQUEST_ID, i10);
        newApiRequest.addParam("level", i11);
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("client_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> adsShareTargetGroup(int i, int i10, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("ads.shareTargetGroup", new b(28));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("target_group_id", i10);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("share_with_client_id", num2.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<Integer>> adsUpdateAds(int i, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        NewApiRequest newApiRequest = new NewApiRequest("ads.updateAds", new b(21));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("data", data);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> adsUpdateCampaigns(int i, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        NewApiRequest newApiRequest = new NewApiRequest("ads.updateCampaigns", new b(22));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("data", data);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> adsUpdateClients(int i, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        NewApiRequest newApiRequest = new NewApiRequest("ads.updateClients", new hf.a(1));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("data", data);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AdsUpdateOfficeUsersResult>> adsUpdateOfficeUsers(int i, @NotNull List<AdsUserSpecification> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        NewApiRequest newApiRequest = new NewApiRequest("ads.updateOfficeUsers", new hf.a(22));
        NewApiRequest.addParam$default(newApiRequest, "account_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("data", GsonHolder.INSTANCE.getGson().g(data));
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> adsUpdateTargetGroup(int i, int i10, @NotNull String name, int i11, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        NewApiRequest newApiRequest = new NewApiRequest("ads.updateTargetGroup", new hf.a(0));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("target_group_id", i10);
        newApiRequest.addParam("name", name);
        newApiRequest.addParam("lifetime", i11, 1, 720);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (str != null) {
            newApiRequest.addParam("domain", str);
        }
        if (num2 != null) {
            newApiRequest.addParam("target_pixel_id", num2.intValue());
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("target_pixel_rules", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> adsUpdateTargetPixel(int i, int i10, @NotNull String name, int i11, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        NewApiRequest newApiRequest = new NewApiRequest("ads.updateTargetPixel", new hf.a(13));
        newApiRequest.addParam("account_id", i);
        newApiRequest.addParam("target_pixel_id", i10);
        newApiRequest.addParam("name", name);
        newApiRequest.addParam("category_id", i11);
        if (num != null) {
            newApiRequest.addParam("client_id", num.intValue());
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("domain", str);
        return newApiRequest;
    }
}
