package com.vk.sdk.api.video;

import com.google.gson.reflect.a;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.video.dto.VideoAddAlbumPrivacy;
import com.vk.sdk.api.video.dto.VideoAddAlbumResponse;
import com.vk.sdk.api.video.dto.VideoEditAlbumPrivacy;
import com.vk.sdk.api.video.dto.VideoGetAlbumsByVideoExtendedResponse;
import com.vk.sdk.api.video.dto.VideoGetAlbumsExtendedResponse;
import com.vk.sdk.api.video.dto.VideoGetAlbumsResponse;
import com.vk.sdk.api.video.dto.VideoGetCommentsExtendedResponse;
import com.vk.sdk.api.video.dto.VideoGetCommentsExtendedSort;
import com.vk.sdk.api.video.dto.VideoGetCommentsResponse;
import com.vk.sdk.api.video.dto.VideoGetCommentsSort;
import com.vk.sdk.api.video.dto.VideoGetResponse;
import com.vk.sdk.api.video.dto.VideoReportCommentReason;
import com.vk.sdk.api.video.dto.VideoReportReason;
import com.vk.sdk.api.video.dto.VideoSaveResult;
import com.vk.sdk.api.video.dto.VideoSearchExtendedFilters;
import com.vk.sdk.api.video.dto.VideoSearchExtendedResponse;
import com.vk.sdk.api.video.dto.VideoSearchExtendedSort;
import com.vk.sdk.api.video.dto.VideoSearchFilters;
import com.vk.sdk.api.video.dto.VideoSearchResponse;
import com.vk.sdk.api.video.dto.VideoSearchSort;
import com.vk.sdk.api.video.dto.VideoVideoAlbumFull;
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
public final class VideoService {
    public static /* synthetic */ VKRequest videoAdd$default(VideoService videoService, int i, UserId userId, UserId userId2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        return videoService.videoAdd(i, userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoAdd$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m532videoAdd$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoAddAlbum$default(VideoService videoService, UserId userId, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return videoService.videoAddAlbum(userId, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoAddAlbum$lambda-3, reason: not valid java name */
    public static final VideoAddAlbumResponse m533videoAddAlbum$lambda3(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoAddAlbumResponse) GsonHolder.INSTANCE.getGson().b(it, VideoAddAlbumResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoAddToAlbum$default(VideoService videoService, UserId userId, int i, UserId userId2, Integer num, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            list = null;
        }
        return videoService.videoAddToAlbum(userId, i, userId2, num, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoAddToAlbum$lambda-9, reason: not valid java name */
    public static final BaseOkResponse m534videoAddToAlbum$lambda9(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoCreateComment$default(VideoService videoService, int i, UserId userId, String str, List list, Boolean bool, Integer num, Integer num2, String str2, int i10, Object obj) {
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
            num = null;
        }
        if ((i10 & 64) != 0) {
            num2 = null;
        }
        if ((i10 & 128) != 0) {
            str2 = null;
        }
        return videoService.videoCreateComment(i, userId, str, list, bool, num, num2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoCreateComment$lambda-14, reason: not valid java name */
    public static final Integer m535videoCreateComment$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    public static /* synthetic */ VKRequest videoDelete$default(VideoService videoService, int i, UserId userId, UserId userId2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        return videoService.videoDelete(i, userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoDelete$lambda-23, reason: not valid java name */
    public static final BaseOkResponse m536videoDelete$lambda23(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest videoDeleteAlbum$default(VideoService videoService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return videoService.videoDeleteAlbum(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoDeleteAlbum$lambda-27, reason: not valid java name */
    public static final BaseOkResponse m537videoDeleteAlbum$lambda27(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest videoDeleteComment$default(VideoService videoService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return videoService.videoDeleteComment(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoDeleteComment$lambda-30, reason: not valid java name */
    public static final BaseOkResponse m538videoDeleteComment$lambda30(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoEdit$default(VideoService videoService, int i, UserId userId, String str, String str2, List list, List list2, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            list = null;
        }
        if ((i10 & 32) != 0) {
            list2 = null;
        }
        if ((i10 & 64) != 0) {
            bool = null;
        }
        if ((i10 & 128) != 0) {
            bool2 = null;
        }
        return videoService.videoEdit(i, userId, str, str2, list, list2, bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoEdit$lambda-33, reason: not valid java name */
    public static final BaseOkResponse m539videoEdit$lambda33(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoEditAlbum$default(VideoService videoService, int i, String str, UserId userId, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return videoService.videoEditAlbum(i, str, userId, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoEditAlbum$lambda-42, reason: not valid java name */
    public static final BaseOkResponse m540videoEditAlbum$lambda42(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoEditComment$default(VideoService videoService, int i, UserId userId, String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return videoService.videoEditComment(i, userId, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoEditComment$lambda-47, reason: not valid java name */
    public static final BaseOkResponse m541videoEditComment$lambda47(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoGet$default(VideoService videoService, UserId userId, List list, Integer num, Integer num2, Integer num3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            list2 = null;
        }
        return videoService.videoGet(userId, list, num, num2, num3, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoGet$lambda-52, reason: not valid java name */
    public static final VideoGetResponse m542videoGet$lambda52(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoGetResponse) GsonHolder.INSTANCE.getGson().b(it, VideoGetResponse.class);
    }

    public static /* synthetic */ VKRequest videoGetAlbumById$default(VideoService videoService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return videoService.videoGetAlbumById(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoGetAlbumById$lambda-60, reason: not valid java name */
    public static final VideoVideoAlbumFull m543videoGetAlbumById$lambda60(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoVideoAlbumFull) GsonHolder.INSTANCE.getGson().b(it, VideoVideoAlbumFull.class);
    }

    public static /* synthetic */ VKRequest videoGetAlbums$default(VideoService videoService, UserId userId, Integer num, Integer num2, Boolean bool, int i, Object obj) {
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
            bool = null;
        }
        return videoService.videoGetAlbums(userId, num, num2, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoGetAlbums$lambda-63, reason: not valid java name */
    public static final VideoGetAlbumsResponse m544videoGetAlbums$lambda63(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoGetAlbumsResponse) GsonHolder.INSTANCE.getGson().b(it, VideoGetAlbumsResponse.class);
    }

    public static /* synthetic */ VKRequest videoGetAlbumsByVideo$default(VideoService videoService, UserId userId, int i, UserId userId2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        return videoService.videoGetAlbumsByVideo(userId, i, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoGetAlbumsByVideo$lambda-75, reason: not valid java name */
    public static final List m545videoGetAlbumsByVideo$lambda75(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends Integer>>() { // from class: com.vk.sdk.api.video.VideoService$videoGetAlbumsByVideo$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest videoGetAlbumsByVideoExtended$default(VideoService videoService, UserId userId, int i, UserId userId2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        return videoService.videoGetAlbumsByVideoExtended(userId, i, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoGetAlbumsByVideoExtended$lambda-78, reason: not valid java name */
    public static final VideoGetAlbumsByVideoExtendedResponse m546videoGetAlbumsByVideoExtended$lambda78(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoGetAlbumsByVideoExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, VideoGetAlbumsByVideoExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest videoGetAlbumsExtended$default(VideoService videoService, UserId userId, Integer num, Integer num2, Boolean bool, int i, Object obj) {
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
            bool = null;
        }
        return videoService.videoGetAlbumsExtended(userId, num, num2, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoGetAlbumsExtended$lambda-69, reason: not valid java name */
    public static final VideoGetAlbumsExtendedResponse m547videoGetAlbumsExtended$lambda69(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoGetAlbumsExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, VideoGetAlbumsExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoGetComments$default(VideoService videoService, int i, UserId userId, Boolean bool, Integer num, Integer num2, Integer num3, VideoGetCommentsSort videoGetCommentsSort, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
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
            videoGetCommentsSort = null;
        }
        if ((i10 & 128) != 0) {
            list = null;
        }
        return videoService.videoGetComments(i, userId, bool, num, num2, num3, videoGetCommentsSort, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoGetComments$lambda-81, reason: not valid java name */
    public static final VideoGetCommentsResponse m548videoGetComments$lambda81(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoGetCommentsResponse) GsonHolder.INSTANCE.getGson().b(it, VideoGetCommentsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoGetCommentsExtended$default(VideoService videoService, int i, UserId userId, Boolean bool, Integer num, Integer num2, Integer num3, VideoGetCommentsExtendedSort videoGetCommentsExtendedSort, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
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
            videoGetCommentsExtendedSort = null;
        }
        if ((i10 & 128) != 0) {
            list = null;
        }
        return videoService.videoGetCommentsExtended(i, userId, bool, num, num2, num3, videoGetCommentsExtendedSort, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoGetCommentsExtended$lambda-90, reason: not valid java name */
    public static final VideoGetCommentsExtendedResponse m549videoGetCommentsExtended$lambda90(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoGetCommentsExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, VideoGetCommentsExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoRemoveFromAlbum$default(VideoService videoService, UserId userId, int i, UserId userId2, Integer num, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            list = null;
        }
        return videoService.videoRemoveFromAlbum(userId, i, userId2, num, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoRemoveFromAlbum$lambda-99, reason: not valid java name */
    public static final BaseOkResponse m550videoRemoveFromAlbum$lambda99(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest videoReorderAlbums$default(VideoService videoService, int i, UserId userId, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return videoService.videoReorderAlbums(i, userId, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoReorderAlbums$lambda-104, reason: not valid java name */
    public static final BaseOkResponse m551videoReorderAlbums$lambda104(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest videoReorderVideos$default(VideoService videoService, UserId userId, int i, UserId userId2, Integer num, UserId userId3, Integer num2, UserId userId4, Integer num3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            userId3 = null;
        }
        if ((i10 & 32) != 0) {
            num2 = null;
        }
        if ((i10 & 64) != 0) {
            userId4 = null;
        }
        if ((i10 & 128) != 0) {
            num3 = null;
        }
        return videoService.videoReorderVideos(userId, i, userId2, num, userId3, num2, userId4, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoReorderVideos$lambda-109, reason: not valid java name */
    public static final BaseOkResponse m552videoReorderVideos$lambda109(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest videoReport$default(VideoService videoService, UserId userId, int i, VideoReportReason videoReportReason, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            videoReportReason = null;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        return videoService.videoReport(userId, i, videoReportReason, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoReport$lambda-117, reason: not valid java name */
    public static final BaseOkResponse m553videoReport$lambda117(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest videoReportComment$default(VideoService videoService, UserId userId, int i, VideoReportCommentReason videoReportCommentReason, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            videoReportCommentReason = null;
        }
        return videoService.videoReportComment(userId, i, videoReportCommentReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoReportComment$lambda-122, reason: not valid java name */
    public static final BaseOkResponse m554videoReportComment$lambda122(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest videoRestore$default(VideoService videoService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return videoService.videoRestore(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoRestore$lambda-125, reason: not valid java name */
    public static final BaseOkResponse m555videoRestore$lambda125(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest videoRestoreComment$default(VideoService videoService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return videoService.videoRestoreComment(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoRestoreComment$lambda-128, reason: not valid java name */
    public static final BaseBoolInt m556videoRestoreComment$lambda128(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoSave$default(VideoService videoService, String str, String str2, Boolean bool, Boolean bool2, String str3, UserId userId, Integer num, List list, List list2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            userId = null;
        }
        if ((i & 64) != 0) {
            num = null;
        }
        if ((i & 128) != 0) {
            list = null;
        }
        if ((i & 256) != 0) {
            list2 = null;
        }
        if ((i & 512) != 0) {
            bool3 = null;
        }
        if ((i & 1024) != 0) {
            bool4 = null;
        }
        if ((i & 2048) != 0) {
            bool5 = null;
        }
        return videoService.videoSave(str, str2, bool, bool2, str3, userId, num, list, list2, bool3, bool4, bool5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoSave$lambda-131, reason: not valid java name */
    public static final VideoSaveResult m557videoSave$lambda131(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoSaveResult) GsonHolder.INSTANCE.getGson().b(it, VideoSaveResult.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoSearch$default(VideoService videoService, String str, VideoSearchSort videoSearchSort, Integer num, Boolean bool, Boolean bool2, List list, Boolean bool3, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            videoSearchSort = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        if ((i & 64) != 0) {
            bool3 = null;
        }
        if ((i & 128) != 0) {
            num2 = null;
        }
        if ((i & 256) != 0) {
            num3 = null;
        }
        if ((i & 512) != 0) {
            num4 = null;
        }
        if ((i & 1024) != 0) {
            num5 = null;
        }
        return videoService.videoSearch(str, videoSearchSort, num, bool, bool2, list, bool3, num2, num3, num4, num5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoSearch$lambda-145, reason: not valid java name */
    public static final VideoSearchResponse m558videoSearch$lambda145(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoSearchResponse) GsonHolder.INSTANCE.getGson().b(it, VideoSearchResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest videoSearchExtended$default(VideoService videoService, String str, VideoSearchExtendedSort videoSearchExtendedSort, Integer num, Boolean bool, Boolean bool2, List list, Boolean bool3, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            videoSearchExtendedSort = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        if ((i & 64) != 0) {
            bool3 = null;
        }
        if ((i & 128) != 0) {
            num2 = null;
        }
        if ((i & 256) != 0) {
            num3 = null;
        }
        if ((i & 512) != 0) {
            num4 = null;
        }
        if ((i & 1024) != 0) {
            num5 = null;
        }
        return videoService.videoSearchExtended(str, videoSearchExtendedSort, num, bool, bool2, list, bool3, num2, num3, num4, num5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: videoSearchExtended$lambda-159, reason: not valid java name */
    public static final VideoSearchExtendedResponse m559videoSearchExtended$lambda159(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (VideoSearchExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, VideoSearchExtendedResponse.class);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoAdd(int i, @NotNull UserId ownerId, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("video.add", new uf.a(18));
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("owner_id", ownerId);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("target_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoAddAlbumResponse> videoAddAlbum(@Nullable UserId userId, @Nullable String str, @Nullable List<? extends VideoAddAlbumPrivacy> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("video.addAlbum", new uf.a(20));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("title", str);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends VideoAddAlbumPrivacy> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((VideoAddAlbumPrivacy) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("privacy", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoAddToAlbum(@NotNull UserId ownerId, int i, @Nullable UserId userId, @Nullable Integer num, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("video.addToAlbum", new ug.a(3));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("target_id", userId);
        }
        if (num != null) {
            newApiRequest.addParam("album_id", num.intValue());
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("album_ids", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> videoCreateComment(int i, @Nullable UserId userId, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2) {
        NewApiRequest newApiRequest = new NewApiRequest("video.createComment", new uf.a(15));
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
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
    public final VKRequest<BaseOkResponse> videoDelete(int i, @Nullable UserId userId, @Nullable UserId userId2) {
        NewApiRequest newApiRequest = new NewApiRequest("video.delete", new uf.a(26));
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (userId2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("target_id", userId2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoDeleteAlbum(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("video.deleteAlbum", new uf.a(17));
        NewApiRequest.addParam$default(newApiRequest, "album_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoDeleteComment(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("video.deleteComment", new ug.a(1));
        newApiRequest.addParam("comment_id", i);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoEdit(int i, @Nullable UserId userId, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        NewApiRequest newApiRequest = new NewApiRequest("video.edit", new ug.a(7));
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("name", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("desc", str2);
        }
        if (list != null) {
            newApiRequest.addParam("privacy_view", list);
        }
        if (list2 != null) {
            newApiRequest.addParam("privacy_comment", list2);
        }
        if (bool != null) {
            newApiRequest.addParam("no_comments", bool.booleanValue());
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("repeat", bool2.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoEditAlbum(int i, @NotNull String title, @Nullable UserId userId, @Nullable List<? extends VideoEditAlbumPrivacy> list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("video.editAlbum", new ug.a(9));
        NewApiRequest.addParam$default(newApiRequest, "album_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("title", title);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends VideoEditAlbumPrivacy> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((VideoEditAlbumPrivacy) it.next()).getValue());
            }
        }
        if (arrayList == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("privacy", (Iterable<?>) arrayList);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoEditComment(int i, @Nullable UserId userId, @Nullable String str, @Nullable List<String> list) {
        NewApiRequest newApiRequest = new NewApiRequest("video.editComment", new uf.a(19));
        newApiRequest.addParam("comment_id", i);
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
    public final VKRequest<VideoGetResponse> videoGet(@Nullable UserId userId, @Nullable List<String> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable List<String> list2) {
        NewApiRequest newApiRequest = new NewApiRequest("video.get", new ug.a(8));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (list != null) {
            newApiRequest.addParam("videos", list);
        }
        if (num != null) {
            newApiRequest.addParam("album_id", num.intValue());
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoVideoAlbumFull> videoGetAlbumById(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("video.getAlbumById", new uf.a(13));
        newApiRequest.addParam("album_id", i);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoGetAlbumsResponse> videoGetAlbums(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("video.getAlbums", new uf.a(22));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 100);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("need_system", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<Integer>> videoGetAlbumsByVideo(@NotNull UserId ownerId, int i, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("video.getAlbumsByVideo", new uf.a(25));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("target_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoGetAlbumsByVideoExtendedResponse> videoGetAlbumsByVideoExtended(@NotNull UserId ownerId, int i, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("video.getAlbumsByVideo", new uf.a(14));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("target_id", userId);
        }
        newApiRequest.addParam("extended", true);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoGetAlbumsExtendedResponse> videoGetAlbumsExtended(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("video.getAlbums", new uf.a(29));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 100);
        }
        newApiRequest.addParam("extended", true);
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("need_system", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoGetCommentsResponse> videoGetComments(int i, @Nullable UserId userId, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable VideoGetCommentsSort videoGetCommentsSort, @Nullable List<String> list) {
        NewApiRequest newApiRequest = new NewApiRequest("video.getComments", new ug.a(0));
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (bool != null) {
            newApiRequest.addParam("need_likes", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_comment_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("offset", num2.intValue());
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 0, 100);
        }
        if (videoGetCommentsSort != null) {
            newApiRequest.addParam("sort", videoGetCommentsSort.getValue());
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoGetCommentsExtendedResponse> videoGetCommentsExtended(int i, @Nullable UserId userId, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable VideoGetCommentsExtendedSort videoGetCommentsExtendedSort, @Nullable List<String> list) {
        NewApiRequest newApiRequest = new NewApiRequest("video.getComments", new ug.a(10));
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (bool != null) {
            newApiRequest.addParam("need_likes", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_comment_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("offset", num2.intValue());
        }
        if (num3 != null) {
            newApiRequest.addParam("count", num3.intValue(), 0, 100);
        }
        if (videoGetCommentsExtendedSort != null) {
            newApiRequest.addParam("sort", videoGetCommentsExtendedSort.getValue());
        }
        newApiRequest.addParam("extended", true);
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("fields", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoRemoveFromAlbum(@NotNull UserId ownerId, int i, @Nullable UserId userId, @Nullable Integer num, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("video.removeFromAlbum", new uf.a(16));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("target_id", userId);
        }
        if (num != null) {
            newApiRequest.addParam("album_id", num.intValue());
        }
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("album_ids", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoReorderAlbums(int i, @Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("video.reorderAlbums", new uf.a(28));
        NewApiRequest.addParam$default(newApiRequest, "album_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
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
    public final VKRequest<BaseOkResponse> videoReorderVideos(@NotNull UserId ownerId, int i, @Nullable UserId userId, @Nullable Integer num, @Nullable UserId userId2, @Nullable Integer num2, @Nullable UserId userId3, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("video.reorderVideos", new ug.a(4));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("target_id", userId);
        }
        if (num != null) {
            newApiRequest.addParam("album_id", num.intValue());
        }
        if (userId2 != null) {
            newApiRequest.addParam("before_owner_id", userId2);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "before_video_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (userId3 != null) {
            newApiRequest.addParam("after_owner_id", userId3);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "after_video_id", num3.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoReport(@NotNull UserId ownerId, int i, @Nullable VideoReportReason videoReportReason, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("video.report", new ug.a(5));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (videoReportReason != null) {
            newApiRequest.addParam(DiscardedEvent.JsonKeys.REASON, videoReportReason.getValue());
        }
        if (str != null) {
            newApiRequest.addParam("comment", str);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("search_query", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoReportComment(@NotNull UserId ownerId, int i, @Nullable VideoReportCommentReason videoReportCommentReason) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("video.reportComment", new uf.a(24));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (videoReportCommentReason == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(DiscardedEvent.JsonKeys.REASON, videoReportCommentReason.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> videoRestore(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("video.restore", new ug.a(6));
        NewApiRequest.addParam$default(newApiRequest, "video_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> videoRestoreComment(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("video.restoreComment", new uf.a(21));
        newApiRequest.addParam("comment_id", i);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoSaveResult> videoSave(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str3, @Nullable UserId userId, @Nullable Integer num, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5) {
        NewApiRequest newApiRequest = new NewApiRequest("video.save", new ug.a(2));
        if (str != null) {
            newApiRequest.addParam("name", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("description", str2);
        }
        if (bool != null) {
            newApiRequest.addParam("is_private", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("wallpost", bool2.booleanValue());
        }
        if (str3 != null) {
            newApiRequest.addParam("link", str3);
        }
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "album_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (list != null) {
            newApiRequest.addParam("privacy_view", list);
        }
        if (list2 != null) {
            newApiRequest.addParam("privacy_comment", list2);
        }
        if (bool3 != null) {
            newApiRequest.addParam("no_comments", bool3.booleanValue());
        }
        if (bool4 != null) {
            newApiRequest.addParam("repeat", bool4.booleanValue());
        }
        if (bool5 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("compression", bool5.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoSearchResponse> videoSearch(@Nullable String str, @Nullable VideoSearchSort videoSearchSort, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable List<? extends VideoSearchFilters> list, @Nullable Boolean bool3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("video.search", new uf.a(27));
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (videoSearchSort != null) {
            newApiRequest.addParam("sort", videoSearchSort.getValue());
        }
        if (num != null) {
            newApiRequest.addParam("hd", num.intValue());
        }
        if (bool != null) {
            newApiRequest.addParam("adult", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("live", bool2.booleanValue());
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends VideoSearchFilters> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((VideoSearchFilters) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("filters", (Iterable<?>) arrayList);
        }
        if (bool3 != null) {
            newApiRequest.addParam("search_own", bool3.booleanValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "longer", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "shorter", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (num5 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num5.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<VideoSearchExtendedResponse> videoSearchExtended(@Nullable String str, @Nullable VideoSearchExtendedSort videoSearchExtendedSort, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable List<? extends VideoSearchExtendedFilters> list, @Nullable Boolean bool3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("video.search", new uf.a(23));
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (videoSearchExtendedSort != null) {
            newApiRequest.addParam("sort", videoSearchExtendedSort.getValue());
        }
        if (num != null) {
            newApiRequest.addParam("hd", num.intValue());
        }
        if (bool != null) {
            newApiRequest.addParam("adult", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("live", bool2.booleanValue());
        }
        if (list == null) {
            arrayList = null;
        } else {
            List<? extends VideoSearchExtendedFilters> list2 = list;
            arrayList = new ArrayList(t.j(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((VideoSearchExtendedFilters) it.next()).getValue());
            }
        }
        if (arrayList != null) {
            newApiRequest.addParam("filters", (Iterable<?>) arrayList);
        }
        if (bool3 != null) {
            newApiRequest.addParam("search_own", bool3.booleanValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "longer", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "shorter", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (num5 != null) {
            newApiRequest.addParam("count", num5.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        newApiRequest.addParam("extended", true);
        return newApiRequest;
    }
}
