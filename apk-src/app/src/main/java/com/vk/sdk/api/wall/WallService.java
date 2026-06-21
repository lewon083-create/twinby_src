package com.vk.sdk.api.wall;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseUserGroupFields;
import com.vk.sdk.api.wall.dto.WallCreateCommentResponse;
import com.vk.sdk.api.wall.dto.WallEditResponse;
import com.vk.sdk.api.wall.dto.WallEditTopicId;
import com.vk.sdk.api.wall.dto.WallGetByIdExtendedResponse;
import com.vk.sdk.api.wall.dto.WallGetCommentExtendedResponse;
import com.vk.sdk.api.wall.dto.WallGetCommentResponse;
import com.vk.sdk.api.wall.dto.WallGetCommentsExtendedResponse;
import com.vk.sdk.api.wall.dto.WallGetCommentsExtendedSort;
import com.vk.sdk.api.wall.dto.WallGetCommentsResponse;
import com.vk.sdk.api.wall.dto.WallGetCommentsSort;
import com.vk.sdk.api.wall.dto.WallGetExtendedResponse;
import com.vk.sdk.api.wall.dto.WallGetRepostsResponse;
import com.vk.sdk.api.wall.dto.WallGetResponse;
import com.vk.sdk.api.wall.dto.WallPostAdsStealthResponse;
import com.vk.sdk.api.wall.dto.WallPostResponse;
import com.vk.sdk.api.wall.dto.WallPostTopicId;
import com.vk.sdk.api.wall.dto.WallReportCommentReason;
import com.vk.sdk.api.wall.dto.WallReportPostReason;
import com.vk.sdk.api.wall.dto.WallRepostResponse;
import com.vk.sdk.api.wall.dto.WallSearchExtendedResponse;
import com.vk.sdk.api.wall.dto.WallSearchResponse;
import com.vk.sdk.api.wall.dto.WallWallpostFull;
import io.sentry.clientreport.DiscardedEvent;
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
public final class WallService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallCheckCopyrightLink$lambda-0, reason: not valid java name */
    public static final BaseBoolInt m560wallCheckCopyrightLink$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallCloseComments$lambda-2, reason: not valid java name */
    public static final BaseBoolInt m561wallCloseComments$lambda2(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallCreateComment$default(WallService wallService, int i, UserId userId, UserId userId2, String str, Integer num, List list, Integer num2, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            num = null;
        }
        if ((i10 & 32) != 0) {
            list = null;
        }
        if ((i10 & 64) != 0) {
            num2 = null;
        }
        if ((i10 & 128) != 0) {
            str2 = null;
        }
        return wallService.wallCreateComment(i, userId, userId2, str, num, list, num2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallCreateComment$lambda-4, reason: not valid java name */
    public static final WallCreateCommentResponse m562wallCreateComment$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallCreateCommentResponse) GsonHolder.INSTANCE.getGson().b(it, WallCreateCommentResponse.class);
    }

    public static /* synthetic */ VKRequest wallDelete$default(WallService wallService, UserId userId, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return wallService.wallDelete(userId, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallDelete$lambda-13, reason: not valid java name */
    public static final BaseOkResponse m563wallDelete$lambda13(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest wallDeleteComment$default(WallService wallService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return wallService.wallDeleteComment(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallDeleteComment$lambda-17, reason: not valid java name */
    public static final BaseOkResponse m564wallDeleteComment$lambda17(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallEdit$lambda-20, reason: not valid java name */
    public static final WallEditResponse m565wallEdit$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallEditResponse) GsonHolder.INSTANCE.getGson().b(it, WallEditResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallEditAdsStealth$default(WallService wallService, int i, UserId userId, String str, List list, Boolean bool, Float f10, Float f11, Integer num, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
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
            f10 = null;
        }
        if ((i10 & 64) != 0) {
            f11 = null;
        }
        if ((i10 & 128) != 0) {
            num = null;
        }
        if ((i10 & 256) != 0) {
            str2 = null;
        }
        if ((i10 & 512) != 0) {
            str3 = null;
        }
        if ((i10 & 1024) != 0) {
            str4 = null;
        }
        if ((i10 & 2048) != 0) {
            str5 = null;
        }
        return wallService.wallEditAdsStealth(i, userId, str, list, bool, f10, f11, num, str2, str3, str4, str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallEditAdsStealth$lambda-40, reason: not valid java name */
    public static final BaseOkResponse m566wallEditAdsStealth$lambda40(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallEditComment$default(WallService wallService, int i, UserId userId, String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return wallService.wallEditComment(i, userId, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallEditComment$lambda-53, reason: not valid java name */
    public static final BaseOkResponse m567wallEditComment$lambda53(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallGet$default(WallService wallService, UserId userId, String str, Integer num, Integer num2, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        return wallService.wallGet(userId, str, num, num2, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallGet$lambda-58, reason: not valid java name */
    public static final WallGetResponse m568wallGet$lambda58(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallGetResponse) GsonHolder.INSTANCE.getGson().b(it, WallGetResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallGetById$default(WallService wallService, List list, Integer num, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        return wallService.wallGetById(list, num, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallGetById$lambda-76, reason: not valid java name */
    public static final List m569wallGetById$lambda76(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends WallWallpostFull>>() { // from class: com.vk.sdk.api.wall.WallService$wallGetById$1$typeToken$1
        }.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallGetByIdExtended$default(WallService wallService, List list, Integer num, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        return wallService.wallGetByIdExtended(list, num, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallGetByIdExtended$lambda-81, reason: not valid java name */
    public static final WallGetByIdExtendedResponse m570wallGetByIdExtended$lambda81(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallGetByIdExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, WallGetByIdExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallGetComment$default(WallService wallService, int i, UserId userId, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            list = null;
        }
        return wallService.wallGetComment(i, userId, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallGetComment$lambda-86, reason: not valid java name */
    public static final WallGetCommentResponse m571wallGetComment$lambda86(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallGetCommentResponse) GsonHolder.INSTANCE.getGson().b(it, WallGetCommentResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallGetCommentExtended$default(WallService wallService, int i, UserId userId, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            list = null;
        }
        return wallService.wallGetCommentExtended(i, userId, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallGetCommentExtended$lambda-91, reason: not valid java name */
    public static final WallGetCommentExtendedResponse m572wallGetCommentExtended$lambda91(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallGetCommentExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, WallGetCommentExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallGetComments$default(WallService wallService, UserId userId, Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, WallGetCommentsSort wallGetCommentsSort, Integer num5, List list, Integer num6, Integer num7, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            bool = null;
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
        if ((i & 64) != 0) {
            wallGetCommentsSort = null;
        }
        if ((i & 128) != 0) {
            num5 = null;
        }
        if ((i & 256) != 0) {
            list = null;
        }
        if ((i & 512) != 0) {
            num6 = null;
        }
        if ((i & 1024) != 0) {
            num7 = null;
        }
        return wallService.wallGetComments(userId, num, bool, num2, num3, num4, wallGetCommentsSort, num5, list, num6, num7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallGetComments$lambda-96, reason: not valid java name */
    public static final WallGetCommentsResponse m573wallGetComments$lambda96(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallGetCommentsResponse) GsonHolder.INSTANCE.getGson().b(it, WallGetCommentsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallGetCommentsExtended$default(WallService wallService, UserId userId, Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, WallGetCommentsExtendedSort wallGetCommentsExtendedSort, Integer num5, List list, Integer num6, Integer num7, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            bool = null;
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
        if ((i & 64) != 0) {
            wallGetCommentsExtendedSort = null;
        }
        if ((i & 128) != 0) {
            num5 = null;
        }
        if ((i & 256) != 0) {
            list = null;
        }
        if ((i & 512) != 0) {
            num6 = null;
        }
        if ((i & 1024) != 0) {
            num7 = null;
        }
        return wallService.wallGetCommentsExtended(userId, num, bool, num2, num3, num4, wallGetCommentsExtendedSort, num5, list, num6, num7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallGetCommentsExtended$lambda-110, reason: not valid java name */
    public static final WallGetCommentsExtendedResponse m574wallGetCommentsExtended$lambda110(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallGetCommentsExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, WallGetCommentsExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallGetExtended$default(WallService wallService, UserId userId, String str, Integer num, Integer num2, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        return wallService.wallGetExtended(userId, str, num, num2, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallGetExtended$lambda-67, reason: not valid java name */
    public static final WallGetExtendedResponse m575wallGetExtended$lambda67(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallGetExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, WallGetExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest wallGetReposts$default(WallService wallService, UserId userId, Integer num, Integer num2, Integer num3, int i, Object obj) {
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
        return wallService.wallGetReposts(userId, num, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallGetReposts$lambda-124, reason: not valid java name */
    public static final WallGetRepostsResponse m576wallGetReposts$lambda124(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallGetRepostsResponse) GsonHolder.INSTANCE.getGson().b(it, WallGetRepostsResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallOpenComments$lambda-130, reason: not valid java name */
    public static final BaseBoolInt m577wallOpenComments$lambda130(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest wallPin$default(WallService wallService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return wallService.wallPin(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallPin$lambda-132, reason: not valid java name */
    public static final BaseOkResponse m578wallPin$lambda132(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallPost$lambda-135, reason: not valid java name */
    public static final WallPostResponse m579wallPost$lambda135(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallPostResponse) GsonHolder.INSTANCE.getGson().b(it, WallPostResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallPostAdsStealth$default(WallService wallService, UserId userId, String str, List list, Boolean bool, Float f10, Float f11, Integer num, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            f10 = null;
        }
        if ((i & 32) != 0) {
            f11 = null;
        }
        if ((i & 64) != 0) {
            num = null;
        }
        if ((i & 128) != 0) {
            str2 = null;
        }
        if ((i & 256) != 0) {
            str3 = null;
        }
        if ((i & 512) != 0) {
            str4 = null;
        }
        if ((i & 1024) != 0) {
            str5 = null;
        }
        if ((i & 2048) != 0) {
            str6 = null;
        }
        return wallService.wallPostAdsStealth(userId, str, list, bool, f10, f11, num, str2, str3, str4, str5, str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallPostAdsStealth$lambda-156, reason: not valid java name */
    public static final WallPostAdsStealthResponse m580wallPostAdsStealth$lambda156(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallPostAdsStealthResponse) GsonHolder.INSTANCE.getGson().b(it, WallPostAdsStealthResponse.class);
    }

    public static /* synthetic */ VKRequest wallReportComment$default(WallService wallService, UserId userId, int i, WallReportCommentReason wallReportCommentReason, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            wallReportCommentReason = null;
        }
        return wallService.wallReportComment(userId, i, wallReportCommentReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallReportComment$lambda-169, reason: not valid java name */
    public static final BaseOkResponse m581wallReportComment$lambda169(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest wallReportPost$default(WallService wallService, UserId userId, int i, WallReportPostReason wallReportPostReason, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            wallReportPostReason = null;
        }
        return wallService.wallReportPost(userId, i, wallReportPostReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallReportPost$lambda-172, reason: not valid java name */
    public static final BaseOkResponse m582wallReportPost$lambda172(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest wallRepost$default(WallService wallService, String str, String str2, UserId userId, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        return wallService.wallRepost(str, str2, userId, bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallRepost$lambda-175, reason: not valid java name */
    public static final WallRepostResponse m583wallRepost$lambda175(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallRepostResponse) GsonHolder.INSTANCE.getGson().b(it, WallRepostResponse.class);
    }

    public static /* synthetic */ VKRequest wallRestore$default(WallService wallService, UserId userId, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return wallService.wallRestore(userId, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallRestore$lambda-181, reason: not valid java name */
    public static final BaseOkResponse m584wallRestore$lambda181(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest wallRestoreComment$default(WallService wallService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return wallService.wallRestoreComment(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallRestoreComment$lambda-185, reason: not valid java name */
    public static final BaseOkResponse m585wallRestoreComment$lambda185(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallSearch$default(WallService wallService, UserId userId, String str, String str2, Boolean bool, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        return wallService.wallSearch(userId, str, str2, bool, num, num2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallSearch$lambda-188, reason: not valid java name */
    public static final WallSearchResponse m586wallSearch$lambda188(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallSearchResponse) GsonHolder.INSTANCE.getGson().b(it, WallSearchResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest wallSearchExtended$default(WallService wallService, UserId userId, String str, String str2, Boolean bool, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        return wallService.wallSearchExtended(userId, str, str2, bool, num, num2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallSearchExtended$lambda-198, reason: not valid java name */
    public static final WallSearchExtendedResponse m587wallSearchExtended$lambda198(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (WallSearchExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, WallSearchExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest wallUnpin$default(WallService wallService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return wallService.wallUnpin(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wallUnpin$lambda-208, reason: not valid java name */
    public static final BaseOkResponse m588wallUnpin$lambda208(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<BaseBoolInt> wallCheckCopyrightLink(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        NewApiRequest newApiRequest = new NewApiRequest("wall.checkCopyrightLink", new vg.a(2));
        newApiRequest.addParam("link", link);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> wallCloseComments(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("wall.closeComments", new ug.a(25));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "post_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallCreateCommentResponse> wallCreateComment(int i, @Nullable UserId userId, @Nullable UserId userId2, @Nullable String str, @Nullable Integer num, @Nullable List<String> list, @Nullable Integer num2, @Nullable String str2) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.createComment", new ug.a(20));
        NewApiRequest.addParam$default(newApiRequest, "post_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (userId2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "from_group", userId2, 0L, 0L, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("message", str);
        }
        if (num != null) {
            newApiRequest.addParam("reply_to_comment", num.intValue());
        }
        if (list != null) {
            newApiRequest.addParam("attachments", list);
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
    public final VKRequest<BaseOkResponse> wallDelete(@Nullable UserId userId, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.delete", new vg.a(10));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "post_id", num.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> wallDeleteComment(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.deleteComment", new vg.a(11));
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallEditResponse> wallEdit(int i, @Nullable UserId userId, @Nullable Boolean bool, @Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str3, @Nullable String str4, @Nullable WallEditTopicId wallEditTopicId) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.edit", new ug.a(22));
        NewApiRequest.addParam$default(newApiRequest, "post_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (bool != null) {
            newApiRequest.addParam("friends_only", bool.booleanValue());
        }
        if (str != null) {
            newApiRequest.addParam("message", str);
        }
        if (list != null) {
            newApiRequest.addParam("attachments", list);
        }
        if (str2 != null) {
            newApiRequest.addParam("services", str2);
        }
        if (bool2 != null) {
            newApiRequest.addParam("signed", bool2.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "publish_date", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (f10 != null) {
            newApiRequest.addParam("lat", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("long", f11.floatValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "place_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool3 != null) {
            newApiRequest.addParam("mark_as_ads", bool3.booleanValue());
        }
        if (bool4 != null) {
            newApiRequest.addParam("close_comments", bool4.booleanValue());
        }
        if (num3 != null) {
            newApiRequest.addParam("donut_paid_duration", num3.intValue());
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "poster_bkg_id", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (num5 != null) {
            newApiRequest.addParam("poster_bkg_owner_id", num5.intValue());
        }
        if (str3 != null) {
            newApiRequest.addParam("poster_bkg_access_hash", str3);
        }
        if (str4 != null) {
            newApiRequest.addParam("copyright", str4);
        }
        if (wallEditTopicId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("topic_id", wallEditTopicId.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> wallEditAdsStealth(int i, @Nullable UserId userId, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.editAdsStealth", new ug.a(21));
        NewApiRequest.addParam$default(newApiRequest, "post_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("message", str);
        }
        if (list != null) {
            newApiRequest.addParam("attachments", list);
        }
        if (bool != null) {
            newApiRequest.addParam("signed", bool.booleanValue());
        }
        if (f10 != null) {
            newApiRequest.addParam("lat", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("long", f11.floatValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "place_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 != null) {
            newApiRequest.addParam("link_button", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("link_title", str3);
        }
        if (str4 != null) {
            newApiRequest.addParam("link_image", str4);
        }
        if (str5 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("link_video", str5);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> wallEditComment(int i, @Nullable UserId userId, @Nullable String str, @Nullable List<String> list) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.editComment", new vg.a(3));
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
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
    public final VKRequest<WallGetResponse> wallGet(@Nullable UserId userId, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("wall.get", new ug.a(15));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("domain", str);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 != null) {
            newApiRequest.addParam("filter", str2);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<WallWallpostFull>> wallGetById(@NotNull List<String> posts, @Nullable Integer num, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(posts, "posts");
        NewApiRequest newApiRequest = new NewApiRequest("wall.getById", new vg.a(1));
        newApiRequest.addParam("posts", posts);
        if (num != null) {
            newApiRequest.addParam("copy_history_depth", num.intValue());
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallGetByIdExtendedResponse> wallGetByIdExtended(@NotNull List<String> posts, @Nullable Integer num, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(posts, "posts");
        NewApiRequest newApiRequest = new NewApiRequest("wall.getById", new ug.a(19));
        newApiRequest.addParam("posts", posts);
        newApiRequest.addParam("extended", true);
        if (num != null) {
            newApiRequest.addParam("copy_history_depth", num.intValue());
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallGetCommentResponse> wallGetComment(int i, @Nullable UserId userId, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("wall.getComment", new ug.a(29));
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallGetCommentExtendedResponse> wallGetCommentExtended(int i, @Nullable UserId userId, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("wall.getComment", new ug.a(28));
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        newApiRequest.addParam("extended", true);
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallGetCommentsResponse> wallGetComments(@Nullable UserId userId, @Nullable Integer num, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable WallGetCommentsSort wallGetCommentsSort, @Nullable Integer num5, @Nullable List<? extends BaseUserGroupFields> list, @Nullable Integer num6, @Nullable Integer num7) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("wall.getComments", new ug.a(17));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "post_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("need_likes", bool.booleanValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_comment_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("offset", num3.intValue());
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (wallGetCommentsSort != null) {
            newApiRequest.addParam("sort", wallGetCommentsSort.getValue());
        }
        if (num5 != null) {
            NewApiRequest.addParam$default(newApiRequest, "preview_length", num5.intValue(), 0, 0, 8, (Object) null);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            ArrayList arrayList2 = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((BaseUserGroupFields) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (num6 != null) {
            NewApiRequest.addParam$default(newApiRequest, "comment_id", num6.intValue(), 0, 0, 8, (Object) null);
        }
        if (num7 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("thread_items_count", num7.intValue(), 0, 10);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallGetCommentsExtendedResponse> wallGetCommentsExtended(@Nullable UserId userId, @Nullable Integer num, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable WallGetCommentsExtendedSort wallGetCommentsExtendedSort, @Nullable Integer num5, @Nullable List<? extends BaseUserGroupFields> list, @Nullable Integer num6, @Nullable Integer num7) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("wall.getComments", new ug.a(18));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "post_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("need_likes", bool.booleanValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_comment_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            newApiRequest.addParam("offset", num3.intValue());
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (wallGetCommentsExtendedSort != null) {
            newApiRequest.addParam("sort", wallGetCommentsExtendedSort.getValue());
        }
        if (num5 != null) {
            NewApiRequest.addParam$default(newApiRequest, "preview_length", num5.intValue(), 0, 0, 8, (Object) null);
        }
        newApiRequest.addParam("extended", true);
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            ArrayList arrayList2 = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((BaseUserGroupFields) it.next()).getValue());
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        }
        if (num6 != null) {
            NewApiRequest.addParam$default(newApiRequest, "comment_id", num6.intValue(), 0, 0, 8, (Object) null);
        }
        if (num7 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("thread_items_count", num7.intValue(), 0, 10);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallGetExtendedResponse> wallGetExtended(@Nullable UserId userId, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("wall.get", new vg.a(6));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("domain", str);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 != null) {
            newApiRequest.addParam("filter", str2);
        }
        newApiRequest.addParam("extended", true);
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallGetRepostsResponse> wallGetReposts(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.getReposts", new ug.a(24));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "post_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num3.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> wallOpenComments(@NotNull UserId ownerId, int i) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("wall.openComments", new ug.a(16));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "post_id", i, 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> wallPin(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.pin", new ug.a(14));
        NewApiRequest.addParam$default(newApiRequest, "post_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallPostResponse> wallPost(@Nullable UserId userId, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable Boolean bool3, @Nullable Integer num, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Integer num4, @Nullable Boolean bool6, @Nullable String str4, @Nullable WallPostTopicId wallPostTopicId) {
        NewApiRequest newApiRequest;
        NewApiRequest newApiRequest2 = new NewApiRequest("wall.post", new vg.a(4));
        if (userId != null) {
            newApiRequest2.addParam("owner_id", userId);
        }
        if (bool != null) {
            newApiRequest2.addParam("friends_only", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest2.addParam("from_group", bool2.booleanValue());
        }
        if (str != null) {
            newApiRequest2.addParam("message", str);
        }
        if (list != null) {
            newApiRequest2.addParam("attachments", list);
        }
        if (str2 != null) {
            newApiRequest2.addParam("services", str2);
        }
        if (bool3 != null) {
            newApiRequest2.addParam("signed", bool3.booleanValue());
        }
        if (num == null) {
            newApiRequest = newApiRequest2;
        } else {
            newApiRequest = newApiRequest2;
            NewApiRequest.addParam$default(newApiRequest, "publish_date", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (f10 != null) {
            newApiRequest.addParam("lat", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("long", f11.floatValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "place_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "post_id", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (str3 != null) {
            newApiRequest.addParam("guid", str3);
        }
        if (bool4 != null) {
            newApiRequest.addParam("mark_as_ads", bool4.booleanValue());
        }
        if (bool5 != null) {
            newApiRequest.addParam("close_comments", bool5.booleanValue());
        }
        if (num4 != null) {
            newApiRequest.addParam("donut_paid_duration", num4.intValue());
        }
        if (bool6 != null) {
            newApiRequest.addParam("mute_notifications", bool6.booleanValue());
        }
        if (str4 != null) {
            newApiRequest.addParam("copyright", str4);
        }
        if (wallPostTopicId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("topic_id", wallPostTopicId.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallPostAdsStealthResponse> wallPostAdsStealth(@NotNull UserId ownerId, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("wall.postAdsStealth", new ug.a(23));
        newApiRequest.addParam("owner_id", ownerId);
        if (str != null) {
            newApiRequest.addParam("message", str);
        }
        if (list != null) {
            newApiRequest.addParam("attachments", list);
        }
        if (bool != null) {
            newApiRequest.addParam("signed", bool.booleanValue());
        }
        if (f10 != null) {
            newApiRequest.addParam("lat", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("long", f11.floatValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "place_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 != null) {
            newApiRequest.addParam("guid", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("link_button", str3);
        }
        if (str4 != null) {
            newApiRequest.addParam("link_title", str4);
        }
        if (str5 != null) {
            newApiRequest.addParam("link_image", str5);
        }
        if (str6 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("link_video", str6);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> wallReportComment(@NotNull UserId ownerId, int i, @Nullable WallReportCommentReason wallReportCommentReason) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("wall.reportComment", new ug.a(26));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (wallReportCommentReason == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(DiscardedEvent.JsonKeys.REASON, wallReportCommentReason.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> wallReportPost(@NotNull UserId ownerId, int i, @Nullable WallReportPostReason wallReportPostReason) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("wall.reportPost", new vg.a(0));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "post_id", i, 0, 0, 8, (Object) null);
        if (wallReportPostReason == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(DiscardedEvent.JsonKeys.REASON, wallReportPostReason.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallRepostResponse> wallRepost(@NotNull String objectValue, @Nullable String str, @Nullable UserId userId, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(objectValue, "objectValue");
        NewApiRequest newApiRequest = new NewApiRequest("wall.repost", new vg.a(5));
        newApiRequest.addParam("object", objectValue);
        if (str != null) {
            newApiRequest.addParam("message", str);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("mark_as_ads", bool.booleanValue());
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("mute_notifications", bool2.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> wallRestore(@Nullable UserId userId, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.restore", new ug.a(27));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "post_id", num.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> wallRestoreComment(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.restoreComment", new vg.a(8));
        newApiRequest.addParam("comment_id", i);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallSearchResponse> wallSearch(@Nullable UserId userId, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("wall.search", new vg.a(9));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("domain", str);
        }
        if (str2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "query", str2, 0, 9000, 4, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("owners_only", bool.booleanValue());
        }
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, 100);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<WallSearchExtendedResponse> wallSearchExtended(@Nullable UserId userId, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends BaseUserGroupFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("wall.search", new vg.a(12));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("domain", str);
        }
        if (str2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "query", str2, 0, 9000, 4, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("owners_only", bool.booleanValue());
        }
        if (num != null) {
            newApiRequest.addParam("count", num.intValue(), 0, 100);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        newApiRequest.addParam("extended", true);
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends BaseUserGroupFields> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFields) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> wallUnpin(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("wall.unpin", new vg.a(7));
        NewApiRequest.addParam$default(newApiRequest, "post_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }
}
