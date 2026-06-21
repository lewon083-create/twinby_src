package com.vk.sdk.api.market;

import com.appsflyer.AdRevenueScheme;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.market.dto.MarketAddAlbumResponse;
import com.vk.sdk.api.market.dto.MarketAddResponse;
import com.vk.sdk.api.market.dto.MarketEditOrderPaymentStatus;
import com.vk.sdk.api.market.dto.MarketGetAlbumByIdResponse;
import com.vk.sdk.api.market.dto.MarketGetAlbumsResponse;
import com.vk.sdk.api.market.dto.MarketGetByIdExtendedResponse;
import com.vk.sdk.api.market.dto.MarketGetByIdResponse;
import com.vk.sdk.api.market.dto.MarketGetCategoriesResponse;
import com.vk.sdk.api.market.dto.MarketGetCommentsResponse;
import com.vk.sdk.api.market.dto.MarketGetCommentsSort;
import com.vk.sdk.api.market.dto.MarketGetExtendedResponse;
import com.vk.sdk.api.market.dto.MarketGetGroupOrdersResponse;
import com.vk.sdk.api.market.dto.MarketGetOrderByIdResponse;
import com.vk.sdk.api.market.dto.MarketGetOrderItemsResponse;
import com.vk.sdk.api.market.dto.MarketGetOrdersExtendedResponse;
import com.vk.sdk.api.market.dto.MarketGetOrdersResponse;
import com.vk.sdk.api.market.dto.MarketGetResponse;
import com.vk.sdk.api.market.dto.MarketReportCommentReason;
import com.vk.sdk.api.market.dto.MarketReportReason;
import com.vk.sdk.api.market.dto.MarketSearchExtendedResponse;
import com.vk.sdk.api.market.dto.MarketSearchExtendedRev;
import com.vk.sdk.api.market.dto.MarketSearchExtendedSort;
import com.vk.sdk.api.market.dto.MarketSearchItemsSortBy;
import com.vk.sdk.api.market.dto.MarketSearchItemsSortDirection;
import com.vk.sdk.api.market.dto.MarketSearchResponse;
import com.vk.sdk.api.market.dto.MarketSearchRev;
import com.vk.sdk.api.market.dto.MarketSearchSort;
import com.vk.sdk.api.users.dto.UsersFields;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.TraceContext;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.protocol.Geo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.a;

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
public final class MarketService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketAdd$lambda-0, reason: not valid java name */
    public static final MarketAddResponse m277marketAdd$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketAddResponse) GsonHolder.INSTANCE.getGson().b(it, MarketAddResponse.class);
    }

    public static /* synthetic */ VKRequest marketAddAlbum$default(MarketService marketService, UserId userId, String str, Integer num, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        return marketService.marketAddAlbum(userId, str, num, bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketAddAlbum$lambda-13, reason: not valid java name */
    public static final MarketAddAlbumResponse m278marketAddAlbum$lambda13(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketAddAlbumResponse) GsonHolder.INSTANCE.getGson().b(it, MarketAddAlbumResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketAddToAlbum$lambda-18, reason: not valid java name */
    public static final BaseOkResponse m279marketAddToAlbum$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest marketCreateComment$default(MarketService marketService, UserId userId, int i, String str, List list, Boolean bool, Integer num, Integer num2, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            num = null;
        }
        if ((i10 & 64) != 0) {
            num2 = null;
        }
        if ((i10 & 128) != 0) {
            str2 = null;
        }
        return marketService.marketCreateComment(userId, i, str, list, bool, num, num2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketCreateComment$lambda-20, reason: not valid java name */
    public static final Integer m280marketCreateComment$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketDelete$lambda-28, reason: not valid java name */
    public static final BaseOkResponse m281marketDelete$lambda28(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketDeleteAlbum$lambda-30, reason: not valid java name */
    public static final BaseOkResponse m282marketDeleteAlbum$lambda30(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketDeleteComment$lambda-32, reason: not valid java name */
    public static final BaseBoolInt m283marketDeleteComment$lambda32(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest marketEdit$default(MarketService marketService, UserId userId, int i, String str, String str2, int i10, Float f10, Boolean bool, Integer num, List list, String str3, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            f10 = null;
        }
        if ((i11 & 64) != 0) {
            bool = null;
        }
        if ((i11 & 128) != 0) {
            num = null;
        }
        if ((i11 & 256) != 0) {
            list = null;
        }
        if ((i11 & 512) != 0) {
            str3 = null;
        }
        return marketService.marketEdit(userId, i, str, str2, i10, f10, bool, num, list, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketEdit$lambda-34, reason: not valid java name */
    public static final BaseOkResponse m284marketEdit$lambda34(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest marketEditAlbum$default(MarketService marketService, UserId userId, int i, String str, Integer num, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            bool2 = null;
        }
        return marketService.marketEditAlbum(userId, i, str, num, bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketEditAlbum$lambda-41, reason: not valid java name */
    public static final BaseOkResponse m285marketEditAlbum$lambda41(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest marketEditComment$default(MarketService marketService, UserId userId, int i, String str, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return marketService.marketEditComment(userId, i, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketEditComment$lambda-46, reason: not valid java name */
    public static final BaseOkResponse m286marketEditComment$lambda46(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest marketEditOrder$default(MarketService marketService, UserId userId, int i, String str, Integer num, String str2, MarketEditOrderPaymentStatus marketEditOrderPaymentStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            marketEditOrderPaymentStatus = null;
        }
        if ((i10 & 64) != 0) {
            num2 = null;
        }
        if ((i10 & 128) != 0) {
            num3 = null;
        }
        if ((i10 & 256) != 0) {
            num4 = null;
        }
        if ((i10 & 512) != 0) {
            num5 = null;
        }
        if ((i10 & 1024) != 0) {
            num6 = null;
        }
        return marketService.marketEditOrder(userId, i, str, num, str2, marketEditOrderPaymentStatus, num2, num3, num4, num5, num6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketEditOrder$lambda-50, reason: not valid java name */
    public static final BaseOkResponse m287marketEditOrder$lambda50(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest marketGet$default(MarketService marketService, UserId userId, Integer num, Integer num2, Integer num3, String str, String str2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & 128) != 0) {
            bool2 = null;
        }
        return marketService.marketGet(userId, num, num2, num3, str, str2, bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGet$lambda-61, reason: not valid java name */
    public static final MarketGetResponse m288marketGet$lambda61(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetAlbumById$lambda-79, reason: not valid java name */
    public static final MarketGetAlbumByIdResponse m289marketGetAlbumById$lambda79(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetAlbumByIdResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetAlbumByIdResponse.class);
    }

    public static /* synthetic */ VKRequest marketGetAlbums$default(MarketService marketService, UserId userId, Integer num, Integer num2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return marketService.marketGetAlbums(userId, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetAlbums$lambda-81, reason: not valid java name */
    public static final MarketGetAlbumsResponse m290marketGetAlbums$lambda81(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetAlbumsResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetAlbumsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetById$lambda-85, reason: not valid java name */
    public static final MarketGetByIdResponse m291marketGetById$lambda85(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetByIdResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetByIdResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetByIdExtended$lambda-87, reason: not valid java name */
    public static final MarketGetByIdExtendedResponse m292marketGetByIdExtended$lambda87(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetByIdExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetByIdExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest marketGetCategories$default(MarketService marketService, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return marketService.marketGetCategories(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetCategories$lambda-89, reason: not valid java name */
    public static final MarketGetCategoriesResponse m293marketGetCategories$lambda89(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetCategoriesResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetCategoriesResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest marketGetComments$default(MarketService marketService, UserId userId, int i, Boolean bool, Integer num, Integer num2, Integer num3, MarketGetCommentsSort marketGetCommentsSort, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        if ((i10 & 32) != 0) {
            num3 = null;
        }
        if ((i10 & 64) != 0) {
            marketGetCommentsSort = null;
        }
        if ((i10 & 128) != 0) {
            list = null;
        }
        return marketService.marketGetComments(userId, i, bool, num, num2, num3, marketGetCommentsSort, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetComments$lambda-93, reason: not valid java name */
    public static final MarketGetCommentsResponse m294marketGetComments$lambda93(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetCommentsResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetCommentsResponse.class);
    }

    public static /* synthetic */ VKRequest marketGetExtended$default(MarketService marketService, UserId userId, Integer num, Integer num2, Integer num3, String str, String str2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & 128) != 0) {
            bool2 = null;
        }
        return marketService.marketGetExtended(userId, num, num2, num3, str, str2, bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetExtended$lambda-70, reason: not valid java name */
    public static final MarketGetExtendedResponse m295marketGetExtended$lambda70(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest marketGetGroupOrders$default(MarketService marketService, UserId userId, Integer num, Integer num2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return marketService.marketGetGroupOrders(userId, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetGroupOrders$lambda-102, reason: not valid java name */
    public static final MarketGetGroupOrdersResponse m296marketGetGroupOrders$lambda102(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetGroupOrdersResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetGroupOrdersResponse.class);
    }

    public static /* synthetic */ VKRequest marketGetOrderById$default(MarketService marketService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return marketService.marketGetOrderById(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetOrderById$lambda-106, reason: not valid java name */
    public static final MarketGetOrderByIdResponse m297marketGetOrderById$lambda106(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetOrderByIdResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetOrderByIdResponse.class);
    }

    public static /* synthetic */ VKRequest marketGetOrderItems$default(MarketService marketService, int i, UserId userId, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return marketService.marketGetOrderItems(i, userId, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetOrderItems$lambda-109, reason: not valid java name */
    public static final MarketGetOrderItemsResponse m298marketGetOrderItems$lambda109(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetOrderItemsResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetOrderItemsResponse.class);
    }

    public static /* synthetic */ VKRequest marketGetOrders$default(MarketService marketService, Integer num, Integer num2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return marketService.marketGetOrders(num, num2, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetOrders$lambda-114, reason: not valid java name */
    public static final MarketGetOrdersResponse m299marketGetOrders$lambda114(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetOrdersResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetOrdersResponse.class);
    }

    public static /* synthetic */ VKRequest marketGetOrdersExtended$default(MarketService marketService, Integer num, Integer num2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return marketService.marketGetOrdersExtended(num, num2, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketGetOrdersExtended$lambda-120, reason: not valid java name */
    public static final MarketGetOrdersExtendedResponse m300marketGetOrdersExtended$lambda120(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketGetOrdersExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MarketGetOrdersExtendedResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketRemoveFromAlbum$lambda-126, reason: not valid java name */
    public static final BaseOkResponse m301marketRemoveFromAlbum$lambda126(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest marketReorderAlbums$default(MarketService marketService, UserId userId, int i, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return marketService.marketReorderAlbums(userId, i, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketReorderAlbums$lambda-128, reason: not valid java name */
    public static final BaseOkResponse m302marketReorderAlbums$lambda128(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest marketReorderItems$default(MarketService marketService, UserId userId, int i, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        if ((i10 & 16) != 0) {
            num3 = null;
        }
        return marketService.marketReorderItems(userId, i, num, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketReorderItems$lambda-132, reason: not valid java name */
    public static final BaseOkResponse m303marketReorderItems$lambda132(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest marketReport$default(MarketService marketService, UserId userId, int i, MarketReportReason marketReportReason, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            marketReportReason = null;
        }
        return marketService.marketReport(userId, i, marketReportReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketReport$lambda-137, reason: not valid java name */
    public static final BaseOkResponse m304marketReport$lambda137(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketReportComment$lambda-140, reason: not valid java name */
    public static final BaseOkResponse m305marketReportComment$lambda140(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketRestore$lambda-142, reason: not valid java name */
    public static final BaseOkResponse m306marketRestore$lambda142(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketRestoreComment$lambda-144, reason: not valid java name */
    public static final BaseBoolInt m307marketRestoreComment$lambda144(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest marketSearch$default(MarketService marketService, UserId userId, Integer num, String str, Integer num2, Integer num3, MarketSearchSort marketSearchSort, MarketSearchRev marketSearchRev, Integer num4, Integer num5, List list, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            marketSearchSort = null;
        }
        if ((i & 64) != 0) {
            marketSearchRev = null;
        }
        if ((i & 128) != 0) {
            num4 = null;
        }
        if ((i & 256) != 0) {
            num5 = null;
        }
        if ((i & 512) != 0) {
            list = null;
        }
        if ((i & 1024) != 0) {
            bool = null;
        }
        return marketService.marketSearch(userId, num, str, num2, num3, marketSearchSort, marketSearchRev, num4, num5, list, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketSearch$lambda-146, reason: not valid java name */
    public static final MarketSearchResponse m308marketSearch$lambda146(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketSearchResponse) GsonHolder.INSTANCE.getGson().b(it, MarketSearchResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest marketSearchExtended$default(MarketService marketService, UserId userId, Integer num, String str, Integer num2, Integer num3, MarketSearchExtendedSort marketSearchExtendedSort, MarketSearchExtendedRev marketSearchExtendedRev, Integer num4, Integer num5, List list, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            marketSearchExtendedSort = null;
        }
        if ((i & 64) != 0) {
            marketSearchExtendedRev = null;
        }
        if ((i & 128) != 0) {
            num4 = null;
        }
        if ((i & 256) != 0) {
            num5 = null;
        }
        if ((i & 512) != 0) {
            list = null;
        }
        if ((i & 1024) != 0) {
            bool = null;
        }
        return marketService.marketSearchExtended(userId, num, str, num2, num3, marketSearchExtendedSort, marketSearchExtendedRev, num4, num5, list, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketSearchExtended$lambda-158, reason: not valid java name */
    public static final MarketSearchExtendedResponse m309marketSearchExtended$lambda158(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketSearchExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, MarketSearchExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest marketSearchItems$default(MarketService marketService, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MarketSearchItemsSortBy marketSearchItemsSortBy, MarketSearchItemsSortDirection marketSearchItemsSortDirection, Integer num6, Integer num7, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        if ((i & 32) != 0) {
            num5 = null;
        }
        if ((i & 64) != 0) {
            marketSearchItemsSortBy = null;
        }
        if ((i & 128) != 0) {
            marketSearchItemsSortDirection = null;
        }
        if ((i & 256) != 0) {
            num6 = null;
        }
        if ((i & 512) != 0) {
            num7 = null;
        }
        return marketService.marketSearchItems(str, num, num2, num3, num4, num5, marketSearchItemsSortBy, marketSearchItemsSortDirection, num6, num7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: marketSearchItems$lambda-170, reason: not valid java name */
    public static final MarketSearchResponse m310marketSearchItems$lambda170(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (MarketSearchResponse) GsonHolder.INSTANCE.getGson().b(it, MarketSearchResponse.class);
    }

    @NotNull
    public final VKRequest<MarketAddResponse> marketAdd(@NotNull UserId ownerId, @NotNull String name, @NotNull String description, int i, @Nullable Float f10, @Nullable Float f11, @Nullable Boolean bool, @Nullable Integer num, @Nullable List<Integer> list, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        NewApiRequest newApiRequest = new NewApiRequest("market.add", new a(0));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("name", name, 4, 100);
        NewApiRequest.addParam$default(newApiRequest, "description", description, 10, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "category_id", i, 0, 0, 8, (Object) null);
        if (f10 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price", f10.floatValue(), ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, 8, (Object) null);
        }
        if (f11 != null) {
            NewApiRequest.addParam$default(newApiRequest, "old_price", f11.floatValue(), 0.01d, ConfigValue.DOUBLE_DEFAULT_VALUE, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("deleted", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "main_photo_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (list != null) {
            newApiRequest.addParam("photo_ids", list);
        }
        if (str != null) {
            newApiRequest.addParam("url", str, 0, 320);
        }
        if (num2 != null) {
            newApiRequest.addParam("dimension_width", num2.intValue(), 0, 100000);
        }
        if (num3 != null) {
            newApiRequest.addParam("dimension_height", num3.intValue(), 0, 100000);
        }
        if (num4 != null) {
            newApiRequest.addParam("dimension_length", num4.intValue(), 0, 100000);
        }
        if (num5 != null) {
            newApiRequest.addParam("weight", num5.intValue(), 0, 100000000);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "sku", str2, 0, 50, 4, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketAddAlbumResponse> marketAddAlbum(@NotNull UserId ownerId, @NotNull String title, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("market.addAlbum", new yf.a(14));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "title", title, 0, 128, 4, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "photo_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("main_album", bool.booleanValue());
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("is_hidden", bool2.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketAddToAlbum(@NotNull UserId ownerId, @NotNull List<Integer> itemIds, @NotNull List<Integer> albumIds) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        Intrinsics.checkNotNullParameter(albumIds, "albumIds");
        NewApiRequest newApiRequest = new NewApiRequest("market.addToAlbum", new yf.a(17));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("item_ids", itemIds);
        newApiRequest.addParam("album_ids", albumIds);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> marketCreateComment(@NotNull UserId ownerId, int i, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.createComment", new a(5));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("message", str);
        }
        if (list != null) {
            newApiRequest.addParam("attachments", list);
        }
        if (bool != null) {
            newApiRequest.addParam("from_group", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "reply_to_comment", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "sticker_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("guid", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketDelete(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.delete", new a(11));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketDeleteAlbum(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.deleteAlbum", new yf.a(12));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "album_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> marketDeleteComment(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.deleteComment", new yf.a(9));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketEdit(@NotNull UserId ownerId, int i, @NotNull String name, @NotNull String description, int i10, @Nullable Float f10, @Nullable Boolean bool, @Nullable Integer num, @Nullable List<Integer> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        NewApiRequest newApiRequest = new NewApiRequest("market.edit", new yf.a(11));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("name", name, 4, 100);
        NewApiRequest.addParam$default(newApiRequest, "description", description, 10, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "category_id", i10, 0, 0, 8, (Object) null);
        if (f10 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price", f10.floatValue(), ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("deleted", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "main_photo_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (list != null) {
            newApiRequest.addParam("photo_ids", list);
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("url", str, 0, 320);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketEditAlbum(@NotNull UserId ownerId, int i, @NotNull String title, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("market.editAlbum", new yf.a(16));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "album_id", i, 0, 0, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "title", title, 0, 128, 4, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "photo_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("main_album", bool.booleanValue());
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("is_hidden", bool2.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketEditComment(@NotNull UserId ownerId, int i, @Nullable String str, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.editComment", new a(7));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("message", str);
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("attachments", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketEditOrder(@NotNull UserId userId, int i, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable MarketEditOrderPaymentStatus marketEditOrderPaymentStatus, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("market.editOrder", new yf.a(15));
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 1L, 0L, 8, (Object) null);
        NewApiRequest.addParam$default(newApiRequest, "order_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "merchant_comment", str, 0, VKApiCodes.CODE_VIDEO_ALREADY_ADDED, 4, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "status", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "track_number", str2, 0, 60, 4, (Object) null);
        }
        if (marketEditOrderPaymentStatus != null) {
            newApiRequest.addParam("payment_status", marketEditOrderPaymentStatus.getValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "delivery_price", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("width", num3.intValue(), 0, 100000);
        }
        if (num4 != null) {
            newApiRequest.addParam(SentryEnvelopeItemHeader.JsonKeys.LENGTH, num4.intValue(), 0, 100000);
        }
        if (num5 != null) {
            newApiRequest.addParam("height", num5.intValue(), 0, 100000);
        }
        if (num6 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("weight", num6.intValue(), 0, 100000000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetResponse> marketGet(@NotNull UserId ownerId, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.get", new yf.a(25));
        newApiRequest.addParam("owner_id", ownerId);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "album_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("date_from", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("date_to", str2);
        }
        if (bool != null) {
            newApiRequest.addParam("need_variants", bool.booleanValue());
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("with_disabled", bool2.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetAlbumByIdResponse> marketGetAlbumById(@NotNull UserId ownerId, @NotNull List<Integer> albumIds) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(albumIds, "albumIds");
        NewApiRequest newApiRequest = new NewApiRequest("market.getAlbumById", new yf.a(29));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("album_ids", albumIds);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetAlbumsResponse> marketGetAlbums(@NotNull UserId ownerId, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.getAlbums", new yf.a(8));
        newApiRequest.addParam("owner_id", ownerId);
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
    public final VKRequest<MarketGetByIdResponse> marketGetById(@NotNull List<String> itemIds) {
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        NewApiRequest newApiRequest = new NewApiRequest("market.getById", new yf.a(28));
        newApiRequest.addParam("item_ids", itemIds);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetByIdExtendedResponse> marketGetByIdExtended(@NotNull List<String> itemIds) {
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        NewApiRequest newApiRequest = new NewApiRequest("market.getById", new yf.a(21));
        newApiRequest.addParam("item_ids", itemIds);
        newApiRequest.addParam("extended", true);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetCategoriesResponse> marketGetCategories(@Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("market.getCategories", new a(4));
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, 1000);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetCommentsResponse> marketGetComments(@NotNull UserId ownerId, int i, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable MarketGetCommentsSort marketGetCommentsSort, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.getComments", new a(2));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        if (bool != null) {
            newApiRequest.addParam("need_likes", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_comment_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 0, 100);
        }
        if (marketGetCommentsSort != null) {
            newApiRequest.addParam("sort", marketGetCommentsSort.getValue());
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
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetExtendedResponse> marketGetExtended(@NotNull UserId ownerId, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.get", new a(3));
        newApiRequest.addParam("owner_id", ownerId);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "album_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num3.intValue(), 0, 0, 8, (Object) null);
        }
        newApiRequest.addParam("extended", true);
        if (str != null) {
            newApiRequest.addParam("date_from", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("date_to", str2);
        }
        if (bool != null) {
            newApiRequest.addParam("need_variants", bool.booleanValue());
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("with_disabled", bool2.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetGroupOrdersResponse> marketGetGroupOrders(@NotNull UserId groupId, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("market.getGroupOrders", new yf.a(19));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 1, 50);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetOrderByIdResponse> marketGetOrderById(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("market.getOrderById", new yf.a(27));
        NewApiRequest.addParam$default(newApiRequest, "order_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetOrderItemsResponse> marketGetOrderItems(int i, @Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("market.getOrderItems", new yf.a(23));
        NewApiRequest.addParam$default(newApiRequest, "order_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetOrdersResponse> marketGetOrders(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2) {
        NewApiRequest newApiRequest = new NewApiRequest("market.getOrders", new a(1));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 10);
        }
        if (str != null) {
            newApiRequest.addParam("date_from", str);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("date_to", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketGetOrdersExtendedResponse> marketGetOrdersExtended(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2) {
        NewApiRequest newApiRequest = new NewApiRequest("market.getOrders", new yf.a(13));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 10);
        }
        newApiRequest.addParam("extended", true);
        if (str != null) {
            newApiRequest.addParam("date_from", str);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("date_to", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketRemoveFromAlbum(@NotNull UserId ownerId, int i, @NotNull List<Integer> albumIds) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(albumIds, "albumIds");
        NewApiRequest newApiRequest = new NewApiRequest("market.removeFromAlbum", new yf.a(20));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("album_ids", albumIds);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketReorderAlbums(@NotNull UserId ownerId, int i, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.reorderAlbums", new a(6));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("album_id", i);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "before", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "after", num2.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketReorderItems(@NotNull UserId ownerId, int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.reorderItems", new a(10));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        if (num != null) {
            newApiRequest.addParam("album_id", num.intValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "before", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "after", num3.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketReport(@NotNull UserId ownerId, int i, @Nullable MarketReportReason marketReportReason) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.report", new yf.a(24));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        if (marketReportReason == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(DiscardedEvent.JsonKeys.REASON, marketReportReason.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketReportComment(@NotNull UserId ownerId, int i, @NotNull MarketReportCommentReason reason) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        NewApiRequest newApiRequest = new NewApiRequest("market.reportComment", new a(8));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam(DiscardedEvent.JsonKeys.REASON, reason.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> marketRestore(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.restore", new yf.a(18));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "item_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> marketRestoreComment(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.restoreComment", new yf.a(22));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketSearchResponse> marketSearch(@NotNull UserId ownerId, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable MarketSearchSort marketSearchSort, @Nullable MarketSearchRev marketSearchRev, @Nullable Integer num4, @Nullable Integer num5, @Nullable List<Integer> list, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.search", new yf.a(10));
        newApiRequest.addParam("owner_id", ownerId);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "album_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price_from", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price_to", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (marketSearchSort != null) {
            newApiRequest.addParam("sort", marketSearchSort.getValue());
        }
        if (marketSearchRev != null) {
            newApiRequest.addParam("rev", marketSearchRev.getValue());
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (num5 != null) {
            newApiRequest.addParam("count", num5.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (list != null) {
            newApiRequest.addParam("status", list);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("need_variants", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketSearchExtendedResponse> marketSearchExtended(@NotNull UserId ownerId, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable MarketSearchExtendedSort marketSearchExtendedSort, @Nullable MarketSearchExtendedRev marketSearchExtendedRev, @Nullable Integer num4, @Nullable Integer num5, @Nullable List<Integer> list, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("market.search", new yf.a(26));
        newApiRequest.addParam("owner_id", ownerId);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "album_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price_from", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price_to", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (marketSearchExtendedSort != null) {
            newApiRequest.addParam("sort", marketSearchExtendedSort.getValue());
        }
        if (marketSearchExtendedRev != null) {
            newApiRequest.addParam("rev", marketSearchExtendedRev.getValue());
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (num5 != null) {
            newApiRequest.addParam("count", num5.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        newApiRequest.addParam("extended", true);
        if (list != null) {
            newApiRequest.addParam("status", list);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("need_variants", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<MarketSearchResponse> marketSearchItems(@NotNull String q2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable MarketSearchItemsSortBy marketSearchItemsSortBy, @Nullable MarketSearchItemsSortDirection marketSearchItemsSortDirection, @Nullable Integer num6, @Nullable Integer num7) {
        Intrinsics.checkNotNullParameter(q2, "q");
        NewApiRequest newApiRequest = new NewApiRequest("market.searchItems", new a(9));
        newApiRequest.addParam("q", q2);
        if (num != null) {
            newApiRequest.addParam("offset", num.intValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_PHOTO_ALBUM_LIMIT_EXCEED);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "category_id", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price_from", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (num5 != null) {
            NewApiRequest.addParam$default(newApiRequest, "price_to", num5.intValue(), 0, 0, 8, (Object) null);
        }
        if (marketSearchItemsSortBy != null) {
            newApiRequest.addParam("sort_by", marketSearchItemsSortBy.getValue());
        }
        if (marketSearchItemsSortDirection != null) {
            newApiRequest.addParam("sort_direction", marketSearchItemsSortDirection.getValue());
        }
        if (num6 != null) {
            NewApiRequest.addParam$default(newApiRequest, AdRevenueScheme.COUNTRY, num6.intValue(), 0, 0, 8, (Object) null);
        }
        if (num7 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, Geo.JsonKeys.CITY, num7.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }
}
