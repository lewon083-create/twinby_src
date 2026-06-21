package com.vk.sdk.api.utils;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseOkResponse;
import com.vk.sdk.api.utils.dto.UtilsDomainResolved;
import com.vk.sdk.api.utils.dto.UtilsGetLastShortenedLinksResponse;
import com.vk.sdk.api.utils.dto.UtilsGetLinkStatsExtendedInterval;
import com.vk.sdk.api.utils.dto.UtilsGetLinkStatsExtendedSource;
import com.vk.sdk.api.utils.dto.UtilsGetLinkStatsInterval;
import com.vk.sdk.api.utils.dto.UtilsGetLinkStatsSource;
import com.vk.sdk.api.utils.dto.UtilsLinkChecked;
import com.vk.sdk.api.utils.dto.UtilsLinkStats;
import com.vk.sdk.api.utils.dto.UtilsLinkStatsExtended;
import com.vk.sdk.api.utils.dto.UtilsShortLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;

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
public final class UtilsService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: utilsCheckLink$lambda-0, reason: not valid java name */
    public static final UtilsLinkChecked m524utilsCheckLink$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UtilsLinkChecked) GsonHolder.INSTANCE.getGson().b(it, UtilsLinkChecked.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: utilsDeleteFromLastShortened$lambda-2, reason: not valid java name */
    public static final BaseOkResponse m525utilsDeleteFromLastShortened$lambda2(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (BaseOkResponse) GsonHolder.INSTANCE.getGson().b(it, BaseOkResponse.class);
    }

    public static /* synthetic */ VKRequest utilsGetLastShortenedLinks$default(UtilsService utilsService, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return utilsService.utilsGetLastShortenedLinks(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: utilsGetLastShortenedLinks$lambda-4, reason: not valid java name */
    public static final UtilsGetLastShortenedLinksResponse m526utilsGetLastShortenedLinks$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UtilsGetLastShortenedLinksResponse) GsonHolder.INSTANCE.getGson().b(it, UtilsGetLastShortenedLinksResponse.class);
    }

    public static /* synthetic */ VKRequest utilsGetLinkStats$default(UtilsService utilsService, String str, UtilsGetLinkStatsSource utilsGetLinkStatsSource, String str2, UtilsGetLinkStatsInterval utilsGetLinkStatsInterval, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            utilsGetLinkStatsSource = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            utilsGetLinkStatsInterval = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        return utilsService.utilsGetLinkStats(str, utilsGetLinkStatsSource, str2, utilsGetLinkStatsInterval, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: utilsGetLinkStats$lambda-8, reason: not valid java name */
    public static final UtilsLinkStats m527utilsGetLinkStats$lambda8(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UtilsLinkStats) GsonHolder.INSTANCE.getGson().b(it, UtilsLinkStats.class);
    }

    public static /* synthetic */ VKRequest utilsGetLinkStatsExtended$default(UtilsService utilsService, String str, UtilsGetLinkStatsExtendedSource utilsGetLinkStatsExtendedSource, String str2, UtilsGetLinkStatsExtendedInterval utilsGetLinkStatsExtendedInterval, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            utilsGetLinkStatsExtendedSource = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            utilsGetLinkStatsExtendedInterval = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        return utilsService.utilsGetLinkStatsExtended(str, utilsGetLinkStatsExtendedSource, str2, utilsGetLinkStatsExtendedInterval, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: utilsGetLinkStatsExtended$lambda-14, reason: not valid java name */
    public static final UtilsLinkStatsExtended m528utilsGetLinkStatsExtended$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UtilsLinkStatsExtended) GsonHolder.INSTANCE.getGson().b(it, UtilsLinkStatsExtended.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: utilsGetServerTime$lambda-20, reason: not valid java name */
    public static final int m529utilsGetServerTime$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objB = GsonHolder.INSTANCE.getGson().b(it, Integer.TYPE);
        Intrinsics.checkNotNullExpressionValue(objB, "GsonHolder.gson.fromJson(it, Int::class.java)");
        return ((Number) objB).intValue();
    }

    public static /* synthetic */ VKRequest utilsGetShortLink$default(UtilsService utilsService, String str, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return utilsService.utilsGetShortLink(str, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: utilsGetShortLink$lambda-21, reason: not valid java name */
    public static final UtilsShortLink m530utilsGetShortLink$lambda21(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UtilsShortLink) GsonHolder.INSTANCE.getGson().b(it, UtilsShortLink.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: utilsResolveScreenName$lambda-24, reason: not valid java name */
    public static final UtilsDomainResolved m531utilsResolveScreenName$lambda24(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UtilsDomainResolved) GsonHolder.INSTANCE.getGson().b(it, UtilsDomainResolved.class);
    }

    @NotNull
    public final VKRequest<UtilsLinkChecked> utilsCheckLink(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        NewApiRequest newApiRequest = new NewApiRequest("utils.checkLink", new a(13));
        newApiRequest.addParam("url", url);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<BaseOkResponse> utilsDeleteFromLastShortened(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        NewApiRequest newApiRequest = new NewApiRequest("utils.deleteFromLastShortened", new a(18));
        newApiRequest.addParam("key", key);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<UtilsGetLastShortenedLinksResponse> utilsGetLastShortenedLinks(@Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("utils.getLastShortenedLinks", new a(17));
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "count", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<UtilsLinkStats> utilsGetLinkStats(@NotNull String key, @Nullable UtilsGetLinkStatsSource utilsGetLinkStatsSource, @Nullable String str, @Nullable UtilsGetLinkStatsInterval utilsGetLinkStatsInterval, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(key, "key");
        NewApiRequest newApiRequest = new NewApiRequest("utils.getLinkStats", new a(16));
        newApiRequest.addParam("key", key);
        if (utilsGetLinkStatsSource != null) {
            newApiRequest.addParam("source", utilsGetLinkStatsSource.getValue());
        }
        if (str != null) {
            newApiRequest.addParam("access_key", str);
        }
        if (utilsGetLinkStatsInterval != null) {
            newApiRequest.addParam("interval", utilsGetLinkStatsInterval.getValue());
        }
        if (num == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("intervals_count", num.intValue(), 0, 100);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<UtilsLinkStatsExtended> utilsGetLinkStatsExtended(@NotNull String key, @Nullable UtilsGetLinkStatsExtendedSource utilsGetLinkStatsExtendedSource, @Nullable String str, @Nullable UtilsGetLinkStatsExtendedInterval utilsGetLinkStatsExtendedInterval, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(key, "key");
        NewApiRequest newApiRequest = new NewApiRequest("utils.getLinkStats", new a(15));
        newApiRequest.addParam("key", key);
        if (utilsGetLinkStatsExtendedSource != null) {
            newApiRequest.addParam("source", utilsGetLinkStatsExtendedSource.getValue());
        }
        if (str != null) {
            newApiRequest.addParam("access_key", str);
        }
        if (utilsGetLinkStatsExtendedInterval != null) {
            newApiRequest.addParam("interval", utilsGetLinkStatsExtendedInterval.getValue());
        }
        if (num != null) {
            newApiRequest.addParam("intervals_count", num.intValue(), 0, 100);
        }
        newApiRequest.addParam("extended", true);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<Integer> utilsGetServerTime() {
        return new NewApiRequest("utils.getServerTime", new a(12));
    }

    @NotNull
    public final VKRequest<UtilsShortLink> utilsGetShortLink(@NotNull String url, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(url, "url");
        NewApiRequest newApiRequest = new NewApiRequest("utils.getShortLink", new a(11));
        newApiRequest.addParam("url", url);
        if (bool == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("private", bool.booleanValue());
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<UtilsDomainResolved> utilsResolveScreenName(@NotNull String screenName) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        NewApiRequest newApiRequest = new NewApiRequest("utils.resolveScreenName", new a(14));
        newApiRequest.addParam("screen_name", screenName);
        return newApiRequest;
    }
}
