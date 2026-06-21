package com.vk.sdk.api.status;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.status.dto.StatusStatus;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import n5.b;
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
public final class StatusService {
    public static /* synthetic */ VKRequest statusGet$default(StatusService statusService, UserId userId, UserId userId2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            userId2 = null;
        }
        return statusService.statusGet(userId, userId2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: statusGet$lambda-0, reason: not valid java name */
    public static final StatusStatus m485statusGet$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (StatusStatus) GsonHolder.INSTANCE.getGson().b(it, StatusStatus.class);
    }

    public static /* synthetic */ VKRequest statusSet$default(StatusService statusService, String str, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            userId = null;
        }
        return statusService.statusSet(str, userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: statusSet$lambda-4, reason: not valid java name */
    public static final BaseOkResponse m486statusSet$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<StatusStatus> statusGet(@Nullable UserId userId, @Nullable UserId userId2) {
        NewApiRequest newApiRequest = new NewApiRequest("status.get", new b(20));
        if (userId != null) {
            newApiRequest.addParam(TraceContext.JsonKeys.USER_ID, userId);
        }
        if (userId2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId2, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> statusSet(@Nullable String str, @Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("status.set", new b(21));
        if (str != null) {
            newApiRequest.addParam("text", str);
        }
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }
}
