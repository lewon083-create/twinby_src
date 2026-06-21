package com.vk.sdk.api.account;

import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.account.dto.AccountAccountCounters;
import com.vk.sdk.api.account.dto.AccountChangePasswordResponse;
import com.vk.sdk.api.account.dto.AccountGetActiveOffersResponse;
import com.vk.sdk.api.account.dto.AccountGetBannedResponse;
import com.vk.sdk.api.account.dto.AccountGetCountersFilter;
import com.vk.sdk.api.account.dto.AccountGetInfoFields;
import com.vk.sdk.api.account.dto.AccountInfo;
import com.vk.sdk.api.account.dto.AccountPushSettings;
import com.vk.sdk.api.account.dto.AccountSaveProfileInfoBdateVisibility;
import com.vk.sdk.api.account.dto.AccountSaveProfileInfoRelation;
import com.vk.sdk.api.account.dto.AccountSaveProfileInfoResponse;
import com.vk.sdk.api.account.dto.AccountSaveProfileInfoSex;
import com.vk.sdk.api.account.dto.AccountSetInfoName;
import com.vk.sdk.api.account.dto.AccountUserSettings;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import e5.g;
import ff.a;
import io.sentry.ProfilingTraceData;
import io.sentry.TraceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
public final class AccountService {
    public static /* synthetic */ VKRequest accountBan$default(AccountService accountService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return accountService.accountBan(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountBan$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m35accountBan$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest accountChangePassword$default(AccountService accountService, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return accountService.accountChangePassword(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountChangePassword$lambda-3, reason: not valid java name */
    public static final AccountChangePasswordResponse m36accountChangePassword$lambda3(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AccountChangePasswordResponse) GsonHolder.INSTANCE.getGson().b(it, AccountChangePasswordResponse.class);
    }

    public static /* synthetic */ VKRequest accountGetActiveOffers$default(AccountService accountService, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return accountService.accountGetActiveOffers(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountGetActiveOffers$lambda-8, reason: not valid java name */
    public static final AccountGetActiveOffersResponse m37accountGetActiveOffers$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AccountGetActiveOffersResponse) GsonHolder.INSTANCE.getGson().b(it, AccountGetActiveOffersResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountGetAppPermissions$lambda-12, reason: not valid java name */
    public static final Integer m38accountGetAppPermissions$lambda12(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    public static /* synthetic */ VKRequest accountGetBanned$default(AccountService accountService, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return accountService.accountGetBanned(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountGetBanned$lambda-14, reason: not valid java name */
    public static final AccountGetBannedResponse m39accountGetBanned$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AccountGetBannedResponse) GsonHolder.INSTANCE.getGson().b(it, AccountGetBannedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest accountGetCounters$default(AccountService accountService, List list, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        return accountService.accountGetCounters(list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountGetCounters$lambda-18, reason: not valid java name */
    public static final AccountAccountCounters m40accountGetCounters$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AccountAccountCounters) GsonHolder.INSTANCE.getGson().b(it, AccountAccountCounters.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest accountGetInfo$default(AccountService accountService, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return accountService.accountGetInfo(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountGetInfo$lambda-23, reason: not valid java name */
    public static final AccountInfo m41accountGetInfo$lambda23(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AccountInfo) GsonHolder.INSTANCE.getGson().b(it, AccountInfo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountGetProfileInfo$lambda-27, reason: not valid java name */
    public static final AccountUserSettings m42accountGetProfileInfo$lambda27(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, AccountUserSettings.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson…UserSettings::class.java)");
        return (AccountUserSettings) objB;
    }

    public static /* synthetic */ VKRequest accountGetPushSettings$default(AccountService accountService, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return accountService.accountGetPushSettings(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountGetPushSettings$lambda-28, reason: not valid java name */
    public static final AccountPushSettings m43accountGetPushSettings$lambda28(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AccountPushSettings) GsonHolder.INSTANCE.getGson().b(it, AccountPushSettings.class);
    }

    public static /* synthetic */ VKRequest accountRegisterDevice$default(AccountService accountService, String str, String str2, String str3, Integer num, String str4, String str5, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        return accountService.accountRegisterDevice(str, str2, str3, num, str4, str5, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountRegisterDevice$lambda-31, reason: not valid java name */
    public static final BaseOkResponse m44accountRegisterDevice$lambda31(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountSaveProfileInfo$lambda-38, reason: not valid java name */
    public static final AccountSaveProfileInfoResponse m45accountSaveProfileInfo$lambda38(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AccountSaveProfileInfoResponse) GsonHolder.INSTANCE.getGson().b(it, AccountSaveProfileInfoResponse.class);
    }

    public static /* synthetic */ VKRequest accountSetInfo$default(AccountService accountService, AccountSetInfoName accountSetInfoName, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            accountSetInfoName = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return accountService.accountSetInfo(accountSetInfoName, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountSetInfo$lambda-54, reason: not valid java name */
    public static final BaseOkResponse m46accountSetInfo$lambda54(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountSetOffline$lambda-58, reason: not valid java name */
    public static final BaseOkResponse m47accountSetOffline$lambda58(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson…seOkResponse::class.java)");
        return (BaseOkResponse) objB;
    }

    public static /* synthetic */ VKRequest accountSetOnline$default(AccountService accountService, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return accountService.accountSetOnline(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountSetOnline$lambda-59, reason: not valid java name */
    public static final BaseOkResponse m48accountSetOnline$lambda59(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest accountSetPushSettings$default(AccountService accountService, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return accountService.accountSetPushSettings(str, str2, str3, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountSetPushSettings$lambda-62, reason: not valid java name */
    public static final BaseOkResponse m49accountSetPushSettings$lambda62(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest accountSetSilenceMode$default(AccountService accountService, String str, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        return accountService.accountSetSilenceMode(str, num, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountSetSilenceMode$lambda-67, reason: not valid java name */
    public static final BaseOkResponse m50accountSetSilenceMode$lambda67(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest accountUnban$default(AccountService accountService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return accountService.accountUnban(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountUnban$lambda-73, reason: not valid java name */
    public static final BaseOkResponse m51accountUnban$lambda73(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest accountUnregisterDevice$default(AccountService accountService, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return accountService.accountUnregisterDevice(str, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: accountUnregisterDevice$lambda-76, reason: not valid java name */
    public static final BaseOkResponse m52accountUnregisterDevice$lambda76(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> accountBan(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("account.ban", new g(24));
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AccountChangePasswordResponse> accountChangePassword(@NotNull String newPassword, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        NewApiRequest newApiRequest = new NewApiRequest("account.changePassword", new g(19));
        NewApiRequest.addParam$default(newApiRequest, "new_password", newPassword, 6, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("restore_sid", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("change_password_hash", str2);
        }
        if (str3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("old_password", str3);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AccountGetActiveOffersResponse> accountGetActiveOffers(@Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("account.getActiveOffers", new g(22));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 100);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> accountGetAppPermissions(@NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("account.getAppPermissions", new g(25));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AccountGetBannedResponse> accountGetBanned(@Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("account.getBanned", new g(18));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AccountAccountCounters> accountGetCounters(@Nullable List<? extends AccountGetCountersFilter> list, @Nullable UserId userId) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("account.getCounters", new g(23));
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends AccountGetCountersFilter> list2 = list;
            ArrayList arrayList2 = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AccountGetCountersFilter) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            newApiRequest.addParam("filter", (Iterable<?>) arrayList);
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AccountInfo> accountGetInfo(@Nullable List<? extends AccountGetInfoFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("account.getInfo", new a(0));
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends AccountGetInfoFields> list2 = list;
            ArrayList arrayList2 = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AccountGetInfoFields) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AccountUserSettings> accountGetProfileInfo() {
        return new NewApiRequest("account.getProfileInfo", new g(28));
    }

    @NotNull
    public final VKRequest<AccountPushSettings> accountGetPushSettings(@Nullable String str) {
        NewApiRequest newApiRequest = new NewApiRequest("account.getPushSettings", new g(17));
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(VKApiCodes.PARAM_DEVICE_ID, str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> accountRegisterDevice(@NotNull String token, @NotNull String deviceId, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        NewApiRequest newApiRequest = new NewApiRequest("account.registerDevice", new a(2));
        newApiRequest.addParam("token", token);
        newApiRequest.addParam(VKApiCodes.PARAM_DEVICE_ID, deviceId);
        if (str != null) {
            newApiRequest.addParam(ProfilingTraceData.JsonKeys.DEVICE_MODEL, str);
        }
        if (num != null) {
            newApiRequest.addParam("device_year", num.intValue());
        }
        if (str2 != null) {
            newApiRequest.addParam("system_version", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("settings", str3);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sandbox", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AccountSaveProfileInfoResponse> accountSaveProfileInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable AccountSaveProfileInfoSex accountSaveProfileInfoSex, @Nullable AccountSaveProfileInfoRelation accountSaveProfileInfoRelation, @Nullable UserId userId, @Nullable String str5, @Nullable AccountSaveProfileInfoBdateVisibility accountSaveProfileInfoBdateVisibility, @Nullable String str6, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str7) {
        NewApiRequest newApiRequest = new NewApiRequest("account.saveProfileInfo", new g(26));
        if (str != null) {
            newApiRequest.addParam("first_name", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("last_name", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("maiden_name", str3);
        }
        if (str4 != null) {
            newApiRequest.addParam("screen_name", str4);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "cancel_request_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (accountSaveProfileInfoSex != null) {
            newApiRequest.addParam("sex", accountSaveProfileInfoSex.getValue());
        }
        if (accountSaveProfileInfoRelation != null) {
            newApiRequest.addParam("relation", accountSaveProfileInfoRelation.getValue());
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "relation_partner_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (str5 != null) {
            newApiRequest.addParam("bdate", str5);
        }
        if (accountSaveProfileInfoBdateVisibility != null) {
            newApiRequest.addParam("bdate_visibility", accountSaveProfileInfoBdateVisibility.getValue());
        }
        if (str6 != null) {
            newApiRequest.addParam("home_town", str6);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "country_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "city_id", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (str7 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("status", str7);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> accountSetInfo(@Nullable AccountSetInfoName accountSetInfoName, @Nullable String str) {
        NewApiRequest newApiRequest = new NewApiRequest("account.setInfo", new g(21));
        if (accountSetInfoName != null) {
            newApiRequest.addParam("name", accountSetInfoName.getValue());
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("value", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> accountSetOffline() {
        return new NewApiRequest("account.setOffline", new g(16));
    }

    @NotNull
    public final VKRequest<BaseOkResponse> accountSetOnline(@Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("account.setOnline", new a(3));
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("voip", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> accountSetPushSettings(@NotNull String deviceId, @Nullable String str, @Nullable String str2, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        NewApiRequest newApiRequest = new NewApiRequest("account.setPushSettings", new g(27));
        newApiRequest.addParam(VKApiCodes.PARAM_DEVICE_ID, deviceId);
        if (str != null) {
            newApiRequest.addParam("settings", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("key", str2);
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("value", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> accountSetSilenceMode(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("account.setSilenceMode", new g(29));
        if (str != null) {
            newApiRequest.addParam(VKApiCodes.PARAM_DEVICE_ID, str);
        }
        if (num != null) {
            newApiRequest.addParam("time", num.intValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("peer_id", num2.intValue());
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sound", num3.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> accountUnban(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("account.unban", new a(1));
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> accountUnregisterDevice(@Nullable String str, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("account.unregisterDevice", new g(20));
        if (str != null) {
            newApiRequest.addParam(VKApiCodes.PARAM_DEVICE_ID, str);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sandbox", bool.booleanValue());
        return newApiRequest;
    }
}
