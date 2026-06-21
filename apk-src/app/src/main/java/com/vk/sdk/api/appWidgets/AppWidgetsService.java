package com.vk.sdk.api.appWidgets;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.appWidgets.dto.AppWidgetsGetAppImageUploadServerImageType;
import com.vk.sdk.api.appWidgets.dto.AppWidgetsGetAppImageUploadServerResponse;
import com.vk.sdk.api.appWidgets.dto.AppWidgetsGetAppImagesImageType;
import com.vk.sdk.api.appWidgets.dto.AppWidgetsGetGroupImageUploadServerImageType;
import com.vk.sdk.api.appWidgets.dto.AppWidgetsGetGroupImageUploadServerResponse;
import com.vk.sdk.api.appWidgets.dto.AppWidgetsGetGroupImagesImageType;
import com.vk.sdk.api.appWidgets.dto.AppWidgetsPhoto;
import com.vk.sdk.api.appWidgets.dto.AppWidgetsPhotos;
import com.vk.sdk.api.appWidgets.dto.AppWidgetsUpdateType;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import io.sentry.protocol.DebugMeta;
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
public final class AppWidgetsService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appWidgetsGetAppImageUploadServer$lambda-0, reason: not valid java name */
    public static final AppWidgetsGetAppImageUploadServerResponse m100appWidgetsGetAppImageUploadServer$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppWidgetsGetAppImageUploadServerResponse) GsonHolder.INSTANCE.getGson().b(it, AppWidgetsGetAppImageUploadServerResponse.class);
    }

    public static /* synthetic */ VKRequest appWidgetsGetAppImages$default(AppWidgetsService appWidgetsService, Integer num, Integer num2, AppWidgetsGetAppImagesImageType appWidgetsGetAppImagesImageType, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            appWidgetsGetAppImagesImageType = null;
        }
        return appWidgetsService.appWidgetsGetAppImages(num, num2, appWidgetsGetAppImagesImageType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appWidgetsGetAppImages$lambda-2, reason: not valid java name */
    public static final AppWidgetsPhotos m101appWidgetsGetAppImages$lambda2(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppWidgetsPhotos) GsonHolder.INSTANCE.getGson().b(it, AppWidgetsPhotos.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appWidgetsGetGroupImageUploadServer$lambda-7, reason: not valid java name */
    public static final AppWidgetsGetGroupImageUploadServerResponse m102appWidgetsGetGroupImageUploadServer$lambda7(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppWidgetsGetGroupImageUploadServerResponse) GsonHolder.INSTANCE.getGson().b(it, AppWidgetsGetGroupImageUploadServerResponse.class);
    }

    public static /* synthetic */ VKRequest appWidgetsGetGroupImages$default(AppWidgetsService appWidgetsService, Integer num, Integer num2, AppWidgetsGetGroupImagesImageType appWidgetsGetGroupImagesImageType, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            appWidgetsGetGroupImagesImageType = null;
        }
        return appWidgetsService.appWidgetsGetGroupImages(num, num2, appWidgetsGetGroupImagesImageType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appWidgetsGetGroupImages$lambda-9, reason: not valid java name */
    public static final AppWidgetsPhotos m103appWidgetsGetGroupImages$lambda9(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppWidgetsPhotos) GsonHolder.INSTANCE.getGson().b(it, AppWidgetsPhotos.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appWidgetsGetImagesById$lambda-14, reason: not valid java name */
    public static final List m104appWidgetsGetImagesById$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends AppWidgetsPhoto>>() { // from class: com.vk.sdk.api.appWidgets.AppWidgetsService$appWidgetsGetImagesById$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appWidgetsSaveAppImage$lambda-16, reason: not valid java name */
    public static final AppWidgetsPhoto m105appWidgetsSaveAppImage$lambda16(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppWidgetsPhoto) GsonHolder.INSTANCE.getGson().b(it, AppWidgetsPhoto.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appWidgetsSaveGroupImage$lambda-18, reason: not valid java name */
    public static final AppWidgetsPhoto m106appWidgetsSaveGroupImage$lambda18(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AppWidgetsPhoto) GsonHolder.INSTANCE.getGson().b(it, AppWidgetsPhoto.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: appWidgetsUpdate$lambda-20, reason: not valid java name */
    public static final BaseOkResponse m107appWidgetsUpdate$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<AppWidgetsGetAppImageUploadServerResponse> appWidgetsGetAppImageUploadServer(@NotNull AppWidgetsGetAppImageUploadServerImageType imageType) {
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        NewApiRequest newApiRequest = new NewApiRequest("appWidgets.getAppImageUploadServer", new ig.a(29));
        newApiRequest.addParam("image_type", imageType.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppWidgetsPhotos> appWidgetsGetAppImages(@Nullable Integer num, @Nullable Integer num2, @Nullable AppWidgetsGetAppImagesImageType appWidgetsGetAppImagesImageType) {
        NewApiRequest newApiRequest = new NewApiRequest("appWidgets.getAppImages", new ig.a(28));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 100);
        }
        if (appWidgetsGetAppImagesImageType == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("image_type", appWidgetsGetAppImagesImageType.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppWidgetsGetGroupImageUploadServerResponse> appWidgetsGetGroupImageUploadServer(@NotNull AppWidgetsGetGroupImageUploadServerImageType imageType) {
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        NewApiRequest newApiRequest = new NewApiRequest("appWidgets.getGroupImageUploadServer", new ig.a(27));
        newApiRequest.addParam("image_type", imageType.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppWidgetsPhotos> appWidgetsGetGroupImages(@Nullable Integer num, @Nullable Integer num2, @Nullable AppWidgetsGetGroupImagesImageType appWidgetsGetGroupImagesImageType) {
        NewApiRequest newApiRequest = new NewApiRequest("appWidgets.getGroupImages", new jf.a(2));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            newApiRequest.addParam("count", num2.intValue(), 0, 100);
        }
        if (appWidgetsGetGroupImagesImageType == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("image_type", appWidgetsGetGroupImagesImageType.getValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<AppWidgetsPhoto>> appWidgetsGetImagesById(@NotNull List<String> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        NewApiRequest newApiRequest = new NewApiRequest("appWidgets.getImagesById", new jf.a(1));
        newApiRequest.addParam(DebugMeta.JsonKeys.IMAGES, images);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppWidgetsPhoto> appWidgetsSaveAppImage(@NotNull String hash, @NotNull String image) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(image, "image");
        NewApiRequest newApiRequest = new NewApiRequest("appWidgets.saveAppImage", new jf.a(3));
        newApiRequest.addParam("hash", hash);
        newApiRequest.addParam("image", image);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<AppWidgetsPhoto> appWidgetsSaveGroupImage(@NotNull String hash, @NotNull String image) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(image, "image");
        NewApiRequest newApiRequest = new NewApiRequest("appWidgets.saveGroupImage", new ig.a(26));
        newApiRequest.addParam("hash", hash);
        newApiRequest.addParam("image", image);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> appWidgetsUpdate(@NotNull String code, @NotNull AppWidgetsUpdateType type) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        NewApiRequest newApiRequest = new NewApiRequest("appWidgets.update", new jf.a(0));
        NewApiRequest.addParam$default(newApiRequest, "code", code, 0, 100000, 4, (Object) null);
        newApiRequest.addParam("type", type.getValue());
        return newApiRequest;
    }
}
