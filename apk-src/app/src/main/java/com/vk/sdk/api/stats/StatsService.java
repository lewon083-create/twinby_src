package com.vk.sdk.api.stats;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.stats.dto.StatsGetInterval;
import com.vk.sdk.api.stats.dto.StatsPeriod;
import com.vk.sdk.api.stats.dto.StatsWallpostStat;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
public final class StatsService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest statsGet$default(StatsService statsService, UserId userId, Integer num, Integer num2, Integer num3, StatsGetInterval statsGetInterval, Integer num4, List list, List list2, int i, Object obj) {
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
        if ((i & 16) != 0) {
            statsGetInterval = null;
        }
        if ((i & 32) != 0) {
            num4 = null;
        }
        if ((i & 64) != 0) {
            list = null;
        }
        if ((i & 128) != 0) {
            list2 = null;
        }
        return statsService.statsGet(userId, num, num2, num3, statsGetInterval, num4, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: statsGet$lambda-0, reason: not valid java name */
    public static final List m482statsGet$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends StatsPeriod>>() { // from class: com.vk.sdk.api.stats.StatsService$statsGet$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: statsGetPostReach$lambda-10, reason: not valid java name */
    public static final List m483statsGetPostReach$lambda10(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends StatsWallpostStat>>() { // from class: com.vk.sdk.api.stats.StatsService$statsGetPostReach$1$typeToken$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: statsTrackVisitor$lambda-12, reason: not valid java name */
    public static final BaseOkResponse m484statsTrackVisitor$lambda12(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    @NotNull
    public final VKRequest<List<StatsPeriod>> statsGet(@Nullable UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable StatsGetInterval statsGetInterval, @Nullable Integer num4, @Nullable List<String> list, @Nullable List<String> list2) {
        NewApiRequest newApiRequest = new NewApiRequest("stats.get", new kf.a(26));
        if (userId != null) {
            NewApiRequest.addParam$default(newApiRequest, "group_id", userId, 0L, 0L, 8, (Object) null);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, CommonUrlParts.APP_ID, num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "timestamp_from", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "timestamp_to", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (statsGetInterval != null) {
            newApiRequest.addParam("interval", statsGetInterval.getValue());
        }
        if (num4 != null) {
            NewApiRequest.addParam$default(newApiRequest, "intervals_count", num4.intValue(), 0, 0, 8, (Object) null);
        }
        if (list != null) {
            newApiRequest.addParam("filters", list);
        }
        if (list2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("stats_groups", list2);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<StatsWallpostStat>> statsGetPostReach(@NotNull String ownerId, @NotNull List<Integer> postIds) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(postIds, "postIds");
        NewApiRequest newApiRequest = new NewApiRequest("stats.getPostReach", new kf.a(25));
        newApiRequest.addParam("owner_id", ownerId);
        newApiRequest.addParam("post_ids", postIds);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> statsTrackVisitor(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        NewApiRequest newApiRequest = new NewApiRequest("stats.trackVisitor", new kf.a(27));
        newApiRequest.addParam("id", id2);
        return newApiRequest;
    }
}
