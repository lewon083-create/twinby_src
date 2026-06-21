package com.vk.sdk.api.gifts;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.gifts.dto.GiftsGetResponse;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.a;

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
public final class GiftsService {
    public static /* synthetic */ VKRequest giftsGet$default(GiftsService giftsService, UserId userId, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return giftsService.giftsGet(userId, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: giftsGet$lambda-0, reason: not valid java name */
    public static final GiftsGetResponse m209giftsGet$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (GiftsGetResponse) GsonHolder.INSTANCE.getGson().b(it, GiftsGetResponse.class);
    }

    @NotNull
    public final VKRequest<GiftsGetResponse> giftsGet(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("gifts.get", new a(13));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }
}
