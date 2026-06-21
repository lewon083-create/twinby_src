package com.vk.sdk.api.secure;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.secure.dto.SecureGiveEventStickerItem;
import com.vk.sdk.api.secure.dto.SecureLevel;
import com.vk.sdk.api.secure.dto.SecureSmsNotification;
import com.vk.sdk.api.secure.dto.SecureTokenChecked;
import com.vk.sdk.api.secure.dto.SecureTransaction;
import io.sentry.TraceContext;
import java.util.List;
import kotlin.Metadata;
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
public final class SecureService {
    public static /* synthetic */ VKRequest secureAddAppEvent$default(SecureService secureService, UserId userId, int i, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return secureService.secureAddAppEvent(userId, i, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureAddAppEvent$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m472secureAddAppEvent$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest secureCheckToken$default(SecureService secureService, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return secureService.secureCheckToken(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureCheckToken$lambda-3, reason: not valid java name */
    public static final SecureTokenChecked m473secureCheckToken$lambda3(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (SecureTokenChecked) GsonHolder.INSTANCE.getGson().b(it, SecureTokenChecked.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureGetAppBalance$lambda-7, reason: not valid java name */
    public static final int m474secureGetAppBalance$lambda7(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson(it, Int::class.java)");
        return ((Number) objB).intValue();
    }

    public static /* synthetic */ VKRequest secureGetSMSHistory$default(SecureService secureService, UserId userId, Integer num, Integer num2, Integer num3, int i, Object obj) {
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
            num3 = null;
        }
        return secureService.secureGetSMSHistory(userId, num, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureGetSMSHistory$lambda-8, reason: not valid java name */
    public static final List m475secureGetSMSHistory$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends SecureSmsNotification>>() { // from class: com.vk.sdk.api.secure.SecureService$secureGetSMSHistory$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest secureGetTransactionsHistory$default(SecureService secureService, Integer num, UserId userId, UserId userId2, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            userId2 = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            num4 = null;
        }
        return secureService.secureGetTransactionsHistory(num, userId, userId2, num2, num3, num4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureGetTransactionsHistory$lambda-14, reason: not valid java name */
    public static final List m476secureGetTransactionsHistory$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends SecureTransaction>>() { // from class: com.vk.sdk.api.secure.SecureService$secureGetTransactionsHistory$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureGetUserLevel$lambda-22, reason: not valid java name */
    public static final List m477secureGetUserLevel$lambda22(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends SecureLevel>>() { // from class: com.vk.sdk.api.secure.SecureService$secureGetUserLevel$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureGiveEventSticker$lambda-24, reason: not valid java name */
    public static final List m478secureGiveEventSticker$lambda24(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends SecureGiveEventStickerItem>>() { // from class: com.vk.sdk.api.secure.SecureService$secureGiveEventSticker$1$typeToken$1
        }.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest secureSendNotification$default(SecureService secureService, String str, List list, UserId userId, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        return secureService.secureSendNotification(str, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureSendNotification$lambda-26, reason: not valid java name */
    public static final List m479secureSendNotification$lambda26(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends UserId>>() { // from class: com.vk.sdk.api.secure.SecureService$secureSendNotification$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureSendSMSNotification$lambda-30, reason: not valid java name */
    public static final BaseOkResponse m480secureSendSMSNotification$lambda30(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest secureSetCounter$default(SecureService secureService, List list, UserId userId, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        return secureService.secureSetCounter(list, userId, num, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: secureSetCounter$lambda-32, reason: not valid java name */
    public static final BaseBoolInt m481secureSetCounter$lambda32(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> secureAddAppEvent(@NotNull UserId userId, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("secure.addAppEvent", new kf.a(19));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "activity_id", i, 0, 0, 8, (Object) null);
        if (num == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "value", num.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<SecureTokenChecked> secureCheckToken(@Nullable String str, @Nullable String str2) {
        NewApiRequest newApiRequest = new NewApiRequest("secure.checkToken", new kf.a(20));
        if (str != null) {
            newApiRequest.addParam("token", str);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("ip", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> secureGetAppBalance() {
        return new NewApiRequest("secure.getAppBalance", new kf.a(18));
    }

    @NotNull
    public final VKRequest<List<SecureSmsNotification>> secureGetSMSHistory(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("secure.getSMSHistory", new kf.a(13));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "date_from", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "date_to", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("limit", num3.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<SecureTransaction>> secureGetTransactionsHistory(@Nullable Integer num, @Nullable UserId userId, @Nullable UserId userId2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        NewApiRequest newApiRequest = new NewApiRequest("secure.getTransactionsHistory", new kf.a(17));
        if (num != null) {
            newApiRequest.addParam("type", num.intValue());
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "uid_from", userId, 1L, 0L, 8, (Object) null);
        }
        if (userId2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "uid_to", userId2, 1L, 0L, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "date_from", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "date_to", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("limit", num4.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<SecureLevel>> secureGetUserLevel(@NotNull List<UserId> userIds) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        NewApiRequest newApiRequest = new NewApiRequest("secure.getUserLevel", new kf.a(14));
        NewApiRequest.addParam$default(newApiRequest, "user_ids", userIds, 0L, 0L, 12, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<SecureGiveEventStickerItem>> secureGiveEventSticker(@NotNull List<UserId> userIds, int i) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        NewApiRequest newApiRequest = new NewApiRequest("secure.giveEventSticker", new kf.a(15));
        NewApiRequest.addParam$default(newApiRequest, "user_ids", userIds, 0L, 0L, 12, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "achievement_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<UserId>> secureSendNotification(@NotNull String message, @Nullable List<UserId> list, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(message, "message");
        NewApiRequest newApiRequest = new NewApiRequest("secure.sendNotification", new kf.a(21));
        newApiRequest.addParam("message", message);
        if (list != null) {
            NewApiRequest.addParam$default(newApiRequest, "user_ids", list, 0L, 0L, 12, (Object) null);
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> secureSendSMSNotification(@NotNull UserId userId, @NotNull String message) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(message, "message");
        NewApiRequest newApiRequest = new NewApiRequest("secure.sendSMSNotification", new kf.a(12));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        newApiRequest.addParam("message", message);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> secureSetCounter(@Nullable List<String> list, @Nullable UserId userId, @Nullable Integer num, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("secure.setCounter", new kf.a(16));
        if (list != null) {
            newApiRequest.addParam("counters", list);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            newApiRequest.addParam("counter", num.intValue());
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("increment", bool.booleanValue());
        return newApiRequest;
    }
}
