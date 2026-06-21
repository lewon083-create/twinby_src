package com.vk.sdk.api.notifications;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.notifications.dto.NotificationsGetFilters;
import com.vk.sdk.api.notifications.dto.NotificationsGetResponse;
import com.vk.sdk.api.notifications.dto.NotificationsSendMessageItem;
import com.vk.sdk.api.notifications.dto.NotificationsSendMessageSendingMode;
import io.sentry.protocol.Request;
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
public final class NotificationsService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest notificationsGet$default(NotificationsService notificationsService, Integer num, String str, List list, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        return notificationsService.notificationsGet(num, str, list, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notificationsGet$lambda-0, reason: not valid java name */
    public static final NotificationsGetResponse m385notificationsGet$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (NotificationsGetResponse) GsonHolder.INSTANCE.getGson().b(it, NotificationsGetResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notificationsMarkAsViewed$lambda-8, reason: not valid java name */
    public static final BaseBoolInt m386notificationsMarkAsViewed$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson… BaseBoolInt::class.java)");
        return (BaseBoolInt) objB;
    }

    public static /* synthetic */ VKRequest notificationsSendMessage$default(NotificationsService notificationsService, List list, String str, String str2, UserId userId, Integer num, NotificationsSendMessageSendingMode notificationsSendMessageSendingMode, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            userId = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            notificationsSendMessageSendingMode = null;
        }
        return notificationsService.notificationsSendMessage(list, str, str2, userId, num, notificationsSendMessageSendingMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: notificationsSendMessage$lambda-9, reason: not valid java name */
    public static final List m387notificationsSendMessage$lambda9(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends NotificationsSendMessageItem>>() { // from class: com.vk.sdk.api.notifications.NotificationsService$notificationsSendMessage$1$typeToken$1
        }.getType());
    }

    @NotNull
    public final VKRequest<NotificationsGetResponse> notificationsGet(@Nullable Integer num, @Nullable String str, @Nullable List<? extends NotificationsGetFilters> list, @Nullable Integer num2, @Nullable Integer num3) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("notifications.get", new bg.a(27));
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 1, 100);
        }
        if (str != null) {
            newApiRequest.addParam("start_from", str);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends NotificationsGetFilters> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((NotificationsGetFilters) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("filters", (Iterable<?>) arrayList);
        }
        if (num2 != null) {
            newApiRequest.addParam("start_time", num2.intValue());
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("end_time", num3.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> notificationsMarkAsViewed() {
        return new NewApiRequest("notifications.markAsViewed", new bg.a(28));
    }

    @NotNull
    public final VKRequest<List<NotificationsSendMessageItem>> notificationsSendMessage(@NotNull List<Integer> userIds, @NotNull String message, @Nullable String str, @Nullable UserId userId, @Nullable Integer num, @Nullable NotificationsSendMessageSendingMode notificationsSendMessageSendingMode) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        Intrinsics.checkNotNullParameter(message, "message");
        NewApiRequest newApiRequest = new NewApiRequest("notifications.sendMessage", new bg.a(29));
        newApiRequest.addParam("user_ids", userIds);
        NewApiRequest.addParam$default(newApiRequest, "message", message, 0, 254, 4, (Object) null);
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, Request.JsonKeys.FRAGMENT, str, 0, 2047, 4, (Object) null);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            newApiRequest.addParam("random_id", num.intValue());
        }
        if (notificationsSendMessageSendingMode == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sending_mode", notificationsSendMessageSendingMode.getValue());
        return newApiRequest;
    }
}
