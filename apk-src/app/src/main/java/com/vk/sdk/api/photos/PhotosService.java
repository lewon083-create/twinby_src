package com.vk.sdk.api.photos;

import com.google.gson.reflect.a;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.base.dto.BaseUploadServer;
import com.vk.sdk.api.photos.dto.PhotosGetAlbumsResponse;
import com.vk.sdk.api.photos.dto.PhotosGetAllCommentsResponse;
import com.vk.sdk.api.photos.dto.PhotosGetAllExtendedResponse;
import com.vk.sdk.api.photos.dto.PhotosGetAllResponse;
import com.vk.sdk.api.photos.dto.PhotosGetCommentsExtendedResponse;
import com.vk.sdk.api.photos.dto.PhotosGetCommentsExtendedSort;
import com.vk.sdk.api.photos.dto.PhotosGetCommentsResponse;
import com.vk.sdk.api.photos.dto.PhotosGetCommentsSort;
import com.vk.sdk.api.photos.dto.PhotosGetExtendedResponse;
import com.vk.sdk.api.photos.dto.PhotosGetNewTagsResponse;
import com.vk.sdk.api.photos.dto.PhotosGetResponse;
import com.vk.sdk.api.photos.dto.PhotosGetUserPhotosExtendedResponse;
import com.vk.sdk.api.photos.dto.PhotosGetUserPhotosResponse;
import com.vk.sdk.api.photos.dto.PhotosPhoto;
import com.vk.sdk.api.photos.dto.PhotosPhotoAlbumFull;
import com.vk.sdk.api.photos.dto.PhotosPhotoFull;
import com.vk.sdk.api.photos.dto.PhotosPhotoTag;
import com.vk.sdk.api.photos.dto.PhotosPhotoUpload;
import com.vk.sdk.api.photos.dto.PhotosReportCommentReason;
import com.vk.sdk.api.photos.dto.PhotosReportReason;
import com.vk.sdk.api.photos.dto.PhotosSaveOwnerCoverPhotoResponse;
import com.vk.sdk.api.photos.dto.PhotosSaveOwnerPhotoResponse;
import com.vk.sdk.api.photos.dto.PhotosSearchResponse;
import com.vk.sdk.api.users.dto.UsersFields;
import fj.k0;
import gg.b;
import io.sentry.TraceContext;
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
public final class PhotosService {
    public static /* synthetic */ VKRequest photosConfirmTag$default(PhotosService photosService, String str, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId = null;
        }
        return photosService.photosConfirmTag(str, i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosConfirmTag$lambda-0, reason: not valid java name */
    public static final BaseOkResponse m404photosConfirmTag$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosCopy$default(PhotosService photosService, UserId userId, int i, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return photosService.photosCopy(userId, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosCopy$lambda-3, reason: not valid java name */
    public static final Integer m405photosCopy$lambda3(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest photosCreateAlbum$default(PhotosService photosService, String str, UserId userId, String str2, List list, List list2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        return photosService.photosCreateAlbum(str, userId, str2, list, list2, bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosCreateAlbum$lambda-6, reason: not valid java name */
    public static final PhotosPhotoAlbumFull m406photosCreateAlbum$lambda6(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosPhotoAlbumFull) GsonHolder.INSTANCE.getGson().b(it, PhotosPhotoAlbumFull.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest photosCreateComment$default(PhotosService photosService, int i, UserId userId, String str, List list, Boolean bool, Integer num, Integer num2, String str2, String str3, int i10, Object obj) {
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
        if ((i10 & 256) != 0) {
            str3 = null;
        }
        return photosService.photosCreateComment(i, userId, str, list, bool, num, num2, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosCreateComment$lambda-14, reason: not valid java name */
    public static final Integer m407photosCreateComment$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    public static /* synthetic */ VKRequest photosDelete$default(PhotosService photosService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return photosService.photosDelete(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosDelete$lambda-24, reason: not valid java name */
    public static final BaseOkResponse m408photosDelete$lambda24(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosDeleteAlbum$default(PhotosService photosService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return photosService.photosDeleteAlbum(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosDeleteAlbum$lambda-27, reason: not valid java name */
    public static final BaseOkResponse m409photosDeleteAlbum$lambda27(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosDeleteComment$default(PhotosService photosService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return photosService.photosDeleteComment(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosDeleteComment$lambda-30, reason: not valid java name */
    public static final BaseBoolInt m410photosDeleteComment$lambda30(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest photosEdit$default(PhotosService photosService, int i, UserId userId, String str, Float f10, Float f11, String str2, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            f10 = null;
        }
        if ((i10 & 16) != 0) {
            f11 = null;
        }
        if ((i10 & 32) != 0) {
            str2 = null;
        }
        if ((i10 & 64) != 0) {
            str3 = null;
        }
        if ((i10 & 128) != 0) {
            bool = null;
        }
        return photosService.photosEdit(i, userId, str, f10, f11, str2, str3, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosEdit$lambda-33, reason: not valid java name */
    public static final BaseOkResponse m411photosEdit$lambda33(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest photosEditAlbum$default(PhotosService photosService, int i, String str, String str2, UserId userId, List list, List list2, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            userId = null;
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
        return photosService.photosEditAlbum(i, str, str2, userId, list, list2, bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosEditAlbum$lambda-42, reason: not valid java name */
    public static final BaseOkResponse m412photosEditAlbum$lambda42(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest photosEditComment$default(PhotosService photosService, int i, UserId userId, String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return photosService.photosEditComment(i, userId, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosEditComment$lambda-51, reason: not valid java name */
    public static final BaseOkResponse m413photosEditComment$lambda51(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest photosGet$default(PhotosService photosService, UserId userId, String str, List list, Boolean bool, String str2, Integer num, Boolean bool2, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
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
            str2 = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        if ((i & 128) != 0) {
            num2 = null;
        }
        if ((i & 256) != 0) {
            num3 = null;
        }
        return photosService.photosGet(userId, str, list, bool, str2, num, bool2, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGet$lambda-56, reason: not valid java name */
    public static final PhotosGetResponse m414photosGet$lambda56(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest photosGetAlbums$default(PhotosService photosService, UserId userId, List list, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
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
            bool = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if ((i & 64) != 0) {
            bool3 = null;
        }
        return photosService.photosGetAlbums(userId, list, num, num2, bool, bool2, bool3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetAlbums$lambda-78, reason: not valid java name */
    public static final PhotosGetAlbumsResponse m415photosGetAlbums$lambda78(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetAlbumsResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetAlbumsResponse.class);
    }

    public static /* synthetic */ VKRequest photosGetAlbumsCount$default(PhotosService photosService, UserId userId, UserId userId2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            userId2 = null;
        }
        return photosService.photosGetAlbumsCount(userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetAlbumsCount$lambda-87, reason: not valid java name */
    public static final Integer m416photosGetAlbumsCount$lambda87(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    public static /* synthetic */ VKRequest photosGetAll$default(PhotosService photosService, UserId userId, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
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
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            bool3 = null;
        }
        if ((i & 64) != 0) {
            bool4 = null;
        }
        return photosService.photosGetAll(userId, num, num2, bool, bool2, bool3, bool4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetAll$lambda-91, reason: not valid java name */
    public static final PhotosGetAllResponse m417photosGetAll$lambda91(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetAllResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetAllResponse.class);
    }

    public static /* synthetic */ VKRequest photosGetAllComments$default(PhotosService photosService, UserId userId, Integer num, Boolean bool, Integer num2, Integer num3, int i, Object obj) {
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
        return photosService.photosGetAllComments(userId, num, bool, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetAllComments$lambda-109, reason: not valid java name */
    public static final PhotosGetAllCommentsResponse m418photosGetAllComments$lambda109(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetAllCommentsResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetAllCommentsResponse.class);
    }

    public static /* synthetic */ VKRequest photosGetAllExtended$default(PhotosService photosService, UserId userId, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
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
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            bool3 = null;
        }
        if ((i & 64) != 0) {
            bool4 = null;
        }
        return photosService.photosGetAllExtended(userId, num, num2, bool, bool2, bool3, bool4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetAllExtended$lambda-100, reason: not valid java name */
    public static final PhotosGetAllExtendedResponse m419photosGetAllExtended$lambda100(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetAllExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetAllExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest photosGetById$default(PhotosService photosService, List list, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return photosService.photosGetById(list, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetById$lambda-116, reason: not valid java name */
    public static final List m420photosGetById$lambda116(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PhotosPhoto>>() { // from class: com.vk.sdk.api.photos.PhotosService$photosGetById$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest photosGetByIdExtended$default(PhotosService photosService, List list, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return photosService.photosGetByIdExtended(list, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetByIdExtended$lambda-119, reason: not valid java name */
    public static final List m421photosGetByIdExtended$lambda119(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PhotosPhotoFull>>() { // from class: com.vk.sdk.api.photos.PhotosService$photosGetByIdExtended$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest photosGetChatUploadServer$default(PhotosService photosService, int i, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            num3 = null;
        }
        return photosService.photosGetChatUploadServer(i, num, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetChatUploadServer$lambda-122, reason: not valid java name */
    public static final BaseUploadServer m422photosGetChatUploadServer$lambda122(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseUploadServer) GsonHolder.INSTANCE.getGson().b(it, BaseUploadServer.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest photosGetComments$default(PhotosService photosService, int i, UserId userId, Boolean bool, Integer num, Integer num2, Integer num3, PhotosGetCommentsSort photosGetCommentsSort, String str, List list, int i10, Object obj) {
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
            photosGetCommentsSort = null;
        }
        if ((i10 & 128) != 0) {
            str = null;
        }
        if ((i10 & 256) != 0) {
            list = null;
        }
        return photosService.photosGetComments(i, userId, bool, num, num2, num3, photosGetCommentsSort, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetComments$lambda-127, reason: not valid java name */
    public static final PhotosGetCommentsResponse m423photosGetComments$lambda127(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetCommentsResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetCommentsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest photosGetCommentsExtended$default(PhotosService photosService, int i, UserId userId, Boolean bool, Integer num, Integer num2, Integer num3, PhotosGetCommentsExtendedSort photosGetCommentsExtendedSort, String str, List list, int i10, Object obj) {
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
            photosGetCommentsExtendedSort = null;
        }
        if ((i10 & 128) != 0) {
            str = null;
        }
        if ((i10 & 256) != 0) {
            list = null;
        }
        return photosService.photosGetCommentsExtended(i, userId, bool, num, num2, num3, photosGetCommentsExtendedSort, str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetCommentsExtended$lambda-138, reason: not valid java name */
    public static final PhotosGetCommentsExtendedResponse m424photosGetCommentsExtended$lambda138(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetCommentsExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetCommentsExtendedResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest photosGetExtended$default(PhotosService photosService, UserId userId, String str, List list, Boolean bool, String str2, Integer num, Boolean bool2, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
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
            str2 = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        if ((i & 128) != 0) {
            num2 = null;
        }
        if ((i & 256) != 0) {
            num3 = null;
        }
        return photosService.photosGetExtended(userId, str, list, bool, str2, num, bool2, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetExtended$lambda-67, reason: not valid java name */
    public static final PhotosGetExtendedResponse m425photosGetExtended$lambda67(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetExtendedResponse.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetMarketAlbumUploadServer$lambda-149, reason: not valid java name */
    public static final BaseUploadServer m426photosGetMarketAlbumUploadServer$lambda149(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseUploadServer) GsonHolder.INSTANCE.getGson().b(it, BaseUploadServer.class);
    }

    public static /* synthetic */ VKRequest photosGetMarketUploadServer$default(PhotosService photosService, UserId userId, Boolean bool, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
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
        return photosService.photosGetMarketUploadServer(userId, bool, num, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetMarketUploadServer$lambda-151, reason: not valid java name */
    public static final BaseUploadServer m427photosGetMarketUploadServer$lambda151(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseUploadServer) GsonHolder.INSTANCE.getGson().b(it, BaseUploadServer.class);
    }

    public static /* synthetic */ VKRequest photosGetMessagesUploadServer$default(PhotosService photosService, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return photosService.photosGetMessagesUploadServer(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetMessagesUploadServer$lambda-157, reason: not valid java name */
    public static final PhotosPhotoUpload m428photosGetMessagesUploadServer$lambda157(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosPhotoUpload) GsonHolder.INSTANCE.getGson().b(it, PhotosPhotoUpload.class);
    }

    public static /* synthetic */ VKRequest photosGetNewTags$default(PhotosService photosService, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return photosService.photosGetNewTags(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetNewTags$lambda-160, reason: not valid java name */
    public static final PhotosGetNewTagsResponse m429photosGetNewTags$lambda160(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetNewTagsResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetNewTagsResponse.class);
    }

    public static /* synthetic */ VKRequest photosGetOwnerCoverPhotoUploadServer$default(PhotosService photosService, UserId userId, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
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
        return photosService.photosGetOwnerCoverPhotoUploadServer(userId, num, num2, num3, num4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetOwnerCoverPhotoUploadServer$lambda-164, reason: not valid java name */
    public static final BaseUploadServer m430photosGetOwnerCoverPhotoUploadServer$lambda164(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseUploadServer) GsonHolder.INSTANCE.getGson().b(it, BaseUploadServer.class);
    }

    public static /* synthetic */ VKRequest photosGetOwnerPhotoUploadServer$default(PhotosService photosService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return photosService.photosGetOwnerPhotoUploadServer(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetOwnerPhotoUploadServer$lambda-170, reason: not valid java name */
    public static final BaseUploadServer m431photosGetOwnerPhotoUploadServer$lambda170(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseUploadServer) GsonHolder.INSTANCE.getGson().b(it, BaseUploadServer.class);
    }

    public static /* synthetic */ VKRequest photosGetTags$default(PhotosService photosService, int i, UserId userId, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        return photosService.photosGetTags(i, userId, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetTags$lambda-173, reason: not valid java name */
    public static final List m432photosGetTags$lambda173(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PhotosPhotoTag>>() { // from class: com.vk.sdk.api.photos.PhotosService$photosGetTags$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest photosGetUploadServer$default(PhotosService photosService, Integer num, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        return photosService.photosGetUploadServer(num, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetUploadServer$lambda-177, reason: not valid java name */
    public static final PhotosPhotoUpload m433photosGetUploadServer$lambda177(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosPhotoUpload) GsonHolder.INSTANCE.getGson().b(it, PhotosPhotoUpload.class);
    }

    public static /* synthetic */ VKRequest photosGetUserPhotos$default(PhotosService photosService, UserId userId, Integer num, Integer num2, String str, int i, Object obj) {
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
            str = null;
        }
        return photosService.photosGetUserPhotos(userId, num, num2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetUserPhotos$lambda-181, reason: not valid java name */
    public static final PhotosGetUserPhotosResponse m434photosGetUserPhotos$lambda181(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetUserPhotosResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetUserPhotosResponse.class);
    }

    public static /* synthetic */ VKRequest photosGetUserPhotosExtended$default(PhotosService photosService, UserId userId, Integer num, Integer num2, String str, int i, Object obj) {
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
            str = null;
        }
        return photosService.photosGetUserPhotosExtended(userId, num, num2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetUserPhotosExtended$lambda-187, reason: not valid java name */
    public static final PhotosGetUserPhotosExtendedResponse m435photosGetUserPhotosExtended$lambda187(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosGetUserPhotosExtendedResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosGetUserPhotosExtendedResponse.class);
    }

    public static /* synthetic */ VKRequest photosGetWallUploadServer$default(PhotosService photosService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return photosService.photosGetWallUploadServer(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosGetWallUploadServer$lambda-193, reason: not valid java name */
    public static final PhotosPhotoUpload m436photosGetWallUploadServer$lambda193(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosPhotoUpload) GsonHolder.INSTANCE.getGson().b(it, PhotosPhotoUpload.class);
    }

    public static /* synthetic */ VKRequest photosMakeCover$default(PhotosService photosService, int i, UserId userId, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        return photosService.photosMakeCover(i, userId, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosMakeCover$lambda-196, reason: not valid java name */
    public static final BaseOkResponse m437photosMakeCover$lambda196(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosMove$default(PhotosService photosService, int i, int i10, UserId userId, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            userId = null;
        }
        return photosService.photosMove(i, i10, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosMove$lambda-200, reason: not valid java name */
    public static final BaseOkResponse m438photosMove$lambda200(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosPutTag$default(PhotosService photosService, int i, UserId userId, UserId userId2, Float f10, Float f11, Float f12, Float f13, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            userId2 = null;
        }
        if ((i10 & 8) != 0) {
            f10 = null;
        }
        if ((i10 & 16) != 0) {
            f11 = null;
        }
        if ((i10 & 32) != 0) {
            f12 = null;
        }
        if ((i10 & 64) != 0) {
            f13 = null;
        }
        return photosService.photosPutTag(i, userId, userId2, f10, f11, f12, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosPutTag$lambda-203, reason: not valid java name */
    public static final Integer m439photosPutTag$lambda203(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Integer) GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
    }

    public static /* synthetic */ VKRequest photosRemoveTag$default(PhotosService photosService, int i, int i10, UserId userId, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            userId = null;
        }
        return photosService.photosRemoveTag(i, i10, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosRemoveTag$lambda-210, reason: not valid java name */
    public static final BaseOkResponse m440photosRemoveTag$lambda210(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosReorderAlbums$default(PhotosService photosService, int i, UserId userId, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return photosService.photosReorderAlbums(i, userId, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosReorderAlbums$lambda-213, reason: not valid java name */
    public static final BaseOkResponse m441photosReorderAlbums$lambda213(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosReorderPhotos$default(PhotosService photosService, int i, UserId userId, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return photosService.photosReorderPhotos(i, userId, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosReorderPhotos$lambda-218, reason: not valid java name */
    public static final BaseOkResponse m442photosReorderPhotos$lambda218(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosReport$default(PhotosService photosService, UserId userId, int i, PhotosReportReason photosReportReason, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            photosReportReason = null;
        }
        return photosService.photosReport(userId, i, photosReportReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosReport$lambda-223, reason: not valid java name */
    public static final BaseOkResponse m443photosReport$lambda223(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosReportComment$default(PhotosService photosService, UserId userId, int i, PhotosReportCommentReason photosReportCommentReason, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            photosReportCommentReason = null;
        }
        return photosService.photosReportComment(userId, i, photosReportCommentReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosReportComment$lambda-226, reason: not valid java name */
    public static final BaseOkResponse m444photosReportComment$lambda226(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosRestore$default(PhotosService photosService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return photosService.photosRestore(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosRestore$lambda-229, reason: not valid java name */
    public static final BaseOkResponse m445photosRestore$lambda229(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest photosRestoreComment$default(PhotosService photosService, int i, UserId userId, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            userId = null;
        }
        return photosService.photosRestoreComment(i, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosRestoreComment$lambda-232, reason: not valid java name */
    public static final BaseBoolInt m446photosRestoreComment$lambda232(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseBoolInt) GsonHolder.INSTANCE.getGson().b(it, BaseBoolInt.class);
    }

    public static /* synthetic */ VKRequest photosSave$default(PhotosService photosService, Integer num, UserId userId, Integer num2, String str, String str2, Float f10, Float f11, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            f10 = null;
        }
        if ((i & 64) != 0) {
            f11 = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        return photosService.photosSave(num, userId, num2, str, str2, f10, f11, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosSave$lambda-235, reason: not valid java name */
    public static final List m447photosSave$lambda235(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PhotosPhoto>>() { // from class: com.vk.sdk.api.photos.PhotosService$photosSave$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosSaveMarketAlbumPhoto$lambda-245, reason: not valid java name */
    public static final List m448photosSaveMarketAlbumPhoto$lambda245(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PhotosPhoto>>() { // from class: com.vk.sdk.api.photos.PhotosService$photosSaveMarketAlbumPhoto$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest photosSaveMarketPhoto$default(PhotosService photosService, String str, int i, String str2, UserId userId, String str3, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            userId = null;
        }
        if ((i10 & 16) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        return photosService.photosSaveMarketPhoto(str, i, str2, userId, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosSaveMarketPhoto$lambda-247, reason: not valid java name */
    public static final List m449photosSaveMarketPhoto$lambda247(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PhotosPhoto>>() { // from class: com.vk.sdk.api.photos.PhotosService$photosSaveMarketPhoto$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest photosSaveMessagesPhoto$default(PhotosService photosService, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return photosService.photosSaveMessagesPhoto(str, num, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosSaveMessagesPhoto$lambda-252, reason: not valid java name */
    public static final List m450photosSaveMessagesPhoto$lambda252(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PhotosPhoto>>() { // from class: com.vk.sdk.api.photos.PhotosService$photosSaveMessagesPhoto$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosSaveOwnerCoverPhoto$lambda-256, reason: not valid java name */
    public static final PhotosSaveOwnerCoverPhotoResponse m451photosSaveOwnerCoverPhoto$lambda256(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosSaveOwnerCoverPhotoResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosSaveOwnerCoverPhotoResponse.class);
    }

    public static /* synthetic */ VKRequest photosSaveOwnerPhoto$default(PhotosService photosService, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return photosService.photosSaveOwnerPhoto(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosSaveOwnerPhoto$lambda-258, reason: not valid java name */
    public static final PhotosSaveOwnerPhotoResponse m452photosSaveOwnerPhoto$lambda258(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosSaveOwnerPhotoResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosSaveOwnerPhotoResponse.class);
    }

    public static /* synthetic */ VKRequest photosSaveWallPhoto$default(PhotosService photosService, String str, UserId userId, UserId userId2, Integer num, String str2, Float f10, Float f11, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            userId2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            f10 = null;
        }
        if ((i & 64) != 0) {
            f11 = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        return photosService.photosSaveWallPhoto(str, userId, userId2, num, str2, f10, f11, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosSaveWallPhoto$lambda-263, reason: not valid java name */
    public static final List m453photosSaveWallPhoto$lambda263(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends PhotosPhoto>>() { // from class: com.vk.sdk.api.photos.PhotosService$photosSaveWallPhoto$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest photosSearch$default(PhotosService photosService, String str, Float f10, Float f11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            f10 = null;
        }
        if ((i & 4) != 0) {
            f11 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            num3 = null;
        }
        if ((i & 64) != 0) {
            num4 = null;
        }
        if ((i & 128) != 0) {
            num5 = null;
        }
        if ((i & 256) != 0) {
            num6 = null;
        }
        return photosService.photosSearch(str, f10, f11, num, num2, num3, num4, num5, num6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: photosSearch$lambda-272, reason: not valid java name */
    public static final PhotosSearchResponse m454photosSearch$lambda272(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PhotosSearchResponse) GsonHolder.INSTANCE.getGson().b(it, PhotosSearchResponse.class);
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosConfirmTag(@NotNull String photoId, int i, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(photoId, "photoId");
        NewApiRequest newApiRequest = new NewApiRequest("photos.confirmTag", new gg.a(19));
        newApiRequest.addParam("photo_id", photoId);
        newApiRequest.addParam("tag_id", i);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> photosCopy(@NotNull UserId ownerId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("photos.copy", new gg.a(8));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "photo_id", i, 0, 0, 8, (Object) null);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("access_key", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosPhotoAlbumFull> photosCreateAlbum(@NotNull String title, @Nullable UserId userId, @Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(title, "title");
        NewApiRequest newApiRequest = new NewApiRequest("photos.createAlbum", new gg.a(17));
        NewApiRequest.addParam$default(newApiRequest, "title", title, 2, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("group_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("description", str);
        }
        if (list != null) {
            newApiRequest.addParam("privacy_view", list);
        }
        if (list2 != null) {
            newApiRequest.addParam("privacy_comment", list2);
        }
        if (bool != null) {
            newApiRequest.addParam("upload_by_admins_only", bool.booleanValue());
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("comments_disabled", bool2.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> photosCreateComment(int i, @Nullable UserId userId, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.createComment", new gg.a(14));
        newApiRequest.addParam("photo_id", i);
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
            newApiRequest.addParam("reply_to_comment", num.intValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "sticker_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (str2 != null) {
            newApiRequest.addParam("access_key", str2);
        }
        if (str3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("guid", str3);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosDelete(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.delete", new gg.a(3));
        NewApiRequest.addParam$default(newApiRequest, "photo_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosDeleteAlbum(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.deleteAlbum", new k0(20));
        NewApiRequest.addParam$default(newApiRequest, "album_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> photosDeleteComment(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.deleteComment", new gg.a(7));
        newApiRequest.addParam("comment_id", i);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosEdit(int i, @Nullable UserId userId, @Nullable String str, @Nullable Float f10, @Nullable Float f11, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.edit", new k0(24));
        NewApiRequest.addParam$default(newApiRequest, "photo_id", i, 0, 0, 8, (Object) null);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("caption", str);
        }
        if (f10 != null) {
            newApiRequest.addParam("latitude", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("longitude", f11.floatValue());
        }
        if (str2 != null) {
            newApiRequest.addParam("place_str", str2);
        }
        if (str3 != null) {
            newApiRequest.addParam("foursquare_id", str3);
        }
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("delete_place", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosEditAlbum(int i, @Nullable String str, @Nullable String str2, @Nullable UserId userId, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.editAlbum", new gg.a(24));
        NewApiRequest.addParam$default(newApiRequest, "album_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("title", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("description", str2);
        }
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (list != null) {
            newApiRequest.addParam("privacy_view", list);
        }
        if (list2 != null) {
            newApiRequest.addParam("privacy_comment", list2);
        }
        if (bool != null) {
            newApiRequest.addParam("upload_by_admins_only", bool.booleanValue());
        }
        if (bool2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("comments_disabled", bool2.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosEditComment(int i, @Nullable UserId userId, @Nullable String str, @Nullable List<String> list) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.editComment", new gg.a(29));
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
    public final VKRequest<PhotosGetResponse> photosGet(@Nullable UserId userId, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.get", new b(1));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("album_id", str);
        }
        if (list != null) {
            newApiRequest.addParam("photo_ids", list);
        }
        if (bool != null) {
            newApiRequest.addParam("rev", bool.booleanValue());
        }
        if (str2 != null) {
            newApiRequest.addParam("feed_type", str2);
        }
        if (num != null) {
            newApiRequest.addParam("feed", num.intValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("photo_sizes", bool2.booleanValue());
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
    public final VKRequest<PhotosGetAlbumsResponse> photosGetAlbums(@Nullable UserId userId, @Nullable List<Integer> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getAlbums", new gg.a(23));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (list != null) {
            newApiRequest.addParam("album_ids", list);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("need_system", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("need_covers", bool2.booleanValue());
        }
        if (bool3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("photo_sizes", bool3.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> photosGetAlbumsCount(@Nullable UserId userId, @Nullable UserId userId2) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getAlbumsCount", new b(0));
        if (userId != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId);
        }
        if (userId2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("group_id", userId2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosGetAllResponse> photosGetAll(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getAll", new k0(28));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (bool != null) {
            newApiRequest.addParam("photo_sizes", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("no_service_albums", bool2.booleanValue());
        }
        if (bool3 != null) {
            newApiRequest.addParam("need_hidden", bool3.booleanValue());
        }
        if (bool4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("skip_hidden", bool4.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosGetAllCommentsResponse> photosGetAllComments(@Nullable UserId userId, @Nullable Integer num, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getAllComments", new k0(18));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "album_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (bool != null) {
            newApiRequest.addParam("need_likes", bool.booleanValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "count", num3.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosGetAllExtendedResponse> photosGetAllExtended(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getAll", new k0(16));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        newApiRequest.addParam("extended", true);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        }
        if (bool != null) {
            newApiRequest.addParam("photo_sizes", bool.booleanValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("no_service_albums", bool2.booleanValue());
        }
        if (bool3 != null) {
            newApiRequest.addParam("need_hidden", bool3.booleanValue());
        }
        if (bool4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("skip_hidden", bool4.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PhotosPhoto>> photosGetById(@NotNull List<String> photos, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(photos, "photos");
        NewApiRequest newApiRequest = new NewApiRequest("photos.getById", new k0(19));
        newApiRequest.addParam("photos", photos);
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("photo_sizes", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PhotosPhotoFull>> photosGetByIdExtended(@NotNull List<String> photos, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(photos, "photos");
        NewApiRequest newApiRequest = new NewApiRequest("photos.getById", new gg.a(13));
        newApiRequest.addParam("photos", photos);
        newApiRequest.addParam("extended", true);
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("photo_sizes", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseUploadServer> photosGetChatUploadServer(int i, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getChatUploadServer", new b(3));
        NewApiRequest.addParam$default(newApiRequest, "chat_id", i, 0, 0, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "crop_x", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "crop_y", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "crop_width", num3.intValue(), VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosGetCommentsResponse> photosGetComments(int i, @Nullable UserId userId, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable PhotosGetCommentsSort photosGetCommentsSort, @Nullable String str, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("photos.getComments", new gg.a(0));
        newApiRequest.addParam("photo_id", i);
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
        if (photosGetCommentsSort != null) {
            newApiRequest.addParam("sort", photosGetCommentsSort.getValue());
        }
        if (str != null) {
            newApiRequest.addParam("access_key", str);
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
    public final VKRequest<PhotosGetCommentsExtendedResponse> photosGetCommentsExtended(int i, @Nullable UserId userId, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable PhotosGetCommentsExtendedSort photosGetCommentsExtendedSort, @Nullable String str, @Nullable List<? extends UsersFields> list) {
        ArrayList arrayList;
        NewApiRequest newApiRequest = new NewApiRequest("photos.getComments", new gg.a(1));
        newApiRequest.addParam("photo_id", i);
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
        if (photosGetCommentsExtendedSort != null) {
            newApiRequest.addParam("sort", photosGetCommentsExtendedSort.getValue());
        }
        if (str != null) {
            newApiRequest.addParam("access_key", str);
        }
        newApiRequest.addParam("extended", true);
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
    public final VKRequest<PhotosGetExtendedResponse> photosGetExtended(@Nullable UserId userId, @Nullable String str, @Nullable List<String> list, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.get", new gg.a(5));
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str != null) {
            newApiRequest.addParam("album_id", str);
        }
        if (list != null) {
            newApiRequest.addParam("photo_ids", list);
        }
        if (bool != null) {
            newApiRequest.addParam("rev", bool.booleanValue());
        }
        newApiRequest.addParam("extended", true);
        if (str2 != null) {
            newApiRequest.addParam("feed_type", str2);
        }
        if (num != null) {
            newApiRequest.addParam("feed", num.intValue());
        }
        if (bool2 != null) {
            newApiRequest.addParam("photo_sizes", bool2.booleanValue());
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
    public final VKRequest<BaseUploadServer> photosGetMarketAlbumUploadServer(@NotNull UserId groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("photos.getMarketAlbumUploadServer", new gg.a(15));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseUploadServer> photosGetMarketUploadServer(@NotNull UserId groupId, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("photos.getMarketUploadServer", new k0(27));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (bool != null) {
            newApiRequest.addParam("main_photo", bool.booleanValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "crop_x", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "crop_y", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "crop_width", num3.intValue(), 400, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosPhotoUpload> photosGetMessagesUploadServer(@Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getMessagesUploadServer", new gg.a(10));
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("peer_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosGetNewTagsResponse> photosGetNewTags(@Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getNewTags", new k0(29));
        if (num != null) {
            newApiRequest.addParam("offset", num.intValue());
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 100);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseUploadServer> photosGetOwnerCoverPhotoUploadServer(@NotNull UserId groupId, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        NewApiRequest newApiRequest = new NewApiRequest("photos.getOwnerCoverPhotoUploadServer", new gg.a(16));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "crop_x", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "crop_y", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "crop_x2", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "crop_y2", num4.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseUploadServer> photosGetOwnerPhotoUploadServer(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getOwnerPhotoUploadServer", new gg.a(22));
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PhotosPhotoTag>> photosGetTags(int i, @Nullable UserId userId, @Nullable String str) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getTags", new k0(14));
        newApiRequest.addParam("photo_id", i);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("access_key", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosPhotoUpload> photosGetUploadServer(@Nullable Integer num, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getUploadServer", new gg.a(18));
        if (num != null) {
            newApiRequest.addParam("album_id", num.intValue());
        }
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("group_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosGetUserPhotosResponse> photosGetUserPhotos(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getUserPhotos", new gg.a(9));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sort", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosGetUserPhotosExtendedResponse> photosGetUserPhotosExtended(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getUserPhotos", new k0(15));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        }
        newApiRequest.addParam("extended", true);
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("sort", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosPhotoUpload> photosGetWallUploadServer(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.getWallUploadServer", new gg.a(2));
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("group_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosMakeCover(int i, @Nullable UserId userId, @Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.makeCover", new k0(22));
        newApiRequest.addParam("photo_id", i);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("album_id", num.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosMove(int i, int i10, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.move", new k0(23));
        newApiRequest.addParam("target_album_id", i);
        newApiRequest.addParam("photo_id", i10);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> photosPutTag(int i, @NotNull UserId userId, @Nullable UserId userId2, @Nullable Float f10, @Nullable Float f11, @Nullable Float f12, @Nullable Float f13) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        NewApiRequest newApiRequest = new NewApiRequest("photos.putTag", new b(2));
        NewApiRequest.addParam$default(newApiRequest, "photo_id", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId);
        if (userId2 != null) {
            newApiRequest.addParam("owner_id", userId2);
        }
        if (f10 != null) {
            newApiRequest.addParam("x", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("y", f11.floatValue());
        }
        if (f12 != null) {
            newApiRequest.addParam("x2", f12.floatValue());
        }
        if (f13 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("y2", f13.floatValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosRemoveTag(int i, int i10, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.removeTag", new gg.a(21));
        newApiRequest.addParam("photo_id", i);
        newApiRequest.addParam("tag_id", i10);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosReorderAlbums(int i, @Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.reorderAlbums", new k0(17));
        newApiRequest.addParam("album_id", i);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            newApiRequest.addParam("before", num.intValue());
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("after", num2.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosReorderPhotos(int i, @Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.reorderPhotos", new gg.a(28));
        newApiRequest.addParam("photo_id", i);
        if (userId != null) {
            newApiRequest.addParam("owner_id", userId);
        }
        if (num != null) {
            newApiRequest.addParam("before", num.intValue());
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("after", num2.intValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosReport(@NotNull UserId ownerId, int i, @Nullable PhotosReportReason photosReportReason) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("photos.report", new gg.a(12));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "photo_id", i, 0, 0, 8, (Object) null);
        if (photosReportReason == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(DiscardedEvent.JsonKeys.REASON, photosReportReason.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosReportComment(@NotNull UserId ownerId, int i, @Nullable PhotosReportCommentReason photosReportCommentReason) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        NewApiRequest newApiRequest = new NewApiRequest("photos.reportComment", new gg.a(26));
        newApiRequest.addParam("owner_id", ownerId);
        NewApiRequest.addParam$default(newApiRequest, "comment_id", i, 0, 0, 8, (Object) null);
        if (photosReportCommentReason == null) {
            return newApiRequest;
        }
        newApiRequest.addParam(DiscardedEvent.JsonKeys.REASON, photosReportCommentReason.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> photosRestore(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.restore", new k0(25));
        NewApiRequest.addParam$default(newApiRequest, "photo_id", i, 0, 0, 8, (Object) null);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseBoolInt> photosRestoreComment(int i, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.restoreComment", new gg.a(20));
        newApiRequest.addParam("comment_id", i);
        if (userId == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("owner_id", userId);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PhotosPhoto>> photosSave(@Nullable Integer num, @Nullable UserId userId, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable Float f10, @Nullable Float f11, @Nullable String str3) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.save", new gg.a(4));
        if (num != null) {
            newApiRequest.addParam("album_id", num.intValue());
        }
        if (userId != null) {
            newApiRequest.addParam("group_id", userId);
        }
        if (num2 != null) {
            newApiRequest.addParam("server", num2.intValue());
        }
        if (str != null) {
            newApiRequest.addParam("photos_list", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("hash", str2);
        }
        if (f10 != null) {
            newApiRequest.addParam("latitude", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("longitude", f11.floatValue());
        }
        if (str3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("caption", str3);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PhotosPhoto>> photosSaveMarketAlbumPhoto(@NotNull UserId groupId, @NotNull String photo, int i, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(hash, "hash");
        NewApiRequest newApiRequest = new NewApiRequest("photos.saveMarketAlbumPhoto", new k0(26));
        NewApiRequest.addParam$default(newApiRequest, "group_id", groupId, 1L, 0L, 8, (Object) null);
        newApiRequest.addParam("photo", photo);
        NewApiRequest.addParam$default(newApiRequest, "server", i, 0, 0, 8, (Object) null);
        newApiRequest.addParam("hash", hash);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PhotosPhoto>> photosSaveMarketPhoto(@NotNull String photo, int i, @NotNull String hash, @Nullable UserId userId, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(hash, "hash");
        NewApiRequest newApiRequest = new NewApiRequest("photos.saveMarketPhoto", new gg.a(6));
        newApiRequest.addParam("photo", photo);
        newApiRequest.addParam("server", i);
        newApiRequest.addParam("hash", hash);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("crop_data", str);
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("crop_hash", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PhotosPhoto>> photosSaveMessagesPhoto(@NotNull String photo, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        NewApiRequest newApiRequest = new NewApiRequest("photos.saveMessagesPhoto", new gg.a(27));
        newApiRequest.addParam("photo", photo);
        if (num != null) {
            newApiRequest.addParam("server", num.intValue());
        }
        if (str == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("hash", str);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosSaveOwnerCoverPhotoResponse> photosSaveOwnerCoverPhoto(@NotNull String hash, @NotNull String photo) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(photo, "photo");
        NewApiRequest newApiRequest = new NewApiRequest("photos.saveOwnerCoverPhoto", new b(4));
        newApiRequest.addParam("hash", hash);
        newApiRequest.addParam("photo", photo);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosSaveOwnerPhotoResponse> photosSaveOwnerPhoto(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.saveOwnerPhoto", new gg.a(11));
        if (str != null) {
            newApiRequest.addParam("server", str);
        }
        if (str2 != null) {
            newApiRequest.addParam("hash", str2);
        }
        if (str3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("photo", str3);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<PhotosPhoto>> photosSaveWallPhoto(@NotNull String photo, @Nullable UserId userId, @Nullable UserId userId2, @Nullable Integer num, @Nullable String str, @Nullable Float f10, @Nullable Float f11, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        NewApiRequest newApiRequest = new NewApiRequest("photos.saveWallPhoto", new k0(21));
        newApiRequest.addParam("photo", photo);
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (userId2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId2, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            newApiRequest.addParam("server", num.intValue());
        }
        if (str != null) {
            newApiRequest.addParam("hash", str);
        }
        if (f10 != null) {
            newApiRequest.addParam("latitude", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("longitude", f11.floatValue());
        }
        if (str2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("caption", str2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<PhotosSearchResponse> photosSearch(@Nullable String str, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        NewApiRequest newApiRequest = new NewApiRequest("photos.search", new gg.a(25));
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (f10 != null) {
            newApiRequest.addParam("lat", f10.floatValue());
        }
        if (f11 != null) {
            newApiRequest.addParam("long", f11.floatValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_time", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "end_time", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "sort", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (num5 != null) {
            newApiRequest.addParam("count", num5.intValue(), 0, 1000);
        }
        if (num6 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "radius", num6.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }
}
