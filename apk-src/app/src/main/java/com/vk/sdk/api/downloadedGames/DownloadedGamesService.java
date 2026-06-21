package com.vk.sdk.api.downloadedGames;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.downloadedGames.dto.DownloadedGamesPaidStatusResponse;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qg.a;

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
public final class DownloadedGamesService {
    public static /* synthetic */ VKRequest downloadedGamesGetPaidStatus$default(DownloadedGamesService downloadedGamesService, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = null;
        }
        return downloadedGamesService.downloadedGamesGetPaidStatus(userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: downloadedGamesGetPaidStatus$lambda-0, reason: not valid java name */
    public static final DownloadedGamesPaidStatusResponse m164downloadedGamesGetPaidStatus$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DownloadedGamesPaidStatusResponse) GsonHolder.INSTANCE.getGson().b(it, DownloadedGamesPaidStatusResponse.class);
    }

    @NotNull
    public final VKRequest<DownloadedGamesPaidStatusResponse> downloadedGamesGetPaidStatus(@Nullable UserId userId) {
        NewApiRequest newApiRequest = new NewApiRequest("downloadedGames.getPaidStatus", new a(3));
        if (userId == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, TraceContext.JsonKeys.USER_ID, userId, 0L, 0L, 8, (Object) null);
        return newApiRequest;
    }
}
