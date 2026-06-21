package com.vk.sdk.api.orders;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.orders.dto.OrdersAmount;
import com.vk.sdk.api.orders.dto.OrdersChangeStateAction;
import com.vk.sdk.api.orders.dto.OrdersGetUserSubscriptionsResponse;
import com.vk.sdk.api.orders.dto.OrdersOrder;
import com.vk.sdk.api.orders.dto.OrdersSubscription;
import e5.g;
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
public final class OrdersService {
    public static /* synthetic */ VKRequest ordersCancelSubscription$default(OrdersService ordersService, UserId userId, int i, Boolean bool, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = null;
        }
        return ordersService.ordersCancelSubscription(userId, i, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ordersCancelSubscription$lambda-0, reason: not valid java name */
    public static final BaseBoolInt m388ordersCancelSubscription$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest ordersChangeState$default(OrdersService ordersService, int i, OrdersChangeStateAction ordersChangeStateAction, Integer num, Boolean bool, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        return ordersService.ordersChangeState(i, ordersChangeStateAction, num, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ordersChangeState$lambda-3, reason: not valid java name */
    public static final String m389ordersChangeState$lambda3(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (String) GsonHolder.INSTANCE.getGson().b(it, String.class);
    }

    public static /* synthetic */ VKRequest ordersGet$default(OrdersService ordersService, Integer num, Integer num2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        return ordersService.ordersGet(num, num2, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ordersGet$lambda-7, reason: not valid java name */
    public static final List m390ordersGet$lambda7(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends OrdersOrder>>() { // from class: com.vk.sdk.api.orders.OrdersService$ordersGet$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ordersGetAmount$lambda-12, reason: not valid java name */
    public static final List m391ordersGetAmount$lambda12(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends OrdersAmount>>() { // from class: com.vk.sdk.api.orders.OrdersService$ordersGetAmount$1$typeToken$1
        }.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest ordersGetById$default(OrdersService ordersService, Integer num, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        return ordersService.ordersGetById(num, list, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ordersGetById$lambda-14, reason: not valid java name */
    public static final List m392ordersGetById$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends OrdersOrder>>() { // from class: com.vk.sdk.api.orders.OrdersService$ordersGetById$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ordersGetUserSubscriptionById$lambda-19, reason: not valid java name */
    public static final OrdersSubscription m393ordersGetUserSubscriptionById$lambda19(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (OrdersSubscription) GsonHolder.INSTANCE.getGson().b(it, OrdersSubscription.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ordersGetUserSubscriptions$lambda-21, reason: not valid java name */
    public static final OrdersGetUserSubscriptionsResponse m394ordersGetUserSubscriptions$lambda21(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (OrdersGetUserSubscriptionsResponse) GsonHolder.INSTANCE.getGson().b(it, OrdersGetUserSubscriptionsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ordersUpdateSubscription$lambda-23, reason: not valid java name */
    public static final BaseBoolInt m395ordersUpdateSubscription$lambda23(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    @NotNull
    public final VKRequest<BaseBoolInt> ordersCancelSubscription(@NotNull UserId userId, int i, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("orders.cancelSubscription", new g(1));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "subscription_id", i, 0, 0, 8, (Object) null);
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("pending_cancel", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<String> ordersChangeState(int i, @NotNull OrdersChangeStateAction action, @Nullable Integer num, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(action, "action");
        NewApiRequest newApiRequest = new NewApiRequest("orders.changeState", new g(6));
        NewApiRequest.addParam$default(newApiRequest, "order_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("action", action.getValue());
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "app_order_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("test_mode", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<OrdersOrder>> ordersGet(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("orders.get", new g(4));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("test_mode", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<OrdersAmount>> ordersGetAmount(@NotNull UserId userId, @NotNull List<String> votes) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(votes, "votes");
        NewApiRequest newApiRequest = new NewApiRequest("orders.getAmount", new g(2));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        newApiRequest.addParam("votes", votes);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<OrdersOrder>> ordersGetById(@Nullable Integer num, @Nullable List<Integer> list, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("orders.getById", new g(8));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "order_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (list != null) {
            newApiRequest.addParam("order_ids", list);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("test_mode", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<OrdersSubscription> ordersGetUserSubscriptionById(@NotNull UserId userId, int i) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("orders.getUserSubscriptionById", new g(3));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "subscription_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<OrdersGetUserSubscriptionsResponse> ordersGetUserSubscriptions(@NotNull UserId userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("orders.getUserSubscriptions", new g(7));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> ordersUpdateSubscription(@NotNull UserId userId, int i, int i10) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("orders.updateSubscription", new g(5));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "subscription_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "price", i10, 0, 0, 8, (Object) null);
        return newApiRequest;
    }
}
