package com.vk.sdk.api.streaming;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.streaming.dto.StreamingGetServerUrlResponse;
import com.vk.sdk.api.streaming.dto.StreamingGetStatsInterval;
import com.vk.sdk.api.streaming.dto.StreamingGetStatsType;
import com.vk.sdk.api.streaming.dto.StreamingSetSettingsMonthlyTier;
import kotlin.Metadata;
import kotlin.Unit;
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
public final class StreamingService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: streamingGetServerUrl$lambda-0, reason: not valid java name */
    public static final StreamingGetServerUrlResponse m513streamingGetServerUrl$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, StreamingGetServerUrlResponse.class);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson…rUrlResponse::class.java)");
        return (StreamingGetServerUrlResponse) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: streamingGetSettings$lambda-1, reason: not valid java name */
    public static final Unit m514streamingGetSettings$lambda1(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    public static /* synthetic */ VKRequest streamingGetStats$default(StreamingService streamingService, StreamingGetStatsType streamingGetStatsType, StreamingGetStatsInterval streamingGetStatsInterval, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            streamingGetStatsType = null;
        }
        if ((i & 2) != 0) {
            streamingGetStatsInterval = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        return streamingService.streamingGetStats(streamingGetStatsType, streamingGetStatsInterval, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: streamingGetStats$lambda-2, reason: not valid java name */
    public static final Unit m515streamingGetStats$lambda2(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: streamingGetStem$lambda-8, reason: not valid java name */
    public static final Unit m516streamingGetStem$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f27471a;
    }

    public static /* synthetic */ VKRequest streamingSetSettings$default(StreamingService streamingService, StreamingSetSettingsMonthlyTier streamingSetSettingsMonthlyTier, int i, Object obj) {
        if ((i & 1) != 0) {
            streamingSetSettingsMonthlyTier = null;
        }
        return streamingService.streamingSetSettings(streamingSetSettingsMonthlyTier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: streamingSetSettings$lambda-10, reason: not valid java name */
    public static final BaseOkResponse m517streamingSetSettings$lambda10(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<StreamingGetServerUrlResponse> streamingGetServerUrl() {
        return new NewApiRequest("streaming.getServerUrl", new a(4));
    }

    @NotNull
    public final VKRequest<Unit> streamingGetSettings() {
        return new NewApiRequest("streaming.getSettings", new a(6));
    }

    @NotNull
    public final VKRequest<Unit> streamingGetStats(@Nullable StreamingGetStatsType streamingGetStatsType, @Nullable StreamingGetStatsInterval streamingGetStatsInterval, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("streaming.getStats", new a(5));
        if (streamingGetStatsType != null) {
            newApiRequest.addParam("type", streamingGetStatsType.getValue());
        }
        if (streamingGetStatsInterval != null) {
            newApiRequest.addParam("interval", streamingGetStatsInterval.getValue());
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "start_time", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "end_time", num2.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Unit> streamingGetStem(@NotNull String word) {
        Intrinsics.checkNotNullParameter(word, "word");
        NewApiRequest newApiRequest = new NewApiRequest("streaming.getStem", new a(7));
        newApiRequest.addParam("word", word);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> streamingSetSettings(@Nullable StreamingSetSettingsMonthlyTier streamingSetSettingsMonthlyTier) {
        NewApiRequest newApiRequest = new NewApiRequest("streaming.setSettings", new a(8));
        if (streamingSetSettingsMonthlyTier == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("monthly_tier", streamingSetSettingsMonthlyTier.getValue());
        return newApiRequest;
    }
}
