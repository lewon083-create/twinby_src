package com.vk.sdk.api.users;

import com.appsflyer.AdRevenueScheme;
import com.google.gson.reflect.a;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.users.dto.UsersFields;
import com.vk.sdk.api.users.dto.UsersGetFollowersFieldsResponse;
import com.vk.sdk.api.users.dto.UsersGetFollowersNameCase;
import com.vk.sdk.api.users.dto.UsersGetNameCase;
import com.vk.sdk.api.users.dto.UsersGetSubscriptionsExtendedResponse;
import com.vk.sdk.api.users.dto.UsersGetSubscriptionsResponse;
import com.vk.sdk.api.users.dto.UsersReportType;
import com.vk.sdk.api.users.dto.UsersSearchResponse;
import com.vk.sdk.api.users.dto.UsersSearchSex;
import com.vk.sdk.api.users.dto.UsersSearchSort;
import com.vk.sdk.api.users.dto.UsersSearchStatus;
import com.vk.sdk.api.users.dto.UsersUserFull;
import io.sentry.TraceContext;
import io.sentry.protocol.Device;
import io.sentry.protocol.Geo;
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
public final class UsersService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest usersGet$default(UsersService usersService, List list, List list2, UsersGetNameCase usersGetNameCase, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            usersGetNameCase = null;
        }
        return usersService.usersGet(list, list2, usersGetNameCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: usersGet$lambda-0, reason: not valid java name */
    public static final List m518usersGet$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends UsersUserFull>>() { // from class: com.vk.sdk.api.users.UsersService$usersGet$1$typeToken$1
        }.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest usersGetFollowers$default(UsersService usersService, UserId userId, Integer num, Integer num2, List list, UsersGetFollowersNameCase usersGetFollowersNameCase, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            usersGetFollowersNameCase = null;
        }
        return usersService.usersGetFollowers(userId, num, num2, list, usersGetFollowersNameCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: usersGetFollowers$lambda-6, reason: not valid java name */
    public static final UsersGetFollowersFieldsResponse m519usersGetFollowers$lambda6(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UsersGetFollowersFieldsResponse) GsonHolder.INSTANCE.getGson().b(it, UsersGetFollowersFieldsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest usersGetSubscriptions$default(UsersService usersService, UserId userId, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return usersService.usersGetSubscriptions(userId, num, num2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: usersGetSubscriptions$lambda-14, reason: not valid java name */
    public static final UsersGetSubscriptionsResponse m520usersGetSubscriptions$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UsersGetSubscriptionsResponse) GsonHolder.INSTANCE.getGson().b(it, UsersGetSubscriptionsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest usersGetSubscriptionsExtended$default(UsersService usersService, UserId userId, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return usersService.usersGetSubscriptionsExtended(userId, num, num2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: usersGetSubscriptionsExtended$lambda-21, reason: not valid java name */
    public static final UsersGetSubscriptionsExtendedResponse m521usersGetSubscriptionsExtended$lambda21(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UsersGetSubscriptionsExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, UsersGetSubscriptionsExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest usersReport$default(UsersService usersService, UserId userId, UsersReportType usersReportType, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return usersService.usersReport(userId, usersReportType, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: usersReport$lambda-28, reason: not valid java name */
    public static final BaseOkResponse m522usersReport$lambda28(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: usersSearch$lambda-31, reason: not valid java name */
    public static final UsersSearchResponse m523usersSearch$lambda31(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UsersSearchResponse) GsonHolder.INSTANCE.getGson().b(it, UsersSearchResponse.class);
    }

    @NotNull
    public final VKRequest<List<UsersUserFull>> usersGet(@Nullable List<UserId> list, @Nullable List<? extends UsersFields> list2, @Nullable UsersGetNameCase usersGetNameCase) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("users.get", new qg.a(17));
        if (list != null) {
            NewApiRequest.addParam$default(newApiRequest, "user_ids", list, 0L, 0L, 12, (Object) null);
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
        if (usersGetNameCase == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("name_case", usersGetNameCase.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<UsersGetFollowersFieldsResponse> usersGetFollowers(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends UsersFields> list, @Nullable UsersGetFollowersNameCase usersGetFollowersNameCase) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("users.getFollowers", new qg.a(18));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 1000);
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
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (usersGetFollowersNameCase == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("name_case", usersGetFollowersNameCase.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<UsersGetSubscriptionsResponse> usersGetSubscriptions(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("users.getSubscriptions", new qg.a(16));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
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
    public final VKRequest<UsersGetSubscriptionsExtendedResponse> usersGetSubscriptionsExtended(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("users.getSubscriptions", new qg.a(14));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        newApiRequest.addParam("extended", true);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
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
    public final VKRequest<BaseOkResponse> usersReport(@NotNull UserId userId, @NotNull UsersReportType type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("users.report", new qg.a(19));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        newApiRequest.addParam("type", type.getValue());
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("comment", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<UsersSearchResponse> usersSearch(@Nullable String str, @Nullable UsersSearchSort usersSearchSort, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends UsersFields> list, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable UsersSearchSex usersSearchSex, @Nullable UsersSearchStatus usersSearchStatus, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable UserId userId, @Nullable List<String> list2) {
        NewApiRequest newApiRequest;
        ArrayList arrayList;
        NewApiRequest newApiRequest2 = new NewApiRequest("users.search", new qg.a(15));
        if (str != null) {
            newApiRequest2.addParam("q", str);
        }
        if (usersSearchSort != null) {
            newApiRequest2.addParam("sort", usersSearchSort.getValue());
        }
        if (num == null) {
            newApiRequest = newApiRequest2;
        } else {
            NewApiRequest.addParam$default(newApiRequest2, "offset", num.intValue(), 0, 0, 8, (Object) null);
            newApiRequest = newApiRequest2;
            Unit unit = Unit.f27471a;
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 1000);
            Unit unit2 = Unit.f27471a;
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends UsersFields> list3 = list;
            ArrayList arrayList2 = new ArrayList(t.j(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UsersFields) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, Geo.JsonKeys.CITY, num3.intValue(), 0, 0, 8, (Object) null);
            Unit unit3 = Unit.f27471a;
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, AdRevenueScheme.COUNTRY, num4.intValue(), 0, 0, 8, (Object) null);
            Unit unit4 = Unit.f27471a;
        }
        if (str2 != null) {
            newApiRequest.addParam("hometown", str2);
        }
        if (num5 != null) {
            NewApiRequest.addParam$default(newApiRequest, "university_country", num5.intValue(), 0, 0, 8, (Object) null);
            Unit unit5 = Unit.f27471a;
        }
        if (num6 != null) {
            NewApiRequest.addParam$default(newApiRequest, "university", num6.intValue(), 0, 0, 8, (Object) null);
            Unit unit6 = Unit.f27471a;
        }
        if (num7 != null) {
            NewApiRequest.addParam$default(newApiRequest, "university_year", num7.intValue(), 0, 0, 8, (Object) null);
            Unit unit7 = Unit.f27471a;
        }
        if (num8 != null) {
            NewApiRequest.addParam$default(newApiRequest, "university_faculty", num8.intValue(), 0, 0, 8, (Object) null);
            Unit unit8 = Unit.f27471a;
        }
        if (num9 != null) {
            NewApiRequest.addParam$default(newApiRequest, "university_chair", num9.intValue(), 0, 0, 8, (Object) null);
            Unit unit9 = Unit.f27471a;
        }
        if (usersSearchSex != null) {
            newApiRequest.addParam("sex", usersSearchSex.getValue());
        }
        if (usersSearchStatus != null) {
            newApiRequest.addParam("status", usersSearchStatus.getValue());
        }
        if (num10 != null) {
            NewApiRequest.addParam$default(newApiRequest, "age_from", num10.intValue(), 0, 0, 8, (Object) null);
            Unit unit10 = Unit.f27471a;
        }
        if (num11 != null) {
            NewApiRequest.addParam$default(newApiRequest, "age_to", num11.intValue(), 0, 0, 8, (Object) null);
            Unit unit11 = Unit.f27471a;
        }
        if (num12 != null) {
            NewApiRequest.addParam$default(newApiRequest, "birth_day", num12.intValue(), 0, 0, 8, (Object) null);
            Unit unit12 = Unit.f27471a;
        }
        if (num13 != null) {
            NewApiRequest.addParam$default(newApiRequest, "birth_month", num13.intValue(), 0, 0, 8, (Object) null);
            Unit unit13 = Unit.f27471a;
        }
        if (num14 != null) {
            newApiRequest.addParam("birth_year", num14.intValue(), 1900, 2100);
            Unit unit14 = Unit.f27471a;
        }
        if (bool != null) {
            newApiRequest.addParam(Device.JsonKeys.ONLINE, bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("has_photo", bool2.booleanValue());
        }
        if (num15 != null) {
            NewApiRequest.addParam$default(newApiRequest, "school_country", num15.intValue(), 0, 0, 8, (Object) null);
            Unit unit15 = Unit.f27471a;
        }
        if (num16 != null) {
            NewApiRequest.addParam$default(newApiRequest, "school_city", num16.intValue(), 0, 0, 8, (Object) null);
            Unit unit16 = Unit.f27471a;
        }
        if (num17 != null) {
            NewApiRequest.addParam$default(newApiRequest, "school_class", num17.intValue(), 0, 0, 8, (Object) null);
            Unit unit17 = Unit.f27471a;
        }
        if (num18 != null) {
            NewApiRequest.addParam$default(newApiRequest, "school", num18.intValue(), 0, 0, 8, (Object) null);
            Unit unit18 = Unit.f27471a;
        }
        if (num19 != null) {
            NewApiRequest.addParam$default(newApiRequest, "school_year", num19.intValue(), 0, 0, 8, (Object) null);
            Unit unit19 = Unit.f27471a;
        }
        if (str3 != null) {
            newApiRequest.addParam("religion", str3);
        }
        if (str4 != null) {
            newApiRequest.addParam("company", str4);
        }
        if (str5 != null) {
            newApiRequest.addParam("position", str5);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
            Unit unit20 = Unit.f27471a;
        }
        if (list2 != null) {
            newApiRequest.addParam("from_list", list2);
            Unit unit21 = Unit.f27471a;
        }
        Unit unit22 = Unit.f27471a;
        return newApiRequest;
    }
}
