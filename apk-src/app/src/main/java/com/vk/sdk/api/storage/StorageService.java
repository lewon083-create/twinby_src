package com.vk.sdk.api.storage;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.storage.dto.StorageValue;
import io.sentry.TraceContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import ni.v0;
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
public final class StorageService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest storageGet$default(StorageService storageService, String str, List list, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        return storageService.storageGet(str, list, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storageGet$lambda-0, reason: not valid java name */
    public static final List m487storageGet$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends StorageValue>>() { // from class: com.vk.sdk.api.storage.StorageService$storageGet$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest storageGetKeys$default(StorageService storageService, UserId userId, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return storageService.storageGetKeys(userId, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storageGetKeys$lambda-5, reason: not valid java name */
    public static final List m488storageGetKeys$lambda5(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends String>>() { // from class: com.vk.sdk.api.storage.StorageService$storageGetKeys$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest storageSet$default(StorageService storageService, String str, String str2, UserId userId, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            userId = null;
        }
        return storageService.storageSet(str, str2, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: storageSet$lambda-10, reason: not valid java name */
    public static final BaseOkResponse m489storageSet$lambda10(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<List<StorageValue>> storageGet(@Nullable String str, @Nullable List<String> list, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("storage.get", new v0(17));
        if (str != null) {
            NewApiRequest.addParam$default(newApiRequest, "key", str, 0, 100, 4, (Object) null);
        }
        if (list != null) {
            newApiRequest.addParam("keys", list);
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<String>> storageGetKeys(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("storage.getKeys", new v0(16));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> storageSet(@NotNull String key, @Nullable String str, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(key, "key");
        NewApiRequest newApiRequest = new NewApiRequest("storage.set", new v0(15));
        NewApiRequest.addParam$default(newApiRequest, "key", key, 0, 100, 4, (Object) null);
        if (str != null) {
            newApiRequest.addParam("value", str);
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }
}
