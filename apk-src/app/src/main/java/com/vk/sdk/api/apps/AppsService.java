package com.vk.sdk.api.apps;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.apps.dto.AppsCatalogList;
import com.vk.sdk.api.apps.dto.AppsGetCatalogFilter;
import com.vk.sdk.api.apps.dto.AppsGetCatalogSort;
import com.vk.sdk.api.apps.dto.AppsGetFriendsListExtendedResponse;
import com.vk.sdk.api.apps.dto.AppsGetFriendsListExtendedType;
import com.vk.sdk.api.apps.dto.AppsGetFriendsListResponse;
import com.vk.sdk.api.apps.dto.AppsGetFriendsListType;
import com.vk.sdk.api.apps.dto.AppsGetLeaderboardExtendedResponse;
import com.vk.sdk.api.apps.dto.AppsGetLeaderboardExtendedType;
import com.vk.sdk.api.apps.dto.AppsGetLeaderboardResponse;
import com.vk.sdk.api.apps.dto.AppsGetLeaderboardType;
import com.vk.sdk.api.apps.dto.AppsGetMiniAppPoliciesResponse;
import com.vk.sdk.api.apps.dto.AppsGetNameCase;
import com.vk.sdk.api.apps.dto.AppsGetPlatform;
import com.vk.sdk.api.apps.dto.AppsGetResponse;
import com.vk.sdk.api.apps.dto.AppsGetScopesResponse;
import com.vk.sdk.api.apps.dto.AppsGetScopesType;
import com.vk.sdk.api.apps.dto.AppsSendRequestType;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.users.dto.UsersFields;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.TraceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.a;
import kotlin.Metadata;
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
public final class AppsService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsDeleteAppRequests$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m108appsDeleteAppRequests$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson…seOkResponse::class.java)");
        return (BaseOkResponse) objB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest appsGet$default(AppsService appsService, Integer num, List list, AppsGetPlatform appsGetPlatform, Boolean bool, List list2, AppsGetNameCase appsGetNameCase, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            appsGetPlatform = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            appsGetNameCase = null;
        }
        return appsService.appsGet(num, list, appsGetPlatform, bool, list2, appsGetNameCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsGet$lambda-1, reason: not valid java name */
    public static final AppsGetResponse m109appsGet$lambda1(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppsGetResponse) GsonHolder.INSTANCE.getGson().b(it, AppsGetResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest appsGetCatalog$default(AppsService appsService, int i, AppsGetCatalogSort appsGetCatalogSort, Integer num, String str, Boolean bool, List list, String str2, String str3, Integer num2, AppsGetCatalogFilter appsGetCatalogFilter, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            appsGetCatalogSort = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            list = null;
        }
        if ((i10 & 64) != 0) {
            str2 = null;
        }
        if ((i10 & 128) != 0) {
            str3 = null;
        }
        if ((i10 & 256) != 0) {
            num2 = null;
        }
        if ((i10 & 512) != 0) {
            appsGetCatalogFilter = null;
        }
        return appsService.appsGetCatalog(i, appsGetCatalogSort, num, str, bool, list, str2, str3, num2, appsGetCatalogFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsGetCatalog$lambda-10, reason: not valid java name */
    public static final AppsCatalogList m110appsGetCatalog$lambda10(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppsCatalogList) GsonHolder.INSTANCE.getGson().b(it, AppsCatalogList.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest appsGetFriendsList$default(AppsService appsService, Integer num, Integer num2, AppsGetFriendsListType appsGetFriendsListType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            appsGetFriendsListType = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return appsService.appsGetFriendsList(num, num2, appsGetFriendsListType, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsGetFriendsList$lambda-22, reason: not valid java name */
    public static final AppsGetFriendsListResponse m111appsGetFriendsList$lambda22(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppsGetFriendsListResponse) GsonHolder.INSTANCE.getGson().b(it, AppsGetFriendsListResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest appsGetFriendsListExtended$default(AppsService appsService, Integer num, Integer num2, AppsGetFriendsListExtendedType appsGetFriendsListExtendedType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            appsGetFriendsListExtendedType = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return appsService.appsGetFriendsListExtended(num, num2, appsGetFriendsListExtendedType, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsGetFriendsListExtended$lambda-29, reason: not valid java name */
    public static final AppsGetFriendsListExtendedResponse m112appsGetFriendsListExtended$lambda29(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppsGetFriendsListExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, AppsGetFriendsListExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest appsGetLeaderboard$default(AppsService appsService, AppsGetLeaderboardType appsGetLeaderboardType, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return appsService.appsGetLeaderboard(appsGetLeaderboardType, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsGetLeaderboard$lambda-36, reason: not valid java name */
    public static final AppsGetLeaderboardResponse m113appsGetLeaderboard$lambda36(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppsGetLeaderboardResponse) GsonHolder.INSTANCE.getGson().b(it, AppsGetLeaderboardResponse.class);
    }

    public static /* synthetic */ VKRequest appsGetLeaderboardExtended$default(AppsService appsService, AppsGetLeaderboardExtendedType appsGetLeaderboardExtendedType, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return appsService.appsGetLeaderboardExtended(appsGetLeaderboardExtendedType, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsGetLeaderboardExtended$lambda-39, reason: not valid java name */
    public static final AppsGetLeaderboardExtendedResponse m114appsGetLeaderboardExtended$lambda39(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppsGetLeaderboardExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, AppsGetLeaderboardExtendedResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsGetMiniAppPolicies$lambda-42, reason: not valid java name */
    public static final AppsGetMiniAppPoliciesResponse m115appsGetMiniAppPolicies$lambda42(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppsGetMiniAppPoliciesResponse) GsonHolder.INSTANCE.getGson().b(it, AppsGetMiniAppPoliciesResponse.class);
    }

    public static /* synthetic */ VKRequest appsGetScopes$default(AppsService appsService, AppsGetScopesType appsGetScopesType, int i, Object obj) {
        if ((i & 1) != 0) {
            appsGetScopesType = null;
        }
        return appsService.appsGetScopes(appsGetScopesType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsGetScopes$lambda-44, reason: not valid java name */
    public static final AppsGetScopesResponse m116appsGetScopes$lambda44(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppsGetScopesResponse) GsonHolder.INSTANCE.getGson().b(it, AppsGetScopesResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsGetScore$lambda-47, reason: not valid java name */
    public static final Integer m117appsGetScore$lambda47(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    public static /* synthetic */ VKRequest appsPromoHasActiveGift$default(AppsService appsService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return appsService.appsPromoHasActiveGift(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsPromoHasActiveGift$lambda-49, reason: not valid java name */
    public static final BaseBoolInt m118appsPromoHasActiveGift$lambda49(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest appsPromoUseGift$default(AppsService appsService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return appsService.appsPromoUseGift(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsPromoUseGift$lambda-52, reason: not valid java name */
    public static final BaseBoolInt m119appsPromoUseGift$lambda52(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest appsSendRequest$default(AppsService appsService, UserId userId, String str, AppsSendRequestType appsSendRequestType, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            appsSendRequestType = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        return appsService.appsSendRequest(userId, str, appsSendRequestType, str2, str3, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appsSendRequest$lambda-55, reason: not valid java name */
    public static final Integer m120appsSendRequest$lambda55(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> appsDeleteAppRequests() {
        return new NewApiRequest("apps.deleteAppRequests", new a(3));
    }

    @NotNull
    public final VKRequest<AppsGetResponse> appsGet(@Nullable Integer num, @Nullable List<String> list, @Nullable AppsGetPlatform appsGetPlatform, @Nullable Boolean bool, @Nullable List<? extends UsersFields> list2, @Nullable AppsGetNameCase appsGetNameCase) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("apps.get", new a(0));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, CommonUrlParts.APP_ID, num.intValue(), 0, 0, 8, (Object) null);
        }
        if (list != null) {
            newApiRequest.addParam("app_ids", list);
        }
        if (appsGetPlatform != null) {
            newApiRequest.addParam("platform", appsGetPlatform.getValue());
        }
        if (bool != null) {
            newApiRequest.addParam("return_friends", bool.booleanValue());
        }
        if (list2 == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list3 = list2;
            arrayList = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (appsGetNameCase == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("name_case", appsGetNameCase.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppsCatalogList> appsGetCatalog(int i, @Nullable AppsGetCatalogSort appsGetCatalogSort, @Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable List<? extends UsersFields> list, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable AppsGetCatalogFilter appsGetCatalogFilter) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("apps.getCatalog", new a(1));
        NewApiRequest.addParam$default(newApiRequest, "count", i, 0, 0, 8, (Object) null);
        if (appsGetCatalogSort != null) {
            newApiRequest.addParam("sort", appsGetCatalogSort.getValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("platform", str);
        }
        if (bool != null) {
            newApiRequest.addParam("return_friends", bool.booleanValue());
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            ArrayList arrayList2 = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UsersFields) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (str2 != null) {
            newApiRequest.addParam("name_case", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("q", str3);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "genre_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (appsGetCatalogFilter == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("filter", appsGetCatalogFilter.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppsGetFriendsListResponse> appsGetFriendsList(@Nullable Integer num, @Nullable Integer num2, @Nullable AppsGetFriendsListType appsGetFriendsListType, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("apps.getFriendsList", new jf.a(28));
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, 5000);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (appsGetFriendsListType != null) {
            newApiRequest.addParam("type", appsGetFriendsListType.getValue());
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppsGetFriendsListExtendedResponse> appsGetFriendsListExtended(@Nullable Integer num, @Nullable Integer num2, @Nullable AppsGetFriendsListExtendedType appsGetFriendsListExtendedType, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("apps.getFriendsList", new jf.a(25));
        newApiRequest.addParam("extended", true);
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, 5000);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (appsGetFriendsListExtendedType != null) {
            newApiRequest.addParam("type", appsGetFriendsListExtendedType.getValue());
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppsGetLeaderboardResponse> appsGetLeaderboard(@NotNull AppsGetLeaderboardType type, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("apps.getLeaderboard", new a(4));
        newApiRequest.addParam("type", type.getValue());
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("global", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppsGetLeaderboardExtendedResponse> appsGetLeaderboardExtended(@NotNull AppsGetLeaderboardExtendedType type, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("apps.getLeaderboard", new a(5));
        newApiRequest.addParam("type", type.getValue());
        if (bool != null) {
            newApiRequest.addParam("global", bool.booleanValue());
        }
        newApiRequest.addParam("extended", true);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppsGetMiniAppPoliciesResponse> appsGetMiniAppPolicies(int i) {
        NewApiRequest newApiRequest = new NewApiRequest("apps.getMiniAppPolicies", new jf.a(26));
        NewApiRequest.addParam$default(newApiRequest, CommonUrlParts.APP_ID, i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppsGetScopesResponse> appsGetScopes(@Nullable AppsGetScopesType appsGetScopesType) {
        NewApiRequest newApiRequest = new NewApiRequest("apps.getScopes", new jf.a(29));
        if (appsGetScopesType == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("type", appsGetScopesType.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> appsGetScore(@NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("apps.getScore", new a(2));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> appsPromoHasActiveGift(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("apps.promoHasActiveGift", new a(6));
        NewApiRequest.addParam$default(newApiRequest, "promo_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> appsPromoUseGift(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("apps.promoUseGift", new jf.a(27));
        NewApiRequest.addParam$default(newApiRequest, "promo_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> appsSendRequest(@NotNull UserId userId, @Nullable String str, @Nullable AppsSendRequestType appsSendRequestType, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("apps.sendRequest", new a(7));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("text", str);
        }
        if (appsSendRequestType != null) {
            newApiRequest.addParam("type", appsSendRequestType.getValue());
        }
        if (str2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "name", str2, 0, 128, 4, (Object) null);
        }
        if (str3 != null) {
            newApiRequest.addParam("key", str3);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("separate", bool.booleanValue());
        return newApiRequest;
    }
}
